package com.anythink.expressad.mbbanner.a.c;

import com.anythink.expressad.videocommon.b.i;

/* loaded from: classes.dex */
public class f implements i.b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19881a = "f";

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.d.b f19882b;

    /* renamed from: c, reason: collision with root package name */
    private String f19883c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f19884d;

    public f(com.anythink.expressad.mbbanner.a.d.b bVar, String str, com.anythink.expressad.foundation.d.d dVar) {
        this.f19882b = bVar;
        this.f19883c = str;
        this.f19884d = dVar;
    }

    @Override // com.anythink.expressad.videocommon.b.i.a
    public final void a(String str) {
        com.anythink.expressad.mbbanner.a.d.b bVar = this.f19882b;
        if (bVar != null) {
            bVar.a(this.f19883c, 3, str, true, this.f19884d);
        }
    }

    @Override // com.anythink.expressad.videocommon.b.i.a
    public final void a(String str, String str2) {
        com.anythink.expressad.mbbanner.a.d.b bVar = this.f19882b;
        if (bVar != null) {
            bVar.a(this.f19883c, 3, str, false, this.f19884d);
        }
    }
}
