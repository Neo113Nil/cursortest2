package ru.yandex.taxi.layers.domain;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.nd61;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class x implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ z b;

    public x(vpr vprVar, z zVar) {
        this.a = vprVar;
        this.b = zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ZoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$2$1 zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof ZoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$2$1) {
            zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$2$1 = (ZoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
            int i2 = zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Screen screen = (Screen) ((Triple) obj).getSecond();
                    this.b.getClass();
                    switch (nd61.a[screen.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$2$1.L$0 = null;
                            zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$2$1.L$1 = null;
                            zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$2$1.L$2 = null;
                            zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$2$1.L$3 = null;
                            zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                            if (this.a.emit(obj, zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            break;
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
        zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$2$1 = new ZoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
