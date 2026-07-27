package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3703p {

    /* renamed from: a, reason: collision with root package name */
    public final A8 f32985a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f32986b;

    public C3703p(A8 a82, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC2968bG.J("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f32985a = a82;
        this.f32986b = iArr;
    }
}
