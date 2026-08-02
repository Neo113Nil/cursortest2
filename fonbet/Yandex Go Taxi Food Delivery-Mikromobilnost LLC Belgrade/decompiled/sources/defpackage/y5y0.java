package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import androidx.lifecycle.Lifecycle;
import androidx.localbroadcastmanager.content.a;
import com.yandex.go.taxi.order.listener.TaxiOrderSentActivityListener$orderSentReceiver$1;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;

/* loaded from: classes8.dex */
public final class y5y0 implements vw60 {
    public final Context a;
    public final Lifecycle b;
    public final yvf0 c;
    public final h3y d;
    public final a3y0 e = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "TaxiOrderSentActivityListener");
    public final TaxiOrderSentActivityListener$orderSentReceiver$1 f = new TaxiOrderSentActivityListener$orderSentReceiver$1(this);

    public y5y0(Context context, Lifecycle lifecycle, yvf0 yvf0Var, h3y h3yVar) {
        this.a = context;
        this.b = lifecycle;
        this.c = yvf0Var;
        this.d = h3yVar;
    }

    @Override // defpackage.vw60
    public final void c() {
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        final int i = 0;
        Runnable runnable = new Runnable(this) { // from class: x5y0
            public final /* synthetic */ y5y0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                y5y0 y5y0Var = this.b;
                switch (i2) {
                    case 0:
                        a.a(y5y0Var.a).b(y5y0Var.f, new IntentFilter("ru.yandex.taxi.OrderSent"));
                        break;
                    default:
                        a.a(y5y0Var.a).d(y5y0Var.f);
                        break;
                }
            }
        };
        Lifecycle lifecycle = this.b;
        cey.a(lifecycle, event, runnable);
        final int i2 = 1;
        cey.a(lifecycle, Lifecycle.Event.ON_PAUSE, new Runnable(this) { // from class: x5y0
            public final /* synthetic */ y5y0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                y5y0 y5y0Var = this.b;
                switch (i22) {
                    case 0:
                        a.a(y5y0Var.a).b(y5y0Var.f, new IntentFilter("ru.yandex.taxi.OrderSent"));
                        break;
                    default:
                        a.a(y5y0Var.a).d(y5y0Var.f);
                        break;
                }
            }
        });
    }

    @Override // defpackage.s150
    public final String getName() {
        return "TaxiOrderSentActivityListener";
    }
}
