package ru.yandex.taxi.personalstate.domain;

import defpackage.ny61;
import defpackage.q6b0;
import defpackage.s6b0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PersonalStateProvider$firstLoadedOrErrorPersonalStateFlow$$inlined$filter$1$2$1 personalStateProvider$firstLoadedOrErrorPersonalStateFlow$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof PersonalStateProvider$firstLoadedOrErrorPersonalStateFlow$$inlined$filter$1$2$1) {
            personalStateProvider$firstLoadedOrErrorPersonalStateFlow$$inlined$filter$1$2$1 = (PersonalStateProvider$firstLoadedOrErrorPersonalStateFlow$$inlined$filter$1$2$1) continuation;
            int i2 = personalStateProvider$firstLoadedOrErrorPersonalStateFlow$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                personalStateProvider$firstLoadedOrErrorPersonalStateFlow$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = personalStateProvider$firstLoadedOrErrorPersonalStateFlow$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = personalStateProvider$firstLoadedOrErrorPersonalStateFlow$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!(((s6b0) obj) instanceof q6b0)) {
                        personalStateProvider$firstLoadedOrErrorPersonalStateFlow$$inlined$filter$1$2$1.L$0 = null;
                        personalStateProvider$firstLoadedOrErrorPersonalStateFlow$$inlined$filter$1$2$1.L$1 = null;
                        personalStateProvider$firstLoadedOrErrorPersonalStateFlow$$inlined$filter$1$2$1.L$2 = null;
                        personalStateProvider$firstLoadedOrErrorPersonalStateFlow$$inlined$filter$1$2$1.L$3 = null;
                        personalStateProvider$firstLoadedOrErrorPersonalStateFlow$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, personalStateProvider$firstLoadedOrErrorPersonalStateFlow$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        personalStateProvider$firstLoadedOrErrorPersonalStateFlow$$inlined$filter$1$2$1 = new PersonalStateProvider$firstLoadedOrErrorPersonalStateFlow$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = personalStateProvider$firstLoadedOrErrorPersonalStateFlow$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalStateProvider$firstLoadedOrErrorPersonalStateFlow$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
