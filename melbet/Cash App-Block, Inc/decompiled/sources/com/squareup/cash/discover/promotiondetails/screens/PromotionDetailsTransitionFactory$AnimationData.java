package com.squareup.cash.discover.promotiondetails.screens;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PromotionDetailsTransitionFactory$AnimationData implements Parcelable {
    public static final Parcelable.Creator<PromotionDetailsTransitionFactory$AnimationData> CREATOR = new AddPayerCustomersScreen.Creator(1);
    public final String id;
    public final double screenFillPercent;
    public final Rect viewBounds;

    public PromotionDetailsTransitionFactory$AnimationData(String str, Rect rect, double d) {
        str.getClass();
        rect.getClass();
        this.id = str;
        this.viewBounds = rect;
        this.screenFillPercent = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionDetailsTransitionFactory$AnimationData)) {
            return false;
        }
        PromotionDetailsTransitionFactory$AnimationData promotionDetailsTransitionFactory$AnimationData = (PromotionDetailsTransitionFactory$AnimationData) obj;
        return Intrinsics.areEqual(this.id, promotionDetailsTransitionFactory$AnimationData.id) && Intrinsics.areEqual(this.viewBounds, promotionDetailsTransitionFactory$AnimationData.viewBounds) && Double.compare(this.screenFillPercent, promotionDetailsTransitionFactory$AnimationData.screenFillPercent) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.screenFillPercent) + ((this.viewBounds.hashCode() + (this.id.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationData(id=");
        sb.append(this.id);
        sb.append(", viewBounds=");
        sb.append(this.viewBounds);
        sb.append(", screenFillPercent=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.screenFillPercent, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeParcelable(this.viewBounds, i);
        parcel.writeDouble(this.screenFillPercent);
    }
}
