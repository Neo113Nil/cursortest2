package com.squareup.cash.common.composeui;

import com.squareup.cash.ui.CashInsets;

/* loaded from: classes.dex */
public final class CashComposeInsets {
    public final CashWindowInsets cashFloatingBottomNavigation;
    public final CashWindowInsets cashInlineBottomNavigation;
    public final CashWindowInsets floatingBottomNavigation;
    public final CashWindowInsets inlineBottomNavigation;

    public CashComposeInsets() {
        CashWindowInsets cashWindowInsets = new CashWindowInsets(CashInsets.Type.FloatingBottomNavigation);
        this.cashFloatingBottomNavigation = cashWindowInsets;
        CashWindowInsets cashWindowInsets2 = new CashWindowInsets(CashInsets.Type.InlineBottomNavigation);
        this.cashInlineBottomNavigation = cashWindowInsets2;
        this.floatingBottomNavigation = cashWindowInsets;
        this.inlineBottomNavigation = cashWindowInsets2;
    }
}
