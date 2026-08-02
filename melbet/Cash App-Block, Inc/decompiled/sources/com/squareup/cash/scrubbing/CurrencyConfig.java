package com.squareup.cash.scrubbing;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import androidx.media3.ui.PlayerView;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.common.CurrencyCode;
import java.text.DecimalFormatSymbols;
import java.util.Currency;
import java.util.Locale;
import kotlin.Result;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class CurrencyConfig {
    public final char decimalSeparator;
    public final char groupingSeparator;
    public final int maxFractionDigits;
    public final boolean usesDecimalSeparator;

    /* loaded from: classes4.dex */
    public abstract class Companion {
        public static EmptyList getDeepLinkSpecs() {
            return ClientRoute.FlowType.deepLinkSpecs;
        }

        public static void setAccessibilityDataSensitive(AccessibilityEvent accessibilityEvent, boolean z) {
            if (Build.VERSION.SDK_INT >= 34) {
                PlayerView.Api34.setAccessibilityDataSensitive(accessibilityEvent, z);
            }
        }

        public static CurrencyConfig toCurrencyConfig(CurrencyCode currencyCode, Locale locale) {
            Object failure;
            currencyCode.getClass();
            locale.getClass();
            DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
            decimalFormatSymbols.getClass();
            char decimalSeparator = decimalFormatSymbols.getDecimalSeparator();
            char groupingSeparator = decimalFormatSymbols.getGroupingSeparator();
            try {
                Result.Companion companion = Result.Companion;
                failure = Currency.getInstance(currencyCode.name());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            Currency currency = (Currency) failure;
            int defaultFractionDigits = currencyCode == CurrencyCode.BTC ? 8 : currency != null ? currency.getDefaultFractionDigits() : 0;
            return new CurrencyConfig(groupingSeparator, decimalSeparator, defaultFractionDigits, defaultFractionDigits > 0);
        }
    }

    public CurrencyConfig(char c, char c2, int i, boolean z) {
        this.groupingSeparator = c;
        this.decimalSeparator = c2;
        this.maxFractionDigits = i;
        this.usesDecimalSeparator = z;
    }
}
