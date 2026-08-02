package com.yandex.music.design.components.animation;

import defpackage.act;
import defpackage.fk0;
import defpackage.jx7;
import defpackage.jyn;
import defpackage.mrb;
import defpackage.nya;
import defpackage.pyn;
import defpackage.tm0;
import defpackage.weo;
import defpackage.yci;

/* loaded from: classes3.dex */
public abstract class a {
    public static final float a = 30;

    public static final tm0 a(int i, float f, int i2, float f2, jx7 jx7Var) {
        act actVar = new act((int) Math.ceil(f / (Math.abs(jx7Var.n0(f2)) / 1000.0f)), 1200, nya.d);
        long j = ((-1200) + i2) * (-1);
        return i == Integer.MAX_VALUE ? weo.C(actVar, null, j, 2) : new pyn(i, actVar, jyn.a, j);
    }

    public static yci b(yci yciVar, mrb mrbVar, float f, fk0 fk0Var) {
        yciVar.getClass();
        return yciVar.f(new MarqueeModifierElement(1200, mrbVar, a, f, fk0Var));
    }
}
