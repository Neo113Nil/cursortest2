package com.braze.ui;

import android.content.Context;
import android.webkit.JavascriptInterface;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.appsflyer.AppsFlyerProperties;
import com.braze.Braze;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.ui.support.UriUtils$$ExternalSyntheticLambda2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\fJ#\u0010\u0014\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0010J=\u0010\u0019\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/braze/ui/JavascriptInterfaceBase;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "buttonId", "", "logButtonClick", "(Ljava/lang/String;)V", "logClick", "()V", "userId", "sdkAuthSignature", "changeUser", "(Ljava/lang/String;Ljava/lang/String;)V", "requestImmediateDataFlush", "eventName", "propertiesJSON", "logCustomEventWithJSON", "productId", "price", AppsFlyerProperties.CURRENCY_CODE, "quantity", "logPurchaseWithJSON", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/braze/models/outgoing/BrazeProperties;", "parseProperties", "(Ljava/lang/String;)Lcom/braze/models/outgoing/BrazeProperties;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class JavascriptInterfaceBase {
    private final Context context;

    public JavascriptInterfaceBase(Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchaseWithJSON$lambda$0(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to parse logPurchaseWithJSON price value '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchaseWithJSON$lambda$1(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to parse logPurchaseWithJSON quantity value '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseProperties$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to parse properties JSON String: ", str);
    }

    @JavascriptInterface
    public final void changeUser(String userId, String sdkAuthSignature) {
        userId.getClass();
        Braze.INSTANCE.getInstance(this.context).changeUser(userId, sdkAuthSignature);
    }

    @JavascriptInterface
    public abstract void logButtonClick(String buttonId);

    @JavascriptInterface
    public abstract void logClick();

    @JavascriptInterface
    public final void logCustomEventWithJSON(String eventName, String propertiesJSON) {
        Braze.INSTANCE.getInstance(this.context).logCustomEvent(eventName, parseProperties(propertiesJSON));
    }

    @JavascriptInterface
    public final void logPurchaseWithJSON(String productId, String price, String currencyCode, String quantity, String propertiesJSON) {
        price.getClass();
        quantity.getClass();
        BrazeProperties parseProperties = parseProperties(propertiesJSON);
        Double doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(price);
        if (doubleOrNull == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(price, 2), 6, (Object) null);
            return;
        }
        Integer intOrNull = StringsKt.toIntOrNull(quantity);
        if (intOrNull == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(quantity, 3), 6, (Object) null);
        } else {
            Braze.INSTANCE.getInstance(this.context).logPurchase(productId, currencyCode, new BigDecimal(String.valueOf(doubleOrNull.doubleValue())), intOrNull.intValue(), parseProperties);
        }
    }

    public final BrazeProperties parseProperties(String propertiesJSON) {
        if (propertiesJSON == null) {
            return null;
        }
        try {
            if (propertiesJSON.equals("undefined") || propertiesJSON.equals("null")) {
                return null;
            }
            return new BrazeProperties(new JSONObject(propertiesJSON));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(propertiesJSON, 1), 4, (Object) null);
            return null;
        }
    }

    @JavascriptInterface
    public final void requestImmediateDataFlush() {
        Braze.INSTANCE.getInstance(this.context).requestImmediateDataFlush();
    }
}
