package defpackage;

import androidx.lifecycle.Lifecycle;
import defpackage.hbp0;
import defpackage.ubc;
import java.util.concurrent.CancellationException;
import ru.yandex.taxi.polling.a;

/* loaded from: classes9.dex */
public final class ubc implements vw60 {
    public final a a;
    public final Lifecycle b;

    public ubc(a aVar, Lifecycle lifecycle) {
        this.a = aVar;
        this.b = lifecycle;
    }

    @Override // defpackage.vw60
    public final void c() {
        Lifecycle.Event event = Lifecycle.Event.ON_CREATE;
        final int i = 0;
        Runnable runnable = new Runnable(this) { // from class: tbc
            public final /* synthetic */ ubc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ubc ubcVar = this.b;
                switch (i2) {
                    case 0:
                        a aVar = ubcVar.a;
                        if (aVar.g == null) {
                            aVar.d.getClass();
                            aVar.a();
                            break;
                        }
                        break;
                    default:
                        pzt0 pzt0Var = ubcVar.a.g;
                        if (pzt0Var != null) {
                            pzt0Var.u(new CancellationException("CANCEL_BY_ON_DESTROY_MESSAGE"));
                            break;
                        }
                        break;
                }
            }
        };
        Lifecycle lifecycle = this.b;
        cey.a(lifecycle, event, runnable);
        cey.a(lifecycle, Lifecycle.Event.ON_START, new Runnable(this) { // from class: ru.yandex.taxi.polling.b
            public final /* synthetic */ ubc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ubc ubcVar = this.b;
                switch (i2) {
                    case 0:
                        a aVar = ubcVar.a;
                        hbp0.e((hbp0) aVar.f.getValue(), null, null, new CollectWarmupLocationsInteractor$onStart$1(aVar, null), 3);
                        break;
                    default:
                        a aVar2 = ubcVar.a;
                        hbp0.e((hbp0) aVar2.f.getValue(), null, null, new CollectWarmupLocationsInteractor$onStop$1(aVar2, null), 3);
                        break;
                }
            }
        });
        final int i2 = 1;
        cey.a(lifecycle, Lifecycle.Event.ON_STOP, new Runnable(this) { // from class: ru.yandex.taxi.polling.b
            public final /* synthetic */ ubc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ubc ubcVar = this.b;
                switch (i22) {
                    case 0:
                        a aVar = ubcVar.a;
                        hbp0.e((hbp0) aVar.f.getValue(), null, null, new CollectWarmupLocationsInteractor$onStart$1(aVar, null), 3);
                        break;
                    default:
                        a aVar2 = ubcVar.a;
                        hbp0.e((hbp0) aVar2.f.getValue(), null, null, new CollectWarmupLocationsInteractor$onStop$1(aVar2, null), 3);
                        break;
                }
            }
        });
        cey.a(lifecycle, Lifecycle.Event.ON_DESTROY, new Runnable(this) { // from class: tbc
            public final /* synthetic */ ubc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ubc ubcVar = this.b;
                switch (i22) {
                    case 0:
                        a aVar = ubcVar.a;
                        if (aVar.g == null) {
                            aVar.d.getClass();
                            aVar.a();
                            break;
                        }
                        break;
                    default:
                        pzt0 pzt0Var = ubcVar.a.g;
                        if (pzt0Var != null) {
                            pzt0Var.u(new CancellationException("CANCEL_BY_ON_DESTROY_MESSAGE"));
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // defpackage.s150
    public final String getName() {
        return "CollectWarmupLocationsStarter";
    }
}
