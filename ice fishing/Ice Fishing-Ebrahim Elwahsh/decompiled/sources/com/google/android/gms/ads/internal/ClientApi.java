package com.google.android.gms.ads.internal;

import B2.BinderC0278l;
import V2.a;
import V2.b;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractBinderC3186f8;
import com.google.android.gms.internal.ads.AbstractC3035cL;
import com.google.android.gms.internal.ads.AbstractC3137eE;
import com.google.android.gms.internal.ads.AbstractC3194fG;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import com.google.android.gms.internal.ads.Ar;
import com.google.android.gms.internal.ads.BinderC2948ap;
import com.google.android.gms.internal.ads.BinderC2949aq;
import com.google.android.gms.internal.ads.BinderC3317hd;
import com.google.android.gms.internal.ads.BinderC3655nt;
import com.google.android.gms.internal.ads.BinderC3973to;
import com.google.android.gms.internal.ads.BinderC4075vi;
import com.google.android.gms.internal.ads.C2495Bq;
import com.google.android.gms.internal.ads.C2674Mi;
import com.google.android.gms.internal.ads.C2860Xh;
import com.google.android.gms.internal.ads.C2881Yl;
import com.google.android.gms.internal.ads.C3107dk;
import com.google.android.gms.internal.ads.C3165eo;
import com.google.android.gms.internal.ads.C3214fi;
import com.google.android.gms.internal.ads.C3220fo;
import com.google.android.gms.internal.ads.C3536li;
import com.google.android.gms.internal.ads.C3562m7;
import com.google.android.gms.internal.ads.C3584mc;
import com.google.android.gms.internal.ads.C3763pt;
import com.google.android.gms.internal.ads.C3817qt;
import com.google.android.gms.internal.ads.C4009uN;
import com.google.android.gms.internal.ads.C4117wN;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.Fr;
import com.google.android.gms.internal.ads.InterfaceC2722Pf;
import com.google.android.gms.internal.ads.InterfaceC3101de;
import com.google.android.gms.internal.ads.InterfaceC3211ff;
import com.google.android.gms.internal.ads.InterfaceC3423jd;
import com.google.android.gms.internal.ads.InterfaceC3424je;
import com.google.android.gms.internal.ads.InterfaceC3852rb;
import com.google.android.gms.internal.ads.Ir;
import com.google.android.gms.internal.ads.Lv;
import com.google.android.gms.internal.ads.Rt;
import com.google.android.gms.internal.ads.St;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC4187xm;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC4241ym;
import java.util.HashMap;
import p2.i;
import q2.G;
import q2.InterfaceC4890g0;
import q2.InterfaceC4915t0;
import q2.K;
import q2.S;
import q2.X;
import q2.g1;
import s2.BinderC4994b;
import s2.BinderC4996d;
import u2.C5107a;

