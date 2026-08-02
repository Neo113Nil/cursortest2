package v2;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j3.C4614c;

/* renamed from: v2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5101e extends S2.a {
    public static final Parcelable.Creator<C5101e> CREATOR = new C4614c(12);

    /* renamed from: A, reason: collision with root package name */
    public final Intent f41120A;

    /* renamed from: B, reason: collision with root package name */
    public final InterfaceC5097a f41121B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f41122C;

    /* renamed from: D, reason: collision with root package name */
    public final Bundle f41123D;

    /* renamed from: n, reason: collision with root package name */
    public final String f41124n;

    /* renamed from: u, reason: collision with root package name */
    public final String f41125u;

    /* renamed from: v, reason: collision with root package name */
    public final String f41126v;

    /* renamed from: w, reason: collision with root package name */
    public final String f41127w;

    /* renamed from: x, reason: collision with root package name */
    public final String f41128x;

    /* renamed from: y, reason: collision with root package name */
    public final String f41129y;

    /* renamed from: z, reason: collision with root package name */
    public final String f41130z;

    public C5101e(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z6, Bundle bundle) {
        this.f41124n = str;
        this.f41125u = str2;
        this.f41126v = str3;
        this.f41127w = str4;
        this.f41128x = str5;
        this.f41129y = str6;
        this.f41130z = str7;
        this.f41120A = intent;
        this.f41121B = (InterfaceC5097a) Y2.b.D0(Y2.b.t0(iBinder));
        this.f41122C = z6;
        this.f41123D = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.r(parcel, 2, this.f41124n);
        com.bumptech.glide.e.r(parcel, 3, this.f41125u);
        com.bumptech.glide.e.r(parcel, 4, this.f41126v);
        com.bumptech.glide.e.r(parcel, 5, this.f41127w);
        com.bumptech.glide.e.r(parcel, 6, this.f41128x);
        com.bumptech.glide.e.r(parcel, 7, this.f41129y);
        com.bumptech.glide.e.r(parcel, 8, this.f41130z);
        com.bumptech.glide.e.q(parcel, 9, this.f41120A, i);
        com.bumptech.glide.e.p(parcel, 10, new Y2.b(this.f41121B));
        com.bumptech.glide.e.w(parcel, 11, 4);
        parcel.writeInt(this.f41122C ? 1 : 0);
        com.bumptech.glide.e.n(parcel, 12, this.f41123D);
        com.bumptech.glide.e.z(parcel, x9);
    }

    public C5101e(Intent intent, InterfaceC5097a interfaceC5097a) {
        this(null, null, null, null, null, null, null, intent, new Y2.b(interfaceC5097a), false, new Bundle());
    }

    public C5101e(String str, String str2, String str3, String str4, String str5, String str6, String str7, InterfaceC5097a interfaceC5097a) {
        this(str, str2, str3, str4, str5, str6, str7, null, new Y2.b(interfaceC5097a), false, new Bundle());
    }
}
