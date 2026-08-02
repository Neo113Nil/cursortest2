package o;

import java.util.HashMap;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4789a extends C4794f {

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f39695x = new HashMap();

    @Override // o.C4794f
    public final C4791c a(Object obj) {
        return (C4791c) this.f39695x.get(obj);
    }

    @Override // o.C4794f
    public final Object c(Object obj) {
        Object c9 = super.c(obj);
        this.f39695x.remove(obj);
        return c9;
    }
}
