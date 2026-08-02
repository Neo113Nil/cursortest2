package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class e3p extends bfu {
    public final c0p k;
    public final xdr l;
    public final xdr m;
    public final j0q n;
    public final jyr o;
    public final jyr p;
    public final jyr q;
    public final mmo r;
    public final bz2 s;

    public e3p(fnb fnbVar, c0p c0pVar, String str) {
        c0pVar.getClass();
        str.getClass();
        this.k = c0pVar;
        this.l = ydr.a(Boolean.FALSE);
        this.m = ydr.a(y2p.a);
        this.n = new j0q();
        l18 l18Var = l18.b;
        this.o = l18Var.b(hag.I(vzo.class), true);
        jyr b = l18Var.b(hag.I(z66.class), true);
        this.p = b;
        this.q = l18Var.b(hag.I(i0p.class), true);
        bdt I = hag.I(Context.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        Context context = (Context) qdcVar.C(I);
        bdt I2 = hag.I(u3g.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        u3g u3gVar = (u3g) qdcVar2.C(I2);
        z66 z66Var = (z66) b.getValue();
        bdt I3 = hag.I(fw5.class);
        qdc qdcVar3 = l18Var.a;
        qdcVar3.getClass();
        fu5 b2 = ((fw5) qdcVar3.C(I3)).b();
        bdt I4 = hag.I(ng1.class);
        qdc qdcVar4 = l18Var.a;
        qdcVar4.getClass();
        this.r = new mmo(context, u3gVar, z66Var, b2, (ng1) qdcVar4.C(I4));
        this.s = new bz2(18, new tao(fnbVar, c0pVar, str));
        vdr c = ((z66) b.getValue()).c();
        fkn F0 = zsd.F0(new p6o(c, 3), ot0.F(this), lbq.a, Boolean.valueOf(((x66) c.getValue()).b == u0j.a));
        x97.y(ot0.F(this), null, null, new b3p(this, null, 0), 3);
        ox6.B(zsd.d0(F0, 1), ot0.F(this), new gfl(26, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c3, code lost:
    
        if (r13 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        if (r13 == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r7v3, types: [bqi] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00c3 -> B:11:0x00c6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e3p e3pVar, Continuation continuation) {
        d3p d3pVar;
        int i;
        boolean b;
        List list;
        xdr xdrVar;
        Iterator it;
        xdr xdrVar2;
        Collection collection;
        int i2;
        int i3;
        boolean z;
        int i4;
        Object obj;
        e3pVar.getClass();
        if (continuation instanceof d3p) {
            d3pVar = (d3p) continuation;
            int i5 = d3pVar.s;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                d3pVar.s = i5 - Integer.MIN_VALUE;
                Object obj2 = d3pVar.q;
                nm6 nm6Var = nm6.a;
                i = d3pVar.s;
                if (i != 0) {
                    qgg.h0(obj2);
                    ((i0p) e3pVar.q.getValue()).getClass();
                    b = i0p.b();
                    qzo qzoVar = b ? qzo.a : qzo.b;
                    vzo vzoVar = (vzo) e3pVar.o.getValue();
                    c0p c0pVar = e3pVar.k;
                    d3pVar.j = b;
                    d3pVar.s = 1;
                    obj2 = vzoVar.d(c0pVar, qzoVar, d3pVar);
                } else if (i == 1) {
                    b = d3pVar.j;
                    qgg.h0(obj2);
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = d3pVar.p;
                    i2 = d3pVar.o;
                    i3 = d3pVar.n;
                    z = d3pVar.j;
                    ?? r7 = d3pVar.m;
                    it = d3pVar.l;
                    collection = d3pVar.k;
                    qgg.h0(obj2);
                    xdr xdrVar3 = r7;
                    y7p y7pVar = (y7p) obj2;
                    xdrVar2 = xdrVar3;
                    if (y7pVar != null) {
                        collection.add(y7pVar);
                        xdrVar2 = xdrVar3;
                    }
                    if (it.hasNext()) {
                        obj = new z2p((List) collection);
                        xdrVar = xdrVar2;
                        xdr xdrVar4 = xdrVar;
                        xdrVar4.getClass();
                        xdrVar4.m(null, obj);
                        return Unit.a;
                    }
                    i4p i4pVar = (i4p) it.next();
                    mmo mmoVar = e3pVar.r;
                    d3pVar.k = collection;
                    d3pVar.l = it;
                    d3pVar.m = xdrVar2;
                    d3pVar.j = z;
                    d3pVar.n = i3;
                    d3pVar.o = i2;
                    d3pVar.p = i4;
                    d3pVar.s = 2;
                    obj2 = mmoVar.W0(i4pVar, d3pVar);
                    xdrVar3 = xdrVar2;
                }
                list = (List) obj2;
                xdrVar = e3pVar.m;
                if (list != null) {
                    obj = x2p.a;
                } else if (list.isEmpty()) {
                    obj = w2p.a;
                } else {
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    xdrVar2 = xdrVar;
                    collection = arrayList;
                    i2 = 0;
                    i3 = 0;
                    z = b;
                    i4 = 0;
                    if (it.hasNext()) {
                    }
                }
                xdr xdrVar42 = xdrVar;
                xdrVar42.getClass();
                xdrVar42.m(null, obj);
                return Unit.a;
            }
        }
        d3pVar = new d3p(e3pVar, continuation);
        Object obj22 = d3pVar.q;
        nm6 nm6Var2 = nm6.a;
        i = d3pVar.s;
        if (i != 0) {
        }
        list = (List) obj22;
        xdrVar = e3pVar.m;
        if (list != null) {
        }
        xdr xdrVar422 = xdrVar;
        xdrVar422.getClass();
        xdrVar422.m(null, obj);
        return Unit.a;
    }
}
