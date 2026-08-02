package defpackage;

import android.content.Context;
import android.net.Uri;
import com.yandex.media.ynison.service.r;
import com.yandex.music.shared.wave.screen.wheel.data.dto.request.WheelFeedbackDto;
import com.yandex.passport.api.exception.t;
import com.yandex.passport.api.n;
import com.yandex.passport.api.z1;
import com.yandex.passport.common.logger.b;
import com.yandex.passport.common.logger.d;
import com.yandex.passport.data.network.f7;
import com.yandex.passport.data.network.j7;
import com.yandex.passport.data.network.k7;
import com.yandex.passport.data.network.p4;
import com.yandex.passport.data.network.u4;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.methods.performer.a0;
import com.yandex.passport.internal.methods.performer.v;
import com.yandex.passport.internal.methods.requester.a;
import com.yandex.passport.internal.methods.requester.f;
import com.yandex.passport.internal.methods.t3;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.p;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.push.h0;
import com.yandex.passport.internal.push.m;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.ha;
import com.yandex.passport.internal.report.reporters.w0;
import com.yandex.passport.internal.report.sa;
import com.yandex.passport.internal.report.ue;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.social.esia.l0;
import com.yandex.passport.internal.u;
import com.yandex.passport.internal.usecase.b1;
import com.yandex.passport.internal.usecase.c0;
import com.yandex.passport.internal.usecase.e0;
import com.yandex.passport.internal.usecase.s;
import com.yandex.plus.bdui.action.h;
import com.yandex.plus.bdui.plus.auth.e;
import com.yandex.plus.bdui.plus.content.controller.q;
import com.yandex.plus.core.analytics.j;
import com.yandex.plus.core.analytics.k;
import com.yandex.plus.core.network.call.c;
import com.yandex.plus.home.analytics.g;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.b6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.i1;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.yandex.music.YMApplication;
import ru.yandex.music.common.media.queue.YnisonRemoteDeviceNotAvailableException;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class ocu extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocu(int i, List list, u6k u6kVar, u6k u6kVar2, aqi aqiVar, Continuation continuation) {
        super(2, continuation);
        this.j = 8;
        this.k = i;
        this.l = list;
        this.n = u6kVar;
        this.o = u6kVar2;
        this.m = aqiVar;
    }

    private final Object k(Object obj) {
        t7o t7oVar;
        Object obj2;
        f9f[] f9fVarArr;
        f9f[] f9fVarArr2;
        Throwable a;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
            if (i == 0) {
                qgg.h0(obj);
                f fVar = (f) this.m;
                v5 v5Var = (v5) this.n;
                f9f[] f9fVarArr3 = (f9f[]) this.o;
                r7o r7oVar = z7o.b;
                a aVar = new a(fVar, v5Var);
                Unit unit = Unit.a;
                this.l = f9fVarArr3;
                this.k = 1;
                obj2 = aVar.r(unit, this);
                if (obj2 == nm6Var) {
                    return nm6Var;
                }
                f9fVarArr = f9fVarArr3;
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f9fVarArr = (f9f[]) ((Object[]) this.l);
                qgg.h0(obj);
                obj2 = ((z7o) obj).a;
            }
            f9fVarArr2 = (f9f[]) Arrays.copyOf(f9fVarArr, f9fVarArr.length);
            a = z7o.a(obj2);
        } catch (wis e) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(e);
            obj2 = t7oVar;
            return new z7o(obj2);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar3 = z7o.b;
            t7oVar = new t7o(th);
            obj2 = t7oVar;
            return new z7o(obj2);
        }
        if (a == null) {
            return new z7o(obj2);
        }
        for (f9f f9fVar : f9fVarArr2) {
            if (((lm4) f9fVar).i(a)) {
                throw a;
            }
        }
        d dVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(b.e, null, "catch non-PassportException from provider", a);
        }
        throw new t(a);
    }

    private final Object l(Object obj) {
        Object g;
        m mVar = (m) this.l;
        l lVar = (l) this.m;
        com.yandex.passport.common.core.f fVar = lVar.b;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            k7 k7Var = mVar.h;
            com.yandex.passport.internal.network.mappers.b bVar = mVar.l;
            com.yandex.passport.common.core.b bVar2 = fVar.a;
            bVar.getClass();
            f7 f7Var = new f7(lVar.h(), lVar.d, com.yandex.passport.internal.network.mappers.b.a(bVar2), (String) this.n);
            this.k = 1;
            g = k7Var.g(f7Var, this);
            if (g == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            g = obj;
        }
        Object obj2 = ((z7o) g).a;
        h0 h0Var = (h0) this.o;
        Throwable a = z7o.a(obj2);
        if (a == null) {
            j7 j7Var = (j7) obj2;
            w0 w0Var = mVar.c;
            String h = mVar.h();
            String str = h == null ? null : h;
            if (str == null) {
                str = "";
            }
            String a2 = ((com.yandex.passport.internal.common.d) mVar.f).a();
            String str2 = h0Var.g;
            String str3 = h0Var.p;
            String str4 = h0Var.a;
            w0Var.getClass();
            fVar.getClass();
            a2.getClass();
            w0Var.n(sa.d, new ff(fVar), new com.yandex.passport.internal.report.a(str, 22), new com.yandex.passport.internal.report.a(a2, 1), new ve(str2, 11), new ff(str3, 14), new ve(str4, 13));
            mVar.i(lVar, h0Var, j7Var.b);
        } else {
            w0 w0Var2 = mVar.c;
            String str5 = h0Var.g;
            String str6 = h0Var.p;
            String str7 = h0Var.a;
            w0Var2.getClass();
            w0Var2.n(ha.d, new ff(a), new ue(a), new ve(str5, 11), new ff(str6, 14), new ve(str7, 13));
            m.b(mVar, h0Var, lVar);
        }
        return Unit.a;
    }

    private final Object n(Object obj) {
        Object q;
        com.yandex.plus.bdui.plus.auth.f fVar = (com.yandex.plus.bdui.plus.auth.f) this.o;
        String str = (String) this.m;
        com.yandex.plus.bdui.plus.webview.b bVar = (com.yandex.plus.bdui.plus.webview.b) this.l;
        com.yandex.plus.log.api.b bVar2 = bVar.f;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar = bVar.c;
            this.k = 1;
            q = aVar.q(str, this);
            if (q == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            q = ((z7o) obj).a;
        }
        r7o r7oVar = z7o.b;
        boolean z = q instanceof t7o;
        if (!z) {
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
            if (bVar2.b(aVar2)) {
                bVar2.c(aVar2, "AuthorizeContract", "authorize(); inject auth cookie succeeded for puid=" + ((e) fVar).a);
            }
            com.yandex.plus.webview.core.d w = bVar.w();
            if (w != null) {
                if (bVar2.b(aVar2)) {
                    bVar2.c(aVar2, "AuthorizeContract", "authorize(); redirect to success url = " + str);
                }
                bVar.d.invoke(w, str);
            }
        } else if (z) {
            Throwable a = z7o.a(q);
            com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
            if (bVar2.b(aVar3)) {
                bVar2.a(aVar3, "AuthorizeContract", eta.g(new StringBuilder("AuthorizeContract: inject auth cookie failed for puid="), ((e) fVar).a, '!'), a);
            }
            bVar.x((String) this.n);
        }
        return Unit.a;
    }

    private final Object o(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            String str = (String) this.m;
            Map map = (Map) this.n;
            this.k = 1;
            Object obj2 = map != null ? map.get("sdk_version") : null;
            Object obj3 = map != null ? map.get("service") : null;
            Object obj4 = map != null ? map.get("page_url") : null;
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (!g.a.contains(str2)) {
                        try {
                            jSONObject.put(str2, value);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            jSONObject.put("version_supported", true);
            j jVar = new j(str, obj2 != null ? obj2.toString() : null, obj3 != null ? obj3.toString() : null, null, jSONObject.toString(), null, obj4 != null ? obj4.toString() : null, 472);
            if (jVar == nm6Var) {
                return nm6Var;
            }
            obj = jVar;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        ((k) this.o).a((j) obj);
        return Unit.a;
    }

    private final Object p(Object obj) {
        com.yandex.plus.core.network.context.a aVar = (com.yandex.plus.core.network.context.a) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
            if (i == 0) {
                qgg.h0(obj);
                ukn uknVar = (ukn) this.m;
                aVar.getClass();
                aVar.a(ern.a(ukn.class), uknVar);
                com.yandex.plus.core.network.interceptor.e eVar = (com.yandex.plus.core.network.interceptor.e) this.n;
                com.yandex.plus.core.network.request.b bVar = (com.yandex.plus.core.network.request.b) this.o;
                this.k = 1;
                obj = eVar.b(bVar, this);
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
            return (c) obj;
        } finally {
            aVar.getClass();
            aVar.a(ern.a(ukn.class), null);
        }
    }

    private final Object q(Object obj) {
        rjc rjcVar = (rjc) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            dkn dknVar = (dkn) this.m;
            l0 l0Var = new l0((String) this.n, (com.yandex.plus.bdui.plus.content.controller.f) this.o, rjcVar);
            this.l = null;
            this.k = 1;
            if (dknVar.a.collect(l0Var, this) == nm6Var) {
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

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                ocu ocuVar = new ocu((aqi) this.m, (fk0) this.n, (sbu) this.o, continuation, 0);
                ocuVar.l = obj;
                return ocuVar;
            case 1:
                return new ocu((pyt) this.m, (vtm) this.n, (List) this.o, continuation, 1);
            case 2:
                return new ocu((vuu) this.l, (hxu) this.m, (eu7) this.n, (a5q) this.o, continuation, 2);
            case 3:
                ocu ocuVar2 = new ocu((mu7) this.m, (hxu) this.n, (q4q) this.o, continuation, 3);
                ocuVar2.l = obj;
                return ocuVar2;
            case 4:
                return new ocu((c0v) this.l, (String) this.m, (List) this.n, (xpt) this.o, continuation, 4);
            case 5:
                return new ocu((spl) this.l, (fk0) this.n, (aqi) this.m, (aqi) this.o, continuation);
            case 6:
                return new ocu((tyi) this.l, (xqn) this.m, (xqn) this.n, (xqn) this.o, continuation, 6);
            case 7:
                ocu ocuVar3 = new ocu((giv) this.o, continuation);
                ocuVar3.l = obj;
                return ocuVar3;
            case 8:
                return new ocu(this.k, (List) this.l, (u6k) this.n, (u6k) this.o, (aqi) this.m, continuation);
            case 9:
                return new ocu((ucg) this.l, (t4w) this.m, (z3w) this.n, (Context) this.o, continuation, 9);
            case 10:
                return new ocu((afw) this.l, (String) this.m, (n1n) this.n, (mew) this.o, continuation, 10);
            case 11:
                return new ocu((akw) this.l, (r) this.m, (z4q) this.n, (wab) this.o, continuation, 11);
            case 12:
                return new ocu((akw) this.l, (r) this.m, (Map) this.n, (List) this.o, continuation, 12);
            case 13:
                ocu ocuVar4 = new ocu((bd5) this.m, (akw) this.n, (iow) this.o, continuation, 13);
                ocuVar4.l = obj;
                return ocuVar4;
            case 14:
                ocu ocuVar5 = new ocu((String) this.m, (wab) this.n, (akw) this.o, continuation, 14);
                ocuVar5.l = obj;
                return ocuVar5;
            case 15:
                return new ocu((aqw) this.l, (StationId) this.m, (e4d) this.n, (String) this.o, continuation, 15);
            case 16:
                ocu ocuVar6 = new ocu((PassportProcessGlobalComponent) this.m, (x) this.n, (YMApplication) this.o, continuation, 16);
                ocuVar6.l = obj;
                return ocuVar6;
            case 17:
                return new ocu((com.yandex.passport.internal.account.d) this.l, (com.yandex.passport.common.core.b) this.m, (com.yandex.passport.common.account.a) this.n, (com.yandex.passport.internal.analytics.a) this.o, continuation, 17);
            case 18:
                return new ocu((com.yandex.passport.internal.helper.j) this.l, (com.yandex.passport.internal.network.client.j) this.m, (com.yandex.passport.common.core.f) this.n, (String) this.o, continuation, 18);
            case 19:
                return new ocu((v) this.n, (t3) this.o, continuation);
            case 20:
                return new ocu((com.yandex.passport.internal.credentials.e) this.l, (a0) this.m, (com.yandex.passport.common.core.b) this.n, (l) this.o, continuation, 20);
            case 21:
                return new ocu((f) this.m, (v5) this.n, (f9f[]) this.o, continuation, 21);
            case 22:
                return new ocu((m) this.l, (l) this.m, (String) this.n, (h0) this.o, continuation, 22);
            case 23:
                return new ocu((com.yandex.passport.internal.ui.router.x) this.m, (Context) this.n, (com.yandex.passport.internal.properties.l) this.o, continuation, 23);
            case 24:
                return new ocu((q) this.l, (h) this.m, (com.yandex.plus.bdui.content.d) this.n, (com.yandex.plus.bdui.flex.ui.t) this.o, continuation, 24);
            case 25:
                return new ocu((com.yandex.plus.bdui.plus.webview.b) this.l, (String) this.m, (String) this.n, (com.yandex.plus.bdui.plus.auth.f) this.o, continuation, 25);
            case 26:
                return new ocu((g) this.l, (String) this.m, (Map) this.n, (k) this.o, continuation, 26);
            case 27:
                return new ocu((com.yandex.plus.core.network.context.a) this.l, (ukn) this.m, (com.yandex.plus.core.network.interceptor.e) this.n, (com.yandex.plus.core.network.request.b) this.o, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ocu ocuVar7 = new ocu((dkn) this.m, (String) this.n, (com.yandex.plus.bdui.plus.content.controller.f) this.o, continuation, 28);
                ocuVar7.l = obj;
                return ocuVar7;
            default:
                ocu ocuVar8 = new ocu((com.yandex.plus.home.feature.webviews.internal.treasury.e) this.m, (b6) this.n, (com.yandex.plus.home.feature.webviews.internal.home.d) this.o, continuation, 29);
                ocuVar8.l = obj;
                return ocuVar8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((ocu) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((ocu) create((qxu) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((ocu) create((oi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((ocu) create((b9n) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((ocu) create((b9n) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((ocu) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((ocu) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x028f, code lost:
    
        if (r0 == r2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01c5, code lost:
    
        if (r6 == r2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x062e, code lost:
    
        if (r3 == r2) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0720, code lost:
    
        if (r2 == r3) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0792, code lost:
    
        if (r6.b(r2, r25) == r3) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x07e3, code lost:
    
        if (kotlin.Unit.a == r3) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0714, code lost:
    
        if (r2 != r3) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0886, code lost:
    
        if (defpackage.fk0.c(r0, r1, r2, null, r25, 12) == r6) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x086d, code lost:
    
        if (r0.f(r1, r25) == r6) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0952, code lost:
    
        if (defpackage.y2x.o(r2, r25) == r0) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e8, code lost:
    
        if (r2.emit(r1, r25) == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0a23, code lost:
    
        if (r0 == r3) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0a43, code lost:
    
        if (r0 == r3) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0a65, code lost:
    
        if (r0 == r3) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0a8b, code lost:
    
        if (r0 == r3) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dd, code lost:
    
        if (r1 == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0ab1, code lost:
    
        if (r0 == r3) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0ad3, code lost:
    
        if (r0 == r3) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0af6, code lost:
    
        if (r0 == r3) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0bc0, code lost:
    
        if (defpackage.fk0.c(r0, r1, null, null, r25, 14) == r6) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0beb, code lost:
    
        if (defpackage.fk0.c(r0, r1, null, null, r25, 14) == r6) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0c09, code lost:
    
        if (defpackage.fk0.c(r0, r1, null, null, r25, 14) == r6) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0c32, code lost:
    
        if (defpackage.fk0.c(r0, r1, null, null, r25, 14) == r6) goto L494;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:326:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:482:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v113, types: [n1n] */
    /* JADX WARN: Type inference failed for: r0v142, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r5v67, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:274:0x0792 -> B:264:0x0714). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:285:0x0772 -> B:264:0x0714). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object e0;
        Object e02;
        Object e03;
        Object e04;
        Object e05;
        Object V;
        Object V2;
        fuu fuuVar;
        Object n;
        si3 si3Var;
        Object obj2;
        Object a;
        Object M;
        Object g;
        ArrayList q;
        com.yandex.passport.internal.d a2;
        Object c;
        Object a3;
        n nVar;
        com.yandex.passport.internal.credentials.f fVar;
        x0q x0qVar;
        Object a4;
        Object c2;
        int i = this.j;
        int i2 = 27;
        int i3 = 0;
        int i4 = 7;
        int i5 = 3;
        int i6 = 1;
        Object obj3 = this.o;
        ?? r15 = 0;
        ?? r152 = 0;
        ?? r153 = 0;
        ?? r154 = 0;
        ?? r155 = 0;
        ?? r156 = 0;
        ?? r157 = 0;
        ?? r158 = 0;
        ?? r159 = 0;
        ?? r1510 = 0;
        switch (i) {
            case 0:
                sbu sbuVar = (sbu) obj3;
                aqi aqiVar = (aqi) this.m;
                Pair pair = (Pair) this.l;
                nm6 nm6Var = nm6.a;
                int i7 = this.k;
                if (i7 != 0) {
                    if (i7 == 1 || i7 == 2 || i7 == 3) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i7 != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    paw pawVar = sbuVar.e;
                    if (pawVar != null) {
                        pawVar.b();
                    }
                    return Unit.a;
                }
                qgg.h0(obj);
                pbu pbuVar = (pbu) pair.a;
                boolean booleanValue = ((Boolean) pair.b).booleanValue();
                if (!Intrinsics.d(pbuVar, lbu.a) && !(pbuVar instanceof mbu)) {
                    if (!Intrinsics.d(pbuVar, nbu.a)) {
                        if (!(pbuVar instanceof obu)) {
                            b6e.s();
                            return null;
                        }
                        if (booleanValue) {
                            aqiVar.setValue(kcu.b);
                            paw pawVar2 = sbuVar.e;
                            if (pawVar2 != null) {
                                pawVar2.d();
                            }
                            fk0 fk0Var = (fk0) this.n;
                            Float f = new Float(1.0f);
                            this.l = null;
                            this.k = 3;
                            break;
                        } else {
                            aqiVar.setValue(kcu.a);
                            fk0 fk0Var2 = (fk0) this.n;
                            Float f2 = new Float(0.0f);
                            this.l = null;
                            this.k = 4;
                            break;
                        }
                        return nm6Var;
                    }
                    aqiVar.setValue(kcu.c);
                    fk0 fk0Var3 = (fk0) this.n;
                    Float f3 = new Float(0.0f);
                    this.l = null;
                    this.k = 2;
                    break;
                } else {
                    aqiVar.setValue(kcu.a);
                    fk0 fk0Var4 = (fk0) this.n;
                    Float f4 = new Float(0.0f);
                    this.l = null;
                    this.k = 1;
                    break;
                }
                break;
            case 1:
                pyt pytVar = (pyt) this.m;
                vtm vtmVar = (vtm) this.n;
                guu guuVar = (guu) vtmVar.a;
                nm6 nm6Var2 = nm6.a;
                int i8 = this.k;
                ryt rytVar = ryt.a;
                switch (i8) {
                    case 0:
                        qgg.h0(obj);
                        if (pytVar instanceof myt) {
                            myt mytVar = (myt) pytVar;
                            fuuVar = new fuu(new j3q(mytVar.a, mytVar.b, i3q.a), mytVar.c);
                        } else {
                            if (!(pytVar instanceof nyt)) {
                                int i9 = 28;
                                if (!(pytVar instanceof jyt)) {
                                    if (!(pytVar instanceof kyt)) {
                                        if (!Intrinsics.d(pytVar, iyt.a)) {
                                            if (!Intrinsics.d(pytVar, lyt.a)) {
                                                if (!Intrinsics.d(pytVar, hyt.a)) {
                                                    if (!Intrinsics.d(pytVar, oyt.a)) {
                                                        if (!Intrinsics.d(pytVar, gyt.a)) {
                                                            b6e.s();
                                                            return null;
                                                        }
                                                        this.l = vtmVar;
                                                        this.k = 7;
                                                        e0 = guuVar.a.e0(true, new d6h(29), this);
                                                        break;
                                                    } else {
                                                        this.l = vtmVar;
                                                        this.k = 6;
                                                        e02 = guuVar.a.e0(true, new d6h(i9), this);
                                                        break;
                                                    }
                                                } else {
                                                    this.l = vtmVar;
                                                    this.k = 5;
                                                    e03 = guuVar.a.e0(true, new d6h(26), this);
                                                    break;
                                                }
                                            } else {
                                                this.l = vtmVar;
                                                this.k = 4;
                                                e04 = guuVar.a.e0(false, new d6h(i2), this);
                                                break;
                                            }
                                        } else {
                                            this.l = vtmVar;
                                            this.k = 3;
                                            e05 = guuVar.a.e0(true, new d6h(25), this);
                                            break;
                                        }
                                    } else {
                                        zc5 zc5Var = ((kyt) pytVar).a;
                                        this.k = 2;
                                        V = x97.V(dm6.b, new ckg(guuVar.a, zc5Var, (Continuation) (r15 == true ? 1 : 0), i2), this);
                                        break;
                                    }
                                } else {
                                    yc5 yc5Var = ((jyt) pytVar).a;
                                    this.k = 1;
                                    V2 = x97.V(dm6.b, new seg(yc5Var, guuVar.a, (Continuation) (r152 == true ? 1 : 0), i9), this);
                                    break;
                                }
                                return nm6Var2;
                            }
                            nyt nytVar = (nyt) pytVar;
                            fuuVar = new fuu(new p3q(nytVar.a, o3q.b, nytVar.b), nytVar.c);
                        }
                        if (fuuVar != null) {
                            return null;
                        }
                        HashSet hashSet = new HashSet();
                        Iterator it = ((List) obj3).iterator();
                        while (it.hasNext()) {
                            hashSet.add(((jzs) it.next()).a.d());
                        }
                        List list = fuuVar.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            if (!hashSet.contains(((mqs) obj4).d())) {
                                arrayList.add(obj4);
                            }
                        }
                        return new fuu(fuuVar.a, arrayList);
                    case 1:
                        qgg.h0(obj);
                        V2 = obj;
                        fuuVar = (fuu) V2;
                        if (fuuVar != null) {
                        }
                        break;
                    case 2:
                        qgg.h0(obj);
                        V = obj;
                        fuuVar = (fuu) V;
                        if (fuuVar != null) {
                        }
                        break;
                    case 3:
                        vtmVar = (vtm) this.l;
                        qgg.h0(obj);
                        e05 = obj;
                        fuuVar = vtm.r(vtmVar, (List) e05, syt.a);
                        if (fuuVar != null) {
                        }
                        break;
                    case 4:
                        vtmVar = (vtm) this.l;
                        qgg.h0(obj);
                        e04 = obj;
                        fuuVar = vtm.r(vtmVar, (List) e04, cyt.a);
                        if (fuuVar != null) {
                        }
                        break;
                    case 5:
                        vtmVar = (vtm) this.l;
                        qgg.h0(obj);
                        e03 = obj;
                        fuuVar = vtm.r(vtmVar, (List) e03, rytVar);
                        if (fuuVar != null) {
                        }
                        break;
                    case 6:
                        vtmVar = (vtm) this.l;
                        qgg.h0(obj);
                        e02 = obj;
                        fuuVar = vtm.r(vtmVar, (List) e02, rytVar);
                        if (fuuVar != null) {
                        }
                        break;
                    case 7:
                        vtmVar = (vtm) this.l;
                        qgg.h0(obj);
                        e0 = obj;
                        fuuVar = vtm.r(vtmVar, (List) e0, rytVar);
                        if (fuuVar != null) {
                        }
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    ssg.a(3, "WaveProlongationOperation", "Offline session creation is scheduled", null);
                    long j = ((vuu) this.l).f;
                    this.k = 1;
                    break;
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ssg.a(3, "WaveProlongationOperation", "Offline session creation is launched", null);
                this.k = 2;
                Object e = hxu.e((hxu) this.m, (eu7) this.n, (a5q) obj3, this);
                if (e != nm6Var3) {
                    return e;
                }
                return nm6Var3;
            case 3:
                q4q q4qVar = (q4q) obj3;
                hxu hxuVar = (hxu) this.n;
                qxu qxuVar = (qxu) this.l;
                nm6 nm6Var4 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    mu7 mu7Var = (mu7) this.m;
                    if (mu7Var != null) {
                        mu7Var.g(null);
                    }
                    if (!hxu.b(hxuVar, q4qVar) || !(qxuVar instanceof mxu)) {
                        ssg.a(3, "WaveProlongationOperation", "Online prolongation is completed", null);
                        return qxuVar;
                    }
                    ssg.a(3, "WaveProlongationOperation", "Online prolongation is failed, fallback to offline prolongation", null);
                    this.l = null;
                    this.k = 1;
                    n = hxuVar.n(q4qVar, false, this);
                    if (n == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    n = obj;
                }
                return (qxu) n;
            case 4:
                c0v c0vVar = (c0v) this.l;
                nm6 nm6Var5 = nm6.a;
                int i12 = this.k;
                if (i12 != 0) {
                    if (i12 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                m4l m4lVar = (m4l) c0vVar.e.getValue();
                a6l a5 = c0vVar.d.a((String) this.m);
                this.k = 1;
                Object b = m4l.b(m4lVar, (List) this.n, a5, (xpt) obj3, this, 48);
                return b == nm6Var5 ? nm6Var5 : b;
            case 5:
                aqi aqiVar2 = (aqi) obj3;
                spl splVar = (spl) this.l;
                aqi aqiVar3 = (aqi) this.m;
                nm6 nm6Var6 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    float f5 = r2v.a;
                    if (!Intrinsics.d(splVar, (spl) aqiVar3.getValue())) {
                        aqiVar2.setValue((spl) aqiVar3.getValue());
                        aqiVar3.setValue(splVar);
                        fk0 fk0Var5 = (fk0) this.n;
                        Float f6 = new Float(0.0f);
                        this.k = 1;
                        break;
                    }
                    return Unit.a;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    float f7 = r2v.a;
                    aqiVar2.setValue(null);
                    return Unit.a;
                }
                qgg.h0(obj);
                fk0 fk0Var6 = (fk0) this.n;
                Float f8 = new Float(1.0f);
                act S = weo.S(0, 0, null, 7);
                this.k = 2;
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    long j2 = ((tyi) this.l).a;
                    this.k = 1;
                    if (y2x.o(j2, this) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                tyi.e((xqn) this.m, (xqn) this.n, (xqn) obj3);
                return Unit.a;
            case 7:
                giv givVar = (giv) obj3;
                jyr jyrVar = givVar.d;
                ArrayList arrayList2 = givVar.e;
                oi oiVar = (oi) this.l;
                nm6 nm6Var8 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    oiVar.getClass();
                    zi3 zi3Var = oiVar.d;
                    zi3Var.getClass();
                    si3Var = new si3(zi3Var);
                } else if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 == 3) {
                            div divVar = (div) this.n;
                            si3Var = (si3) this.m;
                            qgg.h0(obj);
                            divVar.a.U((List) obj);
                        } else if (i15 != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    si3 si3Var2 = (si3) this.m;
                    qgg.h0(obj);
                    si3Var = si3Var2;
                } else {
                    si3 si3Var3 = (si3) this.m;
                    qgg.h0(obj);
                    si3Var = si3Var3;
                    obj2 = obj;
                    if (!((Boolean) obj2).booleanValue()) {
                        eiv eivVar = (eiv) si3Var.d();
                        if (!(eivVar instanceof biv)) {
                            if (eivVar instanceof div) {
                                x0f x0fVar = (x0f) jyrVar.getValue();
                                this.l = null;
                                this.m = si3Var;
                                this.n = (div) eivVar;
                                this.k = 3;
                                Object a6 = x0fVar.a(this);
                                if (a6 != nm6Var8) {
                                    ((div) eivVar).a.U((List) a6);
                                }
                                return nm6Var8;
                            }
                            if (!Intrinsics.d(eivVar, civ.a)) {
                                b6e.s();
                                return null;
                            }
                            arrayList2.clear();
                            x0f x0fVar2 = (x0f) jyrVar.getValue();
                            this.l = null;
                            this.m = si3Var;
                            this.n = null;
                            this.k = 4;
                            Object invoke = x0fVar2.d.invoke(this);
                            if (invoke != nm6.a) {
                                break;
                            }
                        } else {
                            if (arrayList2 == null || !arrayList2.isEmpty()) {
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    yhv yhvVar = (yhv) it2.next();
                                    yhv yhvVar2 = ((biv) eivVar).a;
                                    if (!Intrinsics.d(yhvVar.a, yhvVar2.a) || yhvVar.c != yhvVar2.c || yhvVar.d != yhvVar2.d || !yhvVar.b.equals(yhvVar2.b)) {
                                    }
                                }
                            }
                            yhv yhvVar3 = ((biv) eivVar).a;
                            arrayList2.add(yhvVar3);
                            x0f x0fVar3 = (x0f) jyrVar.getValue();
                            WheelFeedbackDto Q = a4g.Q(yhvVar3);
                            this.l = null;
                            this.m = si3Var;
                            this.n = null;
                            this.k = 2;
                            break;
                        }
                        if (!((Boolean) obj2).booleanValue()) {
                            return Unit.a;
                        }
                    }
                }
                this.l = null;
                this.m = si3Var;
                this.n = null;
                this.k = 1;
                obj2 = si3Var.c(this);
                break;
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                int i16 = this.k;
                u6k u6kVar = (u6k) this.n;
                float f9 = qzv.a;
                if (i16 == u6kVar.h()) {
                    ((aqi) this.m).setValue(((ctv) ((List) this.l).get(((u6k) obj3).h())).a());
                }
                return Unit.a;
            case 9:
                String str = ((t4w) this.m).c;
                ucg ucgVar = (ucg) this.l;
                nm6 nm6Var10 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    ys3 a7 = ucgVar.a();
                    this.k = 1;
                    a = o5w.a(a7, ucgVar, this);
                    break;
                } else {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                hrc hrcVar = (hrc) a;
                if (hrcVar == null) {
                    xq0.q(hrg.q("Worker was marked important (", str, ") but did not provide ForegroundInfo"));
                    return null;
                }
                String str2 = y3w.a;
                jsg.j().e(str2, "Updating notification for " + str);
                z3w z3wVar = (z3w) this.n;
                UUID uuid = ucgVar.b.a;
                qhp qhpVar = z3wVar.a.a;
                h0l h0lVar = new h0l(z3wVar, uuid, hrcVar, (Context) obj3, 6);
                qhpVar.getClass();
                ys3 z = wct.z(new u13(i4, qhpVar, "setForegroundAsync", h0lVar));
                this.k = 2;
                Object r = pcg.r(z, this);
                if (r != nm6Var10) {
                    return r;
                }
                return nm6Var10;
            case 10:
                ?? r0 = (n1n) this.n;
                String str3 = (String) this.m;
                afw afwVar = (afw) this.l;
                nm6 nm6Var11 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    String str4 = afw.l;
                    msa msaVar = nsa.b;
                    M = tyf.M(yd5.M(5, ssa.SECONDS), new y6v(afwVar, str3, (Continuation) (r153 == true ? 1 : 0), i2), this);
                    if (M == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    M = obj;
                }
                if (((Pair) M) == null) {
                    str3.getClass();
                    YnisonRemoteDeviceNotAvailableException ynisonRemoteDeviceNotAvailableException = new YnisonRemoteDeviceNotAvailableException("We have sent request active " + str3 + ", but response with such device active was not delivered in 5 seconds", null);
                    nmb nmbVar = w64.a;
                    w64.b(ulb.Logic, w64.a("YnisonRemoteDeviceNotAvailableException", ynisonRemoteDeviceNotAvailableException.getMessage()));
                    r0.invoke(ynisonRemoteDeviceNotAvailableException);
                } else {
                    ((z5l) afwVar.f.getValue()).d(((mew) obj3).b, true, uyk.a).m(new yew(r0), new yew(r0));
                }
                return Unit.a;
            case 11:
                nm6 nm6Var12 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object b2 = akw.b((akw) this.l, (r) this.m, (z4q) this.n, (wab) obj3, false, this);
                    return b2 == nm6Var12 ? nm6Var12 : b2;
                }
                if (i19 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                nm6 nm6Var13 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object a8 = akw.a((akw) this.l, (r) this.m, (Map) this.n, (List) obj3, this);
                    return a8 == nm6Var13 ? nm6Var13 : a8;
                }
                if (i20 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                bd5 bd5Var = (bd5) this.m;
                b9n b9nVar = (b9n) this.l;
                nm6 nm6Var14 = nm6.a;
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
                String s = bd5Var.s();
                String a9 = bd5Var.a();
                String E = pcg.E(bd5Var);
                this.l = null;
                this.k = 1;
                b9nVar.getClass();
                Object V3 = x97.V(dm6.c, new x4a(b9nVar, s, a9, !rgw.a(), (iow) obj3, E, null), this);
                return V3 == nm6Var14 ? nm6Var14 : V3;
            case 14:
                b9n b9nVar2 = (b9n) this.l;
                nm6 nm6Var15 = nm6.a;
                int i22 = this.k;
                if (i22 != 0) {
                    if (i22 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                String str5 = (String) this.m;
                wab wabVar = (wab) this.n;
                o4q o4qVar = wabVar.c;
                gxc gxcVar = wabVar.e;
                rgw rgwVar = ((akw) obj3).b;
                boolean a10 = rgw.a();
                this.l = null;
                this.k = 1;
                b9nVar2.getClass();
                Object V4 = x97.V(dm6.c, new a9n(a10, str5, b9nVar2, gxcVar, o4qVar, null), this);
                return V4 == nm6Var15 ? nm6Var15 : V4;
            case 15:
                nm6 nm6Var16 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((hiw) ((aqw) this.l).j.getValue()).b((StationId) this.m, (e4d) this.n, (String) obj3, this) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                PassportProcessGlobalComponent passportProcessGlobalComponent = (PassportProcessGlobalComponent) this.m;
                mm6 mm6Var = (mm6) this.l;
                nm6 nm6Var17 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    long intValue = ((Number) passportProcessGlobalComponent.getFlagRepository().b(com.yandex.passport.internal.flags.o.y0)).intValue();
                    this.l = mm6Var;
                    this.k = 1;
                    if (y2x.o(intValue, this) == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                List list2 = com.yandex.passport.internal.v.a;
                x97.y(mm6Var, null, null, new p(passportProcessGlobalComponent, r1510 == true ? 1 : 0, i4), 3);
                x97.y(mm6Var, null, null, new rhw(passportProcessGlobalComponent, (x) this.n, (Continuation) (r159 == true ? 1 : 0), 17), 3);
                dq7 dq7Var = ca8.a;
                x97.y(mm6Var, dq7Var, null, new u((YMApplication) obj3, passportProcessGlobalComponent, null), 2);
                x97.y(mm6Var, dq7Var, null, new com.yandex.passport.internal.o(passportProcessGlobalComponent, r158 == true ? 1 : 0, i3), 2);
                x97.y(mm6Var, null, null, new p(passportProcessGlobalComponent, r157 == true ? 1 : 0, i5), 3);
                if (((Boolean) passportProcessGlobalComponent.getFlagRepository().b(com.yandex.passport.internal.flags.o.b)).booleanValue()) {
                    x97.y(mm6Var, null, null, new p(passportProcessGlobalComponent, r156 == true ? 1 : 0, 5), 3);
                }
                x97.y(mm6Var, null, null, new com.yandex.passport.internal.o(passportProcessGlobalComponent, r155 == true ? 1 : 0, i6), 3);
                x97.y(mm6Var, null, null, new p(passportProcessGlobalComponent, r154 == true ? 1 : 0, 4), 3);
                return Unit.a;
            case 17:
                nm6 nm6Var18 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.usecase.u uVar = ((com.yandex.passport.internal.account.d) this.l).h;
                    s sVar = new s((com.yandex.passport.common.core.b) this.m, 0L, (com.yandex.passport.common.account.a) this.n, null, (com.yandex.passport.internal.analytics.a) obj3);
                    this.k = 1;
                    g = uVar.g(sVar, this);
                    if (g == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g = obj;
                }
                Object obj5 = ((z7o) g).a;
                qgg.h0(obj5);
                return obj5;
            case 18:
                nm6 nm6Var19 = nm6.a;
                int i26 = this.k;
                if (i26 != 0) {
                    if (i26 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                e0 e0Var = ((com.yandex.passport.internal.helper.j) this.l).h;
                com.yandex.passport.internal.network.client.j jVar = (com.yandex.passport.internal.network.client.j) this.m;
                String builder = Uri.parse(jVar.a()).buildUpon().appendEncodedPath("profile").appendQueryParameter("lite", "1").appendQueryParameter("sourceapp", ((com.yandex.passport.internal.common.d) jVar.f).a()).toString();
                builder.getClass();
                c0 c0Var = new c0((com.yandex.passport.common.core.f) this.n, (Locale) null, builder, (String) obj3, (Map) null, (com.yandex.passport.common.core.c) null, 112);
                this.k = 1;
                Object g2 = e0Var.g(c0Var, this);
                return g2 == nm6Var19 ? nm6Var19 : g2;
            case 19:
                com.yandex.passport.internal.methods.q qVar = ((t3) obj3).c;
                v vVar = (v) this.n;
                nm6 nm6Var20 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    q = su4.q(obj);
                    a2 = vVar.a.a();
                    com.yandex.passport.internal.filter.l lVar = vVar.b;
                    ArrayList g3 = a2.g();
                    com.yandex.passport.internal.entities.k kVar = (com.yandex.passport.internal.entities.k) qVar.c;
                    this.l = q;
                    this.m = a2;
                    this.k = 1;
                    c = lVar.c(g3, kVar, this);
                    break;
                } else {
                    if (i27 != 1) {
                        if (i27 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list3 = (List) this.l;
                        qgg.h0(obj);
                        q = list3;
                        a3 = obj;
                        ArrayList arrayList3 = q;
                        for (com.yandex.passport.internal.entities.n nVar2 : (Iterable) a3) {
                            z1 J = com.yandex.plus.pay.ui.core.b.J(nVar2.a);
                            z1 J2 = com.yandex.plus.pay.ui.core.b.J(nVar2.b);
                            switch (nVar2.c.ordinal()) {
                                case 0:
                                    nVar = n.PORTAL;
                                    break;
                                case 1:
                                    nVar = n.LITE;
                                    break;
                                case 2:
                                    nVar = n.SOCIAL;
                                    break;
                                case 3:
                                    nVar = n.SOCIAL;
                                    break;
                                case 4:
                                    nVar = n.PHONISH;
                                    break;
                                case 5:
                                    nVar = n.MAILISH;
                                    break;
                                case 6:
                                    nVar = n.MUSIC_PHONISH;
                                    break;
                                case 7:
                                    nVar = n.CHILDISH;
                                    break;
                                case 8:
                                    nVar = n.UNDEFINED;
                                    break;
                                default:
                                    b6e.s();
                                    return null;
                            }
                            arrayList3.add(new com.yandex.passport.internal.account.g(J, J2, nVar, nVar2.d, nVar2.e, nVar2.f, nVar2.g));
                        }
                        return q;
                    }
                    com.yandex.passport.internal.d dVar = (com.yandex.passport.internal.d) this.m;
                    List list4 = (List) this.l;
                    qgg.h0(obj);
                    a2 = dVar;
                    q = list4;
                    c = obj;
                }
                ArrayList arrayList4 = q;
                for (l lVar2 : (Iterable) c) {
                    z1 J3 = com.yandex.plus.pay.ui.core.b.J(lVar2.b);
                    com.yandex.passport.common.core.f fVar2 = lVar2.c;
                    z1 J4 = fVar2 != null ? com.yandex.plus.pay.ui.core.b.J(fVar2) : null;
                    n f10 = lVar2.f();
                    com.yandex.passport.common.core.g gVar = lVar2.e;
                    String str6 = gVar.v;
                    String str7 = gVar.f;
                    String str8 = gVar.L;
                    String g4 = lVar2.g();
                    arrayList4.add(new com.yandex.passport.internal.account.g(J3, J4, f10, str6, str7, str8, g4 == null ? null : g4));
                }
                if (((Boolean) vVar.d.b(com.yandex.passport.internal.flags.o.q0)).booleanValue()) {
                    b1 b1Var = vVar.c;
                    com.yandex.passport.internal.entities.k kVar2 = (com.yandex.passport.internal.entities.k) qVar.c;
                    ArrayList arrayList5 = q;
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it3 = arrayList5.iterator();
                    while (it3.hasNext()) {
                        z1 z1Var = ((com.yandex.passport.internal.account.g) it3.next()).b;
                        com.yandex.passport.common.core.f L = z1Var != null ? com.yandex.plus.pay.ui.core.b.L(z1Var) : null;
                        if (L != null) {
                            arrayList6.add(L);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList(v75.o(arrayList5, 10));
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        arrayList7.add(com.yandex.plus.pay.ui.core.b.L(((com.yandex.passport.internal.account.g) it4.next()).a));
                    }
                    com.yandex.passport.internal.core.accounts.h hVar = new com.yandex.passport.internal.core.accounts.h(kVar2, arrayList6, arrayList7, a2);
                    this.l = q;
                    this.m = null;
                    this.k = 2;
                    a3 = b1Var.a(hVar);
                    break;
                }
                return q;
            case 20:
                l lVar3 = (l) obj3;
                com.yandex.passport.common.core.b bVar = (com.yandex.passport.common.core.b) this.n;
                a0 a0Var = (a0) this.m;
                com.yandex.passport.internal.credentials.e eVar = (com.yandex.passport.internal.credentials.e) this.l;
                nm6 nm6Var21 = nm6.a;
                int i28 = this.k;
                if (i28 != 0) {
                    if (i28 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                if (Intrinsics.d(eVar, com.yandex.passport.internal.credentials.a.a)) {
                    fVar = a0Var.d.b(bVar);
                } else if (Intrinsics.d(eVar, com.yandex.passport.internal.credentials.c.a)) {
                    fVar = null;
                } else {
                    if (!(eVar instanceof com.yandex.passport.internal.credentials.d)) {
                        b6e.s();
                        return null;
                    }
                    fVar = ((com.yandex.passport.internal.credentials.d) eVar).a;
                }
                u4 u4Var = a0Var.c;
                a0Var.e.getClass();
                p4 p4Var = new p4(lVar3.h(), lVar3.d, com.yandex.passport.internal.network.mappers.b.a(bVar), fVar != null ? fVar.c : null, fVar != null ? fVar.d : null);
                this.k = 1;
                Object g5 = u4Var.g(p4Var, this);
                return g5 == nm6Var21 ? nm6Var21 : g5;
            case 21:
                return k(obj);
            case 22:
                return l(obj);
            case 23:
                nm6 nm6Var22 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.ui.router.x xVar = (com.yandex.passport.internal.ui.router.x) this.m;
                    x0qVar = xVar.m;
                    this.l = x0qVar;
                    this.k = 1;
                    a4 = com.yandex.passport.internal.ui.router.x.a(xVar, (Context) this.n, (com.yandex.passport.internal.properties.l) obj3, this);
                    break;
                } else {
                    if (i29 != 1) {
                        if (i29 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x0q x0qVar2 = (x0q) this.l;
                    qgg.h0(obj);
                    x0qVar = x0qVar2;
                    a4 = obj;
                }
                this.l = null;
                this.k = 2;
                break;
            case 24:
                nm6 nm6Var23 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((q) this.l).d((h) this.m, (com.yandex.plus.bdui.content.d) this.n, (com.yandex.plus.bdui.flex.ui.t) obj3, this) == nm6Var23) {
                        return nm6Var23;
                    }
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 25:
                return n(obj);
            case 26:
                return o(obj);
            case 27:
                return p(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return q(obj);
            default:
                com.yandex.plus.home.feature.webviews.internal.home.d dVar2 = (com.yandex.plus.home.feature.webviews.internal.home.d) obj3;
                com.yandex.plus.home.feature.webviews.internal.treasury.e eVar2 = (com.yandex.plus.home.feature.webviews.internal.treasury.e) this.m;
                mm6 mm6Var2 = (mm6) this.l;
                nm6 nm6Var24 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    b6 b6Var = (b6) this.n;
                    this.l = mm6Var2;
                    this.k = 1;
                    c2 = eVar2.c(b6Var, this);
                    if (c2 == nm6Var24) {
                        return nm6Var24;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c2 = obj;
                }
                dVar2.A((i1) c2);
                eVar2.b(mm6Var2, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, dVar2, com.yandex.plus.home.feature.webviews.internal.home.d.class, "sendMessage", "sendMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 13));
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocu(spl splVar, fk0 fk0Var, aqi aqiVar, aqi aqiVar2, Continuation continuation) {
        super(2, continuation);
        this.j = 5;
        this.l = splVar;
        this.n = fk0Var;
        this.m = aqiVar;
        this.o = aqiVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocu(giv givVar, Continuation continuation) {
        super(2, continuation);
        this.j = 7;
        this.o = givVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocu(v vVar, t3 t3Var, Continuation continuation) {
        super(2, continuation);
        this.j = 19;
        this.n = vVar;
        this.o = t3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ocu(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ocu(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
    }
}
