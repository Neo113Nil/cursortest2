package com.anythink.expressad.mbbanner.a.c;

import com.anythink.expressad.videocommon.b.i;

/* loaded from: classes.dex */
public class f implements i.b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20039a = "f";

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.d.b f20040b;

    /* renamed from: c, reason: collision with root package name */
    private String f20041c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f20042d;

    public f(com.anythink.expressad.mbbanner.a.d.b bVar, String str, com.anythink.expressad.foundation.d.d dVar) {
        this.f20040b = bVar;
        this.f20041c = str;
        this.f20042d = dVar;
    }

    @Override // com.anythink.expressad.videocommon.b.i.a
    public final void a(String str) {
        com.anythink.expressad.mbbanner.a.d.b bVar = this.f20040b;
        if (bVar != null) {
            bVar.a(this.f20041c, 3, str, true, this.f20042d);
        }
    }

    @Override // com.anythink.expressad.videocommon.b.i.a
    public final void a(String str, String str2) {
        com.anythink.expressad.mbbanner.a.d.b bVar = this.f20040b;
        if (bVar != null) {
            bVar.a(this.f20041c, 3, str, false, this.f20042d);
        }
    }
}
