package ru.yandex.taxi.logistics.sdk.delivery.state;

import defpackage.hwh;
import defpackage.jw40;
import defpackage.kw40;
import defpackage.ny61;
import defpackage.qej;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class e implements vpr {
    public final /* synthetic */ h a;
    public final /* synthetic */ String b;

    public e(h hVar, String str) {
        this.a = hVar;
        this.b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r2.a(r11, r3) == r4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(jw40 jw40Var, Continuation continuation) {
        DeliveryStateAlertsInteractor$startSubscription$1$4$emit$1 deliveryStateAlertsInteractor$startSubscription$1$4$emit$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        jw40 jw40Var2 = jw40Var;
        if (continuation instanceof DeliveryStateAlertsInteractor$startSubscription$1$4$emit$1) {
            deliveryStateAlertsInteractor$startSubscription$1$4$emit$1 = (DeliveryStateAlertsInteractor$startSubscription$1$4$emit$1) continuation;
            int i2 = deliveryStateAlertsInteractor$startSubscription$1$4$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryStateAlertsInteractor$startSubscription$1$4$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryStateAlertsInteractor$startSubscription$1$4$emit$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryStateAlertsInteractor$startSubscription$1$4$emit$1.label;
                zy11 zy11Var = zy11.a;
                h hVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = jw40Var2.a;
                    String str2 = jw40Var2.b;
                    String str3 = jw40Var2.c.a;
                    kw40 kw40Var = jw40Var2.d;
                    qej qejVar = new qej(str, str2, str3, kw40Var != null ? kw40Var.a : null, null, false, jw40Var2.f, null, 176);
                    com.yandex.delivery.utils.dialogmanager.impl.b bVar = hVar.d;
                    deliveryStateAlertsInteractor$startSubscription$1$4$emit$1.L$0 = jw40Var2;
                    deliveryStateAlertsInteractor$startSubscription$1$4$emit$1.L$1 = null;
                    deliveryStateAlertsInteractor$startSubscription$1$4$emit$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    jw40Var2 = (jw40) deliveryStateAlertsInteractor$startSubscription$1$4$emit$1.L$0;
                    kotlin.b.b(obj);
                }
                hwh hwhVar = hVar.b;
                deliveryStateAlertsInteractor$startSubscription$1$4$emit$1.L$0 = null;
                deliveryStateAlertsInteractor$startSubscription$1$4$emit$1.L$1 = null;
                deliveryStateAlertsInteractor$startSubscription$1$4$emit$1.label = 2;
                b bVar2 = (b) hwhVar;
                a = androidx.datastore.preferences.core.b.a(bVar2.b(bVar2.a), new DeliveryAlertsDataStoreImpl$removeAlert$2(this.b, bVar2.b.d(jw40Var2), bVar2, null), deliveryStateAlertsInteractor$startSubscription$1$4$emit$1);
                if (a != coroutineSingletons) {
                    a = zy11Var;
                }
                return a != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        deliveryStateAlertsInteractor$startSubscription$1$4$emit$1 = new DeliveryStateAlertsInteractor$startSubscription$1$4$emit$1(this, continuation);
        Object obj2 = deliveryStateAlertsInteractor$startSubscription$1$4$emit$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryStateAlertsInteractor$startSubscription$1$4$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        h hVar2 = this.a;
        if (i != 0) {
        }
        hwh hwhVar2 = hVar2.b;
        deliveryStateAlertsInteractor$startSubscription$1$4$emit$1.L$0 = null;
        deliveryStateAlertsInteractor$startSubscription$1$4$emit$1.L$1 = null;
        deliveryStateAlertsInteractor$startSubscription$1$4$emit$1.label = 2;
        b bVar22 = (b) hwhVar2;
        a = androidx.datastore.preferences.core.b.a(bVar22.b(bVar22.a), new DeliveryAlertsDataStoreImpl$removeAlert$2(this.b, bVar22.b.d(jw40Var2), bVar22, null), deliveryStateAlertsInteractor$startSubscription$1$4$emit$1);
        if (a != coroutineSingletons) {
        }
        if (a != coroutineSingletons) {
        }
    }
}
