package com.squareup.cash.e2ee.signature.local;

import com.google.crypto.tink.KeysetHandle;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes.dex */
public final class RealLocalSignatureStore {
    public final Lazy delegate$delegate = LazyKt.lazy(new RealBrazeManager$$ExternalSyntheticLambda0(this, 15));
    public final KeysetHandle factory;

    public RealLocalSignatureStore(KeysetHandle keysetHandle) {
        this.factory = keysetHandle;
    }
}
