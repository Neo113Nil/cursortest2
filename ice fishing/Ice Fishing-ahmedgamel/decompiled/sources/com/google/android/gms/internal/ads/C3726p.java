package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3726p {

    /* renamed from: a, reason: collision with root package name */
    public final A8 f33775a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f33776b;

    public C3726p(A8 a82, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC2991bG.J("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f33775a = a82;
        this.f33776b = iArr;
    }
}
