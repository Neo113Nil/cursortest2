package com.google.crypto.tink.aead;

import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.util.Bytes;
import com.squareup.cash.db.WireAdapter;

/* loaded from: classes.dex */
public final class AesCtrHmacAeadKey extends AeadKey {
    public final WireAdapter aesKeyBytes;
    public final WireAdapter hmacKeyBytes;
    public final Integer idRequirement;
    public final Bytes outputPrefix;
    public final AesCtrHmacAeadParameters parameters;

    public AesCtrHmacAeadKey(AesCtrHmacAeadParameters aesCtrHmacAeadParameters, WireAdapter wireAdapter, WireAdapter wireAdapter2, Bytes bytes, Integer num) {
        this.parameters = aesCtrHmacAeadParameters;
        this.aesKeyBytes = wireAdapter;
        this.hmacKeyBytes = wireAdapter2;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    @Override // androidx.room.TransactorKt
    public final Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public final Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    @Override // androidx.room.TransactorKt
    public final Parameters getParameters() {
        return this.parameters;
    }
}
