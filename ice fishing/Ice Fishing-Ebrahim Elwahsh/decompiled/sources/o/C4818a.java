package o;

import java.util.HashMap;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4818a extends C4823f {

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f39659x = new HashMap();

    @Override // o.C4823f
    public final C4820c a(Object obj) {
        return (C4820c) this.f39659x.get(obj);
    }

    @Override // o.C4823f
    public final Object c(Object obj) {
        Object c4 = super.c(obj);
        this.f39659x.remove(obj);
        return c4;
    }
}
