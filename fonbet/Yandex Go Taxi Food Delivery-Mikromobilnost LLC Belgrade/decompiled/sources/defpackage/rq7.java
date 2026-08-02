package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.map_common.map.RectEvaluator;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.utils.f;

/* loaded from: classes9.dex */
public final class rq7 {
    public TaxiMapView a;
    public Object b;
    public Pair c;
    public final f d;
    public final n0 e;
    public final eci0 f;

    public rq7() {
        ConcurrentHashMap concurrentHashMap = pwf0.a;
        this.d = new f(yg00.class);
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.e = b;
        this.f = e.c(b);
    }

    public static String a(ScreenRect screenRect) {
        if (screenRect == null) {
            return "null";
        }
        float x = screenRect.getTopLeft().getX();
        float y = screenRect.getTopLeft().getY();
        return ly3.q(oo31.k(Extension.O_BRAKE, x, ",", y, ","), screenRect.getBottomRight().getX(), ",", screenRect.getBottomRight().getY(), Extension.C_BRAKE);
    }

    public final Rect b() {
        return f(c());
    }

    public final ScreenRect c() {
        TaxiMapView taxiMapView = this.a;
        if (taxiMapView != null) {
            return taxiMapView.getFocusRect();
        }
        return null;
    }

    public final void d() {
        ((yg00) this.d.c).rc();
        this.e.g(c());
    }

    public final boolean e(Object obj) {
        return this.b == obj;
    }

    public final Rect f(ScreenRect screenRect) {
        if (screenRect != null) {
            ScreenPoint topLeft = screenRect.getTopLeft();
            ScreenPoint bottomRight = screenRect.getBottomRight();
            return new Rect((int) topLeft.getX(), (int) topLeft.getY(), (int) bottomRight.getX(), (int) bottomRight.getY());
        }
        TaxiMapView taxiMapView = this.a;
        int width = taxiMapView != null ? taxiMapView.getWidth() : 0;
        TaxiMapView taxiMapView2 = this.a;
        return new Rect(0, 0, width, taxiMapView2 != null ? taxiMapView2.getHeight() : 0);
    }

    public final boolean g(Object obj, ScreenRect screenRect, boolean z, long j) {
        if (e(obj)) {
            if (!z) {
                h();
                try {
                    TaxiMapView taxiMapView = this.a;
                    if (taxiMapView != null) {
                        taxiMapView.setFocusRect(screenRect);
                    }
                    d();
                    return true;
                } catch (RuntimeException e) {
                    hst hstVar = jst.e;
                    String a = a(screenRect);
                    TaxiMapView taxiMapView2 = this.a;
                    hstVar.k(e, String.format("Something went wrong during setting up focus: %s/%s", Arrays.copyOf(new Object[]{a, a(taxiMapView2 != null ? taxiMapView2.getFocusRect() : null)}, 2)));
                    return false;
                }
            }
            Rect f = f(screenRect);
            Pair pair = this.c;
            if (!f.equals(pair != null ? (Rect) pair.f() : null)) {
                h();
                Rect b = b();
                if (b.equals(f)) {
                    d();
                    return true;
                }
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setObjectValues(b, f);
                valueAnimator.setEvaluator(new RectEvaluator());
                valueAnimator.setDuration(j);
                valueAnimator.addUpdateListener(new yi(7, this));
                valueAnimator.addListener(new AnimUtils$AnimationEndListener(new dn7(3, this)));
                valueAnimator.start();
                this.c = new Pair(valueAnimator, f);
                return true;
            }
        }
        return false;
    }

    public final void h() {
        Pair pair = this.c;
        ValueAnimator valueAnimator = pair != null ? (ValueAnimator) pair.c() : null;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.c = null;
    }
}
