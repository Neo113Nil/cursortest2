package com.yandex.passport.internal.usecase;

import com.yandex.passport.data.network.d4;
import com.yandex.passport.data.network.h4;
import com.yandex.passport.data.network.i4;
import com.yandex.passport.internal.report.t4;
import com.yandex.passport.internal.report.u4;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class s0 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.properties.x b;
    public final com.yandex.passport.internal.database.h c;
    public final com.yandex.passport.internal.core.accounts.i d;
    public final i4 e;
    public final com.yandex.passport.internal.database.d f;
    public final com.yandex.passport.internal.push.u0 g;
    public final com.yandex.passport.internal.report.reporters.f1 h;
    public final com.yandex.passport.internal.push.s0 i;
    public final com.yandex.passport.internal.network.mappers.b j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.properties.x xVar, com.yandex.passport.internal.database.h hVar, com.yandex.passport.internal.core.accounts.i iVar, i4 i4Var, com.yandex.passport.internal.database.d dVar, com.yandex.passport.internal.push.u0 u0Var, com.yandex.passport.internal.report.reporters.f1 f1Var, com.yandex.passport.internal.push.s0 s0Var, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        xVar.getClass();
        hVar.getClass();
        iVar.getClass();
        i4Var.getClass();
        dVar.getClass();
        u0Var.getClass();
        f1Var.getClass();
        s0Var.getClass();
        bVar.getClass();
        this.b = xVar;
        this.c = hVar;
        this.d = iVar;
        this.e = i4Var;
        this.f = dVar;
        this.g = u0Var;
        this.h = f1Var;
        this.i = s0Var;
        this.j = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r6 == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (r6 == r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable w(s0 s0Var, o0 o0Var, cg6 cg6Var) {
        r0 r0Var;
        int i;
        Object u;
        Object v;
        com.yandex.passport.internal.properties.x xVar = s0Var.b;
        if (cg6Var instanceof r0) {
            r0Var = (r0) cg6Var;
            int i2 = r0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = r0Var.j;
                nm6 nm6Var = nm6.a;
                i = r0Var.l;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        v = ((z7o) obj).a;
                        return new z7o(v);
                    }
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    u = ((z7o) obj).a;
                    return new z7o(u);
                }
                qgg.h0(obj);
                com.yandex.passport.common.core.b bVar = o0Var.a.b.a;
                com.yandex.passport.internal.credentials.f fVar = o0Var.b;
                if (fVar == null && (fVar = xVar.b(bVar)) == null) {
                    throw new com.yandex.passport.api.exception.h(com.yandex.plus.core.network.api.utils.a.P(bVar));
                }
                boolean z = o0Var.c;
                com.yandex.passport.internal.l lVar = o0Var.a;
                if (z) {
                    r0Var.l = 1;
                    v = s0Var.v(lVar, fVar, xVar, r0Var);
                } else {
                    r0Var.l = 2;
                    u = s0Var.u(lVar, fVar, xVar, r0Var);
                }
                return nm6Var;
            }
        }
        r0Var = new r0(s0Var, cg6Var);
        Object obj2 = r0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = r0Var.l;
        if (i == 0) {
        }
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        return w(this, (o0) obj, rhwVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: all -> 0x002b, TRY_ENTER, TryCatch #2 {all -> 0x002b, blocks: (B:10:0x0023, B:11:0x0074, B:25:0x006b), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(com.yandex.passport.internal.l lVar, com.yandex.passport.internal.credentials.f fVar, com.yandex.passport.internal.properties.x xVar, cg6 cg6Var) {
        p0 p0Var;
        int i;
        t7o t7oVar;
        Object obj;
        Object v;
        try {
            if (cg6Var instanceof p0) {
                p0Var = (p0) cg6Var;
                int i2 = p0Var.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    p0Var.l = i2 - Integer.MIN_VALUE;
                    Object obj2 = p0Var.j;
                    Object obj3 = nm6.a;
                    i = p0Var.l;
                    if (i != 0) {
                        qgg.h0(obj2);
                        try {
                            r7o r7oVar = z7o.b;
                            obj = this.c.b(lVar.b, fVar.c);
                        } catch (wis e) {
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            if (z7o.a(obj) == null) {
                            }
                        } catch (CancellationException e2) {
                            throw e2;
                        } catch (Throwable th) {
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            if (z7o.a(obj) == null) {
                            }
                        }
                        if (obj == null) {
                            throw new com.yandex.passport.common.exception.a();
                        }
                        if (z7o.a(obj) == null) {
                            return obj;
                        }
                        p0Var.l = 1;
                        v = v(lVar, fVar, xVar, p0Var);
                        if (v == obj3) {
                            return obj3;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj2);
                        v = ((z7o) obj2).a;
                    }
                    qgg.h0(v);
                    com.yandex.passport.internal.entities.e eVar = (com.yandex.passport.internal.entities.e) v;
                    r7o r7oVar4 = z7o.b;
                    return eVar;
                }
            }
            if (i != 0) {
            }
            qgg.h0(v);
            com.yandex.passport.internal.entities.e eVar2 = (com.yandex.passport.internal.entities.e) v;
            r7o r7oVar42 = z7o.b;
            return eVar2;
        } catch (Throwable th2) {
            r7o r7oVar5 = z7o.b;
            return new t7o(th2);
        }
        p0Var = new p0(this, cg6Var);
        Object obj22 = p0Var.j;
        Object obj32 = nm6.a;
        i = p0Var.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(com.yandex.passport.internal.l lVar, com.yandex.passport.internal.credentials.f fVar, com.yandex.passport.internal.properties.x xVar, cg6 cg6Var) {
        q0 q0Var;
        int i;
        com.yandex.passport.internal.l lVar2;
        com.yandex.passport.internal.credentials.f fVar2;
        Object obj;
        boolean z;
        Throwable a;
        if (cg6Var instanceof q0) {
            q0Var = (q0) cg6Var;
            int i2 = q0Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q0Var.n = i2 - Integer.MIN_VALUE;
                Object obj2 = q0Var.l;
                nm6 nm6Var = nm6.a;
                i = q0Var.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.passport.common.core.b bVar = lVar.b.a;
                    this.j.getClass();
                    d4 d4Var = new d4(com.yandex.passport.internal.network.mappers.b.a(bVar), lVar.h(), lVar.d, fVar.c, fVar.d, xVar.c, xVar.d);
                    q0Var.j = lVar;
                    q0Var.k = fVar;
                    q0Var.n = 1;
                    obj2 = this.e.g(d4Var, q0Var);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                    lVar2 = lVar;
                    fVar2 = fVar;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar2 = q0Var.k;
                    lVar2 = q0Var.j;
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    try {
                        r7o r7oVar = z7o.b;
                        obj = new com.yandex.passport.internal.entities.e(((h4) obj).a, fVar2.c);
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        obj = new t7o(th);
                    }
                }
                z = obj instanceof t7o;
                com.yandex.passport.internal.report.reporters.f1 f1Var = this.h;
                if (!z) {
                    com.yandex.passport.common.core.f fVar3 = lVar2.b;
                    String valueOf = String.valueOf(fVar3.b);
                    f1Var.getClass();
                    valueOf.getClass();
                    f1Var.n(u4.d, new com.yandex.passport.internal.report.c(valueOf, 3));
                    this.f.z(fVar3, (com.yandex.passport.internal.entities.e) obj);
                    com.yandex.passport.internal.push.s0 s0Var = this.i;
                    if (!s0Var.c(fVar3)) {
                        s0Var.a(fVar3, true);
                        this.g.b(fVar3);
                    }
                }
                a = z7o.a(obj);
                if (a != null) {
                    String valueOf2 = String.valueOf(a.getMessage());
                    String valueOf3 = String.valueOf(lVar2.b.b);
                    f1Var.getClass();
                    valueOf3.getClass();
                    f1Var.n(t4.d, new com.yandex.passport.internal.report.a(valueOf2, 28), new com.yandex.passport.internal.report.c(valueOf3, 3));
                    if (a instanceof com.yandex.passport.common.exception.a) {
                        this.d.e(lVar2, com.yandex.passport.internal.report.reporters.t.h);
                    }
                }
                return obj;
            }
        }
        q0Var = new q0(this, cg6Var);
        Object obj22 = q0Var.l;
        nm6 nm6Var2 = nm6.a;
        i = q0Var.n;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        z = obj instanceof t7o;
        com.yandex.passport.internal.report.reporters.f1 f1Var2 = this.h;
        if (!z) {
        }
        a = z7o.a(obj);
        if (a != null) {
        }
        return obj;
    }
}
