package com.datadog.android.rum.internal;

import com.datadog.android.rum.RumSessionListener;

/* loaded from: classes4.dex */
public final class NoOpRumSessionListener implements RumSessionListener {
    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof NoOpRumSessionListener);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // com.datadog.android.rum.RumSessionListener
    public final void onSessionStarted(String str, boolean z) {
        str.getClass();
    }
}
