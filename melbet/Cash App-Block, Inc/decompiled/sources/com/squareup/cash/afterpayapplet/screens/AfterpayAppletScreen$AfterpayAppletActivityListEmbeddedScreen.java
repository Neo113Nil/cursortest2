package com.squareup.cash.afterpayapplet.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.screens.ActivityScreen;

/* loaded from: classes.dex */
public final class AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen implements Screen {
    public static final Parcelable.Creator<AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen> CREATOR = new ActivityScreen.Creator(9);
    public final OrderActivityType orderActivityType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class OrderActivityType {
        public static final /* synthetic */ OrderActivityType[] $VALUES;
        public static final OrderActivityType COMPLETED;
        public static final OrderActivityType UPCOMING;

        static {
            OrderActivityType orderActivityType = new OrderActivityType("UPCOMING", 0);
            UPCOMING = orderActivityType;
            OrderActivityType orderActivityType2 = new OrderActivityType("COMPLETED", 1);
            COMPLETED = orderActivityType2;
            $VALUES = new OrderActivityType[]{orderActivityType, orderActivityType2};
        }

        public static OrderActivityType valueOf(String str) {
            return (OrderActivityType) Enum.valueOf(OrderActivityType.class, str);
        }

        public static OrderActivityType[] values() {
            return (OrderActivityType[]) $VALUES.clone();
        }
    }

    public AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen(OrderActivityType orderActivityType) {
        orderActivityType.getClass();
        this.orderActivityType = orderActivityType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen) && this.orderActivityType == ((AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen) obj).orderActivityType;
    }

    public final int hashCode() {
        return this.orderActivityType.hashCode();
    }

    public final String toString() {
        return "AfterpayAppletActivityListEmbeddedScreen(orderActivityType=" + this.orderActivityType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.orderActivityType.name());
    }
}
