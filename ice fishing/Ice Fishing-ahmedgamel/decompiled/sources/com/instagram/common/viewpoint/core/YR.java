package com.instagram.common.viewpoint.core;

import android.content.DialogInterface;
import android.widget.EditText;
import java.util.concurrent.Executor;

/* loaded from: assets/audience_network/classes2.dex */
public class YR implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C1183Pp A01;

    public YR(C1183Pp c1183Pp, EditText editText) {
        this.A01 = c1183Pp;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Executor executor;
        executor = this.A01.A03;
        executor.execute(new Q1(this, dialogInterface));
    }
}
