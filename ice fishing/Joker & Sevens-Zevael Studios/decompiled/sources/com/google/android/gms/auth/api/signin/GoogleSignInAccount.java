package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e7.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p6.u;
import q6.a;
import x4.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c(5);

    /* renamed from: g, reason: collision with root package name */
    public final int f1403g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1404h;

    /* renamed from: i, reason: collision with root package name */
    public final String f1405i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1406j;

    /* renamed from: k, reason: collision with root package name */
    public final String f1407k;

    /* renamed from: l, reason: collision with root package name */
    public final Uri f1408l;

    /* renamed from: m, reason: collision with root package name */
    public String f1409m;

    /* renamed from: n, reason: collision with root package name */
    public final long f1410n;

    /* renamed from: o, reason: collision with root package name */
    public final String f1411o;

    /* renamed from: p, reason: collision with root package name */
    public final List f1412p;

    /* renamed from: q, reason: collision with root package name */
    public final String f1413q;

    /* renamed from: r, reason: collision with root package name */
    public final String f1414r;

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f1415s = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j3, String str6, ArrayList arrayList, String str7, String str8) {
        this.f1403g = i10;
        this.f1404h = str;
        this.f1405i = str2;
        this.f1406j = str3;
        this.f1407k = str4;
        this.f1408l = uri;
        this.f1409m = str5;
        this.f1410n = j3;
        this.f1411o = str6;
        this.f1412p = arrayList;
        this.f1413q = str7;
        this.f1414r = str8;
    }

    public static GoogleSignInAccount a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10), 1));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        u.c(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f1409m = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f1411o.equals(this.f1411o)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f1412p);
        hashSet.addAll(googleSignInAccount.f1415s);
        HashSet hashSet2 = new HashSet(this.f1412p);
        hashSet2.addAll(this.f1415s);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = this.f1411o.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f1412p);
        hashSet.addAll(this.f1415s);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int g02 = f.g0(parcel, 20293);
        f.i0(parcel, 1, 4);
        parcel.writeInt(this.f1403g);
        f.c0(parcel, 2, this.f1404h);
        f.c0(parcel, 3, this.f1405i);
        f.c0(parcel, 4, this.f1406j);
        f.c0(parcel, 5, this.f1407k);
        f.b0(parcel, 6, this.f1408l, i10);
        f.c0(parcel, 7, this.f1409m);
        f.i0(parcel, 8, 8);
        parcel.writeLong(this.f1410n);
        f.c0(parcel, 9, this.f1411o);
        f.e0(parcel, 10, this.f1412p);
        f.c0(parcel, 11, this.f1413q);
        f.c0(parcel, 12, this.f1414r);
        f.h0(parcel, g02);
    }
}
