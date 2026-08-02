package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.VorbisBitArray;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand;
import androidx.room.CoroutinesRoom;
import com.android.volley.toolbox.HurlStack;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class SpliceInfoDecoder extends SimpleMetadataDecoder {
    public final ParsableByteArray sectionData = new ParsableByteArray();
    public final VorbisBitArray sectionHeader = new VorbisBitArray();
    public TimestampAdjuster timestampAdjuster;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r5 != r7) goto L14;
     */
    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        Metadata.Entry spliceNullCommand;
        long j;
        ParsableByteArray parsableByteArray = this.sectionData;
        VorbisBitArray vorbisBitArray = this.sectionHeader;
        TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster != null) {
            long j2 = metadataInputBuffer.subsampleOffsetUs;
            synchronized (timestampAdjuster) {
                long j3 = timestampAdjuster.timestampOffsetUs;
            }
        }
        TimestampAdjuster timestampAdjuster2 = new TimestampAdjuster(metadataInputBuffer.timeUs);
        this.timestampAdjuster = timestampAdjuster2;
        timestampAdjuster2.adjustSampleTimestamp(metadataInputBuffer.timeUs - metadataInputBuffer.subsampleOffsetUs);
        byte[] array2 = byteBuffer.array();
        int limit = byteBuffer.limit();
        parsableByteArray.reset(limit, array2);
        vorbisBitArray.reset(limit, array2);
        vorbisBitArray.skipBits(39);
        long readBits = (vorbisBitArray.readBits(1) << 32) | vorbisBitArray.readBits(32);
        vorbisBitArray.skipBits(20);
        int readBits2 = vorbisBitArray.readBits(12);
        int readBits3 = vorbisBitArray.readBits(8);
        parsableByteArray.skipBytes(14);
        if (readBits3 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (readBits3 == 255) {
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            int i = readBits2 - 4;
            parsableByteArray.readBytes(0, i, new byte[i]);
            spliceNullCommand = new PrivateCommand(0, readUnsignedInt, readBits);
        } else if (readBits3 == 4) {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            ArrayList arrayList = new ArrayList(readUnsignedByte);
            for (int i2 = 0; i2 < readUnsignedByte; i2++) {
                parsableByteArray.readUnsignedInt();
                boolean z = (parsableByteArray.readUnsignedByte() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z) {
                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                    boolean z2 = (readUnsignedByte2 & 64) != 0;
                    boolean z3 = (readUnsignedByte2 & 32) != 0;
                    if (z2) {
                        parsableByteArray.readUnsignedInt();
                    }
                    if (!z2) {
                        int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                        ArrayList arrayList3 = new ArrayList(readUnsignedByte3);
                        for (int i3 = 0; i3 < readUnsignedByte3; i3++) {
                            parsableByteArray.readUnsignedByte();
                            parsableByteArray.readUnsignedInt();
                            arrayList3.add(new HurlStack(14));
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        parsableByteArray.readUnsignedByte();
                        parsableByteArray.readUnsignedInt();
                    }
                    parsableByteArray.readUnsignedShort();
                    parsableByteArray.readUnsignedByte();
                    parsableByteArray.readUnsignedByte();
                }
                arrayList.add(new SpliceScheduleCommand.Event(arrayList2));
            }
            spliceNullCommand = new SpliceScheduleCommand(arrayList);
        } else if (readBits3 == 5) {
            TimestampAdjuster timestampAdjuster3 = this.timestampAdjuster;
            parsableByteArray.readUnsignedInt();
            boolean z4 = (parsableByteArray.readUnsignedByte() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = -9223372036854775807L;
            } else {
                int readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                boolean z5 = (readUnsignedByte4 & 64) != 0;
                boolean z6 = (readUnsignedByte4 & 32) != 0;
                boolean z7 = (readUnsignedByte4 & 16) != 0;
                long parseSpliceTime = (!z5 || z7) ? -9223372036854775807L : PrivateCommand.parseSpliceTime(readBits, parsableByteArray);
                if (!z5) {
                    int readUnsignedByte5 = parsableByteArray.readUnsignedByte();
                    ArrayList arrayList4 = new ArrayList(readUnsignedByte5);
                    for (int i4 = 0; i4 < readUnsignedByte5; i4++) {
                        parsableByteArray.readUnsignedByte();
                        timestampAdjuster3.adjustTsTimestamp(!z7 ? PrivateCommand.parseSpliceTime(readBits, parsableByteArray) : -9223372036854775807L);
                        arrayList4.add(new CoroutinesRoom.Companion(13));
                    }
                    list = arrayList4;
                }
                if (z6) {
                    parsableByteArray.readUnsignedByte();
                    parsableByteArray.readUnsignedInt();
                }
                parsableByteArray.readUnsignedShort();
                parsableByteArray.readUnsignedByte();
                parsableByteArray.readUnsignedByte();
                j = parseSpliceTime;
            }
            spliceNullCommand = new SpliceInsertCommand(j, timestampAdjuster3.adjustTsTimestamp(j), list);
        } else if (readBits3 != 6) {
            spliceNullCommand = null;
        } else {
            TimestampAdjuster timestampAdjuster4 = this.timestampAdjuster;
            long parseSpliceTime2 = PrivateCommand.parseSpliceTime(readBits, parsableByteArray);
            spliceNullCommand = new PrivateCommand(1, parseSpliceTime2, timestampAdjuster4.adjustTsTimestamp(parseSpliceTime2));
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
