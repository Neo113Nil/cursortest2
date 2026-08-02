package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.pay_now.api;

import defpackage.at20;
import defpackage.cuj0;
import defpackage.cx;
import defpackage.cyu0;
import defpackage.dms;
import defpackage.ea91;
import defpackage.fz6;
import defpackage.i2a0;
import defpackage.j2a0;
import defpackage.j4z;
import defpackage.jk51;
import defpackage.l2a0;
import defpackage.lvi0;
import defpackage.m07;
import defpackage.mea0;
import defpackage.mvg;
import defpackage.n07;
import defpackage.nt90;
import defpackage.ny61;
import defpackage.uzh0;
import defpackage.vzg0;
import defpackage.w511;
import defpackage.wzg0;
import defpackage.yuj0;
import defpackage.zp1;
import defpackage.zx90;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.ui_models.common.YaTextStyle;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcx;", "actionPayNow", "Lmea0;", "selectedPayment", "", "", "payingDeliveryIds", "", "<unused var>", "Lnt90;", "<anonymous>", "(Lcx;Lmea0;Ljava/util/Set;Z)Lnt90;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.pay_now.api.PayNowStateHolder$uiModelFlow$1", f = "PayNowStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PayNowStateHolder$uiModelFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayNowStateHolder$uiModelFlow$1(a aVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Boolean) obj4).booleanValue();
        PayNowStateHolder$uiModelFlow$1 payNowStateHolder$uiModelFlow$1 = new PayNowStateHolder$uiModelFlow$1(this.this$0, (Continuation) obj5);
        payNowStateHolder$uiModelFlow$1.L$0 = (cx) obj;
        payNowStateHolder$uiModelFlow$1.L$1 = (mea0) obj2;
        payNowStateHolder$uiModelFlow$1.L$2 = (Set) obj3;
        return payNowStateHolder$uiModelFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        cyu0 cyu0Var;
        l2a0 l2a0Var;
        String str;
        boolean z3;
        jk51 jk51Var;
        boolean z4;
        lvi0 lvi0Var;
        boolean z5;
        cx cxVar = (cx) this.L$0;
        mea0 mea0Var = (mea0) this.L$1;
        Set set = (Set) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.f = mea0Var;
        boolean contains = set.contains(this.this$0.a);
        if (cxVar == null) {
            return null;
        }
        at20 at20Var = this.this$0.b;
        yuj0 yuj0Var = (yuj0) at20Var.a;
        ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a aVar = (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a) at20Var.b;
        List list = cxVar.a;
        boolean G = kotlin.collections.a.G(list, mea0Var != null ? mea0Var.b : null);
        m07 m07Var = G ? cxVar.c : cxVar.d;
        LinkedHashMap l = kotlin.collections.b.l(new Pair("button_action", G ? "pay" : "choose_payment_method"));
        if (contains) {
            l.put("button_state", "is_paying");
        } else if (!m07Var.d) {
            l.put("button_state", "is_disabled");
        }
        ea91 ea91Var = cxVar.b;
        if (ea91Var instanceof j2a0) {
            j2a0 j2a0Var = (j2a0) ea91Var;
            cyu0 i = aVar.i(j2a0Var.b);
            zp1 zp1Var = j2a0Var.c;
            cyu0 i2 = zp1Var != null ? aVar.i(zp1Var) : null;
            zp1 zp1Var2 = j2a0Var.d;
            cyu0 i3 = zp1Var2 != null ? aVar.i(zp1Var2) : null;
            zp1 zp1Var3 = j2a0Var.e;
            cyu0 i4 = zp1Var3 != null ? aVar.i(zp1Var3) : null;
            jk51 jk51Var2 = j2a0Var.f;
            l2a0Var = new l2a0(i, i2, i3, i4, null, true, false, new zx90(list), jk51Var2 != null ? aVar.b(jk51Var2) : null);
            z = G;
        } else {
            if (!(ea91Var instanceof i2a0)) {
                w511.b();
                return null;
            }
            if (!G) {
                z = G;
                String str2 = ((i2a0) ea91Var).b;
                String a = yuj0Var.a(uzh0.delivery_pay_by_card, new Object[0]);
                YaTextStyle yaTextStyle = YaTextStyle.BODY2;
                cyu0 cyu0Var2 = new cyu0(a, yaTextStyle, aVar.d("textMain"));
                if (str2 != null) {
                    z2 = contains;
                    cyu0Var = new cyu0(str2, yaTextStyle, aVar.d("textMain"));
                } else {
                    z2 = contains;
                    cyu0Var = null;
                }
                l2a0Var = new l2a0(cyu0Var2, null, cyu0Var, null, null, true, false, new zx90(list), new cuj0(wzg0.ic_payment_card, null, null, null, 30));
                l2a0 l2a0Var2 = l2a0Var;
                cyu0 i5 = aVar.i(m07Var.a);
                if (z2) {
                    z3 = false;
                } else {
                    z3 = false;
                    i5 = new cyu0(yuj0Var.a(uzh0.delivery_payment_in_progress, new Object[0]), i5.b, i5.c, i5.d, i5.e, i5.f);
                }
                zp1 zp1Var4 = m07Var.b;
                cyu0 i6 = zp1Var4 == null ? aVar.i(zp1Var4) : null;
                jk51Var = m07Var.c;
                if (jk51Var == null) {
                    boolean z6 = z3;
                    lvi0Var = aVar.b(jk51Var);
                    z4 = z6;
                } else {
                    z4 = z3;
                    lvi0Var = null;
                }
                z5 = m07Var.d;
                if (z5 && !z2) {
                    z4 = true;
                }
                return new nt90(l2a0Var2, new n07(i5, i6, lvi0Var, z4, z5, z2, new fz6(z, list, l)));
            }
            z = G;
            l2a0Var = new l2a0(new cyu0(yuj0Var.a(uzh0.delivery_pay_by_card, new Object[0]), YaTextStyle.BODY2, aVar.d("textMain")), (mea0Var == null || (str = mea0Var.c) == null) ? null : new cyu0(str, YaTextStyle.CAPTION1, aVar.d("textMinor")), null, new cyu0(yuj0Var.a(uzh0.delivery_change_payment_method, new Object[0]), YaTextStyle.CAPTION1, aVar.d("textMinor")), new cuj0(vzg0.ic_tracking_chevron_right, null, Boolean.TRUE, null, 26), !contains, true, new zx90(list), mea0Var != null ? new j4z(mea0Var.f, null, 30) : null);
        }
        z2 = contains;
        l2a0 l2a0Var22 = l2a0Var;
        cyu0 i52 = aVar.i(m07Var.a);
        if (z2) {
        }
        zp1 zp1Var42 = m07Var.b;
        if (zp1Var42 == null) {
        }
        jk51Var = m07Var.c;
        if (jk51Var == null) {
        }
        z5 = m07Var.d;
        if (z5) {
            z4 = true;
        }
        return new nt90(l2a0Var22, new n07(i52, i6, lvi0Var, z4, z5, z2, new fz6(z, list, l)));
    }
}
