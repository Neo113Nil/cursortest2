package defpackage;

import com.yandex.pulse.mvi.tracker.ResponsivenessTracker;
import com.yandex.pulse.mvi.tracker.TimeToInteractiveTracker;

/* loaded from: classes5.dex */
public final /* synthetic */ class x3o implements yav {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x3o(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yav
    public final void a() {
        switch (this.a) {
            case 0:
                ResponsivenessTracker responsivenessTracker = (ResponsivenessTracker) this.b;
                c11 c11Var = responsivenessTracker.e;
                if (!responsivenessTracker.c) {
                    responsivenessTracker.h = false;
                    responsivenessTracker.i.clear();
                    y3o.a.removeFrameCallback(responsivenessTracker.f);
                    responsivenessTracker.g = false;
                }
                Long a = c11Var.a();
                if (a != null) {
                    bai baiVar = responsivenessTracker.a;
                    long longValue = a.longValue();
                    int i = c11Var.b;
                    eai eaiVar = baiVar.b;
                    eaiVar.a("InteractionToNextPaint", longValue, "", eaiVar.o);
                    eaiVar.a.reportAdditionalMetric(eaiVar.r, "InteractionCount", i, "", eaiVar.q.a);
                    break;
                }
                break;
            default:
                TimeToInteractiveTracker timeToInteractiveTracker = (TimeToInteractiveTracker) this.b;
                timeToInteractiveTracker.g = new nkk(timeToInteractiveTracker.j);
                timeToInteractiveTracker.b.a(null);
                bai baiVar2 = timeToInteractiveTracker.a;
                nkk nkkVar = timeToInteractiveTracker.g;
                long j = timeToInteractiveTracker.k;
                eai eaiVar2 = baiVar2.b;
                eaiVar2.a("TimeToInteractive", nkkVar.a - eaiVar2.b().a, "", eaiVar2.m);
                eaiVar2.a("TotalBlockingTime", j, "", eaiVar2.l);
                eaiVar2.g.stop();
                eaiVar2.p.k().a();
                break;
        }
    }
}
