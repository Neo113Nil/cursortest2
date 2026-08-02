package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0838x implements InterfaceC0867y {
    public final Context a;

    public C0838x(Context context) {
        this.a = context;
    }

    public final String a() {
        V4 l = V4.l();
        Context context = this.a;
        C0244cb c0244cb = l.w;
        if (c0244cb == null) {
            synchronized (l) {
                try {
                    c0244cb = l.w;
                    if (c0244cb == null) {
                        c0244cb = new C0244cb(context);
                        l.w = c0244cb;
                    }
                } finally {
                }
            }
        }
        Bundle applicationMetaData = c0244cb.d.getApplicationMetaData(c0244cb.a);
        if (applicationMetaData != null) {
            return applicationMetaData.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
        }
        return null;
    }
}
