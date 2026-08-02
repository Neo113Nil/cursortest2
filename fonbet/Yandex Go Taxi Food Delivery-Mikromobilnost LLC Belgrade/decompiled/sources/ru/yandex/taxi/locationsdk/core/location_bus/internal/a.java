package ru.yandex.taxi.locationsdk.core.location_bus.internal;

import defpackage.ffx;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.k7z;
import defpackage.ny61;
import defpackage.q6z;
import defpackage.qke;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;

/* loaded from: classes9.dex */
public final class a {
    public final TimestampSelector a;
    public final kotlinx.coroutines.sync.a b = gtq0.a();
    public final ReentrantLock c = new ReentrantLock();
    public final LinkedHashMap d = new LinkedHashMap();
    public final n0 e = ffx.c(0, 0, null, 7);

    public a(TimestampSelector timestampSelector) {
        this.a = timestampSelector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v5, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v0, types: [ru.yandex.taxi.locationsdk.core.location_bus.internal.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(k7z k7zVar, boolean z, Continuation continuation) {
        MutableLocationBusImpl$acceptLocation$1 mutableLocationBusImpl$acceptLocation$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        boolean z2;
        int i2;
        g050 g050Var;
        try {
            if (continuation instanceof MutableLocationBusImpl$acceptLocation$1) {
                mutableLocationBusImpl$acceptLocation$1 = (MutableLocationBusImpl$acceptLocation$1) continuation;
                int i3 = mutableLocationBusImpl$acceptLocation$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    mutableLocationBusImpl$acceptLocation$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = mutableLocationBusImpl$acceptLocation$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mutableLocationBusImpl$acceptLocation$1.label;
                    if (i != 0) {
                        b.b(obj);
                        mutableLocationBusImpl$acceptLocation$1.L$0 = k7zVar;
                        aVar = this.b;
                        mutableLocationBusImpl$acceptLocation$1.L$1 = aVar;
                        mutableLocationBusImpl$acceptLocation$1.Z$0 = z;
                        mutableLocationBusImpl$acceptLocation$1.I$0 = 0;
                        mutableLocationBusImpl$acceptLocation$1.label = 1;
                        if (aVar.a(mutableLocationBusImpl$acceptLocation$1) != coroutineSingletons) {
                            z2 = z;
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) mutableLocationBusImpl$acceptLocation$1.L$1;
                        try {
                            b.b(obj);
                            zy11 zy11Var = zy11.a;
                            g050Var.d(null);
                            return zy11Var;
                        } catch (Throwable th) {
                            th = th;
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    int i4 = mutableLocationBusImpl$acceptLocation$1.I$0;
                    boolean z3 = mutableLocationBusImpl$acceptLocation$1.Z$0;
                    ?? r2 = (g050) mutableLocationBusImpl$acceptLocation$1.L$1;
                    k7z k7zVar2 = (k7z) mutableLocationBusImpl$acceptLocation$1.L$0;
                    b.b(obj);
                    aVar = r2;
                    z2 = z3;
                    i2 = i4;
                    k7zVar = k7zVar2;
                    mutableLocationBusImpl$acceptLocation$1.L$0 = null;
                    mutableLocationBusImpl$acceptLocation$1.L$1 = aVar;
                    mutableLocationBusImpl$acceptLocation$1.Z$0 = z2;
                    mutableLocationBusImpl$acceptLocation$1.I$0 = i2;
                    mutableLocationBusImpl$acceptLocation$1.I$1 = 0;
                    mutableLocationBusImpl$acceptLocation$1.label = 2;
                    if (b(k7zVar, z2, mutableLocationBusImpl$acceptLocation$1) != coroutineSingletons) {
                        g050Var = aVar;
                        zy11 zy11Var2 = zy11.a;
                        g050Var.d(null);
                        return zy11Var2;
                    }
                    return coroutineSingletons;
                }
            }
            mutableLocationBusImpl$acceptLocation$1.L$0 = null;
            mutableLocationBusImpl$acceptLocation$1.L$1 = aVar;
            mutableLocationBusImpl$acceptLocation$1.Z$0 = z2;
            mutableLocationBusImpl$acceptLocation$1.I$0 = i2;
            mutableLocationBusImpl$acceptLocation$1.I$1 = 0;
            mutableLocationBusImpl$acceptLocation$1.label = 2;
            if (b(k7zVar, z2, mutableLocationBusImpl$acceptLocation$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            g050Var = aVar;
            g050Var.d(null);
            throw th;
        }
        mutableLocationBusImpl$acceptLocation$1 = new MutableLocationBusImpl$acceptLocation$1(this, continuation);
        Object obj2 = mutableLocationBusImpl$acceptLocation$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mutableLocationBusImpl$acceptLocation$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (defpackage.vez0.P(r3.a, r5, r4) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(k7z k7zVar, boolean z, Continuation continuation) {
        LinkedHashMap linkedHashMap = this.d;
        ReentrantLock reentrantLock = this.c;
        if (z) {
            reentrantLock.lock();
            try {
                k7z k7zVar2 = (k7z) linkedHashMap.get(new q6z(qke.q(k7zVar)));
                reentrantLock.unlock();
            } finally {
            }
        }
        reentrantLock.lock();
        try {
            linkedHashMap.put(new q6z(qke.q(k7zVar)), k7zVar);
            reentrantLock.unlock();
            Object emit = this.e.emit(k7zVar, continuation);
            if (emit == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return emit;
            }
            return zy11.a;
        } finally {
        }
    }

    public final Map c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            return kotlin.collections.b.t(this.d);
        } finally {
            reentrantLock.unlock();
        }
    }
}
