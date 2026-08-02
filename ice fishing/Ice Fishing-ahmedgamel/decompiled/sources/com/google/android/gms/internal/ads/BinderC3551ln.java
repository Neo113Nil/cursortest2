package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.anythink.core.c.b.e;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ln, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3551ln extends AbstractBinderC3359i8 implements InterfaceC2484Ab {

    /* renamed from: n, reason: collision with root package name */
    public final String f32627n;

    /* renamed from: u, reason: collision with root package name */
    public final C3873rm f32628u;

    /* renamed from: v, reason: collision with root package name */
    public final C4089vm f32629v;

    public BinderC3551ln(String str, C3873rm c3873rm, C4089vm c4089vm) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        this.f32627n = str;
        this.f32628u = c3873rm;
        this.f32629v = c4089vm;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        List list;
        InterfaceC3862rb interfaceC3862rb;
        double d9;
        String p9;
        String p10;
        Y2.a aVar;
        C3873rm c3873rm = this.f32628u;
        C4089vm c4089vm = this.f32629v;
        switch (i) {
            case 2:
                Y2.b bVar = new Y2.b(c3873rm);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, bVar);
                return true;
            case 3:
                String a9 = c4089vm.a();
                parcel2.writeNoException();
                parcel2.writeString(a9);
                return true;
            case 4:
                synchronized (c4089vm) {
                    list = c4089vm.f35489e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String c9 = c4089vm.c();
                parcel2.writeNoException();
                parcel2.writeString(c9);
                return true;
            case 6:
                synchronized (c4089vm) {
                    interfaceC3862rb = c4089vm.f35502s;
                }
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, interfaceC3862rb);
                return true;
            case 7:
                String e9 = c4089vm.e();
                parcel2.writeNoException();
                parcel2.writeString(e9);
                return true;
            case 8:
                synchronized (c4089vm) {
                    d9 = c4089vm.f35501r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d9);
                return true;
            case 9:
                synchronized (c4089vm) {
                    p9 = c4089vm.p("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(p9);
                return true;
            case 10:
                synchronized (c4089vm) {
                    p10 = c4089vm.p(e.a.f12854h);
                }
                parcel2.writeNoException();
                parcel2.writeString(p10);
                return true;
            case 11:
                Bundle d10 = c4089vm.d();
                parcel2.writeNoException();
                AbstractC3411j8.d(parcel2, d10);
                return true;
            case 12:
                c3873rm.n();
                parcel2.writeNoException();
                return true;
            case 13:
                s2.A0 r9 = c4089vm.r();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, r9);
                return true;
            case 14:
                Bundle bundle = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
                AbstractC3411j8.f(parcel);
                synchronized (c3873rm) {
                    c3873rm.f34503n.d(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
                AbstractC3411j8.f(parcel);
                boolean o4 = c3873rm.o(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(o4 ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
                AbstractC3411j8.f(parcel);
                synchronized (c3873rm) {
                    c3873rm.f34503n.o(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 17:
                InterfaceC3647nb s9 = c4089vm.s();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, s9);
                return true;
            case 18:
                synchronized (c4089vm) {
                    aVar = c4089vm.f35500q;
                }
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, aVar);
                return true;
            case 19:
                parcel2.writeNoException();
                parcel2.writeString(this.f32627n);
                return true;
            default:
                return false;
        }
    }
}
