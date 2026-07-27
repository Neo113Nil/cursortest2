package com.anythink.expressad.video.module.a.a;

/* loaded from: classes.dex */
public class i extends f {

    /* renamed from: X, reason: collision with root package name */
    protected com.anythink.expressad.video.module.a.a f21923X;

    public i(com.anythink.expressad.video.module.a.a aVar) {
        this.f21923X = aVar;
    }

    @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public void a(int i, Object obj) {
        super.a(i, obj);
        com.anythink.expressad.video.module.a.a aVar = this.f21923X;
        if (aVar != null) {
            aVar.a(i, obj);
        }
    }
}
