package j1;

import android.graphics.Color;
import android.graphics.PointF;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import k1.AbstractC4640b;
import k1.C4639a;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final C4639a f38453a = C4639a.d("x", "y");

    public static int a(AbstractC4640b abstractC4640b) {
        abstractC4640b.b();
        int F8 = (int) (abstractC4640b.F() * 255.0d);
        int F9 = (int) (abstractC4640b.F() * 255.0d);
        int F10 = (int) (abstractC4640b.F() * 255.0d);
        while (abstractC4640b.D()) {
            abstractC4640b.W();
        }
        abstractC4640b.z();
        return Color.argb(com.anythink.basead.exoplayer.k.p.f9259b, F8, F9, F10);
    }

    public static PointF b(AbstractC4640b abstractC4640b, float f2) {
        int d9 = AbstractC5050e.d(abstractC4640b.I());
        if (d9 == 0) {
            abstractC4640b.b();
            float F8 = (float) abstractC4640b.F();
            float F9 = (float) abstractC4640b.F();
            while (abstractC4640b.I() != 2) {
                abstractC4640b.W();
            }
            abstractC4640b.z();
            return new PointF(F8 * f2, F9 * f2);
        }
        if (d9 != 2) {
            if (d9 != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(Wv.q(abstractC4640b.I())));
            }
            float F10 = (float) abstractC4640b.F();
            float F11 = (float) abstractC4640b.F();
            while (abstractC4640b.D()) {
                abstractC4640b.W();
            }
            return new PointF(F10 * f2, F11 * f2);
        }
        abstractC4640b.j();
        float f9 = 0.0f;
        float f10 = 0.0f;
        while (abstractC4640b.D()) {
            int K7 = abstractC4640b.K(f38453a);
            if (K7 == 0) {
                f9 = d(abstractC4640b);
            } else if (K7 != 1) {
                abstractC4640b.V();
                abstractC4640b.W();
            } else {
                f10 = d(abstractC4640b);
            }
        }
        abstractC4640b.B();
        return new PointF(f9 * f2, f10 * f2);
    }

    public static ArrayList c(AbstractC4640b abstractC4640b, float f2) {
        ArrayList arrayList = new ArrayList();
        abstractC4640b.b();
        while (abstractC4640b.I() == 1) {
            abstractC4640b.b();
            arrayList.add(b(abstractC4640b, f2));
            abstractC4640b.z();
        }
        abstractC4640b.z();
        return arrayList;
    }

    public static float d(AbstractC4640b abstractC4640b) {
        int I8 = abstractC4640b.I();
        int d9 = AbstractC5050e.d(I8);
        if (d9 != 0) {
            if (d9 == 6) {
                return (float) abstractC4640b.F();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(Wv.q(I8)));
        }
        abstractC4640b.b();
        float F8 = (float) abstractC4640b.F();
        while (abstractC4640b.D()) {
            abstractC4640b.W();
        }
        abstractC4640b.z();
        return F8;
    }
}
