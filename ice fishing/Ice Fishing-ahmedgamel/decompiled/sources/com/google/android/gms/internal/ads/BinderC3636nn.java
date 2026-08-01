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
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.nn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3636nn extends AbstractBinderC3336i8 implements InterfaceC2515Db {

    /* renamed from: n, reason: collision with root package name */
    public final Context f32764n;

    /* renamed from: u, reason: collision with root package name */
    public final C4012um f32765u;

    /* renamed from: v, reason: collision with root package name */
    public C2509Cm f32766v;

    /* renamed from: w, reason: collision with root package name */
    public C3797qm f32767w;

    public BinderC3636nn(Context context, C4012um c4012um, C2509Cm c2509Cm, C3797qm c3797qm) {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        this.f32764n = context;
        this.f32765u = c4012um;
        this.f32766v = c2509Cm;
        this.f32767w = c3797qm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2515Db
    public final boolean Q3(W2.a aVar) {
        C2509Cm c2509Cm;
        Object F02 = W2.b.F0(aVar);
        if (!(F02 instanceof ViewGroup) || (c2509Cm = this.f32766v) == null || !c2509Cm.c((ViewGroup) F02, true)) {
            return false;
        }
        this.f32765u.h().W0(new Ux(this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC3732pb interfaceC3732pb;
        String str;
        List<String> arrayList;
        s.k kVar;
        s.k kVar2;
        s.k kVar3;
        s.k kVar4;
        C3797qm c3797qm;
        C2509Cm c2509Cm;
        InterfaceC3732pb interfaceC3732pb2 = null;
        int i6 = 0;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                AbstractC3388j8.f(parcel);
                C4012um c4012um = this.f32765u;
                synchronized (c4012um) {
                    kVar3 = c4012um.f34585w;
                }
                String str2 = (String) kVar3.getOrDefault(readString, null);
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 2:
                String readString2 = parcel.readString();
                AbstractC3388j8.f(parcel);
                C4012um c4012um2 = this.f32765u;
                synchronized (c4012um2) {
                    kVar4 = c4012um2.f34584v;
                }
                InterfaceC3839rb interfaceC3839rb = (InterfaceC3839rb) kVar4.getOrDefault(readString2, null);
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, interfaceC3839rb);
                return true;
            case 3:
                try {
                    C4012um c4012um3 = this.f32765u;
                    synchronized (c4012um3) {
                        kVar = c4012um3.f34584v;
                    }
                    synchronized (c4012um3) {
                        kVar2 = c4012um3.f34585w;
                    }
                    String[] strArr = new String[kVar.f40440v + kVar2.f40440v];
                    int i9 = 0;
                    for (int i10 = 0; i10 < kVar.f40440v; i10++) {
                        strArr[i9] = (String) kVar.h(i10);
                        i9++;
                    }
                    while (i6 < kVar2.f40440v) {
                        strArr[i9] = (String) kVar2.h(i6);
                        i9++;
                        i6++;
                    }
                    arrayList = Arrays.asList(strArr);
                } catch (NullPointerException e9) {
                    C4835j.f39733C.f39743h.d("InternalNativeCustomTemplateAdShim.getAvailableAssetNames", e9);
                    arrayList = new ArrayList<>();
                }
                parcel2.writeNoException();
                parcel2.writeStringList(arrayList);
                return true;
            case 4:
                String g4 = this.f32765u.g();
                parcel2.writeNoException();
                parcel2.writeString(g4);
                return true;
            case 5:
                String readString3 = parcel.readString();
                AbstractC3388j8.f(parcel);
                C3797qm c3797qm2 = this.f32767w;
                if (c3797qm2 != null) {
                    synchronized (c3797qm2) {
                        c3797qm2.f33403n.H(readString3);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                C3797qm c3797qm3 = this.f32767w;
                if (c3797qm3 != null) {
                    synchronized (c3797qm3) {
                        if (!c3797qm3.f33414y) {
                            c3797qm3.f33403n.p();
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 7:
                q2.A0 r9 = this.f32765u.r();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, r9);
                return true;
            case 8:
                C3797qm c3797qm4 = this.f32767w;
                if (c3797qm4 != null) {
                    c3797qm4.n();
                }
                this.f32767w = null;
                this.f32766v = null;
                parcel2.writeNoException();
                return true;
            case 9:
                W2.a b02 = b0();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, b02);
                return true;
            case 10:
                W2.a w02 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                boolean Q32 = Q3(w02);
                parcel2.writeNoException();
                parcel2.writeInt(Q32 ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3388j8.f31199a;
                parcel2.writeStrongBinder(null);
                return true;
            case 12:
                C3797qm c3797qm5 = this.f32767w;
                if (c3797qm5 == null || c3797qm5.f33405p.c()) {
                    C4012um c4012um4 = this.f32765u;
                    if (c4012um4.j() != null && c4012um4.h() == null) {
                        i6 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3388j8.f31199a;
                parcel2.writeInt(i6);
                return true;
            case 13:
                C4012um c4012um5 = this.f32765u;
                C3209fq k9 = c4012um5.k();
                if (k9 != null) {
                    C3472kl c3472kl = C4835j.f39733C.f39758x;
                    Uv uv = k9.f30456a;
                    c3472kl.getClass();
                    C3472kl.h(uv);
                    if (c4012um5.j() != null) {
                        c4012um5.j().d("onSdkLoaded", new s.b());
                    }
                    i6 = 1;
                } else {
                    int i11 = u2.z.f41322b;
                    v2.i.f("Trying to start OMID session before creation.");
                }
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC3388j8.f31199a;
                parcel2.writeInt(i6);
                return true;
            case 14:
                W2.a w03 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                Object F02 = W2.b.F0(w03);
                if ((F02 instanceof View) && this.f32765u.k() != null && (c3797qm = this.f32767w) != null) {
                    c3797qm.f((View) F02);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                try {
                    C4012um c4012um6 = this.f32765u;
                    synchronized (c4012um6) {
                        str = c4012um6.f34587y;
                    }
                    if (Objects.equals(str, "Google")) {
                        int i12 = u2.z.f41322b;
                        v2.i.f("Illegal argument specified for omid partner name.");
                    } else if (TextUtils.isEmpty(str)) {
                        int i13 = u2.z.f41322b;
                        v2.i.f("Not starting OMID session. OM partner name has not been configured.");
                    } else {
                        C3797qm c3797qm6 = this.f32767w;
                        if (c3797qm6 != null) {
                            c3797qm6.e(str, false);
                        }
                    }
                } catch (NullPointerException e10) {
                    C4835j.f39733C.f39743h.d("InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement", e10);
                }
                parcel2.writeNoException();
                return true;
            case 16:
                try {
                    C3904sm c3904sm = this.f32767w.f33397F;
                    synchronized (c3904sm) {
                        interfaceC3732pb = c3904sm.f34135a;
                    }
                    interfaceC3732pb2 = interfaceC3732pb;
                } catch (NullPointerException e11) {
                    C4835j.f39733C.f39743h.d("InternalNativeCustomTemplateAdShim.getMediaContent", e11);
                }
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, interfaceC3732pb2);
                return true;
            case 17:
                W2.a w04 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                Object F03 = W2.b.F0(w04);
                if ((F03 instanceof ViewGroup) && (c2509Cm = this.f32766v) != null && c2509Cm.c((ViewGroup) F03, false)) {
                    this.f32765u.i().W0(new Ux(this));
                    i6 = 1;
                }
                parcel2.writeNoException();
                parcel2.writeInt(i6);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2515Db
    public final W2.a b0() {
        return new W2.b(this.f32764n);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2515Db
    public final String g() {
        return this.f32765u.g();
    }
}
