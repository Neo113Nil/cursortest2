package androidx.media3.muxer;

import android.util.Pair;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.container.ObuParser$NotYetImplementedException;
import androidx.media3.container.ObuParser$Obu;
import androidx.media3.container.ObuParser$SequenceHeader;
import androidx.media3.container.OpusUtil;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.n;
import com.google.common.collect.Range;
import com.google.common.collect.RegularImmutableList;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class Mp4Writer {
    public final LinearByteBufferAllocator linearByteBufferAllocator;
    public long mdatDataEnd;
    public long mdatEnd;
    public long mdatStart;
    public final n metadataCollector;
    public final FileOutputStreamSeekableMuxerOutput muxerOutput;
    public long reservedMoovSpaceEnd;
    public long reservedMoovSpaceStart;
    public final boolean sampleCopyEnabled;
    public final int freeSpaceAfterFtypInBytes = 400000;
    public final ArrayList tracks = new ArrayList();
    public final ArrayList auxiliaryTracks = new ArrayList();
    public final AtomicBoolean hasWrittenSamples = new AtomicBoolean(false);
    public boolean canWriteMoovAtStart = true;
    public Range lastMoovWritten = Range.closed(0L, 0L);
    public long lastMoovWrittenAtSampleTimestampUs = 0;

    public Mp4Writer(FileOutputStreamSeekableMuxerOutput fileOutputStreamSeekableMuxerOutput, n nVar, boolean z) {
        this.muxerOutput = fileOutputStreamSeekableMuxerOutput;
        this.metadataCollector = nVar;
        this.sampleCopyEnabled = z;
        LinearByteBufferAllocator linearByteBufferAllocator = new LinearByteBufferAllocator();
        linearByteBufferAllocator.memoryPool = ByteBuffer.allocateDirect(0);
        this.linearByteBufferAllocator = linearByteBufferAllocator;
    }

    public final void finalizeMoovBox() {
        if (this.canWriteMoovAtStart) {
            maybeWriteMoovAtStart();
            return;
        }
        ByteBuffer moov = Boxes.moov(this.tracks, this.metadataCollector);
        int remaining = moov.remaining();
        long j = remaining + 8;
        if (this.mdatEnd - this.mdatDataEnd < j) {
            safelyReplaceMoovAtEnd(((Long) this.lastMoovWritten.upperBound.endpoint()).longValue() + j, moov);
            Trace.checkState(this.mdatEnd - this.mdatDataEnd >= j);
        }
        long j2 = this.mdatDataEnd;
        FileOutputStreamSeekableMuxerOutput fileOutputStreamSeekableMuxerOutput = this.muxerOutput;
        fileOutputStreamSeekableMuxerOutput.setPosition(j2);
        fileOutputStreamSeekableMuxerOutput.write(moov);
        long j3 = remaining + j2;
        long longValue = ((Long) this.lastMoovWritten.upperBound.endpoint()).longValue() - j3;
        Trace.checkState(longValue < 2147483647L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt((int) longValue);
        String str = Util.DEVICE_DEBUG_INFO;
        allocate.put("free".getBytes(StandardCharsets.UTF_8));
        allocate.flip();
        fileOutputStreamSeekableMuxerOutput.write(allocate);
        this.mdatEnd = j2;
        updateMdatSize(j2 - this.mdatStart);
        this.lastMoovWritten = Range.closed(Long.valueOf(j2), Long.valueOf(j2 + moov.limit()));
        fileOutputStreamSeekableMuxerOutput.fileChannel.truncate(j3);
    }

    public final void finishWritingSamplesAndFinalizeMoovBox() {
        ArrayList arrayList;
        int i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.tracks;
            if (i2 >= arrayList2.size()) {
                break;
            }
            writePendingTrackSamples((Track) arrayList2.get(i2));
            i2++;
        }
        int i3 = 0;
        while (true) {
            arrayList = this.auxiliaryTracks;
            if (i3 >= arrayList.size()) {
                break;
            }
            writePendingTrackSamples((Track) arrayList.get(i3));
            i3++;
        }
        if (this.hasWrittenSamples.get()) {
            finalizeMoovBox();
            if (arrayList.isEmpty()) {
                return;
            }
            MdtaMetadataEntry auxiliaryTracksOffsetMetadata = MuxerUtil.getAuxiliaryTracksOffsetMetadata(0L);
            n nVar = this.metadataCollector;
            nVar.addMetadata(auxiliaryTracksOffsetMetadata);
            ByteBuffer ftyp = Boxes.ftyp();
            n nVar2 = new n(7);
            nVar2.addMetadata((Mp4TimestampData) nVar.d);
            nVar2.addMetadata(new MdtaMetadataEntry("auxiliary.tracks.interleaved", new byte[]{1}, 0, 75));
            int size = arrayList.size();
            byte[] bArr = new byte[size + 2];
            bArr[0] = 1;
            bArr[1] = (byte) size;
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    nVar2.addMetadata(new MdtaMetadataEntry("auxiliary.tracks.map", bArr, 0, 0));
                    break;
                }
                Track track = (Track) arrayList.get(i4);
                int i5 = track.f900format.auxiliaryTrackType;
                if (i5 != 1) {
                    i = 2;
                    if (i5 == 2) {
                        i = 1;
                    } else if (i5 != 3) {
                        if (i5 != 4) {
                            a$$ExternalSyntheticBUOutline0.m(track.f900format.auxiliaryTrackType, "Unsupported auxiliary track type ");
                            break;
                        }
                        i = 3;
                    } else {
                        continue;
                    }
                } else {
                    i = 0;
                }
                bArr[i4 + 2] = (byte) i;
                i4++;
            }
            ByteBuffer moov = Boxes.moov(arrayList, nVar2);
            long remaining = moov.remaining() + ftyp.remaining();
            ByteBuffer allocate = ByteBuffer.allocate(16);
            allocate.putInt(1);
            String str = Util.DEVICE_DEBUG_INFO;
            allocate.put("axte".getBytes(StandardCharsets.UTF_8));
            allocate.putLong(remaining + 16);
            allocate.flip();
            ByteBuffer concatenateBuffers = BoxUtils.concatenateBuffers(allocate, ftyp, moov);
            long remaining2 = concatenateBuffers.remaining();
            byte[] bArr2 = new byte[8];
            for (int i6 = 7; i6 >= 0; i6--) {
                bArr2[i6] = (byte) (255 & remaining2);
                remaining2 >>= 8;
            }
            nVar.addMetadata(new MdtaMetadataEntry("auxiliary.tracks.length", bArr2, 0, 78));
            finalizeMoovBox();
            ((HashSet) nVar.c).remove(auxiliaryTracksOffsetMetadata);
            FileOutputStreamSeekableMuxerOutput fileOutputStreamSeekableMuxerOutput = this.muxerOutput;
            FileChannel fileChannel = fileOutputStreamSeekableMuxerOutput.fileChannel;
            nVar.addMetadata(MuxerUtil.getAuxiliaryTracksOffsetMetadata(fileChannel.size()));
            long size2 = fileChannel.size();
            finalizeMoovBox();
            Trace.checkState(size2 == fileChannel.size());
            fileOutputStreamSeekableMuxerOutput.setPosition(fileChannel.size());
            fileOutputStreamSeekableMuxerOutput.write(concatenateBuffers);
        }
    }

    public final void maybeExtendMdatAndRewriteMoov(long j) {
        if (this.canWriteMoovAtStart) {
            return;
        }
        long j2 = this.mdatDataEnd;
        if (j2 + j >= this.mdatEnd) {
            safelyReplaceMoovAtEnd(Math.max(this.mdatEnd + Math.min(1000000000L, Math.max(500000L, (long) (j2 * 0.2f))) + j, ((Long) this.lastMoovWritten.upperBound.endpoint()).longValue()), Boxes.moov(this.tracks, this.metadataCollector));
        }
    }

    public final void maybeWriteMoovAtStart() {
        ByteBuffer moov = Boxes.moov(this.tracks, this.metadataCollector);
        int remaining = moov.remaining();
        long remaining2 = moov.remaining() + 8;
        long j = this.reservedMoovSpaceEnd;
        long j2 = this.reservedMoovSpaceStart;
        long j3 = j - j2;
        FileOutputStreamSeekableMuxerOutput fileOutputStreamSeekableMuxerOutput = this.muxerOutput;
        if (remaining2 <= j3) {
            fileOutputStreamSeekableMuxerOutput.setPosition(j2);
            fileOutputStreamSeekableMuxerOutput.write(moov);
            fileOutputStreamSeekableMuxerOutput.write(BoxUtils.wrapIntoBox("free", ByteBuffer.allocate((int) ((this.reservedMoovSpaceEnd - fileOutputStreamSeekableMuxerOutput.fileChannel.position()) - 8))));
        } else {
            this.canWriteMoovAtStart = false;
            long j4 = this.mdatDataEnd;
            this.mdatEnd = j4;
            fileOutputStreamSeekableMuxerOutput.setPosition(j4);
            fileOutputStreamSeekableMuxerOutput.write(moov);
            this.lastMoovWritten = Range.closed(Long.valueOf(this.mdatEnd), Long.valueOf(this.mdatEnd + remaining));
            ByteBuffer wrapIntoBox = BoxUtils.wrapIntoBox("free", ByteBuffer.allocate((int) ((this.reservedMoovSpaceEnd - this.reservedMoovSpaceStart) - 8)));
            fileOutputStreamSeekableMuxerOutput.setPosition(this.reservedMoovSpaceStart);
            fileOutputStreamSeekableMuxerOutput.write(wrapIntoBox);
        }
        updateMdatSize(this.mdatDataEnd - this.mdatStart);
    }

    public final void safelyReplaceMoovAtEnd(long j, ByteBuffer byteBuffer) {
        Trace.checkState(j >= ((Long) this.lastMoovWritten.upperBound.endpoint()).longValue());
        Trace.checkState(j >= this.mdatEnd);
        FileOutputStreamSeekableMuxerOutput fileOutputStreamSeekableMuxerOutput = this.muxerOutput;
        fileOutputStreamSeekableMuxerOutput.setPosition(j);
        fileOutputStreamSeekableMuxerOutput.write(BoxUtils.wrapIntoBox("free", byteBuffer.duplicate()));
        long j2 = 8 + j;
        this.mdatEnd = j2;
        updateMdatSize(j2 - this.mdatStart);
        this.lastMoovWritten = Range.closed(Long.valueOf(j), Long.valueOf(j + byteBuffer.remaining()));
    }

    public final void updateMdatSize(long j) {
        long j2 = this.mdatStart + 8;
        FileOutputStreamSeekableMuxerOutput fileOutputStreamSeekableMuxerOutput = this.muxerOutput;
        fileOutputStreamSeekableMuxerOutput.setPosition(j2);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(j);
        allocate.flip();
        fileOutputStreamSeekableMuxerOutput.write(allocate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00eb, code lost:
    
        if (((java.lang.Integer) r7.first).intValue() != 10) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fe, code lost:
    
        if (r8.equals("video/hevc") == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writePendingTrackSamples(Track track) {
        ArrayDeque arrayDeque = track.pendingSamplesByteBuffer;
        int size = arrayDeque.size();
        ArrayDeque arrayDeque2 = track.pendingSamplesBufferInfo;
        Trace.checkState(size == arrayDeque2.size());
        if (arrayDeque2.isEmpty()) {
            return;
        }
        boolean andSet = this.hasWrittenSamples.getAndSet(true);
        long j = 0;
        FileOutputStreamSeekableMuxerOutput fileOutputStreamSeekableMuxerOutput = this.muxerOutput;
        if (!andSet) {
            fileOutputStreamSeekableMuxerOutput.setPosition(0L);
            FileChannel fileChannel = fileOutputStreamSeekableMuxerOutput.fileChannel;
            fileOutputStreamSeekableMuxerOutput.write(Boxes.ftyp());
            int i = this.freeSpaceAfterFtypInBytes;
            if (i > 0) {
                this.reservedMoovSpaceStart = fileChannel.position();
                fileOutputStreamSeekableMuxerOutput.write(BoxUtils.wrapIntoBox("free", ByteBuffer.allocate(i)));
                this.reservedMoovSpaceEnd = fileChannel.position();
            }
            this.mdatStart = fileChannel.position();
            ByteBuffer allocate = ByteBuffer.allocate(16);
            allocate.putInt(1);
            String str = Util.DEVICE_DEBUG_INFO;
            allocate.put("mdat".getBytes(StandardCharsets.UTF_8));
            allocate.putLong(16L);
            allocate.flip();
            fileOutputStreamSeekableMuxerOutput.write(allocate);
            long j2 = this.mdatStart + 16;
            this.mdatDataEnd = j2;
            if (this.canWriteMoovAtStart) {
                j2 = Long.MAX_VALUE;
            }
            this.mdatEnd = j2;
        }
        while (arrayDeque.iterator().hasNext()) {
            j += ((ByteBuffer) r1.next()).limit();
        }
        maybeExtendMdatAndRewriteMoov(j);
        track.writtenChunkOffsets.add(Long.valueOf(this.mdatDataEnd));
        track.writtenChunkSampleCounts.add(Integer.valueOf(arrayDeque2.size()));
        do {
            BufferInfo bufferInfo = (BufferInfo) arrayDeque2.removeFirst();
            ByteBuffer byteBuffer = (ByteBuffer) arrayDeque.removeFirst();
            Format format2 = track.f900format;
            String str2 = format2.sampleMimeType;
            str2.getClass();
            boolean equals = str2.equals("video/dolby-vision");
            LinearByteBufferAllocator linearByteBufferAllocator = this.linearByteBufferAllocator;
            if (equals) {
                Pair dolbyVisionProfileAndLevel = Boxes.getDolbyVisionProfileAndLevel(format2);
                dolbyVisionProfileAndLevel.getClass();
            } else {
                if (!str2.equals("video/avc")) {
                }
                if (byteBuffer.hasRemaining()) {
                    RegularImmutableList findNalUnits = AnnexBUtils.findNalUnits(byteBuffer);
                    int i2 = 0;
                    for (int i3 = 0; i3 < findNalUnits.size; i3++) {
                        i2 += ((ByteBuffer) findNalUnits.get(i3)).remaining() + 4;
                    }
                    linearByteBufferAllocator.getClass();
                    Trace.checkArgument(i2 >= 0);
                    if (linearByteBufferAllocator.memoryPool.remaining() < i2) {
                        linearByteBufferAllocator.memoryPool = ByteBuffer.allocateDirect(Math.max(i2, linearByteBufferAllocator.memoryPool.capacity() * 2));
                    }
                    ByteBuffer slice = linearByteBufferAllocator.memoryPool.slice();
                    ByteBuffer byteBuffer2 = linearByteBufferAllocator.memoryPool;
                    byteBuffer2.position(byteBuffer2.position() + i2);
                    slice.limit(i2);
                    for (int i4 = 0; i4 < findNalUnits.size; i4++) {
                        ByteBuffer byteBuffer3 = (ByteBuffer) findNalUnits.get(i4);
                        slice.putInt(byteBuffer3.remaining());
                        slice.put(byteBuffer3);
                    }
                    slice.rewind();
                    byteBuffer.position(byteBuffer.limit());
                    byteBuffer = slice;
                }
                bufferInfo = new BufferInfo(byteBuffer.remaining(), bufferInfo.flags, bufferInfo.presentationTimeUs);
            }
            maybeExtendMdatAndRewriteMoov(byteBuffer.remaining());
            fileOutputStreamSeekableMuxerOutput.setPosition(this.mdatDataEnd);
            this.mdatDataEnd += fileOutputStreamSeekableMuxerOutput.fileChannel.write(byteBuffer);
            linearByteBufferAllocator.memoryPool.clear();
            track.writtenSamples.add(bufferInfo);
        } while (!arrayDeque2.isEmpty());
        Trace.checkState(this.mdatDataEnd <= this.mdatEnd);
    }

    public final void writeSampleData(Track track, ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        ByteBuffer byteBuffer2;
        ObuParser$SequenceHeader obuParser$SequenceHeader;
        Format format2 = track.f900format;
        if (Objects.equals(format2.sampleMimeType, "video/av01") && format2.initializationData.isEmpty() && track.parsedCsd == null) {
            ByteBuffer duplicate = byteBuffer.duplicate();
            ArrayList arrayList = new ArrayList();
            Iterator it = OpusUtil.split(duplicate).iterator();
            ByteBuffer byteBuffer3 = null;
            ByteBuffer byteBuffer4 = null;
            while (it.hasNext()) {
                ObuParser$Obu obuParser$Obu = (ObuParser$Obu) it.next();
                int i = obuParser$Obu.f873type;
                if (i == 5) {
                    arrayList.add(Av1ConfigUtil.getConfigObuWithHeaderAndLength(obuParser$Obu));
                } else if (i == 1 && byteBuffer3 == null) {
                    byteBuffer3 = Av1ConfigUtil.getConfigObuWithHeaderAndLength(obuParser$Obu);
                    byteBuffer4 = ByteBuffer.allocate(4);
                    byteBuffer4.put((byte) -127);
                    try {
                        obuParser$SequenceHeader = new ObuParser$SequenceHeader(obuParser$Obu);
                    } catch (ObuParser$NotYetImplementedException unused) {
                        obuParser$SequenceHeader = null;
                    }
                    Trace.checkNotNull(obuParser$SequenceHeader, "No sequence header available.");
                    byteBuffer4.put((byte) ((obuParser$SequenceHeader.seqProfile << 5) | obuParser$SequenceHeader.seqLevelIdx0));
                    byteBuffer4.put((byte) ((obuParser$SequenceHeader.seqTier0 > 0 ? 128 : 0) | (obuParser$SequenceHeader.highBitdepth ? 64 : 0) | (obuParser$SequenceHeader.twelveBit ? 32 : 0) | (obuParser$SequenceHeader.monochrome ? 16 : 0) | (obuParser$SequenceHeader.subsamplingX ? 8 : 0) | (obuParser$SequenceHeader.subsamplingY ? 4 : 0) | obuParser$SequenceHeader.chromaSamplePosition));
                    boolean z = obuParser$SequenceHeader.initialDisplayDelayPresentFlag;
                    byteBuffer4.put((byte) ((z ? obuParser$SequenceHeader.initialDisplayDelayMinus1 & 15 : 0) | (z ? 16 : 0)));
                    byteBuffer4.flip();
                }
            }
            Trace.checkNotNull(byteBuffer3, "No sequence header available.");
            ByteBuffer concatenateBuffers = BoxUtils.concatenateBuffers(byteBuffer3, BoxUtils.concatenateBuffers((ByteBuffer[]) arrayList.toArray(new ByteBuffer[0])));
            Trace.checkNotNull(byteBuffer4, "csdHeader is null.");
            track.parsedCsd = BoxUtils.concatenateBuffers(byteBuffer4, concatenateBuffers).array();
        }
        Trace.checkArgument("Samples can not be written after writing a sample with MediaCodec.BUFFER_FLAG_END_OF_STREAM flag", track.endOfStreamTimestampUs == -9223372036854775807L);
        int i2 = bufferInfo.size;
        long j = bufferInfo.presentationTimeUs;
        int i3 = bufferInfo.flags;
        if (i2 != 0 && byteBuffer.remaining() != 0) {
            if ((i3 & 1) > 0) {
                track.hadKeyframe = true;
            }
            if (track.hadKeyframe || !MimeTypes.isVideo(format2.sampleMimeType)) {
                if (track.sampleCopyEnabled) {
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining());
                    byteBuffer2.put(byteBuffer);
                    byteBuffer2.rewind();
                } else {
                    byteBuffer2 = byteBuffer;
                }
                track.pendingSamplesBufferInfo.addLast(new BufferInfo(byteBuffer2.remaining(), i3, j));
                track.pendingSamplesByteBuffer.addLast(byteBuffer2);
            }
        } else if ((i3 & 4) != 0) {
            track.endOfStreamTimestampUs = j;
        }
        writePendingTrackSamples(track);
        if (this.tracks.contains(track) && this.canWriteMoovAtStart && j - this.lastMoovWrittenAtSampleTimestampUs >= 1000000) {
            maybeWriteMoovAtStart();
            this.lastMoovWrittenAtSampleTimestampUs = j;
        }
    }
}
