package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.zD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4269zD extends AbstractC4161xD {
    @Override // com.google.android.gms.internal.ads.AbstractC4161xD
    public final void c(AbstractC4107wD abstractC4107wD, Set set) {
        synchronized (abstractC4107wD) {
            try {
                if (abstractC4107wD.f23842A == null) {
                    abstractC4107wD.f23842A = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4161xD
    public final int g(AbstractC4107wD abstractC4107wD) {
        int i;
        synchronized (abstractC4107wD) {
            i = abstractC4107wD.f23843B - 1;
            abstractC4107wD.f23843B = i;
        }
        return i;
    }
}
