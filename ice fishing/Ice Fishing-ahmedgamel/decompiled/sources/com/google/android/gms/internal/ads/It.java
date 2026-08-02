package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class It implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final /* synthetic */ Thread newThread(Runnable runnable) {
        String str = AbstractC3182eu.f30782a;
        return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
    }
}
