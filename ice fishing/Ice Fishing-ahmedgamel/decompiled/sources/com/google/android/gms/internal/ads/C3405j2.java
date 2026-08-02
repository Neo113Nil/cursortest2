package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3405j2 implements InterfaceC3945t3 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f31945a;

    public C3405j2(ArrayList arrayList) {
        this.f31945a = arrayList;
        boolean z6 = false;
        if (!arrayList.isEmpty()) {
            long j6 = ((C3353i2) arrayList.get(0)).f31761b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((C3353i2) arrayList.get(i)).f31760a < j6) {
                    z6 = true;
                    break;
                } else {
                    j6 = ((C3353i2) arrayList.get(i)).f31761b;
                    i++;
                }
            }
        }
        AbstractC2792Sd.i(!z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3405j2.class != obj.getClass()) {
            return false;
        }
        return this.f31945a.equals(((C3405j2) obj).f31945a);
    }

    public final int hashCode() {
        return this.f31945a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.f31945a.toString());
    }
}
