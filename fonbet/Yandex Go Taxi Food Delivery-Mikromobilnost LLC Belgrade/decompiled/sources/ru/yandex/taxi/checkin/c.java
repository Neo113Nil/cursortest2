package ru.yandex.taxi.checkin;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements tpr {
    public final /* synthetic */ com.yandex.go.taxi.order.repositories.b a;

    public c(com.yandex.go.taxi.order.repositories.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CheckInRepository$sendCheckInRequest$2$invokeSuspend$$inlined$filter$1$1 checkInRepository$sendCheckInRequest$2$invokeSuspend$$inlined$filter$1$1;
        int i;
        if (continuation instanceof CheckInRepository$sendCheckInRequest$2$invokeSuspend$$inlined$filter$1$1) {
            checkInRepository$sendCheckInRequest$2$invokeSuspend$$inlined$filter$1$1 = (CheckInRepository$sendCheckInRequest$2$invokeSuspend$$inlined$filter$1$1) continuation;
            int i2 = checkInRepository$sendCheckInRequest$2$invokeSuspend$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkInRepository$sendCheckInRequest$2$invokeSuspend$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkInRepository$sendCheckInRequest$2$invokeSuspend$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkInRepository$sendCheckInRequest$2$invokeSuspend$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar);
                    checkInRepository$sendCheckInRequest$2$invokeSuspend$$inlined$filter$1$1.L$0 = null;
                    checkInRepository$sendCheckInRequest$2$invokeSuspend$$inlined$filter$1$1.L$1 = null;
                    checkInRepository$sendCheckInRequest$2$invokeSuspend$$inlined$filter$1$1.L$2 = null;
                    checkInRepository$sendCheckInRequest$2$invokeSuspend$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(bVar, checkInRepository$sendCheckInRequest$2$invokeSuspend$$inlined$filter$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        checkInRepository$sendCheckInRequest$2$invokeSuspend$$inlined$filter$1$1 = new CheckInRepository$sendCheckInRequest$2$invokeSuspend$$inlined$filter$1$1(this, continuation);
        Object obj2 = checkInRepository$sendCheckInRequest$2$invokeSuspend$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkInRepository$sendCheckInRequest$2$invokeSuspend$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
