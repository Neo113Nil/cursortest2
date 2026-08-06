package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xs extends d71 implements mv {
    public final /* synthetic */ lv E7jCp8Ls;
    public /* synthetic */ ms JFJ3QoxA;
    public int mOu10nynGul;
    public /* synthetic */ Object rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs(lv lvVar, vg vgVar) {
        super(3, vgVar);
        this.E7jCp8Ls = lvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r0.E7jCp8Ls(r6, r5) == r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r6 == r4) goto L15;
     */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        ms msVar;
        int i = this.mOu10nynGul;
        qh qhVar = qh.OOA6hdeuvCS;
        if (i == 0) {
            o50.A1EKNP6CxJ(obj);
            msVar = this.JFJ3QoxA;
            Object obj2 = this.rQPn8YBR;
            this.JFJ3QoxA = msVar;
            this.mOu10nynGul = 1;
            obj = this.E7jCp8Ls.EljAMC1QTz(obj2, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    o50.A1EKNP6CxJ(obj);
                    return kc1.GWasM1elztuh;
                }
                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            msVar = this.JFJ3QoxA;
            o50.A1EKNP6CxJ(obj);
        }
        this.JFJ3QoxA = null;
        this.mOu10nynGul = 2;
    }

    @Override // defpackage.mv
    public final Object X1lG3V04pd(Object obj, Object obj2, Object obj3) {
        xs xsVar = new xs(this.E7jCp8Ls, (vg) obj3);
        xsVar.JFJ3QoxA = (ms) obj;
        xsVar.rQPn8YBR = obj2;
        return xsVar.WIEu4Ya2g8(kc1.GWasM1elztuh);
    }
}
