package com.bugsnag.android.internal.dag;

/* loaded from: classes.dex */
public interface Provider {
    Object get();

    Object getOrNull();

    boolean isComplete();
}
