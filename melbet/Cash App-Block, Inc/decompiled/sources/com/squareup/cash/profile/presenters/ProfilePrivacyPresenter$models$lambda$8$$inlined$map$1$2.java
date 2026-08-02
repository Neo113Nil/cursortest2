package com.squareup.cash.profile.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.presenters.applet.graph.BitcoinGraphWidgetPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ProfilePrivacyPresenter$models$lambda$8$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;

    /* renamed from: com.squareup.cash.profile.presenters.ProfilePrivacyPresenter$models$lambda$8$$inlined$map$1$2$1, reason: invalid class name */
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
            return ProfilePrivacyPresenter$models$lambda$8$$inlined$map$1$2.this.emit(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        BitcoinGraphWidgetPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1 bitcoinGraphWidgetPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1;
        int i2;
        ProfilePrivacyPresenter$models$lambda$8$$inlined$filterIsInstance$1$2$1 profilePrivacyPresenter$models$lambda$8$$inlined$filterIsInstance$1$2$1;
        int i3;
        switch (this.$r8$classId) {
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
                            obj.getClass();
                            a$$ExternalSyntheticBUOutline0.m$1();
                            return null;
                        }
                        if (i == 1) {
                            SafeTrace.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj22 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
            case 1:
                if (continuation instanceof BitcoinGraphWidgetPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1) {
                    bitcoinGraphWidgetPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1 = (BitcoinGraphWidgetPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1) continuation;
                    int i5 = bitcoinGraphWidgetPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        bitcoinGraphWidgetPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj3 = bitcoinGraphWidgetPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = bitcoinGraphWidgetPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.label;
                        if (i2 != 0 || i2 == 1) {
                            SafeTrace.throwOnFailure(obj3);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                bitcoinGraphWidgetPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1 = new BitcoinGraphWidgetPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj32 = bitcoinGraphWidgetPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = bitcoinGraphWidgetPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.label;
                if (i2 != 0) {
                }
                SafeTrace.throwOnFailure(obj32);
                return Unit.INSTANCE;
            case 2:
                if (obj == null) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new ClassCastException();
            case 3:
                return Unit.INSTANCE;
            default:
                if (continuation instanceof ProfilePrivacyPresenter$models$lambda$8$$inlined$filterIsInstance$1$2$1) {
                    profilePrivacyPresenter$models$lambda$8$$inlined$filterIsInstance$1$2$1 = (ProfilePrivacyPresenter$models$lambda$8$$inlined$filterIsInstance$1$2$1) continuation;
                    int i6 = profilePrivacyPresenter$models$lambda$8$$inlined$filterIsInstance$1$2$1.label;
                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePrivacyPresenter$models$lambda$8$$inlined$filterIsInstance$1$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                        Object obj4 = profilePrivacyPresenter$models$lambda$8$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = profilePrivacyPresenter$models$lambda$8$$inlined$filterIsInstance$1$2$1.label;
                        if (i3 != 0 || i3 == 1) {
                            SafeTrace.throwOnFailure(obj4);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                profilePrivacyPresenter$models$lambda$8$$inlined$filterIsInstance$1$2$1 = new ProfilePrivacyPresenter$models$lambda$8$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj42 = profilePrivacyPresenter$models$lambda$8$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = profilePrivacyPresenter$models$lambda$8$$inlined$filterIsInstance$1$2$1.label;
                if (i3 != 0) {
                }
                SafeTrace.throwOnFailure(obj42);
                return Unit.INSTANCE;
        }
    }
}
