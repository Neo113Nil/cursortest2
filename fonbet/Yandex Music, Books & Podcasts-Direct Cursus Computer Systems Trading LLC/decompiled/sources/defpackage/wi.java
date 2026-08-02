package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.connectsdk.device.ConnectableDevice;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class wi extends l9 {

    @NonNull
    public static final Parcelable.Creator<wi> CREATOR = new vzw(0);
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final vyt l;
    public final JSONObject m;

    public wi(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, vyt vytVar) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = j2;
        this.k = str9;
        this.l = vytVar;
        if (TextUtils.isEmpty(str6)) {
            this.m = new JSONObject();
            return;
        }
        try {
            this.m = new JSONObject(str6);
        } catch (JSONException e) {
            Locale locale = Locale.ROOT;
            Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + e.getMessage());
            this.g = null;
            this.m = new JSONObject();
        }
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ConnectableDevice.KEY_ID, this.a);
            long j = this.c;
            Pattern pattern = d94.a;
            jSONObject.put("duration", j / 1000.0d);
            long j2 = this.j;
            if (j2 != -1) {
                jSONObject.put("whenSkippable", j2 / 1000.0d);
            }
            String str = this.h;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.m;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.i;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.k;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            vyt vytVar = this.l;
            if (vytVar != null) {
                jSONObject.put("vastAdsRequest", vytVar.d());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi)) {
            return false;
        }
        wi wiVar = (wi) obj;
        return d94.d(this.a, wiVar.a) && d94.d(this.b, wiVar.b) && this.c == wiVar.c && d94.d(this.d, wiVar.d) && d94.d(this.e, wiVar.e) && d94.d(this.f, wiVar.f) && d94.d(this.g, wiVar.g) && d94.d(this.h, wiVar.h) && d94.d(this.i, wiVar.i) && this.j == wiVar.j && d94.d(this.k, wiVar.k) && d94.d(this.l, wiVar.l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.i, Long.valueOf(this.j), this.k, this.l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 2, this.a);
        o8g.j0(parcel, 3, this.b);
        o8g.q0(4, 8, parcel);
        parcel.writeLong(this.c);
        o8g.j0(parcel, 5, this.d);
        o8g.j0(parcel, 6, this.e);
        o8g.j0(parcel, 7, this.f);
        o8g.j0(parcel, 8, this.g);
        o8g.j0(parcel, 9, this.h);
        o8g.j0(parcel, 10, this.i);
        o8g.q0(11, 8, parcel);
        parcel.writeLong(this.j);
        o8g.j0(parcel, 12, this.k);
        o8g.i0(parcel, 13, this.l, i);
        o8g.p0(parcel, o0);
    }
}
