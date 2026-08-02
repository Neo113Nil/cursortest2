package com.squareup.cash.appmessages;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AppMessageImage$Animated$Asset$Url {
    public final Image asset;

    public AppMessageImage$Animated$Asset$Url(Image image) {
        image.getClass();
        this.asset = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppMessageImage$Animated$Asset$Url) && Intrinsics.areEqual(this.asset, ((AppMessageImage$Animated$Asset$Url) obj).asset);
    }

    public final int hashCode() {
        return this.asset.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.asset, "Url(asset=", ")");
    }
}
