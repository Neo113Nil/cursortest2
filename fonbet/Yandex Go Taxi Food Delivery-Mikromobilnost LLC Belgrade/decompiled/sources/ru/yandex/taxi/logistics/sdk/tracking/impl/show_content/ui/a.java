package ru.yandex.taxi.logistics.sdk.tracking.impl.show_content.ui;

import com.yandex.delivery.mapper.model.state.DeliveryStateItem$Barcode$BarcodeOrientation;
import defpackage.b6s0;
import defpackage.bvf0;
import defpackage.d2q0;
import defpackage.d6s0;
import defpackage.ds31;
import defpackage.e1q0;
import defpackage.fo;
import defpackage.gci0;
import defpackage.gv90;
import defpackage.h8j;
import defpackage.iry0;
import defpackage.isy;
import defpackage.jfe0;
import defpackage.kcz0;
import defpackage.klb0;
import defpackage.nr;
import defpackage.ny61;
import defpackage.o5n;
import defpackage.o8j;
import defpackage.p6i;
import defpackage.pv4;
import defpackage.qkg;
import defpackage.tje;
import defpackage.tts0;
import defpackage.vs;
import defpackage.yr31;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.j;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.d;

/* loaded from: classes5.dex */
public final class a extends yr31 implements jfe0, o8j, isy, pv4, klb0, e1q0, iry0, vs, tts0 {
    public final d b;
    public final d2q0 c;
    public final j w;
    public final kcz0 x;
    public final gci0 y;
    public final d6s0 z;

    public a(b6s0 b6s0Var, d dVar, d2q0 d2q0Var, j jVar, kcz0 kcz0Var) {
        this.b = dVar;
        this.c = d2q0Var;
        this.w = jVar;
        this.x = kcz0Var;
        this.z = new d6s0(b6s0Var.b.b);
        r0 c = bvf0.c(null);
        this.y = e.d(c);
        tje.N(ds31.a(this), null, null, new ShowContentViewModel$1(c, this, b6s0Var, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W(a aVar, fo foVar, ContinuationImpl continuationImpl) {
        ShowContentViewModel$getContentSectionsDashboard$1 showContentViewModel$getContentSectionsDashboard$1;
        int i;
        d2q0 d2q0Var;
        aVar.getClass();
        if (continuationImpl instanceof ShowContentViewModel$getContentSectionsDashboard$1) {
            showContentViewModel$getContentSectionsDashboard$1 = (ShowContentViewModel$getContentSectionsDashboard$1) continuationImpl;
            int i2 = showContentViewModel$getContentSectionsDashboard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                showContentViewModel$getContentSectionsDashboard$1.label = i2 - Integer.MIN_VALUE;
                Object obj = showContentViewModel$getContentSectionsDashboard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = showContentViewModel$getContentSectionsDashboard$1.label;
                if (i != 0) {
                    b.b(obj);
                    d2q0 d2q0Var2 = aVar.c;
                    d dVar = aVar.b;
                    p6i p6iVar = foVar.a;
                    showContentViewModel$getContentSectionsDashboard$1.L$0 = null;
                    showContentViewModel$getContentSectionsDashboard$1.L$1 = d2q0Var2;
                    showContentViewModel$getContentSectionsDashboard$1.label = 1;
                    Object a = dVar.a(p6iVar, showContentViewModel$getContentSectionsDashboard$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    d2q0Var = d2q0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d2q0Var = (d2q0) showContentViewModel$getContentSectionsDashboard$1.L$1;
                    b.b(obj);
                }
                d2q0Var.getClass();
                return new qkg(d2q0.a((List) obj), null, null, null, 30);
            }
        }
        showContentViewModel$getContentSectionsDashboard$1 = new ShowContentViewModel$getContentSectionsDashboard$1(aVar, continuationImpl);
        Object obj2 = showContentViewModel$getContentSectionsDashboard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = showContentViewModel$getContentSectionsDashboard$1.label;
        if (i != 0) {
        }
        d2q0Var.getClass();
        return new qkg(d2q0.a((List) obj2), null, null, null, 30);
    }

    @Override // defpackage.tts0
    public final void H(gv90 gv90Var, String str) {
    }

    @Override // defpackage.pv4
    public final void I(o5n o5nVar) {
        DeliveryStateItem$Barcode$BarcodeOrientation deliveryStateItem$Barcode$BarcodeOrientation = o5nVar.g;
        DeliveryStateItem$Barcode$BarcodeOrientation deliveryStateItem$Barcode$BarcodeOrientation2 = DeliveryStateItem$Barcode$BarcodeOrientation.VERTICAL;
        kcz0 kcz0Var = this.x;
        if (deliveryStateItem$Barcode$BarcodeOrientation == deliveryStateItem$Barcode$BarcodeOrientation2) {
            kcz0Var.x("Delivery.NDD.OrderStatusCard.BarcodeLarge.Shown", null);
        } else {
            kcz0Var.x("Delivery.NDD.OrderStatusCard.Barcode.Shown", null);
        }
    }

    @Override // defpackage.isy
    public final void J(gv90 gv90Var, String str) {
        tje.N(ds31.a(this), null, null, new ShowContentViewModel$onListItemClick$1(this, gv90Var, str, null), 3);
    }

    @Override // defpackage.pv4
    public final void P(o5n o5nVar) {
        if (o5nVar.g == DeliveryStateItem$Barcode$BarcodeOrientation.VERTICAL) {
            this.x.x("Delivery.NDD.OrderStatusCard.BarcodeLarge.Closed", null);
        }
    }

    @Override // defpackage.jfe0
    public final void R() {
    }

    @Override // defpackage.isy, defpackage.klb0, defpackage.e1q0, defpackage.iry0, defpackage.vs
    public final void a(String str) {
        if (str != null) {
            this.x.x(str.concat(".Shown"), null);
        }
    }

    @Override // defpackage.klb0, defpackage.e1q0, defpackage.iry0, defpackage.vs
    public final void b(gv90 gv90Var, String str) {
    }

    @Override // defpackage.o8j
    public final void h(String str) {
        if (str != null) {
            this.x.x(str.concat(".Shown"), null);
        }
    }

    @Override // defpackage.pv4
    public final void n(gv90 gv90Var) {
    }

    @Override // defpackage.o8j
    public final void o(h8j h8jVar, String str) {
    }

    @Override // defpackage.jfe0
    public final void u() {
    }

    @Override // defpackage.tts0
    public final void x(String str) {
    }

    @Override // defpackage.tts0
    public final void z(nr nrVar) {
    }
}
