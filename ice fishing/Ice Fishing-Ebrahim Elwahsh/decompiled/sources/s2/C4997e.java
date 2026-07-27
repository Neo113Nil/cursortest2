package s2;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import f3.C4509h;

/* renamed from: s2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4997e extends P2.a {
    public static final Parcelable.Creator<C4997e> CREATOR = new C4509h(7);

    /* renamed from: A, reason: collision with root package name */
    public final Intent f40461A;

    /* renamed from: B, reason: collision with root package name */
    public final InterfaceC4993a f40462B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f40463C;

    /* renamed from: D, reason: collision with root package name */
    public final Bundle f40464D;

    /* renamed from: n, reason: collision with root package name */
    public final String f40465n;

    /* renamed from: u, reason: collision with root package name */
    public final String f40466u;

    /* renamed from: v, reason: collision with root package name */
    public final String f40467v;

    /* renamed from: w, reason: collision with root package name */
    public final String f40468w;

    /* renamed from: x, reason: collision with root package name */
    public final String f40469x;

    /* renamed from: y, reason: collision with root package name */
    public final String f40470y;

    /* renamed from: z, reason: collision with root package name */
    public final String f40471z;

    public C4997e(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z8, Bundle bundle) {
        this.f40465n = str;
        this.f40466u = str2;
        this.f40467v = str3;
        this.f40468w = str4;
        this.f40469x = str5;
        this.f40470y = str6;
        this.f40471z = str7;
        this.f40461A = intent;
        this.f40462B = (InterfaceC4993a) V2.b.A0(V2.b.u0(iBinder));
        this.f40463C = z8;
        this.f40464D = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.u(parcel, 2, this.f40465n);
        S0.f.u(parcel, 3, this.f40466u);
        S0.f.u(parcel, 4, this.f40467v);
        S0.f.u(parcel, 5, this.f40468w);
        S0.f.u(parcel, 6, this.f40469x);
        S0.f.u(parcel, 7, this.f40470y);
        S0.f.u(parcel, 8, this.f40471z);
        S0.f.t(parcel, 9, this.f40461A, i);
        S0.f.s(parcel, 10, new V2.b(this.f40462B));
        S0.f.A(parcel, 11, 4);
        parcel.writeInt(this.f40463C ? 1 : 0);
        S0.f.q(parcel, 12, this.f40464D);
        S0.f.C(parcel, B8);
    }

    public C4997e(Intent intent, InterfaceC4993a interfaceC4993a) {
        this(null, null, null, null, null, null, null, intent, new V2.b(interfaceC4993a), false, new Bundle());
    }

    public C4997e(String str, String str2, String str3, String str4, String str5, String str6, String str7, InterfaceC4993a interfaceC4993a) {
        this(str, str2, str3, str4, str5, str6, str7, null, new V2.b(interfaceC4993a), false, new Bundle());
    }
}
