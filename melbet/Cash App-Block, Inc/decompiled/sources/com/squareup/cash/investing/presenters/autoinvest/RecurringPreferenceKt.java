package com.squareup.cash.investing.presenters.autoinvest;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringPurchaseReceiptViewModel;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Icon;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Image;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes6.dex */
public abstract class RecurringPreferenceKt {
    public static final SimpleDateFormat dateFormatter;
    public static final SimpleDateFormat timeFormatter;
    public static final SimpleDateFormat weekdayFormatter;

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

    static {
        Locale locale = Locale.US;
        timeFormatter = new SimpleDateFormat("h:mm a", locale);
        weekdayFormatter = new SimpleDateFormat("EEE", locale);
        dateFormatter = new SimpleDateFormat("MMMM d", locale);
    }

    public static final InvestingRecurringPurchaseReceiptViewModel.Content mapRecurringPreferenceToRecieptViewModel(boolean z, Long l, RecurringSchedule recurringSchedule, Money money, InvestingScreens.RecurringPurchaseReceipt recurringPurchaseReceipt, AndroidClock androidClock, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory, boolean z2) {
        LinkScanner investingCryptoAvatarContentModel$Image;
        String str;
        int i;
        Resources resources = androidStringManager.resources;
        InvestingScreens.RecurringPurchaseReceipt.Type type2 = recurringPurchaseReceipt.f1161type;
        if (type2 instanceof InvestingScreens.RecurringPurchaseReceipt.Type.Bitcoin) {
            investingCryptoAvatarContentModel$Image = new InvestingCryptoAvatarContentModel$Icon(InvestingCryptoImage.BITCOIN);
        } else {
            if (!(type2 instanceof InvestingScreens.RecurringPurchaseReceipt.Type.Stock)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            Image image = ((InvestingScreens.RecurringPurchaseReceipt.Type.Stock) type2).icon;
            investingCryptoAvatarContentModel$Image = image != null ? new InvestingCryptoAvatarContentModel$Image(image, recurringPurchaseReceipt.accentColor) : null;
        }
        LinkScanner linkScanner = investingCryptoAvatarContentModel$Image;
        if (!z) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return null;
        }
        l.getClass();
        Date date = new Date(l.longValue());
        RecurringSchedule.Frequency frequency = recurringSchedule.frequency;
        frequency.getClass();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[frequency.ordinal()];
        if (i2 != 1) {
            SimpleDateFormat simpleDateFormat = weekdayFormatter;
            if (i2 == 2) {
                simpleDateFormat.setTimeZone(androidClock.timeZone());
                String format2 = simpleDateFormat.format(date);
                format2.getClass();
                resources.getClass();
                str = new MessageFormat(resources.getString(R.string.investing_recurringfrequency_weekly_with_day)).format(new Object[]{format2});
                str.getClass();
            } else if (i2 == 3) {
                simpleDateFormat.setTimeZone(androidClock.timeZone());
                String format3 = simpleDateFormat.format(date);
                format3.getClass();
                resources.getClass();
                str = new MessageFormat(resources.getString(R.string.investing_recurringfrequency_biweekly_with_day)).format(new Object[]{format3});
                str.getClass();
            } else {
                if (i2 != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Integer num = (Integer) CollectionsKt.getOrNull(0, recurringSchedule.days_of_period);
                Object[] objArr = {AndroidStringManager.getOrdinal(num != null ? num.intValue() : 1)};
                resources.getClass();
                str = new MessageFormat(resources.getString(R.string.investing_recurringfrequency_monthly_with_date)).format(objArr);
                str.getClass();
            }
        } else {
            str = androidStringManager.get(R.string.investing_recurringfrequency_daily);
        }
        TimeZone timeZone = androidClock.timeZone();
        SimpleDateFormat simpleDateFormat2 = timeFormatter;
        simpleDateFormat2.setTimeZone(timeZone);
        String format4 = simpleDateFormat2.format(date);
        TimeZone timeZone2 = androidClock.timeZone();
        SimpleDateFormat simpleDateFormat3 = dateFormatter;
        simpleDateFormat3.setTimeZone(timeZone2);
        String format5 = simpleDateFormat3.format(date);
        RecurringSchedule.Frequency frequency2 = recurringSchedule.frequency;
        frequency2.getClass();
        int i3 = iArr[frequency2.ordinal()];
        if (i3 == 1) {
            i = R.string.recurring_purchase_receipt_cancel_daily;
        } else if (i3 == 2) {
            i = R.string.recurring_purchase_receipt_cancel_weekly;
        } else if (i3 == 3) {
            i = R.string.recurring_purchase_receipt_cancel_biweekly;
        } else {
            if (i3 != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            i = R.string.recurring_purchase_receipt_cancel_monthly;
        }
        String str2 = androidStringManager.get(R.string.auto_invest_title);
        String format6 = factory.create(MoneyFormatterConfig.STANDARD).format(money);
        format4.getClass();
        format5.getClass();
        return new InvestingRecurringPurchaseReceiptViewModel.Content(linkScanner, str2, format6, str, format4, format5, androidStringManager.get(i), !z2, recurringPurchaseReceipt.accentColor);
    }
}
