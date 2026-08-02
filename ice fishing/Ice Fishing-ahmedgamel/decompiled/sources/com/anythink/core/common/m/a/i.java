package com.anythink.core.common.m.a;

import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public String f15248a;

    /* renamed from: b, reason: collision with root package name */
    public String f15249b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f15250c;

    /* renamed from: d, reason: collision with root package name */
    public String f15251d;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, String> f15252e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f15253a;

        /* renamed from: b, reason: collision with root package name */
        private String f15254b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f15255c;

        /* renamed from: d, reason: collision with root package name */
        private String f15256d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, String> f15257e;

        public final a a(String str) {
            this.f15253a = str;
            return this;
        }

        public final a b(String str) {
            this.f15254b = str;
            return this;
        }

        public final a c(String str) {
            this.f15256d = str;
            return this;
        }

        public final a a(byte[] bArr) {
            this.f15255c = bArr;
            return this;
        }

        public final a a(Map<String, String> map) {
            this.f15257e = map;
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
        this.f15248a = aVar.f15253a;
        this.f15249b = aVar.f15254b;
        this.f15250c = aVar.f15255c;
        this.f15251d = aVar.f15256d;
        this.f15252e = aVar.f15257e;
    }
}
