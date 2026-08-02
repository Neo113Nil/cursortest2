package ru.yandex.taxi.sdc.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class b implements tpr {
    public final /* synthetic */ com.yandex.go.navigation.screen.b a;
    public final /* synthetic */ c b;

    public b(com.yandex.go.navigation.screen.b bVar, c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$1 sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$1;
        int i;
        if (continuation instanceof SdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$1) {
            sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$1 = (SdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$1) continuation;
            int i2 = sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$1.L$0 = null;
                    sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$1.L$1 = null;
                    sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$1.L$2 = null;
                    sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(aVar, sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$1) == coroutineSingletons) {
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
        sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$1 = new SdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$1(this, continuation);
        Object obj2 = sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
