package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class t5l {
    public final jyr a;
    public final jyr b;

    public t5l(jyr jyrVar, jyr jyrVar2) {
        this.a = jyrVar;
        this.b = jyrVar2;
    }

    public static String a(mwk mwkVar) {
        mqs a;
        k10 k10Var;
        String str = (mwkVar == null || (a = mwkVar.a()) == null || (k10Var = a.d) == null) ? null : k10Var.a;
        if (str == null) {
            su4.s(2, null, "No album id", null);
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
    
        if (r8 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0055, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum b(jzs jzsVar, cg6 cg6Var) {
        q5l q5lVar;
        int i;
        String a;
        if (cg6Var instanceof q5l) {
            q5lVar = (q5l) cg6Var;
            int i2 = q5lVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q5lVar.m = i2 - Integer.MIN_VALUE;
                Object obj = q5lVar.k;
                nm6 nm6Var = nm6.a;
                i = q5lVar.m;
                Object obj2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    j5l j5lVar = j5l.d;
                    if (jzsVar == null || !o2g.b0(jzsVar) || (a = a(jzsVar)) == null) {
                        return j5lVar;
                    }
                    q5lVar.j = a;
                    q5lVar.m = 1;
                    obj = c(q5lVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        kzs kzsVar = (kzs) obj;
                        i5l i5lVar = j5l.c;
                        Integer num = kzsVar != null ? new Integer(kzsVar.b) : null;
                        i5lVar.getClass();
                        if (num == null) {
                            return j5l.d;
                        }
                        Iterator it = j5l.f.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((j5l) next).b == num.intValue()) {
                                obj2 = next;
                                break;
                            }
                        }
                        j5l j5lVar2 = (j5l) obj2;
                        return j5lVar2 == null ? j5l.d : j5lVar2;
                    }
                    a = q5lVar.j;
                    qgg.h0(obj);
                }
                String str = (String) obj;
                str.getClass();
                p5l p5lVar = (p5l) this.b.getValue();
                q5lVar.j = null;
                q5lVar.m = 2;
                obj = p5lVar.b(str, a, q5lVar);
            }
        }
        q5lVar = new q5l(this, cg6Var);
        Object obj3 = q5lVar.k;
        nm6 nm6Var2 = nm6.a;
        i = q5lVar.m;
        Object obj22 = null;
        if (i != 0) {
        }
        String str2 = (String) obj3;
        str2.getClass();
        p5l p5lVar2 = (p5l) this.b.getValue();
        q5lVar.j = null;
        q5lVar.m = 2;
        obj3 = p5lVar2.b(str2, a, q5lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        r5l r5lVar;
        int i;
        String str;
        if (cg6Var instanceof r5l) {
            r5lVar = (r5l) cg6Var;
            int i2 = r5lVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r5lVar.l = i2 - Integer.MIN_VALUE;
                Object obj = r5lVar.j;
                nm6 nm6Var = nm6.a;
                i = r5lVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc g = ((frt) this.a.getValue()).g();
                    r5lVar.l = 1;
                    obj = zsd.i0(g, r5lVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xxq xxqVar = (xxq) obj;
                return (xxqVar == null || (str = xxqVar.a) == null) ? CommonUrlParts.Values.FALSE_INTEGER : str;
            }
        }
        r5lVar = new r5l(this, cg6Var);
        Object obj2 = r5lVar.j;
        nm6 nm6Var2 = nm6.a;
        i = r5lVar.l;
        if (i != 0) {
        }
        xxq xxqVar2 = (xxq) obj2;
        if (xxqVar2 == null) {
            return CommonUrlParts.Values.FALSE_INTEGER;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r2.c(r8, r4, r0) != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(mwk mwkVar, j5l j5lVar, Continuation continuation) {
        s5l s5lVar;
        int i;
        String a;
        if (continuation instanceof s5l) {
            s5lVar = (s5l) continuation;
            int i2 = s5lVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s5lVar.n = i2 - Integer.MIN_VALUE;
                Object obj = s5lVar.l;
                Object obj2 = nm6.a;
                i = s5lVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    a = a(mwkVar);
                    if (a == null) {
                        return Unit.a;
                    }
                    s5lVar.j = j5lVar;
                    s5lVar.k = a;
                    s5lVar.n = 1;
                    obj = c(s5lVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a = s5lVar.k;
                    j5lVar = s5lVar.j;
                    qgg.h0(obj);
                }
                String str = (String) obj;
                str.getClass();
                p5l p5lVar = (p5l) this.b.getValue();
                kzs kzsVar = new kzs(a, j5lVar.b);
                s5lVar.j = null;
                s5lVar.k = null;
                s5lVar.n = 2;
            }
        }
        s5lVar = new s5l(this, continuation);
        Object obj3 = s5lVar.l;
        Object obj22 = nm6.a;
        i = s5lVar.n;
        if (i != 0) {
        }
        String str2 = (String) obj3;
        str2.getClass();
        p5l p5lVar2 = (p5l) this.b.getValue();
        kzs kzsVar2 = new kzs(a, j5lVar.b);
        s5lVar.j = null;
        s5lVar.k = null;
        s5lVar.n = 2;
    }
}
