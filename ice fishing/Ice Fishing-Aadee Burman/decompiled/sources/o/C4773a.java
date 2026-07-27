package o;

import java.util.HashMap;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4773a extends C4778f {

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f39528x = new HashMap();

    @Override // o.C4778f
    public final C4775c a(Object obj) {
        return (C4775c) this.f39528x.get(obj);
    }

    @Override // o.C4778f
    public final Object c(Object obj) {
        Object c9 = super.c(obj);
        this.f39528x.remove(obj);
        return c9;
    }
}
