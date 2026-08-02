package com.braze.support;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.b2$$ExternalSyntheticLambda0;
import bo.app.jg$$ExternalSyntheticLambda1;
import bo.app.ue;
import com.appsflyer.AppsFlyerProperties;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0016\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0007¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b%\u0010\bJ\u0019\u0010(\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b'\u0010\bR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100¨\u00063"}, d2 = {"Lcom/braze/support/ValidationUtils;", "", "<init>", "()V", "", "emailAddress", "", "isValidEmailAddress", "(Ljava/lang/String;)Z", "phoneNumber", "isValidPhoneNumber", "field", "ensureBrazeFieldLength", "(Ljava/lang/String;)Ljava/lang/String;", "productId", AppsFlyerProperties.CURRENCY_CODE, "Ljava/math/BigDecimal;", "price", "", "quantity", "Lbo/app/ue;", "serverConfigStorageProvider", "isValidLogPurchaseInput", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILbo/app/ue;)Z", "eventName", "isValidLogCustomEventInput", "(Ljava/lang/String;Lbo/app/ue;)Z", "campaignId", "pageId", "isValidPushStoryClickInput", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "latitude", "longitude", "isValidLocation", "(DD)Z", "lineId", "isValidLineId", "customEndpoint", "isInvalidCustomEndpoint$android_sdk_base_release", "isInvalidCustomEndpoint", "", "VALID_CURRENCY_CODES", "Ljava/util/Set;", "getVALID_CURRENCY_CODES", "()Ljava/util/Set;", "Lkotlin/text/Regex;", "EMAIL_ADDRESS_REGEX", "Lkotlin/text/Regex;", "PHONE_NUMBER_REGEX", "ENDPOINT_REGEX", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ValidationUtils {
    public static final ValidationUtils INSTANCE = new ValidationUtils();
    private static final Set<String> VALID_CURRENCY_CODES = ArraysKt___ArraysKt.toSet(new String[]{"AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTC", "BTN", "BWP", "BYR", "BZD", "CAD", "CDF", "CHF", "CLF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EEK", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LTL", "LVL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MTL", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XAG", "XAU", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", "YER", "ZAR", "ZMK", "ZMW", "ZWL"});
    private static final Regex EMAIL_ADDRESS_REGEX = new Regex(".+@.+\\..+");
    private static final Regex PHONE_NUMBER_REGEX = new Regex("^[0-9 .\\(\\)\\+\\-]+$");
    private static final Regex ENDPOINT_REGEX = new Regex("rest\\.[a-z]+-[0-9]+\\.braze\\.");

    private ValidationUtils() {
    }

    public static final String ensureBrazeFieldLength(String field) {
        if (field == null || StringsKt.isBlank(field)) {
            return "";
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        String obj = StringsKt.trim(field).toString();
        ref$ObjectRef.element = obj;
        if (obj.length() > 255) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b2$$ExternalSyntheticLambda0(9, ref$ObjectRef), 6, (Object) null);
            ref$ObjectRef.element = ((String) ref$ObjectRef.element).substring(0, 255);
        }
        return (String) ref$ObjectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureBrazeFieldLength$lambda$0(Ref$ObjectRef ref$ObjectRef) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((String) ref$ObjectRef.element).length(), "Provided string field is too long [", "]. The max length is 255, truncating provided field.");
    }

    public static final boolean isInvalidCustomEndpoint$android_sdk_base_release(String customEndpoint) {
        if (customEndpoint != null) {
            return ENDPOINT_REGEX.containsMatchIn(customEndpoint);
        }
        return false;
    }

    public static final boolean isValidEmailAddress(String emailAddress) {
        if (emailAddress == null || emailAddress.length() == 0 || emailAddress.length() > 255) {
            return false;
        }
        return EMAIL_ADDRESS_REGEX.matches(emailAddress);
    }

    public static final boolean isValidLineId(String lineId) {
        return lineId != null && lineId.length() <= 33;
    }

    public static final boolean isValidLocation(double latitude, double longitude) {
        return latitude < 90.0d && latitude > -90.0d && longitude < 180.0d && longitude > -180.0d;
    }

    public static final boolean isValidLogCustomEventInput(String eventName, ue serverConfigStorageProvider) {
        serverConfigStorageProvider.getClass();
        if (eventName == null || StringsKt.isBlank(eventName)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(21), 6, (Object) null);
            return false;
        }
        if (!serverConfigStorageProvider.f().contains(eventName)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda1(eventName, 18), 6, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogCustomEventInput$lambda$0() {
        return "The custom event name cannot be null or contain only whitespaces. Invalid custom event.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogCustomEventInput$lambda$1(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("The custom event is a blocklisted custom event: ", str, ". Invalid custom event.");
    }

    public static final boolean isValidLogPurchaseInput(String productId, String currencyCode, BigDecimal price, int quantity, ue serverConfigStorageProvider) {
        serverConfigStorageProvider.getClass();
        int i = 20;
        if (productId == null || StringsKt.isBlank(productId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(i), 6, (Object) null);
            return false;
        }
        int i2 = 19;
        if (serverConfigStorageProvider.g().contains(productId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda1(productId, i2), 6, (Object) null);
            return false;
        }
        if (currencyCode == null || StringsKt.isBlank(currencyCode)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(i2), 6, (Object) null);
            return false;
        }
        Set<String> set = VALID_CURRENCY_CODES;
        String obj = StringsKt.trim(currencyCode).toString();
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = obj.toUpperCase(locale);
        upperCase.getClass();
        if (!set.contains(upperCase)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda1(currencyCode, i), 6, (Object) null);
            return false;
        }
        if (price == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(24), 6, (Object) null);
            return false;
        }
        if (quantity <= 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(quantity, 17), 6, (Object) null);
            return false;
        }
        if (quantity <= 100) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(quantity, 18), 6, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$0() {
        return "The productId is empty, not logging in-app purchase to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$1(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("The productId is a blocklisted productId: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$2() {
        return "The currencyCode is empty. Expected one of " + VALID_CURRENCY_CODES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$3(String str) {
        return "The currencyCode " + str + " is invalid. Expected one of " + VALID_CURRENCY_CODES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$4() {
        return "The price is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$5(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "The requested purchase quantity of ", " is less than one. Invalid purchase");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$6(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "The requested purchase quantity of ", " is greater than the maximum of 100");
    }

    public static final boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber != null && PHONE_NUMBER_REGEX.matches(phoneNumber);
    }

    public static final boolean isValidPushStoryClickInput(String campaignId, String pageId) {
        if (campaignId == null || StringsKt.isBlank(campaignId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(23), 6, (Object) null);
            return false;
        }
        if (pageId != null && !StringsKt.isBlank(pageId)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(22), 6, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidPushStoryClickInput$lambda$0() {
        return "Campaign ID cannot be null or blank";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidPushStoryClickInput$lambda$1() {
        return "Push story page ID cannot be null or blank";
    }
}
