package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* loaded from: classes2.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final Spatializer f26994a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26995b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f26996c;

    /* renamed from: d, reason: collision with root package name */
    public final K f26997d;

    public M(Context context, Runnable runnable, Boolean bool) {
        Spatializer spatializer;
        int immersiveAudioLevel;
        AudioManager b9 = context == null ? null : AbstractC2659Kg.b(context);
        if (b9 == null || (bool != null && bool.booleanValue())) {
            this.f26994a = null;
            this.f26995b = false;
            this.f26996c = null;
            this.f26997d = null;
            return;
        }
        spatializer = b9.getSpatializer();
        this.f26994a = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.f26995b = immersiveAudioLevel != 0;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        Handler handler = new Handler(myLooper);
        this.f26996c = handler;
        K k9 = new K(this, runnable);
        this.f26997d = k9;
        spatializer.addOnSpatializerStateChangedListener(new L(handler, 0), k9);
    }

    public final List a() {
        boolean isAvailable;
        Spatializer spatializer;
        boolean isEnabled;
        Spatializer spatializer2 = this.f26994a;
        if (spatializer2 != null && this.f26995b) {
            isAvailable = spatializer2.isAvailable();
            if (isAvailable && (spatializer = this.f26994a) != null) {
                isEnabled = spatializer.isEnabled();
                if (isEnabled) {
                    if (Build.VERSION.SDK_INT < 36) {
                        return RB.j(252);
                    }
                    Spatializer spatializer3 = this.f26994a;
                    spatializer3.getClass();
                    return P.c.c(spatializer3).getSpatializedChannelMasks();
                }
            }
        }
        PB pb = RB.f27933u;
        return C3523lC.f32525x;
    }
}
