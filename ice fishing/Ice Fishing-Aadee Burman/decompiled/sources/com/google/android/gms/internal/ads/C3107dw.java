package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.dw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3107dw extends C3269gw {

    /* renamed from: w, reason: collision with root package name */
    public static final C3107dw f29860w = new C3107dw();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.C3269gw
    public final boolean a() {
        Iterator it = Collections.unmodifiableCollection(C3161ew.f30001c.f30003b).iterator();
        while (it.hasNext()) {
            View view = (View) ((Uv) it.next()).f28038c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.C3269gw
    public final void b(boolean z3) {
        Iterator it = Collections.unmodifiableCollection(C3161ew.f30001c.f30002a).iterator();
        while (it.hasNext()) {
            AbstractC3645nw abstractC3645nw = ((Uv) it.next()).f28039d;
            if (abstractC3645nw.f32809b.get() != 0) {
                V2.f28077z.z(abstractC3645nw.c(), "setState", true != z3 ? "backgrounded" : "foregrounded", abstractC3645nw.f32808a);
            }
        }
    }
}
