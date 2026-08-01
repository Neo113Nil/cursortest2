package com.anythink.core.common.h;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class am {

    /* renamed from: a, reason: collision with root package name */
    private final String f13509a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, List<a>> f13510b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Integer> f13511c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f13512a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13513b;

        public a(String str, int i) {
            this.f13512a = str;
            this.f13513b = i;
        }

        public final String a() {
            return this.f13512a;
        }

        public final int b() {
            return this.f13513b;
        }
    }

    public am(String str) {
        this.f13509a = str;
    }

    private String c() {
        return this.f13509a;
    }

    public final Map<String, List<a>> a() {
        return this.f13510b;
    }

    public final Map<String, Integer> b() {
        return this.f13511c;
    }

    public final void a(Map<String, List<a>> map) {
        this.f13510b = map;
    }

    public final void b(Map<String, Integer> map) {
        this.f13511c = map;
    }
}
