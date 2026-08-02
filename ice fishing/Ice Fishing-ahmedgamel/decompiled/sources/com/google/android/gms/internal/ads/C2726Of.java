package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import c3.AbstractC0549a;

/* renamed from: com.google.android.gms.internal.ads.Of, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2726Of extends AbstractC0549a implements InterfaceC2743Pf {
    @Override // com.google.android.gms.internal.ads.InterfaceC2743Pf
    public final void b(String str) {
        Parcel F02 = F0();
        F02.writeString(str);
        d1(F02, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2743Pf
    public final void l3(String str, Bundle bundle, String str2) {
        Parcel F02 = F0();
        F02.writeString(str);
        F02.writeString(str2);
        AbstractC3411j8.c(F02, bundle);
        d1(F02, 3);
    }
}
