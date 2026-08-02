package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class god implements tc6 {
    public final String a;
    public final int b;
    public final gk0 c;
    public final gk0 d;
    public final gk0 e;
    public final gk0 f;
    public final hk0 g;
    public final int h;
    public final int i;
    public final float j;
    public final ArrayList k;
    public final hk0 l;
    public final boolean m;

    public god(String str, int i, gk0 gk0Var, gk0 gk0Var2, gk0 gk0Var3, gk0 gk0Var4, hk0 hk0Var, int i2, int i3, float f, ArrayList arrayList, hk0 hk0Var2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = gk0Var;
        this.d = gk0Var2;
        this.e = gk0Var3;
        this.f = gk0Var4;
        this.g = hk0Var;
        this.h = i2;
        this.i = i3;
        this.j = f;
        this.k = arrayList;
        this.l = hk0Var2;
        this.m = z;
    }

    @Override // defpackage.tc6
    public final lb6 a(czg czgVar, ayg aygVar, ds2 ds2Var) {
        return new hod(czgVar, ds2Var, this);
    }
}
