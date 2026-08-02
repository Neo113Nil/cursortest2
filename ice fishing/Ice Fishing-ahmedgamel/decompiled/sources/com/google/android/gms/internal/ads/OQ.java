package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class OQ extends AbstractC3627n8 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f27387g = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f27388b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27389c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27390d;

    /* renamed from: e, reason: collision with root package name */
    public final C2977b2 f27391e;

    /* renamed from: f, reason: collision with root package name */
    public final C4158x0 f27392f;

    static {
        PB pb = RB.f27933u;
        C3523lC c3523lC = C3523lC.f32525x;
        List list = Collections.EMPTY_LIST;
        C3523lC c3523lC2 = C3523lC.f32525x;
        C3835r1 c3835r1 = C3835r1.f34222a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new L0(uri, c3523lC2);
        }
        new C();
        C3085d3 c3085d3 = C3085d3.f30437C;
    }

    public OQ(long j6, long j9, boolean z6, C2977b2 c2977b2, C4158x0 c4158x0) {
        this.f27388b = j6;
        this.f27389c = j9;
        this.f27390d = z6;
        c2977b2.getClass();
        this.f27391e = c2977b2;
        this.f27392f = c4158x0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final U7 b(int i, U7 u72, long j6) {
        AbstractC2792Sd.K(i, 1);
        Object obj = U7.f28688m;
        u72.a(this.f27391e, this.f27390d, false, this.f27392f, this.f27389c);
        return u72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final K7 d(int i, K7 k72, boolean z6) {
        AbstractC2792Sd.K(i, 1);
        Object obj = z6 ? f27387g : null;
        C3865re c3865re = C3865re.f34414b;
        k72.a(null, obj, 0, this.f27388b, false);
        return k72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final int e(Object obj) {
        return f27387g.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final Object f(int i) {
        AbstractC2792Sd.K(i, 1);
        return f27387g;
    }
}
