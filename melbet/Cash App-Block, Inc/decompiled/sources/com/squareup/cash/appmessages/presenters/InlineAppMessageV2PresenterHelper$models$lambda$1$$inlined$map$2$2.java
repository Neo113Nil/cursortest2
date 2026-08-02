package com.squareup.cash.appmessages.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.appmessages.db.InlineMessageV2;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.protos.franklin.ui.UiAvatar;
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
public final class InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$2$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ DisclosurePresenter this$0;

    /* renamed from: com.squareup.cash.appmessages.presenters.InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$2$2$1, reason: invalid class name */
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
            return InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$2$2.this.emit(null, this);
        }
    }

    public /* synthetic */ InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$2$2(FlowCollector flowCollector, DisclosurePresenter disclosurePresenter, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.this$0 = disclosurePresenter;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0155  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$1$2$1 inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$1$2$1;
        int i2;
        InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$2$2$1 inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$2$2$1;
        int i3;
        InlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1 inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1;
        int i4;
        InlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filter$1$2$1 inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filter$1$2$1;
        int i5;
        InlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filter$1$2$1 inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filter$1$2$1;
        int i6;
        int i7 = this.$r8$classId;
        DisclosurePresenter disclosurePresenter = this.this$0;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        switch (i7) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i8 = anonymousClass1.label;
                    if ((i8 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i8 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            InlineMessageV2 inlineMessageV2 = (InlineMessageV2) obj;
                            String str = inlineMessageV2.messageToken;
                            disclosurePresenter.navigator = str;
                            String emptyAsNull = Strings.emptyAsNull(inlineMessageV2.title);
                            String str2 = inlineMessageV2.subtitle;
                            String emptyAsNull2 = Strings.emptyAsNull(str2 != null ? StringsKt__StringsJVMKt.replace$default(str2, "\u2028", "\n") : null);
                            UiAvatar uiAvatar = inlineMessageV2.avatar;
                            uiAvatar.getClass();
                            InlineAppMessageV2ViewModel.Ready ready = new InlineAppMessageV2ViewModel.Ready(str, uiAvatar, emptyAsNull, emptyAsNull2, inlineMessageV2.url, inlineMessageV2.priority, null);
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
            case 1:
                if (continuation instanceof InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$1$2$1) {
                    inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$1$2$1 = (InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$1$2$1) continuation;
                    int i9 = inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$1$2$1.label;
                    if ((i9 & PKIFailureInfo.systemUnavail) != 0) {
                        inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$1$2$1.label = i9 - PKIFailureInfo.systemUnavail;
                        Object obj3 = inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            InlineMessageV2 inlineMessageV22 = (InlineMessageV2) obj;
                            if (inlineMessageV22 == null || !Intrinsics.areEqual(inlineMessageV22.messageToken, (String) disclosurePresenter.navigator)) {
                                inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$1$2$1) == coroutineSingletons3) {
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
                inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$1$2$1 = new InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$1$2$1(this, continuation);
                Object obj32 = inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$1$2$1.label;
                if (i2 != 0) {
                }
                break;
            case 2:
                if (continuation instanceof InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$2$2$1) {
                    inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$2$2$1 = (InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$2$2$1) continuation;
                    int i10 = inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$2$2$1.label;
                    if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                        inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$2$2$1.label = i10 - PKIFailureInfo.systemUnavail;
                        Object obj4 = inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$2$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$2$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            InlineMessageV2 inlineMessageV23 = (InlineMessageV2) obj;
                            String str3 = (String) disclosurePresenter.navigator;
                            if (str3 == null || Intrinsics.areEqual(inlineMessageV23.messageToken, str3)) {
                                inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$2$2$1.label = 1;
                                if (flowCollector.emit(obj, inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$2$2$1) == coroutineSingletons4) {
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
                inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$2$2$1 = new InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$2$2$1(this, continuation);
                Object obj42 = inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$2$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$filter$2$2$1.label;
                if (i3 != 0) {
                }
                break;
            case 3:
                if (continuation instanceof InlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1) {
                    inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1 = (InlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i11 = inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                        inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.label = i11 - PKIFailureInfo.systemUnavail;
                        Object obj5 = inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            InlineAppMessageV2ViewModel.Ready ready2 = ((AppMessageViewEvent.AppMessageTemporarilyDismiss) obj).inlineMessage;
                            if (Intrinsics.areEqual(ready2 != null ? ready2.messageToken : null, (String) disclosurePresenter.navigator)) {
                                inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons5) {
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
                inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1 = new InlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj52 = inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i4 != 0) {
                }
            case 4:
                if (continuation instanceof InlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filter$1$2$1) {
                    inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filter$1$2$1 = (InlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i12 = inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                        inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filter$1$2$1.label = i12 - PKIFailureInfo.systemUnavail;
                        Object obj6 = inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            if (Intrinsics.areEqual(((AppMessageViewEvent.AppMessageActionTaken) obj).messageToken, (String) disclosurePresenter.navigator)) {
                                inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons6) {
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
                inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filter$1$2$1 = new InlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj62 = inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i5 != 0) {
                }
            default:
                if (continuation instanceof InlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filter$1$2$1) {
                    inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filter$1$2$1 = (InlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i13 = inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i13 & PKIFailureInfo.systemUnavail) != 0) {
                        inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filter$1$2$1.label = i13 - PKIFailureInfo.systemUnavail;
                        Object obj7 = inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            if (Intrinsics.areEqual(((AppMessageViewEvent.AppMessageViewed) obj).messageToken, (String) disclosurePresenter.navigator)) {
                                inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons7) {
                                    break;
                                }
                            }
                        } else if (i6 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj7);
                        }
                        break;
                    }
                }
                inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filter$1$2$1 = new InlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj72 = inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i6 != 0) {
                }
        }
        return Unit.INSTANCE;
    }
}
