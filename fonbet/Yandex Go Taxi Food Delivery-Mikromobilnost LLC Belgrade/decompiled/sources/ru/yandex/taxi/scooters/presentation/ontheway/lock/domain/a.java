package ru.yandex.taxi.scooters.presentation.ontheway.lock.domain;

import defpackage.e8x;
import defpackage.kgx;
import defpackage.ny61;
import defpackage.qdx;
import defpackage.qwo0;
import defpackage.ukn0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.experiments.g0;

/* loaded from: classes6.dex */
public final class a {
    public final qwo0 a;
    public final ukn0 b;

    public a(qwo0 qwo0Var, ukn0 ukn0Var) {
        this.a = qwo0Var;
        this.b = ukn0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (((java.lang.System.currentTimeMillis() / 86400000) - (((java.lang.Number) r6.f.getValue(r6, r1[4])).longValue() / 86400000)) >= 1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersLockInstructionInteractor$needShowInstruction$1 scootersLockInstructionInteractor$needShowInstruction$1;
        int i;
        e8x e8xVar;
        if (continuationImpl instanceof ScootersLockInstructionInteractor$needShowInstruction$1) {
            scootersLockInstructionInteractor$needShowInstruction$1 = (ScootersLockInstructionInteractor$needShowInstruction$1) continuationImpl;
            int i2 = scootersLockInstructionInteractor$needShowInstruction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersLockInstructionInteractor$needShowInstruction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersLockInstructionInteractor$needShowInstruction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersLockInstructionInteractor$needShowInstruction$1.label;
                boolean z = true;
                if (i != 0) {
                    b.b(obj);
                    scootersLockInstructionInteractor$needShowInstruction$1.label = 1;
                    obj = this.b.a.b(scootersLockInstructionInteractor$needShowInstruction$1);
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
                e8xVar = ((g0) obj).j;
                if (e8xVar.a) {
                    return Boolean.FALSE;
                }
                qwo0 qwo0Var = this.a;
                qdx qdxVar = qwo0Var.e;
                kgx[] kgxVarArr = qwo0.B;
                if (((Number) qdxVar.getValue(qwo0Var, kgxVarArr[3])).intValue() < e8xVar.c) {
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        scootersLockInstructionInteractor$needShowInstruction$1 = new ScootersLockInstructionInteractor$needShowInstruction$1(this, continuationImpl);
        Object obj2 = scootersLockInstructionInteractor$needShowInstruction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersLockInstructionInteractor$needShowInstruction$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        e8xVar = ((g0) obj2).j;
        if (e8xVar.a) {
        }
    }
}
