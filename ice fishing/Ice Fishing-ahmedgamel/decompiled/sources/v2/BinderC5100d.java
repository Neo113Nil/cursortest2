package v2;

import N2.o;
import N3.n;
import a.AbstractC0426a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.textclassifier.TextClassifier;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.IceFishing.LiveIceFishing.C5248R;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractBinderC3542le;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C2493Ak;
import com.google.android.gms.internal.ads.C2677Lh;
import com.google.android.gms.internal.ads.C2787Rp;
import com.google.android.gms.internal.ads.C2889Yb;
import com.google.android.gms.internal.ads.C2954ag;
import com.google.android.gms.internal.ads.C3;
import com.google.android.gms.internal.ads.C3091d9;
import com.google.android.gms.internal.ads.C3178eq;
import com.google.android.gms.internal.ads.C3230fo;
import com.google.android.gms.internal.ads.C3232fq;
import com.google.android.gms.internal.ads.C3324ha;
import com.google.android.gms.internal.ads.C3495kl;
import com.google.android.gms.internal.ads.InterfaceC2579Fl;
import com.google.android.gms.internal.ads.InterfaceC2728Oh;
import com.google.android.gms.internal.ads.InterfaceC2857Wb;
import com.google.android.gms.internal.ads.InterfaceC3274ge;
import com.google.android.gms.internal.ads.InterfaceC4084vh;
import com.google.android.gms.internal.ads.RunnableC3018bq;
import com.google.android.gms.internal.ads.RunnableC3071cq;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3484ka;
import com.google.android.gms.internal.ads.Tv;
import com.google.android.gms.internal.ads.Uv;
import com.google.android.gms.internal.ads.Vr;
import com.google.android.gms.internal.ads.Zv;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;
import o1.C4797a;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4902g;
import r2.C4906k;
import s2.InterfaceC4919a;
import s2.r;
import w2.D;
import w2.z;
import x2.C5189a;

