package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo;

import defpackage.ny61;
import defpackage.pan0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (r6.c(r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1 scootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1;
        int i;
        boolean booleanValue;
        if (continuation instanceof ScootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1) {
            scootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1 = (ScootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1) continuation;
            int i2 = scootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1.label;
                d dVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (booleanValue) {
                        ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a aVar = dVar.D;
                        scootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1.L$0 = null;
                        scootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1.L$1 = null;
                        scootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1.Z$0 = booleanValue;
                        scootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1.label = 1;
                        obj2 = aVar.d(scootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1);
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                booleanValue = scootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1.Z$0;
                kotlin.b.b(obj2);
                if (((Boolean) obj2).booleanValue()) {
                    ((pan0) dVar.Dg()).q2();
                    ((pan0) dVar.Dg()).B7(dVar.F);
                }
                ((pan0) dVar.Dg()).y7();
                if (dVar.F) {
                    ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a aVar2 = dVar.D;
                    scootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1.L$0 = null;
                    scootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1.L$1 = null;
                    scootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1.Z$0 = booleanValue;
                    scootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1.label = 2;
                }
                return zy11.a;
            }
        }
        scootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1 = new ScootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1(this, continuation);
        Object obj22 = scootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1$1$1.label;
        d dVar2 = this.a;
        if (i != 0) {
        }
    }
}
