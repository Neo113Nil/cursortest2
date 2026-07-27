package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class IA implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25465n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2598Hq f25466u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Runnable f25467v;

    public /* synthetic */ IA(C2598Hq c2598Hq, Runnable runnable, int i) {
        this.f25465n = i;
        this.f25466u = c2598Hq;
        this.f25467v = runnable;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f25465n) {
            case 0:
                C2598Hq c2598Hq = this.f25466u;
                Runnable runnable = this.f25467v;
                if (((InterfaceC4199yA) c2598Hq.f25388C) != null || c2598Hq.f25389n) {
                    if (!c2598Hq.f25389n) {
                        runnable.run();
                        return;
                    }
                    ((C3933tE) c2598Hq.f25392w).a("Waiting to bind to the service.", new Object[0]);
                    ArrayList arrayList = (ArrayList) c2598Hq.f25394y;
                    synchronized (arrayList) {
                        arrayList.add(runnable);
                    }
                    return;
                }
                ((C3933tE) c2598Hq.f25392w).a("Initiate binding to the service.", new Object[0]);
                ArrayList arrayList2 = (ArrayList) c2598Hq.f25394y;
                synchronized (arrayList2) {
                    arrayList2.add(runnable);
                }
                GA ga = new GA(c2598Hq);
                c2598Hq.f25387B = ga;
                c2598Hq.f25389n = true;
                if (((Context) c2598Hq.f25390u).bindService((Intent) c2598Hq.f25395z, ga, 65)) {
                    return;
                }
                ((C3933tE) c2598Hq.f25392w).a("Failed to bind to the service.", new Object[0]);
                c2598Hq.f25389n = false;
                ArrayList arrayList3 = (ArrayList) c2598Hq.f25394y;
                synchronized (arrayList3) {
                    arrayList3.clear();
                }
                return;
            default:
                Runnable runnable2 = this.f25467v;
                C2598Hq c2598Hq2 = this.f25466u;
                c2598Hq2.getClass();
                try {
                    runnable2.run();
                    return;
                } catch (RuntimeException e9) {
                    ((C3933tE) c2598Hq2.f25392w).c("error caused by ", e9);
                    return;
                }
        }
    }
}
