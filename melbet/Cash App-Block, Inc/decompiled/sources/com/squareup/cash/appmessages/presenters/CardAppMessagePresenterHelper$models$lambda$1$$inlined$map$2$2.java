package com.squareup.cash.appmessages.presenters;

import androidx.camera.core.impl.CameraCaptureCallbacks;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.appmessages.db.CardMessage;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
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
public final class CardAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ CardStudioPresenter this$0;

    /* renamed from: com.squareup.cash.appmessages.presenters.CardAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2$1, reason: invalid class name */
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
            return CardAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2.this.emit(null, this);
        }
    }

    public /* synthetic */ CardAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2(FlowCollector flowCollector, CardStudioPresenter cardStudioPresenter, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.this$0 = cardStudioPresenter;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0153  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        AppMessageImage appMessageImage;
        AppMessageImage asAppMessageImage;
        CardAppMessageViewModel.Ready ready;
        CardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1 cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1;
        int i2;
        CardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$2$2$1 cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$2$2$1;
        int i3;
        CardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1 cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1;
        int i4;
        CardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1 cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1;
        int i5;
        int i6 = this.$r8$classId;
        CardStudioPresenter cardStudioPresenter = this.this$0;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        switch (i6) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i7 = anonymousClass1.label;
                    if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i7 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            CardMessage cardMessage = (CardMessage) obj;
                            String str = cardMessage.messageToken;
                            cardStudioPresenter.cardStudioQueries = str;
                            String str2 = cardMessage.title;
                            str2.getClass();
                            String str3 = cardMessage.subtitle;
                            String emptyAsNull = Strings.emptyAsNull(str3 != null ? StringsKt__StringsJVMKt.replace$default(str3, "\u2028", "\n") : null);
                            Animation animation = cardMessage.animation;
                            if (animation == null || (asAppMessageImage = CameraCaptureCallbacks.asAppMessageImage(animation)) == null) {
                                Image image = cardMessage.image;
                                if (image == null) {
                                    appMessageImage = null;
                                    int i8 = cardMessage.priority;
                                    String str4 = cardMessage.messageToken;
                                    AppMessageAction appMessageAction = cardMessage.primaryNavigationAction;
                                    appMessageAction.getClass();
                                    ready = new CardAppMessageViewModel.Ready(str, appMessageImage, str2, emptyAsNull, i8, RealAppMessageActionPresenterHelper.viewModelActions(str4, false, appMessageAction, null), 64);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(ready, anonymousClass1) == coroutineSingletons) {
                                        break;
                                    }
                                } else {
                                    asAppMessageImage = CameraCaptureCallbacks.asAppMessageImage(image, false);
                                }
                            }
                            appMessageImage = asAppMessageImage;
                            int i82 = cardMessage.priority;
                            String str42 = cardMessage.messageToken;
                            AppMessageAction appMessageAction2 = cardMessage.primaryNavigationAction;
                            appMessageAction2.getClass();
                            ready = new CardAppMessageViewModel.Ready(str, appMessageImage, str2, emptyAsNull, i82, RealAppMessageActionPresenterHelper.viewModelActions(str42, false, appMessageAction2, null), 64);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(ready, anonymousClass1) == coroutineSingletons) {
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
                if (continuation instanceof CardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1) {
                    cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1 = (CardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1) continuation;
                    int i9 = cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1.label;
                    if ((i9 & PKIFailureInfo.systemUnavail) != 0) {
                        cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1.label = i9 - PKIFailureInfo.systemUnavail;
                        Object obj3 = cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            CardMessage cardMessage2 = (CardMessage) obj;
                            if (cardMessage2 == null || !Intrinsics.areEqual(cardMessage2.messageToken, (String) cardStudioPresenter.cardStudioQueries)) {
                                cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1) == coroutineSingletons3) {
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
                cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1 = new CardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1(this, continuation);
                Object obj32 = cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1.label;
                if (i2 != 0) {
                }
                break;
            case 2:
                if (continuation instanceof CardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$2$2$1) {
                    cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$2$2$1 = (CardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$2$2$1) continuation;
                    int i10 = cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$2$2$1.label;
                    if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                        cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$2$2$1.label = i10 - PKIFailureInfo.systemUnavail;
                        Object obj4 = cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$2$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$2$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            CardMessage cardMessage3 = (CardMessage) obj;
                            String str5 = (String) cardStudioPresenter.cardStudioQueries;
                            if (str5 == null || Intrinsics.areEqual(cardMessage3.messageToken, str5)) {
                                cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$2$2$1.label = 1;
                                if (flowCollector.emit(obj, cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$2$2$1) == coroutineSingletons4) {
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
                cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$2$2$1 = new CardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$2$2$1(this, continuation);
                Object obj42 = cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$2$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = cardAppMessagePresenterHelper$models$lambda$1$$inlined$filter$2$2$1.label;
                if (i3 != 0) {
                }
                break;
            case 3:
                if (continuation instanceof CardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1) {
                    cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1 = (CardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i11 = cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                        cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1.label = i11 - PKIFailureInfo.systemUnavail;
                        Object obj5 = cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            if (Intrinsics.areEqual(((AppMessageViewEvent.AppMessageActionTaken) obj).messageToken, (String) cardStudioPresenter.cardStudioQueries)) {
                                cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons5) {
                                    break;
                                }
                            }
                        } else if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                        }
                        break;
                    }
                }
                cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1 = new CardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj52 = cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i4 != 0) {
                }
            default:
                if (continuation instanceof CardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1) {
                    cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1 = (CardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i12 = cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                        cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.label = i12 - PKIFailureInfo.systemUnavail;
                        Object obj6 = cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            if (Intrinsics.areEqual(((AppMessageViewEvent.AppMessageViewed) obj).messageToken, (String) cardStudioPresenter.cardStudioQueries)) {
                                cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons6) {
                                    break;
                                }
                            }
                        } else if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj6);
                        }
                        break;
                    }
                }
                cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1 = new CardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj62 = cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i5 != 0) {
                }
        }
        return Unit.INSTANCE;
    }
}
