package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Of, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2706Of extends AbstractC0432a implements InterfaceC2723Pf {
    @Override // com.google.android.gms.internal.ads.InterfaceC2723Pf
    public final void b(String str) {
        Parcel H02 = H0();
        H02.writeString(str);
        f1(H02, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2723Pf
    public final void s3(String str, Bundle bundle, String str2) {
        Parcel H02 = H0();
        H02.writeString(str);
        H02.writeString(str2);
        AbstractC3388j8.c(H02, bundle);
        f1(H02, 3);
    }
}
