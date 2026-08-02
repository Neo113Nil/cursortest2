package com.braze.push.support;

import android.text.Html;
import android.text.Spanned;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.BrazeLogger$$ExternalSyntheticLambda3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TAG", "", "getHtmlSpannedTextIfEnabled", "", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "android-sdk-ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class HtmlUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("HtmlUtils");

    public static final CharSequence getHtmlSpannedTextIfEnabled(String str, BrazeConfigurationProvider brazeConfigurationProvider) {
        str.getClass();
        brazeConfigurationProvider.getClass();
        if (StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(17), 14, (Object) null);
            return str;
        }
        if (!brazeConfigurationProvider.isPushNotificationHtmlRenderingEnabled()) {
            return str;
        }
        Spanned fromHtml = Html.fromHtml(str, 0);
        fromHtml.getClass();
        return fromHtml;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getHtmlSpannedTextIfEnabled$lambda$0() {
        return "Cannot create html spanned text on blank text. Returning blank string.";
    }
}
