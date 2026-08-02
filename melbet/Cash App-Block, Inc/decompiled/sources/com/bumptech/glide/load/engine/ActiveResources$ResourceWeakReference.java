package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Util;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class ActiveResources$ResourceWeakReference extends WeakReference {
    public final boolean isCacheable;
    public final Key key;
    public Resource resource;

    public ActiveResources$ResourceWeakReference(Key key, EngineResource engineResource, ReferenceQueue referenceQueue) {
        super(engineResource, referenceQueue);
        Util.checkNotNull(key, "Argument must not be null");
        this.key = key;
        boolean z = engineResource.isMemoryCacheable;
        this.resource = null;
        this.isCacheable = z;
    }
}
