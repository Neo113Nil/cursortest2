package com.squareup.cash.securityhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.screens.BoostDetailsScreen;

/* loaded from: classes.dex */
public final class SecurityHubScreen implements Screen {
    public static final Parcelable.Creator<SecurityHubScreen> CREATOR = new BoostDetailsScreen.Creator(24);
    public final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Source implements Parcelable {
        public static final /* synthetic */ Source[] $VALUES;
        public static final Parcelable.Creator<Source> CREATOR;
        public static final Source SETTINGS;

        static {
            Source source = new Source("SETTINGS", 0);
            SETTINGS = source;
            $VALUES = new Source[]{source};
            CREATOR = new BoostDetailsScreen.Creator(25);
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(name());
        }
    }

    public SecurityHubScreen(Source source) {
        this.source = source;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SecurityHubScreen) && this.source == ((SecurityHubScreen) obj).source;
    }

    public final int hashCode() {
        Source source = this.source;
        if (source == null) {
            return 0;
        }
        return source.hashCode();
    }

    public final String toString() {
        return "SecurityHubScreen(source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Source source = this.source;
        if (source == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            source.writeToParcel(parcel, i);
        }
    }
}
