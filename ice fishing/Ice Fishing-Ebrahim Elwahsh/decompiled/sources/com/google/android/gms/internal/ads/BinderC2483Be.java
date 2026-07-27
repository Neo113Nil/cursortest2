package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Be, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2483Be extends AbstractBinderC3186f8 {
    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        p2.j.f39798C.f39808h.d("FlagsAccessedBeforeInitialized", new K2.m("Flags were accessed before initialized."));
        parcel2.writeNoException();
        return true;
    }
}
