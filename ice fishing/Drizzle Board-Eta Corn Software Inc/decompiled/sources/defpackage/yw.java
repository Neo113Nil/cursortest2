package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class yw implements j3 {
    public final /* synthetic */ ax MdtA4re8;
    public final wi NCTxEWno;

    public yw(ax axVar, wi wiVar) {
        wiVar.getClass();
        this.MdtA4re8 = axVar;
        this.NCTxEWno = wiVar;
    }

    @Override // defpackage.j3
    public final void cancel() {
        ax axVar = this.MdtA4re8;
        q0 q0Var = axVar.NCTxEWno;
        wi wiVar = this.NCTxEWno;
        q0Var.remove(wiVar);
        if (fn.qoPGr6Ce(axVar.MdtA4re8, wiVar)) {
            wiVar.getClass();
            axVar.MdtA4re8 = null;
        }
        wiVar.getClass();
        wiVar.NCTxEWno.remove(this);
        ok okVar = wiVar.MdtA4re8;
        if (okVar != null) {
            okVar.qoPGr6Ce();
        }
        wiVar.MdtA4re8 = null;
    }
}
