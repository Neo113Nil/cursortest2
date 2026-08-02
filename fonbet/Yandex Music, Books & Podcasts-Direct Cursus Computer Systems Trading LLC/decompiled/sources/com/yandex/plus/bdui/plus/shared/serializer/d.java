package com.yandex.plus.bdui.plus.shared.serializer;

import android.graphics.Paint;
import com.yandex.plus.bdui.plus.action.t;
import com.yandex.plus.bdui.plus.action.y;
import com.yandex.plus.core.analytics.o;
import com.yandex.plus.core.benchmark.c0;
import com.yandex.plus.core.benchmark.z;
import com.yandex.plus.core.data.common.k;
import com.yandex.plus.core.data.common.m;
import com.yandex.plus.core.data.common.p;
import com.yandex.plus.core.data.common.r;
import com.yandex.plus.core.data.common.s;
import com.yandex.plus.core.graphql.daily.progress.b0;
import com.yandex.plus.core.graphql.daily.progress.d0;
import com.yandex.plus.core.graphql.daily.progress.v;
import defpackage.cqe;
import defpackage.e5b;
import defpackage.ern;
import defpackage.f9f;
import defpackage.jk6;
import defpackage.jyr;
import defpackage.kgm;
import defpackage.n9a;
import defpackage.n9h;
import defpackage.qy0;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tyo;
import defpackage.u75;
import defpackage.udb;
import defpackage.wsd;
import defpackage.z4f;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        o oVar;
        int i = 1;
        int i2 = 0;
        switch (this.a) {
            case 0:
                return new wsd(tkr.a, z4f.a, 1);
            case 1:
                return new y(u75.h(new t(new com.yandex.plus.bdui.flex.ui.content.c(29), null, null), new t(new com.yandex.plus.bdui.plus.webview.navigation.a(i2), null, null), new t(new com.yandex.plus.bdui.plus.webview.navigation.a(i), null, null)));
            case 2:
                return UUID.randomUUID();
            case 3:
                jk6 jk6Var = com.yandex.plus.core.analytics.logging.e.b;
                if (jk6Var == null || (oVar = (o) jk6Var.get()) == null) {
                    return null;
                }
                com.yandex.plus.core.analytics.logging.e.b = null;
                return oVar;
            case 4:
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
            case 5:
                return new ThreadLocal();
            case 6:
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                return e5bVar;
            case 7:
                jyr jyrVar = z.a;
                return 1000000L;
            case 8:
                e5b e5bVar2 = e5b.a;
                e5bVar2.getClass();
                return e5bVar2;
            case 9:
                jyr jyrVar2 = c0.d;
                return 1000000000L;
            case 10:
                return new com.yandex.plus.core.benchmark.pulse.c(1000000L, TimeUnit.MICROSECONDS);
            case 11:
                return new com.yandex.plus.core.benchmark.pulse.c(10000L, TimeUnit.MILLISECONDS);
            case 12:
                return new tyo("com.yandex.plus.core.data.common.PlusColor", ern.a(k.class), new f9f[]{ern.a(com.yandex.plus.core.data.common.f.class), ern.a(com.yandex.plus.core.data.common.j.class)}, new t9f[]{com.yandex.plus.core.data.common.d.a, com.yandex.plus.core.data.common.h.a}, new Annotation[0]);
            case 13:
                return new qy0(s.Companion.serializer(), 0);
            case 14:
                return new tyo("com.yandex.plus.core.data.common.PlusGradient", ern.a(s.class), new f9f[]{ern.a(com.yandex.plus.core.data.common.o.class), ern.a(r.class)}, new t9f[]{m.a, p.a}, new Annotation[0]);
            case 15:
                return new qy0(cqe.a, 0);
            case 16:
                return new qy0(n9a.a, 0);
            case 17:
                return new qy0(cqe.a, 0);
            case 18:
                return new qy0(n9a.a, 0);
            case 19:
                n9a n9aVar = n9a.a;
                return new n9h(n9aVar, n9aVar, 1);
            case 20:
                n9a n9aVar2 = n9a.a;
                return new n9h(n9aVar2, n9aVar2, 1);
            case 21:
                return new udb("com.yandex.plus.core.data.pay.PlusSelectPaymentMethodState.Cancel", com.yandex.plus.core.data.pay.h.INSTANCE, new Annotation[0]);
            case 22:
                return new udb("com.yandex.plus.core.data.pay.PlusSelectPaymentMethodState.Started", com.yandex.plus.core.data.pay.p.INSTANCE, new Annotation[0]);
            case 23:
                return new kgm(ern.a(com.yandex.plus.core.data.pay.c.class), new Annotation[0]);
            case 24:
                return new Paint(1);
            case 25:
                return new tyo("com.yandex.plus.core.graphql.daily.progress.ProgressColor", ern.a(com.yandex.plus.core.graphql.daily.progress.h.class), new f9f[]{ern.a(com.yandex.plus.core.graphql.daily.progress.d.class), ern.a(com.yandex.plus.core.graphql.daily.progress.g.class)}, new t9f[]{com.yandex.plus.core.graphql.daily.progress.b.a, com.yandex.plus.core.graphql.daily.progress.e.a}, new Annotation[0]);
            case 26:
                return com.yandex.plus.core.graphql.daily.progress.c0.Companion.serializer();
            case 27:
                return new qy0(com.yandex.plus.core.graphql.daily.progress.h.Companion.serializer(), 0);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new qy0(d0.a, 0);
            default:
                return new tyo("com.yandex.plus.core.graphql.daily.progress.ProgressGradient", ern.a(com.yandex.plus.core.graphql.daily.progress.c0.class), new f9f[]{ern.a(v.class), ern.a(b0.class)}, new t9f[]{com.yandex.plus.core.graphql.daily.progress.t.a, com.yandex.plus.core.graphql.daily.progress.z.a}, new Annotation[0]);
        }
    }
}
