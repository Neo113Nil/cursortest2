package B7;

import z7.C5273j;
import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public abstract class g extends a {
    public g(InterfaceC5267d interfaceC5267d) {
        super(interfaceC5267d);
        if (interfaceC5267d != null && interfaceC5267d.getContext() != C5273j.f42272n) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // z7.InterfaceC5267d
    public final InterfaceC5272i getContext() {
        return C5273j.f42272n;
    }
}
