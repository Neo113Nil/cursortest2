package ru.yandex.taxi.cashback.interactors;

import defpackage.evu0;
import defpackage.jzs;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;

    public j(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpdatePlusDataOnZoneChangeInteractor$geoLocationFlow$$inlined$filterNot$1$2$1 updatePlusDataOnZoneChangeInteractor$geoLocationFlow$$inlined$filterNot$1$2$1;
        int i;
        if (continuation instanceof UpdatePlusDataOnZoneChangeInteractor$geoLocationFlow$$inlined$filterNot$1$2$1) {
            updatePlusDataOnZoneChangeInteractor$geoLocationFlow$$inlined$filterNot$1$2$1 = (UpdatePlusDataOnZoneChangeInteractor$geoLocationFlow$$inlined$filterNot$1$2$1) continuation;
            int i2 = updatePlusDataOnZoneChangeInteractor$geoLocationFlow$$inlined$filterNot$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updatePlusDataOnZoneChangeInteractor$geoLocationFlow$$inlined$filterNot$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = updatePlusDataOnZoneChangeInteractor$geoLocationFlow$$inlined$filterNot$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updatePlusDataOnZoneChangeInteractor$geoLocationFlow$$inlined$filterNot$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str = ((jzs) obj).c;
                    if (str != null && !evu0.J(str)) {
                        updatePlusDataOnZoneChangeInteractor$geoLocationFlow$$inlined$filterNot$1$2$1.L$0 = null;
                        updatePlusDataOnZoneChangeInteractor$geoLocationFlow$$inlined$filterNot$1$2$1.L$1 = null;
                        updatePlusDataOnZoneChangeInteractor$geoLocationFlow$$inlined$filterNot$1$2$1.L$2 = null;
                        updatePlusDataOnZoneChangeInteractor$geoLocationFlow$$inlined$filterNot$1$2$1.L$3 = null;
                        updatePlusDataOnZoneChangeInteractor$geoLocationFlow$$inlined$filterNot$1$2$1.label = 1;
                        if (this.a.emit(obj, updatePlusDataOnZoneChangeInteractor$geoLocationFlow$$inlined$filterNot$1$2$1) == coroutineSingletons) {
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
        updatePlusDataOnZoneChangeInteractor$geoLocationFlow$$inlined$filterNot$1$2$1 = new UpdatePlusDataOnZoneChangeInteractor$geoLocationFlow$$inlined$filterNot$1$2$1(this, continuation);
        Object obj22 = updatePlusDataOnZoneChangeInteractor$geoLocationFlow$$inlined$filterNot$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updatePlusDataOnZoneChangeInteractor$geoLocationFlow$$inlined$filterNot$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
