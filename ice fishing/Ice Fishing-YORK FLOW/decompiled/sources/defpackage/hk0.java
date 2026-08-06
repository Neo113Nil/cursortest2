package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class hk0 implements defpackage.rb0 {
    public final defpackage.kc1 JhCgjQRTAOCT;
    public final defpackage.rb0 ZpBGe2uQfcn8;
    public final /* synthetic */ int fWTAfUmVKrZq;
    public final defpackage.rb0 giKS3J6vZuNy;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hk0(final defpackage.rb0 rb0Var, final defpackage.rb0 rb0Var2, int i) {
        this(rb0Var, rb0Var2, (byte) 0);
        this.fWTAfUmVKrZq = i;
        final int i2 = 0;
        switch (i) {
            case 1:
                this(rb0Var, rb0Var2, (byte) 0);
                final int i3 = 1;
                this.JhCgjQRTAOCT = defpackage.b80.oh71FJcDz6S2("kotlin.Pair", new defpackage.hc1[0], new defpackage.y10() { // from class: gk0
                    @Override // defpackage.y10
                    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
                        int i4 = i3;
                        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                        defpackage.rb0 rb0Var3 = rb0Var2;
                        defpackage.rb0 rb0Var4 = rb0Var;
                        defpackage.oe oeVar = (defpackage.oe) obj;
                        switch (i4) {
                            case 0:
                                oeVar.getClass();
                                defpackage.oe.ZpBGe2uQfcn8(oeVar, "key", rb0Var4.giKS3J6vZuNy());
                                defpackage.oe.ZpBGe2uQfcn8(oeVar, "value", rb0Var3.giKS3J6vZuNy());
                                break;
                            default:
                                oeVar.getClass();
                                defpackage.oe.ZpBGe2uQfcn8(oeVar, "first", rb0Var4.giKS3J6vZuNy());
                                defpackage.oe.ZpBGe2uQfcn8(oeVar, "second", rb0Var3.giKS3J6vZuNy());
                                break;
                        }
                        return gs1Var;
                    }
                });
                break;
            default:
                this.JhCgjQRTAOCT = defpackage.b80.QiMR8OkAhezm("kotlin.collections.Map.Entry", defpackage.ch1.WDYagTQQm9ns, new defpackage.hc1[0], new defpackage.y10() { // from class: gk0
                    @Override // defpackage.y10
                    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
                        int i4 = i2;
                        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                        defpackage.rb0 rb0Var3 = rb0Var2;
                        defpackage.rb0 rb0Var4 = rb0Var;
                        defpackage.oe oeVar = (defpackage.oe) obj;
                        switch (i4) {
                            case 0:
                                oeVar.getClass();
                                defpackage.oe.ZpBGe2uQfcn8(oeVar, "key", rb0Var4.giKS3J6vZuNy());
                                defpackage.oe.ZpBGe2uQfcn8(oeVar, "value", rb0Var3.giKS3J6vZuNy());
                                break;
                            default:
                                oeVar.getClass();
                                defpackage.oe.ZpBGe2uQfcn8(oeVar, "first", rb0Var4.giKS3J6vZuNy());
                                defpackage.oe.ZpBGe2uQfcn8(oeVar, "second", rb0Var3.giKS3J6vZuNy());
                                break;
                        }
                        return gs1Var;
                    }
                });
                break;
        }
    }

    @Override // defpackage.rb0
    public final void ZpBGe2uQfcn8(defpackage.up0 up0Var, java.lang.Object obj) {
        java.lang.Object key;
        java.lang.Object value;
        giKS3J6vZuNy().getClass();
        defpackage.hc1 giKS3J6vZuNy = giKS3J6vZuNy();
        int i = this.fWTAfUmVKrZq;
        switch (i) {
            case 0:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                entry.getClass();
                key = entry.getKey();
                break;
            default:
                defpackage.bw0 bw0Var = (defpackage.bw0) obj;
                bw0Var.getClass();
                key = bw0Var.WDYagTQQm9ns;
                break;
        }
        up0Var.e6mdH7fiFuta(giKS3J6vZuNy, 0, this.ZpBGe2uQfcn8, key);
        defpackage.hc1 giKS3J6vZuNy2 = giKS3J6vZuNy();
        switch (i) {
            case 0:
                java.util.Map.Entry entry2 = (java.util.Map.Entry) obj;
                entry2.getClass();
                value = entry2.getValue();
                break;
            default:
                defpackage.bw0 bw0Var2 = (defpackage.bw0) obj;
                bw0Var2.getClass();
                value = bw0Var2.oh71FJcDz6S2;
                break;
        }
        up0Var.e6mdH7fiFuta(giKS3J6vZuNy2, 1, this.giKS3J6vZuNy, value);
        giKS3J6vZuNy().getClass();
    }

    @Override // defpackage.rb0
    public final defpackage.hc1 giKS3J6vZuNy() {
        switch (this.fWTAfUmVKrZq) {
        }
        return this.JhCgjQRTAOCT;
    }

    public hk0(defpackage.rb0 rb0Var, defpackage.rb0 rb0Var2, byte b) {
        this.ZpBGe2uQfcn8 = rb0Var;
        this.giKS3J6vZuNy = rb0Var2;
    }
}
