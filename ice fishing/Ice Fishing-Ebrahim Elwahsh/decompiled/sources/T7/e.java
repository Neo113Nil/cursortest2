package T7;

import O7.InterfaceC0397w;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public final class e implements InterfaceC0397w {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5138i f3136n;

    public e(InterfaceC5138i interfaceC5138i) {
        this.f3136n = interfaceC5138i;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f3136n + ')';
    }

    @Override // O7.InterfaceC0397w
    public final InterfaceC5138i z() {
        return this.f3136n;
    }
}