/* loaded from: classes.dex */
public class ClientApi extends AbstractBinderC3186f8 implements X {
    public ClientApi() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        C3584mc c3584mc = null;
        switch (i) {
            case 1:
                a u02 = b.u0(parcel.readStrongBinder());
                g1 g1Var = (g1) AbstractC3241g8.b(parcel, g1.CREATOR);
                String readString = parcel.readString();
                InterfaceC3423jd G32 = BinderC3317hd.G3(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                AbstractC3241g8.f(parcel);
                K p22 = p2(u02, g1Var, readString, G32, readInt);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, p22);
                return true;
            case 2:
                a u03 = b.u0(parcel.readStrongBinder());
                g1 g1Var2 = (g1) AbstractC3241g8.b(parcel, g1.CREATOR);
                String readString2 = parcel.readString();
                InterfaceC3423jd G33 = BinderC3317hd.G3(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                AbstractC3241g8.f(parcel);
                K M22 = M2(u03, g1Var2, readString2, G33, readInt2);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, M22);
                return true;
            case 3:
                a u04 = b.u0(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                InterfaceC3423jd G34 = BinderC3317hd.G3(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                AbstractC3241g8.f(parcel);
                G J12 = J1(u04, readString3, G34, readInt3);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, J12);
                return true;
            case 4:
                b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                a u05 = b.u0(parcel.readStrongBinder());
                a u06 = b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                InterfaceC3852rb v02 = v0(u05, u06);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, v02);
                return true;
            case 6:
                a u07 = b.u0(parcel.readStrongBinder());
                InterfaceC3423jd G35 = BinderC3317hd.G3(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                AbstractC3241g8.f(parcel);
                Context context = (Context) b.A0(u07);
                C3214fi a9 = C3214fi.a(context, G35, readInt4);
                context.getClass();
                St st = (St) ((C4009uN) new C2881Yl(a9.f30795b, context, (String) null).f28862u).d();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, st);
                return true;
            case 7:
                b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 8:
                a u08 = b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                InterfaceC3424je V8 = V(u08);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, V8);
                return true;
            case 9:
                a u09 = b.u0(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                AbstractC3241g8.f(parcel);
                InterfaceC4890g0 Y02 = Y0(u09, readInt5);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, Y02);
                return true;
            case 10:
                a u010 = b.u0(parcel.readStrongBinder());
                g1 g1Var3 = (g1) AbstractC3241g8.b(parcel, g1.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                AbstractC3241g8.f(parcel);
                i iVar = new i((Context) b.A0(u010), g1Var3, readString4, new C5107a(261710000, readInt6, true, false));
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, iVar);
                return true;
            case 11:
                a u011 = b.u0(parcel.readStrongBinder());
                a u012 = b.u0(parcel.readStrongBinder());
                a u013 = b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                ViewTreeObserverOnGlobalLayoutListenerC4187xm viewTreeObserverOnGlobalLayoutListenerC4187xm = new ViewTreeObserverOnGlobalLayoutListenerC4187xm((View) b.A0(u011), (HashMap) b.A0(u012), (HashMap) b.A0(u013));
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, viewTreeObserverOnGlobalLayoutListenerC4187xm);
                return true;
            case 12:
                a u014 = b.u0(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                InterfaceC3423jd G36 = BinderC3317hd.G3(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                AbstractC3241g8.f(parcel);
                InterfaceC3211ff z12 = z1(u014, readString5, G36, readInt7);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, z12);
                return true;
            case 13:
                a u015 = b.u0(parcel.readStrongBinder());
                g1 g1Var4 = (g1) AbstractC3241g8.b(parcel, g1.CREATOR);
                String readString6 = parcel.readString();
                InterfaceC3423jd G37 = BinderC3317hd.G3(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                AbstractC3241g8.f(parcel);
                K W22 = W2(u015, g1Var4, readString6, G37, readInt8);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, W22);
                return true;
            case 14:
                a u016 = b.u0(parcel.readStrongBinder());
                InterfaceC3423jd G38 = BinderC3317hd.G3(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                AbstractC3241g8.f(parcel);
                InterfaceC2722Pf f32 = f3(u016, G38, readInt9);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, f32);
                return true;
            case 15:
                a u017 = b.u0(parcel.readStrongBinder());
                InterfaceC3423jd G39 = BinderC3317hd.G3(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                AbstractC3241g8.f(parcel);
                InterfaceC3101de W02 = W0(u017, G39, readInt10);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, W02);
                return true;
            case 16:
                a u018 = b.u0(parcel.readStrongBinder());
                InterfaceC3423jd G310 = BinderC3317hd.G3(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    c3584mc = queryLocalInterface instanceof C3584mc ? (C3584mc) queryLocalInterface : new C3584mc(readStrongBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener", 2);
                }
                AbstractC3241g8.f(parcel);
                Context context2 = (Context) b.A0(u018);
                C3214fi a10 = C3214fi.a(context2, G310, readInt11);
                context2.getClass();
                c3584mc.getClass();
                BinderC3973to binderC3973to = (BinderC3973to) new C3536li(a10.f30795b, context2, c3584mc).f32579e.d();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, binderC3973to);
                return true;
            case 17:
                a u019 = b.u0(parcel.readStrongBinder());
                InterfaceC3423jd G311 = BinderC3317hd.G3(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                AbstractC3241g8.f(parcel);
                InterfaceC4915t0 U12 = U1(u019, G311, readInt12);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, U12);
                return true;
            case 18:
                a u020 = b.u0(parcel.readStrongBinder());
                InterfaceC3423jd G312 = BinderC3317hd.G3(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                AbstractC3241g8.f(parcel);
                S s02 = s0(u020, G312, readInt13);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, s02);
                return true;
            default:
                return false;
        }
    }

    @Override // q2.X
    public final G J1(a aVar, String str, InterfaceC3423jd interfaceC3423jd, int i) {
        Context context = (Context) b.A0(aVar);
        return new Ar(C3214fi.a(context, interfaceC3423jd, i), context, str);
    }

    @Override // q2.X
    public final K M2(a aVar, g1 g1Var, String str, InterfaceC3423jd interfaceC3423jd, int i) {
        Context context = (Context) b.A0(aVar);
        C3214fi a9 = C3214fi.a(context, interfaceC3423jd, i);
        context.getClass();
        g1Var.getClass();
        str.getClass();
        return (Ir) ((C4009uN) new C3562m7(a9.f30795b, context, str, g1Var).f32668u).d();
    }

    @Override // q2.X
    public final InterfaceC4915t0 U1(a aVar, InterfaceC3423jd interfaceC3423jd, int i) {
        return (BinderC2948ap) C3214fi.a((Context) b.A0(aVar), interfaceC3423jd, i).f30758E.d();
    }

    @Override // q2.X
    public final InterfaceC3424je V(a aVar) {
        Activity activity = (Activity) b.A0(aVar);
        AdOverlayInfoParcel a9 = AdOverlayInfoParcel.a(activity.getIntent());
        if (a9 == null) {
            return new BinderC4996d(activity, 4);
        }
        int i = a9.f23718D;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new BinderC4996d(activity, 4) : new BinderC4996d(activity, 0) : new BinderC4994b(activity, a9) : new BinderC4996d(activity, 2) : new BinderC4996d(activity, 1) : new BinderC4996d(activity, 3);
    }

    @Override // q2.X
    public final InterfaceC3101de W0(a aVar, InterfaceC3423jd interfaceC3423jd, int i) {
        return (BinderC2949aq) C3214fi.a((Context) b.A0(aVar), interfaceC3423jd, i).f30785S.d();
    }

    @Override // q2.X
    public final K W2(a aVar, g1 g1Var, String str, InterfaceC3423jd interfaceC3423jd, int i) {
        Context context = (Context) b.A0(aVar);
        C3214fi a9 = C3214fi.a(context, interfaceC3423jd, i);
        str.getClass();
        context.getClass();
        C4117wN a10 = C4117wN.a(context);
        C4117wN a11 = C4117wN.a(str);
        C3214fi c3214fi = a9.f30795b;
        C4009uN c4009uN = c3214fi.f30776N0;
        C2495Bq c2495Bq = new C2495Bq(a10, c4009uN, c3214fi.f30778O0, 4);
        C4009uN a12 = C4009uN.a(new C3220fo(c4009uN, 29));
        C4009uN c4009uN2 = c3214fi.f30797c;
        C4117wN c4117wN = c3214fi.f30773M;
        C2860Xh c2860Xh = c3214fi.i;
        return (BinderC3655nt) C4009uN.a(new C3107dk(c4117wN, a10, a11, C4009uN.a(new C2674Mi(a10, c4009uN2, c4117wN, c2495Bq, a12, c2860Xh)), a12, c2860Xh, c3214fi.f30819o)).d();
    }

    @Override // q2.X
    public final InterfaceC4890g0 Y0(a aVar, int i) {
        return (BinderC4075vi) C3214fi.a((Context) b.A0(aVar), null, i).f30769K.d();
    }

    @Override // q2.X
    public final InterfaceC2722Pf f3(a aVar, InterfaceC3423jd interfaceC3423jd, int i) {
        return (BinderC0278l) C3214fi.a((Context) b.A0(aVar), interfaceC3423jd, i).f30789V.d();
    }

    @Override // q2.X
    public final K p2(a aVar, g1 g1Var, String str, InterfaceC3423jd interfaceC3423jd, int i) {
        Context context = (Context) b.A0(aVar);
        C3214fi a9 = C3214fi.a(context, interfaceC3423jd, i);
        context.getClass();
        g1Var.getClass();
        str.getClass();
        C4117wN a10 = C4117wN.a(context);
        C4117wN a11 = C4117wN.a(g1Var);
        C3214fi c3214fi = a9.f30795b;
        C4009uN a12 = C4009uN.a(new C3220fo(c3214fi.f30819o, 21));
        C3763pt c3763pt = (C3763pt) C4009uN.a(new C3817qt(a10, c3214fi.f30797c, a11, c3214fi.f30773M, a12, C4009uN.a(AbstractC3194fG.f30666n0), C4009uN.a(AbstractC3035cL.f29694y))).d();
        Fr fr = (Fr) a12.d();
        C5107a c5107a = c3214fi.f30793a.f28059a;
        AbstractC3137eE.h(c5107a);
        return new Cr(context, g1Var, str, c3763pt, fr, c5107a, (C3165eo) c3214fi.f30819o.d());
    }

    @Override // q2.X
    public final S s0(a aVar, InterfaceC3423jd interfaceC3423jd, int i) {
        return (Lv) C3214fi.a((Context) b.A0(aVar), interfaceC3423jd, i).f30771L.d();
    }

    @Override // q2.X
    public final InterfaceC3852rb v0(a aVar, a aVar2) {
        return new ViewTreeObserverOnGlobalLayoutListenerC4241ym((FrameLayout) b.A0(aVar), (FrameLayout) b.A0(aVar2));
    }

    @Override // q2.X
    public final InterfaceC3211ff z1(a aVar, String str, InterfaceC3423jd interfaceC3423jd, int i) {
        Context context = (Context) b.A0(aVar);
        C3214fi a9 = C3214fi.a(context, interfaceC3423jd, i);
        context.getClass();
        return (Rt) ((C4009uN) new C2881Yl(a9.f30795b, context, str).f28863v).d();
    }
}
