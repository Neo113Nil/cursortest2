package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.data.network.o9;
import com.yandex.passport.data.network.r9;
import com.yandex.passport.internal.report.ea;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.z9;
import com.yandex.passport.internal.report.ze;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import java.io.IOException;
import java.io.Serializable;
import java.util.EnumSet;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class q1 extends com.yandex.passport.common.domain.a {
    public final r9 b;
    public final com.yandex.passport.internal.network.mappers.b c;
    public final com.yandex.passport.internal.report.reporters.u0 d;
    public final com.yandex.passport.internal.usecase.s0 e;
    public final com.yandex.passport.data.network.token.i f;
    public final com.yandex.passport.internal.usecase.r g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.yandex.passport.common.coroutine.a aVar, r9 r9Var, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.report.reporters.u0 u0Var, com.yandex.passport.internal.usecase.s0 s0Var, com.yandex.passport.data.network.token.i iVar, com.yandex.passport.internal.usecase.r rVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        r9Var.getClass();
        bVar.getClass();
        u0Var.getClass();
        s0Var.getClass();
        rVar.getClass();
        this.b = r9Var;
        this.c = bVar;
        this.d = u0Var;
        this.e = s0Var;
        this.f = iVar;
        this.g = rVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(2:3|(13:5|6|7|(1:(1:(1:(15:12|13|14|15|16|(1:18)|19|20|(9:31|32|(1:34)|35|(3:46|47|48)|39|(1:41)|42|43)|22|(1:24)|25|(1:27)|28|29)(2:78|79))(8:80|81|82|83|84|85|(12:88|16|(0)|19|20|(0)|22|(0)|25|(0)|28|29)|87))(2:91|92))(5:97|98|99|(1:101)|87)|93|94|(2:96|87)|82|83|84|85|(0)|87))|118|6|7|(0)(0)|93|94|(0)|82|83|84|85|(0)|87|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0065, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0063, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0133, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0131, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(o1 o1Var, cg6 cg6Var) {
        p1 p1Var;
        Object obj;
        nm6 nm6Var;
        int i;
        char c;
        o1 o1Var2;
        t7o t7oVar;
        Object obj2;
        Throwable a;
        String message;
        Throwable a2;
        int i2;
        int i3;
        Object g;
        com.yandex.passport.internal.l lVar;
        com.yandex.passport.internal.ui.domik.s sVar;
        Object obj3;
        try {
            try {
                if (cg6Var instanceof p1) {
                    p1Var = (p1) cg6Var;
                    int i4 = p1Var.q;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        p1Var.q = i4 - Integer.MIN_VALUE;
                        obj = p1Var.o;
                        nm6Var = nm6.a;
                        i = p1Var.q;
                        com.yandex.passport.internal.report.reporters.u0 u0Var = this.d;
                        if (i != 0) {
                            qgg.h0(obj);
                            try {
                                r7o r7oVar = z7o.b;
                                u0Var.u(o1Var.a);
                                r9 r9Var = this.b;
                                com.yandex.passport.internal.network.mappers.b bVar = this.c;
                                com.yandex.passport.common.core.b bVar2 = o1Var.a.a;
                                bVar.getClass();
                                o9 o9Var = new o9(com.yandex.passport.internal.network.mappers.b.a(bVar2), o1Var.b.d(), o1Var.c, o1Var.d, o1Var.e);
                                p1Var.j = o1Var;
                                p1Var.m = 0;
                                p1Var.n = 0;
                                p1Var.q = 1;
                                obj = r9Var.g(o9Var, p1Var);
                                if (obj != nm6Var) {
                                    o1Var2 = o1Var;
                                    i2 = 0;
                                    i3 = 0;
                                }
                                return nm6Var;
                            } catch (wis e) {
                                e = e;
                                c = 0;
                                o1Var2 = o1Var;
                                r7o r7oVar2 = z7o.b;
                                t7oVar = new t7o(e);
                                obj2 = t7oVar;
                                a = z7o.a(obj2);
                                if (a != null) {
                                }
                                if (!(obj2 instanceof t7o)) {
                                }
                                a2 = z7o.a(obj2);
                                if (a2 != null) {
                                }
                                return new z7o(obj2);
                            } catch (Throwable th) {
                                th = th;
                                c = 0;
                                o1Var2 = o1Var;
                                r7o r7oVar3 = z7o.b;
                                t7oVar = new t7o(th);
                                obj2 = t7oVar;
                                a = z7o.a(obj2);
                                if (a != null) {
                                }
                                if (!(obj2 instanceof t7o)) {
                                }
                                a2 = z7o.a(obj2);
                                if (a2 != null) {
                                }
                                return new z7o(obj2);
                            }
                        }
                        if (i != 1) {
                            if (i == 2) {
                                i2 = p1Var.n;
                                i3 = p1Var.m;
                                o1Var2 = p1Var.j;
                                qgg.h0(obj);
                                Object obj4 = ((z7o) obj).a;
                                qgg.h0(obj4);
                                com.yandex.passport.internal.l lVar2 = (com.yandex.passport.internal.l) obj4;
                                com.yandex.passport.internal.ui.domik.s sVar2 = com.yandex.passport.internal.ui.domik.s.a;
                                com.yandex.passport.internal.usecase.s0 s0Var = this.e;
                                c = 0;
                                com.yandex.passport.internal.usecase.o0 o0Var = new com.yandex.passport.internal.usecase.o0(lVar2, (com.yandex.passport.internal.credentials.f) null, 6);
                                p1Var.j = o1Var2;
                                p1Var.k = lVar2;
                                p1Var.l = sVar2;
                                p1Var.m = i3;
                                p1Var.n = i2;
                                p1Var.q = 3;
                                g = s0Var.g(o0Var, p1Var);
                                if (g != nm6Var) {
                                    lVar = lVar2;
                                    obj = g;
                                    sVar = sVar2;
                                    obj3 = ((z7o) obj).a;
                                    if (obj3 instanceof t7o) {
                                    }
                                    com.yandex.passport.api.w0 w0Var = com.yandex.passport.api.w0.a;
                                    EnumSet of = EnumSet.of(com.yandex.passport.internal.ui.domik.w.e);
                                    of.getClass();
                                    sVar.getClass();
                                    obj2 = com.yandex.passport.internal.ui.domik.s.b(lVar, (com.yandex.passport.internal.entities.e) obj3, of);
                                    a = z7o.a(obj2);
                                    if (a != null) {
                                    }
                                    if (!(obj2 instanceof t7o)) {
                                    }
                                    a2 = z7o.a(obj2);
                                    if (a2 != null) {
                                    }
                                    return new z7o(obj2);
                                }
                                return nm6Var;
                            }
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            sVar = p1Var.l;
                            lVar = p1Var.k;
                            o1 o1Var3 = p1Var.j;
                            try {
                                qgg.h0(obj);
                                o1Var2 = o1Var3;
                                c = 0;
                                obj3 = ((z7o) obj).a;
                                if (obj3 instanceof t7o) {
                                    obj3 = null;
                                }
                                com.yandex.passport.api.w0 w0Var2 = com.yandex.passport.api.w0.a;
                                EnumSet of2 = EnumSet.of(com.yandex.passport.internal.ui.domik.w.e);
                                of2.getClass();
                                sVar.getClass();
                                obj2 = com.yandex.passport.internal.ui.domik.s.b(lVar, (com.yandex.passport.internal.entities.e) obj3, of2);
                            } catch (wis e2) {
                                e = e2;
                                o1Var2 = o1Var3;
                                c = 0;
                                r7o r7oVar22 = z7o.b;
                                t7oVar = new t7o(e);
                                obj2 = t7oVar;
                                a = z7o.a(obj2);
                                if (a != null) {
                                }
                                if (!(obj2 instanceof t7o)) {
                                }
                                a2 = z7o.a(obj2);
                                if (a2 != null) {
                                }
                                return new z7o(obj2);
                            } catch (Throwable th2) {
                                th = th2;
                                o1Var2 = o1Var3;
                                c = 0;
                                r7o r7oVar32 = z7o.b;
                                t7oVar = new t7o(th);
                                obj2 = t7oVar;
                                a = z7o.a(obj2);
                                if (a != null) {
                                }
                                if (!(obj2 instanceof t7o)) {
                                }
                                a2 = z7o.a(obj2);
                                if (a2 != null) {
                                }
                                return new z7o(obj2);
                            }
                            a = z7o.a(obj2);
                            if (a != null) {
                                try {
                                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "failed upgradePhonish recover " + a, 8);
                                    }
                                    if (((a instanceof com.yandex.passport.data.exceptions.a) || (a instanceof com.yandex.passport.data.exceptions.j)) && (message = a.getMessage()) != null) {
                                        switch (message.hashCode()) {
                                            case -2032788365:
                                                if (!message.equals("phone.not_confirmed")) {
                                                    break;
                                                }
                                                throw new com.yandex.passport.data.exceptions.j("phone.not_confirmed");
                                            case -1077806184:
                                                if (!message.equals("track_id.invalid")) {
                                                    break;
                                                }
                                                throw new com.yandex.passport.data.exceptions.j("phone.not_confirmed");
                                            case -842521834:
                                                if (!message.equals("backend.blackbox_failed")) {
                                                    break;
                                                }
                                                throw new com.yandex.passport.data.exceptions.j("phone.not_confirmed");
                                            case 1387350691:
                                                if (!message.equals("account.invalid_type")) {
                                                    break;
                                                } else {
                                                    throw new com.yandex.passport.api.exception.i("invalid_account_type");
                                                }
                                        }
                                    }
                                    com.yandex.passport.data.network.token.i iVar = this.f;
                                    String message2 = a.getMessage();
                                    if (message2 == null) {
                                        message2 = "";
                                    }
                                    throw com.yandex.passport.data.network.token.i.j(iVar, a, null, new com.yandex.passport.api.exception.k(message2), null, null, null, 58);
                                } catch (Throwable th3) {
                                    r7o r7oVar4 = z7o.b;
                                    obj2 = new t7o(th3);
                                }
                            }
                            if (!(obj2 instanceof t7o)) {
                                com.yandex.passport.common.core.f fVar = o1Var2.a;
                                u0Var.getClass();
                                fVar.getClass();
                                ea eaVar = ea.d;
                                ff ffVar = new ff(fVar);
                                ze[] zeVarArr = new ze[1];
                                zeVarArr[c] = ffVar;
                                u0Var.n(eaVar, zeVarArr);
                            }
                            a2 = z7o.a(obj2);
                            if (a2 != null) {
                                com.yandex.passport.common.core.f fVar2 = o1Var2.a;
                                u0Var.getClass();
                                fVar2.getClass();
                                z9 z9Var = z9.d;
                                ff ffVar2 = new ff(fVar2);
                                ff ffVar3 = new ff(a2);
                                ze[] zeVarArr2 = new ze[2];
                                zeVarArr2[c] = ffVar2;
                                zeVarArr2[1] = ffVar3;
                                u0Var.n(z9Var, zeVarArr2);
                            }
                            return new z7o(obj2);
                        }
                        i2 = p1Var.n;
                        i3 = p1Var.m;
                        o1Var2 = p1Var.j;
                        qgg.h0(obj);
                        qgg.h0(((z7o) obj).a);
                        com.yandex.passport.internal.usecase.r rVar = this.g;
                        com.yandex.passport.internal.usecase.s sVar3 = new com.yandex.passport.internal.usecase.s(o1Var2.a.a, 0L, o1Var2.b, null, com.yandex.passport.internal.analytics.a.v);
                        p1Var.j = o1Var2;
                        p1Var.m = i3;
                        p1Var.n = i2;
                        p1Var.q = 2;
                        obj = rVar.g(sVar3, p1Var);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        Object obj42 = ((z7o) obj).a;
                        qgg.h0(obj42);
                        com.yandex.passport.internal.l lVar22 = (com.yandex.passport.internal.l) obj42;
                        com.yandex.passport.internal.ui.domik.s sVar22 = com.yandex.passport.internal.ui.domik.s.a;
                        com.yandex.passport.internal.usecase.s0 s0Var2 = this.e;
                        c = 0;
                        com.yandex.passport.internal.usecase.o0 o0Var2 = new com.yandex.passport.internal.usecase.o0(lVar22, (com.yandex.passport.internal.credentials.f) null, 6);
                        p1Var.j = o1Var2;
                        p1Var.k = lVar22;
                        p1Var.l = sVar22;
                        p1Var.m = i3;
                        p1Var.n = i2;
                        p1Var.q = 3;
                        g = s0Var2.g(o0Var2, p1Var);
                        if (g != nm6Var) {
                        }
                        return nm6Var;
                    }
                }
                if (i != 0) {
                }
                qgg.h0(((z7o) obj).a);
                com.yandex.passport.internal.usecase.r rVar2 = this.g;
                com.yandex.passport.internal.usecase.s sVar32 = new com.yandex.passport.internal.usecase.s(o1Var2.a.a, 0L, o1Var2.b, null, com.yandex.passport.internal.analytics.a.v);
                p1Var.j = o1Var2;
                p1Var.m = i3;
                p1Var.n = i2;
                p1Var.q = 2;
                obj = rVar2.g(sVar32, p1Var);
                if (obj == nm6Var) {
                }
                Object obj422 = ((z7o) obj).a;
                qgg.h0(obj422);
                com.yandex.passport.internal.l lVar222 = (com.yandex.passport.internal.l) obj422;
                com.yandex.passport.internal.ui.domik.s sVar222 = com.yandex.passport.internal.ui.domik.s.a;
                com.yandex.passport.internal.usecase.s0 s0Var22 = this.e;
                c = 0;
                com.yandex.passport.internal.usecase.o0 o0Var22 = new com.yandex.passport.internal.usecase.o0(lVar222, (com.yandex.passport.internal.credentials.f) null, 6);
                p1Var.j = o1Var2;
                p1Var.k = lVar222;
                p1Var.l = sVar222;
                p1Var.m = i3;
                p1Var.n = i2;
                p1Var.q = 3;
                g = s0Var22.g(o0Var22, p1Var);
                if (g != nm6Var) {
                }
                return nm6Var;
            } catch (IOException unused) {
                throw new com.yandex.passport.api.exception.h("Need update info");
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        p1Var = new p1(this, cg6Var);
        obj = p1Var.o;
        nm6Var = nm6.a;
        i = p1Var.q;
        com.yandex.passport.internal.report.reporters.u0 u0Var2 = this.d;
    }
}
