package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.yD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4225yD extends AbstractC4117wD {
    @Override // com.google.android.gms.internal.ads.AbstractC4117wD
    public final void b(AbstractC4063vD abstractC4063vD, Set set) {
        synchronized (abstractC4063vD) {
            try {
                if (abstractC4063vD.f36095A == null) {
                    abstractC4063vD.f36095A = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4117wD
    public final int e(AbstractC4063vD abstractC4063vD) {
        int i;
        synchronized (abstractC4063vD) {
            i = abstractC4063vD.f36096B - 1;
            abstractC4063vD.f36096B = i;
        }
        return i;
    }
}
