package com.google.android.gms.common.api.internal;

import android.app.AlertDialog;
import android.app.Dialog;

/* loaded from: classes4.dex */
public final class zan extends zabr {
    public final /* synthetic */ Dialog zaa;
    public final /* synthetic */ zao zab;

    public zan(zao zaoVar, AlertDialog alertDialog) {
        this.zaa = alertDialog;
        this.zab = zaoVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void zaa() {
        zap zapVar = (zap) this.zab.zaa;
        zapVar.zab.set(null);
        zapVar.zae();
        Dialog dialog = this.zaa;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
