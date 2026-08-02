package defpackage;

import android.graphics.PathMeasure;
import com.yandex.payment.sdk.passport.PassportAdapterFactory;
import com.yandex.pulse.metrics.o;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public final class xuj extends uif implements Function0 {
    public static final xuj A;
    public static final xuj A0;
    public static final xuj B;
    public static final xuj B0;
    public static final xuj C;
    public static final xuj D;
    public static final xuj E;
    public static final xuj F;
    public static final xuj G;
    public static final xuj H;
    public static final xuj I;
    public static final xuj J;
    public static final xuj K;
    public static final xuj L;
    public static final xuj X;
    public static final xuj Y;
    public static final xuj Z;
    public static final xuj s;
    public static final xuj t;
    public static final xuj u;
    public static final xuj v;
    public static final xuj v0;
    public static final xuj w;
    public static final xuj w0;
    public static final xuj x;
    public static final xuj x0;
    public static final xuj y;
    public static final xuj y0;
    public static final xuj z;
    public static final xuj z0;
    public final /* synthetic */ int r;

    static {
        int i = 0;
        s = new xuj(i, 0);
        t = new xuj(i, 1);
        u = new xuj(i, 2);
        v = new xuj(i, 3);
        w = new xuj(i, 4);
        x = new xuj(i, 5);
        y = new xuj(i, 6);
        z = new xuj(i, 7);
        A = new xuj(i, 8);
        B = new xuj(i, 9);
        C = new xuj(i, 10);
        D = new xuj(i, 11);
        E = new xuj(i, 12);
        F = new xuj(i, 13);
        G = new xuj(i, 14);
        H = new xuj(i, 15);
        I = new xuj(i, 16);
        J = new xuj(i, 17);
        K = new xuj(i, 18);
        L = new xuj(i, 19);
        X = new xuj(i, 20);
        Y = new xuj(i, 21);
        Z = new xuj(i, 22);
        v0 = new xuj(i, 23);
        w0 = new xuj(i, 24);
        x0 = new xuj(i, 25);
        y0 = new xuj(i, 26);
        z0 = new xuj(i, 27);
        A0 = new xuj(i, 28);
        B0 = new xuj(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xuj(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return rqi.a();
            case 1:
                return new b43(rre.f, 10);
            case 2:
                return new izj();
            case 3:
                return null;
            case 4:
                jyr jyrVar = s9k.a;
                try {
                    Object newInstance = PassportAdapterFactory.class.getConstructor(null).newInstance(null);
                    Method method = PassportAdapterFactory.class.getMethod("create", null);
                    if (e9k.class.isAssignableFrom(method.getReturnType())) {
                        return new ssb(20, method, newInstance);
                    }
                    return null;
                } catch (ClassNotFoundException unused) {
                    return null;
                }
            case 5:
                return new oh0(new PathMeasure());
            case 6:
                return Unit.a;
            case 7:
                return Unit.a;
            case 8:
                return Unit.a;
            case 9:
            case 10:
                return null;
            case 11:
                return Unit.a;
            case 12:
                return Unit.a;
            case 13:
                return new Regex("\\.\\w+($|\\?)");
            case 14:
                return Unit.a;
            case 15:
                return Unit.a;
            case 16:
                return new wdo();
            case 17:
                return new xdo(d85.n, null);
            case 18:
                return Boolean.FALSE;
            case 19:
                return jl5.c;
            case 20:
                return new ioo(new LinkedHashMap());
            case 21:
                return null;
            case 22:
                return Unit.a;
            case 23:
                return Unit.a;
            case 24:
                return Unit.a;
            case 25:
                return new fjs();
            case 26:
                return null;
            case 27:
                return Float.valueOf(0.0f);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new bfp(1L);
            default:
                return null;
        }
    }
}
