package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ma implements n00 {
    public final int MdtA4re8;
    public final na NCTxEWno;
    public final la qoPGr6Ce;

    public ma(la laVar, na naVar, int i) {
        this.qoPGr6Ce = laVar;
        this.NCTxEWno = naVar;
        this.MdtA4re8 = i;
    }

    @Override // defpackage.n00
    public final Object get() {
        h50 h50Var = this.NCTxEWno.qoPGr6Ce;
        la laVar = this.qoPGr6Ce;
        int i = this.MdtA4re8;
        switch (i) {
            case 0:
                return new sq((zy) laVar.wxUZMvaN.get());
            case 1:
                return new wx((zy) laVar.wxUZMvaN.get());
            case 2:
                return new iy((zy) laVar.wxUZMvaN.get(), h50Var);
            case 3:
                return new d50((zy) laVar.wxUZMvaN.get(), (dt) laVar.VgvYg0wo.get(), (v80) laVar.P7K7Inc8.get());
            case 4:
                return new x70((v80) laVar.P7K7Inc8.get());
            case 5:
                return new p80(laVar.qoPGr6Ce.qoPGr6Ce, (zy) laVar.wxUZMvaN.get(), (v80) laVar.P7K7Inc8.get(), h50Var);
            case 6:
                return new h90((zy) laVar.wxUZMvaN.get(), (v80) laVar.P7K7Inc8.get(), h50Var);
            case 7:
                return new fb0();
            case 8:
                return new yb0((zy) laVar.wxUZMvaN.get(), (v80) laVar.P7K7Inc8.get());
            default:
                throw new AssertionError(i);
        }
    }
}
