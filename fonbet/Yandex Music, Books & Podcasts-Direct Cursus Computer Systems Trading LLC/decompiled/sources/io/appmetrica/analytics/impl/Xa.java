package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public final class Xa extends Ya {
    @Override // io.appmetrica.analytics.impl.Ya
    public final Za b(@NonNull FeatureInfo featureInfo) {
        return new Za(featureInfo.name, -1, (featureInfo.flags & 1) != 0);
    }
}
