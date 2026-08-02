package com.anythink.basead.b.b;

import android.content.Context;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;

/* loaded from: classes.dex */
public abstract class a implements m {

    /* renamed from: a, reason: collision with root package name */
    final String f6528a = "d";

    /* renamed from: b, reason: collision with root package name */
    Context f6529b;

    /* renamed from: c, reason: collision with root package name */
    w f6530c;

    /* renamed from: d, reason: collision with root package name */
    x f6531d;

    /* renamed from: e, reason: collision with root package name */
    k f6532e;

    /* renamed from: f, reason: collision with root package name */
    b f6533f;

    /* renamed from: g, reason: collision with root package name */
    public IOfferClickHandler f6534g;

    /* renamed from: com.anythink.basead.b.b.a$a, reason: collision with other inner class name */
    public static class C0006a {

        /* renamed from: a, reason: collision with root package name */
        public Context f6535a;

        /* renamed from: b, reason: collision with root package name */
        public w f6536b;

        /* renamed from: c, reason: collision with root package name */
        public x f6537c;

        /* renamed from: d, reason: collision with root package name */
        public k f6538d;

        /* renamed from: e, reason: collision with root package name */
        public b f6539e;

        /* renamed from: f, reason: collision with root package name */
        public IOfferClickHandler f6540f;
    }

    public a(C0006a c0006a) {
        if (c0006a != null) {
            this.f6529b = c0006a.f6535a;
            this.f6530c = c0006a.f6536b;
            this.f6531d = c0006a.f6537c;
            this.f6532e = c0006a.f6538d;
            this.f6533f = c0006a.f6539e;
            this.f6534g = c0006a.f6540f;
        }
    }

    @Override // com.anythink.basead.b.b.m
    public n a() {
        return n.a(false, "not support");
    }

    public final com.anythink.basead.d.e b() {
        if (this.f6530c == null) {
            return null;
        }
        return com.anythink.basead.b.d.a().a(this.f6530c.b(), this.f6530c.v());
    }

    @Override // com.anythink.basead.b.b.m
    public void c() {
    }

    @Override // com.anythink.basead.b.b.m
    public n a(String str, e eVar) {
        return n.a(false, "not support");
    }
}
