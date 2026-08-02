package ru.yandex.taxi.locationsdk.core.processor_controller.internal;

import com.yandex.go.config.h;
import defpackage.ffx;
import defpackage.fyc;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.gwk0;
import defpackage.ha2;
import defpackage.jqr;
import defpackage.k7z;
import defpackage.kjz;
import defpackage.ly80;
import defpackage.ny61;
import defpackage.rcz;
import defpackage.s6f0;
import defpackage.t6f0;
import defpackage.vms;
import defpackage.wbz;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;

/* loaded from: classes9.dex */
public final class d implements ly80 {
    public final t6f0 a;
    public final kjz b;
    public final vms c;
    public final ru.yandex.taxi.locationsdk.core.location_bus.internal.a d;
    public final ru.yandex.taxi.locationsdk.core.input_controller.internal.b e;
    public final TimestampSelector f;
    public final rcz g;
    public final s6f0 h;
    public volatile /* synthetic */ Pair i = null;
    public final fyc j = gwk0.b();
    public final n0 k = ffx.c(0, 0, null, 7);
    public volatile /* synthetic */ k7z l = null;
    public final kotlinx.coroutines.sync.a m = gtq0.a();

    public d(t6f0 t6f0Var, kjz kjzVar, vms vmsVar, ru.yandex.taxi.locationsdk.core.location_bus.internal.a aVar, ru.yandex.taxi.locationsdk.core.input_controller.internal.b bVar, TimestampSelector timestampSelector, rcz rczVar, s6f0 s6f0Var) {
        this.a = t6f0Var;
        this.b = kjzVar;
        this.c = vmsVar;
        this.d = aVar;
        this.e = bVar;
        this.f = timestampSelector;
        this.g = rczVar;
        this.h = s6f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c8, code lost:
    
        if (r9.emit(r10, r0) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008a, code lost:
    
        if (defpackage.vez0.P(r9.f, r9.l, r10) == false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a A[Catch: all -> 0x00b4, TryCatch #2 {all -> 0x00b4, blocks: (B:28:0x00b6, B:41:0x007c, B:43:0x0094, B:45:0x009a), top: B:40:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v12, types: [g050] */
    /* JADX WARN: Type inference failed for: r2v9, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(k7z k7zVar, Continuation continuation) {
        ProcessorControllerImpl$acceptOutputLocation$1 processorControllerImpl$acceptOutputLocation$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        int i2;
        Throwable th;
        k7z k7zVar2;
        int i3;
        kotlinx.coroutines.sync.a aVar2;
        g050 g050Var;
        try {
            if (continuation instanceof ProcessorControllerImpl$acceptOutputLocation$1) {
                processorControllerImpl$acceptOutputLocation$1 = (ProcessorControllerImpl$acceptOutputLocation$1) continuation;
                int i4 = processorControllerImpl$acceptOutputLocation$1.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    processorControllerImpl$acceptOutputLocation$1.label = i4 - Integer.MIN_VALUE;
                    Object obj = processorControllerImpl$acceptOutputLocation$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = processorControllerImpl$acceptOutputLocation$1.label;
                    int i5 = 0;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = this.m;
                        processorControllerImpl$acceptOutputLocation$1.L$0 = k7zVar;
                        processorControllerImpl$acceptOutputLocation$1.L$1 = aVar;
                        processorControllerImpl$acceptOutputLocation$1.I$0 = 0;
                        processorControllerImpl$acceptOutputLocation$1.label = 1;
                        if (aVar.a(processorControllerImpl$acceptOutputLocation$1) != coroutineSingletons) {
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i == 1) {
                        int i6 = processorControllerImpl$acceptOutputLocation$1.I$0;
                        ?? r2 = (g050) processorControllerImpl$acceptOutputLocation$1.L$1;
                        k7z k7zVar3 = (k7z) processorControllerImpl$acceptOutputLocation$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r2;
                        i2 = i6;
                        k7zVar = k7zVar3;
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) processorControllerImpl$acceptOutputLocation$1.L$1;
                            try {
                                kotlin.b.b(obj);
                                zy11 zy11Var = zy11.a;
                                g050Var.d(null);
                                return zy11Var;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        i5 = processorControllerImpl$acceptOutputLocation$1.I$1;
                        i3 = processorControllerImpl$acceptOutputLocation$1.I$0;
                        ?? r22 = (g050) processorControllerImpl$acceptOutputLocation$1.L$1;
                        k7zVar2 = (k7z) processorControllerImpl$acceptOutputLocation$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            aVar2 = r22;
                            aVar = aVar2;
                            i2 = i3;
                            k7zVar = k7zVar2;
                            this.l = k7zVar;
                            n0 n0Var = this.k;
                            processorControllerImpl$acceptOutputLocation$1.L$0 = null;
                            processorControllerImpl$acceptOutputLocation$1.L$1 = aVar;
                            processorControllerImpl$acceptOutputLocation$1.I$0 = i2;
                            processorControllerImpl$acceptOutputLocation$1.I$1 = i5;
                            processorControllerImpl$acceptOutputLocation$1.label = 3;
                        } catch (Throwable th3) {
                            th = th3;
                            g050Var = r22;
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    if (this.h.b) {
                        try {
                        } catch (Throwable th4) {
                            th = th4;
                            g050Var = aVar;
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    if (this.h.a) {
                        ru.yandex.taxi.locationsdk.core.location_bus.internal.a aVar3 = this.d;
                        processorControllerImpl$acceptOutputLocation$1.L$0 = k7zVar;
                        processorControllerImpl$acceptOutputLocation$1.L$1 = aVar;
                        processorControllerImpl$acceptOutputLocation$1.I$0 = i2;
                        processorControllerImpl$acceptOutputLocation$1.I$1 = 0;
                        processorControllerImpl$acceptOutputLocation$1.label = 2;
                        if (aVar3.a(k7zVar, false, processorControllerImpl$acceptOutputLocation$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        k7zVar2 = k7zVar;
                        i3 = i2;
                        aVar2 = aVar;
                        aVar = aVar2;
                        i2 = i3;
                        k7zVar = k7zVar2;
                    }
                    this.l = k7zVar;
                    n0 n0Var2 = this.k;
                    processorControllerImpl$acceptOutputLocation$1.L$0 = null;
                    processorControllerImpl$acceptOutputLocation$1.L$1 = aVar;
                    processorControllerImpl$acceptOutputLocation$1.I$0 = i2;
                    processorControllerImpl$acceptOutputLocation$1.I$1 = i5;
                    processorControllerImpl$acceptOutputLocation$1.label = 3;
                }
            }
            if (this.h.b) {
            }
            if (this.h.a) {
            }
            this.l = k7zVar;
            n0 n0Var22 = this.k;
            processorControllerImpl$acceptOutputLocation$1.L$0 = null;
            processorControllerImpl$acceptOutputLocation$1.L$1 = aVar;
            processorControllerImpl$acceptOutputLocation$1.I$0 = i2;
            processorControllerImpl$acceptOutputLocation$1.I$1 = i5;
            processorControllerImpl$acceptOutputLocation$1.label = 3;
        } catch (Throwable th5) {
            th = th5;
        }
        processorControllerImpl$acceptOutputLocation$1 = new ProcessorControllerImpl$acceptOutputLocation$1(continuation, this);
        Object obj2 = processorControllerImpl$acceptOutputLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = processorControllerImpl$acceptOutputLocation$1.label;
        int i52 = 0;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (a(r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ProcessorControllerImpl$currentLocation$1 processorControllerImpl$currentLocation$1;
        int i;
        k7z k7zVar;
        if (continuationImpl instanceof ProcessorControllerImpl$currentLocation$1) {
            processorControllerImpl$currentLocation$1 = (ProcessorControllerImpl$currentLocation$1) continuationImpl;
            int i2 = processorControllerImpl$currentLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                processorControllerImpl$currentLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = processorControllerImpl$currentLocation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = processorControllerImpl$currentLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k7z k7zVar2 = this.l;
                    if (k7zVar2 != null) {
                        return k7zVar2;
                    }
                    processorControllerImpl$currentLocation$1.L$0 = null;
                    processorControllerImpl$currentLocation$1.label = 1;
                    obj = c(processorControllerImpl$currentLocation$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return this.l;
                    }
                    kotlin.b.b(obj);
                }
                k7zVar = (k7z) obj;
                if (k7zVar != null) {
                    processorControllerImpl$currentLocation$1.L$0 = null;
                    processorControllerImpl$currentLocation$1.L$1 = null;
                    processorControllerImpl$currentLocation$1.label = 2;
                }
                return this.l;
            }
        }
        processorControllerImpl$currentLocation$1 = new ProcessorControllerImpl$currentLocation$1(this, continuationImpl);
        Object obj3 = processorControllerImpl$currentLocation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = processorControllerImpl$currentLocation$1.label;
        if (i != 0) {
        }
        k7zVar = (k7z) obj3;
        if (k7zVar != null) {
        }
        return this.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ProcessorControllerImpl$getCurrentOutputLocation$1 processorControllerImpl$getCurrentOutputLocation$1;
        int i;
        Pair pair;
        if (continuationImpl instanceof ProcessorControllerImpl$getCurrentOutputLocation$1) {
            processorControllerImpl$getCurrentOutputLocation$1 = (ProcessorControllerImpl$getCurrentOutputLocation$1) continuationImpl;
            int i2 = processorControllerImpl$getCurrentOutputLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                processorControllerImpl$getCurrentOutputLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = processorControllerImpl$getCurrentOutputLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = processorControllerImpl$getCurrentOutputLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fyc fycVar = this.j;
                    processorControllerImpl$getCurrentOutputLocation$1.label = 1;
                    if (fycVar.s(processorControllerImpl$getCurrentOutputLocation$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                pair = this.i;
                if (pair != null) {
                    Object first = pair.getFirst();
                    k7z a = ((wbz) pair.getSecond()).a();
                    if (a != null) {
                        return this.c.f(a, first);
                    }
                }
                return null;
            }
        }
        processorControllerImpl$getCurrentOutputLocation$1 = new ProcessorControllerImpl$getCurrentOutputLocation$1(this, continuationImpl);
        Object obj2 = processorControllerImpl$getCurrentOutputLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = processorControllerImpl$getCurrentOutputLocation$1.label;
        if (i != 0) {
        }
        pair = this.i;
        if (pair != null) {
        }
        return null;
    }

    public final Object d(Continuation continuation) {
        int i = 3;
        Object j = kotlinx.coroutines.flow.e.j(ru.yandex.taxi.locationsdk.core.utils.a.a(new jqr(kotlinx.coroutines.flow.e.X(new k(new jqr(new ha2(15, kotlinx.coroutines.flow.e.t((h) this.a.b), this), new ProcessorControllerImpl$createOutputLocationFlow$1(null, this), i), new ProcessorControllerImpl$createOutputLocationFlow$2(null, this)), new ProcessorControllerImpl$createOutputLocationFlow$$inlined$flatMapLatest$1(null, this)), new ProcessorControllerImpl$start$2(2, this, d.class, "acceptOutputLocation", "acceptOutputLocation(Lru/yandex/taxi/locationsdk/core/location/TypedLocation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), i), this.g, "ProcessorControllerImpl/start"), continuation);
        return j == CoroutineSingletons.COROUTINE_SUSPENDED ? j : zy11.a;
    }
}
