package ru.yandex.logistics.sdk.cargo_form.impl.domain;

import android.content.Context;
import android.net.Uri;
import com.yandex.go.payments.data.model.response.CorpAccount;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.a9x0;
import defpackage.aoi;
import defpackage.avj0;
import defpackage.aye0;
import defpackage.b0k0;
import defpackage.b51;
import defpackage.b64;
import defpackage.b9x0;
import defpackage.boj0;
import defpackage.bvf0;
import defpackage.c0k0;
import defpackage.c21;
import defpackage.c51;
import defpackage.c9x0;
import defpackage.cxm;
import defpackage.czh;
import defpackage.d51;
import defpackage.d9x0;
import defpackage.dci;
import defpackage.ddf;
import defpackage.dv8;
import defpackage.dxm;
import defpackage.e9x0;
import defpackage.evm;
import defpackage.evu0;
import defpackage.f4l0;
import defpackage.f9x0;
import defpackage.fga0;
import defpackage.fsg;
import defpackage.g9x0;
import defpackage.gm1;
import defpackage.gyt0;
import defpackage.gzh;
import defpackage.h0w;
import defpackage.h3y;
import defpackage.h6z0;
import defpackage.h9x0;
import defpackage.hm1;
import defpackage.hu0;
import defpackage.hwy0;
import defpackage.hxx;
import defpackage.i8x0;
import defpackage.i9x0;
import defpackage.ike;
import defpackage.iu0;
import defpackage.iym;
import defpackage.izh;
import defpackage.j6s;
import defpackage.j8x0;
import defpackage.j9x0;
import defpackage.jg70;
import defpackage.jgz;
import defpackage.jve;
import defpackage.jwh;
import defpackage.k7l0;
import defpackage.k8x0;
import defpackage.k9x0;
import defpackage.kg70;
import defpackage.kw8;
import defpackage.kyh0;
import defpackage.l7x0;
import defpackage.l8x0;
import defpackage.l9x0;
import defpackage.lzu0;
import defpackage.m2n;
import defpackage.m2v;
import defpackage.m8s0;
import defpackage.m8x0;
import defpackage.m950;
import defpackage.m9x0;
import defpackage.mpu0;
import defpackage.mrj;
import defpackage.mv8;
import defpackage.n8x0;
import defpackage.n9x0;
import defpackage.nl1;
import defpackage.npu0;
import defpackage.nvm;
import defpackage.ny61;
import defpackage.o5s;
import defpackage.o8x0;
import defpackage.o9x0;
import defpackage.oc21;
import defpackage.og70;
import defpackage.p1f;
import defpackage.p61;
import defpackage.p6s;
import defpackage.p8x0;
import defpackage.p9x0;
import defpackage.q1f;
import defpackage.q1i;
import defpackage.q4g;
import defpackage.q5z;
import defpackage.q8x0;
import defpackage.q9x0;
import defpackage.qcp0;
import defpackage.qdc;
import defpackage.qv0;
import defpackage.r030;
import defpackage.r3s;
import defpackage.r5s;
import defpackage.r61;
import defpackage.r8x0;
import defpackage.r9x0;
import defpackage.ri20;
import defpackage.ru0;
import defpackage.ryh;
import defpackage.s030;
import defpackage.s8x0;
import defpackage.s9e;
import defpackage.s9x0;
import defpackage.sbv;
import defpackage.st2;
import defpackage.su0;
import defpackage.svi;
import defpackage.sy60;
import defpackage.t8x0;
import defpackage.tcc;
import defpackage.tis0;
import defpackage.tje;
import defpackage.tu0;
import defpackage.tvi;
import defpackage.u1n;
import defpackage.u8x0;
import defpackage.uu0;
import defpackage.uvi;
import defpackage.v8x0;
import defpackage.vu0;
import defpackage.vvi;
import defpackage.w230;
import defpackage.w3i;
import defpackage.w511;
import defpackage.w8x0;
import defpackage.wbz0;
import defpackage.wjm;
import defpackage.wth;
import defpackage.x230;
import defpackage.x3;
import defpackage.xhp0;
import defpackage.xl1;
import defpackage.y4;
import defpackage.y8x0;
import defpackage.yfa;
import defpackage.ys4;
import defpackage.ysu;
import defpackage.yuj0;
import defpackage.yvi;
import defpackage.yzh;
import defpackage.yzj0;
import defpackage.z3s;
import defpackage.z8x0;
import defpackage.zch;
import defpackage.zia1;
import defpackage.zqb0;
import defpackage.zrm;
import defpackage.zuj0;
import defpackage.zy11;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.modal.ModalViewType;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.d;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.j;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.TapAction$ModalAction$ModalType;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.logistics.childrouter.api.ButtonType;
import ru.yandex.taxi.logistics.childrouter.api.ScreenMode;
import ru.yandex.taxi.logistics.sdk.photocomments.api.PhotocommentsSource;

