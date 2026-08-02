package ru.yandex.taxi;

import defpackage.dvx;
import defpackage.fva0;
import defpackage.h1p;
import defpackage.ien;
import defpackage.jdj;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "", "Lien;", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.SuperappAuthorizerImpl$authorizeWithCookies$2", f = "SuperappAuthorizerImpl.kt", l = {120, HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SuperappAuthorizerImpl$authorizeWithCookies$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $forceUpdateCookie;
    final /* synthetic */ dvx $info;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappAuthorizerImpl$authorizeWithCookies$2(n nVar, boolean z, dvx dvxVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$forceUpdateCookie = z;
        this.$info = dvxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperappAuthorizerImpl$authorizeWithCookies$2 superappAuthorizerImpl$authorizeWithCookies$2 = new SuperappAuthorizerImpl$authorizeWithCookies$2(this.this$0, this.$forceUpdateCookie, this.$info, continuation);
        superappAuthorizerImpl$authorizeWithCookies$2.L$0 = obj;
        return superappAuthorizerImpl$authorizeWithCookies$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappAuthorizerImpl$authorizeWithCookies$2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0096, code lost:
    
        if (r15 == r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        ien ienVar;
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            str = (String) pair.getFirst();
            ien ienVar2 = (ien) pair.getSecond();
            jdj jdjVar = this.this$0.c;
            fva0.f((fva0) jdjVar.c, oyr.p("Eats.", ((h1p) jdjVar.w).getValue(), ".Authorization"), null, 0L, 6);
            n nVar = this.this$0;
            boolean z = this.$forceUpdateCookie;
            this.L$0 = null;
            this.L$1 = str;
            this.L$2 = ienVar2;
            this.label = 1;
            Object a = n.a(nVar, str, z, this);
            if (a != coroutineSingletons) {
                ienVar = ienVar2;
                obj = a;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ienVar = (ien) this.L$2;
            kotlin.b.b(obj);
            str = (String) obj;
            this.this$0.c.i("redirect_cookies");
            jst.e.getClass();
            n nVar2 = this.this$0;
            dvx dvxVar = this.$info;
            nVar2.getClass();
            ienVar.loadUrl(str, n.e(dvxVar));
            return zy11.a;
        }
        ienVar = (ien) this.L$2;
        str = (String) this.L$1;
        kotlin.b.b(obj);
        boolean booleanValue = ((Boolean) obj).booleanValue();
        n nVar3 = this.this$0;
        if (booleanValue) {
            nVar3.c.i("injected_cookies");
            jst.e.getClass();
            n nVar22 = this.this$0;
            dvx dvxVar2 = this.$info;
            nVar22.getClass();
            ienVar.loadUrl(str, n.e(dvxVar2));
            return zy11.a;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = ienVar;
        this.Z$0 = booleanValue;
        this.label = 2;
        obj = n.b(nVar3, str, this);
    }
}
