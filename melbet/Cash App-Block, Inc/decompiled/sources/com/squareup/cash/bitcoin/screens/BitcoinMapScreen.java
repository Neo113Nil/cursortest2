package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.screens.MainScreens;

/* loaded from: classes.dex */
public final class BitcoinMapScreen extends MainScreens {
    public static final Parcelable.Creator<BitcoinMapScreen> CREATOR = new BitcoinHome.Creator(20);
    public final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class Source {
        public static final /* synthetic */ Source[] $VALUES;
        public static final Source BITCOIN_APPLET_CARD;
        public static final Source BITCOIN_APPLET_HEADER;
        public static final Source BITCOIN_APPLET_ITEM;
        public static final Source CLIENT_ROUTE;

        static {
            Source source = new Source("BITCOIN_APPLET_CARD", 0);
            BITCOIN_APPLET_CARD = source;
            Source source2 = new Source("BITCOIN_APPLET_ITEM", 1);
            BITCOIN_APPLET_ITEM = source2;
            Source source3 = new Source("BITCOIN_APPLET_HEADER", 2);
            BITCOIN_APPLET_HEADER = source3;
            Source source4 = new Source("CLIENT_ROUTE", 3);
            CLIENT_ROUTE = source4;
            $VALUES = new Source[]{source, source2, source3, source4};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public BitcoinMapScreen(Source source) {
        super(1);
        this.source = source;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinMapScreen) && this.source == ((BitcoinMapScreen) obj).source;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        Source source = this.source;
        if (source == null) {
            return 0;
        }
        return source.hashCode();
    }

    public final String toString() {
        return "BitcoinMapScreen(source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Source source = this.source;
        if (source == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(source.name());
        }
    }
}
