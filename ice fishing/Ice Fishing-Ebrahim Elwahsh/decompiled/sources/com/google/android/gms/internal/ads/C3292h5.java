package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.h5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3292h5 {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f31143c = AbstractC3346i5.f31315a;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f31144a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f31145b = false;

    public final synchronized void a(String str, long j9) {
        if (this.f31145b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f31144a.add(new C3238g5(str, j9, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        long j9;
        this.f31145b = true;
        ArrayList arrayList = this.f31144a;
        if (arrayList.size() == 0) {
            j9 = 0;
        } else {
            j9 = ((C3238g5) arrayList.get(arrayList.size() - 1)).f30957c - ((C3238g5) arrayList.get(0)).f30957c;
        }
        if (j9 > 0) {
            long j10 = ((C3238g5) arrayList.get(0)).f30957c;
            AbstractC3346i5.b("(%-4d ms) %s", Long.valueOf(j9), str);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C3238g5 c3238g5 = (C3238g5) it.next();
                long j11 = c3238g5.f30957c;
                AbstractC3346i5.b("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(c3238g5.f30956b), c3238g5.f30955a);
                j10 = j11;
            }
        }
    }

    public final void finalize() {
        if (this.f31145b) {
            return;
        }
        b("Request on the loose");
        AbstractC3346i5.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
