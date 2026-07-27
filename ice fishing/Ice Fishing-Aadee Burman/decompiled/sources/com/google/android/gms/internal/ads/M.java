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
    public final Spatializer f26203a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26204b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f26205c;

    /* renamed from: d, reason: collision with root package name */
    public final K f26206d;

    public M(Context context, Runnable runnable, Boolean bool) {
        Spatializer spatializer;
        int immersiveAudioLevel;
        AudioManager b9 = context == null ? null : AbstractC2639Kg.b(context);
        if (b9 == null || (bool != null && bool.booleanValue())) {
            this.f26203a = null;
            this.f26204b = false;
            this.f26205c = null;
            this.f26206d = null;
            return;
        }
        spatializer = b9.getSpatializer();
        this.f26203a = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.f26204b = immersiveAudioLevel != 0;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        Handler handler = new Handler(myLooper);
        this.f26205c = handler;
        K k9 = new K(this, runnable);
        this.f26206d = k9;
        spatializer.addOnSpatializerStateChangedListener(new L(handler, 0), k9);
    }

    public final List a() {
        boolean isAvailable;
        Spatializer spatializer;
        boolean isEnabled;
        Spatializer spatializer2 = this.f26203a;
        if (spatializer2 != null && this.f26204b) {
            isAvailable = spatializer2.isAvailable();
            if (isAvailable && (spatializer = this.f26203a) != null) {
                isEnabled = spatializer.isEnabled();
                if (isEnabled) {
                    if (Build.VERSION.SDK_INT < 36) {
                        return RB.j(252);
                    }
                    Spatializer spatializer3 = this.f26203a;
                    spatializer3.getClass();
                    return P.c.c(spatializer3).getSpatializedChannelMasks();
                }
            }
        }
        PB pb = RB.f27177u;
        return C3500lC.f31745x;
    }
}
