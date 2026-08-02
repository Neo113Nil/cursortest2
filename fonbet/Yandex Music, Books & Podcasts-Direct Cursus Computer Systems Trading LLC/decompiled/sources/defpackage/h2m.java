package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class h2m extends aur implements Function1 {
    public int j;
    public final /* synthetic */ ueo k;
    public final /* synthetic */ List l;
    public final /* synthetic */ long m;
    public q1m n;
    public Iterator o;
    public int p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2m(long j, ueo ueoVar, List list, Continuation continuation) {
        super(1, continuation);
        this.k = ueoVar;
        this.l = list;
        this.m = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new h2m(this.m, this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((h2m) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        q1m K;
        int i;
        Iterator it;
        int i2;
        Object obj2 = nm6.a;
        int i3 = this.j;
        if (i3 == 0) {
            qgg.h0(obj);
            K = ((MainDatabase) this.k).K();
            i = 0;
            it = this.l.iterator();
            i2 = 0;
        } else {
            if (i3 != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.q;
            i2 = this.p;
            it = this.o;
            K = this.n;
            qgg.h0(obj);
        }
        while (it.hasNext()) {
            vat vatVar = (vat) it.next();
            rr5 rr5Var = (rr5) vatVar.a;
            int intValue = ((Number) vatVar.b).intValue();
            int intValue2 = ((Number) vatVar.c).intValue();
            String str = rr5Var.a;
            String str2 = rr5Var.b;
            this.n = K;
            this.o = it;
            this.p = i2;
            this.q = i;
            this.j = 1;
            Object G = up6.G(K.a, false, true, new o1m(intValue2, this.m, str, str2, intValue, 1), this);
            if (G != nm6.a) {
                G = Unit.a;
            }
            if (G == obj2) {
                return obj2;
            }
        }
        return Unit.a;
    }
}
