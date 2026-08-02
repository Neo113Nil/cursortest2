package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class ra2 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ za2 k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ra2(za2 za2Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = za2Var;
        this.l = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ra2(this.k, this.l, continuation, 0);
            default:
                return new ra2(this.k, this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((ra2) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        String str = this.l;
        za2 za2Var = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                c62 c62Var = za2Var.a;
                str.getClass();
                List list = (List) c62Var.c.get(str);
                if (list == null) {
                    return null;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(za2Var.e().f((yit) it.next(), null, null));
                }
                return arrayList;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                c62 c62Var2 = za2Var.a;
                str.getClass();
                List list3 = (List) c62Var2.d.get(str);
                if (list3 == null) {
                    return c5b.a;
                }
                List<c5j> list4 = list3;
                ArrayList arrayList2 = new ArrayList(v75.o(list4, 10));
                for (c5j c5jVar : list4) {
                    m82 e = za2Var.e();
                    e.getClass();
                    c5jVar.getClass();
                    arrayList2.add(e.l(c5jVar.a, null, null));
                }
                return arrayList2;
        }
    }
}
