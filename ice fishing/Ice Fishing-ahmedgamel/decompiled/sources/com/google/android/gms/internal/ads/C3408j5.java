package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.j5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3408j5 {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f31953c = AbstractC3462k5.f32156a;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f31954a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f31955b = false;

    public final synchronized void a(String str, long j6) {
        if (this.f31955b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f31954a.add(new C3356i5(str, j6, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        long j6;
        this.f31955b = true;
        ArrayList arrayList = this.f31954a;
        if (arrayList.size() == 0) {
            j6 = 0;
        } else {
            j6 = ((C3356i5) arrayList.get(arrayList.size() - 1)).f31777c - ((C3356i5) arrayList.get(0)).f31777c;
        }
        if (j6 > 0) {
            long j9 = ((C3356i5) arrayList.get(0)).f31777c;
            AbstractC3462k5.b("(%-4d ms) %s", Long.valueOf(j6), str);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C3356i5 c3356i5 = (C3356i5) it.next();
                long j10 = c3356i5.f31777c;
                AbstractC3462k5.b("(+%-4d) [%2d] %s", Long.valueOf(j10 - j9), Long.valueOf(c3356i5.f31776b), c3356i5.f31775a);
                j9 = j10;
            }
        }
    }

    public final void finalize() {
        if (this.f31955b) {
            return;
        }
        b("Request on the loose");
        AbstractC3462k5.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
