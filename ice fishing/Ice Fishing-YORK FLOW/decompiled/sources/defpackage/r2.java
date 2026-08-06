package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class r2 extends defpackage.jw0 {
    public final defpackage.dn0 fWTAfUmVKrZq;

    public r2(defpackage.dn0 dn0Var) {
        super(2, new java.util.ArrayList());
        this.fWTAfUmVKrZq = dn0Var;
    }

    @Override // defpackage.jw0
    public final java.lang.Object ZpBGe2uQfcn8(defpackage.ne neVar) {
        neVar.getClass();
        if (!neVar.equals(defpackage.b41.ZpBGe2uQfcn8(defpackage.s71.class))) {
            return super.ZpBGe2uQfcn8(neVar);
        }
        try {
            return defpackage.ok0.VFeft99leXEK(this.fWTAfUmVKrZq);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.lang.IllegalStateException("Koin could not create a SavedStateHandle: the ViewModel's CreationExtras has no SavedStateRegistryOwner. Resolve the ViewModel via koinViewModel()/koinNavViewModel() with a proper owner (e.g. a NavBackStackEntry), and inject SavedStateHandle directly in the ViewModel constructor (not lazily/outside construction).", e);
        }
    }
}
