package com.google.android.gms.internal.ads;

import android.os.Parcel;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Ee, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2535Ee extends AbstractBinderC3336i8 {
    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        C4835j.f39730C.f39740h.d("FlagsAccessedBeforeInitialized", new L2.m("Flags were accessed before initialized."));
        parcel2.writeNoException();
        return true;
    }
}
