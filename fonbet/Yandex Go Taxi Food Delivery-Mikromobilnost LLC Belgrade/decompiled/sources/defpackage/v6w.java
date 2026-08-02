package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes11.dex */
public final class v6w extends c {
    public static final v6w b = new v6w();
    public static final String c = "maxInteger";
    public static final EmptyList d = EmptyList.a;
    public static final EvaluableType e = EvaluableType.INTEGER;
    public static final boolean f = true;

    @Override // com.yandex.div.evaluable.c
    public final /* bridge */ /* synthetic */ Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        return Long.valueOf(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
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
