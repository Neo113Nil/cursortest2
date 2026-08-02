package defpackage;

import androidx.lifecycle.Lifecycle;
import ru.yandex.taxi.summary.promotions.repository.e;

/* loaded from: classes10.dex */
public final class qmv0 implements vw60 {
    public final Lifecycle a;
    public final e b;

    public qmv0(Lifecycle lifecycle, e eVar) {
        this.a = lifecycle;
        this.b = eVar;
    }

    @Override // defpackage.vw60
    public final void c() {
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        final int i = 0;
        Runnable runnable = new Runnable(this) { // from class: pmv0
            public final /* synthetic */ qmv0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                qmv0 qmv0Var = this.b;
                switch (i2) {
                    case 0:
                        qmv0Var.b.h();
                        break;
                    default:
                        e eVar = qmv0Var.b;
                        eVar.n.b();
                        eVar.h.a();
                        break;
                }
            }
        };
        Lifecycle lifecycle = this.a;
        cey.a(lifecycle, event, runnable);
        final int i2 = 1;
        cey.a(lifecycle, Lifecycle.Event.ON_STOP, new Runnable(this) { // from class: pmv0
            public final /* synthetic */ qmv0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                qmv0 qmv0Var = this.b;
                switch (i22) {
                    case 0:
                        qmv0Var.b.h();
                        break;
                    default:
                        e eVar = qmv0Var.b;
                        eVar.n.b();
                        eVar.h.a();
                        break;
                }
            }
        });
    }

    @Override // defpackage.s150
    public final String getName() {
        return "SummaryPromotionsActivityListener";
    }
}
