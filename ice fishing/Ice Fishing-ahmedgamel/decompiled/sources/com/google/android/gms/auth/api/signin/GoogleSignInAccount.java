package com.google.android.gms.auth.api.signin;

import A8.b;
import B8.d;
import P2.w;
import Q2.a;
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
import u1.h;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new d(3);

    /* renamed from: A, reason: collision with root package name */
    public final long f23597A;

    /* renamed from: B, reason: collision with root package name */
    public final String f23598B;

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f23599C;

    /* renamed from: D, reason: collision with root package name */
    public final String f23600D;

    /* renamed from: E, reason: collision with root package name */
    public final String f23601E;

    /* renamed from: F, reason: collision with root package name */
    public final HashSet f23602F = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final int f23603n;

    /* renamed from: u, reason: collision with root package name */
    public final String f23604u;

    /* renamed from: v, reason: collision with root package name */
    public final String f23605v;

    /* renamed from: w, reason: collision with root package name */
    public final String f23606w;

    /* renamed from: x, reason: collision with root package name */
    public final String f23607x;

    /* renamed from: y, reason: collision with root package name */
    public final Uri f23608y;

    /* renamed from: z, reason: collision with root package name */
    public String f23609z;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j6, String str6, ArrayList arrayList, String str7, String str8) {
        this.f23603n = i;
        this.f23604u = str;
        this.f23605v = str2;
        this.f23606w = str3;
        this.f23607x = str4;
        this.f23608y = uri;
        this.f23609z = str5;
        this.f23597A = j6;
        this.f23598B = str6;
        this.f23599C = arrayList;
        this.f23600D = str7;
        this.f23601E = str8;
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
        googleSignInAccount.f23609z = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.f23598B.equals(this.f23598B)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f23599C);
        hashSet.addAll(googleSignInAccount.f23602F);
        HashSet hashSet2 = new HashSet(this.f23599C);
        hashSet2.addAll(this.f23602F);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int k9 = h.k(527, 31, this.f23598B);
        HashSet hashSet = new HashSet(this.f23599C);
        hashSet.addAll(this.f23602F);
        return hashSet.hashCode() + k9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = b.G(parcel, 20293);
        b.F(parcel, 1, 4);
        parcel.writeInt(this.f23603n);
        b.z(parcel, 2, this.f23604u);
        b.z(parcel, 3, this.f23605v);
        b.z(parcel, 4, this.f23606w);
        b.z(parcel, 5, this.f23607x);
        b.y(parcel, 6, this.f23608y, i);
        b.z(parcel, 7, this.f23609z);
        b.F(parcel, 8, 8);
        parcel.writeLong(this.f23597A);
        b.z(parcel, 9, this.f23598B);
        b.D(parcel, 10, this.f23599C);
        b.z(parcel, 11, this.f23600D);
        b.z(parcel, 12, this.f23601E);
        b.I(parcel, G7);
    }
}
