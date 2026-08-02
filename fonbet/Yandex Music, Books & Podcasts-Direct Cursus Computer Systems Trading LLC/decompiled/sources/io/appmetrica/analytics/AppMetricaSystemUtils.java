package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.AbstractC0767x2;
import io.appmetrica.analytics.impl.C0738w2;
import io.appmetrica.analytics.impl.RunnableC0680u2;
import io.appmetrica.analytics.impl.RunnableC0709v2;

/* loaded from: classes5.dex */
public final class AppMetricaSystemUtils {
    public static void removeMetricaServiceDelay(@NonNull Context context, boolean z) {
        C0738w2 c0738w2 = AbstractC0767x2.a;
        Context applicationContext = context.getApplicationContext();
        c0738w2.c.a.a(applicationContext);
        c0738w2.d.a(applicationContext);
        if (z) {
            c0738w2.b.c(applicationContext);
        } else {
            c0738w2.a.execute(new RunnableC0709v2(c0738w2, applicationContext));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        if (r5 > 10000) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void setMetricaServiceDelay(@NonNull Context context, long j, boolean z) {
        C0738w2 c0738w2 = AbstractC0767x2.a;
        Context applicationContext = context.getApplicationContext();
        c0738w2.c.a.a(applicationContext);
        long j2 = j >= 0 ? 10000L : 0L;
        j = j2;
        c0738w2.d.a(applicationContext);
        if (z) {
            c0738w2.b.a(applicationContext, j);
        } else {
            c0738w2.a.execute(new RunnableC0680u2(c0738w2, applicationContext, j));
        }
    }

    public static void removeMetricaServiceDelay(@NonNull Context context) {
        removeMetricaServiceDelay(context, false);
    }

    public static void setMetricaServiceDelay(@NonNull Context context, long j) {
        setMetricaServiceDelay(context, j, false);
    }
}
