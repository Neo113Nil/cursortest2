package com.anythink.basead.d;

import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f6894a;

    /* renamed from: b, reason: collision with root package name */
    public int f6895b;

    /* renamed from: c, reason: collision with root package name */
    public int f6896c;

    /* renamed from: d, reason: collision with root package name */
    public int f6897d;

    /* renamed from: e, reason: collision with root package name */
    public int f6898e;

    /* renamed from: f, reason: collision with root package name */
    public int f6899f;

    /* renamed from: g, reason: collision with root package name */
    public int f6900g;

    /* renamed from: h, reason: collision with root package name */
    public int f6901h;
    public boolean i;

    /* renamed from: k, reason: collision with root package name */
    public long f6903k;

    /* renamed from: l, reason: collision with root package name */
    public long f6904l;

    /* renamed from: m, reason: collision with root package name */
    public float[] f6905m;

    /* renamed from: p, reason: collision with root package name */
    public a f6908p;

    /* renamed from: j, reason: collision with root package name */
    public int f6902j = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f6906n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f6907o = 13;

    /* renamed from: com.anythink.basead.d.a$a, reason: collision with other inner class name */
    public static class C0013a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f6909a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f6910b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f6911c = 3;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f6912a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f6913b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f6914c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f6915d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f6916e = 4;
    }

    private boolean a() {
        return this.f6894a > 0 || this.f6895b > 0 || this.f6896c > 0 || this.f6897d > 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdClickRecord{clickDownX=");
        sb.append(this.f6894a);
        sb.append(", clickDownY=");
        sb.append(this.f6895b);
        sb.append(", clickUpX=");
        sb.append(this.f6896c);
        sb.append(", clickUpY=");
        sb.append(this.f6897d);
        sb.append(", clickRelateDownX=");
        sb.append(this.f6898e);
        sb.append(", clickRelateDownY=");
        sb.append(this.f6899f);
        sb.append(", clickRelateUpX=");
        sb.append(this.f6900g);
        sb.append(", clickRelateUpY=");
        sb.append(this.f6901h);
        sb.append(", isDeeplinkClick=");
        sb.append(this.i);
        sb.append(", downloadType=");
        sb.append(this.f6902j);
        sb.append(", clickDownTimeMs=");
        sb.append(this.f6903k);
        sb.append(", clickUpTimeMs=");
        sb.append(this.f6904l);
        sb.append(", trackingClickType=");
        sb.append(this.f6906n);
        sb.append(", shakeMaxAccValues=");
        sb.append(this.f6905m);
        sb.append(", innerAdClickRecord=[");
        a aVar = this.f6908p;
        return Wv.i(sb, aVar == null ? "null" : aVar.toString(), "]}");
    }
}
