package com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.ui.UiAvatar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NavigationCard$Icon$Avatar {
    public final UiAvatar avatar;

    public NavigationCard$Icon$Avatar(UiAvatar uiAvatar) {
        uiAvatar.getClass();
        this.avatar = uiAvatar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NavigationCard$Icon$Avatar) && Intrinsics.areEqual(this.avatar, ((NavigationCard$Icon$Avatar) obj).avatar);
    }

    public final int hashCode() {
        return this.avatar.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.avatar, "Avatar(avatar=", ")");
    }
}
