package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.mw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3614mw {

    /* renamed from: d, reason: collision with root package name */
    public static final C3614mw f33405d;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f33406a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f33407b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33408c;

    static {
        C3614mw c3614mw = new C3614mw();
        c3614mw.f33407b = false;
        c3614mw.f33408c = false;
        f33405d = c3614mw;
    }

    public final void a(boolean z6, boolean z9) {
        if ((z9 || z6) == (this.f33408c || this.f33407b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(C3238fw.f31233c.f31234a).iterator();
        while (it.hasNext()) {
            AbstractC3722ow abstractC3722ow = ((Uv) it.next()).f28836d;
            boolean z10 = z9 || z6;
            if (abstractC3722ow.f33766b.get() != 0) {
                V2.f28874z.z(abstractC3722ow.c(), "setDeviceLockState", true != z10 ? "unlocked" : "locked");
            }
        }
    }
}
