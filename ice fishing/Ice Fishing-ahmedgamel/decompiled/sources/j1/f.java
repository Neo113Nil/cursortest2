package j1;

import android.graphics.Color;
import android.graphics.PointF;
import com.google.android.gms.internal.ads.Wv;
import k1.AbstractC4640b;
import m1.C4740b;

/* loaded from: classes.dex */
public final class f implements D {

    /* renamed from: u, reason: collision with root package name */
    public static final f f38428u = new f(0);

    /* renamed from: v, reason: collision with root package name */
    public static final f f38429v = new f(1);

    /* renamed from: w, reason: collision with root package name */
    public static final f f38430w = new f(2);

    /* renamed from: x, reason: collision with root package name */
    public static final f f38431x = new f(3);

    /* renamed from: y, reason: collision with root package name */
    public static final f f38432y = new f(4);

    /* renamed from: z, reason: collision with root package name */
    public static final f f38433z = new f(5);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38434n;

    public /* synthetic */ f(int i) {
        this.f38434n = i;
    }

    @Override // j1.D
    public final Object b(AbstractC4640b abstractC4640b, float f2) {
        switch (this.f38434n) {
            case 0:
                boolean z6 = abstractC4640b.I() == 1;
                if (z6) {
                    abstractC4640b.b();
                }
                double F8 = abstractC4640b.F();
                double F9 = abstractC4640b.F();
                double F10 = abstractC4640b.F();
                double F11 = abstractC4640b.I() == 7 ? abstractC4640b.F() : 1.0d;
                if (z6) {
                    abstractC4640b.z();
                }
                if (F8 <= 1.0d && F9 <= 1.0d && F10 <= 1.0d) {
                    F8 *= 255.0d;
                    F9 *= 255.0d;
                    F10 *= 255.0d;
                    if (F11 <= 1.0d) {
                        F11 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) F11, (int) F8, (int) F9, (int) F10));
            case 1:
                return Float.valueOf(n.d(abstractC4640b) * f2);
            case 2:
                return Integer.valueOf(Math.round(n.d(abstractC4640b) * f2));
            case 3:
                return n.b(abstractC4640b, f2);
            case 4:
                int I8 = abstractC4640b.I();
                if (I8 == 1) {
                    return n.b(abstractC4640b, f2);
                }
                if (I8 == 3) {
                    return n.b(abstractC4640b, f2);
                }
                if (I8 != 7) {
                    throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(Wv.q(I8)));
                }
                PointF pointF = new PointF(((float) abstractC4640b.F()) * f2, ((float) abstractC4640b.F()) * f2);
                while (abstractC4640b.D()) {
                    abstractC4640b.W();
                }
                return pointF;
            default:
                boolean z9 = abstractC4640b.I() == 1;
                if (z9) {
                    abstractC4640b.b();
                }
                float F12 = (float) abstractC4640b.F();
                float F13 = (float) abstractC4640b.F();
                while (abstractC4640b.D()) {
                    abstractC4640b.W();
                }
                if (z9) {
                    abstractC4640b.z();
                }
                return new C4740b((F12 / 100.0f) * f2, (F13 / 100.0f) * f2);
        }
    }
}
