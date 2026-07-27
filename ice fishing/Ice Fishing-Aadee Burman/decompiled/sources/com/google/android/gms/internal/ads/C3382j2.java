package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3382j2 implements InterfaceC3922t3 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f31158a;

    public C3382j2(ArrayList arrayList) {
        this.f31158a = arrayList;
        boolean z3 = false;
        if (!arrayList.isEmpty()) {
            long j6 = ((C3330i2) arrayList.get(0)).f30988b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((C3330i2) arrayList.get(i)).f30987a < j6) {
                    z3 = true;
                    break;
                } else {
                    j6 = ((C3330i2) arrayList.get(i)).f30988b;
                    i++;
                }
            }
        }
        AbstractC2772Sd.i(!z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3382j2.class != obj.getClass()) {
            return false;
        }
        return this.f31158a.equals(((C3382j2) obj).f31158a);
    }

    public final int hashCode() {
        return this.f31158a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.f31158a.toString());
    }
}
