package com.squareup.cash.registeralias.presenters.api;

import androidx.core.provider.FontsContractCompat;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.screens.BlockersScreens;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation extends FontsContractCompat {
    public final BlockersScreens.BlockersDialogScreens nextScreen;
    public final boolean stopLoadingFirst;

    public RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation(BlockersScreens.BlockersDialogScreens blockersDialogScreens, boolean z) {
        this.nextScreen = blockersDialogScreens;
        this.stopLoadingFirst = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation)) {
            return false;
        }
        RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation registerAliasResultHandler$RegisterAliasHandlingOutcome$Navigation = (RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation) obj;
        return Intrinsics.areEqual(this.nextScreen, registerAliasResultHandler$RegisterAliasHandlingOutcome$Navigation.nextScreen) && this.stopLoadingFirst == registerAliasResultHandler$RegisterAliasHandlingOutcome$Navigation.stopLoadingFirst;
    }

    public final Screen getNextScreen() {
        return this.nextScreen;
    }

    public final boolean getStopLoadingFirst() {
        return this.stopLoadingFirst;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.stopLoadingFirst) + (this.nextScreen.hashCode() * 31);
    }

    public final String toString() {
        return "Navigation(nextScreen=" + this.nextScreen + ", stopLoadingFirst=" + this.stopLoadingFirst + ")";
    }

    public /* synthetic */ RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation(BlockersScreens.BlockersDialogScreens blockersDialogScreens) {
        this(blockersDialogScreens, false);
    }
}
