package com.google.android.gms.auth.api.signin;

import android.content.Context.FrostHunterAdapterMegaSpectraThunder2458;
import android.content.Context.FrostHunterCardViewHyperionAurora3829;
import android.content.Context.FrostHunterKeyEventNovaXAlpha1220;
import android.content.Context.FrostHunterOnPreDrawListenerFusionGammaOmega7733;
import android.content.Context.FrostHunterTransitionGammaTitanSpeed7178;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class GoogleSignInAccount extends FrostHunterAdapterMegaSpectraThunder2458 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new FrostHunterOnPreDrawListenerFusionGammaOmega7733(10);
    public final String FrostHunterAlertDialogAuroraDelta3200;
    public final int FrostHunterCameraXPixelTurboCosmos9814;
    public final String FrostHunterCameraXTurboCelestialHero5430;
    public final String FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public final String FrostHunterFlowMaxDragonHero5809;
    public final String FrostHunterFragmentBetaMegaVortex6025;
    public final String FrostHunterKeyframeGammaGamma1197;
    public String FrostHunterLightSensorForceFusion4241;
    public final List FrostHunterLintTitanVortexQuantum9911;
    public final String FrostHunterResourcesTitanHyperVision5823;
    public final long FrostHunterScaleAnimationStrikeSpark5059;
    public final Uri FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public final HashSet FrostHunterTextViewDragonStormMega4297 = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = str;
        this.FrostHunterAlertDialogAuroraDelta3200 = str2;
        this.FrostHunterKeyframeGammaGamma1197 = str3;
        this.FrostHunterFragmentBetaMegaVortex6025 = str4;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = uri;
        this.FrostHunterLightSensorForceFusion4241 = str5;
        this.FrostHunterScaleAnimationStrikeSpark5059 = j;
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = str6;
        this.FrostHunterLintTitanVortexQuantum9911 = arrayList;
        this.FrostHunterCameraXTurboCelestialHero5430 = str7;
        this.FrostHunterResourcesTitanHyperVision5823 = str8;
    }

    public static GoogleSignInAccount FrostHunterAlphaAnimationNeoCosmos5761(String str) {
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
        FrostHunterCardViewHyperionAurora3829.FrostHunterFragmentBetaMegaVortex6025(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.FrostHunterLightSensorForceFusion4241 = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.equals(this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.FrostHunterLintTitanVortexQuantum9911);
        hashSet.addAll(googleSignInAccount.FrostHunterTextViewDragonStormMega4297);
        HashSet hashSet2 = new HashSet(this.FrostHunterLintTitanVortexQuantum9911);
        hashSet2.addAll(this.FrostHunterTextViewDragonStormMega4297);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223, 527, 31);
        HashSet hashSet = new HashSet(this.FrostHunterLintTitanVortexQuantum9911);
        hashSet.addAll(this.FrostHunterTextViewDragonStormMega4297);
        return hashSet.hashCode() + FrostHunterLifecycleBlazeGammaElite2889;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int FrostHunterInAppPurchaseLegendEpicDragon4579 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterInAppPurchaseLegendEpicDragon4579(parcel, 20293);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterPlaceholderLegendForceNebula9869(parcel, 1, 4);
        parcel.writeInt(this.FrostHunterCameraXPixelTurboCosmos9814);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterColorStateListMegaBetaFusion7423(parcel, 2, this.FrostHunterFlowMaxDragonHero5809);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterColorStateListMegaBetaFusion7423(parcel, 3, this.FrostHunterAlertDialogAuroraDelta3200);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterColorStateListMegaBetaFusion7423(parcel, 4, this.FrostHunterKeyframeGammaGamma1197);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterColorStateListMegaBetaFusion7423(parcel, 5, this.FrostHunterFragmentBetaMegaVortex6025);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterNestedScrollViewThunderNovaX6772(parcel, 6, this.FrostHunterServiceConnectionTurboPhoenixOmega6719, i);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterColorStateListMegaBetaFusion7423(parcel, 7, this.FrostHunterLightSensorForceFusion4241);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterPlaceholderLegendForceNebula9869(parcel, 8, 8);
        parcel.writeLong(this.FrostHunterScaleAnimationStrikeSpark5059);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterColorStateListMegaBetaFusion7423(parcel, 9, this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterImageAnalysisGammaOlympian2400(parcel, 10, this.FrostHunterLintTitanVortexQuantum9911);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterColorStateListMegaBetaFusion7423(parcel, 11, this.FrostHunterCameraXTurboCelestialHero5430);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterColorStateListMegaBetaFusion7423(parcel, 12, this.FrostHunterResourcesTitanHyperVision5823);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterViewPager2StrikePulse8790(parcel, FrostHunterInAppPurchaseLegendEpicDragon4579);
    }
}
