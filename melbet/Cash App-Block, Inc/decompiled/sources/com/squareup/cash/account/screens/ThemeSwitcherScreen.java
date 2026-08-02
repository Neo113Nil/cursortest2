package com.squareup.cash.account.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.screens.ActivityScreen;

/* loaded from: classes.dex */
public final class ThemeSwitcherScreen implements Screen {
    public static final Parcelable.Creator<ThemeSwitcherScreen> CREATOR = new ActivityScreen.Creator(1);
    public final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class Source {
        public static final /* synthetic */ Source[] $VALUES;
        public static final Source DEEPLINK;
        public static final Source PROFILE;

        static {
            Source source = new Source("PROFILE", 0);
            PROFILE = source;
            Source source2 = new Source("DEEPLINK", 1);
            DEEPLINK = source2;
            $VALUES = new Source[]{source, source2};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public ThemeSwitcherScreen(Source source) {
        source.getClass();
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
        return (obj instanceof ThemeSwitcherScreen) && this.source == ((ThemeSwitcherScreen) obj).source;
    }

    public final int hashCode() {
        return this.source.hashCode();
    }

    public final String toString() {
        return "ThemeSwitcherScreen(source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.source.name());
    }
}
