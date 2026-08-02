package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class ByteString$SystemByteArrayCopier implements ByteString$ByteArrayCopier {
    @Override // androidx.datastore.preferences.protobuf.ByteString$ByteArrayCopier
    public final byte[] copyFrom(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
