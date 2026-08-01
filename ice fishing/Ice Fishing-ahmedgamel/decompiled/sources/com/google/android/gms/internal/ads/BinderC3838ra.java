package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.View;
import p2.InterfaceC4829d;

/* renamed from: com.google.android.gms.internal.ads.ra, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3838ra extends AbstractBinderC3336i8 {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4829d f33638n;

    /* renamed from: u, reason: collision with root package name */
    public final String f33639u;

    /* renamed from: v, reason: collision with root package name */
    public final String f33640v;

    public BinderC3838ra(InterfaceC4829d interfaceC4829d, String str, String str2) {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
        this.f33638n = interfaceC4829d;
        this.f33639u = str;
        this.f33640v = str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f33639u);
            return true;
        }
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(this.f33640v);
            return true;
        }
        InterfaceC4829d interfaceC4829d = this.f33638n;
        if (i == 3) {
            W2.a w02 = W2.b.w0(parcel.readStrongBinder());
            AbstractC3388j8.f(parcel);
            if (w02 != null) {
                interfaceC4829d.e((View) W2.b.F0(w02));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            interfaceC4829d.f();
            parcel2.writeNoException();
            return true;
        }
        if (i != 5) {
            return false;
        }
        interfaceC4829d.i();
        parcel2.writeNoException();
        return true;
    }
}
