package ru.yandex.taxi.logistics.sdk.address_details.impl.ui;

import defpackage.ny61;
import defpackage.ps0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public b(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AddressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1 addressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof AddressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1) {
            addressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1 = (AddressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
            int i2 = addressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = addressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!((ps0) obj).b.equals(this.b.y)) {
                        addressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.L$0 = null;
                        addressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.L$1 = null;
                        addressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.L$2 = null;
                        addressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.L$3 = null;
                        addressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.I$0 = 0;
                        addressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, addressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        addressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1 = new AddressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = addressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressDetailsViewModel$observeUploadPhotoErrors$1$invokeSuspend$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
