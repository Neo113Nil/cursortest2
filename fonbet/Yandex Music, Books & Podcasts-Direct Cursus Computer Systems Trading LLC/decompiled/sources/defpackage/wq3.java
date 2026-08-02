package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class wq3 implements va7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wq3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.va7
    public final db7 a() {
        switch (this.a) {
            case 0:
                br3 br3Var = (br3) this.b;
                liq liqVar = (liq) this.c;
                n9c n9cVar = new n9c(false);
                return br3Var.d.a ? new zq3(liqVar, n9cVar) : n9cVar;
            case 1:
                va7 va7Var = (va7) this.b;
                bl2 bl2Var = (bl2) this.c;
                db7 a = va7Var.a();
                a.getClass();
                a.q(bl2Var);
                return a;
            default:
                String str = (String) this.b;
                va7 va7Var2 = (va7) this.c;
                byte[] bArr = new byte[16];
                for (int i = 0; i < 16; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) (cvt.r(str.charAt(i2 + 1)) + (cvt.r(str.charAt(i2)) * 16));
                }
                return new zn(bArr, va7Var2.a());
        }
    }
}
