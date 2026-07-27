package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public class ZB extends BB implements Serializable {

    /* renamed from: w, reason: collision with root package name */
    public final transient C3770qC f28848w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f28849x;

    /* renamed from: y, reason: collision with root package name */
    public transient YB f28850y;

    public ZB(C3770qC c3770qC, int i) {
        this.f28848w = c3770qC;
        this.f28849x = i;
        Object[] objArr = C3823rC.f33536B;
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
        return this.f28848w;
    }
}
