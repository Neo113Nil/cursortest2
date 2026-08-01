package t2;

import L3.q;
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
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractBinderC3519le;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2473Ak;
import com.google.android.gms.internal.ads.C2657Lh;
import com.google.android.gms.internal.ads.C2767Rp;
import com.google.android.gms.internal.ads.C2866Yb;
import com.google.android.gms.internal.ads.C2931ag;
import com.google.android.gms.internal.ads.C3;
import com.google.android.gms.internal.ads.C3068d9;
import com.google.android.gms.internal.ads.C3153eo;
import com.google.android.gms.internal.ads.C3155eq;
import com.google.android.gms.internal.ads.C3209fq;
import com.google.android.gms.internal.ads.C3301ha;
import com.google.android.gms.internal.ads.C3472kl;
import com.google.android.gms.internal.ads.InterfaceC2542El;
import com.google.android.gms.internal.ads.InterfaceC2708Oh;
import com.google.android.gms.internal.ads.InterfaceC2834Wb;
import com.google.android.gms.internal.ads.InterfaceC3251ge;
import com.google.android.gms.internal.ads.InterfaceC4061vh;
import com.google.android.gms.internal.ads.RunnableC2995bq;
import com.google.android.gms.internal.ads.RunnableC3048cq;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3461ka;
import com.google.android.gms.internal.ads.Tv;
import com.google.android.gms.internal.ads.Uv;
import com.google.android.gms.internal.ads.Vr;
import com.google.android.gms.internal.ads.Yv;
import com.icefishing.icefishingbigwin.C5275R;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4831f;
import p2.C4835j;
import q2.InterfaceC4870a;
import q2.r;
import u2.D;
import u2.z;
import v2.C5110a;

