package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier$DefaultStateVerifier;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class SafeKeyGenerator$PoolableDigestContainer implements FactoryPools.Poolable {
    public final MessageDigest messageDigest;
    public final StateVerifier$DefaultStateVerifier stateVerifier = new StateVerifier$DefaultStateVerifier();

    public SafeKeyGenerator$PoolableDigestContainer(MessageDigest messageDigest) {
        this.messageDigest = messageDigest;
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    public final StateVerifier$DefaultStateVerifier getVerifier() {
        return this.stateVerifier;
    }
}
