package ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui;

import defpackage.c6z0;
import defpackage.d6z0;
import defpackage.e6z0;
import defpackage.f6z0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d b;

    public c(vpr vprVar, d dVar) {
        this.a = vprVar;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RentalDurationViewModel$special$$inlined$map$2$2$1 rentalDurationViewModel$special$$inlined$map$2$2$1;
        int i;
        f6z0 f6z0Var;
        if (continuation instanceof RentalDurationViewModel$special$$inlined$map$2$2$1) {
            rentalDurationViewModel$special$$inlined$map$2$2$1 = (RentalDurationViewModel$special$$inlined$map$2$2$1) continuation;
            int i2 = rentalDurationViewModel$special$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rentalDurationViewModel$special$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = rentalDurationViewModel$special$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rentalDurationViewModel$special$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    e6z0 e6z0Var = (e6z0) obj;
                    if (e6z0Var != null) {
                        this.b.w.getClass();
                        ArrayList<c6z0> arrayList = e6z0Var.a;
                        if (!arrayList.isEmpty()) {
                            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                            for (c6z0 c6z0Var : arrayList) {
                                arrayList2.add(new d6z0(c6z0Var.b, c6z0Var.a));
                            }
                            f6z0Var = new f6z0(arrayList2, e6z0Var.b);
                            rentalDurationViewModel$special$$inlined$map$2$2$1.L$0 = null;
                            rentalDurationViewModel$special$$inlined$map$2$2$1.L$1 = null;
                            rentalDurationViewModel$special$$inlined$map$2$2$1.L$2 = null;
                            rentalDurationViewModel$special$$inlined$map$2$2$1.L$3 = null;
                            rentalDurationViewModel$special$$inlined$map$2$2$1.I$0 = 0;
                            rentalDurationViewModel$special$$inlined$map$2$2$1.label = 1;
                            if (this.a.emit(f6z0Var, rentalDurationViewModel$special$$inlined$map$2$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    f6z0Var = null;
                    rentalDurationViewModel$special$$inlined$map$2$2$1.L$0 = null;
                    rentalDurationViewModel$special$$inlined$map$2$2$1.L$1 = null;
                    rentalDurationViewModel$special$$inlined$map$2$2$1.L$2 = null;
                    rentalDurationViewModel$special$$inlined$map$2$2$1.L$3 = null;
                    rentalDurationViewModel$special$$inlined$map$2$2$1.I$0 = 0;
                    rentalDurationViewModel$special$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(f6z0Var, rentalDurationViewModel$special$$inlined$map$2$2$1) == coroutineSingletons) {
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
        rentalDurationViewModel$special$$inlined$map$2$2$1 = new RentalDurationViewModel$special$$inlined$map$2$2$1(this, continuation);
        Object obj22 = rentalDurationViewModel$special$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rentalDurationViewModel$special$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
