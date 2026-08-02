package com.squareup.cash.attribution;

import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.attribution.InstallAttributer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class InstallAttributer$setup$1$1$invokeSuspend$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ InstallAttributer this$0;

    /* renamed from: com.squareup.cash.attribution.InstallAttributer$setup$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return InstallAttributer$setup$1$1$invokeSuspend$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ InstallAttributer$setup$1$1$invokeSuspend$$inlined$map$1$2(FlowCollector flowCollector, InstallAttributer installAttributer, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.this$0 = installAttributer;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        InstallAttributer$setup$1$1$invokeSuspend$$inlined$map$2$2$1 installAttributer$setup$1$1$invokeSuspend$$inlined$map$2$2$1;
        int i2;
        int i3 = this.$r8$classId;
        InstallAttributer installAttributer = this.this$0;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        switch (i3) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i4 = anonymousClass1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            String appTokenOrNull = PlatformKt.appTokenOrNull(installAttributer.sessionManager);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(appTokenOrNull, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj22 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            default:
                if (continuation instanceof InstallAttributer$setup$1$1$invokeSuspend$$inlined$map$2$2$1) {
                    installAttributer$setup$1$1$invokeSuspend$$inlined$map$2$2$1 = (InstallAttributer$setup$1$1$invokeSuspend$$inlined$map$2$2$1) continuation;
                    int i5 = installAttributer$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        installAttributer$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj3 = installAttributer$setup$1$1$invokeSuspend$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = installAttributer$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            String str = (String) obj;
                            InstallAttributer.State state = installAttributer.state;
                            if (state == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("state");
                                throw null;
                            }
                            InstallAttributer.State copy$default = InstallAttributer.State.copy$default(state, null, str, null, 11);
                            installAttributer$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(copy$default, installAttributer$setup$1$1$invokeSuspend$$inlined$map$2$2$1) == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                        } else {
                            if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj3);
                        }
                        return Unit.INSTANCE;
                    }
                }
                installAttributer$setup$1$1$invokeSuspend$$inlined$map$2$2$1 = new InstallAttributer$setup$1$1$invokeSuspend$$inlined$map$2$2$1(this, continuation);
                Object obj32 = installAttributer$setup$1$1$invokeSuspend$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = installAttributer$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                if (i2 != 0) {
                }
                return Unit.INSTANCE;
        }
    }
}
