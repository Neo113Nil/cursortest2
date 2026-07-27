package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.rc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3853rc extends AbstractBinderC3186f8 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3320hg f34046n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3853rc(C3907sc c3907sc, C3320hg c3320hg) {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
        this.f34046n = c3320hg;
        Objects.requireNonNull(c3907sc);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC3241g8.b(parcel, ParcelFileDescriptor.CREATOR);
        AbstractC3241g8.f(parcel);
        this.f34046n.a(parcelFileDescriptor);
        return true;
    }
}
