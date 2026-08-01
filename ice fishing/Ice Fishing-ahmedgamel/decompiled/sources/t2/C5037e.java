package t2;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import h3.C4566c;

/* renamed from: t2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5037e extends Q2.a {
    public static final Parcelable.Creator<C5037e> CREATOR = new C4566c(12);

    /* renamed from: A, reason: collision with root package name */
    public final Intent f40832A;

    /* renamed from: B, reason: collision with root package name */
    public final InterfaceC5033a f40833B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f40834C;

    /* renamed from: D, reason: collision with root package name */
    public final Bundle f40835D;

    /* renamed from: n, reason: collision with root package name */
    public final String f40836n;

    /* renamed from: u, reason: collision with root package name */
    public final String f40837u;

    /* renamed from: v, reason: collision with root package name */
    public final String f40838v;

    /* renamed from: w, reason: collision with root package name */
    public final String f40839w;

    /* renamed from: x, reason: collision with root package name */
    public final String f40840x;

    /* renamed from: y, reason: collision with root package name */
    public final String f40841y;

    /* renamed from: z, reason: collision with root package name */
    public final String f40842z;

    public C5037e(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z3, Bundle bundle) {
        this.f40836n = str;
        this.f40837u = str2;
        this.f40838v = str3;
        this.f40839w = str4;
        this.f40840x = str5;
        this.f40841y = str6;
        this.f40842z = str7;
        this.f40832A = intent;
        this.f40833B = (InterfaceC5033a) W2.b.F0(W2.b.w0(iBinder));
        this.f40834C = z3;
        this.f40835D = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.z(parcel, 2, this.f40836n);
        A8.b.z(parcel, 3, this.f40837u);
        A8.b.z(parcel, 4, this.f40838v);
        A8.b.z(parcel, 5, this.f40839w);
        A8.b.z(parcel, 6, this.f40840x);
        A8.b.z(parcel, 7, this.f40841y);
        A8.b.z(parcel, 8, this.f40842z);
        A8.b.y(parcel, 9, this.f40832A, i);
        A8.b.x(parcel, 10, new W2.b(this.f40833B));
        A8.b.F(parcel, 11, 4);
        parcel.writeInt(this.f40834C ? 1 : 0);
        A8.b.v(parcel, 12, this.f40835D);
        A8.b.I(parcel, G7);
    }

    public C5037e(Intent intent, InterfaceC5033a interfaceC5033a) {
        this(null, null, null, null, null, null, null, intent, new W2.b(interfaceC5033a), false, new Bundle());
    }

    public C5037e(String str, String str2, String str3, String str4, String str5, String str6, String str7, InterfaceC5033a interfaceC5033a) {
        this(str, str2, str3, str4, str5, str6, str7, null, new W2.b(interfaceC5033a), false, new Bundle());
    }
}
