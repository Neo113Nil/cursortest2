package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.cC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3026cC extends EB implements Serializable {

    /* renamed from: w, reason: collision with root package name */
    public final transient C3944tC f29649w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f29650x;

    /* renamed from: y, reason: collision with root package name */
    public transient C2972bC f29651y;

    public C3026cC(C3944tC c3944tC, int i) {
        this.f29649w = c3944tC;
        this.f29650x = i;
        Object[] objArr = C3998uC.f34562B;
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final /* synthetic */ Collection a() {
        return new YB(this);
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final Map c() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final boolean d(Object obj) {
        return obj != null && super.d(obj);
    }

    @Override // com.google.android.gms.internal.ads.DB
    public /* synthetic */ Map e() {
        return this.f29649w;
    }
}
