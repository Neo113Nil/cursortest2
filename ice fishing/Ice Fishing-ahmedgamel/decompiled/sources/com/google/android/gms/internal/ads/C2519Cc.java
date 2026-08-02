package com.google.android.gms.internal.ads;

import android.os.Parcel;
import c3.AbstractC0549a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Cc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2519Cc extends AbstractC0549a implements InterfaceC2536Dc {
    @Override // com.google.android.gms.internal.ads.InterfaceC2536Dc
    public final void C1(List list) {
        Parcel F02 = F0();
        F02.writeTypedList(list);
        d1(F02, 1);
    }
}
