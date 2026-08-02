package com.squareup.cash.common.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class AvatarViewModel {
    public final ColorModel accentColor;
    public final String actionUrl;
    public final String avatarMonogramSource;
    public final AvatarBadgeViewModel badge;
    public final boolean colorizeAvatar;
    public final String displayName;
    public final String email;
    public final boolean fillBackground;
    public final boolean isFavorite;
    public final boolean isSponsorAllowlisted;
    public final String lookupKey;
    public final Image photoImage;
    public final Integer photoRes;
    public final String sms;

    public /* synthetic */ AvatarViewModel(Image image, ColorModel.Accented accented, String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, AvatarBadgeViewModel avatarBadgeViewModel, String str6, boolean z3, boolean z4, int i) {
        this((Integer) null, image, accented, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, z, z2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : avatarBadgeViewModel, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? false : z3, (i & PKIFailureInfo.certRevoked) != 0 ? false : z4);
    }

    public static AvatarViewModel copy$default(AvatarViewModel avatarViewModel, String str, AvatarBadgeViewModel.IconToken iconToken, int i) {
        Integer num = avatarViewModel.photoRes;
        Image image = avatarViewModel.photoImage;
        ColorModel colorModel = avatarViewModel.accentColor;
        String str2 = (i & 8) != 0 ? avatarViewModel.displayName : str;
        return new AvatarViewModel(num, image, colorModel, str2, avatarViewModel.avatarMonogramSource, avatarViewModel.colorizeAvatar, (i & 64) != 0 ? avatarViewModel.fillBackground : true, avatarViewModel.lookupKey, avatarViewModel.email, avatarViewModel.sms, (i & 1024) != 0 ? avatarViewModel.badge : iconToken, avatarViewModel.actionUrl, avatarViewModel.isFavorite, avatarViewModel.isSponsorAllowlisted);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarViewModel)) {
            return false;
        }
        AvatarViewModel avatarViewModel = (AvatarViewModel) obj;
        return Intrinsics.areEqual(this.photoRes, avatarViewModel.photoRes) && Intrinsics.areEqual(this.photoImage, avatarViewModel.photoImage) && Intrinsics.areEqual(this.accentColor, avatarViewModel.accentColor) && Intrinsics.areEqual(this.displayName, avatarViewModel.displayName) && Intrinsics.areEqual(this.avatarMonogramSource, avatarViewModel.avatarMonogramSource) && this.colorizeAvatar == avatarViewModel.colorizeAvatar && this.fillBackground == avatarViewModel.fillBackground && Intrinsics.areEqual(this.lookupKey, avatarViewModel.lookupKey) && Intrinsics.areEqual(this.email, avatarViewModel.email) && Intrinsics.areEqual(this.sms, avatarViewModel.sms) && Intrinsics.areEqual(this.badge, avatarViewModel.badge) && Intrinsics.areEqual(this.actionUrl, avatarViewModel.actionUrl) && this.isFavorite == avatarViewModel.isFavorite && this.isSponsorAllowlisted == avatarViewModel.isSponsorAllowlisted;
    }

    public final int hashCode() {
        Integer num = this.photoRes;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Image image = this.photoImage;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        ColorModel colorModel = this.accentColor;
        int hashCode3 = (hashCode2 + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        String str = this.displayName;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatarMonogramSource;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.colorizeAvatar), 31, this.fillBackground);
        String str3 = this.lookupKey;
        int hashCode5 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sms;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AvatarBadgeViewModel avatarBadgeViewModel = this.badge;
        int hashCode8 = (hashCode7 + (avatarBadgeViewModel == null ? 0 : avatarBadgeViewModel.hashCode())) * 31;
        String str6 = this.actionUrl;
        return Boolean.hashCode(false) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.isFavorite), 31, this.isSponsorAllowlisted);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvatarViewModel(photoRes=");
        sb.append(this.photoRes);
        sb.append(", photoImage=");
        sb.append(this.photoImage);
        sb.append(", accentColor=");
        sb.append(this.accentColor);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", avatarMonogramSource=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.avatarMonogramSource, ", colorizeAvatar=", this.colorizeAvatar, ", fillBackground=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.fillBackground, ", lookupKey=", this.lookupKey, ", email=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.email, ", sms=", this.sms, ", badge=");
        sb.append(this.badge);
        sb.append(", actionUrl=");
        sb.append(this.actionUrl);
        sb.append(", isFavorite=");
        return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.isFavorite, ", isSponsorAllowlisted=", this.isSponsorAllowlisted, ", isRoundedRectangle=false)");
    }

    public AvatarViewModel(Integer num, Image image, ColorModel colorModel, String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, AvatarBadgeViewModel avatarBadgeViewModel, String str6, boolean z3, boolean z4) {
        this.photoRes = num;
        this.photoImage = image;
        this.accentColor = colorModel;
        this.displayName = str;
        this.avatarMonogramSource = str2;
        this.colorizeAvatar = z;
        this.fillBackground = z2;
        this.lookupKey = str3;
        this.email = str4;
        this.sms = str5;
        this.badge = avatarBadgeViewModel;
        this.actionUrl = str6;
        this.isFavorite = z3;
        this.isSponsorAllowlisted = z4;
    }
}
