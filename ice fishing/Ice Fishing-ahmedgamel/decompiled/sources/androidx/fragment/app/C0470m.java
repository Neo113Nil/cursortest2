package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0470m extends S0.f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0474q f4999n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0471n f5000u;

    public C0470m(DialogInterfaceOnCancelListenerC0471n dialogInterfaceOnCancelListenerC0471n, C0474q c0474q) {
        this.f5000u = dialogInterfaceOnCancelListenerC0471n;
        this.f4999n = c0474q;
    }

    @Override // S0.f
    public final View o(int i) {
        C0474q c0474q = this.f4999n;
        if (c0474q.r()) {
            return c0474q.o(i);
        }
        Dialog dialog = this.f5000u.f5008I0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // S0.f
    public final boolean r() {
        return this.f4999n.r() || this.f5000u.f5012M0;
    }
}
