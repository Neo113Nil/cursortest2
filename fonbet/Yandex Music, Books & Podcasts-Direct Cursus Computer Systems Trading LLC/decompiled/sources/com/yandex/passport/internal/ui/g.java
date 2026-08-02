package com.yandex.passport.internal.ui;

import android.content.Context;
import android.view.WindowManager;
import com.yandex.passport.R;
import defpackage.gr0;

/* loaded from: classes4.dex */
public abstract class g {
    public static gr0 a(Context context) {
        gr0 gr0Var = new gr0(context, 0);
        gr0Var.setContentView(R.layout.passport_progress_dialog);
        gr0Var.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(gr0Var.getWindow().getAttributes());
        layoutParams.width = -1;
        gr0Var.show();
        gr0Var.getWindow().setAttributes(layoutParams);
        return gr0Var;
    }
}
