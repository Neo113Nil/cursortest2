package com.gamericefishpro.space.g1;

import android.content.Context;
import com.gamericefishpro.space.f2.k0;
import com.gamericefishpro.space.h0.d0;
import com.gamericefishpro.space.h0.z;
import com.gamericefishpro.space.n9.a2;
import com.gamericefishpro.space.n9.p1;
import com.gamericefishpro.space.n9.r1;
import com.gamericefishpro.space.n9.v0;
import com.gamericefishpro.space.t.m;
import com.gamericefishpro.space.t.w;
import com.gamericefishpro.space.t0.l0;
import com.gamericefishpro.space.t0.n;
import com.gamericefishpro.space.v8.c0;
import com.gamericefishpro.space.w.l1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements a2 {
    public final Object d;

    public b(r1 r1Var) {
        c0.g(r1Var);
        this.d = r1Var;
    }

    @Override // com.gamericefishpro.space.n9.a2
    public v0 a() {
        throw null;
    }

    @Override // com.gamericefishpro.space.n9.a2
    public p1 c() {
        throw null;
    }

    @Override // com.gamericefishpro.space.n9.a2
    public Context d() {
        throw null;
    }

    @Override // com.gamericefishpro.space.n9.a2
    public com.gamericefishpro.space.z8.a e() {
        throw null;
    }

    @Override // com.gamericefishpro.space.n9.a2
    public com.gamericefishpro.space.lb.e f() {
        throw null;
    }

    public boolean g(int i, l0 l0Var, Object obj) {
        ArrayList arrayList = l0Var.a;
        if (arrayList == null) {
            h(i, l0Var, null);
            return true;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            if (obj2 instanceof com.gamericefishpro.space.t0.a) {
                if (obj2.equals(obj)) {
                    h(0, l0Var, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof l0)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (g(i, (l0) obj2, obj)) {
                    h(0, l0Var, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    public void h(int i, l0 l0Var, Object obj) {
        ((ArrayList) this.d).add(new c(i, null, null));
    }

    public void i(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        m(com.gamericefishpro.space.ij.a.d, msg);
    }

    public abstract void j(com.gamericefishpro.space.ij.a aVar, String str);

    public abstract Object k();

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public List l(d0 d0Var, int i, long j) {
        w wVar = (w) this.d;
        List list = (List) wVar.b(i);
        if (list != null) {
            return list;
        }
        z zVar = d0Var.i;
        w wVar2 = d0Var.v;
        List listJ = (List) wVar2.b(i);
        if (listJ == null) {
            Object objB = zVar.b(i);
            listJ = d0Var.e.j(objB, d0Var.d.a(i, objB, zVar.c(i)));
            wVar2.h(i, listJ);
        }
        int size = listJ.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((k0) listJ.get(i2)).e(j));
        }
        wVar.h(i, arrayList);
        return arrayList;
    }

    public void m(com.gamericefishpro.space.ij.a lvl, String msg) {
        Intrinsics.checkNotNullParameter(lvl, "lvl");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (((com.gamericefishpro.space.ij.a) this.d).compareTo(lvl) <= 0) {
            j(lvl, msg);
        }
    }

    public void n(int i, Object obj, l0 l0Var, Object obj2) {
        if (Intrinsics.a(obj, n.a)) {
            h(i, l0Var, null);
        }
    }

    public abstract void o(Object obj);

    public abstract void p(l1 l1Var);

    public abstract void q();

    public void r() {
        p1 p1Var = ((r1) this.d).z;
        r1.l(p1Var);
        p1Var.r();
    }

    public b(com.gamericefishpro.space.ij.a level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.d = level;
    }

    public b(int i) {
        switch (i) {
            case 1:
                w wVar = m.a;
                this.d = new w();
                break;
            case 4:
                this.d = com.gamericefishpro.space.t0.i.v(Boolean.FALSE);
                break;
            default:
                this.d = new ArrayList();
                break;
        }
    }
}
