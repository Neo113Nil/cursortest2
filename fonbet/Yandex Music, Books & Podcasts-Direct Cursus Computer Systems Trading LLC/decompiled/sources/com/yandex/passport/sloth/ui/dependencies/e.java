package com.yandex.passport.sloth.ui.dependencies;

import defpackage.g4i;

/* loaded from: classes4.dex */
public final class e implements g, i, l {
    public static final e b = new e(0);
    public static final e c = new e(1);
    public static final e d = new e(2);
    public static final e e = new e(3);
    public static final e f = new e(4);
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.l
    public k v() {
        switch (this.a) {
            case 2:
                float f2 = 50;
                float f3 = g4i.a.density;
                return new k((int) (f2 * f3), (int) (f2 * f3));
            case 3:
                return new k(-1, -1);
            default:
                return new k(-2, -2);
        }
    }
}
