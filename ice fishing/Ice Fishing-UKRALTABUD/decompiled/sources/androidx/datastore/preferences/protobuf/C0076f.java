package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0076f extends C0077g {

    /* renamed from: j, reason: collision with root package name */
    public final int f1425j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1426k;

    public C0076f(byte[] bArr, int i2, int i3) {
        super(bArr);
        C0077g.b(i2, i2 + i3, bArr.length);
        this.f1425j = i2;
        this.f1426k = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.C0077g
    public final byte a(int i2) {
        int i3 = this.f1426k;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.f1430g[this.f1425j + i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(E0.h.e("Index < 0: ", i2));
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
    }

    @Override // androidx.datastore.preferences.protobuf.C0077g
    public final void d(byte[] bArr, int i2) {
        System.arraycopy(this.f1430g, this.f1425j, bArr, 0, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.C0077g
    public final int e() {
        return this.f1425j;
    }

    @Override // androidx.datastore.preferences.protobuf.C0077g
    public final byte f(int i2) {
        return this.f1430g[this.f1425j + i2];
    }

    @Override // androidx.datastore.preferences.protobuf.C0077g
    public final int size() {
        return this.f1426k;
    }
}
