package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class nm9 {
    public final aqd a;
    public final w8s b;
    public final xy0 c = new xy0(0);
    public final LinkedHashMap d = new LinkedHashMap();

    public nm9(aqd aqdVar, w8s w8sVar) {
        this.a = aqdVar;
        this.b = w8sVar;
    }

    public final b1a a(dw8 dw8Var) {
        b1a b1aVar;
        synchronized (this.c) {
            try {
                b1aVar = (b1a) this.c.get(dw8Var);
                if (b1aVar == null) {
                    String str = (String) ((Map) this.a.c).get(dw8Var.a);
                    b1aVar = str != null ? new b1a(Long.parseLong(str)) : null;
                    this.c.put(dw8Var, b1aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b1aVar;
    }

    public final String b(dm9 dm9Var, gc8 gc8Var, xzb xzbVar, String str) {
        Object d;
        String str2 = gc8Var.getDivTag().a;
        String str3 = dm9Var.H;
        if (str3 != null) {
            kxt c = xzbVar.c(str3);
            String obj = (c == null || (d = c.d()) == null) ? null : d.toString();
            if (obj != null) {
                return obj;
            }
        }
        String a = this.b.a(str2, str);
        if (a != null) {
            return a;
        }
        String str4 = (String) ((Map) this.a.b).get(new Pair(str2, str));
        if (str4 == null) {
            szb szbVar = dm9Var.n;
            str4 = szbVar != null ? (String) szbVar.a(xzbVar) : null;
            if (str4 == null) {
                cm9 cm9Var = (cm9) CollectionsKt.firstOrNull(dm9Var.I);
                if (cm9Var != null) {
                    return cm9Var.d;
                }
                return null;
            }
        }
        return str4;
    }

    public final void c(dw8 dw8Var, long j, boolean z) {
        if (dw8.b.equals(dw8Var)) {
            return;
        }
        synchronized (this.c) {
            try {
                b1a a = a(dw8Var);
                this.c.put(dw8Var, a != null ? new b1a(j, a.b) : new b1a(j));
                this.b.b(dw8Var.a, "/", String.valueOf(j));
                if (!z) {
                    ((Map) this.a.c).put(dw8Var.a, String.valueOf(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
