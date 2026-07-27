package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.nr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3640nr {

    /* renamed from: f, reason: collision with root package name */
    public static C3640nr f32785f;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f32786a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f32787b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f32788c;

    /* renamed from: d, reason: collision with root package name */
    public int f32789d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32790e;

    public C3640nr(Context context) {
        Executor j6 = AbstractC3043cl.j();
        this.f32786a = j6;
        this.f32787b = new CopyOnWriteArrayList();
        this.f32788c = new Object();
        this.f32789d = 0;
        j6.execute(new RunnableC3048cq(3, this, context));
    }

    public static synchronized C3640nr a(Context context) {
        C3640nr c3640nr;
        synchronized (C3640nr.class) {
            try {
                if (f32785f == null) {
                    f32785f = new C3640nr(context);
                }
                c3640nr = f32785f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3640nr;
    }

    public final int b() {
        int i;
        synchronized (this.f32788c) {
            i = this.f32789d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f32787b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C2496Bq c2496Bq = (C2496Bq) it.next();
            if (c2496Bq.f23969a.get() == null) {
                copyOnWriteArrayList.remove(c2496Bq);
            }
        }
        synchronized (this.f32788c) {
            try {
                if (this.f32790e && this.f32789d == i) {
                    return;
                }
                this.f32790e = true;
                this.f32789d = i;
                Iterator it2 = this.f32787b.iterator();
                while (it2.hasNext()) {
                    C2496Bq c2496Bq2 = (C2496Bq) it2.next();
                    c2496Bq2.getClass();
                    c2496Bq2.f23970b.execute(new RunnableC3470kj(17, c2496Bq2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
