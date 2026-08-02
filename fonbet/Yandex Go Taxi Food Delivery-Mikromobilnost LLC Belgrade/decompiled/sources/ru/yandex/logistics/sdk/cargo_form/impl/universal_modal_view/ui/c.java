package ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.ui;

import defpackage.g230;
import defpackage.i230;
import defpackage.ip00;
import defpackage.j130;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ModalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1 modalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof ModalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1) {
            modalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1 = (ModalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = modalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                modalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = modalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = modalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    j130 j130Var = (j130) obj;
                    i230 i230Var = j130Var != null ? j130Var.i : null;
                    g230 g230Var = i230Var instanceof g230 ? (g230) i230Var : null;
                    ip00 ip00Var = g230Var != null ? g230Var.a : null;
                    if (ip00Var != null) {
                        modalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1.L$0 = null;
                        modalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1.L$1 = null;
                        modalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1.L$2 = null;
                        modalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1.L$3 = null;
                        modalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1.L$4 = null;
                        modalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        modalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(ip00Var, modalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        modalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1 = new ModalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = modalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = modalViewViewModel$startDrawRouteSubscription$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
