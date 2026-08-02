package defpackage;

import android.widget.RemoteViews;
import androidx.compose.ui.viewinterop.a;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class af0 extends uif implements Function2 {
    public static final af0 A;
    public static final af0 A0;
    public static final af0 B;
    public static final af0 B0;
    public static final af0 C;
    public static final af0 D;
    public static final af0 E;
    public static final af0 F;
    public static final af0 G;
    public static final af0 H;
    public static final af0 I;
    public static final af0 J;
    public static final af0 K;
    public static final af0 L;
    public static final af0 X;
    public static final af0 Y;
    public static final af0 Z;
    public static final af0 s;
    public static final af0 t;
    public static final af0 u;
    public static final af0 v;
    public static final af0 v0;
    public static final af0 w;
    public static final af0 w0;
    public static final af0 x;
    public static final af0 x0;
    public static final af0 y;
    public static final af0 y0;
    public static final af0 z;
    public static final af0 z0;
    public final /* synthetic */ int r;

    static {
        int i = 2;
        s = new af0(i, 0);
        t = new af0(i, 1);
        u = new af0(i, 2);
        v = new af0(i, 3);
        w = new af0(i, 4);
        x = new af0(i, 5);
        y = new af0(i, 6);
        z = new af0(i, 7);
        A = new af0(i, 8);
        B = new af0(i, 9);
        C = new af0(i, 10);
        D = new af0(i, 11);
        E = new af0(i, 12);
        F = new af0(i, 13);
        G = new af0(i, 14);
        H = new af0(i, 15);
        I = new af0(i, 16);
        J = new af0(i, 17);
        K = new af0(i, 18);
        L = new af0(i, 19);
        X = new af0(i, 20);
        Y = new af0(i, 21);
        Z = new af0(i, 22);
        v0 = new af0(i, 23);
        w0 = new af0(i, 24);
        x0 = new af0(i, 25);
        y0 = new af0(i, 26);
        z0 = new af0(i, 27);
        A0 = new af0(i, 28);
        B0 = new af0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af0(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        switch (this.r) {
            case 0:
                qfp qfpVar = (qfp) obj2;
                Object valueOf = Float.valueOf(0.0f);
                jfp jfpVar = ((qfp) obj).d;
                xfp xfpVar = ufp.r;
                Object g = jfpVar.a.g(xfpVar);
                if (g == null) {
                    g = valueOf;
                }
                float floatValue = ((Number) g).floatValue();
                Object g2 = qfpVar.d.a.g(xfpVar);
                if (g2 != null) {
                    valueOf = g2;
                }
                break;
            case 1:
                ((d3b) obj).e = (RemoteViews) obj2;
                break;
            case 2:
                ((d3b) obj).d = ((Number) obj2).intValue();
                break;
            case 3:
                ((d3b) obj).c = (ukd) obj2;
                break;
            case 4:
                a.c((mpf) obj).setResetBlock((Function1) obj2);
                break;
            case 5:
                a.c((mpf) obj).setUpdateBlock((Function1) obj2);
                break;
            case 6:
                a.c((mpf) obj).setReleaseBlock((Function1) obj2);
                break;
            case 7:
                a.c((mpf) obj).setUpdateBlock((Function1) obj2);
                break;
            case 8:
                a.c((mpf) obj).setReleaseBlock((Function1) obj2);
                break;
            case 9:
                a.c((mpf) obj).setModifier((yci) obj2);
                break;
            case 10:
                a.c((mpf) obj).setDensity((jx7) obj2);
                break;
            case 11:
                a.c((mpf) obj).setLifecycleOwner((dzf) obj2);
                break;
            case 12:
                a.c((mpf) obj).setSavedStateRegistryOwner((woo) obj2);
                break;
            case 13:
                keu c = a.c((mpf) obj);
                int ordinal = ((xof) obj2).ordinal();
                if (ordinal != 0) {
                    i = 1;
                    if (ordinal != 1) {
                        b6e.s();
                        break;
                    }
                } else {
                    i = 0;
                }
                c.setLayoutDirection(i);
                break;
            case 14:
                long j = ((hqe) obj).a;
                long j2 = ((hqe) obj2).a;
                long j3 = 1;
                break;
            case 15:
                r8b r8bVar = (r8b) obj2;
                break;
            case 16:
                break;
            case 17:
                ((Number) obj2).intValue();
                ((String) obj).getClass();
                break;
            case 18:
                ((e3b) obj).c = (ukd) obj2;
                break;
            case 19:
                ((e3b) obj).d = (f40) obj2;
                break;
            case 20:
                nv3 nv3Var = (nv3) obj;
                nv3 nv3Var2 = (nv3) obj2;
                nv3Var.getClass();
                nv3Var2.getClass();
                break;
            case 21:
                ((f3b) obj).a = (ukd) obj2;
                break;
            case 22:
                ((f3b) obj).b = (b95) obj2;
                break;
            case 23:
                int i2 = ((c85) obj).a;
                break;
            case 24:
                int i3 = ((c85) obj).a;
                break;
            case 25:
                int i4 = ((c85) obj).a;
                break;
            case 26:
                int i5 = ((c85) obj).a;
                break;
            case 27:
                ((g3b) obj).c = (ukd) obj2;
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((g3b) obj).e = ((d40) obj2).a;
                break;
            default:
                ((g3b) obj).d = ((e40) obj2).a;
                break;
        }
        return Unit.a;
    }
}
