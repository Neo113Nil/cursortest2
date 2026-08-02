package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes11.dex */
public final class yhy0 extends c {
    public static final yhy0 b = new yhy0();
    public static final String c = "testRegex";
    public static final List d;
    public static final EvaluableType e;
    public static final boolean f;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        d = scc.g(new kms(evaluableType, false), new kms(evaluableType, false));
        e = EvaluableType.BOOLEAN;
        f = true;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        try {
            return Boolean.valueOf(Pattern.compile((String) list.get(1)).matcher((String) list.get(0)).find());
        } catch (PatternSyntaxException unused) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            for (Object obj : list2) {
                if (obj instanceof String) {
                    obj = cvu0.v((String) obj, "\\", "\\\\", false);
                }
                arrayList.add(obj);
            }
            b.e(c, arrayList, "Invalid regular expression.", null);
            throw null;
        }
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
