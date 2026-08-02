package com.yandex.passport.internal.ui.social.gimap;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.auth.LegacyAccountType;
import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class o implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<o> CREATOR = new com.yandex.passport.internal.ui.authsdk.r(10);
    public final String a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final String e;

    public o(String str, Boolean bool, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = str3;
        this.e = str4;
    }

    public static o b(o oVar, String str, String str2, Boolean bool, String str3, String str4, int i) {
        if ((i & 1) != 0) {
            str = oVar.a;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            str2 = oVar.b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            bool = oVar.c;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            str3 = oVar.d;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = oVar.e;
        }
        oVar.getClass();
        return new o(str5, bool2, str6, str7, str4);
    }

    public final o a(b bVar) {
        String str = this.a;
        if (str == null) {
            str = bVar.a;
            str.getClass();
        }
        String str2 = str;
        String str3 = this.b;
        if (str3 == null) {
            str3 = String.valueOf(bVar.b);
        }
        String str4 = str3;
        Boolean bool = this.c;
        return b(this, str2, str4, Boolean.valueOf(bool != null ? bool.booleanValue() : bVar.c), null, null, 24);
    }

    public final boolean d() {
        return (this.a == null || this.b == null || this.c == null || this.d == null || this.e == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        String str = this.a;
        str.getClass();
        jSONObject.put("host", str);
        String str2 = this.b;
        str2.getClass();
        jSONObject.put("port", str2);
        Boolean bool = this.c;
        bool.getClass();
        jSONObject.put("ssl", bool.booleanValue());
        String str3 = this.d;
        str3.getClass();
        jSONObject.put(LegacyAccountType.STRING_LOGIN, str3);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.a, oVar.a) && Intrinsics.d(this.b, oVar.b) && Intrinsics.d(this.c, oVar.c) && Intrinsics.d(this.d, oVar.d) && Intrinsics.d(this.e, oVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GimapServerSettings(host=");
        sb.append(this.a);
        sb.append(", port=");
        sb.append(this.b);
        sb.append(", ssl=");
        sb.append(this.c);
        sb.append(", login=");
        sb.append(this.d);
        sb.append(", password=");
        return dfi.i(sb, this.e, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Boolean bool = this.c;
        if (bool == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = bool.booleanValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
