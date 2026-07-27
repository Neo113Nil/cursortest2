package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3551lx {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32623a;

    /* renamed from: b, reason: collision with root package name */
    public int f32624b;

    public static String g(int i) {
        char c4 = (char) ((i >> 24) & com.anythink.basead.exoplayer.k.p.f8630b);
        int length = String.valueOf(c4).length();
        char c9 = (char) ((i >> 16) & com.anythink.basead.exoplayer.k.p.f8630b);
        int length2 = String.valueOf(c9).length();
        char c10 = (char) ((i >> 8) & com.anythink.basead.exoplayer.k.p.f8630b);
        int length3 = String.valueOf(c10).length();
        char c11 = (char) (i & com.anythink.basead.exoplayer.k.p.f8630b);
        StringBuilder sb = new StringBuilder(length + length2 + length3 + String.valueOf(c11).length());
        sb.append(c4);
        sb.append(c9);
        sb.append(c10);
        sb.append(c11);
        return sb.toString();
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public boolean f() {
        return h(1);
    }

    public boolean h(int i) {
        return (this.f32624b & i) == i;
    }

    public String toString() {
        switch (this.f32623a) {
            case 0:
                return g(this.f32624b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ AbstractC3551lx(int i, int i4) {
        this.f32623a = i4;
        this.f32624b = i;
    }
}
