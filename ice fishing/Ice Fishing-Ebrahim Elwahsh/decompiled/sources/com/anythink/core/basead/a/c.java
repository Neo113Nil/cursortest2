package com.anythink.core.basead.a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f12048a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12049b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12050c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f12051a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f12052b;

        /* renamed from: c, reason: collision with root package name */
        private String f12053c;

        public final a a(String str) {
            this.f12051a = str;
            return this;
        }

        public final a b(String str) {
            this.f12053c = str;
            return this;
        }

        public final a a(boolean z8) {
            this.f12052b = z8;
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
        return this.f12048a;
    }

    public final boolean b() {
        return this.f12049b;
    }

    public final String c() {
        return this.f12050c;
    }

    private c(a aVar) {
        this.f12048a = aVar.f12051a;
        this.f12049b = aVar.f12052b;
        this.f12050c = aVar.f12053c;
    }
}
