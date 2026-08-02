package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class b82 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ h82 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b82(h82 h82Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = h82Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new b82(this.l, continuation, 0);
            case 1:
                return new b82(this.l, continuation, 1);
            case 2:
                return new b82(this.l, continuation, 2);
            case 3:
                return new b82(this.l, continuation, 3);
            case 4:
                return new b82(this.l, continuation, 4);
            case 5:
                return new b82(this.l, continuation, 5);
            default:
                return new b82(this.l, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((b82) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                h82 h82Var = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    i82 i82Var = h82Var.b;
                    this.k = 1;
                    obj = i82Var.b(null, this);
                    if (obj == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((m82) h82Var.e.getValue()).a((oq) it.next(), null, true));
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                h82 h82Var2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    i82 i82Var2 = h82Var2.b;
                    this.k = 1;
                    i82Var2.a().getClass();
                    obj = ((sb0) i82Var2.a.m.getValue()).a(null, this);
                    if (obj != nm6Var2) {
                        obj = (List) obj;
                    }
                    if (obj == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                List list2 = (List) obj;
                ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((m82) h82Var2.e.getValue()).b((c01) it2.next(), true));
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                h82 h82Var3 = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    i82 i82Var3 = h82Var3.b;
                    this.k = 1;
                    obj = i82Var3.c(null, this);
                    if (obj == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList3 = new ArrayList(v75.o(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((m82) h82Var3.e.getValue()).a((oq) it3.next(), null, true));
                }
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                h82 h82Var4 = this.l;
                if (i4 == 0) {
                    qgg.h0(obj);
                    i82 i82Var4 = h82Var4.b;
                    this.k = 1;
                    obj = i82Var4.b(null, this);
                    if (obj == nm6Var4) {
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                List list3 = (List) obj;
                ArrayList arrayList4 = new ArrayList(v75.o(list3, 10));
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((m82) h82Var4.e.getValue()).a((oq) it4.next(), null, true));
                }
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                h82 h82Var5 = this.l;
                if (i5 == 0) {
                    qgg.h0(obj);
                    i82 i82Var5 = h82Var5.b;
                    this.k = 1;
                    String a = i82Var5.a();
                    a.getClass();
                    obj = ((oga) i82Var5.a.h.getValue()).e(a, Boolean.TRUE, null, this);
                    if (obj == nm6Var5) {
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                List list4 = (List) obj;
                ArrayList arrayList5 = new ArrayList(v75.o(list4, 10));
                Iterator it5 = list4.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(((m82) h82Var5.e.getValue()).d((cvl) it5.next(), null, null, true));
                }
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i6 = this.k;
                h82 h82Var6 = this.l;
                if (i6 == 0) {
                    qgg.h0(obj);
                    i82 i82Var6 = h82Var6.b;
                    this.k = 1;
                    String a2 = i82Var6.a();
                    a2.getClass();
                    obj = ((oga) i82Var6.a.h.getValue()).e(a2, Boolean.FALSE, null, this);
                    if (obj != nm6Var6) {
                        obj = (List) obj;
                    }
                    if (obj == nm6Var6) {
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                List list5 = (List) obj;
                ArrayList arrayList6 = new ArrayList(v75.o(list5, 10));
                Iterator it6 = list5.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(((m82) h82Var6.e.getValue()).d((cvl) it6.next(), null, null, true));
                }
                break;
            default:
                nm6 nm6Var7 = nm6.a;
                int i7 = this.k;
                h82 h82Var7 = this.l;
                if (i7 == 0) {
                    qgg.h0(obj);
                    i82 i82Var7 = h82Var7.b;
                    this.k = 1;
                    obj = i82Var7.f(null, this);
                    if (obj == nm6Var7) {
                    }
                } else if (i7 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable iterable2 = (Iterable) obj;
                ArrayList arrayList7 = new ArrayList(v75.o(iterable2, 10));
                Iterator it7 = iterable2.iterator();
                while (it7.hasNext()) {
                    arrayList7.add(((m82) h82Var7.e.getValue()).a((oq) it7.next(), null, true));
                }
                break;
        }
        return null;
    }
}
