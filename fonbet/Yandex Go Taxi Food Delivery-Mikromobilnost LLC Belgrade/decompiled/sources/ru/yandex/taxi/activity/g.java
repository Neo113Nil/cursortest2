package ru.yandex.taxi.activity;

import defpackage.ffx;
import defpackage.ny61;
import defpackage.z30;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class g {
    public final AtomicReference a = new AtomicReference();
    public final n0 b;
    public final AtomicReference c;
    public final n0 d;

    public g() {
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.b = ffx.b(0, 1, bufferOverflow);
        this.c = new AtomicReference();
        this.d = ffx.b(0, 1, bufferOverflow);
    }

    public final f a(int i) {
        return new f(this.b, i);
    }

    public final z30 b(int i) {
        AtomicReference atomicReference = this.c;
        z30 z30Var = (z30) atomicReference.get();
        if (z30Var == null || z30Var.a() != i) {
            return null;
        }
        return (z30) atomicReference.getAndSet(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, ContinuationImpl continuationImpl) {
        ActivityResultHandler$waitForContractResult$1 activityResultHandler$waitForContractResult$1;
        Object obj;
        int i2;
        if (continuationImpl instanceof ActivityResultHandler$waitForContractResult$1) {
            activityResultHandler$waitForContractResult$1 = (ActivityResultHandler$waitForContractResult$1) continuationImpl;
            int i3 = activityResultHandler$waitForContractResult$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                activityResultHandler$waitForContractResult$1.label = i3 - Integer.MIN_VALUE;
                obj = activityResultHandler$waitForContractResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = activityResultHandler$waitForContractResult$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    ActivityResultHandler$waitForContractResult$2 activityResultHandler$waitForContractResult$2 = new ActivityResultHandler$waitForContractResult$2(i, null);
                    activityResultHandler$waitForContractResult$1.I$0 = i;
                    activityResultHandler$waitForContractResult$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.x(this.d, activityResultHandler$waitForContractResult$2, activityResultHandler$waitForContractResult$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (obj instanceof z30) {
                    return null;
                }
                return (z30) obj;
            }
        }
        activityResultHandler$waitForContractResult$1 = new ActivityResultHandler$waitForContractResult$1(this, continuationImpl);
        obj = activityResultHandler$waitForContractResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = activityResultHandler$waitForContractResult$1.label;
        if (i2 != 0) {
        }
        if (obj instanceof z30) {
        }
    }

    public final Object d(int i, ContinuationImpl continuationImpl) {
        return kotlinx.coroutines.flow.e.x(this.b, new ActivityResultHandler$waitForResult$2(i, null), continuationImpl);
    }
}
