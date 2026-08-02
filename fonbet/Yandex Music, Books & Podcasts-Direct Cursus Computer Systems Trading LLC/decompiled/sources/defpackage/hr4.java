package defpackage;

import android.os.SystemClock;
import java.text.NumberFormat;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class hr4 implements d80 {
    public static final jyr e = btf.b(e1.Z);
    public final mnn a;
    public final mm6 b;
    public final long c;
    public final zi3 d;

    public hr4(mnn mnnVar, mm6 mm6Var) {
        mm6Var.getClass();
        this.a = mnnVar;
        this.b = mm6Var;
        this.c = SystemClock.elapsedRealtime();
        this.d = men.g(Integer.MAX_VALUE, 6, null);
        x97.y(mm6Var, null, null, new cs1(this, (Continuation) null, 24), 3);
    }

    public static final String a(hr4 hr4Var, int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "YES" : "NO_EXCEEDS_CAPABILITIES" : "NO_UNSUPPORTED_DRM" : "NO_UNSUPPORTED_TYPE" : "NO";
    }

    public static final Object b(hr4 hr4Var, Function0 function0, aur aurVar) {
        Object m = hr4Var.d.m(new ha0(function0, hr4Var), aurVar);
        return m == nm6.a ? m : Unit.a;
    }

    public static String z(long j) {
        if (j == -9223372036854775807L) {
            return "?";
        }
        Object value = e.getValue();
        value.getClass();
        String format = ((NumberFormat) value).format(Float.valueOf(j / 1000.0f));
        format.getClass();
        return format;
    }

    @Override // defpackage.d80
    public final void B(int i, c80 c80Var, g8l g8lVar, g8l g8lVar2) {
        g8lVar.getClass();
        g8lVar2.getClass();
        x97.y(this.b, null, null, new zy3(this, c80Var, g8lVar, g8lVar2, i, (Continuation) null, 1), 3);
    }

    public final void C(wih wihVar) {
        x97.y(this.b, null, null, new rc4(this, wihVar, null, 7), 3);
    }

    public final void G(bjh bjhVar) {
        x97.y(this.b, null, null, new v3(this, bjhVar, (Continuation) null, 17), 3);
    }

    public final String h(c80 c80Var) {
        return "eventTime=" + z(c80Var.a - this.c) + ", mediaPos=" + z(c80Var.e) + ", window=" + c80Var.c;
    }

    @Override // defpackage.d80
    public final void l0(c80 c80Var, e3t e3tVar) {
        e3tVar.getClass();
        x97.y(this.b, null, null, new rc4(this, e3tVar, c80Var, null, 4), 3);
    }

    @Override // defpackage.d80
    public final void n(c80 c80Var) {
        this.d.n(null);
    }

    @Override // defpackage.d80
    public final void v(c80 c80Var, onh onhVar, int i) {
        x97.y(this.b, null, null, new fr4(this, c80Var, onhVar, i, (Continuation) null, 0), 3);
    }
}
