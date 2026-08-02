package com.yandex.passport.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eta;
import defpackage.wvs;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class g implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new a(2);
    public final Long a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final String g;
    public final String h;
    public final long i;

    public g(Long l, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, String str4, long j) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = bool;
        this.e = bool2;
        this.f = bool3;
        this.g = str3;
        this.h = str4;
        this.i = j;
    }

    public final String d() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.a;
            if (l != null) {
                jSONObject.put("_uid", m.a(l.toString()));
            }
            String str = this.b;
            if (str != null && str.length() > 0) {
                jSONObject.put("_display_name", m.a(str));
            }
            String str2 = this.c;
            if (str2 != null && str2.length() > 0) {
                jSONObject.put("_default_avatar", m.a(str2));
            }
            Boolean bool = this.d;
            if (bool != null) {
                String bool2 = Boolean.toString(bool.booleanValue());
                bool2.getClass();
                jSONObject.put("_is_avatar_empty", m.a(bool2));
            }
            Boolean bool3 = this.e;
            if (bool3 != null) {
                String bool4 = Boolean.toString(bool3.booleanValue());
                bool4.getClass();
                jSONObject.put("_is_staff", m.a(bool4));
            }
            Boolean bool5 = this.f;
            if (bool5 != null) {
                String bool6 = Boolean.toString(bool5.booleanValue());
                bool6.getClass();
                jSONObject.put("_is_beta_tester", m.a(bool6));
            }
            String str3 = this.g;
            if (str3 != null) {
                jSONObject.put("disk.pincode", m.a(str3));
            }
            String str4 = this.h;
            if (str4 != null) {
                jSONObject.put("mail.pincode", m.a(str4));
            }
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject.length() > 0) {
                jSONObject2.put("extra_data", jSONObject);
            }
            return "@jsn" + jSONObject2;
        } catch (JSONException unused) {
            wvs.p("Json serialization has failed");
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.a, gVar.a) && Intrinsics.d(this.b, gVar.b) && Intrinsics.d(this.c, gVar.c) && Intrinsics.d(this.d, gVar.d) && Intrinsics.d(this.e, gVar.e) && Intrinsics.d(this.f, gVar.f) && Intrinsics.d(this.g, gVar.g) && Intrinsics.d(this.h, gVar.h) && this.i == gVar.i;
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        return Long.hashCode(this.i) + ((hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegacyExtraData(uidValue=");
        sb.append(this.a);
        sb.append(", displayName=");
        sb.append(this.b);
        sb.append(", avatarUrl=");
        sb.append(this.c);
        sb.append(", isAvatarEmpty=");
        sb.append(this.d);
        sb.append(", isYandexoid=");
        sb.append(this.e);
        sb.append(", isBetaTester=");
        sb.append(this.f);
        sb.append(", diskPinCode=");
        sb.append(this.g);
        sb.append(", mailPinCode=");
        sb.append(this.h);
        sb.append(", updatedTimestamp=");
        return eta.g(sb, this.i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Long l = this.a;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Boolean bool = this.d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.e;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.f;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeLong(this.i);
    }
}
