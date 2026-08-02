package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.item;

import defpackage.h1b;
import defpackage.xup;

/* loaded from: classes5.dex */
public final class d extends h1b {
    public final /* synthetic */ e m;

    public d(e eVar) {
        this.m = eVar;
    }

    @Override // defpackage.h1b
    public final void O(float f, float f2, float f3, xup xupVar) {
        xupVar.getClass();
        e eVar = this.m;
        float f4 = eVar.c;
        float f5 = f3 * f4;
        float f6 = f2 - f4;
        float f7 = f2 + f4;
        int i = eVar.b / 2;
        float degrees = (float) Math.toDegrees(Math.acos(i / r0));
        float f8 = i;
        xupVar.a(f6, (-f5) - f8, f7, f5 - f8, degrees + 90.0f, degrees * (-2.0f));
    }
}
