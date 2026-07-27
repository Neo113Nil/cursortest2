package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import q2.C4907p;

/* renamed from: com.google.android.gms.internal.ads.Lm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2661Lm {

    /* renamed from: a, reason: collision with root package name */
    public final C2628Jn f26211a;

    /* renamed from: b, reason: collision with root package name */
    public final C4026un f26212b;

    /* renamed from: c, reason: collision with root package name */
    public ViewTreeObserverOnScrollChangedListenerC2644Km f26213c = null;

    public C2661Lm(C2628Jn c2628Jn, C4026un c4026un) {
        this.f26211a = c2628Jn;
        this.f26212b = c4026un;
    }

    public static final int b(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        u2.d dVar = C4907p.f40108g.f40109a;
        return u2.d.b(context, i);
    }

    public final View a(FrameLayout frameLayout, WindowManager windowManager) {
        InterfaceC3858rh a9 = this.f26211a.a(q2.g1.a(), null, null);
        a9.b0().setVisibility(4);
        a9.b0().setContentDescription("policy_validator");
        a9.N0("/sendMessageToSdk", new C2752Rb(9, this));
        a9.N0("/hideValidatorOverlay", new C2627Jm(this, windowManager, frameLayout));
        a9.N0("/open", new C3370ic(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(a9);
        C2627Jm c2627Jm = new C2627Jm(this, frameLayout, windowManager);
        C4026un c4026un = this.f26212b;
        c4026un.b("/loadNativeAdPolicyViolations", new C3054cm(c4026un, weakReference, "/loadNativeAdPolicyViolations", c2627Jm));
        c4026un.b("/showValidatorOverlay", new C3054cm(c4026un, new WeakReference(a9), "/showValidatorOverlay", C2820Vb.f28267z));
        return a9.b0();
    }
}
