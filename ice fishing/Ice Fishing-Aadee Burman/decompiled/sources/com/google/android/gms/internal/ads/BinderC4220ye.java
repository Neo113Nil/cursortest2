package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.ye, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4220ye extends AbstractBinderC3336i8 implements InterfaceC2723Pf {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ F2.b f35179n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC4220ye(C4274ze c4274ze, F2.b bVar) {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
        this.f35179n = bVar;
        Objects.requireNonNull(c4274ze);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            AbstractC3388j8.f(parcel);
        } else if (i == 2) {
            String readString = parcel.readString();
            AbstractC3388j8.f(parcel);
            b(readString);
        } else {
            if (i != 3) {
                return false;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC3388j8.b(parcel, Bundle.CREATOR);
            AbstractC3388j8.f(parcel);
            s3(readString2, bundle, readString3);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2723Pf
    public final void b(String str) {
        this.f35179n.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2723Pf
    public final void s3(String str, Bundle bundle, String str2) {
        this.f35179n.onSuccess(new F2.a(new D2.b(str, 3)));
    }
}
