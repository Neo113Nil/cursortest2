package ru.yandex.taxi.persuggest.api;

import android.os.SystemClock;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p7v0;
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
@mvg(c = "ru.yandex.taxi.persuggest.api.PerSuggestApiImpl$suggestV2$2", f = "PerSuggestApiImpl.kt", l = {82}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PerSuggestApiImpl$suggestV2$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $date;
    final /* synthetic */ p7v0 $params;
    long J$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerSuggestApiImpl$suggestV2$2(a aVar, String str, p7v0 p7v0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$date = str;
        this.$params = p7v0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PerSuggestApiImpl$suggestV2$2(this.this$0, this.$date, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PerSuggestApiImpl$suggestV2$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            PerSuggestInternalApi d = this.this$0.d();
            String str = this.$date;
            p7v0 p7v0Var = this.$params;
            cmt<uc61> f = d.f(str, p7v0Var, p7v0Var.a.getTag());
            this.J$0 = elapsedRealtime;
            this.label = 1;
            obj = ru.yandex.taxi.network.api.a.b(f, null, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = elapsedRealtime;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            b.b(obj);
        }
        a aVar = this.this$0;
        p7v0 p7v0Var2 = this.$params;
        fmt fmtVar = (fmt) obj;
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - j;
        String a = fmtVar.e.a("X-YaTraceId");
        if (a == null) {
            a = "";
        }
        aVar.b.a(ScreenEndpoint.Suggest, elapsedRealtime2, a, p7v0Var2.c);
        return fmtVar.a;
    }
}
