package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.ye, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4243ye extends AbstractBinderC3359i8 implements InterfaceC2743Pf {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ H2.b f35969n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC4243ye(C4297ze c4297ze, H2.b bVar) {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
        this.f35969n = bVar;
        Objects.requireNonNull(c4297ze);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            AbstractC3411j8.f(parcel);
        } else if (i == 2) {
            String readString = parcel.readString();
            AbstractC3411j8.f(parcel);
            b(readString);
        } else {
            if (i != 3) {
                return false;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
            AbstractC3411j8.f(parcel);
            l3(readString2, bundle, readString3);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2743Pf
    public final void b(String str) {
        this.f35969n.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2743Pf
    public final void l3(String str, Bundle bundle, String str2) {
        this.f35969n.onSuccess(new H2.a(new N3.s(str)));
    }
}
