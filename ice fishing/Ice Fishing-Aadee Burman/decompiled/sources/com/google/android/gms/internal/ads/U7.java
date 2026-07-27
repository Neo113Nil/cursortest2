package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class U7 {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f27891m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final C2954b2 f27892n;

    /* renamed from: a, reason: collision with root package name */
    public Object f27893a = f27891m;

    /* renamed from: b, reason: collision with root package name */
    public C2954b2 f27894b = f27892n;

    /* renamed from: c, reason: collision with root package name */
    public long f27895c;

    /* renamed from: d, reason: collision with root package name */
    public long f27896d;

    /* renamed from: e, reason: collision with root package name */
    public long f27897e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27898f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27899g;

    /* renamed from: h, reason: collision with root package name */
    public C4135x0 f27900h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public long f27901j;

    /* renamed from: k, reason: collision with root package name */
    public int f27902k;

    /* renamed from: l, reason: collision with root package name */
    public int f27903l;

    static {
        PB pb = RB.f27177u;
        C3500lC c3500lC = C3500lC.f31745x;
        List list = Collections.EMPTY_LIST;
        C3500lC c3500lC2 = C3500lC.f31745x;
        C3812r1 c3812r1 = C3812r1.f33455a;
        Uri uri = Uri.EMPTY;
        f27892n = new C2954b2("androidx.media3.common.Timeline", new C(), uri != null ? new L0(uri, c3500lC2) : null, new C4135x0(), C3062d3.f29665C);
        String str = AbstractC3159eu.f29993a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final void a(C2954b2 c2954b2, boolean z3, boolean z6, C4135x0 c4135x0, long j6) {
        this.f27893a = f27891m;
        if (c2954b2 == null) {
            c2954b2 = f27892n;
        }
        this.f27894b = c2954b2;
        this.f27895c = com.anythink.basead.exoplayer.b.f6382b;
        this.f27896d = com.anythink.basead.exoplayer.b.f6382b;
        this.f27897e = com.anythink.basead.exoplayer.b.f6382b;
        this.f27898f = z3;
        this.f27899g = z6;
        this.f27900h = c4135x0;
        this.f27901j = j6;
        this.f27902k = 0;
        this.f27903l = 0;
        this.i = false;
    }

    public final boolean b() {
        return this.f27900h != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !U7.class.equals(obj.getClass())) {
            return false;
        }
        U7 u72 = (U7) obj;
        return Objects.equals(this.f27893a, u72.f27893a) && Objects.equals(this.f27894b, u72.f27894b) && Objects.equals(this.f27900h, u72.f27900h) && this.f27895c == u72.f27895c && this.f27896d == u72.f27896d && this.f27897e == u72.f27897e && this.f27898f == u72.f27898f && this.f27899g == u72.f27899g && this.i == u72.i && this.f27901j == u72.f27901j && this.f27902k == u72.f27902k && this.f27903l == u72.f27903l;
    }

    public final int hashCode() {
        int hashCode = ((this.f27893a.hashCode() + 217) * 31) + this.f27894b.hashCode();
        C4135x0 c4135x0 = this.f27900h;
        int hashCode2 = ((hashCode * 961) + (c4135x0 == null ? 0 : c4135x0.hashCode())) * 31;
        long j6 = this.f27895c;
        int i = (hashCode2 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j9 = this.f27896d;
        int i6 = (i + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f27897e;
        int i9 = ((((((i6 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f27898f ? 1 : 0)) * 31) + (this.f27899g ? 1 : 0)) * 31) + (this.i ? 1 : 0);
        long j11 = this.f27901j;
        return ((((((i9 * 961) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f27902k) * 31) + this.f27903l) * 31;
    }
}