/* renamed from: t2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC5036d extends AbstractBinderC3519le {

    /* renamed from: S, reason: collision with root package name */
    public static final int f40808S = Color.argb(0, 0, 0, 0);

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f40809A;

    /* renamed from: B, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f40810B;

    /* renamed from: E, reason: collision with root package name */
    public i f40813E;
    public p3.b J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f40818K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f40819L;

    /* renamed from: P, reason: collision with root package name */
    public Toolbar f40823P;

    /* renamed from: R, reason: collision with root package name */
    public final /* synthetic */ int f40825R;

    /* renamed from: u, reason: collision with root package name */
    public final Activity f40826u;

    /* renamed from: v, reason: collision with root package name */
    public AdOverlayInfoParcel f40827v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC4061vh f40828w;

    /* renamed from: x, reason: collision with root package name */
    public L2.n f40829x;

    /* renamed from: y, reason: collision with root package name */
    public m f40830y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f40831z = false;

    /* renamed from: C, reason: collision with root package name */
    public boolean f40811C = false;

    /* renamed from: D, reason: collision with root package name */
    public boolean f40812D = false;

    /* renamed from: F, reason: collision with root package name */
    public boolean f40814F = false;

    /* renamed from: Q, reason: collision with root package name */
    public int f40824Q = 1;

    /* renamed from: G, reason: collision with root package name */
    public int f40815G = 0;

    /* renamed from: H, reason: collision with root package name */
    public final Object f40816H = new Object();

    /* renamed from: I, reason: collision with root package name */
    public final q f40817I = new q(this);

    /* renamed from: M, reason: collision with root package name */
    public boolean f40820M = false;

    /* renamed from: N, reason: collision with root package name */
    public boolean f40821N = false;

    /* renamed from: O, reason: collision with root package name */
    public boolean f40822O = true;

    public BinderC5036d(Activity activity, int i) {
        this.f40825R = i;
        this.f40826u = activity;
    }

    public static final void W3(View view, C3209fq c3209fq) {
        if (c3209fq == null || view == null) {
            return;
        }
        if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.j6)).booleanValue()) {
            C3 c32 = c3209fq.f30457b;
            if (((Tv) c32.f24026z) == Tv.HTML) {
                return;
            }
        }
        C3472kl c3472kl = C4835j.f39733C.f39758x;
        Uv uv = c3209fq.f30456a;
        c3472kl.getClass();
        C3472kl.i(uv, view);
    }

    public final void A() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40827v;
        if (adOverlayInfoParcel != null && this.f40831z) {
            Q(adOverlayInfoParcel.f23564C);
        }
        if (this.f40809A != null) {
            this.f40826u.setContentView(this.f40813E);
            this.f40819L = true;
            this.f40809A.removeAllViews();
            this.f40809A = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f40810B;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f40810B = null;
        }
        this.f40831z = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[Catch: h -> 0x003c, TryCatch #1 {h -> 0x003c, blocks: (B:13:0x0020, B:15:0x002e, B:17:0x0032, B:19:0x0038, B:20:0x003f, B:21:0x0048, B:23:0x0053, B:24:0x0055, B:26:0x005b, B:27:0x0067, B:29:0x006e, B:32:0x0080, B:34:0x0084, B:36:0x0089, B:38:0x0096, B:40:0x009a, B:42:0x00a0, B:48:0x00a8, B:51:0x00ac, B:53:0x00ad, B:55:0x00b3, B:56:0x00b6, B:58:0x00bc, B:60:0x00c0, B:61:0x00c3, B:63:0x00c9, B:64:0x00cc, B:66:0x00d0, B:68:0x00d4, B:69:0x00d7, B:76:0x0102, B:78:0x0106, B:79:0x010d, B:80:0x010e, B:82:0x0112, B:84:0x011f, B:86:0x007a, B:88:0x007e, B:89:0x0092, B:90:0x0123, B:91:0x012a, B:44:0x00a1, B:46:0x00a5), top: B:12:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0 A[Catch: h -> 0x003c, TryCatch #1 {h -> 0x003c, blocks: (B:13:0x0020, B:15:0x002e, B:17:0x0032, B:19:0x0038, B:20:0x003f, B:21:0x0048, B:23:0x0053, B:24:0x0055, B:26:0x005b, B:27:0x0067, B:29:0x006e, B:32:0x0080, B:34:0x0084, B:36:0x0089, B:38:0x0096, B:40:0x009a, B:42:0x00a0, B:48:0x00a8, B:51:0x00ac, B:53:0x00ad, B:55:0x00b3, B:56:0x00b6, B:58:0x00bc, B:60:0x00c0, B:61:0x00c3, B:63:0x00c9, B:64:0x00cc, B:66:0x00d0, B:68:0x00d4, B:69:0x00d7, B:76:0x0102, B:78:0x0106, B:79:0x010d, B:80:0x010e, B:82:0x0112, B:84:0x011f, B:86:0x007a, B:88:0x007e, B:89:0x0092, B:90:0x0123, B:91:0x012a, B:44:0x00a1, B:46:0x00a5), top: B:12:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011f A[Catch: h -> 0x003c, TryCatch #1 {h -> 0x003c, blocks: (B:13:0x0020, B:15:0x002e, B:17:0x0032, B:19:0x0038, B:20:0x003f, B:21:0x0048, B:23:0x0053, B:24:0x0055, B:26:0x005b, B:27:0x0067, B:29:0x006e, B:32:0x0080, B:34:0x0084, B:36:0x0089, B:38:0x0096, B:40:0x009a, B:42:0x00a0, B:48:0x00a8, B:51:0x00ac, B:53:0x00ad, B:55:0x00b3, B:56:0x00b6, B:58:0x00bc, B:60:0x00c0, B:61:0x00c3, B:63:0x00c9, B:64:0x00cc, B:66:0x00d0, B:68:0x00d4, B:69:0x00d7, B:76:0x0102, B:78:0x0106, B:79:0x010d, B:80:0x010e, B:82:0x0112, B:84:0x011f, B:86:0x007a, B:88:0x007e, B:89:0x0092, B:90:0x0123, B:91:0x012a, B:44:0x00a1, B:46:0x00a5), top: B:12:0x0020, inners: #0 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void D0(Bundle bundle) {
        Activity activity;
        AdOverlayInfoParcel a9;
        AdOverlayInfoParcel adOverlayInfoParcel;
        int i;
        l lVar;
        switch (this.f40825R) {
            case 4:
                z.k("AdOverlayParcel is null or does not contain valid overlay type.");
                this.f40824Q = 4;
                this.f40826u.finish();
                return;
            default:
                if (!this.f40819L) {
                    this.f40826u.requestWindowFeature(1);
                }
                this.f40811C = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
                try {
                    activity = this.f40826u;
                    a9 = AdOverlayInfoParcel.a(activity.getIntent());
                    this.f40827v = a9;
                } catch (h e9) {
                    String message = e9.getMessage();
                    int i6 = z.f41322b;
                    v2.i.f(message);
                    this.f40824Q = 4;
                    this.f40826u.finish();
                    return;
                }
                if (a9 == null) {
                    throw new h("Could not get info for ad overlay.");
                }
                if (a9.f23576P) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        activity.setShowWhenLocked(true);
                    } else {
                        activity.getWindow().addFlags(524288);
                    }
                }
                if (this.f40827v.f23567F.f41393v > 7500000) {
                    this.f40824Q = 4;
                }
                if (activity.getIntent() != null) {
                    this.f40822O = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f40827v;
                C4831f c4831f = adOverlayInfoParcel2.f23569H;
                if (c4831f != null) {
                    boolean z3 = c4831f.f39718n;
                    this.f40812D = z3;
                    this.f40815G = (int) c4831f.f39722x;
                    if (z3) {
                        if (adOverlayInfoParcel2.f23565D != 5 && c4831f.f39723y != -1) {
                            new C2931ag(this).l();
                        }
                    }
                    if (bundle == null) {
                        if (this.f40822O) {
                            C2473Ak c2473Ak = this.f40827v.f23573M;
                            if (c2473Ak != null) {
                                synchronized (c2473Ak) {
                                    ScheduledFuture scheduledFuture = c2473Ak.f23725w;
                                    if (scheduledFuture != null) {
                                        scheduledFuture.cancel(true);
                                    }
                                }
                            }
                            l lVar2 = this.f40827v.f23580v;
                            if (lVar2 != null) {
                                lVar2.g();
                            }
                        }
                        AdOverlayInfoParcel adOverlayInfoParcel3 = this.f40827v;
                        if (adOverlayInfoParcel3.f23565D != 1) {
                            InterfaceC4870a interfaceC4870a = adOverlayInfoParcel3.f23579u;
                            if (interfaceC4870a != null) {
                                interfaceC4870a.onAdClicked();
                            }
                            InterfaceC2542El interfaceC2542El = this.f40827v.f23574N;
                            if (interfaceC2542El != null) {
                                interfaceC2542El.J();
                            }
                        }
                    }
                    adOverlayInfoParcel = this.f40827v;
                    if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f23580v) != null) {
                        lVar.h1();
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel4 = this.f40827v;
                    i iVar = new i(activity, adOverlayInfoParcel4.f23568G, adOverlayInfoParcel4.f23567F.f41391n, adOverlayInfoParcel4.f23572L);
                    this.f40813E = iVar;
                    iVar.setId(1000);
                    C4835j.f39733C.f39741f.v(activity);
                    AdOverlayInfoParcel adOverlayInfoParcel5 = this.f40827v;
                    i = adOverlayInfoParcel5.f23565D;
                    if (i == 1) {
                        a4(false);
                        return;
                    }
                    if (i == 2) {
                        this.f40829x = new L2.n(adOverlayInfoParcel5.f23581w);
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
                if (adOverlayInfoParcel2.f23565D == 5) {
                    this.f40812D = true;
                    if (adOverlayInfoParcel2.f23565D != 5) {
                        new C2931ag(this).l();
                    }
                    if (bundle == null) {
                    }
                    adOverlayInfoParcel = this.f40827v;
                    if (adOverlayInfoParcel != null) {
                        lVar.h1();
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel42 = this.f40827v;
                    i iVar2 = new i(activity, adOverlayInfoParcel42.f23568G, adOverlayInfoParcel42.f23567F.f41391n, adOverlayInfoParcel42.f23572L);
                    this.f40813E = iVar2;
                    iVar2.setId(1000);
                    C4835j.f39733C.f39741f.v(activity);
                    AdOverlayInfoParcel adOverlayInfoParcel52 = this.f40827v;
                    i = adOverlayInfoParcel52.f23565D;
                    if (i == 1) {
                    }
                } else {
                    this.f40812D = false;
                    if (bundle == null) {
                    }
                    adOverlayInfoParcel = this.f40827v;
                    if (adOverlayInfoParcel != null) {
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel422 = this.f40827v;
                    i iVar22 = new i(activity, adOverlayInfoParcel422.f23568G, adOverlayInfoParcel422.f23567F.f41391n, adOverlayInfoParcel422.f23572L);
                    this.f40813E = iVar22;
                    iVar22.setId(1000);
                    C4835j.f39733C.f39741f.v(activity);
                    AdOverlayInfoParcel adOverlayInfoParcel522 = this.f40827v;
                    i = adOverlayInfoParcel522.f23565D;
                    if (i == 1) {
                    }
                }
                String message2 = e9.getMessage();
                int i62 = z.f41322b;
                v2.i.f(message2);
                this.f40824Q = 4;
                this.f40826u.finish();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void E() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40827v;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f23580v) != null) {
            lVar.M0();
        }
        if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.f32181Y5)).booleanValue() && this.f40828w != null && (!this.f40826u.isFinishing() || this.f40829x == null)) {
            this.f40828w.onPause();
        }
        u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void F1(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f40811C);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void J() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40827v;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f23580v) != null) {
            lVar.f1();
        }
        InterfaceC4061vh interfaceC4061vh = this.f40828w;
        if (interfaceC4061vh != null) {
            try {
                this.f40813E.removeView(interfaceC4061vh.V());
            } catch (NullPointerException unused) {
            }
        }
        u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void L0() {
        this.f40819L = true;
    }

    public final void Q(int i) {
        int i6;
        Activity activity = this.f40826u;
        int i9 = activity.getApplicationInfo().targetSdkVersion;
        C3301ha c3301ha = AbstractC3569ma.f32130S6;
        r rVar = r.f40207e;
        if (i9 >= ((Integer) rVar.f40210c.a(c3301ha)).intValue()) {
            int i10 = activity.getApplicationInfo().targetSdkVersion;
            C3301ha c3301ha2 = AbstractC3569ma.f32139T6;
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
            if (i10 <= ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).intValue() && (i6 = Build.VERSION.SDK_INT) >= ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32147U6)).intValue() && i6 <= ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32156V6)).intValue()) {
                return;
            }
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            C4835j.f39733C.f39743h.e("AdOverlay.setRequestedOrientation", th);
        }
    }

    public final void U3() {
        InterfaceC4061vh interfaceC4061vh;
        l lVar;
        if (this.f40821N) {
            return;
        }
        this.f40821N = true;
        InterfaceC4061vh interfaceC4061vh2 = this.f40828w;
        if (interfaceC4061vh2 != null) {
            this.f40813E.removeView(interfaceC4061vh2.V());
            L2.n nVar = this.f40829x;
            if (nVar != null) {
                this.f40828w.E0((Context) nVar.f1660b);
                this.f40828w.i1(false);
                if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.fe)).booleanValue() && this.f40828w.getParent() != null) {
                    ((ViewGroup) this.f40828w.getParent()).removeView(this.f40828w.V());
                }
                ViewGroup viewGroup = (ViewGroup) this.f40829x.f1662d;
                View V8 = this.f40828w.V();
                L2.n nVar2 = this.f40829x;
                viewGroup.addView(V8, nVar2.f1659a, (ViewGroup.LayoutParams) nVar2.f1661c);
                this.f40829x = null;
            } else {
                Activity activity = this.f40826u;
                if (activity.getApplicationContext() != null) {
                    this.f40828w.E0(activity.getApplicationContext());
                }
            }
            this.f40828w = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40827v;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f23580v) != null) {
            lVar.H3(this.f40824Q);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f40827v;
        if (adOverlayInfoParcel2 == null || (interfaceC4061vh = adOverlayInfoParcel2.f23581w) == null) {
            return;
        }
        W3(this.f40827v.f23581w.V(), interfaceC4061vh.D0());
    }

    public final void V3(View view) {
        C3209fq D02;
        C3155eq G02;
        InterfaceC4061vh interfaceC4061vh = this.f40828w;
        if (interfaceC4061vh == null) {
            return;
        }
        C3301ha c3301ha = AbstractC3569ma.f32293k6;
        r rVar = r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() && (G02 = interfaceC4061vh.G0()) != null) {
            synchronized (G02) {
                Yv yv = G02.f29985f;
                if (yv != null) {
                    C4835j.f39733C.f39758x.getClass();
                    C3472kl.p(new RunnableC3048cq(1, yv, view));
                    return;
                }
                return;
            }
        }
        if (((Boolean) rVar.f40210c.a(AbstractC3569ma.j6)).booleanValue() && (D02 = interfaceC4061vh.D0()) != null && ((Tv) D02.f30457b.f24026z) == Tv.HTML) {
            C3472kl c3472kl = C4835j.f39733C.f39758x;
            Uv uv = D02.f30456a;
            c3472kl.getClass();
            C3472kl.p(new RunnableC2995bq(uv, view, 0));
        }
    }

    public final void X3(boolean z3) {
        if (this.f40827v.f23576P) {
            return;
        }
        C3301ha c3301ha = AbstractC3569ma.f32199a6;
        r rVar = r.f40207e;
        int intValue = ((Integer) rVar.f40210c.a(c3301ha)).intValue();
        boolean z6 = ((Boolean) rVar.f40210c.a(AbstractC3569ma.f32040I1)).booleanValue() || z3;
        Vr vr = new Vr();
        vr.f28250a = 0;
        vr.f28251b = 0;
        vr.f28252c = 0;
        vr.f28253d = 50;
        vr.f28250a = true != z6 ? 0 : intValue;
        vr.f28251b = true != z6 ? intValue : 0;
        vr.f28252c = intValue;
        this.f40830y = new m(this.f40826u, vr, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z6 ? 9 : 11);
        Y3(z3, this.f40827v.f23584z);
        this.f40813E.addView(this.f40830y, layoutParams);
        V3(this.f40830y);
    }

    public final void Y3(boolean z3, boolean z6) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        C4831f c4831f;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        C4831f c4831f2;
        C3301ha c3301ha = AbstractC3569ma.f32024G1;
        r rVar = r.f40207e;
        boolean z9 = true;
        boolean z10 = ((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() && (adOverlayInfoParcel2 = this.f40827v) != null && (c4831f2 = adOverlayInfoParcel2.f23569H) != null && c4831f2.f39716A;
        C3301ha c3301ha2 = AbstractC3569ma.H1;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
        boolean z11 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue() && (adOverlayInfoParcel = this.f40827v) != null && (c4831f = adOverlayInfoParcel.f23569H) != null && c4831f.f39717B;
        if (z3 && z6 && z10 && !z11) {
            InterfaceC4061vh interfaceC4061vh = this.f40828w;
            try {
                JSONObject put = new JSONObject().put("message", "Custom close has been disabled for interstitial ads in this ad slot.").put(NativeAdvancedJsUtils.f17906p, "useCustomClose");
                if (interfaceC4061vh != null) {
                    interfaceC4061vh.e("onError", put);
                }
            } catch (JSONException e9) {
                int i = z.f41322b;
                v2.i.d("Error occurred while dispatching error event.", e9);
            }
        }
        m mVar = this.f40830y;
        if (mVar != null) {
            if (!z11 && (!z6 || z10)) {
                z9 = false;
            }
            ImageButton imageButton = mVar.f40857n;
            if (!z9) {
                imageButton.setVisibility(0);
                return;
            }
            imageButton.setVisibility(8);
            if (((Long) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32056K1)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
            }
        }
    }

    public final void Z3(int i, boolean z3) {
        if (!z3) {
            this.f40813E.setBackgroundColor(-16777216);
            return;
        }
        this.f40813E.setBackgroundColor(0);
        this.f40815G = i;
        Window window = this.f40826u.getWindow();
        if (!((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.f32343q1)).booleanValue() || Build.VERSION.SDK_INT < 31 || window == null) {
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
    public final void a4(boolean z3) {
        boolean z6;
        boolean z9;
        Object obj;
        k8.b bVar;
        Window window;
        int i;
        boolean z10;
        int i6;
        InterfaceC4061vh interfaceC4061vh;
        AdOverlayInfoParcel adOverlayInfoParcel;
        boolean z11;
        boolean z12 = this.f40819L;
        Activity activity = this.f40826u;
        if (!z12) {
            activity.requestWindowFeature(1);
        }
        Window window2 = activity.getWindow();
        if (window2 == null) {
            throw new h("Invalid activity, no window available.");
        }
        InterfaceC4061vh interfaceC4061vh2 = this.f40827v.f23581w;
        C2657Lh g02 = interfaceC4061vh2 != null ? interfaceC4061vh2.g0() : null;
        if (g02 != null) {
            synchronized (g02.f26156w) {
                z11 = g02.J;
            }
            if (z11) {
                z6 = true;
                this.f40814F = false;
                if (z6) {
                    int i9 = this.f40827v.f23564C;
                    if (i9 == 6) {
                        z9 = activity.getResources().getConfiguration().orientation == 1;
                        this.f40814F = z9;
                    } else if (i9 == 7) {
                        z9 = activity.getResources().getConfiguration().orientation == 2;
                        this.f40814F = z9;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(z9).length() + 41);
                    sb.append("Delay onShow to next orientation change: ");
                    sb.append(z9);
                    String sb2 = sb.toString();
                    int i10 = z.f41322b;
                    v2.i.a(sb2);
                    Q(this.f40827v.f23564C);
                    window2.setFlags(com.anythink.basead.exoplayer.b.bc, com.anythink.basead.exoplayer.b.bc);
                    v2.i.a("Hardware acceleration on the AdActivity window enabled.");
                    activity.setContentView(this.f40813E);
                    this.f40819L = true;
                    if (this.f40812D) {
                        this.f40813E.setBackgroundColor(f40808S);
                        if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.f32343q1)).booleanValue() && Build.VERSION.SDK_INT >= 31) {
                            window2.setBackgroundBlurRadius(this.f40815G);
                        }
                    } else {
                        this.f40813E.setBackgroundColor(-16777216);
                    }
                    if (z3) {
                        try {
                            C2866Yb c2866Yb = C4835j.f39733C.f39739d;
                            InterfaceC4061vh interfaceC4061vh3 = this.f40827v.f23581w;
                            X2.b i02 = interfaceC4061vh3 != null ? interfaceC4061vh3.i0() : null;
                            InterfaceC4061vh interfaceC4061vh4 = this.f40827v.f23581w;
                            String R8 = interfaceC4061vh4 != null ? interfaceC4061vh4.R() : null;
                            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f40827v;
                            C5110a c5110a = adOverlayInfoParcel2.f23567F;
                            InterfaceC4061vh interfaceC4061vh5 = adOverlayInfoParcel2.f23581w;
                            if (interfaceC4061vh5 != null) {
                                bVar = interfaceC4061vh5.k();
                                obj = null;
                            } else {
                                obj = null;
                                bVar = null;
                            }
                            window = window2;
                            i = 31;
                            InterfaceC4061vh g4 = C2866Yb.g(i02, activity, null, new C3068d9(), null, null, null, null, null, null, null, R8, bVar, c5110a, true, z6);
                            z10 = z6;
                            this.f40828w = g4;
                            C2657Lh g03 = g4.g0();
                            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f40827v;
                            InterfaceC2834Wb interfaceC2834Wb = adOverlayInfoParcel3.f23570I;
                            InterfaceC4061vh interfaceC4061vh6 = adOverlayInfoParcel3.f23581w;
                            g03.i(null, interfaceC2834Wb, null, adOverlayInfoParcel3.f23582x, adOverlayInfoParcel3.f23563B, true, null, interfaceC4061vh6 != null ? interfaceC4061vh6.g0().f26142P : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                            this.f40828w.g0().f26159z = new InterfaceC2708Oh() { // from class: t2.g
                                @Override // com.google.android.gms.internal.ads.InterfaceC2708Oh
                                public final /* synthetic */ void z(String str, int i11, String str2, boolean z13) {
                                    InterfaceC4061vh interfaceC4061vh7 = BinderC5036d.this.f40828w;
                                    if (interfaceC4061vh7 != null) {
                                        interfaceC4061vh7.k0();
                                    }
                                }
                            };
                            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f40827v;
                            String str = adOverlayInfoParcel4.f23566E;
                            if (str != null) {
                                this.f40828w.loadUrl(str);
                            } else {
                                String str2 = adOverlayInfoParcel4.f23562A;
                                if (str2 == null) {
                                    throw new h("No URL or HTML to display in ad overlay.");
                                }
                                this.f40828w.loadDataWithBaseURL(adOverlayInfoParcel4.f23583y, str2, "text/html", "UTF-8", null);
                            }
                            InterfaceC4061vh interfaceC4061vh7 = this.f40827v.f23581w;
                            if (interfaceC4061vh7 != null) {
                                interfaceC4061vh7.j0(this);
                            }
                        } catch (Exception e9) {
                            v2.i.d("Error obtaining webview.", e9);
                            throw new h("Could not obtain webview for the overlay.", e9);
                        }
                    } else {
                        window = window2;
                        i = 31;
                        z10 = z6;
                        InterfaceC4061vh interfaceC4061vh8 = this.f40827v.f23581w;
                        this.f40828w = interfaceC4061vh8;
                        interfaceC4061vh8.E0(activity);
                    }
                    if (this.f40827v.f23576P) {
                        i6 = 0;
                        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f40828w.q(), false);
                        C3301ha c3301ha = AbstractC3569ma.f32408x1;
                        r rVar = r.f40207e;
                        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() && Build.VERSION.SDK_INT >= 27) {
                            this.f40828w.q().setTextClassifier(TextClassifier.NO_OP);
                        }
                        if (((Boolean) rVar.f40210c.a(AbstractC3569ma.f32418y1)).booleanValue()) {
                            this.f40828w.q().setDownloadListener(f.f40843n);
                        }
                    } else {
                        i6 = 0;
                    }
                    this.f40828w.t0(this);
                    interfaceC4061vh = this.f40827v.f23581w;
                    if (interfaceC4061vh != null) {
                        W3(this.f40813E, interfaceC4061vh.D0());
                    }
                    if (this.f40827v.f23565D != 5) {
                        ViewParent parent = this.f40828w.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(this.f40828w.V());
                        }
                        if (this.f40812D) {
                            this.f40828w.P0();
                            if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.f32343q1)).booleanValue() && Build.VERSION.SDK_INT >= i) {
                                window.setBackgroundBlurRadius(this.f40815G);
                            }
                        }
                        if (this.f40827v.f23576P) {
                            Toolbar toolbar = new Toolbar(activity);
                            this.f40823P = toolbar;
                            toolbar.setId(View.generateViewId());
                            this.f40828w.V().setId(View.generateViewId());
                            this.f40823P.setBackgroundColor(-12303292);
                            this.f40823P.setVisibility(i6);
                            try {
                                this.f40823P.setNavigationIcon(C4835j.f39733C.f39743h.c().getDrawable(C5275R.drawable.admob_close_button_white_cross, null));
                            } catch (Resources.NotFoundException | NullPointerException e10) {
                                z.l("Error obtaining close icon.", e10);
                            }
                            this.f40823P.setNavigationOnClickListener(this.f40817I);
                            this.f40823P.setTitleMarginStart(i6);
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams.addRule(10);
                            this.f40813E.addView(this.f40823P, layoutParams);
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams2.addRule(3, this.f40823P.getId());
                            layoutParams2.addRule(12);
                            this.f40813E.addView(this.f40828w.V(), layoutParams2);
                            V3(this.f40823P);
                        } else {
                            this.f40813E.addView(this.f40828w.V(), -1, -1);
                        }
                    }
                    if (!z3 && !this.f40814F) {
                        this.f40828w.k0();
                    }
                    adOverlayInfoParcel = this.f40827v;
                    if (adOverlayInfoParcel.f23565D != 5) {
                        X3(z10);
                        if (this.f40828w.m1()) {
                            Y3(z10, true);
                            return;
                        }
                        return;
                    }
                    C2767Rp c2767Rp = new C2767Rp(activity, this, adOverlayInfoParcel.J, adOverlayInfoParcel.f23571K);
                    if (adOverlayInfoParcel != null) {
                        try {
                            InterfaceC3251ge interfaceC3251ge = adOverlayInfoParcel.f23575O;
                            if (interfaceC3251ge != null) {
                                interfaceC3251ge.Y(new W2.b(c2767Rp));
                                return;
                            }
                        } catch (RemoteException | h e11) {
                            throw new h(e11.getMessage(), e11);
                        }
                    }
                    throw new h("noioou");
                }
                z9 = false;
                StringBuilder sb3 = new StringBuilder(String.valueOf(z9).length() + 41);
                sb3.append("Delay onShow to next orientation change: ");
                sb3.append(z9);
                String sb22 = sb3.toString();
                int i102 = z.f41322b;
                v2.i.a(sb22);
                Q(this.f40827v.f23564C);
                window2.setFlags(com.anythink.basead.exoplayer.b.bc, com.anythink.basead.exoplayer.b.bc);
                v2.i.a("Hardware acceleration on the AdActivity window enabled.");
                activity.setContentView(this.f40813E);
                this.f40819L = true;
                if (this.f40812D) {
                }
                if (z3) {
                }
                if (this.f40827v.f23576P) {
                }
                this.f40828w.t0(this);
                interfaceC4061vh = this.f40827v.f23581w;
                if (interfaceC4061vh != null) {
                }
                if (this.f40827v.f23565D != 5) {
                }
                if (!z3) {
                    this.f40828w.k0();
                }
                adOverlayInfoParcel = this.f40827v;
                if (adOverlayInfoParcel.f23565D != 5) {
                }
            }
        }
        z6 = false;
        this.f40814F = false;
        if (z6) {
        }
        z9 = false;
        StringBuilder sb32 = new StringBuilder(String.valueOf(z9).length() + 41);
        sb32.append("Delay onShow to next orientation change: ");
        sb32.append(z9);
        String sb222 = sb32.toString();
        int i1022 = z.f41322b;
        v2.i.a(sb222);
        Q(this.f40827v.f23564C);
        window2.setFlags(com.anythink.basead.exoplayer.b.bc, com.anythink.basead.exoplayer.b.bc);
        v2.i.a("Hardware acceleration on the AdActivity window enabled.");
        activity.setContentView(this.f40813E);
        this.f40819L = true;
        if (this.f40812D) {
        }
        if (z3) {
        }
        if (this.f40827v.f23576P) {
        }
        this.f40828w.t0(this);
        interfaceC4061vh = this.f40827v.f23581w;
        if (interfaceC4061vh != null) {
        }
        if (this.f40827v.f23565D != 5) {
        }
        if (!z3) {
        }
        adOverlayInfoParcel = this.f40827v;
        if (adOverlayInfoParcel.f23565D != 5) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void d() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40827v;
        if (adOverlayInfoParcel == null || (lVar = adOverlayInfoParcel.f23580v) == null) {
            return;
        }
        lVar.Q2();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final boolean e() {
        this.f40824Q = 1;
        if (this.f40828w == null) {
            return true;
        }
        if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.ka)).booleanValue() && this.f40828w.canGoBack()) {
            this.f40828w.goBack();
            return false;
        }
        boolean k12 = this.f40828w.k1();
        if (!k12) {
            this.f40828w.d("onbackblocked", Collections.EMPTY_MAP);
        }
        return k12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void g() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40827v;
        if (adOverlayInfoParcel == null || (lVar = adOverlayInfoParcel.f23580v) == null) {
            return;
        }
        lVar.w0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void j() {
        int i;
        C4831f c4831f;
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40827v;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f23580v) != null) {
            lVar.S1();
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f40827v;
        boolean z3 = (adOverlayInfoParcel2 == null || (c4831f = adOverlayInfoParcel2.f23569H) == null || !c4831f.f39724z) ? false : true;
        Window window = this.f40826u.getWindow();
        C3301ha c3301ha = AbstractC3569ma.f32072M1;
        r rVar = r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(true != z3 ? 5380 : 5894);
        } else {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (z3) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
        }
        C3301ha c3301ha2 = AbstractC3569ma.Ye;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue() && (i = Build.VERSION.SDK_INT) <= 34 && i >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
            com.bumptech.glide.d.j(window, false);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32181Y5)).booleanValue()) {
            return;
        }
        InterfaceC4061vh interfaceC4061vh = this.f40828w;
        if (interfaceC4061vh != null && !interfaceC4061vh.n0()) {
            this.f40828w.onResume();
        } else {
            int i6 = z.f41322b;
            v2.i.f("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void k() {
        l lVar;
        A();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40827v;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f23580v) != null) {
            lVar.t1();
        }
        if (!((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.f32181Y5)).booleanValue() && this.f40828w != null && (!this.f40826u.isFinishing() || this.f40829x == null)) {
            this.f40828w.onPause();
        }
        u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void n() {
        l lVar;
        if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.f32181Y5)).booleanValue()) {
            InterfaceC4061vh interfaceC4061vh = this.f40828w;
            if (interfaceC4061vh == null || interfaceC4061vh.n0()) {
                int i = z.f41322b;
                v2.i.f("The webview does not exist. Ignoring action.");
            } else {
                this.f40828w.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40827v;
        if (adOverlayInfoParcel == null || (lVar = adOverlayInfoParcel.f23580v) == null) {
            return;
        }
        lVar.L1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void o() {
        this.f40824Q = 1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void q1(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.f40826u;
            if (activity == null) {
                throw new NullPointerException("Null activity");
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f40827v;
            try {
                adOverlayInfoParcel.f23575O.I2(strArr, iArr, new W2.b(new C2767Rp(activity, adOverlayInfoParcel.f23565D == 5 ? this : null, null, null)));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void t() {
        this.f40824Q = 3;
        Activity activity = this.f40826u;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40827v;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f23565D != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        InterfaceC4061vh interfaceC4061vh = this.f40828w;
        if (interfaceC4061vh != null) {
            interfaceC4061vh.t0(null);
        }
    }

    public final void u() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        l lVar;
        if (!this.f40826u.isFinishing() || this.f40820M) {
            return;
        }
        this.f40820M = true;
        InterfaceC4061vh interfaceC4061vh = this.f40828w;
        if (interfaceC4061vh != null) {
            interfaceC4061vh.U0(this.f40824Q - 1);
            synchronized (this.f40816H) {
                try {
                    if (!this.f40818K && this.f40828w.b1()) {
                        C3301ha c3301ha = AbstractC3569ma.f32173X5;
                        r rVar = r.f40207e;
                        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() && !this.f40821N && (adOverlayInfoParcel = this.f40827v) != null && (lVar = adOverlayInfoParcel.f23580v) != null) {
                            lVar.R1();
                        }
                        p3.b bVar = new p3.b(9, this);
                        this.J = bVar;
                        D.f41237l.postDelayed(bVar, ((Long) rVar.f40210c.a(AbstractC3569ma.f32015F1)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        U3();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void x3(int i, int i6, Intent intent) {
        C3153eo c3153eo;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            C3301ha c3301ha = AbstractC3569ma.Je;
            r rVar = r.f40207e;
            if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 66);
                sb.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb.append(i6);
                z.k(sb.toString());
                InterfaceC4061vh interfaceC4061vh = this.f40828w;
                if (interfaceC4061vh == null || interfaceC4061vh.g0() == null || (c3153eo = interfaceC4061vh.g0().f26145S) == null || (adOverlayInfoParcel = this.f40827v) == null || !((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                    return;
                }
                S0.e a9 = c3153eo.a();
                a9.v(NativeAdvancedJsUtils.f17906p, "hilca");
                String str = adOverlayInfoParcel.J;
                if (str == null) {
                    str = "";
                }
                a9.v("gqi", str);
                StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length());
                sb2.append(i6);
                a9.v("hilr", sb2.toString());
                if (i6 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        a9.v("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        a9.v("hills", stringExtra2);
                    }
                }
                a9.B();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void I0(W2.a aVar) {
    }
}
