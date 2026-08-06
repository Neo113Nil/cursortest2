package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0808v1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7035a;

    public RunnableC0808v1(Context context) {
        this.f7035a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Qj qj = AbstractC0645oj.f6689a;
        Context context = this.f7035a;
        synchronized (qj) {
            try {
                if (qj.f4962b == null) {
                    qj.f4962b = AbstractC0618ni.f6628a.a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                    Iterator it = qj.f4961a.iterator();
                    while (it.hasNext()) {
                        ((Qa) it.next()).a(qj.f4962b);
                    }
                    qj.f4961a.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
