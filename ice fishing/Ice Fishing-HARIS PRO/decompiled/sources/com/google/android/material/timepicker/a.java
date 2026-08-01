package com.google.android.material.timepicker;

import O.C0026b;
import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public abstract class a extends C0026b {

    /* renamed from: d, reason: collision with root package name */
    public final P.d f2728d;

    public a(Context context, int i) {
        this.f2728d = new P.d(context.getString(i), 16);
    }

    @Override // O.C0026b
    public void d(View view, P.f fVar) {
        this.f785a.onInitializeAccessibilityNodeInfo(view, fVar.f891a);
        fVar.b(this.f2728d);
    }
}
