package com.squareup.cash.offers.viewmodels.itemviewmodels;

import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.ui.Avatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LegacyOffersAvatarViewModel {
    public final Color backgroundColor;
    public final boolean colorizeImage;
    public final String darkImageUrl;
    public final String lightImageUrl;
    public final Character monogram;
    public final Avatar.Shape shape;

    public /* synthetic */ LegacyOffersAvatarViewModel(String str, String str2, Character ch, Color color, Avatar.Shape shape, int i) {
        this(str, str2, ch, (i & 8) != 0 ? null : color, false, (i & 32) != 0 ? Avatar.Shape.CIRCLE : shape);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyOffersAvatarViewModel)) {
            return false;
        }
        LegacyOffersAvatarViewModel legacyOffersAvatarViewModel = (LegacyOffersAvatarViewModel) obj;
        return Intrinsics.areEqual(this.lightImageUrl, legacyOffersAvatarViewModel.lightImageUrl) && Intrinsics.areEqual(this.darkImageUrl, legacyOffersAvatarViewModel.darkImageUrl) && Intrinsics.areEqual(this.monogram, legacyOffersAvatarViewModel.monogram) && Intrinsics.areEqual(this.backgroundColor, legacyOffersAvatarViewModel.backgroundColor) && this.colorizeImage == legacyOffersAvatarViewModel.colorizeImage && this.shape == legacyOffersAvatarViewModel.shape;
    }

    public final int hashCode() {
        String str = this.lightImageUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.darkImageUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Character ch = this.monogram;
        int hashCode3 = (hashCode2 + (ch == null ? 0 : ch.hashCode())) * 31;
        Color color = this.backgroundColor;
        return this.shape.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (color != null ? color.hashCode() : 0)) * 31, 31, this.colorizeImage);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LegacyOffersAvatarViewModel(lightImageUrl=", this.lightImageUrl, ", darkImageUrl=", this.darkImageUrl, ", monogram=");
        m.append(this.monogram);
        m.append(", backgroundColor=");
        m.append(this.backgroundColor);
        m.append(", colorizeImage=");
        m.append(this.colorizeImage);
        m.append(", shape=");
        m.append(this.shape);
        m.append(")");
        return m.toString();
    }

    public LegacyOffersAvatarViewModel(String str, String str2, Character ch, Color color, boolean z, Avatar.Shape shape) {
        shape.getClass();
        this.lightImageUrl = str;
        this.darkImageUrl = str2;
        this.monogram = ch;
        this.backgroundColor = color;
        this.colorizeImage = z;
        this.shape = shape;
    }
}
