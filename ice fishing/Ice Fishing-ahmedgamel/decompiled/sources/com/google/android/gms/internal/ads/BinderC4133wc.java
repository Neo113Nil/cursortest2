package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.wc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4133wc extends AbstractBinderC3359i8 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3490kg f35621n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC4133wc(C4187xc c4187xc, C3490kg c3490kg) {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
        this.f35621n = c3490kg;
        Objects.requireNonNull(c4187xc);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC3411j8.b(parcel, ParcelFileDescriptor.CREATOR);
        AbstractC3411j8.f(parcel);
        this.f35621n.b(parcelFileDescriptor);
        return true;
    }
}
