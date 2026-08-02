package P6;

import N6.o;

/* loaded from: classes2.dex */
public final class e extends N6.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2410b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2411c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(byte[] bArr, int i) {
        super(N6.d.b(r0) + r0 + r4);
        int b9;
        this.f2410b = i;
        switch (i) {
            case 1:
                if (bArr.length == 0) {
                    b9 = 0;
                } else {
                    int i4 = U6.a.f3328a.f2043c;
                    int length = bArr.length;
                    b9 = i4 + N6.d.b(length) + length;
                }
                super(b9);
                this.f2411c = bArr;
                break;
            default:
                int i6 = U6.a.f3334g.f2043c;
                int length2 = bArr.length;
                this.f2411c = bArr;
                break;
        }
    }

    @Override // N6.f
    public final void c(o oVar) {
        switch (this.f2410b) {
            case 0:
                oVar.w(U6.a.f3334g, this.f2411c);
                break;
            default:
                byte[] bArr = this.f2411c;
                if (bArr.length != 0) {
                    oVar.Y(U6.a.f3328a, bArr);
                    break;
                }
                break;
        }
    }
}
