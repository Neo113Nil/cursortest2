package com.google.crypto.tink.prf;

import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.util.Bytes;
import com.squareup.cash.db.WireAdapter;

/* loaded from: classes4.dex */
public final class AesCmacPrfKey extends TransactorKt {
    public final WireAdapter keyBytes;
    public final AesCmacPrfParameters parameters;

    public AesCmacPrfKey(AesCmacPrfParameters aesCmacPrfParameters, WireAdapter wireAdapter) {
        this.parameters = aesCmacPrfParameters;
        this.keyBytes = wireAdapter;
    }

    public static AesCmacPrfKey create(AesCmacPrfParameters aesCmacPrfParameters, WireAdapter wireAdapter) {
        if (aesCmacPrfParameters.keySizeBytes == ((Bytes) wireAdapter.adapter).data.length) {
            return new AesCmacPrfKey(aesCmacPrfParameters, wireAdapter);
        }
        a$$ExternalSyntheticBUOutline0.m$6("Key size mismatch");
        return null;
    }

    @Override // androidx.room.TransactorKt
    public final Integer getIdRequirementOrNull() {
        return null;
    }

    @Override // androidx.room.TransactorKt
    public final Parameters getParameters() {
        return this.parameters;
    }
}
