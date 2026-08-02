package com.anythink.expressad.mbbanner.a.c;

import com.anythink.expressad.videocommon.b.i;

/* loaded from: classes.dex */
public class f implements i.b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20668a = "f";

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.d.b f20669b;

    /* renamed from: c, reason: collision with root package name */
    private String f20670c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f20671d;

    public f(com.anythink.expressad.mbbanner.a.d.b bVar, String str, com.anythink.expressad.foundation.d.d dVar) {
        this.f20669b = bVar;
        this.f20670c = str;
        this.f20671d = dVar;
    }

    @Override // com.anythink.expressad.videocommon.b.i.a
    public final void a(String str) {
        com.anythink.expressad.mbbanner.a.d.b bVar = this.f20669b;
        if (bVar != null) {
            bVar.a(this.f20670c, 3, str, true, this.f20671d);
        }
    }

    @Override // com.anythink.expressad.videocommon.b.i.a
    public final void a(String str, String str2) {
        com.anythink.expressad.mbbanner.a.d.b bVar = this.f20669b;
        if (bVar != null) {
            bVar.a(this.f20670c, 3, str, false, this.f20671d);
        }
    }
}
