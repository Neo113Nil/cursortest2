package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class ilo extends klo implements jlo, hlo {
    public List i = new ArrayList();
    public HashSet j = null;
    public String k = null;
    public HashSet l = null;
    public HashSet m = null;

    @Override // defpackage.jlo
    public final List a() {
        return this.i;
    }

    @Override // defpackage.hlo
    public final Set b() {
        return null;
    }

    @Override // defpackage.hlo
    public final String c() {
        return this.k;
    }

    @Override // defpackage.hlo
    public final void e(HashSet hashSet) {
        this.j = hashSet;
    }

    @Override // defpackage.hlo
    public final Set f() {
        return this.j;
    }

    @Override // defpackage.jlo
    public void h(nlo nloVar) {
        this.i.add(nloVar);
    }

    @Override // defpackage.hlo
    public final void i(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override // defpackage.hlo
    public final void j(String str) {
        this.k = str;
    }

    @Override // defpackage.hlo
    public final void k(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override // defpackage.hlo
    public final Set m() {
        return this.l;
    }

    @Override // defpackage.hlo
    public final Set n() {
        return this.m;
    }

    @Override // defpackage.hlo
    public final void g(HashSet hashSet) {
    }
}
