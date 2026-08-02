package ru.yandex.taxi.logistics.sdk.show_modalview_action;

import defpackage.czh;
import defpackage.hhg;
import defpackage.ny61;
import defpackage.vni;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a implements vni {
    public final /* synthetic */ wls a;
    public final /* synthetic */ czh b;

    public a(wls wlsVar, czh czhVar) {
        this.a = wlsVar;
        this.b = czhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(hhg hhgVar, Continuation continuation) {
        ModalViewActionRouter$open$engine$1$handleAction$1 modalViewActionRouter$open$engine$1$handleAction$1;
        int i;
        if (continuation instanceof ModalViewActionRouter$open$engine$1$handleAction$1) {
            modalViewActionRouter$open$engine$1$handleAction$1 = (ModalViewActionRouter$open$engine$1$handleAction$1) continuation;
            int i2 = modalViewActionRouter$open$engine$1$handleAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                modalViewActionRouter$open$engine$1$handleAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = modalViewActionRouter$open$engine$1$handleAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = modalViewActionRouter$open$engine$1$handleAction$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    modalViewActionRouter$open$engine$1$handleAction$1.L$0 = null;
                    modalViewActionRouter$open$engine$1$handleAction$1.label = 1;
                    this.a.invoke(hhgVar, modalViewActionRouter$open$engine$1$handleAction$1);
                    if (zy11Var == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                this.b.dismiss();
                return zy11Var;
            }
        }
        modalViewActionRouter$open$engine$1$handleAction$1 = new ModalViewActionRouter$open$engine$1$handleAction$1(this, (ContinuationImpl) continuation);
        Object obj2 = modalViewActionRouter$open$engine$1$handleAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = modalViewActionRouter$open$engine$1$handleAction$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        this.b.dismiss();
        return zy11Var2;
    }
}
