package ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor;

import defpackage.j6s;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.vys0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ vys0 b;

    public i(vpr vprVar, vys0 vys0Var) {
        this.a = vprVar;
        this.b = vys0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OpenOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1 openOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof OpenOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1) {
            openOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1 = (OpenOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = openOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                openOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = openOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = openOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object obj3 = ((j6s) obj).a.get(this.b.d);
                    Number number = obj3 instanceof Number ? (Number) obj3 : null;
                    Integer num = number != null ? new Integer(number.intValue()) : null;
                    if (num != null) {
                        openOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        openOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        openOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        openOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        openOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        openOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        openOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(num, openOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        openOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1 = new OpenOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = openOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = openOverCameraModalViewInteractor$switchToArCameraType$idsFlow$1$getBoxIdStateFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
