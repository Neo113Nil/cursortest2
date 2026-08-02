package com.google.android.gms.internal.ads;

import E2.BinderC0314k;
import E2.C0304a;
import E2.C0305b;
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
import p.AbstractC4815a;
import p.AbstractC4820f;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Rf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2777Rf extends AbstractBinderC3359i8 implements InterfaceC2794Sf {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f27988n = 0;

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        Y2.b bVar;
        int i4 = 1;
        InterfaceC2743Pf interfaceC2743Pf = null;
        switch (i) {
            case 1:
                Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
                C2861Wf c2861Wf = (C2861Wf) AbstractC3411j8.b(parcel, C2861Wf.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    interfaceC2743Pf = queryLocalInterface instanceof InterfaceC2743Pf ? (InterfaceC2743Pf) queryLocalInterface : new C2726Of(readStrongBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback", 1);
                }
                AbstractC3411j8.f(parcel);
                ((BinderC0314k) this).l2(t02, c2861Wf, interfaceC2743Pf);
                parcel2.writeNoException();
                return true;
            case 2:
                Y2.a t03 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                BinderC0314k binderC0314k = (BinderC0314k) this;
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33194x8)).booleanValue()) {
                    MotionEvent motionEvent = (MotionEvent) Y2.b.D0(t03);
                    C2487Ae c2487Ae = binderC0314k.f809B;
                    View view = c2487Ae != null ? c2487Ae.f24468n : null;
                    int[] iArr = new int[2];
                    if (view != null) {
                        view.getLocationOnScreen(iArr);
                    }
                    binderC0314k.f810C = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        binderC0314k.f811D = binderC0314k.f810C;
                    }
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    Point point = binderC0314k.f810C;
                    obtain.setLocation(point.x, point.y);
                    binderC0314k.f834w.f32160b.b(obtain);
                    obtain.recycle();
                }
                parcel2.writeNoException();
                return true;
            case 3:
                Y2.b.t0(parcel.readStrongBinder());
                Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 4:
                Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                Y2.a t04 = Y2.b.t0(parcel.readStrongBinder());
                InterfaceC4189xe U32 = AbstractBinderC4135we.U3(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                ((BinderC0314k) this).U3(createTypedArrayList, t04, U32, false);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                Y2.a t05 = Y2.b.t0(parcel.readStrongBinder());
                InterfaceC4189xe U33 = AbstractBinderC4135we.U3(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                ((BinderC0314k) this).V3(createTypedArrayList2, t05, U33, false);
                parcel2.writeNoException();
                return true;
            case 7:
                C2487Ae c2487Ae2 = (C2487Ae) AbstractC3411j8.b(parcel, C2487Ae.CREATOR);
                AbstractC3411j8.f(parcel);
                BinderC0314k binderC0314k2 = (BinderC0314k) this;
                binderC0314k2.f809B = c2487Ae2;
                binderC0314k2.f836y.a(1);
                parcel2.writeNoException();
                return true;
            case 8:
                Y2.a t06 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                BinderC0314k binderC0314k3 = (BinderC0314k) this;
                C3324ha c3324ha = AbstractC3592ma.Wa;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    C3324ha c3324ha2 = AbstractC3592ma.f33176v8;
                    SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
                    if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue()) {
                        binderC0314k3.W3();
                    }
                    WebView webView = (WebView) Y2.b.D0(t06);
                    if (webView == null) {
                        int i6 = w2.z.f41712b;
                        x2.i.c("The webView cannot be null.");
                    } else {
                        C3383ig c3383ig = AbstractC3436jg.f32060f;
                        C0305b c0305b = binderC0314k3.f831Z;
                        E2.z zVar = new E2.z(webView, c0305b, c3383ig);
                        webView.addJavascriptInterface(new C0304a(webView, binderC0314k3.f834w, binderC0314k3.f812E, binderC0314k3.f813F, binderC0314k3.f835x, binderC0314k3.Y, c0305b, zVar), "gmaSdk");
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.gb)).booleanValue()) {
                            C4906k.f40186C.f40196h.f30312l.incrementAndGet();
                        }
                        if (((Boolean) AbstractC2823Ua.f28725c.r()).booleanValue()) {
                            c0305b.a(webView);
                            if (((Boolean) AbstractC2823Ua.f28726d.r()).booleanValue()) {
                                zVar.f892d = AbstractC3436jg.f32058d.scheduleWithFixedDelay(new E2.y(zVar, i4), 0L, ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.hb)).intValue(), TimeUnit.MILLISECONDS);
                            }
                        }
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue()) {
                            binderC0314k3.W3();
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                Y2.a t07 = Y2.b.t0(parcel.readStrongBinder());
                InterfaceC4189xe U34 = AbstractBinderC4135we.U3(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                ((BinderC0314k) this).U3(createTypedArrayList3, t07, U34, true);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                Y2.a t08 = Y2.b.t0(parcel.readStrongBinder());
                InterfaceC4189xe U35 = AbstractBinderC4135we.U3(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                ((BinderC0314k) this).V3(createTypedArrayList4, t08, U35, true);
                parcel2.writeNoException();
                return true;
            case 11:
                Y2.a t09 = Y2.b.t0(parcel.readStrongBinder());
                Y2.a t010 = Y2.b.t0(parcel.readStrongBinder());
                String readString = parcel.readString();
                Y2.a t011 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                BinderC0314k binderC0314k4 = (BinderC0314k) this;
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.kb)).booleanValue()) {
                    Context context = (Context) Y2.b.D0(t09);
                    AbstractC4820f abstractC4820f = (AbstractC4820f) Y2.b.D0(t010);
                    AbstractC4815a abstractC4815a = (AbstractC4815a) Y2.b.D0(t011);
                    C4239ya c4239ya = binderC0314k4.f830X;
                    c4239ya.getClass();
                    if (context == null) {
                        throw new IllegalArgumentException("App Context parameter is null");
                    }
                    if (TextUtils.isEmpty(readString)) {
                        throw new IllegalArgumentException("Origin parameter is empty or null");
                    }
                    if (abstractC4820f == null) {
                        throw new IllegalArgumentException("CustomTabsClient parameter is null");
                    }
                    c4239ya.f35962l = context;
                    c4239ya.f35959h = readString;
                    C3391io c3391io = c4239ya.f35955d;
                    C4185xa c4185xa = new C4185xa(c4239ya, abstractC4815a, c3391io);
                    c4239ya.f35957f = c4185xa;
                    S0.i c9 = abstractC4820f.c(c4185xa);
                    c4239ya.f35958g = c9;
                    if (c9 == null) {
                        int i9 = w2.z.f41712b;
                        x2.i.c("CustomTabsClient failed to create new session.");
                    }
                    t8.g.z(c3391io, "pact_action", new Pair("pe", "pact_init"));
                    if (((Boolean) AbstractC2823Ua.f28727e.r()).booleanValue()) {
                        E2.C c10 = binderC0314k4.Y;
                        synchronized (c10) {
                            c10.c(true);
                            c10.c(false);
                        }
                    }
                    if (((Boolean) AbstractC2823Ua.f28725c.r()).booleanValue()) {
                        binderC0314k4.f831Z.a(null);
                    }
                    bVar = new Y2.b(c4239ya.f35958g);
                } else {
                    bVar = new Y2.b(null);
                }
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, bVar);
                return true;
            default:
                return false;
        }
    }
}
