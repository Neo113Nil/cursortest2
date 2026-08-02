package flex.core.loader.network;

import defpackage.fxl;
import defpackage.i3y;
import defpackage.i7x0;
import defpackage.j73;
import defpackage.mvg;
import defpackage.n2m;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.s7s0;
import defpackage.tje;
import defpackage.tjr;
import defpackage.tse;
import defpackage.u1m;
import defpackage.unr0;
import defpackage.uu00;
import defpackage.uyg;
import defpackage.uyj;
import defpackage.uzl;
import defpackage.v5j0;
import defpackage.wls;
import defpackage.wwq;
import defpackage.wzl;
import defpackage.xzl;
import defpackage.ywl;
import defpackage.zjr;
import defpackage.zy11;
import flex.logger.FlexLogLevel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lwzl;", "<anonymous>", "(Ltse;)Lwzl;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.core.loader.network.DocumentService$fetchDocumentInternal$2", f = "DocumentService.kt", l = {276}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class DocumentService$fetchDocumentInternal$2 extends SuspendLambda implements wls {
    final /* synthetic */ ywl $document;
    final /* synthetic */ boolean $force;
    final /* synthetic */ u1m $query;
    final /* synthetic */ uu00 $request;
    final /* synthetic */ v5j0 $requestDetails;
    final /* synthetic */ boolean $restoreTagsIfError;
    final /* synthetic */ boolean $saveForNextUse;
    final /* synthetic */ i7x0 $tagRegistry;
    final /* synthetic */ List<String> $tagsToRestore;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentService$fetchDocumentInternal$2(d dVar, boolean z, u1m u1mVar, uu00 uu00Var, i7x0 i7x0Var, List list, boolean z2, boolean z3, v5j0 v5j0Var, ywl ywlVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$force = z;
        this.$query = u1mVar;
        this.$request = uu00Var;
        this.$tagRegistry = i7x0Var;
        this.$tagsToRestore = list;
        this.$restoreTagsIfError = z2;
        this.$saveForNextUse = z3;
        this.$requestDetails = v5j0Var;
        this.$document = ywlVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DocumentService$fetchDocumentInternal$2 documentService$fetchDocumentInternal$2 = new DocumentService$fetchDocumentInternal$2(this.this$0, this.$force, this.$query, this.$request, this.$tagRegistry, this.$tagsToRestore, this.$restoreTagsIfError, this.$saveForNextUse, this.$requestDetails, this.$document, continuation);
        documentService$fetchDocumentInternal$2.L$0 = obj;
        return documentService$fetchDocumentInternal$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DocumentService$fetchDocumentInternal$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0243 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0244 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0207 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d5  */
    /* JADX WARN: Type inference failed for: r13v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wwq wwqVar;
        uyg uygVar;
        StackTraceElement stackTraceElement;
        int lineNumber;
        Integer valueOf;
        String num;
        wzl uzlVar;
        xzl a;
        StackTraceElement stackTraceElement2;
        String str;
        xzl xzlVar;
        tjr tjrVar;
        EmptyList emptyList;
        StackTraceElement stackTraceElement3;
        String str2;
        tjr tjrVar2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        List list = 1;
        zjr zjrVar = null;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        qoh h = tje.h(tseVar, uyj.a, null, new DocumentService$fetchDocumentInternal$2$parserDeferred$1(this.this$0, this.$query, this.$document, null), 2);
        this.this$0.getClass();
        c cVar = new c(h);
        if (!this.$force) {
            d dVar = this.this$0;
            u1m u1mVar = this.$query;
            uu00 uu00Var = this.$request;
            i7x0 i7x0Var = this.$tagRegistry;
            List<String> list2 = this.$tagsToRestore;
            boolean z = this.$restoreTagsIfError;
            String str3 = "No line info";
            EmptyList emptyList2 = EmptyList.a;
            zjr zjrVar2 = dVar.B;
            tjr tjrVar3 = tjr.d;
            try {
                uzlVar = dVar.h(u1mVar, uu00Var, cVar, i7x0Var);
            } catch (Throwable th) {
                th = th;
                zjrVar = zjrVar2;
            }
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    if (z) {
                        i7x0Var.a(list2);
                    }
                    dVar.k(u1mVar, th, "DocumentService.tryLoadFromCache", i7x0Var);
                    Throwable th3 = th;
                    i3y g = d.g(dVar, u1mVar, null, null, null, th3, null, 46);
                    s7s0 s7s0Var = zjrVar.c.a;
                    if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                        String fileName = stackTraceElement.getFileName();
                        String str4 = fileName != null ? fileName : "No file info";
                        String methodName = stackTraceElement.getMethodName();
                        lineNumber = stackTraceElement.getLineNumber();
                        valueOf = Integer.valueOf(lineNumber);
                        if (lineNumber <= 0) {
                            valueOf = null;
                        }
                        if (valueOf != null && (num = valueOf.toString()) != null) {
                            str3 = num;
                        }
                        tjrVar3 = new tjr(str4, methodName, str3);
                    }
                    tjr tjrVar4 = tjrVar3;
                    zjrVar.d(FlexLogLevel.DEBUG, "Failed to fetch document", g, list, tjrVar4.a, tjrVar4.b, tjrVar4.c);
                    uzlVar = new uzl(th3);
                    if (uzlVar != null) {
                    }
                    d dVar2 = this.this$0;
                    String str5 = this.$request.a;
                    wwqVar = dVar2.z;
                    if (wwqVar != null) {
                    }
                    uygVar = (uyg) dVar2.A.invoke();
                    if (uygVar != null) {
                    }
                    d dVar3 = this.this$0;
                    u1m u1mVar2 = this.$query;
                    uu00 uu00Var2 = this.$request;
                    i7x0 i7x0Var2 = this.$tagRegistry;
                    boolean z2 = this.$saveForNextUse;
                    List<String> list3 = this.$tagsToRestore;
                    boolean z3 = this.$restoreTagsIfError;
                    v5j0 v5j0Var = this.$requestDetails;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 1;
                    Object c = d.c(dVar3, u1mVar2, uu00Var2, cVar, i7x0Var2, z2, list3, z3, v5j0Var, this);
                    if (c != coroutineSingletons) {
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                zjrVar = zjrVar2;
                list = emptyList;
                if (z) {
                }
                dVar.k(u1mVar, th, "DocumentService.tryLoadFromCache", i7x0Var);
                Throwable th32 = th;
                i3y g2 = d.g(dVar, u1mVar, null, null, null, th32, null, 46);
                s7s0 s7s0Var2 = zjrVar.c.a;
                if (Boolean.FALSE.booleanValue()) {
                }
                tjr tjrVar42 = tjrVar3;
                zjrVar.d(FlexLogLevel.DEBUG, "Failed to fetch document", g2, list, tjrVar42.a, tjrVar42.b, tjrVar42.c);
                uzlVar = new uzl(th32);
                if (uzlVar != null) {
                }
                d dVar22 = this.this$0;
                String str52 = this.$request.a;
                wwqVar = dVar22.z;
                if (wwqVar != null) {
                }
                uygVar = (uyg) dVar22.A.invoke();
                if (uygVar != null) {
                }
                d dVar32 = this.this$0;
                u1m u1mVar22 = this.$query;
                uu00 uu00Var22 = this.$request;
                i7x0 i7x0Var22 = this.$tagRegistry;
                boolean z22 = this.$saveForNextUse;
                List<String> list32 = this.$tagsToRestore;
                boolean z32 = this.$restoreTagsIfError;
                v5j0 v5j0Var2 = this.$requestDetails;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                Object c2 = d.c(dVar32, u1mVar22, uu00Var22, cVar, i7x0Var22, z22, list32, z32, v5j0Var2, this);
                if (c2 != coroutineSingletons) {
                }
            }
            if (uzlVar != null) {
                try {
                    i3y g3 = d.g(dVar, u1mVar, null, null, null, null, null, 62);
                    s7s0 s7s0Var3 = zjrVar2.c.a;
                    if (Boolean.FALSE.booleanValue() && (stackTraceElement3 = (StackTraceElement) j73.G(0, new Throwable().getStackTrace())) != null) {
                        String fileName2 = stackTraceElement3.getFileName();
                        if (fileName2 == null) {
                            fileName2 = "No file info";
                        }
                        String methodName2 = stackTraceElement3.getMethodName();
                        int lineNumber2 = stackTraceElement3.getLineNumber();
                        Integer valueOf2 = Integer.valueOf(lineNumber2);
                        if (lineNumber2 <= 0) {
                            valueOf2 = null;
                        }
                        if (valueOf2 != null) {
                            str2 = valueOf2.toString();
                            if (str2 == null) {
                            }
                            tjrVar2 = new tjr(fileName2, methodName2, str2);
                        }
                        str2 = "No line info";
                        tjrVar2 = new tjr(fileName2, methodName2, str2);
                    } else {
                        tjrVar2 = tjrVar3;
                    }
                    emptyList = emptyList2;
                    zjrVar2.d(FlexLogLevel.DEBUG, "Using document from cache", g3, emptyList, tjrVar2.a, tjrVar2.b, tjrVar2.c);
                    i7x0Var.b("fromCache");
                    zjrVar2 = "fromCache";
                } catch (Throwable th5) {
                    th = th5;
                    zjrVar = zjrVar2;
                    list = emptyList2;
                    if (z) {
                    }
                    dVar.k(u1mVar, th, "DocumentService.tryLoadFromCache", i7x0Var);
                    Throwable th322 = th;
                    i3y g22 = d.g(dVar, u1mVar, null, null, null, th322, null, 46);
                    s7s0 s7s0Var22 = zjrVar.c.a;
                    if (Boolean.FALSE.booleanValue()) {
                        String fileName3 = stackTraceElement.getFileName();
                        if (fileName3 != null) {
                        }
                        String methodName3 = stackTraceElement.getMethodName();
                        lineNumber = stackTraceElement.getLineNumber();
                        valueOf = Integer.valueOf(lineNumber);
                        if (lineNumber <= 0) {
                        }
                        if (valueOf != null) {
                            str3 = num;
                        }
                        tjrVar3 = new tjr(str4, methodName3, str3);
                    }
                    tjr tjrVar422 = tjrVar3;
                    zjrVar.d(FlexLogLevel.DEBUG, "Failed to fetch document", g22, list, tjrVar422.a, tjrVar422.b, tjrVar422.c);
                    uzlVar = new uzl(th322);
                    if (uzlVar != null) {
                    }
                    d dVar222 = this.this$0;
                    String str522 = this.$request.a;
                    wwqVar = dVar222.z;
                    if (wwqVar != null) {
                    }
                    uygVar = (uyg) dVar222.A.invoke();
                    if (uygVar != null) {
                    }
                    d dVar322 = this.this$0;
                    u1m u1mVar222 = this.$query;
                    uu00 uu00Var222 = this.$request;
                    i7x0 i7x0Var222 = this.$tagRegistry;
                    boolean z222 = this.$saveForNextUse;
                    List<String> list322 = this.$tagsToRestore;
                    boolean z322 = this.$restoreTagsIfError;
                    v5j0 v5j0Var22 = this.$requestDetails;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 1;
                    Object c22 = d.c(dVar322, u1mVar222, uu00Var222, cVar, i7x0Var222, z222, list322, z322, v5j0Var22, this);
                    if (c22 != coroutineSingletons) {
                    }
                }
            } else {
                fxl fxlVar = dVar.y;
                if (fxlVar == null || (a = fxlVar.a(u1mVar, new n2m(cVar, 0))) == null) {
                    uzlVar = null;
                    if (uzlVar != null) {
                        return uzlVar;
                    }
                } else {
                    i3y g4 = d.g(dVar, u1mVar, null, null, null, null, null, 62);
                    s7s0 s7s0Var4 = zjrVar2.c.a;
                    if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) j73.G(0, new Throwable().getStackTrace())) != null) {
                        String fileName4 = stackTraceElement2.getFileName();
                        if (fileName4 == null) {
                            fileName4 = "No file info";
                        }
                        String methodName4 = stackTraceElement2.getMethodName();
                        int lineNumber3 = stackTraceElement2.getLineNumber();
                        Integer valueOf3 = Integer.valueOf(lineNumber3);
                        if (lineNumber3 <= 0) {
                            valueOf3 = null;
                        }
                        if (valueOf3 != null) {
                            str = valueOf3.toString();
                            if (str == null) {
                            }
                            xzlVar = a;
                            tjrVar = new tjr(fileName4, methodName4, str);
                        }
                        str = "No line info";
                        xzlVar = a;
                        tjrVar = new tjr(fileName4, methodName4, str);
                    } else {
                        xzlVar = a;
                        tjrVar = tjrVar3;
                    }
                    emptyList = emptyList2;
                    zjr zjrVar3 = zjrVar2;
                    zjrVar3.d(FlexLogLevel.DEBUG, "Using document from cache fallback", g4, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
                    i7x0Var.b("fromFallback");
                    uzlVar = xzlVar;
                    zjrVar2 = zjrVar3;
                }
            }
            if (uzlVar != null) {
            }
        }
        d dVar2222 = this.this$0;
        String str5222 = this.$request.a;
        wwqVar = dVar2222.z;
        if (wwqVar != null) {
            wwqVar.clearNetworkPageInfo(str5222);
        }
        uygVar = (uyg) dVar2222.A.invoke();
        if (uygVar != null) {
            uygVar.clearNetworkPageInfo(str5222);
        }
        d dVar3222 = this.this$0;
        u1m u1mVar2222 = this.$query;
        uu00 uu00Var2222 = this.$request;
        i7x0 i7x0Var2222 = this.$tagRegistry;
        boolean z2222 = this.$saveForNextUse;
        List<String> list3222 = this.$tagsToRestore;
        boolean z3222 = this.$restoreTagsIfError;
        v5j0 v5j0Var222 = this.$requestDetails;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 1;
        Object c222 = d.c(dVar3222, u1mVar2222, uu00Var2222, cVar, i7x0Var2222, z2222, list3222, z3222, v5j0Var222, this);
        return c222 != coroutineSingletons ? coroutineSingletons : c222;
    }
}
