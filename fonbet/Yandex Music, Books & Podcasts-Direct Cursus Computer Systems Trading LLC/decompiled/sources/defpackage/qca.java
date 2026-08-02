package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class qca extends aur implements Function1 {
    public final /* synthetic */ int j = 1;
    public int k;
    public final /* synthetic */ ueo l;
    public final /* synthetic */ String m;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ List o;
    public final /* synthetic */ vhn p;
    public final /* synthetic */ Boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qca(ueo ueoVar, Continuation continuation, String str, Integer num, vhn vhnVar, Boolean bool, List list) {
        super(1, continuation);
        this.l = ueoVar;
        this.m = str;
        this.n = num;
        this.p = vhnVar;
        this.q = bool;
        this.o = list;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new qca(this.l, continuation, this.m, this.n, this.p, this.q, this.o);
            default:
                return new qca(this.l, continuation, this.m, this.n, this.o, this.p, this.q);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((qca) create(continuation)).invokeSuspend(Unit.a);
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
                cw w = ((MainDatabase) this.l).w();
                ysr ysrVar = new ysr("album_mview");
                um4 um4Var = new um4(pgp.a);
                vhn vhnVar = this.p;
                if (vhnVar != null) {
                    um4Var.h("album_type", vhnVar);
                }
                Boolean bool = this.q;
                if (bool != null) {
                    um4Var.c("album_for_kids", bool.booleanValue());
                }
                um4Var.i(hrg.q("original_id IN (", CollectionsKt.X(this.o, StringUtils.COMMA, null, null, h01.e, 30), ")"), xz0.X(new Object[0]));
                tt0.K(ysrVar, um4Var);
                String str = this.m;
                if (str.length() > 0) {
                    ysrVar.f = hlr.e("\n                        | (\n                        |   CASE original_id\n                        |      " + str + "\n                        |   END\n                        |) DESC\n                    ");
                }
                Integer num = this.n;
                if (num != null) {
                    ysrVar.b(String.valueOf(num.intValue()));
                }
                atn a = ysrVar.a();
                this.k = 1;
                Object b = w.b(a, this);
                return b == nm6Var ? nm6Var : b;
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
                uxs Q = ((MainDatabase) this.l).Q();
                ysr ysrVar2 = new ysr("track_mview");
                um4 um4Var2 = new um4(pgp.a);
                um4Var2.i(hrg.q("original_id IN (", CollectionsKt.X(this.o, StringUtils.COMMA, null, null, h01.g, 30), ")"), xz0.X(new Object[0]));
                vhn vhnVar2 = this.p;
                if (vhnVar2 != null) {
                    um4Var2.h("track_type", vhnVar2);
                }
                Boolean bool2 = this.q;
                if (bool2 != null) {
                    um4Var2.c("track_for_kids", bool2.booleanValue());
                }
                tt0.K(ysrVar2, um4Var2);
                String str2 = this.m;
                if (str2.length() > 0) {
                    ysrVar2.f = hlr.e("\n                        | (\n                        |   CASE original_id\n                        |      " + str2 + "\n                        |   END\n                        |) DESC\n                    ");
                }
                Integer num2 = this.n;
                if (num2 != null) {
                    ysrVar2.b(String.valueOf(num2.intValue()));
                }
                atn a2 = ysrVar2.a();
                this.k = 1;
                Object b2 = Q.b(a2, this);
                return b2 == nm6Var2 ? nm6Var2 : b2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qca(ueo ueoVar, Continuation continuation, String str, Integer num, List list, vhn vhnVar, Boolean bool) {
        super(1, continuation);
        this.l = ueoVar;
        this.m = str;
        this.n = num;
        this.o = list;
        this.p = vhnVar;
        this.q = bool;
    }
}
