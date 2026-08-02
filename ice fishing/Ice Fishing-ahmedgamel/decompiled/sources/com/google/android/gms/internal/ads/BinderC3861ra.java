package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.View;
import r2.InterfaceC4899d;

/* renamed from: com.google.android.gms.internal.ads.ra, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3861ra extends AbstractBinderC3359i8 {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4899d f34411n;

    /* renamed from: u, reason: collision with root package name */
    public final String f34412u;

    /* renamed from: v, reason: collision with root package name */
    public final String f34413v;

    public BinderC3861ra(InterfaceC4899d interfaceC4899d, String str, String str2) {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
        this.f34411n = interfaceC4899d;
        this.f34412u = str;
        this.f34413v = str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f34412u);
            return true;
        }
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(this.f34413v);
            return true;
        }
        InterfaceC4899d interfaceC4899d = this.f34411n;
        if (i == 3) {
            Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
            AbstractC3411j8.f(parcel);
            if (t02 != null) {
                interfaceC4899d.e((View) Y2.b.D0(t02));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            interfaceC4899d.f();
            parcel2.writeNoException();
            return true;
        }
        if (i != 5) {
            return false;
        }
        interfaceC4899d.i();
        parcel2.writeNoException();
        return true;
    }
}
