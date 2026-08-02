package com.squareup.cash.payments.presenters;

import android.graphics.RectF;
import android.text.Layout;
import androidx.camera.video.Recorder;
import androidx.compose.ui.scrollcapture.RelativeScroller;
import androidx.compose.ui.text.android.LayoutHelper$BidiRun;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.SegmentFinder;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import coil3.ComponentRegistry;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.card.spendinginsights.activity.SpendingInsightsActivityRequestHandler;
import com.squareup.cash.cdf.asset.AssetRequestTapReviewPaymentScreenElement;
import com.squareup.cash.cdf.asset.AssetSendAddRecipient;
import com.squareup.cash.cdf.asset.AssetSendPersonalizationButtonSparkled;
import com.squareup.cash.cdf.asset.AssetSendTapReviewPaymentScreenElement;
import com.squareup.cash.cdf.asset.AssetSendViewRecipient;
import com.squareup.cash.cdf.asset.EntryPoint;
import com.squareup.cash.cdf.asset.ExperienceType;
import com.squareup.cash.cdf.asset.InstrumentType;
import com.squareup.cash.cdf.asset.Origin;
import com.squareup.cash.cdf.asset.PersonalizationSparkleReason;
import com.squareup.cash.cdf.asset.ReviewPaymentElementType;
import com.squareup.cash.cdf.asset.ScheduleFrequency;
import com.squareup.cash.cdf.asset.ScreenName;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.payments.common.PaymentScheduleFrequency;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.recipients.backend.api.SuggestionStrategy;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.common.Orientation;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.text.Bidi;
import java.time.DayOfWeek;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes6.dex */
public abstract class AnalyticsHelperKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[SuggestionStrategy.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SuggestionStrategy suggestionStrategy = SuggestionStrategy.CONTACTS_ON_CASH;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SuggestionStrategy suggestionStrategy2 = SuggestionStrategy.CONTACTS_ON_CASH;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SuggestionStrategy suggestionStrategy3 = SuggestionStrategy.CONTACTS_ON_CASH;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                SuggestionStrategy suggestionStrategy4 = SuggestionStrategy.CONTACTS_ON_CASH;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                SuggestionStrategy suggestionStrategy5 = SuggestionStrategy.CONTACTS_ON_CASH;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Orientation.values().length];
            try {
                iArr2[Orientation.CASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Orientation.BILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PaymentScheduleFrequency.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                PaymentScheduleFrequency paymentScheduleFrequency = PaymentScheduleFrequency.WEEKLY;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                PaymentScheduleFrequency paymentScheduleFrequency2 = PaymentScheduleFrequency.WEEKLY;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr4 = new int[DayOfWeek.values().length];
            try {
                iArr4[DayOfWeek.SUNDAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[DayOfWeek.MONDAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[DayOfWeek.TUESDAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[DayOfWeek.WEDNESDAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[DayOfWeek.THURSDAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[DayOfWeek.FRIDAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[DayOfWeek.SATURDAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[CashInstrumentType.values().length];
            try {
                iArr5[CashInstrumentType.CASH_BALANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[CashInstrumentType.BANK_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[CashInstrumentType.DEBIT_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[CashInstrumentType.CREDIT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[CashInstrumentType.GOOGLE_PAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[CashInstrumentType.APPLE_PAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[CashInstrumentType.LINE_OF_CREDIT.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[CashInstrumentType.EBT.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[CashInstrumentType.STABLECOIN_WALLET.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public static final float getCharacterRightBounds(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static final int[] getRangeForRect(TextLayout textLayout, Layout layout, ComponentRegistry.Builder builder, RectF rectF, int i, HintHandler$$ExternalSyntheticLambda0 hintHandler$$ExternalSyntheticLambda0) {
        int i2;
        int i3 = 21;
        SegmentFinder anonymousClass4 = i == 1 ? new Recorder.AnonymousClass4(textLayout.layout.getText(), textLayout.getWordIterator(), false, i3) : new Recorder.AnonymousClass1(i3, textLayout.layout.getText(), textLayout.textPaint);
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > textLayout.getLineBottom(lineForVertical) && (lineForVertical = lineForVertical + 1) >= textLayout.lineCount) {
            return null;
        }
        int i4 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < textLayout.getLineTop(0)) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, builder, i4, rectF, anonymousClass4, hintHandler$$ExternalSyntheticLambda0, true);
        while (true) {
            i2 = i4;
            if (startOrEndOffsetForRectWithinLine != -1 || i2 >= lineForVertical2) {
                break;
            }
            i4 = i2 + 1;
            startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, builder, i4, rectF, anonymousClass4, hintHandler$$ExternalSyntheticLambda0, true);
        }
        if (startOrEndOffsetForRectWithinLine == -1) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, builder, lineForVertical2, rectF, anonymousClass4, hintHandler$$ExternalSyntheticLambda0, false);
        while (startOrEndOffsetForRectWithinLine2 == -1 && i2 < lineForVertical2) {
            int i5 = lineForVertical2 - 1;
            startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, builder, i5, rectF, anonymousClass4, hintHandler$$ExternalSyntheticLambda0, false);
            lineForVertical2 = i5;
        }
        if (startOrEndOffsetForRectWithinLine2 == -1) {
            return null;
        }
        return new int[]{anonymousClass4.previousStartBoundary(startOrEndOffsetForRectWithinLine + 1), anonymousClass4.nextEndBoundary(startOrEndOffsetForRectWithinLine2 - 1)};
    }

    public static final int getStartOrEndOffsetForRectWithinLine(TextLayout textLayout, Layout layout, ComponentRegistry.Builder builder, int i, RectF rectF, SegmentFinder segmentFinder, HintHandler$$ExternalSyntheticLambda0 hintHandler$$ExternalSyntheticLambda0, boolean z) {
        LayoutHelper$BidiRun[] layoutHelper$BidiRunArr;
        LayoutHelper$BidiRun[] layoutHelper$BidiRunArr2;
        int i2;
        int i3;
        int nextEndBoundary;
        int i4;
        int i5;
        int previousStartBoundary;
        Bidi createLineBidi;
        boolean z2;
        float f;
        float f2;
        float f3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i6 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i6];
        Layout layout2 = textLayout.layout;
        int lineStart2 = layout2.getLineStart(i);
        int lineEnd2 = textLayout.getLineEnd(i);
        if (i6 < (lineEnd2 - lineStart2) * 2) {
            InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        RelativeScroller relativeScroller = new RelativeScroller(textLayout);
        boolean z3 = false;
        boolean z4 = layout2.getParagraphDirection(i) == 1;
        int i7 = 0;
        while (lineStart2 < lineEnd2) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z4 && !isRtlCharAt) {
                f = relativeScroller.get(lineStart2, z3, z3, true);
                f3 = relativeScroller.get(lineStart2 + 1, true, true, true);
                z2 = z4;
            } else if (z4 && isRtlCharAt) {
                z2 = z4;
                f3 = relativeScroller.get(lineStart2, false, false, false);
                f = relativeScroller.get(lineStart2 + 1, true, true, false);
            } else {
                z2 = z4;
                if (isRtlCharAt) {
                    f2 = relativeScroller.get(lineStart2, false, false, true);
                    f = relativeScroller.get(lineStart2 + 1, true, true, true);
                } else {
                    f = relativeScroller.get(lineStart2, false, false, false);
                    f2 = relativeScroller.get(lineStart2 + 1, true, true, false);
                }
                f3 = f2;
            }
            fArr[i7] = f;
            fArr[i7 + 1] = f3;
            i7 += 2;
            lineStart2++;
            z4 = z2;
            z3 = false;
        }
        Layout layout3 = (Layout) builder.keyers;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd3 = layout3.getLineEnd(i);
        int paragraphForOffset = builder.getParagraphForOffset(lineStart3, false);
        int paragraphStart = builder.getParagraphStart(paragraphForOffset);
        int i8 = lineStart3 - paragraphStart;
        int i9 = lineEnd3 - paragraphStart;
        Bidi analyzeBidi = builder.analyzeBidi(paragraphForOffset);
        if (analyzeBidi == null || (createLineBidi = analyzeBidi.createLineBidi(i8, i9)) == null) {
            layoutHelper$BidiRunArr = new LayoutHelper$BidiRun[]{new LayoutHelper$BidiRun(lineStart3, lineEnd3, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = createLineBidi.getRunCount();
            layoutHelper$BidiRunArr = new LayoutHelper$BidiRun[runCount];
            int i10 = 0;
            while (i10 < runCount) {
                int i11 = runCount;
                layoutHelper$BidiRunArr[i10] = new LayoutHelper$BidiRun(createLineBidi.getRunStart(i10) + lineStart3, createLineBidi.getRunLimit(i10) + lineStart3, createLineBidi.getRunLevel(i10) % 2 == 1);
                i10++;
                runCount = i11;
            }
        }
        IntProgression intRange = z ? new IntRange(0, layoutHelper$BidiRunArr.length - 1, 1) : RangesKt___RangesKt.downTo(layoutHelper$BidiRunArr.length - 1, 0);
        int i12 = intRange.first;
        int i13 = intRange.last;
        int i14 = intRange.step;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return -1;
        }
        while (true) {
            LayoutHelper$BidiRun layoutHelper$BidiRun = layoutHelper$BidiRunArr[i12];
            boolean z5 = layoutHelper$BidiRun.isRtl;
            int i15 = layoutHelper$BidiRun.start;
            int i16 = layoutHelper$BidiRun.end;
            float f4 = z5 ? fArr[((i16 - 1) - lineStart) * 2] : fArr[(i15 - lineStart) * 2];
            float characterRightBounds = z5 ? getCharacterRightBounds(i15, lineStart, fArr) : getCharacterRightBounds(i16 - 1, lineStart, fArr);
            float f5 = rectF.left;
            int i17 = i14;
            if (z) {
                if (characterRightBounds >= f5) {
                    float f6 = rectF.right;
                    if (f4 <= f6) {
                        if ((z5 || f5 > f4) && (!z5 || f6 < characterRightBounds)) {
                            int i18 = i16;
                            int i19 = i15;
                            while (true) {
                                i4 = i18;
                                if (i18 - i19 <= 1) {
                                    break;
                                }
                                int i20 = (i4 + i19) / 2;
                                float f7 = fArr[(i20 - lineStart) * 2];
                                if ((z5 || f7 <= rectF.left) && (!z5 || f7 >= rectF.right)) {
                                    i18 = i4;
                                    i19 = i20;
                                } else {
                                    i18 = i20;
                                }
                            }
                            i5 = z5 ? i4 : i19;
                        } else {
                            i5 = i15;
                        }
                        int nextEndBoundary2 = segmentFinder.nextEndBoundary(i5);
                        if (nextEndBoundary2 != -1 && (previousStartBoundary = segmentFinder.previousStartBoundary(nextEndBoundary2)) < i16) {
                            if (previousStartBoundary >= i15) {
                                i15 = previousStartBoundary;
                            }
                            if (nextEndBoundary2 > i16) {
                                nextEndBoundary2 = i16;
                            }
                            layoutHelper$BidiRunArr2 = layoutHelper$BidiRunArr;
                            RectF rectF2 = new RectF(RecyclerView.DECELERATION_RATE, lineTop, RecyclerView.DECELERATION_RATE, lineBottom);
                            int i21 = nextEndBoundary2;
                            while (true) {
                                rectF2.left = z5 ? fArr[((i21 - 1) - lineStart) * 2] : fArr[(i15 - lineStart) * 2];
                                rectF2.right = z5 ? getCharacterRightBounds(i15, lineStart, fArr) : getCharacterRightBounds(i21 - 1, lineStart, fArr);
                                if (!((Boolean) hintHandler$$ExternalSyntheticLambda0.invoke(rectF2, rectF)).booleanValue()) {
                                    i15 = segmentFinder.nextStartBoundary(i15);
                                    if (i15 == -1 || i15 >= i16) {
                                        break;
                                    }
                                    i21 = segmentFinder.nextEndBoundary(i15);
                                    if (i21 > i16) {
                                        i21 = i16;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i15 = -1;
                        }
                    }
                }
                layoutHelper$BidiRunArr2 = layoutHelper$BidiRunArr;
                i15 = -1;
            } else {
                layoutHelper$BidiRunArr2 = layoutHelper$BidiRunArr;
                if (characterRightBounds >= f5) {
                    float f8 = rectF.right;
                    if (f4 <= f8) {
                        if ((z5 || f8 < characterRightBounds) && (!z5 || f5 > f4)) {
                            int i22 = i16;
                            int i23 = i15;
                            while (i22 - i23 > 1) {
                                int i24 = (i22 + i23) / 2;
                                float f9 = fArr[(i24 - lineStart) * 2];
                                int i25 = i22;
                                if ((z5 || f9 <= rectF.right) && (!z5 || f9 >= rectF.left)) {
                                    i22 = i25;
                                    i23 = i24;
                                } else {
                                    i22 = i24;
                                }
                            }
                            i3 = z5 ? i22 : i23;
                        } else {
                            i3 = i16 - 1;
                        }
                        int previousStartBoundary2 = segmentFinder.previousStartBoundary(i3 + 1);
                        if (previousStartBoundary2 != -1 && (nextEndBoundary = segmentFinder.nextEndBoundary(previousStartBoundary2)) > i15) {
                            if (previousStartBoundary2 < i15) {
                                previousStartBoundary2 = i15;
                            }
                            if (nextEndBoundary <= i16) {
                                i16 = nextEndBoundary;
                            }
                            RectF rectF3 = new RectF(RecyclerView.DECELERATION_RATE, lineTop, RecyclerView.DECELERATION_RATE, lineBottom);
                            int i26 = previousStartBoundary2;
                            while (true) {
                                rectF3.left = z5 ? fArr[((i16 - 1) - lineStart) * 2] : fArr[(i26 - lineStart) * 2];
                                rectF3.right = z5 ? getCharacterRightBounds(i26, lineStart, fArr) : getCharacterRightBounds(i16 - 1, lineStart, fArr);
                                if (!((Boolean) hintHandler$$ExternalSyntheticLambda0.invoke(rectF3, rectF)).booleanValue()) {
                                    i16 = segmentFinder.previousEndBoundary(i16);
                                    if (i16 == -1 || i16 <= i15) {
                                        break;
                                    }
                                    i26 = segmentFinder.previousStartBoundary(i16);
                                    if (i26 < i15) {
                                        i26 = i15;
                                    }
                                } else {
                                    i2 = i16;
                                    break;
                                }
                            }
                        }
                    }
                }
                i2 = -1;
                i15 = i2;
            }
            if (i15 >= 0) {
                return i15;
            }
            if (i12 == i13) {
                return -1;
            }
            i12 += i17;
            i14 = i17;
            layoutHelper$BidiRunArr = layoutHelper$BidiRunArr2;
        }
    }

    public static final ActivitiesManager.ActivityContext spendingInsightsActivityContext(String str, SpendingInsightsActivityRequestHandler spendingInsightsActivityRequestHandler) {
        return new ActivitiesManager.ActivityContext(new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN, str, (String) null, 12), ActivityScope.SPENDING_INSIGHTS, spendingInsightsActivityRequestHandler, 8);
    }

    public static final com.squareup.cash.cdf.asset.DayOfWeek toCdfDayOfWeek(DayOfWeek dayOfWeek) {
        switch (WhenMappings.$EnumSwitchMapping$3[dayOfWeek.ordinal()]) {
            case 1:
                return com.squareup.cash.cdf.asset.DayOfWeek.SUNDAY;
            case 2:
                return com.squareup.cash.cdf.asset.DayOfWeek.MONDAY;
            case 3:
                return com.squareup.cash.cdf.asset.DayOfWeek.TUESDAY;
            case 4:
                return com.squareup.cash.cdf.asset.DayOfWeek.WEDNESDAY;
            case 5:
                return com.squareup.cash.cdf.asset.DayOfWeek.THURSDAY;
            case 6:
                return com.squareup.cash.cdf.asset.DayOfWeek.FRIDAY;
            case 7:
                return com.squareup.cash.cdf.asset.DayOfWeek.SATURDAY;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public static final ScheduleFrequency toCdfFrequency(PaymentScheduleFrequency paymentScheduleFrequency) {
        int ordinal = paymentScheduleFrequency.ordinal();
        if (ordinal == 0) {
            return ScheduleFrequency.WEEKLY;
        }
        if (ordinal == 1) {
            return ScheduleFrequency.BIWEEKLY;
        }
        if (ordinal == 2) {
            return ScheduleFrequency.MONTHLY;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final InstrumentType toCdfInstrumentType(CashInstrumentType cashInstrumentType) {
        cashInstrumentType.getClass();
        switch (WhenMappings.$EnumSwitchMapping$4[cashInstrumentType.ordinal()]) {
            case 1:
                return InstrumentType.CASH_BALANCE;
            case 2:
                return InstrumentType.BANK_ACCOUNT;
            case 3:
                return InstrumentType.DEBIT_CARD;
            case 4:
                return InstrumentType.CREDIT_CARD;
            case 5:
                return InstrumentType.GOOGLE_PAY;
            case 6:
                return InstrumentType.APPLE_PAY;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
            case 7:
            case 8:
            case 9:
                return null;
        }
    }

    public static final ScreenName toScreenName(PaymentConfigurationViewModel paymentConfigurationViewModel) {
        paymentConfigurationViewModel.getClass();
        if (paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.SelectRecipientMenu) {
            return ScreenName.RECIPIENT_SELECTION;
        }
        if (paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.SelectStablecoinWithdrawalOption) {
            return ScreenName.STABLECOIN_NETWORK_SELECTION;
        }
        if (paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.InputNote) {
            return ScreenName.INPUT_NOTE;
        }
        if (paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.InputAmount) {
            return ScreenName.AMOUNT_ENTRY;
        }
        if (paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.ReviewPayment) {
            return ScreenName.REVIEW_PAYMENT;
        }
        if (paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.RequestShareOption) {
            return ScreenName.SHARE_OPTIONS;
        }
        if (paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.Loading) {
            return ScreenName.LOADING;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final void trackPaymentAddStablecoinRecipient(Analytics analytics, String str, String str2, String str3, Origin origin) {
        str.getClass();
        str2.getClass();
        origin.getClass();
        ExperienceType experienceType = ExperienceType.BOTTOM_SHEET;
        AssetSendAddRecipient.RecipientType recipientType = AssetSendAddRecipient.RecipientType.STABLECOIN_ADDRESS;
        analytics.track(new AssetSendAddRecipient(null, null, null, str, null, null, null, null, null, null, origin, null, null, experienceType, str3, str2, 129007), null);
    }

    public static final void trackPaymentTapReviewPaymentScreenElement(Analytics analytics, Orientation orientation, String str, ReviewPaymentElementType reviewPaymentElementType, String str2) {
        orientation.getClass();
        str.getClass();
        int i = WhenMappings.$EnumSwitchMapping$1[orientation.ordinal()];
        if (i == 1) {
            analytics.track(new AssetSendTapReviewPaymentScreenElement(str, reviewPaymentElementType, str2), null);
        } else if (i == 2) {
            analytics.track(new AssetRequestTapReviewPaymentScreenElement(str, reviewPaymentElementType, str2), null);
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    public static final void trackPaymentViewStablecoinRecipient(Analytics analytics, String str, String str2, String str3, Origin origin) {
        str.getClass();
        str2.getClass();
        origin.getClass();
        ExperienceType experienceType = ExperienceType.BOTTOM_SHEET;
        AssetSendViewRecipient.RecipientType recipientType = AssetSendViewRecipient.RecipientType.STABLECOIN_ADDRESS;
        analytics.track(new AssetSendViewRecipient(null, null, null, str, origin, null, null, null, null, null, experienceType, str3, str2, 2023), null);
    }

    public static final void trackPersonalizationButtonSparkled(Analytics analytics, boolean z, boolean z2, String str, int i, PersonalizationSparkleReason personalizationSparkleReason, EntryPoint entryPoint, String str2) {
        str.getClass();
        str2.getClass();
        analytics.track(new AssetSendPersonalizationButtonSparkled(str2, Boolean.valueOf(z), Boolean.valueOf(z2), str, Integer.valueOf(i), personalizationSparkleReason, entryPoint), null);
    }
}
