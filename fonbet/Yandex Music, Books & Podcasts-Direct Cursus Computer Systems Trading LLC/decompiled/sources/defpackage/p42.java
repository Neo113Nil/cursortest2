package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class p42 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ w42 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p42(w42 w42Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = w42Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new p42(this.l, continuation, 0);
            case 1:
                return new p42(this.l, continuation, 1);
            case 2:
                return new p42(this.l, continuation, 2);
            case 3:
                return new p42(this.l, continuation, 3);
            case 4:
                return new p42(this.l, continuation, 4);
            case 5:
                return new p42(this.l, continuation, 5);
            default:
                return new p42(this.l, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((p42) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                w42 w42Var = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    y42 y42Var = w42Var.b;
                    this.k = 1;
                    obj = y42Var.b(null, this);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((m82) w42Var.e.getValue()).a((oq) it.next(), null, false));
                }
                return arrayList;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                w42 w42Var2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    y42 y42Var2 = w42Var2.b;
                    this.k = 1;
                    y42Var2.a().getClass();
                    e15 e15Var = (e15) ((sb0) y42Var2.a.m.getValue()).b.getValue();
                    e15Var.getClass();
                    obj = x97.V(dm6.b, new e05(e15Var, (Integer) null, (Continuation) null), this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                List list2 = (List) obj;
                ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((m82) w42Var2.e.getValue()).b((c01) it2.next(), false));
                }
                return arrayList2;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                w42 w42Var3 = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    y42 y42Var3 = w42Var3.b;
                    this.k = 1;
                    obj = y42Var3.c(null, this);
                    if (obj == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList3 = new ArrayList(v75.o(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((m82) w42Var3.e.getValue()).a((oq) it3.next(), null, false));
                }
                return arrayList3;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                w42 w42Var4 = this.l;
                if (i4 == 0) {
                    qgg.h0(obj);
                    y42 y42Var4 = w42Var4.b;
                    this.k = 1;
                    obj = y42Var4.f(null, this);
                    if (obj == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                List list3 = (List) obj;
                ArrayList arrayList4 = new ArrayList(v75.o(list3, 10));
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((m82) w42Var4.e.getValue()).a((oq) it4.next(), null, false));
                }
                return arrayList4;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                w42 w42Var5 = this.l;
                if (i5 == 0) {
                    qgg.h0(obj);
                    y42 y42Var5 = w42Var5.b;
                    this.k = 1;
                    obj = y42Var5.g(null, this);
                    if (obj == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                List list4 = (List) obj;
                ArrayList arrayList5 = new ArrayList(v75.o(list4, 10));
                Iterator it5 = list4.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(((m82) w42Var5.e.getValue()).d((cvl) it5.next(), null, null, false));
                }
                return arrayList5;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i6 = this.k;
                w42 w42Var6 = this.l;
                if (i6 == 0) {
                    qgg.h0(obj);
                    y42 y42Var6 = w42Var6.b;
                    this.k = 1;
                    String a = y42Var6.a();
                    a.getClass();
                    obj = ((yc0) y42Var6.c.getValue()).a(a, this);
                    if (obj != nm6Var6) {
                        obj = (List) obj;
                    }
                    if (obj == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (((cvl) obj2).g > 0) {
                        arrayList6.add(obj2);
                    }
                }
                ArrayList arrayList7 = new ArrayList(v75.o(arrayList6, 10));
                Iterator it6 = arrayList6.iterator();
                while (it6.hasNext()) {
                    arrayList7.add(((m82) w42Var6.e.getValue()).d((cvl) it6.next(), null, null, false));
                }
                return arrayList7;
            default:
                nm6 nm6Var7 = nm6.a;
                int i7 = this.k;
                w42 w42Var7 = this.l;
                if (i7 == 0) {
                    qgg.h0(obj);
                    y42 y42Var7 = w42Var7.b;
                    this.k = 1;
                    obj = y42Var7.i(null, this);
                    if (obj == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Iterable iterable2 = (Iterable) obj;
                ArrayList arrayList8 = new ArrayList(v75.o(iterable2, 10));
                Iterator it7 = iterable2.iterator();
                while (it7.hasNext()) {
                    arrayList8.add(((m82) w42Var7.e.getValue()).a((oq) it7.next(), null, false));
                }
                return arrayList8;
        }
    }
}
