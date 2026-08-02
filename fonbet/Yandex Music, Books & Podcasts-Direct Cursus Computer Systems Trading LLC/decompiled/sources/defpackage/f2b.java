package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class f2b extends xmm implements ayd {
    public final /* synthetic */ byd d;
    public final q43 e;
    public final i2b f;
    public final c2b g;
    public final xdr h;

    public f2b(s63 s63Var, q43 q43Var, i2b i2bVar, jyr jyrVar) {
        drf drfVar = s63Var.a;
        wfm wfmVar = (wfm) drfVar;
        wfmVar.getClass();
        this.d = new byd(wfmVar, jyrVar);
        this.e = q43Var;
        this.f = i2bVar;
        this.g = (c2b) drfVar;
        this.h = ydr.a(new m1b(true));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.g;
    }

    @Override // defpackage.ayd
    public final void b(boolean z) {
        this.d.b(z);
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.h.getValue() instanceof n1b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
    
        if (r11.d.a(r13, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00db, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005b, code lost:
    
        if (r13 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        e2b e2bVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof e2b) {
            e2bVar = (e2b) cg6Var;
            int i2 = e2bVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e2bVar.m = i2 - Integer.MIN_VALUE;
                Object obj = e2bVar.k;
                nm6 nm6Var = nm6.a;
                i = e2bVar.m;
                xdr xdrVar = this.h;
                c2b c2bVar = this.g;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        m1b m1bVar = new m1b(true);
                        xdrVar.getClass();
                        xdrVar.m(null, m1bVar);
                    }
                    e2bVar.j = z;
                    e2bVar.m = 1;
                    obj = this.f.a(c2bVar, z, e2bVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return new d73(c2bVar);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = e2bVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    if (!n()) {
                        m1b m1bVar2 = new m1b(false);
                        xdrVar.getClass();
                        xdrVar.m(null, m1bVar2);
                    }
                    ((pj6) rj6Var).a();
                    return new c73(c2bVar);
                }
                g2b g2bVar = (g2b) ((qj6) rj6Var).a;
                List list = g2bVar.a;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ngg.N((zsu) it.next()));
                }
                boolean isEmpty = arrayList.isEmpty();
                if (isEmpty) {
                    if (!n()) {
                        m1b m1bVar3 = new m1b(false);
                        xdrVar.getClass();
                        xdrVar.m(null, m1bVar3);
                    }
                } else {
                    if (isEmpty) {
                        b6e.s();
                        return null;
                    }
                    n1b n1bVar = new n1b(arrayList);
                    xdrVar.getClass();
                    xdrVar.m(null, n1bVar);
                }
                int size = arrayList.size();
                p43 p43Var = g2bVar.b;
                String str = p43Var != null ? p43Var.a : null;
                q43 q43Var = this.e;
                q43Var.b(q43Var.a, size, str, null);
                boolean isEmpty2 = arrayList.isEmpty();
                e2bVar.j = z;
                e2bVar.m = 2;
            }
        }
        e2bVar = new e2b(this, cg6Var);
        Object obj2 = e2bVar.k;
        nm6 nm6Var2 = nm6.a;
        i = e2bVar.m;
        xdr xdrVar2 = this.h;
        c2b c2bVar2 = this.g;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
