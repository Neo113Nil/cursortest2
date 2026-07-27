package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class Ot implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final /* synthetic */ Thread newThread(Runnable runnable) {
        String str = AbstractC3548lu.f32613a;
        return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
    }
}
