package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import coil3.size.SizeKt;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.fido.zzcj;
import com.google.android.gms.internal.fido.zzgc;
import com.google.android.gms.internal.fido.zzge;
import com.google.android.gms.internal.fido.zzgr;
import com.google.android.gms.internal.fido.zzgu;
import com.google.android.gms.internal.fido.zzhi;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.fido.zzhk;
import com.google.android.gms.internal.fido.zzhm;
import com.google.android.gms.internal.fido.zzhn;
import com.google.android.gms.internal.fido.zzho;
import com.google.android.gms.internal.fido.zzhp;
import com.google.android.gms.internal.fido.zzhs;
import com.google.android.gms.internal.location.zzef;
import com.google.android.gms.maps.zzah;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new zzef(2);
    public final zzgu zza;
    public final zzgu zzb;
    public final zzgu zzc;
    public final String[] zzd;

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        zzae.checkNotNull(bArr);
        zzgu zzl = zzgu.zzl(bArr.length, bArr);
        zzae.checkNotNull(bArr2);
        zzgu zzl2 = zzgu.zzl(bArr2.length, bArr2);
        zzae.checkNotNull(bArr3);
        zzgu zzl3 = zzgu.zzl(bArr3.length, bArr3);
        this.zza = zzl;
        this.zzb = zzl2;
        this.zzc = zzl3;
        zzae.checkNotNull(strArr);
        this.zzd = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return zzae.equal(this.zza, authenticatorAttestationResponse.zza) && zzae.equal(this.zzb, authenticatorAttestationResponse.zzb) && zzae.equal(this.zzc, authenticatorAttestationResponse.zzc);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.zza})), Integer.valueOf(Arrays.hashCode(new Object[]{this.zzb})), Integer.valueOf(Arrays.hashCode(new Object[]{this.zzc}))});
    }

    public final String toString() {
        zzah zzahVar = new zzah(getClass().getSimpleName(), 1);
        zzgc zzgcVar = zzge.zze;
        byte[] zzm = this.zza.zzm();
        zzahVar.zzb(zzgcVar.zzg(zzm.length, zzm), "keyHandle");
        byte[] zzm2 = this.zzb.zzm();
        zzahVar.zzb(zzgcVar.zzg(zzm2.length, zzm2), "clientDataJSON");
        byte[] zzm3 = this.zzc.zzm();
        zzahVar.zzb(zzgcVar.zzg(zzm3.length, zzm3), "attestationObject");
        zzahVar.zzb(Arrays.toString(this.zzd), "transports");
        return zzahVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeByteArray(parcel, 2, this.zza.zzm());
        MooncakeHeaderViewKt.writeByteArray(parcel, 3, this.zzb.zzm());
        MooncakeHeaderViewKt.writeByteArray(parcel, 4, this.zzc.zzm());
        MooncakeHeaderViewKt.writeStringArray(parcel, 5, this.zzd);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x021d A[Catch: JSONException -> 0x01af, TRY_LEAVE, TryCatch #13 {JSONException -> 0x01af, blocks: (B:54:0x0207, B:56:0x021d, B:62:0x0141, B:64:0x014c, B:69:0x0161, B:72:0x017d, B:74:0x0192, B:76:0x0197, B:77:0x01b5, B:78:0x01ba, B:79:0x01bb, B:80:0x01c0, B:85:0x01cb, B:87:0x01d8, B:89:0x01e5, B:90:0x01f9, B:91:0x01fe, B:92:0x01ff, B:93:0x0204, B:96:0x022a, B:97:0x022f, B:100:0x0233, B:101:0x023a, B:105:0x023b, B:106:0x0243, B:113:0x0247, B:118:0x0251, B:119:0x0258, B:114:0x024d, B:127:0x025f, B:128:0x0266, B:131:0x0268, B:132:0x026f, B:138:0x0276, B:139:0x027d, B:142:0x027f, B:143:0x0286, B:148:0x0288, B:149:0x0291, B:22:0x0063), top: B:21:0x0063, inners: #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject zza() {
        JSONObject jSONObject;
        zzgu zzguVar;
        long j;
        long j2;
        JSONObject jSONObject2;
        byte[] bArr;
        String[] strArr = this.zzd;
        try {
            jSONObject = new JSONObject();
            zzgu zzguVar2 = this.zzb;
            if (zzguVar2 != null) {
                jSONObject.put("clientDataJSON", SizeKt.encodeUrlSafeNoPadding(zzguVar2.zzm()));
            }
            zzguVar = this.zzc;
            if (zzguVar != null) {
                jSONObject.put("attestationObject", SizeKt.encodeUrlSafeNoPadding(zzguVar.zzm()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i].equals("cable")) {
                    jSONArray.put(i, "hybrid");
                } else {
                    jSONArray.put(i, strArr[i]);
                }
            }
            jSONObject.put("transports", jSONArray);
        } catch (JSONException e) {
            e = e;
        }
        try {
            try {
                try {
                    zzhp zzhpVar = (zzhp) ((zzhm) zzhp.zzj(zzguVar.zzm()).zzc(zzhm.class)).zzb.get(new zzhn("authData"));
                    if (zzhpVar == null) {
                        try {
                            throw new IllegalArgumentException("attestation object missing authData");
                        } catch (zzho e2) {
                            e = e2;
                            throw new IllegalArgumentException("authData value has wrong type", e);
                        }
                    }
                    zzgu zzguVar3 = ((zzhi) zzhpVar.zzc(zzhi.class)).zza;
                    byte[] bArr2 = zzguVar3.zza;
                    ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(bArr2, 0, zzguVar3.zzd()).asReadOnlyBuffer();
                    try {
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 32);
                        if ((asReadOnlyBuffer.get() & 64) == 0) {
                            try {
                                throw new IllegalArgumentException("authData does not include credential data");
                            } catch (IllegalArgumentException e3) {
                                e = e3;
                                throw new IllegalArgumentException("ill-formed authenticator data", e);
                            }
                        }
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 4);
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 16);
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + asReadOnlyBuffer.getShort());
                        try {
                            int position = asReadOnlyBuffer.position();
                            int zzj = zzgu.zzj(position, bArr2.length, zzguVar3.zzd());
                            zzhs zzhsVar = new zzhs((zzj == 0 ? zzgu.zzb : new zzgr(bArr2, position, zzj)).zzh());
                            try {
                                zzhp zzb = com.google.android.gms.internal.fido.zzh.zzb(zzhsVar);
                                try {
                                    zzhsVar.close();
                                } catch (IOException unused) {
                                }
                                zzcj zzcjVar = ((zzhm) zzb.zzc(zzhm.class)).zzb;
                                zzhp zzhpVar2 = (zzhp) zzcjVar.get(new zzhk(3L));
                                zzhp zzhpVar3 = (zzhp) zzcjVar.get(new zzhk(1L));
                                if (zzhpVar2 == null || zzhpVar3 == null) {
                                    throw new IllegalArgumentException("COSE key missing required fields");
                                }
                                try {
                                    j = ((zzhk) zzhpVar2.zzc(zzhk.class)).zza;
                                    j2 = ((zzhk) zzhpVar3.zzc(zzhk.class)).zza;
                                } catch (zzho e4) {
                                    e = e4;
                                }
                                try {
                                    if (j2 != 1) {
                                        if (j2 != 2) {
                                            jSONObject2 = jSONObject;
                                            bArr = null;
                                            JSONObject jSONObject3 = jSONObject2;
                                            jSONObject3.put("authenticatorData", SizeKt.encodeUrlSafeNoPadding(zzguVar3.zzm()));
                                            jSONObject3.put("publicKeyAlgorithm", j);
                                            if (bArr != null) {
                                                jSONObject3.put("publicKey", Base64.encodeToString(bArr, 11));
                                            }
                                            return jSONObject3;
                                        }
                                        j2 = 2;
                                    }
                                    zzhp zzhpVar4 = (zzhp) zzcjVar.get(new zzhk(-1L));
                                    if (zzhpVar4 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    long j3 = ((zzhk) zzhpVar4.zzc(zzhk.class)).zza;
                                    if (j2 == 2 && j3 == 1) {
                                        zzhp zzhpVar5 = (zzhp) zzcjVar.get(new zzhk(-2L));
                                        zzhp zzhpVar6 = (zzhp) zzcjVar.get(new zzhk(-3L));
                                        if (zzhpVar5 == null || zzhpVar6 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        zzgu zzguVar4 = ((zzhi) zzhpVar5.zzc(zzhi.class)).zza;
                                        zzgu zzguVar5 = ((zzhi) zzhpVar6.zzc(zzhi.class)).zza;
                                        if (zzguVar4.zza.length != 32 || zzguVar5.zza.length != 32) {
                                            throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                        }
                                        bArr = com.google.android.gms.internal.fido.zzh.zza(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), zzguVar4.zzm(), zzguVar5.zzm());
                                    } else if (j2 == 1 && j3 == 6) {
                                        zzhp zzhpVar7 = (zzhp) zzcjVar.get(new zzhk(-2L));
                                        if (zzhpVar7 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        zzgu zzguVar6 = ((zzhi) zzhpVar7.zzc(zzhi.class)).zza;
                                        if (zzguVar6.zza.length != 32) {
                                            throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                        }
                                        bArr = com.google.android.gms.internal.fido.zzh.zza(Base64.decode("MCowBQYDK2VwAyEA", 0), zzguVar6.zzm());
                                    } else {
                                        bArr = null;
                                    }
                                    JSONObject jSONObject32 = jSONObject2;
                                    jSONObject32.put("authenticatorData", SizeKt.encodeUrlSafeNoPadding(zzguVar3.zzm()));
                                    jSONObject32.put("publicKeyAlgorithm", j);
                                    if (bArr != null) {
                                    }
                                    return jSONObject32;
                                } catch (zzho e5) {
                                    e = e5;
                                    throw new IllegalArgumentException("COSE key ill-formed", e);
                                }
                                jSONObject2 = jSONObject;
                            } finally {
                                try {
                                    try {
                                        zzhsVar.close();
                                    } catch (zzhj | zzho e6) {
                                        e = e6;
                                        throw new IllegalArgumentException("failed to parse COSE key", e);
                                    }
                                } catch (IOException unused2) {
                                }
                            }
                        } catch (zzhj | zzho e7) {
                            e = e7;
                        }
                    } catch (IllegalArgumentException e8) {
                        e = e8;
                    }
                } catch (zzho e9) {
                    e = e9;
                }
            } catch (zzhj | zzho e10) {
                throw new IllegalArgumentException("failed to parse attestation object", e10);
            }
        } catch (JSONException e11) {
            e = e11;
            OptionalProvider$$ExternalSyntheticLambda0.m("Error encoding AuthenticatorAttestationResponse to JSON object", (Throwable) e);
            return null;
        }
    }
}
