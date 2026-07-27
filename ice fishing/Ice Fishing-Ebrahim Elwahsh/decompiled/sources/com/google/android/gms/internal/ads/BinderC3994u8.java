package com.google.android.gms.internal.ads;

import android.os.Parcel;
import l2.InterfaceC4689d;

/* renamed from: com.google.android.gms.internal.ads.u8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3994u8 extends AbstractBinderC3186f8 implements q2.V {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f34545u = 0;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4689d f34546n;

    public BinderC3994u8(InterfaceC4689d interfaceC4689d) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.f34546n = interfaceC4689d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        AbstractC3241g8.f(parcel);
        m0(readString, readString2);
        parcel2.writeNoException();
        return true;
    }

    @Override // q2.V
    public final void m0(String str, String str2) {
        this.f34546n.l(str, str2);
    }
}
