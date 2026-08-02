package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class mga extends aur implements Function1 {
    public int j;
    public final /* synthetic */ ueo k;
    public final /* synthetic */ String l;
    public final /* synthetic */ Integer m;
    public final /* synthetic */ Boolean n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ List q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mga(ueo ueoVar, Continuation continuation, String str, Integer num, Boolean bool, String str2, String str3, List list) {
        super(1, continuation);
        this.k = ueoVar;
        this.l = str;
        this.m = num;
        this.n = bool;
        this.o = str2;
        this.p = str3;
        this.q = list;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new mga(this.k, continuation, this.l, this.m, this.n, this.o, this.p, this.q);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((mga) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i != 0) {
            if (i == 1) {
                qgg.h0(obj);
                return obj;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        swl J = ((MainDatabase) this.k).J();
        ysr ysrVar = new ysr("playlist_mview");
        um4 um4Var = new um4(pgp.a);
        Boolean bool = this.n;
        if (bool != null) {
            um4Var.c("playlist_for_kids", bool.booleanValue());
        }
        String str = this.o;
        if (str != null) {
            um4Var.i("uid = ?", xz0.X(new Object[]{str}));
        }
        String str2 = this.p;
        if (str2 != null) {
            um4Var.i("uid <> ?", xz0.X(new Object[]{str2}));
        }
        List h = u75.h(xxr.b, yxr.b);
        ArrayList arrayList = new ArrayList(v75.o(h, 10));
        Iterator it = h.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((byr) it.next()).a));
        }
        um4Var.g("sync", arrayList);
        um4Var.i(hrg.q("(uid || ':' || original_id) IN (", CollectionsKt.X(this.q, StringUtils.COMMA, null, null, h01.f, 30), ")"), xz0.X(new Object[0]));
        tt0.K(ysrVar, um4Var);
        String str3 = this.l;
        if (str3.length() > 0) {
            ysrVar.f = hlr.e("\n                        | (\n                        |   CASE (uid || ':' || original_id)\n                        |      " + str3 + "\n                        |   END\n                        |) DESC\n                    ");
        }
        Integer num = this.m;
        if (num != null) {
            ysrVar.b(String.valueOf(num.intValue()));
        }
        atn a = ysrVar.a();
        this.j = 1;
        Object a2 = J.a(a, this);
        return a2 == nm6Var ? nm6Var : a2;
    }
}
