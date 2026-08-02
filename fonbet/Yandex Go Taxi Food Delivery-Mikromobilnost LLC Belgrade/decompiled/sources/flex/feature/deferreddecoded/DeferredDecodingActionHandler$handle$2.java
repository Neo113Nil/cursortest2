package flex.feature.deferreddecoded;

import defpackage.bvf0;
import defpackage.g6u;
import defpackage.gtq0;
import defpackage.gw00;
import defpackage.i3y;
import defpackage.j400;
import defpackage.j73;
import defpackage.kr;
import defpackage.mvg;
import defpackage.n6u;
import defpackage.ndx;
import defpackage.nez;
import defpackage.ny61;
import defpackage.pxl;
import defpackage.qoi0;
import defpackage.s7s0;
import defpackage.s8o;
import defpackage.seu;
import defpackage.sf90;
import defpackage.sjh;
import defpackage.sx;
import defpackage.tje;
import defpackage.tjr;
import defpackage.toh;
import defpackage.tse;
import defpackage.uug;
import defpackage.uyj;
import defpackage.w9h;
import defpackage.wls;
import defpackage.xfz;
import defpackage.zcx;
import defpackage.zjr;
import defpackage.zse;
import defpackage.zy11;
import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.feature.deferreddecoded.DeferredDecodingActionHandler$handle$2", f = "DeferredDecodingActionHandler.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DeferredDecodingActionHandler$handle$2 extends SuspendLambda implements wls {
    final /* synthetic */ toh $action;
    final /* synthetic */ n6u $context;
    final /* synthetic */ int $hash;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeferredDecodingActionHandler$handle$2(a aVar, toh tohVar, n6u n6uVar, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$action = tohVar;
        this.$context = n6uVar;
        this.$hash = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeferredDecodingActionHandler$handle$2(this.this$0, this.$action, this.$context, this.$hash, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeferredDecodingActionHandler$handle$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        kr uugVar;
        StackTraceElement stackTraceElement;
        String str;
        kr krVar;
        a aVar;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        int i4 = 1;
        if (i3 == 0) {
            b.b(obj);
            a aVar2 = this.this$0;
            w9h w9hVar = aVar2.a;
            s8o.S(aVar2, w9hVar);
            String str2 = this.$action.a;
            pxl pxlVar = this.$context.b;
            ndx ndxVar = (ndx) w9hVar.c.getValue();
            zcx a = tje.a(ndxVar.a, new sx(ndxVar, i4));
            KSerializer B = gtq0.B(a.b, qoi0.a(kr.class));
            sf90 A = bvf0.A(a);
            zjr zjrVar = w9hVar.w;
            String str3 = zjrVar.d;
            if (str3 == null) {
                str3 = null;
            }
            A.e(new nez(str3));
            try {
                uugVar = (kr) a.b(B, str2);
                bvf0.A(a).d(qoi0.a(nez.class));
                i = 0;
            } catch (Throwable th) {
                try {
                    seu seuVar = w9hVar.b;
                    ErrorTypes errorTypes = ErrorTypes.DEFERRED_DECODING_ACTION_EXECUTION_FAILED;
                    errorTypes.getClass();
                    gw00.e(new Pair("json", str2));
                    seuVar.getClass();
                    String type = errorTypes.getType();
                    i3y a2 = xfz.a(new Pair("locator", "DeferredDecodingActionParser.parse"), new Pair("cause", th), xfz.d(th.getMessage(), "errorDescription"));
                    EmptyList emptyList = EmptyList.a;
                    s7s0 s7s0Var = zjrVar.c.a;
                    boolean booleanValue = Boolean.FALSE.booleanValue();
                    tjr tjrVar = tjr.d;
                    if (booleanValue && (stackTraceElement = (StackTraceElement) j73.G(0, new Throwable().getStackTrace())) != null) {
                        String fileName = stackTraceElement.getFileName();
                        if (fileName == null) {
                            fileName = "No file info";
                        }
                        String methodName = stackTraceElement.getMethodName();
                        int lineNumber = stackTraceElement.getLineNumber();
                        Integer valueOf = Integer.valueOf(lineNumber);
                        if (lineNumber <= 0) {
                            valueOf = null;
                        }
                        if (valueOf == null || (str = valueOf.toString()) == null) {
                            str = "No line info";
                        }
                        tjrVar = new tjr(fileName, methodName, str);
                    }
                    i3y a3 = xfz.a(new Pair("errorType", type));
                    i = 0;
                    zjrVar.d(FlexLogLevel.ERROR, "Failed to decode action inside DeferredDecodingAction", xfz.c(a2, a3), emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
                    uugVar = new uug("DeferredDecodingAction", "Не удалось распарсить действие типа DeferredDecodingAction", str2);
                    bvf0.A(a).d(qoi0.a(nez.class));
                } catch (Throwable th2) {
                    bvf0.A(a).d(qoi0.a(nez.class));
                    throw th2;
                }
            }
            a aVar3 = this.this$0;
            int i5 = this.$hash;
            n6u n6uVar = this.$context;
            sjh sjhVar = uyj.a;
            g6u R = ((j400) zse.a.b).R();
            DeferredDecodingActionHandler$handle$2$1$1 deferredDecodingActionHandler$handle$2$1$1 = new DeferredDecodingActionHandler$handle$2$1$1(aVar3, n6uVar, uugVar, null);
            this.L$0 = uugVar;
            this.L$1 = aVar3;
            this.L$2 = uugVar;
            this.I$0 = i5;
            this.I$1 = i;
            this.label = 1;
            if (tje.k0(R, deferredDecodingActionHandler$handle$2$1$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            krVar = uugVar;
            aVar = aVar3;
            i2 = i5;
        } else {
            if (i3 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.I$0;
            krVar = (kr) this.L$2;
            aVar = (a) this.L$1;
            b.b(obj);
        }
        aVar.w.put(new Integer(i2), krVar);
        return zy11.a;
    }
}
