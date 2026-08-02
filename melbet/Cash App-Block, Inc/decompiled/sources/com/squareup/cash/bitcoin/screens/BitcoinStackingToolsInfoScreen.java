package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.bitcoin.screens.BitcoinHome;

/* loaded from: classes.dex */
public final class BitcoinStackingToolsInfoScreen implements Screen {
    public static final Parcelable.Creator<BitcoinStackingToolsInfoScreen> CREATOR = new BitcoinHome.Creator(29);

    /* renamed from: type, reason: collision with root package name */
    public final Type f1052type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class Type {
        public static final /* synthetic */ Type[] $VALUES;
        public static final Type AUTO_INVEST;
        public static final Type LEARN_MORE;
        public static final Type PAID_IN_BITCOIN;
        public static final Type RECEIVE_P2P_AS_BITCOIN;
        public static final Type ROUND_UPS;

        static {
            Type type2 = new Type("ROUND_UPS", 0);
            ROUND_UPS = type2;
            Type type3 = new Type("PAID_IN_BITCOIN", 1);
            PAID_IN_BITCOIN = type3;
            Type type4 = new Type("AUTO_INVEST", 2);
            AUTO_INVEST = type4;
            Type type5 = new Type("LEARN_MORE", 3);
            LEARN_MORE = type5;
            Type type6 = new Type("RECEIVE_P2P_AS_BITCOIN", 4);
            RECEIVE_P2P_AS_BITCOIN = type6;
            $VALUES = new Type[]{type2, type3, type4, type5, type6};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public BitcoinStackingToolsInfoScreen(Type type2) {
        type2.getClass();
        this.f1052type = type2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinStackingToolsInfoScreen) && this.f1052type == ((BitcoinStackingToolsInfoScreen) obj).f1052type;
    }

    public final int hashCode() {
        return this.f1052type.hashCode();
    }

    public final String toString() {
        return "BitcoinStackingToolsInfoScreen(type=" + this.f1052type + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f1052type.name());
    }
}
