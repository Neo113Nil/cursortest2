package app.cash.local.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CouponSection {
    public final List appliedCoupons;
    public final String errorMessage;
    public final String inputPlaceholder;

    public CouponSection(List list, String str, String str2) {
        list.getClass();
        str.getClass();
        this.appliedCoupons = list;
        this.inputPlaceholder = str;
        this.errorMessage = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponSection)) {
            return false;
        }
        CouponSection couponSection = (CouponSection) obj;
        return Intrinsics.areEqual(this.appliedCoupons, couponSection.appliedCoupons) && Intrinsics.areEqual(this.inputPlaceholder, couponSection.inputPlaceholder) && Intrinsics.areEqual(this.errorMessage, couponSection.errorMessage);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.appliedCoupons.hashCode() * 31, 31, this.inputPlaceholder);
        String str = this.errorMessage;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m("CouponSection(appliedCoupons=", ", inputPlaceholder=", this.inputPlaceholder, ", errorMessage=", this.appliedCoupons), this.errorMessage, ")");
    }
}
