package com.anythink.core.common.n.b;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class s extends ae {

    /* renamed from: a, reason: collision with root package name */
    private static final x f16497a = x.a(com.anythink.expressad.foundation.g.f.g.b.f20129e);

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f16498b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f16499c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f16500a;

        /* renamed from: b, reason: collision with root package name */
        private final List<String> f16501b;

        /* renamed from: c, reason: collision with root package name */
        private final Charset f16502c;

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
            this.f16500a.add(v.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, this.f16502c));
            this.f16501b.add(v.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, this.f16502c));
            return this;
        }

        private a b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f16500a.add(v.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, this.f16502c));
            this.f16501b.add(v.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, this.f16502c));
            return this;
        }

        private a(Charset charset) {
            this.f16500a = new ArrayList();
            this.f16501b = new ArrayList();
            this.f16502c = charset;
        }

        private s a() {
            return new s(this.f16500a, this.f16501b);
        }
    }

    public s(List<String> list, List<String> list2) {
        this.f16498b = com.anythink.core.common.n.b.a.c.a(list);
        this.f16499c = com.anythink.core.common.n.b.a.c.a(list2);
    }

    private String a(int i) {
        return this.f16498b.get(i);
    }

    private int c() {
        return this.f16498b.size();
    }

    private String d(int i) {
        return v.a(this.f16499c.get(i), true);
    }

    @Override // com.anythink.core.common.n.b.ae
    public final long b() {
        return a((com.anythink.core.common.n.c.d) null, true);
    }

    private String b(int i) {
        return v.a(this.f16498b.get(i), true);
    }

    private String c(int i) {
        return this.f16499c.get(i);
    }

    @Override // com.anythink.core.common.n.b.ae
    public final x a() {
        return f16497a;
    }

    @Override // com.anythink.core.common.n.b.ae
    public final void a(com.anythink.core.common.n.c.d dVar) {
        a(dVar, false);
    }

    private long a(com.anythink.core.common.n.c.d dVar, boolean z6) {
        com.anythink.core.common.n.c.c c9;
        if (z6) {
            c9 = new com.anythink.core.common.n.c.c();
        } else {
            c9 = dVar.c();
        }
        int size = this.f16498b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c9.l(38);
            }
            c9.b(this.f16498b.get(i));
            c9.l(61);
            c9.b(this.f16499c.get(i));
        }
        if (!z6) {
            return 0L;
        }
        long b9 = c9.b();
        c9.z();
        return b9;
    }
}
