package com.instagram.common.viewpoint.core;

import android.database.Observable;

/* renamed from: com.facebook.ads.redexgen.X.Qr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1189Qr extends Observable<AbstractC1190Qs> {
    public final void A00() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC1190Qs) this.mObservers.get(size)).A00();
        }
    }
}
