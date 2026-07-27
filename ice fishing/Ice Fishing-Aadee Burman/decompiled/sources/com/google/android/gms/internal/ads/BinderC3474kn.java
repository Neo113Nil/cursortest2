package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.anythink.core.c.b.e;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.kn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3474kn extends AbstractBinderC3336i8 implements InterfaceC2464Ab {

    /* renamed from: n, reason: collision with root package name */
    public final String f31629n;

    /* renamed from: u, reason: collision with root package name */
    public final C3797qm f31630u;

    /* renamed from: v, reason: collision with root package name */
    public final C4012um f31631v;

    public BinderC3474kn(String str, C3797qm c3797qm, C4012um c4012um) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        this.f31629n = str;
        this.f31630u = c3797qm;
        this.f31631v = c4012um;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        List list;
        InterfaceC3839rb interfaceC3839rb;
        double d2;
        String p9;
        String p10;
        W2.a aVar;
        C3797qm c3797qm = this.f31630u;
        C4012um c4012um = this.f31631v;
        switch (i) {
            case 2:
                W2.b bVar = new W2.b(c3797qm);
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, bVar);
                return true;
            case 3:
                String a9 = c4012um.a();
                parcel2.writeNoException();
                parcel2.writeString(a9);
                return true;
            case 4:
                synchronized (c4012um) {
                    list = c4012um.f34568e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String c9 = c4012um.c();
                parcel2.writeNoException();
                parcel2.writeString(c9);
                return true;
            case 6:
                synchronized (c4012um) {
                    interfaceC3839rb = c4012um.f34581s;
                }
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, interfaceC3839rb);
                return true;
            case 7:
                String e9 = c4012um.e();
                parcel2.writeNoException();
                parcel2.writeString(e9);
                return true;
            case 8:
                synchronized (c4012um) {
                    d2 = c4012um.f34580r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d2);
                return true;
            case 9:
                synchronized (c4012um) {
                    p9 = c4012um.p("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(p9);
                return true;
            case 10:
                synchronized (c4012um) {
                    p10 = c4012um.p(e.a.f12068h);
                }
                parcel2.writeNoException();
                parcel2.writeString(p10);
                return true;
            case 11:
                Bundle d9 = c4012um.d();
                parcel2.writeNoException();
                AbstractC3388j8.d(parcel2, d9);
                return true;
            case 12:
                c3797qm.n();
                parcel2.writeNoException();
                return true;
            case 13:
                q2.A0 r9 = c4012um.r();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, r9);
                return true;
            case 14:
                Bundle bundle = (Bundle) AbstractC3388j8.b(parcel, Bundle.CREATOR);
                AbstractC3388j8.f(parcel);
                synchronized (c3797qm) {
                    c3797qm.f33403n.d(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) AbstractC3388j8.b(parcel, Bundle.CREATOR);
                AbstractC3388j8.f(parcel);
                boolean o6 = c3797qm.o(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(o6 ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) AbstractC3388j8.b(parcel, Bundle.CREATOR);
                AbstractC3388j8.f(parcel);
                synchronized (c3797qm) {
                    c3797qm.f33403n.o(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 17:
                InterfaceC3624nb s9 = c4012um.s();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, s9);
                return true;
            case 18:
                synchronized (c4012um) {
                    aVar = c4012um.f34579q;
                }
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, aVar);
                return true;
            case 19:
                parcel2.writeNoException();
                parcel2.writeString(this.f31629n);
                return true;
            default:
                return false;
        }
    }
}
