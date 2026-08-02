package ru.yandex.taxi.summary.solid.preview_card.interactor;

import com.yandex.go.zone.dto.objects.SummaryCardPromo;
import defpackage.g050;
import defpackage.g6u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.preview_card.interactor.SummaryCardPromoInteractor$onSelectedTariffChanged$1", f = "SummaryCardPromoInteractor.kt", l = {65, 30, 32}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryCardPromoInteractor$onSelectedTariffChanged$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $tariffName;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryCardPromoInteractor$onSelectedTariffChanged$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$tariffName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryCardPromoInteractor$onSelectedTariffChanged$1(this.this$0, this.$tariffName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryCardPromoInteractor$onSelectedTariffChanged$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(1:(3:(1:(6:6|7|8|9|10|11)(2:17|18))(8:19|20|21|22|23|(6:25|26|27|28|(2:31|9)|30)|10|11)|15|16)(1:41))(1:47)|42|43|(2:45|30)(5:46|23|(0)|10|11)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0065, code lost:
    
        if (r1.a(r9) == r0) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #3 {all -> 0x009e, blocks: (B:23:0x007a, B:25:0x007e, B:28:0x0087, B:43:0x0068), top: B:42:0x0068 }] */
    /* JADX WARN: Type inference failed for: r4v8, types: [g050] */
    /* JADX WARN: Type inference failed for: r6v4, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v5, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        kotlinx.coroutines.sync.a aVar2;
        String str;
        a aVar3;
        Throwable th;
        ?? r9;
        SummaryCardPromo summaryCardPromo;
        kotlinx.coroutines.sync.a aVar4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            aVar = this.this$0;
            aVar2 = aVar.g;
            str = this.$tariffName;
            this.L$0 = aVar2;
            this.L$1 = aVar;
            this.L$2 = str;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    String str2 = (String) this.L$2;
                    aVar3 = (a) this.L$1;
                    ?? r4 = (g050) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        str = str2;
                        aVar2 = r4;
                        summaryCardPromo = (SummaryCardPromo) obj;
                        if (summaryCardPromo != null) {
                            try {
                                aVar3.e.getClass();
                                sjh sjhVar = uyj.a;
                                g6u g6uVar = o400.a;
                                SummaryCardPromoInteractor$onSelectedTariffChanged$1$1$1 summaryCardPromoInteractor$onSelectedTariffChanged$1$1$1 = new SummaryCardPromoInteractor$onSelectedTariffChanged$1$1$1(aVar3, str, summaryCardPromo, null);
                                this.L$0 = aVar2;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 3;
                                if (tje.k0(g6uVar, summaryCardPromoInteractor$onSelectedTariffChanged$1$1$1, this) != coroutineSingletons) {
                                    aVar4 = aVar2;
                                    aVar2 = aVar4;
                                }
                                return coroutineSingletons;
                            } catch (Throwable th2) {
                                th = th2;
                                r9 = aVar2;
                                r9.d(null);
                                throw th;
                            }
                        }
                        aVar2.d(null);
                        return zy11.a;
                    } catch (Throwable th3) {
                        th = th3;
                        r9 = r4;
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r9 = (g050) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        aVar4 = r9;
                        aVar2 = aVar4;
                        aVar2.d(null);
                        return zy11.a;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                r9.d(null);
                throw th;
            }
            String str3 = (String) this.L$2;
            a aVar5 = (a) this.L$1;
            ?? r6 = (g050) this.L$0;
            kotlin.b.b(obj);
            str = str3;
            aVar2 = r6;
            aVar = aVar5;
        }
        this.L$0 = aVar2;
        this.L$1 = aVar;
        this.L$2 = str;
        this.label = 2;
        Object a = a.a(aVar, str, this);
        if (a == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar3 = aVar;
        obj = a;
        summaryCardPromo = (SummaryCardPromo) obj;
        if (summaryCardPromo != null) {
        }
        aVar2.d(null);
        return zy11.a;
    }
}
