package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.limits.screens.LimitsScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class HomeSourceContext implements Parcelable {
    public static final Parcelable.Creator<HomeSourceContext> CREATOR = new LimitsScreen.Creator(27);
    public final String itemId;
    public final HomeItemType itemType;
    public final String sessionId;

    public /* synthetic */ HomeSourceContext(String str, int i) {
        this(str, (i & 2) != 0 ? null : HomeItemType.WIDGET, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeSourceContext)) {
            return false;
        }
        HomeSourceContext homeSourceContext = (HomeSourceContext) obj;
        return Intrinsics.areEqual(this.sessionId, homeSourceContext.sessionId) && this.itemType == homeSourceContext.itemType && Intrinsics.areEqual(this.itemId, homeSourceContext.itemId);
    }

    public final int hashCode() {
        String str = this.sessionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        HomeItemType homeItemType = this.itemType;
        int hashCode2 = (hashCode + (homeItemType == null ? 0 : homeItemType.hashCode())) * 31;
        String str2 = this.itemId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeSourceContext(sessionId=");
        sb.append(this.sessionId);
        sb.append(", itemType=");
        sb.append(this.itemType);
        sb.append(", itemId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.itemId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.sessionId);
        HomeItemType homeItemType = this.itemType;
        if (homeItemType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(homeItemType.name());
        }
        parcel.writeString(this.itemId);
    }

    public HomeSourceContext(String str, HomeItemType homeItemType, String str2) {
        this.sessionId = str;
        this.itemType = homeItemType;
        this.itemId = str2;
    }
}
