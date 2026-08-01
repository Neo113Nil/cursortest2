package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.Parcel;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;

/* renamed from: com.google.android.gms.internal.ads.Cb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2498Cb extends AbstractC0432a implements InterfaceC2515Db {
    public C2498Cb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2515Db
    public final boolean Q3(W2.a aVar) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        Parcel M02 = M0(H02, 10);
        boolean z3 = M02.readInt() != 0;
        M02.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2515Db
    public final W2.a b0() {
        return AbstractC4404f.c(M0(H0(), 9));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2515Db
    public final String g() {
        Parcel M02 = M0(H0(), 4);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }
}
