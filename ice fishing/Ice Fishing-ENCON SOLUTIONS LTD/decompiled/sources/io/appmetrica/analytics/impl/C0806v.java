package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0806v implements InterfaceC0832w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7031a;

    public C0806v(Context context) {
        this.f7031a = context;
    }

    public final String a() {
        C0294b4 l2 = C0294b4.l();
        Context context = this.f7031a;
        M9 m9 = l2.t;
        if (m9 == null) {
            synchronized (l2) {
                try {
                    m9 = l2.t;
                    if (m9 == null) {
                        m9 = new M9(context);
                        l2.t = m9;
                    }
                } finally {
                }
            }
        }
        Bundle applicationMetaData = m9.f4747d.getApplicationMetaData(m9.f4744a);
        if (applicationMetaData != null) {
            return applicationMetaData.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
        }
        return null;
    }
}
