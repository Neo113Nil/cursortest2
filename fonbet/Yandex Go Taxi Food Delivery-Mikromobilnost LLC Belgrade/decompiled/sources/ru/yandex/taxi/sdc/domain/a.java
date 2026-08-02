package ru.yandex.taxi.sdc.domain;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tmp0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$2$1 sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof SdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$2$1) {
            sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$2$1 = (SdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
            int i2 = sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    if (((Screen) obj) == Screen.MAIN_V4) {
                        tmp0 tmp0Var = this.b.e;
                        pex0 m = ((k) tmp0Var.a).m();
                        if (m != null && jl40.l(m.b, tmp0Var.b.a)) {
                            sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$2$1.L$0 = null;
                            sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$2$1.L$1 = null;
                            sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$2$1.L$2 = null;
                            sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$2$1.L$3 = null;
                            sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                            if (vprVar.emit(obj, sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
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
        sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$2$1 = new SdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdcResetZoneModeListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
