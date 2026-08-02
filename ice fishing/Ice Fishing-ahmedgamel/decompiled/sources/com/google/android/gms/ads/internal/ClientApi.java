package com.google.android.gms.ads.internal;

import E2.BinderC0314k;
import Y2.a;
import Y2.b;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractBinderC3359i8;
import com.google.android.gms.internal.ads.AbstractC2659Kg;
import com.google.android.gms.internal.ads.AbstractC2792Sd;
import com.google.android.gms.internal.ads.AbstractC3364iD;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import com.google.android.gms.internal.ads.BinderC2903Yp;
import com.google.android.gms.internal.ads.BinderC2918Zo;
import com.google.android.gms.internal.ads.BinderC3487kd;
import com.google.android.gms.internal.ads.BinderC3665nt;
import com.google.android.gms.internal.ads.BinderC3929so;
import com.google.android.gms.internal.ads.BinderC4247yi;
import com.google.android.gms.internal.ads.BinderC4310zr;
import com.google.android.gms.internal.ads.Br;
import com.google.android.gms.internal.ads.C2729Oi;
import com.google.android.gms.internal.ads.C2962ao;
import com.google.android.gms.internal.ads.C3010bi;
import com.google.android.gms.internal.ads.C3067cm;
import com.google.android.gms.internal.ads.C3119dk;
import com.google.android.gms.internal.ads.C3230fo;
import com.google.android.gms.internal.ads.C3266gN;
import com.google.android.gms.internal.ads.C3332hi;
import com.google.android.gms.internal.ads.C3343ht;
import com.google.android.gms.internal.ads.C3374iN;
import com.google.android.gms.internal.ads.C3680o7;
import com.google.android.gms.internal.ads.C3708oi;
import com.google.android.gms.internal.ads.C3719ot;
import com.google.android.gms.internal.ads.C3773pt;
import com.google.android.gms.internal.ads.C3917sc;
import com.google.android.gms.internal.ads.C4255yq;
import com.google.android.gms.internal.ads.Dr;
import com.google.android.gms.internal.ads.Gr;
import com.google.android.gms.internal.ads.InterfaceC2794Sf;
import com.google.android.gms.internal.ads.InterfaceC3274ge;
import com.google.android.gms.internal.ads.InterfaceC3435jf;
import com.google.android.gms.internal.ads.InterfaceC3595md;
import com.google.android.gms.internal.ads.InterfaceC3596me;
import com.google.android.gms.internal.ads.InterfaceC4078vb;
import com.google.android.gms.internal.ads.Jv;
import com.google.android.gms.internal.ads.Ot;
import com.google.android.gms.internal.ads.Qt;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC2512Bm;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC2529Cm;
import java.util.HashMap;
import r2.BinderC4905j;
import s2.G;
import s2.InterfaceC4932g0;
import s2.InterfaceC4957t0;
import s2.K;
import s2.S;
import s2.X;
import s2.f1;
import v2.BinderC5098b;
import v2.BinderC5100d;
import x2.C5189a;

/* loaded from: classes.dex */
public class ClientApi extends AbstractBinderC3359i8 implements X {
    public ClientApi() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // s2.X
    public final K C2(a aVar, f1 f1Var, String str, InterfaceC3595md interfaceC3595md, int i) {
        Context context = (Context) b.D0(aVar);
        C3332hi a9 = C3332hi.a(context, interfaceC3595md, i);
        context.getClass();
        f1Var.getClass();
        str.getClass();
        C3374iN a10 = C3374iN.a(context);
        C3374iN a11 = C3374iN.a(f1Var);
        C3332hi c3332hi = a9.f31635b;
        C3266gN a12 = C3266gN.a(new C2962ao(c3332hi.f31659o, 22));
        C3719ot c3719ot = (C3719ot) C3266gN.a(new C3773pt(a10, c3332hi.f31637c, a11, c3332hi.f31612M, a12, C3266gN.a(AbstractC2792Sd.f28288E), C3266gN.a(AbstractC2659Kg.f26735z))).f();
        Dr dr = (Dr) a12.f();
        C5189a c5189a = c3332hi.f31633a.f29481a;
        AbstractC3364iD.j(c5189a);
        return new Br(context, f1Var, str, c3719ot, dr, c5189a, (C3230fo) c3332hi.f31659o.f());
    }

    @Override // s2.X
    public final G D1(a aVar, String str, InterfaceC3595md interfaceC3595md, int i) {
        Context context = (Context) b.D0(aVar);
        return new BinderC4310zr(C3332hi.a(context, interfaceC3595md, i), context, str);
    }

    @Override // s2.X
    public final InterfaceC3435jf G2(a aVar, String str, InterfaceC3595md interfaceC3595md, int i) {
        Context context = (Context) b.D0(aVar);
        C3332hi a9 = C3332hi.a(context, interfaceC3595md, i);
        context.getClass();
        return (Ot) ((C3266gN) new C3067cm(a9.f31635b, context, str).f30366v).f();
    }

