package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class nus extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ueo l;
    public final /* synthetic */ List m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nus(ueo ueoVar, Continuation continuation, List list, int i) {
        super(1, continuation);
        this.j = i;
        this.l = ueoVar;
        this.m = list;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new nus(this.l, continuation, this.m, 0);
            default:
                return new nus(this.l, continuation, this.m, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((nus) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object G;
        int i = this.j;
        List list = this.m;
        ueo ueoVar = this.l;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
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
                um4 um4Var = new um4(pgp.a);
                um4Var.i(hrg.q("original_id IN (", CollectionsKt.X(list, StringUtils.COMMA, null, null, san.g, 30), ")"), xz0.X(new Object[0]));
                um4Var.g("track_type", gys.MyMusicWithKids.a);
                um4Var.c("track_for_kids", false);
                um4Var.i("(available='OK' OR for_premium=1 OR for_options!='')", xz0.X(new Object[0]));
                String e = hlr.e("\n                |SELECT\n                |   COUNT(original_id)\n                |FROM track\n                |WHERE\n                |   " + um4Var.l() + "\n            ");
                hjn P = ((MainDatabase) ueoVar).P();
                atn atnVar = new atn(e, um4Var.j());
                this.k = 1;
                Object a = P.a(atnVar, this);
                return a == nm6Var ? nm6Var : a;
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    um4 um4Var2 = new um4(pgp.a);
                    um4Var2.i(hrg.q("original_id IN (", CollectionsKt.X(list, StringUtils.COMMA, null, null, san.h, 30), ")"), xz0.X(new Object[0]));
                    um4Var2.i("(available='OK' OR for_premium=1 OR for_options!='')", xz0.X(new Object[0]));
                    String e2 = hlr.e("\n                |SELECT *\n                |FROM track\n                |WHERE\n                |   " + um4Var2.l() + "\n            ");
                    v3t T = ((MainDatabase) ueoVar).T();
                    atn atnVar2 = new atn(e2, um4Var2.j());
                    this.k = 1;
                    T.getClass();
                    TreeMap treeMap = afo.h;
                    j6e a2 = wyf.x(atnVar2).a();
                    G = up6.G(T.a, true, false, new g20((String) a2.a, a2, T, 12), this);
                    if (G == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    G = obj;
                }
                Iterable iterable = (Iterable) G;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((sus) it.next()).a);
                }
                return arrayList;
        }
    }
}
