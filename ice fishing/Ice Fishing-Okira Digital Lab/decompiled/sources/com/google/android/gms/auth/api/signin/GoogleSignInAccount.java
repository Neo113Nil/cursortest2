package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756;
import androidx.versionedparcelable.CrimsonRouteFloatingPointManagerI0QcSwBYJw5fsxQV1B69758578851536;
import androidx.versionedparcelable.EmeraldStackCoordinatorFrameworkMcmhq9zBRhabvCqI6L54429333500827;
import androidx.versionedparcelable.YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class GoogleSignInAccount extends CrimsonRouteFloatingPointManagerI0QcSwBYJw5fsxQV1B69758578851536 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new EmeraldStackCoordinatorFrameworkMcmhq9zBRhabvCqI6L54429333500827(9);
    public final String BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
    public final String CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170;
    public final String EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111;
    public final String LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public String NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
    public final long ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
    public final List ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834;
    public final HashSet PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036 = new HashSet();
    public final int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final String TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final Uri UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
    public final String YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    public final String ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = str;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = str2;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = str3;
        this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = str4;
        this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = uri;
        this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = str5;
        this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = j;
        this.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111 = str6;
        this.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = arrayList;
        this.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = str7;
        this.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111 = str8;
    }

    public static GoogleSignInAccount ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(String str) {
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
        YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.equals(this.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834);
        hashSet.addAll(googleSignInAccount.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036);
        HashSet hashSet2 = new HashSet(this.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834);
        hashSet2.addAll(this.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = (this.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.hashCode() + 527) * 31;
        HashSet hashSet = new HashSet(this.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834);
        hashSet.addAll(this.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036);
        return hashSet.hashCode() + hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul371691657630987 = AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul371691657630987(parcel, 20293);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.TitanCloudCacheAbstractionTMResqLylzdSk6HF7m13862104943550(parcel, 1, 4);
        parcel.writeInt(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(parcel, 2, this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(parcel, 3, this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(parcel, 4, this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(parcel, 5, this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(parcel, 6, this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339, i);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(parcel, 7, this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.TitanCloudCacheAbstractionTMResqLylzdSk6HF7m13862104943550(parcel, 8, 8);
        parcel.writeLong(this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(parcel, 9, this.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.FrostBridgeProviderPostfixIXYixnTdHOklADz4h935360772170079(parcel, 10, this.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(parcel, 11, this.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(parcel, 12, this.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.BlazePulsePolymorphismOverloadingK3oHWwcZeom5cYPPbU90259265379402(parcel, JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul371691657630987);
    }
}
