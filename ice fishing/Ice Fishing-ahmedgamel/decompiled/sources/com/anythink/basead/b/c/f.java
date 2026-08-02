package com.anythink.basead.b.c;

import com.anythink.core.common.h.w;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
final class f extends com.anythink.core.common.res.image.b {

    /* renamed from: a, reason: collision with root package name */
    private String f6739a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6740b;

    /* renamed from: c, reason: collision with root package name */
    private String f6741c;

    /* renamed from: k, reason: collision with root package name */
    private int f6742k;

    /* renamed from: l, reason: collision with root package name */
    private w f6743l;

    public f(String str, boolean z6, w wVar, String str2) {
        super(str2);
        this.f6743l = wVar;
        this.f6739a = str;
        this.f6740b = z6;
        this.f6741c = wVar.v();
        this.f6742k = wVar.b();
    }

    @Override // com.anythink.core.common.res.image.b
    public final Map<String, String> a() {
        return null;
    }

    @Override // com.anythink.core.common.res.image.b
    public final void b() {
    }

    @Override // com.anythink.core.common.res.image.b
    public final void c() {
        e.a().a(this.f17026d, 100);
    }

    @Override // com.anythink.core.common.res.image.b
    public final boolean a(InputStream inputStream) {
        com.anythink.basead.b.f.a();
        return com.anythink.basead.b.f.a(this.f17026d, inputStream, 1);
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(com.anythink.core.common.v.b.d dVar) {
        if (this.f6740b) {
            com.anythink.core.common.v.b.b.a().a(dVar, 5);
        } else {
            com.anythink.core.common.v.b.b.a().a(dVar, 4);
        }
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(String str, String str2) {
        e.a().a(this.f17026d, com.anythink.basead.d.g.a(str, str2));
    }
}
