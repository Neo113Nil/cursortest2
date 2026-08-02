package ru.yandex.taxi.tooltips.repository;

import defpackage.cne0;
import defpackage.dne0;
import defpackage.ffx;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.jse;
import defpackage.mdh;
import defpackage.ogu0;
import defpackage.pvz0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wls;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes6.dex */
public final class b {
    public final tse a;
    public final jse b;
    public final cne0 c;
    public final ConcurrentHashMap d;
    public final i3y e;
    public final n0 f;

    public b(dne0 dne0Var, tt2 tt2Var, tse tseVar) {
        this.a = tseVar;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.b = mdh.b.P(1);
        this.c = dne0Var.a("summary_tooltip_counts");
        this.d = new ConcurrentHashMap();
        this.e = kotlin.a.a(new ogu0(15, this));
        this.f = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    }

    public final boolean a(pvz0 pvz0Var) {
        String p = g8e.p(pvz0Var.a, ":", pvz0Var.b);
        Integer num = (Integer) this.d.get(p);
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) ((ConcurrentHashMap) this.e.getValue()).get(p);
        return intValue < pvz0Var.d && (num2 != null ? num2.intValue() : 0) < pvz0Var.c;
    }

    public final void b(pvz0 pvz0Var) {
        String p = g8e.p(pvz0Var.a, ":", pvz0Var.b);
        final int i = 1;
        SummaryTooltipShownCountRepository$markAsDismissed$1 summaryTooltipShownCountRepository$markAsDismissed$1 = SummaryTooltipShownCountRepository$markAsDismissed$1.b;
        final int i2 = 0;
        this.d.merge(p, 1, new BiFunction(i2) { // from class: ru.yandex.taxi.tooltips.repository.a
            public final /* synthetic */ int a;
            public final /* synthetic */ wls b;

            {
                wls wlsVar;
                this.a = i2;
                switch (i2) {
                    case 1:
                        wlsVar = SummaryTooltipShownCountRepository$markAsDismissed$2.b;
                        break;
                    default:
                        wlsVar = SummaryTooltipShownCountRepository$markAsDismissed$1.b;
                        break;
                }
                this.b = wlsVar;
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i3 = this.a;
                wls wlsVar = this.b;
                switch (i3) {
                }
                return (Integer) wlsVar.invoke(obj, obj2);
            }
        });
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.e.getValue();
        SummaryTooltipShownCountRepository$markAsDismissed$2 summaryTooltipShownCountRepository$markAsDismissed$2 = SummaryTooltipShownCountRepository$markAsDismissed$2.b;
        concurrentHashMap.merge(p, 1, new BiFunction(i) { // from class: ru.yandex.taxi.tooltips.repository.a
            public final /* synthetic */ int a;
            public final /* synthetic */ wls b;

            {
                wls wlsVar;
                this.a = i;
                switch (i) {
                    case 1:
                        wlsVar = SummaryTooltipShownCountRepository$markAsDismissed$2.b;
                        break;
                    default:
                        wlsVar = SummaryTooltipShownCountRepository$markAsDismissed$1.b;
                        break;
                }
                this.b = wlsVar;
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i3 = this.a;
                wls wlsVar = this.b;
                switch (i3) {
                }
                return (Integer) wlsVar.invoke(obj, obj2);
            }
        });
        tje.N(this.a, this.b, null, new SummaryTooltipShownCountRepository$markAsDismissed$3(this, p, pvz0Var, null), 2);
    }
}
