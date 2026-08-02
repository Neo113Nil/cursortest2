package flex.core.loader.network;

import defpackage.d2m;
import defpackage.i3y;
import defpackage.i7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s7s0;
import defpackage.s8o;
import defpackage.tje;
import defpackage.tjr;
import defpackage.tls;
import defpackage.u1m;
import defpackage.unr0;
import defpackage.xfz;
import defpackage.zjr;
import defpackage.zy11;
import flex.logger.FlexLogLevel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwzl;", "<anonymous>", "()Lwzl;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.core.loader.network.NetworkDocumentLoader$prefetchDocumentInternal$2", f = "NetworkDocumentLoader.kt", l = {145, 142}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class NetworkDocumentLoader$prefetchDocumentInternal$2 extends SuspendLambda implements tls {
    final /* synthetic */ boolean $force;
    final /* synthetic */ boolean $isPreload;
    final /* synthetic */ u1m $query;
    final /* synthetic */ boolean $restoreTagsIfError;
    final /* synthetic */ i7x0 $tagRegistry;
    final /* synthetic */ boolean $useCache;
    final /* synthetic */ boolean $usePassedCoroutineContext;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkDocumentLoader$prefetchDocumentInternal$2(e eVar, u1m u1mVar, boolean z, boolean z2, boolean z3, i7x0 i7x0Var, boolean z4, boolean z5, Continuation continuation) {
        super(1, continuation);
        this.this$0 = eVar;
        this.$query = u1mVar;
        this.$force = z;
        this.$isPreload = z2;
        this.$useCache = z3;
        this.$tagRegistry = i7x0Var;
        this.$restoreTagsIfError = z4;
        this.$usePassedCoroutineContext = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new NetworkDocumentLoader$prefetchDocumentInternal$2(this.this$0, this.$query, this.$force, this.$isPreload, this.$useCache, this.$tagRegistry, this.$restoreTagsIfError, this.$usePassedCoroutineContext, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((NetworkDocumentLoader$prefetchDocumentInternal$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        u1m u1mVar;
        d dVar;
        StackTraceElement stackTraceElement;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            zjr zjrVar = this.this$0.c;
            u1m u1mVar2 = this.$query;
            i3y a2 = xfz.a(new Pair("queryPath", u1mVar2.a), new Pair("queryParams", u1mVar2.b), null);
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
                if (num.intValue() <= 0) {
                    num = null;
                }
                if (num == null || (str = num.toString()) == null) {
                    str = "No line info";
                }
                tjrVar = new tjr(fileName, methodName, str);
            }
            zjrVar.d(FlexLogLevel.DEBUG, "Prefetch of document started", a2, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
            e eVar = this.this$0;
            d dVar2 = eVar.a;
            s8o.S(eVar, dVar2);
            u1m u1mVar3 = this.$query;
            List list = this.this$0.b;
            d2m d2mVar = new d2m(u1mVar3, this.$force, true);
            this.L$0 = dVar2;
            this.L$1 = u1mVar3;
            this.label = 1;
            a = f.a(list, null, d2mVar, this);
            if (a != coroutineSingletons) {
                u1mVar = u1mVar3;
                dVar = dVar2;
            }
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        u1m u1mVar4 = (u1m) this.L$1;
        d dVar3 = (d) this.L$0;
        kotlin.b.b(obj);
        u1mVar = u1mVar4;
        dVar = dVar3;
        a = obj;
        Map map = (Map) a;
        i7x0 i7x0Var = this.$tagRegistry;
        boolean z = this.$force;
        boolean z2 = this.$useCache;
        boolean z3 = this.$restoreTagsIfError;
        boolean z4 = this.$usePassedCoroutineContext;
        boolean z5 = this.$isPreload;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object f = z4 ? dVar.f(u1mVar, null, map, i7x0Var, false, z, z2, z3, z5, this) : tje.k0(dVar.c, new DocumentService$fetchDocument$3(dVar, u1mVar, null, map, i7x0Var, false, z, z2, z3, z5, null), this);
        return f == coroutineSingletons ? coroutineSingletons : f;
    }
}
