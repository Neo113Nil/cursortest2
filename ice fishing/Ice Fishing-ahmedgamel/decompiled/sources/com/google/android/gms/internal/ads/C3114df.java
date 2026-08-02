package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONArray;

/* renamed from: com.google.android.gms.internal.ads.df, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3114df extends S2.a {
    public static final Parcelable.Creator<C3114df> CREATOR = new V8(15);

    /* renamed from: n, reason: collision with root package name */
    public final String f30562n;

    /* renamed from: u, reason: collision with root package name */
    public final int f30563u;

    public C3114df(String str, int i) {
        this.f30562n = str;
        this.f30563u = i;
    }

    public static C3114df a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new C3114df(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3114df)) {
            return false;
        }
        C3114df c3114df = (C3114df) obj;
        return R2.w.l(this.f30562n, c3114df.f30562n) && R2.w.l(Integer.valueOf(this.f30563u), Integer.valueOf(c3114df.f30563u));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30562n, Integer.valueOf(this.f30563u)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.r(parcel, 2, this.f30562n);
        com.bumptech.glide.e.w(parcel, 3, 4);
        parcel.writeInt(this.f30563u);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
