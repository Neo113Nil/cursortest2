package ru.yandex.taxi.masstransit.mapper;

import defpackage.fj40;
import defpackage.jm30;
import defpackage.l540;
import defpackage.lj40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r440;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "<unused var>", "Lfj40;", "section", "", "Ltm30;", "<anonymous>", "(ILfj40;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.mapper.MtRoutesOverlayUiStateMapper$toOverlaySections$2", f = "MtRoutesOverlayUiStateMapper.kt", l = {BuildConfig.API_LEVEL, HProv.PP_NK_SYNC, HProv.PP_INFO}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtRoutesOverlayUiStateMapper$toOverlaySections$2 extends SuspendLambda implements zls {
    final /* synthetic */ Integer $firstTransportId;
    final /* synthetic */ Integer $lastTransportId;
    int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtRoutesOverlayUiStateMapper$toOverlaySections$2(Integer num, Integer num2, e eVar, Continuation continuation) {
        super(3, continuation);
        this.$firstTransportId = num;
        this.$lastTransportId = num2;
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        MtRoutesOverlayUiStateMapper$toOverlaySections$2 mtRoutesOverlayUiStateMapper$toOverlaySections$2 = new MtRoutesOverlayUiStateMapper$toOverlaySections$2(this.$firstTransportId, this.$lastTransportId, this.this$0, (Continuation) obj3);
        mtRoutesOverlayUiStateMapper$toOverlaySections$2.L$0 = (fj40) obj2;
        return mtRoutesOverlayUiStateMapper$toOverlaySections$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fj40 fj40Var = (fj40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return (List) obj;
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return (List) obj;
            }
            if (i == 3) {
                kotlin.b.b(obj);
                return (List) obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        int b = fj40Var.b();
        Integer num = this.$firstTransportId;
        ?? r7 = 0;
        r7 = 0;
        ?? r10 = (num != null && b == num.intValue()) ? 1 : 0;
        int b2 = fj40Var.b();
        Integer num2 = this.$lastTransportId;
        if (num2 != null && b2 == num2.intValue()) {
            r7 = 1;
        }
        if (fj40Var instanceof jm30) {
            this.L$0 = null;
            this.I$0 = r10;
            this.I$1 = r7;
            this.label = 1;
            obj = e.a(this.this$0, (jm30) fj40Var, r10, r7, this);
        } else if (fj40Var instanceof r440) {
            this.L$0 = null;
            this.I$0 = r10;
            this.I$1 = r7;
            this.label = 2;
            obj = e.b(this.this$0, (r440) fj40Var, r10, r7, this);
        } else {
            if (!(fj40Var instanceof lj40)) {
                if (fj40Var instanceof l540) {
                    return EmptyList.a;
                }
                w511.b();
                return null;
            }
            this.L$0 = null;
            this.I$0 = r10;
            this.I$1 = r7;
            this.label = 3;
            obj = e.c(this.this$0, (lj40) fj40Var, r10, r7, this);
        }
        return coroutineSingletons;
    }
}
