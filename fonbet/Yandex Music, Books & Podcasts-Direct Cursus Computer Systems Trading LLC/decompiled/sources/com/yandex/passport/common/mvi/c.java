package com.yandex.passport.common.mvi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.yandex.passport.data.network.m3;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.v;
import com.yandex.passport.internal.entities.y;
import com.yandex.passport.internal.properties.k0;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.q;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.h4;
import com.yandex.passport.internal.report.p2;
import com.yandex.passport.internal.report.reporters.o1;
import com.yandex.passport.internal.report.w9;
import com.yandex.passport.internal.ui.bouncer.model.a2;
import com.yandex.passport.internal.ui.bouncer.model.b2;
import com.yandex.passport.internal.ui.bouncer.model.c0;
import com.yandex.passport.internal.ui.bouncer.model.c2;
import com.yandex.passport.internal.ui.bouncer.model.d1;
import com.yandex.passport.internal.ui.bouncer.model.d2;
import com.yandex.passport.internal.ui.bouncer.model.e2;
import com.yandex.passport.internal.ui.bouncer.model.f0;
import com.yandex.passport.internal.ui.bouncer.model.f2;
import com.yandex.passport.internal.ui.bouncer.model.g0;
import com.yandex.passport.internal.ui.bouncer.model.g1;
import com.yandex.passport.internal.ui.bouncer.model.g2;
import com.yandex.passport.internal.ui.bouncer.model.h2;
import com.yandex.passport.internal.ui.bouncer.model.i0;
import com.yandex.passport.internal.ui.bouncer.model.j2;
import com.yandex.passport.internal.ui.bouncer.model.k1;
import com.yandex.passport.internal.ui.bouncer.model.m;
import com.yandex.passport.internal.ui.bouncer.model.middleware.b1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.c1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.e1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.i1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.j0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.j1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.l0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.l1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.n1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.p0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.p1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.r0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.w;
import com.yandex.passport.internal.ui.bouncer.model.n;
import com.yandex.passport.internal.ui.bouncer.model.o;
import com.yandex.passport.internal.ui.bouncer.model.r;
import com.yandex.passport.internal.ui.bouncer.model.s;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.model.t;
import com.yandex.passport.internal.ui.bouncer.model.t1;
import com.yandex.passport.internal.ui.bouncer.model.u;
import com.yandex.passport.internal.ui.bouncer.model.v1;
import com.yandex.passport.internal.ui.bouncer.model.w0;
import com.yandex.passport.internal.ui.bouncer.model.w1;
import com.yandex.passport.internal.ui.bouncer.model.x0;
import com.yandex.passport.internal.ui.bouncer.model.x1;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import com.yandex.passport.internal.ui.bouncer.model.z;
import com.yandex.passport.internal.ui.bouncer.model.z1;
import com.yandex.passport.internal.ui.challenge.vpn.VpnChallengeActivity;
import com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperActivity;
import com.yandex.passport.sloth.data.e0;
import com.yandex.passport.sloth.data.o0;
import com.yandex.passport.sloth.y0;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.d5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.f1;
import com.yandex.plus.home.feature.webviews.internalapi.subscription.p;
import com.yandex.plus.home.repository.api.model.webconfig.a0;
import com.yandex.plus.home.repository.api.model.webconfig.b0;
import defpackage.aur;
import defpackage.b6e;
import defpackage.dfi;
import defpackage.e5b;
import defpackage.hmm;
import defpackage.ldg;
import defpackage.mm6;
import defpackage.mn7;
import defpackage.nm6;
import defpackage.oqi;
import defpackage.pjt;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.qqi;
import defpackage.qs;
import defpackage.r7o;
import defpackage.r96;
import defpackage.rjc;
import defpackage.tah;
import defpackage.tf6;
import defpackage.u75;
import defpackage.v75;
import defpackage.vat;
import defpackage.w2f;
import defpackage.x3f;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.z7o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.YMApplication;

