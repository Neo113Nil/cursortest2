package o;

import java.util.HashMap;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310a extends C0315f {
    public final HashMap e = new HashMap();

    @Override // o.C0315f
    public final C0312c a(Object obj) {
        return (C0312c) this.e.get(obj);
    }

    @Override // o.C0315f
    public final Object b(Object obj) {
        Object b2 = super.b(obj);
        this.e.remove(obj);
        return b2;
    }
}
