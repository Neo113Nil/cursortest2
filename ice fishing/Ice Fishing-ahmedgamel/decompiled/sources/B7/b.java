package B7;

import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class b implements InterfaceC5267d {

    /* renamed from: n, reason: collision with root package name */
    public static final b f220n = new b();

    @Override // z7.InterfaceC5267d
    public final InterfaceC5272i getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // z7.InterfaceC5267d
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
