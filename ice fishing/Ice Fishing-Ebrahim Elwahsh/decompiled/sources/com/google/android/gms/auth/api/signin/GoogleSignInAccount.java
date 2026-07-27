package com.google.android.gms.auth.api.signin;

import O2.w;
import P2.a;
import S0.f;
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
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new F0.a(2);

    /* renamed from: A, reason: collision with root package name */
    public final long f23750A;

    /* renamed from: B, reason: collision with root package name */
    public final String f23751B;

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f23752C;

    /* renamed from: D, reason: collision with root package name */
    public final String f23753D;

    /* renamed from: E, reason: collision with root package name */
    public final String f23754E;

    /* renamed from: F, reason: collision with root package name */
    public final HashSet f23755F = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final int f23756n;

    /* renamed from: u, reason: collision with root package name */
    public final String f23757u;

    /* renamed from: v, reason: collision with root package name */
    public final String f23758v;

    /* renamed from: w, reason: collision with root package name */
    public final String f23759w;

    /* renamed from: x, reason: collision with root package name */
    public final String f23760x;

    /* renamed from: y, reason: collision with root package name */
    public final Uri f23761y;

    /* renamed from: z, reason: collision with root package name */
    public String f23762z;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j9, String str6, ArrayList arrayList, String str7, String str8) {
        this.f23756n = i;
        this.f23757u = str;
        this.f23758v = str2;
        this.f23759w = str3;
        this.f23760x = str4;
        this.f23761y = uri;
        this.f23762z = str5;
        this.f23750A = j9;
        this.f23751B = str6;
        this.f23752C = arrayList;
        this.f23753D = str7;
        this.f23754E = str8;
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
        googleSignInAccount.f23762z = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.f23751B.equals(this.f23751B)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f23752C);
        hashSet.addAll(googleSignInAccount.f23755F);
        HashSet hashSet2 = new HashSet(this.f23752C);
        hashSet2.addAll(this.f23755F);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int k6 = AbstractC5051n.k(527, 31, this.f23751B);
        HashSet hashSet = new HashSet(this.f23752C);
        hashSet.addAll(this.f23755F);
        return hashSet.hashCode() + k6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = f.B(parcel, 20293);
        f.A(parcel, 1, 4);
        parcel.writeInt(this.f23756n);
        f.u(parcel, 2, this.f23757u);
        f.u(parcel, 3, this.f23758v);
        f.u(parcel, 4, this.f23759w);
        f.u(parcel, 5, this.f23760x);
        f.t(parcel, 6, this.f23761y, i);
        f.u(parcel, 7, this.f23762z);
        f.A(parcel, 8, 8);
        parcel.writeLong(this.f23750A);
        f.u(parcel, 9, this.f23751B);
        f.y(parcel, 10, this.f23752C);
        f.u(parcel, 11, this.f23753D);
        f.u(parcel, 12, this.f23754E);
        f.C(parcel, B8);
    }
}
