package com.gamericefishpro.space.vd;

import android.view.View;
import android.widget.PopupWindow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends PopupWindow {
    private final g listener;
    private Boolean wasDismissedManually;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view, int i, int i2, boolean z, g listener) {
        super(view, i, i2, z);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        this.listener.onDismiss(this.wasDismissedManually);
    }

    public final Boolean getWasDismissedManually() {
        return this.wasDismissedManually;
    }

    public final void setWasDismissedManually(Boolean bool) {
        this.wasDismissedManually = bool;
    }
}
