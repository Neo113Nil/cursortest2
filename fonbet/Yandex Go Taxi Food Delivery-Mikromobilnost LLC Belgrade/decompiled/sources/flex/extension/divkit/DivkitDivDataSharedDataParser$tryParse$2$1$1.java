package flex.extension.divkit;

import defpackage.gtq0;
import defpackage.i3y;
import defpackage.mvg;
import defpackage.n5o;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.s7s0;
import defpackage.sbx;
import defpackage.tjr;
import defpackage.tse;
import defpackage.unr0;
import defpackage.wls;
import defpackage.xfz;
import defpackage.zjr;
import defpackage.zy11;
import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.serialization.json.b;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltse;", "Lkotlin/Pair;", "", "Lkotlin/Result;", "Ln5o;", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.extension.divkit.DivkitDivDataSharedDataParser$tryParse$2$1$1", f = "DivkitDivDataSharedDataParser.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DivkitDivDataSharedDataParser$tryParse$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ sbx $json;
    final /* synthetic */ String $key;
    final /* synthetic */ b $value;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivkitDivDataSharedDataParser$tryParse$2$1$1(String str, sbx sbxVar, b bVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$key = str;
        this.$json = sbxVar;
        this.$value = bVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DivkitDivDataSharedDataParser$tryParse$2$1$1 divkitDivDataSharedDataParser$tryParse$2$1$1 = new DivkitDivDataSharedDataParser$tryParse$2$1$1(this.$key, this.$json, this.$value, this.this$0, continuation);
        divkitDivDataSharedDataParser$tryParse$2$1$1.L$0 = obj;
        return divkitDivDataSharedDataParser$tryParse$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DivkitDivDataSharedDataParser$tryParse$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        StackTraceElement stackTraceElement;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String str2 = this.$key;
        sbx sbxVar = this.$json;
        try {
            failure = (n5o) sbxVar.a(gtq0.B(sbxVar.b, qoi0.a(n5o.class)), this.$value);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Result result = new Result(failure);
        a aVar = this.this$0;
        Object value = result.getValue();
        if (value instanceof Result.Failure) {
            zjr zjrVar = aVar.c;
            String type = ErrorTypes.DIVKIT_SHARED_DIVDATA_DECODING_ERROR.getType();
            Pair pair = new Pair("locator", "DivkitDivDataSharedDataParser.tryParse");
            Pair d = xfz.d(Result.a(value), "cause");
            Throwable a = Result.a(value);
            i3y a2 = xfz.a(pair, d, xfz.d(a != null ? a.getMessage() : null, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION));
            s7s0 s7s0Var = zjrVar.c.a;
            boolean booleanValue = Boolean.FALSE.booleanValue();
            tjr tjrVar = tjr.d;
            if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                String fileName = stackTraceElement.getFileName();
                if (fileName == null) {
                    fileName = "No file info";
                }
                String methodName = stackTraceElement.getMethodName();
                Integer num = new Integer(stackTraceElement.getLineNumber());
                Integer num2 = num.intValue() > 0 ? num : null;
                if (num2 == null || (str = num2.toString()) == null) {
                    str = "No line info";
                }
                tjrVar = new tjr(fileName, methodName, str);
            }
            tjr tjrVar2 = tjrVar;
            zjrVar.d(FlexLogLevel.ERROR, "Failed to decode DivData from SharedData", xfz.c(a2, xfz.a(new Pair("errorType", type))), EmptyList.a, tjrVar2.a, tjrVar2.b, tjrVar2.c);
        }
        return new Pair(str2, result);
    }
}
