package com.gamericefishpro.space.m;

import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements PopupWindow.OnDismissListener {
    public final /* synthetic */ m d;

    public l(m mVar) {
        this.d = mVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.d.c();
    }
}
