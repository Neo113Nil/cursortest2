package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.fido.zzgu;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new com.google.android.gms.common.zzs(29);
    public final boolean zza;
    public final zzgu zzb;

    public zzh(boolean z, zzgu zzguVar) {
        this.zza = z;
        this.zzb = zzguVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.zza == zzhVar.zza && zzae.equal(this.zzb, zzhVar.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AuthenticationExtensionsPrfOutputs{", zza().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza ? 1 : 0);
        zzgu zzguVar = this.zzb;
        MooncakeHeaderViewKt.writeByteArray(parcel, 2, zzguVar == null ? null : zzguVar.zzm());
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.zza) {
                jSONObject.put("enabled", true);
            }
            zzgu zzguVar = this.zzb;
            byte[] zzm = zzguVar == null ? null : zzguVar.zzm();
            if (zzm != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(zzm, 32), 11));
                if (zzm.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(zzm, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", (Throwable) e);
            return null;
        }
    }
}
