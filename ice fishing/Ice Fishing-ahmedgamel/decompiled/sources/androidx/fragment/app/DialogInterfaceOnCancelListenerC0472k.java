package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;
import w2.C5147g;

/* renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0472k implements DialogInterface.OnCancelListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4964n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4965u;

    public /* synthetic */ DialogInterfaceOnCancelListenerC0472k(int i, Object obj) {
        this.f4964n = i;
        this.f4965u = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f4964n) {
            case 0:
                DialogInterfaceOnCancelListenerC0475n dialogInterfaceOnCancelListenerC0475n = (DialogInterfaceOnCancelListenerC0475n) this.f4965u;
                Dialog dialog = dialogInterfaceOnCancelListenerC0475n.f4971D0;
                if (dialog != null) {
                    dialogInterfaceOnCancelListenerC0475n.onCancel(dialog);
                    break;
                }
                break;
            default:
                ((C5147g) this.f4965u).b();
                break;
        }
    }
}
