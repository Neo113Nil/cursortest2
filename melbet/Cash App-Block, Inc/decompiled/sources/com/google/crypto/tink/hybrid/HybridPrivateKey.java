package com.google.crypto.tink.hybrid;

import androidx.room.TransactorKt;

/* loaded from: classes.dex */
public abstract class HybridPrivateKey extends TransactorKt {
    @Override // androidx.room.TransactorKt
    public final Integer getIdRequirementOrNull() {
        return mo2034getPublicKey().getIdRequirementOrNull();
    }

    public abstract TransactorKt getPublicKey();

    /* renamed from: getPublicKey */
    public abstract HybridPublicKey mo2034getPublicKey();
}
