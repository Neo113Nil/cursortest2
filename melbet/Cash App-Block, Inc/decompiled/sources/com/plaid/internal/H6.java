package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0095a6;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class H6 implements G6 {
    public final N6 a;
    public final CoroutineScope b;
    public final ConcurrentLinkedQueue<I6> c;
    public volatile L6 d;
    public final AtomicBoolean e;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[L6.values().length];
            try {
                iArr[L6.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[L6.ERRORS_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[L6.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.remotelog.RemoteLogControllerImpl$maybeFlushEvents$1", f = "RemoteLogControllerImpl.kt", l = {110}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ L6 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L6 l6, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = l6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return H6.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return H6.this.new b(this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ConcurrentLinkedQueue<I6> concurrentLinkedQueue;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            try {
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    H6 h6 = H6.this;
                    L6 l6 = this.c;
                    this.a = 1;
                    if (h6.a(l6, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (!concurrentLinkedQueue.isEmpty()) {
                    H6.this.a();
                }
                return Unit.INSTANCE;
            } finally {
                H6.this.e.set(false);
                if (!H6.this.c.isEmpty()) {
                    H6.this.a();
                }
            }
        }
    }

    public H6(N6 n6) {
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        ContextScope CoroutineScope = JobKt.CoroutineScope(DefaultIoScheduler.INSTANCE.plus(JobKt.SupervisorJob$default()));
        n6.getClass();
        this.a = n6;
        this.b = CoroutineScope;
        this.c = new ConcurrentLinkedQueue<>();
        this.e = new AtomicBoolean(false);
    }

    public final Object a(L6 l6, b bVar) {
        int i;
        ArrayList arrayList = new ArrayList();
        while (!this.c.isEmpty()) {
            I6 poll = this.c.poll();
            if (poll != null && (i = a.a[l6.ordinal()]) != 1) {
                if (i != 2) {
                    if (i != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                } else if (poll.d == J6.ERROR) {
                }
                arrayList.add(poll);
            }
        }
        if (arrayList.isEmpty()) {
            return Unit.INSTANCE;
        }
        C0095a6.a.a(C0095a6.a, "Flushing " + arrayList.size() + " remote log events");
        Object a2 = this.a.a(arrayList, bVar);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : Unit.INSTANCE;
    }

    @Override // com.plaid.internal.G6
    public final void clear() {
        this.c.clear();
        this.d = null;
        this.e.set(false);
        N6 n6 = this.a;
        n6.e = null;
        n6.f = null;
        n6.g = null;
        C0095a6.a.getClass();
        C0095a6.a.a("RemoteLogSender: session data cleared", true);
        C0095a6.a.a("Remote log controller cleared", true);
    }

    public final void a(I6 i6) {
        i6.getClass();
        this.c.offer(i6);
        C0095a6.a.a(C0095a6.a, "Remote log event queued: " + i6.a() + ", queue size: " + this.c.size());
        a();
    }

    public final void a(L6 l6) {
        l6.getClass();
        if (this.d != l6) {
            C0095a6.a.e(C0095a6.a, "Log level threshold is being changed from " + this.d + " to " + l6);
        }
        this.d = l6;
        C0095a6.a.a(C0095a6.a, "Remote log level threshold set: " + l6);
        a();
    }

    public final void a(String str, String str2) {
        this.a.a(str, str2);
    }

    public final void a() {
        L6 l6 = this.d;
        if (this.a.e == null || l6 == null || this.c.isEmpty() || !this.e.compareAndSet(false, true)) {
            return;
        }
        JobKt.launch$default(this.b, null, null, new b(l6, null), 3);
    }

    @Override // com.plaid.internal.G6
    public final void a(String str, Map<String, String> map, J6 j6) {
        str.getClass();
        map.getClass();
        j6.getClass();
        a(new I6(str, map, j6));
    }
}
