package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.text.CatchingFishSnackbarPayPal;
import kotlin.text.CatchingFishToastHiltBundle;
import kotlin.text.CatchingFishViewMVIMVVM;
import kotlin.text.CatchingFishViewStateFlow;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends CatchingFishViewStateFlow implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new CatchingFishSnackbarPayPal(22);
    public final HashSet CatchingFishAnimationMockk = new HashSet();
    public final String CatchingFishCloudMessaging;
    public final String CatchingFishDaggerWebsocket;
    public final List CatchingFishEspressoTesting;
    public final long CatchingFishFragmentHandler;
    public String CatchingFishLayout;
    public final String CatchingFishOkHttp;
    public final String CatchingFishReduxKtor;
    public final String CatchingFishUnitTesting;
    public final Uri CatchingFishViewModelFAB;
    public final String CatchingFishViewModelScope;
    public final String CatchingFishWorkManager;

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.CatchingFishReduxKtor = str;
        this.CatchingFishDaggerWebsocket = str2;
        this.CatchingFishWorkManager = str3;
        this.CatchingFishViewModelScope = str4;
        this.CatchingFishViewModelFAB = uri;
        this.CatchingFishLayout = str5;
        this.CatchingFishFragmentHandler = j;
        this.CatchingFishCloudMessaging = str6;
        this.CatchingFishEspressoTesting = arrayList;
        this.CatchingFishOkHttp = str7;
        this.CatchingFishUnitTesting = str8;
    }

    public static GoogleSignInAccount CatchingFishParcelableFAB(String str) {
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
            hashSet.add(new Scope(jSONArray.getString(i), 1));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        CatchingFishToastHiltBundle.CatchingFishEspressoTesting(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.CatchingFishLayout = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.CatchingFishCloudMessaging.equals(this.CatchingFishCloudMessaging)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.CatchingFishEspressoTesting);
        hashSet.addAll(googleSignInAccount.CatchingFishAnimationMockk);
        HashSet hashSet2 = new HashSet(this.CatchingFishEspressoTesting);
        hashSet2.addAll(this.CatchingFishAnimationMockk);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = this.CatchingFishCloudMessaging.hashCode() + 527;
        HashSet hashSet = new HashSet(this.CatchingFishEspressoTesting);
        hashSet.addAll(this.CatchingFishAnimationMockk);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int CatchingFishJobScheduler = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 20293);
        CatchingFishViewMVIMVVM.CatchingFishPayPal(parcel, 2, this.CatchingFishReduxKtor);
        CatchingFishViewMVIMVVM.CatchingFishPayPal(parcel, 3, this.CatchingFishDaggerWebsocket);
        CatchingFishViewMVIMVVM.CatchingFishPayPal(parcel, 4, this.CatchingFishWorkManager);
        CatchingFishViewMVIMVVM.CatchingFishPayPal(parcel, 5, this.CatchingFishViewModelScope);
        CatchingFishViewMVIMVVM.CatchingFishCardViewRealm(parcel, 6, this.CatchingFishViewModelFAB, i);
        CatchingFishViewMVIMVVM.CatchingFishPayPal(parcel, 7, this.CatchingFishLayout);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 8, 8);
        parcel.writeLong(this.CatchingFishFragmentHandler);
        CatchingFishViewMVIMVVM.CatchingFishPayPal(parcel, 9, this.CatchingFishCloudMessaging);
        CatchingFishViewMVIMVVM.CatchingFishMVPRobolectric(parcel, 10, this.CatchingFishEspressoTesting);
        CatchingFishViewMVIMVVM.CatchingFishPayPal(parcel, 11, this.CatchingFishOkHttp);
        CatchingFishViewMVIMVVM.CatchingFishPayPal(parcel, 12, this.CatchingFishUnitTesting);
        CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }
}
