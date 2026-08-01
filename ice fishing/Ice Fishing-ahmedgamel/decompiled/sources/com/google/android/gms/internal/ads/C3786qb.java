package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3786qb extends AbstractC0432a implements InterfaceC3839rb {
    public C3786qb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3839rb
    public final W2.a c() {
        return AbstractC4404f.c(M0(H0(), 1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3839rb
    public final int d() {
        Parcel M02 = M0(H0(), 5);
        int readInt = M02.readInt();
        M02.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3839rb
    public final Map e() {
        Parcel M02 = M0(H0(), 6);
        HashMap readHashMap = M02.readHashMap(AbstractC3388j8.f31199a);
        M02.recycle();
        return readHashMap;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3839rb
    public final Uri f() {
        Parcel M02 = M0(H0(), 2);
        Uri uri = (Uri) AbstractC3388j8.b(M02, Uri.CREATOR);
        M02.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3839rb
    public final double i() {
        Parcel M02 = M0(H0(), 3);
        double readDouble = M02.readDouble();
        M02.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3839rb
    public final int o() {
        Parcel M02 = M0(H0(), 4);
        int readInt = M02.readInt();
        M02.recycle();
        return readInt;
    }
}
