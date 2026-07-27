package com.google.android.gms.internal.ads;

import android.content.Context;
import o0.C4825b;
import q0.C4866a;

/* renamed from: com.google.android.gms.internal.ads.lw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3550lw {

    /* renamed from: b, reason: collision with root package name */
    public static final C3550lw f32621b = new C3550lw();

    /* renamed from: a, reason: collision with root package name */
    public Context f32622a;

    public /* synthetic */ C3550lw(Context context) {
        this.f32622a = context;
    }

    public J3.a a(boolean z8) {
        try {
            C4866a c4866a = new C4866a(z8);
            C4825b a9 = C4825b.a(this.f32622a);
            return a9 != null ? a9.b(c4866a) : C3686oN.l(new IllegalStateException());
        } catch (Exception e6) {
            return C3686oN.l(e6);
        }
    }
}
