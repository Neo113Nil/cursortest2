package app.cash.local.viewmodels.pos;

import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalPosLocalCashRedemptionViewModel {
    public final LocalColor brandBackgroundColor;
    public final LocalColor brandForegroundColor;
    public final LocalImage brandImage;
    public final boolean canUnlink;
    public final ArrayList coupons;
    public final String localCashAmount;

    public final class Coupon {
        public final String code;
        public final LocalImage image;
        public final String title;

        public Coupon(LocalImage localImage, String str, String str2) {
            this.image = localImage;
            this.title = str;
            this.code = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Coupon)) {
                return false;
            }
            Coupon coupon = (Coupon) obj;
            return Intrinsics.areEqual(this.image, coupon.image) && Intrinsics.areEqual(this.title, coupon.title) && Intrinsics.areEqual(this.code, coupon.code);
        }

        public final int hashCode() {
            LocalImage localImage = this.image;
            int hashCode = (localImage == null ? 0 : localImage.hashCode()) * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.code;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Coupon(image=");
            sb.append(this.image);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", code=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.code, ")");
        }
    }

    public LocalPosLocalCashRedemptionViewModel(boolean z, LocalImage localImage, LocalColor localColor, LocalColor localColor2, String str, ArrayList arrayList) {
        this.canUnlink = z;
        this.brandImage = localImage;
        this.brandForegroundColor = localColor;
        this.brandBackgroundColor = localColor2;
        this.localCashAmount = str;
        this.coupons = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalPosLocalCashRedemptionViewModel)) {
            return false;
        }
        LocalPosLocalCashRedemptionViewModel localPosLocalCashRedemptionViewModel = (LocalPosLocalCashRedemptionViewModel) obj;
        return this.canUnlink == localPosLocalCashRedemptionViewModel.canUnlink && Intrinsics.areEqual(this.brandImage, localPosLocalCashRedemptionViewModel.brandImage) && Intrinsics.areEqual(this.brandForegroundColor, localPosLocalCashRedemptionViewModel.brandForegroundColor) && Intrinsics.areEqual(this.brandBackgroundColor, localPosLocalCashRedemptionViewModel.brandBackgroundColor) && this.localCashAmount.equals(localPosLocalCashRedemptionViewModel.localCashAmount) && this.coupons.equals(localPosLocalCashRedemptionViewModel.coupons);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.canUnlink) * 31;
        LocalImage localImage = this.brandImage;
        int hashCode2 = (hashCode + (localImage == null ? 0 : localImage.hashCode())) * 31;
        LocalColor localColor = this.brandForegroundColor;
        int hashCode3 = (hashCode2 + (localColor == null ? 0 : localColor.hashCode())) * 31;
        LocalColor localColor2 = this.brandBackgroundColor;
        return this.coupons.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (localColor2 != null ? localColor2.hashCode() : 0)) * 31, 31, this.localCashAmount);
    }

    public final String toString() {
        return "LocalPosLocalCashRedemptionViewModel(canUnlink=" + this.canUnlink + ", brandImage=" + this.brandImage + ", brandForegroundColor=" + this.brandForegroundColor + ", brandBackgroundColor=" + this.brandBackgroundColor + ", localCashAmount=" + this.localCashAmount + ", coupons=" + this.coupons + ")";
    }
}
