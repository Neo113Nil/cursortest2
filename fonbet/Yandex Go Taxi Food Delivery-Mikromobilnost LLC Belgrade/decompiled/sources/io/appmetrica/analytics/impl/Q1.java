package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class Q1 implements Runnable {
    public final /* synthetic */ Context a;

    public Q1(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0313en c0313en = Cm.a;
        Context context = this.a;
        synchronized (c0313en) {
            try {
                if (c0313en.b == null) {
                    c0313en.b = AbstractC0196al.a.a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                    Iterator it = c0313en.a.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0591oc) it.next()).a(c0313en.b);
                    }
                    c0313en.a.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
