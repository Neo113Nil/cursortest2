package com.anythink.core.common.h;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class bo {

    /* renamed from: a, reason: collision with root package name */
    public int f13720a;

    /* renamed from: b, reason: collision with root package name */
    public String f13721b;

    /* renamed from: c, reason: collision with root package name */
    public int f13722c;

    /* renamed from: d, reason: collision with root package name */
    public int f13723d;

    /* renamed from: e, reason: collision with root package name */
    public long f13724e;

    /* renamed from: f, reason: collision with root package name */
    public String f13725f;

    /* renamed from: g, reason: collision with root package name */
    public String f13726g;

    /* renamed from: h, reason: collision with root package name */
    public ConcurrentHashMap<String, a> f13727h;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f13728a;

        /* renamed from: b, reason: collision with root package name */
        public String f13729b;

        /* renamed from: c, reason: collision with root package name */
        public String f13730c;

        /* renamed from: d, reason: collision with root package name */
        public int f13731d;

        /* renamed from: e, reason: collision with root package name */
        public int f13732e;

        /* renamed from: f, reason: collision with root package name */
        public long f13733f;

        public final String toString() {
            return "AdSourceImpressionInfo{unitId='" + this.f13728a + "', hourTimeFormat='" + this.f13729b + "', dateTimeFormat='" + this.f13730c + "', dayShowCount=" + this.f13731d + ", hourShowCount=" + this.f13732e + ", showTime=" + this.f13733f + '}';
        }
    }

    public final a a(String str) {
        ConcurrentHashMap<String, a> concurrentHashMap = this.f13727h;
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(str);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacementImpressionInfo{format=");
        sb.append(this.f13720a);
        sb.append(", placementId='");
        sb.append(this.f13721b);
        sb.append("', dayShowCount=");
        sb.append(this.f13722c);
        sb.append(", hourShowCount=");
        sb.append(this.f13723d);
        sb.append(", showTime=");
        sb.append(this.f13724e);
        sb.append(", hourTimeFormat='");
        sb.append(this.f13725f);
        sb.append("', dateTimeFormat='");
        return u1.h.g(sb, this.f13726g, "'}");
    }

    private synchronized void a(String str, a aVar) {
        try {
            if (this.f13727h == null) {
                this.f13727h = new ConcurrentHashMap<>(3);
            }
            this.f13727h.put(str, aVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
