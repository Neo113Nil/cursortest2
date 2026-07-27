package com.onesignal.common.threading;

import S7.AbstractC0402u;
import S7.AbstractC0406y;
import S7.F;
import S7.InterfaceC0404w;
import S7.S;
import S7.Y;
import S7.o0;
import a.AbstractC0422a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import u.AbstractC5049e;
import u7.InterfaceC5087e;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class b {
    public static final String BASE_THREAD_NAME = "OneSignal";
    private static final int DEFAULT_CORE_POOL_SIZE = 2;
    private static final int DEFAULT_MAX_POOL_SIZE = 3;
    private static final String DEFAULT_THREAD_NAME_PREFIX = "OneSignal-Default";
    private static final int IO_CORE_POOL_SIZE = 2;
    private static final int IO_MAX_POOL_SIZE = 3;
    private static final String IO_THREAD_NAME_PREFIX = "OneSignal-IO";
    private static final long KEEP_ALIVE_TIME_SECONDS = 30;
    private static final String NOT_INITIALIZED = "Not initialized";
    private static final int QUEUE_CAPACITY = 200;
    private static final String SERIAL_IO_THREAD_NAME = "OneSignal-SerialIO";
    private static final String UNKNOWN_ERROR = "Unknown error";
    private static volatile boolean prewarmStarted;
    public static final b INSTANCE = new b();
    private static final InterfaceC5087e ioExecutor$delegate = AbstractC0422a.q(o.INSTANCE);
    private static final InterfaceC5087e serialIOExecutor$delegate = AbstractC0422a.q(v.INSTANCE);
    private static final InterfaceC5087e defaultExecutor$delegate = AbstractC0422a.q(h.INSTANCE);
    private static final InterfaceC5087e IO$delegate = AbstractC0422a.q(c.INSTANCE);
    private static final InterfaceC5087e Default$delegate = AbstractC0422a.q(a.INSTANCE);
    private static final InterfaceC5087e SerialIO$delegate = AbstractC0422a.q(f.INSTANCE);
    private static final InterfaceC5087e IOScope$delegate = AbstractC0422a.q(d.INSTANCE);
    private static final InterfaceC5087e DefaultScope$delegate = AbstractC0422a.q(C0178b.INSTANCE);
    private static final InterfaceC5087e SerialIOScope$delegate = AbstractC0422a.q(g.INSTANCE);
    private static final Object prewarmLock = new Object();

    public static final class a extends kotlin.jvm.internal.i implements I7.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // I7.a
        public final AbstractC0402u invoke() {
            try {
                return new S(b.INSTANCE.getDefaultExecutor());
            } catch (Exception e9) {
                com.onesignal.debug.internal.logging.b.error$default("OneSignalDispatchers: Using fallback Dispatchers.Default dispatcher: " + e9.getMessage(), null, 2, null);
                return F.f2915a;
            }
        }
    }

    /* renamed from: com.onesignal.common.threading.b$b, reason: collision with other inner class name */
    public static final class C0178b extends kotlin.jvm.internal.i implements I7.a {
        public static final C0178b INSTANCE = new C0178b();

        public C0178b() {
            super(0);
        }

        @Override // I7.a
        public final InterfaceC0404w invoke() {
            return AbstractC0406y.b(A8.b.r(new o0(), b.INSTANCE.getDefault()));
        }
    }

    public static final class c extends kotlin.jvm.internal.i implements I7.a {
        public static final c INSTANCE = new c();

        public c() {
            super(0);
        }

        @Override // I7.a
        public final AbstractC0402u invoke() {
            try {
                return new S(b.INSTANCE.getIoExecutor());
            } catch (Exception e9) {
                com.onesignal.debug.internal.logging.b.error$default("OneSignalDispatchers: Using fallback Dispatchers.IO dispatcher: " + e9.getMessage(), null, 2, null);
                return F.f2917c;
            }
        }
    }

    public static final class d extends kotlin.jvm.internal.i implements I7.a {
        public static final d INSTANCE = new d();

        public d() {
            super(0);
        }

        @Override // I7.a
        public final InterfaceC0404w invoke() {
            return AbstractC0406y.b(A8.b.r(new o0(), b.INSTANCE.getIO()));
        }
    }

    public static final class f extends kotlin.jvm.internal.i implements I7.a {
        public static final f INSTANCE = new f();

        public f() {
            super(0);
        }

        @Override // I7.a
        public final AbstractC0402u invoke() {
            try {
                return new S(b.INSTANCE.getSerialIOExecutor());
            } catch (Exception e9) {
                com.onesignal.debug.internal.logging.b.error$default("OneSignalDispatchers: Using fallback serialized Dispatchers.IO: " + e9.getMessage(), null, 2, null);
                F.f2917c.getClass();
                return Z7.l.f4223v.A(1);
            }
        }
    }

    public static final class g extends kotlin.jvm.internal.i implements I7.a {
        public static final g INSTANCE = new g();

        public g() {
            super(0);
        }

        @Override // I7.a
        public final InterfaceC0404w invoke() {
            return AbstractC0406y.b(A8.b.r(new o0(), b.INSTANCE.getSerialIO()));
        }
    }

    public static final class h extends kotlin.jvm.internal.i implements I7.a {
        public static final h INSTANCE = new h();

        public h() {
            super(0);
        }

        @Override // I7.a
        public final ThreadPoolExecutor invoke() {
            try {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, b.KEEP_ALIVE_TIME_SECONDS, TimeUnit.SECONDS, new LinkedBlockingQueue(200), new e(b.DEFAULT_THREAD_NAME_PREFIX, 0, 2, null));
                threadPoolExecutor.allowCoreThreadTimeOut(false);
                return threadPoolExecutor;
            } catch (Exception e9) {
                com.onesignal.debug.internal.logging.b.error$default("OneSignalDispatchers: Failed to create Default executor: " + e9.getMessage(), null, 2, null);
                throw e9;
            }
        }
    }

    public static final class i extends kotlin.jvm.internal.i implements I7.a {
        public static final i INSTANCE = new i();

        public i() {
            super(0);
        }

        @Override // I7.a
        public final Boolean invoke() {
            return Boolean.valueOf(b.INSTANCE.getIoExecutor().isShutdown());
        }
    }

    public static final class j extends kotlin.jvm.internal.i implements I7.a {
        public static final j INSTANCE = new j();

        public j() {
            super(0);
        }

        @Override // I7.a
        public final Boolean invoke() {
            return Boolean.valueOf(b.INSTANCE.getDefaultExecutor().isShutdown());
        }
    }

    public static final class k extends kotlin.jvm.internal.i implements I7.a {
        public static final k INSTANCE = new k();

        public k() {
            super(0);
        }

        @Override // I7.a
        public final Boolean invoke() {
            return Boolean.valueOf(b.INSTANCE.getSerialIOExecutor().isShutdown());
        }
    }

    public static final class l extends kotlin.jvm.internal.i implements I7.a {
        public static final l INSTANCE = new l();

        public l() {
            super(0);
        }

        @Override // I7.a
        public final Boolean invoke() {
            return Boolean.valueOf(AbstractC0406y.n(b.INSTANCE.getIOScope()));
        }
    }

    public static final class m extends kotlin.jvm.internal.i implements I7.a {
        public static final m INSTANCE = new m();

        public m() {
            super(0);
        }

        @Override // I7.a
        public final Boolean invoke() {
            return Boolean.valueOf(AbstractC0406y.n(b.INSTANCE.getDefaultScope()));
        }
    }

    public static final class n extends kotlin.jvm.internal.i implements I7.a {
        public static final n INSTANCE = new n();

        public n() {
            super(0);
        }

        @Override // I7.a
        public final Boolean invoke() {
            return Boolean.valueOf(AbstractC0406y.n(b.INSTANCE.getSerialIOScope()));
        }
    }

    public static final class o extends kotlin.jvm.internal.i implements I7.a {
        public static final o INSTANCE = new o();

        public o() {
            super(0);
        }

        @Override // I7.a
        public final ThreadPoolExecutor invoke() {
            try {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, b.KEEP_ALIVE_TIME_SECONDS, TimeUnit.SECONDS, new LinkedBlockingQueue(200), new e(b.IO_THREAD_NAME_PREFIX, 4));
                threadPoolExecutor.allowCoreThreadTimeOut(false);
                return threadPoolExecutor;
            } catch (Exception e9) {
                com.onesignal.debug.internal.logging.b.error$default("OneSignalDispatchers: Failed to create IO executor: " + e9.getMessage(), null, 2, null);
                throw e9;
            }
        }
    }

    public static final class p extends B7.h implements I7.p {
        final /* synthetic */ I7.l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(I7.l lVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$block = lVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new p(this.$block, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((p) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                I7.l lVar = this.$block;
                this.label = 1;
                if (lVar.invoke(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            return u7.v.f41350a;
        }
    }

    public static final class q extends B7.h implements I7.p {
        final /* synthetic */ I7.l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(I7.l lVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$block = lVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new q(this.$block, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((q) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                I7.l lVar = this.$block;
                this.label = 1;
                if (lVar.invoke(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            return u7.v.f41350a;
        }
    }

    public static final class r extends B7.h implements I7.p {
        final /* synthetic */ I7.l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(I7.l lVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$block = lVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new r(this.$block, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((r) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                I7.l lVar = this.$block;
                this.label = 1;
                if (lVar.invoke(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            return u7.v.f41350a;
        }
    }

    public static final class s extends B7.h implements I7.l {
        int label;

        public s(InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return new s(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            return u7.v.f41350a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((s) create(interfaceC5267d)).invokeSuspend(u7.v.f41350a);
        }
    }

    public static final class t extends B7.h implements I7.l {
        int label;

        public t(InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return new t(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            return u7.v.f41350a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((t) create(interfaceC5267d)).invokeSuspend(u7.v.f41350a);
        }
    }

    public static final class u extends B7.h implements I7.l {
        int label;

        public u(InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return new u(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            return u7.v.f41350a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((u) create(interfaceC5267d)).invokeSuspend(u7.v.f41350a);
        }
    }

    public static final class v extends kotlin.jvm.internal.i implements I7.a {
        public static final v INSTANCE = new v();

        public v() {
            super(0);
        }

        @Override // I7.a
        public final ExecutorService invoke() {
            try {
                return Executors.newSingleThreadExecutor(new e(b.SERIAL_IO_THREAD_NAME, 4));
            } catch (Exception e9) {
                com.onesignal.debug.internal.logging.b.error$default("OneSignalDispatchers: Failed to create SerialIO executor: " + e9.getMessage(), null, 2, null);
                throw e9;
            }
        }
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreadPoolExecutor getDefaultExecutor() {
        return (ThreadPoolExecutor) defaultExecutor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0404w getDefaultScope() {
        return (InterfaceC0404w) DefaultScope$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0404w getIOScope() {
        return (InterfaceC0404w) IOScope$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreadPoolExecutor getIoExecutor() {
        return (ThreadPoolExecutor) ioExecutor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExecutorService getSerialIOExecutor() {
        Object value = serialIOExecutor$delegate.getValue();
        kotlin.jvm.internal.h.d(value, "getValue(...)");
        return (ExecutorService) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0404w getSerialIOScope() {
        return (InterfaceC0404w) SerialIOScope$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prewarm$lambda$2() {
        try {
            b bVar = INSTANCE;
            bVar.launchOnIO(new s(null));
            bVar.launchOnDefault(new t(null));
            bVar.launchOnSerialIO(new u(null));
        } catch (Throwable th) {
            synchronized (prewarmLock) {
                prewarmStarted = false;
                com.onesignal.debug.internal.logging.b.warn("OneSignalDispatchers.prewarm failed: " + th.getMessage(), th);
            }
        }
    }

    public final String executorStatus$com_onesignal_core(String name, I7.a isShutdown) {
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(isShutdown, "isShutdown");
        try {
            return ((Boolean) isShutdown.invoke()).booleanValue() ? "Shutdown" : "Active";
        } catch (Exception e9) {
            StringBuilder c9 = AbstractC5049e.c(name, " Not initialized ");
            String message = e9.getMessage();
            if (message == null) {
                message = UNKNOWN_ERROR;
            }
            c9.append(message);
            return c9.toString();
        }
    }

    public final AbstractC0402u getDefault() {
        return (AbstractC0402u) Default$delegate.getValue();
    }

    public final AbstractC0402u getIO() {
        return (AbstractC0402u) IO$delegate.getValue();
    }

    public final String getPerformanceMetrics$com_onesignal_core() {
        String str;
        BlockingQueue<Runnable> queue;
        try {
            ExecutorService serialIOExecutor = getSerialIOExecutor();
            ThreadPoolExecutor threadPoolExecutor = serialIOExecutor instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) serialIOExecutor : null;
            if (threadPoolExecutor == null || (queue = threadPoolExecutor.getQueue()) == null || (str = Integer.valueOf(queue.size()).toString()) == null) {
                str = "n/a";
            }
            ExecutorService serialIOExecutor2 = getSerialIOExecutor();
            ThreadPoolExecutor threadPoolExecutor2 = serialIOExecutor2 instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) serialIOExecutor2 : null;
            return Q7.k.H("\n            OneSignalDispatchers Performance Metrics:\n            - IO Pool: " + getIoExecutor().getActiveCount() + '/' + getIoExecutor().getCorePoolSize() + " active/core threads\n            - IO Queue: " + getIoExecutor().getQueue().size() + " pending tasks\n            - Default Pool: " + getDefaultExecutor().getActiveCount() + '/' + getDefaultExecutor().getCorePoolSize() + " active/core threads\n            - Default Queue: " + getDefaultExecutor().getQueue().size() + " pending tasks\n            - SerialIO Queue: " + str + " pending tasks\n            - Total completed tasks: " + (getIoExecutor().getCompletedTaskCount() + getDefaultExecutor().getCompletedTaskCount() + (threadPoolExecutor2 != null ? threadPoolExecutor2.getCompletedTaskCount() : 0L)) + "\n            - Memory usage: ~" + ((getIoExecutor().getActiveCount() + getDefaultExecutor().getActiveCount() + 1) * 1024) + "KB (thread stacks, ~1MB each)\n            ");
        } catch (Exception e9) {
            return "OneSignalDispatchers not initialized or using fallback dispatchers " + e9.getMessage();
        }
    }

    public final AbstractC0402u getSerialIO() {
        return (AbstractC0402u) SerialIO$delegate.getValue();
    }

    public final String getStatus$com_onesignal_core() {
        return Q7.k.H("\n            OneSignalDispatchers Status:\n            - IO Executor: " + executorStatus$com_onesignal_core("ioExecutor", i.INSTANCE) + "\n            - Default Executor: " + executorStatus$com_onesignal_core("defaultExecutor", j.INSTANCE) + "\n            - SerialIO Executor: " + executorStatus$com_onesignal_core("serialIOExecutor", k.INSTANCE) + "\n            - IO Scope: " + scopeStatus$com_onesignal_core("IOScope", l.INSTANCE) + "\n            - Default Scope: " + scopeStatus$com_onesignal_core("DefaultScope", m.INSTANCE) + "\n            - SerialIO Scope: " + scopeStatus$com_onesignal_core("SerialIOScope", n.INSTANCE) + "\n        ");
    }

    public final Y launchOnDefault(I7.l block) {
        kotlin.jvm.internal.h.e(block, "block");
        return AbstractC0406y.o(getDefaultScope(), null, new p(block, null), 3);
    }

    public final Y launchOnIO(I7.l block) {
        kotlin.jvm.internal.h.e(block, "block");
        return AbstractC0406y.o(getIOScope(), null, new q(block, null), 3);
    }

    public final Y launchOnSerialIO(I7.l block) {
        kotlin.jvm.internal.h.e(block, "block");
        return AbstractC0406y.o(getSerialIOScope(), null, new r(block, null), 3);
    }

    public final void prewarm() {
        if (prewarmStarted) {
            return;
        }
        synchronized (prewarmLock) {
            if (prewarmStarted) {
                return;
            }
            prewarmStarted = true;
            try {
                Thread thread = new Thread(new com.onesignal.common.threading.a(0), "OneSignal-prewarm");
                thread.setDaemon(true);
                thread.setPriority(3);
                thread.start();
            } catch (Throwable th) {
                synchronized (prewarmLock) {
                    prewarmStarted = false;
                    com.onesignal.debug.internal.logging.b.warn("OneSignalDispatchers.prewarm failed to start daemon: " + th.getMessage(), th);
                }
            }
        }
    }

    public final void resetPrewarmForTest$com_onesignal_core() {
        synchronized (prewarmLock) {
            prewarmStarted = false;
        }
    }

    public final String scopeStatus$com_onesignal_core(String name, I7.a isActive) {
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(isActive, "isActive");
        try {
            return ((Boolean) isActive.invoke()).booleanValue() ? "Active" : "Cancelled";
        } catch (Exception e9) {
            StringBuilder c9 = AbstractC5049e.c(name, " Not initialized ");
            String message = e9.getMessage();
            if (message == null) {
                message = UNKNOWN_ERROR;
            }
            c9.append(message);
            return c9.toString();
        }
    }

    public static final class e implements ThreadFactory {
        private final String namePrefix;
        private final int priority;
        private final AtomicInteger threadNumber;

        public e(String namePrefix, int i) {
            kotlin.jvm.internal.h.e(namePrefix, "namePrefix");
            this.namePrefix = namePrefix;
            this.priority = i;
            this.threadNumber = new AtomicInteger(1);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r9) {
            kotlin.jvm.internal.h.e(r9, "r");
            Thread thread = new Thread(r9, this.namePrefix + '-' + this.threadNumber.getAndIncrement());
            thread.setDaemon(true);
            thread.setPriority(this.priority);
            return thread;
        }

        public /* synthetic */ e(String str, int i, int i6, kotlin.jvm.internal.e eVar) {
            this(str, (i6 & 2) != 0 ? 5 : i);
        }
    }
}
