package com.datadog.android.rum.tracking;

import android.view.View;

/* loaded from: classes4.dex */
public interface ActionTrackingStrategy extends TrackingStrategy {
    ViewTarget findTargetForScroll(View view, float f, float f2);

    ViewTarget findTargetForTap(View view, float f, float f2);
}
