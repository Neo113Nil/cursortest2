package com.squareup.cash.moneybot.viewmodels.plugins;

import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NavigationCardViewModel {
    public final NavigationCardViewEvent$LaunchClientRoute action;
    public final UiAvatar avatar;
    public final String cta;

    public NavigationCardViewModel(UiAvatar uiAvatar, String str, NavigationCardViewEvent$LaunchClientRoute navigationCardViewEvent$LaunchClientRoute) {
        uiAvatar.getClass();
        this.avatar = uiAvatar;
        this.cta = str;
        this.action = navigationCardViewEvent$LaunchClientRoute;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationCardViewModel)) {
            return false;
        }
        NavigationCardViewModel navigationCardViewModel = (NavigationCardViewModel) obj;
        return Intrinsics.areEqual(this.avatar, navigationCardViewModel.avatar) && this.cta.equals(navigationCardViewModel.cta) && this.action.equals(navigationCardViewModel.action);
    }

    public final int hashCode() {
        return this.action.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.avatar.hashCode() * 31, 31, this.cta);
    }

    public final String toString() {
        return "NavigationCardViewModel(avatar=" + this.avatar + ", cta=" + this.cta + ", action=" + this.action + ")";
    }
}
