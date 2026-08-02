package androidx.core.text;

import android.text.TextUtils;
import app.cash.api.ApiResult;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public abstract class TextUtilsCompat {
    public static final ErrorMessaging errorMessaging(AndroidStringManager androidStringManager, ApiResult.Failure failure, Integer num) {
        String str;
        String str2;
        androidStringManager.getClass();
        failure.getClass();
        boolean z = failure instanceof ApiResult.Failure.HttpFailure;
        if (z) {
            int i = ((ApiResult.Failure.HttpFailure) failure).code;
            str = (i == 503 || i == 504) ? androidStringManager.get(R.string.error_messaging_title_cannot_complete_request) : androidStringManager.get(R.string.error_messaging_title_something_went_wrong);
        } else {
            if (!(failure instanceof ApiResult.Failure.NetworkFailure)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str = ((ApiResult.Failure.NetworkFailure) failure).error instanceof UnknownHostException ? androidStringManager.get(R.string.error_messaging_title_device_unable_to_connect) : androidStringManager.get(R.string.error_messaging_title_something_went_wrong);
        }
        if (z) {
            int i2 = ((ApiResult.Failure.HttpFailure) failure).code;
            if (i2 != 400) {
                if (i2 == 401) {
                    str2 = androidStringManager.get(R.string.error_messaging_message_sign_in_and_retry);
                } else if (i2 == 429) {
                    str2 = androidStringManager.get(R.string.error_messaging_message_wait_and_retry);
                } else if (i2 != 500) {
                    if (i2 != 503 && i2 != 504) {
                        switch (i2) {
                            case 403:
                            case HttpStatusCode.NOT_FOUND_404 /* 404 */:
                            case 405:
                                break;
                            default:
                                if (num == null || (str2 = androidStringManager.get(num.intValue())) == null) {
                                    str2 = androidStringManager.get(R.string.error_messaging_message_try_again_later);
                                    break;
                                }
                                break;
                        }
                    } else {
                        str2 = androidStringManager.get(R.string.error_messaging_message_experience_high_volume);
                    }
                }
            }
            str2 = androidStringManager.get(R.string.error_messaging_message_try_again_in_a_few_minutes);
        } else {
            if (!(failure instanceof ApiResult.Failure.NetworkFailure)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            Throwable th = ((ApiResult.Failure.NetworkFailure) failure).error;
            if (th instanceof UnknownHostException) {
                str2 = androidStringManager.get(R.string.error_messaging_message_check_connection_and_try_again);
            } else if (th instanceof TimeoutException) {
                str2 = androidStringManager.get(R.string.error_messaging_message_try_again_in_a_few_minutes);
            } else if (num == null || (str2 = androidStringManager.get(num.intValue())) == null) {
                str2 = androidStringManager.get(R.string.error_messaging_message_try_again_later);
            }
        }
        return new ErrorMessaging(str, str2);
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewSettings.deepLinkSpecs;
    }

    public static int getLayoutDirectionFromLocale(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
