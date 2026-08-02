package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public class ZB extends BB implements Serializable {

    /* renamed from: w, reason: collision with root package name */
    public final transient C3793qC f29628w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f29629x;

    /* renamed from: y, reason: collision with root package name */
    public transient YB f29630y;

    public ZB(C3793qC c3793qC, int i) {
        this.f29628w = c3793qC;
        this.f29629x = i;
        Object[] objArr = C3846rC.f34304B;
    }

    @Override // com.google.android.gms.internal.ads.AB
    public final /* synthetic */ Collection a() {
        return new VB(this);
    }

    @Override // com.google.android.gms.internal.ads.AB
    public final Map c() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.AB
    public final boolean d(Object obj) {
        return obj != null && super.d(obj);
    }

    @Override // com.google.android.gms.internal.ads.AB
    public /* synthetic */ Map e() {
        return this.f29628w;
    }
}
