package com.instagram.common.viewpoint.core;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0891Ee implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ C0892Ef A00;
    public final /* synthetic */ C07779h A01;

    public C0891Ee(C0892Ef c0892Ef, C07779h c07779h) {
        this.A00 = c0892Ef;
        this.A01 = c07779h;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z6) {
        this.A01.A0L();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z6) {
        this.A01.A0L();
    }
}
