package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.LruCache;

/* loaded from: classes4.dex */
public final class LruResourceCache extends LruCache {
    public Engine listener;

    @Override // com.bumptech.glide.util.LruCache
    public final int getSize(Object obj) {
        Resource resource = (Resource) obj;
        if (resource == null) {
            return 1;
        }
        return resource.getSize();
    }

    @Override // com.bumptech.glide.util.LruCache
    public final void onItemEvicted(Object obj, Object obj2) {
        Resource resource = (Resource) obj2;
        Engine engine = this.listener;
        if (engine == null || resource == null) {
            return;
        }
        engine.resourceRecycler.recycle(resource, true);
    }
}
