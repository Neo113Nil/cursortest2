package defpackage;

import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class ydt extends c {
    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        jb7 jb7Var = (jb7) cxq0Var.c;
        String str = (String) list.get(0);
        Object h = j() ? jb7Var.h(str, (String) list.get(1)) : jb7Var.h(str, "global");
        if (h != null) {
            return h;
        }
        b.e(c(), list, "Missing value.", null);
        throw null;
    }

    @Override // com.yandex.div.evaluable.c
    public final boolean f() {
        return false;
    }

    public boolean j() {
        return false;
    }
}
