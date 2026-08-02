package defpackage;

import com.yandex.messaging.internal.storage.contacts.a;
import java.util.LinkedList;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class u9e implements vff0 {
    public final a A;
    public final lqo B;
    public s7m C;
    public final LinkedList D = new LinkedList();
    public h0x0 E;
    public xo3 F;
    public int G;
    public final gui0 a;
    public final to3 b;
    public final k020 c;
    public final String w;
    public final x22 x;
    public final at2 y;
    public final x9e z;

    public u9e(gui0 gui0Var, wff0 wff0Var, to3 to3Var, k020 k020Var, String str, x22 x22Var, at2 at2Var, x9e x9eVar, a aVar, lqo lqoVar) {
        this.a = gui0Var;
        this.b = to3Var;
        this.c = k020Var;
        this.w = str;
        this.x = x22Var;
        this.y = at2Var;
        this.z = x9eVar;
        this.A = aVar;
        this.B = lqoVar;
        wff0Var.a(this);
    }

    public final s7m a() {
        return new s7m(this.a, this.b, this.c, this.x, this.w, new lyc(14, this));
    }

    @Override // defpackage.vff0
    public final void b() {
        d();
    }

    public final void c() {
        s7m s7mVar = (s7m) this.D.poll();
        if (s7mVar != null) {
            s7mVar.c();
            this.C = s7mVar;
            return;
        }
        aqb1.d(this.x, "local_count", b.i(new Pair("uuid", this.w), new Pair("count", Integer.valueOf(((Number) androidx.room.util.a.b(this.y.r0().b, true, false, new xpy(14))).intValue()))));
        h0x0 h0x0Var = this.E;
        if (h0x0Var != null) {
            h0x0Var.invoke();
        }
        this.E = null;
    }

    public final void d() {
        s7m s7mVar = this.C;
        if (s7mVar != null) {
            s7mVar.m.set(true);
            s7mVar.b("force_cancel");
            xo3 xo3Var = s7mVar.l;
            if (xo3Var != null) {
                xo3Var.cancel();
            }
            s7mVar.l = null;
            s7mVar.f = null;
        }
        this.C = null;
        xo3 xo3Var2 = this.F;
        if (xo3Var2 != null) {
            xo3Var2.cancel();
        }
        this.F = null;
        this.E = null;
    }
}
