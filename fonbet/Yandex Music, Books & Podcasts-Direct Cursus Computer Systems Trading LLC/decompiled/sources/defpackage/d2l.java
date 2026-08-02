package defpackage;

import com.yandex.music.databases.user.UserDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class d2l {
    public final dst a;

    public d2l(dst dstVar) {
        this.a = dstVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        a2l a2lVar;
        int i;
        if (cg6Var instanceof a2l) {
            a2lVar = (a2l) cg6Var;
            int i2 = a2lVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a2lVar.l = i2 - Integer.MIN_VALUE;
                Object obj = a2lVar.j;
                nm6 nm6Var = nm6.a;
                i = a2lVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    a2lVar.l = 1;
                    obj = this.a.b(str, a2lVar);
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
                return ((UserDatabase) obj).z();
            }
        }
        a2lVar = new a2l(this, cg6Var);
        Object obj2 = a2lVar.j;
        nm6 nm6Var2 = nm6.a;
        i = a2lVar.l;
        if (i != 0) {
        }
        return ((UserDatabase) obj2).z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r12 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (r12 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(String str, cg6 cg6Var) {
        b2l b2lVar;
        int i;
        if (cg6Var instanceof b2l) {
            b2lVar = (b2l) cg6Var;
            int i2 = b2lVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b2lVar.l = i2 - Integer.MIN_VALUE;
                Object obj = b2lVar.j;
                nm6 nm6Var = nm6.a;
                i = b2lVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    b2lVar.l = 1;
                    obj = a(str, b2lVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Iterable<x1l> iterable = (Iterable) obj;
                        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                        for (x1l x1lVar : iterable) {
                            arrayList.add(new l1l(x1lVar.a, x1lVar.b, x1lVar.c, x1lVar.d, x1lVar.e));
                        }
                        return arrayList;
                    }
                    qgg.h0(obj);
                }
                b2lVar.l = 2;
                obj = up6.G(((w1l) obj).a, true, false, new e0l(21), b2lVar);
            }
        }
        b2lVar = new b2l(this, cg6Var);
        Object obj2 = b2lVar.j;
        nm6 nm6Var2 = nm6.a;
        i = b2lVar.l;
        if (i != 0) {
        }
        b2lVar.l = 2;
        obj2 = up6.G(((w1l) obj2).a, true, false, new e0l(21), b2lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if (r1 != r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        if (r4 == r3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[LOOP:0: B:18:0x0064->B:20:0x006a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, w55 w55Var, cg6 cg6Var) {
        c2l c2lVar;
        int i;
        w55<l1l> w55Var2;
        Object a;
        Object G;
        if (cg6Var instanceof c2l) {
            c2lVar = (c2l) cg6Var;
            int i2 = c2lVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2lVar.m = i2 - Integer.MIN_VALUE;
                Object obj = c2lVar.k;
                Object obj2 = nm6.a;
                i = c2lVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    w55Var2 = w55Var;
                    c2lVar.j = w55Var2;
                    c2lVar.m = 1;
                    a = a(str, c2lVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w55 w55Var3 = c2lVar.j;
                    qgg.h0(obj);
                    a = obj;
                    w55Var2 = w55Var3;
                }
                w1l w1lVar = (w1l) a;
                ArrayList arrayList = new ArrayList(v75.o(w55Var2, 10));
                for (l1l l1lVar : w55Var2) {
                    arrayList.add(new x1l(l1lVar.a, l1lVar.b, l1lVar.c, l1lVar.d, l1lVar.e));
                }
                c2lVar.j = null;
                c2lVar.m = 2;
                G = up6.G(w1lVar.a, false, true, new avi(13, w1lVar, arrayList), c2lVar);
                if (G != nm6.a) {
                    G = Unit.a;
                }
            }
        }
        c2lVar = new c2l(this, cg6Var);
        Object obj3 = c2lVar.k;
        Object obj22 = nm6.a;
        i = c2lVar.m;
        if (i != 0) {
        }
        w1l w1lVar2 = (w1l) a;
        ArrayList arrayList2 = new ArrayList(v75.o(w55Var2, 10));
        while (r1.hasNext()) {
        }
        c2lVar.j = null;
        c2lVar.m = 2;
        G = up6.G(w1lVar2.a, false, true, new avi(13, w1lVar2, arrayList2), c2lVar);
        if (G != nm6.a) {
        }
    }
}
