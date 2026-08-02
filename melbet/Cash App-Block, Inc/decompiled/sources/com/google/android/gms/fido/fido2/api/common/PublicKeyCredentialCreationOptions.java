package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import coil3.size.SizeKt;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.internal.fido.zzaz;
import com.google.android.gms.internal.fido.zzbl;
import com.google.android.gms.internal.fido.zzbn;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class PublicKeyCredentialCreationOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new com.google.android.gms.common.zzs(9);
    public final PublicKeyCredentialRpEntity zza;
    public final PublicKeyCredentialUserEntity zzb;
    public final byte[] zzc;
    public final List zzd;
    public final Double zze;
    public final List zzf;
    public final AuthenticatorSelectionCriteria zzg;
    public final Integer zzh;
    public final TokenBinding zzi;
    public final AttestationConveyancePreference zzj;
    public final AuthenticationExtensions zzk;
    public final String zzl;
    public final ResultReceiver zzm;

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions, String str2, ResultReceiver resultReceiver) {
        this.zzm = resultReceiver;
        if (str2 != null) {
            try {
                PublicKeyCredentialCreationOptions zza = zza(new JSONObject(str2));
                this.zza = zza.zza;
                this.zzb = zza.zzb;
                this.zzc = zza.zzc;
                this.zzd = zza.zzd;
                this.zze = zza.zze;
                this.zzf = zza.zzf;
                this.zzg = zza.zzg;
                this.zzh = zza.zzh;
                this.zzi = zza.zzi;
                this.zzj = zza.zzj;
                this.zzk = zza.zzk;
                this.zzl = str2;
                return;
            } catch (JSONException e) {
                Path$$ExternalSyntheticBUOutline0.m((Throwable) e);
                throw null;
            }
        }
        zzae.checkNotNull(publicKeyCredentialRpEntity);
        this.zza = publicKeyCredentialRpEntity;
        zzae.checkNotNull(publicKeyCredentialUserEntity);
        this.zzb = publicKeyCredentialUserEntity;
        zzae.checkNotNull(bArr);
        this.zzc = bArr;
        zzae.checkNotNull(arrayList);
        this.zzd = arrayList;
        this.zze = d;
        this.zzf = arrayList2;
        this.zzg = authenticatorSelectionCriteria;
        this.zzh = num;
        this.zzi = tokenBinding;
        if (str != null) {
            try {
                this.zzj = AttestationConveyancePreference.fromString(str);
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e2) {
                Path$$ExternalSyntheticBUOutline0.m((Throwable) e2);
                throw null;
            }
        } else {
            this.zzj = null;
        }
        this.zzk = authenticationExtensions;
        this.zzl = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PublicKeyCredentialCreationOptions zza(JSONObject jSONObject) {
        ArrayList arrayList;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria;
        AuthenticationExtensions authenticationExtensions;
        AttestationConveyancePreference attestationConveyancePreference;
        int i;
        zzak zzakVar;
        zzak zza;
        zzs zzsVar;
        zzu zzuVar;
        JSONArray jSONArray;
        String str;
        ArrayList arrayList2;
        JSONArray jSONArray2;
        String str2;
        zzbl zzblVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        String str3 = "id";
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = new PublicKeyCredentialRpEntity(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = new PublicKeyCredentialUserEntity(jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"), SizeKt.decodeUrlSafeNoPadding(jSONObject3.getString("id")));
        byte[] decodeUrlSafeNoPadding = SizeKt.decodeUrlSafeNoPadding(jSONObject.getString("challenge"));
        zzae.checkNotNull(decodeUrlSafeNoPadding);
        JSONArray jSONArray3 = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
            JSONObject jSONObject4 = jSONArray3.getJSONObject(i2);
            try {
                zzblVar = new zzbn(new PublicKeyCredentialParameters(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                zzblVar = zzaz.zza;
            }
            if (zzblVar.zzb()) {
                arrayList3.add(zzblVar.zza());
            }
        }
        Double valueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d) : null;
        int i3 = 11;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList4 = new ArrayList();
            int i4 = 0;
            while (i4 < jSONArray4.length()) {
                JSONObject jSONObject5 = jSONArray4.getJSONObject(i4);
                Parcelable.Creator<PublicKeyCredentialDescriptor> creator = PublicKeyCredentialDescriptor.CREATOR;
                String string2 = jSONObject5.getString("type");
                byte[] decode = Base64.decode(jSONObject5.getString(str3), i3);
                if (!jSONObject5.has("transports") || (jSONArray2 = jSONObject5.getJSONArray("transports")) == null) {
                    jSONArray = jSONArray4;
                    str = str3;
                    arrayList2 = null;
                } else {
                    HashSet hashSet = new HashSet(jSONArray2.length());
                    jSONArray = jSONArray4;
                    int i5 = 0;
                    while (i5 < jSONArray2.length()) {
                        String string3 = jSONArray2.getString(i5);
                        if (string3 == null || string3.isEmpty()) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                hashSet.add(Transport.fromString(string3));
                            } catch (Transport.UnsupportedTransportException unused2) {
                                Log.w("Transport", "Ignoring unrecognized transport ".concat(string3));
                            }
                        }
                        i5++;
                        str3 = str2;
                    }
                    str = str3;
                    arrayList2 = new ArrayList(hashSet);
                }
                arrayList4.add(new PublicKeyCredentialDescriptor(string2, decode, arrayList2));
                i4++;
                jSONArray4 = jSONArray;
                str3 = str;
                i3 = 11;
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
            authenticatorSelectionCriteria = new AuthenticatorSelectionCriteria(jSONObject6.has("requireResidentKey") ? Boolean.valueOf(jSONObject6.optBoolean("requireResidentKey")) : null, jSONObject6.has("authenticatorAttachment") ? jSONObject6.optString("authenticatorAttachment") : null, jSONObject6.has("userVerification") ? jSONObject6.optString("userVerification") : null, jSONObject6.has("residentKey") ? jSONObject6.optString("residentKey") : null);
        } else {
            authenticatorSelectionCriteria = null;
        }
        if (jSONObject.has("extensions")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
            FidoAppIdExtension fidoAppIdExtension = jSONObject7.has("fidoAppIdExtension") ? new FidoAppIdExtension(jSONObject7.getJSONObject("fidoAppIdExtension").getString(AppsFlyerProperties.APP_ID)) : null;
            if (jSONObject7.has(AppsFlyerProperties.APP_ID)) {
                fidoAppIdExtension = new FidoAppIdExtension(jSONObject7.getString(AppsFlyerProperties.APP_ID));
            }
            FidoAppIdExtension fidoAppIdExtension2 = fidoAppIdExtension;
            if (!jSONObject7.has("prf")) {
                i = 0;
                if (jSONObject7.has("prfAlreadyHashed")) {
                    zza = zzak.zza(jSONObject7.getJSONObject("prfAlreadyHashed"), true);
                } else {
                    zzakVar = null;
                    if (jSONObject7.has("cableAuthenticationExtension")) {
                        zzsVar = null;
                    } else {
                        JSONArray jSONArray5 = jSONObject7.getJSONArray("cableAuthenticationExtension");
                        ArrayList arrayList5 = new ArrayList();
                        while (i < jSONArray5.length()) {
                            JSONObject jSONObject8 = jSONArray5.getJSONObject(i);
                            arrayList5.add(new zzq(jSONObject8.getLong("version"), Base64.decode(jSONObject8.getString("clientEid"), 11), Base64.decode(jSONObject8.getString("authenticatorEid"), 11), Base64.decode(jSONObject8.getString("sessionPreKey"), 11)));
                            i++;
                        }
                        zzsVar = new zzs(arrayList5);
                    }
                    UserVerificationMethodExtension userVerificationMethodExtension = !jSONObject7.has("userVerificationMethodExtension") ? new UserVerificationMethodExtension(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")) : null;
                    zzz zzzVar = !jSONObject7.has("google_multiAssertionExtension") ? new zzz(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")) : null;
                    zzab zzabVar = !jSONObject7.has("google_sessionIdExtension") ? new zzab(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId")) : null;
                    zzad zzadVar = !jSONObject7.has("google_silentVerificationExtension") ? new zzad(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")) : null;
                    if (jSONObject7.has("devicePublicKeyExtension")) {
                        zzuVar = null;
                    } else {
                        jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                        zzuVar = new zzu();
                    }
                    authenticationExtensions = new AuthenticationExtensions(fidoAppIdExtension2, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, !jSONObject7.has("google_tunnelServerIdExtension") ? new zzag(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject7.has("google_thirdPartyPaymentExtension") ? new GoogleThirdPartyPaymentExtension(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, zzakVar, !jSONObject7.has("txAuthSimple") ? new zzaw(jSONObject7.getString("txAuthSimple")) : null, null);
                }
            } else {
                if (jSONObject7.has("prfAlreadyHashed")) {
                    throw new JSONException("both prf and prfAlreadyHashed extensions found");
                }
                i = 0;
                zza = zzak.zza(jSONObject7.getJSONObject("prf"), false);
            }
            zzakVar = zza;
            if (jSONObject7.has("cableAuthenticationExtension")) {
            }
            if (!jSONObject7.has("userVerificationMethodExtension")) {
            }
            if (!jSONObject7.has("google_multiAssertionExtension")) {
            }
            if (!jSONObject7.has("google_sessionIdExtension")) {
            }
            if (!jSONObject7.has("google_silentVerificationExtension")) {
            }
            if (jSONObject7.has("devicePublicKeyExtension")) {
            }
            authenticationExtensions = new AuthenticationExtensions(fidoAppIdExtension2, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, !jSONObject7.has("google_tunnelServerIdExtension") ? new zzag(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject7.has("google_thirdPartyPaymentExtension") ? new GoogleThirdPartyPaymentExtension(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, zzakVar, !jSONObject7.has("txAuthSimple") ? new zzaw(jSONObject7.getString("txAuthSimple")) : null, null);
        } else {
            authenticationExtensions = null;
        }
        if (jSONObject.has("attestation")) {
            try {
                attestationConveyancePreference = AttestationConveyancePreference.fromString(jSONObject.getString("attestation"));
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e);
                attestationConveyancePreference = AttestationConveyancePreference.NONE;
            }
        } else {
            attestationConveyancePreference = null;
        }
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, decodeUrlSafeNoPadding, arrayList3, valueOf, arrayList, authenticatorSelectionCriteria, null, null, attestationConveyancePreference == null ? null : attestationConveyancePreference.zzb, authenticationExtensions, null, null);
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        List list2 = publicKeyCredentialCreationOptions.zzd;
        List list3 = publicKeyCredentialCreationOptions.zzf;
        if (zzae.equal(this.zza, publicKeyCredentialCreationOptions.zza) && zzae.equal(this.zzb, publicKeyCredentialCreationOptions.zzb) && Arrays.equals(this.zzc, publicKeyCredentialCreationOptions.zzc) && zzae.equal(this.zze, publicKeyCredentialCreationOptions.zze)) {
            List list4 = this.zzd;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.zzf) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && zzae.equal(this.zzg, publicKeyCredentialCreationOptions.zzg) && zzae.equal(this.zzh, publicKeyCredentialCreationOptions.zzh) && zzae.equal(this.zzi, publicKeyCredentialCreationOptions.zzi) && zzae.equal(this.zzj, publicKeyCredentialCreationOptions.zzj) && zzae.equal(this.zzk, publicKeyCredentialCreationOptions.zzk) && zzae.equal(this.zzl, publicKeyCredentialCreationOptions.zzl))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)), this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String encodeUrlSafeNoPadding = SizeKt.encodeUrlSafeNoPadding(this.zzc);
        String valueOf3 = String.valueOf(this.zzd);
        String valueOf4 = String.valueOf(this.zzf);
        String valueOf5 = String.valueOf(this.zzg);
        String valueOf6 = String.valueOf(this.zzi);
        String valueOf7 = String.valueOf(this.zzj);
        String valueOf8 = String.valueOf(this.zzk);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        Boxes$$ExternalSyntheticOutline1.m(m, encodeUrlSafeNoPadding, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        m.append(this.zze);
        m.append(", \n excludeList=");
        m.append(valueOf4);
        m.append(", \n authenticatorSelection=");
        m.append(valueOf5);
        m.append(", \n requestId=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.zzh, ", \n tokenBinding=", valueOf6, ", \n attestationConveyancePreference=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, valueOf7, ", \n authenticationExtensions=", valueOf8, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.zza, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zzb, i);
        MooncakeHeaderViewKt.writeByteArray(parcel, 4, this.zzc);
        MooncakeHeaderViewKt.writeTypedList(parcel, 5, this.zzd);
        Double d = this.zze;
        if (d != null) {
            MooncakeHeaderViewKt.zza(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        MooncakeHeaderViewKt.writeTypedList(parcel, 7, this.zzf);
        MooncakeHeaderViewKt.writeParcelable(parcel, 8, this.zzg, i);
        MooncakeHeaderViewKt.writeIntegerObject(parcel, 9, this.zzh);
        MooncakeHeaderViewKt.writeParcelable(parcel, 10, this.zzi, i);
        AttestationConveyancePreference attestationConveyancePreference = this.zzj;
        MooncakeHeaderViewKt.writeString(parcel, 11, attestationConveyancePreference == null ? null : attestationConveyancePreference.zzb);
        MooncakeHeaderViewKt.writeParcelable(parcel, 12, this.zzk, i);
        MooncakeHeaderViewKt.writeString(parcel, 13, this.zzl);
        MooncakeHeaderViewKt.writeParcelable(parcel, 14, this.zzm, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    public PublicKeyCredentialCreationOptions(String str) {
        try {
            PublicKeyCredentialCreationOptions zza = zza(new JSONObject(str));
            this.zza = zza.zza;
            this.zzb = zza.zzb;
            this.zzc = zza.zzc;
            this.zzd = zza.zzd;
            this.zze = zza.zze;
            this.zzf = zza.zzf;
            this.zzg = zza.zzg;
            this.zzh = zza.zzh;
            this.zzi = zza.zzi;
            this.zzj = zza.zzj;
            this.zzk = zza.zzk;
            this.zzl = str;
        } catch (JSONException e) {
            Path$$ExternalSyntheticBUOutline0.m((Throwable) e);
            throw null;
        }
    }
}
