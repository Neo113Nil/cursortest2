package com.yandex.plus.core.network.okhttp.interceptor;

import com.yandex.plus.core.network.okhttp.call.h;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class f {
    public final h a;

    public f(h hVar) {
        this.a = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.plus.core.network.interceptor.e eVar, cg6 cg6Var) {
        a aVar;
        int i;
        com.yandex.plus.core.network.call.c cVar;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.m = i2 - Integer.MIN_VALUE;
                Object obj = aVar.k;
                nm6 nm6Var = nm6.a;
                i = aVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    aVar.j = eVar;
                    aVar.m = 1;
                    obj = this.a.a(eVar, aVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eVar = aVar.j;
                    qgg.h0(obj);
                }
                cVar = (com.yandex.plus.core.network.call.c) obj;
                if (cVar == null) {
                    return cVar;
                }
                Object obj2 = eVar.b;
                aVar.j = null;
                aVar.m = 2;
                Object b = eVar.b(obj2, aVar);
                return b == nm6Var ? nm6Var : b;
            }
        }
        aVar = new a(this, cg6Var);
        Object obj3 = aVar.k;
        nm6 nm6Var2 = nm6.a;
        i = aVar.m;
        if (i != 0) {
        }
        cVar = (com.yandex.plus.core.network.call.c) obj3;
        if (cVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.yandex.plus.core.network.interceptor.e eVar, Continuation continuation) {
        b bVar;
        int i;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.m = i2 - Integer.MIN_VALUE;
                Object obj = bVar.k;
                nm6 nm6Var = nm6.a;
                i = bVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eVar = bVar.j;
                    qgg.h0(obj);
                    com.yandex.plus.core.network.call.c cVar = (com.yandex.plus.core.network.call.c) obj;
                    if (cVar != null) {
                        return cVar;
                    }
                }
                eVar.getClass();
                Unit unit = Unit.a;
                bVar.j = null;
                bVar.m = 2;
                Object b = eVar.b(unit, bVar);
                return b != nm6Var ? nm6Var : b;
            }
        }
        bVar = new b(this, continuation);
        Object obj2 = bVar.k;
        nm6 nm6Var2 = nm6.a;
        i = bVar.m;
        if (i != 0) {
        }
        eVar.getClass();
        Unit unit2 = Unit.a;
        bVar.j = null;
        bVar.m = 2;
        Object b2 = eVar.b(unit2, bVar);
        if (b2 != nm6Var2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(com.yandex.plus.core.network.interceptor.e eVar, Continuation continuation) {
        c cVar;
        int i;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.m = i2 - Integer.MIN_VALUE;
                Object obj = cVar.k;
                nm6 nm6Var = nm6.a;
                i = cVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eVar = cVar.j;
                    qgg.h0(obj);
                    com.yandex.plus.core.network.call.c cVar2 = (com.yandex.plus.core.network.call.c) obj;
                    if (cVar2 != null) {
                        return cVar2;
                    }
                }
                Object obj2 = eVar.b;
                cVar.j = null;
                cVar.m = 2;
                Object b = eVar.b(obj2, cVar);
                return b != nm6Var ? nm6Var : b;
            }
        }
        cVar = new c(this, continuation);
        Object obj3 = cVar.k;
        nm6 nm6Var2 = nm6.a;
        i = cVar.m;
        if (i != 0) {
        }
        Object obj22 = eVar.b;
        cVar.j = null;
        cVar.m = 2;
        Object b2 = eVar.b(obj22, cVar);
        if (b2 != nm6Var2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(com.yandex.plus.core.network.interceptor.e eVar, Continuation continuation) {
        d dVar;
        int i;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.m = i2 - Integer.MIN_VALUE;
                Object obj = dVar.k;
                nm6 nm6Var = nm6.a;
                i = dVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eVar = dVar.j;
                    qgg.h0(obj);
                    com.yandex.plus.core.network.call.c cVar = (com.yandex.plus.core.network.call.c) obj;
                    if (cVar != null) {
                        return cVar;
                    }
                }
                Object obj2 = eVar.b;
                dVar.j = null;
                dVar.m = 2;
                Object b = eVar.b(obj2, dVar);
                return b != nm6Var ? nm6Var : b;
            }
        }
        dVar = new d(this, continuation);
        Object obj3 = dVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dVar.m;
        if (i != 0) {
        }
        Object obj22 = eVar.b;
        dVar.j = null;
        dVar.m = 2;
        Object b2 = eVar.b(obj22, dVar);
        if (b2 != nm6Var2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(com.yandex.plus.core.network.interceptor.e eVar, cg6 cg6Var) {
        e eVar2;
        int i;
        if (cg6Var instanceof e) {
            eVar2 = (e) cg6Var;
            int i2 = eVar2.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar2.m = i2 - Integer.MIN_VALUE;
                Object obj = eVar2.k;
                nm6 nm6Var = nm6.a;
                i = eVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eVar = eVar2.j;
                    qgg.h0(obj);
                    com.yandex.plus.core.network.call.c cVar = (com.yandex.plus.core.network.call.c) obj;
                    if (cVar != null) {
                        return cVar;
                    }
                }
                Object obj2 = eVar.b;
                eVar2.j = null;
                eVar2.m = 2;
                Object b = eVar.b(obj2, eVar2);
                return b != nm6Var ? nm6Var : b;
            }
        }
        eVar2 = new e(this, cg6Var);
        Object obj3 = eVar2.k;
        nm6 nm6Var2 = nm6.a;
        i = eVar2.m;
        if (i != 0) {
        }
        Object obj22 = eVar.b;
        eVar2.j = null;
        eVar2.m = 2;
        Object b2 = eVar.b(obj22, eVar2);
        if (b2 != nm6Var2) {
        }
    }
}
