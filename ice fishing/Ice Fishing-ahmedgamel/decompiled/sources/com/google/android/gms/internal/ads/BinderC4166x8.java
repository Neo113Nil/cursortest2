package com.google.android.gms.internal.ads;

import android.os.Parcel;
import n2.InterfaceC4769d;

/* renamed from: com.google.android.gms.internal.ads.x8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4166x8 extends AbstractBinderC3359i8 implements s2.V {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f35741u = 0;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4769d f35742n;

    public BinderC4166x8(InterfaceC4769d interfaceC4769d) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.f35742n = interfaceC4769d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        AbstractC3411j8.f(parcel);
        q2(readString, readString2);
        parcel2.writeNoException();
        return true;
    }

    @Override // s2.V
    public final void q2(String str, String str2) {
        this.f35742n.f(str, str2);
    }
}
