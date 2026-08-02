package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class wsj extends xmm implements ayd {
    public final /* synthetic */ byd d;
    public final s63 e;
    public final q43 f;
    public final tsj g;
    public final a2t h;
    public final cej i;
    public final fsj j;
    public final xdr k;
    public final vvd l;

    public wsj(s63 s63Var, q43 q43Var, tsj tsjVar, a2t a2tVar, cej cejVar, jyr jyrVar) {
        drf drfVar = s63Var.a;
        wfm wfmVar = (wfm) drfVar;
        wfmVar.getClass();
        this.d = new byd(wfmVar, jyrVar);
        this.e = s63Var;
        this.f = q43Var;
        this.g = tsjVar;
        this.h = a2tVar;
        this.i = cejVar;
        fsj fsjVar = (fsj) drfVar;
        this.j = fsjVar;
        this.k = ydr.a(new egt(true, fsjVar.f()));
        this.l = fsjVar.f() ? null : new vvd(fsjVar.d, fsjVar.e);
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.j;
    }

    @Override // defpackage.ayd
    public final void b(boolean z) {
        this.d.b(z);
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.k.getValue() instanceof rgt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0159, code lost:
    
        if (r17.d.a(r2, r3) == r4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x015b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:
    
        if (kotlin.text.StringsKt.U(r5) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e2, code lost:
    
        r15 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0103, code lost:
    
        if (kotlin.text.StringsKt.U(r5) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0065, code lost:
    
        if (r2 == r4) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123 A[LOOP:1: B:49:0x011d->B:51:0x0123, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        vsj vsjVar;
        int i;
        rj6 rj6Var;
        Iterator it;
        String e;
        boolean z2 = z;
        if (cg6Var instanceof vsj) {
            vsjVar = (vsj) cg6Var;
            int i2 = vsjVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vsjVar.m = i2 - Integer.MIN_VALUE;
                Object obj = vsjVar.k;
                nm6 nm6Var = nm6.a;
                i = vsjVar.m;
                xdr xdrVar = this.k;
                fsj fsjVar = this.j;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        egt egtVar = new egt(true, fsjVar.f());
                        xdrVar.getClass();
                        xdrVar.m(null, egtVar);
                    }
                    vsjVar.j = z2;
                    vsjVar.m = 1;
                    obj = this.g.a(fsjVar, z2, vsjVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return new d73(fsjVar);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = vsjVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    p();
                    ((pj6) rj6Var).a();
                    return new c73(fsjVar);
                }
                isj isjVar = (isj) ((qj6) rj6Var).a;
                ArrayList<mqs> arrayList = isjVar.b;
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                for (mqs mqsVar : arrayList) {
                    arrayList2.add(new jo6(a4g.G(mqsVar) ? this.i.a(mqsVar, false) : this.h.a(mqsVar), mqsVar));
                }
                boolean isEmpty = arrayList2.isEmpty();
                if (isEmpty) {
                    p();
                } else {
                    if (isEmpty) {
                        b6e.s();
                        return null;
                    }
                    int ordinal = fsjVar.f.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            u9b u9bVar = isjVar.a.d;
                            e = u9bVar != null ? u9bVar.e(wct.s(), WebPath$Storage.AVATARS) : null;
                            if (e != null) {
                            }
                        } else {
                            if (ordinal != 2) {
                                b6e.s();
                                return null;
                            }
                            u9b u9bVar2 = isjVar.c;
                            e = u9bVar2 != null ? u9bVar2.e(wct.s(), WebPath$Storage.AVATARS) : null;
                            if (e != null) {
                            }
                        }
                        eul eulVar = isjVar.a;
                        boolean f = fsjVar.f();
                        String str = fsjVar.d;
                        String str2 = fsjVar.e;
                        ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((jo6) it.next()).a);
                        }
                        rgt rgtVar = new rgt(eulVar, arrayList2, f, r15, new usj(str, str2, arrayList3));
                        xdrVar.getClass();
                        xdrVar.m(null, rgtVar);
                    }
                    String str3 = null;
                    eul eulVar2 = isjVar.a;
                    boolean f2 = fsjVar.f();
                    String str4 = fsjVar.d;
                    String str22 = fsjVar.e;
                    ArrayList arrayList32 = new ArrayList(v75.o(arrayList2, 10));
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                    }
                    rgt rgtVar2 = new rgt(eulVar2, arrayList2, f2, str3, new usj(str4, str22, arrayList32));
                    xdrVar.getClass();
                    xdrVar.m(null, rgtVar2);
                }
                q43.c(this.f, arrayList2.size());
                boolean isEmpty2 = arrayList2.isEmpty();
                vsjVar.j = z2;
                vsjVar.m = 2;
            }
        }
        vsjVar = new vsj(this, cg6Var);
        Object obj2 = vsjVar.k;
        nm6 nm6Var2 = nm6.a;
        i = vsjVar.m;
        xdr xdrVar2 = this.k;
        fsj fsjVar2 = this.j;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }

    public final void p() {
        if (n()) {
            return;
        }
        egt egtVar = new egt(false, this.j.f());
        xdr xdrVar = this.k;
        xdrVar.getClass();
        xdrVar.m(null, egtVar);
    }
}
