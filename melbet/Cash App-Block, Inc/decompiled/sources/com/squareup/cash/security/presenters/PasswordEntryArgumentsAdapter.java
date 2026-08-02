package com.squareup.cash.security.presenters;

import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.security.screens.PasswordScreenData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PasswordEntryArgumentsAdapter {
    public final PasswordScreenData passwordScreenData;
    public final BlockersScreens screen;

    public PasswordEntryArgumentsAdapter(BlockersScreens blockersScreens, PasswordScreenData passwordScreenData) {
        blockersScreens.getClass();
        passwordScreenData.getClass();
        this.screen = blockersScreens;
        this.passwordScreenData = passwordScreenData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasswordEntryArgumentsAdapter)) {
            return false;
        }
        PasswordEntryArgumentsAdapter passwordEntryArgumentsAdapter = (PasswordEntryArgumentsAdapter) obj;
        return Intrinsics.areEqual(this.screen, passwordEntryArgumentsAdapter.screen) && Intrinsics.areEqual(this.passwordScreenData, passwordEntryArgumentsAdapter.passwordScreenData);
    }

    public final int hashCode() {
        return this.passwordScreenData.hashCode() + (this.screen.hashCode() * 31);
    }

    public final String toString() {
        return "PasswordEntryArgumentsAdapter(screen=" + this.screen + ", passwordScreenData=" + this.passwordScreenData + ")";
    }
}
