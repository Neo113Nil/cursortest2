package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;
import t2.C5074h;

/* renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0478k implements DialogInterface.OnCancelListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5108n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f5109u;

    public /* synthetic */ DialogInterfaceOnCancelListenerC0478k(int i, Object obj) {
        this.f5108n = i;
        this.f5109u = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f5108n) {
            case 0:
                DialogInterfaceOnCancelListenerC0481n dialogInterfaceOnCancelListenerC0481n = (DialogInterfaceOnCancelListenerC0481n) this.f5109u;
                Dialog dialog = dialogInterfaceOnCancelListenerC0481n.f5120I0;
                if (dialog != null) {
                    dialogInterfaceOnCancelListenerC0481n.onCancel(dialog);
                    break;
                }
                break;
            default:
                ((C5074h) this.f5109u).b();
                break;
        }
    }
}
