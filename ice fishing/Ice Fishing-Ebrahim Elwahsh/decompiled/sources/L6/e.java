package L6;

import J6.o;

/* loaded from: classes2.dex */
public final class e extends J6.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1763b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1764c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(byte[] bArr, int i) {
        super(J6.d.b(r0) + r0 + r4);
        int b9;
        this.f1763b = i;
        switch (i) {
            case 1:
                if (bArr.length == 0) {
                    b9 = 0;
                } else {
                    int i4 = Q6.a.f2717a.f1402c;
                    int length = bArr.length;
                    b9 = i4 + J6.d.b(length) + length;
                }
                super(b9);
                this.f1764c = bArr;
                break;
            default:
                int i9 = Q6.a.f2723g.f1402c;
                int length2 = bArr.length;
                this.f1764c = bArr;
                break;
        }
    }

    @Override // J6.f
    public final void c(o oVar) {
        switch (this.f1763b) {
            case 0:
                oVar.w(Q6.a.f2723g, this.f1764c);
                break;
            default:
                byte[] bArr = this.f1764c;
                if (bArr.length != 0) {
                    oVar.Y(Q6.a.f2717a, bArr);
                    break;
                }
                break;
        }
    }
}
