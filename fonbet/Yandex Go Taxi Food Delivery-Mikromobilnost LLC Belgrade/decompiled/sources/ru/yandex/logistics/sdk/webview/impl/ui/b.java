package ru.yandex.logistics.sdk.webview.impl.ui;

import defpackage.eg01;
import defpackage.et41;
import defpackage.hdu;
import defpackage.jgz;
import defpackage.ku41;
import defpackage.ny61;
import defpackage.qa41;
import defpackage.ra41;
import defpackage.sa41;
import defpackage.svi;
import defpackage.ta41;
import defpackage.w511;
import defpackage.xvi;
import defpackage.yr31;
import defpackage.yuj0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class b extends yr31 {
    public final et41 A;
    public final yuj0 B;
    public final svi b;
    public final xvi c;
    public final eg01 w;
    public final ku41 x;
    public final hdu y;
    public final com.yandex.go.logistics.cargo_flow.form.a z;

    public b(svi sviVar, xvi xviVar, eg01 eg01Var, ku41 ku41Var, hdu hduVar, com.yandex.go.logistics.cargo_flow.form.a aVar, et41 et41Var, yuj0 yuj0Var) {
        this.b = sviVar;
        this.c = xviVar;
        this.w = eg01Var;
        this.x = ku41Var;
        this.y = hduVar;
        this.z = aVar;
        this.A = et41Var;
        this.B = yuj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W(b bVar, String str, ContinuationImpl continuationImpl) {
        DeliveryWebViewViewModel$wrapUrl$1 deliveryWebViewViewModel$wrapUrl$1;
        int i;
        ta41 ta41Var;
        bVar.getClass();
        if (continuationImpl instanceof DeliveryWebViewViewModel$wrapUrl$1) {
            deliveryWebViewViewModel$wrapUrl$1 = (DeliveryWebViewViewModel$wrapUrl$1) continuationImpl;
            int i2 = deliveryWebViewViewModel$wrapUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryWebViewViewModel$wrapUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryWebViewViewModel$wrapUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryWebViewViewModel$wrapUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!bVar.b.b) {
                        return str;
                    }
                    com.yandex.go.logistics.cargo_flow.form.a aVar = bVar.z;
                    deliveryWebViewViewModel$wrapUrl$1.L$0 = str;
                    deliveryWebViewViewModel$wrapUrl$1.label = 1;
                    obj = aVar.a(str, deliveryWebViewViewModel$wrapUrl$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) deliveryWebViewViewModel$wrapUrl$1.L$0;
                    kotlin.b.b(obj);
                }
                ta41Var = (ta41) obj;
                if (!(ta41Var instanceof sa41)) {
                    return str;
                }
                if (ta41Var instanceof ra41) {
                    jgz.a.h("DeliveryWebViewRouter");
                    jgz.b("Cannot authorize", new Object[0]);
                    return str;
                }
                if (ta41Var instanceof qa41) {
                    return ((qa41) ta41Var).a;
                }
                w511.b();
                return null;
            }
        }
        deliveryWebViewViewModel$wrapUrl$1 = new DeliveryWebViewViewModel$wrapUrl$1(bVar, continuationImpl);
        Object obj2 = deliveryWebViewViewModel$wrapUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryWebViewViewModel$wrapUrl$1.label;
        if (i != 0) {
        }
        ta41Var = (ta41) obj2;
        if (!(ta41Var instanceof sa41)) {
        }
    }

    @Override // defpackage.yr31
    public final void V() {
        this.c.b.getClass();
    }
}
