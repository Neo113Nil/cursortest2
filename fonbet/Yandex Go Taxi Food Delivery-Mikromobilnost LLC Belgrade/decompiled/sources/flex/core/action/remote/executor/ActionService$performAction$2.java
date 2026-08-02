package flex.core.action.remote.executor;

import core.network.mapi.exception.IssueType;
import core.network.mapi.exception.MapiClientException;
import defpackage.ewj0;
import defpackage.ey;
import defpackage.fy;
import defpackage.gtq0;
import defpackage.gy;
import defpackage.hx;
import defpackage.hy;
import defpackage.i3y;
import defpackage.j1m;
import defpackage.lu00;
import defpackage.mvg;
import defpackage.ndx;
import defpackage.nrq;
import defpackage.nui0;
import defpackage.ny61;
import defpackage.odx;
import defpackage.q370;
import defpackage.qoi0;
import defpackage.qu00;
import defpackage.s7s0;
import defpackage.sx;
import defpackage.tje;
import defpackage.tjr;
import defpackage.tse;
import defpackage.tx;
import defpackage.unr0;
import defpackage.uu00;
import defpackage.ux;
import defpackage.v5j0;
import defpackage.wls;
import defpackage.wwq;
import defpackage.xu00;
import defpackage.ywl;
import defpackage.zcx;
import defpackage.zjr;
import defpackage.zy11;
import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lnui0;", "<anonymous>", "(Ltse;)Lnui0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.core.action.remote.executor.ActionService$performAction$2", f = "ActionService.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ActionService$performAction$2 extends SuspendLambda implements wls {
    final /* synthetic */ ywl $document;
    final /* synthetic */ Map<String, b> $payload;
    final /* synthetic */ hx $query;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ hy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionService$performAction$2(ywl ywlVar, hy hyVar, hx hxVar, Map map, Continuation continuation) {
        super(2, continuation);
        this.$document = ywlVar;
        this.this$0 = hyVar;
        this.$query = hxVar;
        this.$payload = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ActionService$performAction$2(this.$document, this.this$0, this.$query, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ActionService$performAction$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ErrorTypes errorTypes;
        StackTraceElement stackTraceElement;
        String str;
        hy hyVar;
        Object executeRequest;
        hy hyVar2;
        q370 q370Var;
        ErrorTypes errorTypes2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                ywl ywlVar = this.$document;
                Object obj2 = (ywlVar == null || (q370Var = ywlVar.e) == null) ? null : q370Var.a;
                int i2 = 0;
                try {
                    uu00 b = hy.b(this.this$0, this.$query, this.$payload, obj2 instanceof c ? (c) obj2 : null);
                    v5j0 v5j0Var = new v5j0(b, this.this$0.z);
                    hy hyVar3 = this.this$0;
                    ux uxVar = hyVar3.b;
                    hx hxVar = this.$query;
                    ywl ywlVar2 = this.$document;
                    String str2 = hyVar3.A.d;
                    String str3 = str2 == null ? null : str2;
                    ndx ndxVar = (ndx) uxVar.b.getValue();
                    zcx a = tje.a(ndxVar.a, new sx(ndxVar, i2));
                    tx txVar = new tx(uxVar, new odx(a, gtq0.B(a.b, qoi0.a(nrq.class))), ywlVar2, hxVar, str3);
                    hy hyVar4 = this.this$0;
                    qu00 qu00Var = new qu00(b, hyVar4.y, v5j0Var, txVar);
                    wwq wwqVar = hyVar4.x;
                    j1m j1mVar = wwqVar != null ? new j1m(b, wwqVar) : null;
                    this.this$0.A.b();
                    hyVar = this.this$0;
                    lu00 lu00Var = hyVar.a;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = hyVar;
                    this.L$6 = hyVar;
                    this.label = 1;
                    executeRequest = lu00Var.executeRequest(b, qu00Var, j1mVar, v5j0Var, this);
                    if (executeRequest == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    hyVar2 = hyVar;
                } catch (IllegalArgumentException e) {
                    zjr zjrVar = this.this$0.A;
                    String str4 = "Failed to create request by query " + this.$query + " (error = " + e.getMessage() + Extension.C_BRAKE;
                    i3y a2 = kotlin.a.a(gy.a);
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
                    zjrVar.d(FlexLogLevel.DEBUG, str4, a2, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
                    return new ewj0(e);
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hy hyVar5 = (hy) this.L$6;
                hyVar2 = (hy) this.L$5;
                kotlin.b.b(obj);
                hyVar = hyVar5;
                executeRequest = obj;
            }
            xu00 xu00Var = (xu00) executeRequest;
            hyVar.getClass();
            hyVar.d(xu00Var.b);
            nui0 nui0Var = (nui0) xu00Var.a;
            hx hxVar2 = this.$query;
            Map<String, b> map = this.$payload;
            hy hyVar6 = this.this$0;
            IssueType issueType = IssueType.PARSING;
            hyVar6.getClass();
            int i3 = ey.a[issueType.ordinal()];
            if (i3 == 1) {
                errorTypes2 = ErrorTypes.ACTION_SERVICE_REQUEST_ERROR;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                errorTypes2 = ErrorTypes.ACTION_SERVICE_PARSE_ERROR;
            }
            return hy.c(hyVar2, nui0Var, hxVar2, map, errorTypes2);
        } catch (MapiClientException e2) {
            String str5 = e2.getDetails().e;
            int i4 = fy.a[e2.getIssueType().ordinal()];
            if (i4 == 1) {
                this.this$0.w.handleActionRequestError(this.$query, str5, e2, e2.getDetails().c);
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.w.handleActionParseError(this.$query, str5, e2);
            }
            hy hyVar7 = this.this$0;
            hyVar7.getClass();
            hyVar7.d(e2.getDetails());
            ewj0 ewj0Var = new ewj0(e2);
            hx hxVar3 = this.$query;
            Map<String, b> map2 = this.$payload;
            hy hyVar8 = this.this$0;
            IssueType issueType2 = e2.getIssueType();
            hyVar8.getClass();
            int i5 = ey.a[issueType2.ordinal()];
            if (i5 == 1) {
                errorTypes = ErrorTypes.ACTION_SERVICE_REQUEST_ERROR;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                errorTypes = ErrorTypes.ACTION_SERVICE_PARSE_ERROR;
            }
            hyVar7.f(ewj0Var, hxVar3, map2, errorTypes, e2);
            return ewj0Var;
        } finally {
            this.this$0.A.a();
        }
    }
}
