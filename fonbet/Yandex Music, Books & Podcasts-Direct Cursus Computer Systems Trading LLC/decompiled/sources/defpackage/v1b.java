package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class v1b extends xmm implements ayd {
    public final /* synthetic */ byd d;
    public final q43 e;
    public final y1b f;
    public final q1b g;
    public final xdr h;

    public v1b(s63 s63Var, q43 q43Var, y1b y1bVar, jyr jyrVar) {
        drf drfVar = s63Var.a;
        wfm wfmVar = (wfm) drfVar;
        wfmVar.getClass();
        this.d = new byd(wfmVar, jyrVar);
        this.e = q43Var;
        this.f = y1bVar;
        this.g = (q1b) drfVar;
        this.h = ydr.a(new z1b(true));
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
        return this.h.getValue() instanceof a2b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0126, code lost:
    
        if (r24.d.a(r2, r3) == r4) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0128, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0061, code lost:
    
        if (r2 == r4) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        u1b u1bVar;
        int i;
        rj6 rj6Var;
        f70 f70Var;
        boolean z2 = z;
        if (cg6Var instanceof u1b) {
            u1bVar = (u1b) cg6Var;
            int i2 = u1bVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u1bVar.m = i2 - Integer.MIN_VALUE;
                Object obj = u1bVar.k;
                nm6 nm6Var = nm6.a;
                i = u1bVar.m;
                xdr xdrVar = this.h;
                q1b q1bVar = this.g;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        z1b z1bVar = new z1b(true);
                        xdrVar.getClass();
                        xdrVar.m(null, z1bVar);
                    }
                    u1bVar.j = z2;
                    u1bVar.m = 1;
                    obj = this.f.a(q1bVar, z2, u1bVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return new d73(q1bVar);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = u1bVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    if (!n()) {
                        z1b z1bVar2 = new z1b(false);
                        xdrVar.getClass();
                        xdrVar.m(null, z1bVar2);
                    }
                    ((pj6) rj6Var).a();
                    return new c73(q1bVar);
                }
                w1b w1bVar = (w1b) ((qj6) rj6Var).a;
                ArrayList arrayList = w1bVar.a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hlu hluVar = (hlu) it.next();
                    hluVar.getClass();
                    dou douVar = hluVar.a;
                    String str = douVar.c;
                    String str2 = douVar.d;
                    np npVar = hluVar.b;
                    op opVar = npVar.b;
                    Iterator it2 = it;
                    String pathForSize = new jcv(opVar.a, WebPath$Storage.AVATARS).getPathForSize(wct.s());
                    String str3 = npVar.a;
                    Integer b0 = y2x.b0(opVar.b);
                    p1b p1bVar = b0 != null ? new p1b(new klu(str, str2, pathForSize, str3, b0.intValue(), npVar.c), douVar) : null;
                    if (p1bVar != null) {
                        arrayList2.add(p1bVar);
                    }
                    it = it2;
                }
                boolean isEmpty = arrayList2.isEmpty();
                if (!isEmpty) {
                    f70Var = null;
                    if (isEmpty) {
                        b6e.s();
                        return null;
                    }
                    a2b a2bVar = new a2b(arrayList2);
                    xdrVar.getClass();
                    xdrVar.m(null, a2bVar);
                } else if (n()) {
                    f70Var = null;
                } else {
                    z1b z1bVar3 = new z1b(false);
                    xdrVar.getClass();
                    f70Var = null;
                    xdrVar.m(null, z1bVar3);
                }
                int size = arrayList2.size();
                p43 p43Var = w1bVar.b;
                String str4 = p43Var != null ? p43Var.a : f70Var;
                q43 q43Var = this.e;
                q43Var.b(q43Var.a, size, str4, f70Var);
                boolean isEmpty2 = arrayList2.isEmpty();
                u1bVar.j = z2;
                u1bVar.m = 2;
            }
        }
        u1bVar = new u1b(this, cg6Var);
        Object obj2 = u1bVar.k;
        nm6 nm6Var2 = nm6.a;
        i = u1bVar.m;
        xdr xdrVar2 = this.h;
        q1b q1bVar2 = this.g;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
