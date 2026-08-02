package app.cash.local.viewmodels;

import com.squareup.protos.cash.local.client.v1.LocalColor;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AppliedCouponBanner {
    public final LocalColor backgroundColor;
    public final String code;
    public final LocalColor foregroundColor;
    public final String label;

    public AppliedCouponBanner(String str, String str2, LocalColor localColor, LocalColor localColor2) {
        str.getClass();
        str2.getClass();
        this.label = str;
        this.code = str2;
        this.backgroundColor = localColor;
        this.foregroundColor = localColor2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppliedCouponBanner)) {
            return false;
        }
        AppliedCouponBanner appliedCouponBanner = (AppliedCouponBanner) obj;
        return Intrinsics.areEqual(this.label, appliedCouponBanner.label) && Intrinsics.areEqual(this.code, appliedCouponBanner.code) && Intrinsics.areEqual(this.backgroundColor, appliedCouponBanner.backgroundColor) && Intrinsics.areEqual(this.foregroundColor, appliedCouponBanner.foregroundColor);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.code);
        LocalColor localColor = this.backgroundColor;
        int hashCode = (m + (localColor == null ? 0 : localColor.hashCode())) * 31;
        LocalColor localColor2 = this.foregroundColor;
        return hashCode + (localColor2 != null ? localColor2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AppliedCouponBanner(label=", this.label, ", code=", this.code, ", backgroundColor=");
        m.append(this.backgroundColor);
        m.append(", foregroundColor=");
        m.append(this.foregroundColor);
        m.append(")");
        return m.toString();
    }
}
