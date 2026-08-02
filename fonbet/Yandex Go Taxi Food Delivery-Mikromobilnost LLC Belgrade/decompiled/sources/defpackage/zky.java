package defpackage;

import android.app.Activity;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes10.dex */
public final class zky {
    public AlertDialog a;

    public final void a(Activity activity, Runnable runnable) {
        if (this.a != null) {
            return;
        }
        AlertDialog alertDialog = new AlertDialog(activity);
        alertDialog.setMessage(kyh0.link_error_dialog_message);
        alertDialog.setPositiveButton(kyh0.common_retry, runnable);
        alertDialog.setNegativeButton(kyh0.common_cancel);
        alertDialog.setDismissListener(new dhv(23, this));
        alertDialog.show();
        this.a = alertDialog;
    }
}
