package kotlinx.coroutines.flow;

import defpackage.ffx;
import defpackage.jb20;
import defpackage.k0v0;
import defpackage.lz40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oa;
import defpackage.pqr;
import defpackage.r2u0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend", v = 1)
/* loaded from: classes9.dex */
final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements wls {
    final /* synthetic */ Object $initialValue;
    final /* synthetic */ lz40 $shared;
    final /* synthetic */ xsr0 $started;
    final /* synthetic */ tpr $upstream;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @mvg(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend", v = 1)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ int I$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.I$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.valueOf(i > 0);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/SharingCommand;", "it", "Lzy11;", "<anonymous>", "(Lkotlinx/coroutines/flow/SharingCommand;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend", v = 1)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ Object $initialValue;
        final /* synthetic */ lz40 $shared;
        final /* synthetic */ tpr $upstream;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(tpr tprVar, lz40 lz40Var, Object obj, Continuation continuation) {
            super(2, continuation);
            this.$upstream = tprVar;
            this.$shared = lz40Var;
            this.$initialValue = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$upstream, this.$shared, this.$initialValue, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((SharingCommand) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SharingCommand sharingCommand = (SharingCommand) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                int i2 = pqr.a[sharingCommand.ordinal()];
                if (i2 == 1) {
                    tpr tprVar = this.$upstream;
                    lz40 lz40Var = this.$shared;
                    this.L$0 = null;
                    this.label = 1;
                    if (tprVar.collect(lz40Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    Object obj2 = this.$initialValue;
                    jb20 jb20Var = ffx.i;
                    lz40 lz40Var2 = this.$shared;
                    if (obj2 == jb20Var) {
                        lz40Var2.f();
                    } else {
                        lz40Var2.g(obj2);
                    }
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharing$1(xsr0 xsr0Var, tpr tprVar, lz40 lz40Var, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$started = xsr0Var;
        this.$upstream = tprVar;
        this.$shared = lz40Var;
        this.$initialValue = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FlowKt__ShareKt$launchSharing$1(this.$started, this.$upstream, this.$shared, this.$initialValue, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__ShareKt$launchSharing$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        if (r8.collect(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r8.collect(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (kotlinx.coroutines.flow.e.x(r8, r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (kotlinx.coroutines.flow.e.k(r8, r1, r7) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    tpr tprVar = this.$upstream;
                    lz40 lz40Var = this.$shared;
                    this.label = 3;
                } else if (i != 3 && i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            kotlin.b.b(obj);
            return zy11.a;
        }
        kotlin.b.b(obj);
        xsr0 xsr0Var = this.$started;
        xsr0.a.getClass();
        if (xsr0Var == wsr0.b) {
            tpr tprVar2 = this.$upstream;
            lz40 lz40Var2 = this.$shared;
            this.label = 1;
        } else {
            xsr0 xsr0Var2 = this.$started;
            r2u0 r2u0Var = wsr0.c;
            Object obj2 = this.$shared;
            if (xsr0Var2 == r2u0Var) {
                k0v0 j = ((oa) obj2).j();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
                this.label = 2;
            } else {
                tpr t = e.t(xsr0Var2.a(((oa) obj2).j()));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$upstream, this.$shared, this.$initialValue, null);
                this.label = 4;
            }
        }
        return coroutineSingletons;
    }
}
