package com.braze.configuration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.c1;
import bo.app.e1;
import bo.app.e7;
import bo.app.f1;
import bo.app.i3;
import com.braze.Braze$$ExternalSyntheticLambda82;
import com.braze.BrazeUser$$ExternalSyntheticLambda9;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.enums.DeviceKey;
import com.braze.enums.LocationProviderName;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import com.braze.support.PackageUtils;
import com.braze.support.d;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u0000 {2\u00020\u0001:\u0002\n|B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b#\u0010\u0016R\u0011\u0010$\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b$\u0010\u0016R\u0011\u0010%\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b%\u0010\u0016R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00101\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b0\u0010(R\u0017\u00104\u001a\u00020&8F¢\u0006\f\u0012\u0004\b3\u0010\u0013\u001a\u0004\b2\u0010(R\u0013\u00106\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b5\u0010\u001dR\u0011\u00108\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b7\u0010\u0016R\u0011\u0010:\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b9\u0010\u001dR\u0011\u0010<\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b;\u0010\u001dR\u0011\u0010>\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b=\u0010(R\u0017\u0010A\u001a\u00020&8G¢\u0006\f\u0012\u0004\b@\u0010\u0013\u001a\u0004\b?\u0010(R\u0013\u0010E\u001a\u0004\u0018\u00010B8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010F\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bF\u0010\u0016R\u0013\u0010H\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bG\u0010\u001dR\u0011\u0010I\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bI\u0010\u0016R\u0011\u0010J\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bJ\u0010\u0016R\u0011\u0010K\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bK\u0010\u0016R\u0013\u0010M\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bL\u0010\u001dR\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020N0\f8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010R\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bR\u0010\u0016R\u0011\u0010S\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bS\u0010\u0016R\u0011\u0010T\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bT\u0010\u0016R\u0011\u0010U\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bU\u0010\u0016R\u0011\u0010W\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bV\u0010\u0016R\u0011\u0010X\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bX\u0010\u0016R\u0011\u0010Y\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bY\u0010\u0016R\u0011\u0010[\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bZ\u0010(R\u0013\u0010]\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\\\u0010\u001dR\u0011\u0010_\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b^\u0010(R\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020`0\f8F¢\u0006\u0006\u001a\u0004\ba\u0010PR\u0011\u0010c\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bc\u0010\u0016R\u0011\u0010d\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bd\u0010\u0016R\u0011\u0010e\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\be\u0010\u0016R\u0011\u0010f\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bf\u0010\u0016R\u0017\u0010i\u001a\b\u0012\u0004\u0012\u00020g0\f8F¢\u0006\u0006\u001a\u0004\bh\u0010PR\u0011\u0010j\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bj\u0010\u0016R\u0013\u0010l\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bk\u0010\u001dR\u0011\u0010n\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bm\u0010\u0016R\u0011\u0010p\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bo\u0010\u0016R\u0011\u0010q\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bq\u0010\u0016R\u0011\u0010u\u001a\u00020r8F¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0011\u0010w\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bv\u0010\u0016R\u001a\u0010z\u001a\u00020\u00188BX\u0082\u0004¢\u0006\f\u0012\u0004\by\u0010\u0013\u001a\u0004\bx\u0010\u001d¨\u0006}"}, d2 = {"Lcom/braze/configuration/BrazeConfigurationProvider;", "Lcom/braze/configuration/CachedConfigurationProvider;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "E", "Ljava/lang/Class;", "targetEnumClass", "Lbo/app/f1;", "configField", "Ljava/util/EnumSet;", "getGenericEnumSetFromStringSet", "(Ljava/lang/Class;Lbo/app/f1;)Ljava/util/EnumSet;", "Landroid/content/Context;", "getContext$android_sdk_base_release", "()Landroid/content/Context;", "getContext$android_sdk_base_release$annotations", "()V", "", "isEphemeralEventsEnabled", "()Z", "", "", "getEphemeralEventKeys", "()Ljava/util/Set;", "ephemeralEventKeys", "getBaseUrlForRequests", "()Ljava/lang/String;", "baseUrlForRequests", "Lbo/app/c1;", "getBrazeApiKey", "()Lbo/app/c1;", "brazeApiKey", "isAdmMessagingRegistrationEnabled", "isAutomaticLocationCollectionEnabled", "isGeofencesEnabled", "", "getSmallNotificationIconResourceId", "()I", "smallNotificationIconResourceId", "getLargeNotificationIconResourceId", "largeNotificationIconResourceId", "", "getTriggerActionMinimumTimeIntervalInSeconds", "()J", "triggerActionMinimumTimeIntervalInSeconds", "getSessionTimeoutSeconds", "sessionTimeoutSeconds", "getVersionCode", "getVersionCode$annotations", "versionCode", "getCustomEndpoint", "customEndpoint", "getDoesHandlePushDeepLinksAutomatically", "doesHandlePushDeepLinksAutomatically", "getDefaultNotificationChannelName", "defaultNotificationChannelName", "getDefaultNotificationChannelDescription", "defaultNotificationChannelDescription", "getApplicationIconResourceId", "applicationIconResourceId", "getDefaultNotificationAccentColor", "getDefaultNotificationAccentColor$annotations", "defaultNotificationAccentColor", "Lcom/braze/enums/SdkFlavor;", "getSdkFlavor", "()Lcom/braze/enums/SdkFlavor;", "sdkFlavor", "isPushDeepLinkBackStackActivityEnabled", "getPushDeepLinkBackStackActivityClassName", "pushDeepLinkBackStackActivityClassName", "isSessionStartBasedTimeoutEnabled", "isFirebaseCloudMessagingRegistrationEnabled", "isContentCardsUnreadVisualIndicatorEnabled", "getFirebaseCloudMessagingSenderIdKey", "firebaseCloudMessagingSenderIdKey", "Lcom/braze/enums/DeviceKey;", "getDeviceObjectAllowlist", "()Ljava/util/EnumSet;", "deviceObjectAllowlist", "isDeviceObjectAllowlistEnabled", "isInAppMessageAccessibilityExclusiveModeEnabled", "isPushWakeScreenForNotificationEnabled", "isPushNotificationHtmlRenderingEnabled", "getDoesPushStoryDismissOnClick", "doesPushStoryDismissOnClick", "isInAppMessageTestPushEagerDisplayEnabled", "isAutomaticGeofenceRequestsEnabled", "getLoggerInitialLogLevel", "loggerInitialLogLevel", "getCustomHtmlWebViewActivityClassName", "customHtmlWebViewActivityClassName", "getInAppMessageWebViewClientOnPageFinishedMaxWaitMs", "inAppMessageWebViewClientOnPageFinishedMaxWaitMs", "Lcom/braze/enums/LocationProviderName;", "getCustomLocationProviderNames", "customLocationProviderNames", "isSdkAuthenticationEnabled", "isTouchModeRequiredForHtmlInAppMessages", "isHtmlInAppMessageApplyWindowInsetsEnabled", "isHtmlInAppMessageHtmlLinkTargetEnabled", "Lcom/braze/enums/BrazeSdkMetadata;", "getSdkMetadata", "sdkMetadata", "isFallbackFirebaseMessagingServiceEnabled", "getFallbackFirebaseMessagingServiceClasspath", "fallbackFirebaseMessagingServiceClasspath", "getShouldOptInWhenPushAuthorized", "shouldOptInWhenPushAuthorized", "getShouldUseWindowFlagSecureInActivities", "shouldUseWindowFlagSecureInActivities", "isDelayedInitializationEnabled", "Lcom/braze/enums/DelayedInitializationAnalyticsBehavior;", "getDelayedInitializationAnalyticsBehavior", "()Lcom/braze/enums/DelayedInitializationAnalyticsBehavior;", "delayedInitializationAnalyticsBehavior", "getShouldAddStatusBarPaddingToInAppMessages", "shouldAddStatusBarPaddingToInAppMessages", "getServerTarget", "getServerTarget$annotations", "serverTarget", "Companion", "bo/app/e1", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public class BrazeConfigurationProvider extends CachedConfigurationProvider {
    public static final e1 Companion = new e1();
    public static final int DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS = 15000;
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeConfigurationProvider(Context context) {
        super(context, false, null, 6, null);
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.context = applicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_applicationIconResourceId_$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Couldn't find application icon for package: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$0() {
        return "Found an override api key. Using it to configure the Braze SDK";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$1() {
        return "****************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$2() {
        return "**                                                **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$3() {
        return "**                 !! WARNING !!                  **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$4() {
        return "**                                                **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$5() {
        return "**     No API key set in res/values/braze.xml     **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$6() {
        return "** No cached API Key found from Braze.configure   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$7() {
        return "**          Braze functionality disabled          **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$8() {
        return "**                                                **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$9() {
        return "****************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_defaultNotificationAccentColor_$lambda$0() {
        return "Using default notification accent color found in resources";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_ephemeralEventKeys_$lambda$0() {
        return "More than 12 ephemeral/graylisted events detected. Only using first 12 events. Please truncate this list!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_sdkFlavor_$lambda$0() {
        return "Exception while parsing stored SDK flavor. Returning null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_versionCode_$lambda$0() {
        return "Unable to read the version code.";
    }

    private final <E extends Enum<E>> EnumSet<E> getGenericEnumSetFromStringSet(Class<E> targetEnumClass, f1 configField) {
        String str = configField.a;
        if (getConfigurationCache().containsKey(str)) {
            Object obj = getConfigurationCache().get(str);
            obj.getClass();
            return (EnumSet) obj;
        }
        Set<String> stringSetValue = getStringSetValue(configField.a, new HashSet());
        if (stringSetValue == null) {
            stringSetValue = new HashSet<>();
        }
        EnumSet<E> a = d.a(targetEnumClass, stringSetValue);
        getConfigurationCache().put(str, a);
        return a;
    }

    private final String getServerTarget() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String stringValue = getStringValue("com_braze_server_target", "PROD");
        return stringValue == null ? "PROD" : stringValue;
    }

    public final int getApplicationIconResourceId() {
        BrazeConfigurationProvider brazeConfigurationProvider;
        if (getConfigurationCache().containsKey("application_icon")) {
            Object obj = getConfigurationCache().get("application_icon");
            obj.getClass();
            return ((Integer) obj).intValue();
        }
        String packageName = this.context.getPackageName();
        int i = 0;
        try {
            int i2 = Build.VERSION.SDK_INT;
            Context context = this.context;
            ApplicationInfo applicationInfo = i2 >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(0L)) : context.getPackageManager().getApplicationInfo(packageName, 0);
            applicationInfo.getClass();
            i = applicationInfo.icon;
            brazeConfigurationProvider = this;
        } catch (Exception e) {
            brazeConfigurationProvider = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeConfigurationProvider, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(packageName, 23), 4, (Object) null);
        }
        brazeConfigurationProvider.getConfigurationCache().put("application_icon", Integer.valueOf(i));
        return i;
    }

    public final String getBaseUrlForRequests() {
        String serverTarget = getServerTarget();
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = serverTarget.toUpperCase(locale);
        upperCase.getClass();
        return "STAGING".equals(upperCase) ? "https://sondheim.braze.com/api/v3/" : "https://sdk.iad-01.braze.com/api/v3/";
    }

    public final c1 getBrazeApiKey() {
        BrazeConfigurationProvider brazeConfigurationProvider;
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String str = (String) getConfigurationCache().get("com_braze_api_key");
        if (str == null) {
            str = getRuntimeAppConfigurationProvider().getStringValue("com_braze_api_key", null);
            if (str != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(3), 6, (Object) null);
                brazeConfigurationProvider = this;
            } else {
                brazeConfigurationProvider = this;
                str = brazeConfigurationProvider.getStringValue("com_braze_api_key", null);
            }
            if (str != null) {
                brazeConfigurationProvider.getConfigurationCache().put("com_braze_api_key", str);
            }
        } else {
            brazeConfigurationProvider = this;
        }
        if (str != null) {
            return new c1(str);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.W;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeConfigurationProvider, priority, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(8), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(9), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(10), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(11), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(12), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(13), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(14), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(15), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(16), 6, (Object) null);
        OptionalProvider$$ExternalSyntheticLambda0.m$1("Unable to read the Braze API key from the res/values/braze.xml file or from runtime configuration via BrazeConfig. See log for more details.");
        return null;
    }

    public final String getCustomEndpoint() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_custom_endpoint", null);
    }

    public final String getCustomHtmlWebViewActivityClassName() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_custom_html_webview_activity_class_name", "");
    }

    public final EnumSet<LocationProviderName> getCustomLocationProviderNames() {
        return getGenericEnumSetFromStringSet(LocationProviderName.class, f1.CUSTOM_LOCATION_PROVIDERS_LIST_KEY);
    }

    public final int getDefaultNotificationAccentColor() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        Integer colorValue = getColorValue("com_braze_default_notification_accent_color");
        if (colorValue == null) {
            return 0;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(5), 7, (Object) null);
        return colorValue.intValue();
    }

    public final String getDefaultNotificationChannelDescription() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String stringValue = getStringValue("com_braze_default_notification_channel_description", "");
        return stringValue == null ? "" : stringValue;
    }

    public final String getDefaultNotificationChannelName() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String stringValue = getStringValue("com_braze_default_notification_channel_name", "General");
        return stringValue == null ? "General" : stringValue;
    }

    public final DelayedInitializationAnalyticsBehavior getDelayedInitializationAnalyticsBehavior() {
        DelayedInitializationAnalyticsBehavior.Companion companion = DelayedInitializationAnalyticsBehavior.INSTANCE;
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior = DelayedInitializationAnalyticsBehavior.QUEUE;
        String stringValue = getStringValue("com_braze_delayed_initialization_analytics_behavior", delayedInitializationAnalyticsBehavior.getValue());
        if (stringValue == null) {
            stringValue = delayedInitializationAnalyticsBehavior.getValue();
        }
        return companion.fromString(stringValue);
    }

    public final EnumSet<DeviceKey> getDeviceObjectAllowlist() {
        return getGenericEnumSetFromStringSet(DeviceKey.class, f1.DEVICE_OBJECT_ALLOWLIST_VALUE);
    }

    public final boolean getDoesHandlePushDeepLinksAutomatically() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_handle_push_deep_links_automatically", false);
    }

    public final boolean getDoesPushStoryDismissOnClick() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_does_push_story_dismiss_on_click", true);
    }

    public final Set<String> getEphemeralEventKeys() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        Set<String> set = EmptySet.INSTANCE;
        Set<String> stringSetValue = getStringSetValue("com_braze_ephemeral_events_keys", set);
        if (stringSetValue != null) {
            set = stringSetValue;
        }
        if (set.size() > 12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(6), 6, (Object) null);
        }
        return CollectionsKt.toSet(CollectionsKt.take(set, 12));
    }

    public final String getFallbackFirebaseMessagingServiceClasspath() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_fallback_firebase_cloud_messaging_service_classpath", null);
    }

    public final String getFirebaseCloudMessagingSenderIdKey() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_firebase_cloud_messaging_sender_id", null);
    }

    public final int getInAppMessageWebViewClientOnPageFinishedMaxWaitMs() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getIntValue("com_braze_in_app_message_webview_client_max_onpagefinished_wait_ms", DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS);
    }

    public final int getLargeNotificationIconResourceId() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getDrawableValue("com_braze_push_large_notification_icon", 0);
    }

    public final int getLoggerInitialLogLevel() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getIntValue("com_braze_logger_initial_log_level", 4);
    }

    public final String getPushDeepLinkBackStackActivityClassName() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_push_deep_link_back_stack_activity_class_name", "");
    }

    public final SdkFlavor getSdkFlavor() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String stringValue = getStringValue("com_braze_sdk_flavor", null);
        if (stringValue != null && !StringsKt.isBlank(stringValue)) {
            try {
                Locale locale = Locale.US;
                locale.getClass();
                String upperCase = stringValue.toUpperCase(locale);
                upperCase.getClass();
                return SdkFlavor.valueOf(upperCase);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(7), 4, (Object) null);
            }
        }
        return null;
    }

    public final EnumSet<BrazeSdkMetadata> getSdkMetadata() {
        String upperCase;
        int i;
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        i3 i3Var = i3.STRING_ARRAY;
        Object resourceConfigurationValue = getResourceConfigurationValue(i3Var, "com_braze_internal_sdk_metadata", new HashSet());
        resourceConfigurationValue.getClass();
        Set<String> asMutableSet = TypeIntrinsics.asMutableSet(resourceConfigurationValue);
        Object resourceConfigurationValue2 = getResourceConfigurationValue(i3Var, "com_braze_sdk_metadata", new HashSet());
        resourceConfigurationValue2.getClass();
        Object runtimeConfigurationValue = getRuntimeConfigurationValue(i3Var, "com_braze_sdk_metadata", new HashSet());
        runtimeConfigurationValue.getClass();
        asMutableSet.addAll((Set) resourceConfigurationValue2);
        asMutableSet.addAll((Set) runtimeConfigurationValue);
        EnumSet<BrazeSdkMetadata> noneOf = EnumSet.noneOf(BrazeSdkMetadata.class);
        for (String str : asMutableSet) {
            try {
                Locale locale = Locale.US;
                locale.getClass();
                upperCase = str.toUpperCase(locale);
                upperCase.getClass();
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d.a, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new e7(str), 4, (Object) null);
            }
            for (BrazeSdkMetadata brazeSdkMetadata : BrazeSdkMetadata.values()) {
                if (Intrinsics.areEqual(brazeSdkMetadata.name(), upperCase)) {
                    noneOf.add(brazeSdkMetadata);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        noneOf.getClass();
        return noneOf;
    }

    public final int getSessionTimeoutSeconds() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getIntValue("com_braze_session_timeout", 10);
    }

    public final boolean getShouldAddStatusBarPaddingToInAppMessages() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_in_app_message_add_status_bar_padding", false);
    }

    public final boolean getShouldOptInWhenPushAuthorized() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_optin_when_push_authorized", true);
    }

    public final boolean getShouldUseWindowFlagSecureInActivities() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_use_activity_window_flag_secure", false);
    }

    public final int getSmallNotificationIconResourceId() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getDrawableValue("com_braze_push_small_notification_icon", 0);
    }

    public final long getTriggerActionMinimumTimeIntervalInSeconds() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getIntValue("com_braze_trigger_action_minimum_time_interval_seconds", 30);
    }

    public final int getVersionCode() {
        BrazeConfigurationProvider brazeConfigurationProvider;
        int i;
        if (getConfigurationCache().containsKey("version_code")) {
            Object obj = getConfigurationCache().get("version_code");
            obj.getClass();
            return ((Integer) obj).intValue();
        }
        try {
            i = this.context.getPackageManager().getPackageInfo(PackageUtils.getResourcePackageName(this.context), 0).versionCode;
            brazeConfigurationProvider = this;
        } catch (Exception e) {
            brazeConfigurationProvider = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeConfigurationProvider, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(4), 4, (Object) null);
            i = -1;
        }
        brazeConfigurationProvider.getConfigurationCache().put("version_code", Integer.valueOf(i));
        return i;
    }

    public final boolean isAdmMessagingRegistrationEnabled() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_push_adm_messaging_registration_enabled", false);
    }

    public final boolean isAutomaticGeofenceRequestsEnabled() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_automatic_geofence_requests_enabled", true);
    }

    public final boolean isAutomaticLocationCollectionEnabled() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_enable_location_collection", false);
    }

    public final boolean isContentCardsUnreadVisualIndicatorEnabled() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_content_cards_unread_visual_indicator_enabled", true);
    }

    public final boolean isDelayedInitializationEnabled() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_enable_delayed_initialization", false);
    }

    public final boolean isDeviceObjectAllowlistEnabled() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_device_object_whitelisting_enabled", false);
    }

    public final boolean isEphemeralEventsEnabled() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_ephemeral_events_enabled", false);
    }

    public final boolean isFallbackFirebaseMessagingServiceEnabled() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_fallback_firebase_cloud_messaging_service_enabled", false);
    }

    public final boolean isFirebaseCloudMessagingRegistrationEnabled() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_firebase_cloud_messaging_registration_enabled", false);
    }

    public final boolean isGeofencesEnabled() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_geofences_enabled", isAutomaticLocationCollectionEnabled());
    }

    public final boolean isHtmlInAppMessageApplyWindowInsetsEnabled() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_html_in_app_message_apply_insets", true);
    }

    public final boolean isHtmlInAppMessageHtmlLinkTargetEnabled() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_html_in_app_message_enable_html_link_target", true);
    }

    public final boolean isInAppMessageAccessibilityExclusiveModeEnabled() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_device_in_app_message_accessibility_exclusive_mode_enabled", false);
    }

    public final boolean isInAppMessageTestPushEagerDisplayEnabled() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_in_app_message_push_test_eager_display_enabled", true);
    }

    public final boolean isPushDeepLinkBackStackActivityEnabled() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_push_deep_link_back_stack_activity_enabled", true);
    }

    public final boolean isPushNotificationHtmlRenderingEnabled() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_push_notification_html_rendering_enabled", false);
    }

    public final boolean isPushWakeScreenForNotificationEnabled() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_push_wake_screen_for_notification_enabled", true);
    }

    public final boolean isSdkAuthenticationEnabled() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_sdk_authentication_enabled", false);
    }

    public final boolean isSessionStartBasedTimeoutEnabled() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_session_start_based_timeout_enabled", false);
    }

    public final boolean isTouchModeRequiredForHtmlInAppMessages() {
        f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_require_touch_mode_for_html_in_app_messages", true);
    }
}
