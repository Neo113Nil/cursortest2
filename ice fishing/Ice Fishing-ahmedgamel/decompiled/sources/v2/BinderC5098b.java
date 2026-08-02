package v2;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractBinderC3542le;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.B8;
import com.google.android.gms.internal.ads.C3324ha;
import com.google.android.gms.internal.ads.InterfaceC2579Fl;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3484ka;
import r2.C4906k;
import s2.InterfaceC4919a;
import s2.r;
import w2.D;
import w2.z;

/* renamed from: v2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC5098b extends AbstractBinderC3542le implements B8 {

    /* renamed from: u, reason: collision with root package name */
    public final AdOverlayInfoParcel f41090u;

    /* renamed from: v, reason: collision with root package name */
    public final Activity f41091v;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f41095z;

    /* renamed from: w, reason: collision with root package name */
    public boolean f41092w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f41093x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f41094y = false;

    /* renamed from: A, reason: collision with root package name */
    public boolean f41088A = false;

    /* renamed from: B, reason: collision with root package name */
    public boolean f41089B = false;

    public BinderC5098b(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        C5101e c5101e;
        boolean z6 = false;
        this.f41090u = adOverlayInfoParcel;
        this.f41091v = activity;
        C3324ha c3324ha = AbstractC3592ma.f32815H5;
        r rVar = r.f40506e;
        boolean booleanValue = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        if ((booleanValue || ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32824I5)).booleanValue() || ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32855M5)).booleanValue()) && (c5101e = adOverlayInfoParcel.f24358n) != null && c5101e.f41122C && Build.MANUFACTURER.matches((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32840K5)) && Build.MODEL.matches((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32847L5))) {
            z6 = true;
        }
        this.f41095z = z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void A0(Bundle bundle) {
        l lVar;
        C3324ha c3324ha = AbstractC3592ma.ia;
        r rVar = r.f40506e;
        boolean booleanValue = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
        Activity activity = this.f41091v;
        if (booleanValue && !this.f41094y) {
            activity.requestWindowFeature(1);
        }
        boolean z6 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z6 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f41090u;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z6) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            InterfaceC4919a interfaceC4919a = adOverlayInfoParcel.f24359u;
            if (interfaceC4919a != null) {
                interfaceC4919a.onAdClicked();
            }
            InterfaceC2579Fl interfaceC2579Fl = adOverlayInfoParcel.f24354N;
            if (interfaceC2579Fl != null) {
                interfaceC2579Fl.D();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (lVar = adOverlayInfoParcel.f24360v) != null) {
                lVar.g();
            }
        }
        if (this.f41095z) {
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f32855M5)).booleanValue()) {
                C4906k.f40186C.f40195g.i(this);
            }
        }
        c4.e eVar = C4906k.f40186C.f40189a;
        C5101e c5101e = adOverlayInfoParcel.f24358n;
        InterfaceC5097a interfaceC5097a = c5101e.f41121B;
        InterfaceC5099c interfaceC5099c = adOverlayInfoParcel.f24343B;
        Activity activity2 = this.f41091v;
        if (c4.e.s(activity2, c5101e, interfaceC5099c, interfaceC5097a, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void E() {
        if (this.f41091v.isFinishing()) {
            U3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void I() {
        if (this.f41091v.isFinishing()) {
            U3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void I0() {
        this.f41094y = true;
    }

    public final synchronized void U3() {
        try {
            if (!this.f41093x) {
                l lVar = this.f41090u.f24360v;
                if (lVar != null) {
                    lVar.C3(4);
                }
                this.f41093x = true;
                if (this.f41095z) {
                    if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.f32855M5)).booleanValue()) {
                        C4906k.f40186C.f40195g.k(this);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void d() {
        l lVar = this.f41090u.f24360v;
        if (lVar != null) {
            lVar.N2();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final boolean e() {
        return ((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.f32824I5)).booleanValue() && this.f41095z && this.f41088A;
    }

    @Override // com.google.android.gms.internal.ads.B8
    public final void e0(boolean z6) {
        if (!z6) {
            this.f41089B = true;
        } else if (this.f41089B) {
            int i = z.f41712b;
            x2.i.a("Foregrounded: finishing activity from LauncherOverlay");
            this.f41091v.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void j() {
        if (this.f41092w) {
            z.k("LauncherOverlay finishing activity");
            this.f41091v.finish();
            return;
        }
        this.f41092w = true;
        this.f41088A = true;
        l lVar = this.f41090u.f24360v;
        if (lVar != null) {
            lVar.S1();
        }
        if (this.f41095z) {
            if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.f32815H5)).booleanValue()) {
                D.f41627l.postDelayed(new r3.b(9, this), ((Integer) r1.f40509c.a(AbstractC3592ma.f32831J5)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void k() {
        this.f41088A = false;
        l lVar = this.f41090u.f24360v;
        if (lVar != null) {
            lVar.r1();
        }
        if (this.f41091v.isFinishing()) {
            U3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void x1(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f41092w);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void n() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void o() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void d3(Y2.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void p1(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void r3(int i, int i4, Intent intent) {
    }
}
