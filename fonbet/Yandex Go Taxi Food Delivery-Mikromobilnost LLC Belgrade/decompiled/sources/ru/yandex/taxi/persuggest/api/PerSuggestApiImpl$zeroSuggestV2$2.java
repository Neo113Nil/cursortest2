package ru.yandex.taxi.persuggest.api;

import android.os.SystemClock;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.mvg;
import defpackage.nc61;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uc61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.perf.screen.ScreenEndpoint;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Luc61;", "<anonymous>", "(Ltse;)Luc61;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.persuggest.api.PerSuggestApiImpl$zeroSuggestV2$2", f = "PerSuggestApiImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PerSuggestApiImpl$zeroSuggestV2$2 extends SuspendLambda implements wls {
    final /* synthetic */ cmt<uc61> $call;
    final /* synthetic */ nc61 $params;
    final /* synthetic */ long $start;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerSuggestApiImpl$zeroSuggestV2$2(cmt cmtVar, long j, a aVar, nc61 nc61Var, Continuation continuation) {
        super(2, continuation);
        this.$call = cmtVar;
        this.$start = j;
        this.this$0 = aVar;
        this.$params = nc61Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PerSuggestApiImpl$zeroSuggestV2$2(this.$call, this.$start, this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PerSuggestApiImpl$zeroSuggestV2$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            cmt<uc61> cmtVar = this.$call;
            this.label = 1;
            obj = ru.yandex.taxi.network.api.a.b(cmtVar, null, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        long j = this.$start;
        a aVar = this.this$0;
        nc61 nc61Var = this.$params;
        fmt fmtVar = (fmt) obj;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        String a = fmtVar.e.a("X-YaTraceId");
        if (a == null) {
            a = "";
        }
        aVar.b.a(ScreenEndpoint.ZeroSuggest, elapsedRealtime, a, nc61Var.c);
        return fmtVar.a;
    }
}
