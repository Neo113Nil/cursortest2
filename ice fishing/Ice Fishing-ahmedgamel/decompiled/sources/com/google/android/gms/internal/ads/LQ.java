package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class LQ extends AbstractC3604n8 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f26115g = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f26116b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26117c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26118d;

    /* renamed from: e, reason: collision with root package name */
    public final C2954b2 f26119e;

    /* renamed from: f, reason: collision with root package name */
    public final C4135x0 f26120f;

    static {
        PB pb = RB.f27177u;
        C3500lC c3500lC = C3500lC.f31745x;
        List list = Collections.EMPTY_LIST;
        C3500lC c3500lC2 = C3500lC.f31745x;
        C3812r1 c3812r1 = C3812r1.f33455a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new L0(uri, c3500lC2);
        }
        new C();
        C3062d3 c3062d3 = C3062d3.f29665C;
    }

    public LQ(long j6, long j9, boolean z3, C2954b2 c2954b2, C4135x0 c4135x0) {
        this.f26116b = j6;
        this.f26117c = j9;
        this.f26118d = z3;
        c2954b2.getClass();
        this.f26119e = c2954b2;
        this.f26120f = c4135x0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final U7 b(int i, U7 u72, long j6) {
        AbstractC2772Sd.K(i, 1);
        Object obj = U7.f27891m;
        u72.a(this.f26119e, this.f26118d, false, this.f26120f, this.f26117c);
        return u72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final K7 d(int i, K7 k72, boolean z3) {
        AbstractC2772Sd.K(i, 1);
        Object obj = z3 ? f26115g : null;
        C3842re c3842re = C3842re.f33641b;
        k72.a(null, obj, 0, this.f26116b, false);
        return k72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final int e(Object obj) {
        return f26115g.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final Object f(int i) {
        AbstractC2772Sd.K(i, 1);
        return f26115g;
    }
}
