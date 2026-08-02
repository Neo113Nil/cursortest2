package X7;

import S7.InterfaceC0408w;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class e implements InterfaceC0408w {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5245i f3785n;

    public e(InterfaceC5245i interfaceC5245i) {
        this.f3785n = interfaceC5245i;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f3785n + ')';
    }

    @Override // S7.InterfaceC0408w
    public final InterfaceC5245i z() {
        return this.f3785n;
    }
}
