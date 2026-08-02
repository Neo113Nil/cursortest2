package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.data.StalledReason;
import ru.yandex.video.m3.player.ui.debug.model.SessionColor;

/* loaded from: classes6.dex */
public final class ykp extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ zkp s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ykp(zkp zkpVar, int i) {
        super(0);
        this.r = i;
        this.s = zkpVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j;
        Double valueOf;
        switch (this.r) {
            case 0:
                zkp zkpVar = this.s;
                StalledReason stalledReason = zkpVar.e;
                long a = (stalledReason == null || !CollectionsKt.I(zkp.j, stalledReason)) ? zkpVar.f + zkpVar.a.a() : zkpVar.f;
                return zkpVar.c.b.a() < 600 ? a > 12730 ? SessionColor.RED : a > 8200 ? SessionColor.YELLOW : SessionColor.GREEN : a > 12860 ? SessionColor.RED : a > 5350 ? SessionColor.YELLOW : SessionColor.GREEN;
            case 1:
                zkp zkpVar2 = this.s;
                StalledReason stalledReason2 = zkpVar2.e;
                if (stalledReason2 == null || CollectionsKt.I(zkp.k, stalledReason2)) {
                    j = zkpVar2.g;
                    long a2 = zkpVar2.b.a();
                    if (j < a2) {
                        j = a2;
                    }
                } else {
                    j = zkpVar2.g;
                }
                return zkpVar2.c.b.a() < 600 ? j > 3190 ? SessionColor.RED : j > 450 ? SessionColor.YELLOW : SessionColor.GREEN : j > 21630 ? SessionColor.RED : j > 3270 ? SessionColor.YELLOW : SessionColor.GREEN;
            case 2:
                zkp zkpVar3 = this.s;
                long a3 = zkpVar3.c.b.a();
                int i = zkpVar3.h;
                return a3 < 600 ? i > 3 ? SessionColor.RED : i > 1 ? SessionColor.YELLOW : SessionColor.GREEN : i > 14 ? SessionColor.RED : i > 4 ? SessionColor.YELLOW : SessionColor.GREEN;
            case 3:
                return this.s.c.b.a() > 0 ? SessionColor.GREEN : SessionColor.RED;
            default:
                cpt cptVar = this.s.d;
                double d = 0.0d;
                for (Map.Entry entry : cptVar.f.entrySet()) {
                    d += ((Number) entry.getKey()).doubleValue() * ((Number) entry.getValue()).doubleValue();
                }
                double a4 = d / cptVar.d.b.a();
                Collection values = cptVar.f.values();
                values.getClass();
                Iterator it = values.iterator();
                if (it.hasNext()) {
                    double doubleValue = ((Number) it.next()).doubleValue();
                    while (it.hasNext()) {
                        doubleValue = Math.max(doubleValue, ((Number) it.next()).doubleValue());
                    }
                    valueOf = Double.valueOf(doubleValue);
                } else {
                    valueOf = null;
                }
                double exp = Math.exp((((valueOf != null ? valueOf.doubleValue() : 0.0d) * 0.15d) + (a4 * 0.85d)) * (-0.33d)) * 100;
                return zkp.l.b(Double.valueOf(exp)) ? SessionColor.RED : zkp.m.b(Double.valueOf(exp)) ? SessionColor.GREEN : SessionColor.YELLOW;
        }
    }
}
