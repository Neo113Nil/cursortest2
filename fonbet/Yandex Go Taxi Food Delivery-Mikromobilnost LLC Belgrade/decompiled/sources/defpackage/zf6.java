package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import com.yandex.messaging.ui.chatlist.organizations.ChooseOrganizationDialog;
import com.yandex.messaging.views.bottomsheet.NavigableBottomSheetDialog;
import kotlinx.coroutines.a;

/* loaded from: classes15.dex */
public final /* synthetic */ class zf6 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zf6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((mrb) ((ag6) obj)).b = null;
                break;
            case 1:
                c3b c3bVar = (c3b) obj;
                a.g(c3bVar.b.a, null);
                e3b e3bVar = c3bVar.g;
                if (e3bVar != null) {
                    e3bVar.invoke();
                }
                c3bVar.g = null;
                break;
            case 2:
                ChooseOrganizationDialog.dialog_delegate$lambda$2$lambda$1$lambda$0((ChooseOrganizationDialog) obj, dialogInterface);
                break;
            case 3:
                ((Runnable) obj).run();
                break;
            case 4:
                ph20 ph20Var = (ph20) obj;
                String str = ph20Var.g;
                if (str != null) {
                    ph20Var.a.a(str, ph20Var.d);
                    ph20Var.g = null;
                    break;
                }
                break;
            case 5:
                ((NavigableBottomSheetDialog) obj).onDialogDismissed();
                break;
            default:
                op71 op71Var = (op71) obj;
                Dialog dialog = op71Var.a;
                if (dialog != null) {
                    dialog.setOnDismissListener(null);
                }
                op71Var.a = null;
                break;
        }
    }
}
