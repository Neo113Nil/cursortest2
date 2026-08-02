package com.squareup.cash.appmessages.presenters;

import androidx.camera.core.impl.CameraCaptureCallbacks;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.InlineAppMessageViewModel;
import com.squareup.cash.appmessages.db.InlineMessage;
import com.squareup.cash.appmessages.treehouse.AndroidAppMessagingService;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.protos.cash.messagingplatformcommon.app.Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.Image;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class InlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ DisclosurePresenter this$0;

    /* renamed from: com.squareup.cash.appmessages.presenters.InlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2$1, reason: invalid class name */
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
            return InlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2.this.emit(null, this);
        }
    }

    public /* synthetic */ InlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2(FlowCollector flowCollector, DisclosurePresenter disclosurePresenter, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.this$0 = disclosurePresenter;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cc  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        AppMessageImage asAppMessageImage;
        AppMessageImage.Animated asAppMessageImage2;
        InlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1 inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1;
        int i2;
        InlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1 inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1;
        int i3;
        int i4 = this.$r8$classId;
        DisclosurePresenter disclosurePresenter = this.this$0;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        switch (i4) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i5 = anonymousClass1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            InlineMessage inlineMessage = (InlineMessage) obj;
                            ((AndroidAppMessagingService) disclosurePresenter.appService).notifyBuffer.mo1159trySendJP2dKIU(Boolean.TRUE);
                            String str = inlineMessage.messageToken;
                            String emptyAsNull = Strings.emptyAsNull(inlineMessage.title);
                            String str2 = inlineMessage.subtitle;
                            String emptyAsNull2 = Strings.emptyAsNull(str2 != null ? StringsKt__StringsJVMKt.replace$default(str2, "\u2028", "\n") : null);
                            Animation animation = inlineMessage.animation;
                            if (animation == null || (asAppMessageImage2 = CameraCaptureCallbacks.asAppMessageImage(animation)) == null) {
                                Image image = inlineMessage.image;
                                asAppMessageImage = image != null ? CameraCaptureCallbacks.asAppMessageImage(image, false) : null;
                            } else {
                                asAppMessageImage = asAppMessageImage2;
                            }
                            int i6 = inlineMessage.priority;
                            String str3 = inlineMessage.messageToken;
                            boolean z = !inlineMessage.cannotBeDismissed;
                            AppMessageAction appMessageAction = inlineMessage.primaryNavigationAction;
                            appMessageAction.getClass();
                            InlineAppMessageViewModel.Ready ready = new InlineAppMessageViewModel.Ready(str, asAppMessageImage, emptyAsNull, emptyAsNull2, i6, RealAppMessageActionPresenterHelper.viewModelActions(str3, z, appMessageAction, inlineMessage.secondaryNavigationAction));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(ready, anonymousClass1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj2);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj22 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
                break;
            case 1:
                if (continuation instanceof InlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1) {
                    inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1 = (InlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i7 = inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                        inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                        Object obj3 = inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            if (Intrinsics.areEqual(((AppMessageViewEvent.AppMessageActionTaken) obj).messageToken, (String) disclosurePresenter.navigator)) {
                                inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons3) {
                                    break;
                                }
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                        }
                        break;
                    }
                }
                inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1 = new InlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj32 = inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i2 != 0) {
                }
            default:
                if (continuation instanceof InlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1) {
                    inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1 = (InlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i8 = inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i8 & PKIFailureInfo.systemUnavail) != 0) {
                        inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.label = i8 - PKIFailureInfo.systemUnavail;
                        Object obj4 = inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            if (Intrinsics.areEqual(((AppMessageViewEvent.AppMessageViewed) obj).messageToken, (String) disclosurePresenter.navigator)) {
                                inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons4) {
                                    break;
                                }
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                        }
                        break;
                    }
                }
                inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1 = new InlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj42 = inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i3 != 0) {
                }
        }
        return Unit.INSTANCE;
    }
}
