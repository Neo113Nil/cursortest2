package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.ft, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3235ft {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f31230b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f31231a;

    public C3235ft(Handler handler) {
        this.f31231a = handler;
    }

    public static /* synthetic */ void f(C3127dt c3127dt) {
        ArrayList arrayList = f31230b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(c3127dt);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C3127dt g() {
        C3127dt c3127dt;
        ArrayList arrayList = f31230b;
        synchronized (arrayList) {
            try {
                c3127dt = arrayList.isEmpty() ? new C3127dt() : (C3127dt) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3127dt;
    }

    public final boolean a() {
        return this.f31231a.hasMessages(37);
    }

    public final C3127dt b(int i, Object obj) {
        C3127dt g9 = g();
        g9.f30645a = this.f31231a.obtainMessage(i, obj);
        return g9;
    }

    public final boolean c(int i) {
        return this.f31231a.sendEmptyMessage(i);
    }

    public final void d(int i) {
        this.f31231a.removeMessages(i);
    }

    public final boolean e(Runnable runnable) {
        return this.f31231a.post(runnable);
    }
}
