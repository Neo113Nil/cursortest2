package ru.yandex.taxi.locationsdk.core.utils;

import defpackage.igz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcz;
import defpackage.zls;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.core.utils.FlowLoggingKt$catchLogging$2", f = "flowLogging.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class FlowLoggingKt$catchLogging$2 extends SuspendLambda implements zls {
    final /* synthetic */ Pair<String, String>[] $data;
    final /* synthetic */ String $groupId;
    final /* synthetic */ igz $logger;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLoggingKt$catchLogging$2(igz igzVar, String str, Pair[] pairArr, Continuation continuation) {
        super(3, continuation);
        this.$logger = igzVar;
        this.$groupId = str;
        this.$data = pairArr;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowLoggingKt$catchLogging$2 flowLoggingKt$catchLogging$2 = new FlowLoggingKt$catchLogging$2(this.$logger, this.$groupId, this.$data, (Continuation) obj3);
        flowLoggingKt$catchLogging$2.L$0 = (Throwable) obj2;
        zy11 zy11Var = zy11.a;
        flowLoggingKt$catchLogging$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        igz igzVar = this.$logger;
        String str = this.$groupId;
        Pair<String, String>[] pairArr = this.$data;
        ((rcz) igzVar).b(str, th, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        return zy11.a;
    }
}
