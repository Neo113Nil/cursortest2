package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ja implements Parcelable {
    public final Date a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final String e;
    public final ra f;
    public final Date g;
    public final String h;
    public final String i;
    public final Date j;
    public final String k;
    public static final Date l = new Date(Long.MAX_VALUE);
    public static final Date m = new Date();
    public static final ra n = ra.FACEBOOK_APPLICATION_WEB;

    @NotNull
    public static final Parcelable.Creator<ja> CREATOR = new l(1);

    public ja(Parcel parcel) {
        this.a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        unmodifiableSet.getClass();
        this.b = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        unmodifiableSet2.getClass();
        this.c = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        unmodifiableSet3.getClass();
        this.d = unmodifiableSet3;
        String readString = parcel.readString();
        wxf.I(readString, "token");
        if (readString == null) {
            xq0.q("Required value was null.");
            throw null;
        }
        this.e = readString;
        String readString2 = parcel.readString();
        this.f = readString2 != null ? ra.valueOf(readString2) : n;
        this.g = new Date(parcel.readLong());
        String readString3 = parcel.readString();
        wxf.I(readString3, "applicationId");
        if (readString3 == null) {
            xq0.q("Required value was null.");
            throw null;
        }
        this.h = readString3;
        String readString4 = parcel.readString();
        wxf.I(readString4, "userId");
        if (readString4 == null) {
            xq0.q("Required value was null.");
            throw null;
        }
        this.i = readString4;
        this.j = new Date(parcel.readLong());
        this.k = parcel.readString();
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.e);
        jSONObject.put("expires_at", this.a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.d));
        jSONObject.put("last_refresh", this.g.getTime());
        jSONObject.put("source", this.f.name());
        jSONObject.put("application_id", this.h);
        jSONObject.put("user_id", this.i);
        jSONObject.put("data_access_expiration_time", this.j.getTime());
        String str = this.k;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja)) {
            return false;
        }
        ja jaVar = (ja) obj;
        if (Intrinsics.d(this.a, jaVar.a) && Intrinsics.d(this.b, jaVar.b) && Intrinsics.d(this.c, jaVar.c) && Intrinsics.d(this.d, jaVar.d) && Intrinsics.d(this.e, jaVar.e) && this.f == jaVar.f && Intrinsics.d(this.g, jaVar.g) && Intrinsics.d(this.h, jaVar.h) && Intrinsics.d(this.i, jaVar.i) && Intrinsics.d(this.j, jaVar.j)) {
            String str = jaVar.k;
            String str2 = this.k;
            if (str2 == null ? str == null : Intrinsics.d(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.j.hashCode() + k5r.c(k5r.c((this.g.hashCode() + ((this.f.hashCode() + k5r.c(su4.f(this.d, su4.f(this.c, su4.f(this.b, (this.a.hashCode() + 527) * 31, 31), 31), 31), 31, this.e)) * 31)) * 31, 31, this.h), 31, this.i)) * 31;
        String str = this.k;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[");
        synchronized (j3c.a) {
        }
        sb.append(TextUtils.join(", ", this.b));
        sb.append("]}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a.getTime());
        parcel.writeStringList(new ArrayList(this.b));
        parcel.writeStringList(new ArrayList(this.c));
        parcel.writeStringList(new ArrayList(this.d));
        parcel.writeString(this.e);
        parcel.writeString(this.f.name());
        parcel.writeLong(this.g.getTime());
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeLong(this.j.getTime());
        parcel.writeString(this.k);
    }

    public /* synthetic */ ja(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, ra raVar, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, raVar, date, date2, date3, "facebook");
    }

    public ja(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, ra raVar, Date date, Date date2, Date date3, String str4) {
        dfi.s(str, str2, str3);
        wxf.F(str, "accessToken");
        wxf.F(str2, "applicationId");
        wxf.F(str3, "userId");
        Date date4 = l;
        this.a = date == null ? date4 : date;
        Set unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        unmodifiableSet.getClass();
        this.b = unmodifiableSet;
        Set unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        unmodifiableSet2.getClass();
        this.c = unmodifiableSet2;
        Set unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        unmodifiableSet3.getClass();
        this.d = unmodifiableSet3;
        this.e = str;
        raVar = raVar == null ? n : raVar;
        if (str4 != null && str4.equals("instagram")) {
            int ordinal = raVar.ordinal();
            if (ordinal == 1) {
                raVar = ra.INSTAGRAM_APPLICATION_WEB;
            } else if (ordinal == 4) {
                raVar = ra.INSTAGRAM_WEB_VIEW;
            } else if (ordinal == 5) {
                raVar = ra.INSTAGRAM_CUSTOM_CHROME_TAB;
            }
        }
        this.f = raVar;
        this.g = date2 == null ? m : date2;
        this.h = str2;
        this.i = str3;
        this.j = (date3 == null || date3.getTime() == 0) ? date4 : date3;
        this.k = str4 == null ? "facebook" : str4;
    }
}
