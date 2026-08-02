package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0735w implements InterfaceC0764x {
    public final Context a;

    public C0735w(@NotNull Context context) {
        this.a = context;
    }

    public final String a() {
        R4 l = R4.l();
        Context context = this.a;
        Ua ua = l.v;
        if (ua == null) {
            synchronized (l) {
                try {
                    ua = l.v;
                    if (ua == null) {
                        ua = new Ua(context);
                        l.v = ua;
                    }
                } finally {
                }
            }
        }
        Bundle applicationMetaData = ua.d.getApplicationMetaData(ua.a);
        if (applicationMetaData != null) {
            return applicationMetaData.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
        }
        return null;
    }
}
