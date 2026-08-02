package defpackage;

import android.graphics.Path;

/* loaded from: classes.dex */
public final class kup implements tc6 {
    public final boolean a;
    public final Path.FillType b;
    public final String c;
    public final gk0 d;
    public final gk0 e;
    public final boolean f;

    public kup(String str, boolean z, Path.FillType fillType, gk0 gk0Var, gk0 gk0Var2, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = gk0Var;
        this.e = gk0Var2;
        this.f = z2;
    }

    @Override // defpackage.tc6
    public final lb6 a(czg czgVar, ayg aygVar, ds2 ds2Var) {
        return new ebc(czgVar, ds2Var, this);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("ShapeFill{color=, fillEnabled="), this.a, '}');
    }
}