/* loaded from: classes4.dex */
public final class c implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(pyc pycVar, mm6 mm6Var) {
        this.a = 18;
        this.b = (aur) pycVar;
        this.c = mm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (r2.emit(r4, r6) != r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c(Object obj, Continuation continuation) {
        com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.i iVar;
        int i;
        rjc rjcVar;
        b0 b0Var;
        int i2;
        if (continuation instanceof com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.i) {
            iVar = (com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.i) continuation;
            int i3 = iVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.k = i3 - Integer.MIN_VALUE;
                com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.i iVar2 = iVar;
                Object obj2 = iVar2.j;
                nm6 nm6Var = nm6.a;
                i = iVar2.k;
                if (i != 0) {
                    qgg.h0(obj2);
                    rjc rjcVar2 = (rjc) this.b;
                    b0 b0Var2 = (b0) obj;
                    com.yandex.plus.home.plaque.feature.internal.presentation.b bVar = (com.yandex.plus.home.plaque.feature.internal.presentation.b) this.c;
                    a0 a0Var = b0Var2 != null ? b0Var2.c : null;
                    String str = b0Var2 != null ? b0Var2.a : null;
                    String str2 = b0Var2 != null ? b0Var2.b : null;
                    iVar2.m = rjcVar2;
                    iVar2.n = b0Var2;
                    iVar2.o = 0;
                    iVar2.k = 1;
                    Serializable e = bVar.e(a0Var, str, str2, null, iVar2);
                    if (e != nm6Var) {
                        rjcVar = rjcVar2;
                        obj2 = e;
                        b0Var = b0Var2;
                        i2 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj2);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = iVar2.o;
                b0Var = iVar2.n;
                rjcVar = iVar2.m;
                qgg.h0(obj2);
                Pair pair = (Pair) obj2;
                com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.c cVar = new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.c(b0Var == null ? b0Var.c : null, (List) pair.a, (p) pair.b);
                iVar2.m = null;
                iVar2.n = null;
                iVar2.o = i2;
                iVar2.k = 2;
            }
        }
        iVar = new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.i(this, continuation);
        com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.i iVar22 = iVar;
        Object obj22 = iVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = iVar22.k;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj22;
        com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.c cVar2 = new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.c(b0Var == null ? b0Var.c : null, (List) pair2.a, (p) pair2.b);
        iVar22.m = null;
        iVar22.n = null;
        iVar22.o = i2;
        iVar22.k = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
    
        if (r5.emit(r12, r1) != r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(Object obj, Continuation continuation) {
        com.yandex.plus.home.feature.webviews.internal.treasury.b bVar;
        Object obj2;
        nm6 nm6Var;
        int i;
        int i2;
        oqi oqiVar;
        rjc rjcVar;
        int i3;
        int i4;
        oqi oqiVar2;
        rjc rjcVar2;
        com.yandex.plus.home.feature.webviews.internal.treasury.e eVar = (com.yandex.plus.home.feature.webviews.internal.treasury.e) this.c;
        try {
            if (continuation instanceof com.yandex.plus.home.feature.webviews.internal.treasury.b) {
                bVar = (com.yandex.plus.home.feature.webviews.internal.treasury.b) continuation;
                int i5 = bVar.k;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    bVar.k = i5 - Integer.MIN_VALUE;
                    obj2 = bVar.j;
                    nm6Var = nm6.a;
                    i = bVar.k;
                    if (i != 0) {
                        qgg.h0(obj2);
                        rjc rjcVar3 = (rjc) this.b;
                        qqi qqiVar = eVar.e;
                        bVar.m = rjcVar3;
                        bVar.n = qqiVar;
                        i2 = 0;
                        bVar.o = 0;
                        bVar.p = 0;
                        bVar.q = 0;
                        bVar.k = 1;
                        if (qqiVar.a(bVar) != nm6Var) {
                            oqiVar = qqiVar;
                            rjcVar = rjcVar3;
                            i3 = 0;
                            i4 = 0;
                        }
                        return nm6Var;
                    }
                    if (i == 1) {
                        int i6 = bVar.q;
                        int i7 = bVar.p;
                        int i8 = bVar.o;
                        oqiVar = bVar.n;
                        rjcVar = bVar.m;
                        qgg.h0(obj2);
                        i4 = i7;
                        i2 = i6;
                        i3 = i8;
                    } else {
                        if (i != 2) {
                            if (i == 3) {
                                qgg.h0(obj2);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = bVar.o;
                        oqiVar2 = bVar.n;
                        rjcVar2 = bVar.m;
                        try {
                            qgg.h0(obj2);
                            com.yandex.plus.treasury.api.c cVar = (com.yandex.plus.treasury.api.c) obj2;
                            eVar.c = cVar;
                            String uuid = UUID.randomUUID().toString();
                            uuid.getClass();
                            f1 k = a1.k(cVar, uuid);
                            oqiVar2.b(null);
                            bVar.m = null;
                            bVar.n = null;
                            bVar.o = i3;
                            bVar.k = 3;
                        } catch (Throwable th) {
                            th = th;
                            oqiVar2.b(null);
                            throw th;
                        }
                    }
                    bVar.m = rjcVar;
                    bVar.n = oqiVar;
                    bVar.o = i3;
                    bVar.p = i4;
                    bVar.q = i2;
                    bVar.k = 2;
                    obj2 = com.yandex.plus.home.feature.webviews.internal.treasury.e.a(eVar, bVar);
                    if (obj2 != nm6Var) {
                        oqiVar2 = oqiVar;
                        rjcVar2 = rjcVar;
                        com.yandex.plus.treasury.api.c cVar2 = (com.yandex.plus.treasury.api.c) obj2;
                        eVar.c = cVar2;
                        String uuid2 = UUID.randomUUID().toString();
                        uuid2.getClass();
                        f1 k2 = a1.k(cVar2, uuid2);
                        oqiVar2.b(null);
                        bVar.m = null;
                        bVar.n = null;
                        bVar.o = i3;
                        bVar.k = 3;
                    }
                    return nm6Var;
                }
            }
            bVar.m = rjcVar;
            bVar.n = oqiVar;
            bVar.o = i3;
            bVar.p = i4;
            bVar.q = i2;
            bVar.k = 2;
            obj2 = com.yandex.plus.home.feature.webviews.internal.treasury.e.a(eVar, bVar);
            if (obj2 != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th2) {
            th = th2;
            oqiVar2 = oqiVar;
            oqiVar2.b(null);
            throw th;
        }
        bVar = new com.yandex.plus.home.feature.webviews.internal.treasury.b(this, continuation);
        obj2 = bVar.j;
        nm6Var = nm6.a;
        i = bVar.k;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj, Continuation continuation) {
        com.yandex.plus.home.graphql.plusstate.a aVar;
        int i;
        com.yandex.plus.home.graphql.plusstate.f fVar = (com.yandex.plus.home.graphql.plusstate.f) this.c;
        if (continuation instanceof com.yandex.plus.home.graphql.plusstate.a) {
            aVar = (com.yandex.plus.home.graphql.plusstate.a) continuation;
            int i2 = aVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.k = i2 - Integer.MIN_VALUE;
                Object obj2 = aVar.j;
                nm6 nm6Var = nm6.a;
                i = aVar.k;
                if (i != 0) {
                    qgg.h0(obj2);
                    rjc rjcVar = (rjc) this.b;
                    com.yandex.plus.home.repository.api.model.f fVar2 = (com.yandex.plus.home.repository.api.model.f) obj;
                    if (fVar2 == null) {
                        xdr xdrVar = fVar.h;
                        xdrVar.getClass();
                        com.yandex.plus.home.repository.api.model.c cVar = com.yandex.plus.home.repository.api.model.c.a;
                        xdrVar.m(null, cVar);
                        tf6 tf6Var = fVar.f;
                        w2f w2fVar = fVar.i;
                        ((com.yandex.plus.core.dispatcher.a) fVar.e).getClass();
                        mn7 mn7Var = com.yandex.plus.core.dispatcher.a.e;
                        w2fVar.getClass();
                        x97.y(tf6Var, kotlin.coroutines.e.c(w2fVar, mn7Var), null, new com.yandex.plus.home.feature.webviews.internal.treasury.d(fVar, null, 2), 2);
                        fVar2 = cVar;
                    } else if (!(fVar2 instanceof com.yandex.plus.home.repository.api.model.c) && !(fVar2 instanceof com.yandex.plus.home.repository.api.model.b) && !(fVar2 instanceof com.yandex.plus.home.repository.api.model.e)) {
                        b6e.s();
                        return null;
                    }
                    aVar.k = 1;
                    if (rjcVar.emit(fVar2, aVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                return Unit.a;
            }
        }
        aVar = new com.yandex.plus.home.graphql.plusstate.a(this, continuation);
        Object obj22 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.k;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(Object obj, Continuation continuation) {
        com.yandex.plus.home.graphql.user.b bVar;
        int i;
        com.yandex.plus.home.graphql.user.e eVar = (com.yandex.plus.home.graphql.user.e) this.c;
        if (continuation instanceof com.yandex.plus.home.graphql.user.b) {
            bVar = (com.yandex.plus.home.graphql.user.b) continuation;
            int i2 = bVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.k = i2 - Integer.MIN_VALUE;
                Object obj2 = bVar.j;
                nm6 nm6Var = nm6.a;
                i = bVar.k;
                if (i != 0) {
                    qgg.h0(obj2);
                    rjc rjcVar = (rjc) this.b;
                    com.yandex.plus.home.repository.api.model.f fVar = (com.yandex.plus.home.repository.api.model.f) obj;
                    if (fVar == null) {
                        xdr xdrVar = eVar.h;
                        xdrVar.getClass();
                        com.yandex.plus.home.repository.api.model.c cVar = com.yandex.plus.home.repository.api.model.c.a;
                        xdrVar.m(null, cVar);
                        tf6 tf6Var = eVar.d;
                        ((com.yandex.plus.core.dispatcher.a) eVar.c).getClass();
                        x97.y(tf6Var, com.yandex.plus.core.dispatcher.a.e.plus(eVar.i), null, new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.b(eVar, null), 2);
                        fVar = cVar;
                    } else if (!(fVar instanceof com.yandex.plus.home.repository.api.model.c) && !(fVar instanceof com.yandex.plus.home.repository.api.model.e) && !(fVar instanceof com.yandex.plus.home.repository.api.model.b)) {
                        b6e.s();
                        return null;
                    }
                    bVar.k = 1;
                    if (rjcVar.emit(fVar, bVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                return Unit.a;
            }
        }
        bVar = new com.yandex.plus.home.graphql.user.b(this, continuation);
        Object obj22 = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.k;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(vat vatVar, Continuation continuation) {
        q qVar;
        nm6 nm6Var;
        int i;
        com.yandex.passport.internal.entities.a0 a0Var;
        boolean z;
        boolean z2;
        int i2;
        Object V;
        com.yandex.passport.internal.entities.a0 a0Var2;
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i3 = qVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qVar.p = i3 - Integer.MIN_VALUE;
                Object obj = qVar.n;
                nm6Var = nm6.a;
                i = qVar.p;
                Continuation continuation2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    a0Var = (com.yandex.passport.internal.entities.a0) vatVar.a;
                    boolean booleanValue = ((Boolean) vatVar.b).booleanValue();
                    boolean booleanValue2 = ((Boolean) vatVar.c).booleanValue();
                    ?? r7 = (booleanValue && booleanValue2) ? 1 : 0;
                    com.yandex.passport.internal.usecase.vpn.k handleVpnAppBackgroundStateUseCase = ((PassportProcessGlobalComponent) this.b).getHandleVpnAppBackgroundStateUseCase();
                    qVar.j = a0Var;
                    qVar.k = booleanValue;
                    qVar.l = booleanValue2;
                    qVar.m = r7;
                    qVar.p = 1;
                    if (handleVpnAppBackgroundStateUseCase.a(r7, qVar) != nm6Var) {
                        z = booleanValue;
                        z2 = booleanValue2;
                        i2 = r7;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = qVar.m;
                    a0Var2 = qVar.j;
                    qgg.h0(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "isVpnChallengeActivityDisabled = true", 8);
                        }
                        return Unit.a;
                    }
                    if (a0Var2 instanceof y) {
                        boolean z3 = VpnChallengeActivity.a;
                        if (!VpnChallengeActivity.a && i2 == 0) {
                            Intent m = com.yandex.plus.pay.ui.core.b.m((YMApplication) this.c, ((y) a0Var2).a);
                            m.addFlags(268435456);
                            YMApplication yMApplication = (YMApplication) this.c;
                            try {
                                r7o r7oVar = z7o.b;
                                yMApplication.startActivity(m);
                            } catch (Throwable unused) {
                                r7o r7oVar2 = z7o.b;
                            }
                        }
                    }
                    return Unit.a;
                }
                i2 = qVar.m;
                z2 = qVar.l;
                z = qVar.k;
                com.yandex.passport.internal.entities.a0 a0Var3 = qVar.j;
                qgg.h0(obj);
                a0Var = a0Var3;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.b bVar = com.yandex.passport.common.logger.b.b;
                    StringBuilder sb = new StringBuilder("checkVpnStatusUseCase ");
                    sb.append(a0Var);
                    sb.append(' ');
                    boolean z4 = VpnChallengeActivity.a;
                    dfi.t(sb, VpnChallengeActivity.a, " hostIsInBackground=", z, " passportIsInBackground=");
                    sb.append(z2);
                    com.yandex.passport.common.logger.a.c(bVar, null, sb.toString(), 8);
                }
                com.yandex.passport.internal.usecase.vpn.e checkVpnStatusUseCase = ((PassportProcessGlobalComponent) this.b).getCheckVpnStatusUseCase();
                qVar.j = a0Var;
                qVar.k = z;
                qVar.l = z2;
                qVar.m = i2;
                qVar.p = 2;
                V = x97.V(((com.yandex.passport.common.coroutine.b) checkVpnStatusUseCase.a).c, new pjt(checkVpnStatusUseCase, continuation2, 22), qVar);
                if (V != nm6Var) {
                    a0Var2 = a0Var;
                    obj = V;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
                return nm6Var;
            }
        }
        qVar = new q(this, continuation);
        Object obj2 = qVar.n;
        nm6Var = nm6.a;
        i = qVar.p;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        com.yandex.passport.internal.usecase.vpn.e checkVpnStatusUseCase2 = ((PassportProcessGlobalComponent) this.b).getCheckVpnStatusUseCase();
        qVar.j = a0Var;
        qVar.k = z;
        qVar.l = z2;
        qVar.m = i2;
        qVar.p = 2;
        V = x97.V(((com.yandex.passport.common.coroutine.b) checkVpnStatusUseCase2.a).c, new pjt(checkVpnStatusUseCase2, continuation22, 22), qVar);
        if (V != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x02f6, code lost:
    
        if (r1.emit(r2, r3) != r4) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0357, code lost:
    
        if (r1.emit(r2, r3) != r4) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03b1, code lost:
    
        if (r7 == null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x03bf, code lost:
    
        if (r7 == null) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x05b3, code lost:
    
        if (r5.emit(r2, r3) != r4) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x072c, code lost:
    
        if (r1.emit(r2, r3) != r5) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0796, code lost:
    
        if (r1.emit(r5, r3) != r4) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x07fa, code lost:
    
        if (r1.emit(r2, r3) != r4) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x085e, code lost:
    
        if (r1.emit(r2, r3) != r4) goto L440;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x096f  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0b24  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0b30  */
    /* JADX WARN: Type inference failed for: r12v11, types: [aur, pyc] */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        b bVar;
        int i;
        k kVar;
        int i2;
        int i3;
        Object sVar;
        com.yandex.passport.internal.filter.p pVar;
        int i4;
        Map map;
        com.yandex.passport.data.models.j jVar;
        com.yandex.passport.internal.ui.bouncer.model.middleware.j jVar2;
        int i5;
        rjc rjcVar;
        int i6;
        w wVar;
        int i7;
        rjc rjcVar2;
        int i8;
        j0 j0Var;
        int i9;
        rjc rjcVar3;
        int i10;
        p0 p0Var;
        int i11;
        Object b;
        rjc rjcVar4;
        int i12;
        k1 e1Var;
        Bundle extras;
        b1 b1Var;
        int i13;
        e1 e1Var2;
        int i14;
        rjc rjcVar5;
        z zVar;
        Object b2;
        int i15;
        Throwable a;
        Object sVar2;
        i1 i1Var;
        int i16;
        Object pVar2;
        Object obj2;
        Object obj3;
        o0 f0Var;
        String str;
        com.yandex.passport.sloth.data.a aVar;
        String str2;
        String str3;
        o0 l0Var;
        l1 l1Var;
        int i17;
        rjc rjcVar6;
        p1 p1Var;
        int i18;
        rjc rjcVar7;
        com.yandex.plus.core.coroutines.extensions.flow.a aVar2;
        int i19;
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.b bVar2;
        int i20;
        com.yandex.plus.pay.ui.core.debug.internal.ui.log.j jVar3;
        int i21;
        Object obj4 = obj;
        int i22 = this.a;
        int i23 = 3;
        int i24 = 0;
        int i25 = 0;
        r9 = false;
        boolean z = false;
        int i26 = 0;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i22) {
            case 0:
                if (continuation instanceof b) {
                    bVar = (b) continuation;
                    int i27 = bVar.k;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        bVar.k = i27 - Integer.MIN_VALUE;
                        Object obj7 = bVar.j;
                        nm6 nm6Var = nm6.a;
                        i = bVar.k;
                        if (i != 0) {
                            qgg.h0(obj7);
                            ((x0) obj5).getClass();
                            w0 w0Var = (w0) obj4;
                            w0Var.getClass();
                            t tVar = new t(w0Var);
                            bVar.k = 1;
                            if (((rjc) obj6).emit(tVar, bVar) == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj7);
                        }
                        return Unit.a;
                    }
                }
                bVar = new b(this, continuation);
                Object obj72 = bVar.j;
                nm6 nm6Var2 = nm6.a;
                i = bVar.k;
                if (i != 0) {
                }
                return Unit.a;
            case 1:
                if (continuation instanceof k) {
                    kVar = (k) continuation;
                    int i28 = kVar.k;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        kVar.k = i28 - Integer.MIN_VALUE;
                        Object obj8 = kVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = kVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj8);
                            rjc rjcVar8 = (rjc) obj6;
                            r96 r96Var = (r96) obj5;
                            h2 h2Var = (h2) r96Var.c;
                            g2 g2Var = (g2) obj4;
                            com.yandex.passport.internal.ui.bouncer.model.l1 l1Var2 = (com.yandex.passport.internal.ui.bouncer.model.l1) ((xdr) r96Var.d).getValue();
                            g2Var.getClass();
                            l1Var2.getClass();
                            com.yandex.passport.internal.ui.bouncer.model.b1 b1Var2 = l1Var2.d;
                            if (g2Var instanceof w1) {
                                l lVar = ((w1) g2Var).a;
                                sVar = (lVar.equals(l1Var2.c) || lVar.B != null) ? com.yandex.passport.internal.ui.bouncer.model.l.b : new r(lVar);
                            } else if (g2Var instanceof x1) {
                                if (b1Var2 != null) {
                                    l lVar2 = b1Var2.a;
                                    j2 j2Var = ((x1) g2Var).a;
                                    if (j2Var != null) {
                                        lVar2 = l.a(lVar2, null, null, null, 1073741567);
                                    }
                                    sVar = new c0(lVar2, null, null, null, false, false, j2Var != null ? j2Var.a : null, null, 190);
                                } else {
                                    sVar = new o("BouncerWishMapper", "No login properties on AddNewAccount", null);
                                }
                            } else if (g2Var instanceof z1) {
                                sVar = b1Var2 != null ? new com.yandex.passport.internal.ui.bouncer.model.k(((z1) g2Var).a) : new o("BouncerWishMapper", "No login properties on CreateNewProfile", null);
                            } else if (g2Var.equals(y1.b)) {
                                s sVar3 = new s(d1.a);
                                v1 v1Var = l1Var2.a;
                                if (v1Var instanceof s1) {
                                    o0 o0Var = ((s1) v1Var).a.a;
                                    if (o0Var instanceof e0) {
                                        com.yandex.passport.internal.report.reporters.l lVar3 = h2Var.a;
                                        String valueOf = String.valueOf(((e0) o0Var).b.b);
                                        lVar3.getClass();
                                        valueOf.getClass();
                                        lVar3.n(w9.d, new com.yandex.passport.internal.report.c(valueOf, 3));
                                    }
                                }
                                sVar = sVar3;
                            } else if (g2Var instanceof d2) {
                                d2 d2Var = (d2) g2Var;
                                sVar = new com.yandex.passport.internal.ui.bouncer.model.d(d2Var.a, d2Var.b);
                            } else if (g2Var instanceof f2) {
                                f2 f2Var = (f2) g2Var;
                                sVar = new com.yandex.passport.internal.ui.bouncer.model.i(f2Var.a, f2Var.b, com.yandex.passport.api.w0.a);
                            } else if (g2Var instanceof e2) {
                                e2 e2Var = (e2) g2Var;
                                sVar = new com.yandex.passport.internal.ui.bouncer.model.y(e2Var.a, e2Var.b);
                            } else if (g2Var instanceof a2) {
                                sVar = new m(((a2) g2Var).a);
                            } else if (g2Var.equals(y1.a)) {
                                sVar = b1Var2 != null ? new r(b1Var2.a) : new o("BouncerWishMapper", "No login properties on Back", null);
                            } else if (g2Var.equals(y1.c)) {
                                sVar = com.yandex.passport.internal.ui.bouncer.model.w.a;
                            } else {
                                if (!(g2Var instanceof c2)) {
                                    if (g2Var instanceof b2) {
                                        b2 b2Var = (b2) g2Var;
                                        if (!b2Var.b) {
                                            i3 = 1;
                                            sVar = new s(g1.a);
                                        } else if (b1Var2 != null) {
                                            i3 = 1;
                                            sVar = new com.yandex.passport.internal.ui.bouncer.model.f(b1Var2, b2Var.a, b2Var.c, true);
                                        } else {
                                            xq0.q("internal error: no loginParameters in state");
                                        }
                                        kVar.k = i3;
                                        if (rjcVar8.emit(sVar, kVar) == nm6Var3) {
                                            return nm6Var3;
                                        }
                                    } else {
                                        b6e.s();
                                    }
                                    return null;
                                }
                                c2 c2Var = (c2) g2Var;
                                sVar = new u(c2Var.a, c2Var.b);
                            }
                            i3 = 1;
                            kVar.k = i3;
                            if (rjcVar8.emit(sVar, kVar) == nm6Var3) {
                            }
                        } else {
                            if (i2 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj8);
                        }
                        return Unit.a;
                    }
                }
                kVar = new k(this, continuation);
                Object obj82 = kVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = kVar.k;
                if (i2 != 0) {
                }
                return Unit.a;
            case 2:
                return b((vat) obj4, continuation);
            case 3:
                if (continuation instanceof com.yandex.passport.internal.filter.p) {
                    pVar = (com.yandex.passport.internal.filter.p) continuation;
                    int i29 = pVar.k;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        pVar.k = i29 - Integer.MIN_VALUE;
                        Object obj9 = pVar.j;
                        Object obj10 = nm6.a;
                        i4 = pVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj9);
                            rjc rjcVar9 = (rjc) obj6;
                            String str4 = (String) ((hmm) obj4).a(com.yandex.passport.internal.filter.r.f);
                            if (str4 != null) {
                                ((com.yandex.passport.internal.filter.r) obj5).getClass();
                                Map map2 = (Map) x3f.d.b(com.yandex.passport.internal.filter.m.a, str4);
                                map = new LinkedHashMap(tah.a(map2.size()));
                                for (Map.Entry entry : map2.entrySet()) {
                                    Object key = entry.getKey();
                                    com.yandex.passport.internal.filter.u uVar = (com.yandex.passport.internal.filter.u) entry.getValue();
                                    Set set = uVar.a;
                                    if (set != null) {
                                        jVar = new com.yandex.passport.data.models.j(com.yandex.passport.data.models.i.a, set);
                                    } else {
                                        com.yandex.passport.data.models.i iVar = com.yandex.passport.data.models.i.b;
                                        Set set2 = uVar.b;
                                        set2.getClass();
                                        jVar = new com.yandex.passport.data.models.j(iVar, set2);
                                    }
                                    map.put(key, jVar);
                                }
                            } else {
                                map = e5b.a;
                                map.getClass();
                            }
                            pVar.k = 1;
                            if (rjcVar9.emit(map, pVar) == obj10) {
                                return obj10;
                            }
                        } else {
                            if (i4 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj9);
                        }
                        return Unit.a;
                    }
                }
                pVar = new com.yandex.passport.internal.filter.p(this, continuation);
                Object obj92 = pVar.j;
                Object obj102 = nm6.a;
                i4 = pVar.k;
                if (i4 != 0) {
                }
                return Unit.a;
            case 4:
                ((Boolean) obj4).getClass();
                com.yandex.passport.internal.ui.bouncer.loading.i iVar2 = (com.yandex.passport.internal.ui.bouncer.loading.i) obj6;
                Button button = iVar2.l.h;
                if (!((t1) obj5).a) {
                    ldg.B(button, new qs(iVar2, null, 17));
                    if (button.getVisibility() == 0) {
                        button.setAlpha(0.0f);
                        com.yandex.plus.pay.ui.core.b.i(button);
                    }
                }
                return Unit.a;
            case 5:
                if (continuation instanceof com.yandex.passport.internal.ui.bouncer.model.middleware.j) {
                    jVar2 = (com.yandex.passport.internal.ui.bouncer.model.middleware.j) continuation;
                    int i30 = jVar2.k;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        jVar2.k = i30 - Integer.MIN_VALUE;
                        Object obj11 = jVar2.j;
                        nm6 nm6Var4 = nm6.a;
                        i5 = jVar2.k;
                        if (i5 != 0) {
                            qgg.h0(obj11);
                            rjc rjcVar10 = (rjc) obj6;
                            jVar2.m = rjcVar10;
                            jVar2.n = 0;
                            jVar2.k = 1;
                            Object b3 = com.yandex.passport.internal.ui.bouncer.model.middleware.l.b((com.yandex.passport.internal.ui.bouncer.model.middleware.l) obj5, (com.yandex.passport.internal.ui.bouncer.model.f) obj4, jVar2);
                            if (b3 != nm6Var4) {
                                obj11 = b3;
                                rjcVar = rjcVar10;
                                i6 = 0;
                            }
                            return nm6Var4;
                        }
                        if (i5 != 1) {
                            if (i5 == 2) {
                                qgg.h0(obj11);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i6 = jVar2.n;
                        rjcVar = jVar2.m;
                        qgg.h0(obj11);
                        jVar2.m = null;
                        jVar2.n = i6;
                        jVar2.k = 2;
                        break;
                    }
                }
                jVar2 = new com.yandex.passport.internal.ui.bouncer.model.middleware.j(this, continuation);
                Object obj112 = jVar2.j;
                nm6 nm6Var42 = nm6.a;
                i5 = jVar2.k;
                if (i5 != 0) {
                }
                jVar2.m = null;
                jVar2.n = i6;
                jVar2.k = 2;
            case 6:
                if (continuation instanceof w) {
                    wVar = (w) continuation;
                    int i31 = wVar.k;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        wVar.k = i31 - Integer.MIN_VALUE;
                        Object obj12 = wVar.j;
                        nm6 nm6Var5 = nm6.a;
                        i7 = wVar.k;
                        if (i7 != 0) {
                            qgg.h0(obj12);
                            rjc rjcVar11 = (rjc) obj6;
                            wVar.m = rjcVar11;
                            wVar.n = 0;
                            wVar.k = 1;
                            Object b4 = com.yandex.passport.internal.ui.bouncer.model.middleware.y.b((com.yandex.passport.internal.ui.bouncer.model.middleware.y) obj5, (n) obj4, wVar);
                            if (b4 != nm6Var5) {
                                obj12 = b4;
                                rjcVar2 = rjcVar11;
                                i8 = 0;
                            }
                            return nm6Var5;
                        }
                        if (i7 != 1) {
                            if (i7 == 2) {
                                qgg.h0(obj12);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i8 = wVar.n;
                        rjcVar2 = wVar.m;
                        qgg.h0(obj12);
                        wVar.m = null;
                        wVar.n = i8;
                        wVar.k = 2;
                        break;
                    }
                }
                wVar = new w(this, continuation);
                Object obj122 = wVar.j;
                nm6 nm6Var52 = nm6.a;
                i7 = wVar.k;
                if (i7 != 0) {
                }
                wVar.m = null;
                wVar.n = i8;
                wVar.k = 2;
            case 7:
                if (continuation instanceof j0) {
                    j0Var = (j0) continuation;
                    int i32 = j0Var.k;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        j0Var.k = i32 - Integer.MIN_VALUE;
                        Object obj13 = j0Var.j;
                        nm6 nm6Var6 = nm6.a;
                        i9 = j0Var.k;
                        if (i9 != 0) {
                            qgg.h0(obj13);
                            rjc rjcVar12 = (rjc) obj6;
                            j0Var.m = rjcVar12;
                            j0Var.n = 0;
                            j0Var.k = 1;
                            Object b5 = l0.b((l0) obj5, (r) obj4, j0Var);
                            if (b5 != nm6Var6) {
                                obj13 = b5;
                                rjcVar3 = rjcVar12;
                                i10 = 0;
                            }
                            return nm6Var6;
                        }
                        if (i9 != 1) {
                            if (i9 == 2) {
                                qgg.h0(obj13);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i10 = j0Var.n;
                        rjcVar3 = j0Var.m;
                        qgg.h0(obj13);
                        f0 f0Var2 = new f0((com.yandex.passport.internal.ui.bouncer.model.b1) obj13);
                        j0Var.m = null;
                        j0Var.n = i10;
                        j0Var.k = 2;
                        break;
                    }
                }
                j0Var = new j0(this, continuation);
                Object obj132 = j0Var.j;
                nm6 nm6Var62 = nm6.a;
                i9 = j0Var.k;
                if (i9 != 0) {
                }
                f0 f0Var22 = new f0((com.yandex.passport.internal.ui.bouncer.model.b1) obj132);
                j0Var.m = null;
                j0Var.n = i10;
                j0Var.k = 2;
            case 8:
                if (continuation instanceof p0) {
                    p0Var = (p0) continuation;
                    int i33 = p0Var.k;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        p0Var.k = i33 - Integer.MIN_VALUE;
                        Object obj14 = p0Var.j;
                        nm6 nm6Var7 = nm6.a;
                        i11 = p0Var.k;
                        if (i11 != 0) {
                            qgg.h0(obj14);
                            rjc rjcVar13 = (rjc) obj6;
                            u uVar2 = (u) obj4;
                            r0 r0Var = (r0) obj5;
                            p0Var.m = rjcVar13;
                            p0Var.n = 0;
                            p0Var.k = 1;
                            int i34 = uVar2.a;
                            if (i34 == -1) {
                                b = r0Var.b(uVar2, p0Var);
                            } else if (i34 != 13) {
                                b = new s(new com.yandex.passport.internal.ui.bouncer.model.e1("ProcessFallbackResultMiddleware", "Unknown result code: " + uVar2.a));
                            } else {
                                Intent intent = uVar2.b;
                                if (intent != null && (extras = intent.getExtras()) != null) {
                                    Serializable serializable = extras.getSerializable(Constants.KEY_EXCEPTION);
                                    if (!(serializable instanceof Exception)) {
                                        serializable = null;
                                    }
                                    Exception exc = (Exception) serializable;
                                    if (exc != null) {
                                        e1Var = new com.yandex.passport.internal.ui.bouncer.model.f1(exc);
                                        com.yandex.passport.internal.report.reporters.m mVar = r0Var.b;
                                        mVar.getClass();
                                        mVar.n(h4.d, new ff(!(e1Var instanceof com.yandex.passport.internal.ui.bouncer.model.f1) ? ((com.yandex.passport.internal.ui.bouncer.model.f1) e1Var).a : new Exception("No exception in fallback")));
                                        b = new s(e1Var);
                                    }
                                }
                                e1Var = new com.yandex.passport.internal.ui.bouncer.model.e1("ProcessFallbackResultMiddleware", "No exception in fallback");
                                com.yandex.passport.internal.report.reporters.m mVar2 = r0Var.b;
                                mVar2.getClass();
                                mVar2.n(h4.d, new ff(!(e1Var instanceof com.yandex.passport.internal.ui.bouncer.model.f1) ? ((com.yandex.passport.internal.ui.bouncer.model.f1) e1Var).a : new Exception("No exception in fallback")));
                                b = new s(e1Var);
                            }
                            if (b != nm6Var7) {
                                obj14 = b;
                                rjcVar4 = rjcVar13;
                                i12 = 0;
                            }
                            return nm6Var7;
                        }
                        if (i11 != 1) {
                            if (i11 == 2) {
                                qgg.h0(obj14);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i12 = p0Var.n;
                        rjcVar4 = p0Var.m;
                        qgg.h0(obj14);
                        p0Var.m = null;
                        p0Var.n = i12;
                        p0Var.k = 2;
                        break;
                    }
                }
                p0Var = new p0(this, continuation);
                Object obj142 = p0Var.j;
                nm6 nm6Var72 = nm6.a;
                i11 = p0Var.k;
                if (i11 != 0) {
                }
                p0Var.m = null;
                p0Var.n = i12;
                p0Var.k = 2;
                break;
            case 9:
                if (continuation instanceof b1) {
                    b1Var = (b1) continuation;
                    int i35 = b1Var.k;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        b1Var.k = i35 - Integer.MIN_VALUE;
                        Object obj15 = b1Var.j;
                        nm6 nm6Var8 = nm6.a;
                        i13 = b1Var.k;
                        if (i13 != 0) {
                            qgg.h0(obj15);
                            rjc rjcVar14 = (rjc) obj6;
                            com.yandex.passport.internal.ui.bouncer.model.d dVar = (com.yandex.passport.internal.ui.bouncer.model.d) obj4;
                            com.yandex.passport.internal.report.reporters.k kVar2 = ((c1) obj5).a;
                            long j = dVar.a.b.b;
                            List list = dVar.b;
                            kVar2.getClass();
                            list.getClass();
                            com.yandex.passport.internal.report.j2 j2Var2 = com.yandex.passport.internal.report.j2.d;
                            com.yandex.passport.internal.report.c cVar = new com.yandex.passport.internal.report.c(String.valueOf(j), 3);
                            List list2 = list;
                            ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((com.yandex.passport.internal.badges.a) it.next()).a);
                            }
                            kVar2.n(j2Var2, cVar, new com.yandex.passport.internal.report.a(arrayList));
                            com.yandex.passport.internal.ui.bouncer.model.h hVar = new com.yandex.passport.internal.ui.bouncer.model.h(dVar.a, com.yandex.passport.api.w0.a);
                            b1Var.k = 1;
                            if (rjcVar14.emit(hVar, b1Var) == nm6Var8) {
                                return nm6Var8;
                            }
                        } else {
                            if (i13 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj15);
                        }
                        return Unit.a;
                    }
                }
                b1Var = new b1(this, continuation);
                Object obj152 = b1Var.j;
                nm6 nm6Var82 = nm6.a;
                i13 = b1Var.k;
                if (i13 != 0) {
                }
                return Unit.a;
            case 10:
                if (continuation instanceof e1) {
                    e1Var2 = (e1) continuation;
                    int i36 = e1Var2.k;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        e1Var2.k = i36 - Integer.MIN_VALUE;
                        Object obj16 = e1Var2.j;
                        nm6 nm6Var9 = nm6.a;
                        i14 = e1Var2.k;
                        if (i14 != 0) {
                            qgg.h0(obj16);
                            rjcVar5 = (rjc) obj6;
                            zVar = (z) obj4;
                            com.yandex.passport.internal.l lVar4 = zVar.a.a;
                            e1Var2.m = rjcVar5;
                            e1Var2.n = zVar;
                            e1Var2.o = 0;
                            e1Var2.k = 1;
                            b2 = com.yandex.passport.internal.ui.bouncer.model.middleware.g1.b((com.yandex.passport.internal.ui.bouncer.model.middleware.g1) obj5, lVar4, e1Var2);
                            if (b2 != nm6Var9) {
                                i15 = 0;
                            }
                            return nm6Var9;
                        }
                        if (i14 != 1) {
                            if (i14 == 2) {
                                qgg.h0(obj16);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i15 = e1Var2.o;
                        zVar = e1Var2.n;
                        rjcVar5 = e1Var2.m;
                        qgg.h0(obj16);
                        b2 = ((z7o) obj16).a;
                        a = z7o.a(b2);
                        if (a != null) {
                            sVar2 = new i0(zVar.a);
                        } else {
                            sVar2 = new s(new com.yandex.passport.internal.ui.bouncer.model.f1(a));
                        }
                        e1Var2.m = null;
                        e1Var2.n = null;
                        e1Var2.o = i15;
                        e1Var2.k = 2;
                        break;
                    }
                }
                e1Var2 = new e1(this, continuation);
                Object obj162 = e1Var2.j;
                nm6 nm6Var92 = nm6.a;
                i14 = e1Var2.k;
                if (i14 != 0) {
                }
                a = z7o.a(b2);
                if (a != null) {
                }
                e1Var2.m = null;
                e1Var2.n = null;
                e1Var2.o = i15;
                e1Var2.k = 2;
            case 11:
                if (continuation instanceof i1) {
                    i1Var = (i1) continuation;
                    int i37 = i1Var.k;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        i1Var.k = i37 - Integer.MIN_VALUE;
                        Object obj17 = i1Var.j;
                        nm6 nm6Var10 = nm6.a;
                        i16 = i1Var.k;
                        if (i16 != 0) {
                            qgg.h0(obj17);
                            rjc rjcVar15 = (rjc) obj6;
                            c0 c0Var = (c0) obj4;
                            j1 j1Var = (j1) obj5;
                            l lVar5 = c0Var.a;
                            List list3 = c0Var.b;
                            com.yandex.passport.internal.l lVar6 = c0Var.c;
                            com.yandex.passport.internal.properties.f0 f0Var3 = lVar5.o;
                            com.yandex.passport.internal.entities.k kVar3 = lVar5.d;
                            com.yandex.passport.api.w1 w1Var = lVar5.j;
                            if (f0Var3.a == null && w1Var == null && !kVar3.b(com.yandex.passport.api.n.PHONISH)) {
                                if (lVar6 != null) {
                                    Object f = lVar6.f();
                                    obj2 = f;
                                    break;
                                }
                                obj2 = Boolean.FALSE;
                                if (obj2 != com.yandex.passport.api.n.SOCIAL) {
                                    if (lVar6 != null) {
                                        Object f2 = lVar6.f();
                                        obj3 = f2;
                                        break;
                                    }
                                    obj3 = Boolean.FALSE;
                                    if (obj3 != com.yandex.passport.api.n.MAILISH) {
                                        x xVar = j1Var.a;
                                        com.yandex.passport.internal.properties.h hVar2 = lVar5.q;
                                        k0 k0Var = lVar5.p;
                                        String str5 = lVar5.k;
                                        if (hVar2 != null) {
                                            com.yandex.passport.api.z1 z1Var = hVar2.b;
                                            com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L(z1Var);
                                            com.yandex.passport.internal.l lVar7 = c0Var.d;
                                            l0Var = new e0(L, lVar7 != null ? lVar7.h() : 0L, hVar2.c, hVar2.d, com.yandex.plus.core.network.api.utils.a.h(xVar, lVar5));
                                            com.yandex.passport.internal.report.reporters.l lVar8 = j1Var.c;
                                            String valueOf2 = String.valueOf(z1Var.b);
                                            lVar8.getClass();
                                            valueOf2.getClass();
                                            lVar8.n(p2.d, new com.yandex.passport.internal.report.c(valueOf2, 3));
                                        } else {
                                            v vVar = lVar5.t;
                                            if (vVar != null) {
                                                l0Var = new com.yandex.passport.sloth.data.l0(vVar.a, vVar.b, vVar.c, vVar.d, com.yandex.plus.core.network.api.utils.a.h(xVar, lVar5));
                                            } else {
                                                if (lVar5.i) {
                                                    com.yandex.passport.sloth.dependencies.e h = com.yandex.plus.core.network.api.utils.a.h(xVar, lVar5);
                                                    boolean z2 = !list3.isEmpty();
                                                    com.yandex.passport.common.core.f fVar = c0Var.g;
                                                    if (fVar != null) {
                                                        com.yandex.passport.internal.l e = j1Var.d.b(false).e(fVar);
                                                        aVar = new com.yandex.passport.sloth.data.a(fVar, e != null ? e.c : null);
                                                    } else {
                                                        aVar = null;
                                                    }
                                                    String str6 = c0Var.h;
                                                    if (str6 != null) {
                                                        try {
                                                            com.yandex.passport.common.url.a aVar3 = com.yandex.passport.common.url.b.Companion;
                                                            Uri parse = Uri.parse(str6);
                                                            aVar3.getClass();
                                                            str2 = com.yandex.passport.common.url.a.a(parse);
                                                        } catch (Exception unused) {
                                                            str2 = null;
                                                        }
                                                        com.yandex.passport.common.url.b bVar3 = str2 != null ? new com.yandex.passport.common.url.b(str2) : null;
                                                        if (bVar3 != null) {
                                                            str3 = bVar3.a;
                                                            f0Var = new com.yandex.passport.sloth.data.i0(h, z2, aVar, str3);
                                                        }
                                                    }
                                                    str3 = null;
                                                    f0Var = new com.yandex.passport.sloth.data.i0(h, z2, aVar, str3);
                                                } else {
                                                    com.yandex.passport.api.z1 z1Var2 = lVar5.g;
                                                    if (z1Var2 != null) {
                                                        if (lVar6 != null && (str = lVar6.e.i) != null) {
                                                            str5 = str;
                                                        }
                                                        f0Var = new com.yandex.passport.sloth.data.j0(str5, com.yandex.plus.pay.ui.core.b.L(z1Var2), k0Var.p, com.yandex.plus.core.network.api.utils.a.h(xVar, lVar5));
                                                    } else {
                                                        f0Var = k0Var.j ? new com.yandex.passport.sloth.data.f0(com.yandex.plus.core.network.api.utils.a.h(xVar, lVar5)) : new com.yandex.passport.sloth.data.b0(str5, com.yandex.plus.core.network.api.utils.a.h(xVar, lVar5), !list3.isEmpty());
                                                    }
                                                }
                                                pVar2 = new g0(new com.yandex.passport.sloth.data.m(f0Var, com.yandex.plus.core.network.api.utils.a.L(kVar3.a), com.yandex.plus.core.network.api.utils.a.J(lVar5.u, ((Boolean) j1Var.b.b(com.yandex.passport.internal.flags.o.y)).booleanValue()), 4));
                                                i1Var.k = 1;
                                                if (rjcVar15.emit(pVar2, i1Var) == nm6Var10) {
                                                    return nm6Var10;
                                                }
                                            }
                                        }
                                        f0Var = l0Var;
                                        pVar2 = new g0(new com.yandex.passport.sloth.data.m(f0Var, com.yandex.plus.core.network.api.utils.a.L(kVar3.a), com.yandex.plus.core.network.api.utils.a.J(lVar5.u, ((Boolean) j1Var.b.b(com.yandex.passport.internal.flags.o.y)).booleanValue()), 4));
                                        i1Var.k = 1;
                                        if (rjcVar15.emit(pVar2, i1Var) == nm6Var10) {
                                        }
                                    }
                                }
                            }
                            pVar2 = new com.yandex.passport.internal.ui.bouncer.model.p(new com.yandex.passport.internal.ui.bouncer.model.p1(lVar5, c0Var.f, list3, c0Var.c, c0Var.e, w1Var != null ? new com.yandex.passport.internal.ui.domik.q(com.yandex.passport.internal.y.a(w1Var)) : null, 64));
                            i1Var.k = 1;
                            if (rjcVar15.emit(pVar2, i1Var) == nm6Var10) {
                            }
                        } else {
                            if (i16 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj17);
                        }
                        return Unit.a;
                    }
                }
                i1Var = new i1(this, continuation);
                Object obj172 = i1Var.j;
                nm6 nm6Var102 = nm6.a;
                i16 = i1Var.k;
                if (i16 != 0) {
                }
                return Unit.a;
            case 12:
                if (continuation instanceof l1) {
                    l1Var = (l1) continuation;
                    int i38 = l1Var.k;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        l1Var.k = i38 - Integer.MIN_VALUE;
                        Object obj18 = l1Var.j;
                        nm6 nm6Var11 = nm6.a;
                        i17 = l1Var.k;
                        if (i17 != 0) {
                            qgg.h0(obj18);
                            rjc rjcVar16 = (rjc) obj6;
                            com.yandex.passport.internal.ui.bouncer.model.b1 b1Var3 = ((f0) obj4).a;
                            l1Var.m = rjcVar16;
                            l1Var.n = 0;
                            l1Var.k = 1;
                            Object b6 = n1.b((n1) obj5, b1Var3, l1Var);
                            if (b6 != nm6Var11) {
                                obj18 = b6;
                                rjcVar6 = rjcVar16;
                            }
                            return nm6Var11;
                        }
                        if (i17 != 1) {
                            if (i17 == 2) {
                                qgg.h0(obj18);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i24 = l1Var.n;
                        rjcVar6 = l1Var.m;
                        qgg.h0(obj18);
                        l1Var.m = null;
                        l1Var.n = i24;
                        l1Var.k = 2;
                        break;
                    }
                }
                l1Var = new l1(this, continuation);
                Object obj182 = l1Var.j;
                nm6 nm6Var112 = nm6.a;
                i17 = l1Var.k;
                if (i17 != 0) {
                }
                l1Var.m = null;
                l1Var.n = i24;
                l1Var.k = 2;
            case 13:
                if (continuation instanceof p1) {
                    p1Var = (p1) continuation;
                    int i39 = p1Var.k;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        p1Var.k = i39 - Integer.MIN_VALUE;
                        Object obj19 = p1Var.j;
                        nm6 nm6Var12 = nm6.a;
                        i18 = p1Var.k;
                        if (i18 != 0) {
                            qgg.h0(obj19);
                            rjc rjcVar17 = (rjc) obj6;
                            p1Var.m = rjcVar17;
                            p1Var.n = 0;
                            p1Var.k = 1;
                            Object b7 = ((com.yandex.passport.internal.ui.bouncer.model.middleware.t1) obj5).b(((g0) obj4).a, p1Var);
                            if (b7 != nm6Var12) {
                                obj19 = b7;
                                rjcVar7 = rjcVar17;
                            }
                            return nm6Var12;
                        }
                        if (i18 != 1) {
                            if (i18 == 2) {
                                qgg.h0(obj19);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i26 = p1Var.n;
                        rjcVar7 = p1Var.m;
                        qgg.h0(obj19);
                        p1Var.m = null;
                        p1Var.n = i26;
                        p1Var.k = 2;
                        break;
                    }
                }
                p1Var = new p1(this, continuation);
                Object obj192 = p1Var.j;
                nm6 nm6Var122 = nm6.a;
                i18 = p1Var.k;
                if (i18 != 0) {
                }
                p1Var.m = null;
                p1Var.n = i26;
                p1Var.k = 2;
            case 14:
                UserMenuActivity userMenuActivity = (UserMenuActivity) obj6;
                com.yandex.passport.sloth.b1 b1Var4 = (com.yandex.passport.sloth.b1) obj4;
                if (Intrinsics.d(b1Var4, com.yandex.passport.sloth.e.a)) {
                    com.yandex.passport.internal.ui.a.r(userMenuActivity, com.yandex.plus.core.network.api.utils.a.G(com.yandex.passport.api.d2.a));
                } else if (b1Var4 instanceof y0) {
                    y0 y0Var = (y0) b1Var4;
                    com.yandex.passport.internal.ui.a.r(userMenuActivity, com.yandex.plus.core.network.api.utils.a.G(new com.yandex.passport.api.g2(y0Var.a, y0Var.b)));
                } else if (Intrinsics.d(b1Var4, com.yandex.passport.sloth.c.a)) {
                    com.yandex.passport.internal.ui.sloth.menu.e eVar = userMenuActivity.b;
                    if (eVar == null) {
                        Intrinsics.j("component");
                        throw null;
                    }
                    eVar.getUiController().a(new com.yandex.passport.internal.ui.sloth.menu.c(0, userMenuActivity), false);
                } else if (b1Var4 instanceof com.yandex.passport.sloth.m) {
                    com.yandex.passport.sloth.k kVar4 = (com.yandex.passport.sloth.k) CollectionsKt.firstOrNull(((com.yandex.passport.sloth.m) b1Var4).a);
                    if (kVar4 != null && Intrinsics.d(kVar4.a, "lost_connection")) {
                        z = true;
                    }
                    com.yandex.passport.internal.ui.sloth.menu.e eVar2 = userMenuActivity.b;
                    if (eVar2 == null) {
                        Intrinsics.j("component");
                        throw null;
                    }
                    eVar2.getUiController().a(new m3(i23, userMenuActivity, b1Var4), z);
                } else {
                    ((o1) obj5).u(com.yandex.passport.sloth.g.a(b1Var4), com.yandex.passport.internal.report.reporters.n1.USER_MENU);
                }
                return Unit.a;
            case 15:
                int intValue = ((Number) obj4).intValue();
                ManagingPlusDevicesHelperActivity managingPlusDevicesHelperActivity = (ManagingPlusDevicesHelperActivity) obj6;
                if (intValue == -1) {
                    ((com.yandex.passport.internal.ui.sloth.plusdevices.j) managingPlusDevicesHelperActivity.e.getValue()).G(new com.yandex.passport.internal.ui.sloth.plusdevices.h(false, (com.yandex.passport.internal.properties.o) obj5));
                } else {
                    managingPlusDevicesHelperActivity.setResult(intValue);
                    managingPlusDevicesHelperActivity.finish();
                }
                return Unit.a;
            case 16:
                Object q = com.yandex.passport.sloth.ui.b0.q((com.yandex.passport.sloth.ui.b0) obj6, (com.yandex.passport.sloth.ui.a1) obj5, (com.yandex.passport.sloth.u) obj4, continuation);
                return q == nm6.a ? q : Unit.a;
            case 17:
                xqn xqnVar = (xqn) obj5;
                if (continuation instanceof com.yandex.plus.core.coroutines.extensions.flow.a) {
                    aVar2 = (com.yandex.plus.core.coroutines.extensions.flow.a) continuation;
                    int i40 = aVar2.m;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        aVar2.m = i40 - Integer.MIN_VALUE;
                        Object obj20 = aVar2.k;
                        nm6 nm6Var13 = nm6.a;
                        i19 = aVar2.m;
                        if (i19 != 0) {
                            qgg.h0(obj20);
                            com.yandex.plus.core.coroutines.extensions.flow.b bVar4 = new com.yandex.plus.core.coroutines.extensions.flow.b(xqnVar.a, obj4);
                            aVar2.j = obj4;
                            aVar2.m = 1;
                            if (((rjc) obj6).emit(bVar4, aVar2) == nm6Var13) {
                                return nm6Var13;
                            }
                        } else {
                            if (i19 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj4 = aVar2.j;
                            qgg.h0(obj20);
                        }
                        xqnVar.a = obj4;
                        return Unit.a;
                    }
                }
                aVar2 = new com.yandex.plus.core.coroutines.extensions.flow.a(this, continuation);
                Object obj202 = aVar2.k;
                nm6 nm6Var132 = nm6.a;
                i19 = aVar2.m;
                if (i19 != 0) {
                }
                xqnVar.a = obj4;
                return Unit.a;
            case 18:
                Object invoke = ((aur) obj6).invoke((mm6) obj5, obj4, continuation);
                return invoke == nm6.a ? invoke : Unit.a;
            case 19:
                com.yandex.plus.ui.core.theme.a aVar4 = (com.yandex.plus.ui.core.theme.a) obj4;
                com.yandex.plus.home.api.panel.g gVar = ((com.yandex.plus.home.feature.panel.internal.f) obj6).i;
                com.yandex.plus.home.repository.api.model.panel.i iVar3 = (com.yandex.plus.home.repository.api.model.panel.i) obj5;
                gVar.getClass();
                iVar3.getClass();
                aVar4.getClass();
                com.yandex.plus.log.api.b bVar5 = gVar.z;
                com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.b;
                if (bVar5.b(aVar5)) {
                    bVar5.c(aVar5, "PlusPanelView", "updatePanelTheme() theme=" + aVar4);
                }
                for (Object obj21 : iVar3.c) {
                    int i41 = i25 + 1;
                    if (i25 < 0) {
                        u75.n();
                        throw null;
                    }
                    com.yandex.plus.home.repository.api.model.panel.b0 b0Var = (com.yandex.plus.home.repository.api.model.panel.b0) obj21;
                    View childAt = gVar.getChildAt(i25);
                    com.yandex.plus.home.feature.panel.internal.sections.l lVar9 = childAt instanceof com.yandex.plus.home.feature.panel.internal.sections.l ? (com.yandex.plus.home.feature.panel.internal.sections.l) childAt : null;
                    if (lVar9 != null) {
                        lVar9.w(aVar4);
                        if (lVar9.D == com.yandex.plus.home.feature.panel.internal.sections.j.c) {
                            lVar9.y();
                        } else {
                            lVar9.x(iVar3, b0Var);
                        }
                    }
                    i25 = i41;
                }
                return Unit.a;
            case 20:
                d5 d5Var = (d5) obj4;
                rjc rjcVar18 = (rjc) obj6;
                if (((String) obj5).equals(d5Var.b)) {
                    Object emit = rjcVar18.emit(new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.i(d5Var.a, d5Var.c, d5Var.d), continuation);
                    return emit == nm6.a ? emit : Unit.a;
                }
                Object emit2 = rjcVar18.emit(null, continuation);
                return emit2 == nm6.a ? emit2 : Unit.a;
            case 21:
                if (continuation instanceof com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.b) {
                    bVar2 = (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.b) continuation;
                    int i42 = bVar2.k;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        bVar2.k = i42 - Integer.MIN_VALUE;
                        Object obj22 = bVar2.j;
                        nm6 nm6Var14 = nm6.a;
                        i20 = bVar2.k;
                        if (i20 != 0) {
                            qgg.h0(obj22);
                            rjc rjcVar19 = (rjc) obj6;
                            if (((Boolean) ((Function1) obj5).invoke((com.yandex.plus.home.feature.webviews.internal.purchase.button.section.e) obj4)).booleanValue()) {
                                bVar2.k = 1;
                                if (rjcVar19.emit(obj4, bVar2) == nm6Var14) {
                                    return nm6Var14;
                                }
                            }
                        } else {
                            if (i20 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj22);
                        }
                        return Unit.a;
                    }
                }
                bVar2 = new com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.b(this, continuation);
                Object obj222 = bVar2.j;
                nm6 nm6Var142 = nm6.a;
                i20 = bVar2.k;
                if (i20 != 0) {
                }
                return Unit.a;
            case 22:
                return c(obj, continuation);
            case 23:
                return d(obj, continuation);
            case 24:
                return e(obj, continuation);
            case 25:
                return f(obj, continuation);
            default:
                if (continuation instanceof com.yandex.plus.pay.ui.core.debug.internal.ui.log.j) {
                    jVar3 = (com.yandex.plus.pay.ui.core.debug.internal.ui.log.j) continuation;
                    int i43 = jVar3.k;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        jVar3.k = i43 - Integer.MIN_VALUE;
                        Object obj23 = jVar3.j;
                        nm6 nm6Var15 = nm6.a;
                        i21 = jVar3.k;
                        if (i21 != 0) {
                            qgg.h0(obj23);
                            rjc rjcVar20 = (rjc) obj6;
                            com.yandex.plus.log.api.a aVar6 = (com.yandex.plus.log.api.a) obj4;
                            List list4 = ((com.yandex.plus.pay.ui.core.debug.internal.ui.log.k) obj5).k;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj24 : list4) {
                                if (((com.yandex.plus.pay.log.api.a) obj24).b.compareTo(aVar6) >= 0) {
                                    arrayList2.add(obj24);
                                }
                            }
                            com.yandex.plus.pay.ui.core.debug.internal.ui.log.i iVar4 = new com.yandex.plus.pay.ui.core.debug.internal.ui.log.i(aVar6, arrayList2);
                            jVar3.k = 1;
                            if (rjcVar20.emit(iVar4, jVar3) == nm6Var15) {
                                return nm6Var15;
                            }
                        } else {
                            if (i21 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj23);
                        }
                        return Unit.a;
                    }
                }
                jVar3 = new com.yandex.plus.pay.ui.core.debug.internal.ui.log.j(this, continuation);
                Object obj232 = jVar3.j;
                nm6 nm6Var152 = nm6.a;
                i21 = jVar3.k;
                if (i21 != 0) {
                }
                return Unit.a;
        }
    }

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public c(PassportProcessGlobalComponent passportProcessGlobalComponent, YMApplication yMApplication, mm6 mm6Var) {
        this.a = 2;
        this.b = passportProcessGlobalComponent;
        this.c = yMApplication;
    }

    public c(String str, rjc rjcVar) {
        this.a = 20;
        this.c = str;
        this.b = rjcVar;
    }
}
