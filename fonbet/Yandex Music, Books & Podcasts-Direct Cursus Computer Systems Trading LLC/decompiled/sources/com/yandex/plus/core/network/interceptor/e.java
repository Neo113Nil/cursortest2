package com.yandex.plus.core.network.interceptor;

import defpackage.aa0;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.qs;
import defpackage.xq0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class e {
    public final com.yandex.plus.core.network.context.a a;
    public final Object b;
    public final ArrayList c;
    public final int d;
    public final Function1 e;
    public final boolean f;
    public int g;

    public e(com.yandex.plus.core.network.context.a aVar, Object obj, ArrayList arrayList, int i, Function1 function1, boolean z) {
        aVar.getClass();
        obj.getClass();
        this.a = aVar;
        this.b = obj;
        this.c = arrayList;
        this.d = i;
        this.e = function1;
        this.f = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        b bVar;
        int i;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bVar.j;
                nm6 nm6Var = nm6.a;
                i = bVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    qs qsVar = new qs(this, null, 24);
                    bVar.l = 1;
                    obj = com.yandex.plus.bdui.plus.analytics.b.z(this.e, qsVar, bVar);
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
                return (com.yandex.plus.core.network.call.c) obj;
            }
        }
        bVar = new b(this, cg6Var);
        Object obj2 = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
        if (i != 0) {
        }
        return (com.yandex.plus.core.network.call.c) obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, cg6 cg6Var) {
        c cVar;
        int i;
        com.yandex.plus.core.network.call.c cVar2;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = cVar.k;
                Object obj3 = nm6.a;
                i = cVar.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    cVar.j = obj;
                    cVar.m = 1;
                    obj2 = a(cVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return (com.yandex.plus.core.network.call.c) obj2;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = cVar.j;
                    qgg.h0(obj2);
                }
                cVar2 = (com.yandex.plus.core.network.call.c) obj2;
                if (cVar2 instanceof com.yandex.plus.core.network.call.b) {
                    if (cVar2 instanceof com.yandex.plus.core.network.call.a) {
                        return com.yandex.plus.bdui.plus.analytics.b.c(((com.yandex.plus.core.network.call.a) cVar2).a);
                    }
                    b6e.s();
                    return null;
                }
                a aVar = (a) ((com.yandex.plus.core.network.call.b) cVar2).a;
                cVar.j = null;
                cVar.m = 2;
                obj2 = c(obj, aVar, cVar);
            }
        }
        cVar = new c(this, cg6Var);
        Object obj22 = cVar.k;
        Object obj32 = nm6.a;
        i = cVar.m;
        if (i != 0) {
        }
        cVar2 = (com.yandex.plus.core.network.call.c) obj22;
        if (cVar2 instanceof com.yandex.plus.core.network.call.b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a aVar, cg6 cg6Var) {
        d dVar;
        int i;
        com.yandex.plus.core.network.call.c cVar;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = dVar.j;
                nm6 nm6Var = nm6.a;
                i = dVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    aa0 aa0Var = new aa0(this, obj, aVar, null, 16);
                    dVar.l = 1;
                    obj2 = com.yandex.plus.bdui.plus.analytics.b.z(this.e, aa0Var, dVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                cVar = (com.yandex.plus.core.network.call.c) obj2;
                if (!(cVar instanceof com.yandex.plus.core.network.call.b)) {
                    return (com.yandex.plus.core.network.call.c) ((com.yandex.plus.core.network.call.b) cVar).a;
                }
                if (cVar instanceof com.yandex.plus.core.network.call.a) {
                    return com.yandex.plus.bdui.plus.analytics.b.c(((com.yandex.plus.core.network.call.a) cVar).a);
                }
                b6e.s();
                return null;
            }
        }
        dVar = new d(this, cg6Var);
        Object obj22 = dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dVar.l;
        if (i != 0) {
        }
        cVar = (com.yandex.plus.core.network.call.c) obj22;
        if (!(cVar instanceof com.yandex.plus.core.network.call.b)) {
        }
    }
}
