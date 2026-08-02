package defpackage;

import com.yandex.plus.home.feature.webviews.internal.webview.e;
import com.yandex.plus.pay.api.analytics.c;
import com.yandex.plus.pay.api.feature.offers.b;
import com.yandex.plus.pay.internal.feature.offers.x;
import com.yandex.plus.pay.internal.g;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class pkj extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ qkj l;
    public final /* synthetic */ rkj m;
    public final /* synthetic */ LinkedHashMap n;
    public final /* synthetic */ String o;
    public final /* synthetic */ Set p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pkj(qkj qkjVar, rkj rkjVar, LinkedHashMap linkedHashMap, String str, Set set, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = qkjVar;
        this.m = rkjVar;
        this.n = linkedHashMap;
        this.o = str;
        this.p = set;
        this.q = str2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new pkj(this.l, this.m, this.n, this.o, this.p, this.q, continuation, 0);
            default:
                return new pkj(this.l, this.m, this.n, this.o, this.p, this.q, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((pkj) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                b bVar = (b) ((g) this.l.a).e.getValue();
                rkj rkjVar = this.m;
                String str = rkjVar.a;
                Set set = rkjVar.b;
                com.yandex.plus.pay.api.analytics.b bVar2 = new com.yandex.plus.pay.api.analytics.b();
                bVar2.a = this.o;
                bVar2.c = this.p;
                bVar2.a(this.q);
                c cVar = new c(bVar2.a, null, bVar2.b, null, bVar2.c, bVar2.d);
                this.k = 1;
                Object a = ((x) bVar).a(str, set, this.n, cVar, true, new e(12), this);
                return a == nm6Var ? nm6Var : a;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                long j = qkj.d;
                pkj pkjVar = new pkj(this.l, this.m, this.n, this.o, this.p, this.q, null, 0);
                this.k = 1;
                Object K = tyf.K(j, pkjVar, this);
                return K == nm6Var2 ? nm6Var2 : K;
        }
    }
}
