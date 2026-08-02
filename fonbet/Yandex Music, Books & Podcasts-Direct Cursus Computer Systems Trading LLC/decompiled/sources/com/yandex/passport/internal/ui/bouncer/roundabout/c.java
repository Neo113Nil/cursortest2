package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.app.Activity;
import com.yandex.passport.R;
import defpackage.o30;
import defpackage.p30;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class c {
    public final Activity a;
    public final com.yandex.passport.internal.ui.bouncer.s b;

    public c(Activity activity, com.yandex.passport.internal.ui.bouncer.s sVar) {
        activity.getClass();
        sVar.getClass();
        this.a = activity;
        this.b = sVar;
    }

    public final void a(com.yandex.passport.internal.l lVar, String str) {
        String string;
        lVar.getClass();
        Activity activity = this.a;
        activity.getClass();
        o30 o30Var = new o30(activity);
        o30Var.b(R.string.passport_delete_account_dialog_title);
        if (str != null) {
            string = String.format(str, Arrays.copyOf(new Object[]{lVar.i()}, 1));
        } else {
            string = activity.getString(R.string.passport_delete_account_dialog_text, lVar.i());
            string.getClass();
        }
        o30Var.a.f = string;
        o30Var.setPositiveButton(R.string.passport_delete_account_dialog_delete_button, new b(this, lVar));
        o30Var.setNegativeButton(R.string.passport_delete_account_dialog_cancel_button, new a());
        p30 create = o30Var.create();
        create.getClass();
        create.show();
    }
}
