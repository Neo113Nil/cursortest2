package com.yandex.plus.home.plaque.feature.internal.presentation;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Base64;
import com.yandex.passport.internal.ui.social.i;
import com.yandex.passport.sloth.ui.b0;
import com.yandex.plus.bdui.q;
import com.yandex.plus.core.network.error.k;
import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.j;
import com.yandex.plus.home.feature.webviews.internalapi.subscription.l;
import com.yandex.plus.home.feature.webviews.internalapi.subscription.o;
import com.yandex.plus.home.feature.webviews.internalapi.subscription.p;
import com.yandex.plus.home.repository.api.model.webconfig.a0;
import com.yandex.plus.home.repository.api.model.webconfig.x;
import com.yandex.plus.home.repository.api.model.webconfig.z;
import defpackage.b6e;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.e0;
import defpackage.ern;
import defpackage.hrg;
import defpackage.i6x;
import defpackage.j0v;
import defpackage.jj4;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.otm;
import defpackage.ouj;
import defpackage.ptm;
import defpackage.pyc;
import defpackage.pz2;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rzm;
import defpackage.su4;
import defpackage.t5x;
import defpackage.t75;
import defpackage.t7o;
import defpackage.tyf;
import defpackage.tz2;
import defpackage.tzb;
import defpackage.uz2;
import defpackage.v75;
import defpackage.wis;
import defpackage.x0q;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.yfx;
import defpackage.z0j;
import defpackage.z7o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class b implements com.yandex.plus.pay.inapp.google.common.internal.operation.b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0143, code lost:
    
        if (r3 == r5) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0145, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fe, code lost:
    
        if (r3 == r5) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, com.yandex.plus.core.network.context.a aVar, ArrayList arrayList, cg6 cg6Var) {
        com.yandex.plus.core.network.okhttp.call.c cVar;
        int i;
        com.yandex.plus.core.network.call.c cVar2;
        com.yandex.plus.core.network.context.a aVar2 = aVar;
        ArrayList arrayList2 = arrayList;
        bVar.getClass();
        if (cg6Var instanceof com.yandex.plus.core.network.okhttp.call.c) {
            cVar = (com.yandex.plus.core.network.okhttp.call.c) cg6Var;
            int i2 = cVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.n = i2 - Integer.MIN_VALUE;
                Object obj = cVar.l;
                Object obj2 = nm6.a;
                i = cVar.n;
                if (i != 0) {
                    ArrayList q = su4.q(obj);
                    for (Object obj3 : arrayList2) {
                        if (obj3 instanceof com.yandex.plus.core.network.okhttp.interceptor.f) {
                            q.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(v75.o(q, 10));
                    Iterator it = q.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new com.yandex.plus.core.network.okhttp.call.d((com.yandex.plus.core.network.okhttp.interceptor.f) it.next(), 0));
                    }
                    ArrayList arrayList4 = new ArrayList(v75.o(q, 10));
                    Iterator it2 = q.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(new com.yandex.plus.core.network.okhttp.call.d((com.yandex.plus.core.network.okhttp.interceptor.f) it2.next(), 1));
                    }
                    com.yandex.plus.core.network.okhttp.call.a aVar3 = new com.yandex.plus.core.network.okhttp.call.a(aVar2, arrayList3, arrayList4);
                    Pair pair = (Pair) bVar.a;
                    Pair pair2 = new Pair(pair.a, new com.yandex.plus.core.network.impl.c((com.yandex.plus.core.network.impl.c) pair.b, aVar3));
                    ArrayList arrayList5 = new ArrayList(v75.o(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(new q(2, (com.yandex.plus.core.network.okhttp.interceptor.f) it3.next(), com.yandex.plus.core.network.okhttp.interceptor.f.class, "interceptGet", "interceptGet(Lcom/yandex/plus/core/network/interceptor/NetworkInterceptor$Chain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 14));
                    }
                    cVar.j = aVar2;
                    cVar.k = arrayList2;
                    cVar.n = 1;
                    obj = bVar.d(aVar2, pair2, arrayList5, cVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return (com.yandex.plus.core.network.call.c) obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ArrayList arrayList6 = cVar.k;
                    com.yandex.plus.core.network.context.a aVar4 = cVar.j;
                    qgg.h0(obj);
                    arrayList2 = arrayList6;
                    aVar2 = aVar4;
                }
                cVar2 = (com.yandex.plus.core.network.call.c) obj;
                if (cVar2 instanceof com.yandex.plus.core.network.call.b) {
                    if (cVar2 instanceof com.yandex.plus.core.network.call.a) {
                        return com.yandex.plus.bdui.plus.analytics.b.c(((com.yandex.plus.core.network.call.a) cVar2).a);
                    }
                    b6e.s();
                    return null;
                }
                Object obj4 = ((com.yandex.plus.core.network.call.b) cVar2).a;
                ArrayList arrayList7 = new ArrayList(v75.o(arrayList2, 10));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    arrayList7.add(new q(2, (com.yandex.plus.core.network.okhttp.interceptor.f) it4.next(), com.yandex.plus.core.network.okhttp.interceptor.f.class, "interceptMap", "interceptMap(Lcom/yandex/plus/core/network/interceptor/NetworkInterceptor$Chain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 15));
                }
                cVar.j = null;
                cVar.k = null;
                cVar.n = 2;
                obj = bVar.h(aVar2, obj4, arrayList7, cVar);
            }
        }
        cVar = new com.yandex.plus.core.network.okhttp.call.c(bVar, cg6Var);
        Object obj5 = cVar.l;
        Object obj22 = nm6.a;
        i = cVar.n;
        if (i != 0) {
        }
        cVar2 = (com.yandex.plus.core.network.call.c) obj5;
        if (cVar2 instanceof com.yandex.plus.core.network.call.b) {
        }
    }

    public static String j(String str, byte[] bArr) {
        StringBuilder u = ouj.u("data:", str, ";base64,");
        String encodeToString = Base64.encodeToString(bArr, 2);
        encodeToString.getClass();
        u.append(encodeToString);
        return u.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // com.yandex.plus.pay.inapp.google.common.internal.operation.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(pz2 pz2Var, cg6 cg6Var) {
        com.yandex.plus.pay.inapp.google.internal.operation.g gVar;
        int i;
        otm otmVar;
        tzb tzbVar;
        uz2 e;
        int i2;
        String str;
        Object next;
        com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) this.b;
        ptm ptmVar = (ptm) this.a;
        try {
            if (cg6Var instanceof com.yandex.plus.pay.inapp.google.internal.operation.g) {
                gVar = (com.yandex.plus.pay.inapp.google.internal.operation.g) cg6Var;
                int i3 = gVar.l;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    gVar.l = i3 - Integer.MIN_VALUE;
                    Object obj = gVar.j;
                    nm6 nm6Var = nm6.a;
                    i = gVar.l;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        ArrayList arrayList = ptmVar.h;
                        if (arrayList != null) {
                            Iterator it = arrayList.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                                if (it.hasNext()) {
                                    int size = ((otm) next).b.a.size();
                                    do {
                                        Object next2 = it.next();
                                        int size2 = ((otm) next2).b.a.size();
                                        if (size < size2) {
                                            next = next2;
                                            size = size2;
                                        }
                                    } while (it.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            otmVar = (otm) next;
                        } else {
                            otmVar = null;
                        }
                        Activity activity = (Activity) this.d;
                        e0 e0Var = new e0((char) 0, 3);
                        boolean z = false;
                        e0Var.c = 0;
                        e0Var.b = true;
                        yfx yfxVar = new yfx();
                        yfxVar.b = ptmVar;
                        if (ptmVar.a() != null) {
                            ptmVar.a().getClass();
                            String str2 = ptmVar.a().c;
                            if (str2 != null) {
                                yfxVar.c = str2;
                            }
                        }
                        if (otmVar != null && (str = otmVar.a) != null) {
                            if (TextUtils.isEmpty(str)) {
                                xq0.x("offerToken can not be empty");
                                return null;
                            }
                            yfxVar.c = str;
                        }
                        ptm ptmVar2 = (ptm) yfxVar.b;
                        if (ptmVar2 == null) {
                            jj4.j("ProductDetails is required for constructing ProductDetailsParams.");
                            return null;
                        }
                        if (ptmVar2.h != null && ((String) yfxVar.c) == null) {
                            jj4.j("offerToken is required for constructing ProductDetailsParams for subscriptions.");
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList(t75.c(new tz2(yfxVar)));
                        com.yandex.plus.pay.inapp.api.h hVar = (com.yandex.plus.pay.inapp.api.h) this.c;
                        if (hVar != null) {
                            String str3 = hVar.a;
                            int ordinal = hVar.b.ordinal();
                            if (ordinal == 0) {
                                i2 = 5;
                            } else {
                                if (ordinal != 1) {
                                    b6e.s();
                                    return null;
                                }
                                i2 = 6;
                            }
                            boolean z2 = (TextUtils.isEmpty(str3) && TextUtils.isEmpty(null)) ? false : true;
                            boolean isEmpty = TextUtils.isEmpty(null);
                            if (z2 && !isEmpty) {
                                xq0.x("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                                return null;
                            }
                            if (!z2 && isEmpty) {
                                xq0.x("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                                return null;
                            }
                            tzb tzbVar2 = new tzb();
                            tzbVar2.a = str3;
                            tzbVar2.b = i2;
                            e0Var = new e0((char) 0, 3);
                            e0Var.d = tzbVar2.a;
                            e0Var.c = tzbVar2.b;
                        }
                        boolean isEmpty2 = arrayList2.isEmpty();
                        if (isEmpty2) {
                            xq0.x("Details of the products must be provided.");
                            return null;
                        }
                        arrayList2.forEach(new t5x());
                        z0j z0jVar = new z0j(4, false);
                        if (!isEmpty2 && !((tz2) arrayList2.get(0)).a.b.optString("packageName").isEmpty()) {
                            z = true;
                        }
                        z0jVar.b = z;
                        boolean z3 = true;
                        if (TextUtils.isEmpty((String) e0Var.d) && TextUtils.isEmpty(null)) {
                            z3 = false;
                        }
                        boolean isEmpty3 = TextUtils.isEmpty(null);
                        if (z3 && !isEmpty3) {
                            xq0.x("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                        } else if (e0Var.b || z3 || !isEmpty3) {
                            tzbVar = new tzb();
                            tzbVar.a = (String) e0Var.d;
                            tzbVar.b = e0Var.c;
                            z0jVar.c = tzbVar;
                            z0jVar.e = new ArrayList();
                            z0jVar.d = i6x.v(arrayList2);
                            e = pz2Var.e(activity, z0jVar);
                            e.getClass();
                            if (e.a == 0) {
                                return new com.yandex.plus.pay.inapp.google.common.internal.operation.c(null, com.yandex.plus.bdui.flex.ui.a.G(e));
                            }
                            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                            if (bVar.b(aVar)) {
                                bVar.c(aVar, "PurchaseOperation", "Started waiting for new purchase");
                            }
                            i iVar = new i(this, continuation, 24);
                            gVar.l = 1;
                            obj = tyf.J(60000L, iVar, gVar);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            xq0.x("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                        }
                        tzbVar = null;
                        z0jVar.c = tzbVar;
                        z0jVar.e = new ArrayList();
                        z0jVar.d = i6x.v(arrayList2);
                        e = pz2Var.e(activity, z0jVar);
                        e.getClass();
                        if (e.a == 0) {
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    return (com.yandex.plus.pay.inapp.google.common.internal.operation.c) obj;
                }
            }
            if (i != 0) {
            }
            return (com.yandex.plus.pay.inapp.google.common.internal.operation.c) obj;
        } catch (wis unused) {
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
            if (bVar.b(aVar2)) {
                bVar.c(aVar2, "PurchaseOperation", "Purchase was not completed within 60000 ms");
            }
            return new com.yandex.plus.pay.inapp.google.common.internal.operation.c(null, new com.yandex.plus.pay.inapp.google.common.internal.operation.e(com.yandex.plus.pay.inapp.google.common.internal.operation.d.k, "Timeout of waiting for new purchase"));
        }
        gVar = new com.yandex.plus.pay.inapp.google.internal.operation.g(this, cg6Var);
        Object obj2 = gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gVar.l;
        Continuation continuation2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(com.yandex.plus.core.network.context.a aVar, cg6 cg6Var) {
        com.yandex.plus.core.network.okhttp.call.b bVar;
        int i;
        if (cg6Var instanceof com.yandex.plus.core.network.okhttp.call.b) {
            bVar = (com.yandex.plus.core.network.okhttp.call.b) cg6Var;
            int i2 = bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.l = i2 - Integer.MIN_VALUE;
                com.yandex.plus.core.network.okhttp.call.b bVar2 = bVar;
                Object obj = bVar2.j;
                Object obj2 = nm6.a;
                i = bVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.core.network.error.a aVar2 = (com.yandex.plus.core.network.error.a) this.e;
                    aVar.getClass();
                    aVar.a(ern.a(com.yandex.plus.core.network.error.a.class), aVar2);
                    List list = (List) this.d;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        com.yandex.plus.core.network.okhttp.interceptor.f fVar = (com.yandex.plus.core.network.okhttp.interceptor.f) ((Function0) it.next()).invoke();
                        if (fVar != null) {
                            arrayList.add(fVar);
                        }
                    }
                    Object obj3 = Unit.a;
                    pyc j0vVar = new j0v(this, arrayList, null, 16);
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new q(2, (com.yandex.plus.core.network.okhttp.interceptor.f) it2.next(), com.yandex.plus.core.network.okhttp.interceptor.f.class, "interceptCall", "interceptCall(Lcom/yandex/plus/core/network/interceptor/NetworkInterceptor$Chain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 13));
                    }
                    bVar2.l = 1;
                    obj = i(aVar, obj3, j0vVar, arrayList2, com.yandex.plus.core.network.error.f.a, bVar2);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return (com.yandex.plus.core.network.call.c) obj;
            }
        }
        bVar = new com.yandex.plus.core.network.okhttp.call.b(this, cg6Var);
        com.yandex.plus.core.network.okhttp.call.b bVar22 = bVar;
        Object obj4 = bVar22.j;
        Object obj22 = nm6.a;
        i = bVar22.l;
        if (i != 0) {
        }
        return (com.yandex.plus.core.network.call.c) obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(com.yandex.plus.core.network.context.a aVar, Pair pair, ArrayList arrayList, cg6 cg6Var) {
        com.yandex.plus.core.network.okhttp.call.e eVar;
        int i;
        if (cg6Var instanceof com.yandex.plus.core.network.okhttp.call.e) {
            eVar = (com.yandex.plus.core.network.okhttp.call.e) cg6Var;
            int i2 = eVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.l = i2 - Integer.MIN_VALUE;
                com.yandex.plus.core.network.okhttp.call.e eVar2 = eVar;
                Object obj = eVar2.j;
                Object obj2 = nm6.a;
                i = eVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pyc j0vVar = new j0v(this, (Continuation) null, 17);
                    eVar2.l = 1;
                    obj = i(aVar, pair, j0vVar, arrayList, com.yandex.plus.core.network.error.h.a, eVar2);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return (com.yandex.plus.core.network.call.c) obj;
            }
        }
        eVar = new com.yandex.plus.core.network.okhttp.call.e(this, cg6Var);
        com.yandex.plus.core.network.okhttp.call.e eVar22 = eVar;
        Object obj3 = eVar22.j;
        Object obj22 = nm6.a;
        i = eVar22.l;
        if (i != 0) {
        }
        return (com.yandex.plus.core.network.call.c) obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable e(a0 a0Var, String str, String str2, String str3, cg6 cg6Var) {
        com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.h hVar;
        Object obj;
        int i;
        xqn i2;
        List list;
        z zVar;
        String str4;
        Throwable th;
        t7o t7oVar;
        String str5;
        String str6;
        wis e;
        p pVar;
        xqn xqnVar;
        String str7;
        Throwable a;
        com.yandex.plus.home.feature.webviews.internal.purchase.subscription.common.c cVar;
        Object cVar2;
        a0 a0Var2 = a0Var;
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        try {
            if (cg6Var instanceof com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.h) {
                hVar = (com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.h) cg6Var;
                int i3 = hVar.s;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    hVar.s = i3 - Integer.MIN_VALUE;
                    obj = hVar.q;
                    nm6 nm6Var = nm6.a;
                    i = hVar.s;
                    if (i != 0) {
                        i2 = hrg.i(obj);
                        if (a0Var2 == null) {
                            i2.a = new o(str8, str9, str10);
                        }
                        if (a0Var2 != null && (zVar = a0Var2.c) != null) {
                            x xVar = zVar.d;
                            str4 = zVar.f;
                            if (StringsKt.U(str4)) {
                                i2.a = new l(str8, str9, str10, xVar.name());
                            } else {
                                try {
                                    r7o r7oVar = z7o.b;
                                    com.yandex.passport.data.network.l lVar = (com.yandex.passport.data.network.l) this.c;
                                    List list2 = zVar.a;
                                    hVar.j = a0Var2;
                                    hVar.k = str8;
                                    hVar.l = str9;
                                    hVar.m = str10;
                                    hVar.n = i2;
                                    hVar.o = zVar;
                                    hVar.p = str4;
                                    hVar.s = 1;
                                    obj = lVar.A(xVar, list2, str4, hVar);
                                    if (obj == nm6Var) {
                                        return nm6Var;
                                    }
                                } catch (wis e2) {
                                    e = e2;
                                    r7o r7oVar2 = z7o.b;
                                    t7oVar = new t7o(e);
                                    str5 = str9;
                                    str6 = str10;
                                    obj = t7oVar;
                                    xqnVar = i2;
                                    str7 = str4;
                                    String str11 = str8;
                                    a = z7o.a(obj);
                                    if (a != null) {
                                    }
                                    if (obj instanceof t7o) {
                                    }
                                    list = (List) obj;
                                    i2 = xqnVar;
                                    if (list == null) {
                                    }
                                    pVar = (p) i2.a;
                                    if (pVar != null) {
                                    }
                                    return new Pair(list, i2.a);
                                } catch (Throwable th2) {
                                    th = th2;
                                    r7o r7oVar3 = z7o.b;
                                    t7oVar = new t7o(th);
                                    str5 = str9;
                                    str6 = str10;
                                    obj = t7oVar;
                                    xqnVar = i2;
                                    str7 = str4;
                                    String str112 = str8;
                                    a = z7o.a(obj);
                                    if (a != null) {
                                    }
                                    if (obj instanceof t7o) {
                                    }
                                    list = (List) obj;
                                    i2 = xqnVar;
                                    if (list == null) {
                                    }
                                    pVar = (p) i2.a;
                                    if (pVar != null) {
                                    }
                                    return new Pair(list, i2.a);
                                }
                            }
                        }
                        list = null;
                        if (list == null) {
                            list = c5b.a;
                        }
                        pVar = (p) i2.a;
                        if (pVar != null) {
                            com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.e;
                            String str12 = "Error getting subscription info, config=" + a0Var2 + " error=" + pVar;
                            jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.d, bVar, str12, null);
                        }
                        return new Pair(list, i2.a);
                    }
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str13 = hVar.p;
                    z zVar2 = hVar.o;
                    xqn xqnVar2 = hVar.n;
                    str10 = hVar.m;
                    String str14 = hVar.l;
                    String str15 = hVar.k;
                    a0 a0Var3 = hVar.j;
                    try {
                        qgg.h0(obj);
                        str4 = str13;
                        zVar = zVar2;
                        a0Var2 = a0Var3;
                        str8 = str15;
                        i2 = xqnVar2;
                        str9 = str14;
                    } catch (wis e3) {
                        e = e3;
                        str4 = str13;
                        zVar = zVar2;
                        a0Var2 = a0Var3;
                        str8 = str15;
                        i2 = xqnVar2;
                        str9 = str14;
                        r7o r7oVar22 = z7o.b;
                        t7oVar = new t7o(e);
                        str5 = str9;
                        str6 = str10;
                        obj = t7oVar;
                        xqnVar = i2;
                        str7 = str4;
                        String str1122 = str8;
                        a = z7o.a(obj);
                        if (a != null) {
                        }
                        if (obj instanceof t7o) {
                        }
                        list = (List) obj;
                        i2 = xqnVar;
                        if (list == null) {
                        }
                        pVar = (p) i2.a;
                        if (pVar != null) {
                        }
                        return new Pair(list, i2.a);
                    } catch (Throwable th3) {
                        th = th3;
                        str4 = str13;
                        zVar = zVar2;
                        a0Var2 = a0Var3;
                        str8 = str15;
                        i2 = xqnVar2;
                        str9 = str14;
                        r7o r7oVar32 = z7o.b;
                        t7oVar = new t7o(th);
                        str5 = str9;
                        str6 = str10;
                        obj = t7oVar;
                        xqnVar = i2;
                        str7 = str4;
                        String str11222 = str8;
                        a = z7o.a(obj);
                        if (a != null) {
                        }
                        if (obj instanceof t7o) {
                        }
                        list = (List) obj;
                        i2 = xqnVar;
                        if (list == null) {
                        }
                        pVar = (p) i2.a;
                        if (pVar != null) {
                        }
                        return new Pair(list, i2.a);
                    }
                    r7o r7oVar4 = z7o.b;
                    str5 = str9;
                    str6 = str10;
                    xqnVar = i2;
                    str7 = str4;
                    String str112222 = str8;
                    a = z7o.a(obj);
                    if (a != null && (a instanceof com.yandex.plus.home.feature.webviews.internal.purchase.subscription.common.c)) {
                        cVar = (com.yandex.plus.home.feature.webviews.internal.purchase.subscription.common.c) a;
                        String name = zVar.d.name();
                        str7.getClass();
                        name.getClass();
                        if (!(cVar instanceof com.yandex.plus.home.feature.webviews.internal.purchase.subscription.common.a)) {
                            cVar2 = new com.yandex.plus.home.feature.webviews.internalapi.subscription.f(str112222, str5, str6, str7, name);
                        } else {
                            if (!(cVar instanceof com.yandex.plus.home.feature.webviews.internal.purchase.subscription.common.b)) {
                                b6e.s();
                                return null;
                            }
                            com.yandex.plus.home.feature.webviews.internal.purchase.subscription.common.b bVar2 = (com.yandex.plus.home.feature.webviews.internal.purchase.subscription.common.b) cVar;
                            cVar2 = new com.yandex.plus.home.feature.webviews.internalapi.subscription.c(str112222, str5, str6, str7, bVar2.a, bVar2.b, name);
                        }
                        xqnVar.a = cVar2;
                    }
                    if (obj instanceof t7o) {
                        obj = null;
                    }
                    list = (List) obj;
                    i2 = xqnVar;
                    if (list == null) {
                    }
                    pVar = (p) i2.a;
                    if (pVar != null) {
                    }
                    return new Pair(list, i2.a);
                }
            }
            if (i != 0) {
            }
            r7o r7oVar42 = z7o.b;
            str5 = str9;
            str6 = str10;
            xqnVar = i2;
            str7 = str4;
            String str1122222 = str8;
            a = z7o.a(obj);
            if (a != null) {
                cVar = (com.yandex.plus.home.feature.webviews.internal.purchase.subscription.common.c) a;
                String name2 = zVar.d.name();
                str7.getClass();
                name2.getClass();
                if (!(cVar instanceof com.yandex.plus.home.feature.webviews.internal.purchase.subscription.common.a)) {
                }
                xqnVar.a = cVar2;
            }
            if (obj instanceof t7o) {
            }
            list = (List) obj;
            i2 = xqnVar;
            if (list == null) {
            }
            pVar = (p) i2.a;
            if (pVar != null) {
            }
            return new Pair(list, i2.a);
        } catch (CancellationException e4) {
            throw e4;
        }
        hVar = new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.h(this, cg6Var);
        obj = hVar.q;
        nm6 nm6Var2 = nm6.a;
        i = hVar.s;
    }

    public b0 f() {
        return (b0) ((rzm) this.f).get();
    }

    @Override // com.yandex.plus.pay.inapp.google.common.internal.operation.b
    public String getName() {
        return (String) this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(com.yandex.plus.core.network.context.a aVar, Object obj, ArrayList arrayList, cg6 cg6Var) {
        com.yandex.plus.core.network.okhttp.call.f fVar;
        int i;
        if (cg6Var instanceof com.yandex.plus.core.network.okhttp.call.f) {
            fVar = (com.yandex.plus.core.network.okhttp.call.f) cg6Var;
            int i2 = fVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.l = i2 - Integer.MIN_VALUE;
                com.yandex.plus.core.network.okhttp.call.f fVar2 = fVar;
                Object obj2 = fVar2.j;
                Object obj3 = nm6.a;
                i = fVar2.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    pyc j0vVar = new j0v(this, (Continuation) null, 18);
                    fVar2.l = 1;
                    obj2 = i(aVar, obj, j0vVar, arrayList, com.yandex.plus.core.network.error.e.a, fVar2);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                return (com.yandex.plus.core.network.call.c) obj2;
            }
        }
        fVar = new com.yandex.plus.core.network.okhttp.call.f(this, cg6Var);
        com.yandex.plus.core.network.okhttp.call.f fVar22 = fVar;
        Object obj22 = fVar22.j;
        Object obj32 = nm6.a;
        i = fVar22.l;
        if (i != 0) {
        }
        return (com.yandex.plus.core.network.call.c) obj22;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(com.yandex.plus.core.network.context.a aVar, Object obj, pyc pycVar, List list, k kVar, cg6 cg6Var) {
        com.yandex.plus.core.network.okhttp.call.g gVar;
        int i;
        if (cg6Var instanceof com.yandex.plus.core.network.okhttp.call.g) {
            gVar = (com.yandex.plus.core.network.okhttp.call.g) cg6Var;
            int i2 = gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = gVar.j;
                nm6 nm6Var = nm6.a;
                i = gVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.plus.core.network.okhttp.call.h hVar = new com.yandex.plus.core.network.okhttp.call.h(0, pycVar);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new com.yandex.plus.core.network.okhttp.call.i((Function2) it.next()));
                    }
                    com.yandex.plus.core.network.interceptor.e eVar = new com.yandex.plus.core.network.interceptor.e(aVar, obj, CollectionsKt.h0(arrayList, hVar), 0, new com.yandex.plus.bdui.templating.render.a(3, this, kVar), true);
                    gVar.l = 1;
                    obj2 = eVar.b(obj, gVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                return (com.yandex.plus.core.network.call.c) obj2;
            }
        }
        gVar = new com.yandex.plus.core.network.okhttp.call.g(this, cg6Var);
        Object obj22 = gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gVar.l;
        if (i != 0) {
        }
        return (com.yandex.plus.core.network.call.c) obj22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (r10.emit(r2, r6) != r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(String str, String str2, String str3, cg6 cg6Var) {
        j jVar;
        Object obj;
        nm6 nm6Var;
        int i;
        com.yandex.plus.home.repository.api.model.webconfig.b0 b0Var;
        b bVar;
        String str4;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.p = i2 - Integer.MIN_VALUE;
                j jVar2 = jVar;
                obj = jVar2.n;
                nm6Var = nm6.a;
                i = jVar2.p;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.data.network.l lVar = (com.yandex.passport.data.network.l) this.b;
                    jVar2.j = str;
                    jVar2.k = str2;
                    jVar2.l = str3;
                    jVar2.p = 1;
                    obj = lVar.z(str, str2, str3, jVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else if (i == 1) {
                    str3 = jVar2.l;
                    str2 = jVar2.k;
                    str = jVar2.j;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b0Var = jVar2.m;
                    str4 = jVar2.j;
                    qgg.h0(obj);
                    bVar = this;
                    Pair pair = (Pair) obj;
                    com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.f fVar = new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.f(b0Var == null ? b0Var.c : null, (List) pair.a, (p) pair.b, str4);
                    x0q x0qVar = (x0q) bVar.e;
                    jVar2.j = null;
                    jVar2.k = null;
                    jVar2.l = null;
                    jVar2.m = null;
                    jVar2.p = 3;
                }
                String str5 = str;
                String str6 = str2;
                String str7 = str3;
                b0Var = (com.yandex.plus.home.repository.api.model.webconfig.b0) obj;
                a0 a0Var = b0Var == null ? b0Var.c : null;
                jVar2.j = str5;
                jVar2.k = null;
                jVar2.l = null;
                jVar2.m = b0Var;
                jVar2.p = 2;
                bVar = this;
                obj = bVar.e(a0Var, str6, str7, str5, jVar2);
                if (obj != nm6Var) {
                    str4 = str5;
                    Pair pair2 = (Pair) obj;
                    com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.f fVar2 = new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.f(b0Var == null ? b0Var.c : null, (List) pair2.a, (p) pair2.b, str4);
                    x0q x0qVar2 = (x0q) bVar.e;
                    jVar2.j = null;
                    jVar2.k = null;
                    jVar2.l = null;
                    jVar2.m = null;
                    jVar2.p = 3;
                }
                return nm6Var;
            }
        }
        jVar = new j(this, cg6Var);
        j jVar22 = jVar;
        obj = jVar22.n;
        nm6Var = nm6.a;
        i = jVar22.p;
        if (i != 0) {
        }
        String str52 = str;
        String str62 = str2;
        String str72 = str3;
        b0Var = (com.yandex.plus.home.repository.api.model.webconfig.b0) obj;
        if (b0Var == null) {
        }
        jVar22.j = str52;
        jVar22.k = null;
        jVar22.l = null;
        jVar22.m = b0Var;
        jVar22.p = 2;
        bVar = this;
        obj = bVar.e(a0Var, str62, str72, str52, jVar22);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }
}
