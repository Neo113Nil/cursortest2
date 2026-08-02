package com.google.android.gms.auth.api.signin;

import B8.d;
import R2.w;
import S2.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bumptech.glide.e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new d(3);

    /* renamed from: A, reason: collision with root package name */
    public final long f24377A;

    /* renamed from: B, reason: collision with root package name */
    public final String f24378B;

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f24379C;

    /* renamed from: D, reason: collision with root package name */
    public final String f24380D;

    /* renamed from: E, reason: collision with root package name */
    public final String f24381E;

    /* renamed from: F, reason: collision with root package name */
    public final HashSet f24382F = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final int f24383n;

    /* renamed from: u, reason: collision with root package name */
    public final String f24384u;

    /* renamed from: v, reason: collision with root package name */
    public final String f24385v;

    /* renamed from: w, reason: collision with root package name */
    public final String f24386w;

    /* renamed from: x, reason: collision with root package name */
    public final String f24387x;

    /* renamed from: y, reason: collision with root package name */
    public final Uri f24388y;

    /* renamed from: z, reason: collision with root package name */
    public String f24389z;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j6, String str6, ArrayList arrayList, String str7, String str8) {
        this.f24383n = i;
        this.f24384u = str;
        this.f24385v = str2;
        this.f24386w = str3;
        this.f24387x = str4;
        this.f24388y = uri;
        this.f24389z = str5;
        this.f24377A = j6;
        this.f24378B = str6;
        this.f24379C = arrayList;
        this.f24380D = str7;
        this.f24381E = str8;
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
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        w.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f24389z = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.f24378B.equals(this.f24378B)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f24379C);
        hashSet.addAll(googleSignInAccount.f24382F);
        HashSet hashSet2 = new HashSet(this.f24379C);
        hashSet2.addAll(this.f24382F);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int a9 = AbstractC5128c.a(527, 31, this.f24378B);
        HashSet hashSet = new HashSet(this.f24379C);
        hashSet.addAll(this.f24382F);
        return hashSet.hashCode() + a9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = e.x(parcel, 20293);
        e.w(parcel, 1, 4);
        parcel.writeInt(this.f24383n);
        e.r(parcel, 2, this.f24384u);
        e.r(parcel, 3, this.f24385v);
        e.r(parcel, 4, this.f24386w);
        e.r(parcel, 5, this.f24387x);
        e.q(parcel, 6, this.f24388y, i);
        e.r(parcel, 7, this.f24389z);
        e.w(parcel, 8, 8);
        parcel.writeLong(this.f24377A);
        e.r(parcel, 9, this.f24378B);
        e.v(parcel, 10, this.f24379C);
        e.r(parcel, 11, this.f24380D);
        e.r(parcel, 12, this.f24381E);
        e.z(parcel, x9);
    }
}
