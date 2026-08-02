package com.yandex.plus.pay.ui.core.debug.internal.ui.form;

import android.content.Context;
import android.net.Uri;
import android.webkit.ValueCallback;
import com.yandex.passport.internal.impl.s0;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h0;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.k;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.m;
import defpackage.aur;
import defpackage.bca;
import defpackage.cdk;
import defpackage.jyr;
import defpackage.lf2;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.x0q;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.ysn;
import defpackage.z7o;
import defpackage.zsd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class b extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new b((ValueCallback) this.l, continuation, 0);
            case 1:
                return new b((com.yandex.plus.pay.ui.core.internal.a) this.l, continuation, 1);
            case 2:
                return new b((com.yandex.plus.pay.ui.core.internal.common.f) this.l, continuation, 2);
            case 3:
                return new b((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c) this.l, continuation, 3);
            case 4:
                return new b((h0) this.l, continuation, 4);
            case 5:
                return new b((k) this.l, continuation, 5);
            case 6:
                return new b((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.j) this.l, continuation, 6);
            case 7:
                return new b((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.k) this.l, continuation, 7);
            case 8:
                return new b((m) this.l, continuation, 8);
            case 9:
                return new b((com.yandex.plus.pay.ui.yb.web.internal.ui.g) this.l, continuation, 9);
            case 10:
                return new b((com.yandex.passport.sloth.ui.dependencies.m) this.l, continuation, 10);
            case 11:
                return new b((com.yandex.passport.sloth.ui.dependencies.m) this.l, continuation, 11);
            case 12:
                return new b((com.yandex.plus.webview.internal.contract.impl.insets.b) this.l, continuation, 12);
            default:
                return new b((com.yandex.plus.webview.internal.contract.impl.loading.a) this.l, continuation, 13);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((b) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object u;
        Object t7oVar;
        Object u2;
        Object t7oVar2;
        boolean z = false;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.core.activity.result.internal.h hVar = com.yandex.plus.core.activity.result.internal.h.d;
                    this.k = 1;
                    obj = hVar.m("*/*", this);
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
                ((ValueCallback) this.l).onReceiveValue(((List) obj).toArray(new Uri[0]));
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.ui.core.internal.common.f fVar = ((com.yandex.plus.pay.ui.core.internal.a) this.l).b;
                    this.k = 1;
                    fVar.d = null;
                    fVar.e = null;
                    if (Unit.a == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    String str = ((com.yandex.plus.pay.ui.core.internal.common.f) this.l).d;
                    if (str != null) {
                        return str;
                    }
                    com.yandex.plus.pay.ui.core.internal.config.b bVar = ((com.yandex.plus.pay.ui.core.internal.common.f) this.l).b;
                    this.k = 1;
                    obj = bVar.a(this);
                    if (obj == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                String str2 = (String) obj;
                ((com.yandex.plus.pay.ui.core.internal.common.f) this.l).d = str2;
                return str2;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.pay.internal.feature.family.d dVar = (com.yandex.plus.pay.internal.feature.family.d) ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c) this.l).a.j.getValue();
                this.k = 1;
                Object a = dVar.a(this);
                return a == nm6Var4 ? nm6Var4 : a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.c cVar = ((h0) this.l).t;
                    this.k = 1;
                    if (cVar.a() == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                k kVar = (k) this.l;
                nm6 nm6Var6 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.d dVar2 = kVar.l;
                    this.k = 1;
                    obj = dVar2.a(this);
                    if (obj == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.a aVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.a) obj;
                if (aVar != null) {
                    String str3 = aVar.b;
                    String str4 = aVar.a;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a2 = kVar.k.a.a();
                    kVar.o = aVar;
                    xdr xdrVar = kVar.p;
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.h hVar2 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.h(str4, str3);
                    xdrVar.getClass();
                    xdrVar.m(null, hVar2);
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b bVar2 = kVar.n;
                    String uuid = a2.a.toString();
                    uuid.getClass();
                    bVar2.getClass();
                    str4.getClass();
                    str3.getClass();
                    cdk cdkVar = bVar2.a;
                    cdkVar.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("purchase_session_id", uuid);
                    linkedHashMap.put("url", str4);
                    linkedHashMap.put("skipButtonText", str3);
                    linkedHashMap.put("_meta", cdk.c(new HashMap()));
                    cdkVar.f("CollectingContacts.Screen.Shown", linkedHashMap);
                } else {
                    kVar.G();
                }
                return Unit.a;
            case 6:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.j jVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.j) this.l;
                nm6 nm6Var7 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.c cVar2 = jVar.l;
                    this.k = 1;
                    obj = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.e) cVar2).a(this);
                    if (obj == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.a aVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.a) obj;
                if (aVar2 != null) {
                    String str5 = aVar2.c;
                    String str6 = aVar2.a;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a3 = jVar.k.a.a();
                    jVar.p = aVar2;
                    xdr xdrVar2 = jVar.s;
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.g gVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.g(str6, str5, aVar2.b);
                    xdrVar2.getClass();
                    xdrVar2.m(null, gVar);
                    com.yandex.plus.pay.ui.webview.family.domain.a aVar3 = jVar.n;
                    String uuid2 = a3.a.toString();
                    uuid2.getClass();
                    aVar3.getClass();
                    cdk cdkVar2 = aVar3.b;
                    cdkVar2.getClass();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("purchase_session_id", uuid2);
                    linkedHashMap2.put("url", str6);
                    linkedHashMap2.put("skipButtonText", str5);
                    linkedHashMap2.put("_meta", cdk.c(new HashMap()));
                    cdkVar2.f("FamilyInvite.Screen.Shown", linkedHashMap2);
                } else {
                    jVar.G();
                }
                return Unit.a;
            case 7:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.k kVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.k) this.l;
                nm6 nm6Var8 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a4 = kVar2.k.a.a();
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.d dVar3 = kVar2.m;
                    this.k = 1;
                    obj = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.f) dVar3).a(a4, this);
                    if (obj == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.c cVar3 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.c) obj;
                if (cVar3 != null) {
                    xdr xdrVar3 = kVar2.s;
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.i iVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.i(cVar3.a, cVar3.c, cVar3.b);
                    xdrVar3.getClass();
                    xdrVar3.m(null, iVar);
                } else {
                    kVar2.H();
                }
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    m mVar = (m) this.l;
                    this.k = 1;
                    mVar.x.b();
                    Unit a5 = mVar.r.a();
                    if (a5 != nm6Var9) {
                        a5 = Unit.a;
                    }
                    if (a5 == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar = ((com.yandex.plus.pay.ui.yb.web.internal.ui.g) this.l).o;
                    com.yandex.plus.pay.ui.yb.web.internal.ui.e eVar = com.yandex.plus.pay.ui.yb.web.internal.ui.e.a;
                    this.k = 1;
                    if (x0qVar.emit(eVar, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 10:
                com.yandex.passport.sloth.ui.dependencies.m mVar2 = (com.yandex.passport.sloth.ui.dependencies.m) this.l;
                nm6 nm6Var11 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.core.activity.result.internal.h hVar3 = com.yandex.plus.core.activity.result.internal.h.d;
                    s0 s0Var = new s0((ysn) ((jyr) mVar2.k).getValue(), (com.yandex.plus.paymentsdk.internal.common.a) mVar2.h);
                    Unit unit = Unit.a;
                    this.k = 1;
                    u = hVar3.u(s0Var, unit, this);
                    if (u == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    u = ((z7o) obj).a;
                }
                if (z7o.a(u) != null) {
                    u = com.yandex.plus.paymentsdk.internal.method.a.a;
                }
                com.yandex.plus.paymentsdk.internal.method.d dVar4 = (com.yandex.plus.paymentsdk.internal.method.d) u;
                xdr xdrVar4 = (xdr) mVar2.i;
                try {
                    t7oVar = ((Context) mVar2.c).getString(R.string.paymentsdk_bind_card_button);
                } catch (Throwable th) {
                    r7o r7oVar = z7o.b;
                    t7oVar = new t7o(th);
                }
                xdrVar4.l(u.E(dVar4, (String) (t7oVar instanceof t7o ? "" : t7oVar)));
                return Unit.a;
            case 11:
                com.yandex.passport.sloth.ui.dependencies.m mVar3 = (com.yandex.passport.sloth.ui.dependencies.m) this.l;
                nm6 nm6Var12 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.core.activity.result.internal.h hVar4 = com.yandex.plus.core.activity.result.internal.h.d;
                    s0 s0Var2 = new s0((ysn) ((jyr) mVar3.k).getValue(), "plus://" + ((com.yandex.plus.core.debug.panel.internal.utils.resource.a) mVar3.c).a.getPackageName() + "/sbp/redirect");
                    Unit unit2 = Unit.a;
                    this.k = 1;
                    u2 = hVar4.u(s0Var2, unit2, this);
                    if (u2 == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    u2 = ((z7o) obj).a;
                }
                if (z7o.a(u2) != null) {
                    u2 = com.yandex.plus.paymentsdk.internal.method.a.a;
                }
                com.yandex.plus.paymentsdk.internal.method.d dVar5 = (com.yandex.plus.paymentsdk.internal.method.d) u2;
                xdr xdrVar5 = (xdr) mVar3.i;
                try {
                    t7oVar2 = ((Context) mVar3.d).getString(R.string.paymentsdk_select_method_button);
                } catch (Throwable th2) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar2 = new t7o(th2);
                }
                xdrVar5.l(u.E(dVar5, (String) (t7oVar2 instanceof t7o ? "" : t7oVar2)));
                return Unit.a;
            case 12:
                nm6 nm6Var13 = nm6.a;
                int i13 = this.k;
                if (i13 != 0) {
                    if (i13 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                WeakReference weakReference = ((com.yandex.plus.webview.internal.contract.impl.insets.b) this.l).b.a;
                com.yandex.plus.webview.internal.insets.b bVar3 = weakReference != null ? (com.yandex.plus.webview.internal.insets.b) weakReference.get() : null;
                this.k = 1;
                Object g0 = zsd.g0(new bca(bVar3.c, 18), this);
                return g0 == nm6Var13 ? nm6Var13 : g0;
            default:
                Object obj2 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.webview.internal.contract.impl.loading.a aVar4 = (com.yandex.plus.webview.internal.contract.impl.loading.a) this.l;
                    this.k = 1;
                    Object h0 = zsd.h0(aVar4.g, new lf2(2, 21, z ? 1 : 0), this);
                    Object obj3 = h0;
                    if (h0 != obj2) {
                        obj3 = Unit.a;
                    }
                    if (obj3 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
