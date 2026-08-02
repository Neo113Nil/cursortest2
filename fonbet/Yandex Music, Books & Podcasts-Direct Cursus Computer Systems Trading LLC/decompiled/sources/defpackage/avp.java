package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class avp implements tc6 {
    public final String a;
    public final hk0 b;
    public final ArrayList c;
    public final gk0 d;
    public final gk0 e;
    public final hk0 f;
    public final int g;
    public final int h;
    public final float i;
    public final boolean j;

    public avp(String str, hk0 hk0Var, ArrayList arrayList, gk0 gk0Var, gk0 gk0Var2, hk0 hk0Var2, int i, int i2, float f, boolean z) {
        this.a = str;
        this.b = hk0Var;
        this.c = arrayList;
        this.d = gk0Var;
        this.e = gk0Var2;
        this.f = hk0Var2;
        this.g = i;
        this.h = i2;
        this.i = f;
        this.j = z;
    }

    @Override // defpackage.tc6
    public final lb6 a(czg czgVar, ayg aygVar, ds2 ds2Var) {
        return new bmr(czgVar, ds2Var, this);
    }
}
