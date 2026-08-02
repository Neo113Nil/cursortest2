package com.squareup.cash.qrcodes.viewmodels;

import android.graphics.Bitmap;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.data.profile.Badge;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class QrCodeProfileViewModel {
    public final Badge badge;
    public final String cashtag;
    public final CharSequence fullName;
    public final boolean loading;
    public final Bitmap qrImage;
    public final boolean shareEnabled;
    public final boolean showSegmentedControl;
    public final boolean showUpdatedSharingUi;

    public QrCodeProfileViewModel(boolean z, String str, Bitmap bitmap, boolean z2, CharSequence charSequence, Badge badge, boolean z3, boolean z4) {
        this.loading = z;
        this.cashtag = str;
        this.qrImage = bitmap;
        this.shareEnabled = z2;
        this.fullName = charSequence;
        this.badge = badge;
        this.showSegmentedControl = z3;
        this.showUpdatedSharingUi = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrCodeProfileViewModel)) {
            return false;
        }
        QrCodeProfileViewModel qrCodeProfileViewModel = (QrCodeProfileViewModel) obj;
        return this.loading == qrCodeProfileViewModel.loading && Intrinsics.areEqual(this.cashtag, qrCodeProfileViewModel.cashtag) && Intrinsics.areEqual(this.qrImage, qrCodeProfileViewModel.qrImage) && this.shareEnabled == qrCodeProfileViewModel.shareEnabled && Intrinsics.areEqual(this.fullName, qrCodeProfileViewModel.fullName) && this.badge == qrCodeProfileViewModel.badge && this.showSegmentedControl == qrCodeProfileViewModel.showSegmentedControl && this.showUpdatedSharingUi == qrCodeProfileViewModel.showUpdatedSharingUi;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.loading) * 31;
        String str = this.cashtag;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Bitmap bitmap = this.qrImage;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31, this.shareEnabled);
        CharSequence charSequence = this.fullName;
        int hashCode3 = (m + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Badge badge = this.badge;
        return Boolean.hashCode(this.showUpdatedSharingUi) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (badge != null ? badge.hashCode() : 0)) * 31, 31, this.showSegmentedControl);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("QrCodeProfileViewModel(loading=", ", cashtag=", this.cashtag, ", qrImage=", this.loading);
        m.append(this.qrImage);
        m.append(", shareEnabled=");
        m.append(this.shareEnabled);
        m.append(", fullName=");
        m.append((Object) this.fullName);
        m.append(", badge=");
        m.append(this.badge);
        m.append(", showSegmentedControl=");
        return Request$Priority$EnumUnboxingLocalUtility.m(m, this.showSegmentedControl, ", showUpdatedSharingUi=", this.showUpdatedSharingUi, ")");
    }
}
