package com.google.common.util.concurrent;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class AbstractFutureState implements ListenableFuture {
    public static final Countries ATOMIC_HELPER;
    public static final boolean GENERATE_CANCELLATION_CAUSES;
    public static final Object NULL = new Object();
    public static final LazyLogger log = new LazyLogger(AbstractFuture.class);
    public volatile AbstractFuture.Listener listenersField;
    public volatile Object valueField;
    public volatile Waiter waitersField;

    /* loaded from: classes4.dex */
    public final class AtomicReferenceFieldUpdaterAtomicHelper extends Countries {
        public static final AtomicReferenceFieldUpdater waiterThreadUpdater = AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "thread");
        public static final AtomicReferenceFieldUpdater waiterNextUpdater = AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "next");
        public static final AtomicReferenceFieldUpdater waitersUpdater = AtomicReferenceFieldUpdater.newUpdater(AbstractFutureState.class, Waiter.class, "waitersField");
        public static final AtomicReferenceFieldUpdater listenersUpdater = AtomicReferenceFieldUpdater.newUpdater(AbstractFutureState.class, AbstractFuture.Listener.class, "listenersField");
        public static final AtomicReferenceFieldUpdater valueUpdater = AtomicReferenceFieldUpdater.newUpdater(AbstractFutureState.class, Object.class, "valueField");

        @Override // com.squareup.util.cash.Countries
        public final boolean casListeners(AbstractFuture abstractFuture, AbstractFuture.Listener listener, AbstractFuture.Listener listener2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = listenersUpdater;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, listener, listener2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == listener);
            return false;
        }

        @Override // com.squareup.util.cash.Countries
        public final boolean casValue(AbstractFutureState abstractFutureState, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = valueUpdater;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureState, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFutureState) == obj);
            return false;
        }

        @Override // com.squareup.util.cash.Countries
        public final boolean casWaiters(AbstractFutureState abstractFutureState, Waiter waiter, Waiter waiter2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = waitersUpdater;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureState, waiter, waiter2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFutureState) == waiter);
            return false;
        }

        @Override // com.squareup.util.cash.Countries
        public final AbstractFuture.Listener gasListeners(AbstractFuture abstractFuture) {
            return (AbstractFuture.Listener) listenersUpdater.getAndSet(abstractFuture, AbstractFuture.Listener.TOMBSTONE);
        }

        @Override // com.squareup.util.cash.Countries
        public final Waiter gasWaiters(AbstractFuture abstractFuture) {
            return (Waiter) waitersUpdater.getAndSet(abstractFuture, Waiter.TOMBSTONE);
        }

        @Override // com.squareup.util.cash.Countries
        public final void putNext(Waiter waiter, Waiter waiter2) {
            waiterNextUpdater.lazySet(waiter, waiter2);
        }

        @Override // com.squareup.util.cash.Countries
        public final void putThread(Waiter waiter, Thread thread) {
            waiterThreadUpdater.lazySet(waiter, thread);
        }
    }

    /* loaded from: classes4.dex */
    public final class SynchronizedHelper extends Countries {
        @Override // com.squareup.util.cash.Countries
        public final boolean casListeners(AbstractFuture abstractFuture, AbstractFuture.Listener listener, AbstractFuture.Listener listener2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.listenersField != listener) {
                        return false;
                    }
                    abstractFuture.listenersField = listener2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.squareup.util.cash.Countries
        public final boolean casValue(AbstractFutureState abstractFutureState, Object obj, Object obj2) {
            synchronized (abstractFutureState) {
                try {
                    if (abstractFutureState.valueField != obj) {
                        return false;
                    }
                    abstractFutureState.valueField = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.squareup.util.cash.Countries
        public final boolean casWaiters(AbstractFutureState abstractFutureState, Waiter waiter, Waiter waiter2) {
            synchronized (abstractFutureState) {
                try {
                    if (abstractFutureState.waitersField != waiter) {
                        return false;
                    }
                    abstractFutureState.waitersField = waiter2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.squareup.util.cash.Countries
        public final AbstractFuture.Listener gasListeners(AbstractFuture abstractFuture) {
            AbstractFuture.Listener listener;
            AbstractFuture.Listener listener2 = AbstractFuture.Listener.TOMBSTONE;
            synchronized (abstractFuture) {
                try {
                    listener = abstractFuture.listenersField;
                    if (listener != listener2) {
                        abstractFuture.listenersField = listener2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return listener;
        }

        @Override // com.squareup.util.cash.Countries
        public final Waiter gasWaiters(AbstractFuture abstractFuture) {
            Waiter waiter;
            Waiter waiter2 = Waiter.TOMBSTONE;
            synchronized (abstractFuture) {
                try {
                    waiter = abstractFuture.waitersField;
                    if (waiter != waiter2) {
                        abstractFuture.waitersField = waiter2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return waiter;
        }

        @Override // com.squareup.util.cash.Countries
        public final void putNext(Waiter waiter, Waiter waiter2) {
            waiter.next = waiter2;
        }

        @Override // com.squareup.util.cash.Countries
        public final void putThread(Waiter waiter, Thread thread) {
            waiter.thread = thread;
        }
    }

    public final class UnsafeAtomicHelper extends Countries {
        public static final long LISTENERS_OFFSET;
        public static final Unsafe UNSAFE;
        public static final long VALUE_OFFSET;
        public static final long WAITERS_OFFSET;
        public static final long WAITER_NEXT_OFFSET;
        public static final long WAITER_THREAD_OFFSET;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    OptionalProvider$$ExternalSyntheticLambda0.m("Could not initialize intrinsics", e.getCause());
                    return;
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new AbstractFutureState$UnsafeAtomicHelper$$ExternalSyntheticLambda3());
            }
            try {
                WAITERS_OFFSET = unsafe.objectFieldOffset(AbstractFutureState.class.getDeclaredField("waitersField"));
                LISTENERS_OFFSET = unsafe.objectFieldOffset(AbstractFutureState.class.getDeclaredField("listenersField"));
                VALUE_OFFSET = unsafe.objectFieldOffset(AbstractFutureState.class.getDeclaredField("valueField"));
                WAITER_THREAD_OFFSET = unsafe.objectFieldOffset(Waiter.class.getDeclaredField("thread"));
                WAITER_NEXT_OFFSET = unsafe.objectFieldOffset(Waiter.class.getDeclaredField("next"));
                UNSAFE = unsafe;
            } catch (NoSuchFieldException e2) {
                a$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            }
        }

        public static /* synthetic */ Unsafe lambda$static$0() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // com.squareup.util.cash.Countries
        public final boolean casListeners(AbstractFuture abstractFuture, AbstractFuture.Listener listener, AbstractFuture.Listener listener2) {
            return AbstractFutureState$UnsafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(UNSAFE, abstractFuture, LISTENERS_OFFSET, listener, listener2);
        }

        @Override // com.squareup.util.cash.Countries
        public final boolean casValue(AbstractFutureState abstractFutureState, Object obj, Object obj2) {
            return AbstractFutureState$UnsafeAtomicHelper$$ExternalSyntheticBackportWithForwarding1.m(UNSAFE, abstractFutureState, VALUE_OFFSET, obj, obj2);
        }

        @Override // com.squareup.util.cash.Countries
        public final boolean casWaiters(AbstractFutureState abstractFutureState, Waiter waiter, Waiter waiter2) {
            return AbstractFutureState$UnsafeAtomicHelper$$ExternalSyntheticBackportWithForwarding2.m(UNSAFE, abstractFutureState, WAITERS_OFFSET, waiter, waiter2);
        }

        @Override // com.squareup.util.cash.Countries
        public final AbstractFuture.Listener gasListeners(AbstractFuture abstractFuture) {
            AbstractFuture.Listener listener;
            AbstractFuture.Listener listener2 = AbstractFuture.Listener.TOMBSTONE;
            do {
                listener = abstractFuture.listenersField;
                if (listener2 == listener) {
                    break;
                }
            } while (!casListeners(abstractFuture, listener, listener2));
            return listener;
        }

        @Override // com.squareup.util.cash.Countries
        public final Waiter gasWaiters(AbstractFuture abstractFuture) {
            Waiter waiter;
            Waiter waiter2 = Waiter.TOMBSTONE;
            do {
                waiter = abstractFuture.waitersField;
                if (waiter2 == waiter) {
                    break;
                }
            } while (!casWaiters(abstractFuture, waiter, waiter2));
            return waiter;
        }

        @Override // com.squareup.util.cash.Countries
        public final void putNext(Waiter waiter, Waiter waiter2) {
            UNSAFE.putObject(waiter, WAITER_NEXT_OFFSET, waiter2);
        }

        @Override // com.squareup.util.cash.Countries
        public final void putThread(Waiter waiter, Thread thread) {
            UNSAFE.putObject(waiter, WAITER_THREAD_OFFSET, thread);
        }
    }

    public final class Waiter {
        public static final Waiter TOMBSTONE = new Waiter();
        public volatile Waiter next;
        public volatile Thread thread;

        public Waiter() {
            AbstractFutureState.ATOMIC_HELPER.putThread(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        Countries synchronizedHelper;
        Throwable th;
        Countries countries;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        GENERATE_CANCELLATION_CAUSES = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable e = null;
        if (property == null || property.contains("Android")) {
            try {
                countries = new UnsafeAtomicHelper();
            } catch (Error | Exception e2) {
                try {
                    synchronizedHelper = new AtomicReferenceFieldUpdaterAtomicHelper();
                } catch (Error | Exception e3) {
                    e = e3;
                    synchronizedHelper = new SynchronizedHelper();
                }
                Countries countries2 = synchronizedHelper;
                th = e2;
                countries = countries2;
            }
        } else {
            try {
                countries = new AtomicReferenceFieldUpdaterAtomicHelper();
            } catch (NoClassDefFoundError unused2) {
                countries = new SynchronizedHelper();
            }
        }
        th = null;
        ATOMIC_HELPER = countries;
        if (e != null) {
            LazyLogger lazyLogger = log;
            Logger logger = lazyLogger.get();
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            lazyLogger.get().log(level, "AtomicReferenceFieldUpdaterAtomicHelper is broken!", e);
        }
    }

    public final void removeWaiter(Waiter waiter) {
        waiter.thread = null;
        while (true) {
            Waiter waiter2 = this.waitersField;
            if (waiter2 == Waiter.TOMBSTONE) {
                return;
            }
            Waiter waiter3 = null;
            while (waiter2 != null) {
                Waiter waiter4 = waiter2.next;
                if (waiter2.thread != null) {
                    waiter3 = waiter2;
                } else if (waiter3 != null) {
                    waiter3.next = waiter4;
                    if (waiter3.thread == null) {
                        break;
                    }
                } else if (!ATOMIC_HELPER.casWaiters(this, waiter2, waiter4)) {
                    break;
                }
                waiter2 = waiter4;
            }
            return;
        }
    }

    public abstract Throwable tryInternalFastPathGetFailure();
}
