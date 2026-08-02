package ru.yandex.taxi.search.suggest;

import defpackage.g2t;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public e(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1 pointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1;
        int i;
        Result result;
        if (continuation instanceof PointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1) {
            pointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1 = (PointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = pointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = pointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object value = ((Result) obj).getValue();
                    i iVar = this.b;
                    if (!(value instanceof Result.Failure)) {
                        try {
                            value = iVar.r((g2t) value);
                        } catch (Throwable th) {
                            value = new Result.Failure(th);
                        }
                        if (value == null) {
                            result = null;
                            if (result != null) {
                                pointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1.L$0 = null;
                                pointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1.L$1 = null;
                                pointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1.L$2 = null;
                                pointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1.L$3 = null;
                                pointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1.L$4 = null;
                                pointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1.label = 1;
                                if (this.a.emit(result, pointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    }
                    result = new Result(value);
                    if (result != null) {
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
        pointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1 = new PointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = pointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pointAddressInteractor$validateAndMap$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
