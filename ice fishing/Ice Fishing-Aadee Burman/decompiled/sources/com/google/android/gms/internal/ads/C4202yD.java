package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.yD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4202yD extends AbstractC4094wD {
    @Override // com.google.android.gms.internal.ads.AbstractC4094wD
    public final void b(AbstractC4040vD abstractC4040vD, Set set) {
        synchronized (abstractC4040vD) {
            try {
                if (abstractC4040vD.f35311A == null) {
                    abstractC4040vD.f35311A = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4094wD
    public final int e(AbstractC4040vD abstractC4040vD) {
        int i;
        synchronized (abstractC4040vD) {
            i = abstractC4040vD.f35312B - 1;
            abstractC4040vD.f35312B = i;
        }
        return i;
    }
}
