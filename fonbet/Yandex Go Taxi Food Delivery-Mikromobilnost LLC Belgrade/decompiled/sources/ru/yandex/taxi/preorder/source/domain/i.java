package ru.yandex.taxi.preorder.source.domain;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.s6k0;
import defpackage.tmp0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ s6k0 b;

    public i(vpr vprVar, s6k0 s6k0Var) {
        this.a = vprVar;
        this.b = s6k0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$2$1 sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof SdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$2$1) {
            sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$2$1 = (SdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$2$1) continuation;
            int i2 = sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    tmp0 tmp0Var = (tmp0) this.b.c;
                    pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) tmp0Var.a).m();
                    if (m != null && jl40.l(m.b, tmp0Var.b.a)) {
                        sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$2$1.L$0 = null;
                        sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$2$1.L$1 = null;
                        sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$2$1.L$2 = null;
                        sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$2$1.L$3 = null;
                        sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$2$1.label = 1;
                        if (vprVar.emit(obj, sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$2$1 = new SdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
