package ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor;

import defpackage.j6s;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public k(vpr vprVar, String str, String str2) {
        this.a = vprVar;
        this.b = str;
        this.c = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1 uploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof UploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1) {
            uploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1 = (UploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1) continuation;
            int i2 = uploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = uploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = uploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (jl40.l(((j6s) obj).a.get(this.b), this.c)) {
                        uploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1.L$0 = null;
                        uploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1.L$1 = null;
                        uploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1.L$2 = null;
                        uploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1.L$3 = null;
                        uploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1.I$0 = 0;
                        uploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, uploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        uploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1 = new UploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = uploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = uploadSmartCameraPhotoInteractor$launchAsyncTask$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
