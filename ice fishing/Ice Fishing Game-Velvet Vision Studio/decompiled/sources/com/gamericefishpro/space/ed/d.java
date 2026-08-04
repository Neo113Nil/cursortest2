package com.gamericefishpro.space.ed;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.WindowManager;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d INSTANCE = new d();

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$0(c callback, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.onAccept();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$1(c callback, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.onDecline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$2(c callback, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.onDecline();
    }

    public final void show(Activity activity, String titlePrefix, String previouslyDeniedPostfix, final c callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(titlePrefix, "titlePrefix");
        Intrinsics.checkNotNullParameter(previouslyDeniedPostfix, "previouslyDeniedPostfix");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String string = activity.getString(com.gamericefishpro.space.jc.b.permission_not_available_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = String.format(string, Arrays.copyOf(new Object[]{titlePrefix}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String string2 = activity.getString(com.gamericefishpro.space.jc.b.permission_not_available_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String str2 = String.format(string2, Arrays.copyOf(new Object[]{previouslyDeniedPostfix}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        try {
            new AlertDialog.Builder(activity).setTitle(str).setMessage(str2).setPositiveButton(com.gamericefishpro.space.jc.b.permission_not_available_open_settings_option, new a(0, callback)).setNegativeButton(R.string.no, new a(1, callback)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.gamericefishpro.space.ed.b
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    d.show$lambda$2(callback, dialogInterface);
                }
            }).show();
        } catch (WindowManager.BadTokenException unused) {
            com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Alert dialog for Android settings was skipped because the activity was unavailable to display it.");
            callback.onDecline();
        }
    }
}
