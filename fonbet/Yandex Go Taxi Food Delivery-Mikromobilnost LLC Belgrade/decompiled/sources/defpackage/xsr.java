package defpackage;

import android.os.SystemClock;
import com.google.android.gms.measurement.internal.g;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.compact.RideCardCompactView;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.RideCardModalView;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes14.dex */
public final class xsr implements Runnable {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public xsr(jya1 jya1Var, long j) {
        this.a = 3;
        this.b = j;
        Objects.requireNonNull(jya1Var);
        this.c = jya1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g6y0 g6y0Var;
        g6y0 g6y0Var2;
        int i = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                FlutterJNI flutterJNI = (FlutterJNI) obj;
                if (flutterJNI.isAttached()) {
                    flutterJNI.unregisterTexture(j);
                    break;
                }
                break;
            case 1:
                wmk0 wmk0Var = new wmk0(TaxiOrderSessionCheckpoint.FCP, m810.c((SystemClock.elapsedRealtimeNanos() - j) / 1000000.0d), RideCardPresentationType.COMPACT, null, 18);
                g6y0Var = ((RideCardCompactView) obj).sessionTimelineTracker;
                ((i6y0) g6y0Var).b(wmk0Var);
                break;
            case 2:
                wmk0 wmk0Var2 = new wmk0(TaxiOrderSessionCheckpoint.FCP, m810.c((SystemClock.elapsedRealtimeNanos() - j) / 1000000.0d), RideCardPresentationType.DETAILS, null, 18);
                g6y0Var2 = ((RideCardModalView) obj).sessionTimelineTracker;
                ((i6y0) g6y0Var2).b(wmk0Var2);
                break;
            default:
                jya1 jya1Var = (jya1) obj;
                bh91 bh91Var = ((g) jya1Var.b).G;
                g.d(bh91Var);
                bh91Var.Jg(j);
                jya1Var.y = null;
                break;
        }
    }

    public /* synthetic */ xsr(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }
}
