package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.connectsdk.device.ConnectableDevice;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rtm implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<rtm> CREATOR = new s2m(6);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Uri f;
    public final Uri g;

    public rtm(JSONObject jSONObject) {
        this.a = jSONObject.optString(ConnectableDevice.KEY_ID, null);
        this.b = jSONObject.optString("first_name", null);
        this.c = jSONObject.optString("middle_name", null);
        this.d = jSONObject.optString("last_name", null);
        this.e = jSONObject.optString("name", null);
        String optString = jSONObject.optString("link_uri", null);
        this.f = optString == null ? null : Uri.parse(optString);
        String optString2 = jSONObject.optString("picture_uri", null);
        this.g = optString2 != null ? Uri.parse(optString2) : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtm)) {
            return false;
        }
        String str5 = this.a;
        return ((str5 == null && ((rtm) obj).a == null) || Intrinsics.d(str5, ((rtm) obj).a)) && (((str = this.b) == null && ((rtm) obj).b == null) || Intrinsics.d(str, ((rtm) obj).b)) && ((((str2 = this.c) == null && ((rtm) obj).c == null) || Intrinsics.d(str2, ((rtm) obj).c)) && ((((str3 = this.d) == null && ((rtm) obj).d == null) || Intrinsics.d(str3, ((rtm) obj).d)) && ((((str4 = this.e) == null && ((rtm) obj).e == null) || Intrinsics.d(str4, ((rtm) obj).e)) && ((((uri = this.f) == null && ((rtm) obj).f == null) || Intrinsics.d(uri, ((rtm) obj).f)) && (((uri2 = this.g) == null && ((rtm) obj).g == null) || Intrinsics.d(uri2, ((rtm) obj).g))))));
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.b;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.c;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.d;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        String str5 = this.e;
        if (str5 != null) {
            hashCode = (hashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.g;
        if (uri2 != null) {
            return uri2.hashCode() + (hashCode * 31);
        }
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Uri uri = this.f;
        parcel.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.g;
        parcel.writeString(uri2 != null ? uri2.toString() : null);
    }

    public rtm(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        wxf.I(str, ConnectableDevice.KEY_ID);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = uri;
        this.g = uri2;
    }

    public rtm(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        String readString = parcel.readString();
        this.f = readString == null ? null : Uri.parse(readString);
        String readString2 = parcel.readString();
        this.g = readString2 != null ? Uri.parse(readString2) : null;
    }
}
