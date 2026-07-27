package h1;

import android.graphics.Color;
import android.graphics.PointF;
import com.google.android.gms.internal.ads.CL;
import i1.AbstractC4574a;
import java.util.ArrayList;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.s f38184a = S0.s.i("x", "y");

    public static int a(AbstractC4574a abstractC4574a) {
        abstractC4574a.b();
        int F8 = (int) (abstractC4574a.F() * 255.0d);
        int F9 = (int) (abstractC4574a.F() * 255.0d);
        int F10 = (int) (abstractC4574a.F() * 255.0d);
        while (abstractC4574a.D()) {
            abstractC4574a.W();
        }
        abstractC4574a.z();
        return Color.argb(com.anythink.basead.exoplayer.k.p.f8630b, F8, F9, F10);
    }

    public static PointF b(AbstractC4574a abstractC4574a, float f6) {
        int d2 = AbstractC5088e.d(abstractC4574a.I());
        if (d2 == 0) {
            abstractC4574a.b();
            float F8 = (float) abstractC4574a.F();
            float F9 = (float) abstractC4574a.F();
            while (abstractC4574a.I() != 2) {
                abstractC4574a.W();
            }
            abstractC4574a.z();
            return new PointF(F8 * f6, F9 * f6);
        }
        if (d2 != 2) {
            if (d2 != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(CL.x(abstractC4574a.I())));
            }
            float F10 = (float) abstractC4574a.F();
            float F11 = (float) abstractC4574a.F();
            while (abstractC4574a.D()) {
                abstractC4574a.W();
            }
            return new PointF(F10 * f6, F11 * f6);
        }
        abstractC4574a.j();
        float f9 = 0.0f;
        float f10 = 0.0f;
        while (abstractC4574a.D()) {
            int K8 = abstractC4574a.K(f38184a);
            if (K8 == 0) {
                f9 = d(abstractC4574a);
            } else if (K8 != 1) {
                abstractC4574a.V();
                abstractC4574a.W();
            } else {
                f10 = d(abstractC4574a);
            }
        }
        abstractC4574a.B();
        return new PointF(f9 * f6, f10 * f6);
    }

    public static ArrayList c(AbstractC4574a abstractC4574a, float f6) {
        ArrayList arrayList = new ArrayList();
        abstractC4574a.b();
        while (abstractC4574a.I() == 1) {
            abstractC4574a.b();
            arrayList.add(b(abstractC4574a, f6));
            abstractC4574a.z();
        }
        abstractC4574a.z();
        return arrayList;
    }

    public static float d(AbstractC4574a abstractC4574a) {
        int I2 = abstractC4574a.I();
        int d2 = AbstractC5088e.d(I2);
        if (d2 != 0) {
            if (d2 == 6) {
                return (float) abstractC4574a.F();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(CL.x(I2)));
        }
        abstractC4574a.b();
        float F8 = (float) abstractC4574a.F();
        while (abstractC4574a.D()) {
            abstractC4574a.W();
        }
        abstractC4574a.z();
        return F8;
    }
}
