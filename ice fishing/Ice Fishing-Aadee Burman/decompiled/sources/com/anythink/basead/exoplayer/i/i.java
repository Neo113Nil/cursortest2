package com.anythink.basead.exoplayer.i;

import com.anythink.basead.exoplayer.aa;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f7981a;

    /* renamed from: b, reason: collision with root package name */
    public final aa[] f7982b;

    /* renamed from: c, reason: collision with root package name */
    public final g f7983c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7984d;

    public i(aa[] aaVarArr, f[] fVarArr, Object obj) {
        this.f7982b = aaVarArr;
        this.f7983c = new g(fVarArr);
        this.f7984d = obj;
        this.f7981a = aaVarArr.length;
    }

    public final boolean a(int i) {
        return this.f7982b[i] != null;
    }

    public final boolean a(i iVar) {
        if (iVar == null || iVar.f7983c.f7977a != this.f7983c.f7977a) {
            return false;
        }
        for (int i = 0; i < this.f7983c.f7977a; i++) {
            if (!a(iVar, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(i iVar, int i) {
        return iVar != null && af.a(this.f7982b[i], iVar.f7982b[i]) && af.a(this.f7983c.a(i), iVar.f7983c.a(i));
    }
}
