package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.internal.usecase.a3;
import com.yandex.passport.internal.usecase.j2;
import com.yandex.passport.internal.usecase.l2;
import com.yandex.passport.internal.usecase.z2;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.w4i;
import defpackage.x0q;
import defpackage.xq0;
import defpackage.yd5;
import defpackage.z7o;
import java.io.Closeable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class i1 extends a3 {
    public final com.yandex.passport.internal.account.d d;
    public final com.yandex.passport.internal.ui.e e;
    public final l2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.yandex.passport.internal.account.d dVar, com.yandex.passport.internal.ui.e eVar, l2 l2Var, com.yandex.passport.common.coroutine.a aVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        dVar.getClass();
        eVar.getClass();
        l2Var.getClass();
        aVar.getClass();
        this.d = dVar;
        this.e = eVar;
        this.f = l2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(com.yandex.passport.internal.ui.domik.d dVar, String str, w4i w4iVar, cg6 cg6Var) {
        f1 f1Var;
        int i;
        com.yandex.passport.internal.ui.f fVar;
        if (cg6Var instanceof f1) {
            f1Var = (f1) cg6Var;
            int i2 = f1Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f1Var.o = i2 - Integer.MIN_VALUE;
                Object obj = f1Var.m;
                nm6 nm6Var = nm6.a;
                i = f1Var.o;
                if (i != 0) {
                    qgg.h0(obj);
                    fVar = new com.yandex.passport.internal.ui.f(str);
                    x0q x0qVar = (x0q) this.b;
                    f1Var.j = dVar;
                    f1Var.k = w4iVar;
                    f1Var.l = fVar;
                    f1Var.o = 1;
                    if (x0qVar.emit(fVar, f1Var) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    com.yandex.passport.internal.ui.f fVar2 = f1Var.l;
                    w4iVar = f1Var.k;
                    com.yandex.passport.internal.ui.domik.d dVar2 = f1Var.j;
                    qgg.h0(obj);
                    fVar = fVar2;
                    dVar = dVar2;
                }
                w4iVar.invoke(dVar, fVar);
                return Unit.a;
            }
        }
        f1Var = new f1(this, cg6Var);
        Object obj2 = f1Var.m;
        nm6 nm6Var2 = nm6.a;
        i = f1Var.o;
        if (i != 0) {
        }
        w4iVar.invoke(dVar, fVar);
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b5  */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r4v5, types: [c5b] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(com.yandex.passport.internal.ui.domik.d dVar, com.yandex.passport.internal.network.response.d dVar2, com.yandex.passport.internal.ui.domik.relogin.b bVar, com.yandex.passport.internal.ui.challenge.vpn.c cVar, com.yandex.passport.internal.ui.challenge.vpn.c cVar2, w4i w4iVar, h1 h1Var) {
        ?? r24;
        Iterable iterable;
        Object w;
        com.yandex.passport.internal.ui.domik.d dVar3;
        com.yandex.passport.internal.ui.challenge.vpn.c cVar3;
        ArrayList arrayList = dVar2.e;
        String str = dVar2.g;
        List list = dVar2.f;
        String str2 = dVar2.c;
        str2.getClass();
        com.yandex.passport.internal.ui.domik.d i = com.yandex.passport.internal.ui.domik.d.i(com.yandex.passport.internal.ui.domik.d.i(dVar.j(str2), null, null, null, null, null, null, arrayList, null, null, null, null, 524031), null, null, null, null, null, dVar2.h, null, null, null, null, null, 524159);
        String str3 = dVar2.d;
        if (str3 != null) {
            i = com.yandex.passport.internal.ui.domik.d.i(i, null, null, null, str3, null, null, null, null, null, null, null, 524255);
        }
        com.yandex.passport.internal.ui.domik.d dVar4 = i;
        String str4 = dVar2.i;
        if (str4 != null) {
            dVar4 = com.yandex.passport.internal.ui.domik.d.i(dVar4, null, null, null, null, null, null, null, str4, null, null, null, 523775);
        }
        com.yandex.passport.internal.ui.domik.d dVar5 = dVar4;
        String str5 = dVar2.j;
        if (str5 != null) {
            dVar5 = com.yandex.passport.internal.ui.domik.d.i(dVar5, null, null, null, null, null, null, null, null, null, str5, null, 516095);
        }
        com.yandex.passport.internal.ui.domik.d dVar6 = dVar5;
        if (str != null) {
            r24 = 0;
            dVar6 = com.yandex.passport.internal.ui.domik.d.i(com.yandex.passport.internal.ui.domik.d.i(dVar6, null, null, null, null, null, null, null, null, str, null, null, 522239), null, null, null, null, null, null, null, null, null, null, null, 524275);
        } else {
            r24 = 0;
        }
        com.yandex.passport.internal.ui.domik.d dVar7 = dVar6;
        if (dVar2.b) {
            if (str != null) {
                cVar3 = cVar;
                dVar3 = com.yandex.passport.internal.ui.domik.d.i(dVar7, null, r24, null, null, null, null, null, null, null, null, null, 524275);
            } else {
                dVar3 = dVar7;
                cVar3 = cVar;
            }
            cVar3.invoke(dVar3);
            return Unit.a;
        }
        if (list != null && !list.isEmpty()) {
            Object obj = list.get(0);
            obj.getClass();
            Object w2 = w(dVar7, (String) obj, w4iVar, h1Var);
            return w2 == nm6.a ? w2 : Unit.a;
        }
        List list2 = dVar7.i;
        if (list2 != null) {
            iterable = new ArrayList();
            for (Object obj2 : list2) {
                int i2 = com.yandex.passport.internal.ui.domik.a.a[((com.yandex.passport.internal.network.response.b) obj2).ordinal()];
                iterable.add(obj2);
            }
        } else {
            iterable = c5b.a;
        }
        iterable.size();
        if (iterable.contains(com.yandex.passport.internal.network.response.b.SMS_CODE)) {
            bVar.invoke(dVar7);
        } else {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((com.yandex.passport.internal.network.response.b) next).c) {
                    r24 = next;
                    break;
                }
            }
            if (((com.yandex.passport.internal.network.response.b) r24) != null) {
                cVar2.invoke(dVar7);
            } else {
                if (iterable.isEmpty()) {
                    w = w(dVar7, "no auth methods", w4iVar, h1Var);
                    if (w != nm6.a) {
                        w = Unit.a;
                    }
                    return w != nm6.a ? w : Unit.a;
                }
                w4iVar.invoke(dVar7, new com.yandex.passport.internal.ui.f("unknown error"));
            }
        }
        w = Unit.a;
        if (w != nm6.a) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[Catch: all -> 0x00a8, TryCatch #3 {all -> 0x00a8, blocks: (B:31:0x0078, B:33:0x007e, B:39:0x009e, B:48:0x0062), top: B:47:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable] */
    @Override // com.yandex.passport.internal.usecase.a3, androidx.core.app.n0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(e1 e1Var, cg6 cg6Var) {
        g1 g1Var;
        int i;
        com.yandex.passport.internal.ui.e eVar;
        z2 z2Var;
        int i2;
        Object z;
        i1 i1Var;
        int i3;
        Closeable closeable;
        Throwable a;
        z2 z2Var2;
        if (cg6Var instanceof g1) {
            g1Var = (g1) cg6Var;
            int i4 = g1Var.r;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                g1Var.r = i4 - Integer.MIN_VALUE;
                Object obj = g1Var.p;
                nm6 nm6Var = nm6.a;
                i = g1Var.r;
                if (i == 0) {
                    if (i == 1) {
                        int i5 = g1Var.o;
                        int i6 = g1Var.n;
                        Closeable closeable2 = g1Var.l;
                        eVar = g1Var.k;
                        i1Var = g1Var.j;
                        try {
                            qgg.h0(obj);
                            i2 = i5;
                            z = ((z7o) obj).a;
                            z2Var = closeable2;
                            i3 = i6;
                        } catch (Throwable th) {
                            th = th;
                            closeable = closeable2;
                        }
                    } else {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = g1Var.m;
                        closeable = g1Var.l;
                        try {
                            qgg.h0(obj);
                            z2Var2 = closeable;
                            z2Var = z2Var2;
                            yd5.q(z2Var, null);
                            return new z7o(z);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        yd5.q(closeable, th);
                        throw th3;
                    }
                }
                qgg.h0(obj);
                eVar = this.e;
                z2Var = new z2(this);
                try {
                    g1Var.j = this;
                    g1Var.k = eVar;
                    g1Var.l = z2Var;
                    i2 = 0;
                    g1Var.n = 0;
                    g1Var.o = 0;
                    g1Var.r = 1;
                    z = z(e1Var, g1Var);
                    if (z == nm6Var) {
                        return nm6Var;
                    }
                    i1Var = this;
                    i3 = 0;
                } catch (Throwable th4) {
                    th = th4;
                    closeable = z2Var;
                }
                a = z7o.a(z);
                if (a != null) {
                    g1Var.j = null;
                    g1Var.k = null;
                    g1Var.l = z2Var;
                    g1Var.m = z;
                    g1Var.n = i3;
                    g1Var.o = i2;
                    g1Var.r = 2;
                    Object emit = ((x0q) i1Var.b).emit(eVar.a(a), g1Var);
                    if (emit != nm6Var) {
                        emit = Unit.a;
                    }
                    if (emit != nm6Var) {
                        z2Var2 = z2Var;
                        z2Var = z2Var2;
                    }
                    return nm6Var;
                }
                yd5.q(z2Var, null);
                return new z7o(z);
            }
        }
        g1Var = new g1(this, cg6Var);
        Object obj2 = g1Var.p;
        nm6 nm6Var2 = nm6.a;
        i = g1Var.r;
        if (i == 0) {
        }
        a = z7o.a(z);
        if (a != null) {
        }
        yd5.q(z2Var, null);
        return new z7o(z);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|8|(1:(1:(4:12|13|14|15)(2:17|18))(4:19|20|21|22))(4:37|38|(1:40)|28)|23|24|(1:26)(2:29|30)))|43|6|7|8|(0)(0)|23|24|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e5, code lost:
    
        if (x(r0, r3, r5, r5, r11, r7, r8) == r9) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0036, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0037, code lost:
    
        r10 = r26;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c A[Catch: Exception -> 0x00e8, TryCatch #1 {Exception -> 0x00e8, blocks: (B:24:0x0079, B:26:0x008c, B:29:0x00ea, B:30:0x00f1), top: B:23:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ea A[Catch: Exception -> 0x00e8, TryCatch #1 {Exception -> 0x00e8, blocks: (B:24:0x0079, B:26:0x008c, B:29:0x00ea, B:30:0x00f1), top: B:23:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(e1 e1Var, cg6 cg6Var) {
        h1 h1Var;
        int i;
        e1 e1Var2;
        com.yandex.passport.common.core.b f;
        int i2;
        String str;
        if (cg6Var instanceof h1) {
            h1Var = (h1) cg6Var;
            int i3 = h1Var.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h1Var.o = i3 - Integer.MIN_VALUE;
                h1 h1Var2 = h1Var;
                Object obj = h1Var2.m;
                nm6 nm6Var = nm6.a;
                i = h1Var2.o;
                if (i != 0) {
                    qgg.h0(obj);
                    f = e1Var.a.f();
                    l2 l2Var = this.f;
                    j2 j2Var = new j2(f, e1Var.a.b);
                    h1Var2.j = e1Var;
                    h1Var2.k = f;
                    h1Var2.l = 0;
                    h1Var2.o = 1;
                    obj = l2Var.g(j2Var, h1Var2);
                    if (obj != nm6Var) {
                        e1Var2 = e1Var;
                        i2 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e1 e1Var3 = h1Var2.j;
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    return Unit.a;
                }
                i2 = h1Var2.l;
                f = h1Var2.k;
                e1 e1Var4 = h1Var2.j;
                try {
                    qgg.h0(obj);
                    e1Var2 = e1Var4;
                } catch (Exception e) {
                    e = e;
                    e1Var2 = e1Var4;
                    e1Var2.e.invoke(e1Var2.a, this.e.a(e));
                    r7o r7oVar2 = z7o.b;
                    return Unit.a;
                }
                Object obj2 = ((z7o) obj).a;
                qgg.h0(obj2);
                String str2 = (String) obj2;
                com.yandex.passport.internal.account.d dVar = this.d;
                com.yandex.passport.internal.ui.domik.d dVar2 = e1Var2.a;
                str = dVar2.c;
                if (str != null) {
                    throw new IllegalStateException("required login is missing");
                }
                com.yandex.passport.internal.properties.l lVar = dVar2.a;
                String str3 = lVar.a;
                String str4 = lVar.c;
                dVar.getClass();
                f.getClass();
                str2.getClass();
                com.yandex.passport.internal.network.response.d i4 = dVar.a.a(f).i(str, false, false, dVar.c.b(f), str2, str3, str4);
                com.yandex.passport.internal.ui.domik.d i5 = com.yandex.passport.internal.ui.domik.d.i(dVar2, null, null, null, null, null, null, null, null, null, null, str2, 507903);
                com.yandex.passport.internal.ui.domik.relogin.b bVar = e1Var2.b;
                com.yandex.passport.internal.ui.challenge.vpn.c cVar = e1Var2.c;
                com.yandex.passport.internal.ui.challenge.vpn.c cVar2 = e1Var2.d;
                w4i w4iVar = e1Var2.e;
                h1Var2.j = e1Var2;
                h1Var2.k = null;
                h1Var2.l = i2;
                h1Var2.o = 2;
            }
        }
        h1Var = new h1(this, cg6Var);
        h1 h1Var22 = h1Var;
        Object obj3 = h1Var22.m;
        nm6 nm6Var2 = nm6.a;
        i = h1Var22.o;
        if (i != 0) {
        }
        Object obj22 = ((z7o) obj3).a;
        qgg.h0(obj22);
        String str22 = (String) obj22;
        com.yandex.passport.internal.account.d dVar3 = this.d;
        com.yandex.passport.internal.ui.domik.d dVar22 = e1Var2.a;
        str = dVar22.c;
        if (str != null) {
        }
    }
}
