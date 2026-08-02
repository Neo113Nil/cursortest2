package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import s2.C4949p;

/* renamed from: com.google.android.gms.internal.ads.Om, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2733Om {

    /* renamed from: a, reason: collision with root package name */
    public final C2649Jn f27436a;

    /* renamed from: b, reason: collision with root package name */
    public final C4036un f27437b;

    /* renamed from: c, reason: collision with root package name */
    public ViewTreeObserverOnScrollChangedListenerC2716Nm f27438c = null;

    public C2733Om(C2649Jn c2649Jn, C4036un c4036un) {
        this.f27436a = c2649Jn;
        this.f27437b = c4036un;
    }

    public static final int b(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        x2.d dVar = C4949p.f40498g.f40499a;
        return x2.d.b(context, i);
    }

    public final View a(FrameLayout frameLayout, WindowManager windowManager) {
        InterfaceC4084vh a9 = this.f27436a.a(s2.f1.a(), null, null);
        a9.V().setVisibility(4);
        a9.V().setContentDescription("policy_validator");
        a9.Z0("/sendMessageToSdk", new C2841Vb(9, this));
        a9.Z0("/hideValidatorOverlay", new C2699Mm(this, windowManager, frameLayout));
        a9.Z0("/open", new C3648nc(null, null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(a9);
        C2699Mm c2699Mm = new C2699Mm(this, frameLayout, windowManager);
        C4036un c4036un = this.f27437b;
        c4036un.b("/loadNativeAdPolicyViolations", new C3228fm(c4036un, weakReference, "/loadNativeAdPolicyViolations", c2699Mm));
        c4036un.b("/showValidatorOverlay", new C3228fm(c4036un, new WeakReference(a9), "/showValidatorOverlay", C2950ac.f29839z));
        return a9.V();
    }
}
