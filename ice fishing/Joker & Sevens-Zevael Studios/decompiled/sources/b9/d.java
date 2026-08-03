package b9;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.WindowManager;
import java.util.Arrays;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {
    public static final d INSTANCE = new d();

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: show$lambda-0, reason: not valid java name */
    public static final void m0show$lambda0(c cVar, DialogInterface dialogInterface, int i10) {
        j.e(cVar, "$callback");
        cVar.onAccept();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: show$lambda-1, reason: not valid java name */
    public static final void m1show$lambda1(c cVar, DialogInterface dialogInterface, int i10) {
        j.e(cVar, "$callback");
        cVar.onDecline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: show$lambda-2, reason: not valid java name */
    public static final void m2show$lambda2(c cVar, DialogInterface dialogInterface) {
        j.e(cVar, "$callback");
        cVar.onDecline();
    }

    public final void show(Activity activity, String str, String str2, final c cVar) {
        j.e(activity, "activity");
        j.e(str, "titlePrefix");
        j.e(str2, "previouslyDeniedPostfix");
        j.e(cVar, "callback");
        String string = activity.getString(o8.b.permission_not_available_title);
        j.d(string, "activity.getString(R.str…sion_not_available_title)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        String string2 = activity.getString(o8.b.permission_not_available_message);
        j.d(string2, "activity.getString(R.str…on_not_available_message)");
        try {
            new AlertDialog.Builder(activity).setTitle(format).setMessage(String.format(string2, Arrays.copyOf(new Object[]{str2}, 1))).setPositiveButton(o8.b.permission_not_available_open_settings_option, new a(0, cVar)).setNegativeButton(R.string.no, new a(1, cVar)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: b9.b
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    d.m2show$lambda2(c.this, dialogInterface);
                }
            }).show();
        } catch (WindowManager.BadTokenException unused) {
            com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Alert dialog for Android settings was skipped because the activity was unavailable to display it.");
            cVar.onDecline();
        }
    }
}
