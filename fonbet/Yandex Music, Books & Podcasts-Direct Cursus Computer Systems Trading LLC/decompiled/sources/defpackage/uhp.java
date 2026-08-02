package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class uhp {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final boolean f;

    public uhp(Map map, Map map2, Map map3, Map map4, Map map5, boolean z) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
        this.e = map5;
        this.f = z;
    }

    public final void a(oip oipVar) {
        for (Map.Entry entry : this.a.entrySet()) {
            f9f f9fVar = (f9f) entry.getKey();
            yf6 yf6Var = (yf6) entry.getValue();
            if (yf6Var instanceof wf6) {
                f9fVar.getClass();
                t9f t9fVar = ((wf6) yf6Var).a;
                t9fVar.getClass();
                oipVar.l(f9fVar, t9fVar);
            } else {
                if (!(yf6Var instanceof xf6)) {
                    b6e.s();
                    return;
                }
                oipVar.p(f9fVar, null);
            }
        }
        for (Map.Entry entry2 : this.b.entrySet()) {
            f9f f9fVar2 = (f9f) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                f9f f9fVar3 = (f9f) entry3.getKey();
                t9f t9fVar2 = (t9f) entry3.getValue();
                f9fVar2.getClass();
                f9fVar3.getClass();
                t9fVar2.getClass();
                oipVar.a(f9fVar2, f9fVar3, t9fVar2);
            }
        }
        for (Map.Entry entry4 : this.c.entrySet()) {
            f9f f9fVar4 = (f9f) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            f9fVar4.getClass();
            function1.getClass();
            wct.o(1, function1);
            oipVar.m(f9fVar4, function1);
        }
        for (Map.Entry entry5 : this.e.entrySet()) {
            f9f f9fVar5 = (f9f) entry5.getKey();
            Function1 function12 = (Function1) entry5.getValue();
            f9fVar5.getClass();
            function12.getClass();
            wct.o(1, function12);
            oipVar.b(f9fVar5, function12);
        }
    }

    public final t9f b(f9f f9fVar, List list) {
        list.getClass();
        yf6 yf6Var = (yf6) this.a.get(f9fVar);
        t9f a = yf6Var != null ? yf6Var.a(list) : null;
        if (a instanceof t9f) {
            return a;
        }
        return null;
    }

    public final t9f c(f9f f9fVar, Object obj) {
        f9fVar.getClass();
        obj.getClass();
        lm4 lm4Var = (lm4) f9fVar;
        if (lm4Var.i(obj)) {
            Map map = (Map) this.b.get(lm4Var);
            t9f t9fVar = map != null ? (t9f) map.get(ern.a(obj.getClass())) : null;
            t9f t9fVar2 = t9fVar instanceof t9f ? t9fVar : null;
            if (t9fVar2 != null) {
                return t9fVar2;
            }
            Object obj2 = this.c.get(lm4Var);
            Function1 function1 = wct.D(1, obj2) ? (Function1) obj2 : null;
            if (function1 != null) {
                return (t9f) function1.invoke(obj);
            }
        }
        return null;
    }
}
