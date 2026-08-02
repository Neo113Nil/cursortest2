package androidx.glance.appwidget.protobuf;

import com.google.android.gms.internal.time.zzgv;

/* loaded from: classes3.dex */
public abstract class UnknownFieldSchema {
    public abstract UnknownFieldSetLite getBuilderFromMessage(Object obj);

    public final boolean mergeOneFieldFrom(int i, CodedInputStreamReader codedInputStreamReader, Object obj) {
        int i2 = codedInputStreamReader.tag;
        zzgv zzgvVar = codedInputStreamReader.input;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            codedInputStreamReader.requireWireType(0);
            ((UnknownFieldSetLite) obj).storeField(i3 << 3, Long.valueOf(zzgvVar.readInt64()));
            return true;
        }
        if (i4 == 1) {
            codedInputStreamReader.requireWireType(1);
            ((UnknownFieldSetLite) obj).storeField((i3 << 3) | 1, Long.valueOf(zzgvVar.readFixed64()));
            return true;
        }
        if (i4 == 2) {
            ((UnknownFieldSetLite) obj).storeField((i3 << 3) | 2, codedInputStreamReader.readBytes());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            codedInputStreamReader.requireWireType(5);
            ((UnknownFieldSetLite) obj).storeField(5 | (i3 << 3), Integer.valueOf(zzgvVar.readFixed32()));
            return true;
        }
        UnknownFieldSetLite unknownFieldSetLite = new UnknownFieldSetLite(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (codedInputStreamReader.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(i7, codedInputStreamReader, unknownFieldSetLite)) {
        }
        if (i6 != codedInputStreamReader.tag) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (unknownFieldSetLite.isMutable) {
            unknownFieldSetLite.isMutable = false;
        }
        ((UnknownFieldSetLite) obj).storeField(i5 | 3, unknownFieldSetLite);
        return true;
    }
}
