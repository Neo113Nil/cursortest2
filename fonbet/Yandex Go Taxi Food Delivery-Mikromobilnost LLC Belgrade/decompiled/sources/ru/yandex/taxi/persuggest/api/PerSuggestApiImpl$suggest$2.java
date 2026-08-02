package ru.yandex.taxi.persuggest.api;

import android.os.SystemClock;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p7v0;
import defpackage.tse;
import defpackage.u7v0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.perf.screen.ScreenEndpoint;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lu7v0;", "<anonymous>", "(Ltse;)Lu7v0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.persuggest.api.PerSuggestApiImpl$suggest$2", f = "PerSuggestApiImpl.kt", l = {70}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PerSuggestApiImpl$suggest$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $date;
    final /* synthetic */ p7v0 $params;
    final /* synthetic */ long $start;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerSuggestApiImpl$suggest$2(a aVar, String str, p7v0 p7v0Var, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$date = str;
        this.$params = p7v0Var;
        this.$start = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PerSuggestApiImpl$suggest$2(this.this$0, this.$date, this.$params, this.$start, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PerSuggestApiImpl$suggest$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            PerSuggestInternalApi d = this.this$0.d();
            String str = this.$date;
            p7v0 p7v0Var = this.$params;
            cmt<u7v0> a = d.a(str, p7v0Var, p7v0Var.a.getTag());
            this.label = 1;
            obj = ru.yandex.taxi.network.api.a.b(a, null, this);
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
        p7v0 p7v0Var2 = this.$params;
        fmt fmtVar = (fmt) obj;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        String a2 = fmtVar.e.a("X-YaTraceId");
        if (a2 == null) {
            a2 = "";
        }
        aVar.b.a(ScreenEndpoint.Suggest, elapsedRealtime, a2, p7v0Var2.c);
        return fmtVar.a;
    }
}
