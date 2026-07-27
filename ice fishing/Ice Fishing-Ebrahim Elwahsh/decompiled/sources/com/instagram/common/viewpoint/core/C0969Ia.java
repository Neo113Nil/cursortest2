package com.instagram.common.viewpoint.core;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Ia, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0969Ia {
    public final int A00;
    public final long A01;

    public C0969Ia(int i, long j9) {
        this.A00 = i;
        this.A01 = j9;
    }

    public /* synthetic */ C0969Ia(int i, long j9, IZ iz) {
        this(i, j9);
    }

    public static C0969Ia A00(Parcel parcel) {
        return new C0969Ia(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
