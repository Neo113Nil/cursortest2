package com.google.android.gms.internal.consent_sdk;

import com.icefishing.icefishingbigwin.AbstractC4404f;

/* renamed from: com.google.android.gms.internal.consent_sdk.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4323g2 extends C4327h2 {
    @Override // com.google.android.gms.internal.consent_sdk.C4327h2
    public final byte a(int i) {
        if (((47 - (i + 1)) | i) >= 0) {
            return this.f35683u[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC4404f.e(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(D.y.k(i, "Index > length: ", ", 47"));
    }

    @Override // com.google.android.gms.internal.consent_sdk.C4327h2
    public final byte c(int i) {
        return this.f35683u[i];
    }

    @Override // com.google.android.gms.internal.consent_sdk.C4327h2
    public final int d() {
        return 47;
    }
}
