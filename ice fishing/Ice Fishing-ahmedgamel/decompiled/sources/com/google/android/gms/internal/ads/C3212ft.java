package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.ft, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3212ft {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f30467b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f30468a;

    public C3212ft(Handler handler) {
        this.f30468a = handler;
    }

    public static /* synthetic */ void f(C3104dt c3104dt) {
        ArrayList arrayList = f30467b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(c3104dt);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C3104dt g() {
        C3104dt c3104dt;
        ArrayList arrayList = f30467b;
        synchronized (arrayList) {
            try {
                c3104dt = arrayList.isEmpty() ? new C3104dt() : (C3104dt) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3104dt;
    }

    public final boolean a() {
        return this.f30468a.hasMessages(37);
    }

    public final C3104dt b(int i, Object obj) {
        C3104dt g4 = g();
        g4.f29857a = this.f30468a.obtainMessage(i, obj);
        return g4;
    }

    public final boolean c(int i) {
        return this.f30468a.sendEmptyMessage(i);
    }

    public final void d(int i) {
        this.f30468a.removeMessages(i);
    }

    public final boolean e(Runnable runnable) {
        return this.f30468a.post(runnable);
    }
}
