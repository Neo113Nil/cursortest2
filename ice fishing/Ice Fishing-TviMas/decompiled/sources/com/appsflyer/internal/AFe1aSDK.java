package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AFe1aSDK {
    public Executor AFAdRevenueData;
    final Set<AFe1eSDK<?>> areAllFieldsValid;
    final Set<AFf1zSDK> component1;
    final List<AFe1eSDK<?>> component2;
    final NavigableSet<AFe1eSDK<?>> component3;
    final NavigableSet<AFe1eSDK<?>> component4;
    final ExecutorService getCurrencyIso4217Code;
    final Timer getMediationNetwork;
    final Set<AFf1zSDK> getMonetizationNetwork;
    public final List<AFe1dSDK> getRevenue;

    public AFe1aSDK(ExecutorService executorService) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
        this.AFAdRevenueData = newSingleThreadExecutor;
        this.getMediationNetwork = new Timer(true);
        this.getRevenue = new CopyOnWriteArrayList();
        this.getMonetizationNetwork = new CopyOnWriteArraySet();
        this.component1 = Collections.newSetFromMap(new ConcurrentHashMap());
        this.component3 = new ConcurrentSkipListSet();
        this.component4 = new ConcurrentSkipListSet();
        this.component2 = new ArrayList();
        this.areAllFieldsValid = Collections.newSetFromMap(new ConcurrentHashMap());
        this.getCurrencyIso4217Code = executorService;
    }

    /* renamed from: com.appsflyer.internal.AFe1aSDK$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        private /* synthetic */ AFe1eSDK getMediationNetwork;

        public AnonymousClass2(AFe1eSDK aFe1eSDK) {
            this.getMediationNetwork = aFe1eSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean add;
            synchronized (AFe1aSDK.this.component3) {
                if (AFe1aSDK.this.areAllFieldsValid.contains(this.getMediationNetwork)) {
                    AFLogger.INSTANCE.d(AFh1vSDK.QUEUE, new StringBuilder("tried to add already running task: ").append(this.getMediationNetwork).toString());
                    return;
                }
                if (!AFe1aSDK.this.component3.contains(this.getMediationNetwork) && !AFe1aSDK.this.component4.contains(this.getMediationNetwork)) {
                    AFe1aSDK aFe1aSDK = AFe1aSDK.this;
                    AFe1eSDK aFe1eSDK = this.getMediationNetwork;
                    for (AFf1zSDK aFf1zSDK : aFe1eSDK.getCurrencyIso4217Code) {
                        if (aFe1aSDK.component1.contains(aFf1zSDK)) {
                            aFe1eSDK.getRevenue.add(aFf1zSDK);
                        }
                    }
                    if (AFe1aSDK.this.getRevenue(this.getMediationNetwork)) {
                        add = AFe1aSDK.this.component3.add(this.getMediationNetwork);
                    } else {
                        add = AFe1aSDK.this.component4.add(this.getMediationNetwork);
                        if (add) {
                            AFLogger.INSTANCE.d(AFh1vSDK.QUEUE, new StringBuilder("new task was blocked: ").append(this.getMediationNetwork).toString());
                            this.getMediationNetwork.getCurrencyIso4217Code();
                        }
                    }
                    if (add) {
                        AFe1aSDK.this.component3.addAll(AFe1aSDK.this.component2);
                        AFe1aSDK.this.component2.clear();
                    } else {
                        AFLogger.INSTANCE.d(AFh1vSDK.QUEUE, new StringBuilder("task not added, it's already in the queue: ").append(this.getMediationNetwork).toString());
                    }
                    if (add) {
                        AFe1aSDK.this.component1.add(this.getMediationNetwork.getMonetizationNetwork);
                        AFLogger.INSTANCE.d(AFh1vSDK.QUEUE, new StringBuilder("new task added: ").append(this.getMediationNetwork).toString());
                        for (AFe1dSDK aFe1dSDK : AFe1aSDK.this.getRevenue) {
                        }
                        AFe1aSDK aFe1aSDK2 = AFe1aSDK.this;
                        aFe1aSDK2.getCurrencyIso4217Code.submit(aFe1aSDK2.new AnonymousClass4());
                        AFe1aSDK aFe1aSDK3 = AFe1aSDK.this;
                        synchronized (aFe1aSDK3.component3) {
                            for (int size = (aFe1aSDK3.component3.size() + aFe1aSDK3.component4.size()) - 40; size > 0; size--) {
                                boolean z = !aFe1aSDK3.component4.isEmpty();
                                boolean z2 = !aFe1aSDK3.component3.isEmpty();
                                if (z2 && z) {
                                    if (aFe1aSDK3.component3.first().compareTo(aFe1aSDK3.component4.first()) > 0) {
                                        aFe1aSDK3.getMediationNetwork(aFe1aSDK3.component3);
                                    } else {
                                        aFe1aSDK3.getMediationNetwork(aFe1aSDK3.component4);
                                    }
                                } else if (z2) {
                                    aFe1aSDK3.getMediationNetwork(aFe1aSDK3.component3);
                                } else if (z) {
                                    aFe1aSDK3.getMediationNetwork(aFe1aSDK3.component4);
                                }
                            }
                        }
                        return;
                    }
                    AFLogger.INSTANCE.w(AFh1vSDK.QUEUE, new StringBuilder("QUEUE: tried to add already pending task: ").append(this.getMediationNetwork).toString());
                    return;
                }
                AFLogger.INSTANCE.d(AFh1vSDK.QUEUE, new StringBuilder("tried to add already scheduled task: ").append(this.getMediationNetwork).toString());
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFe1aSDK$4, reason: invalid class name */
    final class AnonymousClass4 implements Runnable {
        AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFe1aSDK.this.component3) {
                final AFe1eSDK<?> pollFirst = AFe1aSDK.this.component3.pollFirst();
                if (pollFirst == null) {
                    return;
                }
                AFe1aSDK.this.areAllFieldsValid.add(pollFirst);
                long monetizationNetwork = pollFirst.getMonetizationNetwork();
                AFf1xSDK aFf1xSDK = new AFf1xSDK(Thread.currentThread());
                if (monetizationNetwork > 0) {
                    AFe1aSDK.this.getMediationNetwork.schedule(aFf1xSDK, monetizationNetwork);
                }
                final AFe1aSDK aFe1aSDK = AFe1aSDK.this;
                aFe1aSDK.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1aSDK.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator<AFe1dSDK> it = AFe1aSDK.this.getRevenue.iterator();
                        while (it.hasNext()) {
                            it.next().getCurrencyIso4217Code(pollFirst);
                        }
                    }
                });
                if (!AFe1aSDK.this.component3.isEmpty()) {
                    AFe1aSDK aFe1aSDK2 = AFe1aSDK.this;
                    aFe1aSDK2.getCurrencyIso4217Code.submit(aFe1aSDK2.new AnonymousClass4());
                }
                try {
                    AFLogger.INSTANCE.d(AFh1vSDK.QUEUE, "starting task execution: ".concat(String.valueOf(pollFirst)));
                    final AFe1cSDK call = pollFirst.call();
                    aFf1xSDK.cancel();
                    final AFe1aSDK aFe1aSDK3 = AFe1aSDK.this;
                    aFe1aSDK3.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1aSDK.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFh1vSDK.QUEUE, new StringBuilder("execution finished for ").append(pollFirst).append(", result: ").append(call).toString());
                            AFe1aSDK.this.areAllFieldsValid.remove(pollFirst);
                            Iterator<AFe1dSDK> it = AFe1aSDK.this.getRevenue.iterator();
                            while (it.hasNext()) {
                                it.next().getMonetizationNetwork(pollFirst, call);
                            }
                            if (call == AFe1cSDK.SUCCESS) {
                                AFe1aSDK.this.getMonetizationNetwork.add(pollFirst.getMonetizationNetwork);
                                AFe1aSDK.this.getMonetizationNetwork();
                                return;
                            }
                            if (pollFirst.getMediationNetwork()) {
                                if (AFe1aSDK.getCurrencyIso4217Code(pollFirst)) {
                                    synchronized (AFe1aSDK.this.component3) {
                                        AFe1aSDK.this.component2.add(pollFirst);
                                        for (AFe1dSDK aFe1dSDK : AFe1aSDK.this.getRevenue) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1aSDK.this.getMonetizationNetwork.add(pollFirst.getMonetizationNetwork);
                            AFe1aSDK.this.getMonetizationNetwork();
                        }
                    });
                } catch (InterruptedIOException | InterruptedException unused) {
                    AFLogger.INSTANCE.d(AFh1vSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(pollFirst)));
                    pollFirst.getMediationNetwork = AFe1cSDK.TIMEOUT;
                    final AFe1aSDK aFe1aSDK4 = AFe1aSDK.this;
                    final AFe1cSDK aFe1cSDK = AFe1cSDK.TIMEOUT;
                    aFe1aSDK4.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1aSDK.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFh1vSDK.QUEUE, new StringBuilder("execution finished for ").append(pollFirst).append(", result: ").append(aFe1cSDK).toString());
                            AFe1aSDK.this.areAllFieldsValid.remove(pollFirst);
                            Iterator<AFe1dSDK> it = AFe1aSDK.this.getRevenue.iterator();
                            while (it.hasNext()) {
                                it.next().getMonetizationNetwork(pollFirst, aFe1cSDK);
                            }
                            if (aFe1cSDK == AFe1cSDK.SUCCESS) {
                                AFe1aSDK.this.getMonetizationNetwork.add(pollFirst.getMonetizationNetwork);
                                AFe1aSDK.this.getMonetizationNetwork();
                                return;
                            }
                            if (pollFirst.getMediationNetwork()) {
                                if (AFe1aSDK.getCurrencyIso4217Code(pollFirst)) {
                                    synchronized (AFe1aSDK.this.component3) {
                                        AFe1aSDK.this.component2.add(pollFirst);
                                        for (AFe1dSDK aFe1dSDK : AFe1aSDK.this.getRevenue) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1aSDK.this.getMonetizationNetwork.add(pollFirst.getMonetizationNetwork);
                            AFe1aSDK.this.getMonetizationNetwork();
                        }
                    });
                } catch (Throwable unused2) {
                    aFf1xSDK.cancel();
                    final AFe1aSDK aFe1aSDK5 = AFe1aSDK.this;
                    final AFe1cSDK aFe1cSDK2 = AFe1cSDK.FAILURE;
                    aFe1aSDK5.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1aSDK.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFh1vSDK.QUEUE, new StringBuilder("execution finished for ").append(pollFirst).append(", result: ").append(aFe1cSDK2).toString());
                            AFe1aSDK.this.areAllFieldsValid.remove(pollFirst);
                            Iterator<AFe1dSDK> it = AFe1aSDK.this.getRevenue.iterator();
                            while (it.hasNext()) {
                                it.next().getMonetizationNetwork(pollFirst, aFe1cSDK2);
                            }
                            if (aFe1cSDK2 == AFe1cSDK.SUCCESS) {
                                AFe1aSDK.this.getMonetizationNetwork.add(pollFirst.getMonetizationNetwork);
                                AFe1aSDK.this.getMonetizationNetwork();
                                return;
                            }
                            if (pollFirst.getMediationNetwork()) {
                                if (AFe1aSDK.getCurrencyIso4217Code(pollFirst)) {
                                    synchronized (AFe1aSDK.this.component3) {
                                        AFe1aSDK.this.component2.add(pollFirst);
                                        for (AFe1dSDK aFe1dSDK : AFe1aSDK.this.getRevenue) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1aSDK.this.getMonetizationNetwork.add(pollFirst.getMonetizationNetwork);
                            AFe1aSDK.this.getMonetizationNetwork();
                        }
                    });
                }
            }
        }
    }

    final void getMonetizationNetwork() {
        synchronized (this.component3) {
            Iterator<AFe1eSDK<?>> it = this.component4.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AFe1eSDK<?> next = it.next();
                if (getRevenue(next)) {
                    it.remove();
                    this.component3.add(next);
                    z = true;
                }
            }
            if (z) {
                this.getCurrencyIso4217Code.submit(new AnonymousClass4());
            }
        }
    }

    final void getMediationNetwork(NavigableSet<AFe1eSDK<?>> navigableSet) {
        AFe1eSDK<?> pollFirst = navigableSet.pollFirst();
        this.getMonetizationNetwork.add(pollFirst.getMonetizationNetwork);
        Iterator<AFe1dSDK> it = this.getRevenue.iterator();
        while (it.hasNext()) {
            it.next().getMediationNetwork(pollFirst);
        }
    }

    final boolean getRevenue(AFe1eSDK<?> aFe1eSDK) {
        return this.getMonetizationNetwork.containsAll(aFe1eSDK.getRevenue);
    }

    public static boolean getCurrencyIso4217Code(AFe1eSDK<?> aFe1eSDK) {
        return ((aFe1eSDK instanceof AFf1dSDK) && aFe1eSDK.getMonetizationNetwork == AFf1zSDK.ARS_VALIDATE) ? false : true;
    }
}
