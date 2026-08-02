package com.yandex.plus.core.benchmark.pulse;

import com.yandex.plus.core.analytics.logging.e;
import com.yandex.plus.core.benchmark.l;
import com.yandex.plus.core.benchmark.m;
import com.yandex.pulse.histogram.ComponentHistograms;
import defpackage.jyr;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.y2x;
import defpackage.z7o;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class b extends com.yandex.plus.core.benchmark.a {
    public final ComponentHistograms b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ComponentHistograms componentHistograms) {
        super(c.class);
        componentHistograms.getClass();
        this.b = componentHistograms;
    }

    @Override // com.yandex.plus.core.benchmark.a
    public final void b(l lVar, m mVar, Map map) {
        String str;
        Object t7oVar;
        c cVar = (c) mVar;
        lVar.getClass();
        TimeUnit timeUnit = cVar.b;
        int i = a.a[timeUnit.ordinal()];
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        if (i == 1) {
            str = " (ns)";
        } else if (i != 2) {
            str = "";
            timeUnit2 = timeUnit;
        } else {
            str = " (us)";
        }
        try {
            r7o r7oVar = z7o.b;
            String str2 = lVar.a + str;
            timeUnit2.getClass();
            ComponentHistograms componentHistograms = this.b;
            long j = cVar.a;
            componentHistograms.getClass();
            y2x.u(componentHistograms, str2, timeUnit2.toMillis(1L), timeUnit2.toMillis(j), 50).c(timeUnit.convert(lVar.b(), TimeUnit.NANOSECONDS), timeUnit2);
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
            jyr jyrVar = e.a;
            e.e(com.yandex.plus.core.analytics.logging.a.d, bVar, "Performance histogram sending is failed with exception!", a);
        }
    }
}
