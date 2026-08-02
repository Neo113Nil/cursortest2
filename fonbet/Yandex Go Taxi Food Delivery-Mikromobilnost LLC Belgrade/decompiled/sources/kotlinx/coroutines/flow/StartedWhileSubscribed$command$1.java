package kotlinx.coroutines.flow;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "count", "Lzy11;", "<anonymous>", "(Lvpr;I)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {175, 177, 179, SubsamplingScaleImageView.ORIENTATION_180, 182}, m = "invokeSuspend", v = 1)
/* loaded from: classes9.dex */
final class StartedWhileSubscribed$command$1 extends SuspendLambda implements zls {
    /* synthetic */ int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ q0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(q0 q0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = q0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.this$0, (Continuation) obj3);
        startedWhileSubscribed$command$1.L$0 = (vpr) obj;
        startedWhileSubscribed$command$1.I$0 = intValue;
        return startedWhileSubscribed$command$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008e, code lost:
    
        if (r0.emit(r13, r12) != r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        if (kotlinx.coroutines.a.i(r7, r12) == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r0.emit(r13, r12) == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
    
        if (r0.emit(r13, r12) == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (kotlinx.coroutines.a.i(r9, r12) == r2) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            if (i > 0) {
                SharingCommand sharingCommand = SharingCommand.START;
                this.L$0 = null;
                this.I$0 = i;
                this.label = 1;
            } else {
                long j = this.this$0.b;
                this.L$0 = vprVar;
                this.I$0 = i;
                this.label = 2;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                kotlin.b.b(obj);
                if (this.this$0.c > 0) {
                    SharingCommand sharingCommand2 = SharingCommand.STOP;
                    this.L$0 = vprVar;
                    this.I$0 = i;
                    this.label = 3;
                }
                SharingCommand sharingCommand3 = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                this.L$0 = null;
                this.I$0 = i;
                this.label = 5;
            } else if (i2 == 3) {
                kotlin.b.b(obj);
                long j2 = this.this$0.c;
                this.L$0 = vprVar;
                this.I$0 = i;
                this.label = 4;
            } else if (i2 == 4) {
                kotlin.b.b(obj);
                SharingCommand sharingCommand32 = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                this.L$0 = null;
                this.I$0 = i;
                this.label = 5;
            } else if (i2 != 5) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        kotlin.b.b(obj);
        return zy11.a;
    }
}
