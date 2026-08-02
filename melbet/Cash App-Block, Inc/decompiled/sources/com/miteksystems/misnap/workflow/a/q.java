package com.miteksystems.misnap.workflow.a;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.view.Window;

/* loaded from: classes4.dex */
public final class q extends AlertDialog {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, int i) {
        super(context);
        context.getClass();
        if (i != 0) {
            setView(getLayoutInflater().inflate(i, (ViewGroup) null));
        }
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }
}
