package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Util;

/* loaded from: classes4.dex */
public final class EngineResource implements Resource {
    public int acquired;
    public final boolean isMemoryCacheable;
    public final boolean isRecyclable;
    public boolean isRecycled;
    public final Key key;
    public final Engine listener;
    public final Resource resource;

    public EngineResource(Resource resource, boolean z, boolean z2, Key key, Engine engine) {
        Util.checkNotNull(resource, "Argument must not be null");
        this.resource = resource;
        this.isMemoryCacheable = z;
        this.isRecyclable = z2;
        this.key = key;
        Util.checkNotNull(engine, "Argument must not be null");
        this.listener = engine;
    }

    public final synchronized void acquire() {
        if (this.isRecycled) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.acquired++;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        return this.resource.get();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class getResourceClass() {
        return this.resource.getResourceClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return this.resource.getSize();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final synchronized void recycle() {
        if (this.acquired > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.isRecycled) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.isRecycled = true;
        if (this.isRecyclable) {
            this.resource.recycle();
        }
    }

    public final void release$2() {
        boolean z;
        synchronized (this) {
            int i = this.acquired;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.acquired = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.listener.onResourceReleased(this.key, this);
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.isMemoryCacheable + ", listener=" + this.listener + ", key=" + this.key + ", acquired=" + this.acquired + ", isRecycled=" + this.isRecycled + ", resource=" + this.resource + '}';
    }
}
