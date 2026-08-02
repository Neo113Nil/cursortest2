package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes11.dex */
public final class w6w extends c {
    public static final w6w b = new w6w();
    public static final String c = "min";
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
        Long valueOf = Long.valueOf(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            valueOf = Long.valueOf(Math.min(valueOf.longValue(), ((Long) it.next()).longValue()));
        }
        return valueOf;
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
