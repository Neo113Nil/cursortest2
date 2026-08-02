package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class d04 extends aur implements pyc {
    public int j;
    public /* synthetic */ rjc k;
    public /* synthetic */ Object l;
    public final /* synthetic */ bz2 m;
    public rjc n;
    public wgg o;
    public Collection p;
    public Iterator q;
    public Collection r;
    public int s;
    public int t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d04(Continuation continuation, bz2 bz2Var) {
        super(3, continuation);
        this.m = bz2Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d04 d04Var = new d04((Continuation) obj3, this.m);
        d04Var.k = (rjc) obj;
        d04Var.l = obj2;
        return d04Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e2, code lost:
    
        if (defpackage.zsd.e0(r12, r2, r16) == r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00a5 -> B:12:0x00a6). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Collection arrayList;
        rjc rjcVar;
        int i;
        wgg wggVar;
        Iterator it;
        int i2;
        int i3;
        nm6 nm6Var = nm6.a;
        int i4 = this.j;
        int i5 = 1;
        if (i4 == 0) {
            qgg.h0(obj);
            rjc rjcVar2 = this.k;
            wgg wggVar2 = (wgg) this.l;
            List list = wggVar2.a;
            arrayList = new ArrayList(v75.o(list, 10));
            rjcVar = rjcVar2;
            i = 0;
            wggVar = wggVar2;
            it = list.iterator();
            i2 = 0;
            i3 = 0;
            if (it.hasNext()) {
            }
            return nm6Var;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                qgg.h0(obj);
                return Unit.a;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = this.u;
        i2 = this.t;
        i3 = this.s;
        arrayList = this.r;
        it = this.q;
        Collection collection = this.p;
        wggVar = this.o;
        rjcVar = this.n;
        qgg.h0(obj);
        Object b0 = obj;
        arrayList.add(zsd.b0((pjc) b0));
        arrayList = collection;
        i5 = 1;
        if (it.hasNext()) {
            c01 c01Var = (c01) it.next();
            a04 a04Var = (a04) this.m.c;
            String str = c01Var.a;
            this.k = null;
            this.l = null;
            this.n = rjcVar;
            this.o = wggVar;
            Collection collection2 = arrayList;
            this.p = collection2;
            this.q = it;
            this.r = collection2;
            this.s = i3;
            this.t = i2;
            this.u = i;
            this.j = i5;
            e15 e15Var = (e15) a04Var.a.getValue();
            b0 = zsd.b0(new c05(e15Var.h("track_mview"), e15Var, str, 2));
            if (b0 != nm6Var) {
                collection = arrayList;
                arrayList.add(zsd.b0((pjc) b0));
                arrayList = collection;
                i5 = 1;
                if (it.hasNext()) {
                    eno enoVar = new eno(new k3((pjc[]) CollectionsKt.w0((List) arrayList).toArray(new pjc[0]), (Continuation) null, wggVar));
                    this.k = null;
                    this.l = null;
                    this.n = null;
                    this.o = null;
                    this.p = null;
                    this.q = null;
                    this.r = null;
                    this.j = 2;
                }
            }
        }
        return nm6Var;
    }
}
