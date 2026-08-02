package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.ui.text.font.FontWeight;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.card.spendinginsights.presenters.SpendingInsightDetailPresenterKt$loadInsight$1;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.payments.common.PaymentScheduleFrequency;
import com.squareup.cash.payments.screens.PaymentScheduleSelection;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.spendinginsights.CardSpendingInsightType;
import com.squareup.protos.cash.spendinginsights.appapi.GetCardSpendingInsightRequest;
import com.squareup.protos.cash.spendinginsights.appapi.GetCardSpendingInsightResponse;
import com.squareup.protos.cash.spendinginsights.appapi.SpendingInsightsAppService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public abstract class zzahj {
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable access$loadInsight(SpendingInsightsAppService spendingInsightsAppService, CardSpendingInsightType cardSpendingInsightType, String str, CaptureCheckFaceKt$$ExternalSyntheticLambda12 captureCheckFaceKt$$ExternalSyntheticLambda12, ContinuationImpl continuationImpl) {
        SpendingInsightDetailPresenterKt$loadInsight$1 spendingInsightDetailPresenterKt$loadInsight$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof SpendingInsightDetailPresenterKt$loadInsight$1) {
            spendingInsightDetailPresenterKt$loadInsight$1 = (SpendingInsightDetailPresenterKt$loadInsight$1) continuationImpl;
            int i2 = spendingInsightDetailPresenterKt$loadInsight$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                spendingInsightDetailPresenterKt$loadInsight$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = spendingInsightDetailPresenterKt$loadInsight$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = spendingInsightDetailPresenterKt$loadInsight$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetCardSpendingInsightRequest getCardSpendingInsightRequest = new GetCardSpendingInsightRequest(cardSpendingInsightType, str, ByteString.EMPTY);
                    spendingInsightDetailPresenterKt$loadInsight$1.L$3 = captureCheckFaceKt$$ExternalSyntheticLambda12;
                    spendingInsightDetailPresenterKt$loadInsight$1.label = 1;
                    obj = spendingInsightsAppService.getCardSpendingInsight(getCardSpendingInsightRequest, spendingInsightDetailPresenterKt$loadInsight$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    captureCheckFaceKt$$ExternalSyntheticLambda12 = spendingInsightDetailPresenterKt$loadInsight$1.L$3;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    captureCheckFaceKt$$ExternalSyntheticLambda12.invoke(apiResult);
                    return null;
                }
                if (apiResult instanceof ApiResult.Success) {
                    return ((GetCardSpendingInsightResponse) ((ApiResult.Success) apiResult).response).insight;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        spendingInsightDetailPresenterKt$loadInsight$1 = new SpendingInsightDetailPresenterKt$loadInsight$1(continuationImpl);
        Object obj2 = spendingInsightDetailPresenterKt$loadInsight$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = spendingInsightDetailPresenterKt$loadInsight$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }

    public static final String disclaimerText(PaymentScheduleSelection paymentScheduleSelection, AndroidStringManager androidStringManager, String str) {
        Resources resources = androidStringManager.resources;
        str.getClass();
        PaymentScheduleFrequency paymentScheduleFrequency = paymentScheduleSelection.frequency;
        LocalDate localDate = paymentScheduleSelection.date;
        int ordinal = paymentScheduleFrequency.ordinal();
        if (ordinal == 0) {
            String displayName = localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
            displayName.getClass();
            resources.getClass();
            String format2 = new MessageFormat(resources.getString(R.string.payment_schedule_disclaimer_weekly_with_start_date)).format(new Object[]{displayName, str});
            format2.getClass();
            return format2;
        }
        if (ordinal == 1) {
            String displayName2 = localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
            displayName2.getClass();
            resources.getClass();
            String format3 = new MessageFormat(resources.getString(R.string.payment_schedule_disclaimer_biweekly_with_start_date)).format(new Object[]{displayName2, str});
            format3.getClass();
            return format3;
        }
        if (ordinal != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        int safeDayOfMonth = DimensionKt.getSafeDayOfMonth(localDate);
        if (safeDayOfMonth == 31) {
            resources.getClass();
            String format4 = new MessageFormat(resources.getString(R.string.payment_schedule_disclaimer_monthly_last_day)).format(new Object[]{str});
            format4.getClass();
            return format4;
        }
        if (safeDayOfMonth >= 29) {
            Object[] objArr = {AndroidStringManager.getOrdinal(safeDayOfMonth), str};
            resources.getClass();
            String format5 = new MessageFormat(resources.getString(R.string.payment_schedule_disclaimer_monthly_or_last_day)).format(objArr);
            format5.getClass();
            return format5;
        }
        Object[] objArr2 = {AndroidStringManager.getOrdinal(safeDayOfMonth), str};
        resources.getClass();
        String format6 = new MessageFormat(resources.getString(R.string.payment_schedule_disclaimer_monthly_with_start_date)).format(objArr2);
        format6.getClass();
        return format6;
    }

    public static final FontWeight getAndroidBold() {
        FontWeight fontWeight = FontWeight.W400;
        return FontWeight.W600;
    }

    public static final String startDateText(PaymentScheduleSelection paymentScheduleSelection, LocalDate localDate, AndroidStringManager androidStringManager, AndroidDateFormatManager androidDateFormatManager) {
        localDate.getClass();
        LocalDate localDate2 = paymentScheduleSelection.date;
        if (localDate2.isEqual(localDate)) {
            return androidStringManager.get(R.string.payment_schedule_today);
        }
        String format2 = androidDateFormatManager.getDateFormat("MMMd", androidDateFormatManager.clock.timeZone()).formatter.format(localDate2);
        format2.getClass();
        return format2;
    }
}
