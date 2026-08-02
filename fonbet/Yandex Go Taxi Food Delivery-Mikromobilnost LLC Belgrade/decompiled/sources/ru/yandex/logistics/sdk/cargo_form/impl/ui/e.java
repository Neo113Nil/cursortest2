package ru.yandex.logistics.sdk.cargo_form.impl.ui;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.qkg;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ h b;

    public e(vpr vprVar, h hVar) {
        this.a = vprVar;
        this.b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1 cargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof CargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1) {
            cargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1 = (CargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
            int i2 = cargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!jl40.l((qkg) obj, this.b.F)) {
                        cargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.L$0 = null;
                        cargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.L$1 = null;
                        cargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.L$2 = null;
                        cargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.L$3 = null;
                        cargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.I$0 = 0;
                        cargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, cargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        cargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1 = new CargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = cargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cargoFormViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
