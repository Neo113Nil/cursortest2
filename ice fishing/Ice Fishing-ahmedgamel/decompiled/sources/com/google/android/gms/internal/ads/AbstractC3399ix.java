package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ix, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3399ix {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31924a;

    /* renamed from: b, reason: collision with root package name */
    public int f31925b;

    public static String g(int i) {
        char c9 = (char) ((i >> 24) & com.anythink.basead.exoplayer.k.p.f9259b);
        int length = String.valueOf(c9).length();
        char c10 = (char) ((i >> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        int length2 = String.valueOf(c10).length();
        char c11 = (char) ((i >> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        int length3 = String.valueOf(c11).length();
        char c12 = (char) (i & com.anythink.basead.exoplayer.k.p.f9259b);
        StringBuilder sb = new StringBuilder(length + length2 + length3 + String.valueOf(c12).length());
        sb.append(c9);
        sb.append(c10);
        sb.append(c11);
        sb.append(c12);
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
        return (this.f31925b & i) == i;
    }

    public String toString() {
        switch (this.f31924a) {
            case 0:
                return g(this.f31925b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ AbstractC3399ix(int i, int i4) {
        this.f31924a = i4;
        this.f31925b = i;
    }
}
