package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;

/* renamed from: io.appmetrica.analytics.impl.gb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0359gb {
    public final C0388hb a(FeatureInfo featureInfo) {
        int i;
        if (featureInfo.name == null && (i = featureInfo.reqGlEsVersion) != 0) {
            return new C0388hb("openGlFeature", i, (featureInfo.flags & 1) != 0);
        }
        return b(featureInfo);
    }

    public abstract C0388hb b(FeatureInfo featureInfo);
}
