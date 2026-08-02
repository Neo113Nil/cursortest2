package com.bumptech.glide.load.model;

import java.util.ArrayDeque;

/* loaded from: classes4.dex */
public final class ModelCache$ModelKey {
    public static final ArrayDeque KEY_QUEUE = new ArrayDeque(0);
    public Object model;

    public static ModelCache$ModelKey get(Object obj) {
        ModelCache$ModelKey modelCache$ModelKey;
        ArrayDeque arrayDeque = KEY_QUEUE;
        synchronized (arrayDeque) {
            modelCache$ModelKey = (ModelCache$ModelKey) arrayDeque.poll();
        }
        if (modelCache$ModelKey == null) {
            modelCache$ModelKey = new ModelCache$ModelKey();
        }
        modelCache$ModelKey.model = obj;
        return modelCache$ModelKey;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ModelCache$ModelKey) && this.model.equals(((ModelCache$ModelKey) obj).model);
    }

    public final int hashCode() {
        return this.model.hashCode();
    }
}
