package ru.yandex.taxi.jobs.push;

import defpackage.evu0;
import defpackage.jbh;
import defpackage.m0g0;
import defpackage.ny61;
import defpackage.osf0;
import defpackage.rqo;
import defpackage.tpr;
import defpackage.w511;
import defpackage.w8x;
import defpackage.x8x;
import defpackage.y8x;
import defpackage.z8x;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.experiments.q;
import ru.yandex.taxi.jobs.push.ToggleJobsExperiment;

/* loaded from: classes9.dex */
public final class j implements m0g0, osf0, q {
    public final /* synthetic */ q a;

    public j(rqo rqoVar) {
        ToggleJobsExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(ToggleJobsExperiment.f);
    }

    public static z8x h(ToggleJobsExperiment.a aVar) {
        int i = e.a[aVar.a.ordinal()];
        if (i == 1) {
            return w8x.a;
        }
        if (i != 2) {
            if (i == 3) {
                return new x8x(aVar.b, aVar.c, aVar.d, aVar.e);
            }
            if (i != 4) {
                w511.b();
                return null;
            }
        }
        return y8x.a;
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (ToggleJobsExperiment) this.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ToggleJobsExperimentRepositoryImpl$getPushAckState$1 toggleJobsExperimentRepositoryImpl$getPushAckState$1;
        int i;
        if (continuationImpl instanceof ToggleJobsExperimentRepositoryImpl$getPushAckState$1) {
            toggleJobsExperimentRepositoryImpl$getPushAckState$1 = (ToggleJobsExperimentRepositoryImpl$getPushAckState$1) continuationImpl;
            int i2 = toggleJobsExperimentRepositoryImpl$getPushAckState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                toggleJobsExperimentRepositoryImpl$getPushAckState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = toggleJobsExperimentRepositoryImpl$getPushAckState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = toggleJobsExperimentRepositoryImpl$getPushAckState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    toggleJobsExperimentRepositoryImpl$getPushAckState$1.L$0 = this;
                    toggleJobsExperimentRepositoryImpl$getPushAckState$1.label = 1;
                    obj = this.a.b(toggleJobsExperimentRepositoryImpl$getPushAckState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (j) toggleJobsExperimentRepositoryImpl$getPushAckState$1.L$0;
                    kotlin.b.b(obj);
                }
                ToggleJobsExperiment.a aVar = ((ToggleJobsExperiment) obj).c;
                this.getClass();
                return h(aVar);
            }
        }
        toggleJobsExperimentRepositoryImpl$getPushAckState$1 = new ToggleJobsExperimentRepositoryImpl$getPushAckState$1(this, continuationImpl);
        Object obj2 = toggleJobsExperimentRepositoryImpl$getPushAckState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = toggleJobsExperimentRepositoryImpl$getPushAckState$1.label;
        if (i != 0) {
        }
        ToggleJobsExperiment.a aVar2 = ((ToggleJobsExperiment) obj2).c;
        this.getClass();
        return h(aVar2);
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        ToggleJobsExperimentRepositoryImpl$pruneJobsToken$1 toggleJobsExperimentRepositoryImpl$pruneJobsToken$1;
        int i;
        if (continuationImpl instanceof ToggleJobsExperimentRepositoryImpl$pruneJobsToken$1) {
            toggleJobsExperimentRepositoryImpl$pruneJobsToken$1 = (ToggleJobsExperimentRepositoryImpl$pruneJobsToken$1) continuationImpl;
            int i2 = toggleJobsExperimentRepositoryImpl$pruneJobsToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                toggleJobsExperimentRepositoryImpl$pruneJobsToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = toggleJobsExperimentRepositoryImpl$pruneJobsToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = toggleJobsExperimentRepositoryImpl$pruneJobsToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    toggleJobsExperimentRepositoryImpl$pruneJobsToken$1.label = 1;
                    obj = this.a.b(toggleJobsExperimentRepositoryImpl$pruneJobsToken$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                String str = ((ToggleJobsExperiment) obj).e;
                return (str == null || evu0.J(str)) ? "" : str;
            }
        }
        toggleJobsExperimentRepositoryImpl$pruneJobsToken$1 = new ToggleJobsExperimentRepositoryImpl$pruneJobsToken$1(this, continuationImpl);
        Object obj2 = toggleJobsExperimentRepositoryImpl$pruneJobsToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = toggleJobsExperimentRepositoryImpl$pruneJobsToken$1.label;
        if (i != 0) {
        }
        String str2 = ((ToggleJobsExperiment) obj2).e;
        if (str2 == null) {
            return "";
        }
    }
}
