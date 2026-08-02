package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes10.dex */
public abstract class vml0 extends xml0 implements wml0, uml0 {
    public List i = new ArrayList();
    public HashSet j = null;
    public String k = null;
    public HashSet l = null;
    public HashSet m = null;

    @Override // defpackage.uml0
    public final String a() {
        return this.k;
    }

    @Override // defpackage.uml0
    public final void c(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override // defpackage.uml0
    public final Set d() {
        return this.l;
    }

    @Override // defpackage.uml0
    public final Set e() {
        return null;
    }

    @Override // defpackage.uml0
    public final void f(HashSet hashSet) {
        this.j = hashSet;
    }

    @Override // defpackage.uml0
    public final Set g() {
        return this.j;
    }

    @Override // defpackage.wml0
    public final List getChildren() {
        return this.i;
    }

    @Override // defpackage.uml0
    public final void h(HashSet hashSet) {
    }

    public void i(anl0 anl0Var) {
        this.i.add(anl0Var);
    }

    @Override // defpackage.uml0
    public final void j(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override // defpackage.uml0
    public final void k(String str) {
        this.k = str;
    }

    @Override // defpackage.uml0
    public final Set m() {
        return this.m;
    }
}
