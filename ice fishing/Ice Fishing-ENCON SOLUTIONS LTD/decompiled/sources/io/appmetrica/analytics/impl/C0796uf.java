package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.uf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0796uf {

    /* renamed from: a, reason: collision with root package name */
    public final C0693qf f6997a;

    public C0796uf(PreloadInfo preloadInfo, PublicLogger publicLogger, boolean z2) {
        if (preloadInfo != null) {
            if (TextUtils.isEmpty(preloadInfo.getTrackingId())) {
                publicLogger.error("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.", new Object[0]);
            } else {
                this.f6997a = new C0693qf(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z2, S7.f5045c);
            }
        }
    }
}
