package ru.yandex.taxi.settings.profile;

import defpackage.ms21;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public d(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UserProfileToggledContentInteractor$special$$inlined$map$1$2$1 userProfileToggledContentInteractor$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof UserProfileToggledContentInteractor$special$$inlined$map$1$2$1) {
            userProfileToggledContentInteractor$special$$inlined$map$1$2$1 = (UserProfileToggledContentInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = userProfileToggledContentInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userProfileToggledContentInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = userProfileToggledContentInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userProfileToggledContentInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ms21 ms21Var = (ms21) obj;
                    this.b.getClass();
                    Boolean valueOf = Boolean.valueOf(!ms21Var.b || ms21Var.c);
                    userProfileToggledContentInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    userProfileToggledContentInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    userProfileToggledContentInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    userProfileToggledContentInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    userProfileToggledContentInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, userProfileToggledContentInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        userProfileToggledContentInteractor$special$$inlined$map$1$2$1 = new UserProfileToggledContentInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = userProfileToggledContentInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userProfileToggledContentInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
