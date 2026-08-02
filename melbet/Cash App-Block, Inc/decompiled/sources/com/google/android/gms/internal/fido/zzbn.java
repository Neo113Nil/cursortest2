package com.google.android.gms.internal.fido;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzbn extends zzbl {
    public final PublicKeyCredentialParameters zza;

    public zzbn(PublicKeyCredentialParameters publicKeyCredentialParameters) {
        this.zza = publicKeyCredentialParameters;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbn) {
            return this.zza.equals(((zzbn) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final boolean zzb() {
        return true;
    }
}
