package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class g1 extends ao0 {
    public final of0 X1lG3V04pd;

    public g1(of0 of0Var) {
        super(2, new ArrayList());
        this.X1lG3V04pd = of0Var;
    }

    @Override // defpackage.ao0
    public final Object GWasM1elztuh(va vaVar) {
        vaVar.getClass();
        if (!vaVar.equals(st0.GWasM1elztuh(pw0.class))) {
            return super.GWasM1elztuh(vaVar);
        }
        try {
            return fb1.jivtDDk9H(this.X1lG3V04pd);
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException("Koin could not create a SavedStateHandle: the ViewModel's CreationExtras has no SavedStateRegistryOwner. Resolve the ViewModel via koinViewModel()/koinNavViewModel() with a proper owner (e.g. a NavBackStackEntry), and inject SavedStateHandle directly in the ViewModel constructor (not lazily/outside construction).", e);
        }
    }
}
