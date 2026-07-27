package com.instagram.common.viewpoint.core;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0871Ee implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ C0872Ef A00;
    public final /* synthetic */ C07579h A01;

    public C0871Ee(C0872Ef c0872Ef, C07579h c07579h) {
        this.A00 = c0872Ef;
        this.A01 = c07579h;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z3) {
        this.A01.A0L();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z3) {
        this.A01.A0L();
    }
}
