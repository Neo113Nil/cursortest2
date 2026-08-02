package defpackage;

import android.graphics.Matrix;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class nko extends klo implements pko, hlo {
    public HashSet i = null;
    public String j = null;
    public HashSet k = null;
    public HashSet l = null;
    public HashSet m = null;
    public Matrix n;

    @Override // defpackage.hlo
    public final Set b() {
        return this.k;
    }

    @Override // defpackage.hlo
    public final String c() {
        return this.j;
    }

    @Override // defpackage.hlo
    public final void e(HashSet hashSet) {
        this.i = hashSet;
    }

    @Override // defpackage.hlo
    public final Set f() {
        return this.i;
    }

    @Override // defpackage.hlo
    public final void g(HashSet hashSet) {
        this.k = hashSet;
    }

    @Override // defpackage.hlo
    public final void i(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override // defpackage.hlo
    public final void j(String str) {
        this.j = str;
    }

    @Override // defpackage.hlo
    public final void k(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override // defpackage.pko
    public final void l(Matrix matrix) {
        this.n = matrix;
    }

    @Override // defpackage.hlo
    public final Set m() {
        return this.l;
    }

    @Override // defpackage.hlo
    public final Set n() {
        return this.m;
    }
}
