package com.anythink.core.basead.a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f12054a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12055b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f12056a;

        /* renamed from: b, reason: collision with root package name */
        private String f12057b;

        public final a a(int i) {
            this.f12056a = i;
            return this;
        }

        public final a a(String str) {
            this.f12057b = str;
            return this;
        }

        public final d a() {
            return new d(this, (byte) 0);
        }
    }

    public /* synthetic */ d(a aVar, byte b9) {
        this(aVar);
    }

    public final int a() {
        return this.f12054a;
    }

    public final String b() {
        return this.f12055b;
    }

    private d(a aVar) {
        this.f12054a = aVar.f12056a;
        this.f12055b = aVar.f12057b;
    }
}
