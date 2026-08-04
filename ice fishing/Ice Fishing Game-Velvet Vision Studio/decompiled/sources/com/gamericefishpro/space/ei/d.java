package com.gamericefishpro.space.ei;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements com.gamericefishpro.space.ki.a, Serializable {
    public transient com.gamericefishpro.space.ki.a d;
    protected final Object e;
    private final Class i;
    private final String v;
    private final String w;
    private final boolean y;

    public d() {
        this(c.d, null, null, null, false);
    }

    public abstract com.gamericefishpro.space.ki.a d();

    public final String e() {
        return this.v;
    }

    public final e f() {
        Class cls = this.i;
        if (cls == null) {
            return null;
        }
        if (!this.y) {
            return b0.a(cls);
        }
        b0.a.getClass();
        return new p(cls);
    }

    public final String g() {
        return this.w;
    }

    public d(Object obj, Class cls, String str, String str2, boolean z) {
        this.e = obj;
        this.i = cls;
        this.v = str;
        this.w = str2;
        this.y = z;
    }
}
