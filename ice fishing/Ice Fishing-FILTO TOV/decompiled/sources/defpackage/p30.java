package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class p30 extends qu0 {
    public final /* synthetic */ lv AvO7iQsrTN;
    public int EljAMC1QTz;
    public final /* synthetic */ vg encWxUiV2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p30(vg vgVar, vg vgVar2, lv lvVar) {
        super(vgVar);
        this.AvO7iQsrTN = lvVar;
        this.encWxUiV2 = vgVar2;
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.EljAMC1QTz;
        if (i != 0) {
            if (i != 1) {
                o4.jivtDDk9H("This coroutine had already completed");
                return null;
            }
            this.EljAMC1QTz = 2;
            o50.A1EKNP6CxJ(obj);
            return obj;
        }
        this.EljAMC1QTz = 1;
        o50.A1EKNP6CxJ(obj);
        lv lvVar = this.AvO7iQsrTN;
        lvVar.getClass();
        fb1.XnEVoBF0td1l(2, lvVar);
        return lvVar.EljAMC1QTz(this.encWxUiV2, this);
    }
}
