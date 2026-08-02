package ru.yandex.logistics.care.ui;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.whb0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes4.dex */
public final class m implements vpr {
    public final /* synthetic */ vpr a;

    public m(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PhotoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1 photoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof PhotoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1) {
            photoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1 = (PhotoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1) continuation;
            int i2 = photoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                photoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = photoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = photoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Map map = (Map) obj;
                    if (!map.isEmpty()) {
                        Iterator it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            if (((Map.Entry) it.next()).getValue() instanceof whb0) {
                                break;
                            }
                        }
                    }
                    photoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1.L$0 = null;
                    photoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1.L$1 = null;
                    photoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1.L$2 = null;
                    photoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1.L$3 = null;
                    photoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1.I$0 = 0;
                    photoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1.label = 1;
                    if (this.a.emit(obj, photoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        photoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1 = new PhotoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = photoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = photoProcessingDelegate$waitForUploadsAndUpdateState$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
