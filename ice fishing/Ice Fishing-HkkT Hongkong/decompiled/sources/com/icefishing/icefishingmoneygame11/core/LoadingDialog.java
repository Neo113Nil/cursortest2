package com.icefishing.icefishingmoneygame11.core;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class LoadingDialog extends Dialog {
    public LoadingDialog(Activity activity) {
        super(activity);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        requestWindowFeature(1);
        setContentView(com.icefishing.icefishingmoneygame11.R.layout.dialog_loading);
        setCancelable(false);
    }
}
