package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class IA implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26208n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2618Hq f26209u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Runnable f26210v;

    public /* synthetic */ IA(C2618Hq c2618Hq, Runnable runnable, int i) {
        this.f26208n = i;
        this.f26209u = c2618Hq;
        this.f26210v = runnable;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f26208n) {
            case 0:
                C2618Hq c2618Hq = this.f26209u;
                Runnable runnable = this.f26210v;
                if (((InterfaceC4222yA) c2618Hq.f26131C) != null || c2618Hq.f26132n) {
                    if (!c2618Hq.f26132n) {
                        runnable.run();
                        return;
                    }
                    ((C3956tE) c2618Hq.f26135w).a("Waiting to bind to the service.", new Object[0]);
                    ArrayList arrayList = (ArrayList) c2618Hq.f26137y;
                    synchronized (arrayList) {
                        arrayList.add(runnable);
                    }
                    return;
                }
                ((C3956tE) c2618Hq.f26135w).a("Initiate binding to the service.", new Object[0]);
                ArrayList arrayList2 = (ArrayList) c2618Hq.f26137y;
                synchronized (arrayList2) {
                    arrayList2.add(runnable);
                }
                GA ga = new GA(c2618Hq);
                c2618Hq.f26130B = ga;
                c2618Hq.f26132n = true;
                if (((Context) c2618Hq.f26133u).bindService((Intent) c2618Hq.f26138z, ga, 65)) {
                    return;
                }
                ((C3956tE) c2618Hq.f26135w).a("Failed to bind to the service.", new Object[0]);
                c2618Hq.f26132n = false;
                ArrayList arrayList3 = (ArrayList) c2618Hq.f26137y;
                synchronized (arrayList3) {
                    arrayList3.clear();
                }
                return;
            default:
                Runnable runnable2 = this.f26210v;
                C2618Hq c2618Hq2 = this.f26209u;
                c2618Hq2.getClass();
                try {
                    runnable2.run();
                    return;
                } catch (RuntimeException e9) {
                    ((C3956tE) c2618Hq2.f26135w).c("error caused by ", e9);
                    return;
                }
        }
    }
}
