package com.yandex.plus.home.api.prefetch;

import android.net.Uri;
import com.connectsdk.service.DeviceService;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.passport.internal.methods.performer.v0;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.graphql.b1;
import com.yandex.plus.core.graphql.k2;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.core.graphql.z0;
import com.yandex.plus.home.common.network.NetworkResponse;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x2;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.api.model.SyncType;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.plaquesdk.plaque.api.models.a0;
import com.yandex.plus.plaquesdk.plaque.api.models.b0;
import com.yandex.plus.plaquesdk.plaque.api.models.c0;
import com.yandex.plus.plaquesdk.plaque.api.models.z;
import defpackage.aur;
import defpackage.b6e;
import defpackage.bca;
import defpackage.c5b;
import defpackage.cnb;
import defpackage.ctm;
import defpackage.dkn;
import defpackage.dnb;
import defpackage.dp0;
import defpackage.e5b;
import defpackage.ezc;
import defpackage.f1d;
import defpackage.gld;
import defpackage.gzf;
import defpackage.hrg;
import defpackage.jtj;
import defpackage.jwj;
import defpackage.jyr;
import defpackage.kp0;
import defpackage.ltm;
import defpackage.lyf;
import defpackage.mm6;
import defpackage.mxr;
import defpackage.n20;
import defpackage.nm6;
import defpackage.ouj;
import defpackage.ox6;
import defpackage.pce;
import defpackage.pjc;
import defpackage.pm6;
import defpackage.pyc;
import defpackage.pz2;
import defpackage.qgg;
import defpackage.qxe;
import defpackage.r7o;
import defpackage.rar;
import defpackage.rjc;
import defpackage.rjf;
import defpackage.saf;
import defpackage.t7o;
import defpackage.tah;
import defpackage.tf6;
import defpackage.u75;
import defpackage.uah;
import defpackage.v75;
import defpackage.wis;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.xz0;
import defpackage.y7g;
import defpackage.z75;
import defpackage.z7o;
import defpackage.zne;
import defpackage.zsd;
import defpackage.zt3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(com.yandex.plus.home.feature.webviews.internal.d dVar, x2 x2Var, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.j = 9;
        this.l = dVar;
        this.m = x2Var;
        this.n = (ezc) function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        t7o t7oVar;
        Throwable a;
        String str = (String) this.n;
        com.yandex.passport.internal.entities.j jVar = (com.yandex.passport.internal.entities.j) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
            if (i == 0) {
                qgg.h0(obj);
                r7o r7oVar = z7o.b;
                com.yandex.plus.bdui.plus.content.controller.f b = ((com.yandex.plus.coil.b) ((com.yandex.plus.core.imageloader.b) jVar.b)).b(str);
                pce pceVar = (pce) b.c;
                pceVar.w = com.yandex.plus.plaquesdk.widget.a.a;
                pceVar.v = 0;
                pceVar.o = Boolean.FALSE;
                this.m = null;
                this.k = 1;
                obj = b.w(this);
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
            r7o r7oVar2 = z7o.b;
        } catch (wis e) {
            r7o r7oVar3 = z7o.b;
            t7oVar = new t7o(e);
            obj = t7oVar;
            a = z7o.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar4 = z7o.b;
            t7oVar = new t7o(th);
            obj = t7oVar;
            a = z7o.a(obj);
            if (a == null) {
            }
        }
        a = z7o.a(obj);
        if (a == null) {
            return obj;
        }
        com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) jVar.d;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        if (bVar.b(aVar)) {
            bVar.a(aVar, "PlaqueMapper", f1d.g("Failed download image with url ", str), a);
        }
        return com.yandex.plus.plaquesdk.widget.a.a;
    }

    private final Object l(Object obj) {
        t7o t7oVar;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
            if (i == 0) {
                qgg.h0(obj);
                com.yandex.passport.internal.core.accounts.h hVar = (com.yandex.passport.internal.core.accounts.h) this.l;
                String str = (String) this.n;
                r7o r7oVar = z7o.b;
                com.yandex.plus.bdui.plus.content.controller.f b = ((com.yandex.plus.coil.b) ((com.yandex.plus.core.imageloader.b) hVar.c)).b(str);
                ((pce) b.c).o = Boolean.FALSE;
                this.m = null;
                this.k = 1;
                obj = b.w(this);
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
            r7o r7oVar2 = z7o.b;
        } catch (wis e) {
            r7o r7oVar3 = z7o.b;
            t7oVar = new t7o(e);
            obj = t7oVar;
            return new z7o(obj);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar4 = z7o.b;
            t7oVar = new t7o(th);
            obj = t7oVar;
            return new z7o(obj);
        }
        return new z7o(obj);
    }

    private final Object n(Object obj) {
        p pVar = (p) this.l;
        ltm ltmVar = (ltm) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            y yVar = new y(pVar, ltmVar);
            com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) pVar.c;
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
            if (bVar.b(aVar)) {
                bVar.c(aVar, "WithConnectionEstablishmentOperationDecorator", "Starting billing connection...");
            }
            ((pz2) this.n).h(yVar);
            com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a aVar2 = new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(15, pVar);
            this.m = null;
            this.k = 1;
            if (y7g.q(ltmVar, aVar2, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0107, code lost:
    
        if (r4.emit(r0, r13) == r7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0116, code lost:
    
        if (r4.emit(com.yandex.plus.pay.api.feature.inapp.restore.c.a, r13) == r7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00eb, code lost:
    
        if (r14.a(r13) == r7) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object o(Object obj) {
        xqn xqnVar;
        t7o t7oVar;
        Throwable a;
        Throwable a2;
        xqn xqnVar2;
        Throwable th;
        com.yandex.plus.pay.internal.feature.payment.inapp.google.d dVar = (com.yandex.plus.pay.internal.feature.payment.inapp.google.d) this.n;
        rjc rjcVar = (rjc) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
            if (i == 0) {
                xqn i2 = hrg.i(obj);
                try {
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.pay.inapp.api.b bVar = dVar.a;
                    com.yandex.plus.pay.inapp.api.e eVar = com.yandex.plus.pay.inapp.api.e.a;
                    this.m = rjcVar;
                    this.l = i2;
                    this.k = 1;
                    Object b = bVar.b(eVar, this);
                    if (b != nm6Var) {
                        xqnVar = i2;
                        obj = b;
                    }
                } catch (wis e) {
                    e = e;
                    xqnVar = i2;
                    wis wisVar = e;
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(wisVar);
                    xqn xqnVar3 = xqnVar;
                    a = z7o.a(t7oVar);
                    if (a != null) {
                    }
                    a2 = z7o.a(t7oVar);
                    Object obj2 = t7oVar;
                    if (a2 != null) {
                    }
                    com.yandex.plus.pay.internal.feature.payment.inapp.google.c cVar = new com.yandex.plus.pay.internal.feature.payment.inapp.google.c((List) obj2, null, rjcVar, dVar, xqnVar3);
                    this.m = rjcVar;
                    this.l = xqnVar3;
                    this.k = 2;
                    obj = gld.Q(cVar, this);
                    if (obj != nm6Var) {
                    }
                    return nm6Var;
                } catch (Throwable th2) {
                    th = th2;
                    xqnVar = i2;
                    Throwable th3 = th;
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(th3);
                    xqn xqnVar32 = xqnVar;
                    a = z7o.a(t7oVar);
                    if (a != null) {
                    }
                    a2 = z7o.a(t7oVar);
                    Object obj22 = t7oVar;
                    if (a2 != null) {
                    }
                    com.yandex.plus.pay.internal.feature.payment.inapp.google.c cVar2 = new com.yandex.plus.pay.internal.feature.payment.inapp.google.c((List) obj22, null, rjcVar, dVar, xqnVar32);
                    this.m = rjcVar;
                    this.l = xqnVar32;
                    this.k = 2;
                    obj = gld.Q(cVar2, this);
                    if (obj != nm6Var) {
                    }
                    return nm6Var;
                }
                return nm6Var;
            }
            if (i == 1) {
                xqnVar = (xqn) this.l;
                try {
                    qgg.h0(obj);
                } catch (wis e2) {
                    e = e2;
                    wis wisVar2 = e;
                    r7o r7oVar22 = z7o.b;
                    t7oVar = new t7o(wisVar2);
                    xqn xqnVar322 = xqnVar;
                    a = z7o.a(t7oVar);
                    if (a != null) {
                    }
                    a2 = z7o.a(t7oVar);
                    Object obj222 = t7oVar;
                    if (a2 != null) {
                    }
                    com.yandex.plus.pay.internal.feature.payment.inapp.google.c cVar22 = new com.yandex.plus.pay.internal.feature.payment.inapp.google.c((List) obj222, null, rjcVar, dVar, xqnVar322);
                    this.m = rjcVar;
                    this.l = xqnVar322;
                    this.k = 2;
                    obj = gld.Q(cVar22, this);
                    if (obj != nm6Var) {
                    }
                    return nm6Var;
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th32 = th;
                    r7o r7oVar32 = z7o.b;
                    t7oVar = new t7o(th32);
                    xqn xqnVar3222 = xqnVar;
                    a = z7o.a(t7oVar);
                    if (a != null) {
                    }
                    a2 = z7o.a(t7oVar);
                    Object obj2222 = t7oVar;
                    if (a2 != null) {
                    }
                    com.yandex.plus.pay.internal.feature.payment.inapp.google.c cVar222 = new com.yandex.plus.pay.internal.feature.payment.inapp.google.c((List) obj2222, null, rjcVar, dVar, xqnVar3222);
                    this.m = rjcVar;
                    this.l = xqnVar3222;
                    this.k = 2;
                    obj = gld.Q(cVar222, this);
                    if (obj != nm6Var) {
                    }
                    return nm6Var;
                }
            } else if (i == 2) {
                xqnVar2 = (xqn) this.l;
                qgg.h0(obj);
                if (!CollectionsKt.O((Iterable) obj).isEmpty()) {
                    com.yandex.plus.pay.internal.feature.cache.b bVar2 = dVar.d;
                    this.m = rjcVar;
                    this.l = xqnVar2;
                    this.k = 3;
                }
                th = (Throwable) xqnVar2.a;
                if (th != null) {
                }
            } else {
                if (i != 3) {
                    if (i == 4 || i == 5) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xqnVar2 = (xqn) this.l;
                qgg.h0(obj);
                th = (Throwable) xqnVar2.a;
                if (th != null) {
                    com.yandex.plus.pay.api.feature.inapp.restore.b bVar3 = new com.yandex.plus.pay.api.feature.inapp.restore.b(r1.U(th));
                    this.m = rjcVar;
                    this.l = null;
                    this.k = 4;
                } else {
                    this.m = null;
                    this.l = null;
                    this.k = 5;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : (Iterable) obj) {
                if (!((com.yandex.plus.pay.inapp.api.f) obj3).f) {
                    arrayList.add(obj3);
                }
            }
            r7o r7oVar4 = z7o.b;
            t7oVar = arrayList;
            xqn xqnVar32222 = xqnVar;
            a = z7o.a(t7oVar);
            if (a != null) {
                xqnVar32222.a = r1.U(a);
            }
            a2 = z7o.a(t7oVar);
            Object obj22222 = t7oVar;
            if (a2 != null) {
                obj22222 = c5b.a;
            }
            com.yandex.plus.pay.internal.feature.payment.inapp.google.c cVar2222 = new com.yandex.plus.pay.internal.feature.payment.inapp.google.c((List) obj22222, null, rjcVar, dVar, xqnVar32222);
            this.m = rjcVar;
            this.l = xqnVar32222;
            this.k = 2;
            obj = gld.Q(cVar2222, this);
            if (obj != nm6Var) {
                xqnVar2 = xqnVar32222;
                if (!CollectionsKt.O((Iterable) obj).isEmpty()) {
                }
                th = (Throwable) xqnVar2.a;
                if (th != null) {
                }
            }
            return nm6Var;
        } catch (CancellationException e3) {
            throw e3;
        }
    }

    private final Object p(Object obj) {
        com.yandex.plus.pay.common.api.utils.b r;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            ExternalMediaBillingApi externalMediaBillingApi = ((com.yandex.plus.pay.internal.feature.subscription.b) this.l).b;
            String str = (String) this.m;
            String str2 = (String) this.n;
            this.k = 1;
            obj = externalMediaBillingApi.e(str, str2, this);
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
        r = com.yandex.plus.bdui.flex.ui.a.r((NetworkResponse) obj, new v0(18));
        return r;
    }

    private final Object q(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i != 0) {
            if (i == 1) {
                qgg.h0(obj);
                return obj;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        com.yandex.plus.pay.internal.feature.subscription.b bVar = ((com.yandex.plus.pay.internal.feature.subscription.e) this.l).a;
        String str = (String) this.m;
        Set set = (Set) this.n;
        this.k = 1;
        bVar.getClass();
        Set set2 = set;
        set2.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (com.yandex.plus.pay.internal.feature.subscription.h.a[((SyncType) it.next()).ordinal()] != 1) {
                b6e.s();
                return null;
            }
            z75.t(arrayList, u75.h("FEATURES", "OTT_SUBSCRIPTION", "FAMILY_ROLE"));
        }
        Object a = bVar.a(str, CollectionsKt.X(CollectionsKt.w0(CollectionsKt.z0(arrayList)), StringUtils.COMMA, null, null, null, 62), this);
        return a == nm6Var ? nm6Var : a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r7 == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object s(Object obj) {
        rjc rjcVar = (rjc) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            com.yandex.plus.pay.ui.core.debug.internal.ui.form.j jVar = (com.yandex.plus.pay.ui.core.debug.internal.ui.form.j) this.n;
            this.m = null;
            this.l = rjcVar;
            this.k = 1;
            obj = com.yandex.plus.pay.ui.core.debug.internal.ui.form.j.a(jVar, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rjcVar = (rjc) this.l;
            qgg.h0(obj);
        }
        this.m = null;
        this.l = null;
        this.k = 2;
    }

    private final Object t(Object obj) {
        mm6 mm6Var = (mm6) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            List list = (List) this.l;
            com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h hVar = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h) this.n;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (true) {
                Continuation continuation = null;
                if (!it.hasNext()) {
                    break;
                }
                arrayList.add(x97.p(mm6Var, null, null, new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.b((String) it.next(), hVar, continuation, 10), 3));
            }
            this.m = null;
            this.k = 1;
            obj = ox6.v(arrayList, this);
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
        return uah.n((Iterable) obj);
    }

    private final Object u(Object obj) {
        com.yandex.passport.internal.core.accounts.h hVar = (com.yandex.passport.internal.core.accounts.h) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            Object obj2 = this.m;
            this.k = 1;
            obj = com.yandex.passport.internal.core.accounts.h.c(hVar, obj2, this);
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
        String str = (String) obj;
        if (str != null) {
            com.yandex.passport.sloth.ui.c cVar = (com.yandex.passport.sloth.ui.c) this.n;
            String k = ouj.k(')', "__homeApp.response(", str);
            com.yandex.plus.webview.core.d w = ((com.yandex.plus.webview.api.contract.a) cVar.b).w();
            if (w != null) {
                w.b(k);
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [ezc, kotlin.jvm.functions.Function1] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                j jVar = new j((l) this.n, continuation, 0);
                jVar.m = obj;
                return jVar;
            case 1:
                return new j((com.yandex.plus.home.auth.f) this.l, (String) this.m, (String) this.n, continuation, 1);
            case 2:
                return new j((mxr) this.l, (tf6) this.n, this.m, continuation);
            case 3:
                j jVar2 = new j((pyc) this.l, (mm6) this.n, continuation, 3);
                jVar2.m = obj;
                return jVar2;
            case 4:
                j jVar3 = new j((pjc) this.l, (pyc) this.n, continuation, 4);
                jVar3.m = obj;
                return jVar3;
            case 5:
                j jVar4 = new j((com.yandex.passport.internal.core.accounts.h) this.l, (com.yandex.plus.core.data.common.y) this.n, continuation, 5);
                jVar4.m = obj;
                return jVar4;
            case 6:
                return new j((rjf) this.l, (com.yandex.plus.home.dailyquests.repository.api.dailyquests.l) this.m, (com.yandex.plus.home.dailyquests.repository.api.dailyquests.l) this.n, continuation, 6);
            case 7:
                j jVar5 = new j((com.yandex.plus.bdui.plus.content.controller.f) this.l, (com.yandex.plus.bdui.plus.checkout.h) this.n, continuation, 7);
                jVar5.m = obj;
                return jVar5;
            case 8:
                return new j((Function0) this.l, (com.yandex.plus.home.feature.webviews.internal.d) this.m, (Function1) this.n, continuation, 8);
            case 9:
                return new j((com.yandex.plus.home.feature.webviews.internal.d) this.l, (x2) this.m, (Function1) this.n, continuation);
            case 10:
                j jVar6 = new j((dkn) this.l, (String) this.n, continuation, 10);
                jVar6.m = obj;
                return jVar6;
            case 11:
                return new j((com.yandex.plus.home.feature.webviews.internal.bridge.b) this.l, (v1) this.n, continuation, 11);
            case 12:
                return new j((Collection) this.l, (t) this.m, (Function1) this.n, continuation, 12);
            case 13:
                return new j((t) this.m, (ArrayList) this.n, continuation);
            case 14:
                j jVar7 = new j((com.yandex.plus.home.graphql.user.e) this.n, continuation, 14);
                jVar7.m = obj;
                return jVar7;
            case 15:
                return new j((com.yandex.plus.home.plaque.feature.internal.presentation.h) this.l, (com.yandex.plus.home.plaque.repository.api.model.c) this.m, (c0) this.n, continuation, 15);
            case 16:
                return new j((c0) this.l, (com.yandex.plus.home.plaque.feature.api.context.b) this.m, (com.yandex.plus.home.plaque.feature.internal.presentation.h) this.n, continuation, 16);
            case 17:
                return new j((com.yandex.plus.home.plaque.repository.graphql.g) this.l, (String) this.m, (String) this.n, continuation, 17);
            case 18:
                return new j((p) this.l, (com.yandex.plus.home.plaque.repository.graphql.g) this.m, (k2) this.n, continuation, 18);
            case 19:
                j jVar8 = new j((com.yandex.passport.internal.entities.j) this.l, (String) this.n, continuation, 19);
                jVar8.m = obj;
                return jVar8;
            case 20:
                j jVar9 = new j((com.yandex.passport.internal.core.accounts.h) this.l, (String) this.n, continuation, 20);
                jVar9.m = obj;
                return jVar9;
            case 21:
                j jVar10 = new j((p) this.l, (pz2) this.n, continuation, 21);
                jVar10.m = obj;
                return jVar10;
            case 22:
                j jVar11 = new j((com.yandex.plus.pay.internal.feature.payment.inapp.google.d) this.n, continuation, 22);
                jVar11.m = obj;
                return jVar11;
            case 23:
                return new j((com.yandex.plus.pay.internal.feature.subscription.b) this.l, (String) this.m, (String) this.n, continuation, 23);
            case 24:
                return new j((com.yandex.plus.pay.internal.feature.subscription.e) this.l, (String) this.m, (Set) this.n, continuation, 24);
            case 25:
                j jVar12 = new j((com.yandex.plus.pay.ui.core.debug.internal.ui.form.j) this.n, continuation, 25);
                jVar12.m = obj;
                return jVar12;
            case 26:
                j jVar13 = new j((List) this.l, (com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h) this.n, continuation, 26);
                jVar13.m = obj;
                return jVar13;
            case 27:
                return new j((com.yandex.passport.internal.core.accounts.h) this.l, this.m, (com.yandex.passport.sloth.ui.c) this.n, continuation, 27);
            default:
                return new j((com.yandex.plus.webview.internal.f) this.l, (String) this.m, (Map) this.n, continuation, 28);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 7:
                ((j) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((j) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0327, code lost:
    
        if (com.yandex.plus.home.feature.webviews.internal.container.t.h(r0, r8, "", r3, r4, r5, r19) == r12) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02e1, code lost:
    
        if (r3 == r12) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02cb, code lost:
    
        if (r2 == r12) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x039f, code lost:
    
        if (r1 == r0) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0578, code lost:
    
        if (defpackage.y2x.o(900000, r19) != r1) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x05b7, code lost:
    
        if (r2 == r1) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x05ba, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x05fb, code lost:
    
        if (defpackage.rjf.c(r1, (com.yandex.plus.home.dailyquests.repository.api.dailyquests.l) r8, r0, r19) == r2) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x05f0, code lost:
    
        if (defpackage.rjf.a(r1, r0, r19) == r2) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0157, code lost:
    
        if (r0.emit(r3, r19) == r2) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0171, code lost:
    
        if (r0.emit(r3, r19) == r2) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x082f  */
    /* JADX WARN: Type inference failed for: r8v21, types: [ezc, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:247:0x05b7 -> B:241:0x05bb). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        Object w;
        t7o t7oVar;
        List list3;
        Throwable a;
        boolean z;
        List list4;
        Object t7oVar2;
        Object obj2;
        Object t7oVar3;
        Object q;
        Object d;
        Object e;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.t tVar;
        Object obj3;
        Throwable th;
        Object obj4;
        Object obj5;
        Throwable a2;
        Object A;
        Object a3;
        com.yandex.plus.home.feature.webviews.internalapi.payment.a aVar;
        Object g0;
        t7o t7oVar4;
        Object obj6;
        com.yandex.plus.core.analytics.logging.d dVar;
        com.yandex.plus.log.api.a aVar2;
        Object d2;
        com.yandex.plus.home.graphql.user.e eVar;
        jtj jtjVar;
        Object d3;
        int i = this.j;
        int i2 = 3;
        boolean z2 = false;
        boolean z3 = false;
        Object obj7 = this.n;
        Continuation continuation = null;
        switch (i) {
            case 0:
                l lVar = (l) obj7;
                jyr jyrVar = lVar.e;
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                Continuation continuation2 = null;
                try {
                    if (i3 == 0) {
                        qgg.h0(obj);
                        if (!((File) jyrVar.getValue()).exists() && !((File) jyrVar.getValue()).mkdirs()) {
                            com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                            jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
                            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.d, bVar, "Prefetch directory is unavailable", null);
                            return Unit.a;
                        }
                        String str = (String) lVar.b.invoke();
                        File[] listFiles = ((File) jyrVar.getValue()).listFiles();
                        if (listFiles == null || (list = xz0.X(listFiles)) == null) {
                            list = c5b.a;
                        }
                        List list5 = list;
                        try {
                            r7o r7oVar = z7o.b;
                            i iVar = new i(lVar, str, continuation2, z2 ? 1 : 0);
                            this.m = null;
                            this.l = list5;
                            this.k = 1;
                            w = com.yandex.plus.bdui.plus.analytics.b.w(8, 1000L, Long.MAX_VALUE, 2.0d, null, iVar, this);
                            if (w == nm6Var) {
                                return nm6Var;
                            }
                            list2 = list5;
                        } catch (wis e2) {
                            e = e2;
                            list2 = list5;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            list3 = list2;
                            w = t7oVar;
                            a = z7o.a(w);
                            if (a != null) {
                            }
                            z = w instanceof t7o;
                            if (!z) {
                            }
                            if (z) {
                            }
                            list4 = (List) w;
                            if (list4 != null) {
                            }
                            return Unit.a;
                        } catch (Throwable th2) {
                            th = th2;
                            list2 = list5;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            list3 = list2;
                            w = t7oVar;
                            a = z7o.a(w);
                            if (a != null) {
                            }
                            z = w instanceof t7o;
                            if (!z) {
                            }
                            if (z) {
                            }
                            list4 = (List) w;
                            if (list4 != null) {
                            }
                            return Unit.a;
                        }
                    } else {
                        if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list2 = (List) this.l;
                        try {
                            qgg.h0(obj);
                            w = obj;
                        } catch (wis e3) {
                            e = e3;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            list3 = list2;
                            w = t7oVar;
                            a = z7o.a(w);
                            if (a != null) {
                            }
                            z = w instanceof t7o;
                            if (!z) {
                            }
                            if (z) {
                            }
                            list4 = (List) w;
                            if (list4 != null) {
                            }
                            return Unit.a;
                        } catch (Throwable th3) {
                            th = th3;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            list3 = list2;
                            w = t7oVar;
                            a = z7o.a(w);
                            if (a != null) {
                            }
                            z = w instanceof t7o;
                            if (!z) {
                            }
                            if (z) {
                            }
                            list4 = (List) w;
                            if (list4 != null) {
                            }
                            return Unit.a;
                        }
                    }
                    r7o r7oVar4 = z7o.b;
                    list3 = list2;
                    a = z7o.a(w);
                    if (a != null) {
                        com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.a;
                        jyr jyrVar3 = com.yandex.plus.core.analytics.logging.e.a;
                        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar2, "Loading prefetch.txt failed", a);
                    }
                    z = w instanceof t7o;
                    if (!z) {
                        jyr jyrVar4 = com.yandex.plus.core.analytics.logging.e.a;
                        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.a, "prefetch.txt loaded successfully: " + ((List) w), null);
                    }
                    if (z) {
                        w = null;
                    }
                    list4 = (List) w;
                    if (list4 != null) {
                        List<String> list6 = list4;
                        for (String str2 : list6) {
                            String d4 = l.d(str2);
                            Iterator it = list3.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (Intrinsics.d(((File) obj2).getName(), d4)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            File file = (File) obj2;
                            if (file != null) {
                                com.yandex.plus.core.analytics.logging.b bVar3 = com.yandex.plus.core.analytics.logging.b.a;
                                String g = f1d.g("Found previously saved file for url = ", str2);
                                jyr jyrVar5 = com.yandex.plus.core.analytics.logging.e.a;
                                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar3, g, null);
                                lVar.f().put(d4, new c(file));
                            } else {
                                String d5 = l.d(str2);
                                rar y = x97.y(lVar.d, null, pm6.b, new com.yandex.passport.sloth.ui.p(lVar, d5, str2, continuation2, 4), 1);
                                lVar.f().put(d5, new b(y));
                                y.start();
                            }
                        }
                        List list7 = list6;
                        ArrayList arrayList = new ArrayList(v75.o(list7, 10));
                        Iterator it2 = list7.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(l.d((String) it2.next()));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj8 : list3) {
                            if (!arrayList.contains(((File) obj8).getName())) {
                                arrayList2.add(obj8);
                            }
                        }
                        int a4 = tah.a(v75.o(arrayList2, 10));
                        if (a4 < 16) {
                            a4 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(a4);
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            File file2 = (File) next;
                            try {
                                r7o r7oVar5 = z7o.b;
                                t7oVar2 = Boolean.valueOf(file2.delete());
                            } catch (Throwable th4) {
                                r7o r7oVar6 = z7o.b;
                                t7oVar2 = new t7o(th4);
                            }
                            Throwable a5 = z7o.a(t7oVar2);
                            if (a5 != null) {
                                com.yandex.plus.core.analytics.logging.b bVar4 = com.yandex.plus.core.analytics.logging.b.a;
                                String str3 = "File deletion failed fileName = " + file2.getName() + ", exception = " + a5.getMessage();
                                jyr jyrVar6 = com.yandex.plus.core.analytics.logging.e.a;
                                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.d, bVar4, str3, null);
                            }
                            if (t7oVar2 instanceof t7o) {
                                t7oVar2 = null;
                            }
                            linkedHashMap.put(next, (Boolean) t7oVar2);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            if (Intrinsics.d(entry.getValue(), Boolean.TRUE)) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Set keySet = linkedHashMap2.keySet();
                        ArrayList arrayList3 = new ArrayList(v75.o(keySet, 10));
                        Iterator it4 = keySet.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(((File) it4.next()).getName());
                        }
                        com.yandex.plus.core.analytics.logging.b bVar5 = com.yandex.plus.core.analytics.logging.b.a;
                        String str4 = "Deleted unnecessary files - " + arrayList3;
                        jyr jyrVar7 = com.yandex.plus.core.analytics.logging.e.a;
                        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar5, str4, null);
                    }
                    return Unit.a;
                } catch (CancellationException e4) {
                    throw e4;
                }
            case 1:
                String str5 = (String) this.m;
                Object obj9 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object d6 = ((com.yandex.plus.home.auth.f) this.l).a.d(str5, (String) obj7, this);
                    if (d6 != obj9) {
                        obj9 = d6;
                    }
                    return obj9;
                }
                if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                obj9 = ((z7o) obj).a;
                Throwable a6 = z7o.a(obj9);
                if (a6 != null) {
                    com.yandex.plus.core.analytics.logging.b bVar6 = com.yandex.plus.core.analytics.logging.b.a;
                    String k = ouj.k('\"', "Can't authorize url = \"", str5);
                    jyr jyrVar8 = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.d, bVar6, k, a6);
                }
                boolean z4 = obj9 instanceof t7o;
                if (!z4) {
                    com.yandex.plus.core.analytics.logging.b bVar7 = com.yandex.plus.core.analytics.logging.b.a;
                    String k2 = ouj.k('\"', "Authorized url = \"", (String) obj9);
                    jyr jyrVar9 = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar7, k2, null);
                }
                if (z4) {
                    return str5;
                }
                return obj9;
            case 2:
                nm6 nm6Var2 = nm6.a;
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                Object obj10 = this.m;
                this.k = 1;
                Object invoke = ((mxr) this.l).invoke((tf6) obj7, obj10, this);
                return invoke == nm6Var2 ? nm6Var2 : invoke;
            case 3:
                Object obj11 = this.m;
                nm6 nm6Var3 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    this.m = null;
                    this.k = 1;
                    if (((pyc) this.l).invoke((mm6) obj7, obj11, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                mm6 mm6Var = (mm6) this.m;
                nm6 nm6Var4 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.l;
                    j jVar = new j((pyc) obj7, mm6Var, continuation, i2);
                    this.m = null;
                    this.k = 1;
                    if (zsd.O(pjcVar, jVar, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                nm6 nm6Var5 = nm6.a;
                int i8 = this.k;
                try {
                    if (i8 == 0) {
                        qgg.h0(obj);
                        com.yandex.passport.internal.core.accounts.h hVar = (com.yandex.passport.internal.core.accounts.h) this.l;
                        com.yandex.plus.core.data.common.y yVar = (com.yandex.plus.core.data.common.y) obj7;
                        r7o r7oVar7 = z7o.b;
                        com.yandex.plus.bdui.plus.content.controller.f b = ((com.yandex.plus.coil.b) ((com.yandex.plus.core.imageloader.b) hVar.d)).b(((n20) hVar.c).a ? yVar.b : yVar.a);
                        this.m = null;
                        this.k = 1;
                        t7oVar3 = b.w(this);
                        if (t7oVar3 == nm6Var5) {
                            return nm6Var5;
                        }
                    } else {
                        if (i8 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        t7oVar3 = obj;
                    }
                    r7o r7oVar8 = z7o.b;
                } catch (wis e5) {
                    r7o r7oVar9 = z7o.b;
                    t7oVar3 = new t7o(e5);
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Throwable th5) {
                    r7o r7oVar10 = z7o.b;
                    t7oVar3 = new t7o(th5);
                }
                if (t7oVar3 instanceof t7o) {
                    return null;
                }
                return t7oVar3;
            case 6:
                com.yandex.plus.home.dailyquests.repository.api.dailyquests.l lVar2 = (com.yandex.plus.home.dailyquests.repository.api.dailyquests.l) this.m;
                rjf rjfVar = (rjf) this.l;
                nm6 nm6Var6 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    break;
                } else {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                this.k = 2;
                break;
            case 7:
                mm6 mm6Var2 = (mm6) this.m;
                nm6 nm6Var7 = nm6.a;
                int i10 = this.k;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        ((com.yandex.plus.bdui.plus.checkout.h) obj7).invoke();
                        saf.K(mm6Var2.getCoroutineContext());
                        this.m = mm6Var2;
                        this.k = 1;
                        break;
                    } else {
                        qgg.h0(obj);
                        this.m = mm6Var2;
                        this.k = 2;
                        gzf gzfVar = ctm.i.f;
                        if (gzfVar.d.compareTo(lyf.d) >= 0) {
                            q = Unit.a;
                            break;
                        } else {
                            zt3 zt3Var = new zt3(1, qxe.b(this));
                            zt3Var.s();
                            com.yandex.plus.home.dailyquests.feature.internal.utils.b bVar8 = new com.yandex.plus.home.dailyquests.feature.internal.utils.b(gzfVar, zt3Var);
                            gzfVar.a(bVar8);
                            zt3Var.u(new com.yandex.plus.home.dailyquests.feature.internal.utils.a(z3 ? 1 : 0, gzfVar, bVar8));
                            q = zt3Var.q();
                            if (q != nm6.a) {
                                q = Unit.a;
                                break;
                            }
                        }
                    }
                } else {
                    qgg.h0(obj);
                    this.m = mm6Var2;
                    this.k = 1;
                }
                break;
            case 8:
                com.yandex.plus.home.feature.webviews.internal.d dVar2 = (com.yandex.plus.home.feature.webviews.internal.d) this.m;
                nm6 nm6Var8 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    ((Function0) this.l).invoke();
                    com.yandex.plus.home.auth.f fVar = dVar2.b;
                    this.k = 1;
                    d = fVar.d(this);
                    if (d == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    d = obj;
                }
                com.yandex.plus.home.feature.webviews.internalapi.authorization.d dVar3 = (com.yandex.plus.home.feature.webviews.internalapi.authorization.d) d;
                if (dVar3 instanceof com.yandex.plus.home.feature.webviews.internalapi.authorization.b) {
                    com.yandex.plus.home.analytics.diagnostic.messaging.a aVar3 = dVar2.c;
                    dnb dnbVar = aVar3.a;
                    cnb cnbVar = aVar3.b;
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    dnbVar.getClass();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.put("webview_type", cnbVar.a);
                    linkedHashMap3.put("additional_params", e5bVar);
                    linkedHashMap3.put("_meta", dnb.b(new HashMap()));
                    dnbVar.c("Error.WebView.NativeAuth.LoginFailed", linkedHashMap3);
                }
                ((Function1) obj7).invoke(dVar3);
                return Unit.a;
            case 9:
                com.yandex.plus.home.feature.webviews.internal.d dVar4 = (com.yandex.plus.home.feature.webviews.internal.d) this.l;
                nm6 nm6Var9 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.auth.f fVar2 = dVar4.b;
                    this.k = 1;
                    e = fVar2.e(this);
                    if (e == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    e = obj;
                }
                com.yandex.plus.home.feature.webviews.internalapi.authorization.e eVar2 = (com.yandex.plus.home.feature.webviews.internalapi.authorization.e) e;
                if (eVar2 == com.yandex.plus.home.feature.webviews.internalapi.authorization.e.c) {
                    com.yandex.plus.home.analytics.diagnostic.messaging.a aVar4 = dVar4.c;
                    dnb dnbVar2 = aVar4.a;
                    cnb cnbVar2 = aVar4.b;
                    e5b e5bVar2 = e5b.a;
                    e5bVar2.getClass();
                    dnbVar2.getClass();
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    linkedHashMap4.put("webview_type", cnbVar2.a);
                    linkedHashMap4.put("additional_params", e5bVar2);
                    linkedHashMap4.put("_meta", dnb.b(new HashMap()));
                    dnbVar2.c("Error.WebView.NativeAuth.LogoutFailed", linkedHashMap4);
                }
                String str6 = ((x2) this.m).a;
                int ordinal = eVar2.ordinal();
                if (ordinal == 0) {
                    tVar = com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.t.b;
                } else if (ordinal == 1) {
                    tVar = com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.t.d;
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    tVar = com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.t.c;
                }
                ((ezc) obj7).invoke(new u(str6, tVar));
                return Unit.a;
            case 10:
                rjc rjcVar = (rjc) this.m;
                nm6 nm6Var10 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    dkn dknVar = (dkn) this.l;
                    com.yandex.passport.common.mvi.c cVar = new com.yandex.passport.common.mvi.c((String) obj7, rjcVar);
                    this.m = null;
                    this.k = 1;
                    if (dknVar.a.collect(cVar, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                v1 v1Var = (v1) obj7;
                com.yandex.plus.home.feature.webviews.internal.bridge.b bVar9 = (com.yandex.plus.home.feature.webviews.internal.bridge.b) this.l;
                Object obj12 = nm6.a;
                int i14 = this.k;
                Continuation continuation3 = null;
                if (i14 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.core.accounts.h hVar2 = bVar9.d;
                    this.k = 1;
                    Object Q = hVar2.Q(v1Var, this);
                    obj3 = Q;
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj4 = this.m;
                        qgg.h0(obj);
                        th = null;
                        obj5 = obj4;
                        a2 = z7o.a(obj5);
                        if (a2 != null) {
                            jyr jyrVar10 = com.yandex.plus.core.analytics.logging.e.a;
                            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, com.yandex.plus.core.analytics.logging.b.c, "sendMessage() Processing message error inMessage=" + v1Var + ", throwable=" + a2, th);
                            com.yandex.plus.home.analytics.diagnostic.messaging.b bVar10 = bVar9.i;
                            bVar10.getClass();
                            dnb dnbVar3 = bVar10.a;
                            cnb cnbVar3 = bVar10.b;
                            String message = a2.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            Map b2 = tah.b(new Pair(DeviceService.KEY_DESC, message));
                            dnbVar3.getClass();
                            b2.getClass();
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            linkedHashMap5.put("webview_type", cnbVar3.a);
                            linkedHashMap5.put("additional_params", b2);
                            linkedHashMap5.put("_meta", dnb.b(new HashMap()));
                            dnbVar3.c("Error.WebView.Protocol.Serialize", linkedHashMap5);
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    obj3 = ((z7o) obj).a;
                }
                r7o r7oVar11 = z7o.b;
                if (obj3 instanceof t7o) {
                    th = null;
                    obj5 = obj3;
                    a2 = z7o.a(obj5);
                    if (a2 != null) {
                    }
                    return Unit.a;
                }
                String str7 = (String) obj3;
                bVar9.B(str7);
                this.m = obj3;
                this.k = 2;
                th = null;
                Object V = x97.V(bVar9.b, new com.yandex.plus.experiments.impl.cache.b(bVar9, v1Var, str7, continuation3, 4), this);
                Object obj13 = V;
                if (V != obj12) {
                    obj13 = Unit.a;
                }
                if (obj13 != obj12) {
                    obj4 = obj3;
                    obj5 = obj4;
                    a2 = z7o.a(obj5);
                    if (a2 != null) {
                    }
                    return Unit.a;
                }
                return obj12;
            case 12:
                nm6 nm6Var11 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    String[] strArr = (String[]) ((Collection) this.l).toArray(new String[0]);
                    com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u uVar = ((t) this.m).m;
                    this.k = 1;
                    A = uVar.A(strArr, this);
                    if (A == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    A = obj;
                }
                ((Function1) obj7).invoke((Map) A);
                return Unit.a;
            case 13:
                ArrayList arrayList4 = (ArrayList) obj7;
                t tVar2 = (t) this.m;
                nm6 nm6Var12 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.b bVar11 = tVar2.u;
                    com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.b;
                    if (bVar11.b(aVar5)) {
                        bVar11.c(aVar5, "WebViewsControllerImpl", f1d.h("routeToStoriesList(storyEntries=", ", validateWhitelist=true", arrayList4));
                    }
                    com.yandex.plus.home.payment.google.d dVar5 = tVar2.l;
                    this.k = 1;
                    a3 = dVar5.c.a(new com.yandex.plus.home.payment.google.a(dVar5, null, 0), this);
                    break;
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            if (i16 == 3) {
                                qgg.h0(obj);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        aVar = (com.yandex.plus.home.feature.webviews.internalapi.payment.a) this.l;
                        qgg.h0(obj);
                        g0 = obj;
                        com.yandex.plus.home.feature.webviews.internalapi.payment.a aVar6 = aVar;
                        zne zneVar = (zne) g0;
                        com.yandex.plus.home.feature.webviews.internal.container.i iVar2 = new com.yandex.plus.home.feature.webviews.internal.container.i(tVar2.n, tVar2.o, null, null, null);
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj14 : arrayList4) {
                            com.yandex.plus.home.feature.webviews.internal.uri.g gVar = ((com.yandex.plus.home.feature.webviews.internal.stories.list.j) obj14).a;
                            arrayList5.add(obj14);
                        }
                        if (!arrayList5.isEmpty()) {
                            t tVar3 = (t) this.m;
                            this.l = null;
                            this.k = 3;
                            break;
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    a3 = obj;
                }
                aVar = (com.yandex.plus.home.feature.webviews.internalapi.payment.a) a3;
                bca bcaVar = new bca(tVar2.J, 18);
                this.l = aVar;
                this.k = 2;
                g0 = zsd.g0(bcaVar, this);
                break;
            case 14:
                com.yandex.plus.home.graphql.user.e eVar3 = (com.yandex.plus.home.graphql.user.e) obj7;
                nm6 nm6Var13 = nm6.a;
                int i17 = this.k;
                try {
                    if (i17 == 0) {
                        qgg.h0(obj);
                        r7o r7oVar12 = z7o.b;
                        jwj jwjVar = jwj.f;
                        b1 b1Var = new b1(jwjVar, jwjVar);
                        dp0 dp0Var = eVar3.a;
                        this.m = null;
                        this.l = eVar3;
                        this.k = 1;
                        d2 = com.yandex.plus.bdui.flex.ui.a.d(dp0Var, b1Var, this);
                        if (d2 == nm6Var13) {
                            return nm6Var13;
                        }
                        eVar = eVar3;
                    } else {
                        if (i17 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        eVar = (com.yandex.plus.home.graphql.user.e) this.l;
                        qgg.h0(obj);
                        d2 = obj;
                    }
                    jtjVar = ((kp0) d2).c;
                } catch (wis e7) {
                    r7o r7oVar13 = z7o.b;
                    t7oVar4 = new t7o(e7);
                    obj6 = t7oVar4;
                    z7o z7oVar = new z7o(obj6);
                    dVar = eVar3.e;
                    aVar2 = com.yandex.plus.log.api.a.b;
                    if (dVar.b(aVar2)) {
                    }
                    return z7oVar;
                } catch (CancellationException e8) {
                    throw e8;
                } catch (Throwable th6) {
                    r7o r7oVar14 = z7o.b;
                    t7oVar4 = new t7o(th6);
                    obj6 = t7oVar4;
                    z7o z7oVar2 = new z7o(obj6);
                    dVar = eVar3.e;
                    aVar2 = com.yandex.plus.log.api.a.b;
                    if (dVar.b(aVar2)) {
                    }
                    return z7oVar2;
                }
                if (jtjVar == null) {
                    throw new IllegalArgumentException("invite to family response data is null");
                }
                eVar.g.getClass();
                obj6 = a1.c((z0) jtjVar);
                r7o r7oVar15 = z7o.b;
                z7o z7oVar22 = new z7o(obj6);
                dVar = eVar3.e;
                aVar2 = com.yandex.plus.log.api.a.b;
                if (dVar.b(aVar2)) {
                    dVar.a(aVar2, "GraphQLUserRepository", "forceInviteToFamily(email=null, phone=null): " + ((Object) z7o.b(obj6)), null);
                }
                return z7oVar22;
            case 15:
                Object obj15 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    y yVar2 = ((com.yandex.plus.home.plaque.feature.internal.presentation.h) this.l).b;
                    String str8 = ((com.yandex.plus.home.plaque.repository.api.model.a) ((com.yandex.plus.home.plaque.repository.api.model.c) this.m)).b;
                    String a7 = ((c0) obj7).a();
                    this.k = 1;
                    Object V2 = x97.V((kotlinx.coroutines.a) yVar2.b, new com.yandex.plus.home.plaque.feature.internal.domain.interactors.a(yVar2, str8, a7, null, 0), this);
                    Object obj16 = V2;
                    if (V2 != obj15) {
                        obj16 = Unit.a;
                    }
                    if (obj16 == obj15) {
                        return obj15;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                com.yandex.plus.home.plaque.feature.api.context.b bVar12 = (com.yandex.plus.home.plaque.feature.api.context.b) this.m;
                c0 c0Var = (c0) this.l;
                com.yandex.plus.home.plaque.feature.internal.presentation.h hVar3 = (com.yandex.plus.home.plaque.feature.internal.presentation.h) obj7;
                nm6 nm6Var14 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    if (c0Var instanceof b0) {
                        Map map = bVar12.c;
                        String str9 = ((b0) c0Var).a;
                        Boolean bool = (Boolean) map.get(str9);
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        x0q x0qVar = hVar3.j;
                        com.yandex.plus.home.plaque.feature.api.entity.b bVar13 = new com.yandex.plus.home.plaque.feature.api.entity.b(str9, booleanValue);
                        this.k = 1;
                        break;
                    } else if (c0Var instanceof a0) {
                        x0q x0qVar2 = hVar3.j;
                        a0 a0Var = (a0) c0Var;
                        com.yandex.plus.home.plaque.feature.api.entity.a aVar7 = new com.yandex.plus.home.plaque.feature.api.entity.a(a0Var.b, a0Var.c);
                        this.k = 2;
                        break;
                    } else if (c0Var instanceof com.yandex.plus.plaquesdk.plaque.api.models.y) {
                        com.yandex.plus.home.dailyquests.plugin.internal.proxy.d dVar6 = hVar3.f;
                        String str10 = ((com.yandex.plus.plaquesdk.plaque.api.models.y) c0Var).b;
                        str10.getClass();
                        com.yandex.plus.home.core.navigation.a aVar8 = dVar6.a;
                        aVar8.getClass();
                        aVar8.a(Uri.parse(str10));
                    } else if (!(c0Var instanceof z)) {
                        b6e.s();
                        return null;
                    }
                } else {
                    if (i19 != 1 && i19 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 17:
                nm6 nm6Var15 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.plaque.repository.graphql.g gVar2 = (com.yandex.plus.home.plaque.repository.graphql.g) this.l;
                    p pVar = (p) gVar2.j.invoke();
                    this.k = 1;
                    if (com.yandex.plus.home.plaque.repository.graphql.g.i(gVar2, (String) this.m, (String) obj7, pVar, this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                nm6 nm6Var16 = nm6.a;
                int i21 = this.k;
                if (i21 != 0) {
                    if (i21 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ((p) this.l).G();
                this.k = 1;
                Object d7 = com.yandex.plus.bdui.flex.ui.a.d(((com.yandex.plus.home.plaque.repository.graphql.g) this.m).a, (k2) obj7, this);
                return d7 == nm6Var16 ? nm6Var16 : d7;
            case 19:
                return k(obj);
            case 20:
                return l(obj);
            case 21:
                return n(obj);
            case 22:
                return o(obj);
            case 23:
                return p(obj);
            case 24:
                return q(obj);
            case 25:
                return s(obj);
            case 26:
                return t(obj);
            case 27:
                return u(obj);
            default:
                com.yandex.plus.webview.internal.f fVar3 = (com.yandex.plus.webview.internal.f) this.l;
                nm6 nm6Var17 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    d3 = fVar3.j.d((String) this.m, (Map) obj7, this);
                    if (d3 == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    d3 = obj;
                }
                com.yandex.plus.webview.api.request.a aVar9 = (com.yandex.plus.webview.api.request.a) d3;
                String str11 = aVar9.a;
                Map map2 = aVar9.b;
                Uri parse = Uri.parse(str11);
                parse.getClass();
                com.yandex.plus.webview.core.resource.a aVar10 = new com.yandex.plus.webview.core.resource.a(parse, map2, com.yandex.plus.webview.core.resource.d.c);
                boolean f = fVar3.k.f(aVar10);
                com.yandex.plus.webview.internal.security.c cVar2 = fVar3.m;
                if (f) {
                    cVar2.p(aVar10);
                    Iterator it5 = fVar3.s.iterator();
                    while (it5.hasNext()) {
                        ((com.yandex.plus.webview.api.contract.d) it5.next()).h();
                    }
                    super/*com.yandex.plus.webview.core.h*/.n(aVar9.a, map2);
                } else {
                    cVar2.o(aVar10);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(mxr mxrVar, tf6 tf6Var, Object obj, Continuation continuation) {
        super(2, continuation);
        this.j = 2;
        this.l = mxrVar;
        this.n = tf6Var;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t tVar, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.j = 13;
        this.m = tVar;
        this.n = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
    }
}
