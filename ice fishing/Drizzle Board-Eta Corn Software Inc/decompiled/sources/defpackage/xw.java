package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class xw implements to, j3 {
    public final wi MdtA4re8;
    public final xo NCTxEWno;
    public final /* synthetic */ ax VgvYg0wo;
    public yw wxUZMvaN;

    public xw(ax axVar, xo xoVar, wi wiVar) {
        wiVar.getClass();
        this.VgvYg0wo = axVar;
        this.NCTxEWno = xoVar;
        this.MdtA4re8 = wiVar;
        xoVar.qoPGr6Ce(this);
    }

    @Override // defpackage.to
    public final void P7K7Inc8(vo voVar, oo ooVar) {
        if (ooVar != oo.ON_START) {
            if (ooVar != oo.ON_STOP) {
                if (ooVar == oo.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                yw ywVar = this.wxUZMvaN;
                if (ywVar != null) {
                    ywVar.cancel();
                    return;
                }
                return;
            }
        }
        ax axVar = this.VgvYg0wo;
        axVar.getClass();
        wi wiVar = this.MdtA4re8;
        wiVar.getClass();
        axVar.NCTxEWno.addLast(wiVar);
        yw ywVar2 = new yw(axVar, wiVar);
        wiVar.NCTxEWno.add(ywVar2);
        axVar.wxUZMvaN();
        wiVar.MdtA4re8 = new zw(0, axVar, ax.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.wxUZMvaN = ywVar2;
    }

    @Override // defpackage.j3
    public final void cancel() {
        this.NCTxEWno.P7K7Inc8(this);
        wi wiVar = this.MdtA4re8;
        wiVar.getClass();
        wiVar.NCTxEWno.remove(this);
        yw ywVar = this.wxUZMvaN;
        if (ywVar != null) {
            ywVar.cancel();
        }
        this.wxUZMvaN = null;
    }
}
