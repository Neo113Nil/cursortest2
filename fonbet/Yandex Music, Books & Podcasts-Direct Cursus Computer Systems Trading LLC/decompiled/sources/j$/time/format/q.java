package j$.time.format;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class q implements e {
    public final j$.time.temporal.o a;
    public final f0 b;
    public final a0 c;
    public volatile i d;

    public q(j$.time.temporal.o oVar, f0 f0Var, a0 a0Var) {
        this.a = oVar;
        this.b = f0Var;
        this.c = a0Var;
    }

    @Override // j$.time.format.e
    public final boolean u(x xVar, StringBuilder sb) {
        String d;
        Long a = xVar.a(this.a);
        DateTimeFormatter dateTimeFormatter = xVar.b;
        if (a == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) xVar.a.b(j$.time.temporal.p.b);
        if (mVar == null || mVar == j$.time.chrono.t.c) {
            d = this.c.d(this.a, a.longValue(), this.b, dateTimeFormatter.b);
        } else {
            d = this.c.c(mVar, this.a, a.longValue(), this.b, dateTimeFormatter.b);
        }
        if (d != null) {
            sb.append(d);
            return true;
        }
        if (this.d == null) {
            this.d = new i(this.a, 1, 19, e0.NORMAL);
        }
        return this.d.u(xVar, sb);
    }

    @Override // j$.time.format.e
    public final int E(v vVar, CharSequence charSequence, int i) {
        Iterator f;
        a0 a0Var = this.c;
        j$.time.temporal.o oVar = this.a;
        int length = charSequence.length();
        if (i >= 0 && i <= length) {
            boolean z = vVar.c;
            DateTimeFormatter dateTimeFormatter = vVar.a;
            f0 f0Var = z ? this.b : null;
            j$.time.chrono.m mVar = vVar.c().c;
            if (mVar == null && (mVar = vVar.a.e) == null) {
                mVar = j$.time.chrono.t.c;
            }
            j$.time.chrono.m mVar2 = mVar;
            if (mVar2 == null || mVar2 == j$.time.chrono.t.c) {
                f = a0Var.f(oVar, f0Var, dateTimeFormatter.b);
            } else {
                f = a0Var.e(mVar2, oVar, f0Var, dateTimeFormatter.b);
            }
            Iterator it = f;
            if (it != null) {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (vVar.g(str, 0, charSequence, i, str.length())) {
                        return vVar.f(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                    }
                }
                if (oVar == j$.time.temporal.a.ERA && !vVar.c) {
                    Iterator it2 = mVar2.D().iterator();
                    while (it2.hasNext()) {
                        String obj = ((j$.time.chrono.n) it2.next()).toString();
                        if (vVar.g(obj, 0, charSequence, i, obj.length())) {
                            return vVar.f(this.a, r7.getValue(), i, obj.length() + i);
                        }
                    }
                }
                if (vVar.c) {
                    return ~i;
                }
            }
            if (this.d == null) {
                this.d = new i(this.a, 1, 19, e0.NORMAL);
            }
            return this.d.E(vVar, charSequence, i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        f0 f0Var = f0.FULL;
        f0 f0Var2 = this.b;
        j$.time.temporal.o oVar = this.a;
        if (f0Var2 == f0Var) {
            return "Text(" + oVar + ")";
        }
        return "Text(" + oVar + StringUtils.COMMA + f0Var2 + ")";
    }
}
