package com.google.android.gms.auth.api.signin;

import C.l;
import a.AbstractC0083a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;
import q0.AbstractC1035a;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC1035a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new l(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f2663a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2664b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2665c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2666d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2667e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f2668f;

    /* renamed from: g, reason: collision with root package name */
    public String f2669g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2670h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2671i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2672j;

    /* renamed from: k, reason: collision with root package name */
    public final String f2673k;

    /* renamed from: l, reason: collision with root package name */
    public final String f2674l;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f2675m = new HashSet();

    public GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, ArrayList arrayList, String str7, String str8) {
        this.f2663a = i2;
        this.f2664b = str;
        this.f2665c = str2;
        this.f2666d = str3;
        this.f2667e = str4;
        this.f2668f = uri;
        this.f2669g = str5;
        this.f2670h = j2;
        this.f2671i = str6;
        this.f2672j = arrayList;
        this.f2673k = str7;
        this.f2674l = str8;
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
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(1, jSONArray.getString(i2)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (TextUtils.isEmpty(string)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f2669g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (googleSignInAccount.f2671i.equals(this.f2671i)) {
            HashSet hashSet = new HashSet(googleSignInAccount.f2672j);
            hashSet.addAll(googleSignInAccount.f2675m);
            HashSet hashSet2 = new HashSet(this.f2672j);
            hashSet2.addAll(this.f2675m);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f2671i.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f2672j);
        hashSet.addAll(this.f2675m);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int y2 = AbstractC0083a.y(parcel, 20293);
        AbstractC0083a.A(parcel, 1, 4);
        parcel.writeInt(this.f2663a);
        AbstractC0083a.v(parcel, 2, this.f2664b);
        AbstractC0083a.v(parcel, 3, this.f2665c);
        AbstractC0083a.v(parcel, 4, this.f2666d);
        AbstractC0083a.v(parcel, 5, this.f2667e);
        AbstractC0083a.u(parcel, 6, this.f2668f, i2);
        AbstractC0083a.v(parcel, 7, this.f2669g);
        AbstractC0083a.A(parcel, 8, 8);
        parcel.writeLong(this.f2670h);
        AbstractC0083a.v(parcel, 9, this.f2671i);
        AbstractC0083a.x(parcel, 10, this.f2672j);
        AbstractC0083a.v(parcel, 11, this.f2673k);
        AbstractC0083a.v(parcel, 12, this.f2674l);
        AbstractC0083a.z(parcel, y2);
    }
}
