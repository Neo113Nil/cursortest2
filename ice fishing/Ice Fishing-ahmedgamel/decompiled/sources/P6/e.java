package P6;

import N6.o;

/* loaded from: classes2.dex */
public final class e extends N6.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2575b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2576c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(byte[] bArr, int i) {
        super(N6.d.b(r0) + r0 + r4);
        int b9;
        this.f2575b = i;
        switch (i) {
            case 1:
                if (bArr.length == 0) {
                    b9 = 0;
                } else {
                    int i6 = U6.a.f3205a.f1955c;
                    int length = bArr.length;
                    b9 = i6 + N6.d.b(length) + length;
                }
                super(b9);
                this.f2576c = bArr;
                break;
            default:
                int i9 = U6.a.f3211g.f1955c;
                int length2 = bArr.length;
                this.f2576c = bArr;
                break;
        }
    }

    @Override // N6.f
    public final void c(o oVar) {
        switch (this.f2575b) {
            case 0:
                oVar.w(U6.a.f3211g, this.f2576c);
                break;
            default:
                byte[] bArr = this.f2576c;
                if (bArr.length != 0) {
                    oVar.Y(U6.a.f3205a, bArr);
                    break;
                }
                break;
        }
    }
}
