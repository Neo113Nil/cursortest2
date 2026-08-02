package B7;

import z7.C5246j;
import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public abstract class g extends a {
    public g(InterfaceC5240d interfaceC5240d) {
        super(interfaceC5240d);
        if (interfaceC5240d != null && interfaceC5240d.getContext() != C5246j.f42241n) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // z7.InterfaceC5240d
    public final InterfaceC5245i getContext() {
        return C5246j.f42241n;
    }
}
