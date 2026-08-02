package ru.yandex.taxi.personalstate.domain.interactor;

import defpackage.j7b0;
import defpackage.k6b0;
import defpackage.ny61;
import defpackage.p6b0;
import defpackage.s6b0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.personalstate.domain.o;

/* loaded from: classes9.dex */
public final class f {
    public final o a;
    public final ru.yandex.taxi.personalstate.data.local.a b;
    public final k6b0 c;

    public f(o oVar, ru.yandex.taxi.personalstate.data.local.a aVar, k6b0 k6b0Var) {
        this.a = oVar;
        this.b = aVar;
        this.c = k6b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LastPersonalStateInteractor$getLastPersonalStateData$1 lastPersonalStateInteractor$getLastPersonalStateData$1;
        int i;
        try {
            if (continuationImpl instanceof LastPersonalStateInteractor$getLastPersonalStateData$1) {
                lastPersonalStateInteractor$getLastPersonalStateData$1 = (LastPersonalStateInteractor$getLastPersonalStateData$1) continuationImpl;
                int i2 = lastPersonalStateInteractor$getLastPersonalStateData$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lastPersonalStateInteractor$getLastPersonalStateData$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lastPersonalStateInteractor$getLastPersonalStateData$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lastPersonalStateInteractor$getLastPersonalStateData$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        s6b0 s6b0Var = (s6b0) this.a.x.getValue();
                        if (s6b0Var instanceof p6b0) {
                            return ((p6b0) s6b0Var).b;
                        }
                        ru.yandex.taxi.personalstate.data.local.a aVar = this.b;
                        lastPersonalStateInteractor$getLastPersonalStateData$1.L$0 = null;
                        lastPersonalStateInteractor$getLastPersonalStateData$1.label = 1;
                        obj = aVar.b(lastPersonalStateInteractor$getLastPersonalStateData$1);
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
                    this.c.getClass();
                    return k6b0.a(null, (j7b0) obj);
                }
            }
            if (i != 0) {
            }
            this.c.getClass();
            return k6b0.a(null, (j7b0) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
        lastPersonalStateInteractor$getLastPersonalStateData$1 = new LastPersonalStateInteractor$getLastPersonalStateData$1(this, continuationImpl);
        Object obj2 = lastPersonalStateInteractor$getLastPersonalStateData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lastPersonalStateInteractor$getLastPersonalStateData$1.label;
    }
}
