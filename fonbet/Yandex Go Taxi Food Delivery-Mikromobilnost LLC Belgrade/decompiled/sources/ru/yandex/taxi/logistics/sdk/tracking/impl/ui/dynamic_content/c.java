package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content;

import android.content.Context;
import com.yandex.delivery.mapper.model.state.DeliveryStateItem$Barcode$BarcodeOrientation;
import defpackage.amp0;
import defpackage.aoi;
import defpackage.bgc;
import defpackage.bi60;
import defpackage.bu0;
import defpackage.bvf0;
import defpackage.c1x0;
import defpackage.cjw0;
import defpackage.cxm;
import defpackage.czh;
import defpackage.d301;
import defpackage.e1q0;
import defpackage.fo;
import defpackage.g701;
import defpackage.gv90;
import defpackage.gym;
import defpackage.gzh;
import defpackage.h8j;
import defpackage.hwy0;
import defpackage.ike;
import defpackage.iry0;
import defpackage.isy;
import defpackage.izh;
import defpackage.j00;
import defpackage.j0g;
import defpackage.jfe0;
import defpackage.jwh;
import defpackage.kbg;
import defpackage.kcz0;
import defpackage.klb0;
import defpackage.l9j;
import defpackage.mu90;
import defpackage.mvn;
import defpackage.nr;
import defpackage.o5n;
import defpackage.o8j;
import defpackage.o9j;
import defpackage.oa9;
import defpackage.oy80;
import defpackage.pv4;
import defpackage.pzf;
import defpackage.q5z;
import defpackage.q8s;
import defpackage.qcp0;
import defpackage.rfe0;
import defpackage.s8j;
import defpackage.st2;
import defpackage.t0k0;
import defpackage.tje;
import defpackage.ts11;
import defpackage.tts0;
import defpackage.u1n;
import defpackage.ufe0;
import defpackage.vr;
import defpackage.vs;
import defpackage.wwf;
import defpackage.x201;
import defpackage.y4a0;
import defpackage.yuj0;
import defpackage.z501;
import java.util.List;
import ru.yandex.taxi.logistics.childrouter.api.ButtonType;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.j;

/* loaded from: classes5.dex */
public final class c implements jfe0, o8j, isy, pv4, klb0, e1q0, iry0, vs, tts0 {
    public final g701 a;
    public final j b;
    public final kcz0 c;
    public final wwf w;
    public final y4a0 x;
    public final amp0 y;
    public final ike z;

    public c(st2 st2Var, g701 g701Var, j jVar, kcz0 kcz0Var, wwf wwfVar, y4a0 y4a0Var, amp0 amp0Var) {
        this.a = g701Var;
        this.b = jVar;
        this.c = kcz0Var;
        this.w = wwfVar;
        this.x = y4a0Var;
        this.y = amp0Var;
        this.z = bvf0.a(st2Var.a);
    }

    @Override // defpackage.tts0
    public final void H(gv90 gv90Var, String str) {
        tje.N(this.z, null, null, new DynamicContentListener$onSlotTrailClicked$1(gv90Var, str, null, this), 3);
    }

    @Override // defpackage.pv4
    public final void I(o5n o5nVar) {
        DeliveryStateItem$Barcode$BarcodeOrientation deliveryStateItem$Barcode$BarcodeOrientation = o5nVar.g;
        DeliveryStateItem$Barcode$BarcodeOrientation deliveryStateItem$Barcode$BarcodeOrientation2 = DeliveryStateItem$Barcode$BarcodeOrientation.VERTICAL;
        kcz0 kcz0Var = this.c;
        if (deliveryStateItem$Barcode$BarcodeOrientation == deliveryStateItem$Barcode$BarcodeOrientation2) {
            kcz0Var.x("Delivery.NDD.OrderStatusCard.BarcodeLarge.Shown", null);
        } else {
            kcz0Var.x("Delivery.NDD.OrderStatusCard.Barcode.Shown", null);
        }
    }

    @Override // defpackage.isy
    public final void J(gv90 gv90Var, String str) {
        tje.N(this.z, null, null, new DynamicContentListener$onListItemClick$1(gv90Var, str, null, this), 3);
    }

    @Override // defpackage.pv4
    public final void P(o5n o5nVar) {
        if (o5nVar.g == DeliveryStateItem$Barcode$BarcodeOrientation.VERTICAL) {
            this.c.x("Delivery.NDD.OrderStatusCard.BarcodeLarge.Closed", null);
        }
    }

    @Override // defpackage.jfe0
    public final void R() {
        this.c.x("Postcard.Tracking.MessageSeen", null);
    }

    @Override // defpackage.isy, defpackage.klb0, defpackage.e1q0, defpackage.iry0, defpackage.vs
    public final void a(String str) {
        if (str != null) {
            this.c.x(str.concat(".Shown"), null);
        }
    }