    @Override // s2.X
    public final InterfaceC2794Sf K2(a aVar, InterfaceC3595md interfaceC3595md, int i) {
        return (BinderC0314k) C3332hi.a((Context) b.D0(aVar), interfaceC3595md, i).f31630W.f();
    }

    @Override // s2.X
    public final K L0(a aVar, f1 f1Var, String str, InterfaceC3595md interfaceC3595md, int i) {
        Context context = (Context) b.D0(aVar);
        C3332hi a9 = C3332hi.a(context, interfaceC3595md, i);
        str.getClass();
        context.getClass();
        C3374iN a10 = C3374iN.a(context);
        C3374iN a11 = C3374iN.a(str);
        C3332hi c3332hi = a9.f31635b;
        C3266gN c3266gN = c3332hi.f31617O0;
        C4255yq c4255yq = new C4255yq(a10, c3266gN, c3332hi.f31619P0, 4);
        C3266gN a12 = C3266gN.a(new C3343ht(c3266gN, 0));
        C3266gN c3266gN2 = c3332hi.f31637c;
        C3374iN c3374iN = c3332hi.f31612M;
        C3010bi c3010bi = c3332hi.i;
        return (BinderC3665nt) C3266gN.a(new C3119dk(c3374iN, a10, a11, C3266gN.a(new C2729Oi(a10, c3266gN2, c3374iN, c4255yq, a12, c3010bi)), a12, c3010bi, c3332hi.f31659o)).f();
    }

