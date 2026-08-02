package ru.yandex.taxi.bugreport.router;

import defpackage.ab60;
import defpackage.io60;
import defpackage.jl40;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pne;
import defpackage.qu;
import defpackage.tse;
import defpackage.tvb;
import defpackage.u5o;
import defpackage.ua41;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.am.AuthType;
import ru.yandex.taxi.am.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.bugreport.router.BugReportRouterImpl$openBugReport$2", f = "BugReportRouterImpl.kt", l = {83, HProv.PP_CIPHEROID}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BugReportRouterImpl$openBugReport$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $link;
    final /* synthetic */ tvb $router;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BugReportRouterImpl$openBugReport$2(b bVar, String str, tvb tvbVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$link = str;
        this.$router = tvbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BugReportRouterImpl$openBugReport$2(this.this$0, this.$link, this.$router, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BugReportRouterImpl$openBugReport$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0032, code lost:
    
        if (r8 == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            o oVar = this.this$0.G;
            String str = this.$link;
            AuthType authType = AuthType.COOKIES;
            this.label = 1;
            obj = oVar.b(str, authType, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        ua41 ua41Var = (ua41) obj;
        if (jl40.l(ua41Var, ab60.a) || (ua41Var instanceof u5o) || (ua41Var instanceof io60)) {
            jst.e.k(new IllegalStateException(), ua41Var.toString());
            this.this$0.r(new qu(9));
            return zy11Var;
        }
        if (!(ua41Var instanceof pne)) {
            w511.b();
            return null;
        }
        String str2 = ((pne) ua41Var).a;
        b bVar = this.this$0;
        tvb tvbVar = this.$router;
        this.L$0 = null;
        this.label = 2;
        return b.P(bVar, str2, tvbVar, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
