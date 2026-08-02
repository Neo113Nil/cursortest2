package com.yandex.plus.home;

import com.yandex.plus.bdui.plus.checkout.content.controller.w;
import com.yandex.plus.core.featureflags.z;
import com.yandex.plus.home.internal.di.u;
import defpackage.cg6;
import defpackage.ea0;
import defpackage.hk4;
import defpackage.jk6;
import defpackage.jyr;
import defpackage.laq;
import defpackage.nm6;
import defpackage.omb;
import defpackage.q6k;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rea;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.v42;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.z7o;
import defpackage.zsd;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class t implements c {
    public final /* synthetic */ a a = new a();
    public final u b;
    public final com.yandex.plus.home.internal.di.e c;
    public final com.yandex.plus.home.internal.di.d d;
    public final com.yandex.plus.home.internal.di.p e;
    public final com.yandex.plus.home.internal.di.l f;
    public final com.yandex.plus.home.plaque.feature.internal.presentation.b g;
    public final com.yandex.plus.domain.auth.impl.i h;
    public final tf6 i;
    public final com.yandex.plus.home.api.b j;

    public t(u uVar, com.yandex.plus.home.internal.di.e eVar, com.yandex.plus.home.internal.di.d dVar, com.yandex.plus.home.internal.di.p pVar, com.yandex.plus.home.internal.di.l lVar, com.yandex.plus.home.plaque.feature.internal.presentation.b bVar, com.yandex.plus.domain.auth.impl.i iVar, tf6 tf6Var) {
        this.b = uVar;
        this.c = eVar;
        this.d = dVar;
        this.e = pVar;
        this.f = lVar;
        this.g = bVar;
        this.h = iVar;
        this.i = tf6Var;
        com.yandex.plus.home.api.b bVar2 = new com.yandex.plus.home.api.b();
        this.j = bVar2;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        jk6 jk6Var = new jk6(0, 17, com.yandex.plus.home.internal.di.d.class, dVar, "reporters", "getReporters$plus_sdk_release()Lcom/yandex/plus/core/analytics/Reporters;");
        int i = dVar.a.k;
        com.yandex.plus.core.analytics.logging.e.b = jk6Var;
        ReentrantLock reentrantLock = com.yandex.plus.core.analytics.logging.f.b;
        reentrantLock.lock();
        try {
            Integer valueOf = Integer.valueOf(i);
            Continuation continuation = null;
            if (i < 1) {
                valueOf = null;
            }
            com.yandex.plus.core.analytics.logging.f.a = valueOf != null ? valueOf.intValue() : 10000;
            while (true) {
                LinkedList linkedList = com.yandex.plus.core.analytics.logging.f.c;
                if (linkedList.size() < com.yandex.plus.core.analytics.logging.f.a) {
                    break;
                } else {
                    linkedList.remove();
                }
            }
            reentrantLock.unlock();
            com.yandex.plus.home.analytics.evgen.d dVar2 = (com.yandex.plus.home.analytics.evgen.d) dVar.d.getValue();
            w wVar = new w(0, lVar.b(), com.yandex.plus.home.graphql.plusstate.f.class, "getCurrentPlusState", "getCurrentPlusState()Lcom/yandex/plus/home/repository/api/model/plusstate/PlusState;", 0, 27);
            dVar2.getClass();
            dVar2.k = wVar;
            eVar.a.b = new k(this, 0);
            com.yandex.plus.core.analytics.logging.d dVar3 = uVar.x;
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
            if (dVar3.b(aVar)) {
                StringBuilder sb = new StringBuilder("Init PlusHomeSdk\n");
                sb.append("environment=" + uVar.b);
                sb.append('\n');
                sb.append("acceptLanguage=".concat(com.yandex.plus.core.locale.b.m(uVar.o)));
                sb.append('\n');
                sb.append("userId=" + uVar.d.b.getValue());
                sb.append("\nlocation=null\nserviceName=music\n");
                sb.append("versionName=".concat(uVar.s));
                sb.append('\n');
                StringBuilder sb2 = new StringBuilder("httpClientBuilder=");
                sb2.append(uVar.h != null);
                sb.append(sb2.toString());
                sb.append('\n');
                sb.append("packageName=".concat(uVar.r));
                sb.append('\n');
                sb.append("analyticsParams=" + uVar.j);
                sb.append("\nhostScheme=yandexmusic\noverriddenTestIds=null\n");
                sb.append("source=" + uVar.g);
                sb.append("\ntreasuryAdapter=false\n");
                dVar3.a(aVar, "PlusHomeSdkImpl", sb.toString(), null);
            }
            xdr xdrVar = iVar.h;
            com.yandex.plus.bdui.plus.webview.navigation.a aVar2 = new com.yandex.plus.bdui.plus.webview.navigation.a(18);
            rea reaVar = q6k.g;
            com.yandex.plus.bdui.flex.ui.a.k(q6k.m(xdrVar, aVar2, reaVar), tf6Var, new laq(this, continuation, 9));
            com.yandex.plus.bdui.flex.ui.a.k(zsd.d0(q6k.m(iVar.h, new com.yandex.plus.bdui.plus.webview.navigation.a(19), reaVar), 1), tf6Var, new v42(this, continuation, 23));
            com.yandex.plus.home.analytics.evgen.d dVar4 = (com.yandex.plus.home.analytics.evgen.d) dVar.d.getValue();
            k kVar = new k(this, 1);
            dVar4.getClass();
            dVar4.j = kVar;
            z zVar = uVar.q;
            boolean z = zVar instanceof com.yandex.plus.core.featureflags.b;
            com.yandex.plus.core.featureflags.b bVar3 = z ? (com.yandex.plus.core.featureflags.b) zVar : null;
            if (bVar3 != null) {
                bVar3.e = new l(this);
            }
            com.yandex.plus.core.featureflags.b bVar4 = z ? (com.yandex.plus.core.featureflags.b) zVar : null;
            if (bVar4 != null) {
                bVar4.d = new l(this);
            }
            com.yandex.plus.bdui.flex.ui.a.k(((com.yandex.plus.core.network.api.interceptors.d) pVar.j.getValue()).a, tf6Var, new n(this, null));
            com.yandex.plus.bdui.flex.ui.a.i(bVar2.b, tf6Var, new ea0(this, continuation, 6));
            com.yandex.plus.bdui.flex.ui.a.k(((com.yandex.plus.home.state.a) lVar.q.getValue()).b, tf6Var, new v42(this, continuation, 22));
            com.yandex.plus.bdui.flex.ui.a.k(uVar.m, tf6Var, new hk4(this, null));
            omb a = dVar.a();
            a.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("_meta", omb.a(1, new HashMap()));
            a.d("PlusHome.SDK.Init", linkedHashMap);
            ((com.yandex.plus.home.api.prefetch.l) ((jyr) bVar.d).getValue()).h();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.yandex.plus.home.c
    public final void a(Class cls, b bVar) {
        this.a.a.put(cls, bVar);
    }

    @Override // com.yandex.plus.home.c
    public final b b(Class cls) {
        return this.a.b(cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        p pVar;
        int i;
        Object e;
        if (cg6Var instanceof p) {
            pVar = (p) cg6Var;
            int i2 = pVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.l = i2 - Integer.MIN_VALUE;
                Object obj = pVar.j;
                nm6 nm6Var = nm6.a;
                i = pVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.graphql.plusstate.f b = this.f.b();
                    pVar.l = 1;
                    e = b.e(pVar);
                    if (e == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    e = ((z7o) obj).a;
                }
                r7o r7oVar = z7o.b;
                if (e instanceof t7o) {
                    return e;
                }
                return null;
            }
        }
        pVar = new p(this, cg6Var);
        Object obj2 = pVar.j;
        nm6 nm6Var2 = nm6.a;
        i = pVar.l;
        if (i != 0) {
        }
        r7o r7oVar2 = z7o.b;
        if (e instanceof t7o) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cg6 cg6Var) {
        q qVar;
        int i;
        if (cg6Var instanceof q) {
            qVar = (q) cg6Var;
            int i2 = qVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.l = i2 - Integer.MIN_VALUE;
                Object obj = qVar.j;
                nm6 nm6Var = nm6.a;
                i = qVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.payment.google.d dVar = (com.yandex.plus.home.payment.google.d) this.f.z.getValue();
                    qVar.l = 1;
                    obj = dVar.c.a(new com.yandex.plus.home.payment.google.a(dVar, null, 0), qVar);
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
                return Boolean.valueOf(!((com.yandex.plus.home.feature.webviews.internalapi.payment.a) obj).b);
            }
        }
        qVar = new q(this, cg6Var);
        Object obj2 = qVar.j;
        nm6 nm6Var2 = nm6.a;
        i = qVar.l;
        if (i != 0) {
        }
        return Boolean.valueOf(!((com.yandex.plus.home.feature.webviews.internalapi.payment.a) obj2).b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (defpackage.gld.Q(r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r5.h.e(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cg6 cg6Var) {
        s sVar;
        int i;
        if (cg6Var instanceof s) {
            sVar = (s) cg6Var;
            int i2 = sVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.l = i2 - Integer.MIN_VALUE;
                Object obj = sVar.j;
                nm6 nm6Var = nm6.a;
                i = sVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    sVar.l = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                com.yandex.passport.sloth.ui.q qVar = new com.yandex.passport.sloth.ui.q(this, null, 6);
                sVar.l = 2;
            }
        }
        sVar = new s(this, cg6Var);
        Object obj2 = sVar.j;
        nm6 nm6Var2 = nm6.a;
        i = sVar.l;
        if (i != 0) {
        }
        com.yandex.passport.sloth.ui.q qVar2 = new com.yandex.passport.sloth.ui.q(this, null, 6);
        sVar.l = 2;
    }
}
