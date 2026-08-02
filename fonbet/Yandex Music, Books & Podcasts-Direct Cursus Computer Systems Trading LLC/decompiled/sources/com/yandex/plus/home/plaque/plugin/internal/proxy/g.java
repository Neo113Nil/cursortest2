package com.yandex.plus.home.plaque.plugin.internal.proxy;

import defpackage.cg6;
import defpackage.eno;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.qqi;
import defpackage.rqi;
import defpackage.xq0;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class g implements com.yandex.plus.home.plaque.repository.api.a {
    public final jyr a;
    public final jyr b;
    public final com.yandex.plus.home.plaque.plugin.internal.di.a c;
    public com.yandex.plus.home.plaque.repository.api.a e;
    public final eno d = new eno(new com.yandex.plus.home.feature.webviews.internal.treasury.d(this, null, 8));
    public final qqi f = rqi.a();

    public g(jyr jyrVar, jyr jyrVar2, com.yandex.plus.home.plaque.plugin.internal.di.a aVar) {
        this.a = jyrVar;
        this.b = jyrVar2;
        this.c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (((com.yandex.plus.home.plaque.repository.api.a) r8).a(r6, r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.plus.home.plaque.repository.api.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, cg6 cg6Var) {
        c cVar;
        int i;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.n = i2 - Integer.MIN_VALUE;
                Object obj = cVar.l;
                Object obj2 = nm6.a;
                i = cVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    cVar.j = str;
                    cVar.k = str2;
                    cVar.n = 1;
                    obj = f(cVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = cVar.k;
                    str = cVar.j;
                    qgg.h0(obj);
                }
                cVar.j = null;
                cVar.k = null;
                cVar.n = 2;
            }
        }
        cVar = new c(this, cg6Var);
        Object obj3 = cVar.l;
        Object obj22 = nm6.a;
        i = cVar.n;
        if (i != 0) {
        }
        cVar.j = null;
        cVar.k = null;
        cVar.n = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (((com.yandex.plus.home.plaque.repository.api.a) r8).b(r6, r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.plus.home.plaque.repository.api.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, cg6 cg6Var) {
        b bVar;
        int i;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.n = i2 - Integer.MIN_VALUE;
                Object obj = bVar.l;
                Object obj2 = nm6.a;
                i = bVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    bVar.j = str;
                    bVar.k = str2;
                    bVar.n = 1;
                    obj = f(bVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = bVar.k;
                    str = bVar.j;
                    qgg.h0(obj);
                }
                bVar.j = null;
                bVar.k = null;
                bVar.n = 2;
            }
        }
        bVar = new b(this, cg6Var);
        Object obj3 = bVar.l;
        Object obj22 = nm6.a;
        i = bVar.n;
        if (i != 0) {
        }
        bVar.j = null;
        bVar.k = null;
        bVar.n = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.plus.home.plaque.repository.api.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, int i2, cg6 cg6Var) {
        e eVar;
        int i3;
        if (cg6Var instanceof e) {
            eVar = (e) cg6Var;
            int i4 = eVar.n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                eVar.n = i4 - Integer.MIN_VALUE;
                Object obj = eVar.l;
                Object obj2 = nm6.a;
                i3 = eVar.n;
                if (i3 != 0) {
                    qgg.h0(obj);
                    eVar.j = i;
                    eVar.k = i2;
                    eVar.n = 1;
                    obj = f(eVar);
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = eVar.k;
                    i = eVar.j;
                    qgg.h0(obj);
                }
                eVar.j = i;
                eVar.k = i2;
                eVar.n = 2;
                Object c = ((com.yandex.plus.home.plaque.repository.api.a) obj).c(i, i2, eVar);
                return c != obj2 ? obj2 : c;
            }
        }
        eVar = new e(this, cg6Var);
        Object obj3 = eVar.l;
        Object obj22 = nm6.a;
        i3 = eVar.n;
        if (i3 != 0) {
        }
        eVar.j = i;
        eVar.k = i2;
        eVar.n = 2;
        Object c2 = ((com.yandex.plus.home.plaque.repository.api.a) obj3).c(i, i2, eVar);
        if (c2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (((com.yandex.plus.home.plaque.repository.api.a) r7).d(r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.plus.home.plaque.repository.api.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Map map, cg6 cg6Var) {
        f fVar;
        int i;
        if (cg6Var instanceof f) {
            fVar = (f) cg6Var;
            int i2 = fVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.m = i2 - Integer.MIN_VALUE;
                Object obj = fVar.k;
                Object obj2 = nm6.a;
                i = fVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    fVar.j = map;
                    fVar.m = 1;
                    obj = f(fVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Map map2 = fVar.j;
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    map = fVar.j;
                    qgg.h0(obj);
                }
                fVar.j = null;
                fVar.m = 2;
            }
        }
        fVar = new f(this, cg6Var);
        Object obj3 = fVar.k;
        Object obj22 = nm6.a;
        i = fVar.m;
        if (i != 0) {
        }
        fVar.j = null;
        fVar.m = 2;
    }

    @Override // com.yandex.plus.home.plaque.repository.api.a
    public final pjc e() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0050, code lost:
    
        if (r8.a(r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:12:0x0029, B:13:0x0069, B:15:0x0071, B:17:0x0084, B:23:0x007b), top: B:11:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:12:0x0029, B:13:0x0069, B:15:0x0071, B:17:0x0084, B:23:0x007b), top: B:11:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:31:0x0053, B:33:0x0057), top: B:30:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v10, types: [oqi] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [oqi] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v6, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var) {
        d dVar;
        int i;
        qqi qqiVar;
        int i2;
        ?? r0;
        Throwable th;
        com.yandex.plus.home.plaque.repository.api.a aVar;
        try {
            if (cg6Var instanceof d) {
                dVar = (d) cg6Var;
                int i3 = dVar.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dVar.n = i3 - Integer.MIN_VALUE;
                    Object obj = dVar.l;
                    nm6 nm6Var = nm6.a;
                    i = dVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.f;
                        dVar.j = qqiVar;
                        i2 = 0;
                        dVar.k = 0;
                        dVar.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r0 = dVar.j;
                            try {
                                qgg.h0(obj);
                                r0 = r0;
                                aVar = !((Boolean) obj).booleanValue() ? (com.yandex.plus.home.plaque.repository.api.a) this.a.getValue() : (com.yandex.plus.home.plaque.repository.api.a) this.b.getValue();
                                this.e = aVar;
                                qqiVar = r0;
                                qqiVar.b(null);
                                return aVar;
                            } catch (Throwable th2) {
                                th = th2;
                                r0.b(null);
                                throw th;
                            }
                        }
                        i2 = dVar.k;
                        ?? r4 = dVar.j;
                        qgg.h0(obj);
                        qqiVar = r4;
                    }
                    aVar = this.e;
                    if (aVar == null) {
                        com.yandex.plus.home.plaque.plugin.internal.di.a aVar2 = this.c;
                        dVar.j = qqiVar;
                        dVar.k = i2;
                        dVar.n = 2;
                        Object invoke = aVar2.invoke(dVar);
                        if (invoke != nm6Var) {
                            r0 = qqiVar;
                            obj = invoke;
                            aVar = !((Boolean) obj).booleanValue() ? (com.yandex.plus.home.plaque.repository.api.a) this.a.getValue() : (com.yandex.plus.home.plaque.repository.api.a) this.b.getValue();
                            this.e = aVar;
                            qqiVar = r0;
                        }
                        return nm6Var;
                    }
                    qqiVar.b(null);
                    return aVar;
                }
            }
            aVar = this.e;
            if (aVar == null) {
            }
            qqiVar.b(null);
            return aVar;
        } catch (Throwable th3) {
            r0 = qqiVar;
            th = th3;
            r0.b(null);
            throw th;
        }
        dVar = new d(this, cg6Var);
        Object obj2 = dVar.l;
        nm6 nm6Var2 = nm6.a;
        i = dVar.n;
        if (i != 0) {
        }
    }
}
