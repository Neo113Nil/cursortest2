package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class kvf {
    public final mka a;
    public final CoroutineContext b;
    public gyd c;
    public vft d;
    public c2k e;
    public final t1f f;
    public final CopyOnWriteArrayList g;
    public final vtm h;
    public volatile boolean i;
    public volatile int j;
    public final mka k;
    public final fkn l;
    public final x0q m;
    public final /* synthetic */ lvf n;

    public kvf(lvf lvfVar, mka mkaVar, CoroutineContext coroutineContext, v3k v3kVar) {
        c2k c2kVar;
        a1k a1kVar;
        this.n = lvfVar;
        coroutineContext.getClass();
        this.a = mkaVar;
        this.b = coroutineContext;
        c2k c2kVar2 = c2k.e;
        a1k a1kVar2 = v3kVar != null ? (a1k) v3kVar.d.invoke() : null;
        if (a1kVar2 != null) {
            c2kVar = new c2k(a1kVar2);
        } else {
            c2kVar = c2k.e;
            c2kVar.getClass();
        }
        this.e = c2kVar;
        t1f t1fVar = new t1f(12);
        int i = 11;
        if (v3kVar != null && (a1kVar = (a1k) v3kVar.d.invoke()) != null) {
            ofg ofgVar = a1kVar.e;
            ofg ofgVar2 = a1kVar.f;
            ofgVar.getClass();
            t1fVar.u(new lma(i, t1fVar, ofgVar, ofgVar2));
        }
        this.f = t1fVar;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.g = copyOnWriteArrayList;
        this.h = new vtm(11);
        this.k = new mka(this);
        this.l = (fkn) t1fVar.d;
        this.m = y0q.a(0, 64, oi3.b);
        copyOnWriteArrayList.add(new ypb(27, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit a(kvf kvfVar, List list, int i, int i2, boolean z, ofg ofgVar, ofg ofgVar2, gyd gydVar, cg6 cg6Var) {
        w3k w3kVar;
        int i3;
        c2k c2kVar;
        ofg ofgVar3;
        tqn tqnVar;
        ofg ofgVar4;
        boolean z2 = z;
        kvfVar.getClass();
        if (cg6Var instanceof w3k) {
            w3kVar = (w3k) cg6Var;
            int i4 = w3kVar.r;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                w3kVar.r = i4 - Integer.MIN_VALUE;
                w3k w3kVar2 = w3kVar;
                Object obj = w3kVar2.p;
                nm6 nm6Var = nm6.a;
                i3 = w3kVar2.r;
                if (i3 != 0) {
                    qgg.h0(obj);
                    if (z2 && ofgVar == null) {
                        xq0.x("Cannot dispatch LoadStates in PagingDataDiffer without source LoadStates set.");
                        return null;
                    }
                    kvfVar.i = false;
                    c2kVar = new c2k(i, i2, list);
                    tqn tqnVar2 = new tqn();
                    ofgVar3 = ofgVar;
                    x3k x3kVar = new x3k(kvfVar, c2kVar, tqnVar2, gydVar, ofgVar2, list, i, i2, ofgVar3);
                    w3kVar2.j = kvfVar;
                    w3kVar2.k = ofgVar3;
                    w3kVar2.l = ofgVar2;
                    w3kVar2.m = c2kVar;
                    w3kVar2.n = tqnVar2;
                    w3kVar2.o = z2;
                    w3kVar2.r = 1;
                    x3kVar.invoke();
                    lvf.a(kvfVar.n);
                    tqnVar = tqnVar2;
                    ofgVar4 = ofgVar2;
                    obj = null;
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = w3kVar2.o;
                    tqnVar = w3kVar2.n;
                    c2k c2kVar2 = w3kVar2.m;
                    ofgVar4 = w3kVar2.l;
                    ofg ofgVar5 = w3kVar2.k;
                    kvf kvfVar2 = w3kVar2.j;
                    qgg.h0(obj);
                    ofgVar3 = ofgVar5;
                    c2kVar = c2kVar2;
                    z2 = z3;
                    kvfVar = kvfVar2;
                }
                Integer num = (Integer) obj;
                if (tqnVar.a) {
                    xq0.q("Missing call to onListPresentable after new list was presented. If you are seeing\n this exception, it is generally an indication of an issue with Paging.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                    return null;
                }
                if (z2) {
                    ofgVar3.getClass();
                    kvfVar.getClass();
                    t1f t1fVar = kvfVar.f;
                    t1fVar.getClass();
                    t1fVar.u(new lma(11, t1fVar, ofgVar3, ofgVar4));
                }
                if (num == null) {
                    gyd gydVar2 = kvfVar.c;
                    if (gydVar2 != null) {
                        int i5 = c2kVar.b / 2;
                        Integer N = xz0.N(((c7t) CollectionsKt.Q(c2kVar.a)).a);
                        N.getClass();
                        gydVar2.k(new giu(i5, i5, N.intValue(), c2kVar.c()));
                    }
                } else {
                    kvfVar.j = num.intValue();
                    gyd gydVar3 = kvfVar.c;
                    if (gydVar3 != null) {
                        gydVar3.k(c2kVar.a(num.intValue()));
                    }
                }
                return Unit.a;
            }
        }
        w3kVar = new w3k(kvfVar, cg6Var);
        w3k w3kVar22 = w3kVar;
        Object obj2 = w3kVar22.p;
        nm6 nm6Var2 = nm6.a;
        i3 = w3kVar22.r;
        if (i3 != 0) {
        }
        Integer num2 = (Integer) obj2;
        if (tqnVar.a) {
        }
    }

    public final m0f b() {
        c2k c2kVar = this.e;
        int i = c2kVar.c;
        int i2 = c2kVar.d;
        ArrayList arrayList = c2kVar.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z75.t(arrayList2, ((c7t) it.next()).b);
        }
        return new m0f(arrayList2, i, i2);
    }
}
