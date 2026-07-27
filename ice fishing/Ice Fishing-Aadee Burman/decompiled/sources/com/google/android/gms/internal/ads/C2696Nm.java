package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import q2.C4900p;

/* renamed from: com.google.android.gms.internal.ads.Nm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2696Nm {

    /* renamed from: a, reason: collision with root package name */
    public final C2612In f26532a;

    /* renamed from: b, reason: collision with root package name */
    public final C3959tn f26533b;

    /* renamed from: c, reason: collision with root package name */
    public ViewTreeObserverOnScrollChangedListenerC2679Mm f26534c = null;

    public C2696Nm(C2612In c2612In, C3959tn c3959tn) {
        this.f26532a = c2612In;
        this.f26533b = c3959tn;
    }

    public static final int b(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        v2.d dVar = C4900p.f40196g.f40197a;
        return v2.d.b(context, i);
    }

    public final View a(FrameLayout frameLayout, WindowManager windowManager) {
        InterfaceC4061vh a9 = this.f26532a.a(q2.f1.a(), null, null);
        a9.V().setVisibility(4);
        a9.V().setContentDescription("policy_validator");
        a9.a1("/sendMessageToSdk", new C2818Vb(9, this));
        a9.a1("/hideValidatorOverlay", new C2662Lm(this, windowManager, frameLayout));
        a9.a1("/open", new C3625nc(null, null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(a9);
        C2662Lm c2662Lm = new C2662Lm(this, frameLayout, windowManager);
        C3959tn c3959tn = this.f26533b;
        c3959tn.b("/loadNativeAdPolicyViolations", new C3151em(c3959tn, weakReference, "/loadNativeAdPolicyViolations", c2662Lm));
        c3959tn.b("/showValidatorOverlay", new C3151em(c3959tn, new WeakReference(a9), "/showValidatorOverlay", C2927ac.f29064z));
        return a9.V();
    }
}
