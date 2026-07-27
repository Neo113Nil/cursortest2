package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.j5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3385j5 {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f31166c = AbstractC3439k5.f31377a;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f31167a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f31168b = false;

    public final synchronized void a(String str, long j6) {
        if (this.f31168b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f31167a.add(new C3333i5(str, j6, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        long j6;
        this.f31168b = true;
        ArrayList arrayList = this.f31167a;
        if (arrayList.size() == 0) {
            j6 = 0;
        } else {
            j6 = ((C3333i5) arrayList.get(arrayList.size() - 1)).f31004c - ((C3333i5) arrayList.get(0)).f31004c;
        }
        if (j6 > 0) {
            long j9 = ((C3333i5) arrayList.get(0)).f31004c;
            AbstractC3439k5.b("(%-4d ms) %s", Long.valueOf(j6), str);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C3333i5 c3333i5 = (C3333i5) it.next();
                long j10 = c3333i5.f31004c;
                AbstractC3439k5.b("(+%-4d) [%2d] %s", Long.valueOf(j10 - j9), Long.valueOf(c3333i5.f31003b), c3333i5.f31002a);
                j9 = j10;
            }
        }
    }

    public final void finalize() {
        if (this.f31168b) {
            return;
        }
        b("Request on the loose");
        AbstractC3439k5.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
