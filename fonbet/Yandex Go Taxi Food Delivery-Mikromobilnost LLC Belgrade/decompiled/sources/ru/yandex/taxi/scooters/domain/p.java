package ru.yandex.taxi.scooters.domain;

import com.yandex.go.scooters.api.domain.model.ScootersSlowdown;
import defpackage.ny61;
import defpackage.zgz;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.scooters.data.a0;
import ru.yandex.taxi.scooters.data.u;
import ru.yandex.taxi.scooters.data.z;

/* loaded from: classes6.dex */
public final class p {
    public final z a;
    public final u b;
    public final a0 c;

    public p(z zVar, u uVar, a0 a0Var) {
        this.a = zVar;
        this.b = uVar;
        this.c = a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ScootersSlowdown.Reason reason, ContinuationImpl continuationImpl) {
        ScootersSlowdownInteractor$cancelSlowdown$1 scootersSlowdownInteractor$cancelSlowdown$1;
        int i;
        try {
            if (continuationImpl instanceof ScootersSlowdownInteractor$cancelSlowdown$1) {
                scootersSlowdownInteractor$cancelSlowdown$1 = (ScootersSlowdownInteractor$cancelSlowdown$1) continuationImpl;
                int i2 = scootersSlowdownInteractor$cancelSlowdown$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersSlowdownInteractor$cancelSlowdown$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersSlowdownInteractor$cancelSlowdown$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersSlowdownInteractor$cancelSlowdown$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        a0 a0Var = this.c;
                        scootersSlowdownInteractor$cancelSlowdown$1.L$0 = null;
                        scootersSlowdownInteractor$cancelSlowdown$1.L$1 = reason;
                        scootersSlowdownInteractor$cancelSlowdown$1.label = 1;
                        if (a0Var.a(str, reason, scootersSlowdownInteractor$cancelSlowdown$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        reason = (ScootersSlowdown.Reason) scootersSlowdownInteractor$cancelSlowdown$1.L$1;
                        kotlin.b.b(obj);
                    }
                    this.a.b(new ScootersSlowdown(reason, 1));
                    return Boolean.TRUE;
                }
            }
            if (i != 0) {
            }
            this.a.b(new ScootersSlowdown(reason, 1));
            return Boolean.TRUE;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            zgz.a(null, th);
            return Boolean.FALSE;
        }
        scootersSlowdownInteractor$cancelSlowdown$1 = new ScootersSlowdownInteractor$cancelSlowdown$1(this, continuationImpl);
        Object obj2 = scootersSlowdownInteractor$cancelSlowdown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSlowdownInteractor$cancelSlowdown$1.label;
    }

    public final m0 b() {
        return new m0(this.b.a(), this.a.e, new ScootersSlowdownInteractor$listenToSlowdownRidingTogetherCommunication$1(3, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ScootersSlowdown.Reason reason, int i, ContinuationImpl continuationImpl) {
        ScootersSlowdownInteractor$planSlowdown$1 scootersSlowdownInteractor$planSlowdown$1;
        int i2;
        try {
            if (continuationImpl instanceof ScootersSlowdownInteractor$planSlowdown$1) {
                scootersSlowdownInteractor$planSlowdown$1 = (ScootersSlowdownInteractor$planSlowdown$1) continuationImpl;
                int i3 = scootersSlowdownInteractor$planSlowdown$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    scootersSlowdownInteractor$planSlowdown$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = scootersSlowdownInteractor$planSlowdown$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = scootersSlowdownInteractor$planSlowdown$1.label;
                    if (i2 != 0) {
                        kotlin.b.b(obj);
                        a0 a0Var = this.c;
                        scootersSlowdownInteractor$planSlowdown$1.L$0 = null;
                        scootersSlowdownInteractor$planSlowdown$1.L$1 = reason;
                        scootersSlowdownInteractor$planSlowdown$1.I$0 = i;
                        scootersSlowdownInteractor$planSlowdown$1.label = 1;
                        if (a0Var.b(str, reason, i, scootersSlowdownInteractor$planSlowdown$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i = scootersSlowdownInteractor$planSlowdown$1.I$0;
                        reason = (ScootersSlowdown.Reason) scootersSlowdownInteractor$planSlowdown$1.L$1;
                        kotlin.b.b(obj);
                    }
                    this.a.a(new ScootersSlowdown(i, reason));
                    return Boolean.TRUE;
                }
            }
            if (i2 != 0) {
            }
            this.a.a(new ScootersSlowdown(i, reason));
            return Boolean.TRUE;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            zgz.a(null, th);
            return Boolean.FALSE;
        }
        scootersSlowdownInteractor$planSlowdown$1 = new ScootersSlowdownInteractor$planSlowdown$1(this, continuationImpl);
        Object obj2 = scootersSlowdownInteractor$planSlowdown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = scootersSlowdownInteractor$planSlowdown$1.label;
    }
}
