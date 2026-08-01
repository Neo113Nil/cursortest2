package com.google.android.gms.internal.ads;

import android.content.Context;
import o0.C4780b;
import q0.C4861a;

/* renamed from: com.google.android.gms.internal.ads.jw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3429jw {

    /* renamed from: b, reason: collision with root package name */
    public static final C3429jw f31350b = new C3429jw();

    /* renamed from: a, reason: collision with root package name */
    public Context f31351a;

    public /* synthetic */ C3429jw(Context context) {
        this.f31351a = context;
    }

    public N3.a a(boolean z3) {
        try {
            C4861a c4861a = new C4861a(z3);
            C4780b a9 = C4780b.a(this.f31351a);
            return a9 != null ? a9.b(c4861a) : QC.k(new IllegalStateException());
        } catch (Exception e9) {
            return QC.k(e9);
        }
    }
}
