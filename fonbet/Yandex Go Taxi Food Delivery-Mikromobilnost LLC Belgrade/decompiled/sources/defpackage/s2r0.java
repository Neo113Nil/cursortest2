package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.types.a;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes11.dex */
public final class s2r0 extends c {
    public static final s2r0 b = new s2r0();
    public static final String c = "setDay";
    public static final List d;
    public static final EvaluableType e;
    public static final boolean f;

    static {
        EvaluableType evaluableType = EvaluableType.DATETIME;
        d = scc.g(new kms(evaluableType, false), new kms(EvaluableType.INTEGER, false));
        e = evaluableType;
        f = true;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        a aVar = (a) list.get(0);
        long longValue = ((Long) list.get(1)).longValue();
        Calendar k = h6u0.k(aVar);
        int actualMaximum = k.getActualMaximum(5);
        if (1 <= longValue && longValue <= actualMaximum) {
            k.set(5, (int) longValue);
        } else {
            if (longValue != -1) {
                b.e(c, list, "Unable to set day " + longValue + " for date " + aVar + '.', null);
                throw null;
            }
            k.set(5, 0);
        }
        return new a(k.getTimeInMillis(), aVar.b);
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
