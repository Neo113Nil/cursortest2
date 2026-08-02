package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import coil3.size.SizeKt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.fido.zzgu;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new com.google.android.gms.common.zzs(7);
    public final zzgu zze;
    public final zzgu zzf;
    public final zzgu zzg;
    public final int zzh;

    public zzai(zzgu zzguVar, zzgu zzguVar2, zzgu zzguVar3, int i) {
        this.zze = zzguVar;
        this.zzf = zzguVar2;
        this.zzg = zzguVar3;
        this.zzh = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        return zzae.equal(this.zze, zzaiVar.zze) && zzae.equal(this.zzf, zzaiVar.zzf) && zzae.equal(this.zzg, zzaiVar.zzg) && this.zzh == zzaiVar.zzh;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zze, this.zzf, this.zzg, Integer.valueOf(this.zzh)});
    }

    public final String toString() {
        zzgu zzguVar = this.zze;
        String encodeUrlSafeNoPadding = SizeKt.encodeUrlSafeNoPadding(zzguVar == null ? null : zzguVar.zzm());
        zzgu zzguVar2 = this.zzf;
        String encodeUrlSafeNoPadding2 = SizeKt.encodeUrlSafeNoPadding(zzguVar2 == null ? null : zzguVar2.zzm());
        zzgu zzguVar3 = this.zzg;
        String encodeUrlSafeNoPadding3 = SizeKt.encodeUrlSafeNoPadding(zzguVar3 != null ? zzguVar3.zzm() : null);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HmacSecretExtension{coseKeyAgreement=", encodeUrlSafeNoPadding, ", saltEnc=", encodeUrlSafeNoPadding2, ", saltAuth=");
        m.append(encodeUrlSafeNoPadding3);
        m.append(", getPinUvAuthProtocol=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.zzh, "}", m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        zzgu zzguVar = this.zze;
        MooncakeHeaderViewKt.writeByteArray(parcel, 1, zzguVar == null ? null : zzguVar.zzm());
        zzgu zzguVar2 = this.zzf;
        MooncakeHeaderViewKt.writeByteArray(parcel, 2, zzguVar2 == null ? null : zzguVar2.zzm());
        zzgu zzguVar3 = this.zzg;
        MooncakeHeaderViewKt.writeByteArray(parcel, 3, zzguVar3 != null ? zzguVar3.zzm() : null);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zzh);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
