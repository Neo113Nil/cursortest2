package com.yandex.passport.internal.flags.experiments;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.http.SslError;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.passport.data.network.d0;
import com.yandex.passport.internal.push.r;
import com.yandex.passport.internal.push.s;
import com.yandex.passport.internal.report.reporters.k1;
import com.yandex.passport.internal.ui.challenge.delete.i1;
import com.yandex.passport.internal.ui.sloth.authsdk.h0;
import com.yandex.passport.sloth.c1;
import com.yandex.passport.sloth.command.performers.i0;
import com.yandex.passport.sloth.command.performers.y;
import com.yandex.passport.sloth.k0;
import com.yandex.passport.sloth.n0;
import com.yandex.passport.sloth.r0;
import com.yandex.passport.sloth.ui.a1;
import com.yandex.passport.sloth.ui.b1;
import com.yandex.passport.sloth.ui.d2;
import com.yandex.passport.sloth.ui.o0;
import com.yandex.passport.sloth.ui.p0;
import com.yandex.passport.sloth.ui.s0;
import com.yandex.passport.sloth.w0;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.repository.api.model.webconfig.a0;
import com.yandex.plus.pay.adapter.internal.h1;
import com.yandex.plus.pay.adapter.internal.y0;
import defpackage.a4g;
import defpackage.arf;
import defpackage.awc;
import defpackage.b6;
import defpackage.b6e;
import defpackage.btf;
import defpackage.c28;
import defpackage.cg6;
import defpackage.d13;
import defpackage.d4t;
import defpackage.e5b;
import defpackage.ezc;
import defpackage.fkn;
import defpackage.ftr;
import defpackage.gm5;
import defpackage.hld;
import defpackage.hrg;
import defpackage.jp0;
import defpackage.jyr;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.omb;
import defpackage.pz2;
import defpackage.q5f;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rzm;
import defpackage.s9f;
import defpackage.ss3;
import defpackage.t75;
import defpackage.t7o;
import defpackage.t8a;
import defpackage.t9f;
import defpackage.tah;
import defpackage.tkb;
import defpackage.toe;
import defpackage.u75;
import defpackage.uah;
import defpackage.uz2;
import defpackage.v6f;
import defpackage.v75;
import defpackage.w4f;
import defpackage.wkb;
import defpackage.x3f;
import defpackage.x4f;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y3e;
import defpackage.ydr;
import defpackage.z6n;
import defpackage.z7o;
import defpackage.zsd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class p implements s, com.yandex.plus.bdui.b, com.yandex.plus.core.gradient.api.c, com.yandex.plus.core.network.hosts.a, com.yandex.plus.core.animation.a, com.yandex.plus.pay.inapp.google.common.internal.operation.b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public p() {
        this.a = 21;
        Set synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        this.b = synchronizedSet;
        Set synchronizedSet2 = Collections.synchronizedSet(new LinkedHashSet());
        this.c = synchronizedSet2;
        synchronizedSet.getClass();
        Pair pair = new Pair("PlaquesShown", CollectionsKt.A0(synchronizedSet));
        synchronizedSet2.getClass();
        Map e = uah.e(pair, new Pair("PlaquesInteracted", CollectionsKt.A0(synchronizedSet2)));
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.d = ydr.a(new com.yandex.plus.home.plaque.feature.api.context.b(e, e5bVar, e5bVar));
    }

    public static void E(p pVar) {
        com.yandex.plus.core.benchmark.l lVar = (com.yandex.plus.core.benchmark.l) pVar.b;
        AtomicReference atomicReference = (AtomicReference) pVar.d;
        com.yandex.plus.home.benchmark.a aVar = com.yandex.plus.home.benchmark.a.b;
        com.yandex.plus.home.benchmark.a aVar2 = com.yandex.plus.home.benchmark.a.c;
        while (!atomicReference.compareAndSet(aVar, aVar2)) {
            if (atomicReference.get() != aVar) {
                return;
            }
        }
        lVar.d();
        ((com.yandex.plus.bdui.q) pVar.c).invoke(lVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r12v3, types: [ezc, kotlin.jvm.functions.Function0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object A(cg6 cg6Var) {
        com.yandex.plus.pay.inapp.google.internal.operation.decorator.a aVar;
        int i;
        pz2 pz2Var;
        uz2 uz2Var;
        pz2 pz2Var2;
        com.yandex.plus.log.api.a aVar2;
        com.yandex.plus.log.api.a aVar3;
        com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) this.c;
        if (cg6Var instanceof com.yandex.plus.pay.inapp.google.internal.operation.decorator.a) {
            aVar = (com.yandex.plus.pay.inapp.google.internal.operation.decorator.a) cg6Var;
            int i2 = aVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.m = i2 - Integer.MIN_VALUE;
                Object obj = aVar.k;
                nm6 nm6Var = nm6.a;
                i = aVar.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    pz2 pz2Var3 = (pz2) ((ezc) this.b).invoke();
                    ss3 I = zsd.I(new com.yandex.plus.home.api.prefetch.j(this, pz2Var3, continuation, 21));
                    aVar.j = pz2Var3;
                    aVar.m = 1;
                    Object g0 = zsd.g0(I, aVar);
                    if (g0 != nm6Var) {
                        pz2Var = pz2Var3;
                        obj = g0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pz2Var2 = aVar.j;
                    try {
                        qgg.h0(obj);
                        com.yandex.plus.pay.inapp.google.common.internal.operation.c cVar = (com.yandex.plus.pay.inapp.google.common.internal.operation.c) obj;
                        pz2Var2.c();
                        aVar3 = com.yandex.plus.log.api.a.b;
                        if (bVar.b(aVar3)) {
                            bVar.c(aVar3, "WithConnectionEstablishmentOperationDecorator", "endConnection()");
                        }
                        return cVar;
                    } catch (Throwable th) {
                        th = th;
                        pz2Var2.c();
                        aVar2 = com.yandex.plus.log.api.a.b;
                        if (bVar.b(aVar2)) {
                        }
                        throw th;
                    }
                }
                pz2Var = aVar.j;
                qgg.h0(obj);
                uz2Var = (uz2) obj;
                if (uz2Var.a == 0) {
                    return new com.yandex.plus.pay.inapp.google.common.internal.operation.c(null, com.yandex.plus.bdui.flex.ui.a.G(uz2Var));
                }
                try {
                    com.yandex.plus.pay.inapp.google.common.internal.operation.b bVar2 = (com.yandex.plus.pay.inapp.google.common.internal.operation.b) this.d;
                    aVar.j = pz2Var;
                    aVar.m = 2;
                    obj = bVar2.g(pz2Var, aVar);
                    if (obj != nm6Var) {
                        pz2Var2 = pz2Var;
                        com.yandex.plus.pay.inapp.google.common.internal.operation.c cVar2 = (com.yandex.plus.pay.inapp.google.common.internal.operation.c) obj;
                        pz2Var2.c();
                        aVar3 = com.yandex.plus.log.api.a.b;
                        if (bVar.b(aVar3)) {
                        }
                        return cVar2;
                    }
                    return nm6Var;
                } catch (Throwable th2) {
                    th = th2;
                    pz2Var2 = pz2Var;
                    pz2Var2.c();
                    aVar2 = com.yandex.plus.log.api.a.b;
                    if (bVar.b(aVar2)) {
                        bVar.c(aVar2, "WithConnectionEstablishmentOperationDecorator", "endConnection()");
                    }
                    throw th;
                }
            }
        }
        aVar = new com.yandex.plus.pay.inapp.google.internal.operation.decorator.a(this, cg6Var);
        Object obj2 = aVar.k;
        nm6 nm6Var2 = nm6.a;
        i = aVar.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        uz2Var = (uz2) obj2;
        if (uz2Var.a == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.yandex.plus.home.feature.webviews.internal.purchase.button.offers.a B(com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.g gVar, a0 a0Var) {
        com.yandex.plus.home.feature.webviews.internal.purchase.button.offers.a aVar;
        com.yandex.plus.home.feature.webviews.internal.purchase.button.offers.a aVar2;
        com.yandex.plus.pay.adapter.api.j jVar;
        String str;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        gVar.getClass();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        List P = gVar.P();
        ArrayList arrayList = new ArrayList(v75.o(P, 10));
        Iterator it = P.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.m) it.next()).a);
        }
        if (!((com.yandex.plus.home.auth.f) this.b).c()) {
            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new com.yandex.plus.home.feature.webviews.internal.purchase.button.offers.a((com.yandex.plus.pay.adapter.api.j) it2.next(), false, uuid));
            }
            copyOnWriteArrayList.clear();
            copyOnWriteArrayList.addAll(arrayList2);
            return (com.yandex.plus.home.feature.webviews.internal.purchase.button.offers.a) CollectionsKt.firstOrNull(arrayList2);
        }
        com.yandex.plus.home.feature.webviews.internal.purchase.button.offers.a aVar3 = (com.yandex.plus.home.feature.webviews.internal.purchase.button.offers.a) CollectionsKt.firstOrNull(copyOnWriteArrayList);
        if (aVar3 != null) {
            com.yandex.plus.pay.adapter.api.j jVar2 = aVar3.a;
            Iterator it3 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it3.hasNext()) {
                    aVar = null;
                    i = -1;
                    break;
                }
                Object next = it3.next();
                if (i < 0) {
                    u75.n();
                    throw null;
                }
                com.yandex.plus.pay.adapter.api.j jVar3 = (com.yandex.plus.pay.adapter.api.j) next;
                if (jVar2 != jVar3) {
                    com.yandex.plus.pay.adapter.internal.i iVar = (com.yandex.plus.pay.adapter.internal.i) jVar3;
                    List d = iVar.d();
                    ArrayList arrayList3 = new ArrayList(v75.o(d, 10));
                    Iterator it4 = d.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(((y0) ((com.yandex.plus.pay.adapter.api.e) it4.next())).a.getId());
                    }
                    com.yandex.plus.pay.adapter.internal.i iVar2 = (com.yandex.plus.pay.adapter.internal.i) jVar2;
                    List d2 = iVar2.d();
                    aVar = null;
                    ArrayList arrayList4 = new ArrayList(v75.o(d2, 10));
                    Iterator it5 = d2.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(((y0) ((com.yandex.plus.pay.adapter.api.e) it5.next())).a.getId());
                    }
                    com.yandex.plus.pay.adapter.api.h e = iVar.e();
                    String id = e != null ? ((h1) e).a.getId() : null;
                    com.yandex.plus.pay.adapter.api.h e2 = iVar2.e();
                    boolean d3 = Intrinsics.d(id, e2 != null ? ((h1) e2).a.getId() : null);
                    boolean z = arrayList3.size() == arrayList4.size() && Intrinsics.d(CollectionsKt.A0(arrayList3), CollectionsKt.A0(arrayList4));
                    if (d3 && z) {
                        break;
                    }
                    i++;
                } else {
                    aVar = null;
                    break;
                }
            }
            if (!(i >= 0)) {
                aVar3 = aVar;
            }
            if (aVar3 != null) {
                com.yandex.plus.pay.adapter.api.j jVar4 = aVar3.a;
                String str2 = aVar3.c;
                jVar4.getClass();
                str2.getClass();
                aVar2 = new com.yandex.plus.home.feature.webviews.internal.purchase.button.offers.a(jVar4, true, str2);
                copyOnWriteArrayList.clear();
                if (aVar2 == null) {
                    return aVar2;
                }
                com.yandex.plus.pay.adapter.api.j jVar5 = (com.yandex.plus.pay.adapter.api.j) CollectionsKt.R(arrayList);
                com.yandex.plus.acquisition.sdk.common.api.di.b bVar = (com.yandex.plus.acquisition.sdk.common.api.di.b) this.c;
                com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.e c = com.yandex.plus.acquisition.sdk.common.api.di.b.c(bVar, a0Var, jVar5);
                if (c != null) {
                    com.yandex.plus.home.analytics.payment.d dVar = (com.yandex.plus.home.analytics.payment.d) bVar.d;
                    dVar.getClass();
                    omb ombVar = dVar.a;
                    com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g gVar2 = c.a;
                    List list = c.e;
                    String str3 = c.d;
                    com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d dVar2 = c.c;
                    com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.f fVar = c.b;
                    int ordinal = gVar2.ordinal();
                    jVar = jVar5;
                    if (ordinal != 0) {
                        str = uuid;
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        wkb I = com.yandex.plus.bdui.plus.analytics.b.I(fVar);
                        tkb G = com.yandex.plus.bdui.plus.analytics.b.G(dVar2);
                        String str4 = str3 == null ? "no_value" : str3;
                        ombVar.getClass();
                        list.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("purchase_session_id", "no_value");
                        linkedHashMap.put("purchase_type", I.a);
                        linkedHashMap.put("purchase_button", G.a);
                        linkedHashMap.put("product_id", str4);
                        com.appsflyer.internal.k.z(linkedHashMap, "options_id", list, false, "is_one_click_payment");
                        linkedHashMap.put("is_tarifficator", String.valueOf(true));
                        HashMap hashMap = new HashMap();
                        com.appsflyer.internal.k.w("version", 1, hashMap, "Payment");
                        linkedHashMap.put("_meta", omb.a(1, hashMap));
                        ombVar.d("PlusStories.BuySubscription.Button.OfferChanged", linkedHashMap);
                    } else {
                        str = uuid;
                        wkb I2 = com.yandex.plus.bdui.plus.analytics.b.I(fVar);
                        tkb G2 = com.yandex.plus.bdui.plus.analytics.b.G(dVar2);
                        String str5 = str3 == null ? "no_value" : str3;
                        ombVar.getClass();
                        list.getClass();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.put("purchase_session_id", "no_value");
                        linkedHashMap2.put("purchase_type", I2.a);
                        linkedHashMap2.put("purchase_button", G2.a);
                        linkedHashMap2.put("product_id", str5);
                        com.appsflyer.internal.k.z(linkedHashMap2, "options_id", list, false, "is_one_click_payment");
                        linkedHashMap2.put("is_tarifficator", String.valueOf(true));
                        HashMap hashMap2 = new HashMap();
                        com.appsflyer.internal.k.w("version", 1, hashMap2, "Payment");
                        linkedHashMap2.put("_meta", omb.a(1, hashMap2));
                        ombVar.d("PlusHome.BuySubscription.Button.OfferChanged", linkedHashMap2);
                    }
                } else {
                    jVar = jVar5;
                    str = uuid;
                }
                return jVar != null ? new com.yandex.plus.home.feature.webviews.internal.purchase.button.offers.a(jVar, false, str) : aVar;
            }
        } else {
            aVar = null;
        }
        aVar2 = aVar;
        copyOnWriteArrayList.clear();
        if (aVar2 == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(7:11|12|13|14|(1:16)|17|(4:19|(1:21)|22|23)(4:25|(1:27)|28|(2:30|31)(2:32|(2:34|35)(2:36|(2:38|39)(2:40|(2:42|43)(2:44|(2:46|47)(2:48|(2:50|51)(2:52|(2:54|55)(2:56|(2:58|59)(2:60|61))))))))))(2:63|64))(3:65|66|67))(5:90|91|(1:93)|94|(2:96|86)(1:97))|68|(2:69|(2:71|(2:73|74)(1:87))(2:88|89))|75|76|(7:78|(1:80)|13|14|(0)|17|(0)(0))(3:81|(1:83)|84)))|104|6|7|(0)(0)|68|(3:69|(0)(0)|87)|75|76|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x003d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0124, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x011c, code lost:
    
        r2 = defpackage.z7o.b;
        r13 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0113, code lost:
    
        if (r2 == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0040, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0125, code lost:
    
        r2 = defpackage.z7o.b;
        r13 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a5 A[Catch: all -> 0x003a, CancellationException -> 0x003d, wis -> 0x0040, TryCatch #2 {wis -> 0x0040, CancellationException -> 0x003d, all -> 0x003a, blocks: (B:11:0x0035, B:12:0x0116, B:13:0x0119, B:66:0x0053, B:68:0x0099, B:69:0x009f, B:71:0x00a5, B:75:0x00b6, B:78:0x00bc, B:80:0x00c8, B:81:0x00e0, B:83:0x00ec, B:84:0x0103, B:91:0x005f, B:93:0x0069, B:94:0x0078), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00bc A[Catch: all -> 0x003a, CancellationException -> 0x003d, wis -> 0x0040, TRY_ENTER, TryCatch #2 {wis -> 0x0040, CancellationException -> 0x003d, all -> 0x003a, blocks: (B:11:0x0035, B:12:0x0116, B:13:0x0119, B:66:0x0053, B:68:0x0099, B:69:0x009f, B:71:0x00a5, B:75:0x00b6, B:78:0x00bc, B:80:0x00c8, B:81:0x00e0, B:83:0x00ec, B:84:0x0103, B:91:0x005f, B:93:0x0069, B:94:0x0078), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0 A[Catch: all -> 0x003a, CancellationException -> 0x003d, wis -> 0x0040, TryCatch #2 {wis -> 0x0040, CancellationException -> 0x003d, all -> 0x003a, blocks: (B:11:0x0035, B:12:0x0116, B:13:0x0119, B:66:0x0053, B:68:0x0099, B:69:0x009f, B:71:0x00a5, B:75:0x00b6, B:78:0x00bc, B:80:0x00c8, B:81:0x00e0, B:83:0x00ec, B:84:0x0103, B:91:0x005f, B:93:0x0069, B:94:0x0078), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object C(String str, com.yandex.plus.pay.inapp.api.h hVar, cg6 cg6Var) {
        com.yandex.plus.bdui.plus.checkout.payment.b bVar;
        int i;
        Object t7oVar;
        com.yandex.plus.pay.inapp.api.f fVar;
        com.yandex.plus.pay.inapp.api.h hVar2;
        p pVar;
        int i2;
        String str2;
        int i3;
        Iterator it;
        Object obj;
        com.yandex.plus.log.api.b bVar2 = (com.yandex.plus.log.api.b) this.d;
        if (cg6Var instanceof com.yandex.plus.bdui.plus.checkout.payment.b) {
            bVar = (com.yandex.plus.bdui.plus.checkout.payment.b) cg6Var;
            int i4 = bVar.q;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.q = i4 - Integer.MIN_VALUE;
                Object obj2 = bVar.o;
                nm6 nm6Var = nm6.a;
                i = bVar.q;
                if (i != 0) {
                    qgg.h0(obj2);
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                    if (bVar2.b(aVar)) {
                        bVar2.c(aVar, "PlusPayInAppPaymentHandlerImpl", "makePayment(); get pending purchase for productId = " + str);
                    }
                    com.yandex.plus.pay.inapp.api.b bVar3 = (com.yandex.plus.pay.inapp.api.b) this.b;
                    com.yandex.plus.pay.inapp.api.e eVar = com.yandex.plus.pay.inapp.api.e.a;
                    bVar.j = str;
                    hVar2 = hVar;
                    bVar.k = hVar2;
                    bVar.l = this;
                    bVar.m = 0;
                    bVar.n = 0;
                    bVar.q = 1;
                    obj2 = bVar3.b(eVar, bVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                    pVar = this;
                    i2 = 0;
                    str2 = str;
                    i3 = 0;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj2);
                        t7oVar = (com.yandex.plus.pay.inapp.api.f) obj2;
                        r7o r7oVar2 = z7o.b;
                        fVar = (com.yandex.plus.pay.inapp.api.f) (t7oVar instanceof t7o ? null : t7oVar);
                        if (fVar == null) {
                            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                            if (bVar2.b(aVar2)) {
                                bVar2.c(aVar2, "PlusPayInAppPaymentHandlerImpl", "makePayment(); purchase succeeded");
                            }
                            return new com.yandex.plus.bdui.plus.checkout.payment.g(fVar);
                        }
                        Throwable a = z7o.a(t7oVar);
                        com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
                        if (bVar2.b(aVar3)) {
                            bVar2.a(aVar3, "PlusPayInAppPaymentHandlerImpl", "makePayment(); purchase failed!", a);
                        }
                        return a instanceof com.yandex.plus.pay.inapp.internal.error.c ? new com.yandex.plus.bdui.plus.checkout.payment.f("connection_error") : a instanceof com.yandex.plus.pay.inapp.internal.error.a ? new com.yandex.plus.bdui.plus.checkout.payment.f("billing_unavailable") : a instanceof com.yandex.plus.pay.inapp.internal.error.f ? new com.yandex.plus.bdui.plus.checkout.payment.f("item_unavailable") : a instanceof com.yandex.plus.pay.inapp.internal.error.e ? new com.yandex.plus.bdui.plus.checkout.payment.f("item_already_owned") : a instanceof com.yandex.plus.pay.inapp.internal.error.d ? new com.yandex.plus.bdui.plus.checkout.payment.f("invalid_signature") : a instanceof com.yandex.plus.pay.inapp.internal.error.h ? new com.yandex.plus.bdui.plus.checkout.payment.f("purchase_unspecified_state") : a instanceof com.yandex.plus.pay.inapp.internal.error.g ? new com.yandex.plus.bdui.plus.checkout.payment.f("not_enough_funds") : a instanceof com.yandex.plus.pay.inapp.internal.error.b ? com.yandex.plus.bdui.plus.checkout.payment.e.a : new com.yandex.plus.bdui.plus.checkout.payment.f("unknown_error");
                    }
                    i3 = bVar.n;
                    i2 = bVar.m;
                    p pVar2 = bVar.l;
                    com.yandex.plus.pay.inapp.api.h hVar3 = bVar.k;
                    str2 = bVar.j;
                    qgg.h0(obj2);
                    pVar = pVar2;
                    hVar2 = hVar3;
                }
                it = ((Iterable) obj2).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((com.yandex.plus.pay.inapp.api.f) obj).b.contains(str2)) {
                        break;
                    }
                }
                t7oVar = (com.yandex.plus.pay.inapp.api.f) obj;
                if (t7oVar == null) {
                    com.yandex.plus.log.api.b bVar4 = (com.yandex.plus.log.api.b) pVar.d;
                    com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                    if (bVar4.b(aVar4)) {
                        bVar4.c(aVar4, "PlusPayInAppPaymentHandlerImpl", "makePayment(); pending purchase for productId = " + str2 + " found");
                    }
                    r7o r7oVar22 = z7o.b;
                    fVar = (com.yandex.plus.pay.inapp.api.f) (t7oVar instanceof t7o ? null : t7oVar);
                    if (fVar == null) {
                    }
                } else {
                    com.yandex.plus.log.api.b bVar5 = (com.yandex.plus.log.api.b) pVar.d;
                    com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.c;
                    if (bVar5.b(aVar5)) {
                        bVar5.c(aVar5, "PlusPayInAppPaymentHandlerImpl", "makePayment(); pending purchase for productId = " + str2 + " not found; perform new purchase");
                    }
                    bVar.j = null;
                    bVar.k = null;
                    bVar.l = null;
                    bVar.m = i2;
                    bVar.n = i3;
                    bVar.q = 2;
                    obj2 = pVar.H(str2, hVar2, bVar);
                }
            }
        }
        bVar = new com.yandex.plus.bdui.plus.checkout.payment.b(this, cg6Var);
        Object obj22 = bVar.o;
        nm6 nm6Var2 = nm6.a;
        i = bVar.q;
        if (i != 0) {
        }
        it = ((Iterable) obj22).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        t7oVar = (com.yandex.plus.pay.inapp.api.f) obj;
        if (t7oVar == null) {
        }
    }

    public void D(final mm6 mm6Var, a1 a1Var, com.yandex.passport.sloth.ui.webview.f fVar) {
        String str;
        Map map;
        com.yandex.passport.sloth.ui.webview.c cVar = com.yandex.passport.sloth.ui.webview.c.c;
        com.yandex.passport.sloth.ui.webview.c cVar2 = com.yandex.passport.sloth.ui.webview.c.b;
        s0 s0Var = (s0) this.b;
        a1Var.getClass();
        fVar.getClass();
        com.yandex.passport.sloth.ui.webview.c cVar3 = com.yandex.passport.sloth.ui.webview.c.a;
        boolean equals = fVar.equals(cVar3);
        com.yandex.passport.sloth.ui.webview.b bVar = com.yandex.passport.sloth.ui.webview.b.a;
        if (equals) {
            final c1 c1Var = (c1) a1Var;
            c1Var.d();
            final int i = 0;
            Function0 function0 = new Function0() { // from class: com.yandex.passport.sloth.ui.webview.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            x97.y(mm6Var, null, null, new com.yandex.passport.sloth.ui.a0(c1Var, null, 1), 3);
                            break;
                        case 1:
                            x97.y(mm6Var, null, null, new com.yandex.passport.sloth.ui.a0(c1Var, null, 2), 3);
                            break;
                        default:
                            x97.y(mm6Var, null, null, new com.yandex.passport.sloth.ui.a0(c1Var, null, 3), 3);
                            break;
                    }
                    return Unit.a;
                }
            };
            s0Var.getClass();
            s0Var.d(com.yandex.passport.sloth.ui.string.a.b, new o0(function0));
        } else if (fVar.equals(cVar2)) {
            final c1 c1Var2 = (c1) a1Var;
            c1Var2.d();
            final int i2 = 1;
            s0Var.e(new Function0() { // from class: com.yandex.passport.sloth.ui.webview.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            x97.y(mm6Var, null, null, new com.yandex.passport.sloth.ui.a0(c1Var2, null, 1), 3);
                            break;
                        case 1:
                            x97.y(mm6Var, null, null, new com.yandex.passport.sloth.ui.a0(c1Var2, null, 2), 3);
                            break;
                        default:
                            x97.y(mm6Var, null, null, new com.yandex.passport.sloth.ui.a0(c1Var2, null, 3), 3);
                            break;
                    }
                    return Unit.a;
                }
            });
        } else if (fVar.equals(cVar)) {
            final c1 c1Var3 = (c1) a1Var;
            c1Var3.d();
            final int i3 = 2;
            s0Var.e(new Function0() { // from class: com.yandex.passport.sloth.ui.webview.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i3) {
                        case 0:
                            x97.y(mm6Var, null, null, new com.yandex.passport.sloth.ui.a0(c1Var3, null, 1), 3);
                            break;
                        case 1:
                            x97.y(mm6Var, null, null, new com.yandex.passport.sloth.ui.a0(c1Var3, null, 2), 3);
                            break;
                        default:
                            x97.y(mm6Var, null, null, new com.yandex.passport.sloth.ui.a0(c1Var3, null, 3), 3);
                            break;
                    }
                    return Unit.a;
                }
            });
        } else if (fVar instanceof com.yandex.passport.sloth.ui.webview.d) {
            c1 c1Var4 = (c1) a1Var;
            c1Var4.d();
            s0Var.e(new ftr(28, mm6Var, c1Var4, fVar));
        } else if (fVar.equals(bVar)) {
            s0Var.c();
        } else if (fVar instanceof com.yandex.passport.sloth.ui.webview.e) {
            ((c1) a1Var).d();
            s0Var.e(new h0(20, this));
        } else if (!(fVar instanceof com.yandex.passport.sloth.ui.webview.a)) {
            b6e.s();
            return;
        } else {
            s0Var.getClass();
            s0Var.d(com.yandex.passport.sloth.ui.string.a.g, p0.c);
        }
        b1 b1Var = (b1) this.d;
        if (fVar.equals(bVar)) {
            str = "Error.Connection";
        } else if (fVar.equals(cVar3)) {
            str = "Error.Http4xx";
        } else if (fVar.equals(cVar2)) {
            str = "Error.Http5xx";
        } else if (fVar.equals(cVar)) {
            str = "Error.OnRenderProcessGone";
        } else if (fVar.equals(com.yandex.passport.sloth.ui.webview.a.a)) {
            str = "Error.BlockedUrl";
        } else if (fVar instanceof com.yandex.passport.sloth.ui.webview.d) {
            str = toString();
        } else {
            if (!(fVar instanceof com.yandex.passport.sloth.ui.webview.e)) {
                b6e.s();
                return;
            }
            str = "Error.Ssl";
        }
        if (fVar instanceof com.yandex.passport.sloth.ui.webview.e) {
            w0 w0Var = w0.d;
            SslError sslError = ((com.yandex.passport.sloth.ui.webview.e) fVar).a;
            w0Var.getClass();
            map = b6.M(sslError);
        } else {
            map = e5b.a;
            map.getClass();
        }
        str.getClass();
        b1Var.a(new n0(16, r0.UI_ERROR, uah.i(tah.b(new Pair("ui_error", str)), map)));
    }

    public void F() {
        AtomicReference atomicReference = (AtomicReference) this.d;
        com.yandex.plus.home.benchmark.a aVar = com.yandex.plus.home.benchmark.a.b;
        com.yandex.plus.home.benchmark.a aVar2 = com.yandex.plus.home.benchmark.a.d;
        while (!atomicReference.compareAndSet(aVar, aVar2)) {
            if (atomicReference.get() != aVar) {
                return;
            }
        }
        ((com.yandex.plus.core.benchmark.l) this.b).d();
    }

    public void G() {
        AtomicReference atomicReference = (AtomicReference) this.d;
        com.yandex.plus.home.benchmark.a aVar = com.yandex.plus.home.benchmark.a.a;
        com.yandex.plus.home.benchmark.a aVar2 = com.yandex.plus.home.benchmark.a.b;
        while (!atomicReference.compareAndSet(aVar, aVar2)) {
            if (atomicReference.get() != aVar) {
                return;
            }
        }
        ((com.yandex.plus.core.benchmark.l) this.b).c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        if (r12 != r3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r12 == r3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object H(String str, com.yandex.plus.pay.inapp.api.h hVar, cg6 cg6Var) {
        com.yandex.plus.bdui.plus.checkout.payment.c cVar;
        int i;
        com.yandex.plus.log.api.a aVar;
        com.yandex.plus.pay.inapp.api.b bVar = (com.yandex.plus.pay.inapp.api.b) this.b;
        com.yandex.plus.log.api.b bVar2 = (com.yandex.plus.log.api.b) this.d;
        if (cg6Var instanceof com.yandex.plus.bdui.plus.checkout.payment.c) {
            cVar = (com.yandex.plus.bdui.plus.checkout.payment.c) cg6Var;
            int i2 = cVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.n = i2 - Integer.MIN_VALUE;
                Object obj = cVar.l;
                nm6 nm6Var = nm6.a;
                i = cVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                    if (bVar2.b(aVar2)) {
                        bVar2.c(aVar2, "PlusPayInAppPaymentHandlerImpl", "performPurchase(); get product details for productId = " + str);
                    }
                    List c = t75.c(str);
                    com.yandex.plus.pay.inapp.api.e eVar = com.yandex.plus.pay.inapp.api.e.a;
                    cVar.j = str;
                    cVar.k = hVar;
                    cVar.n = 1;
                    obj = bVar.c(c, eVar, cVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return (com.yandex.plus.pay.inapp.api.f) obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hVar = cVar.k;
                    str = cVar.j;
                    qgg.h0(obj);
                }
                com.yandex.plus.pay.inapp.google.internal.h hVar2 = (com.yandex.plus.pay.inapp.google.internal.h) CollectionsKt.Q((List) obj);
                aVar = com.yandex.plus.log.api.a.c;
                if (bVar2.b(aVar)) {
                    bVar2.c(aVar, "PlusPayInAppPaymentHandlerImpl", hrg.q("performPurchase(); product details for productId = ", str, " found"));
                }
                cVar.j = null;
                cVar.k = null;
                cVar.n = 2;
                obj = bVar.d(hVar2, hVar, cVar);
            }
        }
        cVar = new com.yandex.plus.bdui.plus.checkout.payment.c(this, cg6Var);
        Object obj2 = cVar.l;
        nm6 nm6Var2 = nm6.a;
        i = cVar.n;
        if (i != 0) {
        }
        com.yandex.plus.pay.inapp.google.internal.h hVar22 = (com.yandex.plus.pay.inapp.google.internal.h) CollectionsKt.Q((List) obj2);
        aVar = com.yandex.plus.log.api.a.c;
        if (bVar2.b(aVar)) {
        }
        cVar.j = null;
        cVar.k = null;
        cVar.n = 2;
        obj2 = bVar.d(hVar22, hVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object I(cg6 cg6Var) {
        com.yandex.plus.bdui.plus.checkout.payment.d dVar;
        int i;
        com.yandex.plus.pay.api.feature.inapp.restore.e eVar;
        com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) this.d;
        if (cg6Var instanceof com.yandex.plus.bdui.plus.checkout.payment.d) {
            dVar = (com.yandex.plus.bdui.plus.checkout.payment.d) cg6Var;
            int i2 = dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dVar.j;
                nm6 nm6Var = nm6.a;
                i = dVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar)) {
                        bVar.c(aVar, "PlusPayInAppPaymentHandlerImpl", "restorePurchases(); start restoring purchases");
                    }
                    fkn fknVar = com.yandex.plus.pay.a.a((com.yandex.plus.pay.a) this.c).i;
                    d4t d4tVar = new d4t(2, 12, null);
                    dVar.l = 1;
                    obj = zsd.h0(fknVar, d4tVar, dVar);
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
                eVar = (com.yandex.plus.pay.api.feature.inapp.restore.e) obj;
                if (!Intrinsics.d(eVar, com.yandex.plus.pay.api.feature.inapp.restore.c.a)) {
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar2)) {
                        bVar.c(aVar2, "PlusPayInAppPaymentHandlerImpl", "restorePurchases(); restore succeeded");
                    }
                    return com.yandex.plus.bdui.plus.checkout.payment.j.a;
                }
                if (!(eVar instanceof com.yandex.plus.pay.api.feature.inapp.restore.b)) {
                    if (Intrinsics.d(eVar, com.yandex.plus.pay.api.feature.inapp.restore.d.a)) {
                        return new com.yandex.plus.bdui.plus.checkout.payment.i("waiting_state");
                    }
                    b6e.s();
                    return null;
                }
                com.yandex.plus.pay.api.exception.a aVar3 = ((com.yandex.plus.pay.api.feature.inapp.restore.b) eVar).a;
                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.e;
                if (bVar.b(aVar4)) {
                    bVar.a(aVar4, "PlusPayInAppPaymentHandlerImpl", "restorePurchases(); restore failed!", aVar3);
                }
                String message = aVar3.getMessage();
                if (message == null) {
                    message = "unknown_error";
                }
                return new com.yandex.plus.bdui.plus.checkout.payment.i(message);
            }
        }
        dVar = new com.yandex.plus.bdui.plus.checkout.payment.d(this, cg6Var);
        Object obj2 = dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dVar.l;
        if (i != 0) {
        }
        eVar = (com.yandex.plus.pay.api.feature.inapp.restore.e) obj2;
        if (!Intrinsics.d(eVar, com.yandex.plus.pay.api.feature.inapp.restore.c.a)) {
        }
    }

    public void J(int i) {
        com.yandex.passport.common.network.n nVar = (com.yandex.passport.common.network.n) this.c;
        ((View) nVar.b).setVisibility(0);
        ((TextView) nVar.c).setText(i);
        ((View) this.b).setVisibility(8);
        ((WebView) this.d).setVisibility(8);
    }

    @Override // com.yandex.plus.core.gradient.api.c
    public void a(float f, float f2, float f3, float f4) {
        ((com.yandex.plus.core.gradient.impl.b) this.b).a(f, f2, f3, f4);
        ((com.yandex.plus.core.gradient.impl.b) this.c).a(f, f2, f3, f4);
    }

    @Override // com.yandex.plus.core.gradient.api.c
    public void b(float f) {
        ((com.yandex.plus.core.gradient.impl.b) this.b).b(f);
        ((com.yandex.plus.core.gradient.impl.b) this.c).b(f);
    }

    @Override // com.yandex.plus.bdui.b
    public void d(com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.query.e eVar, com.yandex.plus.bdui.document.e eVar2) {
        ((com.yandex.plus.bdui.plus.scenario.j) this.b).a = eVar2;
    }

    @Override // com.yandex.plus.core.network.hosts.a
    public String e() {
        int ordinal = ((com.yandex.plus.core.config.a) this.d).ordinal();
        if (ordinal == 0) {
            return (String) this.c;
        }
        if (ordinal == 1) {
            return (String) this.b;
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:18|19))(4:20|21|(1:23)(1:26)|(1:25))|11|(1:13)|15|16))|31|6|7|(0)(0)|11|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002f, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        if ((r7 instanceof java.util.concurrent.CancellationException) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        throw r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065 A[Catch: Exception -> 0x002f, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:10:0x002b, B:11:0x0052, B:13:0x0065, B:21:0x003b, B:26:0x004d), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.yandex.passport.internal.push.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(Continuation continuation) {
        r rVar;
        int i;
        jp0 jp0Var;
        s9f[] s9fVarArr;
        com.yandex.passport.internal.storage.m mVar = (com.yandex.passport.internal.storage.m) this.c;
        if (continuation instanceof r) {
            rVar = (r) continuation;
            int i2 = rVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.l = i2 - Integer.MIN_VALUE;
                Object obj = rVar.j;
                nm6 nm6Var = nm6.a;
                i = rVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.push.g gVar = (com.yandex.passport.internal.push.g) this.b;
                    com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) this.d;
                    rVar.l = 1;
                    Object i3 = gVar.i(rVar, null, fVar);
                    if (i3 != nm6Var) {
                        i3 = Unit.a;
                    }
                    if (i3 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                jp0Var = mVar.b;
                s9fVarArr = com.yandex.passport.internal.storage.m.m;
                if (!"7.54.1".equals((String) jp0Var.getValue(mVar, s9fVarArr[0]))) {
                    mVar.b.setValue(mVar, s9fVarArr[0], "7.54.1");
                }
                return Unit.a;
            }
        }
        rVar = new r(this, (cg6) continuation);
        Object obj2 = rVar.j;
        nm6 nm6Var2 = nm6.a;
        i = rVar.l;
        if (i != 0) {
        }
        jp0Var = mVar.b;
        s9fVarArr = com.yandex.passport.internal.storage.m.m;
        if (!"7.54.1".equals((String) jp0Var.getValue(mVar, s9fVarArr[0]))) {
        }
        return Unit.a;
    }

    @Override // com.yandex.plus.pay.inapp.google.common.internal.operation.b
    public /* bridge */ /* synthetic */ Object g(Object obj, cg6 cg6Var) {
        switch (this.a) {
            case 23:
                return z((pz2) obj, cg6Var);
            default:
                return A(cg6Var);
        }
    }

    @Override // com.yandex.plus.pay.inapp.google.common.internal.operation.b
    public String getName() {
        switch (this.a) {
            case 23:
                return (String) this.d;
            default:
                return ((com.yandex.plus.pay.inapp.google.common.internal.operation.b) this.d).getName();
        }
    }

    @Override // com.yandex.plus.core.animation.a
    public void h(ViewGroup viewGroup) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        viewGroup.removeView((View) linkedHashMap.remove(viewGroup));
        Context context = viewGroup.getContext();
        context.getClass();
        com.yandex.plus.home.animation.f fVar = new com.yandex.plus.home.animation.f(context, (com.yandex.plus.bdui.flex.ui.s) this.b, (kotlinx.coroutines.a) this.c);
        viewGroup.addView(fVar);
        linkedHashMap.put(viewGroup, fVar);
    }

    @Override // com.yandex.plus.core.animation.a
    public void m(ViewGroup viewGroup) {
        viewGroup.getClass();
        viewGroup.removeView((View) ((LinkedHashMap) this.d).remove(viewGroup));
    }

    @Override // com.yandex.plus.core.gradient.api.c
    public Shader n() {
        return (Shader) ((jyr) this.d).getValue();
    }

    @Override // com.yandex.plus.bdui.b
    public void o(com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.query.e eVar, Throwable th) {
        ((com.yandex.plus.bdui.plus.scenario.j) this.b).o(mVar, eVar, th);
    }

    @Override // com.yandex.plus.bdui.b
    public void p() {
        ((com.yandex.passport.common.network.n) this.d).p();
        ((com.yandex.plus.bdui.plus.scenario.j) this.c).p();
    }

    @Override // com.yandex.plus.core.gradient.api.c
    public void q(float f) {
        ((com.yandex.plus.core.gradient.impl.b) this.b).q(f);
        ((com.yandex.plus.core.gradient.impl.b) this.c).q(f);
    }

    @Override // com.yandex.plus.bdui.b
    public void r(com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.query.e eVar) {
        ((com.yandex.plus.bdui.flex.a) ((com.yandex.passport.common.network.n) this.d).b).h(eVar);
        com.yandex.plus.bdui.plus.scenario.j jVar = (com.yandex.plus.bdui.plus.scenario.j) this.c;
        jVar.a = null;
        jVar.c.a = null;
    }

    public com.yandex.passport.sloth.a t() {
        a4g.q(com.yandex.passport.sloth.data.m.class, (com.yandex.passport.sloth.data.m) this.b);
        a4g.q(com.yandex.passport.sloth.dependencies.g.class, (com.yandex.passport.sloth.dependencies.g) this.c);
        a4g.q(com.yandex.passport.sloth.dependencies.b.class, (com.yandex.passport.sloth.dependencies.b) this.d);
        com.yandex.passport.sloth.dependencies.b bVar = (com.yandex.passport.sloth.dependencies.b) this.d;
        com.yandex.passport.sloth.data.m mVar = (com.yandex.passport.sloth.data.m) this.b;
        com.yandex.passport.sloth.dependencies.g gVar = (com.yandex.passport.sloth.dependencies.g) this.c;
        com.yandex.passport.sloth.a aVar = new com.yandex.passport.sloth.a();
        aVar.a = toe.a(mVar);
        aVar.b = t8a.b(com.yandex.passport.sloth.command.l.a);
        aVar.c = toe.a(gVar);
        aVar.d = t8a.b(i0.a);
        rzm b = t8a.b(new h(10, new com.yandex.passport.sloth.dependencies.c(bVar, 7)));
        aVar.e = b;
        rzm b2 = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(b, 21));
        aVar.f = b2;
        aVar.g = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(b2, 23));
        com.yandex.passport.sloth.dependencies.c cVar = new com.yandex.passport.sloth.dependencies.c(bVar, 6);
        aVar.h = cVar;
        h hVar = new h(9, cVar);
        aVar.i = hVar;
        aVar.j = t8a.b(new d0(aVar.a, aVar.f, aVar.e, hVar));
        aVar.k = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(aVar.f, aVar.e, 21));
        aVar.l = t8a.b(new y(aVar.f, 1));
        aVar.m = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(aVar.e, aVar.f, 22));
        aVar.n = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(aVar.f, 22));
        aVar.o = t8a.b(new y(aVar.f, 0));
        com.yandex.passport.sloth.dependencies.c cVar2 = new com.yandex.passport.sloth.dependencies.c(bVar, 0);
        aVar.p = cVar2;
        aVar.q = t8a.b(new com.yandex.passport.internal.badges.f((Object) cVar2, aVar.f, (rzm) aVar.a, 9));
        aVar.r = t8a.b(new y(aVar.f, 2));
        aVar.s = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(aVar.f, 26));
        aVar.t = t8a.b(new com.yandex.passport.internal.di.module.k(aVar.f, aVar.a, 21));
        rzm rzmVar = aVar.f;
        aVar.u = new com.yandex.passport.internal.ui.bouncer.sloth.i(rzmVar, 27);
        aVar.v = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(rzmVar, 25));
        aVar.w = new com.yandex.passport.internal.ui.bouncer.sloth.i(aVar.p, 29);
        rzm b3 = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(aVar.f, 28));
        aVar.x = b3;
        aVar.y = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(aVar.f, b3, 20));
        aVar.z = t8a.b(new com.yandex.passport.internal.ui.common.c(aVar.b, t8a.b(new com.yandex.passport.sloth.command.q(aVar.a, aVar.c, aVar.d, aVar.g, aVar.j, aVar.k, aVar.l, aVar.m, aVar.n, aVar.o, aVar.q, aVar.r, aVar.s, aVar.t, aVar.u, aVar.v, aVar.w, aVar.x, aVar.y, t8a.b(new com.yandex.passport.internal.helper.i(aVar.a, 1)), new com.yandex.passport.internal.ui.bouncer.sloth.i(aVar.f, 24))), aVar.e, 20));
        aVar.A = new com.yandex.passport.sloth.dependencies.c(bVar, 3);
        aVar.B = new h(11, new com.yandex.passport.sloth.dependencies.c(bVar, 9));
        aVar.C = new com.yandex.passport.sloth.dependencies.c(bVar, 2);
        aVar.D = t8a.b(com.yandex.passport.sloth.g.a);
        rzm b4 = t8a.b(new com.yandex.passport.internal.di.module.k(new com.yandex.passport.sloth.dependencies.c(bVar, 5), aVar.e, 20));
        aVar.E = b4;
        aVar.F = t8a.b(new k0(aVar.a, aVar.C, aVar.D, aVar.e, aVar.f, b4, 0));
        aVar.G = t8a.b(new k0(aVar.a, aVar.A, aVar.B, aVar.F, t8a.b(new com.yandex.passport.internal.ui.common.c(aVar.e, aVar.f, aVar.E, 19)), aVar.e, 1));
        aVar.H = new com.yandex.passport.sloth.dependencies.c(bVar, 10);
        aVar.I = new com.yandex.passport.sloth.dependencies.c(bVar, 8);
        com.yandex.passport.sloth.dependencies.c cVar3 = new com.yandex.passport.sloth.dependencies.c(bVar, 11);
        aVar.J = cVar3;
        aVar.K = new com.yandex.passport.sloth.dependencies.c(bVar, 1);
        aVar.L = new com.yandex.passport.sloth.dependencies.c(bVar, 4);
        aVar.M = t8a.b(new d13(aVar.a, aVar.H, aVar.I, aVar.J, aVar.A, aVar.f, aVar.i, aVar.K, aVar.L, aVar.D, aVar.h, t8a.b(new com.yandex.passport.internal.di.module.k(aVar.a, cVar3, 23)), aVar.e));
        aVar.N = t8a.b(new com.yandex.passport.internal.badges.f(aVar.e, aVar.f, (rzm) aVar.a, 10));
        aVar.O = t8a.b(new i1(aVar.a, aVar.z, aVar.f, aVar.G, aVar.E, aVar.M, aVar.N, t8a.b(new com.yandex.passport.internal.helper.i(aVar.a, 2)), aVar.e, 1));
        return aVar;
    }

    public void u(int i, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button.c cVar, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button.a aVar, com.yandex.passport.sloth.ui.c cVar2) {
        if (Intrinsics.d(cVar, (com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button.c) this.d)) {
            return;
        }
        cVar.getClass();
        cVar.getCheckableContainer().setActivated(true);
        cVar.getIndicatorImageView().setActivated(true);
        com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button.c cVar3 = (com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button.c) this.d;
        if (cVar3 != null) {
            cVar3.getCheckableContainer().setActivated(false);
            cVar3.getIndicatorImageView().setActivated(false);
        }
        this.d = cVar;
        com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.expand.b productExpandTexts = ((com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.group.b) this.b).getProductExpandTexts();
        com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.expand.a aVar2 = aVar.b;
        productExpandTexts.getClass();
        com.yandex.plus.pay.ui.core.b.D(productExpandTexts.getProductTexts(), aVar2.a);
        Context context = productExpandTexts.getView().getContext();
        context.getClass();
        String string = context.getString(aVar2.b.a(R.string.PlusAcquisition_ButtonSection_Radio_TextForExpand));
        string.getClass();
        productExpandTexts.getExpandTextView().setText(string);
        r1.E(productExpandTexts.getExpandTextView(), aVar2.c);
        com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.d dVar = (com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.d) cVar2.b;
        com.yandex.plus.acquisition.sdk.button.section.ui.api.a aVar3 = (com.yandex.plus.acquisition.sdk.button.section.ui.api.a) dVar.k.get(Integer.valueOf(i));
        if (aVar3 != null) {
            dVar.b(aVar3);
            dVar.f = aVar3;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(3:18|19|20))(5:39|40|(1:42)|43|(2:45|32)(1:46))|21|(3:24|(1:34)(2:29|30)|22)|36|37|38))|54|6|7|(0)(0)|21|(1:22)|36|37|38|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
    
        if (r13.e((com.yandex.plus.pay.inapp.api.f) r8, r1) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0034, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
    
        r14 = defpackage.z7o.b;
        r14 = new defpackage.t7o(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d3, code lost:
    
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0031, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        throw r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x002e, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cc, code lost:
    
        r14 = defpackage.z7o.b;
        r14 = new defpackage.t7o(r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095 A[Catch: all -> 0x002e, CancellationException -> 0x0031, wis -> 0x0034, TryCatch #2 {wis -> 0x0034, CancellationException -> 0x0031, all -> 0x002e, blocks: (B:11:0x0029, B:12:0x00bf, B:19:0x0045, B:21:0x0089, B:22:0x008f, B:24:0x0095, B:27:0x00a4, B:30:0x00a8, B:37:0x00c4, B:38:0x00cb, B:40:0x0050, B:42:0x0060, B:43:0x006f), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v(String str, cg6 cg6Var) {
        com.yandex.plus.bdui.plus.checkout.payment.a aVar;
        int i;
        int i2;
        p pVar;
        int i3;
        Iterator it;
        if (cg6Var instanceof com.yandex.plus.bdui.plus.checkout.payment.a) {
            aVar = (com.yandex.plus.bdui.plus.checkout.payment.a) cg6Var;
            int i4 = aVar.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.p = i4 - Integer.MIN_VALUE;
                Object obj = aVar.n;
                nm6 nm6Var = nm6.a;
                i = aVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) this.d;
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar2)) {
                        bVar.c(aVar2, "PlusPayInAppPaymentHandlerImpl", "completePurchase(); consume purchase for productId = " + str);
                    }
                    com.yandex.plus.pay.inapp.api.b bVar2 = (com.yandex.plus.pay.inapp.api.b) this.b;
                    com.yandex.plus.pay.inapp.api.e eVar = com.yandex.plus.pay.inapp.api.e.a;
                    aVar.j = str;
                    aVar.k = this;
                    i2 = 0;
                    aVar.l = 0;
                    aVar.m = 0;
                    aVar.p = 1;
                    obj = bVar2.b(eVar, aVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    pVar = this;
                    i3 = 0;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Object obj2 = Unit.a;
                        r7o r7oVar2 = z7o.b;
                        return Boolean.valueOf(!(obj2 instanceof t7o));
                    }
                    int i5 = aVar.m;
                    i3 = aVar.l;
                    p pVar2 = aVar.k;
                    String str2 = aVar.j;
                    qgg.h0(obj);
                    i2 = i5;
                    str = str2;
                    pVar = pVar2;
                }
                it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    com.yandex.plus.pay.inapp.api.f fVar = (com.yandex.plus.pay.inapp.api.f) next;
                    if (fVar.b.contains(str) && !fVar.f) {
                        com.yandex.plus.pay.inapp.api.b bVar3 = (com.yandex.plus.pay.inapp.api.b) pVar.b;
                        aVar.j = null;
                        aVar.k = null;
                        aVar.l = i3;
                        aVar.m = i2;
                        aVar.p = 2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        aVar = new com.yandex.plus.bdui.plus.checkout.payment.a(this, cg6Var);
        Object obj3 = aVar.n;
        nm6 nm6Var2 = nm6.a;
        i = aVar.p;
        if (i != 0) {
        }
        it = ((Iterable) obj3).iterator();
        while (it.hasNext()) {
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // com.yandex.plus.bdui.b
    public void x(com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.document.e eVar) {
        ((com.yandex.plus.bdui.plus.scenario.j) this.b).x(mVar, eVar);
    }

    public com.yandex.plus.bdui.content.a y(q5f q5fVar) {
        t9f t9fVar;
        q5fVar.getClass();
        com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) this.d;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlusScaffoldContentDeserializerImpl", "deserialize(): json = " + q5fVar + "...");
        }
        w4f w4fVar = (w4f) q5fVar.get("type");
        v6f g = w4fVar != null ? x4f.g(w4fVar) : null;
        if (g == null || !g.g()) {
            com.yandex.plus.bdui.plus.utils.b bVar2 = new com.yandex.plus.bdui.plus.utils.b("Invalid content type value " + g, null, null, 2);
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
            if (!bVar.b(aVar2)) {
                throw bVar2;
            }
            bVar.a(aVar2, "PlusScaffoldContentDeserializerImpl", "deserialize() failed!", bVar2);
            throw bVar2;
        }
        arf arfVar = (arf) ((Map) this.c).get(g.a());
        if (arfVar == null || (t9fVar = (t9f) arfVar.getValue()) == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown content type " + g.a());
            com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
            if (!bVar.b(aVar3)) {
                throw illegalArgumentException;
            }
            bVar.a(aVar3, "PlusScaffoldContentDeserializerImpl", "deserialize() failed!", illegalArgumentException);
            throw illegalArgumentException;
        }
        try {
            com.yandex.plus.bdui.content.a aVar4 = (com.yandex.plus.bdui.content.a) ((x3f) this.b).a(t9fVar, q5fVar);
            if (bVar.b(aVar)) {
                bVar.c(aVar, "PlusScaffoldContentDeserializerImpl", "deserialize() succeeded: content = " + aVar4);
            }
            return aVar4;
        } catch (Throwable th) {
            com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.e;
            if (bVar.b(aVar5)) {
                bVar.a(aVar5, "PlusScaffoldContentDeserializerImpl", "deserialize() failed!", th);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(pz2 pz2Var, cg6 cg6Var) {
        com.yandex.plus.pay.inapp.google.internal.operation.d dVar;
        int i;
        if (cg6Var instanceof com.yandex.plus.pay.inapp.google.internal.operation.d) {
            dVar = (com.yandex.plus.pay.inapp.google.internal.operation.d) cg6Var;
            int i2 = dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dVar.j;
                nm6 nm6Var = nm6.a;
                i = dVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    awc awcVar = new awc();
                    List<String> list = (List) this.b;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    for (String str : list) {
                        y3e y3eVar = new y3e();
                        y3eVar.b = str;
                        y3eVar.c = (String) this.c;
                        arrayList.add(y3eVar.a());
                    }
                    awcVar.G(arrayList);
                    z6n t = awcVar.t();
                    dVar.l = 1;
                    gm5 j = hld.j();
                    pz2Var.f(t, new com.yandex.plus.pay.inapp.google.internal.a(j));
                    obj = j.s(dVar);
                    nm6 nm6Var2 = nm6.a;
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
                com.yandex.plus.pay.inapp.google.internal.i iVar = (com.yandex.plus.pay.inapp.google.internal.i) obj;
                return new com.yandex.plus.pay.inapp.google.common.internal.operation.c(iVar.b, com.yandex.plus.bdui.flex.ui.a.G(iVar.a));
            }
        }
        dVar = new com.yandex.plus.pay.inapp.google.internal.operation.d(this, cg6Var);
        Object obj2 = dVar.j;
        nm6 nm6Var3 = nm6.a;
        i = dVar.l;
        if (i != 0) {
        }
        com.yandex.plus.pay.inapp.google.internal.i iVar2 = (com.yandex.plus.pay.inapp.google.internal.i) obj2;
        return new com.yandex.plus.pay.inapp.google.common.internal.operation.c(iVar2.b, com.yandex.plus.bdui.flex.ui.a.G(iVar2.a));
    }

    @Override // com.yandex.plus.bdui.b
    public void c(com.yandex.plus.bdui.m mVar) {
    }

    @Override // com.yandex.plus.bdui.b
    public void i(com.yandex.plus.bdui.m mVar) {
    }

    @Override // com.yandex.plus.bdui.b
    public void l(com.yandex.plus.bdui.m mVar) {
    }

    @Override // com.yandex.plus.bdui.b
    public void w(com.yandex.plus.bdui.m mVar) {
    }

    @Override // com.yandex.plus.bdui.b
    public void j(com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.query.e eVar) {
    }

    @Override // com.yandex.plus.bdui.b
    public void k(com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.document.e eVar) {
    }

    @Override // com.yandex.plus.bdui.b
    public void s(com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.document.e eVar) {
    }

    public p(com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.group.b bVar, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a aVar) {
        this.a = 7;
        aVar.getClass();
        this.b = bVar;
        this.c = aVar;
    }

    public p(com.yandex.plus.core.benchmark.l lVar, com.yandex.plus.bdui.q qVar) {
        this.a = 17;
        this.b = lVar;
        this.c = qVar;
        this.d = new AtomicReference(com.yandex.plus.home.benchmark.a.a);
    }

    public p(com.yandex.plus.core.benchmark.l lVar, com.yandex.plus.bdui.q qVar, byte b) {
        this.a = 18;
        this.b = lVar;
        this.c = qVar;
        this.d = new AtomicReference(com.yandex.plus.home.benchmark.a.a);
    }

    public p(String str, String str2, com.yandex.plus.core.config.a aVar) {
        this.a = 14;
        aVar.getClass();
        this.b = str;
        this.c = str2;
        this.d = aVar;
    }

    public p(com.yandex.plus.bdui.flex.ui.s sVar, kotlinx.coroutines.a aVar) {
        this.a = 16;
        aVar.getClass();
        this.b = sVar;
        this.c = aVar;
        this.d = new LinkedHashMap();
    }

    public /* synthetic */ p(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(mm6 mm6Var, com.yandex.plus.acquisition.sdk.common.api.di.b bVar, Function0 function0) {
        this.a = 19;
        this.b = mm6Var;
        this.c = bVar;
        this.d = (ezc) function0;
    }

    public p(com.yandex.plus.home.auth.f fVar, com.yandex.plus.acquisition.sdk.common.api.di.b bVar) {
        this.a = 20;
        fVar.getClass();
        this.b = fVar;
        this.c = bVar;
        this.d = new CopyOnWriteArrayList();
    }

    public p(List list, String str) {
        this.a = 23;
        list.getClass();
        this.b = list;
        this.c = str;
        this.d = "getProducts(" + list + ", " + str + ')';
    }

    public p(com.yandex.plus.core.gradient.impl.b bVar, com.yandex.plus.core.gradient.impl.b bVar2) {
        this.a = 13;
        PorterDuff.Mode.SRC_OVER.getClass();
        this.b = bVar;
        this.c = bVar2;
        this.d = btf.b(new com.yandex.plus.bdui.plus.checkout.h(16, this));
    }

    public p(x3f x3fVar, Map map, com.yandex.plus.log.api.b bVar) {
        this.a = 12;
        map.getClass();
        bVar.getClass();
        this.b = x3fVar;
        this.c = map;
        this.d = bVar;
    }

    public p(com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.plus.checkout.o oVar, com.yandex.plus.log.api.b bVar) {
        this.a = 11;
        mVar.getClass();
        bVar.getClass();
        this.b = mVar;
        this.c = oVar;
        this.d = bVar;
    }

    public p(com.yandex.plus.bdui.flex.ui.s sVar, com.yandex.plus.home.featureflags.g gVar, kotlinx.coroutines.a aVar) {
        this.a = 15;
        gVar.getClass();
        aVar.getClass();
        this.b = sVar;
        this.c = gVar;
        this.d = aVar;
    }

    public p(com.yandex.plus.home.plaque.repository.api.a aVar, com.yandex.passport.internal.entities.j jVar, kotlinx.coroutines.a aVar2) {
        this.a = 22;
        aVar2.getClass();
        this.b = aVar;
        this.c = jVar;
        this.d = aVar2;
    }

    public p(com.yandex.plus.bdui.content.a aVar, com.yandex.plus.bdui.ui.a aVar2, View view) {
        this.a = 9;
        aVar.getClass();
        view.getClass();
        this.b = aVar;
        this.c = aVar2;
        this.d = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(Function0 function0, com.yandex.plus.log.api.b bVar, com.yandex.plus.pay.inapp.google.common.internal.operation.b bVar2) {
        this.a = 24;
        bVar.getClass();
        this.b = (ezc) function0;
        this.c = bVar;
        this.d = bVar2;
    }

    public p(ConstraintLayout constraintLayout, Toolbar toolbar, View view, com.yandex.passport.common.network.n nVar, WebView webView) {
        this.a = 4;
        webView.getClass();
        this.b = view;
        this.c = nVar;
        this.d = webView;
        webView.setOutlineProvider(new c28(6, this));
    }

    public p(s0 s0Var, d2 d2Var, b1 b1Var) {
        this.a = 6;
        s0Var.getClass();
        d2Var.getClass();
        b1Var.getClass();
        this.b = s0Var;
        this.c = d2Var;
        this.d = b1Var;
    }

    public p(com.yandex.passport.internal.usecase.vpn.e eVar, com.yandex.passport.internal.config.o oVar, k1 k1Var) {
        this.a = 3;
        eVar.getClass();
        oVar.getClass();
        k1Var.getClass();
        this.b = eVar;
        this.c = oVar;
        this.d = k1Var;
    }

    public p(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.i iVar, com.yandex.passport.internal.entities.j jVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d dVar) {
        this.a = 26;
        this.b = iVar;
        this.c = jVar;
        this.d = dVar;
    }

    public p(com.yandex.plus.pay.inapp.api.b bVar, com.yandex.plus.pay.a aVar, com.yandex.plus.log.api.b bVar2) {
        this.a = 10;
        bVar.getClass();
        bVar2.getClass();
        this.b = bVar;
        this.c = aVar;
        this.d = bVar2;
    }

    public p(com.yandex.plus.bdui.plus.scenario.j jVar, com.yandex.passport.common.network.n nVar) {
        this.a = 8;
        this.c = jVar;
        this.d = nVar;
        this.b = jVar;
    }

    public p(Context context, com.yandex.passport.common.coroutine.e eVar, com.yandex.passport.common.coroutine.a aVar) {
        this.a = 0;
        context.getClass();
        eVar.getClass();
        aVar.getClass();
        this.b = context;
        this.c = eVar;
        this.d = aVar;
    }

    public p(com.yandex.passport.internal.push.g gVar, com.yandex.passport.internal.storage.m mVar, com.yandex.passport.common.core.f fVar) {
        this.a = 2;
        gVar.getClass();
        mVar.getClass();
        this.b = gVar;
        this.c = mVar;
        this.d = fVar;
    }
}
