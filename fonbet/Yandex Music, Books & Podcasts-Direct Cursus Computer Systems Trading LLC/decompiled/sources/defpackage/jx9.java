package defpackage;

import androidx.compose.animation.c;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;

/* loaded from: classes3.dex */
public final class jx9 extends uif implements Function1 {
    public static final jx9 A;
    public static final jx9 A0;
    public static final jx9 B;
    public static final jx9 B0;
    public static final jx9 C;
    public static final jx9 D;
    public static final jx9 E;
    public static final jx9 F;
    public static final jx9 G;
    public static final jx9 H;
    public static final jx9 I;
    public static final jx9 J;
    public static final jx9 K;
    public static final jx9 L;
    public static final jx9 X;
    public static final jx9 Y;
    public static final jx9 Z;
    public static final jx9 s;
    public static final jx9 t;
    public static final jx9 u;
    public static final jx9 v;
    public static final jx9 v0;
    public static final jx9 w;
    public static final jx9 w0;
    public static final jx9 x;
    public static final jx9 x0;
    public static final jx9 y;
    public static final jx9 y0;
    public static final jx9 z;
    public static final jx9 z0;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new jx9(i, 0);
        t = new jx9(i, 1);
        u = new jx9(i, 2);
        v = new jx9(i, 3);
        w = new jx9(i, 4);
        x = new jx9(i, 5);
        y = new jx9(i, 6);
        z = new jx9(i, 7);
        A = new jx9(i, 8);
        B = new jx9(i, 9);
        C = new jx9(i, 10);
        D = new jx9(i, 11);
        E = new jx9(i, 12);
        F = new jx9(i, 13);
        G = new jx9(i, 14);
        H = new jx9(i, 15);
        I = new jx9(i, 16);
        J = new jx9(i, 17);
        K = new jx9(i, 18);
        L = new jx9(i, 19);
        X = new jx9(i, 20);
        Y = new jx9(i, 21);
        Z = new jx9(i, 22);
        v0 = new jx9(i, 23);
        w0 = new jx9(i, 24);
        x0 = new jx9(i, 25);
        y0 = new jx9(i, 26);
        z0 = new jx9(i, 27);
        A0 = new jx9(i, 28);
        B0 = new jx9(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jx9(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        z9h z9hVar;
        switch (this.r) {
            case 0:
                return Boolean.valueOf(obj instanceof hx9);
            case 1:
                return Boolean.valueOf(obj instanceof om8);
            case 2:
                return Boolean.valueOf(obj instanceof pm8);
            case 3:
                return Boolean.valueOf(obj instanceof a0a);
            case 4:
                return Boolean.valueOf(obj instanceof k1a);
            case 5:
                String str = (String) obj;
                if (Intrinsics.d(str, "fill")) {
                    return a0a.FILL;
                }
                if (Intrinsics.d(str, "no_scale")) {
                    return a0a.NO_SCALE;
                }
                if (Intrinsics.d(str, "fit")) {
                    return a0a.FIT;
                }
                return null;
            case 6:
                return ((a0a) obj).a;
            case 7:
                String str2 = (String) obj;
                if (Intrinsics.d(str2, "visible")) {
                    return k1a.VISIBLE;
                }
                if (Intrinsics.d(str2, "invisible")) {
                    return k1a.INVISIBLE;
                }
                if (Intrinsics.d(str2, "gone")) {
                    return k1a.GONE;
                }
                return null;
            case 8:
                return ((k1a) obj).a;
            case 9:
                ((jba) obj).getClass();
                return Unit.a;
            case 10:
                long j = ((enj) obj).a;
                return Unit.a;
            case 11:
                return Boolean.TRUE;
            case 12:
                return Boolean.TRUE;
            case 13:
                ((sqa) obj).getClass();
                return Unit.a;
            case 14:
                ((tqa) obj).getClass();
                return Unit.a;
            case 15:
                ((uqa) obj).getClass();
                return Unit.a;
            case 16:
                ((wqa) obj).getClass();
                return Unit.a;
            case 17:
                ((Boolean) obj).booleanValue();
                return Unit.a;
            case 18:
                return Unit.a;
            case 19:
                q1f q1fVar = (q1f) obj;
                q1fVar.getClass();
                z9h b = q1fVar.b();
                String o = b.o("payment_method");
                q1f q1fVar2 = (q1f) b.b.get("payload");
                if (q1fVar2 == null || (z9hVar = q1fVar2.a()) == null) {
                    z9hVar = null;
                }
                return new d6b(o, z9hVar);
            case 20:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                return "\\" + matchResult.getValue();
            case 21:
                long j2 = ((a7t) obj).a;
                return new zm0(a7t.b(j2), a7t.c(j2));
            case 22:
                zm0 zm0Var = (zm0) obj;
                return new a7t(v5g.g(zm0Var.a, zm0Var.b));
            case 23:
                return weo.Q(0.0f, 0.0f, null, 7);
            case 24:
                long j3 = ((hqe) obj).a;
                long j4 = 0;
                return new hqe((j4 & 4294967295L) | (j4 << 32));
            case 25:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 26:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 27:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return c.c;
            default:
                obj.getClass();
                return ghh.S(obj);
        }
    }
}
