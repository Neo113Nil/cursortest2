package com.anythink.core.common.res.image;

import com.anythink.core.common.d.t;
import com.anythink.core.common.res.d;
import com.anythink.core.common.res.e;
import com.anythink.core.common.v.o;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    e f17023a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC0096a f17024b;

    /* renamed from: com.anythink.core.common.res.image.a$a, reason: collision with other inner class name */
    public interface InterfaceC0096a {
        void a(e eVar);

        void a(e eVar, String str);
    }

    public a(e eVar) {
        super(eVar.f17022h);
        this.f17023a = eVar;
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
        InterfaceC0096a interfaceC0096a = this.f17024b;
        if (interfaceC0096a != null) {
            interfaceC0096a.a(this.f17023a);
        }
    }

    public final void a(InterfaceC0096a interfaceC0096a) {
        this.f17024b = interfaceC0096a;
    }

    @Override // com.anythink.core.common.res.image.b
    public final boolean a(InputStream inputStream) {
        d a9 = d.a(t.b().g());
        e eVar = this.f17023a;
        return a9.a(eVar.f17021g, o.a(eVar.f17022h), inputStream);
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(com.anythink.core.common.v.b.d dVar) {
        com.anythink.core.common.v.b.b.a().a(dVar, 4);
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(String str, String str2) {
        InterfaceC0096a interfaceC0096a = this.f17024b;
        if (interfaceC0096a != null) {
            interfaceC0096a.a(this.f17023a, str2);
        }
    }
}
