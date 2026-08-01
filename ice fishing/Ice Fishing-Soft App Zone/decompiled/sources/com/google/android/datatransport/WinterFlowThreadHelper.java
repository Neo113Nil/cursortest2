package com.google.android.datatransport;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowThreadHelper implements Future {
    public static final WinterFlowSoftwareException WinterFlowResponseEngine;
    public static final boolean WinterFlowRouterRouter = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger WinterFlowSyntax = Logger.getLogger(WinterFlowThreadHelper.class.getName());
    public static final Object WinterFlowTransactionAgent;
    public volatile WinterFlowProcessorFunction WinterFlowTransactionManagerStrategy;
    public volatile WinterFlowTransaction WinterFlowUnitTestResponse;
    public volatile Object WinterFlowVariableVersionControl;

    static {
        WinterFlowSoftwareException winterFlowJavaTool;
        try {
            winterFlowJavaTool = new WinterFlowWidgetService(AtomicReferenceFieldUpdater.newUpdater(WinterFlowTransaction.class, Thread.class, "WinterFlowRouterStructure"), AtomicReferenceFieldUpdater.newUpdater(WinterFlowTransaction.class, WinterFlowTransaction.class, "WinterFlowHookDataSource"), AtomicReferenceFieldUpdater.newUpdater(WinterFlowThreadHelper.class, WinterFlowTransaction.class, "WinterFlowUnitTestResponse"), AtomicReferenceFieldUpdater.newUpdater(WinterFlowThreadHelper.class, WinterFlowProcessorFunction.class, "WinterFlowTransactionManagerStrategy"), AtomicReferenceFieldUpdater.newUpdater(WinterFlowThreadHelper.class, Object.class, "WinterFlowVariableVersionControl"));
            th = null;
        } catch (Throwable th) {
            th = th;
            winterFlowJavaTool = new WinterFlowJavaTool();
        }
        WinterFlowResponseEngine = winterFlowJavaTool;
        if (th != null) {
            WinterFlowSyntax.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        WinterFlowTransactionAgent = new Object();
    }

    public static Object WinterFlowArrayNetwork(Object obj) {
        if (obj instanceof WinterFlowDeserializationMapper) {
            Throwable th = ((WinterFlowDeserializationMapper) obj).WinterFlowHookDataSource;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof WinterFlowNodeAgent) {
            throw new ExecutionException(((WinterFlowNodeAgent) obj).WinterFlowRouterStructure);
        }
        if (obj == WinterFlowTransactionAgent) {
            return null;
        }
        return obj;
    }

    public static void WinterFlowCacheManagerAgent(WinterFlowThreadHelper winterFlowThreadHelper) {
        WinterFlowTransaction winterFlowTransaction;
        WinterFlowProcessorFunction winterFlowProcessorFunction;
        do {
            winterFlowTransaction = winterFlowThreadHelper.WinterFlowUnitTestResponse;
        } while (!WinterFlowResponseEngine.WinterFlowRouterAdapter(winterFlowThreadHelper, winterFlowTransaction, WinterFlowTransaction.WinterFlowCacheManagerAgent));
        while (winterFlowTransaction != null) {
            Thread thread = winterFlowTransaction.WinterFlowRouterStructure;
            if (thread != null) {
                winterFlowTransaction.WinterFlowRouterStructure = null;
                LockSupport.unpark(thread);
            }
            winterFlowTransaction = winterFlowTransaction.WinterFlowHookDataSource;
        }
        winterFlowThreadHelper.WinterFlowHookDataSource();
        do {
            winterFlowProcessorFunction = winterFlowThreadHelper.WinterFlowTransactionManagerStrategy;
        } while (!WinterFlowResponseEngine.WinterFlowVariableBandwidth(winterFlowThreadHelper, winterFlowProcessorFunction));
        WinterFlowProcessorFunction winterFlowProcessorFunction2 = null;
        while (winterFlowProcessorFunction != null) {
            WinterFlowProcessorFunction winterFlowProcessorFunction3 = winterFlowProcessorFunction.WinterFlowRouterStructure;
            winterFlowProcessorFunction.WinterFlowRouterStructure = winterFlowProcessorFunction2;
            winterFlowProcessorFunction2 = winterFlowProcessorFunction;
            winterFlowProcessorFunction = winterFlowProcessorFunction3;
        }
        while (winterFlowProcessorFunction2 != null) {
            winterFlowProcessorFunction2 = winterFlowProcessorFunction2.WinterFlowRouterStructure;
            try {
                throw null;
            } catch (RuntimeException e) {
                WinterFlowSyntax.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object WinterFlowVariableVersionControl(WinterFlowThreadHelper winterFlowThreadHelper) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = winterFlowThreadHelper.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void WinterFlowRouterStructure(StringBuilder sb) {
        try {
            Object WinterFlowVariableVersionControl = WinterFlowVariableVersionControl(this);
            sb.append("SUCCESS, result=[");
            sb.append(WinterFlowVariableVersionControl == this ? "this future" : String.valueOf(WinterFlowVariableVersionControl));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    public final void WinterFlowTransactionManagerStrategy(WinterFlowTransaction winterFlowTransaction) {
        winterFlowTransaction.WinterFlowRouterStructure = null;
        while (true) {
            WinterFlowTransaction winterFlowTransaction2 = this.WinterFlowUnitTestResponse;
            if (winterFlowTransaction2 == WinterFlowTransaction.WinterFlowCacheManagerAgent) {
                return;
            }
            WinterFlowTransaction winterFlowTransaction3 = null;
            while (winterFlowTransaction2 != null) {
                WinterFlowTransaction winterFlowTransaction4 = winterFlowTransaction2.WinterFlowHookDataSource;
                if (winterFlowTransaction2.WinterFlowRouterStructure != null) {
                    winterFlowTransaction3 = winterFlowTransaction2;
                } else if (winterFlowTransaction3 != null) {
                    winterFlowTransaction3.WinterFlowHookDataSource = winterFlowTransaction4;
                    if (winterFlowTransaction3.WinterFlowRouterStructure == null) {
                        break;
                    }
                } else if (!WinterFlowResponseEngine.WinterFlowRouterAdapter(this, winterFlowTransaction2, winterFlowTransaction4)) {
                    break;
                }
                winterFlowTransaction2 = winterFlowTransaction4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.WinterFlowVariableVersionControl;
        if (obj == null) {
            if (WinterFlowResponseEngine.WinterFlowBatchUI(this, obj, WinterFlowRouterRouter ? new WinterFlowDeserializationMapper(new CancellationException("Future.cancel() was called."), z) : z ? WinterFlowDeserializationMapper.WinterFlowCacheManagerAgent : WinterFlowDeserializationMapper.WinterFlowArrayNetwork)) {
                WinterFlowCacheManagerAgent(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        WinterFlowTransaction winterFlowTransaction = WinterFlowTransaction.WinterFlowCacheManagerAgent;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.WinterFlowVariableVersionControl;
        if (obj != null) {
            return WinterFlowArrayNetwork(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            WinterFlowTransaction winterFlowTransaction2 = this.WinterFlowUnitTestResponse;
            if (winterFlowTransaction2 != winterFlowTransaction) {
                WinterFlowTransaction winterFlowTransaction3 = new WinterFlowTransaction();
                do {
                    WinterFlowSoftwareException winterFlowSoftwareException = WinterFlowResponseEngine;
                    winterFlowSoftwareException.WinterFlowCompilerHandler(winterFlowTransaction3, winterFlowTransaction2);
                    if (winterFlowSoftwareException.WinterFlowRouterAdapter(this, winterFlowTransaction2, winterFlowTransaction3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                WinterFlowTransactionManagerStrategy(winterFlowTransaction3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.WinterFlowVariableVersionControl;
                            if (obj2 != null) {
                                return WinterFlowArrayNetwork(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        WinterFlowTransactionManagerStrategy(winterFlowTransaction3);
                    } else {
                        winterFlowTransaction2 = this.WinterFlowUnitTestResponse;
                    }
                } while (winterFlowTransaction2 != winterFlowTransaction);
            }
            return WinterFlowArrayNetwork(this.WinterFlowVariableVersionControl);
        }
        while (nanos > 0) {
            Object obj3 = this.WinterFlowVariableVersionControl;
            if (obj3 != null) {
                return WinterFlowArrayNetwork(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String winterFlowThreadHelper = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(WinterFlowResolverBackend.WinterFlowResponseEngine(str, " for ", winterFlowThreadHelper));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.WinterFlowVariableVersionControl instanceof WinterFlowDeserializationMapper;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.WinterFlowVariableVersionControl != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.WinterFlowVariableVersionControl instanceof WinterFlowDeserializationMapper) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            WinterFlowRouterStructure(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                WinterFlowRouterStructure(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void WinterFlowHookDataSource() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        WinterFlowTransaction winterFlowTransaction = WinterFlowTransaction.WinterFlowCacheManagerAgent;
        if (!Thread.interrupted()) {
            Object obj2 = this.WinterFlowVariableVersionControl;
            if (obj2 != null) {
                return WinterFlowArrayNetwork(obj2);
            }
            WinterFlowTransaction winterFlowTransaction2 = this.WinterFlowUnitTestResponse;
            if (winterFlowTransaction2 != winterFlowTransaction) {
                WinterFlowTransaction winterFlowTransaction3 = new WinterFlowTransaction();
                do {
                    WinterFlowSoftwareException winterFlowSoftwareException = WinterFlowResponseEngine;
                    winterFlowSoftwareException.WinterFlowCompilerHandler(winterFlowTransaction3, winterFlowTransaction2);
                    if (winterFlowSoftwareException.WinterFlowRouterAdapter(this, winterFlowTransaction2, winterFlowTransaction3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.WinterFlowVariableVersionControl;
                            } else {
                                WinterFlowTransactionManagerStrategy(winterFlowTransaction3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return WinterFlowArrayNetwork(obj);
                    }
                    winterFlowTransaction2 = this.WinterFlowUnitTestResponse;
                } while (winterFlowTransaction2 != winterFlowTransaction);
            }
            return WinterFlowArrayNetwork(this.WinterFlowVariableVersionControl);
        }
        throw new InterruptedException();
    }
}
