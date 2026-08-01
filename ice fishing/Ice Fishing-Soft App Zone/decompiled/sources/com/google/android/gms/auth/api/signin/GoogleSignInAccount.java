package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.datatransport.WinterFlowAdapterAPI;
import com.google.android.datatransport.WinterFlowStackFramework;
import com.google.android.datatransport.WinterFlowUnitTestLibrary;
import com.google.android.datatransport.WinterFlowWorkerVersionControl;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends WinterFlowAdapterAPI implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new WinterFlowStackFramework(10);
    public final String WinterFlowBandwidthObject;
    public final HashSet WinterFlowOrchestrationSubsystem = new HashSet();
    public String WinterFlowResponseEngine;
    public final String WinterFlowRouterRouter;
    public final String WinterFlowServerProtocol;
    public final String WinterFlowServiceUtility;
    public final Uri WinterFlowSyntax;
    public final List WinterFlowThreadListener;
    public final long WinterFlowTransactionAgent;
    public final String WinterFlowTransactionManagerStrategy;
    public final String WinterFlowUnitTestResponse;
    public final String WinterFlowVariableVersionControl;

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.WinterFlowVariableVersionControl = str;
        this.WinterFlowTransactionManagerStrategy = str2;
        this.WinterFlowUnitTestResponse = str3;
        this.WinterFlowRouterRouter = str4;
        this.WinterFlowSyntax = uri;
        this.WinterFlowResponseEngine = str5;
        this.WinterFlowTransactionAgent = j;
        this.WinterFlowServerProtocol = str6;
        this.WinterFlowThreadListener = arrayList;
        this.WinterFlowServiceUtility = str7;
        this.WinterFlowBandwidthObject = str8;
    }

    public static GoogleSignInAccount WinterFlowRouterStructure(String str) {
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
        WinterFlowUnitTestLibrary.WinterFlowBandwidthObject(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.WinterFlowResponseEngine = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.WinterFlowServerProtocol.equals(this.WinterFlowServerProtocol)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.WinterFlowThreadListener);
        hashSet.addAll(googleSignInAccount.WinterFlowOrchestrationSubsystem);
        HashSet hashSet2 = new HashSet(this.WinterFlowThreadListener);
        hashSet2.addAll(this.WinterFlowOrchestrationSubsystem);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = this.WinterFlowServerProtocol.hashCode() + 527;
        HashSet hashSet = new HashSet(this.WinterFlowThreadListener);
        hashSet.addAll(this.WinterFlowOrchestrationSubsystem);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 2, this.WinterFlowVariableVersionControl);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 3, this.WinterFlowTransactionManagerStrategy);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 4, this.WinterFlowUnitTestResponse);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 5, this.WinterFlowRouterRouter);
        WinterFlowWorkerVersionControl.WinterFlowBatchUI(parcel, 6, this.WinterFlowSyntax, i);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 7, this.WinterFlowResponseEngine);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 8, 8);
        parcel.writeLong(this.WinterFlowTransactionAgent);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 9, this.WinterFlowServerProtocol);
        WinterFlowWorkerVersionControl.WinterFlowMapperProtocol(parcel, 10, this.WinterFlowThreadListener);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 11, this.WinterFlowServiceUtility);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 12, this.WinterFlowBandwidthObject);
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }
}
