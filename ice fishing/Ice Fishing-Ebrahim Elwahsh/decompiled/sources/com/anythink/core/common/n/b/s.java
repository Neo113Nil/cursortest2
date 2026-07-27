package com.anythink.core.common.n.b;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class s extends ae {

    /* renamed from: a, reason: collision with root package name */
    private static final x f15868a = x.a(com.anythink.expressad.foundation.g.f.g.b.f19500e);

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f15869b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f15870c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f15871a;

        /* renamed from: b, reason: collision with root package name */
        private final List<String> f15872b;

        /* renamed from: c, reason: collision with root package name */
        private final Charset f15873c;

        public a() {
            this(null);
        }

        private a a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f15871a.add(v.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, this.f15873c));
            this.f15872b.add(v.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, this.f15873c));
            return this;
        }

        private a b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f15871a.add(v.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, this.f15873c));
            this.f15872b.add(v.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, this.f15873c));
            return this;
        }

        private a(Charset charset) {
            this.f15871a = new ArrayList();
            this.f15872b = new ArrayList();
            this.f15873c = charset;
        }

        private s a() {
            return new s(this.f15871a, this.f15872b);
        }
    }

    public s(List<String> list, List<String> list2) {
        this.f15869b = com.anythink.core.common.n.b.a.c.a(list);
        this.f15870c = com.anythink.core.common.n.b.a.c.a(list2);
    }

    private String a(int i) {
        return this.f15869b.get(i);
    }

    private int c() {
        return this.f15869b.size();
    }

    private String d(int i) {
        return v.a(this.f15870c.get(i), true);
    }

    @Override // com.anythink.core.common.n.b.ae
    public final long b() {
        return a((com.anythink.core.common.n.c.d) null, true);
    }

    private String b(int i) {
        return v.a(this.f15869b.get(i), true);
    }

    private String c(int i) {
        return this.f15870c.get(i);
    }

    @Override // com.anythink.core.common.n.b.ae
    public final x a() {
        return f15868a;
    }

    @Override // com.anythink.core.common.n.b.ae
    public final void a(com.anythink.core.common.n.c.d dVar) {
        a(dVar, false);
    }

    private long a(com.anythink.core.common.n.c.d dVar, boolean z8) {
        com.anythink.core.common.n.c.c c4;
        if (z8) {
            c4 = new com.anythink.core.common.n.c.c();
        } else {
            c4 = dVar.c();
        }
        int size = this.f15869b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c4.l(38);
            }
            c4.b(this.f15869b.get(i));
            c4.l(61);
            c4.b(this.f15870c.get(i));
        }
        if (!z8) {
            return 0L;
        }
        long b9 = c4.b();
        c4.z();
        return b9;
    }
}
