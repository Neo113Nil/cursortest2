package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.nn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3659nn extends AbstractBinderC3359i8 implements InterfaceC2501Bb {

    /* renamed from: n, reason: collision with root package name */
    public final String f33551n;

    /* renamed from: u, reason: collision with root package name */
    public final C3873rm f33552u;

    /* renamed from: v, reason: collision with root package name */
    public final C4089vm f33553v;

    public BinderC3659nn(String str, C3873rm c3873rm, C4089vm c4089vm) {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        this.f33551n = str;
        this.f33552u = c3873rm;
        this.f33553v = c4089vm;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        List list;
        InterfaceC3862rb interfaceC3862rb;
        Y2.a aVar;
        switch (i) {
            case 2:
                Y2.b bVar = new Y2.b(this.f33552u);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, bVar);
                return true;
            case 3:
                String a9 = this.f33553v.a();
                parcel2.writeNoException();
                parcel2.writeString(a9);
                return true;
            case 4:
                C4089vm c4089vm = this.f33553v;
                synchronized (c4089vm) {
                    list = c4089vm.f35489e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String c9 = this.f33553v.c();
                parcel2.writeNoException();
                parcel2.writeString(c9);
                return true;
            case 6:
                C4089vm c4089vm2 = this.f33553v;
                synchronized (c4089vm2) {
                    interfaceC3862rb = c4089vm2.f35503t;
                }
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, interfaceC3862rb);
                return true;
            case 7:
                String e9 = this.f33553v.e();
                parcel2.writeNoException();
                parcel2.writeString(e9);
                return true;
            case 8:
                String f2 = this.f33553v.f();
                parcel2.writeNoException();
                parcel2.writeString(f2);
                return true;
            case 9:
                Bundle d9 = this.f33553v.d();
                parcel2.writeNoException();
                AbstractC3411j8.d(parcel2, d9);
                return true;
            case 10:
                this.f33552u.n();
                parcel2.writeNoException();
                return true;
            case 11:
                s2.A0 r9 = this.f33553v.r();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, r9);
                return true;
            case 12:
                Bundle bundle = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
                AbstractC3411j8.f(parcel);
                C3873rm c3873rm = this.f33552u;
                synchronized (c3873rm) {
                    c3873rm.f34503n.d(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
                AbstractC3411j8.f(parcel);
                boolean o4 = this.f33552u.o(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(o4 ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
                AbstractC3411j8.f(parcel);
                C3873rm c3873rm2 = this.f33552u;
                synchronized (c3873rm2) {
                    c3873rm2.f34503n.o(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC3647nb s9 = this.f33553v.s();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, s9);
                return true;
            case 16:
                C4089vm c4089vm3 = this.f33553v;
                synchronized (c4089vm3) {
                    aVar = c4089vm3.f35500q;
                }
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, aVar);
                return true;
            case 17:
                String str = this.f33551n;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
