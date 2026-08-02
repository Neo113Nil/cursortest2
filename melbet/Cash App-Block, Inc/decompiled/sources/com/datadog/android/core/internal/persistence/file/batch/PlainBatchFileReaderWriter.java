package com.datadog.android.core.internal.persistence.file.batch;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.util.DBUtil;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.internal.persistence.file.FileMover$delete$1;
import com.datadog.android.core.internal.persistence.file.FileWriter;
import com.datadog.android.okhttp.DatadogInterceptor$intercept$1;
import com.google.android.gms.internal.mlkit_vision_common.zzhk;
import com.google.zxing.qrcode.decoder.DataBlock;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class PlainBatchFileReaderWriter implements FileWriter {
    public final InternalLogger internalLogger;

    public PlainBatchFileReaderWriter(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
    }

    public static void lockFileAndWriteData(File file, boolean z, RawBatchEvent rawBatchEvent) {
        FileOutputStream fileOutputStream = new FileOutputStream(file, z);
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            lock.getClass();
            try {
                byte[] bArr = rawBatchEvent.metadata;
                byte[] bArr2 = rawBatchEvent.data;
                ByteBuffer allocate = ByteBuffer.allocate(bArr2.length + 6 + bArr.length + 6);
                allocate.getClass();
                ByteBuffer put = allocate.putShort(Thread$State$EnumUnboxingLocalUtility.getIdentifier(2)).putInt(bArr.length).put(bArr);
                put.getClass();
                ByteBuffer put2 = put.putShort(Thread$State$EnumUnboxingLocalUtility.getIdentifier(1)).putInt(bArr2.length).put(bArr2);
                put2.getClass();
                fileOutputStream.write(put2.array());
                fileOutputStream.close();
            } finally {
                lock.release();
            }
        } finally {
        }
    }

    public final boolean checkReadExpected(final int i, final int i2, final String str) {
        if (i == i2) {
            return true;
        }
        InternalLogger.Target target = InternalLogger.Target.MAINTAINER;
        InternalLogger internalLogger = this.internalLogger;
        if (i2 != -1) {
            DBUtil.log$default(internalLogger, 5, target, new Function0() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$checkReadExpected$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("Number of bytes read for operation='", i, str, "' doesn't match with expected: expected=", ", actual=");
                    m.append(i2);
                    return m.toString();
                }
            }, null, false, 56);
            return false;
        }
        DBUtil.log$default(internalLogger, 5, target, new DatadogInterceptor$intercept$1(str, 7), null, false, 56);
        return false;
    }

    public final DataBlock readBlock(BufferedInputStream bufferedInputStream, final int i) {
        ByteBuffer allocate = ByteBuffer.allocate(6);
        int read = bufferedInputStream.read(allocate.array());
        if (!checkReadExpected(6, read, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Block(", Thread$State$EnumUnboxingLocalUtility.name$1(i), "): Header read"))) {
            return new DataBlock((byte[]) null, Math.max(0, read));
        }
        final short s = allocate.getShort();
        if (s != Thread$State$EnumUnboxingLocalUtility.getIdentifier(i)) {
            DBUtil.log$default(this.internalLogger, 5, InternalLogger.Target.MAINTAINER, new Function0() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$readBlock$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = i;
                    short identifier = Thread$State$EnumUnboxingLocalUtility.getIdentifier(i2);
                    StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m((int) s, "Unexpected block type identifier=", " met, was expecting ");
                    m2m.append(i2 != 1 ? i2 != 2 ? "null" : "META" : "EVENT");
                    m2m.append("(");
                    m2m.append((int) identifier);
                    m2m.append(")");
                    return m2m.toString();
                }
            }, null, false, 56);
            return new DataBlock((byte[]) null, read);
        }
        int i2 = allocate.getInt();
        byte[] bArr = new byte[i2];
        int read2 = bufferedInputStream.read(bArr);
        return checkReadExpected(i2, read2, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Block(", Thread$State$EnumUnboxingLocalUtility.name$1(i), "):Data read")) ? new DataBlock(bArr, read + read2) : new DataBlock((byte[]) null, Math.max(0, read2) + read);
    }

    public final List readData(File file) {
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
        try {
            return readFileData(file);
        } catch (IOException e) {
            DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 18), e, 48);
            return EmptyList.INSTANCE;
        } catch (SecurityException e2) {
            DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 19), e2, 48);
            return EmptyList.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0026, code lost:
    
        r2 = r2 - r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList readFileData(File file) {
        int lengthSafe = (int) zzhk.lengthSafe(file, this.internalLogger);
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), PKIFailureInfo.certRevoked);
        int i = lengthSafe;
        while (true) {
            if (i <= 0) {
                break;
            }
            try {
                DataBlock readBlock = readBlock(bufferedInputStream, 2);
                int i2 = readBlock.numDataCodewords;
                byte[] bArr = readBlock.codewords;
                if (bArr != null) {
                    DataBlock readBlock2 = readBlock(bufferedInputStream, 1);
                    i -= i2 + readBlock2.numDataCodewords;
                    byte[] bArr2 = readBlock2.codewords;
                    if (bArr2 == null) {
                        break;
                    }
                    arrayList.add(new RawBatchEvent(bArr2, bArr));
                } else {
                    break;
                }
            } finally {
            }
        }
        bufferedInputStream.close();
        if (i == 0 && (lengthSafe <= 0 || !arrayList.isEmpty())) {
            return arrayList;
        }
        DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY}), new FileMover$delete$1(file, 20), null, 56);
        return arrayList;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileWriter
    public final boolean writeData(File file, Object obj, boolean z) {
        RawBatchEvent rawBatchEvent = (RawBatchEvent) obj;
        InternalLogger.Target target = InternalLogger.Target.MAINTAINER;
        file.getClass();
        try {
            lockFileAndWriteData(file, z, rawBatchEvent);
            return true;
        } catch (IOException e) {
            DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsJVMKt.listOf(target), new FileMover$delete$1(file, 21), e, 48);
            return false;
        } catch (SecurityException e2) {
            DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, InternalLogger.Target.TELEMETRY}), new FileMover$delete$1(file, 22), e2, 48);
            return false;
        }
    }
}