/* loaded from: classes5.dex */
public final class c {
    public final xhp0 a;
    public final dv8 b;
    public final p6s c;
    public final r61 d;
    public final mrj e;
    public final boj0 f;
    public final ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.a g;
    public final q4g h;
    public final u1n i;
    public final h3y j;
    public final x230 k;
    public final aye0 l;
    public final o5s m;
    public final p1f n;
    public final r3s o;
    public final mv8 p;
    public final com.yandex.delivery.utils.storage.impl.c q;
    public final j r;
    public final h3y s;
    public final z3s t;
    public final h0w u;
    public final d v;
    public final ddf w;
    public final q1f x;
    public final kw8 y;
    public final ike z;

    public c(st2 st2Var, xhp0 xhp0Var, dv8 dv8Var, p6s p6sVar, r61 r61Var, mrj mrjVar, boj0 boj0Var, ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.a aVar, q4g q4gVar, u1n u1nVar, h3y h3yVar, x230 x230Var, aye0 aye0Var, o5s o5sVar, p1f p1fVar, r3s r3sVar, mv8 mv8Var, com.yandex.delivery.utils.storage.impl.c cVar, j jVar, h3y h3yVar2, z3s z3sVar, h0w h0wVar, d dVar, ddf ddfVar, q1f q1fVar, kw8 kw8Var) {
        this.a = xhp0Var;
        this.b = dv8Var;
        this.c = p6sVar;
        this.d = r61Var;
        this.e = mrjVar;
        this.f = boj0Var;
        this.g = aVar;
        this.h = q4gVar;
        this.i = u1nVar;
        this.j = h3yVar;
        this.k = x230Var;
        this.l = aye0Var;
        this.m = o5sVar;
        this.n = p1fVar;
        this.o = r3sVar;
        this.p = mv8Var;
        this.q = cVar;
        this.r = jVar;
        this.s = h3yVar2;
        this.t = z3sVar;
        this.u = h0wVar;
        this.v = dVar;
        this.w = ddfVar;
        this.x = q1fVar;
        this.y = kw8Var;
        this.z = bvf0.a(st2Var.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, c9x0 c9x0Var, ContinuationImpl continuationImpl) {
        TapActionHandler$openModalViewAction$1 tapActionHandler$openModalViewAction$1;
        int i;
        boolean booleanValue;
        h3y h3yVar = cVar.j;
        if (continuationImpl instanceof TapActionHandler$openModalViewAction$1) {
            tapActionHandler$openModalViewAction$1 = (TapActionHandler$openModalViewAction$1) continuationImpl;
            int i2 = tapActionHandler$openModalViewAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tapActionHandler$openModalViewAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tapActionHandler$openModalViewAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tapActionHandler$openModalViewAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.delivery.utils.storage.impl.c cVar2 = cVar.q;
                    m8s0 m8s0Var = c9x0Var.e;
                    tapActionHandler$openModalViewAction$1.L$0 = c9x0Var;
                    tapActionHandler$openModalViewAction$1.label = 1;
                    obj = cVar2.b(m8s0Var, tapActionHandler$openModalViewAction$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c9x0Var = (c9x0) tapActionHandler$openModalViewAction$1.L$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                zy11 zy11Var = zy11.a;
                if (booleanValue) {
                    return zy11Var;
                }
                TapAction$ModalAction$ModalType tapAction$ModalAction$ModalType = c9x0Var.d;
                int i3 = tapAction$ModalAction$ModalType == null ? -1 : s9x0.a[tapAction$ModalAction$ModalType.ordinal()];
                if (i3 == -1) {
                    ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.c cVar3 = (ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.c) h3yVar.get();
                    s030.O2.getClass();
                    cVar3.a(c9x0Var, r030.b, new tis0(ModalViewType.UNKNOWN));
                    return zy11Var;
                }
                if (i3 == 1) {
                    ((ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.c) h3yVar.get()).a(c9x0Var, new b(cVar, c9x0Var), new tis0(ModalViewType.OVER_MAP));
                    return zy11Var;
                }
                if (i3 == 2) {
                    cVar.r.c(c9x0Var);
                    return zy11Var;
                }
                if (i3 != 3) {
                    w511.b();
                    return null;
                }
                ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.c cVar4 = (ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.c) h3yVar.get();
                s030.O2.getClass();
                cVar4.a(c9x0Var, r030.b, new tis0(ModalViewType.OVER_FORM));
                return zy11Var;
            }
        }
        tapActionHandler$openModalViewAction$1 = new TapActionHandler$openModalViewAction$1(cVar, continuationImpl);
        Object obj2 = tapActionHandler$openModalViewAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tapActionHandler$openModalViewAction$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        zy11 zy11Var2 = zy11.a;
        if (booleanValue) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(r9x0 r9x0Var) {
        String str;
        EmptyList emptyList;
        Map map;
        Object obj;
        String str2;
        String str3;
        sbv sbvVar;
        Iterator it;
        fsg fsgVar;
        int i;
        String valueOf = String.valueOf(r9x0Var);
        getClass();
        jgz.a.h("Action");
        jgz.a(valueOf, new Object[0]);
        boolean z = r9x0Var instanceof k9x0;
        ike ikeVar = this.z;
        if (z) {
            k9x0 k9x0Var = (k9x0) r9x0Var;
            tje.N(ikeVar, null, null, new TapActionHandler$createOrder$1(this, k9x0Var.a, k9x0Var.b, null), 3);
            return;
        }
        boolean z2 = r9x0Var instanceof z8x0;
        dv8 dv8Var = this.b;
        if (z2) {
            ((com.yandex.go.logistics.cargo_flow.a) dv8Var.a.b).l0.a(Uri.parse(((z8x0) r9x0Var).a), DeeplinkSource.UNSPECIFIED);
            return;
        }
        boolean z3 = r9x0Var instanceof o8x0;
        c21 c21Var = sy60.Q2;
        if (z3) {
            String str4 = ((o8x0) r9x0Var).a;
            com.yandex.go.logistics.cargo_flow.a aVar = (com.yandex.go.logistics.cargo_flow.a) dv8Var.a.b;
            aVar.A((m950) aVar.K.get(), new npu0((x3) new mpu0(str4), "discovery_delivery_form", (Float) null, false, HProv.PP_SAME_MEDIA), c21Var);
            return;
        }
        if (r9x0Var instanceof u8x0) {
            ((com.yandex.go.logistics.cargo_flow.a) dv8Var.a.b).r(new wth(5));
            return;
        }
        if (r9x0Var instanceof w8x0) {
            v8x0 v8x0Var = ((w8x0) r9x0Var).a;
            x230 x230Var = this.k;
            if (v8x0Var != null) {
                int i2 = v8x0Var.a;
                for (int i3 = 0; i3 < i2; i3++) {
                    w230 w230Var = (w230) x230Var.a.n();
                    czh czhVar = w230Var != null ? w230Var.b : null;
                    if (czhVar != null) {
                        czhVar.dismiss();
                    }
                }
                x230Var.getClass();
                return;
            }
            if (v8x0Var != null) {
                w511.b();
                return;
            }
            w230 w230Var2 = (w230) x230Var.a.n();
            czh czhVar2 = w230Var2 != null ? w230Var2.b : null;
            if (czhVar2 != null) {
                czhVar2.dismiss();
                return;
            }
            return;
        }
        boolean z4 = r9x0Var instanceof i8x0;
        r61 r61Var = this.d;
        if (z4) {
            i8x0 i8x0Var = (i8x0) r9x0Var;
            vu0 vu0Var = i8x0Var.a;
            if (vu0Var == null) {
                vu0Var = new uu0(r3 ? 1 : 0);
            }
            vu0 vu0Var2 = vu0Var;
            Integer num = i8x0Var.c;
            if (!(vu0Var2 instanceof su0)) {
                int size = r61Var.b.getRoute().a.size();
                if (num != null) {
                    size = num.intValue();
                }
                r61Var.a(new iu0(size), vu0Var2, num != null);
                return;
            }
            j6s b = r61Var.d.b();
            if (b != null) {
                List list = b.d.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((qv0) obj2).a != null) {
                        arrayList.add(obj2);
                    }
                }
                i = arrayList.size();
            } else {
                i = 0;
            }
            if (num != null) {
                i = num.intValue();
            }
            int i4 = i;
            m2v.v(r61Var.i, i4, vu0Var2, r61Var.i.t(i4), new p61(r61Var, i4, (su0) vu0Var2, r3 ? 1 : 0), 4);
            return;
        }
        if (r9x0Var instanceof o9x0) {
            o9x0 o9x0Var = (o9x0) r9x0Var;
            q4g q4gVar = this.h;
            czh create = ((gzh) q4gVar.b).create();
            zch zchVar = (zch) q4gVar.c;
            String str5 = o9x0Var.a;
            String str6 = o9x0Var.b;
            String str7 = o9x0Var.d;
            sbv sbvVar2 = o9x0Var.e;
            List list2 = o9x0Var.f;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                iym iymVar = (iym) it2.next();
                og70 og70Var = iymVar.c;
                String str8 = iymVar.b;
                String str9 = iymVar.a;
                if (og70Var instanceof kg70) {
                    List list3 = ((kg70) og70Var).a;
                    str2 = str6;
                    str3 = str7;
                    ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(Integer.valueOf(((ZonedDateTime) it3.next()).getHour()));
                    }
                    List I = kotlin.collections.a.I(arrayList3);
                    ArrayList arrayList4 = new ArrayList(tcc.n(I, 10));
                    Iterator it4 = I.iterator();
                    while (it4.hasNext()) {
                        int intValue = ((Number) it4.next()).intValue();
                        List list4 = ((kg70) iymVar.c).a;
                        Iterator it5 = it4;
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj3 : list4) {
                            sbv sbvVar3 = sbvVar2;
                            Iterator it6 = it2;
                            if (((ZonedDateTime) obj3).getHour() == intValue) {
                                arrayList5.add(obj3);
                            }
                            it2 = it6;
                            sbvVar2 = sbvVar3;
                        }
                        sbv sbvVar4 = sbvVar2;
                        Iterator it7 = it2;
                        ArrayList arrayList6 = new ArrayList(tcc.n(arrayList5, 10));
                        Iterator it8 = arrayList5.iterator();
                        while (it8.hasNext()) {
                            ZonedDateTime zonedDateTime = (ZonedDateTime) it8.next();
                            Iterator it9 = it8;
                            String N = evu0.N(MoneyInputEditView.DEFAULT_VALUE, 2, String.valueOf(zonedDateTime.getMinute()));
                            arrayList6.add(new ri20(N, zonedDateTime, N));
                            intValue = intValue;
                            it8 = it9;
                        }
                        List I2 = kotlin.collections.a.I(arrayList6);
                        String N2 = evu0.N(MoneyInputEditView.DEFAULT_VALUE, 2, String.valueOf(intValue));
                        arrayList4.add(new ysu(N2, null, I2, N2));
                        it4 = it5;
                        it2 = it7;
                        sbvVar2 = sbvVar4;
                    }
                    sbvVar = sbvVar2;
                    it = it2;
                    fsgVar = new fsg(str9, str8, arrayList4);
                } else {
                    str2 = str6;
                    str3 = str7;
                    sbvVar = sbvVar2;
                    it = it2;
                    if (!(og70Var instanceof jg70)) {
                        w511.b();
                        return;
                    }
                    ArrayList<h6z0> arrayList7 = ((jg70) og70Var).a;
                    ArrayList arrayList8 = new ArrayList(tcc.n(arrayList7, 10));
                    for (h6z0 h6z0Var : arrayList7) {
                        String str10 = h6z0Var.a;
                        String str11 = h6z0Var.c;
                        arrayList8.add(new ysu(b64.j(str10, str11 != null ? "       ".concat(str11) : ""), h6z0Var.b, null, h6z0Var.a));
                    }
                    fsgVar = new fsg(str9, str8, arrayList8);
                }
                arrayList2.add(fsgVar);
                it2 = it;
                str6 = str2;
                str7 = str3;
                sbvVar2 = sbvVar;
            }
            evm evmVar = new evm(str5, str6, str7, sbvVar2, new m2n(arrayList2), o9x0Var.i, o9x0Var.c, o9x0Var.j);
            dxm dxmVar = new dxm(o9x0Var, create, q4gVar);
            mv8 mv8Var = (mv8) q4gVar.w;
            p6s p6sVar = (p6s) q4gVar.y;
            w3i w3iVar = (w3i) zchVar.a;
            w3iVar.getClass();
            q5z.h((qcp0) w3iVar.w);
            Context context = (Context) w3iVar.b;
            q5z.h(context);
            hwy0 hwy0Var = (hwy0) w3iVar.x;
            q5z.h(hwy0Var);
            dci dciVar = (dci) w3iVar.c;
            q5z.h(dciVar);
            l7x0 l7x0Var = (l7x0) w3iVar.y;
            q5z.h(l7x0Var);
            qdc qdcVar = (qdc) w3iVar.A;
            q5z.h(qdcVar);
            yfa yfaVar = new yfa(qdcVar);
            yuj0 yuj0Var = (yuj0) w3iVar.B;
            q5z.h(yuj0Var);
            nvm nvmVar = new nvm(evmVar, l7x0Var, yfaVar, yuj0Var);
            jwh jwhVar = (jwh) w3iVar.z;
            q5z.h(jwhVar);
            q5z.h(mv8Var);
            u1n u1nVar = new u1n(22, jwhVar, mv8Var);
            q5z.h(p6sVar);
            czh.a(create, new izh(new cxm(new aoi(new wjm(context, hwy0Var, dciVar, new ru.yandex.logistics.sdk.cargo_form.impl.due.b(evmVar, dxmVar, nvmVar, u1nVar, new zrm(1, p6sVar, jwhVar)), 2), evmVar, dxmVar)), ButtonType.CLOSE, ScreenMode.FIXED, null, null, null, 8178));
            return;
        }
        if (r9x0Var instanceof q8x0) {
            q8x0 q8x0Var = (q8x0) r9x0Var;
            vu0 vu0Var3 = q8x0Var.b;
            if (vu0Var3 == null) {
                vu0Var3 = new uu0(r3 ? 1 : 0);
            }
            dv8Var.f(vu0Var3, q8x0Var.a);
            return;
        }
        if (r9x0Var instanceof e9x0) {
            e9x0 e9x0Var = (e9x0) r9x0Var;
            vu0 vu0Var4 = e9x0Var.b;
            if (vu0Var4 == null) {
                vu0Var4 = new uu0(r3 ? 1 : 0);
            }
            dv8Var.f(vu0Var4, e9x0Var.a);
            return;
        }
        if (r9x0Var instanceof l8x0) {
            l8x0 l8x0Var = (l8x0) r9x0Var;
            String str12 = l8x0Var.a;
            String str13 = l8x0Var.b;
            String str14 = l8x0Var.d;
            k8x0 k8x0Var = l8x0Var.c;
            if (k8x0Var != null) {
                String str15 = k8x0Var.a;
                List list5 = k8x0Var.b;
                j6s b2 = ((p6s) this.w.b).b();
                if (list5 != null) {
                    List list6 = list5;
                    ArrayList arrayList9 = new ArrayList(tcc.n(list6, 10));
                    Iterator it10 = list6.iterator();
                    while (it10.hasNext()) {
                        String obj4 = (b2 == null || (map = b2.a) == null || (obj = map.get((String) it10.next())) == null) ? null : obj.toString();
                        if (obj4 == null) {
                            obj4 = "";
                        }
                        arrayList9.add(obj4);
                    }
                    emptyList = arrayList9;
                } else {
                    emptyList = null;
                }
                if (emptyList == null) {
                    emptyList = EmptyList.a;
                }
                str = new Regex("%form_state_key").i(str15, new y4(29, emptyList.iterator()));
            } else {
                str = null;
            }
            ryh ryhVar = dv8Var.a;
            com.yandex.go.logistics.cargo_flow.a aVar2 = (com.yandex.go.logistics.cargo_flow.a) ryhVar.b;
            m950 m950Var = (m950) aVar2.N.get();
            gm1 gm1Var = new gm1(str12, str13);
            xl1 xl1Var = new xl1(str14, false, false);
            zuj0 zuj0Var = ((com.yandex.go.logistics.cargo_flow.a) ryhVar.b).Q;
            avj0 avj0Var = (avj0) zuj0Var;
            avj0 avj0Var2 = (avj0) zuj0Var;
            aVar2.E(m950Var, new hm1(null, null, null, str, gm1Var, xl1Var, null, null, new nl1(avj0Var.h(kyh0.cargo_ai_screen_configuration_error_title), avj0Var2.h(kyh0.cargo_ai_screen_configuration_error_description), avj0Var2.h(kyh0.cargo_ai_screen_configuration_error_reload_button)), 199), c21Var, hxx.a);
            return;
        }
        if (r9x0Var instanceof d9x0) {
            q1i q1iVar = (q1i) ((com.yandex.go.logistics.cargo_flow.a) dv8Var.a.b).S.get();
            com.yandex.go.payments.paymentlist.data.c cVar = (com.yandex.go.payments.paymentlist.data.c) q1iVar.b;
            fga0 fga0Var = cVar.g;
            fga0Var.getClass();
            CorpAccount j = fga0Var.j(fga0Var.q(PaymentMethod$Type.CORP));
            jve b3 = j != null ? cVar.o.b(j) : null;
            if (b3 != null) {
                q1iVar.c.h(b3.a, b3.e);
            }
            q1iVar.a.a(new wbz0());
            return;
        }
        boolean z5 = r9x0Var instanceof p8x0;
        p6s p6sVar2 = this.c;
        if (z5) {
            for (Map.Entry entry : ((p8x0) r9x0Var).a.entrySet()) {
                p6sVar2.c(entry.getValue(), (String) entry.getKey());
            }
            return;
        }
        if (r9x0Var instanceof i9x0) {
            ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.a.a(this.g, ((i9x0) r9x0Var).a, null, 2);
            return;
        }
        if (r9x0Var instanceof c9x0) {
            tje.N(ikeVar, null, null, new TapActionHandler$handle$3(r9x0Var, null, this), 3);
            return;
        }
        if (r9x0Var instanceof n8x0) {
            n8x0 n8x0Var = (n8x0) r9x0Var;
            this.o.a(n8x0Var.a, n8x0Var.b, n8x0Var.c);
            return;
        }
        if (r9x0Var instanceof y8x0) {
            Iterator it11 = ((y8x0) r9x0Var).a.iterator();
            while (it11.hasNext()) {
                b((r9x0) it11.next());
            }
            return;
        }
        if (r9x0Var instanceof r8x0) {
            aye0 aye0Var = this.l;
            aye0Var.getClass();
            for (k7l0 k7l0Var : ((r8x0) r9x0Var).a) {
                qv0 qv0Var = (qv0) kotlin.collections.a.S(k7l0Var.a, ((f4l0) aye0Var.b).getRoute().a);
                if (qv0Var != null) {
                    f4l0 f4l0Var = (f4l0) aye0Var.b;
                    int i5 = k7l0Var.a;
                    String str16 = k7l0Var.b;
                    String str17 = (str16 == null || qv0Var.b.length() != 0) ? null : str16;
                    String str18 = k7l0Var.c;
                    String str19 = (str18 == null || qv0Var.f.length() != 0) ? null : str18;
                    String str20 = k7l0Var.d;
                    String str21 = (str20 == null || qv0Var.d.length() != 0) ? null : str20;
                    String str22 = k7l0Var.e;
                    String str23 = (str22 == null || qv0Var.c.length() != 0) ? null : str22;
                    s9e s9eVar = k7l0Var.g;
                    s9e s9eVar2 = (s9eVar == null || qv0Var.g.b.length() != 0) ? null : s9eVar;
                    String str24 = k7l0Var.f;
                    String str25 = (str24 == null || qv0Var.e.length() != 0) ? null : str24;
                    List list7 = k7l0Var.h;
                    f4l0Var.f(i5, s9eVar2, str21, str23, str19, str17, str25, (list7 == null || !qv0Var.h.isEmpty()) ? null : list7);
                }
            }
            return;
        }
        if (r9x0Var instanceof j9x0) {
            j9x0 j9x0Var = (j9x0) r9x0Var;
            String str26 = j9x0Var.a;
            boolean z6 = j9x0Var.b;
            vvi.a.getClass();
            tvi tviVar = uvi.b;
            kw8 kw8Var = this.y;
            yvi yviVar = (yvi) kw8Var.b.get();
            svi sviVar = new svi(str26, z6);
            yzh yzhVar = new yzh((com.yandex.go.logistics.cargo_flow.form.a) kw8Var.a.b);
            czh create2 = yviVar.a.create();
            czh.a(create2, new izh(new ys4(yviVar, sviVar, yzhVar, create2, tviVar), ButtonType.CLOSE, null, null, null, null, 8186));
            return;
        }
        if (r9x0Var instanceof g9x0) {
            g9x0 g9x0Var = (g9x0) r9x0Var;
            dv8Var.e(g9x0Var.a, g9x0Var.b, g9x0Var.c);
            return;
        }
        if (r9x0Var instanceof f9x0) {
            dv8Var.d(((f9x0) r9x0Var).a);
            return;
        }
        if (r9x0Var instanceof n9x0) {
            boj0.k(this.f, ((n9x0) r9x0Var).a, null, new lzu0(18, r9x0Var, this), 6);
            return;
        }
        if (r9x0Var instanceof m9x0) {
            m9x0 m9x0Var = (m9x0) r9x0Var;
            c0k0 c0k0Var = m9x0Var.a;
            vu0 vu0Var5 = m9x0Var.b;
            gyt0 gyt0Var = new gyt0(24, r9x0Var, this);
            r61Var.getClass();
            if (!(c0k0Var instanceof yzj0)) {
                if (c0k0Var instanceof b0k0) {
                    r61Var.b((b0k0) c0k0Var, vu0Var5, gyt0Var);
                    return;
                } else {
                    w511.b();
                    return;
                }
            }
            yzj0 yzj0Var = (yzj0) c0k0Var;
            d51 d51Var = yzj0Var.b;
            int i6 = yzj0Var.a;
            if (vu0Var5 instanceof su0) {
                m2v m2vVar = r61Var.i;
                m2vVar.u(i6, vu0Var5, d51Var, m2vVar.t(i6), gyt0Var);
                return;
            } else if (vu0Var5 instanceof tu0) {
                tu0 tu0Var = (tu0) vu0Var5;
                r61Var.a.e(tu0Var.a, i6, tu0Var.b);
                return;
            } else if ((vu0Var5 instanceof uu0) || (vu0Var5 instanceof ru0) || vu0Var5 == null) {
                dv8.c(r61Var.a, d51Var, new hu0(i6), vu0Var5, gyt0Var, 8);
                return;
            } else {
                w511.b();
                return;
            }
        }
        if (r9x0Var instanceof a9x0) {
            c0k0 c0k0Var2 = ((a9x0) r9x0Var).a;
            mrj mrjVar = this.e;
            mrjVar.getClass();
            if (!(c0k0Var2 instanceof yzj0)) {
                if (c0k0Var2 instanceof b0k0) {
                    ((p6s) mrjVar.c).c(null, ((b0k0) c0k0Var2).a());
                    return;
                } else {
                    w511.b();
                    return;
                }
            }
            yzj0 yzj0Var2 = (yzj0) c0k0Var2;
            int i7 = yzj0Var2.a;
            d51 d51Var2 = yzj0Var2.b;
            if (d51Var2 instanceof c51) {
                if (i7 > 0) {
                    ((f4l0) mrjVar.b).g(i7 - 1);
                    return;
                }
                return;
            } else if (d51Var2 instanceof b51) {
                ((zqb0) mrjVar.w).a(i7);
                return;
            } else {
                w511.b();
                return;
            }
        }
        if (r9x0Var instanceof m8x0) {
            tje.N(ikeVar, null, null, new TapActionHandler$handle$7(r9x0Var, null, this), 3);
            return;
        }
        boolean z7 = r9x0Var instanceof q9x0;
        u1n u1nVar2 = this.i;
        if (z7) {
            u1nVar2.q(null, "Delivery.OrderForm.Failed.UnsupportedTapAction");
            return;
        }
        if (r9x0Var instanceof b9x0) {
            tje.N(ikeVar, null, null, new TapActionHandler$handle$8(this, null), 3);
            return;
        }
        if (r9x0Var instanceof h9x0) {
            this.x.open();
            return;
        }
        if (r9x0Var instanceof t8x0) {
            s8x0 s8x0Var = ((t8x0) r9x0Var).a;
            j6s b4 = p6sVar2.b();
            if (b4 == null) {
                return;
            }
            p6sVar2.c(b4.a.getOrDefault(s8x0Var.a, null), s8x0Var.b);
            return;
        }
        if (r9x0Var instanceof p9x0) {
            zia1.c(this.t.a, ((p9x0) r9x0Var).a, null);
            return;
        }
        if (r9x0Var instanceof l9x0) {
            this.a.a(((l9x0) r9x0Var).a);
            return;
        }
        if (!(r9x0Var instanceof j8x0)) {
            w511.b();
            return;
        }
        j8x0 j8x0Var = (j8x0) r9x0Var;
        u1n.m(u1nVar2, j8x0Var.c);
        r5s r5sVar = new r5s(j8x0Var.a);
        oc21 oc21Var = j8x0Var.b;
        this.u.h(r5sVar, oc21Var.b, oc21Var.a, oc21Var.c, PhotocommentsSource.SOURCE_CHOOSER);
    }
}
