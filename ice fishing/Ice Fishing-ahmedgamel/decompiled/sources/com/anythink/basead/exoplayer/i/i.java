package com.anythink.basead.exoplayer.i;

import com.anythink.basead.exoplayer.aa;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f8767a;

    /* renamed from: b, reason: collision with root package name */
    public final aa[] f8768b;

    /* renamed from: c, reason: collision with root package name */
    public final g f8769c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8770d;

    public i(aa[] aaVarArr, f[] fVarArr, Object obj) {
        this.f8768b = aaVarArr;
        this.f8769c = new g(fVarArr);
        this.f8770d = obj;
        this.f8767a = aaVarArr.length;
    }

    public final boolean a(int i) {
        return this.f8768b[i] != null;
    }

    public final boolean a(i iVar) {
        if (iVar == null || iVar.f8769c.f8763a != this.f8769c.f8763a) {
            return false;
        }
        for (int i = 0; i < this.f8769c.f8763a; i++) {
            if (!a(iVar, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(i iVar, int i) {
        return iVar != null && af.a(this.f8768b[i], iVar.f8768b[i]) && af.a(this.f8769c.a(i), iVar.f8769c.a(i));
    }
}
