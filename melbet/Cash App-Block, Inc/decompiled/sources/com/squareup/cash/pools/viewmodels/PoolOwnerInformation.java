package com.squareup.cash.pools.viewmodels;

import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PoolOwnerInformation {
    public final Color accentColor;
    public final String monogram;
    public final Image photoImage;
    public final String subtitle;
    public final String title;

    public PoolOwnerInformation(String str, String str2, String str3, Image image, Color color) {
        str.getClass();
        this.title = str;
        this.subtitle = str2;
        this.monogram = str3;
        this.photoImage = image;
        this.accentColor = color;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoolOwnerInformation)) {
            return false;
        }
        PoolOwnerInformation poolOwnerInformation = (PoolOwnerInformation) obj;
        return Intrinsics.areEqual(this.title, poolOwnerInformation.title) && this.subtitle.equals(poolOwnerInformation.subtitle) && this.monogram.equals(poolOwnerInformation.monogram) && Intrinsics.areEqual(this.photoImage, poolOwnerInformation.photoImage) && this.accentColor.equals(poolOwnerInformation.accentColor);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.monogram);
        Image image = this.photoImage;
        return this.accentColor.hashCode() + ((m + (image == null ? 0 : image.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PoolOwnerInformation(title=", this.title, ", subtitle=", this.subtitle, ", monogram=");
        m.append(this.monogram);
        m.append(", photoImage=");
        m.append(this.photoImage);
        m.append(", accentColor=");
        m.append(this.accentColor);
        m.append(")");
        return m.toString();
    }
}
