package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.mn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3582mn extends AbstractBinderC3336i8 implements InterfaceC2481Bb {

    /* renamed from: n, reason: collision with root package name */
    public final String f32577n;

    /* renamed from: u, reason: collision with root package name */
    public final C3797qm f32578u;

    /* renamed from: v, reason: collision with root package name */
    public final C4012um f32579v;

    public BinderC3582mn(String str, C3797qm c3797qm, C4012um c4012um) {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        this.f32577n = str;
        this.f32578u = c3797qm;
        this.f32579v = c4012um;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        List list;
        InterfaceC3839rb interfaceC3839rb;
        W2.a aVar;
        switch (i) {
            case 2:
                W2.b bVar = new W2.b(this.f32578u);
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, bVar);
                return true;
            case 3:
                String a9 = this.f32579v.a();
                parcel2.writeNoException();
                parcel2.writeString(a9);
                return true;
            case 4:
                C4012um c4012um = this.f32579v;
                synchronized (c4012um) {
                    list = c4012um.f34568e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String c9 = this.f32579v.c();
                parcel2.writeNoException();
                parcel2.writeString(c9);
                return true;
            case 6:
                C4012um c4012um2 = this.f32579v;
                synchronized (c4012um2) {
                    interfaceC3839rb = c4012um2.f34582t;
                }
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, interfaceC3839rb);
                return true;
            case 7:
                String e9 = this.f32579v.e();
                parcel2.writeNoException();
                parcel2.writeString(e9);
                return true;
            case 8:
                String f3 = this.f32579v.f();
                parcel2.writeNoException();
                parcel2.writeString(f3);
                return true;
            case 9:
                Bundle d2 = this.f32579v.d();
                parcel2.writeNoException();
                AbstractC3388j8.d(parcel2, d2);
                return true;
            case 10:
                this.f32578u.n();
                parcel2.writeNoException();
                return true;
            case 11:
                q2.A0 r9 = this.f32579v.r();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, r9);
                return true;
            case 12:
                Bundle bundle = (Bundle) AbstractC3388j8.b(parcel, Bundle.CREATOR);
                AbstractC3388j8.f(parcel);
                C3797qm c3797qm = this.f32578u;
                synchronized (c3797qm) {
                    c3797qm.f33403n.d(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) AbstractC3388j8.b(parcel, Bundle.CREATOR);
                AbstractC3388j8.f(parcel);
                boolean o6 = this.f32578u.o(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(o6 ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) AbstractC3388j8.b(parcel, Bundle.CREATOR);
                AbstractC3388j8.f(parcel);
                C3797qm c3797qm2 = this.f32578u;
                synchronized (c3797qm2) {
                    c3797qm2.f33403n.o(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC3624nb s9 = this.f32579v.s();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, s9);
                return true;
            case 16:
                C4012um c4012um3 = this.f32579v;
                synchronized (c4012um3) {
                    aVar = c4012um3.f34579q;
                }
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, aVar);
                return true;
            case 17:
                String str = this.f32577n;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
