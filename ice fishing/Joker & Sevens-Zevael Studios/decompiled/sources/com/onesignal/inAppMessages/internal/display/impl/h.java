package com.onesignal.inAppMessages.internal.display.impl;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends PopupWindow {
    private final g listener;
    private Boolean wasDismissedManually;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view, int i10, int i11, boolean z10, g gVar) {
        super(view, i10, i11, z10);
        pc.j.e(gVar, "listener");
        this.listener = gVar;
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
