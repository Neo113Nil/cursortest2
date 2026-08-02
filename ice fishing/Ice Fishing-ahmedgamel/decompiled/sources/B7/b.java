package B7;

import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class b implements InterfaceC5240d {

    /* renamed from: n, reason: collision with root package name */
    public static final b f286n = new b();

    @Override // z7.InterfaceC5240d
    public final InterfaceC5245i getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // z7.InterfaceC5240d
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
