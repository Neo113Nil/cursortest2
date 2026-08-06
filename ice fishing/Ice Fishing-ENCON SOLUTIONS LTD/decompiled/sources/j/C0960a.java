package j;

import java.util.HashMap;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0960a extends C0965f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f8013e = new HashMap();

    @Override // j.C0965f
    public final C0962c a(Object obj) {
        return (C0962c) this.f8013e.get(obj);
    }

    @Override // j.C0965f
    public final Object b(Object obj) {
        Object b2 = super.b(obj);
        this.f8013e.remove(obj);
        return b2;
    }
}
