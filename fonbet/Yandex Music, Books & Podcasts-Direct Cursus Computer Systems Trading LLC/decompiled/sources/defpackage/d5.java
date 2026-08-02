package defpackage;

import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class d5 extends uif implements Function1 {
    public static final d5 A;
    public static final d5 A0;
    public static final d5 B;
    public static final d5 B0;
    public static final d5 C;
    public static final d5 D;
    public static final d5 E;
    public static final d5 F;
    public static final d5 G;
    public static final d5 H;
    public static final d5 I;
    public static final d5 J;
    public static final d5 K;
    public static final d5 L;
    public static final d5 X;
    public static final d5 Y;
    public static final d5 Z;
    public static final d5 s;
    public static final d5 t;
    public static final d5 u;
    public static final d5 v;
    public static final d5 v0;
    public static final d5 w;
    public static final d5 w0;
    public static final d5 x;
    public static final d5 x0;
    public static final d5 y;
    public static final d5 y0;
    public static final d5 z;
    public static final d5 z0;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new d5(i, 0);
        t = new d5(i, 1);
        u = new d5(i, 2);
        v = new d5(i, 3);
        w = new d5(i, 4);
        x = new d5(i, 5);
        y = new d5(i, 6);
        z = new d5(i, 7);
        A = new d5(i, 8);
        B = new d5(i, 9);
        C = new d5(i, 10);
        D = new d5(i, 11);
        E = new d5(i, 12);
        F = new d5(i, 13);
        G = new d5(i, 14);
        H = new d5(i, 15);
        I = new d5(i, 16);
        J = new d5(i, 17);
        K = new d5(i, 18);
        L = new d5(i, 19);
        X = new d5(i, 20);
        Y = new d5(i, 21);
        Z = new d5(i, 22);
        v0 = new d5(i, 23);
        w0 = new d5(i, 24);
        x0 = new d5(i, 25);
        y0 = new d5(i, 26);
        z0 = new d5(i, 27);
        A0 = new d5(i, 28);
        B0 = new d5(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d5(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ((b5) obj).getClass();
                return Unit.a;
            case 1:
                obj.getClass();
                return ghh.S(obj);
            case 2:
                Long l = (Long) obj;
                if (l != null) {
                    return l.toString();
                }
                return null;
            case 3:
                ((vi) obj).getClass();
                return Unit.a;
            case 4:
                ((fj) obj).getClass();
                return Unit.a;
            case 5:
                ((hj) obj).getClass();
                return Unit.a;
            case 6:
                return Boolean.TRUE;
            case 7:
                return Unit.a;
            case 8:
                return Boolean.TRUE;
            case 9:
                return Boolean.FALSE;
            case 10:
                s9f[] s9fVarArr = wfp.a;
                xfp xfpVar = ufp.v;
                Unit unit = Unit.a;
                ((jfp) obj).o(xfpVar, unit);
                return unit;
            case 11:
                ((Number) obj).longValue();
                return Unit.a;
            case 12:
                ((Number) obj).longValue();
                return Unit.a;
            case 13:
                return Unit.a;
            case 14:
                s9f[] s9fVarArr2 = wfp.a;
                xfp xfpVar2 = ufp.u;
                Unit unit2 = Unit.a;
                ((jfp) obj).o(xfpVar2, unit2);
                return unit2;
            case 15:
                return Unit.a;
            case 16:
                oj0 oj0Var = (oj0) obj;
                oj0Var.getHandler().post(new ti(3, oj0Var.q));
                return Unit.a;
            case 17:
                return Unit.a;
            case 18:
                return Unit.a;
            case 19:
                return Unit.a;
            case 20:
                return obj;
            case 21:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 22:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 23:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 24:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return bool4;
            case 25:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return bool5;
            case 26:
                return Boolean.valueOf(!(((in0) obj) instanceof x5k));
            case 27:
                return (mg) obj;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return (mg) obj;
            default:
                obj.getClass();
                return ghh.S(obj);
        }
    }
}
