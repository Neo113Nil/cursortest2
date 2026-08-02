package com.bumptech.glide.util.pool;

import androidx.core.util.Pools$SynchronizedPool;
import androidx.transition.Transition;
import com.caverock.androidsvg.SVG;

/* loaded from: classes4.dex */
public abstract class FactoryPools {
    public static final Transition.AnonymousClass1 EMPTY_RESETTER = new Transition.AnonymousClass1();

    public interface Factory {
        Object create();
    }

    public interface Poolable {
        StateVerifier$DefaultStateVerifier getVerifier();
    }

    public interface Resetter {
        void reset(Object obj);
    }

    public static SVG threadSafe(int i, Factory factory) {
        return new SVG(16, new Pools$SynchronizedPool(i), factory, EMPTY_RESETTER);
    }
}
