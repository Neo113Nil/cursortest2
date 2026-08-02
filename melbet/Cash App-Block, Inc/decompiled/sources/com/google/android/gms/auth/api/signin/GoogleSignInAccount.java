package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.appset.zzd;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes4.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zzd(15);
    public final List zab;
    public final String zac;
    public final String zad;
    public final String zae;
    public final String zaf;
    public final Uri zag;
    public String zah;
    public final long zai;
    public final String zaj;
    public final String zak;
    public final String zal;
    public final HashSet zam = new HashSet();

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.zac = str;
        this.zad = str2;
        this.zae = str3;
        this.zaf = str4;
        this.zag = uri;
        this.zah = str5;
        this.zai = j;
        this.zaj = str6;
        this.zab = arrayList;
        this.zak = str7;
        this.zal = str8;
    }

    public static GoogleSignInAccount zaa(String str) {
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
        String string2 = jSONObject.getString("obfuscatedIdentifier");
        zzae.checkNotEmpty(string2);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(optString2, optString3, optString4, optString5, parse, null, parseLong, string2, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.zah = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.zaj.equals(this.zaj)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.zab);
        hashSet.addAll(googleSignInAccount.zam);
        HashSet hashSet2 = new HashSet(this.zab);
        hashSet2.addAll(this.zam);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = this.zaj.hashCode() + 527;
        HashSet hashSet = new HashSet(this.zab);
        hashSet.addAll(this.zam);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zac);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zad);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zae);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zaf);
        MooncakeHeaderViewKt.writeParcelable(parcel, 6, this.zag, i);
        MooncakeHeaderViewKt.writeString(parcel, 7, this.zah);
        MooncakeHeaderViewKt.zza(parcel, 8, 8);
        parcel.writeLong(this.zai);
        MooncakeHeaderViewKt.writeString(parcel, 9, this.zaj);
        MooncakeHeaderViewKt.writeTypedList(parcel, 10, this.zab);
        MooncakeHeaderViewKt.writeString(parcel, 11, this.zak);
        MooncakeHeaderViewKt.writeString(parcel, 12, this.zal);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
