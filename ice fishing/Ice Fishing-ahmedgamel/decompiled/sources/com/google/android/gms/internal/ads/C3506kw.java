package com.google.android.gms.internal.ads;

import android.content.Context;
import o0.C4796b;
import q0.C4861a;

/* renamed from: com.google.android.gms.internal.ads.kw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3506kw {

    /* renamed from: b, reason: collision with root package name */
    public static final C3506kw f32448b = new C3506kw();

    /* renamed from: a, reason: collision with root package name */
    public Context f32449a;

    public /* synthetic */ C3506kw(Context context) {
        this.f32449a = context;
    }

    public P3.a a(boolean z6) {
        try {
            C4861a c4861a = new C4861a(z6);
            C4796b a9 = C4796b.a(this.f32449a);
            return a9 != null ? a9.b(c4861a) : QC.k(new IllegalStateException());
        } catch (Exception e9) {
            return QC.k(e9);
        }
    }
}
