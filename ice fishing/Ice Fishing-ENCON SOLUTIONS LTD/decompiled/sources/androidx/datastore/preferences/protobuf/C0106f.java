package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106f extends C0107g {

    /* renamed from: e, reason: collision with root package name */
    public final int f2385e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2386f;

    public C0106f(byte[] bArr, int i2, int i3) {
        super(bArr);
        C0107g.b(i2, i2 + i3, bArr.length);
        this.f2385e = i2;
        this.f2386f = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.C0107g
    public final byte a(int i2) {
        int i3 = this.f2386f;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.f2390b[this.f2385e + i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(C1.a.f(i2, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(C1.a.h("Index > length: ", i2, i3, ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C0107g
    public final void d(int i2, byte[] bArr) {
        System.arraycopy(this.f2390b, this.f2385e, bArr, 0, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.C0107g
    public final int e() {
        return this.f2385e;
    }

    @Override // androidx.datastore.preferences.protobuf.C0107g
    public final byte f(int i2) {
        return this.f2390b[this.f2385e + i2];
    }

    @Override // androidx.datastore.preferences.protobuf.C0107g
    public final int size() {
        return this.f2386f;
    }
}
