package com.anythink.core.basead.a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f11891a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f11892b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11893c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f11894a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f11895b;

        /* renamed from: c, reason: collision with root package name */
        private String f11896c;

        public final a a(String str) {
            this.f11894a = str;
            return this;
        }

        public final a b(String str) {
            this.f11896c = str;
            return this;
        }

        public final a a(boolean z3) {
            this.f11895b = z3;
            return this;
        }

        public final c a() {
            return new c(this, (byte) 0);
        }
    }

    public /* synthetic */ c(a aVar, byte b9) {
        this(aVar);
    }

    public final String a() {
        return this.f11891a;
    }

    public final boolean b() {
        return this.f11892b;
    }

    public final String c() {
        return this.f11893c;
    }

    private c(a aVar) {
        this.f11891a = aVar.f11894a;
        this.f11892b = aVar.f11895b;
        this.f11893c = aVar.f11896c;
    }
}
