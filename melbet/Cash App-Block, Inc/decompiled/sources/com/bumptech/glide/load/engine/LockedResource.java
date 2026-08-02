package com.bumptech.glide.load.engine;

import androidx.transition.Transition;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier$DefaultStateVerifier;
import com.caverock.androidsvg.SVG;

/* loaded from: classes4.dex */
public final class LockedResource implements Resource, FactoryPools.Poolable {
    public static final SVG POOL = FactoryPools.threadSafe(20, new Transition.AnonymousClass1());
    public boolean isLocked;
    public boolean isRecycled;
    public final StateVerifier$DefaultStateVerifier stateVerifier = new StateVerifier$DefaultStateVerifier();
    public Resource toWrap;

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        return this.toWrap.get();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class getResourceClass() {
        return this.toWrap.getResourceClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return this.toWrap.getSize();
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    public final StateVerifier$DefaultStateVerifier getVerifier() {
        return this.stateVerifier;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final synchronized void recycle() {
        this.stateVerifier.throwIfRecycled();
        this.isRecycled = true;
        if (!this.isLocked) {
            this.toWrap.recycle();
            this.toWrap = null;
            POOL.release(this);
        }
    }

    public final synchronized void unlock() {
        this.stateVerifier.throwIfRecycled();
        if (!this.isLocked) {
            throw new IllegalStateException("Already unlocked");
        }
        this.isLocked = false;
        if (this.isRecycled) {
            recycle();
        }
    }
}
