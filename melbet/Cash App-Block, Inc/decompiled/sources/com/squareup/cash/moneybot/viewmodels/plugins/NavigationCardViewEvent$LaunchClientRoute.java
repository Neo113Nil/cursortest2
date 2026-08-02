package com.squareup.cash.moneybot.viewmodels.plugins;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NavigationCardViewEvent$LaunchClientRoute {
    public final String clientRoute;
    public final String requestId;

    public NavigationCardViewEvent$LaunchClientRoute(String str, String str2) {
        str2.getClass();
        this.requestId = str;
        this.clientRoute = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationCardViewEvent$LaunchClientRoute)) {
            return false;
        }
        NavigationCardViewEvent$LaunchClientRoute navigationCardViewEvent$LaunchClientRoute = (NavigationCardViewEvent$LaunchClientRoute) obj;
        return Intrinsics.areEqual(this.requestId, navigationCardViewEvent$LaunchClientRoute.requestId) && Intrinsics.areEqual(this.clientRoute, navigationCardViewEvent$LaunchClientRoute.clientRoute);
    }

    public final int hashCode() {
        String str = this.requestId;
        return this.clientRoute.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("LaunchClientRoute(requestId=", this.requestId, ", clientRoute=", this.clientRoute, ")");
    }
}
