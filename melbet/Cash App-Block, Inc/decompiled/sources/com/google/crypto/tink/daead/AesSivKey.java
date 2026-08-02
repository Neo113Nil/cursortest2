package com.google.crypto.tink.daead;

import androidx.room.TransactorKt;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.util.Bytes;
import com.squareup.cash.db.WireAdapter;

/* loaded from: classes.dex */
public final class AesSivKey extends TransactorKt {
    public final Integer idRequirement;
    public final WireAdapter keyBytes;
    public final Bytes outputPrefix;
    public final AesSivParameters parameters;

    public AesSivKey(AesSivParameters aesSivParameters, WireAdapter wireAdapter, Bytes bytes, Integer num) {
        this.parameters = aesSivParameters;
        this.keyBytes = wireAdapter;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    @Override // androidx.room.TransactorKt
    public final Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // androidx.room.TransactorKt
    public final Parameters getParameters() {
        return this.parameters;
    }
}
