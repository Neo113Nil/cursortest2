package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.sC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3877sC extends AbstractC3446kC implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return C3649o.f32822k.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3877sC)) {
            return false;
        }
        HB hb = C3649o.f32822k;
        ((C3877sC) obj).getClass();
        return hb.equals(hb);
    }

    public final int hashCode() {
        return -C3649o.f32822k.hashCode();
    }

    public final String toString() {
        return C3649o.f32822k.toString().concat(".reverse()");
    }
}
