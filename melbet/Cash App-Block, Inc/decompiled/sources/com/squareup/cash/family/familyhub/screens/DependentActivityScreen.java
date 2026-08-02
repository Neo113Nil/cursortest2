package com.squareup.cash.family.familyhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DependentActivityScreen implements Screen {
    public static final Parcelable.Creator<DependentActivityScreen> CREATOR = new AddPayerCustomersScreen.Creator(27);
    public final ActivityType activityType;
    public final String dependentCustomerToken;
    public final boolean forManagedAccount;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class ActivityType {
        public static final /* synthetic */ ActivityType[] $VALUES;
        public static final ActivityType ALL_ACTIVITIES;
        public static final ActivityType BITCOIN;
        public static final ActivityType INVESTING;

        static {
            ActivityType activityType = new ActivityType("ALL_ACTIVITIES", 0);
            ALL_ACTIVITIES = activityType;
            ActivityType activityType2 = new ActivityType("SAVINGS_ACTIVITIES", 1);
            ActivityType activityType3 = new ActivityType("BITCOIN", 2);
            BITCOIN = activityType3;
            ActivityType activityType4 = new ActivityType("INVESTING", 3);
            INVESTING = activityType4;
            $VALUES = new ActivityType[]{activityType, activityType2, activityType3, activityType4};
        }

        public static ActivityType valueOf(String str) {
            return (ActivityType) Enum.valueOf(ActivityType.class, str);
        }

        public static ActivityType[] values() {
            return (ActivityType[]) $VALUES.clone();
        }
    }

    public DependentActivityScreen(ActivityType activityType, String str, boolean z) {
        activityType.getClass();
        str.getClass();
        this.activityType = activityType;
        this.dependentCustomerToken = str;
        this.forManagedAccount = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentActivityScreen)) {
            return false;
        }
        DependentActivityScreen dependentActivityScreen = (DependentActivityScreen) obj;
        return this.activityType == dependentActivityScreen.activityType && Intrinsics.areEqual(this.dependentCustomerToken, dependentActivityScreen.dependentCustomerToken) && this.forManagedAccount == dependentActivityScreen.forManagedAccount;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.forManagedAccount) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.activityType.hashCode() * 31, 31, this.dependentCustomerToken);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DependentActivityScreen(activityType=");
        sb.append(this.activityType);
        sb.append(", dependentCustomerToken=");
        sb.append(this.dependentCustomerToken);
        sb.append(", forManagedAccount=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.forManagedAccount, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.activityType.name());
        parcel.writeString(this.dependentCustomerToken);
        parcel.writeInt(this.forManagedAccount ? 1 : 0);
    }
}
