package com.onesignal.core.internal.permissions;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.WindowManager;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class e {
    public static final e INSTANCE = new e();

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$0(d callback, DialogInterface dialogInterface, int i) {
        kotlin.jvm.internal.h.e(callback, "$callback");
        callback.onAccept();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$1(d callback, DialogInterface dialogInterface, int i) {
        kotlin.jvm.internal.h.e(callback, "$callback");
        callback.onDecline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$2(d callback, DialogInterface dialogInterface) {
        kotlin.jvm.internal.h.e(callback, "$callback");
        callback.onDecline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$3(E7.a aVar, DialogInterface dialogInterface) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void show(Activity activity, String titlePrefix, String previouslyDeniedPostfix, d callback) {
        kotlin.jvm.internal.h.e(activity, "activity");
        kotlin.jvm.internal.h.e(titlePrefix, "titlePrefix");
        kotlin.jvm.internal.h.e(previouslyDeniedPostfix, "previouslyDeniedPostfix");
        kotlin.jvm.internal.h.e(callback, "callback");
        show(activity, titlePrefix, previouslyDeniedPostfix, callback, null);
    }

    public final void show(Activity activity, String titlePrefix, String previouslyDeniedPostfix, final d callback, final E7.a aVar) {
        kotlin.jvm.internal.h.e(activity, "activity");
        kotlin.jvm.internal.h.e(titlePrefix, "titlePrefix");
        kotlin.jvm.internal.h.e(previouslyDeniedPostfix, "previouslyDeniedPostfix");
        kotlin.jvm.internal.h.e(callback, "callback");
        String string = activity.getString(s4.b.permission_not_available_title);
        kotlin.jvm.internal.h.d(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[]{titlePrefix}, 1));
        String string2 = activity.getString(s4.b.permission_not_available_message);
        kotlin.jvm.internal.h.d(string2, "getString(...)");
        try {
            new AlertDialog.Builder(activity).setTitle(format).setMessage(String.format(string2, Arrays.copyOf(new Object[]{previouslyDeniedPostfix}, 1))).setPositiveButton(s4.b.permission_not_available_open_settings_option, new a(0, callback)).setNegativeButton(R.string.no, new a(1, callback)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.onesignal.core.internal.permissions.b
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    e.show$lambda$2(d.this, dialogInterface);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.onesignal.core.internal.permissions.c
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    e.show$lambda$3(E7.a.this, dialogInterface);
                }
            }).show();
        } catch (WindowManager.BadTokenException unused) {
            com.onesignal.debug.internal.logging.b.log(I4.c.ERROR, "Alert dialog for Android settings was skipped because the activity was unavailable to display it.");
            callback.onDecline();
        }
    }
}
