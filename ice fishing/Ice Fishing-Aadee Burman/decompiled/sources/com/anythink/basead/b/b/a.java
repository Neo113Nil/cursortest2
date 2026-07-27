package com.anythink.basead.b.b;

import android.content.Context;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;

/* loaded from: classes.dex */
public abstract class a implements m {

    /* renamed from: a, reason: collision with root package name */
    final String f5742a = "d";

    /* renamed from: b, reason: collision with root package name */
    Context f5743b;

    /* renamed from: c, reason: collision with root package name */
    w f5744c;

    /* renamed from: d, reason: collision with root package name */
    x f5745d;

    /* renamed from: e, reason: collision with root package name */
    k f5746e;

    /* renamed from: f, reason: collision with root package name */
    b f5747f;

    /* renamed from: g, reason: collision with root package name */
    public IOfferClickHandler f5748g;

    /* renamed from: com.anythink.basead.b.b.a$a, reason: collision with other inner class name */
    public static class C0006a {

        /* renamed from: a, reason: collision with root package name */
        public Context f5749a;

        /* renamed from: b, reason: collision with root package name */
        public w f5750b;

        /* renamed from: c, reason: collision with root package name */
        public x f5751c;

        /* renamed from: d, reason: collision with root package name */
        public k f5752d;

        /* renamed from: e, reason: collision with root package name */
        public b f5753e;

        /* renamed from: f, reason: collision with root package name */
        public IOfferClickHandler f5754f;
    }

    public a(C0006a c0006a) {
        if (c0006a != null) {
            this.f5743b = c0006a.f5749a;
            this.f5744c = c0006a.f5750b;
            this.f5745d = c0006a.f5751c;
            this.f5746e = c0006a.f5752d;
            this.f5747f = c0006a.f5753e;
            this.f5748g = c0006a.f5754f;
        }
    }

    @Override // com.anythink.basead.b.b.m
    public n a() {
        return n.a(false, "not support");
    }

    public final com.anythink.basead.d.e b() {
        if (this.f5744c == null) {
            return null;
        }
        return com.anythink.basead.b.d.a().a(this.f5744c.b(), this.f5744c.v());
    }

    @Override // com.anythink.basead.b.b.m
    public void c() {
    }

    @Override // com.anythink.basead.b.b.m
    public n a(String str, e eVar) {
        return n.a(false, "not support");
    }
}
