package defpackage;

import android.text.Layout;

/* loaded from: classes10.dex */
public final class qj11 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public emy0 r;
    public String t;
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(qj11 qj11Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (qj11Var != null) {
            if (!this.c && qj11Var.c) {
                this.b = qj11Var.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = qj11Var.h;
            }
            if (this.i == -1) {
                this.i = qj11Var.i;
            }
            if (this.a == null && (str = qj11Var.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = qj11Var.f;
            }
            if (this.g == -1) {
                this.g = qj11Var.g;
            }
            if (this.n == -1) {
                this.n = qj11Var.n;
            }
            if (this.o == null && (alignment2 = qj11Var.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = qj11Var.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = qj11Var.q;
            }
            if (this.j == -1) {
                this.j = qj11Var.j;
                this.k = qj11Var.k;
            }
            if (this.r == null) {
                this.r = qj11Var.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = qj11Var.s;
            }
            if (this.t == null) {
                this.t = qj11Var.t;
            }
            if (this.u == null) {
                this.u = qj11Var.u;
            }
            if (!this.e && qj11Var.e) {
                this.d = qj11Var.d;
                this.e = true;
            }
            if (this.m != -1 || (i = qj11Var.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
