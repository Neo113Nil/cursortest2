package kotlinx.coroutines;

import defpackage.de60;
import defpackage.ipb;
import defpackage.iqv;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rdz;
import defpackage.srq0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsrq0;", "Ll8x;", "Lzy11;", "<anonymous>", "(Lsrq0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {1003, 1005}, m = "invokeSuspend", v = 1)
/* loaded from: classes9.dex */
final class JobSupport$children$1 extends RestrictedSuspendLambda implements wls {
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(Continuation continuation, c cVar) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(continuation, this.this$0);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JobSupport$children$1) create((srq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x008f, code lost:
    
        if (r0.a(r11, r10) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r0.a(r11, r10) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0070 -> B:6:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x008f -> B:6:0x0092). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        de60 b;
        rdz rdzVar;
        kotlinx.coroutines.internal.a aVar;
        int i;
        int i2;
        srq0 srq0Var = (srq0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.b.b(obj);
            Object N = this.this$0.N();
            if (N instanceof ipb) {
                c cVar = ((ipb) N).A;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
            } else if ((N instanceof iqv) && (b = ((iqv) N).b()) != null) {
                rdzVar = b;
                aVar = (kotlinx.coroutines.internal.a) b.i();
                i = 0;
                i2 = 0;
                if (!aVar.equals(rdzVar)) {
                }
            }
        } else if (i3 == 1) {
            kotlin.b.b(obj);
        } else {
            if (i3 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$1;
            i2 = this.I$0;
            aVar = (kotlinx.coroutines.internal.a) this.L$4;
            rdzVar = (rdz) this.L$3;
            kotlin.b.b(obj);
            aVar = aVar.j();
            if (!aVar.equals(rdzVar)) {
                if (aVar instanceof ipb) {
                    c cVar2 = ((ipb) aVar).A;
                    this.L$0 = srq0Var;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = rdzVar;
                    this.L$4 = aVar;
                    this.L$5 = null;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.I$2 = 0;
                    this.label = 2;
                }
                aVar = aVar.j();
                if (!aVar.equals(rdzVar)) {
                }
            }
        }
        return zy11.a;
    }
}
