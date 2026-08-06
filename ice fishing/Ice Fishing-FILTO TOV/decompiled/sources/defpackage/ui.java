package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ui extends d71 implements hv {
    public final /* synthetic */ cj JFJ3QoxA;
    public int mOu10nynGul;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(cj cjVar, vg vgVar) {
        super(1, vgVar);
        this.JFJ3QoxA = cjVar;
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        if (i != 0) {
            if (i == 1) {
                o50.A1EKNP6CxJ(obj);
                return obj;
            }
            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o50.A1EKNP6CxJ(obj);
        this.mOu10nynGul = 1;
        Object mOu10nynGul = this.JFJ3QoxA.mOu10nynGul(this);
        qh qhVar = qh.OOA6hdeuvCS;
        return mOu10nynGul == qhVar ? qhVar : mOu10nynGul;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        return new ui(this.JFJ3QoxA, (vg) obj).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }
}
