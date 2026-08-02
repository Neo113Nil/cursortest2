package com.anythink.core.common.h;

import com.google.android.gms.internal.ads.Wv;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class bo {

    /* renamed from: a, reason: collision with root package name */
    public int f14506a;

    /* renamed from: b, reason: collision with root package name */
    public String f14507b;

    /* renamed from: c, reason: collision with root package name */
    public int f14508c;

    /* renamed from: d, reason: collision with root package name */
    public int f14509d;

    /* renamed from: e, reason: collision with root package name */
    public long f14510e;

    /* renamed from: f, reason: collision with root package name */
    public String f14511f;

    /* renamed from: g, reason: collision with root package name */
    public String f14512g;

    /* renamed from: h, reason: collision with root package name */
    public ConcurrentHashMap<String, a> f14513h;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f14514a;

        /* renamed from: b, reason: collision with root package name */
        public String f14515b;

        /* renamed from: c, reason: collision with root package name */
        public String f14516c;

        /* renamed from: d, reason: collision with root package name */
        public int f14517d;

        /* renamed from: e, reason: collision with root package name */
        public int f14518e;

        /* renamed from: f, reason: collision with root package name */
        public long f14519f;

        public final String toString() {
            return "AdSourceImpressionInfo{unitId='" + this.f14514a + "', hourTimeFormat='" + this.f14515b + "', dateTimeFormat='" + this.f14516c + "', dayShowCount=" + this.f14517d + ", hourShowCount=" + this.f14518e + ", showTime=" + this.f14519f + '}';
        }
    }

    public final a a(String str) {
        ConcurrentHashMap<String, a> concurrentHashMap = this.f14513h;
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(str);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacementImpressionInfo{format=");
        sb.append(this.f14506a);
        sb.append(", placementId='");
        sb.append(this.f14507b);
        sb.append("', dayShowCount=");
        sb.append(this.f14508c);
        sb.append(", hourShowCount=");
        sb.append(this.f14509d);
        sb.append(", showTime=");
        sb.append(this.f14510e);
        sb.append(", hourTimeFormat='");
        sb.append(this.f14511f);
        sb.append("', dateTimeFormat='");
        return Wv.i(sb, this.f14512g, "'}");
    }

    private synchronized void a(String str, a aVar) {
        try {
            if (this.f14513h == null) {
                this.f14513h = new ConcurrentHashMap<>(3);
            }
            this.f14513h.put(str, aVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
