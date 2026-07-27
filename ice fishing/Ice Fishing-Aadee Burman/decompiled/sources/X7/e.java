package X7;

import S7.InterfaceC0404w;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class e implements InterfaceC0404w {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5272i f3830n;

    public e(InterfaceC5272i interfaceC5272i) {
        this.f3830n = interfaceC5272i;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f3830n + ')';
    }

    @Override // S7.InterfaceC0404w
    public final InterfaceC5272i z() {
        return this.f3830n;
    }
}
