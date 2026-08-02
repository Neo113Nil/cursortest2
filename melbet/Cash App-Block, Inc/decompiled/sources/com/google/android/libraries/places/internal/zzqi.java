package com.google.android.libraries.places.internal;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public final class zzqi extends Dialog {
    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.no_gmm_or_browser_dialog);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setFlags(2, 2);
            window.setDimAmount(0.6f);
        }
        ((Button) findViewById(R.id.no_browser_error_ok)).setOnClickListener(new zzpz(this, 6));
    }
}
