package com.squareup.cash.exchangedata.real;

import androidx.media3.exoplayer.source.MediaLoadData;
import com.squareup.cash.exchangedata.api.FxExchangeRate;
import com.squareup.protos.cash.fx.app.CurrencyInfo;
import com.squareup.protos.cash.fx.app.ExchangeRate;
import com.squareup.protos.cash.fx.app.StreamExchangeRateUpdate;
import com.squareup.protos.common.CurrencyCode;
import dev.zacsweers.metro.internal.DoubleCheck;
import java.math.BigDecimal;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class RealFxExchangeRateStreamingSubscriber {
    public final MediaLoadData exponentialBackoff;
    public final DoubleCheck fxRatesStreamingClient;
    public final CoroutineContext ioDispatcher;
    public final StateFlow requestMetadata;

    public RealFxExchangeRateStreamingSubscriber(DoubleCheck doubleCheck, StateFlow stateFlow, MediaLoadData mediaLoadData, CoroutineContext coroutineContext) {
        this.fxRatesStreamingClient = doubleCheck;
        this.requestMetadata = stateFlow;
        this.exponentialBackoff = mediaLoadData;
        this.ioDispatcher = coroutineContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        if (r2 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FxExchangeRate access$toFxExchangeRate(RealFxExchangeRateStreamingSubscriber realFxExchangeRateStreamingSubscriber, StreamExchangeRateUpdate streamExchangeRateUpdate, CurrencyCode currencyCode, CurrencyCode currencyCode2) {
        String str;
        BigDecimal bigDecimalOrNull;
        CurrencyInfo currencyInfo;
        CurrencyCode currencyCode3 = streamExchangeRateUpdate.from_currency;
        ExchangeRate exchangeRate = streamExchangeRateUpdate.exchange_rate;
        if (currencyCode3 == null) {
            currencyCode3 = (exchangeRate == null || (currencyInfo = exchangeRate.from_currency) == null) ? null : currencyInfo.code;
        }
        if (currencyCode3 == currencyCode) {
            CurrencyCode currencyCode4 = streamExchangeRateUpdate.to_currency;
            if (currencyCode4 == null) {
                currencyCode4 = currencyCode2;
            }
            if (currencyCode4 == currencyCode2 && exchangeRate != null && (str = exchangeRate.rate) != null && (bigDecimalOrNull = StringsKt__StringNumberConversionsJVMKt.toBigDecimalOrNull(str)) != null) {
                if (bigDecimalOrNull.signum() <= 0) {
                    bigDecimalOrNull = null;
                }
                if (bigDecimalOrNull != null) {
                    return new FxExchangeRate(currencyCode3, currencyCode4, bigDecimalOrNull);
                }
            }
        }
        return null;
    }
}
