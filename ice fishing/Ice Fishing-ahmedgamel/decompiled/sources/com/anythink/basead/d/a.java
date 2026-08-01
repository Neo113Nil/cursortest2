package com.anythink.basead.d;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f6108a;

    /* renamed from: b, reason: collision with root package name */
    public int f6109b;

    /* renamed from: c, reason: collision with root package name */
    public int f6110c;

    /* renamed from: d, reason: collision with root package name */
    public int f6111d;

    /* renamed from: e, reason: collision with root package name */
    public int f6112e;

    /* renamed from: f, reason: collision with root package name */
    public int f6113f;

    /* renamed from: g, reason: collision with root package name */
    public int f6114g;

    /* renamed from: h, reason: collision with root package name */
    public int f6115h;
    public boolean i;

    /* renamed from: k, reason: collision with root package name */
    public long f6117k;

    /* renamed from: l, reason: collision with root package name */
    public long f6118l;

    /* renamed from: m, reason: collision with root package name */
    public float[] f6119m;

    /* renamed from: p, reason: collision with root package name */
    public a f6122p;

    /* renamed from: j, reason: collision with root package name */
    public int f6116j = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f6120n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f6121o = 13;

    /* renamed from: com.anythink.basead.d.a$a, reason: collision with other inner class name */
    public static class C0013a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f6123a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f6124b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f6125c = 3;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f6126a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f6127b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f6128c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f6129d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f6130e = 4;
    }

    private boolean a() {
        return this.f6108a > 0 || this.f6109b > 0 || this.f6110c > 0 || this.f6111d > 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdClickRecord{clickDownX=");
        sb.append(this.f6108a);
        sb.append(", clickDownY=");
        sb.append(this.f6109b);
        sb.append(", clickUpX=");
        sb.append(this.f6110c);
        sb.append(", clickUpY=");
        sb.append(this.f6111d);
        sb.append(", clickRelateDownX=");
        sb.append(this.f6112e);
        sb.append(", clickRelateDownY=");
        sb.append(this.f6113f);
        sb.append(", clickRelateUpX=");
        sb.append(this.f6114g);
        sb.append(", clickRelateUpY=");
        sb.append(this.f6115h);
        sb.append(", isDeeplinkClick=");
        sb.append(this.i);
        sb.append(", downloadType=");
        sb.append(this.f6116j);
        sb.append(", clickDownTimeMs=");
        sb.append(this.f6117k);
        sb.append(", clickUpTimeMs=");
        sb.append(this.f6118l);
        sb.append(", trackingClickType=");
        sb.append(this.f6120n);
        sb.append(", shakeMaxAccValues=");
        sb.append(this.f6119m);
        sb.append(", innerAdClickRecord=[");
        a aVar = this.f6122p;
        return u1.h.g(sb, aVar == null ? "null" : aVar.toString(), "]}");
    }
}
