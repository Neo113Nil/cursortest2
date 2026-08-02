package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.p6i;
import defpackage.t701;
import defpackage.zls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "<unused var>", "Lt701;", Constants.KEY_DATA, "", "Ln351;", "<anonymous>", "(ZLt701;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.DynamicContentStateHolder$widgetModelFlow$1", f = "DynamicContentStateHolder.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DynamicContentStateHolder$widgetModelFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ d $dynamicContentMapper;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicContentStateHolder$widgetModelFlow$1(d dVar, Continuation continuation) {
        super(3, continuation);
        this.$dynamicContentMapper = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        DynamicContentStateHolder$widgetModelFlow$1 dynamicContentStateHolder$widgetModelFlow$1 = new DynamicContentStateHolder$widgetModelFlow$1(this.$dynamicContentMapper, (Continuation) obj3);
        dynamicContentStateHolder$widgetModelFlow$1.L$0 = (t701) obj2;
        return dynamicContentStateHolder$widgetModelFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        t701 t701Var = (t701) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.$dynamicContentMapper;
        p6i p6iVar = t701Var.a.m;
        this.L$0 = null;
        this.label = 1;
        Object a = dVar.a(p6iVar, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
