package defpackage;

import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class ekk {
    public final String a;
    public final Function1 b;
    public final long c;
    public final d5h d;
    public final mm6 e;
    public final Function1 f;
    public final ime g;
    public final HashMap h;

    public ekk(String str, Function1 function1, long j, d5h d5hVar, int i) {
        Continuation continuation = null;
        d5hVar = (i & 8) != 0 ? null : d5hVar;
        tf6 e = gld.e(dm6.a);
        ikc ikcVar = new ikc(1, 6, continuation);
        this.a = str;
        this.b = function1;
        this.c = j;
        this.d = d5hVar;
        this.e = e;
        this.f = ikcVar;
        this.g = new ime(this);
        this.h = new HashMap();
        if (nsa.l(j)) {
            return;
        }
        x97.y(e, null, null, new h1j(this, continuation, 20), 3);
    }

    public final eno a(String str, Function2 function2) {
        str.getClass();
        return new eno(new xg(function2, this, str, (Continuation) null));
    }

    public final Object b(String str, Continuation continuation) {
        dkk dkkVar;
        synchronized (this) {
            ime imeVar = this.g;
            imeVar.getClass();
            str.getClass();
            dkkVar = (dkk) imeVar.c;
            if (dkkVar == null || !str.equals((String) imeVar.b)) {
                dkkVar = null;
            }
            if (dkkVar == null && (dkkVar = (dkk) this.h.get(str)) == null) {
                dkkVar = e(str, false);
            }
        }
        Object s = dkkVar.a.s(continuation);
        nm6 nm6Var = nm6.a;
        return s;
    }

    public final ueo c(String str) {
        str.getClass();
        return (ueo) x97.D(g.a, new h1j(this, str, (Continuation) null, 21));
    }

    public final void d(String str) {
        str.getClass();
        synchronized (this) {
            ime imeVar = this.g;
            imeVar.getClass();
            if (Intrinsics.d(str, (String) imeVar.b)) {
                ssg.a(3, this.a, "Database for " + str + " already initialized", null);
                return;
            }
            dkk dkkVar = (dkk) this.h.get(str);
            if (dkkVar == null) {
                e(str, true);
                return;
            }
            ssg.a(3, this.a, "Promote weak database for ".concat(str), null);
            this.h.remove(str);
            ime imeVar2 = this.g;
            imeVar2.getClass();
            dkk dkkVar2 = (dkk) imeVar2.c;
            String str2 = (String) imeVar2.b;
            if (dkkVar2 != null && str2 != null) {
                ((ekk) imeVar2.d).h.put(str2, dkkVar2);
            }
            imeVar2.c = dkkVar;
            imeVar2.b = str;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final dkk e(String str, boolean z) {
        synchronized (this) {
            try {
                ime imeVar = this.g;
                imeVar.getClass();
                str.getClass();
                try {
                    if (Intrinsics.d(str, (String) imeVar.b)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    Continuation continuation = null;
                    ssg.a(3, this.a, "Initialize " + (z ? "" : "weak ") + "database for " + str, null);
                    CoroutineContext.Element element = this.e.getCoroutineContext().get(d.t0);
                    element.getClass();
                    tf6 e = gld.e(element);
                    dkk dkkVar = new dkk(x97.p(this.e, null, null, new rlg(this, str, e, continuation, 23), 3), e);
                    if (z) {
                        ime imeVar2 = this.g;
                        imeVar2.getClass();
                        dkk dkkVar2 = (dkk) imeVar2.c;
                        String str2 = (String) imeVar2.b;
                        if (dkkVar2 != null && str2 != null) {
                            ((ekk) imeVar2.d).h.put(str2, dkkVar2);
                        }
                        imeVar2.c = dkkVar;
                        imeVar2.b = str;
                    } else {
                        this.h.put(str, dkkVar);
                    }
                    return dkkVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
