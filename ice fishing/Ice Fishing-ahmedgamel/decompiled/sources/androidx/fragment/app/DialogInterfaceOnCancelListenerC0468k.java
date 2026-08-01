package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;
import u2.C5076g;

/* renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0468k implements DialogInterface.OnCancelListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4996n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4997u;

    public /* synthetic */ DialogInterfaceOnCancelListenerC0468k(int i, Object obj) {
        this.f4996n = i;
        this.f4997u = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f4996n) {
            case 0:
                DialogInterfaceOnCancelListenerC0471n dialogInterfaceOnCancelListenerC0471n = (DialogInterfaceOnCancelListenerC0471n) this.f4997u;
                Dialog dialog = dialogInterfaceOnCancelListenerC0471n.f5008I0;
                if (dialog != null) {
                    dialogInterfaceOnCancelListenerC0471n.onCancel(dialog);
                    break;
                }
                break;
            default:
                ((C5076g) this.f4997u).b();
                break;
        }
    }
}
