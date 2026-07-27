package com.anythink.core.common.m.a;

import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public String f14619a;

    /* renamed from: b, reason: collision with root package name */
    public String f14620b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f14621c;

    /* renamed from: d, reason: collision with root package name */
    public String f14622d;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, String> f14623e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f14624a;

        /* renamed from: b, reason: collision with root package name */
        private String f14625b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f14626c;

        /* renamed from: d, reason: collision with root package name */
        private String f14627d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, String> f14628e;

        public final a a(String str) {
            this.f14624a = str;
            return this;
        }

        public final a b(String str) {
            this.f14625b = str;
            return this;
        }

        public final a c(String str) {
            this.f14627d = str;
            return this;
        }

        public final a a(byte[] bArr) {
            this.f14626c = bArr;
            return this;
        }

        public final a a(Map<String, String> map) {
            this.f14628e = map;
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
        this.f14619a = aVar.f14624a;
        this.f14620b = aVar.f14625b;
        this.f14621c = aVar.f14626c;
        this.f14622d = aVar.f14627d;
        this.f14623e = aVar.f14628e;
    }
}
