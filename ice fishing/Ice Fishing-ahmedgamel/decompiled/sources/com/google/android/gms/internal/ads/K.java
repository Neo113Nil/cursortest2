package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class K implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f25815a;

    public K(M m4, Runnable runnable) {
        this.f25815a = runnable;
        Objects.requireNonNull(m4);
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z3) {
        this.f25815a.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z3) {
        this.f25815a.run();
    }
}
