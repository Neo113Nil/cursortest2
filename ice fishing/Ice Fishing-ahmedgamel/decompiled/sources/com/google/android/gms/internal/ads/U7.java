package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class U7 {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f28688m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final C2977b2 f28689n;

    /* renamed from: a, reason: collision with root package name */
    public Object f28690a = f28688m;

    /* renamed from: b, reason: collision with root package name */
    public C2977b2 f28691b = f28689n;

    /* renamed from: c, reason: collision with root package name */
    public long f28692c;

    /* renamed from: d, reason: collision with root package name */
    public long f28693d;

    /* renamed from: e, reason: collision with root package name */
    public long f28694e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28695f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28696g;

    /* renamed from: h, reason: collision with root package name */
    public C4158x0 f28697h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public long f28698j;

    /* renamed from: k, reason: collision with root package name */
    public int f28699k;

    /* renamed from: l, reason: collision with root package name */
    public int f28700l;

    static {
        PB pb = RB.f27933u;
        C3523lC c3523lC = C3523lC.f32525x;
        List list = Collections.EMPTY_LIST;
        C3523lC c3523lC2 = C3523lC.f32525x;
        C3835r1 c3835r1 = C3835r1.f34222a;
        Uri uri = Uri.EMPTY;
        f28689n = new C2977b2("androidx.media3.common.Timeline", new C(), uri != null ? new L0(uri, c3523lC2) : null, new C4158x0(), C3085d3.f30437C);
        String str = AbstractC3182eu.f30782a;
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

    public final void a(C2977b2 c2977b2, boolean z6, boolean z9, C4158x0 c4158x0, long j6) {
        this.f28690a = f28688m;
        if (c2977b2 == null) {
            c2977b2 = f28689n;
        }
        this.f28691b = c2977b2;
        this.f28692c = com.anythink.basead.exoplayer.b.f7168b;
        this.f28693d = com.anythink.basead.exoplayer.b.f7168b;
        this.f28694e = com.anythink.basead.exoplayer.b.f7168b;
        this.f28695f = z6;
        this.f28696g = z9;
        this.f28697h = c4158x0;
        this.f28698j = j6;
        this.f28699k = 0;
        this.f28700l = 0;
        this.i = false;
    }

    public final boolean b() {
        return this.f28697h != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !U7.class.equals(obj.getClass())) {
            return false;
        }
        U7 u72 = (U7) obj;
        return Objects.equals(this.f28690a, u72.f28690a) && Objects.equals(this.f28691b, u72.f28691b) && Objects.equals(this.f28697h, u72.f28697h) && this.f28692c == u72.f28692c && this.f28693d == u72.f28693d && this.f28694e == u72.f28694e && this.f28695f == u72.f28695f && this.f28696g == u72.f28696g && this.i == u72.i && this.f28698j == u72.f28698j && this.f28699k == u72.f28699k && this.f28700l == u72.f28700l;
    }

    public final int hashCode() {
        int hashCode = ((this.f28690a.hashCode() + 217) * 31) + this.f28691b.hashCode();
        C4158x0 c4158x0 = this.f28697h;
        int hashCode2 = ((hashCode * 961) + (c4158x0 == null ? 0 : c4158x0.hashCode())) * 31;
        long j6 = this.f28692c;
        int i = (hashCode2 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j9 = this.f28693d;
        int i4 = (i + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f28694e;
        int i6 = ((((((i4 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f28695f ? 1 : 0)) * 31) + (this.f28696g ? 1 : 0)) * 31) + (this.i ? 1 : 0);
        long j11 = this.f28698j;
        return ((((((i6 * 961) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f28699k) * 31) + this.f28700l) * 31;
    }
}
