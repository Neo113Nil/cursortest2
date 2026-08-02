package defpackage;

import android.graphics.Path;

/* loaded from: classes.dex */
public final class cod implements tc6 {
    public final int a;
    public final Path.FillType b;
    public final gk0 c;
    public final gk0 d;
    public final gk0 e;
    public final gk0 f;
    public final String g;
    public final boolean h;

    public cod(String str, int i, Path.FillType fillType, gk0 gk0Var, gk0 gk0Var2, gk0 gk0Var3, gk0 gk0Var4, boolean z) {
        this.a = i;
        this.b = fillType;
        this.c = gk0Var;
        this.d = gk0Var2;
        this.e = gk0Var3;
        this.f = gk0Var4;
        this.g = str;
        this.h = z;
    }

    @Override // defpackage.tc6
    public final lb6 a(czg czgVar, ayg aygVar, ds2 ds2Var) {
        return new dod(czgVar, aygVar, ds2Var, this);
    }
}
