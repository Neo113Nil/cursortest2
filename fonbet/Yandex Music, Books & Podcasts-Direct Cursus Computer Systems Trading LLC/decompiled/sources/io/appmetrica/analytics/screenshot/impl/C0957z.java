package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfi;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.screenshot.impl.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0957z implements Parcelable {

    @NotNull
    public static final C0956y CREATOR = new C0956y();
    public final boolean a;

    public C0957z(h0 h0Var) {
        this(h0Var.a());
    }

    public final boolean a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return dfi.j(new StringBuilder("ParcelableApiCaptorConfig(enabled="), this.a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }

    public C0957z(boolean z) {
        this.a = z;
    }
}
