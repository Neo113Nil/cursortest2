package ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor;

import defpackage.l7;
import defpackage.ny61;
import defpackage.p6s;
import defpackage.r3s;
import defpackage.st2;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class m {
    public final com.yandex.delivery.libs.imageupload.impl.domain.b a;
    public final st2 b;
    public final r3s c;
    public final p6s d;
    public final com.yandex.delivery.utils.dialogmanager.a e;

    public m(com.yandex.delivery.libs.imageupload.impl.domain.b bVar, st2 st2Var, r3s r3sVar, p6s p6sVar, com.yandex.delivery.utils.dialogmanager.a aVar) {
        this.a = bVar;
        this.b = st2Var;
        this.c = r3sVar;
        this.d = p6sVar;
        this.e = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(m mVar, String str, String str2, String str3, Object obj, Object obj2, Continuation continuation) {
        UploadSmartCameraPhotoInteractor$launchAsyncTask$1 uploadSmartCameraPhotoInteractor$launchAsyncTask$1;
        int i;
        p6s p6sVar = mVar.d;
        if (continuation instanceof UploadSmartCameraPhotoInteractor$launchAsyncTask$1) {
            uploadSmartCameraPhotoInteractor$launchAsyncTask$1 = (UploadSmartCameraPhotoInteractor$launchAsyncTask$1) continuation;
            int i2 = uploadSmartCameraPhotoInteractor$launchAsyncTask$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uploadSmartCameraPhotoInteractor$launchAsyncTask$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = uploadSmartCameraPhotoInteractor$launchAsyncTask$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = uploadSmartCameraPhotoInteractor$launchAsyncTask$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    p6sVar.c(str, str2);
                    l7 l7Var = new l7(p6sVar.e(), str2, str, 24);
                    uploadSmartCameraPhotoInteractor$launchAsyncTask$1.L$0 = null;
                    uploadSmartCameraPhotoInteractor$launchAsyncTask$1.L$1 = null;
                    uploadSmartCameraPhotoInteractor$launchAsyncTask$1.L$2 = str3;
                    uploadSmartCameraPhotoInteractor$launchAsyncTask$1.L$3 = obj;
                    uploadSmartCameraPhotoInteractor$launchAsyncTask$1.L$4 = obj2;
                    uploadSmartCameraPhotoInteractor$launchAsyncTask$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(l7Var, uploadSmartCameraPhotoInteractor$launchAsyncTask$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = uploadSmartCameraPhotoInteractor$launchAsyncTask$1.L$4;
                    obj = uploadSmartCameraPhotoInteractor$launchAsyncTask$1.L$3;
                    str3 = (String) uploadSmartCameraPhotoInteractor$launchAsyncTask$1.L$2;
                    kotlin.b.b(obj3);
                }
                mVar.c.a(str3, obj, obj2);
                return zy11.a;
            }
        }
        uploadSmartCameraPhotoInteractor$launchAsyncTask$1 = new UploadSmartCameraPhotoInteractor$launchAsyncTask$1(mVar, continuation);
        Object obj32 = uploadSmartCameraPhotoInteractor$launchAsyncTask$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = uploadSmartCameraPhotoInteractor$launchAsyncTask$1.label;
        if (i != 0) {
        }
        mVar.c.a(str3, obj, obj2);
        return zy11.a;
    }
}
