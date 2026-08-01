package h1;

import android.graphics.Color;
import android.graphics.PointF;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import i1.AbstractC4579a;
import java.util.ArrayList;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.l f37984a = S0.l.F("x", "y");

    public static int a(AbstractC4579a abstractC4579a) {
        abstractC4579a.b();
        int F8 = (int) (abstractC4579a.F() * 255.0d);
        int F9 = (int) (abstractC4579a.F() * 255.0d);
        int F10 = (int) (abstractC4579a.F() * 255.0d);
        while (abstractC4579a.D()) {
            abstractC4579a.W();
        }
        abstractC4579a.z();
        return Color.argb(com.anythink.basead.exoplayer.k.p.f8473b, F8, F9, F10);
    }

    public static PointF b(AbstractC4579a abstractC4579a, float f3) {
        int d2 = AbstractC5049e.d(abstractC4579a.I());
        if (d2 == 0) {
            abstractC4579a.b();
            float F8 = (float) abstractC4579a.F();
            float F9 = (float) abstractC4579a.F();
            while (abstractC4579a.I() != 2) {
                abstractC4579a.W();
            }
            abstractC4579a.z();
            return new PointF(F8 * f3, F9 * f3);
        }
        if (d2 != 2) {
            if (d2 != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(AbstractC4404f.q(abstractC4579a.I())));
            }
            float F10 = (float) abstractC4579a.F();
            float F11 = (float) abstractC4579a.F();
            while (abstractC4579a.D()) {
                abstractC4579a.W();
            }
            return new PointF(F10 * f3, F11 * f3);
        }
        abstractC4579a.j();
        float f9 = 0.0f;
        float f10 = 0.0f;
        while (abstractC4579a.D()) {
            int K7 = abstractC4579a.K(f37984a);
            if (K7 == 0) {
                f9 = d(abstractC4579a);
            } else if (K7 != 1) {
                abstractC4579a.V();
                abstractC4579a.W();
            } else {
                f10 = d(abstractC4579a);
            }
        }
        abstractC4579a.B();
        return new PointF(f9 * f3, f10 * f3);
    }

    public static ArrayList c(AbstractC4579a abstractC4579a, float f3) {
        ArrayList arrayList = new ArrayList();
        abstractC4579a.b();
        while (abstractC4579a.I() == 1) {
            abstractC4579a.b();
            arrayList.add(b(abstractC4579a, f3));
            abstractC4579a.z();
        }
        abstractC4579a.z();
        return arrayList;
    }

    public static float d(AbstractC4579a abstractC4579a) {
        int I8 = abstractC4579a.I();
        int d2 = AbstractC5049e.d(I8);
        if (d2 != 0) {
            if (d2 == 6) {
                return (float) abstractC4579a.F();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(AbstractC4404f.q(I8)));
        }
        abstractC4579a.b();
        float F8 = (float) abstractC4579a.F();
        while (abstractC4579a.D()) {
            abstractC4579a.W();
        }
        abstractC4579a.z();
        return F8;
    }
}
