package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474m extends X2.a {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0475n f4967A;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C0478q f4968z;

    public C0474m(DialogInterfaceOnCancelListenerC0475n dialogInterfaceOnCancelListenerC0475n, C0478q c0478q) {
        this.f4967A = dialogInterfaceOnCancelListenerC0475n;
        this.f4968z = c0478q;
    }

    @Override // X2.a
    public final View n(int i) {
        C0478q c0478q = this.f4968z;
        if (c0478q.o()) {
            return c0478q.n(i);
        }
        Dialog dialog = this.f4967A.f4971D0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // X2.a
    public final boolean o() {
        return this.f4968z.o() || this.f4967A.f4975H0;
    }
}
