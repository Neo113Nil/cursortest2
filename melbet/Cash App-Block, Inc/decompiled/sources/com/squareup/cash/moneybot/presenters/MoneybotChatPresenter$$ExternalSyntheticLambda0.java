package com.squareup.cash.moneybot.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.cdf.moneybot.MoneybotFeedbackDismiss;
import com.squareup.cash.cdf.moneybot.MoneybotFeedbackSubmit;
import com.squareup.cash.maps.presenter.CashMapPresenter$models$3$1;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackAnswer;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackOption;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackQuestion;
import com.squareup.cash.moneybot.screens.ThumbDirection;
import com.squareup.protos.cash.kgoose.api.v3.FeedbackType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneybotChatPresenter$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MoneybotChatPresenter f$0;

    public /* synthetic */ MoneybotChatPresenter$$ExternalSyntheticLambda0(MoneybotChatPresenter moneybotChatPresenter, int i) {
        this.$r8$classId = i;
        this.f$0 = moneybotChatPresenter;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String lowerCase;
        String str;
        FeedbackType feedbackType;
        int i = this.$r8$classId;
        MoneybotChatPresenter moneybotChatPresenter = this.f$0;
        int i2 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                MoneybotChatPresenter moneybotChatPresenter2 = this.f$0;
                RealMoneybotAnalyticsService realMoneybotAnalyticsService = moneybotChatPresenter2.analyticsService;
                MoneybotFeedbackQuestion moneybotFeedbackQuestion = (MoneybotFeedbackQuestion) obj;
                MoneybotFeedbackAnswer moneybotFeedbackAnswer = (MoneybotFeedbackAnswer) obj2;
                moneybotFeedbackQuestion.getClass();
                ThumbDirection thumbDirection = moneybotFeedbackQuestion.previousDirection;
                Continuation continuation2 = null;
                if (!(moneybotFeedbackAnswer instanceof MoneybotFeedbackAnswer.Submitted)) {
                    if (!(moneybotFeedbackAnswer instanceof MoneybotFeedbackAnswer.Dismissed)) {
                        if (moneybotFeedbackAnswer != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            String str2 = moneybotFeedbackQuestion.sessionId;
                            String str3 = moneybotFeedbackQuestion.messageId;
                            com.squareup.cash.cdf.moneybot.FeedbackType access$toCdfFeedbackType = MoneybotChatPresenterKt.access$toCdfFeedbackType(moneybotFeedbackQuestion.direction);
                            str3.getClass();
                            realMoneybotAnalyticsService.analytics.track(new MoneybotFeedbackDismiss(str2, str3, access$toCdfFeedbackType), null);
                            moneybotChatPresenter2.updateThumbState(str3, MoneybotChatPresenterKt.access$toThumbState(thumbDirection));
                        }
                    } else {
                        MoneybotFeedbackAnswer.Dismissed dismissed = (MoneybotFeedbackAnswer.Dismissed) moneybotFeedbackAnswer;
                        String str4 = dismissed.messageId;
                        String str5 = dismissed.sessionId;
                        com.squareup.cash.cdf.moneybot.FeedbackType access$toCdfFeedbackType2 = MoneybotChatPresenterKt.access$toCdfFeedbackType(dismissed.direction);
                        str4.getClass();
                        realMoneybotAnalyticsService.analytics.track(new MoneybotFeedbackDismiss(str5, str4, access$toCdfFeedbackType2), null);
                        moneybotChatPresenter2.updateThumbState(str4, MoneybotChatPresenterKt.access$toThumbState(thumbDirection));
                    }
                } else {
                    MoneybotFeedbackAnswer.Submitted submitted = (MoneybotFeedbackAnswer.Submitted) moneybotFeedbackAnswer;
                    ThumbDirection thumbDirection2 = submitted.direction;
                    JobKt.launch$default(moneybotChatPresenter2.scope, null, null, new CashMapPresenter$models$3$1(moneybotChatPresenter2, moneybotFeedbackAnswer, MoneybotChatPresenterKt.access$toThumbState(thumbDirection2), continuation2, 20), 3);
                    MoneybotFeedbackOption moneybotFeedbackOption = submitted.option;
                    if (moneybotFeedbackOption == null) {
                        str = null;
                    } else {
                        if (!(moneybotFeedbackOption instanceof MoneybotFeedbackOption.Positive)) {
                            if (!(moneybotFeedbackOption instanceof MoneybotFeedbackOption.Negative)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                lowerCase = ((MoneybotFeedbackOption.Negative) moneybotFeedbackOption).name().toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            }
                        } else {
                            lowerCase = ((MoneybotFeedbackOption.Positive) moneybotFeedbackOption).name().toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                        str = lowerCase;
                    }
                    String str6 = submitted.comment;
                    if (StringsKt.isBlank(str6)) {
                        str6 = null;
                    }
                    String str7 = submitted.sessionId;
                    String str8 = submitted.messageId;
                    com.squareup.cash.cdf.moneybot.FeedbackType access$toCdfFeedbackType3 = MoneybotChatPresenterKt.access$toCdfFeedbackType(thumbDirection2);
                    boolean z = str6 != null;
                    str8.getClass();
                    realMoneybotAnalyticsService.analytics.track(new MoneybotFeedbackSubmit(str7, str8, access$toCdfFeedbackType3, str, Boolean.valueOf(z)), null);
                    String str9 = submitted.sessionId;
                    String str10 = submitted.messageId;
                    int ordinal = thumbDirection2.ordinal();
                    if (ordinal == 0) {
                        feedbackType = FeedbackType.FEEDBACK_TYPE_THUMBS_UP;
                    } else if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        feedbackType = FeedbackType.FEEDBACK_TYPE_THUMBS_DOWN;
                    }
                    moneybotChatPresenter2.submitFeedback(str9, str10, feedbackType, str, str6);
                }
                break;
            case 1:
                String str11 = (String) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                str11.getClass();
                moneybotChatPresenter.pluginMessages.tryEmit(new MoneybotChatPresenter.PluginMessage(str11, booleanValue));
                break;
            default:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                } else if (((Boolean) moneybotChatPresenter.hasTriggeredMemoryTooltipFetch$delegate.getValue()).booleanValue()) {
                    gapComposer.startReplaceGroup(1601037370);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1600879766);
                    Unit unit = Unit.INSTANCE;
                    boolean changed = gapComposer.changed(moneybotChatPresenter);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new MoneybotChatPresenter$models$3$1(moneybotChatPresenter, continuation, i2);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
                    gapComposer.end(false);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
