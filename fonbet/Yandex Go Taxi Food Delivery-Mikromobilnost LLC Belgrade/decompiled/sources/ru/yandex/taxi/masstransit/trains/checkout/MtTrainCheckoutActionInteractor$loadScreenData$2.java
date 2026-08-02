package ru.yandex.taxi.masstransit.trains.checkout;

import defpackage.ab40;
import defpackage.db40;
import defpackage.fa40;
import defpackage.fd40;
import defpackage.fef;
import defpackage.fmt;
import defpackage.ga40;
import defpackage.gb40;
import defpackage.gwk0;
import defpackage.ib40;
import defpackage.ief;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.sa40;
import defpackage.sib1;
import defpackage.tse;
import defpackage.vb40;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.checkout.MtTrainCheckoutActionInteractor$loadScreenData$2", f = "MtTrainCheckoutActionInteractor.kt", l = {215, 223, MSException.ERROR_MORE_DATA, 241}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtTrainCheckoutActionInteractor$loadScreenData$2 extends SuspendLambda implements wls {
    final /* synthetic */ gb40 $mtTrainCheckoutPayload;
    final /* synthetic */ ab40 $navigator;
    final /* synthetic */ db40 $orderInfo;
    final /* synthetic */ tse $scope;
    final /* synthetic */ String $token;
    final /* synthetic */ r $uiStateRepository;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTrainCheckoutActionInteractor$loadScreenData$2(a aVar, String str, db40 db40Var, gb40 gb40Var, r rVar, tse tseVar, ab40 ab40Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$token = str;
        this.$orderInfo = db40Var;
        this.$mtTrainCheckoutPayload = gb40Var;
        this.$uiStateRepository = rVar;
        this.$scope = tseVar;
        this.$navigator = ab40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTrainCheckoutActionInteractor$loadScreenData$2(this.this$0, this.$token, this.$orderInfo, this.$mtTrainCheckoutPayload, this.$uiStateRepository, this.$scope, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTrainCheckoutActionInteractor$loadScreenData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0194, code lost:
    
        if (r15.b(r1, r2, r3, r4, r5, r25) != r7) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014c A[Catch: Exception -> 0x0024, CancellationException -> 0x01d4, TryCatch #2 {CancellationException -> 0x01d4, Exception -> 0x0024, blocks: (B:9:0x001f, B:19:0x0049, B:21:0x0176, B:25:0x0076, B:27:0x0126, B:29:0x014c, B:30:0x0153, B:36:0x0093, B:38:0x00ed, B:40:0x00fe, B:41:0x0104, B:47:0x00ae, B:49:0x00b2, B:50:0x00d4), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0152  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        a aVar;
        r rVar;
        tse tseVar;
        ab40 ab40Var;
        j jVar;
        db40 db40Var;
        Object a;
        tse tseVar2;
        gb40 gb40Var;
        r rVar2;
        fmt fmtVar;
        sa40 sa40Var;
        Object g;
        a aVar2;
        sa40 sa40Var2;
        gb40 gb40Var2;
        vb40 vb40Var;
        ib40 ib40Var;
        db40 db40Var2;
        fef h;
        tse tseVar3;
        r rVar3;
        r rVar4;
        sa40 sa40Var3;
        ab40 ab40Var2;
        gb40 gb40Var3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        if (i == 0) {
            kotlin.b.b(obj);
            aVar = this.this$0;
            String str = this.$token;
            db40 db40Var3 = this.$orderInfo;
            gb40 gb40Var4 = this.$mtTrainCheckoutPayload;
            r rVar5 = this.$uiStateRepository;
            tse tseVar4 = this.$scope;
            ab40 ab40Var3 = this.$navigator;
            j jVar2 = aVar.d;
            if (db40Var3 != null) {
                jVar = jVar2;
                rVar = rVar5;
                tseVar = tseVar4;
                ab40Var = ab40Var3;
                db40Var = db40.a(db40Var3, false, null, 0, 0, 15);
            } else {
                rVar = rVar5;
                tseVar = tseVar4;
                ab40Var = ab40Var3;
                jVar = jVar2;
                db40Var = null;
            }
            Map map = gb40Var4.e;
            this.L$0 = aVar;
            this.L$1 = gb40Var4;
            this.L$2 = rVar;
            this.L$3 = tseVar;
            this.L$4 = ab40Var;
            this.label = 1;
            a = jVar.a(str, db40Var, map, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            tseVar2 = tseVar;
            gb40Var = gb40Var4;
            rVar2 = rVar;
        } else if (i == 1) {
            ab40 ab40Var4 = (ab40) this.L$4;
            tse tseVar5 = (tse) this.L$3;
            r rVar6 = (r) this.L$2;
            gb40Var = (gb40) this.L$1;
            a aVar3 = (a) this.L$0;
            kotlin.b.b(obj);
            a = obj;
            ab40Var = ab40Var4;
            rVar2 = rVar6;
            aVar = aVar3;
            tseVar2 = tseVar5;
        } else if (i == 2) {
            aVar = (a) this.L$8;
            sa40Var = (sa40) this.L$7;
            sa40 sa40Var4 = (sa40) this.L$6;
            fmtVar = (fmt) this.L$5;
            ab40 ab40Var5 = (ab40) this.L$4;
            tseVar2 = (tse) this.L$3;
            rVar2 = (r) this.L$2;
            gb40Var2 = (gb40) this.L$1;
            aVar2 = (a) this.L$0;
            kotlin.b.b(obj);
            g = obj;
            sa40Var2 = sa40Var4;
            ab40Var = ab40Var5;
            a.a(aVar, sa40Var, g.toString(), fmtVar.e.a("X-YaMasstransitRequestId"));
            aVar2.a.b(sa40Var2.b, true, sa40Var2.e);
            vb40Var = sa40Var2.c;
            ib40Var = new ib40(0);
            db40Var2 = sa40Var2.b;
            ief iefVar = db40Var2.e;
            h = iefVar == null ? gwk0.h(iefVar) : null;
            this.L$0 = aVar2;
            this.L$1 = gb40Var2;
            this.L$2 = rVar2;
            this.L$3 = tseVar2;
            this.L$4 = ab40Var;
            this.L$5 = null;
            this.L$6 = sa40Var2;
            this.L$7 = null;
            this.L$8 = null;
            this.label = 3;
            tseVar3 = tseVar2;
            rVar3 = rVar2;
            if (rVar3.b(vb40Var, ib40Var, db40Var2, h, tseVar3, this) != coroutineSingletons) {
                return coroutineSingletons;
            }
            rVar4 = rVar3;
            sa40Var3 = sa40Var2;
            ab40Var2 = ab40Var;
            gb40Var3 = gb40Var2;
            fd40 fd40Var = new fd40(sa40Var3.a);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.label = 4;
        } else {
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                failure = zy11Var;
                r rVar7 = this.$uiStateRepository;
                a aVar4 = this.this$0;
                Throwable a2 = Result.a(failure);
                if (a2 != null) {
                    rVar7.a();
                    ga40 ga40Var = aVar4.e;
                    ga40Var.a = fa40.a(ga40Var.a, null, null, null, null, null, 0, null, null, null, null, null, null, sib1.b(s8o.O(a2)), null, 12287);
                }
                return zy11Var;
            }
            sa40Var3 = (sa40) this.L$6;
            ab40 ab40Var6 = (ab40) this.L$4;
            tse tseVar6 = (tse) this.L$3;
            r rVar8 = (r) this.L$2;
            gb40Var3 = (gb40) this.L$1;
            a aVar5 = (a) this.L$0;
            kotlin.b.b(obj);
            aVar2 = aVar5;
            tseVar3 = tseVar6;
            rVar4 = rVar8;
            ab40Var2 = ab40Var6;
            fd40 fd40Var2 = new fd40(sa40Var3.a);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.label = 4;
        }
        fmtVar = (fmt) a;
        sa40Var = (sa40) fmtVar.a;
        vb40.k kVar = sa40Var.c.e;
        ief iefVar2 = sa40Var.b.e;
        fef h2 = iefVar2 != null ? gwk0.h(iefVar2) : null;
        this.L$0 = aVar;
        this.L$1 = gb40Var;
        this.L$2 = rVar2;
        this.L$3 = tseVar2;
        this.L$4 = ab40Var;
        this.L$5 = fmtVar;
        this.L$6 = sa40Var;
        this.L$7 = sa40Var;
        this.L$8 = aVar;
        this.label = 2;
        g = rVar2.a.g(kVar, h2, this);
        if (g == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar2 = aVar;
        sa40Var2 = sa40Var;
        gb40Var2 = gb40Var;
        a.a(aVar, sa40Var, g.toString(), fmtVar.e.a("X-YaMasstransitRequestId"));
        aVar2.a.b(sa40Var2.b, true, sa40Var2.e);
        vb40Var = sa40Var2.c;
        ib40Var = new ib40(0);
        db40Var2 = sa40Var2.b;
        ief iefVar3 = db40Var2.e;
        if (iefVar3 == null) {
        }
        this.L$0 = aVar2;
        this.L$1 = gb40Var2;
        this.L$2 = rVar2;
        this.L$3 = tseVar2;
        this.L$4 = ab40Var;
        this.L$5 = null;
        this.L$6 = sa40Var2;
        this.L$7 = null;
        this.L$8 = null;
        this.label = 3;
        tseVar3 = tseVar2;
        rVar3 = rVar2;
        if (rVar3.b(vb40Var, ib40Var, db40Var2, h, tseVar3, this) != coroutineSingletons) {
        }
    }
}
