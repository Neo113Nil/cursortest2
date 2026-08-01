package com.anythink.core.basead.a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f11897a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11898b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f11899a;

        /* renamed from: b, reason: collision with root package name */
        private String f11900b;

        public final a a(int i) {
            this.f11899a = i;
            return this;
        }

        public final a a(String str) {
            this.f11900b = str;
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
        return this.f11897a;
    }

    public final String b() {
        return this.f11898b;
    }

    private d(a aVar) {
        this.f11897a = aVar.f11899a;
        this.f11898b = aVar.f11900b;
    }
}
