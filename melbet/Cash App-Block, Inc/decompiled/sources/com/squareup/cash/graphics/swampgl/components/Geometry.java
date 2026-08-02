package com.squareup.cash.graphics.swampgl.components;

import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public interface Geometry {
    void draw();

    AABB getAABB();

    StateFlow getReady();

    default boolean isInstanced() {
        return false;
    }
}
