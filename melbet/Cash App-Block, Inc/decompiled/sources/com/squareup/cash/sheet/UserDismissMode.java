package com.squareup.cash.sheet;

/* loaded from: classes6.dex */
public enum UserDismissMode {
    All(true, true, true),
    OutsideTapOnly(true, false, false),
    DragOnly(false, true, true),
    DragNoDismiss(false, true, false),
    None(false, false, false);

    public final boolean dragDismiss;
    public final boolean dragEnabled;
    public final boolean tapOutsideDismiss;

    UserDismissMode(boolean z, boolean z2, boolean z3) {
        this.tapOutsideDismiss = z;
        this.dragEnabled = z2;
        this.dragDismiss = z3;
    }
}
