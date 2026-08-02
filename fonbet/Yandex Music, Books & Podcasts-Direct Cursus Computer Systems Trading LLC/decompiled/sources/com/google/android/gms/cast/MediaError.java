package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.d94;
import defpackage.k2x;
import defpackage.l9;
import defpackage.o8g;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MediaError extends l9 implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<MediaError> CREATOR = new k2x(22);
    public final String a;
    public final long b;
    public final Integer c;
    public final String d;
    public String e;
    public final JSONObject f;

    public MediaError(String str, long j, Integer num, String str2, JSONObject jSONObject) {
        this.a = str;
        this.b = j;
        this.c = num;
        this.d = str2;
        this.f = jSONObject;
    }

    public static MediaError a(JSONObject jSONObject) {
        return new MediaError(jSONObject.optString("type", "ERROR"), jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, d94.a(jSONObject, "reason"), jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f;
        this.e = jSONObject == null ? null : jSONObject.toString();
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 2, this.a);
        o8g.q0(3, 8, parcel);
        parcel.writeLong(this.b);
        o8g.g0(parcel, 4, this.c);
        o8g.j0(parcel, 5, this.d);
        o8g.j0(parcel, 6, this.e);
        o8g.p0(parcel, o0);
    }
}
