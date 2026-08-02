package com.squareup.cash.family.applets.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AllowanceAppletTileViewEvent$AllowanceAppletOnClickTile {
    public final String url;

    public AllowanceAppletTileViewEvent$AllowanceAppletOnClickTile(String str) {
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AllowanceAppletTileViewEvent$AllowanceAppletOnClickTile) && Intrinsics.areEqual(this.url, ((AllowanceAppletTileViewEvent$AllowanceAppletOnClickTile) obj).url);
    }

    public final int hashCode() {
        String str = this.url;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AllowanceAppletOnClickTile(url=", this.url, ")");
    }
}
