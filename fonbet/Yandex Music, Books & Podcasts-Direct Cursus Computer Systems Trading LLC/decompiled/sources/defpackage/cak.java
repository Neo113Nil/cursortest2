package defpackage;

import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cak implements Comparable {
    public static final String b;
    public final pn3 a;

    static {
        String str = File.separator;
        str.getClass();
        b = str;
    }

    public cak(pn3 pn3Var) {
        pn3Var.getClass();
        this.a = pn3Var;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a = h.a(this);
        pn3 pn3Var = this.a;
        if (a == -1) {
            a = 0;
        } else if (a < pn3Var.d() && pn3Var.k(a) == 92) {
            a++;
        }
        int d = pn3Var.d();
        int i = a;
        while (a < d) {
            if (pn3Var.k(a) == 47 || pn3Var.k(a) == 92) {
                arrayList.add(pn3Var.q(i, a));
                i = a + 1;
            }
            a++;
        }
        if (i < pn3Var.d()) {
            arrayList.add(pn3Var.q(i, pn3Var.d()));
        }
        return arrayList;
    }

    public final cak b() {
        pn3 pn3Var = h.d;
        pn3 pn3Var2 = this.a;
        if (Intrinsics.d(pn3Var2, pn3Var)) {
            return null;
        }
        pn3 pn3Var3 = h.a;
        if (Intrinsics.d(pn3Var2, pn3Var3)) {
            return null;
        }
        pn3 pn3Var4 = h.b;
        if (Intrinsics.d(pn3Var2, pn3Var4)) {
            return null;
        }
        pn3 pn3Var5 = h.e;
        pn3Var2.getClass();
        pn3Var5.getClass();
        int d = pn3Var2.d();
        byte[] bArr = pn3Var5.a;
        if (pn3Var2.p(d - bArr.length, pn3Var5, bArr.length) && (pn3Var2.d() == 2 || pn3Var2.p(pn3Var2.d() - 3, pn3Var3, 1) || pn3Var2.p(pn3Var2.d() - 3, pn3Var4, 1))) {
            return null;
        }
        int n = pn3.n(pn3Var2, pn3Var3);
        if (n == -1) {
            n = pn3.n(pn3Var2, pn3Var4);
        }
        if (n == 2 && e() != null) {
            if (pn3Var2.d() == 3) {
                return null;
            }
            return new cak(pn3.r(pn3Var2, 0, 3, 1));
        }
        if (n == 1) {
            pn3Var4.getClass();
            if (pn3Var2.p(0, pn3Var4, pn3Var4.d())) {
                return null;
            }
        }
        if (n != -1 || e() == null) {
            return n == -1 ? new cak(pn3Var) : n == 0 ? new cak(pn3.r(pn3Var2, 0, 1, 1)) : new cak(pn3.r(pn3Var2, 0, n, 1));
        }
        if (pn3Var2.d() == 2) {
            return null;
        }
        return new cak(pn3.r(pn3Var2, 0, 2, 1));
    }

    public final cak c(cak cakVar) {
        cakVar.getClass();
        pn3 pn3Var = cakVar.a;
        int a = h.a(this);
        pn3 pn3Var2 = this.a;
        cak cakVar2 = a == -1 ? null : new cak(pn3Var2.q(0, a));
        int a2 = h.a(cakVar);
        if (!Intrinsics.d(cakVar2, a2 != -1 ? new cak(pn3Var.q(0, a2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + cakVar).toString());
        }
        ArrayList a3 = a();
        ArrayList a4 = cakVar.a();
        int min = Math.min(a3.size(), a4.size());
        int i = 0;
        while (i < min && Intrinsics.d(a3.get(i), a4.get(i))) {
            i++;
        }
        if (i == min && pn3Var2.d() == pn3Var.d()) {
            return h1b.M(".");
        }
        if (a4.subList(i, a4.size()).indexOf(h.e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + cakVar).toString());
        }
        if (Intrinsics.d(pn3Var, h.d)) {
            return this;
        }
        hi3 hi3Var = new hi3();
        pn3 c = h.c(cakVar);
        if (c == null && (c = h.c(this)) == null) {
            c = h.f(b);
        }
        int size = a4.size();
        for (int i2 = i; i2 < size; i2++) {
            hi3Var.L0(h.e);
            hi3Var.L0(c);
        }
        int size2 = a3.size();
        while (i < size2) {
            hi3Var.L0((pn3) a3.get(i));
            hi3Var.L0(c);
            i++;
        }
        return h.d(hi3Var, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        cak cakVar = (cak) obj;
        cakVar.getClass();
        return this.a.compareTo(cakVar.a);
    }

    public final cak d(String str) {
        str.getClass();
        hi3 hi3Var = new hi3();
        hi3Var.S0(str);
        return h.b(this, h.d(hi3Var, false), false);
    }

    public final Character e() {
        pn3 pn3Var = h.a;
        pn3 pn3Var2 = this.a;
        if (pn3.h(pn3Var2, pn3Var) != -1 || pn3Var2.d() < 2 || pn3Var2.k(1) != 58) {
            return null;
        }
        char k = (char) pn3Var2.k(0);
        if (('a' > k || k >= '{') && ('A' > k || k >= '[')) {
            return null;
        }
        return Character.valueOf(k);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cak) && Intrinsics.d(((cak) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final File toFile() {
        return new File(this.a.u());
    }

    public final String toString() {
        return this.a.u();
    }
}
