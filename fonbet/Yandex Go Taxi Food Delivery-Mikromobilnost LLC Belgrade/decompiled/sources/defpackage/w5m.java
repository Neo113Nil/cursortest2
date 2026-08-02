package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes11.dex */
public final class w5m extends c {
    public static final w5m b = new w5m();
    public static final String c = "maxNumber";
    public static final EmptyList d = EmptyList.a;
    public static final EvaluableType e = EvaluableType.NUMBER;
    public static final boolean f = true;

    @Override // com.yandex.div.evaluable.c
    public final /* bridge */ /* synthetic */ Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        return Double.valueOf(Double.MAX_VALUE);
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
