package com.google.crypto.tink.aead;

import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.util.Bytes;
import com.squareup.cash.db.WireAdapter;

/* loaded from: classes.dex */
public final class AesEaxKey extends AeadKey {
    public final Integer idRequirement;
    public final WireAdapter keyBytes;
    public final Bytes outputPrefix;
    public final AesEaxParameters parameters;

    public AesEaxKey(AesEaxParameters aesEaxParameters, WireAdapter wireAdapter, Bytes bytes, Integer num) {
        this.parameters = aesEaxParameters;
        this.keyBytes = wireAdapter;
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
