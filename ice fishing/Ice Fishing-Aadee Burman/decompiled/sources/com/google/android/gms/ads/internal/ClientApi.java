package com.google.android.gms.ads.internal;

import C2.BinderC0278k;
import W2.a;
import W2.b;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractBinderC3336i8;
import com.google.android.gms.internal.ads.AbstractC2639Kg;
import com.google.android.gms.internal.ads.AbstractC2772Sd;
import com.google.android.gms.internal.ads.AbstractC3341iD;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import com.google.android.gms.internal.ads.BinderC2880Yp;
import com.google.android.gms.internal.ads.BinderC2895Zo;
import com.google.android.gms.internal.ads.BinderC3464kd;
import com.google.android.gms.internal.ads.BinderC3642nt;
import com.google.android.gms.internal.ads.BinderC3852ro;
import com.google.android.gms.internal.ads.BinderC4224yi;
import com.google.android.gms.internal.ads.BinderC4287zr;
import com.google.android.gms.internal.ads.Br;
import com.google.android.gms.internal.ads.C2709Oi;
import com.google.android.gms.internal.ads.C2894Zn;
import com.google.android.gms.internal.ads.C2987bi;
import com.google.android.gms.internal.ads.C2991bm;
import com.google.android.gms.internal.ads.C3096dk;
import com.google.android.gms.internal.ads.C3153eo;
import com.google.android.gms.internal.ads.C3243gN;
import com.google.android.gms.internal.ads.C3309hi;
import com.google.android.gms.internal.ads.C3320ht;
import com.google.android.gms.internal.ads.C3351iN;
import com.google.android.gms.internal.ads.C3657o7;
import com.google.android.gms.internal.ads.C3685oi;
import com.google.android.gms.internal.ads.C3696ot;
import com.google.android.gms.internal.ads.C3750pt;
import com.google.android.gms.internal.ads.C3894sc;
import com.google.android.gms.internal.ads.C4232yq;
import com.google.android.gms.internal.ads.Dr;
import com.google.android.gms.internal.ads.Gr;
import com.google.android.gms.internal.ads.InterfaceC2774Sf;
import com.google.android.gms.internal.ads.InterfaceC3251ge;
import com.google.android.gms.internal.ads.InterfaceC3412jf;
import com.google.android.gms.internal.ads.InterfaceC3572md;
import com.google.android.gms.internal.ads.InterfaceC3573me;
import com.google.android.gms.internal.ads.InterfaceC4055vb;
import com.google.android.gms.internal.ads.Jv;
import com.google.android.gms.internal.ads.Ot;
import com.google.android.gms.internal.ads.Qt;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC2475Am;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC2492Bm;
import java.util.HashMap;
import p2.BinderC4834i;
import q2.G;
import q2.InterfaceC4883g0;
import q2.InterfaceC4908t0;
import q2.K;
import q2.S;
import q2.X;
import q2.f1;
import t2.BinderC5034b;
import t2.BinderC5036d;
import v2.C5110a;

/* loaded from: classes.dex */
public class ClientApi extends AbstractBinderC3336i8 implements X {
    public ClientApi() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // q2.X
    public final InterfaceC4908t0 A1(a aVar, InterfaceC3572md interfaceC3572md, int i) {
        return (BinderC2895Zo) C3309hi.a((Context) b.F0(aVar), interfaceC3572md, i).f30836E.f();
    }

    @Override // q2.X
    public final InterfaceC2774Sf C3(a aVar, InterfaceC3572md interfaceC3572md, int i) {
        return (BinderC0278k) C3309hi.a((Context) b.F0(aVar), interfaceC3572md, i).f30869W.f();
    }

    @Override // q2.X
    public final K F3(a aVar, f1 f1Var, String str, InterfaceC3572md interfaceC3572md, int i) {
        Context context = (Context) b.F0(aVar);
        C3309hi a9 = C3309hi.a(context, interfaceC3572md, i);
        str.getClass();
        context.getClass();
        C3351iN a10 = C3351iN.a(context);
        C3351iN a11 = C3351iN.a(str);
        C3309hi c3309hi = a9.f30874b;
        C3243gN c3243gN = c3309hi.f30856O0;
        C4232yq c4232yq = new C4232yq(a10, c3243gN, c3309hi.f30858P0, 4);
        C3243gN a12 = C3243gN.a(new C3320ht(c3243gN, 0));
        C3243gN c3243gN2 = c3309hi.f30876c;
        C3351iN c3351iN = c3309hi.f30851M;
        C2987bi c2987bi = c3309hi.i;
        return (BinderC3642nt) C3243gN.a(new C3096dk(c3351iN, a10, a11, C3243gN.a(new C2709Oi(a10, c3243gN2, c3351iN, c4232yq, a12, c2987bi)), a12, c2987bi, c3309hi.f30898o)).f();
    }

