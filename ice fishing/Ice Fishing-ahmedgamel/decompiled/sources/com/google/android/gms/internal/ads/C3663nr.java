package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.nr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3663nr {

    /* renamed from: f, reason: collision with root package name */
    public static C3663nr f33572f;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f33573a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f33574b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f33575c;

    /* renamed from: d, reason: collision with root package name */
    public int f33576d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33577e;

    public C3663nr(Context context) {
        Executor j6 = AbstractC3066cl.j();
        this.f33573a = j6;
        this.f33574b = new CopyOnWriteArrayList();
        this.f33575c = new Object();
        this.f33576d = 0;
        j6.execute(new RunnableC3071cq(3, this, context));
    }

    public static synchronized C3663nr a(Context context) {
        C3663nr c3663nr;
        synchronized (C3663nr.class) {
            try {
                if (f33572f == null) {
                    f33572f = new C3663nr(context);
                }
                c3663nr = f33572f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3663nr;
    }

    public final int b() {
        int i;
        synchronized (this.f33575c) {
            i = this.f33576d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f33574b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C2516Bq c2516Bq = (C2516Bq) it.next();
            if (c2516Bq.f24732a.get() == null) {
                copyOnWriteArrayList.remove(c2516Bq);
            }
        }
        synchronized (this.f33575c) {
            try {
                if (this.f33577e && this.f33576d == i) {
                    return;
                }
                this.f33577e = true;
                this.f33576d = i;
                Iterator it2 = this.f33574b.iterator();
                while (it2.hasNext()) {
                    C2516Bq c2516Bq2 = (C2516Bq) it2.next();
                    c2516Bq2.getClass();
                    c2516Bq2.f24733b.execute(new RunnableC3493kj(17, c2516Bq2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
