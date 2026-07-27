package x7;

import v7.C5139j;
import v7.InterfaceC5133d;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public abstract class g extends AbstractC5217a {
    public g(InterfaceC5133d interfaceC5133d) {
        super(interfaceC5133d);
        if (interfaceC5133d != null && interfaceC5133d.getContext() != C5139j.f41372n) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // v7.InterfaceC5133d
    public final InterfaceC5138i getContext() {
        return C5139j.f41372n;
    }
}
