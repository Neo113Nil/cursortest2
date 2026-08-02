package com.fillr;

import com.fillr.e0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;
import javax.xml.namespace.QName;

/* loaded from: classes4.dex */
public final class t extends v {
    public c2 h = new c2("unqualified", 3);
    public c2 i = new c2("unqualified", 3);
    public final n1 j;
    public final n1 k;
    public final n1 l;
    public final n1 m;
    public final n1 n;
    public final n1 o;
    public final m1 r;
    public final m1 s;
    public String t;
    public String u;
    public String v;
    public e0 x;

    public t(String str, String str2, e0 e0Var) {
        this.x = e0Var;
        new c2("none", 2);
        new c2("none", 2);
        this.s = new m1(0);
        this.r = new m1(0);
        this.l = new n1(0);
        this.j = new n1(0);
        this.k = new n1(0);
        this.m = new n1(0);
        this.n = new n1(0);
        this.o = new n1(0);
        this.u = str;
        this.t = str;
        if (str == null) {
            this.u = "";
        }
        if (e0Var != null) {
            e0.b bVar = new e0.b(this.u, str2);
            if (((HashMap) e0Var.c).containsKey(bVar)) {
                throw new q0("Schema name conflict in collection");
            }
            e0Var.a(bVar, this);
        }
    }

    public final o0 a(QName qName, boolean z, Stack stack) {
        if (stack != null && stack.contains(this)) {
            return null;
        }
        o0 o0Var = (o0) ((l1) this.l.a.get(qName));
        if (z && o0Var == null) {
            Iterator it = ((Vector) this.r.a).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                t tVar = next instanceof z0 ? ((z0) next).h : next instanceof a1 ? ((a1) next).h : null;
                if (tVar != null) {
                    if (stack == null) {
                        stack = new Stack();
                    }
                    stack.push(this);
                    o0Var = tVar.a(qName, z, stack);
                    if (o0Var != null) {
                    }
                }
            }
            return o0Var;
        }
        return o0Var;
    }

    public final b2 b(QName qName, Stack stack) {
        if (stack != null && stack.contains(this)) {
            return null;
        }
        b2 b2Var = (b2) ((l1) this.o.a.get(qName));
        if (b2Var == null) {
            Iterator it = ((Vector) this.r.a).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                t tVar = next instanceof z0 ? ((z0) next).h : next instanceof a1 ? ((a1) next).h : null;
                if (tVar != null) {
                    if (stack == null) {
                        stack = new Stack();
                    }
                    stack.push(this);
                    b2Var = tVar.b(qName, stack);
                    if (b2Var != null) {
                    }
                }
            }
            return b2Var;
        }
        return b2Var;
    }

    @Override // com.fillr.l1
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        String str = this.f;
        String str2 = tVar.f;
        if (str != null) {
            if (!str.equals(str2)) {
                return false;
            }
        } else if (str2 != null) {
            return false;
        }
        String str3 = this.t;
        String str4 = tVar.t;
        if (str3 != null) {
            if (!str3.equals(str4)) {
                return false;
            }
        } else if (str4 != null) {
            return false;
        }
        return true;
    }

    @Override // com.fillr.v
    public final String toString() {
        StringBuilder sb = new StringBuilder(String.valueOf(super.toString()));
        sb.append("[");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.u, "]");
    }

    public final void b(b2 b2Var) {
        QName e = b2Var.e();
        n1 n1Var = this.o;
        if (!n1Var.a.containsKey(e)) {
            n1Var.a.put(e, b2Var);
            return;
        }
        throw new q0(" Schema for namespace '" + this.t + "' already contains type '" + e.getLocalPart() + "'");
    }
}
