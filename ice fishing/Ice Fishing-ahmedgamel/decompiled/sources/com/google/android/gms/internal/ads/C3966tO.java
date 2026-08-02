package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.tO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3966tO {

    /* renamed from: b, reason: collision with root package name */
    public static final C3966tO f35062b = new C3966tO(new C3557lt((byte) 0, 13));

    /* renamed from: a, reason: collision with root package name */
    public final XB f35063a;

    public C3966tO(C3557lt c3557lt) {
        this.f35063a = (XB) c3557lt.f32643u;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3966tO) && this.f35063a.equals(((C3966tO) obj).f35063a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f35063a, null, null, bool, bool, bool, bool, bool);
    }
}
