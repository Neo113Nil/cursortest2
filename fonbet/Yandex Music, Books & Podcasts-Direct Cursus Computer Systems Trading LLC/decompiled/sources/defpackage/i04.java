package defpackage;

import com.yandex.plus.bdui.flex.ui.b;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.bdui.flex.ui.t;
import com.yandex.plus.log.api.a;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class i04 extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i04(ghw ghwVar, Long l, xdr xdrVar, ccw ccwVar, Continuation continuation) {
        super(3, continuation);
        this.j = 3;
        this.m = ghwVar;
        this.n = l;
        this.o = xdrVar;
        this.p = ccwVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                i04 i04Var = new i04((Continuation) obj3, (to1) this.n, (List) this.o, (j04) this.p, 0);
                i04Var.l = (rjc) obj;
                i04Var.m = (Object[]) obj2;
                return i04Var.invokeSuspend(Unit.a);
            case 1:
                i04 i04Var2 = new i04((Continuation) obj3, (kll) this.n, (mwk) this.o, (tqn) this.p, 1);
                i04Var2.l = (rjc) obj;
                i04Var2.m = obj2;
                return i04Var2.invokeSuspend(Unit.a);
            case 2:
                i04 i04Var3 = new i04((Continuation) obj3, (nsl) this.n, (String) this.o, (String) this.p, 2);
                i04Var3.l = (rjc) obj;
                i04Var3.m = obj2;
                return i04Var3.invokeSuspend(Unit.a);
            case 3:
                i04 i04Var4 = new i04((ghw) this.m, (Long) this.n, (xdr) this.o, (ccw) this.p, (Continuation) obj3);
                i04Var4.l = (Throwable) obj2;
                return i04Var4.invokeSuspend(Unit.a);
            default:
                i04 i04Var5 = new i04((b) this.n, this.o, this.p, (Continuation) obj3);
                i04Var5.l = (com.yandex.plus.bdui.shared.b) obj;
                i04Var5.m = (t) obj2;
                return i04Var5.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Type inference failed for: r14v31, types: [ezc, pyc] */
    /* JADX WARN: Type inference failed for: r7v13, types: [ezc, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        int i;
        eno b;
        Object invoke;
        int i2 = 10;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                List list = (List) this.o;
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = (rjc) this.l;
                    Integer[] numArr = (Integer[]) ((Object[]) this.m);
                    to1 to1Var = (to1) this.n;
                    if (to1Var != null) {
                        List list2 = to1Var.a;
                        arrayList = new ArrayList(v75.o(list2, 10));
                        int i4 = 0;
                        for (Object obj2 : list2) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                u75.n();
                                throw null;
                            }
                            so1 so1Var = (so1) obj2;
                            int size = list.size() + i4;
                            arrayList.add(new n54(so1Var, ((size < 0 || size >= numArr.length) ? new Integer(0) : numArr[size]).intValue()));
                            i4 = i5;
                        }
                    } else {
                        arrayList = null;
                    }
                    List list3 = list;
                    ArrayList arrayList2 = new ArrayList(v75.o(list3, 10));
                    int i6 = 0;
                    for (Object obj3 : list3) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            u75.n();
                            throw null;
                        }
                        arrayList2.add(new ez3((c01) obj3, ((i6 < 0 || i6 >= numArr.length) ? new Integer(0) : numArr[i6]).intValue()));
                        i6 = i7;
                    }
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            i = -1;
                        } else if (j04.a((j04) this.p, (c01) listIterator.previous())) {
                            i = listIterator.nextIndex();
                        }
                    }
                    Integer num = new Integer(i);
                    if (num.intValue() < 0) {
                        num = null;
                    }
                    sz3 sz3Var = new sz3(arrayList2, arrayList, num);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (rjcVar.emit(sz3Var, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar2 = (rjc) this.l;
                    boolean booleanValue = ((Boolean) this.m).booleanValue();
                    pjc v = ((kll) this.n).a.v((mwk) this.o);
                    tqn tqnVar = (tqn) this.p;
                    d7i d7iVar = new d7i(tqnVar, continuation, i2);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    zsd.f0(rjcVar2);
                    Object collect = v.collect(new iv6(new t58(12, rjcVar2, d7iVar), tqnVar, booleanValue, 2), this);
                    if (collect != nm6Var2) {
                        collect = Unit.a;
                    }
                    if (collect != nm6Var2) {
                        collect = Unit.a;
                    }
                    if (collect != nm6Var2) {
                        collect = Unit.a;
                    }
                    if (collect == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                l18 l18Var = l18.b;
                String str = (String) this.p;
                String str2 = (String) this.o;
                nm6 nm6Var3 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar3 = (rjc) this.l;
                    u0j u0jVar = ((x66) this.m).b;
                    u0j u0jVar2 = u0j.a;
                    nsl nslVar = (nsl) this.n;
                    Continuation continuation2 = null;
                    if (u0jVar == u0jVar2) {
                        klg a = nslVar.a();
                        a.getClass();
                        str2.getClass();
                        str.getClass();
                        jyr jyrVar = i2q.e;
                        if (lsq.v()) {
                            bdt I = hag.I(frt.class);
                            qdc qdcVar = l18Var.a;
                            qdcVar.getClass();
                            ((frt) qdcVar.C(I)).c().a.getClass();
                            xlg a2 = a.a();
                            a2.getClass();
                            b = a2.g(new olg(a2, str2, str, continuation2, 1));
                        } else {
                            b = klg.b(new ilg(a, str2, str, continuation2, 1));
                        }
                    } else {
                        klg a3 = nslVar.a();
                        a3.getClass();
                        str2.getClass();
                        str.getClass();
                        jyr jyrVar2 = i2q.e;
                        if (lsq.v()) {
                            bdt I2 = hag.I(frt.class);
                            qdc qdcVar2 = l18Var.a;
                            qdcVar2.getClass();
                            ((frt) qdcVar2.C(I2)).c().a.getClass();
                            xlg a4 = a3.a();
                            a4.getClass();
                            b = a4.g(new olg(a4, str2, str, continuation2, 0));
                        } else {
                            b = klg.b(new ilg(a3, str2, str, continuation2, 0));
                        }
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar3, b, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                xdr xdrVar = (xdr) this.o;
                ghw ghwVar = (ghw) this.m;
                Throwable th = (Throwable) this.l;
                nm6 nm6Var4 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    String str3 = ghw.w;
                    mdw e = ghwVar.e();
                    Long l = (Long) this.n;
                    e.getClass();
                    th.getClass();
                    f9h f9hVar = new f9h();
                    f9hVar.putAll(e.b(l));
                    f9hVar.putAll(mdw.a(th));
                    e.e(new nsw("YNISON_CHANNEL_ERROR", f9hVar.b()));
                    if (!ghwVar.l.get() || xdrVar.getValue() == null) {
                        xdrVar.m(null, new tgw(th, "update_full_state failed"));
                        return Unit.a;
                    }
                    ssg.a(6, ghw.w, hrg.s("start retry loop cause of Ynison failure: ", th.getClass().getSimpleName(), "(", th.getMessage(), ")"), null);
                    ccw ccwVar = (ccw) this.p;
                    this.l = null;
                    this.k = 1;
                    if (ghw.a(ghwVar, th, ccwVar, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                com.yandex.plus.bdui.shared.b bVar = (com.yandex.plus.bdui.shared.b) this.l;
                t tVar = (t) this.m;
                Object obj4 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    s sVar = ((b) this.n).g;
                    Object obj5 = this.o;
                    Object obj6 = this.p;
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    String str4 = (String) sVar.f;
                    com.yandex.plus.log.api.b bVar2 = (com.yandex.plus.log.api.b) sVar.a;
                    Object invoke2 = ((pyc) sVar.c).invoke(obj5, obj6, bVar);
                    Object obj7 = sVar.g;
                    if (obj7 == null || ((Boolean) ((ezc) sVar.d).invoke(obj7, invoke2)).booleanValue()) {
                        a aVar = a.c;
                        if (bVar2.b(aVar)) {
                            bVar2.c(aVar, str4, "Apply update = " + obj5);
                        }
                        sVar.g = invoke2;
                        invoke = ((ezc) sVar.e).invoke(invoke2, tVar, this);
                        if (invoke != obj4) {
                            invoke = Unit.a;
                        }
                    } else {
                        a aVar2 = a.c;
                        if (bVar2.b(aVar2)) {
                            bVar2.c(aVar2, str4, "Update is the same - skipping");
                        }
                        invoke = Unit.a;
                    }
                    if (invoke == obj4) {
                        return obj4;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i04(b bVar, Object obj, Object obj2, Continuation continuation) {
        super(3, continuation);
        this.j = 4;
        this.n = bVar;
        this.o = obj;
        this.p = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i04(Continuation continuation, Object obj, Object obj2, Object obj3, int i) {
        super(3, continuation);
        this.j = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
    }
}
