package com.squareup.cash.savings.viewmodels;

import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class HeroNumericsBodyTextViewModel {
    public final String accessibilityHint;
    public final Icon icon;
    public final String markdownText;
    public final String text;
    public final ColorModel tint;

    public HeroNumericsBodyTextViewModel(String str, String str2, Icon icon, ColorModel.Accented accented, String str3) {
        this.text = str;
        this.markdownText = str2;
        this.icon = icon;
        this.tint = accented;
        this.accessibilityHint = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeroNumericsBodyTextViewModel)) {
            return false;
        }
        HeroNumericsBodyTextViewModel heroNumericsBodyTextViewModel = (HeroNumericsBodyTextViewModel) obj;
        return this.text.equals(heroNumericsBodyTextViewModel.text) && Intrinsics.areEqual(this.markdownText, heroNumericsBodyTextViewModel.markdownText) && Intrinsics.areEqual(this.icon, heroNumericsBodyTextViewModel.icon) && Intrinsics.areEqual(this.tint, heroNumericsBodyTextViewModel.tint) && Intrinsics.areEqual(this.accessibilityHint, heroNumericsBodyTextViewModel.accessibilityHint);
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.markdownText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Icon icon = this.icon;
        int hashCode3 = (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        ColorModel colorModel = this.tint;
        int hashCode4 = (hashCode3 + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        String str2 = this.accessibilityHint;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HeroNumericsBodyTextViewModel(text=", this.text, ", markdownText=", this.markdownText, ", icon=");
        m.append(this.icon);
        m.append(", tint=");
        m.append(this.tint);
        m.append(", accessibilityHint=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.accessibilityHint, ")");
    }
}
