package defpackage;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class pyg implements s0a {
    public final bgg a;
    public final czg b;
    public ayg c;
    public final boolean d;
    public wwn e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public w1g k;
    public final ckj l;
    public final i4a m;

    public pyg(bgg bggVar) {
        this.a = bggVar;
        czg czgVar = new czg();
        this.b = czgVar;
        this.e = wwn.a;
        this.l = new ckj();
        this.m = new i4a(3, this);
        boolean add = ((HashSet) czgVar.l.a).add(fzg.a);
        if (czgVar.a != null && add) {
            czgVar.c();
        }
        a();
        this.d = true;
    }

    public final void a() {
        int i;
        ayg aygVar = this.c;
        int ordinal = this.e.ordinal();
        int i2 = 2;
        if (ordinal == 0 ? !((aygVar == null || !aygVar.o || Build.VERSION.SDK_INT >= 28) && ((aygVar == null || aygVar.p <= 4) && (i = Build.VERSION.SDK_INT) != 24 && i != 25)) : ordinal != 1) {
            i2 = 1;
        }
        bgg bggVar = this.a;
        if (i2 != bggVar.getLayerType()) {
            bggVar.setLayerType(i2, null);
        }
    }

    public final void b() {
        if (this.d) {
            if (!this.a.isShown()) {
                if (this.b.k()) {
                    c();
                    this.h = true;
                    return;
                }
                return;
            }
            if (this.h) {
                e();
            } else if (this.g) {
                d();
            }
            this.h = false;
            this.g = false;
        }
    }

    public final void c() {
        this.i = false;
        this.h = false;
        this.g = false;
        this.b.m();
        a();
    }

    public final void d() {
        if (!this.a.isShown()) {
            this.g = true;
        } else {
            this.b.n();
            a();
        }
    }

    public final void e() {
        if (this.a.isShown()) {
            this.b.q();
            a();
        } else {
            this.g = false;
            this.h = true;
        }
    }
}
