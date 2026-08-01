package com.google.android.gms.internal.ads;

import C2.BinderC0278k;
import C2.C0268a;
import C2.C0269b;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p.AbstractC4811a;
import p.AbstractC4816f;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Rf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2757Rf extends AbstractBinderC3336i8 implements InterfaceC2774Sf {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f27304n = 0;

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        W2.b bVar;
        int i6 = 1;
        InterfaceC2723Pf interfaceC2723Pf = null;
        switch (i) {
            case 1:
                W2.a w02 = W2.b.w0(parcel.readStrongBinder());
                C2838Wf c2838Wf = (C2838Wf) AbstractC3388j8.b(parcel, C2838Wf.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    interfaceC2723Pf = queryLocalInterface instanceof InterfaceC2723Pf ? (InterfaceC2723Pf) queryLocalInterface : new C2706Of(readStrongBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback", 2);
                }
                AbstractC3388j8.f(parcel);
                ((BinderC0278k) this).r0(w02, c2838Wf, interfaceC2723Pf);
                parcel2.writeNoException();
                return true;
            case 2:
                W2.a w03 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                BinderC0278k binderC0278k = (BinderC0278k) this;
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32415x8)).booleanValue()) {
                    MotionEvent motionEvent = (MotionEvent) W2.b.F0(w03);
                    C2467Ae c2467Ae = binderC0278k.f349B;
                    View view = c2467Ae != null ? c2467Ae.f23686n : null;
                    int[] iArr = new int[2];
                    if (view != null) {
                        view.getLocationOnScreen(iArr);
                    }
                    binderC0278k.f350C = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        binderC0278k.f351D = binderC0278k.f350C;
                    }
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    Point point = binderC0278k.f350C;
                    obtain.setLocation(point.x, point.y);
                    binderC0278k.f374w.f31381b.b(obtain);
                    obtain.recycle();
                }
                parcel2.writeNoException();
                return true;
            case 3:
                W2.b.w0(parcel.readStrongBinder());
                W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 4:
                W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                W2.a w04 = W2.b.w0(parcel.readStrongBinder());
                InterfaceC4166xe U3 = AbstractBinderC4112we.U3(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                ((BinderC0278k) this).U3(createTypedArrayList, w04, U3, false);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                W2.a w05 = W2.b.w0(parcel.readStrongBinder());
                InterfaceC4166xe U32 = AbstractBinderC4112we.U3(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                ((BinderC0278k) this).V3(createTypedArrayList2, w05, U32, false);
                parcel2.writeNoException();
                return true;
            case 7:
                C2467Ae c2467Ae2 = (C2467Ae) AbstractC3388j8.b(parcel, C2467Ae.CREATOR);
                AbstractC3388j8.f(parcel);
                BinderC0278k binderC0278k2 = (BinderC0278k) this;
                binderC0278k2.f349B = c2467Ae2;
                binderC0278k2.f376y.a(1);
                parcel2.writeNoException();
                return true;
            case 8:
                W2.a w06 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                BinderC0278k binderC0278k3 = (BinderC0278k) this;
                C3301ha c3301ha = AbstractC3569ma.Wa;
                q2.r rVar = q2.r.f40207e;
                if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                    C3301ha c3301ha2 = AbstractC3569ma.f32396v8;
                    SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
                    if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue()) {
                        binderC0278k3.W3();
                    }
                    WebView webView = (WebView) W2.b.F0(w06);
                    if (webView == null) {
                        int i9 = u2.z.f41322b;
                        v2.i.c("The webView cannot be null.");
                    } else {
                        C3360ig c3360ig = AbstractC3413jg.f31273f;
                        C0269b c0269b = binderC0278k3.f371Z;
                        C2.A a9 = new C2.A(webView, c0269b, c3360ig);
                        webView.addJavascriptInterface(new C0268a(webView, binderC0278k3.f374w, binderC0278k3.f352E, binderC0278k3.f353F, binderC0278k3.f375x, binderC0278k3.Y, c0269b, a9), "gmaSdk");
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.gb)).booleanValue()) {
                            C4835j.f39733C.f39743h.f29527l.incrementAndGet();
                        }
                        if (((Boolean) AbstractC2801Ua.f27927c.r()).booleanValue()) {
                            c0269b.a(webView);
                            if (((Boolean) AbstractC2801Ua.f27928d.r()).booleanValue()) {
                                a9.f248d = AbstractC3413jg.f31271d.scheduleWithFixedDelay(new C2.z(a9, i6), 0L, ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.hb)).intValue(), TimeUnit.MILLISECONDS);
                            }
                        }
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue()) {
                            binderC0278k3.W3();
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                W2.a w07 = W2.b.w0(parcel.readStrongBinder());
                InterfaceC4166xe U33 = AbstractBinderC4112we.U3(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                ((BinderC0278k) this).U3(createTypedArrayList3, w07, U33, true);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                W2.a w08 = W2.b.w0(parcel.readStrongBinder());
                InterfaceC4166xe U34 = AbstractBinderC4112we.U3(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                ((BinderC0278k) this).V3(createTypedArrayList4, w08, U34, true);
                parcel2.writeNoException();
                return true;
            case 11:
                W2.a w09 = W2.b.w0(parcel.readStrongBinder());
                W2.a w010 = W2.b.w0(parcel.readStrongBinder());
                String readString = parcel.readString();
                W2.a w011 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                BinderC0278k binderC0278k4 = (BinderC0278k) this;
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.kb)).booleanValue()) {
                    Context context = (Context) W2.b.F0(w09);
                    AbstractC4816f abstractC4816f = (AbstractC4816f) W2.b.F0(w010);
                    AbstractC4811a abstractC4811a = (AbstractC4811a) W2.b.F0(w011);
                    C4216ya c4216ya = binderC0278k4.f370X;
                    c4216ya.getClass();
                    if (context == null) {
                        throw new IllegalArgumentException("App Context parameter is null");
                    }
                    if (TextUtils.isEmpty(readString)) {
                        throw new IllegalArgumentException("Origin parameter is empty or null");
                    }
                    if (abstractC4816f == null) {
                        throw new IllegalArgumentException("CustomTabsClient parameter is null");
                    }
                    c4216ya.f35172l = context;
                    c4216ya.f35169h = readString;
                    C3315ho c3315ho = c4216ya.f35165d;
                    C4162xa c4162xa = new C4162xa(c4216ya, abstractC4811a, c3315ho);
                    c4216ya.f35167f = c4162xa;
                    S0.i c9 = abstractC4816f.c(c4162xa);
                    c4216ya.f35168g = c9;
                    if (c9 == null) {
                        int i10 = u2.z.f41322b;
                        v2.i.c("CustomTabsClient failed to create new session.");
                    }
                    com.bumptech.glide.d.p(c3315ho, "pact_action", new Pair("pe", "pact_init"));
                    if (((Boolean) AbstractC2801Ua.f27929e.r()).booleanValue()) {
                        C2.D d2 = binderC0278k4.Y;
                        synchronized (d2) {
                            d2.c(true);
                            d2.c(false);
                        }
                    }
                    if (((Boolean) AbstractC2801Ua.f27927c.r()).booleanValue()) {
                        binderC0278k4.f371Z.a(null);
                    }
                    bVar = new W2.b(c4216ya.f35168g);
                } else {
                    bVar = new W2.b(null);
                }
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, bVar);
                return true;
            default:
                return false;
        }
    }
}
