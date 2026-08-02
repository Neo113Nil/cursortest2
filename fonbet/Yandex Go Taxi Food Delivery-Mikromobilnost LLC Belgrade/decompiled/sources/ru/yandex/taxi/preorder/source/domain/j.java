package ru.yandex.taxi.preorder.source.domain;

import defpackage.eci0;
import defpackage.ny61;
import defpackage.s6k0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class j implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ s6k0 b;

    public j(eci0 eci0Var, s6k0 s6k0Var) {
        this.a = eci0Var;
        this.b = s6k0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$1 sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$1;
        int i;
        if (continuation instanceof SdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$1) {
            sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$1 = (SdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$1) continuation;
            int i2 = sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i iVar = new i(vprVar, this.b);
                    sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$1.L$0 = null;
                    sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$1.L$1 = null;
                    sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$1.L$2 = null;
                    sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(iVar, sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$1) == coroutineSingletons) {
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
        sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$1 = new SdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$1(this, continuation);
        Object obj2 = sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
