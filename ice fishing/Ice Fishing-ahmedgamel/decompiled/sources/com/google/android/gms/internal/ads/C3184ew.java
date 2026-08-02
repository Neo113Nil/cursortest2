package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.ew, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3184ew extends C3346hw {

    /* renamed from: w, reason: collision with root package name */
    public static final C3184ew f30790w = new C3184ew();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.C3346hw
    public final boolean a() {
        Iterator it = Collections.unmodifiableCollection(C3238fw.f31233c.f31235b).iterator();
        while (it.hasNext()) {
            View view = (View) ((Uv) it.next()).f28835c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.C3346hw
    public final void b(boolean z6) {
        Iterator it = Collections.unmodifiableCollection(C3238fw.f31233c.f31234a).iterator();
        while (it.hasNext()) {
            AbstractC3722ow abstractC3722ow = ((Uv) it.next()).f28836d;
            if (abstractC3722ow.f33766b.get() != 0) {
                V2.f28874z.z(abstractC3722ow.c(), "setState", true != z6 ? "backgrounded" : "foregrounded", abstractC3722ow.f33765a);
            }
        }
    }
}