    @Override // defpackage.klb0, defpackage.e1q0, defpackage.iry0, defpackage.vs
    public final void b(gv90 gv90Var, String str) {
        tje.N(this.z, null, null, new DynamicContentListener$onClick$1(gv90Var, str, null, this), 3);
    }

    @Override // defpackage.o8j
    public final void h(String str) {
        if (str != null) {
            this.c.x(str.concat(".Shown"), null);
        }
    }

    @Override // defpackage.pv4
    public final void n(gv90 gv90Var) {
        mu90 mu90Var = gv90Var instanceof mu90 ? (mu90) gv90Var : null;
        nr nrVar = mu90Var != null ? mu90Var.a : null;
        fo foVar = nrVar instanceof fo ? (fo) nrVar : null;
        if (foVar != null) {
            this.c.x("Delivery.NDD.OrderStatusCard.Barcode.Tapped", null);
            this.y.L(foVar);
        }
    }

    @Override // defpackage.o8j
    public final void o(h8j h8jVar, String str) {
        String str2 = h8jVar.a;
        List list = h8jVar.b;
        wwf wwfVar = this.w;
        czh create = ((gzh) wwfVar.b).create();
        j0g j0gVar = (j0g) wwfVar.c;
        String str3 = (String) wwfVar.a;
        s8j s8jVar = new s8j(str3, str2, list);
        kbg a = ((z501) j0gVar.b).a(str3);
        pzf pzfVar = (pzf) j0gVar.a;
        pzfVar.getClass();
        qcp0 qcp0Var = (qcp0) pzfVar.f;
        q5z.h(qcp0Var);
        Context context = (Context) pzfVar.e;
        q5z.h(context);
        l9j l9jVar = new l9j();
        com.yandex.delivery.utils.dialogmanager.impl.b bVar = (com.yandex.delivery.utils.dialogmanager.impl.b) pzfVar.h;
        q5z.h(bVar);
        x201 x201Var = (x201) a.s.get();
        q5z.h(x201Var);
        oa9 oa9Var = (oa9) pzfVar.a;
        q5z.h(oa9Var);
        ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.a aVar = (ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.a) pzfVar.d;
        q5z.h(aVar);
        vr vrVar = new vr(context, (char) 0);
        jwh jwhVar = (jwh) pzfVar.c;
        q5z.h(jwhVar);
        ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e b = a.b();
        q5z.h(b);
        ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e b2 = a.b();
        q5z.h(b2);
        kcz0 kcz0Var = new kcz0(jwhVar, new c1x0(new cjw0(b, new j00(b2))));
        bi60 bi60Var = (bi60) pzfVar.i;
        q5z.h(bi60Var);
        gzh gzhVar = (gzh) pzfVar.k;
        q5z.h(gzhVar);
        hwy0 hwy0Var = (hwy0) pzfVar.g;
        q5z.h(hwy0Var);
        yuj0 yuj0Var = (yuj0) pzfVar.j;
        q5z.h(yuj0Var);
        t0k0 t0k0Var = (t0k0) pzfVar.l;
        q5z.h(t0k0Var);
        st2 st2Var = (st2) pzfVar.m;
        q5z.h(st2Var);
        q8s q8sVar = (q8s) pzfVar.b;
        q5z.h(q8sVar);
        u1n u1nVar = new u1n(12, gzhVar, new gym(new bu0(context, qcp0Var, hwy0Var, yuj0Var, bVar, t0k0Var, jwhVar, st2Var, q8sVar)));
        d301 d301Var = (d301) a.u.get();
        q5z.h(d301Var);
        czh.a(create, new izh(new cxm(new aoi(new wwf(context, new o9j(l9jVar, new j(str3, bVar, x201Var, oa9Var, aVar, vrVar, context, kcz0Var, bi60Var, u1nVar, d301Var), s8jVar), hwy0Var), s8jVar, new mvn())), null, null, null, null, null, 8190));
        if (str != null) {
            this.c.x(str.concat(".Tapped"), null);
        }
    }

    @Override // defpackage.jfe0
    public final void u() {
        this.c.x("Postcard.Tracking.MessageClicked", null);
        String str = this.a.a;
        bgc bgcVar = new bgc(12);
        y4a0 y4a0Var = this.x;
        czh create = ((gzh) y4a0Var.b).create();
        czh.a(create, new izh(new cxm(((oy80) y4a0Var.c).m(new y4a0(new ufe0(str, true), new rfe0(create, bgcVar), false, 19))), ButtonType.CLOSE, null, new ts11(false, false, null, null, null, 508), null, null, 7930));
    }

    @Override // defpackage.tts0
    public final void x(String str) {
        if (str != null) {
            this.c.x(str.concat(".Shown"), null);
        }
    }

    @Override // defpackage.tts0
    public final void z(nr nrVar) {
        tje.N(this.z, null, null, new DynamicContentListener$onSlotClicked$1(nrVar, this, null), 3);
    }
}
