package com.anythink.basead.b.b;

import android.content.Context;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;

/* loaded from: classes.dex */
public abstract class a implements m {

    /* renamed from: a, reason: collision with root package name */
    final String f5899a = "d";

    /* renamed from: b, reason: collision with root package name */
    Context f5900b;

    /* renamed from: c, reason: collision with root package name */
    w f5901c;

    /* renamed from: d, reason: collision with root package name */
    x f5902d;

    /* renamed from: e, reason: collision with root package name */
    k f5903e;

    /* renamed from: f, reason: collision with root package name */
    b f5904f;

    /* renamed from: g, reason: collision with root package name */
    public IOfferClickHandler f5905g;

    /* renamed from: com.anythink.basead.b.b.a$a, reason: collision with other inner class name */
    public static class C0005a {

        /* renamed from: a, reason: collision with root package name */
        public Context f5906a;

        /* renamed from: b, reason: collision with root package name */
        public w f5907b;

        /* renamed from: c, reason: collision with root package name */
        public x f5908c;

        /* renamed from: d, reason: collision with root package name */
        public k f5909d;

        /* renamed from: e, reason: collision with root package name */
        public b f5910e;

        /* renamed from: f, reason: collision with root package name */
        public IOfferClickHandler f5911f;
    }

    public a(C0005a c0005a) {
        if (c0005a != null) {
            this.f5900b = c0005a.f5906a;
            this.f5901c = c0005a.f5907b;
            this.f5902d = c0005a.f5908c;
            this.f5903e = c0005a.f5909d;
            this.f5904f = c0005a.f5910e;
            this.f5905g = c0005a.f5911f;
        }
    }

    @Override // com.anythink.basead.b.b.m
    public n a() {
        return n.a(false, "not support");
    }

    public final com.anythink.basead.d.e b() {
        if (this.f5901c == null) {
            return null;
        }
        return com.anythink.basead.b.d.a().a(this.f5901c.b(), this.f5901c.v());
    }

    @Override // com.anythink.basead.b.b.m
    public void c() {
    }

    @Override // com.anythink.basead.b.b.m
    public n a(String str, e eVar) {
        return n.a(false, "not support");
    }
}
