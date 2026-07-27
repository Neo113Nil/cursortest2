package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.lw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3537lw {

    /* renamed from: d, reason: collision with root package name */
    public static final C3537lw f31865d;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f31866a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31867b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31868c;

    static {
        C3537lw c3537lw = new C3537lw();
        c3537lw.f31867b = false;
        c3537lw.f31868c = false;
        f31865d = c3537lw;
    }

    public final void a(boolean z3, boolean z6) {
        if ((z6 || z3) == (this.f31868c || this.f31867b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(C3161ew.f30001c.f30002a).iterator();
        while (it.hasNext()) {
            AbstractC3645nw abstractC3645nw = ((Uv) it.next()).f28039d;
            boolean z9 = z6 || z3;
            if (abstractC3645nw.f32809b.get() != 0) {
                V2.f28077z.z(abstractC3645nw.c(), "setDeviceLockState", true != z9 ? "unlocked" : "locked");
            }
        }
    }
}
