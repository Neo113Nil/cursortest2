package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class K implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f26567a;

    public K(M m9, Runnable runnable) {
        this.f26567a = runnable;
        Objects.requireNonNull(m9);
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z6) {
        this.f26567a.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z6) {
        this.f26567a.run();
    }
}
