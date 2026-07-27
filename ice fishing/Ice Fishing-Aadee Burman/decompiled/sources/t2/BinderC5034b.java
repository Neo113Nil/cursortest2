package t2;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractBinderC3519le;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.B8;
import com.google.android.gms.internal.ads.C3301ha;
import com.google.android.gms.internal.ads.InterfaceC2542El;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3461ka;
import p2.C4835j;
import q2.InterfaceC4870a;
import q2.r;
import u2.D;
import u2.z;

/* renamed from: t2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC5034b extends AbstractBinderC3519le implements B8 {

    /* renamed from: u, reason: collision with root package name */
    public final AdOverlayInfoParcel f40799u;

    /* renamed from: v, reason: collision with root package name */
    public final Activity f40800v;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f40804z;

    /* renamed from: w, reason: collision with root package name */
    public boolean f40801w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f40802x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f40803y = false;

    /* renamed from: A, reason: collision with root package name */
    public boolean f40797A = false;

    /* renamed from: B, reason: collision with root package name */
    public boolean f40798B = false;

    public BinderC5034b(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        C5037e c5037e;
        boolean z3 = false;
        this.f40799u = adOverlayInfoParcel;
        this.f40800v = activity;
        C3301ha c3301ha = AbstractC3569ma.f32035H5;
        r rVar = r.f40204e;
        boolean booleanValue = ((Boolean) rVar.f40207c.a(c3301ha)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
        if ((booleanValue || ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32044I5)).booleanValue() || ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32076M5)).booleanValue()) && (c5037e = adOverlayInfoParcel.f23578n) != null && c5037e.f40831C && Build.MANUFACTURER.matches((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32060K5)) && Build.MODEL.matches((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32068L5))) {
            z3 = true;
        }
        this.f40804z = z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void D0(Bundle bundle) {
        l lVar;
        C3301ha c3301ha = AbstractC3569ma.ia;
        r rVar = r.f40204e;
        boolean booleanValue = ((Boolean) rVar.f40207c.a(c3301ha)).booleanValue();
        Activity activity = this.f40800v;
        if (booleanValue && !this.f40803y) {
            activity.requestWindowFeature(1);
        }
        boolean z3 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z3 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40799u;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z3) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            InterfaceC4870a interfaceC4870a = adOverlayInfoParcel.f23579u;
            if (interfaceC4870a != null) {
                interfaceC4870a.onAdClicked();
            }
            InterfaceC2542El interfaceC2542El = adOverlayInfoParcel.f23574N;
            if (interfaceC2542El != null) {
                interfaceC2542El.J();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (lVar = adOverlayInfoParcel.f23580v) != null) {
                lVar.g();
            }
        }
        if (this.f40804z) {
            if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32076M5)).booleanValue()) {
                C4835j.f39730C.f39739g.i(this);
            }
        }
        a4.e eVar = C4835j.f39730C.f39733a;
        C5037e c5037e = adOverlayInfoParcel.f23578n;
        InterfaceC5033a interfaceC5033a = c5037e.f40830B;
        InterfaceC5035c interfaceC5035c = adOverlayInfoParcel.f23563B;
        Activity activity2 = this.f40800v;
        if (a4.e.q(activity2, c5037e, interfaceC5035c, interfaceC5033a, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void E() {
        if (this.f40800v.isFinishing()) {
            U3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void F1(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f40801w);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void J() {
        if (this.f40800v.isFinishing()) {
            U3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void L0() {
        this.f40803y = true;
    }

    public final synchronized void U3() {
        try {
            if (!this.f40802x) {
                l lVar = this.f40799u.f23580v;
                if (lVar != null) {
                    lVar.H3(4);
                }
                this.f40802x = true;
                if (this.f40804z) {
                    if (((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.f32076M5)).booleanValue()) {
                        C4835j.f39730C.f39739g.k(this);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void d() {
        l lVar = this.f40799u.f23580v;
        if (lVar != null) {
            lVar.Q2();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final boolean e() {
        return ((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.f32044I5)).booleanValue() && this.f40804z && this.f40797A;
    }

    @Override // com.google.android.gms.internal.ads.B8
    public final void e0(boolean z3) {
        if (!z3) {
            this.f40798B = true;
        } else if (this.f40798B) {
            int i = z.f41319b;
            v2.i.a("Foregrounded: finishing activity from LauncherOverlay");
            this.f40800v.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void j() {
        if (this.f40801w) {
            z.k("LauncherOverlay finishing activity");
            this.f40800v.finish();
            return;
        }
        this.f40801w = true;
        this.f40797A = true;
        l lVar = this.f40799u.f23580v;
        if (lVar != null) {
            lVar.S1();
        }
        if (this.f40804z) {
            if (((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.f32035H5)).booleanValue()) {
                D.f41234l.postDelayed(new p3.b(8, this), ((Integer) r1.f40207c.a(AbstractC3569ma.f32051J5)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void k() {
        this.f40797A = false;
        l lVar = this.f40799u.f23580v;
        if (lVar != null) {
            lVar.t1();
        }
        if (this.f40800v.isFinishing()) {
            U3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void n() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void o() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void I0(W2.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void q1(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void x3(int i, int i6, Intent intent) {
    }
}
