package ru.yandex.taxi.location;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.location.LbsProviderImpl$locationUpdatesFromLbs$2$resultFlow$1$2", f = "LbsProviderImpl.kt", l = {HProv.PP_BIO_STATISTICA_LEN, HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class LbsProviderImpl$locationUpdatesFromLbs$2$resultFlow$1$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LbsProviderImpl$locationUpdatesFromLbs$2$resultFlow$1$2(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LbsProviderImpl$locationUpdatesFromLbs$2$resultFlow$1$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LbsProviderImpl$locationUpdatesFromLbs$2$resultFlow$1$2) create(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (kotlinx.coroutines.a.i(r4, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TimeUnit timeUnit;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.location.lbs.b bVar = this.this$0.e;
            timeUnit = TimeUnit.SECONDS;
            this.L$0 = timeUnit;
            this.label = 1;
            obj = bVar.b(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return Boolean.TRUE;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            timeUnit = (TimeUnit) this.L$0;
            kotlin.b.b(obj);
        }
        long millis = timeUnit.toMillis(((Number) obj).longValue());
        this.L$0 = null;
        this.label = 2;
    }
}
