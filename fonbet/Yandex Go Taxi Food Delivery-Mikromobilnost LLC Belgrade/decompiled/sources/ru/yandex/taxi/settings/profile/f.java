package ru.yandex.taxi.settings.profile;

import defpackage.i3y;
import defpackage.ms21;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.tt2;
import defpackage.xn3;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes6.dex */
public final class f {
    public final tt2 a;
    public final i3y b;

    public f(tt2 tt2Var, rqo rqoVar) {
        this.a = tt2Var;
        this.b = kotlin.a.b(LazyThreadSafetyMode.NONE, new xn3(rqoVar, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UserProfileToggledContentInteractor$isAddingEmailEnabled$1 userProfileToggledContentInteractor$isAddingEmailEnabled$1;
        int i;
        boolean z;
        ms21 ms21Var;
        if (continuationImpl instanceof UserProfileToggledContentInteractor$isAddingEmailEnabled$1) {
            userProfileToggledContentInteractor$isAddingEmailEnabled$1 = (UserProfileToggledContentInteractor$isAddingEmailEnabled$1) continuationImpl;
            int i2 = userProfileToggledContentInteractor$isAddingEmailEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userProfileToggledContentInteractor$isAddingEmailEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userProfileToggledContentInteractor$isAddingEmailEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userProfileToggledContentInteractor$isAddingEmailEnabled$1.label;
                z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    q qVar = (q) this.b.getValue();
                    userProfileToggledContentInteractor$isAddingEmailEnabled$1.L$0 = this;
                    userProfileToggledContentInteractor$isAddingEmailEnabled$1.label = 1;
                    obj = qVar.b(userProfileToggledContentInteractor$isAddingEmailEnabled$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (f) userProfileToggledContentInteractor$isAddingEmailEnabled$1.L$0;
                    kotlin.b.b(obj);
                }
                ms21Var = (ms21) obj;
                this.getClass();
                if (ms21Var.b && !ms21Var.c) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        userProfileToggledContentInteractor$isAddingEmailEnabled$1 = new UserProfileToggledContentInteractor$isAddingEmailEnabled$1(this, continuationImpl);
        Object obj2 = userProfileToggledContentInteractor$isAddingEmailEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userProfileToggledContentInteractor$isAddingEmailEnabled$1.label;
        z = true;
        if (i != 0) {
        }
        ms21Var = (ms21) obj2;
        this.getClass();
        if (ms21Var.b) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
