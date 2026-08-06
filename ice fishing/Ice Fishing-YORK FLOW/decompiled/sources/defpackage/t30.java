package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class t30 implements defpackage.y10 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ defpackage.y10 oh71FJcDz6S2;

    public /* synthetic */ t30(defpackage.y10 y10Var, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = y10Var;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        long j;
        switch (this.WDYagTQQm9ns) {
            case 0:
                defpackage.re1 re1Var = (defpackage.re1) obj;
                synchronized (defpackage.te1.fWTAfUmVKrZq) {
                    j = defpackage.te1.WDYagTQQm9ns;
                    defpackage.te1.WDYagTQQm9ns = 1 + j;
                }
                return new defpackage.b31(j, re1Var, this.oh71FJcDz6S2);
            default:
                return this.oh71FJcDz6S2.P05cfTpS5W5L(java.lang.Long.valueOf(((java.lang.Number) obj).longValue() / 1000000));
        }
    }
}
