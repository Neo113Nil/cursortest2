package com.anythink.core.common.m.a;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public i f14472a;

    /* renamed from: b, reason: collision with root package name */
    public int f14473b;

    /* renamed from: c, reason: collision with root package name */
    public String f14474c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f14475d;

    /* renamed from: e, reason: collision with root package name */
    public k f14476e;

    /* renamed from: f, reason: collision with root package name */
    public Map<String, List<String>> f14477f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private i f14478a;

        /* renamed from: b, reason: collision with root package name */
        private int f14479b;

        /* renamed from: c, reason: collision with root package name */
        private String f14480c;

        /* renamed from: d, reason: collision with root package name */
        private Throwable f14481d;

        /* renamed from: e, reason: collision with root package name */
        private k f14482e;

        /* renamed from: f, reason: collision with root package name */
        private Map<String, List<String>> f14483f;

        public final a a(i iVar) {
            this.f14478a = iVar;
            return this;
        }

        public final a a(int i) {
            this.f14479b = i;
            return this;
        }

        public final a a(String str) {
            this.f14480c = str;
            return this;
        }

        public final a a(Throwable th) {
            this.f14481d = th;
            return this;
        }

        public final a a(k kVar) {
            this.f14482e = kVar;
            return this;
        }

        public final a a(Map<String, List<String>> map) {
            this.f14483f = map;
            return this;
        }

        public final j a() {
            j jVar = new j((byte) 0);
            jVar.f14472a = this.f14478a;
            jVar.f14473b = this.f14479b;
            jVar.f14474c = this.f14480c;
            jVar.f14475d = this.f14481d;
            jVar.f14476e = this.f14482e;
            jVar.f14477f = this.f14483f;
            return jVar;
        }
    }

    public /* synthetic */ j(byte b9) {
        this();
    }

    private boolean a() {
        int i = this.f14473b;
        return i == 200 || i == 201 || i == 204;
    }

    public final String toString() {
        return "NetBridgeResponse{request=" + this.f14472a + ", code=" + this.f14473b + ", errorMsg='" + this.f14474c + "', exception=" + this.f14475d + ", responseBody=" + this.f14476e + ", responseHeader=" + this.f14477f + '}';
    }

    private j() {
    }
}
