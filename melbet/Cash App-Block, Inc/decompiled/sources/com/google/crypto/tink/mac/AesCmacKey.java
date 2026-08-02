package com.google.crypto.tink.mac;

import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.util.Bytes;
import com.squareup.cash.db.WireAdapter;

/* loaded from: classes.dex */
public final class AesCmacKey extends MacKey {
    public final WireAdapter aesKeyBytes;
    public final Integer idRequirement;
    public final Bytes outputPrefix;
    public final AesCmacParameters parameters;

    public AesCmacKey(AesCmacParameters aesCmacParameters, WireAdapter wireAdapter, Bytes bytes, Integer num) {
        this.parameters = aesCmacParameters;
        this.aesKeyBytes = wireAdapter;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    @Override // androidx.room.TransactorKt
    public final Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.mac.MacKey
    public final Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    @Override // androidx.room.TransactorKt
    public final Parameters getParameters() {
        return this.parameters;
    }
}
