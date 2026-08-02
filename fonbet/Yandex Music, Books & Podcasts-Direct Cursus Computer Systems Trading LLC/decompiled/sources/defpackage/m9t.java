package defpackage;

import android.view.ViewGroup;
import com.google.gson.Gson;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsViewModel$init$1$mapBody$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class m9t extends aur implements Function2 {
    public final /* synthetic */ String j;
    public final /* synthetic */ n9t k;
    public final /* synthetic */ hq0 l;
    public final /* synthetic */ ViewGroup m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ String p;
    public final /* synthetic */ ddl q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9t(String str, n9t n9tVar, hq0 hq0Var, ViewGroup viewGroup, boolean z, boolean z2, String str2, ddl ddlVar, Continuation continuation) {
        super(2, continuation);
        this.j = str;
        this.k = n9tVar;
        this.l = hq0Var;
        this.m = viewGroup;
        this.n = z;
        this.o = z2;
        this.p = str2;
        this.q = ddlVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new m9t(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m9t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        Object e = new Gson().e(this.j, new TransportCardsViewModel$init$1$mapBody$1().getType());
        e.getClass();
        return Unit.a;
    }
}
