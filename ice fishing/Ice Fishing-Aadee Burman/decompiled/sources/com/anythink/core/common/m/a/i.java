package com.anythink.core.common.m.a;

import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public String f14462a;

    /* renamed from: b, reason: collision with root package name */
    public String f14463b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f14464c;

    /* renamed from: d, reason: collision with root package name */
    public String f14465d;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, String> f14466e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f14467a;

        /* renamed from: b, reason: collision with root package name */
        private String f14468b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f14469c;

        /* renamed from: d, reason: collision with root package name */
        private String f14470d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, String> f14471e;

        public final a a(String str) {
            this.f14467a = str;
            return this;
        }

        public final a b(String str) {
            this.f14468b = str;
            return this;
        }

        public final a c(String str) {
            this.f14470d = str;
            return this;
        }

        public final a a(byte[] bArr) {
            this.f14469c = bArr;
            return this;
        }

        public final a a(Map<String, String> map) {
            this.f14471e = map;
            return this;
        }

        public final i a() {
            return new i(this, (byte) 0);
        }
    }

    public /* synthetic */ i(a aVar, byte b9) {
        this(aVar);
    }

    private i(a aVar) {
        this.f14462a = aVar.f14467a;
        this.f14463b = aVar.f14468b;
        this.f14464c = aVar.f14469c;
        this.f14465d = aVar.f14470d;
        this.f14466e = aVar.f14471e;
    }
}
