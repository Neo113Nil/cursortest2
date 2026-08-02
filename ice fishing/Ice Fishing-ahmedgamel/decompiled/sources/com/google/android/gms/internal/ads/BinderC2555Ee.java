package com.google.android.gms.internal.ads;

import android.os.Parcel;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Ee, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2555Ee extends AbstractBinderC3359i8 {
    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        C4906k.f40186C.f40196h.d("FlagsAccessedBeforeInitialized", new N2.n("Flags were accessed before initialized."));
        parcel2.writeNoException();
        return true;
    }
}
