package ru.yandex.taxi.logistics.sdk.confirmation_modal_view.ui;

import defpackage.f030;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class d implements vpr {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, Continuation continuation) {
        ConfirmationViewModel$1$1$emit$1 confirmationViewModel$1$1$emit$1;
        int i;
        pz40 pz40Var;
        if (continuation instanceof ConfirmationViewModel$1$1$emit$1) {
            confirmationViewModel$1$1$emit$1 = (ConfirmationViewModel$1$1$emit$1) continuation;
            int i2 = confirmationViewModel$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                confirmationViewModel$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = confirmationViewModel$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = confirmationViewModel$1$1$emit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = this.a;
                    r0 r0Var = eVar.y;
                    c cVar = eVar.x;
                    f030 f030Var = eVar.b.a;
                    confirmationViewModel$1$1$emit$1.L$0 = r0Var;
                    confirmationViewModel$1$1$emit$1.Z$0 = z;
                    confirmationViewModel$1$1$emit$1.label = 1;
                    Object a = cVar.a(f030Var, confirmationViewModel$1$1$emit$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    pz40Var = r0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pz40Var = (pz40) confirmationViewModel$1$1$emit$1.L$0;
                    kotlin.b.b(obj);
                }
                ((r0) pz40Var).l(obj);
                return zy11.a;
            }
        }
        confirmationViewModel$1$1$emit$1 = new ConfirmationViewModel$1$1$emit$1(this, continuation);
        Object obj2 = confirmationViewModel$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = confirmationViewModel$1$1$emit$1.label;
        if (i != 0) {
        }
        ((r0) pz40Var).l(obj2);
        return zy11.a;
    }

    @Override // defpackage.vpr
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(((Boolean) obj).booleanValue(), continuation);
    }
}
