package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes10.dex */
public final class w1m0 {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final i550 e;

    public w1m0(Map map) {
        this.a = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new i550(2, this);
    }

    public final Object a(String str) {
        Object value;
        try {
            pz40 pz40Var = (pz40) this.d.get(str);
            if (pz40Var != null && (value = ((r0) pz40Var).getValue()) != null) {
                return value;
            }
            return this.a.get(str);
        } catch (ClassCastException unused) {
            this.c(str);
            return null;
        }
    }

    public final i550 b() {
        return this.e;
    }

    public final Object c(String str) {
        Object remove = this.a.remove(str);
        this.c.remove(str);
        this.d.remove(str);
        return remove;
    }

    public final void d(String str, Object obj) {
        this.a.put(str, obj);
        pz40 pz40Var = (pz40) this.c.get(str);
        if (pz40Var != null) {
            ((r0) pz40Var).l(obj);
        }
        pz40 pz40Var2 = (pz40) this.d.get(str);
        if (pz40Var2 != null) {
            ((r0) pz40Var2).l(obj);
        }
    }

    public /* synthetic */ w1m0(int i) {
        this(b.f());
    }

    public w1m0() {
        this(0);
    }
}