    @Override // q2.X
    public final InterfaceC4055vb K3(a aVar, a aVar2) {
        return new ViewTreeObserverOnGlobalLayoutListenerC2492Bm((FrameLayout) b.F0(aVar), (FrameLayout) b.F0(aVar2));
    }

    @Override // q2.X
    public final G N2(a aVar, String str, InterfaceC3572md interfaceC3572md, int i) {
        Context context = (Context) b.F0(aVar);
        return new BinderC4287zr(C3309hi.a(context, interfaceC3572md, i), context, str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        C3894sc c3894sc = null;
        switch (i) {
            case 1:
                a w02 = b.w0(parcel.readStrongBinder());
                f1 f1Var = (f1) AbstractC3388j8.b(parcel, f1.CREATOR);
                String readString = parcel.readString();
                InterfaceC3572md U3 = BinderC3464kd.U3(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                AbstractC3388j8.f(parcel);
                K z12 = z1(w02, f1Var, readString, U3, readInt);
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, z12);
                return true;
            case 2:
                a w03 = b.w0(parcel.readStrongBinder());
                f1 f1Var2 = (f1) AbstractC3388j8.b(parcel, f1.CREATOR);
                String readString2 = parcel.readString();
                InterfaceC3572md U32 = BinderC3464kd.U3(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                AbstractC3388j8.f(parcel);
                K d12 = d1(w03, f1Var2, readString2, U32, readInt2);
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, d12);
                return true;
            case 3:
                a w04 = b.w0(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                InterfaceC3572md U33 = BinderC3464kd.U3(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                AbstractC3388j8.f(parcel);
                G N22 = N2(w04, readString3, U33, readInt3);
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, N22);
                return true;
            case 4:
                b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                a w05 = b.w0(parcel.readStrongBinder());
                a w06 = b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                InterfaceC4055vb K32 = K3(w05, w06);
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, K32);
                return true;
            case 6:
                a w07 = b.w0(parcel.readStrongBinder());
                InterfaceC3572md U34 = BinderC3464kd.U3(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                AbstractC3388j8.f(parcel);
                Context context = (Context) b.F0(w07);
                C3309hi a9 = C3309hi.a(context, U34, readInt4);
                context.getClass();
                Qt qt = (Qt) ((C3243gN) new C2991bm(a9.f30874b, context, (String) null).f29323u).f();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, qt);
                return true;
            case 7:
                b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 8:
                a w08 = b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                InterfaceC3573me zzf = zzf(w08);
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, zzf);
                return true;
            case 9:
                a w09 = b.w0(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                AbstractC3388j8.f(parcel);
                InterfaceC4883g0 v22 = v2(w09, readInt5);
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, v22);
                return true;
            case 10:
                a w010 = b.w0(parcel.readStrongBinder());
                f1 f1Var3 = (f1) AbstractC3388j8.b(parcel, f1.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                AbstractC3388j8.f(parcel);
                BinderC4834i binderC4834i = new BinderC4834i((Context) b.F0(w010), f1Var3, readString4, new C5110a(ModuleDescriptor.MODULE_VERSION, readInt6, true, false));
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, binderC4834i);
                return true;
            case 11:
                a w011 = b.w0(parcel.readStrongBinder());
                a w012 = b.w0(parcel.readStrongBinder());
                a w013 = b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                ViewTreeObserverOnGlobalLayoutListenerC2475Am viewTreeObserverOnGlobalLayoutListenerC2475Am = new ViewTreeObserverOnGlobalLayoutListenerC2475Am((View) b.F0(w011), (HashMap) b.F0(w012), (HashMap) b.F0(w013));
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, viewTreeObserverOnGlobalLayoutListenerC2475Am);
                return true;
            case 12:
                a w014 = b.w0(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                InterfaceC3572md U35 = BinderC3464kd.U3(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                AbstractC3388j8.f(parcel);
                InterfaceC3412jf e32 = e3(w014, readString5, U35, readInt7);
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, e32);
                return true;
            case 13:
                a w015 = b.w0(parcel.readStrongBinder());
                f1 f1Var4 = (f1) AbstractC3388j8.b(parcel, f1.CREATOR);
                String readString6 = parcel.readString();
                InterfaceC3572md U36 = BinderC3464kd.U3(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                AbstractC3388j8.f(parcel);
                K F32 = F3(w015, f1Var4, readString6, U36, readInt8);
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, F32);
                return true;
            case 14:
                a w016 = b.w0(parcel.readStrongBinder());
                InterfaceC3572md U37 = BinderC3464kd.U3(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                AbstractC3388j8.f(parcel);
                InterfaceC2774Sf C32 = C3(w016, U37, readInt9);
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, C32);
                return true;
            case 15:
                a w017 = b.w0(parcel.readStrongBinder());
                InterfaceC3572md U38 = BinderC3464kd.U3(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                AbstractC3388j8.f(parcel);
                InterfaceC3251ge u02 = u0(w017, U38, readInt10);
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, u02);
                return true;
            case 16:
                a w018 = b.w0(parcel.readStrongBinder());
                InterfaceC3572md U39 = BinderC3464kd.U3(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    c3894sc = queryLocalInterface instanceof C3894sc ? (C3894sc) queryLocalInterface : new C3894sc(readStrongBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener", 2);
                }
                AbstractC3388j8.f(parcel);
                Context context2 = (Context) b.F0(w018);
                C3309hi a10 = C3309hi.a(context2, U39, readInt11);
                context2.getClass();
                c3894sc.getClass();
                BinderC3852ro binderC3852ro = (BinderC3852ro) new C3685oi(a10.f30874b, context2, c3894sc).f32926e.f();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, binderC3852ro);
                return true;
            case 17:
                a w019 = b.w0(parcel.readStrongBinder());
                InterfaceC3572md U310 = BinderC3464kd.U3(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                AbstractC3388j8.f(parcel);
                InterfaceC4908t0 A12 = A1(w019, U310, readInt12);
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, A12);
                return true;
            case 18:
                a w020 = b.w0(parcel.readStrongBinder());
                InterfaceC3572md U311 = BinderC3464kd.U3(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                AbstractC3388j8.f(parcel);
                S y12 = y1(w020, U311, readInt13);
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, y12);
                return true;
            default:
                return false;
        }
    }

