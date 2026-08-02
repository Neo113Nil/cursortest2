package kotlinx.coroutines.flow;

import defpackage.mvg;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ltse;", "Lvpr;", "downStream", "Lzy11;", "<anonymous>", "(Ltse;Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", l = {413}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
final class FlowKt__DelayKt$timeoutInternal$1 extends SuspendLambda implements zls {

    /* renamed from: $$v$c$kotlin-time-Duration$-timeout$0, reason: not valid java name */
    final /* synthetic */ long f37$$v$c$kotlintimeDuration$timeout$0;
    final /* synthetic */ tpr $this_timeoutInternal;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1(long j, tpr tprVar, Continuation continuation) {
        super(3, continuation);
        this.f37$$v$c$kotlintimeDuration$timeout$0 = j;
        this.$this_timeoutInternal = tprVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$1 = new FlowKt__DelayKt$timeoutInternal$1(this.f37$$v$c$kotlintimeDuration$timeout$0, this.$this_timeoutInternal, (Continuation) obj3);
        flowKt__DelayKt$timeoutInternal$1.L$0 = (tse) obj;
        flowKt__DelayKt$timeoutInternal$1.L$1 = (vpr) obj2;
        return flowKt__DelayKt$timeoutInternal$1.invokeSuspend(zy11.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0095 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0093 -> B:5:0x0096). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.L$0
            tse r0 = (defpackage.tse) r0
            java.lang.Object r1 = r13.L$1
            vpr r1 = (defpackage.vpr) r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r13.label
            r4 = 1
            r5 = 0
            r6 = 0
            if (r3 == 0) goto L2a
            if (r3 != r4) goto L24
            int r0 = r13.I$0
            long r7 = r13.J$0
            java.lang.Object r3 = r13.L$3
            kotlinx.coroutines.selects.b r3 = (kotlinx.coroutines.selects.b) r3
            java.lang.Object r3 = r13.L$2
            tfi0 r3 = (defpackage.tfi0) r3
            kotlin.b.b(r14)
            goto L96
        L24:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ny61.r(r13)
            return r6
        L2a:
            kotlin.b.b(r14)
            long r7 = r13.f37$$v$c$kotlintimeDuration$timeout$0
            r9 = 0
            int r14 = defpackage.e3n.c(r7, r9)
            if (r14 <= 0) goto La1
            tpr r14 = r13.$this_timeoutInternal
            r3 = 2
            tpr r11 = kotlinx.coroutines.flow.e.f(r14, r5, r6, r3)
            boolean r14 = r11 instanceof kotlinx.coroutines.flow.internal.a
            if (r14 == 0) goto L46
            r14 = r11
            kotlinx.coroutines.flow.internal.a r14 = (kotlinx.coroutines.flow.internal.a) r14
            goto L47
        L46:
            r14 = r6
        L47:
            if (r14 != 0) goto L54
            gi9 r7 = new gi9
            r12 = 0
            r9 = 14
            r8 = 0
            r10 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r14 = r7
        L54:
            tfi0 r14 = r14.j(r0)
            long r7 = r13.f37$$v$c$kotlintimeDuration$timeout$0
            r3 = r14
            r0 = r5
        L5c:
            kotlinx.coroutines.selects.b r14 = new kotlinx.coroutines.selects.b
            fse r9 = r13.get_context()
            r14.<init>(r9)
            ofa0 r9 = r3.f()
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 r10 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1
            r10.<init>(r1, r6)
            r14.h(r9, r10)
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2 r9 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2
            r9.<init>(r7, r6)
            long r10 = kotlinx.coroutines.a.t(r7)
            kotlinx.coroutines.selects.a.a(r14, r10, r9)
            r13.L$0 = r6
            r13.L$1 = r1
            r13.L$2 = r3
            r13.L$3 = r6
            r13.J$0 = r7
            r13.I$0 = r0
            r13.I$1 = r5
            r13.I$2 = r5
            r13.label = r4
            java.lang.Object r14 = r14.e(r13)
            if (r14 != r2) goto L96
            return r2
        L96:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L5c
            zy11 r13 = defpackage.zy11.a
            return r13
        La1:
            kotlinx.coroutines.TimeoutCancellationException r13 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r14 = "Timed out immediately"
            r13.<init>(r14, r6)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
