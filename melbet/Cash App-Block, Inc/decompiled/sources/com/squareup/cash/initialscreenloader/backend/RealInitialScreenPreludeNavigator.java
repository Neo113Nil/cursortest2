package com.squareup.cash.initialscreenloader.backend;

import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class RealInitialScreenPreludeNavigator {
    public final Job initialScreenLoaded;

    public RealInitialScreenPreludeNavigator(Job job) {
        this.initialScreenLoaded = job;
    }
}
