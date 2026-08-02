package com.squareup.cash.earningstracker.viewmodels;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.common.viewmodels.ColorModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AvatarViewModel {
    public final ColorModel backgroundColor;
    public final Character monogram;
    public final String photoUrl;

    public AvatarViewModel(String str, Character ch, ColorModel.Accented accented) {
        this.photoUrl = str;
        this.monogram = ch;
        this.backgroundColor = accented;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarViewModel)) {
            return false;
        }
        AvatarViewModel avatarViewModel = (AvatarViewModel) obj;
        return Intrinsics.areEqual(this.photoUrl, avatarViewModel.photoUrl) && Intrinsics.areEqual(this.monogram, avatarViewModel.monogram) && Intrinsics.areEqual(this.backgroundColor, avatarViewModel.backgroundColor);
    }

    public final int hashCode() {
        String str = this.photoUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Character ch = this.monogram;
        int hashCode2 = (hashCode + (ch == null ? 0 : ch.hashCode())) * 31;
        ColorModel colorModel = this.backgroundColor;
        return hashCode2 + (colorModel != null ? colorModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvatarViewModel(photoUrl=");
        sb.append(this.photoUrl);
        sb.append(", monogram=");
        sb.append(this.monogram);
        sb.append(", backgroundColor=");
        return SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.backgroundColor, ")");
    }
}
