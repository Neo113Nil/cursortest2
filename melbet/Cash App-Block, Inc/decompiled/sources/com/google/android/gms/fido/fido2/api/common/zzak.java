package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.fido.zzfs;
import com.google.android.gms.internal.fido.zzfw;
import com.google.android.gms.internal.fido.zzfx;
import com.google.android.gms.internal.fido.zzfz;
import com.google.android.gms.internal.fido.zzga;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new com.google.android.gms.common.zzs(8);
    public static final byte[] zza = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] zzb;

    public zzak(byte[][] bArr) {
        zzae.checkArgument(bArr != null);
        zzae.checkArgument(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            zzae.checkArgument(i == 0 || bArr[i] != null);
            int i2 = i + 1;
            zzae.checkArgument(bArr[i2] != null);
            int length = bArr[i2].length;
            zzae.checkArgument(length == 32 || length == 64);
            i += 2;
        }
        this.zzb = bArr;
    }

    public static zzak zza(JSONObject jSONObject, boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z) {
                    arrayList.add(zzd(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(zze(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(SizeKt.decodeUrlSafeNoPadding(next));
                    if (z) {
                        arrayList.add(zzd(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(zze(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new zzak((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject zzb(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] zzc(byte[] bArr) {
        zzfz zzfzVar;
        int i = zzfx.$r8$clinit;
        zzga zzgaVar = zzfw.zza;
        int i2 = zzgaVar.zzb;
        MessageDigest messageDigest = zzgaVar.zza;
        try {
            if (zzgaVar.zzc) {
                try {
                    zzfzVar = new zzfz((MessageDigest) messageDigest.clone(), i2);
                } catch (CloneNotSupportedException unused) {
                }
                MessageDigest messageDigest2 = (MessageDigest) zzfzVar.zza;
                byte[] bArr2 = zza;
                bArr2.getClass();
                int length = bArr2.length;
                if (!zzfzVar.zzc) {
                    a$$ExternalSyntheticBUOutline0.m$1("Cannot re-use a Hasher after calling hash() on it");
                    return null;
                }
                messageDigest2.update(bArr2, 0, length);
                bArr.getClass();
                int length2 = bArr.length;
                if (zzfzVar.zzc) {
                    a$$ExternalSyntheticBUOutline0.m$1("Cannot re-use a Hasher after calling hash() on it");
                    return null;
                }
                messageDigest2.update(bArr, 0, length2);
                if (zzfzVar.zzc) {
                    a$$ExternalSyntheticBUOutline0.m$1("Cannot re-use a Hasher after calling hash() on it");
                    return null;
                }
                zzfzVar.zzc = true;
                int i3 = zzfzVar.zzb;
                return (byte[]) (i3 == messageDigest2.getDigestLength() ? new zzfs(messageDigest2.digest()) : new zzfs(Arrays.copyOf(messageDigest2.digest(), i3))).zza.clone();
            }
            zzfzVar = new zzfz(MessageDigest.getInstance(messageDigest.getAlgorithm()), i2);
            MessageDigest messageDigest22 = (MessageDigest) zzfzVar.zza;
            byte[] bArr22 = zza;
            bArr22.getClass();
            int length3 = bArr22.length;
            if (!zzfzVar.zzc) {
            }
        } catch (NoSuchAlgorithmException e) {
            a$$ExternalSyntheticBUOutline0.m$1(e);
            return null;
        }
    }

    public static byte[] zzd(JSONObject jSONObject) {
        byte[] decodeUrlSafeNoPadding = SizeKt.decodeUrlSafeNoPadding(jSONObject.getString("first"));
        if (decodeUrlSafeNoPadding.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return decodeUrlSafeNoPadding;
        }
        byte[] decodeUrlSafeNoPadding2 = SizeKt.decodeUrlSafeNoPadding(jSONObject.getString("second"));
        if (decodeUrlSafeNoPadding2.length == 32) {
            return com.google.android.gms.internal.fido.zzh.zza(decodeUrlSafeNoPadding, decodeUrlSafeNoPadding2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] zze(JSONObject jSONObject) {
        byte[] zzc = zzc(SizeKt.decodeUrlSafeNoPadding(jSONObject.getString("first")));
        return !jSONObject.has("second") ? zzc : com.google.android.gms.internal.fido.zzh.zza(zzc, zzc(SizeKt.decodeUrlSafeNoPadding(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzak) {
            return Arrays.deepEquals(this.zzb, ((zzak) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (byte[] bArr : this.zzb) {
            if (bArr != null) {
                i ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return i;
    }

    public final String toString() {
        byte[][] bArr = this.zzb;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i = 0; i < bArr.length; i += 2) {
                if (bArr[i] == null) {
                    jSONObject.put("eval", zzb(bArr[i + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(SizeKt.encodeUrlSafeNoPadding(bArr[i]), zzb(bArr[i + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PrfExtension{Exception:", e.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeByteArrayArray(parcel, 1, this.zzb);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
