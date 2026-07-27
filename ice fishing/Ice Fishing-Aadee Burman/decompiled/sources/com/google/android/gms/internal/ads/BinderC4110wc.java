package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.wc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4110wc extends AbstractBinderC3336i8 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3467kg f34844n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC4110wc(C4164xc c4164xc, C3467kg c3467kg) {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
        this.f34844n = c3467kg;
        Objects.requireNonNull(c4164xc);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC3388j8.b(parcel, ParcelFileDescriptor.CREATOR);
        AbstractC3388j8.f(parcel);
        this.f34844n.b(parcelFileDescriptor);
        return true;
    }
}
