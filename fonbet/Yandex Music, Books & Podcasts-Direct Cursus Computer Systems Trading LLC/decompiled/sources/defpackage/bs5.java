package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.player.report.DebugReportImpl;

/* loaded from: classes.dex */
public final class bs5 extends uif implements Function0 {
    public static final bs5 A;
    public static final bs5 A0;
    public static final bs5 B;
    public static final bs5 B0;
    public static final bs5 C;
    public static final bs5 D;
    public static final bs5 E;
    public static final bs5 F;
    public static final bs5 G;
    public static final bs5 H;
    public static final bs5 I;
    public static final bs5 J;
    public static final bs5 K;
    public static final bs5 L;
    public static final bs5 X;
    public static final bs5 Y;
    public static final bs5 Z;
    public static final bs5 s;
    public static final bs5 t;
    public static final bs5 u;
    public static final bs5 v;
    public static final bs5 v0;
    public static final bs5 w;
    public static final bs5 w0;
    public static final bs5 x;
    public static final bs5 x0;
    public static final bs5 y;
    public static final bs5 y0;
    public static final bs5 z;
    public static final bs5 z0;
    public final /* synthetic */ int r;

    static {
        int i = 0;
        s = new bs5(i, 0);
        t = new bs5(i, 1);
        u = new bs5(i, 2);
        v = new bs5(i, 3);
        w = new bs5(i, 4);
        x = new bs5(i, 5);
        y = new bs5(i, 6);
        z = new bs5(i, 7);
        A = new bs5(i, 8);
        B = new bs5(i, 9);
        C = new bs5(i, 10);
        D = new bs5(i, 11);
        E = new bs5(i, 12);
        F = new bs5(i, 13);
        G = new bs5(i, 14);
        H = new bs5(i, 15);
        I = new bs5(i, 16);
        J = new bs5(i, 17);
        K = new bs5(i, 18);
        L = new bs5(i, 19);
        X = new bs5(i, 20);
        Y = new bs5(i, 21);
        Z = new bs5(i, 22);
        v0 = new bs5(i, 23);
        w0 = new bs5(i, 24);
        x0 = new bs5(i, 25);
        y0 = new bs5(i, 26);
        z0 = new bs5(i, 27);
        A0 = new bs5(i, 28);
        B0 = new bs5(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bs5(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                es5.b("LocalWindowInfo");
                throw null;
            case 1:
                pq5.d("Unexpected call to default provider");
                throw new fif();
            case 2:
                return Float.valueOf(1.0f);
            case 3:
                return new d85(d85.b);
            case 4:
                return new d85(d85.b);
            case 5:
                return Unit.a;
            case 6:
                return Unit.a;
            case 7:
                return Unit.a;
            case 8:
                return Unit.a;
            case 9:
                return Unit.a;
            case 10:
                return Unit.a;
            case 11:
                return Unit.a;
            case 12:
                return Unit.a;
            case 13:
                return Unit.a;
            case 14:
                return new fjs();
            case 15:
                return Unit.a;
            case 16:
                return Unit.a;
            case 17:
                c5b c5bVar = c5b.a;
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                return new DebugReportImpl(c5bVar, e5bVar, null, c5bVar, e5bVar);
            case 18:
                return new xbl(true, true);
            case 19:
                return 1;
            case 20:
                return Float.valueOf(0.0f);
            case 21:
                return 0;
            case 22:
                return Unit.a;
            case 23:
                return Boolean.TRUE;
            case 24:
                return Unit.a;
            case 25:
                return new Handler(Looper.getMainLooper());
            case 26:
                return new cma(0);
            case 27:
                return wl7.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return Unit.a;
            default:
                return Boolean.TRUE;
        }
    }
}
