package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class YQ extends AbstractC3832r8 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f28825g = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f28826b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28827c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28828d;

    /* renamed from: e, reason: collision with root package name */
    public final C3235g2 f28829e;

    /* renamed from: f, reason: collision with root package name */
    public final C4256z0 f28830f;

    static {
        SB sb = UB.f27942u;
        C3675oC c3675oC = C3675oC.f33115x;
        List list = Collections.EMPTY_LIST;
        C3675oC c3675oC2 = C3675oC.f33115x;
        C3987u1 c3987u1 = C3987u1.f34507a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new N0(uri, c3675oC2);
        }
        new C();
        C3181f3 c3181f3 = C3181f3.f30581B;
    }

    public YQ(long j9, long j10, boolean z8, C3235g2 c3235g2, C4256z0 c4256z0) {
        this.f28826b = j9;
        this.f28827c = j10;
        this.f28828d = z8;
        c3235g2.getClass();
        this.f28829e = c3235g2;
        this.f28830f = c4256z0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final Y7 b(int i, Y7 y72, long j9) {
        PA.a0(i, 1);
        Object obj = Y7.f28792m;
        y72.a(this.f28829e, this.f28828d, false, this.f28830f, this.f28827c);
        return y72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final L7 d(int i, L7 l72, boolean z8) {
        PA.a0(i, 1);
        Object obj = z8 ? f28825g : null;
        C4071ve c4071ve = C4071ve.f34816b;
        l72.a(null, obj, 0, this.f28826b, false);
        return l72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final int e(Object obj) {
        return f28825g.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final Object f(int i) {
        PA.a0(i, 1);
        return f28825g;
    }
}
