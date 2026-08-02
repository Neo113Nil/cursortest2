package com.yandex.plus.bdui.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.widget.FrameLayout;
import com.connectsdk.service.DeviceService;
import com.yandex.passport.internal.ui.bouncer.roundabout.n;
import com.yandex.passport.sloth.ui.q;
import com.yandex.plus.bdui.content.d;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.experiments.impl.providers.h;
import com.yandex.plus.home.api.prefetch.l;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internal.simple.g;
import com.yandex.plus.home.feature.webviews.internal.simple.j;
import com.yandex.plus.home.feature.webviews.internal.smart.i;
import com.yandex.plus.home.feature.webviews.internal.stories.p;
import com.yandex.plus.home.feature.webviews.internal.treasury.e;
import com.yandex.plus.home.feature.webviews.internal.uri.k;
import com.yandex.plus.home.feature.webviews.internal.uri.y;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.a3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.a5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.b2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.b6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.c6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.d4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.d5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.e2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.f3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.g5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.h2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.h6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.j3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.j5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.k6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.m5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.n1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.n6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.p5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.q6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.s5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.y1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.y5;
import com.yandex.plus.home.repository.api.model.panel.b0;
import com.yandex.pulse.metrics.o;
import defpackage.aur;
import defpackage.b6e;
import defpackage.cnb;
import defpackage.d7g;
import defpackage.dnb;
import defpackage.ezc;
import defpackage.f44;
import defpackage.f51;
import defpackage.fkn;
import defpackage.gld;
import defpackage.hrg;
import defpackage.inr;
import defpackage.jyr;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.olu;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rj7;
import defpackage.rjc;
import defpackage.rjf;
import defpackage.t7o;
import defpackage.u21;
import defpackage.u75;
import defpackage.uah;
import defpackage.wdu;
import defpackage.wwd;
import defpackage.wxm;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.y2x;
import defpackage.z75;
import defpackage.z7o;
import defpackage.zsd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class b extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(e eVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.j = 29;
        this.l = eVar;
        this.m = (ezc) function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0033, code lost:
    
        if (r7 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        Object obj2;
        j jVar = (j) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            com.yandex.plus.home.feature.webviews.internal.uri.e eVar = (com.yandex.plus.home.feature.webviews.internal.uri.e) this.l;
            if (eVar.b) {
                u.b(jVar.l, eVar, false, null, 60);
                return Unit.a;
            }
            k kVar = jVar.n;
            this.k = 1;
            Object b = kVar.b(eVar, this);
            obj2 = b;
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                jVar.q.v();
                ((g) jVar.e).j((String) obj);
                return Unit.a;
            }
            qgg.h0(obj);
            obj2 = obj;
        }
        String uri = ((com.yandex.plus.home.feature.webviews.internal.uri.e) obj2).a.toString();
        uri.getClass();
        this.k = 2;
        obj = uri;
        if (!jVar.j) {
            y yVar = jVar.k;
            Object r = yVar.a.r(Uri.parse(uri));
            com.yandex.plus.home.feature.webviews.internal.uri.j jVar2 = (com.yandex.plus.home.feature.webviews.internal.uri.j) (r instanceof t7o ? null : r);
            obj = uri;
            if (jVar2 instanceof com.yandex.plus.home.feature.webviews.internal.uri.e) {
                obj = yVar.b((com.yandex.plus.home.feature.webviews.internal.uri.e) jVar2, this);
            }
        }
    }

    private final Object l(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            f fVar = ((com.yandex.plus.home.feature.webviews.internal.smart.e) this.l).t;
            d5 d5Var = (d5) this.m;
            this.k = 1;
            if (fVar.u(d5Var, this) == nm6Var) {
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

    private final Object n(Object obj) {
        Object g;
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
        com.yandex.plus.home.feature.webviews.internal.smart.e eVar = ((i) this.l).a;
        WebResourceRequest webResourceRequest = (WebResourceRequest) this.m;
        this.k = 1;
        if (eVar.D.f()) {
            g = com.yandex.plus.bdui.plus.analytics.b.j();
        } else {
            l lVar = eVar.y;
            String uri = webResourceRequest.getUrl().toString();
            uri.getClass();
            g = lVar.g(uri, this);
        }
        return g == nm6Var ? nm6Var : g;
    }

    private final Object o(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            f fVar = ((com.yandex.plus.home.feature.webviews.internal.stories.k) this.l).u;
            d5 d5Var = (d5) this.m;
            this.k = 1;
            if (fVar.u(d5Var, this) == nm6Var) {
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

    private final Object p(Object obj) {
        Object g;
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
        com.yandex.plus.home.feature.webviews.internal.stories.k kVar = ((p) this.l).a;
        WebResourceRequest webResourceRequest = (WebResourceRequest) this.m;
        this.k = 1;
        if (kVar.X.f()) {
            g = com.yandex.plus.bdui.plus.analytics.b.j();
        } else {
            l lVar = kVar.H;
            String uri = webResourceRequest.getUrl().toString();
            uri.getClass();
            g = lVar.g(uri, this);
        }
        return g == nm6Var ? nm6Var : g;
    }

    private final Object q(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            pjc pjcVar = (pjc) this.l;
            if (pjcVar != null) {
                com.yandex.passport.common.ui.compose.a aVar = new com.yandex.passport.common.ui.compose.a(19, (com.yandex.plus.home.feature.webviews.internal.stories.list.i) this.m);
                this.k = 1;
                if (pjcVar.collect(aVar, this) == nm6Var) {
                    return nm6Var;
                }
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

    /* JADX WARN: Type inference failed for: r1v56, types: [ezc, kotlin.jvm.functions.Function1] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new b((a) this.l, (d) this.m, continuation, 0);
            case 1:
                b bVar = new b((u21) this.m, continuation, 1);
                bVar.l = obj;
                return bVar;
            case 2:
                return new b((com.yandex.plus.domain.auth.impl.i) this.l, (com.yandex.plus.adapter.auth.api.e) this.m, continuation, 2);
            case 3:
                return new b((com.yandex.plus.domain.auth.impl.i) this.l, (com.yandex.plus.adapter.auth.api.f) this.m, continuation, 3);
            case 4:
                return new b((com.yandex.plus.domain.auth.impl.i) this.l, (com.yandex.plus.adapter.auth.api.f) this.m, continuation, 4);
            case 5:
                return new b((h) this.m, continuation, 5);
            case 6:
                b bVar2 = new b(this.m, continuation, 6);
                bVar2.l = obj;
                return bVar2;
            case 7:
                b bVar3 = new b((com.yandex.plus.home.common.utils.flow.b) this.m, continuation, 7);
                bVar3.l = obj;
                return bVar3;
            case 8:
                return new b((com.yandex.passport.internal.core.accounts.h) this.l, (com.yandex.plus.home.dailyquests.repository.api.dailyquests.k) this.m, continuation, 8);
            case 9:
                return new b((com.yandex.passport.internal.core.accounts.h) this.l, (com.yandex.plus.home.dailyquests.repository.api.dailyquests.i) this.m, continuation, 9);
            case 10:
                return new b((com.yandex.plus.home.dailyquests.repository.api.dailyquests.l) this.l, (com.yandex.passport.internal.core.accounts.h) this.m, continuation, 10);
            case 11:
                return new b((rjf) this.l, (com.yandex.plus.home.dailyquests.repository.api.dailyquests.a) this.m, continuation, 11);
            case 12:
                return new b((com.yandex.plus.home.dailyquests.feature.internal.utils.e) this.l, (View) this.m, continuation, 12);
            case 13:
                return new b((com.yandex.plus.home.feature.panel.internal.f) this.l, (com.yandex.plus.home.repository.api.model.panel.i) this.m, continuation, 13);
            case 14:
                b bVar4 = new b((com.yandex.plus.home.feature.panel.internal.f) this.m, continuation, 14);
                bVar4.l = obj;
                return bVar4;
            case 15:
                return new b((com.yandex.plus.core.imageloader.b) this.l, (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.e) this.m, continuation, 15);
            case 16:
                return new b((com.yandex.plus.home.feature.webviews.internal.d) this.m, continuation, 16);
            case 17:
                return new b((f) this.l, (d5) this.m, continuation, 17);
            case 18:
                return new b((com.yandex.plus.home.feature.webviews.internal.bridge.b) this.l, (String) this.m, continuation, 18);
            case 19:
                return new b((t) this.l, (Function1) this.m, continuation, 19);
            case 20:
                return new b((com.yandex.plus.home.feature.webviews.internal.home.g) this.l, (d5) this.m, continuation, 20);
            case 21:
                return new b((com.yandex.plus.home.feature.webviews.internal.home.k) this.l, (WebResourceRequest) this.m, continuation, 21);
            case 22:
                return new b((com.yandex.passport.internal.flags.experiments.p) this.l, (com.yandex.plus.home.feature.webviews.internal.purchase.button.offers.a) this.m, continuation, 22);
            case 23:
                return new b((com.yandex.plus.home.feature.webviews.internal.uri.e) this.l, (j) this.m, continuation, 23);
            case 24:
                return new b((com.yandex.plus.home.feature.webviews.internal.smart.e) this.l, (d5) this.m, continuation, 24);
            case 25:
                return new b((i) this.l, (WebResourceRequest) this.m, continuation, 25);
            case 26:
                return new b((com.yandex.plus.home.feature.webviews.internal.stories.k) this.l, (d5) this.m, continuation, 26);
            case 27:
                return new b((p) this.l, (WebResourceRequest) this.m, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new b((pjc) this.l, (com.yandex.plus.home.feature.webviews.internal.stories.list.i) this.m, continuation, 28);
            default:
                return new b((e) this.l, (Function1) this.m, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 13:
                ((b) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((b) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:441:0x09dc, code lost:
    
        if (defpackage.x97.V((kotlinx.coroutines.a) r1.l, new com.yandex.plus.home.dailyquests.feature.internal.ui.c(r1, null, 3), r38) == r2) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x09a5, code lost:
    
        if (r3 == r2) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x096b, code lost:
    
        if (kotlin.Unit.a == r2) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0a1d, code lost:
    
        if (r2 == r1) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0a36, code lost:
    
        if (r2 == r1) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0bcc, code lost:
    
        if (r2 == r1) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0b82, code lost:
    
        if (r2 == r1) goto L528;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0ba0  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0bc2  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object f;
        Object e;
        h hVar;
        com.yandex.plus.experiments.api.cache.f fVar;
        Object b;
        Object obj5;
        Object b2;
        Object obj6;
        Object Q;
        Object Q2;
        Iterator it;
        int i;
        com.yandex.plus.home.feature.panel.internal.sections.l lVar;
        com.yandex.plus.home.feature.panel.internal.sections.l bVar;
        Object f2;
        com.yandex.plus.home.feature.webviews.internal.d dVar;
        Object obj7;
        n1 n1Var;
        Object m;
        Object g;
        int i2 = this.j;
        ?? r5 = this.m;
        int i3 = 1;
        switch (i2) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((a) this.l).c((d) r5, null, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                rjc rjcVar = (rjc) this.l;
                nm6 nm6Var2 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    com.yandex.passport.common.mvi.c cVar = new com.yandex.passport.common.mvi.c(17, rjcVar, hrg.i(obj));
                    this.l = null;
                    this.k = 1;
                    if (((u21) r5).collect(cVar, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object d = ((com.yandex.plus.domain.auth.impl.i) this.l).a.d((com.yandex.plus.adapter.auth.api.e) r5, this);
                    if (d == nm6Var3) {
                        return nm6Var3;
                    }
                    obj2 = d;
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    obj2 = ((z7o) obj).a;
                }
                return new z7o(obj2);
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object f3 = ((com.yandex.plus.domain.auth.impl.i) this.l).a.f((com.yandex.plus.adapter.auth.api.f) r5, this);
                    if (f3 == nm6Var4) {
                        return nm6Var4;
                    }
                    obj3 = f3;
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    obj3 = ((z7o) obj).a;
                }
                return new z7o(obj3);
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object g2 = ((com.yandex.plus.domain.auth.impl.i) this.l).a.g((com.yandex.plus.adapter.auth.api.f) r5, this);
                    if (g2 == nm6Var5) {
                        return nm6Var5;
                    }
                    obj4 = g2;
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    obj4 = ((z7o) obj).a;
                }
                return new z7o(obj4);
            case 5:
                h hVar2 = (h) r5;
                Object obj8 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.experiments.api.a aVar = (com.yandex.plus.experiments.api.a) hVar2.i.getValue();
                    if (aVar == null) {
                        com.yandex.plus.experiments.api.cache.c cVar2 = hVar2.g;
                        this.k = 1;
                        f = cVar2.f(this);
                        break;
                    } else {
                        return aVar;
                    }
                } else {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            h hVar3 = (h) this.l;
                            qgg.h0(obj);
                            hVar = hVar3;
                            e = obj;
                            fVar = (com.yandex.plus.experiments.api.cache.f) e;
                            if (fVar != null) {
                                this.l = null;
                                this.k = 3;
                                b = h.b(hVar2, this);
                                break;
                            } else {
                                obj8 = hVar.d.a(fVar);
                                xdr xdrVar = hVar.k;
                                r7o r7oVar = z7o.b;
                                com.yandex.plus.core.b bVar2 = new com.yandex.plus.core.b(obj8 instanceof t7o ? null : obj8);
                                xdrVar.getClass();
                                xdrVar.m(null, bVar2);
                                qgg.h0(obj8);
                            }
                            return obj8;
                        }
                        if (i9 != 3) {
                            if (i9 != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            obj5 = ((z7o) obj).a;
                            qgg.h0(obj5);
                            return obj5;
                        }
                        qgg.h0(obj);
                        b = obj;
                        com.yandex.plus.experiments.api.a aVar2 = (com.yandex.plus.experiments.api.a) b;
                        if (aVar2 != null) {
                            return aVar2;
                        }
                        this.k = 4;
                        Object a = h.a(hVar2, this);
                        if (a != obj8) {
                            obj5 = a;
                            qgg.h0(obj5);
                            return obj5;
                        }
                        return obj8;
                    }
                    qgg.h0(obj);
                    f = obj;
                }
                if (((Boolean) f).booleanValue()) {
                    xq0.q("Experiments on cooldown");
                    return null;
                }
                com.yandex.plus.experiments.api.cache.c cVar3 = hVar2.f;
                this.l = hVar2;
                this.k = 2;
                e = com.yandex.plus.experiments.api.cache.c.e(cVar3, this);
                if (e != obj8) {
                    hVar = hVar2;
                    fVar = (com.yandex.plus.experiments.api.cache.f) e;
                    if (fVar != null) {
                    }
                }
                return obj8;
            case 6:
                Object obj9 = this.l;
                nm6 nm6Var6 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    this.l = null;
                    this.k = 1;
                    if (r5.invoke(obj9, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 7:
                rjc rjcVar2 = (rjc) this.l;
                nm6 nm6Var7 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.common.utils.flow.c cVar4 = new com.yandex.plus.home.common.utils.flow.c(rjcVar2, 0);
                    this.l = null;
                    this.k = 1;
                    if (((com.yandex.plus.home.common.utils.flow.b) r5).collect(cVar4, this) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                nm6 nm6Var8 = nm6.a;
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
                com.yandex.passport.internal.core.accounts.h hVar4 = (com.yandex.passport.internal.core.accounts.h) this.l;
                com.yandex.plus.core.data.common.y yVar = ((com.yandex.plus.home.dailyquests.repository.api.dailyquests.k) r5).e.a;
                this.k = 1;
                Object b3 = com.yandex.passport.internal.core.accounts.h.b(hVar4, yVar, this);
                return b3 == nm6Var8 ? nm6Var8 : b3;
            case 9:
                com.yandex.plus.home.dailyquests.repository.api.dailyquests.i iVar = (com.yandex.plus.home.dailyquests.repository.api.dailyquests.i) r5;
                com.yandex.passport.internal.core.accounts.h hVar5 = (com.yandex.passport.internal.core.accounts.h) this.l;
                nm6 nm6Var9 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.core.data.common.y yVar2 = iVar.b;
                    this.k = 1;
                    b2 = com.yandex.passport.internal.core.accounts.h.b(hVar5, yVar2, this);
                    if (b2 == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b2 = obj;
                }
                Drawable drawable = (Drawable) b2;
                if (drawable != null) {
                    String str = iVar.a;
                    String str2 = iVar.c;
                    str.getClass();
                    str2.getClass();
                    return a1.a(str, str2, new olu(10, drawable));
                }
                return null;
            case 10:
                com.yandex.passport.internal.core.accounts.h hVar6 = (com.yandex.passport.internal.core.accounts.h) r5;
                nm6 nm6Var10 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.dailyquests.repository.api.dailyquests.l lVar2 = (com.yandex.plus.home.dailyquests.repository.api.dailyquests.l) this.l;
                    if (lVar2 instanceof com.yandex.plus.home.dailyquests.repository.api.dailyquests.k) {
                        this.k = 1;
                        Q2 = gld.Q(new wwd((com.yandex.plus.home.dailyquests.repository.api.dailyquests.k) lVar2, hVar6, null, 5), this);
                        break;
                    } else if (lVar2 instanceof com.yandex.plus.home.dailyquests.repository.api.dailyquests.g) {
                        this.k = 2;
                        Q = gld.Q(new f44((com.yandex.plus.home.dailyquests.repository.api.dailyquests.g) lVar2, hVar6, (Continuation) null), this);
                        break;
                    } else {
                        if (lVar2 != null) {
                            b6e.s();
                            return null;
                        }
                        obj6 = com.yandex.plus.home.dailyquests.feature.internal.model.b.a;
                    }
                    return nm6Var10;
                }
                if (i14 == 1) {
                    qgg.h0(obj);
                    Q2 = obj;
                    obj6 = (com.yandex.plus.home.dailyquests.feature.internal.model.j) Q2;
                } else {
                    if (i14 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    Q = obj;
                    obj6 = (com.yandex.plus.home.dailyquests.feature.internal.model.j) Q;
                }
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.a, "DailyQuestStateMapper.mapToUiState()=" + obj6, null);
                return obj6;
            case 11:
                rjf rjfVar = (rjf) this.l;
                Object obj10 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.dailyquests.plugin.internal.proxy.d dVar2 = (com.yandex.plus.home.dailyquests.plugin.internal.proxy.d) rjfVar.f;
                    String str3 = ((com.yandex.plus.home.dailyquests.repository.api.dailyquests.a) r5).a;
                    this.k = 1;
                    com.yandex.plus.home.core.navigation.a aVar3 = dVar2.a;
                    aVar3.getClass();
                    str3.getClass();
                    aVar3.a(Uri.parse(str3));
                    break;
                } else if (i15 == 1) {
                    qgg.h0(obj);
                } else if (i15 == 2) {
                    qgg.h0(obj);
                    f fVar2 = (f) rjfVar.k;
                    FrameLayout frameLayout = (FrameLayout) ((s) rjfVar.i).b;
                    frameLayout.getClass();
                    n nVar = (n) fVar2.b;
                    if (nVar != null) {
                        WeakHashMap weakHashMap = wdu.a;
                        if (frameLayout.isAttachedToWindow()) {
                            nVar.onViewDetachedFromWindow(frameLayout);
                            nVar.onViewAttachedToWindow(frameLayout);
                        }
                    }
                    this.k = 3;
                    break;
                } else {
                    if (i15 == 3) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                com.yandex.plus.home.dailyquests.feature.internal.domain.b bVar3 = (com.yandex.plus.home.dailyquests.feature.internal.domain.b) rjfVar.e;
                this.k = 2;
                com.yandex.plus.home.dailyquests.repository.rest.c cVar5 = bVar3.a;
                com.yandex.plus.core.analytics.logging.b bVar4 = com.yandex.plus.core.analytics.logging.b.a;
                jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar4, "GraphQLDailyQuestsRepository.clearDoneQuest() called", null);
                Object V = x97.V(cVar5.h, new f51(cVar5, ((com.yandex.plus.domain.auth.api.e) cVar5.f.invoke()).getId(), null, 3), this);
                if (V != obj10) {
                    V = Unit.a;
                }
                if (V != obj10) {
                    V = Unit.a;
                    break;
                }
                break;
            case 12:
                View view = (View) r5;
                com.yandex.plus.home.dailyquests.feature.internal.utils.e eVar = (com.yandex.plus.home.dailyquests.feature.internal.utils.e) this.l;
                nm6 nm6Var11 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    long elapsedRealtime = (eVar.d + 300) - SystemClock.elapsedRealtime();
                    eVar.d = SystemClock.elapsedRealtime();
                    this.k = 1;
                    if (y2x.o(elapsedRealtime, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (com.yandex.plus.bdui.flex.ui.a.q(view) >= eVar.a) {
                    view.getViewTreeObserver().removeOnScrollChangedListener(eVar.f);
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(eVar.g);
                    eVar.b.invoke(eVar);
                }
                return Unit.a;
            case 13:
                nm6 nm6Var12 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.feature.panel.internal.f fVar3 = (com.yandex.plus.home.feature.panel.internal.f) this.l;
                    fkn fknVar = fVar3.a;
                    com.yandex.passport.common.mvi.c cVar6 = new com.yandex.passport.common.mvi.c(19, fVar3, (com.yandex.plus.home.repository.api.model.panel.i) r5);
                    this.k = 1;
                    if (fknVar.a.collect(cVar6, this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            case 14:
                com.yandex.plus.home.feature.panel.internal.f fVar4 = (com.yandex.plus.home.feature.panel.internal.f) r5;
                com.yandex.plus.core.analytics.logging.d dVar3 = fVar4.h;
                xdr xdrVar2 = fVar4.j;
                com.yandex.plus.home.api.panel.g gVar = fVar4.i;
                com.yandex.plus.home.repository.api.model.f fVar5 = (com.yandex.plus.home.repository.api.model.f) this.l;
                nm6 nm6Var13 = nm6.a;
                int i18 = this.k;
                if (i18 != 0) {
                    if (i18 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.b;
                if (dVar3.b(aVar4)) {
                    dVar3.a(aVar4, "PlusPanelViewManagerImpl", "subscribeToUpdates() state=" + fVar5, null);
                }
                if (fVar5 instanceof com.yandex.plus.home.repository.api.model.c) {
                    gVar.removeAllViews();
                    com.yandex.plus.home.feature.panel.internal.sections.h j = gVar.j();
                    gVar.addView(j, -1, -2);
                    j.y();
                    xdrVar2.getClass();
                    xdrVar2.m(null, com.yandex.plus.home.api.panel.c.a);
                } else {
                    if (fVar5 instanceof com.yandex.plus.home.repository.api.model.e) {
                        com.yandex.plus.home.repository.api.model.panel.i iVar2 = (com.yandex.plus.home.repository.api.model.panel.i) ((com.yandex.plus.home.repository.api.model.e) fVar5).a;
                        com.yandex.plus.log.api.b bVar5 = gVar.z;
                        iVar2.getClass();
                        List list = iVar2.c;
                        HashMap hashMap = new HashMap();
                        int i19 = 0;
                        while (true) {
                            if (i19 < gVar.getChildCount()) {
                                int i20 = i19 + 1;
                                View childAt = gVar.getChildAt(i19);
                                if (childAt != null) {
                                    Class<?> cls = childAt.getClass();
                                    Object obj11 = hashMap.get(cls);
                                    if (obj11 == null) {
                                        ArrayList arrayList = new ArrayList();
                                        hashMap.put(cls, arrayList);
                                        obj11 = arrayList;
                                    }
                                    ((List) obj11).add(childAt);
                                    i19 = i20;
                                } else {
                                    rj7.m();
                                }
                            } else {
                                gVar.removeAllViews();
                                com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.b;
                                if (bVar5.b(aVar5)) {
                                    bVar5.c(aVar5, "PlusPanelView", "showPanel() configId=".concat(iVar2.a));
                                }
                                List list2 = list;
                                Iterator it2 = list2.iterator();
                                int i21 = 0;
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    int i22 = i21 + 1;
                                    if (i21 < 0) {
                                        u75.n();
                                        throw null;
                                    }
                                    b0 b0Var = (b0) next;
                                    int ordinal = b0Var.c.ordinal();
                                    List list3 = list2;
                                    if (ordinal == 0) {
                                        it = it2;
                                        i = i3;
                                        List list4 = (List) hashMap.get(com.yandex.plus.home.feature.panel.internal.sections.h.class);
                                        View view2 = list4 != null ? (View) z75.B(list4) : null;
                                        if (!(view2 instanceof com.yandex.plus.home.feature.panel.internal.sections.h)) {
                                            view2 = null;
                                        }
                                        lVar = (com.yandex.plus.home.feature.panel.internal.sections.h) view2;
                                        com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.b;
                                        if (bVar5.b(aVar6)) {
                                            bVar5.c(aVar6, "PlusPanelView", "popView() " + lVar);
                                        }
                                        if (lVar == null) {
                                            lVar = gVar.j();
                                        }
                                    } else if (ordinal != i3) {
                                        i = i3;
                                        if (ordinal == 2) {
                                            List list5 = (List) hashMap.get(com.yandex.plus.home.feature.panel.internal.sections.c.class);
                                            View view3 = list5 != null ? (View) z75.B(list5) : null;
                                            if (!(view3 instanceof com.yandex.plus.home.feature.panel.internal.sections.c)) {
                                                view3 = null;
                                            }
                                            lVar = (com.yandex.plus.home.feature.panel.internal.sections.c) view3;
                                            com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.b;
                                            if (bVar5.b(aVar7)) {
                                                it = it2;
                                                bVar5.c(aVar7, "PlusPanelView", "popView() " + lVar);
                                            } else {
                                                it = it2;
                                            }
                                            if (lVar == null) {
                                                Context context = gVar.getContext();
                                                context.getClass();
                                                bVar = new com.yandex.plus.home.feature.panel.internal.sections.c(context, gVar.s, gVar.u, gVar.p, gVar.q, gVar.t, gVar.v, gVar.r, gVar.w, gVar.z, gVar.x, gVar.y, gVar.A, gVar.C);
                                                lVar = bVar;
                                            }
                                        } else {
                                            b6e.s();
                                        }
                                    } else {
                                        it = it2;
                                        i = i3;
                                        List list6 = (List) hashMap.get(com.yandex.plus.home.feature.panel.internal.sections.b.class);
                                        Object obj12 = list6 != null ? (View) z75.B(list6) : null;
                                        if (!(obj12 instanceof com.yandex.plus.home.feature.panel.internal.sections.b)) {
                                            obj12 = null;
                                        }
                                        lVar = (com.yandex.plus.home.feature.panel.internal.sections.b) obj12;
                                        com.yandex.plus.log.api.a aVar8 = com.yandex.plus.log.api.a.b;
                                        if (bVar5.b(aVar8)) {
                                            bVar5.c(aVar8, "PlusPanelView", "popView() " + lVar);
                                        }
                                        if (lVar == null) {
                                            Context context2 = gVar.getContext();
                                            context2.getClass();
                                            bVar = new com.yandex.plus.home.feature.panel.internal.sections.b(context2, gVar.s, gVar.u, gVar.p, gVar.q, gVar.t, gVar.v, gVar.r, gVar.w, gVar.x, gVar.z, gVar.y, gVar.A, gVar.C);
                                            lVar = bVar;
                                        }
                                    }
                                    d7g d7gVar = new d7g(-1, -2);
                                    if (i21 < list.size() - 1) {
                                        d7gVar.setMargins(0, 0, 0, gVar.D);
                                    }
                                    gVar.addView(lVar, d7gVar);
                                    lVar.w((com.yandex.plus.ui.core.theme.a) gVar.p.getValue());
                                    if (b0Var.d) {
                                        lVar.y();
                                        com.yandex.plus.log.api.a aVar9 = com.yandex.plus.log.api.a.b;
                                        if (bVar5.b(aVar9)) {
                                            bVar5.c(aVar9, "PlusPanelView", "onViewAttachedToWindow() stub section shown");
                                        }
                                    } else {
                                        lVar.x(iVar2, b0Var);
                                    }
                                    i21 = i22;
                                    list2 = list3;
                                    i3 = i;
                                    it2 = it;
                                }
                                int i23 = i3;
                                Iterator it3 = list2.iterator();
                                int i24 = 0;
                                while (it3.hasNext()) {
                                    i24 += ((b0) it3.next()).e.size();
                                }
                                com.yandex.plus.home.api.panel.d dVar4 = new com.yandex.plus.home.api.panel.d(i24 > 0 ? i23 : 0);
                                xdrVar2.getClass();
                                xdrVar2.m(null, dVar4);
                                com.yandex.plus.experiments.impl.cache.b bVar6 = new com.yandex.plus.experiments.impl.cache.b(fVar4, iVar2, null, 3);
                                this.l = null;
                                this.k = i23;
                                if (gld.Q(bVar6, this) == nm6Var13) {
                                    return nm6Var13;
                                }
                            }
                        }
                        return null;
                    }
                    if (!(fVar5 instanceof com.yandex.plus.home.repository.api.model.b)) {
                        b6e.s();
                        return null;
                    }
                    Throwable th = ((com.yandex.plus.home.repository.api.model.b) fVar5).a;
                    com.yandex.plus.home.api.panel.a aVar10 = new com.yandex.plus.home.api.panel.a(th);
                    xdrVar2.getClass();
                    xdrVar2.m(null, aVar10);
                    com.yandex.plus.log.api.a aVar11 = com.yandex.plus.log.api.a.e;
                    if (dVar3.b(aVar11)) {
                        dVar3.a(aVar11, "PlusPanelViewManagerImpl", "subscribeToUpdates() error", th);
                    }
                    gVar.removeAllViews();
                }
                return Unit.a;
            case 15:
                nm6 nm6Var14 = nm6.a;
                int i25 = this.k;
                if (i25 != 0) {
                    if (i25 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                f b4 = ((com.yandex.plus.coil.b) ((com.yandex.plus.core.imageloader.b) this.l)).b(((com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.e) r5).b);
                this.k = 1;
                Object w = b4.w(this);
                return w == nm6Var14 ? nm6Var14 : w;
            case 16:
                com.yandex.plus.home.feature.webviews.internal.d dVar5 = (com.yandex.plus.home.feature.webviews.internal.d) r5;
                com.yandex.plus.home.auth.f fVar6 = dVar5.b;
                nm6 nm6Var15 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    this.l = dVar5;
                    this.k = 1;
                    f2 = fVar6.f(this);
                    if (f2 == nm6Var15) {
                        return nm6Var15;
                    }
                    dVar = dVar5;
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dVar = (com.yandex.plus.home.feature.webviews.internal.d) this.l;
                    qgg.h0(obj);
                    f2 = obj;
                }
                dVar.j = (Boolean) f2;
                com.yandex.plus.bdui.flex.ui.a.j(zsd.b0(new com.yandex.passport.internal.t(fVar6.a.h, 26)), dVar5.h, new com.yandex.passport.internal.ui.challenge.b(2, dVar5, com.yandex.plus.home.feature.webviews.internal.d.class, "handleIsAuthorizedChanged", "handleIsAuthorizedChanged(Z)V", 4, 2));
                dVar5.a(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(i3, dVar5));
                return Unit.a;
            case 17:
                nm6 nm6Var16 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((x0q) ((f) this.l).b).emit((d5) r5, this) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                String str4 = (String) r5;
                com.yandex.plus.home.feature.webviews.internal.bridge.b bVar7 = (com.yandex.plus.home.feature.webviews.internal.bridge.b) this.l;
                com.yandex.plus.home.analytics.diagnostic.messaging.b bVar8 = bVar7.i;
                u uVar = bVar7.o;
                Object obj13 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.core.accounts.h hVar7 = bVar7.d;
                    this.k = 1;
                    Object u = hVar7.u(str4, this);
                    if (u == obj13) {
                        return obj13;
                    }
                    obj7 = u;
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    obj7 = ((z7o) obj).a;
                }
                r7o r7oVar2 = z7o.b;
                Continuation continuation = null;
                if (!(obj7 instanceof t7o)) {
                    r6 r6Var = (r6) obj7;
                    String str5 = bVar7.m;
                    com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar12 = bVar7.l;
                    wxm wxmVar = bVar7.s;
                    com.yandex.plus.core.analytics.logging.b bVar9 = com.yandex.plus.core.analytics.logging.b.c;
                    jyr jyrVar3 = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.a aVar13 = com.yandex.plus.core.analytics.logging.a.a;
                    com.yandex.plus.core.analytics.logging.e.e(aVar13, bVar9, "handleOutMessage() outMessage=" + r6Var, null);
                    if (r6Var instanceof l4) {
                        bVar7.l((l4) r6Var);
                    } else if (r6Var instanceof x3) {
                        bVar7.k((x3) r6Var);
                    } else if (r6Var instanceof d4) {
                        bVar7.j((d4) r6Var);
                    } else if (r6Var instanceof r3) {
                        bVar7.i((r3) r6Var);
                    } else if (r6Var instanceof h2) {
                        bVar7.c((h2) r6Var);
                    } else if (r6Var instanceof e2) {
                        bVar7.b((e2) r6Var);
                    } else if (r6Var instanceof x4) {
                        bVar7.p((x4) r6Var);
                    } else if (r6Var instanceof q6) {
                        bVar7.x((q6) r6Var);
                    } else if (r6Var instanceof l2) {
                        bVar7.d((l2) r6Var);
                    } else if (r6Var instanceof o4) {
                        o4 o4Var = (o4) r6Var;
                        com.yandex.plus.core.analytics.logging.e.e(aVar13, bVar9, "handleOptionStatusRequestMessage() outMessage=" + o4Var, null);
                        x97.y((mm6) wxmVar.get(), bVar7.c, null, new q(bVar7, o4Var, false, continuation, 8), 2);
                    } else if (r6Var instanceof b2) {
                        b2 b2Var = (b2) r6Var;
                        com.yandex.plus.core.analytics.logging.e.e(aVar13, bVar9, "handleChangeOptionStatusRequestMessage() outMessage=" + b2Var, null);
                        x97.y((mm6) wxmVar.get(), bVar7.a, null, new inr(bVar7, b2Var, continuation, 24), 2);
                    } else if (r6Var instanceof k6) {
                        bVar7.w((k6) r6Var);
                    } else if (r6Var instanceof n6) {
                        n6 n6Var = (n6) r6Var;
                        Function0 function0 = bVar7.k;
                        if (function0 != null) {
                            String str6 = (String) function0.invoke();
                            com.yandex.plus.core.analytics.logging.e.e(aVar13, bVar9, "get card info from host - handleUserCardRequest() outMessage=" + n6Var + " cardId=" + str6, null);
                            String str7 = n6Var.a;
                            if (str6 != null) {
                                if (StringsKt.U(str6)) {
                                    str6 = null;
                                }
                                if (str6 != null) {
                                    n1Var = new n1(str6);
                                    bVar7.A(new o1(str7, n1Var));
                                }
                            }
                            n1Var = null;
                            bVar7.A(new o1(str7, n1Var));
                        }
                    } else if (r6Var instanceof o3) {
                        bVar7.g((o3) r6Var);
                    } else if (r6Var instanceof x2) {
                        bVar7.h((x2) r6Var);
                    } else if (r6Var instanceof d5) {
                        bVar7.q((d5) r6Var);
                    } else if (r6Var instanceof s5) {
                        bVar7.u((s5) r6Var);
                    } else if (r6Var instanceof b6) {
                        bVar7.v((b6) r6Var);
                    } else if (r6Var instanceof g5) {
                        g5 g5Var = (g5) r6Var;
                        com.yandex.plus.core.analytics.logging.e.e(aVar13, bVar9, "handleMetricsEvent() outMessage=" + g5Var, null);
                        com.yandex.plus.home.analytics.f fVar7 = bVar7.j;
                        String str8 = g5Var.b;
                        String str9 = g5Var.c;
                        fVar7.getClass();
                        str8.getClass();
                        str9.getClass();
                        com.yandex.plus.core.analytics.f fVar8 = (com.yandex.plus.core.analytics.f) fVar7.b.getValue();
                        if (fVar8 != null) {
                            fVar8.reportEvent(str8, str9);
                        }
                    } else if (r6Var instanceof a5) {
                        bVar7.o((a5) r6Var);
                    } else if (r6Var instanceof u4) {
                        bVar7.n((u4) r6Var);
                    } else if (r6Var instanceof p5) {
                        bVar7.t((p5) r6Var);
                    } else if (r6Var instanceof u2) {
                        bVar7.e((u2) r6Var);
                    } else if (r6Var instanceof r4) {
                        bVar7.m((r4) r6Var);
                    } else if (r6Var instanceof h6) {
                        h6 h6Var = (h6) r6Var;
                        com.yandex.plus.core.analytics.logging.e.e(aVar13, bVar9, "handleUpdateTargetsState() outMessage=" + h6Var, null);
                        bVar7.p.j(h6Var.b);
                    } else if (r6Var instanceof y5) {
                        y5 y5Var = (y5) r6Var;
                        com.yandex.plus.core.analytics.logging.e.e(aVar13, bVar9, "handleSuccessScreenShown() outMessage=" + y5Var, null);
                        aVar12.b(str5, y5Var.b);
                    } else if (r6Var instanceof v5) {
                        v5 v5Var = (v5) r6Var;
                        com.yandex.plus.core.analytics.logging.e.e(aVar13, bVar9, "handleSuccessScreenButtonTapped() outMessage=" + v5Var, null);
                        aVar12.c(str5, v5Var.b);
                    } else if (r6Var instanceof u3) {
                        u3 u3Var = (u3) r6Var;
                        com.yandex.plus.core.analytics.logging.e.e(aVar13, bVar9, "handleOpenSmart() outMessage=" + u3Var, null);
                        Object B = com.yandex.passport.data.network.l.B(u3Var);
                        if (!(B instanceof t7o)) {
                            u.b(uVar, (com.yandex.plus.home.feature.webviews.internal.uri.f) B, true, null, 60);
                        }
                        Throwable a2 = z7o.a(B);
                        if (a2 != null) {
                            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar9, "handleOpenSmart() outMessage=" + u3Var, a2);
                            bVar8.c(u3Var.b);
                        }
                    } else if (r6Var instanceof j5) {
                        bVar7.r((j5) r6Var);
                    } else if (r6Var instanceof m5) {
                        bVar7.s((m5) r6Var);
                    } else if (r6Var instanceof f3) {
                        f3 f3Var = (f3) r6Var;
                        com.yandex.plus.core.analytics.logging.e.e(aVar13, bVar9, "handleMiniStoryIsShownEvent() outMessage=" + f3Var, null);
                        bVar7.z(f3Var, "NOT_IMPLEMENTED");
                    } else if (r6Var instanceof a3) {
                        bVar7.f((a3) r6Var);
                    } else if (r6Var instanceof y1) {
                        bVar7.a((y1) r6Var);
                    } else if (r6Var instanceof j3) {
                        bVar7.y((j3) r6Var);
                    } else if (r6Var instanceof o2) {
                        com.yandex.plus.core.analytics.logging.e.e(aVar13, bVar9, "handleDisableSwipeClose() outMessage=" + ((o2) r6Var), null);
                        t tVar = (t) uVar;
                        com.yandex.plus.log.api.b bVar10 = tVar.u;
                        com.yandex.plus.log.api.a aVar14 = com.yandex.plus.log.api.a.b;
                        if (bVar10.b(aVar14)) {
                            bVar10.c(aVar14, "WebViewsControllerImpl", "disableSwipeClose()");
                        }
                        com.yandex.plus.home.feature.webviews.internal.container.a l = tVar.l();
                        if (l != null) {
                            l.n();
                        }
                    } else if (r6Var instanceof r2) {
                        com.yandex.plus.core.analytics.logging.e.e(aVar13, bVar9, "handleEnableSwipeClose() outMessage=" + ((r2) r6Var), null);
                        t tVar2 = (t) uVar;
                        com.yandex.plus.log.api.b bVar11 = tVar2.u;
                        com.yandex.plus.log.api.a aVar15 = com.yandex.plus.log.api.a.b;
                        if (bVar11.b(aVar15)) {
                            bVar11.c(aVar15, "WebViewsControllerImpl", "enableSwipeClose()");
                        }
                        com.yandex.plus.home.feature.webviews.internal.container.a l2 = tVar2.l();
                        if (l2 != null) {
                            l2.m();
                        }
                    } else if (!(r6Var instanceof c6)) {
                        b6e.s();
                        return null;
                    }
                }
                Throwable a3 = z7o.a(obj7);
                if (a3 != null) {
                    jyr jyrVar4 = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, com.yandex.plus.core.analytics.logging.b.c, "Parsing message error jsonMessage=" + str4 + ", throwable=" + a3, null);
                    bVar8.getClass();
                    str4.getClass();
                    dnb dnbVar = bVar8.a;
                    cnb cnbVar = bVar8.b;
                    Pair pair = new Pair("js_message", str4);
                    String message = a3.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    Map e2 = uah.e(pair, new Pair(DeviceService.KEY_DESC, message));
                    dnbVar.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("webview_type", cnbVar.a);
                    linkedHashMap.put("additional_params", e2);
                    linkedHashMap.put("_meta", dnb.b(new HashMap()));
                    dnbVar.c("Error.WebView.Protocol.Parsing", linkedHashMap);
                }
                return Unit.a;
            case 19:
                nm6 nm6Var17 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u uVar2 = ((t) this.l).m;
                    this.k = 1;
                    m = uVar2.m("*/*", this);
                    if (m == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i29 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    m = obj;
                }
                ((Function1) r5).invoke(((List) m).toArray(new Uri[0]));
                return Unit.a;
            case 20:
                nm6 nm6Var18 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((com.yandex.plus.home.feature.webviews.internal.home.g) this.l).w.u((d5) r5, this) == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 21:
                nm6 nm6Var19 = nm6.a;
                int i31 = this.k;
                if (i31 != 0) {
                    if (i31 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.home.feature.webviews.internal.home.g gVar2 = ((com.yandex.plus.home.feature.webviews.internal.home.k) this.l).a;
                WebResourceRequest webResourceRequest = (WebResourceRequest) r5;
                this.k = 1;
                if (gVar2.w0.f()) {
                    g = com.yandex.plus.bdui.plus.analytics.b.j();
                } else {
                    l lVar3 = gVar2.L;
                    String uri = webResourceRequest.getUrl().toString();
                    uri.getClass();
                    g = lVar3.g(uri, this);
                }
                return g == nm6Var19 ? nm6Var19 : g;
            case 22:
                nm6 nm6Var20 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.acquisition.sdk.common.api.di.b bVar12 = (com.yandex.plus.acquisition.sdk.common.api.di.b) ((com.yandex.passport.internal.flags.experiments.p) this.l).c;
                    com.yandex.plus.pay.adapter.api.j jVar = ((com.yandex.plus.home.feature.webviews.internal.purchase.button.offers.a) r5).a;
                    this.k = 1;
                    if (bVar12.d(jVar) == nm6Var20) {
                        return nm6Var20;
                    }
                } else {
                    if (i32 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 23:
                return k(obj);
            case 24:
                return l(obj);
            case 25:
                return n(obj);
            case 26:
                return o(obj);
            case 27:
                return p(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return q(obj);
            default:
                nm6 nm6Var21 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    throw null;
                }
                if (i33 == 1) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
    }
}
