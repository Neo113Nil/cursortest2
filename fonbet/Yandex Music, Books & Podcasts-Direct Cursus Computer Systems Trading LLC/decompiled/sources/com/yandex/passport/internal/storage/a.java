package com.yandex.passport.internal.storage;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Window;
import android.webkit.WebView;
import com.yandex.passport.api.r;
import com.yandex.passport.api.t;
import com.yandex.passport.api.w0;
import com.yandex.passport.api.w1;
import com.yandex.passport.api.x1;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.a0;
import com.yandex.passport.internal.properties.k0;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.id;
import com.yandex.passport.internal.report.k8;
import com.yandex.passport.internal.report.reporters.h0;
import com.yandex.passport.internal.report.reporters.o1;
import com.yandex.passport.internal.report.we;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.model.d1;
import com.yandex.passport.internal.ui.bouncer.model.f1;
import com.yandex.passport.internal.ui.bouncer.model.h1;
import com.yandex.passport.internal.ui.bouncer.model.i1;
import com.yandex.passport.internal.ui.bouncer.model.j1;
import com.yandex.passport.internal.ui.bouncer.model.j2;
import com.yandex.passport.internal.ui.bouncer.model.k1;
import com.yandex.passport.internal.ui.bouncer.model.l1;
import com.yandex.passport.internal.ui.bouncer.model.l2;
import com.yandex.passport.internal.ui.bouncer.model.m2;
import com.yandex.passport.internal.ui.bouncer.model.n2;
import com.yandex.passport.internal.ui.bouncer.model.r1;
import com.yandex.passport.internal.ui.bouncer.model.y0;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.i0;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.j0;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.u;
import com.yandex.passport.internal.ui.bouncer.s;
import com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity;
import com.yandex.passport.internal.ui.challenge.delete.v1;
import com.yandex.passport.internal.ui.challenge.vpn.x;
import com.yandex.passport.internal.ui.challenge.vpn.y;
import com.yandex.passport.internal.ui.sloth.authsdk.AuthSdkSlothActivity;
import com.yandex.passport.internal.ui.sloth.authsdk.d0;
import com.yandex.passport.internal.ui.sloth.authsdk.e0;
import com.yandex.passport.internal.ui.sloth.ebs.e1;
import com.yandex.passport.internal.ui.sloth.ebs.g1;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesSlothActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.m0;
import com.yandex.passport.internal.ui.sloth.plusdevices.n0;
import com.yandex.passport.internal.ui.sloth.webauthn.w;
import com.yandex.passport.internal.ui.sloth.webcard.g0;
import com.yandex.passport.internal.ui.sloth.webcard.s0;
import com.yandex.passport.internal.usecase.x0;
import defpackage.aqi;
import defpackage.aur;
import defpackage.avf;
import defpackage.b6e;
import defpackage.gld;
import defpackage.knn;
import defpackage.lqv;
import defpackage.mm6;
import defpackage.mqv;
import defpackage.n8g;
import defpackage.nm6;
import defpackage.nqv;
import defpackage.oqv;
import defpackage.qgg;
import defpackage.qy0;
import defpackage.r7o;
import defpackage.t75;
import defpackage.t7o;
import defpackage.t9f;
import defpackage.u75;
import defpackage.v75;
import defpackage.w3f;
import defpackage.wis;
import defpackage.x3f;
import defpackage.x97;
import defpackage.y5g;
import defpackage.yd5;
import defpackage.z7o;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class a extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
        this.l = obj2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                a aVar = new a((p) this.l, continuation, 0);
                aVar.k = obj;
                return aVar;
            case 1:
                a aVar2 = new a((ArrayList) this.l, continuation, 1);
                aVar2.k = obj;
                return aVar2;
            case 2:
                return new a((OutputStream) this.k, (Set) this.l, continuation, 2);
            case 3:
                return new a((com.yandex.passport.internal.ui.bouncer.l) this.k, (l1) this.l, continuation, 3);
            case 4:
                return new a((Function1) this.k, (j2) this.l, continuation, 4);
            case 5:
                return new a((com.yandex.passport.sloth.ui.l) this.k, (s) this.l, continuation, 5);
            case 6:
                return new a((com.yandex.passport.internal.ui.bouncer.roundabout.i) this.k, (r1) this.l, continuation, 6);
            case 7:
                return new a((Function1) this.k, (v1) this.l, continuation, 7);
            case 8:
                return new a((com.yandex.passport.internal.ui.challenge.delete.o) this.k, (com.yandex.passport.common.core.f) this.l, continuation, 8);
            case 9:
                a aVar3 = new a((DeleteForeverActivity) this.l, continuation, 9);
                aVar3.k = obj;
                return aVar3;
            case 10:
                return new a((h0) this.k, (com.yandex.passport.internal.ui.challenge.logout.bottomsheet.h0) this.l, continuation, 10);
            case 11:
                return new a((Function1) this.k, (com.yandex.passport.internal.ui.challenge.vpn.p) this.l, continuation, 11);
            case 12:
                a aVar4 = new a((com.yandex.passport.internal.social.esia.o) this.l, continuation, 12);
                aVar4.k = obj;
                return aVar4;
            case 13:
                return new a((y) this.k, (x) this.l, continuation, 13);
            case 14:
                a aVar5 = new a((WebView) this.l, continuation, 14);
                aVar5.k = obj;
                return aVar5;
            case 15:
                a aVar6 = new a((AuthSdkSlothActivity) this.l, continuation, 15);
                aVar6.k = obj;
                return aVar6;
            case 16:
                return new a((Function1) this.k, (com.yandex.passport.internal.ui.sloth.authsdk.g) this.l, continuation, 16);
            case 17:
                return new a((e0) this.k, (d0) this.l, continuation, 17);
            case 18:
                return new a((g1) this.k, (e1) this.l, continuation, 18);
            case 19:
                a aVar7 = new a((ManagingPlusDevicesSlothActivity) this.l, continuation, 19);
                aVar7.k = obj;
                return aVar7;
            case 20:
                return new a((n0) this.k, (m0) this.l, continuation, 20);
            case 21:
                return new a((com.yandex.passport.internal.ui.sloth.webauthn.k) this.k, (com.yandex.passport.common.core.f) this.l, continuation, 21);
            case 22:
                return new a((com.yandex.passport.internal.ui.sloth.webauthn.x) this.k, (w) this.l, continuation, 22);
            case 23:
                return new a((Function1) this.k, (s0) this.l, continuation, 23);
            case 24:
                return new a((Window) this.k, (aqi) this.l, continuation, 24);
            case 25:
                a aVar8 = new a((com.yandex.passport.internal.ui.sloth.webcard.n) this.l, continuation, 25);
                aVar8.k = obj;
                return aVar8;
            case 26:
                return new a((com.yandex.passport.internal.ui.sloth.webcard.h0) this.k, (g0) this.l, continuation, 26);
            case 27:
                return new a((com.yandex.passport.internal.ui.social.authenticators.c) this.k, (com.yandex.passport.common.account.a) this.l, continuation, 27);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new a((x0) this.k, (com.yandex.passport.common.core.f) this.l, continuation, 28);
            default:
                return new a((Bitmap) this.k, (Bitmap) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((a) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v33, types: [com.yandex.passport.internal.ui.bouncer.roundabout.items.k0] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r2v92 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r1 r1Var;
        Iterator it;
        com.yandex.passport.common.core.f fVar;
        u uVar;
        Object obj2;
        Object obj3;
        ?? r28;
        int i;
        u uVar2;
        ?? r2;
        ?? r22;
        u uVar3;
        y0 y0Var;
        Object obj4;
        Object obj5;
        Throwable a;
        Object t7oVar;
        int i2 = this.j;
        int i3 = 0;
        boolean z = false;
        Continuation continuation = null;
        Object obj6 = this.l;
        switch (i2) {
            case 0:
                Set set = (Set) this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                LinkedHashSet z0 = CollectionsKt.z0(set);
                z0.add((p) obj6);
                return z0;
            case 1:
                Set set2 = (Set) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                LinkedHashSet z02 = CollectionsKt.z0(set2);
                ArrayList arrayList = (ArrayList) obj6;
                Iterator it2 = z02.iterator();
                while (it2.hasNext()) {
                    p pVar = (p) it2.next();
                    if (!arrayList.contains(pVar.a) || pVar.b < System.currentTimeMillis()) {
                        it2.remove();
                    }
                }
                return z02;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                OutputStream outputStream = (OutputStream) this.k;
                w3f w3fVar = x3f.d;
                t9f serializer = p.Companion.serializer();
                serializer.getClass();
                byte[] bytes = w3fVar.c(new qy0(serializer, 2), (Set) obj6).getBytes(Charsets.UTF_8);
                bytes.getClass();
                outputStream.write(bytes);
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.internal.ui.bouncer.l lVar = (com.yandex.passport.internal.ui.bouncer.l) this.k;
                l1 l1Var = (l1) obj6;
                com.yandex.passport.internal.report.reporters.m mVar = lVar.e;
                k1 k1Var = l1Var.b;
                mVar.v(k1Var);
                BouncerActivity bouncerActivity = lVar.a;
                if (Intrinsics.d(k1Var, d1.a) || (k1Var instanceof com.yandex.passport.internal.ui.bouncer.model.e1)) {
                    lVar.c(bouncerActivity, com.yandex.passport.api.p.a);
                } else if (k1Var instanceof f1) {
                    lVar.c(bouncerActivity, new r(((f1) k1Var).a));
                } else if (Intrinsics.d(k1Var, com.yandex.passport.internal.ui.bouncer.model.g1.a)) {
                    lVar.c(bouncerActivity, com.yandex.passport.api.s.a);
                } else if (k1Var instanceof j1) {
                    j1 j1Var = (j1) k1Var;
                    com.yandex.passport.internal.l lVar2 = j1Var.a;
                    z1 J = com.yandex.plus.pay.ui.core.b.J(lVar2.b);
                    com.yandex.passport.internal.account.f B = com.yandex.plus.core.locale.b.B(lVar2);
                    w0 w0Var = j1Var.c;
                    String str = j1Var.d;
                    String str2 = j1Var.e;
                    if (str2 == null) {
                        str2 = l1Var.f;
                    }
                    lVar.c(bouncerActivity, new t(J, B, w0Var, str, str2));
                } else if (k1Var instanceof h1) {
                    h1 h1Var = (h1) k1Var;
                    lVar.c(bouncerActivity, new com.yandex.passport.api.u(h1Var.a, h1Var.b));
                } else if (!Intrinsics.d(k1Var, i1.a)) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                ((Function1) this.k).invoke((j2) obj6);
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                x97.y(gld.e(getContext()), null, null, new com.yandex.passport.internal.provider.communication.c(((com.yandex.passport.internal.sloth.n) ((com.yandex.passport.sloth.ui.l) this.k)).a, continuation, (s) obj6, 13), 3);
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.internal.ui.bouncer.roundabout.i iVar = (com.yandex.passport.internal.ui.bouncer.roundabout.i) this.k;
                r1 r1Var2 = (r1) obj6;
                List<n2> list = r1Var2.b;
                iVar.getClass();
                com.yandex.passport.internal.flags.i iVar2 = iVar.d;
                ArrayList arrayList2 = new ArrayList();
                for (n2 n2Var : list) {
                    if (n2Var instanceof l2) {
                        l2 l2Var = (l2) n2Var;
                        String str3 = l2Var.a.e.L;
                        com.yandex.passport.common.core.f fVar2 = l2Var.c;
                        y0Var = (str3 == null || fVar2 == null) ? null : new y0(fVar2, str3);
                    } else {
                        if (!(n2Var instanceof m2)) {
                            b6e.s();
                            return null;
                        }
                        m2 m2Var = (m2) n2Var;
                        y0Var = new y0(m2Var.b, m2Var.e);
                    }
                    if (y0Var != null) {
                        arrayList2.add(y0Var);
                    }
                }
                List w0 = CollectionsKt.w0(CollectionsKt.z0(arrayList2));
                List list2 = r1Var2.b;
                n8g b = t75.b();
                List list3 = list2;
                ArrayList arrayList3 = new ArrayList(v75.o(list3, 10));
                Iterator it3 = list3.iterator();
                int i4 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        ?? r17 = continuation;
                        u75.n();
                        throw r17;
                    }
                    n2 n2Var2 = (n2) next;
                    Continuation continuation2 = continuation;
                    k0 k0Var = r1Var2.a.p;
                    boolean z2 = n2Var2 instanceof l2;
                    u uVar4 = com.yandex.passport.internal.ui.bouncer.roundabout.items.r.a;
                    u uVar5 = com.yandex.passport.internal.ui.bouncer.roundabout.items.p.a;
                    u uVar6 = com.yandex.passport.internal.ui.bouncer.roundabout.items.q.a;
                    u uVar7 = com.yandex.passport.internal.ui.bouncer.roundabout.items.m.a;
                    u uVar8 = com.yandex.passport.internal.ui.bouncer.roundabout.items.n.a;
                    if (z2) {
                        l2 l2Var2 = (l2) n2Var2;
                        com.yandex.passport.internal.l lVar3 = l2Var2.a;
                        boolean o = lVar3.o();
                        com.yandex.passport.common.core.g gVar = lVar3.e;
                        if (o) {
                            obj3 = new j0(lVar3, lVar3.j, k0Var.i);
                            r1Var = r1Var2;
                            it = it3;
                            arrayList3.add(obj3);
                            i4 = i5;
                            continuation = continuation2;
                            r1Var2 = r1Var;
                            it3 = it;
                            i3 = 0;
                        } else {
                            String str4 = gVar.f;
                            String str5 = gVar.i;
                            String str6 = gVar.v;
                            String str7 = gVar.L;
                            if (str5 == null) {
                                String str8 = gVar.g;
                                r1Var = r1Var2;
                                if (str8 != null) {
                                    it = it3;
                                    if (StringsKt.M(str8, "@", false)) {
                                        r28 = str8;
                                    }
                                } else {
                                    it = it3;
                                }
                                r28 = continuation2;
                            } else {
                                r1Var = r1Var2;
                                it = it3;
                                r28 = str5;
                            }
                            String g = lVar3.g();
                            boolean z3 = gVar.p && k0Var.m.d;
                            if (str5 != null) {
                                i = 1;
                                if (kotlin.text.c.n(str5, "@yandex-team.ru", false)) {
                                    uVar3 = com.yandex.passport.internal.ui.bouncer.roundabout.items.t.a;
                                    uVar2 = uVar3;
                                    obj2 = new com.yandex.passport.internal.ui.bouncer.roundabout.items.h0(lVar3, str4, str6, str7, r28, g, z3, uVar2, k0Var.i, l2Var2.b, iVar.a(n2Var2, list2, i4));
                                }
                            } else {
                                i = 1;
                            }
                            int ordinal = lVar3.f().ordinal();
                            if (ordinal != 0) {
                                if (ordinal != i) {
                                    if (ordinal == 2) {
                                        String k = lVar3.k();
                                        if (k != null) {
                                            x1 x1Var = x1.VKONTAKTE;
                                            if (k.equals("vk")) {
                                                r2 = w1.a;
                                            } else if (k.equals("fb")) {
                                                r2 = w1.b;
                                            } else if (k.equals("tw")) {
                                                r2 = w1.c;
                                            } else if (k.equals("ok")) {
                                                r2 = w1.d;
                                            } else if (k.equals("gg")) {
                                                r2 = w1.f;
                                            } else if (k.equals("mr")) {
                                                r2 = w1.e;
                                            } else if (k.equals("esia")) {
                                                r2 = w1.g;
                                            } else if (k.equals("tv1001")) {
                                                r2 = w1.h;
                                            }
                                            switch (r2 != 0 ? -1 : com.yandex.passport.internal.ui.bouncer.roundabout.h.a[r2.ordinal()]) {
                                                case 1:
                                                    r22 = com.yandex.passport.internal.ui.bouncer.roundabout.items.k0.a;
                                                    break;
                                                case 2:
                                                    r22 = com.yandex.passport.internal.ui.bouncer.roundabout.items.k0.b;
                                                    break;
                                                case 3:
                                                    r22 = com.yandex.passport.internal.ui.bouncer.roundabout.items.k0.c;
                                                    break;
                                                case 4:
                                                    r22 = com.yandex.passport.internal.ui.bouncer.roundabout.items.k0.d;
                                                    break;
                                                case 5:
                                                    r22 = com.yandex.passport.internal.ui.bouncer.roundabout.items.k0.e;
                                                    break;
                                                case 6:
                                                    r22 = com.yandex.passport.internal.ui.bouncer.roundabout.items.k0.f;
                                                    break;
                                                case 7:
                                                    r22 = com.yandex.passport.internal.ui.bouncer.roundabout.items.k0.g;
                                                    break;
                                                case 8:
                                                    r22 = com.yandex.passport.internal.ui.bouncer.roundabout.items.k0.h;
                                                    break;
                                                default:
                                                    r22 = continuation2;
                                                    break;
                                            }
                                            if (r22 != 0) {
                                                uVar2 = new com.yandex.passport.internal.ui.bouncer.roundabout.items.s(r22);
                                            }
                                            uVar2 = uVar8;
                                        }
                                        r2 = continuation2;
                                        switch (r2 != 0 ? -1 : com.yandex.passport.internal.ui.bouncer.roundabout.h.a[r2.ordinal()]) {
                                        }
                                        if (r22 != 0) {
                                        }
                                        uVar2 = uVar8;
                                    } else if (ordinal != 3) {
                                        if (ordinal == 7) {
                                            uVar2 = uVar7;
                                        }
                                        uVar2 = uVar8;
                                    } else {
                                        uVar2 = uVar6;
                                    }
                                    arrayList3.add(obj3);
                                    i4 = i5;
                                    continuation = continuation2;
                                    r1Var2 = r1Var;
                                    it3 = it;
                                    i3 = 0;
                                } else {
                                    uVar2 = uVar5;
                                }
                                obj2 = new com.yandex.passport.internal.ui.bouncer.roundabout.items.h0(lVar3, str4, str6, str7, r28, g, z3, uVar2, k0Var.i, l2Var2.b, iVar.a(n2Var2, list2, i4));
                            } else {
                                uVar3 = uVar4;
                                if (gVar.h != 1) {
                                    uVar3 = com.yandex.passport.internal.ui.bouncer.roundabout.items.o.a;
                                }
                                uVar2 = uVar3;
                                obj2 = new com.yandex.passport.internal.ui.bouncer.roundabout.items.h0(lVar3, str4, str6, str7, r28, g, z3, uVar2, k0Var.i, l2Var2.b, iVar.a(n2Var2, list2, i4));
                            }
                        }
                    } else {
                        r1Var = r1Var2;
                        it = it3;
                        if (!(n2Var2 instanceof m2)) {
                            b6e.s();
                            return continuation2;
                        }
                        m2 m2Var2 = (m2) n2Var2;
                        com.yandex.passport.common.core.f fVar3 = m2Var2.a;
                        com.yandex.passport.common.core.f fVar4 = m2Var2.b;
                        String str9 = m2Var2.c;
                        String str10 = m2Var2.d;
                        String str11 = m2Var2.e;
                        String str12 = m2Var2.f;
                        List list4 = m2Var2.i;
                        int ordinal2 = m2Var2.g.ordinal();
                        if (ordinal2 != 0) {
                            fVar = fVar4;
                            uVar = ordinal2 != 1 ? ordinal2 != 3 ? ordinal2 != 7 ? uVar8 : uVar7 : uVar6 : uVar5;
                        } else {
                            fVar = fVar4;
                            uVar = uVar4;
                        }
                        obj2 = new i0(fVar3, fVar, str9, str10, str11, str12, list4, uVar, m2Var2.h, iVar.a(n2Var2, list2, i4));
                    }
                    obj3 = obj2;
                    arrayList3.add(obj3);
                    i4 = i5;
                    continuation = continuation2;
                    r1Var2 = r1Var;
                    it3 = it;
                    i3 = 0;
                }
                b.addAll(arrayList3);
                boolean z4 = !w0.isEmpty() && ((Boolean) iVar2.b(com.yandex.passport.internal.flags.o.a)).booleanValue() && ((Boolean) iVar2.b(com.yandex.passport.internal.flags.o.q0)).booleanValue();
                b.add(new com.yandex.passport.internal.ui.bouncer.roundabout.items.e0(z4));
                if (z4) {
                    b.add(new com.yandex.passport.internal.ui.bouncer.roundabout.items.g0(w0));
                }
                return t75.a(b);
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                ((Function1) this.k).invoke((v1) obj6);
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                return ((com.yandex.passport.internal.ui.challenge.delete.o) this.k).e.a().e((com.yandex.passport.common.core.f) obj6);
            case 9:
                mm6 mm6Var = (mm6) this.k;
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                x97.y(mm6Var, null, null, new we((DeleteForeverActivity) obj6, continuation, 6), 3);
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                h0 h0Var = (h0) this.k;
                com.yandex.passport.common.core.f fVar5 = ((com.yandex.passport.internal.ui.challenge.logout.bottomsheet.h0) obj6).a;
                com.yandex.passport.internal.report.reporters.i0 i0Var = (com.yandex.passport.internal.report.reporters.i0) h0Var;
                i0Var.getClass();
                fVar5.getClass();
                i0Var.n(k8.d, new ff(fVar5));
                return Unit.a;
            case 11:
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                ((Function1) this.k).invoke((com.yandex.passport.internal.ui.challenge.vpn.p) obj6);
                return Unit.a;
            case 12:
                com.yandex.passport.internal.social.esia.o oVar = (com.yandex.passport.internal.social.esia.o) obj6;
                a0 a0Var = (a0) this.k;
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "observeVpnStatus new status: " + a0Var, 8);
                }
                if (Intrinsics.d(a0Var, com.yandex.passport.internal.entities.x.a)) {
                    com.yandex.passport.internal.report.reporters.k1 k1Var2 = (com.yandex.passport.internal.report.reporters.k1) oVar.f;
                    k1Var2.getClass();
                    k1Var2.p(id.d);
                    oVar.i();
                }
                return Unit.a;
            case 13:
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                ((y) this.k).k.a((x) obj6);
                return Unit.a;
            case 14:
                com.yandex.passport.internal.ui.challenge.webview.k kVar = (com.yandex.passport.internal.ui.challenge.webview.k) this.k;
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                if (Intrinsics.d(kVar, com.yandex.passport.internal.ui.challenge.webview.k.a)) {
                    ((WebView) obj6).reload();
                    return Unit.a;
                }
                b6e.s();
                return null;
            case 15:
                mm6 mm6Var2 = (mm6) this.k;
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                AuthSdkSlothActivity authSdkSlothActivity = (AuthSdkSlothActivity) obj6;
                Continuation continuation3 = null;
                x97.y(mm6Var2, null, null, new com.yandex.passport.internal.ui.sloth.authsdk.h(authSdkSlothActivity, continuation3, i3), 3);
                PassportProcessGlobalComponent passportProcessGlobalComponent = authSdkSlothActivity.a;
                if (passportProcessGlobalComponent == null) {
                    Intrinsics.j("globalComponent");
                    throw null;
                }
                o1 webAmReporter = passportProcessGlobalComponent.getWebAmReporter();
                x97.y(gld.e(getContext()), null, null, new com.yandex.passport.internal.ui.sloth.authsdk.j(authSdkSlothActivity.j().m, continuation3, authSdkSlothActivity, webAmReporter, 0), 3);
                return x97.y(gld.e(getContext()), null, null, new com.yandex.passport.internal.ui.sloth.authsdk.j(authSdkSlothActivity.j().n, continuation3, authSdkSlothActivity, webAmReporter, 1), 3);
            case 16:
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                ((Function1) this.k).invoke((com.yandex.passport.internal.ui.sloth.authsdk.g) obj6);
                return Unit.a;
            case 17:
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                ((e0) this.k).k.a((d0) obj6);
                return Unit.a;
            case 18:
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                ((g1) this.k).k.a((e1) obj6);
                return Unit.a;
            case 19:
                mm6 mm6Var3 = (mm6) this.k;
                nm6 nm6Var20 = nm6.a;
                qgg.h0(obj);
                return x97.y(mm6Var3, null, null, new com.yandex.passport.internal.ui.sloth.plusdevices.o((ManagingPlusDevicesSlothActivity) obj6, continuation, i3), 3);
            case 20:
                nm6 nm6Var21 = nm6.a;
                qgg.h0(obj);
                ((n0) this.k).k.a((m0) obj6);
                return Unit.a;
            case 21:
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                return ((com.yandex.passport.internal.ui.sloth.webauthn.k) this.k).d.a().e((com.yandex.passport.common.core.f) obj6);
            case 22:
                nm6 nm6Var23 = nm6.a;
                qgg.h0(obj);
                ((com.yandex.passport.internal.ui.sloth.webauthn.x) this.k).k.a((w) obj6);
                return Unit.a;
            case 23:
                nm6 nm6Var24 = nm6.a;
                qgg.h0(obj);
                ((Function1) this.k).invoke((s0) obj6);
                return Unit.a;
            case 24:
                nm6 nm6Var25 = nm6.a;
                qgg.h0(obj);
                boolean d = Intrinsics.d((com.yandex.passport.internal.ui.sloth.webcard.i0) ((aqi) obj6).getValue(), new com.yandex.passport.internal.ui.sloth.webcard.i0());
                boolean z5 = !d;
                Window window = (Window) this.k;
                if (window != null) {
                    Boolean valueOf = d ? null : Boolean.valueOf(z5);
                    if (valueOf != null) {
                        z = valueOf.booleanValue();
                    } else if ((window.getDecorView().getResources().getConfiguration().uiMode & 48) == 32) {
                        z = true;
                    }
                    knn knnVar = new knn(window.getDecorView());
                    int i6 = Build.VERSION.SDK_INT;
                    y5g oqvVar = i6 >= 35 ? new oqv(window, knnVar) : i6 >= 30 ? new nqv(window, knnVar) : i6 >= 26 ? new mqv(window, knnVar) : new lqv(window, knnVar);
                    boolean z6 = !z;
                    oqvVar.k0(z6);
                    oqvVar.j0(z6);
                }
                return Unit.a;
            case 25:
                com.yandex.passport.internal.sloth.performers.webcard.f fVar6 = (com.yandex.passport.internal.sloth.performers.webcard.f) this.k;
                nm6 nm6Var26 = nm6.a;
                qgg.h0(obj);
                ((com.yandex.passport.internal.ui.sloth.webcard.n) obj6).n(new com.yandex.passport.internal.ui.sloth.webcard.l(fVar6));
                return Unit.a;
            case 26:
                nm6 nm6Var27 = nm6.a;
                qgg.h0(obj);
                ((com.yandex.passport.internal.ui.sloth.webcard.h0) this.k).k.a((g0) obj6);
                return Unit.a;
            case 27:
                nm6 nm6Var28 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.internal.ui.social.authenticators.c cVar = (com.yandex.passport.internal.ui.social.authenticators.c) this.k;
                com.yandex.passport.common.account.a aVar = (com.yandex.passport.common.account.a) obj6;
                try {
                    r7o r7oVar = z7o.b;
                    com.yandex.passport.internal.account.d dVar = cVar.x;
                    com.yandex.passport.internal.properties.l lVar4 = cVar.k;
                    com.yandex.passport.common.core.b L = com.yandex.plus.core.network.api.utils.a.L(lVar4.d.a);
                    com.yandex.passport.internal.analytics.a aVar2 = com.yandex.passport.internal.analytics.a.l;
                    obj5 = dVar.e(L, aVar, new com.yandex.passport.internal.analytics.a(aVar2.a, aVar2.b, lVar4.l));
                } catch (wis e) {
                    r7o r7oVar2 = z7o.b;
                    obj4 = new t7o(e);
                    obj5 = obj4;
                    if (!(obj5 instanceof t7o)) {
                    }
                    a = z7o.a(obj5);
                    if (a != null) {
                    }
                    return Unit.a;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th) {
                    r7o r7oVar3 = z7o.b;
                    obj4 = new t7o(th);
                    obj5 = obj4;
                    if (!(obj5 instanceof t7o)) {
                    }
                    a = z7o.a(obj5);
                    if (a != null) {
                    }
                    return Unit.a;
                }
                if (!(obj5 instanceof t7o)) {
                    cVar.O((com.yandex.passport.internal.l) obj5);
                }
                a = z7o.a(obj5);
                if (a != null) {
                    cVar.M(a);
                }
                return Unit.a;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var29 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.common.core.f fVar7 = (com.yandex.passport.common.core.f) obj6;
                com.yandex.passport.internal.l e3 = ((x0) this.k).b.a().e(fVar7);
                if (e3 != null) {
                    t7oVar = avf.u(new Long(e3.h()));
                } else {
                    r7o r7oVar4 = z7o.b;
                    t7oVar = new t7o(new com.yandex.passport.api.exception.b(fVar7));
                }
                return new z7o(t7oVar);
            default:
                nm6 nm6Var30 = nm6.a;
                qgg.h0(obj);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Bitmap bitmap = (Bitmap) this.k;
                Bitmap bitmap2 = (Bitmap) obj6;
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
                    bitmap2.recycle();
                    bitmap.recycle();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        yd5.q(byteArrayOutputStream, th2);
                        throw th3;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }
}
