package com.squareup.cash.investingcrypto.presenters.autoinvest;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import com.squareup.cash.R;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoRecurringPurchaseTileViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import kotlin.collections.CollectionsKt;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes6.dex */
public abstract class InvestingCryptoRecurringPreferences {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecurringSchedule.Frequency.values().length];
            try {
                iArr[RecurringSchedule.Frequency.EVERY_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_TWO_WEEKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: toTileViewModel-_kfyX8k, reason: not valid java name */
    public static InvestingCryptoRecurringPurchaseTileViewModel m3586toTileViewModel_kfyX8k(long j, RecurringSchedule recurringSchedule, String str, Money money, AndroidDateFormatManager androidDateFormatManager, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory, LinkScanner linkScanner, ColorModel colorModel) {
        String str2;
        Resources resources = androidStringManager.resources;
        recurringSchedule.getClass();
        str.getClass();
        money.getClass();
        Instant ofEpochMilli = Instant.ofEpochMilli(j);
        AndroidClock androidClock = androidDateFormatManager.clock;
        String format2 = androidDateFormatManager.getDateFormat("h:mm a", androidClock.timeZone()).formatter.format(ofEpochMilli);
        RecurringSchedule.Frequency frequency = recurringSchedule.frequency;
        frequency.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            str2 = androidStringManager.get(R.string.investing_crypto_recurringfrequency_daily);
        } else if (i == 2) {
            String format3 = androidDateFormatManager.getDateFormat("EEE", androidClock.timeZone()).formatter.format(ofEpochMilli);
            format3.getClass();
            resources.getClass();
            str2 = new MessageFormat(resources.getString(R.string.investing_crypto_recurringfrequency_weekly_with_day)).format(new Object[]{format3});
            str2.getClass();
        } else if (i == 3) {
            String format4 = androidDateFormatManager.getDateFormat("EEE", androidClock.timeZone()).formatter.format(ofEpochMilli);
            format4.getClass();
            resources.getClass();
            str2 = new MessageFormat(resources.getString(R.string.investing_crypto_recurringfrequency_biweekly_with_day)).format(new Object[]{format4});
            str2.getClass();
        } else {
            if (i != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            Integer num = (Integer) CollectionsKt.getOrNull(0, recurringSchedule.days_of_period);
            Object[] objArr = {AndroidStringManager.getOrdinal(num != null ? num.intValue() : 1)};
            resources.getClass();
            str2 = new MessageFormat(resources.getString(R.string.investing_crypto_recurringfrequency_monthly_with_date)).format(objArr);
            str2.getClass();
        }
        MoneyFormatter create = factory.create(MoneyFormatterConfig.STANDARD);
        String str3 = androidStringManager.get(R.string.investing_crypto_auto_invest_title);
        format2.getClass();
        resources.getClass();
        String format5 = new MessageFormat(resources.getString(R.string.investing_crypto_recurringfrequency_timestamp)).format(new Object[]{format2});
        format5.getClass();
        return new InvestingCryptoRecurringPurchaseTileViewModel(str3, new InvestingCryptoRecurringPurchaseTileViewModel.Item(str, linkScanner, str2, format5, create.format(money), colorModel));
    }
}
