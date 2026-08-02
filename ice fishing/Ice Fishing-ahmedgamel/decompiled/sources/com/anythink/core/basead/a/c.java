package com.anythink.core.basead.a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f12677a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12678b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12679c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f12680a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f12681b;

        /* renamed from: c, reason: collision with root package name */
        private String f12682c;

        public final a a(String str) {
            this.f12680a = str;
            return this;
        }

        public final a b(String str) {
            this.f12682c = str;
            return this;
        }

        public final a a(boolean z6) {
            this.f12681b = z6;
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
        return this.f12677a;
    }

    public final boolean b() {
        return this.f12678b;
    }

    public final String c() {
        return this.f12679c;
    }

    private c(a aVar) {
        this.f12677a = aVar.f12680a;
        this.f12678b = aVar.f12681b;
        this.f12679c = aVar.f12682c;
    }
}
