package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ulg extends aur implements Function1 {
    public final /* synthetic */ int j = 1;
    public int k;
    public final /* synthetic */ String l;
    public int m;
    public final /* synthetic */ ueo n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulg(MainDatabase mainDatabase, Continuation continuation, r4m r4mVar, nvl nvlVar, uys uysVar, String str) {
        super(1, continuation);
        this.n = mainDatabase;
        this.o = r4mVar;
        this.p = nvlVar;
        this.q = uysVar;
        this.l = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ulg(this.n, continuation, (xlg) this.o, this.l, (List) this.p);
            default:
                return new ulg((MainDatabase) this.n, continuation, (r4m) this.o, (nvl) this.p, (uys) this.q, this.l);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((ulg) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i;
        Object b;
        List list;
        int i2;
        Object b2;
        switch (this.j) {
            case 0:
                xlg xlgVar = (xlg) this.o;
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                String str = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    i2m i2mVar = xlgVar.b;
                    List list2 = (List) this.p;
                    i = 0;
                    this.m = 0;
                    this.k = 1;
                    b = i2mVar.b(this, str, list2);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list = (List) this.q;
                        qgg.h0(obj);
                        return new Integer(list.size());
                    }
                    int i4 = this.m;
                    qgg.h0(obj);
                    i = i4;
                    b = obj;
                }
                List list3 = (List) b;
                uys uysVar = xlgVar.c;
                List<i1m> list4 = list3;
                ArrayList arrayList = new ArrayList(v75.o(list4, 10));
                for (i1m i1mVar : list4) {
                    long j = i1mVar.b;
                    int i5 = i1mVar.e;
                    rr5 A = q6k.A(i1mVar.c, i1mVar.d);
                    Date date = i1mVar.f;
                    r5j r5jVar = new r5j(A, kys.DELETE, j, i5, date != null ? new Long(date.getTime()) : null);
                    StringBuilder l = f1d.l(i5, "delete ", A.d(), " at ", " from playlist_id ");
                    l.append(j);
                    ssg.a(3, null, l.toString(), null);
                    arrayList.add(r5jVar);
                }
                this.q = list3;
                this.m = i;
                this.k = 2;
                if (uysVar.b(this, str, arrayList) == nm6Var) {
                    return nm6Var;
                }
                list = list3;
                return new Integer(list.size());
            default:
                nm6 nm6Var2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    r4m r4mVar = (r4m) this.o;
                    nvl nvlVar = (nvl) this.p;
                    String str2 = nvlVar.a;
                    String str3 = nvlVar.b;
                    i2 = 0;
                    this.m = 0;
                    this.k = 1;
                    b2 = r4mVar.b(str2, str3, this);
                    if (b2 == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i7 = this.m;
                    qgg.h0(obj);
                    i2 = i7;
                    b2 = obj;
                }
                Long l2 = (Long) b2;
                if (l2 == null) {
                    return c5b.a;
                }
                uys uysVar2 = (uys) this.q;
                List c = t75.c(l2);
                this.m = i2;
                this.k = 2;
                Object e = uysVar2.e(this, this.l, c);
                return e == nm6Var2 ? nm6Var2 : e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulg(ueo ueoVar, Continuation continuation, xlg xlgVar, String str, List list) {
        super(1, continuation);
        this.n = ueoVar;
        this.o = xlgVar;
        this.l = str;
        this.p = list;
    }
}
