package com.anythink.core.common.m.d.a;

import com.anythink.core.common.m.d.d;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: b, reason: collision with root package name */
    private static final String f14574b = "a";

    /* renamed from: c, reason: collision with root package name */
    private static final int f14575c = 1;

    @Override // com.anythink.core.common.m.d.a.c
    public final synchronized void a(d dVar, d.a aVar) {
        try {
            int a9 = a(this.f14580a.getInputStream());
            if (a9 != 1) {
                throw new Exception("Response Error Code:".concat(String.valueOf(a9)));
            }
            if (aVar != null) {
                aVar.a(dVar);
            }
            dVar.toString();
        } catch (Throwable th) {
            throw th;
        }
    }
}
