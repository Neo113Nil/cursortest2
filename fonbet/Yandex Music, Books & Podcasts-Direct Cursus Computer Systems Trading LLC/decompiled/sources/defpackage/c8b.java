package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.a;

/* loaded from: classes.dex */
public final class c8b implements cse {
    public final skn a;
    public final czr b;
    public final lum c;
    public final mka d;

    public c8b(skn sknVar, czr czrVar, lum lumVar) {
        this.a = sknVar;
        this.b = czrVar;
        this.c = lumVar;
        this.d = new mka(sknVar, lumVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009e -> B:10:0x00a1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c8b c8bVar, r3r r3rVar, on5 on5Var, rce rceVar, Object obj, rwj rwjVar, hib hibVar, cg6 cg6Var) {
        w7b w7bVar;
        int i;
        int i2;
        int size;
        Pair pair;
        c8bVar.getClass();
        if (cg6Var instanceof w7b) {
            w7bVar = (w7b) cg6Var;
            int i3 = w7bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w7bVar.t = i3 - Integer.MIN_VALUE;
                Object obj2 = w7bVar.r;
                nm6 nm6Var = nm6.a;
                i = w7bVar.t;
                if (i != 0) {
                    qgg.h0(obj2);
                    i2 = 0;
                    skn sknVar = c8bVar.a;
                    List list = on5Var.e;
                    size = list.size();
                    while (true) {
                        if (i2 >= size) {
                        }
                        i2++;
                    }
                    if (pair != null) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = w7bVar.q;
                    hib hibVar2 = w7bVar.p;
                    rwj rwjVar2 = w7bVar.o;
                    Object obj3 = w7bVar.n;
                    rce rceVar2 = w7bVar.m;
                    on5 on5Var2 = w7bVar.l;
                    r3r r3rVar2 = w7bVar.k;
                    c8b c8bVar2 = w7bVar.j;
                    qgg.h0(obj2);
                    int intValue = i4;
                    c8bVar = c8bVar2;
                    hibVar = hibVar2;
                    r3rVar = r3rVar2;
                    rwjVar = rwjVar2;
                    on5Var = on5Var2;
                    obj = obj3;
                    rceVar = rceVar2;
                    zf7 zf7Var = (zf7) obj2;
                    hibVar.getClass();
                    if (zf7Var == null) {
                        Drawable drawable = zf7Var.a;
                        boolean z = zf7Var.b;
                        bb7 bb7Var = r3rVar.c;
                        tce tceVar = r3rVar.a;
                        w9c w9cVar = tceVar instanceof w9c ? (w9c) tceVar : null;
                        return new v7b(drawable, z, bb7Var, w9cVar != null ? w9cVar.c : null);
                    }
                    i2 = intValue;
                    skn sknVar2 = c8bVar.a;
                    List list2 = on5Var.e;
                    size = list2.size();
                    while (true) {
                        if (i2 >= size) {
                            pair = null;
                            break;
                        }
                        dg7 a = ((cg7) list2.get(i2)).a(r3rVar, rwjVar);
                        if (a != null) {
                            pair = new Pair(a, Integer.valueOf(i2));
                            break;
                        }
                        i2++;
                    }
                    if (pair != null) {
                        wb8.h(hrg.n(obj, "Unable to create a decoder that supports: "));
                        return null;
                    }
                    dg7 dg7Var = (dg7) pair.a;
                    intValue = ((Number) pair.b).intValue() + 1;
                    hibVar.getClass();
                    w7bVar.j = c8bVar;
                    w7bVar.k = r3rVar;
                    w7bVar.l = on5Var;
                    w7bVar.m = rceVar;
                    w7bVar.n = obj;
                    w7bVar.o = rwjVar;
                    w7bVar.p = hibVar;
                    w7bVar.q = intValue;
                    w7bVar.t = 1;
                    obj2 = dg7Var.a(w7bVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                    zf7 zf7Var2 = (zf7) obj2;
                    hibVar.getClass();
                    if (zf7Var2 == null) {
                    }
                }
            }
        }
        w7bVar = new w7b(c8bVar, cg6Var);
        Object obj22 = w7bVar.r;
        nm6 nm6Var2 = nm6.a;
        i = w7bVar.t;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0175, code lost:
    
        if (r12.m == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x018e, code lost:
    
        if (r1 == r7) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:26:0x004a, B:27:0x010b, B:45:0x0064, B:47:0x00d1, B:49:0x00dc, B:54:0x00ef, B:67:0x0119, B:69:0x0122, B:71:0x01a8, B:72:0x01ad), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119 A[Catch: all -> 0x004f, TryCatch #2 {all -> 0x004f, blocks: (B:26:0x004a, B:27:0x010b, B:45:0x0064, B:47:0x00d1, B:49:0x00dc, B:54:0x00ef, B:67:0x0119, B:69:0x0122, B:71:0x01a8, B:72:0x01ad), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0071  */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(c8b c8bVar, rce rceVar, Object obj, rwj rwjVar, hib hibVar, cg6 cg6Var) {
        x7b x7bVar;
        xqn xqnVar;
        r3r r3rVar;
        c8b c8bVar2;
        Object obj2;
        hib hibVar2;
        xqn xqnVar2;
        xqn xqnVar3;
        xqn xqnVar4;
        xqn xqnVar5;
        rce rceVar2;
        Object obj3;
        h8c h8cVar;
        rce rceVar3;
        xqn xqnVar6;
        hib hibVar3;
        c8b c8bVar3;
        xqn xqnVar7;
        c8b c8bVar4;
        v7b v7bVar;
        r3r r3rVar2;
        List list;
        Object obj4;
        Bitmap bitmap;
        try {
            if (cg6Var instanceof x7b) {
                x7bVar = (x7b) cg6Var;
                int i = x7bVar.t;
                if ((i & Integer.MIN_VALUE) != 0) {
                    x7bVar.t = i - Integer.MIN_VALUE;
                    x7b x7bVar2 = x7bVar;
                    Object obj5 = x7bVar2.r;
                    nm6 nm6Var = nm6.a;
                    xqnVar = x7bVar2.t;
                    if (xqnVar != 0) {
                        xqn i2 = hrg.i(obj5);
                        i2.a = rwjVar;
                        xqn xqnVar8 = new xqn();
                        xqnVar8.a = c8bVar.a.i;
                        xqn xqnVar9 = new xqn();
                        try {
                            i2.a = c8bVar.c.m0((rwj) i2.a);
                            rceVar.getClass();
                            on5 on5Var = (on5) xqnVar8.a;
                            rwj rwjVar2 = (rwj) i2.a;
                            x7bVar2.j = c8bVar;
                            x7bVar2.k = rceVar;
                            x7bVar2.l = obj;
                            x7bVar2.m = hibVar;
                            x7bVar2.n = i2;
                            x7bVar2.o = xqnVar8;
                            x7bVar2.p = xqnVar9;
                            x7bVar2.q = xqnVar9;
                            x7bVar2.t = 1;
                            Object d = c8bVar.d(on5Var, rceVar, obj, rwjVar2, hibVar, x7bVar2);
                            if (d != nm6Var) {
                                c8bVar2 = c8bVar;
                                obj2 = obj;
                                hibVar2 = hibVar;
                                xqnVar2 = i2;
                                xqnVar3 = xqnVar8;
                                xqnVar4 = xqnVar9;
                                xqnVar5 = xqnVar4;
                                rceVar2 = rceVar;
                                obj3 = d;
                            }
                            return nm6Var;
                        } catch (Throwable th) {
                            th = th;
                            xqnVar = xqnVar9;
                            Object obj6 = xqnVar.a;
                            if (obj6 instanceof r3r) {
                            }
                            if (r3rVar != null) {
                            }
                            throw th;
                        }
                    }
                    if (xqnVar == 1) {
                        xqnVar4 = x7bVar2.q;
                        xqnVar5 = x7bVar2.p;
                        xqn xqnVar10 = x7bVar2.o;
                        xqn xqnVar11 = x7bVar2.n;
                        hib hibVar4 = (hib) x7bVar2.m;
                        Object obj7 = x7bVar2.l;
                        rceVar2 = x7bVar2.k;
                        c8b c8bVar5 = x7bVar2.j;
                        qgg.h0(obj5);
                        xqnVar3 = xqnVar10;
                        xqnVar2 = xqnVar11;
                        hibVar2 = hibVar4;
                        obj2 = obj7;
                        c8bVar2 = c8bVar5;
                        obj3 = obj5;
                    } else {
                        if (xqnVar != 2) {
                            if (xqnVar != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj5);
                            v7b v7bVar2 = (v7b) obj5;
                            Drawable drawable = v7bVar2.a;
                            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                                bitmap.prepareToDraw();
                            }
                            return v7bVar2;
                        }
                        xqnVar5 = x7bVar2.n;
                        xqnVar7 = (xqn) x7bVar2.m;
                        hibVar3 = (hib) x7bVar2.l;
                        rceVar3 = x7bVar2.k;
                        c8bVar4 = x7bVar2.j;
                        qgg.h0(obj5);
                        obj4 = obj5;
                        xqnVar6 = xqnVar7;
                        c8bVar3 = c8bVar4;
                        v7bVar = (v7b) obj4;
                        hib hibVar5 = hibVar3;
                        rce rceVar4 = rceVar3;
                        Object obj8 = xqnVar5.a;
                        r3rVar2 = obj8 instanceof r3r ? (r3r) obj8 : null;
                        if (r3rVar2 != null) {
                            k.a(r3rVar2.a);
                        }
                        rwj rwjVar3 = (rwj) xqnVar6.a;
                        x7bVar2.j = null;
                        x7bVar2.k = null;
                        x7bVar2.l = null;
                        x7bVar2.m = null;
                        x7bVar2.n = null;
                        x7bVar2.o = null;
                        x7bVar2.p = null;
                        x7bVar2.q = null;
                        x7bVar2.t = 3;
                        c8bVar3.getClass();
                        list = rceVar4.i;
                        obj5 = v7bVar;
                        if (!list.isEmpty()) {
                            if (!(v7bVar.a instanceof BitmapDrawable)) {
                                obj5 = v7bVar;
                            }
                            obj5 = x97.V(rceVar4.w, new b8b(c8bVar3, v7bVar, rwjVar3, list, hibVar5, rceVar4, null), x7bVar2);
                        }
                    }
                    xqnVar4.a = obj3;
                    Object obj9 = xqnVar5.a;
                    h8cVar = (h8c) obj9;
                    if (h8cVar instanceof r3r) {
                        rceVar3 = rceVar2;
                        xqnVar6 = xqnVar2;
                        hibVar3 = hibVar2;
                        if (!(h8cVar instanceof qpa)) {
                            throw new x7j();
                        }
                        c8bVar3 = c8bVar2;
                        v7bVar = new v7b(((qpa) obj9).a, ((qpa) obj9).b, ((qpa) obj9).c, null);
                        hib hibVar52 = hibVar3;
                        rce rceVar42 = rceVar3;
                        Object obj82 = xqnVar5.a;
                        if (obj82 instanceof r3r) {
                        }
                        if (r3rVar2 != null) {
                        }
                        rwj rwjVar32 = (rwj) xqnVar6.a;
                        x7bVar2.j = null;
                        x7bVar2.k = null;
                        x7bVar2.l = null;
                        x7bVar2.m = null;
                        x7bVar2.n = null;
                        x7bVar2.o = null;
                        x7bVar2.p = null;
                        x7bVar2.q = null;
                        x7bVar2.t = 3;
                        c8bVar3.getClass();
                        list = rceVar42.i;
                        obj5 = v7bVar;
                        if (!list.isEmpty()) {
                        }
                    } else {
                        a aVar = rceVar2.v;
                        xqn xqnVar12 = xqnVar5;
                        rce rceVar5 = rceVar2;
                        try {
                            y7b y7bVar = new y7b(c8bVar2, xqnVar12, xqnVar3, rceVar5, obj2, xqnVar2, hibVar2, (Continuation) null);
                            rceVar3 = rceVar5;
                            xqn xqnVar13 = xqnVar2;
                            hibVar3 = hibVar2;
                            x7bVar2.j = c8bVar2;
                            x7bVar2.k = rceVar3;
                            x7bVar2.l = hibVar3;
                            x7bVar2.m = xqnVar13;
                            x7bVar2.n = xqnVar5;
                            x7bVar2.o = null;
                            x7bVar2.p = null;
                            x7bVar2.q = null;
                            x7bVar2.t = 2;
                            Object V = x97.V(aVar, y7bVar, x7bVar2);
                            if (V == nm6Var) {
                                return nm6Var;
                            }
                            xqnVar7 = xqnVar13;
                            c8bVar4 = c8bVar2;
                            obj4 = V;
                            xqnVar6 = xqnVar7;
                            c8bVar3 = c8bVar4;
                            v7bVar = (v7b) obj4;
                            hib hibVar522 = hibVar3;
                            rce rceVar422 = rceVar3;
                            Object obj822 = xqnVar5.a;
                            if (obj822 instanceof r3r) {
                            }
                            if (r3rVar2 != null) {
                            }
                            rwj rwjVar322 = (rwj) xqnVar6.a;
                            x7bVar2.j = null;
                            x7bVar2.k = null;
                            x7bVar2.l = null;
                            x7bVar2.m = null;
                            x7bVar2.n = null;
                            x7bVar2.o = null;
                            x7bVar2.p = null;
                            x7bVar2.q = null;
                            x7bVar2.t = 3;
                            c8bVar3.getClass();
                            list = rceVar422.i;
                            obj5 = v7bVar;
                            if (!list.isEmpty()) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            xqnVar = xqnVar12;
                            Object obj62 = xqnVar.a;
                            r3rVar = obj62 instanceof r3r ? (r3r) obj62 : null;
                            if (r3rVar != null) {
                                k.a(r3rVar.a);
                            }
                            throw th;
                        }
                    }
                }
            }
            if (xqnVar != 0) {
            }
            xqnVar4.a = obj3;
            Object obj92 = xqnVar5.a;
            h8cVar = (h8c) obj92;
            if (h8cVar instanceof r3r) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        x7bVar = new x7b(c8bVar, cg6Var);
        x7b x7bVar22 = x7bVar;
        Object obj52 = x7bVar22.r;
        nm6 nm6Var2 = nm6.a;
        xqnVar = x7bVar22.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // defpackage.cse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mr1 mr1Var, Continuation continuation) {
        a8b a8bVar;
        int i;
        c8b c8bVar;
        c8b c8bVar2 = this;
        mr1 mr1Var2 = mr1Var;
        mka mkaVar = c8bVar2.d;
        if (continuation instanceof a8b) {
            a8bVar = (a8b) continuation;
            int i2 = a8bVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a8bVar.n = i2 - Integer.MIN_VALUE;
                a8b a8bVar2 = a8bVar;
                Object obj = a8bVar2.l;
                nm6 nm6Var = nm6.a;
                i = a8bVar2.n;
                if (i != 0) {
                    qgg.h0(obj);
                    try {
                        rce rceVar = (rce) mr1Var2.e;
                        Object obj2 = rceVar.b;
                        lmq lmqVar = (lmq) mr1Var2.f;
                        Bitmap.Config[] configArr = k.a;
                        hib hibVar = (hib) mr1Var2.g;
                        rwj a0 = c8bVar2.c.a0(rceVar, lmqVar);
                        nso nsoVar = a0.e;
                        List list = c8bVar2.a.i.b;
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            try {
                                Pair pair = (Pair) list.get(i3);
                                em3 em3Var = (em3) pair.a;
                                if (((Class) pair.b).isAssignableFrom(obj2.getClass())) {
                                    em3Var.getClass();
                                    Object a = em3Var.a(obj2, a0);
                                    if (a != null) {
                                        obj2 = a;
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                c8bVar2 = this;
                                c8bVar = c8bVar2;
                                if (!(th instanceof CancellationException)) {
                                }
                            }
                        }
                        try {
                            xwh m = mkaVar.m(rceVar, obj2, a0, hibVar);
                            ywh k = m != null ? mkaVar.k(rceVar, m, lmqVar, nsoVar) : null;
                            if (k != null) {
                                return mka.r(mr1Var2, rceVar, m, k);
                            }
                            a aVar = rceVar.u;
                            c8bVar2 = this;
                            y7b y7bVar = new y7b(c8bVar2, rceVar, obj2, a0, hibVar, m, mr1Var2, (Continuation) null);
                            a8bVar2.j = c8bVar2;
                            a8bVar2.k = mr1Var2;
                            a8bVar2.n = 1;
                            Object V = x97.V(aVar, y7bVar, a8bVar2);
                            return V == nm6Var ? nm6Var : V;
                        } catch (Throwable th2) {
                            th = th2;
                            c8bVar2 = this;
                            c8bVar = c8bVar2;
                            if (!(th instanceof CancellationException)) {
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mr1 mr1Var3 = a8bVar2.k;
                    c8bVar = a8bVar2.j;
                    try {
                        qgg.h0(obj);
                        return obj;
                    } catch (Throwable th4) {
                        th = th4;
                        mr1Var2 = mr1Var3;
                    }
                }
                if (!(th instanceof CancellationException)) {
                    throw th;
                }
                lum lumVar = c8bVar.c;
                return lum.E((rce) mr1Var2.e, th);
            }
        }
        a8bVar = new a8b(c8bVar2, (cg6) continuation);
        a8b a8bVar22 = a8bVar;
        Object obj3 = a8bVar22.l;
        nm6 nm6Var2 = nm6.a;
        i = a8bVar22.n;
        if (i != 0) {
        }
        if (!(th instanceof CancellationException)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c5 -> B:10:0x00c7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(on5 on5Var, rce rceVar, Object obj, rwj rwjVar, hib hibVar, cg6 cg6Var) {
        z7b z7bVar;
        c8b c8bVar;
        int i;
        Object obj2;
        rwj rwjVar2;
        hib hibVar2;
        int i2;
        z7b z7bVar2;
        c8b c8bVar2;
        on5 on5Var2;
        rce rceVar2;
        int size;
        Pair pair;
        if (cg6Var instanceof z7b) {
            z7bVar = (z7b) cg6Var;
            int i3 = z7bVar.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z7bVar.s = i3 - Integer.MIN_VALUE;
                c8bVar = this;
                Object obj3 = z7bVar.q;
                nm6 nm6Var = nm6.a;
                i = z7bVar.s;
                if (i != 0) {
                    qgg.h0(obj3);
                    obj2 = obj;
                    rwjVar2 = rwjVar;
                    hibVar2 = hibVar;
                    i2 = 0;
                    z7bVar2 = z7bVar;
                    c8bVar2 = c8bVar;
                    on5Var2 = on5Var;
                    rceVar2 = rceVar;
                    skn sknVar = c8bVar2.a;
                    List list = on5Var2.d;
                    size = list.size();
                    while (true) {
                        if (i2 < size) {
                        }
                        i2++;
                    }
                    if (pair != null) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = z7bVar.p;
                    hib hibVar3 = z7bVar.o;
                    rwj rwjVar3 = z7bVar.n;
                    Object obj4 = z7bVar.m;
                    rce rceVar3 = z7bVar.l;
                    on5 on5Var3 = z7bVar.k;
                    c8bVar2 = z7bVar.j;
                    qgg.h0(obj3);
                    z7bVar2 = z7bVar;
                    rceVar2 = rceVar3;
                    i2 = i4;
                    obj2 = obj4;
                    hibVar2 = hibVar3;
                    rwjVar2 = rwjVar3;
                    h8c h8cVar = (h8c) obj3;
                    try {
                        hibVar2.getClass();
                        if (h8cVar == null) {
                            return h8cVar;
                        }
                        on5Var2 = on5Var3;
                        skn sknVar2 = c8bVar2.a;
                        List list2 = on5Var2.d;
                        size = list2.size();
                        while (true) {
                            if (i2 < size) {
                                pair = null;
                                break;
                            }
                            Pair pair2 = (Pair) list2.get(i2);
                            r8c r8cVar = (r8c) pair2.a;
                            if (((Class) pair2.b).isAssignableFrom(obj2.getClass())) {
                                r8cVar.getClass();
                                s8c a = r8cVar.a(obj2, rwjVar2);
                                if (a != null) {
                                    pair = new Pair(a, Integer.valueOf(i2));
                                    break;
                                }
                            }
                            i2++;
                        }
                        if (pair != null) {
                            wb8.h(hrg.n(obj2, "Unable to create a fetcher that supports: "));
                            return null;
                        }
                        s8c s8cVar = (s8c) pair.a;
                        i2 = ((Number) pair.b).intValue() + 1;
                        hibVar2.getClass();
                        z7bVar2.j = c8bVar2;
                        z7bVar2.k = on5Var2;
                        z7bVar2.l = rceVar2;
                        z7bVar2.m = obj2;
                        z7bVar2.n = rwjVar2;
                        z7bVar2.o = hibVar2;
                        z7bVar2.p = i2;
                        z7bVar2.s = 1;
                        Object a2 = s8cVar.a(z7bVar2);
                        if (a2 == nm6Var) {
                            return nm6Var;
                        }
                        on5Var3 = on5Var2;
                        obj3 = a2;
                        h8c h8cVar2 = (h8c) obj3;
                        hibVar2.getClass();
                        if (h8cVar2 == null) {
                        }
                    } catch (Throwable th) {
                        r3r r3rVar = h8cVar2 instanceof r3r ? (r3r) h8cVar2 : null;
                        if (r3rVar != null) {
                            k.a(r3rVar.a);
                        }
                        throw th;
                    }
                }
            }
        }
        c8bVar = this;
        z7bVar = new z7b(c8bVar, cg6Var);
        Object obj32 = z7bVar.q;
        nm6 nm6Var2 = nm6.a;
        i = z7bVar.s;
        if (i != 0) {
        }
    }
}
