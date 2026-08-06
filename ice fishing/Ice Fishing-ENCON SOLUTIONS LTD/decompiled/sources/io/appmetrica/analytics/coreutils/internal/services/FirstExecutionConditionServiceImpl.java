package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class FirstExecutionConditionServiceImpl implements FirstExecutionConditionService {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f3849a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private UtilityServiceConfiguration f3850b;

    /* renamed from: c, reason: collision with root package name */
    final UtilityServiceProvider f3851c;

    public static class FirstExecutionConditionChecker {

        /* renamed from: a, reason: collision with root package name */
        private boolean f3852a = false;

        /* renamed from: b, reason: collision with root package name */
        private long f3853b;

        /* renamed from: c, reason: collision with root package name */
        private long f3854c;

        /* renamed from: d, reason: collision with root package name */
        private long f3855d;

        /* renamed from: e, reason: collision with root package name */
        private final FirstExecutionDelayChecker f3856e;
        public final String tag;

        public FirstExecutionConditionChecker(UtilityServiceConfiguration utilityServiceConfiguration, FirstExecutionDelayChecker firstExecutionDelayChecker, String str) {
            this.f3856e = firstExecutionDelayChecker;
            this.f3854c = utilityServiceConfiguration == null ? 0L : utilityServiceConfiguration.getInitialConfigTime();
            this.f3853b = utilityServiceConfiguration != null ? utilityServiceConfiguration.getLastUpdateConfigTime() : 0L;
            this.f3855d = Long.MAX_VALUE;
            this.tag = str;
        }

        public final void a(long j2) {
            this.f3855d = TimeUnit.SECONDS.toMillis(j2);
        }

        public final boolean b() {
            if (this.f3852a) {
                return true;
            }
            return this.f3856e.delaySinceFirstStartupWasPassed(this.f3854c, this.f3853b, this.f3855d);
        }

        public final void a() {
            this.f3852a = true;
        }

        public final void a(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f3854c = utilityServiceConfiguration.getInitialConfigTime();
            this.f3853b = utilityServiceConfiguration.getLastUpdateConfigTime();
        }
    }

    public static class FirstExecutionDelayChecker {
        public boolean delaySinceFirstStartupWasPassed(long j2, long j3, long j4) {
            return j3 - j2 >= j4;
        }
    }

    public static class FirstExecutionHandler implements FirstExecutionDelayedTask {

        /* renamed from: a, reason: collision with root package name */
        private final FirstExecutionConditionChecker f3857a;

        /* renamed from: b, reason: collision with root package name */
        private final WaitForActivationDelayBarrier.ActivationBarrierHelper f3858b;

        /* renamed from: c, reason: collision with root package name */
        private final ICommonExecutor f3859c;

        public /* synthetic */ FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker, int i2) {
            this(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker);
        }

        public boolean canExecute() {
            boolean b2 = this.f3857a.b();
            if (b2) {
                this.f3857a.a();
            }
            return b2;
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public void setInitialDelaySeconds(long j2) {
            this.f3857a.a(j2);
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public boolean tryExecute(long j2) {
            if (!this.f3857a.b()) {
                return false;
            }
            this.f3858b.subscribeIfNeeded(TimeUnit.SECONDS.toMillis(j2), this.f3859c);
            this.f3857a.a();
            return true;
        }

        public void updateConfig(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f3857a.a(utilityServiceConfiguration);
        }

        private FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
            this.f3858b = activationBarrierHelper;
            this.f3857a = firstExecutionConditionChecker;
            this.f3859c = iCommonExecutor;
        }
    }

    public FirstExecutionConditionServiceImpl(UtilityServiceProvider utilityServiceProvider) {
        this.f3851c = utilityServiceProvider;
    }

    public final synchronized FirstExecutionHandler a(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
        FirstExecutionHandler firstExecutionHandler;
        firstExecutionHandler = new FirstExecutionHandler(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker, 0);
        this.f3849a.add(firstExecutionHandler);
        return firstExecutionHandler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService
    public synchronized FirstExecutionDelayedTask createDelayedTask(String str, ICommonExecutor iCommonExecutor, Runnable runnable) {
        return a(iCommonExecutor, new WaitForActivationDelayBarrier.ActivationBarrierHelper(runnable, this.f3851c.getActivationBarrier()), new FirstExecutionConditionChecker(this.f3850b, new FirstExecutionDelayChecker(), str));
    }

    public void updateConfig(UtilityServiceConfiguration utilityServiceConfiguration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f3850b = utilityServiceConfiguration;
            arrayList = new ArrayList(this.f3849a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((FirstExecutionHandler) it.next()).updateConfig(utilityServiceConfiguration);
        }
    }
}
