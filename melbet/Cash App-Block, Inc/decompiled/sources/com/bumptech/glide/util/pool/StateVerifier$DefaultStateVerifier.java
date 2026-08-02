package com.bumptech.glide.util.pool;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class StateVerifier$DefaultStateVerifier {
    public volatile boolean isReleased;

    public final void throwIfRecycled() {
        if (this.isReleased) {
            a$$ExternalSyntheticBUOutline0.m$1("Already released");
        }
    }
}
