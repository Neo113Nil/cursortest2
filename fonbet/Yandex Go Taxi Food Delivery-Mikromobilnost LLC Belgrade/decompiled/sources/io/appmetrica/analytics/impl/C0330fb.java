package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;

/* renamed from: io.appmetrica.analytics.impl.fb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C0330fb extends AbstractC0359gb {
    @Override // io.appmetrica.analytics.impl.AbstractC0359gb
    public final C0388hb b(FeatureInfo featureInfo) {
        return new C0388hb(featureInfo.name, -1, (featureInfo.flags & 1) != 0);
    }
}
