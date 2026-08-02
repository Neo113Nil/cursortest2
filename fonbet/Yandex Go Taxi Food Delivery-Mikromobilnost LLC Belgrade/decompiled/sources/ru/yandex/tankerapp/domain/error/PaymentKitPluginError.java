package ru.yandex.tankerapp.domain.error;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\b\t\n\u000b\f\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/tankerapp/domain/error/PaymentKitPluginError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "UninitializedError", "InvalidArgumentsError", "ParseArgumentsError", "EmptyArgumentsError", "NoActivityError", "ActivityAlreadyStartedError", "Lru/yandex/tankerapp/domain/error/PaymentKitPluginError$ActivityAlreadyStartedError;", "Lru/yandex/tankerapp/domain/error/PaymentKitPluginError$EmptyArgumentsError;", "Lru/yandex/tankerapp/domain/error/PaymentKitPluginError$InvalidArgumentsError;", "Lru/yandex/tankerapp/domain/error/PaymentKitPluginError$NoActivityError;", "Lru/yandex/tankerapp/domain/error/PaymentKitPluginError$ParseArgumentsError;", "Lru/yandex/tankerapp/domain/error/PaymentKitPluginError$UninitializedError;", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class PaymentKitPluginError extends Exception {
    private final String code;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/yandex/tankerapp/domain/error/PaymentKitPluginError$ActivityAlreadyStartedError;", "Lru/yandex/tankerapp/domain/error/PaymentKitPluginError;", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ActivityAlreadyStartedError extends PaymentKitPluginError {
        public static final ActivityAlreadyStartedError a = new ActivityAlreadyStartedError("8", "Activity already started");
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/yandex/tankerapp/domain/error/PaymentKitPluginError$EmptyArgumentsError;", "Lru/yandex/tankerapp/domain/error/PaymentKitPluginError;", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EmptyArgumentsError extends PaymentKitPluginError {
        public static final EmptyArgumentsError a = new EmptyArgumentsError("4", "Some of the required arguments are not provided.");
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/yandex/tankerapp/domain/error/PaymentKitPluginError$InvalidArgumentsError;", "Lru/yandex/tankerapp/domain/error/PaymentKitPluginError;", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InvalidArgumentsError extends PaymentKitPluginError {
        public static final InvalidArgumentsError a = new InvalidArgumentsError("2", "Method call arguments are invalid.");
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/yandex/tankerapp/domain/error/PaymentKitPluginError$NoActivityError;", "Lru/yandex/tankerapp/domain/error/PaymentKitPluginError;", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoActivityError extends PaymentKitPluginError {
        public static final NoActivityError a = new NoActivityError("7", "Activity not found");
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/yandex/tankerapp/domain/error/PaymentKitPluginError$ParseArgumentsError;", "Lru/yandex/tankerapp/domain/error/PaymentKitPluginError;", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ParseArgumentsError extends PaymentKitPluginError {
        public static final ParseArgumentsError a = new ParseArgumentsError("3", "Arguments could not be parsed.");
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/yandex/tankerapp/domain/error/PaymentKitPluginError$UninitializedError;", "Lru/yandex/tankerapp/domain/error/PaymentKitPluginError;", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UninitializedError extends PaymentKitPluginError {
        public static final UninitializedError a = new UninitializedError("1", "InitSdk method was not called.");
    }

    public PaymentKitPluginError(String str, String str2) {
        super(str2);
        this.code = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }
}
