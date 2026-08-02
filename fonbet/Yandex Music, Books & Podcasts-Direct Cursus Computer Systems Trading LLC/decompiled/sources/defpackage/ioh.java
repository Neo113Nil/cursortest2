package defpackage;

import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ioh implements Parcelable {
    public static final Parcelable.Creator<ioh> CREATOR;
    public static final xy0 c;
    public static final String[] d;
    public final Bundle a;
    public MediaMetadata b;

    static {
        xy0 xy0Var = new xy0(0);
        c = xy0Var;
        xy0Var.put("android.media.metadata.TITLE", 1);
        xy0Var.put("android.media.metadata.ARTIST", 1);
        xy0Var.put("android.media.metadata.DURATION", 0);
        xy0Var.put("android.media.metadata.ALBUM", 1);
        xy0Var.put("android.media.metadata.AUTHOR", 1);
        xy0Var.put("android.media.metadata.WRITER", 1);
        xy0Var.put("android.media.metadata.COMPOSER", 1);
        xy0Var.put("android.media.metadata.COMPILATION", 1);
        xy0Var.put("android.media.metadata.DATE", 1);
        xy0Var.put("android.media.metadata.YEAR", 0);
        xy0Var.put("android.media.metadata.GENRE", 1);
        xy0Var.put("android.media.metadata.TRACK_NUMBER", 0);
        xy0Var.put("android.media.metadata.NUM_TRACKS", 0);
        xy0Var.put("android.media.metadata.DISC_NUMBER", 0);
        xy0Var.put("android.media.metadata.ALBUM_ARTIST", 1);
        xy0Var.put("android.media.metadata.ART", 2);
        xy0Var.put("android.media.metadata.ART_URI", 1);
        xy0Var.put("android.media.metadata.ALBUM_ART", 2);
        xy0Var.put("android.media.metadata.ALBUM_ART_URI", 1);
        xy0Var.put("android.media.metadata.USER_RATING", 3);
        xy0Var.put("android.media.metadata.RATING", 3);
        xy0Var.put("android.media.metadata.DISPLAY_TITLE", 1);
        xy0Var.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        xy0Var.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        xy0Var.put("android.media.metadata.DISPLAY_ICON", 2);
        xy0Var.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        xy0Var.put("android.media.metadata.MEDIA_ID", 1);
        xy0Var.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        xy0Var.put("android.media.metadata.MEDIA_URI", 1);
        xy0Var.put("android.media.metadata.ADVERTISEMENT", 0);
        xy0Var.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        d = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER", "android.media.metadata.DISPLAY_SUBTITLE"};
        CREATOR = new mmh(1);
    }

    public ioh(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(nsh.class.getClassLoader());
        readBundle.getClass();
        this.a = readBundle;
    }

    public final long a(String str) {
        return this.a.getLong(str, 0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public ioh(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.a = bundle2;
        nsh.g(bundle2);
    }
}
