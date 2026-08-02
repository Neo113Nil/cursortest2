package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;

/* loaded from: classes11.dex */
public final class u6w extends c {
    public static final u6w b = new u6w();
    public static final String c = CspBioProgressConstants.MAX;
    public static final List d;
    public static final EvaluableType e;
    public static final boolean f;

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        d = Collections.singletonList(new kms(evaluableType, true));
        e = evaluableType;
        f = true;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        if (list.isEmpty()) {
            b.e(c, list, "Function requires non empty argument list.", null);
            throw null;
        }
        Long l = Long.MIN_VALUE;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l = Long.valueOf(Math.max(l.longValue(), ((Long) it.next()).longValue()));
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
