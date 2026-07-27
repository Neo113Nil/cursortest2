package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONArray;

/* renamed from: com.google.android.gms.internal.ads.df, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3091df extends Q2.a {
    public static final Parcelable.Creator<C3091df> CREATOR = new V8(15);

    /* renamed from: n, reason: collision with root package name */
    public final String f29789n;

    /* renamed from: u, reason: collision with root package name */
    public final int f29790u;

    public C3091df(String str, int i) {
        this.f29789n = str;
        this.f29790u = i;
    }

    public static C3091df a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new C3091df(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3091df)) {
            return false;
        }
        C3091df c3091df = (C3091df) obj;
        return P2.w.l(this.f29789n, c3091df.f29789n) && P2.w.l(Integer.valueOf(this.f29790u), Integer.valueOf(c3091df.f29790u));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29789n, Integer.valueOf(this.f29790u)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.z(parcel, 2, this.f29789n);
        A8.b.F(parcel, 3, 4);
        parcel.writeInt(this.f29790u);
        A8.b.I(parcel, G7);
    }
}
