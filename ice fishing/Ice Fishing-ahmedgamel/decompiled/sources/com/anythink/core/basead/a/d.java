package com.anythink.core.basead.a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f12683a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12684b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f12685a;

        /* renamed from: b, reason: collision with root package name */
        private String f12686b;

        public final a a(int i) {
            this.f12685a = i;
            return this;
        }

        public final a a(String str) {
            this.f12686b = str;
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
        return this.f12683a;
    }

    public final String b() {
        return this.f12684b;
    }

    private d(a aVar) {
        this.f12683a = aVar.f12685a;
        this.f12684b = aVar.f12686b;
    }
}
