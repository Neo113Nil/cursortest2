package com.yandex.passport.internal.util;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements DialogInterface.OnKeyListener {
    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        dialogInterface.dismiss();
        return false;
    }
}
