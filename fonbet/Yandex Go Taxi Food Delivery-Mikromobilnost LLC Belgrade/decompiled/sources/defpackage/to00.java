package defpackage;

import android.view.View;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.XYPoint;
import ru.yandex.taxi.map_common.map.intersection.Participant;
import ru.yandex.taxi.map_common.map.utils.a;

/* loaded from: classes6.dex */
public final class to00 implements so00 {
    public final ah00 a;
    public final a b;
    public final mzz c = new mzz(6);

    public to00(ah00 ah00Var, a aVar) {
        this.a = ah00Var;
        this.b = aVar;
    }

    public final XYPoint a(View view) {
        if (view.getVisibility() == 4) {
            return null;
        }
        Point d = ((gh00) this.a).e.d(new ScreenPoint((view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY()));
        if (d == null) {
            return null;
        }
        mzz mzzVar = this.c;
        XYPoint xYPoint = (XYPoint) mzzVar.c(d);
        if (xYPoint != null) {
            return xYPoint;
        }
        XYPoint d2 = this.b.d(d);
        mzzVar.d(d, d2);
        return d2;
    }

    public final ro00 b(int i, View view) {
        XYPoint a = a(view);
        if (a == null) {
            return ro00.d;
        }
        ro00 ro00Var = ro00.d;
        return vuz.v(Participant.ONLY_STEM_OF_PIN, view, a, ((gh00) this.a).e.c.getZoom(), 0, 0, view.getHeight() - i, 368);
    }

    public final ro00 c(Participant participant, View view) {
        XYPoint a = a(view);
        if (a == null) {
            return ro00.d;
        }
        ro00 ro00Var = ro00.d;
        return vuz.v(participant, view, a, ((gh00) this.a).e.c.getZoom(), 0, 0, 0, 496);
    }
}
