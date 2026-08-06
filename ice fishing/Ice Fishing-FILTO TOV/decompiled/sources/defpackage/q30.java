package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class q30 extends wg {
    public final /* synthetic */ vg JFJ3QoxA;
    public int encWxUiV2;
    public final /* synthetic */ lv mOu10nynGul;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q30(vg vgVar, gh ghVar, lv lvVar, vg vgVar2) {
        super(vgVar, ghVar);
        this.mOu10nynGul = lvVar;
        this.JFJ3QoxA = vgVar2;
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.encWxUiV2;
        if (i != 0) {
            if (i != 1) {
                o4.jivtDDk9H("This coroutine had already completed");
                return null;
            }
            this.encWxUiV2 = 2;
            o50.A1EKNP6CxJ(obj);
            return obj;
        }
        this.encWxUiV2 = 1;
        o50.A1EKNP6CxJ(obj);
        lv lvVar = this.mOu10nynGul;
        lvVar.getClass();
        fb1.XnEVoBF0td1l(2, lvVar);
        return lvVar.EljAMC1QTz(this.JFJ3QoxA, this);
    }
}
