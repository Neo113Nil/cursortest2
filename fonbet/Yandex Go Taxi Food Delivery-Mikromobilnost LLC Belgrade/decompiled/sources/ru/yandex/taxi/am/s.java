package ru.yandex.taxi.am;

import defpackage.hge0;
import defpackage.ny61;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class s {
    public final Set a;

    public s(Set set) {
        this.a = set;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AutoLoginDelayInteractorImpl$awaitAutoLoginReady$1 autoLoginDelayInteractorImpl$awaitAutoLoginReady$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof AutoLoginDelayInteractorImpl$awaitAutoLoginReady$1) {
            autoLoginDelayInteractorImpl$awaitAutoLoginReady$1 = (AutoLoginDelayInteractorImpl$awaitAutoLoginReady$1) continuationImpl;
            int i2 = autoLoginDelayInteractorImpl$awaitAutoLoginReady$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoLoginDelayInteractorImpl$awaitAutoLoginReady$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoLoginDelayInteractorImpl$awaitAutoLoginReady$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoLoginDelayInteractorImpl$awaitAutoLoginReady$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = this.a.iterator();
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) autoLoginDelayInteractorImpl$awaitAutoLoginReady$1.L$1;
                    kotlin.b.b(obj);
                }
                while (it.hasNext()) {
                    hge0 hge0Var = (hge0) it.next();
                    autoLoginDelayInteractorImpl$awaitAutoLoginReady$1.L$0 = null;
                    autoLoginDelayInteractorImpl$awaitAutoLoginReady$1.L$1 = it;
                    autoLoginDelayInteractorImpl$awaitAutoLoginReady$1.L$2 = null;
                    autoLoginDelayInteractorImpl$awaitAutoLoginReady$1.L$3 = null;
                    autoLoginDelayInteractorImpl$awaitAutoLoginReady$1.label = 1;
                    if (hge0Var.a(autoLoginDelayInteractorImpl$awaitAutoLoginReady$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
        }
        autoLoginDelayInteractorImpl$awaitAutoLoginReady$1 = new AutoLoginDelayInteractorImpl$awaitAutoLoginReady$1(this, continuationImpl);
        Object obj2 = autoLoginDelayInteractorImpl$awaitAutoLoginReady$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoLoginDelayInteractorImpl$awaitAutoLoginReady$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11.a;
    }
}
