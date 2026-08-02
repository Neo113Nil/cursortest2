package ru.yandex.taxi.scooters.data;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class m implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public m(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersFeedbackPhotosRepository$listenPhotos$$inlined$map$1$2$1 scootersFeedbackPhotosRepository$listenPhotos$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ScootersFeedbackPhotosRepository$listenPhotos$$inlined$map$1$2$1) {
            scootersFeedbackPhotosRepository$listenPhotos$$inlined$map$1$2$1 = (ScootersFeedbackPhotosRepository$listenPhotos$$inlined$map$1$2$1) continuation;
            int i2 = scootersFeedbackPhotosRepository$listenPhotos$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersFeedbackPhotosRepository$listenPhotos$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersFeedbackPhotosRepository$listenPhotos$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersFeedbackPhotosRepository$listenPhotos$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object obj3 = (List) ((Map) obj).get(this.b);
                    if (obj3 == null) {
                        obj3 = EmptyList.a;
                    }
                    scootersFeedbackPhotosRepository$listenPhotos$$inlined$map$1$2$1.L$0 = null;
                    scootersFeedbackPhotosRepository$listenPhotos$$inlined$map$1$2$1.L$1 = null;
                    scootersFeedbackPhotosRepository$listenPhotos$$inlined$map$1$2$1.L$2 = null;
                    scootersFeedbackPhotosRepository$listenPhotos$$inlined$map$1$2$1.L$3 = null;
                    scootersFeedbackPhotosRepository$listenPhotos$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj3, scootersFeedbackPhotosRepository$listenPhotos$$inlined$map$1$2$1) == coroutineSingletons) {
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
        scootersFeedbackPhotosRepository$listenPhotos$$inlined$map$1$2$1 = new ScootersFeedbackPhotosRepository$listenPhotos$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersFeedbackPhotosRepository$listenPhotos$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersFeedbackPhotosRepository$listenPhotos$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
