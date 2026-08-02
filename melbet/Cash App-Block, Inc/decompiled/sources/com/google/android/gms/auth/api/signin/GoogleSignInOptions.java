package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.appset.zzd;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes4.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions, Api.ApiOptions.NotRequiredOptions, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions DEFAULT_SIGN_IN;
    public static final Scope zac;
    public static final Scope zad;
    public static final Scope zae;
    public static final ViewPager.AnonymousClass1 zaq;
    public final int zaf;
    public final ArrayList zag;
    public final Account zah;
    public final boolean zai;
    public final boolean zaj;
    public final boolean zak;
    public final String zal;
    public final String zam;
    public final ArrayList zan;
    public final String zao;

    public final class Builder {
        public HashSet zaa;
        public boolean zab;
        public boolean zac;
        public boolean zad;
        public String zae;
        public Account zaf;
        public String zag;
        public HashMap zah;
        public String zai;
    }

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        zac = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        zad = scope3;
        zae = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(zae)) {
            Scope scope4 = zad;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        DEFAULT_SIGN_IN = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, hashMap, null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(zae)) {
            Scope scope5 = zad;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, hashMap2, null);
        CREATOR = new zzd(16);
        zaq = new ViewPager.AnonymousClass1(23);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, HashMap hashMap, String str3) {
        this.zaf = i;
        this.zag = arrayList;
        this.zah = account;
        this.zai = z;
        this.zaj = z2;
        this.zak = z3;
        this.zal = str;
        this.zam = str2;
        this.zan = new ArrayList(hashMap.values());
        this.zao = str3;
    }

    public static GoogleSignInOptions zaa(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap zam(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.zab), googleSignInOptionsExtensionParcelable);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        String str = this.zal;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList = googleSignInOptions.zag;
            String str2 = googleSignInOptions.zal;
            if (this.zan.isEmpty() && googleSignInOptions.zan.isEmpty()) {
                ArrayList arrayList2 = this.zag;
                if (arrayList2.size() == new ArrayList(arrayList).size() && arrayList2.containsAll(new ArrayList(arrayList))) {
                    Account account = this.zah;
                    Account account2 = googleSignInOptions.zah;
                    if (account == null) {
                        if (account2 != null) {
                            return false;
                        }
                    } else if (!account.equals(account2)) {
                        return false;
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            return false;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                    if (this.zak == googleSignInOptions.zak && this.zai == googleSignInOptions.zai && this.zaj == googleSignInOptions.zaj) {
                        return TextUtils.equals(this.zao, googleSignInOptions.zao);
                    }
                    return false;
                }
                return false;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.zag;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).zzb);
        }
        Collections.sort(arrayList);
        int hashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.zah;
        int hashCode2 = (hashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.zal;
        int hashCode3 = (((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.zak ? 1 : 0)) * 31) + (this.zai ? 1 : 0)) * 31) + (this.zaj ? 1 : 0)) * 31;
        String str2 = this.zao;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zaf);
        MooncakeHeaderViewKt.writeTypedList(parcel, 2, new ArrayList(this.zag));
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zah, i);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zai ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zaj ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeInt(this.zak ? 1 : 0);
        MooncakeHeaderViewKt.writeString(parcel, 7, this.zal);
        MooncakeHeaderViewKt.writeString(parcel, 8, this.zam);
        MooncakeHeaderViewKt.writeTypedList(parcel, 9, this.zan);
        MooncakeHeaderViewKt.writeString(parcel, 10, this.zao);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
