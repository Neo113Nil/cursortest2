package ru.yandex.taxi.security;

import defpackage.d701;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes10.dex */
public final class c {
    public final d701 a;
    public final t1b0 b;

    public c(rqo rqoVar, d701 d701Var) {
        this.a = d701Var;
        this.b = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.USE_USER_CONFIG_REQUEST);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UserConfigRepositoryFactory$repositoryOrNull$1 userConfigRepositoryFactory$repositoryOrNull$1;
        Object obj;
        int i;
        if (continuationImpl instanceof UserConfigRepositoryFactory$repositoryOrNull$1) {
            userConfigRepositoryFactory$repositoryOrNull$1 = (UserConfigRepositoryFactory$repositoryOrNull$1) continuationImpl;
            int i2 = userConfigRepositoryFactory$repositoryOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userConfigRepositoryFactory$repositoryOrNull$1.label = i2 - Integer.MIN_VALUE;
                obj = userConfigRepositoryFactory$repositoryOrNull$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userConfigRepositoryFactory$repositoryOrNull$1.label;
                if (i != 0) {
                    b.b(obj);
                    userConfigRepositoryFactory$repositoryOrNull$1.label = 1;
                    obj = this.b.b(userConfigRepositoryFactory$repositoryOrNull$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                return (UserConfigRepository) this.a.get();
            }
        }
        userConfigRepositoryFactory$repositoryOrNull$1 = new UserConfigRepositoryFactory$repositoryOrNull$1(this, continuationImpl);
        obj = userConfigRepositoryFactory$repositoryOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userConfigRepositoryFactory$repositoryOrNull$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
