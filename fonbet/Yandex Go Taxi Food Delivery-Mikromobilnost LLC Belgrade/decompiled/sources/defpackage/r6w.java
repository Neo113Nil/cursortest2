package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class r6w extends c {
    public static final r6w b = new r6w();
    public static final String c = "copySign";
    public static final List d;
    public static final EvaluableType e;
    public static final boolean f;

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        d = scc.g(new kms(evaluableType, false), new kms(evaluableType, false));
        e = evaluableType;
        f = true;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Long l = (Long) a.P(list);
        long longValue = l.longValue();
        int signum = Long.signum(((Long) a.Z(list)).longValue());
        if (signum != 0) {
            if (longValue != Long.MIN_VALUE) {
                return Long.valueOf(Math.abs(longValue) * signum);
            }
            if (signum != -1) {
                b.e(c, list, "Integer overflow.", null);
                throw null;
            }
        }
        return l;
    }

    @Override // com.yandex.div.evaluable.c
    public final List b() {
        return d;
    }

    @Override // com.yandex.div.evaluable.c
    public final String c() {
        return c;
    }

    @Override // com.yandex.div.evaluable.c
    public final EvaluableType d() {
        return e;
    }

    @Override // com.yandex.div.evaluable.c
    public final boolean f() {
        return f;
    }
}
