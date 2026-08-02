package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.on, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3713on extends AbstractBinderC3359i8 implements InterfaceC2535Db {

    /* renamed from: n, reason: collision with root package name */
    public final Context f33726n;

    /* renamed from: u, reason: collision with root package name */
    public final C4089vm f33727u;

    /* renamed from: v, reason: collision with root package name */
    public C2546Dm f33728v;

    /* renamed from: w, reason: collision with root package name */
    public C3873rm f33729w;

    public BinderC3713on(Context context, C4089vm c4089vm, C2546Dm c2546Dm, C3873rm c3873rm) {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        this.f33726n = context;
        this.f33727u = c4089vm;
        this.f33728v = c2546Dm;
        this.f33729w = c3873rm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2535Db
    public final boolean L3(Y2.a aVar) {
        C2546Dm c2546Dm;
        Object D02 = Y2.b.D0(aVar);
        if (!(D02 instanceof ViewGroup) || (c2546Dm = this.f33728v) == null || !c2546Dm.c((ViewGroup) D02, true)) {
            return false;
        }
        this.f33727u.h().V0(new Ux(this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC3755pb interfaceC3755pb;
        String str;
        List<String> arrayList;
        s.k kVar;
        s.k kVar2;
        s.k kVar3;
        s.k kVar4;
        C3873rm c3873rm;
        C2546Dm c2546Dm;
        InterfaceC3755pb interfaceC3755pb2 = null;
        int i4 = 0;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                AbstractC3411j8.f(parcel);
                C4089vm c4089vm = this.f33727u;
                synchronized (c4089vm) {
                    kVar3 = c4089vm.f35506w;
                }
                String str2 = (String) kVar3.getOrDefault(readString, null);
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 2:
                String readString2 = parcel.readString();
                AbstractC3411j8.f(parcel);
                C4089vm c4089vm2 = this.f33727u;
                synchronized (c4089vm2) {
                    kVar4 = c4089vm2.f35505v;
                }
                InterfaceC3862rb interfaceC3862rb = (InterfaceC3862rb) kVar4.getOrDefault(readString2, null);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, interfaceC3862rb);
                return true;
            case 3:
                try {
                    C4089vm c4089vm3 = this.f33727u;
                    synchronized (c4089vm3) {
                        kVar = c4089vm3.f35505v;
                    }
                    synchronized (c4089vm3) {
                        kVar2 = c4089vm3.f35506w;
                    }
                    String[] strArr = new String[kVar.f40276v + kVar2.f40276v];
                    int i6 = 0;
                    for (int i9 = 0; i9 < kVar.f40276v; i9++) {
                        strArr[i6] = (String) kVar.h(i9);
                        i6++;
                    }
                    while (i4 < kVar2.f40276v) {
                        strArr[i6] = (String) kVar2.h(i4);
                        i6++;
                        i4++;
                    }
                    arrayList = Arrays.asList(strArr);
                } catch (NullPointerException e9) {
                    C4906k.f40186C.f40196h.d("InternalNativeCustomTemplateAdShim.getAvailableAssetNames", e9);
                    arrayList = new ArrayList<>();
                }
                parcel2.writeNoException();
                parcel2.writeStringList(arrayList);
                return true;
            case 4:
                String g9 = this.f33727u.g();
                parcel2.writeNoException();
                parcel2.writeString(g9);
                return true;
            case 5:
                String readString3 = parcel.readString();
                AbstractC3411j8.f(parcel);
                C3873rm c3873rm2 = this.f33729w;
                if (c3873rm2 != null) {
                    synchronized (c3873rm2) {
                        c3873rm2.f34503n.G(readString3);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                C3873rm c3873rm3 = this.f33729w;
                if (c3873rm3 != null) {
                    synchronized (c3873rm3) {
                        if (!c3873rm3.f34514y) {
                            c3873rm3.f34503n.p();
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 7:
                s2.A0 r9 = this.f33727u.r();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, r9);
                return true;
            case 8:
                C3873rm c3873rm4 = this.f33729w;
                if (c3873rm4 != null) {
                    c3873rm4.n();
                }
                this.f33729w = null;
                this.f33728v = null;
                parcel2.writeNoException();
                return true;
            case 9:
                Y2.a b02 = b0();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, b02);
                return true;
            case 10:
                Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                boolean L32 = L3(t02);
                parcel2.writeNoException();
                parcel2.writeInt(L32 ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3411j8.f31986a;
                parcel2.writeStrongBinder(null);
                return true;
            case 12:
                C3873rm c3873rm5 = this.f33729w;
                if (c3873rm5 == null || c3873rm5.f34505p.c()) {
                    C4089vm c4089vm4 = this.f33727u;
                    if (c4089vm4.j() != null && c4089vm4.h() == null) {
                        i4 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3411j8.f31986a;
                parcel2.writeInt(i4);
                return true;
            case 13:
                C4089vm c4089vm5 = this.f33727u;
                C3232fq k9 = c4089vm5.k();
                if (k9 != null) {
                    C3495kl c3495kl = C4906k.f40186C.f40211x;
                    Uv uv = k9.f31219a;
                    c3495kl.getClass();
                    C3495kl.h(uv);
                    if (c4089vm5.j() != null) {
                        c4089vm5.j().d("onSdkLoaded", new s.b());
                    }
                    i4 = 1;
                } else {
                    int i10 = w2.z.f41712b;
                    x2.i.f("Trying to start OMID session before creation.");
                }
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC3411j8.f31986a;
                parcel2.writeInt(i4);
                return true;
            case 14:
                Y2.a t03 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                Object D02 = Y2.b.D0(t03);
                if ((D02 instanceof View) && this.f33727u.k() != null && (c3873rm = this.f33729w) != null) {
                    c3873rm.f((View) D02);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                try {
                    C4089vm c4089vm6 = this.f33727u;
                    synchronized (c4089vm6) {
                        str = c4089vm6.f35508y;
                    }
                    if (Objects.equals(str, "Google")) {
                        int i11 = w2.z.f41712b;
                        x2.i.f("Illegal argument specified for omid partner name.");
                    } else if (TextUtils.isEmpty(str)) {
                        int i12 = w2.z.f41712b;
                        x2.i.f("Not starting OMID session. OM partner name has not been configured.");
                    } else {
                        C3873rm c3873rm6 = this.f33729w;
                        if (c3873rm6 != null) {
                            c3873rm6.e(str, false);
                        }
                    }
                } catch (NullPointerException e10) {
                    C4906k.f40186C.f40196h.d("InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement", e10);
                }
                parcel2.writeNoException();
                return true;
            case 16:
                try {
                    C3981tm c3981tm = this.f33729w.f34497F;
                    synchronized (c3981tm) {
                        interfaceC3755pb = c3981tm.f35164a;
                    }
                    interfaceC3755pb2 = interfaceC3755pb;
                } catch (NullPointerException e11) {
                    C4906k.f40186C.f40196h.d("InternalNativeCustomTemplateAdShim.getMediaContent", e11);
                }
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, interfaceC3755pb2);
                return true;
            case 17:
                Y2.a t04 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                Object D03 = Y2.b.D0(t04);
                if ((D03 instanceof ViewGroup) && (c2546Dm = this.f33728v) != null && c2546Dm.c((ViewGroup) D03, false)) {
                    this.f33727u.i().V0(new Ux(this));
                    i4 = 1;
                }
                parcel2.writeNoException();
                parcel2.writeInt(i4);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2535Db
    public final Y2.a b0() {
        return new Y2.b(this.f33726n);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2535Db
    public final String g() {
        return this.f33727u.g();
    }
}
