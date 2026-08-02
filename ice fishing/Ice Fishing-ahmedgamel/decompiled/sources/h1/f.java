package h1;

import android.graphics.Color;
import android.graphics.PointF;
import com.icefishingapp.icefishing.AbstractC4404f;
import i1.AbstractC4579a;
import k1.C4630b;

/* loaded from: classes.dex */
public final class f implements D {

    /* renamed from: u, reason: collision with root package name */
    public static final f f37959u = new f(0);

    /* renamed from: v, reason: collision with root package name */
    public static final f f37960v = new f(1);

    /* renamed from: w, reason: collision with root package name */
    public static final f f37961w = new f(2);

    /* renamed from: x, reason: collision with root package name */
    public static final f f37962x = new f(3);

    /* renamed from: y, reason: collision with root package name */
    public static final f f37963y = new f(4);

    /* renamed from: z, reason: collision with root package name */
    public static final f f37964z = new f(5);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37965n;

    public /* synthetic */ f(int i) {
        this.f37965n = i;
    }

    @Override // h1.D
    public final Object b(AbstractC4579a abstractC4579a, float f3) {
        switch (this.f37965n) {
            case 0:
                boolean z3 = abstractC4579a.I() == 1;
                if (z3) {
                    abstractC4579a.b();
                }
                double F8 = abstractC4579a.F();
                double F9 = abstractC4579a.F();
                double F10 = abstractC4579a.F();
                double F11 = abstractC4579a.I() == 7 ? abstractC4579a.F() : 1.0d;
                if (z3) {
                    abstractC4579a.z();
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
                return Float.valueOf(n.d(abstractC4579a) * f3);
            case 2:
                return Integer.valueOf(Math.round(n.d(abstractC4579a) * f3));
            case 3:
                return n.b(abstractC4579a, f3);
            case 4:
                int I8 = abstractC4579a.I();
                if (I8 == 1) {
                    return n.b(abstractC4579a, f3);
                }
                if (I8 == 3) {
                    return n.b(abstractC4579a, f3);
                }
                if (I8 != 7) {
                    throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(AbstractC4404f.q(I8)));
                }
                PointF pointF = new PointF(((float) abstractC4579a.F()) * f3, ((float) abstractC4579a.F()) * f3);
                while (abstractC4579a.D()) {
                    abstractC4579a.W();
                }
                return pointF;
            default:
                boolean z6 = abstractC4579a.I() == 1;
                if (z6) {
                    abstractC4579a.b();
                }
                float F12 = (float) abstractC4579a.F();
                float F13 = (float) abstractC4579a.F();
                while (abstractC4579a.D()) {
                    abstractC4579a.W();
                }
                if (z6) {
                    abstractC4579a.z();
                }
                return new C4630b((F12 / 100.0f) * f3, (F13 / 100.0f) * f3);
        }
    }
}
