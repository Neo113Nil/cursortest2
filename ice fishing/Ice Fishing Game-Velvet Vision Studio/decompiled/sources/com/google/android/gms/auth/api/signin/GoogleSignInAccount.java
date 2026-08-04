package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.v8.c0;
import com.gamericefishpro.space.w8.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new com.gamericefishpro.space.h.a(15);
    public final long A;
    public final String B;
    public final List C;
    public final String D;
    public final String E;
    public final HashSet F = new HashSet();
    public final int d;
    public final String e;
    public final String i;
    public final String v;
    public final String w;
    public final Uri y;
    public String z;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.d = i;
        this.e = str;
        this.i = str2;
        this.v = str3;
        this.w = str4;
        this.y = uri;
        this.z = str5;
        this.A = j;
        this.B = str6;
        this.C = arrayList;
        this.D = str7;
        this.E = str8;
    }

    public static GoogleSignInAccount b(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        c0.d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.z = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.B.equals(this.B)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.C);
        hashSet.addAll(googleSignInAccount.F);
        HashSet hashSet2 = new HashSet(this.C);
        hashSet2.addAll(this.F);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.B.hashCode() + 527;
        HashSet hashSet = new HashSet(this.C);
        hashSet.addAll(this.F);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        y3.U(parcel, 1, 4);
        parcel.writeInt(this.d);
        y3.Q(parcel, 2, this.e);
        y3.Q(parcel, 3, this.i);
        y3.Q(parcel, 4, this.v);
        y3.Q(parcel, 5, this.w);
        y3.P(parcel, 6, this.y, i);
        y3.Q(parcel, 7, this.z);
        y3.U(parcel, 8, 8);
        parcel.writeLong(this.A);
        y3.Q(parcel, 9, this.B);
        y3.S(parcel, 10, this.C);
        y3.Q(parcel, 11, this.D);
        y3.Q(parcel, 12, this.E);
        y3.W(parcel, iV);
    }
}
