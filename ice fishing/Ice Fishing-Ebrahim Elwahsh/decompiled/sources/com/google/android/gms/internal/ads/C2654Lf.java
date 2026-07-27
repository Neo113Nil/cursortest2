package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Lf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2654Lf extends Z2.a implements InterfaceC2671Mf {
    @Override // com.google.android.gms.internal.ads.InterfaceC2671Mf
    public final void B3(String str, Bundle bundle, String str2) {
        Parcel A02 = A0();
        A02.writeString(str);
        A02.writeString(str2);
        AbstractC3241g8.c(A02, bundle);
        G0(A02, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2671Mf
    public final void b(String str) {
        Parcel A02 = A0();
        A02.writeString(str);
        G0(A02, 2);
    }
}
