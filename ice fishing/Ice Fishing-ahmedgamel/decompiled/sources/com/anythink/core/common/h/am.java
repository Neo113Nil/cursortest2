package com.anythink.core.common.h;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class am {

    /* renamed from: a, reason: collision with root package name */
    private final String f14295a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, List<a>> f14296b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Integer> f14297c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f14298a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14299b;

        public a(String str, int i) {
            this.f14298a = str;
            this.f14299b = i;
        }

        public final String a() {
            return this.f14298a;
        }

        public final int b() {
            return this.f14299b;
        }
    }

    public am(String str) {
        this.f14295a = str;
    }

    private String c() {
        return this.f14295a;
    }

    public final Map<String, List<a>> a() {
        return this.f14296b;
    }

    public final Map<String, Integer> b() {
        return this.f14297c;
    }

    public final void a(Map<String, List<a>> map) {
        this.f14296b = map;
    }

    public final void b(Map<String, Integer> map) {
        this.f14297c = map;
    }
}
