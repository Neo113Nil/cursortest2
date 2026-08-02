package defpackage;

import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class pvf {
    public final HashMap a = new HashMap();

    public final void a(String[] strArr, Function0 function0) {
        jyr b = btf.b(function0);
        for (String str : strArr) {
            this.a.put(str, b);
        }
    }

    public final Object b(String str) {
        Object value;
        str.getClass();
        arf arfVar = (arf) this.a.get(str);
        if (arfVar == null || (value = arfVar.getValue()) == null) {
            return null;
        }
        return value;
    }
}
