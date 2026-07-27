package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3662o {

    /* renamed from: a, reason: collision with root package name */
    public final B8 f33071a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f33072b;

    public C3662o(B8 b82, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC3217fl.X("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f33071a = b82;
        this.f33072b = iArr;
    }
}
