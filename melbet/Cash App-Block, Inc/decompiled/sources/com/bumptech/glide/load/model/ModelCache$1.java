package com.bumptech.glide.load.model;

import com.bumptech.glide.util.LruCache;
import java.util.ArrayDeque;

/* loaded from: classes4.dex */
public final class ModelCache$1 extends LruCache {
    @Override // com.bumptech.glide.util.LruCache
    public final void onItemEvicted(Object obj, Object obj2) {
        ModelCache$ModelKey modelCache$ModelKey = (ModelCache$ModelKey) obj;
        modelCache$ModelKey.getClass();
        ArrayDeque arrayDeque = ModelCache$ModelKey.KEY_QUEUE;
        synchronized (arrayDeque) {
            arrayDeque.offer(modelCache$ModelKey);
        }
    }
}