    @Override // s2.X
    public final InterfaceC4932g0 Q3(a aVar, int i) {
        return (BinderC4247yi) C3332hi.a((Context) b.D0(aVar), null, i).f31608K.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        C3917sc c3917sc = null;
        switch (i) {
            case 1:
                a t02 = b.t0(parcel.readStrongBinder());
                f1 f1Var = (f1) AbstractC3411j8.b(parcel, f1.CREATOR);
                String readString = parcel.readString();
                InterfaceC3595md U32 = BinderC3487kd.U3(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                AbstractC3411j8.f(parcel);
                K C22 = C2(t02, f1Var, readString, U32, readInt);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, C22);
                return true;
            case 2:
                a t03 = b.t0(parcel.readStrongBinder());
                f1 f1Var2 = (f1) AbstractC3411j8.b(parcel, f1.CREATOR);
                String readString2 = parcel.readString();
                InterfaceC3595md U33 = BinderC3487kd.U3(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                AbstractC3411j8.f(parcel);
                K j12 = j1(t03, f1Var2, readString2, U33, readInt2);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, j12);
                return true;
            case 3:
                a t04 = b.t0(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                InterfaceC3595md U34 = BinderC3487kd.U3(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                AbstractC3411j8.f(parcel);
                G D12 = D1(t04, readString3, U34, readInt3);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, D12);
                return true;
            case 4:
                b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                a t05 = b.t0(parcel.readStrongBinder());
                a t06 = b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                InterfaceC4078vb W02 = W0(t05, t06);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, W02);
                return true;
            case 6:
                a t07 = b.t0(parcel.readStrongBinder());
                InterfaceC3595md U35 = BinderC3487kd.U3(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                AbstractC3411j8.f(parcel);
                Context context = (Context) b.D0(t07);
                C3332hi a9 = C3332hi.a(context, U35, readInt4);
                context.getClass();
                Qt qt = (Qt) ((C3266gN) new C3067cm(a9.f31635b, context, (String) null).f30365u).f();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, qt);
                return true;
            case 7:
                b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 8:
                a t08 = b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                InterfaceC3596me zzf = zzf(t08);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, zzf);
                return true;
            case 9:
                a t09 = b.t0(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                AbstractC3411j8.f(parcel);
                InterfaceC4932g0 Q32 = Q3(t09, readInt5);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, Q32);
                return true;
            case 10:
                a t010 = b.t0(parcel.readStrongBinder());
                f1 f1Var3 = (f1) AbstractC3411j8.b(parcel, f1.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                AbstractC3411j8.f(parcel);
                BinderC4905j binderC4905j = new BinderC4905j((Context) b.D0(t010), f1Var3, readString4, new C5189a(ModuleDescriptor.MODULE_VERSION, readInt6, true, false));
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, binderC4905j);
                return true;
            case 11:
                a t011 = b.t0(parcel.readStrongBinder());
                a t012 = b.t0(parcel.readStrongBinder());
                a t013 = b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                ViewTreeObserverOnGlobalLayoutListenerC2512Bm viewTreeObserverOnGlobalLayoutListenerC2512Bm = new ViewTreeObserverOnGlobalLayoutListenerC2512Bm((View) b.D0(t011), (HashMap) b.D0(t012), (HashMap) b.D0(t013));
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, viewTreeObserverOnGlobalLayoutListenerC2512Bm);
                return true;
            case 12:
                a t014 = b.t0(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                InterfaceC3595md U36 = BinderC3487kd.U3(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                AbstractC3411j8.f(parcel);
                InterfaceC3435jf G2 = G2(t014, readString5, U36, readInt7);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, G2);
                return true;
            case 13:
                a t015 = b.t0(parcel.readStrongBinder());
                f1 f1Var4 = (f1) AbstractC3411j8.b(parcel, f1.CREATOR);
                String readString6 = parcel.readString();
                InterfaceC3595md U37 = BinderC3487kd.U3(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                AbstractC3411j8.f(parcel);
                K L02 = L0(t015, f1Var4, readString6, U37, readInt8);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, L02);
                return true;
            case 14:
                a t016 = b.t0(parcel.readStrongBinder());
                InterfaceC3595md U38 = BinderC3487kd.U3(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                AbstractC3411j8.f(parcel);
                InterfaceC2794Sf K22 = K2(t016, U38, readInt9);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, K22);
                return true;
            case 15:
                a t017 = b.t0(parcel.readStrongBinder());
                InterfaceC3595md U39 = BinderC3487kd.U3(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                AbstractC3411j8.f(parcel);
                InterfaceC3274ge f2 = f2(t017, U39, readInt10);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, f2);
                return true;
            case 16:
                a t018 = b.t0(parcel.readStrongBinder());
                InterfaceC3595md U310 = BinderC3487kd.U3(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    c3917sc = queryLocalInterface instanceof C3917sc ? (C3917sc) queryLocalInterface : new C3917sc(readStrongBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener", 1);
                }
                AbstractC3411j8.f(parcel);
                Context context2 = (Context) b.D0(t018);
                C3332hi a10 = C3332hi.a(context2, U310, readInt11);
                context2.getClass();
                c3917sc.getClass();
                BinderC3929so binderC3929so = (BinderC3929so) new C3708oi(a10.f31635b, context2, c3917sc).f33712e.f();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, binderC3929so);
                return true;
            case 17:
                a t019 = b.t0(parcel.readStrongBinder());
                InterfaceC3595md U311 = BinderC3487kd.U3(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                AbstractC3411j8.f(parcel);
                InterfaceC4957t0 i12 = i1(t019, U311, readInt12);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, i12);
                return true;
            case 18:
                a t020 = b.t0(parcel.readStrongBinder());
                InterfaceC3595md U312 = BinderC3487kd.U3(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                AbstractC3411j8.f(parcel);
                S U12 = U1(t020, U312, readInt13);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, U12);
                return true;
            default:
                return false;
        }
    }

    @Override // s2.X
    public final S U1(a aVar, InterfaceC3595md interfaceC3595md, int i) {
        return (Jv) C3332hi.a((Context) b.D0(aVar), interfaceC3595md, i).f31610L.f();
    }

    @Override // s2.X
    public final InterfaceC4078vb W0(a aVar, a aVar2) {
        return new ViewTreeObserverOnGlobalLayoutListenerC2529Cm((FrameLayout) b.D0(aVar), (FrameLayout) b.D0(aVar2));
    }

    @Override // s2.X
    public final InterfaceC3274ge f2(a aVar, InterfaceC3595md interfaceC3595md, int i) {
        return (BinderC2903Yp) C3332hi.a((Context) b.D0(aVar), interfaceC3595md, i).f31624S.f();
    }

    @Override // s2.X
    public final InterfaceC4957t0 i1(a aVar, InterfaceC3595md interfaceC3595md, int i) {
        return (BinderC2918Zo) C3332hi.a((Context) b.D0(aVar), interfaceC3595md, i).f31597E.f();
    }

    @Override // s2.X
    public final K j1(a aVar, f1 f1Var, String str, InterfaceC3595md interfaceC3595md, int i) {
        Context context = (Context) b.D0(aVar);
        C3332hi a9 = C3332hi.a(context, interfaceC3595md, i);
        context.getClass();
        f1Var.getClass();
        str.getClass();
        return (Gr) ((C3266gN) new C3680o7(a9.f31635b, context, str, f1Var).f33649u).f();
    }

    @Override // s2.X
    public final InterfaceC3596me zzf(a aVar) {
        Activity activity = (Activity) b.D0(aVar);
        AdOverlayInfoParcel a9 = AdOverlayInfoParcel.a(activity.getIntent());
        if (a9 == null) {
            return new BinderC5100d(activity, 4);
        }
        int i = a9.f24345D;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new BinderC5100d(activity, 4) : new BinderC5100d(activity, 0) : new BinderC5098b(activity, a9) : new BinderC5100d(activity, 2) : new BinderC5100d(activity, 1) : new BinderC5100d(activity, 3);
    }
}
