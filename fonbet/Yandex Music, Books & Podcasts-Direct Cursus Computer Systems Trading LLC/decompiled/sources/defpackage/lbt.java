package defpackage;

import android.text.Layout;

/* loaded from: classes.dex */
public final class lbt {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public mas r;
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

    public final void a(lbt lbtVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (lbtVar != null) {
            if (!this.c && lbtVar.c) {
                this.b = lbtVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = lbtVar.h;
            }
            if (this.i == -1) {
                this.i = lbtVar.i;
            }
            if (this.a == null && (str = lbtVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = lbtVar.f;
            }
            if (this.g == -1) {
                this.g = lbtVar.g;
            }
            if (this.n == -1) {
                this.n = lbtVar.n;
            }
            if (this.o == null && (alignment2 = lbtVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = lbtVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = lbtVar.q;
            }
            if (this.j == -1) {
                this.j = lbtVar.j;
                this.k = lbtVar.k;
            }
            if (this.r == null) {
                this.r = lbtVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = lbtVar.s;
            }
            if (this.t == null) {
                this.t = lbtVar.t;
            }
            if (this.u == null) {
                this.u = lbtVar.u;
            }
            if (!this.e && lbtVar.e) {
                this.d = lbtVar.d;
                this.e = true;
            }
            if (this.m != -1 || (i = lbtVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
