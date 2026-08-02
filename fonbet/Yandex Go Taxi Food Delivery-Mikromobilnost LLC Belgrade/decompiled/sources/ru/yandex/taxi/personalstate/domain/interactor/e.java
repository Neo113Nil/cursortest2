package ru.yandex.taxi.personalstate.domain.interactor;

import com.yandex.go.zone.model.Zone;
import defpackage.e3n;
import defpackage.j6b0;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.personalstate.domain.o;

/* loaded from: classes9.dex */
public final class e {
    public final o a;
    public final f b;

    public e(o oVar, f fVar) {
        this.a = oVar;
        this.b = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Zone zone, ContinuationImpl continuationImpl) {
        AwaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$1 awaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$1;
        int i;
        j6b0 j6b0Var;
        if (continuationImpl instanceof AwaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$1) {
            awaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$1 = (AwaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$1) continuationImpl;
            int i2 = awaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                awaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$1.label = i2 - Integer.MIN_VALUE;
                Object obj = awaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = awaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o430 o430Var = e3n.b;
                    long V = kp50.V(5L, DurationUnit.SECONDS);
                    AwaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$2 awaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$2 = new AwaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$2(this, zone, null);
                    awaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$1.L$0 = null;
                    awaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$1.label = 1;
                    obj = kotlinx.coroutines.a.x(V, awaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$2, awaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                j6b0Var = (j6b0) obj;
                if (j6b0Var == null) {
                    return j6b0Var;
                }
                awaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$1.L$0 = null;
                awaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$1.label = 2;
                Object a = this.b.a(awaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        awaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$1 = new AwaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$1(this, continuationImpl);
        Object obj2 = awaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = awaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$1.label;
        if (i != 0) {
        }
        j6b0Var = (j6b0) obj2;
        if (j6b0Var == null) {
        }
    }
}
