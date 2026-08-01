package com.google.android.gms.internal.ads;

import android.os.Parcel;
import l2.InterfaceC4660d;

/* renamed from: com.google.android.gms.internal.ads.x8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4143x8 extends AbstractBinderC3336i8 implements q2.V {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f34960u = 0;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4660d f34961n;

    public BinderC4143x8(InterfaceC4660d interfaceC4660d) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.f34961n = interfaceC4660d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        AbstractC3388j8.f(parcel);
        u2(readString, readString2);
        parcel2.writeNoException();
        return true;
    }

    @Override // q2.V
    public final void u2(String str, String str2) {
        this.f34961n.f(str, str2);
    }
}
