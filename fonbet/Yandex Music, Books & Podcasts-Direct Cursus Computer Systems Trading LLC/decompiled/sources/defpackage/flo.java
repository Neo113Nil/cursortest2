package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class flo implements Cloneable {
    public Float A;
    public olo B;
    public Float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int X;
    public long a = 0;
    public olo b;
    public Float c;
    public olo d;
    public Float e;
    public rko f;
    public Float g;
    public rko[] h;
    public rko i;
    public Float j;
    public iko k;
    public ArrayList l;
    public rko m;
    public Integer n;
    public Boolean o;
    public x3n p;
    public String q;
    public String r;
    public String s;
    public Boolean t;
    public Boolean u;
    public olo v;
    public Float w;
    public String x;
    public String y;
    public olo z;

    public static flo b() {
        flo floVar = new flo();
        floVar.a = -1L;
        iko ikoVar = iko.b;
        floVar.b = ikoVar;
        floVar.D = 1;
        Float valueOf = Float.valueOf(1.0f);
        floVar.c = valueOf;
        floVar.d = null;
        floVar.e = valueOf;
        floVar.f = new rko(1.0f);
        floVar.E = 1;
        floVar.F = 1;
        floVar.g = Float.valueOf(4.0f);
        floVar.h = null;
        floVar.i = new rko(0.0f);
        floVar.j = valueOf;
        floVar.k = ikoVar;
        floVar.l = null;
        floVar.m = new rko(7, 12.0f);
        floVar.n = 400;
        floVar.G = 1;
        floVar.H = 1;
        floVar.I = 1;
        floVar.J = 1;
        Boolean bool = Boolean.TRUE;
        floVar.o = bool;
        floVar.p = null;
        floVar.q = null;
        floVar.r = null;
        floVar.s = null;
        floVar.t = bool;
        floVar.u = bool;
        floVar.v = ikoVar;
        floVar.w = valueOf;
        floVar.x = null;
        floVar.K = 1;
        floVar.y = null;
        floVar.z = null;
        floVar.A = valueOf;
        floVar.B = null;
        floVar.C = valueOf;
        floVar.L = 1;
        floVar.X = 1;
        return floVar;
    }

    public final Object clone() {
        flo floVar = (flo) super.clone();
        rko[] rkoVarArr = this.h;
        if (rkoVarArr != null) {
            floVar.h = (rko[]) rkoVarArr.clone();
        }
        return floVar;
    }
}
