package ru.yandex.taxi.am;

import defpackage.mth;
import defpackage.ny61;
import defpackage.pux;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class a0 implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ pux b;

    public a0(mth mthVar, pux puxVar) {
        this.a = mthVar;
        this.b = puxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        LaunchAuthorizationHandler$special$$inlined$filter$1$1 launchAuthorizationHandler$special$$inlined$filter$1$1;
        int i;
        if (continuation instanceof LaunchAuthorizationHandler$special$$inlined$filter$1$1) {
            launchAuthorizationHandler$special$$inlined$filter$1$1 = (LaunchAuthorizationHandler$special$$inlined$filter$1$1) continuation;
            int i2 = launchAuthorizationHandler$special$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                launchAuthorizationHandler$special$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = launchAuthorizationHandler$special$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = launchAuthorizationHandler$special$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    z zVar = new z(vprVar, this.b);
                    launchAuthorizationHandler$special$$inlined$filter$1$1.L$0 = null;
                    launchAuthorizationHandler$special$$inlined$filter$1$1.L$1 = null;
                    launchAuthorizationHandler$special$$inlined$filter$1$1.L$2 = null;
                    launchAuthorizationHandler$special$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(zVar, launchAuthorizationHandler$special$$inlined$filter$1$1) == coroutineSingletons) {
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
        launchAuthorizationHandler$special$$inlined$filter$1$1 = new LaunchAuthorizationHandler$special$$inlined$filter$1$1(this, continuation);
        Object obj2 = launchAuthorizationHandler$special$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = launchAuthorizationHandler$special$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