/* renamed from: v2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC5100d extends AbstractBinderC3542le {

    /* renamed from: S, reason: collision with root package name */
    public static final int f41096S = Color.argb(0, 0, 0, 0);

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f41097A;

    /* renamed from: B, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f41098B;

    /* renamed from: E, reason: collision with root package name */
    public i f41101E;
    public r3.b J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f41106K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f41107L;

    /* renamed from: P, reason: collision with root package name */
    public Toolbar f41111P;

    /* renamed from: R, reason: collision with root package name */
    public final /* synthetic */ int f41113R;

    /* renamed from: u, reason: collision with root package name */
    public final Activity f41114u;

    /* renamed from: v, reason: collision with root package name */
    public AdOverlayInfoParcel f41115v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC4084vh f41116w;

    /* renamed from: x, reason: collision with root package name */
    public o f41117x;

    /* renamed from: y, reason: collision with root package name */
    public m f41118y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f41119z = false;

    /* renamed from: C, reason: collision with root package name */
    public boolean f41099C = false;

    /* renamed from: D, reason: collision with root package name */
    public boolean f41100D = false;

    /* renamed from: F, reason: collision with root package name */
    public boolean f41102F = false;

    /* renamed from: Q, reason: collision with root package name */
    public int f41112Q = 1;

    /* renamed from: G, reason: collision with root package name */
    public int f41103G = 0;

    /* renamed from: H, reason: collision with root package name */
    public final Object f41104H = new Object();

    /* renamed from: I, reason: collision with root package name */
    public final n f41105I = new n(this);

    /* renamed from: M, reason: collision with root package name */
    public boolean f41108M = false;

    /* renamed from: N, reason: collision with root package name */
    public boolean f41109N = false;

    /* renamed from: O, reason: collision with root package name */
    public boolean f41110O = true;

    public BinderC5100d(Activity activity, int i) {
        this.f41113R = i;
        this.f41114u = activity;
    }

    public static final void W3(View view, C3232fq c3232fq) {
        if (c3232fq == null || view == null) {
            return;
        }
        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.j6)).booleanValue()) {
            C3 c32 = c3232fq.f31220b;
            if (((Tv) c32.f24789z) == Tv.HTML) {
                return;
            }
        }
        C3495kl c3495kl = C4906k.f40186C.f40211x;
        Uv uv = c3232fq.f31219a;
        c3495kl.getClass();
        C3495kl.i(uv, view);
    }

    public final void A() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f41115v;
        if (adOverlayInfoParcel != null && this.f41119z) {
            Q(adOverlayInfoParcel.f24344C);
        }
        if (this.f41097A != null) {
            this.f41114u.setContentView(this.f41101E);
            this.f41107L = true;
            this.f41097A.removeAllViews();
            this.f41097A = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f41098B;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f41098B = null;
        }
        this.f41119z = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[Catch: h -> 0x003c, TryCatch #1 {h -> 0x003c, blocks: (B:13:0x0020, B:15:0x002e, B:17:0x0032, B:19:0x0038, B:20:0x003f, B:21:0x0048, B:23:0x0053, B:24:0x0055, B:26:0x005b, B:27:0x0067, B:29:0x006e, B:32:0x0080, B:34:0x0084, B:36:0x0089, B:38:0x0096, B:40:0x009a, B:42:0x00a0, B:48:0x00a8, B:51:0x00ac, B:53:0x00ad, B:55:0x00b3, B:56:0x00b6, B:58:0x00bc, B:60:0x00c0, B:61:0x00c3, B:63:0x00c9, B:64:0x00cc, B:66:0x00d0, B:68:0x00d4, B:69:0x00d7, B:76:0x0102, B:78:0x0106, B:79:0x010d, B:80:0x010e, B:82:0x0112, B:84:0x011f, B:86:0x007a, B:88:0x007e, B:89:0x0092, B:90:0x0123, B:91:0x012a, B:44:0x00a1, B:46:0x00a5), top: B:12:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0 A[Catch: h -> 0x003c, TryCatch #1 {h -> 0x003c, blocks: (B:13:0x0020, B:15:0x002e, B:17:0x0032, B:19:0x0038, B:20:0x003f, B:21:0x0048, B:23:0x0053, B:24:0x0055, B:26:0x005b, B:27:0x0067, B:29:0x006e, B:32:0x0080, B:34:0x0084, B:36:0x0089, B:38:0x0096, B:40:0x009a, B:42:0x00a0, B:48:0x00a8, B:51:0x00ac, B:53:0x00ad, B:55:0x00b3, B:56:0x00b6, B:58:0x00bc, B:60:0x00c0, B:61:0x00c3, B:63:0x00c9, B:64:0x00cc, B:66:0x00d0, B:68:0x00d4, B:69:0x00d7, B:76:0x0102, B:78:0x0106, B:79:0x010d, B:80:0x010e, B:82:0x0112, B:84:0x011f, B:86:0x007a, B:88:0x007e, B:89:0x0092, B:90:0x0123, B:91:0x012a, B:44:0x00a1, B:46:0x00a5), top: B:12:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011f A[Catch: h -> 0x003c, TryCatch #1 {h -> 0x003c, blocks: (B:13:0x0020, B:15:0x002e, B:17:0x0032, B:19:0x0038, B:20:0x003f, B:21:0x0048, B:23:0x0053, B:24:0x0055, B:26:0x005b, B:27:0x0067, B:29:0x006e, B:32:0x0080, B:34:0x0084, B:36:0x0089, B:38:0x0096, B:40:0x009a, B:42:0x00a0, B:48:0x00a8, B:51:0x00ac, B:53:0x00ad, B:55:0x00b3, B:56:0x00b6, B:58:0x00bc, B:60:0x00c0, B:61:0x00c3, B:63:0x00c9, B:64:0x00cc, B:66:0x00d0, B:68:0x00d4, B:69:0x00d7, B:76:0x0102, B:78:0x0106, B:79:0x010d, B:80:0x010e, B:82:0x0112, B:84:0x011f, B:86:0x007a, B:88:0x007e, B:89:0x0092, B:90:0x0123, B:91:0x012a, B:44:0x00a1, B:46:0x00a5), top: B:12:0x0020, inners: #0 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A0(Bundle bundle) {
        Activity activity;
        AdOverlayInfoParcel a9;
        AdOverlayInfoParcel adOverlayInfoParcel;
        int i;
        l lVar;
        switch (this.f41113R) {
            case 4:
                z.k("AdOverlayParcel is null or does not contain valid overlay type.");
                this.f41112Q = 4;
                this.f41114u.finish();
                return;
            default:
                if (!this.f41107L) {
                    this.f41114u.requestWindowFeature(1);
                }
                this.f41099C = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
                try {
                    activity = this.f41114u;
                    a9 = AdOverlayInfoParcel.a(activity.getIntent());
                    this.f41115v = a9;
                } catch (h e9) {
                    String message = e9.getMessage();
                    int i4 = z.f41712b;
                    x2.i.f(message);
                    this.f41112Q = 4;
                    this.f41114u.finish();
                    return;
                }
                if (a9 == null) {
                    throw new h("Could not get info for ad overlay.");
                }
                if (a9.f24356P) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        activity.setShowWhenLocked(true);
                    } else {
                        activity.getWindow().addFlags(524288);
                    }
                }
                if (this.f41115v.f24347F.f41847v > 7500000) {
                    this.f41112Q = 4;
                }
                if (activity.getIntent() != null) {
                    this.f41110O = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f41115v;
                C4902g c4902g = adOverlayInfoParcel2.f24349H;
                if (c4902g != null) {
                    boolean z6 = c4902g.f40171n;
                    this.f41100D = z6;
                    this.f41103G = (int) c4902g.f40175x;
                    if (z6) {
                        if (adOverlayInfoParcel2.f24345D != 5 && c4902g.f40176y != -1) {
                            new C2954ag(this).l();
                        }
                    }
                    if (bundle == null) {
                        if (this.f41110O) {
                            C2493Ak c2493Ak = this.f41115v.f24353M;
                            if (c2493Ak != null) {
                                synchronized (c2493Ak) {
                                    ScheduledFuture scheduledFuture = c2493Ak.f24507w;
                                    if (scheduledFuture != null) {
                                        scheduledFuture.cancel(true);
                                    }
                                }
                            }
                            l lVar2 = this.f41115v.f24360v;
                            if (lVar2 != null) {
                                lVar2.g();
                            }
                        }
                        AdOverlayInfoParcel adOverlayInfoParcel3 = this.f41115v;
                        if (adOverlayInfoParcel3.f24345D != 1) {
                            InterfaceC4919a interfaceC4919a = adOverlayInfoParcel3.f24359u;
                            if (interfaceC4919a != null) {
                                interfaceC4919a.onAdClicked();
                            }
                            InterfaceC2579Fl interfaceC2579Fl = this.f41115v.f24354N;
                            if (interfaceC2579Fl != null) {
                                interfaceC2579Fl.D();
                            }
                        }
                    }
                    adOverlayInfoParcel = this.f41115v;
                    if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f24360v) != null) {
                        lVar.h1();
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel4 = this.f41115v;
                    i iVar = new i(activity, adOverlayInfoParcel4.f24348G, adOverlayInfoParcel4.f24347F.f41845n, adOverlayInfoParcel4.f24352L);
                    this.f41101E = iVar;
                    iVar.setId(1000);
                    C4906k.f40186C.f40194f.y(activity);
                    AdOverlayInfoParcel adOverlayInfoParcel5 = this.f41115v;
                    i = adOverlayInfoParcel5.f24345D;
                    if (i == 1) {
                        a4(false);
                        return;
                    }
                    if (i == 2) {
                        this.f41117x = new o(adOverlayInfoParcel5.f24361w);
                        a4(false);
                        return;
                    } else if (i == 3) {
                        a4(true);
                        return;
                    } else {
                        if (i != 5) {
                            throw new h("Could not determine ad overlay type.");
                        }
                        a4(false);
                        return;
                    }
                }
                if (adOverlayInfoParcel2.f24345D == 5) {
                    this.f41100D = true;
                    if (adOverlayInfoParcel2.f24345D != 5) {
                        new C2954ag(this).l();
                    }
                    if (bundle == null) {
                    }
                    adOverlayInfoParcel = this.f41115v;
                    if (adOverlayInfoParcel != null) {
                        lVar.h1();
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel42 = this.f41115v;
                    i iVar2 = new i(activity, adOverlayInfoParcel42.f24348G, adOverlayInfoParcel42.f24347F.f41845n, adOverlayInfoParcel42.f24352L);
                    this.f41101E = iVar2;
                    iVar2.setId(1000);
                    C4906k.f40186C.f40194f.y(activity);
                    AdOverlayInfoParcel adOverlayInfoParcel52 = this.f41115v;
                    i = adOverlayInfoParcel52.f24345D;
                    if (i == 1) {
                    }
                } else {
                    this.f41100D = false;
                    if (bundle == null) {
                    }
                    adOverlayInfoParcel = this.f41115v;
                    if (adOverlayInfoParcel != null) {
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel422 = this.f41115v;
                    i iVar22 = new i(activity, adOverlayInfoParcel422.f24348G, adOverlayInfoParcel422.f24347F.f41845n, adOverlayInfoParcel422.f24352L);
                    this.f41101E = iVar22;
                    iVar22.setId(1000);
                    C4906k.f40186C.f40194f.y(activity);
                    AdOverlayInfoParcel adOverlayInfoParcel522 = this.f41115v;
                    i = adOverlayInfoParcel522.f24345D;
                    if (i == 1) {
                    }
                }
                String message2 = e9.getMessage();
                int i42 = z.f41712b;
                x2.i.f(message2);
                this.f41112Q = 4;
                this.f41114u.finish();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void E() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f41115v;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f24360v) != null) {
            lVar.K0();
        }
        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.f32960Y5)).booleanValue() && this.f41116w != null && (!this.f41114u.isFinishing() || this.f41117x == null)) {
            this.f41116w.onPause();
        }
        u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void I() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f41115v;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f24360v) != null) {
            lVar.d1();
        }
        InterfaceC4084vh interfaceC4084vh = this.f41116w;
        if (interfaceC4084vh != null) {
            try {
                this.f41101E.removeView(interfaceC4084vh.V());
            } catch (NullPointerException unused) {
            }
        }
        u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void I0() {
        this.f41107L = true;
    }

    public final void Q(int i) {
        int i4;
        Activity activity = this.f41114u;
        int i6 = activity.getApplicationInfo().targetSdkVersion;
        C3324ha c3324ha = AbstractC3592ma.f32909S6;
        r rVar = r.f40506e;
        if (i6 >= ((Integer) rVar.f40509c.a(c3324ha)).intValue()) {
            int i9 = activity.getApplicationInfo().targetSdkVersion;
            C3324ha c3324ha2 = AbstractC3592ma.f32918T6;
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
            if (i9 <= ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).intValue() && (i4 = Build.VERSION.SDK_INT) >= ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32927U6)).intValue() && i4 <= ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32936V6)).intValue()) {
                return;
            }
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            C4906k.f40186C.f40196h.e("AdOverlay.setRequestedOrientation", th);
        }
    }

    public final void U3() {
        InterfaceC4084vh interfaceC4084vh;
        l lVar;
        if (this.f41109N) {
            return;
        }
        this.f41109N = true;
        InterfaceC4084vh interfaceC4084vh2 = this.f41116w;
        if (interfaceC4084vh2 != null) {
            this.f41101E.removeView(interfaceC4084vh2.V());
            o oVar = this.f41117x;
            if (oVar != null) {
                this.f41116w.D0((Context) oVar.f1950b);
                this.f41116w.g1(false);
                if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.fe)).booleanValue() && this.f41116w.getParent() != null) {
                    ((ViewGroup) this.f41116w.getParent()).removeView(this.f41116w.V());
                }
                ViewGroup viewGroup = (ViewGroup) this.f41117x.f1952d;
                View V8 = this.f41116w.V();
                o oVar2 = this.f41117x;
                viewGroup.addView(V8, oVar2.f1949a, (ViewGroup.LayoutParams) oVar2.f1951c);
                this.f41117x = null;
            } else {
                Activity activity = this.f41114u;
                if (activity.getApplicationContext() != null) {
                    this.f41116w.D0(activity.getApplicationContext());
                }
            }
            this.f41116w = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f41115v;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f24360v) != null) {
            lVar.C3(this.f41112Q);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f41115v;
        if (adOverlayInfoParcel2 == null || (interfaceC4084vh = adOverlayInfoParcel2.f24361w) == null) {
            return;
        }
        W3(this.f41115v.f24361w.V(), interfaceC4084vh.C0());
    }

    public final void V3(View view) {
        C3232fq C0;
        C3178eq F02;
        InterfaceC4084vh interfaceC4084vh = this.f41116w;
        if (interfaceC4084vh == null) {
            return;
        }
        C3324ha c3324ha = AbstractC3592ma.f33072k6;
        r rVar = r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && (F02 = interfaceC4084vh.F0()) != null) {
            synchronized (F02) {
                Zv zv = F02.f30774f;
                if (zv != null) {
                    C4906k.f40186C.f40211x.getClass();
                    C3495kl.p(new RunnableC3071cq(1, zv, view));
                    return;
                }
                return;
            }
        }
        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.j6)).booleanValue() && (C0 = interfaceC4084vh.C0()) != null && ((Tv) C0.f31220b.f24789z) == Tv.HTML) {
            C3495kl c3495kl = C4906k.f40186C.f40211x;
            Uv uv = C0.f31219a;
            c3495kl.getClass();
            C3495kl.p(new RunnableC3018bq(uv, view, 0));
        }
    }

    public final void X3(boolean z6) {
        if (this.f41115v.f24356P) {
            return;
        }
        C3324ha c3324ha = AbstractC3592ma.f32978a6;
        r rVar = r.f40506e;
        int intValue = ((Integer) rVar.f40509c.a(c3324ha)).intValue();
        boolean z9 = ((Boolean) rVar.f40509c.a(AbstractC3592ma.f32820I1)).booleanValue() || z6;
        Vr vr = new Vr();
        vr.f29048a = 0;
        vr.f29049b = 0;
        vr.f29050c = 0;
        vr.f29051d = 50;
        vr.f29048a = true != z9 ? 0 : intValue;
        vr.f29049b = true != z9 ? intValue : 0;
        vr.f29050c = intValue;
        this.f41118y = new m(this.f41114u, vr, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z9 ? 9 : 11);
        Y3(z6, this.f41115v.f24364z);
        this.f41101E.addView(this.f41118y, layoutParams);
        V3(this.f41118y);
    }

    public final void Y3(boolean z6, boolean z9) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        C4902g c4902g;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        C4902g c4902g2;
        C3324ha c3324ha = AbstractC3592ma.G1;
        r rVar = r.f40506e;
        boolean z10 = true;
        boolean z11 = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && (adOverlayInfoParcel2 = this.f41115v) != null && (c4902g2 = adOverlayInfoParcel2.f24349H) != null && c4902g2.f40169A;
        C3324ha c3324ha2 = AbstractC3592ma.f32811H1;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        boolean z12 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue() && (adOverlayInfoParcel = this.f41115v) != null && (c4902g = adOverlayInfoParcel.f24349H) != null && c4902g.f40170B;
        if (z6 && z9 && z11 && !z12) {
            InterfaceC4084vh interfaceC4084vh = this.f41116w;
            try {
                JSONObject put = new JSONObject().put("message", "Custom close has been disabled for interstitial ads in this ad slot.").put(NativeAdvancedJsUtils.f18693p, "useCustomClose");
                if (interfaceC4084vh != null) {
                    interfaceC4084vh.e("onError", put);
                }
            } catch (JSONException e9) {
                int i = z.f41712b;
                x2.i.d("Error occurred while dispatching error event.", e9);
            }
        }
        m mVar = this.f41118y;
        if (mVar != null) {
            if (!z12 && (!z9 || z11)) {
                z10 = false;
            }
            ImageButton imageButton = mVar.f41145n;
            if (!z10) {
                imageButton.setVisibility(0);
                return;
            }
            imageButton.setVisibility(8);
            if (((Long) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32836K1)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
            }
        }
    }

    public final void Z3(int i, boolean z6) {
        if (!z6) {
            this.f41101E.setBackgroundColor(-16777216);
            return;
        }
        this.f41101E.setBackgroundColor(0);
        this.f41103G = i;
        Window window = this.f41114u.getWindow();
        if (!((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.f33123q1)).booleanValue() || Build.VERSION.SDK_INT < 31 || window == null) {
            return;
        }
        window.setBackgroundBlurRadius(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a4(boolean z6) {
        boolean z9;
        boolean z10;
        Object obj;
        C4797a c4797a;
        Window window;
        int i;
        boolean z11;
        int i4;
        InterfaceC4084vh interfaceC4084vh;
        AdOverlayInfoParcel adOverlayInfoParcel;
        boolean z12;
        boolean z13 = this.f41107L;
        Activity activity = this.f41114u;
        if (!z13) {
            activity.requestWindowFeature(1);
        }
        Window window2 = activity.getWindow();
        if (window2 == null) {
            throw new h("Invalid activity, no window available.");
        }
        InterfaceC4084vh interfaceC4084vh2 = this.f41115v.f24361w;
        C2677Lh h02 = interfaceC4084vh2 != null ? interfaceC4084vh2.h0() : null;
        if (h02 != null) {
            synchronized (h02.f26953w) {
                z12 = h02.J;
            }
            if (z12) {
                z9 = true;
                this.f41102F = false;
                if (z9) {
                    int i6 = this.f41115v.f24344C;
                    if (i6 == 6) {
                        z10 = activity.getResources().getConfiguration().orientation == 1;
                        this.f41102F = z10;
                    } else if (i6 == 7) {
                        z10 = activity.getResources().getConfiguration().orientation == 2;
                        this.f41102F = z10;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(z10).length() + 41);
                    sb.append("Delay onShow to next orientation change: ");
                    sb.append(z10);
                    String sb2 = sb.toString();
                    int i9 = z.f41712b;
                    x2.i.a(sb2);
                    Q(this.f41115v.f24344C);
                    window2.setFlags(com.anythink.basead.exoplayer.b.bc, com.anythink.basead.exoplayer.b.bc);
                    x2.i.a("Hardware acceleration on the AdActivity window enabled.");
                    activity.setContentView(this.f41101E);
                    this.f41107L = true;
                    if (this.f41100D) {
                        this.f41101E.setBackgroundColor(f41096S);
                        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.f33123q1)).booleanValue() && Build.VERSION.SDK_INT >= 31) {
                            window2.setBackgroundBlurRadius(this.f41103G);
                        }
                    } else {
                        this.f41101E.setBackgroundColor(-16777216);
                    }
                    if (z6) {
                        try {
                            C2889Yb c2889Yb = C4906k.f40186C.f40192d;
                            InterfaceC4084vh interfaceC4084vh3 = this.f41115v.f24361w;
                            A3.r j02 = interfaceC4084vh3 != null ? interfaceC4084vh3.j0() : null;
                            InterfaceC4084vh interfaceC4084vh4 = this.f41115v.f24361w;
                            String R8 = interfaceC4084vh4 != null ? interfaceC4084vh4.R() : null;
                            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f41115v;
                            C5189a c5189a = adOverlayInfoParcel2.f24347F;
                            InterfaceC4084vh interfaceC4084vh5 = adOverlayInfoParcel2.f24361w;
                            if (interfaceC4084vh5 != null) {
                                c4797a = interfaceC4084vh5.k();
                                obj = null;
                            } else {
                                obj = null;
                                c4797a = null;
                            }
                            window = window2;
                            i = 31;
                            InterfaceC4084vh g9 = C2889Yb.g(j02, activity, null, new C3091d9(), null, null, null, null, null, null, null, R8, c4797a, c5189a, true, z9);
                            z11 = z9;
                            this.f41116w = g9;
                            C2677Lh h03 = g9.h0();
                            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f41115v;
                            InterfaceC2857Wb interfaceC2857Wb = adOverlayInfoParcel3.f24350I;
                            InterfaceC4084vh interfaceC4084vh6 = adOverlayInfoParcel3.f24361w;
                            h03.i(null, interfaceC2857Wb, null, adOverlayInfoParcel3.f24362x, adOverlayInfoParcel3.f24343B, true, null, interfaceC4084vh6 != null ? interfaceC4084vh6.h0().f26939P : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                            this.f41116w.h0().f26956z = new InterfaceC2728Oh() { // from class: v2.g
                                @Override // com.google.android.gms.internal.ads.InterfaceC2728Oh
                                public final /* synthetic */ void C(String str, int i10, String str2, boolean z14) {
                                    InterfaceC4084vh interfaceC4084vh7 = BinderC5100d.this.f41116w;
                                    if (interfaceC4084vh7 != null) {
                                        interfaceC4084vh7.k0();
                                    }
                                }
                            };
                            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f41115v;
                            String str = adOverlayInfoParcel4.f24346E;
                            if (str != null) {
                                this.f41116w.loadUrl(str);
                            } else {
                                String str2 = adOverlayInfoParcel4.f24342A;
                                if (str2 == null) {
                                    throw new h("No URL or HTML to display in ad overlay.");
                                }
                                this.f41116w.loadDataWithBaseURL(adOverlayInfoParcel4.f24363y, str2, "text/html", "UTF-8", null);
                            }
                            InterfaceC4084vh interfaceC4084vh7 = this.f41115v.f24361w;
                            if (interfaceC4084vh7 != null) {
                                interfaceC4084vh7.m1(this);
                            }
                        } catch (Exception e9) {
                            x2.i.d("Error obtaining webview.", e9);
                            throw new h("Could not obtain webview for the overlay.", e9);
                        }
                    } else {
                        window = window2;
                        i = 31;
                        z11 = z9;
                        InterfaceC4084vh interfaceC4084vh8 = this.f41115v.f24361w;
                        this.f41116w = interfaceC4084vh8;
                        interfaceC4084vh8.D0(activity);
                    }
                    if (this.f41115v.f24356P) {
                        i4 = 0;
                        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f41116w.q(), false);
                        C3324ha c3324ha = AbstractC3592ma.f33187x1;
                        r rVar = r.f40506e;
                        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && Build.VERSION.SDK_INT >= 27) {
                            this.f41116w.q().setTextClassifier(TextClassifier.NO_OP);
                        }
                        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33197y1)).booleanValue()) {
                            this.f41116w.q().setDownloadListener(f.f41131n);
                        }
                    } else {
                        i4 = 0;
                    }
                    this.f41116w.i1(this);
                    interfaceC4084vh = this.f41115v.f24361w;
                    if (interfaceC4084vh != null) {
                        W3(this.f41101E, interfaceC4084vh.C0());
                    }
                    if (this.f41115v.f24345D != 5) {
                        ViewParent parent = this.f41116w.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(this.f41116w.V());
                        }
                        if (this.f41100D) {
                            this.f41116w.O0();
                            if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.f33123q1)).booleanValue() && Build.VERSION.SDK_INT >= i) {
                                window.setBackgroundBlurRadius(this.f41103G);
                            }
                        }
                        if (this.f41115v.f24356P) {
                            Toolbar toolbar = new Toolbar(activity);
                            this.f41111P = toolbar;
                            toolbar.setId(View.generateViewId());
                            this.f41116w.V().setId(View.generateViewId());
                            this.f41111P.setBackgroundColor(-12303292);
                            this.f41111P.setVisibility(i4);
                            try {
                                this.f41111P.setNavigationIcon(C4906k.f40186C.f40196h.c().getDrawable(C5248R.drawable.admob_close_button_white_cross, null));
                            } catch (Resources.NotFoundException | NullPointerException e10) {
                                z.l("Error obtaining close icon.", e10);
                            }
                            this.f41111P.setNavigationOnClickListener(this.f41105I);
                            this.f41111P.setTitleMarginStart(i4);
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams.addRule(10);
                            this.f41101E.addView(this.f41111P, layoutParams);
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams2.addRule(3, this.f41111P.getId());
                            layoutParams2.addRule(12);
                            this.f41101E.addView(this.f41116w.V(), layoutParams2);
                            V3(this.f41111P);
                        } else {
                            this.f41101E.addView(this.f41116w.V(), -1, -1);
                        }
                    }
                    if (!z6 && !this.f41102F) {
                        this.f41116w.k0();
                    }
                    adOverlayInfoParcel = this.f41115v;
                    if (adOverlayInfoParcel.f24345D != 5) {
                        X3(z11);
                        if (this.f41116w.n1()) {
                            Y3(z11, true);
                            return;
                        }
                        return;
                    }
                    C2787Rp c2787Rp = new C2787Rp(activity, this, adOverlayInfoParcel.J, adOverlayInfoParcel.f24351K);
                    if (adOverlayInfoParcel != null) {
                        try {
                            InterfaceC3274ge interfaceC3274ge = adOverlayInfoParcel.f24355O;
                            if (interfaceC3274ge != null) {
                                interfaceC3274ge.f0(new Y2.b(c2787Rp));
                                return;
                            }
                        } catch (RemoteException | h e11) {
                            throw new h(e11.getMessage(), e11);
                        }
                    }
                    throw new h("noioou");
                }
                z10 = false;
                StringBuilder sb3 = new StringBuilder(String.valueOf(z10).length() + 41);
                sb3.append("Delay onShow to next orientation change: ");
                sb3.append(z10);
                String sb22 = sb3.toString();
                int i92 = z.f41712b;
                x2.i.a(sb22);
                Q(this.f41115v.f24344C);
                window2.setFlags(com.anythink.basead.exoplayer.b.bc, com.anythink.basead.exoplayer.b.bc);
                x2.i.a("Hardware acceleration on the AdActivity window enabled.");
                activity.setContentView(this.f41101E);
                this.f41107L = true;
                if (this.f41100D) {
                }
                if (z6) {
                }
                if (this.f41115v.f24356P) {
                }
                this.f41116w.i1(this);
                interfaceC4084vh = this.f41115v.f24361w;
                if (interfaceC4084vh != null) {
                }
                if (this.f41115v.f24345D != 5) {
                }
                if (!z6) {
                    this.f41116w.k0();
                }
                adOverlayInfoParcel = this.f41115v;
                if (adOverlayInfoParcel.f24345D != 5) {
                }
            }
        }
        z9 = false;
        this.f41102F = false;
        if (z9) {
        }
        z10 = false;
        StringBuilder sb32 = new StringBuilder(String.valueOf(z10).length() + 41);
        sb32.append("Delay onShow to next orientation change: ");
        sb32.append(z10);
        String sb222 = sb32.toString();
        int i922 = z.f41712b;
        x2.i.a(sb222);
        Q(this.f41115v.f24344C);
        window2.setFlags(com.anythink.basead.exoplayer.b.bc, com.anythink.basead.exoplayer.b.bc);
        x2.i.a("Hardware acceleration on the AdActivity window enabled.");
        activity.setContentView(this.f41101E);
        this.f41107L = true;
        if (this.f41100D) {
        }
        if (z6) {
        }
        if (this.f41115v.f24356P) {
        }
        this.f41116w.i1(this);
        interfaceC4084vh = this.f41115v.f24361w;
        if (interfaceC4084vh != null) {
        }
        if (this.f41115v.f24345D != 5) {
        }
        if (!z6) {
        }
        adOverlayInfoParcel = this.f41115v;
        if (adOverlayInfoParcel.f24345D != 5) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void d() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f41115v;
        if (adOverlayInfoParcel == null || (lVar = adOverlayInfoParcel.f24360v) == null) {
            return;
        }
        lVar.N2();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final boolean e() {
        this.f41112Q = 1;
        if (this.f41116w == null) {
            return true;
        }
        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.ka)).booleanValue() && this.f41116w.canGoBack()) {
            this.f41116w.goBack();
            return false;
        }
        boolean k12 = this.f41116w.k1();
        if (!k12) {
            this.f41116w.d("onbackblocked", Collections.EMPTY_MAP);
        }
        return k12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void g() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f41115v;
        if (adOverlayInfoParcel == null || (lVar = adOverlayInfoParcel.f24360v) == null) {
            return;
        }
        lVar.t0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void j() {
        int i;
        C4902g c4902g;
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f41115v;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f24360v) != null) {
            lVar.S1();
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f41115v;
        boolean z6 = (adOverlayInfoParcel2 == null || (c4902g = adOverlayInfoParcel2.f24349H) == null || !c4902g.f40177z) ? false : true;
        Window window = this.f41114u.getWindow();
        C3324ha c3324ha = AbstractC3592ma.f32851M1;
        r rVar = r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(true != z6 ? 5380 : 5894);
        } else {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (z6) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
        }
        C3324ha c3324ha2 = AbstractC3592ma.Ye;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue() && (i = Build.VERSION.SDK_INT) <= 34 && i >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
            AbstractC0426a.n(window, false);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32960Y5)).booleanValue()) {
            return;
        }
        InterfaceC4084vh interfaceC4084vh = this.f41116w;
        if (interfaceC4084vh != null && !interfaceC4084vh.n0()) {
            this.f41116w.onResume();
        } else {
            int i4 = z.f41712b;
            x2.i.f("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void k() {
        l lVar;
        A();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f41115v;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f24360v) != null) {
            lVar.r1();
        }
        if (!((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.f32960Y5)).booleanValue() && this.f41116w != null && (!this.f41114u.isFinishing() || this.f41117x == null)) {
            this.f41116w.onPause();
        }
        u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void n() {
        l lVar;
        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.f32960Y5)).booleanValue()) {
            InterfaceC4084vh interfaceC4084vh = this.f41116w;
            if (interfaceC4084vh == null || interfaceC4084vh.n0()) {
                int i = z.f41712b;
                x2.i.f("The webview does not exist. Ignoring action.");
            } else {
                this.f41116w.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f41115v;
        if (adOverlayInfoParcel == null || (lVar = adOverlayInfoParcel.f24360v) == null) {
            return;
        }
        lVar.G1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void o() {
        this.f41112Q = 1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void p1(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.f41114u;
            if (activity == null) {
                throw new NullPointerException("Null activity");
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f41115v;
            try {
                adOverlayInfoParcel.f24355O.B1(strArr, iArr, new Y2.b(new C2787Rp(activity, adOverlayInfoParcel.f24345D == 5 ? this : null, null, null)));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void r3(int i, int i4, Intent intent) {
        C3230fo c3230fo;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            C3324ha c3324ha = AbstractC3592ma.Je;
            r rVar = r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 66);
                sb.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb.append(i4);
                z.k(sb.toString());
                InterfaceC4084vh interfaceC4084vh = this.f41116w;
                if (interfaceC4084vh == null || interfaceC4084vh.h0() == null || (c3230fo = interfaceC4084vh.h0().f26942S) == null || (adOverlayInfoParcel = this.f41115v) == null || !((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    return;
                }
                S0.e a9 = c3230fo.a();
                a9.M(NativeAdvancedJsUtils.f18693p, "hilca");
                String str = adOverlayInfoParcel.J;
                if (str == null) {
                    str = "";
                }
                a9.M("gqi", str);
                StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length());
                sb2.append(i4);
                a9.M("hilr", sb2.toString());
                if (i4 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        a9.M("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        a9.M("hills", stringExtra2);
                    }
                }
                a9.P();
            }
        }
    }

    public final void t() {
        this.f41112Q = 3;
        Activity activity = this.f41114u;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f41115v;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f24345D != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        InterfaceC4084vh interfaceC4084vh = this.f41116w;
        if (interfaceC4084vh != null) {
            interfaceC4084vh.i1(null);
        }
    }

    public final void u() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        l lVar;
        if (!this.f41114u.isFinishing() || this.f41108M) {
            return;
        }
        this.f41108M = true;
        InterfaceC4084vh interfaceC4084vh = this.f41116w;
        if (interfaceC4084vh != null) {
            interfaceC4084vh.T0(this.f41112Q - 1);
            synchronized (this.f41104H) {
                try {
                    if (!this.f41106K && this.f41116w.a1()) {
                        C3324ha c3324ha = AbstractC3592ma.f32952X5;
                        r rVar = r.f40506e;
                        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && !this.f41109N && (adOverlayInfoParcel = this.f41115v) != null && (lVar = adOverlayInfoParcel.f24360v) != null) {
                            lVar.Q1();
                        }
                        r3.b bVar = new r3.b(10, this);
                        this.J = bVar;
                        D.f41627l.postDelayed(bVar, ((Long) rVar.f40509c.a(AbstractC3592ma.f32796F1)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        U3();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void x1(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f41099C);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void d3(Y2.a aVar) {
    }
}
