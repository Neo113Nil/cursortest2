package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.tO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3943tO {

    /* renamed from: b, reason: collision with root package name */
    public static final C3943tO f34276b = new C3943tO(new C3534lt((byte) 0, 13));

    /* renamed from: a, reason: collision with root package name */
    public final XB f34277a;

    public C3943tO(C3534lt c3534lt) {
        this.f34277a = (XB) c3534lt.f31863u;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3943tO) && this.f34277a.equals(((C3943tO) obj).f34277a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f34277a, null, null, bool, bool, bool, bool, bool);
    }
}
