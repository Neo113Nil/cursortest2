package ru.yandex.taxi.logistics.sdk.tracking.impl.change_datetime.ui;

import defpackage.ny61;
import defpackage.qrg;
import defpackage.vpr;
import defpackage.zy11;
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
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChangeDateTimeViewModel$special$$inlined$map$1$2$1 changeDateTimeViewModel$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ChangeDateTimeViewModel$special$$inlined$map$1$2$1) {
            changeDateTimeViewModel$special$$inlined$map$1$2$1 = (ChangeDateTimeViewModel$special$$inlined$map$1$2$1) continuation;
            int i2 = changeDateTimeViewModel$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeDateTimeViewModel$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = changeDateTimeViewModel$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeDateTimeViewModel$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    qrg W = this.b.W(((Number) obj).intValue());
                    changeDateTimeViewModel$special$$inlined$map$1$2$1.L$0 = null;
                    changeDateTimeViewModel$special$$inlined$map$1$2$1.L$1 = null;
                    changeDateTimeViewModel$special$$inlined$map$1$2$1.L$2 = null;
                    changeDateTimeViewModel$special$$inlined$map$1$2$1.L$3 = null;
                    changeDateTimeViewModel$special$$inlined$map$1$2$1.I$0 = 0;
                    changeDateTimeViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(W, changeDateTimeViewModel$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        changeDateTimeViewModel$special$$inlined$map$1$2$1 = new ChangeDateTimeViewModel$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = changeDateTimeViewModel$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeDateTimeViewModel$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