    @Override // q2.X
    public final K d1(a aVar, f1 f1Var, String str, InterfaceC3572md interfaceC3572md, int i) {
        Context context = (Context) b.F0(aVar);
        C3309hi a9 = C3309hi.a(context, interfaceC3572md, i);
        context.getClass();
        f1Var.getClass();
        str.getClass();
        return (Gr) ((C3243gN) new C3657o7(a9.f30874b, context, str, f1Var).f32862u).f();
    }

    @Override // q2.X
    public final InterfaceC3412jf e3(a aVar, String str, InterfaceC3572md interfaceC3572md, int i) {
        Context context = (Context) b.F0(aVar);
        C3309hi a9 = C3309hi.a(context, interfaceC3572md, i);
        context.getClass();
        return (Ot) ((C3243gN) new C2991bm(a9.f30874b, context, str).f29324v).f();
    }

    @Override // q2.X
    public final InterfaceC3251ge u0(a aVar, InterfaceC3572md interfaceC3572md, int i) {
        return (BinderC2880Yp) C3309hi.a((Context) b.F0(aVar), interfaceC3572md, i).f30863S.f();
    }

    @Override // q2.X
    public final InterfaceC4883g0 v2(a aVar, int i) {
        return (BinderC4224yi) C3309hi.a((Context) b.F0(aVar), null, i).f30847K.f();
    }

    @Override // q2.X
    public final S y1(a aVar, InterfaceC3572md interfaceC3572md, int i) {
        return (Jv) C3309hi.a((Context) b.F0(aVar), interfaceC3572md, i).f30849L.f();
    }

    @Override // q2.X
    public final K z1(a aVar, f1 f1Var, String str, InterfaceC3572md interfaceC3572md, int i) {
        Context context = (Context) b.F0(aVar);
        C3309hi a9 = C3309hi.a(context, interfaceC3572md, i);
        context.getClass();
        f1Var.getClass();
        str.getClass();
        C3351iN a10 = C3351iN.a(context);
        C3351iN a11 = C3351iN.a(f1Var);
        C3309hi c3309hi = a9.f30874b;
        C3243gN a12 = C3243gN.a(new C2894Zn(c3309hi.f30898o, 22));
        C3696ot c3696ot = (C3696ot) C3243gN.a(new C3750pt(a10, c3309hi.f30876c, a11, c3309hi.f30851M, a12, C3243gN.a(AbstractC2772Sd.f27496E), C3243gN.a(AbstractC2639Kg.f25957z))).f();
        Dr dr = (Dr) a12.f();
        C5110a c5110a = c3309hi.f30872a.f28706a;
        AbstractC3341iD.j(c5110a);
        return new Br(context, f1Var, str, c3696ot, dr, c5110a, (C3153eo) c3309hi.f30898o.f());
    }

    @Override // q2.X
    public final InterfaceC3573me zzf(a aVar) {
        Activity activity = (Activity) b.F0(aVar);
        AdOverlayInfoParcel a9 = AdOverlayInfoParcel.a(activity.getIntent());
        if (a9 == null) {
            return new BinderC5036d(activity, 4);
        }
        int i = a9.f23565D;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new BinderC5036d(activity, 4) : new BinderC5036d(activity, 0) : new BinderC5034b(activity, a9) : new BinderC5036d(activity, 2) : new BinderC5036d(activity, 1) : new BinderC5036d(activity, 3);
    }
}
