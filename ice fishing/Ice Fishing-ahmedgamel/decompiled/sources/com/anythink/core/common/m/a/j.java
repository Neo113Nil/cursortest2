package com.anythink.core.common.m.a;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public i f15258a;

    /* renamed from: b, reason: collision with root package name */
    public int f15259b;

    /* renamed from: c, reason: collision with root package name */
    public String f15260c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f15261d;

    /* renamed from: e, reason: collision with root package name */
    public k f15262e;

    /* renamed from: f, reason: collision with root package name */
    public Map<String, List<String>> f15263f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private i f15264a;

        /* renamed from: b, reason: collision with root package name */
        private int f15265b;

        /* renamed from: c, reason: collision with root package name */
        private String f15266c;

        /* renamed from: d, reason: collision with root package name */
        private Throwable f15267d;

        /* renamed from: e, reason: collision with root package name */
        private k f15268e;

        /* renamed from: f, reason: collision with root package name */
        private Map<String, List<String>> f15269f;

        public final a a(i iVar) {
            this.f15264a = iVar;
            return this;
        }

        public final a a(int i) {
            this.f15265b = i;
            return this;
        }

        public final a a(String str) {
            this.f15266c = str;
            return this;
        }

        public final a a(Throwable th) {
            this.f15267d = th;
            return this;
        }

        public final a a(k kVar) {
            this.f15268e = kVar;
            return this;
        }

        public final a a(Map<String, List<String>> map) {
            this.f15269f = map;
            return this;
        }

        public final j a() {
            j jVar = new j((byte) 0);
            jVar.f15258a = this.f15264a;
            jVar.f15259b = this.f15265b;
            jVar.f15260c = this.f15266c;
            jVar.f15261d = this.f15267d;
            jVar.f15262e = this.f15268e;
            jVar.f15263f = this.f15269f;
            return jVar;
        }
    }

    public /* synthetic */ j(byte b9) {
        this();
    }

    private boolean a() {
        int i = this.f15259b;
        return i == 200 || i == 201 || i == 204;
    }

    public final String toString() {
        return "NetBridgeResponse{request=" + this.f15258a + ", code=" + this.f15259b + ", errorMsg='" + this.f15260c + "', exception=" + this.f15261d + ", responseBody=" + this.f15262e + ", responseHeader=" + this.f15263f + '}';
    }

    private j() {
    }
}
