package ru.yandex.taxi.scheduleride.deeplink;

import android.net.Uri;
import defpackage.inm0;
import defpackage.j6m0;
import defpackage.lnm0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scheduleride.deeplink.ScheduleRideSummaryDeeplinkHandler$handleDeeplink$1", f = "ScheduleRideSummaryDeeplinkHandler.kt", l = {21}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScheduleRideSummaryDeeplinkHandler$handleDeeplink$1 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $deeplink;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduleRideSummaryDeeplinkHandler$handleDeeplink$1(b bVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$deeplink = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScheduleRideSummaryDeeplinkHandler$handleDeeplink$1(this.this$0, this.$deeplink, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScheduleRideSummaryDeeplinkHandler$handleDeeplink$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            lnm0 lnm0Var = this.this$0.a;
            Uri uri = this.$deeplink;
            inm0 inm0Var = "scheduleride".equalsIgnoreCase(uri != null ? uri.getAuthority() : null) ? new inm0(uri.getQueryParameter("continuation"), uri.getQueryParameter("tariffClass")) : null;
            if (inm0Var == null) {
                return zy11Var;
            }
            this.label = 1;
            if (lnm0Var.b(inm0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        b bVar = this.this$0;
        bVar.c.a(new j6m0(11, bVar));
        return zy11Var;
    }
}
