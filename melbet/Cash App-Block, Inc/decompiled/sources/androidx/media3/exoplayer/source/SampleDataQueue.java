package androidx.media3.exoplayer.source;

import android.media.MediaCodec;
import androidx.camera.video.Recorder;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.upstream.Allocation;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import androidx.media3.extractor.TrackOutput;
import app.cash.zipline.CallResult;
import coil3.memory.RealStrongMemoryCache$cache$1;
import com.datadog.trace.core.util.SimpleRateLimiter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class SampleDataQueue {
    public final int allocationLength;
    public final Recorder.AnonymousClass3 allocator;
    public RealStrongMemoryCache$cache$1 firstAllocationNode;
    public RealStrongMemoryCache$cache$1 readAllocationNode;
    public final ParsableByteArray scratch;
    public long totalBytesWritten;
    public RealStrongMemoryCache$cache$1 writeAllocationNode;

    public SampleDataQueue(Recorder.AnonymousClass3 anonymousClass3) {
        int i;
        this.allocator = anonymousClass3;
        synchronized (anonymousClass3) {
            i = ((DefaultLoadControl) anonymousClass3.this$0).allocator.individualAllocationSize;
        }
        this.allocationLength = i;
        this.scratch = new ParsableByteArray(32);
        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = new RealStrongMemoryCache$cache$1(0L, i);
        this.firstAllocationNode = realStrongMemoryCache$cache$1;
        this.readAllocationNode = realStrongMemoryCache$cache$1;
        this.writeAllocationNode = realStrongMemoryCache$cache$1;
    }

    public static RealStrongMemoryCache$cache$1 readData(RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1, long j, byte[] bArr, int i) {
        while (j >= realStrongMemoryCache$cache$1.size) {
            realStrongMemoryCache$cache$1 = (RealStrongMemoryCache$cache$1) realStrongMemoryCache$cache$1.this$0;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (realStrongMemoryCache$cache$1.size - j));
            Allocation allocation = (Allocation) realStrongMemoryCache$cache$1.map;
            System.arraycopy(allocation.data, ((int) (j - realStrongMemoryCache$cache$1.maxSize)) + allocation.offset, bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == realStrongMemoryCache$cache$1.size) {
                realStrongMemoryCache$cache$1 = (RealStrongMemoryCache$cache$1) realStrongMemoryCache$cache$1.this$0;
            }
        }
        return realStrongMemoryCache$cache$1;
    }

    public static RealStrongMemoryCache$cache$1 readSampleData(RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1, DecoderInputBuffer decoderInputBuffer, SimpleRateLimiter simpleRateLimiter, ParsableByteArray parsableByteArray) {
        if (decoderInputBuffer.getFlag(1073741824)) {
            long j = simpleRateLimiter.startNanos;
            int i = 1;
            parsableByteArray.reset(1);
            RealStrongMemoryCache$cache$1 readData = readData(realStrongMemoryCache$cache$1, j, parsableByteArray.data, 1);
            long j2 = j + 1;
            byte b = parsableByteArray.data[0];
            boolean z = (b & 128) != 0;
            int i2 = b & Byte.MAX_VALUE;
            CryptoInfo cryptoInfo = decoderInputBuffer.cryptoInfo;
            byte[] bArr = cryptoInfo.iv;
            if (bArr == null) {
                cryptoInfo.iv = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            realStrongMemoryCache$cache$1 = readData(readData, j2, cryptoInfo.iv, i2);
            long j3 = j2 + i2;
            if (z) {
                parsableByteArray.reset(2);
                realStrongMemoryCache$cache$1 = readData(realStrongMemoryCache$cache$1, j3, parsableByteArray.data, 2);
                j3 += 2;
                i = parsableByteArray.readUnsignedShort();
            }
            int[] iArr = cryptoInfo.numBytesOfClearData;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i3 = i * 6;
                parsableByteArray.reset(i3);
                realStrongMemoryCache$cache$1 = readData(realStrongMemoryCache$cache$1, j3, parsableByteArray.data, i3);
                j3 += i3;
                parsableByteArray.setPosition(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = parsableByteArray.readUnsignedShort();
                    iArr2[i4] = parsableByteArray.readUnsignedIntToInt();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = simpleRateLimiter.capacity - ((int) (j3 - simpleRateLimiter.startNanos));
            }
            TrackOutput.CryptoData cryptoData = (TrackOutput.CryptoData) simpleRateLimiter.secondsAndCount;
            String str = Util.DEVICE_DEBUG_INFO;
            byte[] bArr2 = cryptoData.encryptionKey;
            byte[] bArr3 = cryptoInfo.iv;
            int i5 = cryptoData.cryptoMode;
            int i6 = cryptoData.encryptedBlocks;
            int i7 = cryptoData.clearBlocks;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            cryptoInfo.encryptedBlocks = i6;
            cryptoInfo.clearBlocks = i7;
            MediaCodec.CryptoInfo cryptoInfo2 = cryptoInfo.frameworkCryptoInfo;
            cryptoInfo2.numSubSamples = i;
            cryptoInfo2.numBytesOfClearData = iArr;
            cryptoInfo2.numBytesOfEncryptedData = iArr2;
            cryptoInfo2.key = bArr2;
            cryptoInfo2.iv = bArr3;
            cryptoInfo2.mode = i5;
            CallResult callResult = cryptoInfo.patternHolder;
            callResult.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) callResult.serviceNames;
            pattern.set(i6, i7);
            ((MediaCodec.CryptoInfo) callResult.result).setPattern(pattern);
            long j4 = simpleRateLimiter.startNanos;
            int i8 = (int) (j3 - j4);
            simpleRateLimiter.startNanos = j4 + i8;
            simpleRateLimiter.capacity -= i8;
        }
        if (!decoderInputBuffer.getFlag(268435456)) {
            decoderInputBuffer.ensureSpaceForWrite(simpleRateLimiter.capacity);
            return readData(realStrongMemoryCache$cache$1, simpleRateLimiter.startNanos, decoderInputBuffer.data, simpleRateLimiter.capacity);
        }
        parsableByteArray.reset(4);
        RealStrongMemoryCache$cache$1 readData2 = readData(realStrongMemoryCache$cache$1, simpleRateLimiter.startNanos, parsableByteArray.data, 4);
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        simpleRateLimiter.startNanos += 4;
        simpleRateLimiter.capacity -= 4;
        decoderInputBuffer.ensureSpaceForWrite(readUnsignedIntToInt);
        RealStrongMemoryCache$cache$1 readData3 = readData(readData2, simpleRateLimiter.startNanos, decoderInputBuffer.data, readUnsignedIntToInt);
        simpleRateLimiter.startNanos += readUnsignedIntToInt;
        int i9 = simpleRateLimiter.capacity - readUnsignedIntToInt;
        simpleRateLimiter.capacity = i9;
        ByteBuffer byteBuffer = decoderInputBuffer.supplementalData;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            decoderInputBuffer.supplementalData = ByteBuffer.allocate(i9);
        } else {
            decoderInputBuffer.supplementalData.clear();
        }
        return readData(readData3, simpleRateLimiter.startNanos, decoderInputBuffer.supplementalData, simpleRateLimiter.capacity);
    }

    public final void discardDownstreamTo(long j) {
        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1;
        if (j == -1) {
            return;
        }
        while (true) {
            realStrongMemoryCache$cache$1 = this.firstAllocationNode;
            if (j < realStrongMemoryCache$cache$1.size) {
                break;
            }
            Recorder.AnonymousClass3 anonymousClass3 = this.allocator;
            Allocation allocation = (Allocation) realStrongMemoryCache$cache$1.map;
            synchronized (anonymousClass3) {
                DefaultAllocator defaultAllocator = ((DefaultLoadControl) anonymousClass3.this$0).allocator;
                synchronized (defaultAllocator) {
                    Allocation[] allocationArr = defaultAllocator.availableAllocations;
                    int i = defaultAllocator.availableCount;
                    defaultAllocator.availableCount = i + 1;
                    allocationArr[i] = allocation;
                    defaultAllocator.allocatedCount--;
                }
                anonymousClass3.releaseInternal(allocation);
            }
            RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$12 = this.firstAllocationNode;
            realStrongMemoryCache$cache$12.map = null;
            RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$13 = (RealStrongMemoryCache$cache$1) realStrongMemoryCache$cache$12.this$0;
            realStrongMemoryCache$cache$12.this$0 = null;
            this.firstAllocationNode = realStrongMemoryCache$cache$13;
        }
        if (this.readAllocationNode.maxSize < realStrongMemoryCache$cache$1.maxSize) {
            this.readAllocationNode = realStrongMemoryCache$cache$1;
        }
    }

    public final int preAppend(int i) {
        Allocation allocate;
        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = this.writeAllocationNode;
        if (((Allocation) realStrongMemoryCache$cache$1.map) == null) {
            Recorder.AnonymousClass3 anonymousClass3 = this.allocator;
            synchronized (anonymousClass3) {
                allocate = ((DefaultLoadControl) anonymousClass3.this$0).allocator.allocate();
                ((HashMap) anonymousClass3.val$completer).put(allocate, (PlayerId) anonymousClass3.val$recordingToStart);
                DefaultLoadControl.PlayerLoadingState playerLoadingState = (DefaultLoadControl.PlayerLoadingState) ((DefaultLoadControl) anonymousClass3.this$0).loadingStates.get((PlayerId) anonymousClass3.val$recordingToStart);
                if (playerLoadingState != null) {
                    synchronized (playerLoadingState) {
                        playerLoadingState.allocatedCounts++;
                    }
                }
            }
            RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$12 = new RealStrongMemoryCache$cache$1(this.writeAllocationNode.size, this.allocationLength);
            realStrongMemoryCache$cache$1.map = allocate;
            realStrongMemoryCache$cache$1.this$0 = realStrongMemoryCache$cache$12;
        }
        return Math.min(i, (int) (this.writeAllocationNode.size - this.totalBytesWritten));
    }

    public static RealStrongMemoryCache$cache$1 readData(RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1, long j, ByteBuffer byteBuffer, int i) {
        while (j >= realStrongMemoryCache$cache$1.size) {
            realStrongMemoryCache$cache$1 = (RealStrongMemoryCache$cache$1) realStrongMemoryCache$cache$1.this$0;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (realStrongMemoryCache$cache$1.size - j));
            Allocation allocation = (Allocation) realStrongMemoryCache$cache$1.map;
            byteBuffer.put(allocation.data, ((int) (j - realStrongMemoryCache$cache$1.maxSize)) + allocation.offset, min);
            i -= min;
            j += min;
            if (j == realStrongMemoryCache$cache$1.size) {
                realStrongMemoryCache$cache$1 = (RealStrongMemoryCache$cache$1) realStrongMemoryCache$cache$1.this$0;
            }
        }
        return realStrongMemoryCache$cache$1;
    }
}
