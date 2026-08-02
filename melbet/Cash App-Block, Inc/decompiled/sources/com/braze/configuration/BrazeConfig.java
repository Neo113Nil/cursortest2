package com.braze.configuration;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.braze.BrazeUser$$ExternalSyntheticLambda9;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DeviceKey;
import com.braze.enums.LocationProviderName;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001@B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010?\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010#\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010%\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010&\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010'\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010(\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010)\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010*\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010+\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010,\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010-\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0018\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0018\u00102\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u00104\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u00107\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u00108\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u00109\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0012\u0010:\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010<\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010=\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010>\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001e¨\u0006A"}, d2 = {"Lcom/braze/configuration/BrazeConfig;", "", "builder", "Lcom/braze/configuration/BrazeConfig$Builder;", "<init>", "(Lcom/braze/configuration/BrazeConfig$Builder;)V", "apiKey", "", "serverTarget", "smallNotificationIcon", "largeNotificationIcon", "customEndpoint", "defaultNotificationChannelName", "defaultNotificationChannelDescription", "pushDeepLinkBackStackActivityClassName", "firebaseCloudMessagingSenderIdKey", "customHtmlWebViewActivityClassName", "sdkFlavor", "Lcom/braze/enums/SdkFlavor;", "sessionTimeout", "", "Ljava/lang/Integer;", "defaultNotificationAccentColor", "triggerActionMinimumTimeIntervalSeconds", "badNetworkInterval", "goodNetworkInterval", "greatNetworkInterval", "inAppMessageWebViewClientMaxOnPageFinishedWaitMs", "isAdmMessagingRegistrationEnabled", "", "Ljava/lang/Boolean;", "willHandlePushDeepLinksAutomatically", "isAutomaticLocationCollectionEnabled", "isPushDeepLinkBackStackActivityEnabled", "isSessionStartBasedTimeoutEnabled", "isFirebaseCloudMessagingRegistrationEnabled", "isContentCardsUnreadVisualIndicatorEnabled", "isInAppMessageAccessibilityExclusiveModeEnabled", "isPushWakeScreenForNotificationEnabled", "isPushHtmlRenderingEnabled", "areGeofencesEnabled", "isInAppMessageTestPushEagerDisplayEnabled", "areAutomaticGeofenceRequestsEnabled", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled", "isSdkAuthEnabled", "isTouchModeRequiredForHtmlInAppMessages", "deviceObjectAllowlist", "Ljava/util/EnumSet;", "Lcom/braze/enums/DeviceKey;", "isDeviceObjectAllowlistEnabled", "customLocationProviderNames", "Lcom/braze/enums/LocationProviderName;", "brazeSdkMetadata", "Lcom/braze/enums/BrazeSdkMetadata;", "isHtmlInAppMessageApplyWindowInsetsEnabled", "isHtmlInAppMessageHtmlLinkTargetEnabled", "doesPushStoryDismissOnClick", "isFallbackFirebaseMessagingServiceEnabled", "fallbackFirebaseMessagingServiceClasspath", "shouldOptInWhenPushAuthorized", "shouldUseWindowFlagSecureInActivities", "shouldPersistWebViewWhenBackgroundingApp", "shouldAddStatusBarPaddingToInAppMessages", "toString", "Builder", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeConfig {
    public final String apiKey;
    public final Boolean areAutomaticGeofenceRequestsEnabled;
    public final Boolean areGeofencesEnabled;
    public final Integer badNetworkInterval;
    public final EnumSet<BrazeSdkMetadata> brazeSdkMetadata;
    private final Builder builder;
    public final String customEndpoint;
    public final String customHtmlWebViewActivityClassName;
    public final EnumSet<LocationProviderName> customLocationProviderNames;
    public final Integer defaultNotificationAccentColor;
    public final String defaultNotificationChannelDescription;
    public final String defaultNotificationChannelName;
    public final EnumSet<DeviceKey> deviceObjectAllowlist;
    public final Boolean doesPushStoryDismissOnClick;
    public final String fallbackFirebaseMessagingServiceClasspath;
    public final String firebaseCloudMessagingSenderIdKey;
    public final Integer goodNetworkInterval;
    public final Integer greatNetworkInterval;
    public final Integer inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
    public final Boolean isAdmMessagingRegistrationEnabled;
    public final Boolean isAutomaticLocationCollectionEnabled;
    public final Boolean isContentCardsUnreadVisualIndicatorEnabled;
    public final Boolean isDeviceObjectAllowlistEnabled;
    public final Boolean isFallbackFirebaseMessagingServiceEnabled;
    public final Boolean isFirebaseCloudMessagingRegistrationEnabled;
    public final Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
    public final Boolean isHtmlInAppMessageApplyWindowInsetsEnabled;
    public final Boolean isHtmlInAppMessageHtmlLinkTargetEnabled;
    public final Boolean isInAppMessageAccessibilityExclusiveModeEnabled;
    public final Boolean isInAppMessageTestPushEagerDisplayEnabled;
    public final Boolean isPushDeepLinkBackStackActivityEnabled;
    public final Boolean isPushHtmlRenderingEnabled;
    public final Boolean isPushWakeScreenForNotificationEnabled;
    public final Boolean isSdkAuthEnabled;
    public final Boolean isSessionStartBasedTimeoutEnabled;
    public final Boolean isTouchModeRequiredForHtmlInAppMessages;
    public final String largeNotificationIcon;
    public final String pushDeepLinkBackStackActivityClassName;
    public final SdkFlavor sdkFlavor;
    public final String serverTarget;
    public final Integer sessionTimeout;
    public final Boolean shouldAddStatusBarPaddingToInAppMessages;
    public final Boolean shouldOptInWhenPushAuthorized;
    public final Boolean shouldPersistWebViewWhenBackgroundingApp;
    public final Boolean shouldUseWindowFlagSecureInActivities;
    public final String smallNotificationIcon;
    public final Integer triggerActionMinimumTimeIntervalSeconds;
    public final Boolean willHandlePushDeepLinksAutomatically;

    private BrazeConfig(Builder builder) {
        this.builder = builder;
        this.apiKey = builder.getApiKey();
        this.serverTarget = builder.getServerTarget();
        this.smallNotificationIcon = builder.getSmallNotificationIconName();
        this.largeNotificationIcon = builder.getLargeNotificationIconName();
        this.customEndpoint = builder.getCustomEndpoint();
        this.defaultNotificationChannelName = builder.getDefaultNotificationChannelName();
        this.defaultNotificationChannelDescription = builder.getDefaultNotificationChannelDescription();
        this.pushDeepLinkBackStackActivityClassName = builder.getPushDeepLinkBackStackActivityClassName();
        this.firebaseCloudMessagingSenderIdKey = builder.getFirebaseCloudMessagingSenderIdKey();
        this.customHtmlWebViewActivityClassName = builder.getCustomHtmlWebViewActivityClassName();
        this.sdkFlavor = builder.getSdkFlavor();
        this.sessionTimeout = builder.getSessionTimeout();
        this.defaultNotificationAccentColor = builder.getDefaultNotificationAccentColor();
        this.triggerActionMinimumTimeIntervalSeconds = builder.getTriggerActionMinimumTimeIntervalSeconds();
        this.badNetworkInterval = builder.getBadNetworkInterval();
        this.goodNetworkInterval = builder.getGoodNetworkInterval();
        this.greatNetworkInterval = builder.getGreatNetworkInterval();
        this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = builder.getInAppMessageWebViewClientMaxOnPageFinishedWaitMs();
        this.isAdmMessagingRegistrationEnabled = builder.getAdmMessagingRegistrationEnabled();
        this.willHandlePushDeepLinksAutomatically = builder.getHandlePushDeepLinksAutomatically();
        this.isAutomaticLocationCollectionEnabled = builder.getIsAutomaticLocationCollectionEnabled();
        this.isPushDeepLinkBackStackActivityEnabled = builder.getIsPushDeepLinkBackStackActivityEnabled();
        this.isSessionStartBasedTimeoutEnabled = builder.getIsSessionStartBasedTimeoutEnabled();
        this.isFirebaseCloudMessagingRegistrationEnabled = builder.getIsFirebaseCloudMessagingRegistrationEnabled();
        this.isContentCardsUnreadVisualIndicatorEnabled = builder.getIsContentCardsUnreadVisualIndicatorEnabled();
        this.isInAppMessageAccessibilityExclusiveModeEnabled = builder.getIsInAppMessageAccessibilityExclusiveModeEnabled();
        this.isPushWakeScreenForNotificationEnabled = builder.getIsPushWakeScreenForNotificationEnabled();
        this.isPushHtmlRenderingEnabled = builder.getIsPushHtmlRenderingEnabled();
        this.areGeofencesEnabled = builder.getIsGeofencesEnabled();
        this.isInAppMessageTestPushEagerDisplayEnabled = builder.getInAppMessageTestPushEagerDisplayEnabled();
        this.areAutomaticGeofenceRequestsEnabled = builder.getAutomaticGeofenceRequestsEnabled();
        this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = builder.getIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled();
        this.isSdkAuthEnabled = builder.getIsSdkAuthEnabled();
        this.isTouchModeRequiredForHtmlInAppMessages = builder.getIsTouchModeRequiredForHtmlInAppMessages();
        this.deviceObjectAllowlist = builder.getDeviceObjectAllowlist$android_sdk_base_release();
        this.isDeviceObjectAllowlistEnabled = builder.getIsDeviceObjectAllowlistEnabled();
        this.customLocationProviderNames = builder.getCustomLocationProviderNames$android_sdk_base_release();
        this.brazeSdkMetadata = builder.getBrazeSdkMetadata$android_sdk_base_release();
        this.isHtmlInAppMessageApplyWindowInsetsEnabled = builder.getIsHtmlInAppMessageApplyWindowInsetsEnabled();
        this.isHtmlInAppMessageHtmlLinkTargetEnabled = builder.getIsHtmlInAppMessageHtmlLinkTargetEnabled();
        this.doesPushStoryDismissOnClick = builder.getDoesPushStoryDismissOnClick();
        this.isFallbackFirebaseMessagingServiceEnabled = builder.getIsFallbackFirebaseMessagingServiceEnabled();
        this.fallbackFirebaseMessagingServiceClasspath = builder.getFallbackFirebaseMessagingServiceClasspath();
        this.shouldOptInWhenPushAuthorized = builder.getShouldOptInWhenPushAuthorized();
        this.shouldUseWindowFlagSecureInActivities = builder.getShouldUseWindowFlagSecureInActivities();
        this.shouldPersistWebViewWhenBackgroundingApp = builder.getShouldPersistWebViewWhenBackgroundingApp();
        this.shouldAddStatusBarPaddingToInAppMessages = builder.getShouldAddStatusBarPaddingToInAppMessages();
    }

    public String toString() {
        return this.builder.toString();
    }

    public /* synthetic */ BrazeConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0003\b\u0081\u0001\b\u0007\u0018\u00002\u00020\u0001BÏ\u0004\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010(\u0012\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010(\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b9\u0010:B\t\b\u0016¢\u0006\u0004\b9\u0010;J\r\u0010=\u001a\u00020<¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\bA\u0010@J\u0015\u0010B\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\bB\u0010@J\u0015\u0010D\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u000f¢\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\bF\u0010EJ\u0015\u0010G\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u000f¢\u0006\u0004\bJ\u0010EJ\u0015\u0010L\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u0017¢\u0006\u0004\bL\u0010HJ\u0015\u0010N\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u0002¢\u0006\u0004\bN\u0010@J\u000f\u0010O\u001a\u00020\u0002H\u0016¢\u0006\u0004\bO\u0010PR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010Q\u001a\u0004\bR\u0010P\"\u0004\bS\u0010TR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010Q\u001a\u0004\bU\u0010P\"\u0004\bV\u0010TR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010Q\u001a\u0004\bW\u0010P\"\u0004\bX\u0010TR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010Q\u001a\u0004\bY\u0010P\"\u0004\bZ\u0010TR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010Q\u001a\u0004\b[\u0010P\"\u0004\b\\\u0010TR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010Q\u001a\u0004\b]\u0010P\"\u0004\b^\u0010TR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010Q\u001a\u0004\b_\u0010P\"\u0004\b`\u0010TR$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010Q\u001a\u0004\ba\u0010P\"\u0004\bb\u0010TR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010Q\u001a\u0004\bc\u0010P\"\u0004\bd\u0010TR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010Q\u001a\u0004\be\u0010P\"\u0004\bf\u0010TR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR$\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010l\u001a\u0004\bq\u0010n\"\u0004\br\u0010pR$\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010l\u001a\u0004\bs\u0010n\"\u0004\bt\u0010pR$\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010l\u001a\u0004\bu\u0010n\"\u0004\bv\u0010pR$\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010l\u001a\u0004\bw\u0010n\"\u0004\bx\u0010pR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010l\u001a\u0004\by\u0010n\"\u0004\bz\u0010pR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010l\u001a\u0004\b{\u0010n\"\u0004\b|\u0010pR&\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b\u0018\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R'\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b\u0019\u0010}\u001a\u0005\b\u0082\u0001\u0010\u007f\"\u0006\b\u0083\u0001\u0010\u0081\u0001R'\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b\u001a\u0010}\u001a\u0005\b\u0084\u0001\u0010\u007f\"\u0006\b\u0085\u0001\u0010\u0081\u0001R'\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b\u001b\u0010}\u001a\u0005\b\u0086\u0001\u0010\u007f\"\u0006\b\u0087\u0001\u0010\u0081\u0001R'\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b\u001c\u0010}\u001a\u0005\b\u0088\u0001\u0010\u007f\"\u0006\b\u0089\u0001\u0010\u0081\u0001R'\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b\u001d\u0010}\u001a\u0005\b\u008a\u0001\u0010\u007f\"\u0006\b\u008b\u0001\u0010\u0081\u0001R'\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b\u001e\u0010}\u001a\u0005\b\u008c\u0001\u0010\u007f\"\u0006\b\u008d\u0001\u0010\u0081\u0001R'\u0010\u001f\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b\u001f\u0010}\u001a\u0005\b\u008e\u0001\u0010\u007f\"\u0006\b\u008f\u0001\u0010\u0081\u0001R'\u0010 \u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b \u0010}\u001a\u0005\b\u0090\u0001\u0010\u007f\"\u0006\b\u0091\u0001\u0010\u0081\u0001R'\u0010!\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b!\u0010}\u001a\u0005\b\u0092\u0001\u0010\u007f\"\u0006\b\u0093\u0001\u0010\u0081\u0001R'\u0010\"\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b\"\u0010}\u001a\u0005\b\u0094\u0001\u0010\u007f\"\u0006\b\u0095\u0001\u0010\u0081\u0001R'\u0010#\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b#\u0010}\u001a\u0005\b\u0096\u0001\u0010\u007f\"\u0006\b\u0097\u0001\u0010\u0081\u0001R'\u0010$\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b$\u0010}\u001a\u0005\b\u0098\u0001\u0010\u007f\"\u0006\b\u0099\u0001\u0010\u0081\u0001R'\u0010%\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b%\u0010}\u001a\u0005\b\u009a\u0001\u0010\u007f\"\u0006\b\u009b\u0001\u0010\u0081\u0001R'\u0010&\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b&\u0010}\u001a\u0005\b\u009c\u0001\u0010\u007f\"\u0006\b\u009d\u0001\u0010\u0081\u0001R'\u0010'\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b'\u0010}\u001a\u0005\b\u009e\u0001\u0010\u007f\"\u0006\b\u009f\u0001\u0010\u0081\u0001R/\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b*\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R'\u0010+\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b+\u0010}\u001a\u0005\b¥\u0001\u0010\u007f\"\u0006\b¦\u0001\u0010\u0081\u0001R/\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b-\u0010 \u0001\u001a\u0006\b§\u0001\u0010¢\u0001\"\u0006\b¨\u0001\u0010¤\u0001R/\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b/\u0010 \u0001\u001a\u0006\b©\u0001\u0010¢\u0001\"\u0006\bª\u0001\u0010¤\u0001R'\u00100\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b0\u0010}\u001a\u0005\b«\u0001\u0010\u007f\"\u0006\b¬\u0001\u0010\u0081\u0001R'\u00101\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b1\u0010}\u001a\u0005\b\u00ad\u0001\u0010\u007f\"\u0006\b®\u0001\u0010\u0081\u0001R'\u00102\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b2\u0010}\u001a\u0005\b¯\u0001\u0010\u007f\"\u0006\b°\u0001\u0010\u0081\u0001R'\u00103\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b3\u0010}\u001a\u0005\b±\u0001\u0010\u007f\"\u0006\b²\u0001\u0010\u0081\u0001R&\u00104\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b4\u0010Q\u001a\u0005\b³\u0001\u0010P\"\u0005\b´\u0001\u0010TR'\u00105\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b5\u0010}\u001a\u0005\bµ\u0001\u0010\u007f\"\u0006\b¶\u0001\u0010\u0081\u0001R'\u00106\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b6\u0010}\u001a\u0005\b·\u0001\u0010\u007f\"\u0006\b¸\u0001\u0010\u0081\u0001R'\u00107\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b7\u0010}\u001a\u0005\b¹\u0001\u0010\u007f\"\u0006\bº\u0001\u0010\u0081\u0001R'\u00108\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b8\u0010}\u001a\u0005\b»\u0001\u0010\u007f\"\u0006\b¼\u0001\u0010\u0081\u0001¨\u0006½\u0001"}, d2 = {"Lcom/braze/configuration/BrazeConfig$Builder;", "", "", "apiKey", "serverTarget", "smallNotificationIconName", "largeNotificationIconName", "customEndpoint", "defaultNotificationChannelName", "defaultNotificationChannelDescription", "pushDeepLinkBackStackActivityClassName", "firebaseCloudMessagingSenderIdKey", "customHtmlWebViewActivityClassName", "Lcom/braze/enums/SdkFlavor;", "sdkFlavor", "", "sessionTimeout", "defaultNotificationAccentColor", "triggerActionMinimumTimeIntervalSeconds", "badNetworkInterval", "goodNetworkInterval", "greatNetworkInterval", "inAppMessageWebViewClientMaxOnPageFinishedWaitMs", "", "admMessagingRegistrationEnabled", "handlePushDeepLinksAutomatically", "isAutomaticLocationCollectionEnabled", "isPushDeepLinkBackStackActivityEnabled", "isSessionStartBasedTimeoutEnabled", "isFirebaseCloudMessagingRegistrationEnabled", "isContentCardsUnreadVisualIndicatorEnabled", "isInAppMessageAccessibilityExclusiveModeEnabled", "isPushWakeScreenForNotificationEnabled", "isPushHtmlRenderingEnabled", "isGeofencesEnabled", "inAppMessageTestPushEagerDisplayEnabled", "automaticGeofenceRequestsEnabled", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled", "isTouchModeRequiredForHtmlInAppMessages", "isSdkAuthEnabled", "Ljava/util/EnumSet;", "Lcom/braze/enums/DeviceKey;", "deviceObjectAllowlist", "isDeviceObjectAllowlistEnabled", "Lcom/braze/enums/BrazeSdkMetadata;", "brazeSdkMetadata", "Lcom/braze/enums/LocationProviderName;", "customLocationProviderNames", "isHtmlInAppMessageApplyWindowInsetsEnabled", "isHtmlInAppMessageHtmlLinkTargetEnabled", "doesPushStoryDismissOnClick", "isFallbackFirebaseMessagingServiceEnabled", "fallbackFirebaseMessagingServiceClasspath", "shouldOptInWhenPushAuthorized", "shouldUseWindowFlagSecureInActivities", "shouldPersistWebViewWhenBackgroundingApp", "shouldAddStatusBarPaddingToInAppMessages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/braze/enums/SdkFlavor;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/EnumSet;Ljava/lang/Boolean;Ljava/util/EnumSet;Ljava/util/EnumSet;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()V", "Lcom/braze/configuration/BrazeConfig;", "build", "()Lcom/braze/configuration/BrazeConfig;", "setApiKey", "(Ljava/lang/String;)Lcom/braze/configuration/BrazeConfig$Builder;", "setSmallNotificationIcon", "setCustomEndpoint", "sessionTimeoutSeconds", "setSessionTimeout", "(I)Lcom/braze/configuration/BrazeConfig$Builder;", "setDefaultNotificationAccentColor", "setHandlePushDeepLinksAutomatically", "(Z)Lcom/braze/configuration/BrazeConfig$Builder;", "greatNetworkIntervalSeconds", "setGreatNetworkDataFlushInterval", "firebaseMessagingRegistrationEnabled", "setIsFirebaseCloudMessagingRegistrationEnabled", "firebaseSenderId", "setFirebaseCloudMessagingSenderIdKey", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getApiKey$android_sdk_base_release", "setApiKey$android_sdk_base_release", "(Ljava/lang/String;)V", "getServerTarget$android_sdk_base_release", "setServerTarget$android_sdk_base_release", "getSmallNotificationIconName$android_sdk_base_release", "setSmallNotificationIconName$android_sdk_base_release", "getLargeNotificationIconName$android_sdk_base_release", "setLargeNotificationIconName$android_sdk_base_release", "getCustomEndpoint$android_sdk_base_release", "setCustomEndpoint$android_sdk_base_release", "getDefaultNotificationChannelName$android_sdk_base_release", "setDefaultNotificationChannelName$android_sdk_base_release", "getDefaultNotificationChannelDescription$android_sdk_base_release", "setDefaultNotificationChannelDescription$android_sdk_base_release", "getPushDeepLinkBackStackActivityClassName$android_sdk_base_release", "setPushDeepLinkBackStackActivityClassName$android_sdk_base_release", "getFirebaseCloudMessagingSenderIdKey$android_sdk_base_release", "setFirebaseCloudMessagingSenderIdKey$android_sdk_base_release", "getCustomHtmlWebViewActivityClassName$android_sdk_base_release", "setCustomHtmlWebViewActivityClassName$android_sdk_base_release", "Lcom/braze/enums/SdkFlavor;", "getSdkFlavor$android_sdk_base_release", "()Lcom/braze/enums/SdkFlavor;", "setSdkFlavor$android_sdk_base_release", "(Lcom/braze/enums/SdkFlavor;)V", "Ljava/lang/Integer;", "getSessionTimeout$android_sdk_base_release", "()Ljava/lang/Integer;", "setSessionTimeout$android_sdk_base_release", "(Ljava/lang/Integer;)V", "getDefaultNotificationAccentColor$android_sdk_base_release", "setDefaultNotificationAccentColor$android_sdk_base_release", "getTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release", "setTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release", "getBadNetworkInterval$android_sdk_base_release", "setBadNetworkInterval$android_sdk_base_release", "getGoodNetworkInterval$android_sdk_base_release", "setGoodNetworkInterval$android_sdk_base_release", "getGreatNetworkInterval$android_sdk_base_release", "setGreatNetworkInterval$android_sdk_base_release", "getInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release", "setInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release", "Ljava/lang/Boolean;", "getAdmMessagingRegistrationEnabled$android_sdk_base_release", "()Ljava/lang/Boolean;", "setAdmMessagingRegistrationEnabled$android_sdk_base_release", "(Ljava/lang/Boolean;)V", "getHandlePushDeepLinksAutomatically$android_sdk_base_release", "setHandlePushDeepLinksAutomatically$android_sdk_base_release", "isAutomaticLocationCollectionEnabled$android_sdk_base_release", "setAutomaticLocationCollectionEnabled$android_sdk_base_release", "isPushDeepLinkBackStackActivityEnabled$android_sdk_base_release", "setPushDeepLinkBackStackActivityEnabled$android_sdk_base_release", "isSessionStartBasedTimeoutEnabled$android_sdk_base_release", "setSessionStartBasedTimeoutEnabled$android_sdk_base_release", "isFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release", "setFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release", "isContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release", "setContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release", "isInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release", "setInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release", "isPushWakeScreenForNotificationEnabled$android_sdk_base_release", "setPushWakeScreenForNotificationEnabled$android_sdk_base_release", "isPushHtmlRenderingEnabled$android_sdk_base_release", "setPushHtmlRenderingEnabled$android_sdk_base_release", "isGeofencesEnabled$android_sdk_base_release", "setGeofencesEnabled$android_sdk_base_release", "getInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release", "setInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release", "getAutomaticGeofenceRequestsEnabled$android_sdk_base_release", "setAutomaticGeofenceRequestsEnabled$android_sdk_base_release", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release", "setFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release", "isTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release", "setTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release", "isSdkAuthEnabled$android_sdk_base_release", "setSdkAuthEnabled$android_sdk_base_release", "Ljava/util/EnumSet;", "getDeviceObjectAllowlist$android_sdk_base_release", "()Ljava/util/EnumSet;", "setDeviceObjectAllowlist$android_sdk_base_release", "(Ljava/util/EnumSet;)V", "isDeviceObjectAllowlistEnabled$android_sdk_base_release", "setDeviceObjectAllowlistEnabled$android_sdk_base_release", "getBrazeSdkMetadata$android_sdk_base_release", "setBrazeSdkMetadata$android_sdk_base_release", "getCustomLocationProviderNames$android_sdk_base_release", "setCustomLocationProviderNames$android_sdk_base_release", "isHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release", "setHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release", "isHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release", "setHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release", "getDoesPushStoryDismissOnClick$android_sdk_base_release", "setDoesPushStoryDismissOnClick$android_sdk_base_release", "isFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release", "setFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release", "getFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release", "setFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release", "getShouldOptInWhenPushAuthorized$android_sdk_base_release", "setShouldOptInWhenPushAuthorized$android_sdk_base_release", "getShouldUseWindowFlagSecureInActivities$android_sdk_base_release", "setShouldUseWindowFlagSecureInActivities$android_sdk_base_release", "getShouldPersistWebViewWhenBackgroundingApp$android_sdk_base_release", "setShouldPersistWebViewWhenBackgroundingApp$android_sdk_base_release", "getShouldAddStatusBarPaddingToInAppMessages$android_sdk_base_release", "setShouldAddStatusBarPaddingToInAppMessages$android_sdk_base_release", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {
        private Boolean admMessagingRegistrationEnabled;
        private String apiKey;
        private Boolean automaticGeofenceRequestsEnabled;
        private Integer badNetworkInterval;
        private EnumSet<BrazeSdkMetadata> brazeSdkMetadata;
        private String customEndpoint;
        private String customHtmlWebViewActivityClassName;
        private EnumSet<LocationProviderName> customLocationProviderNames;
        private Integer defaultNotificationAccentColor;
        private String defaultNotificationChannelDescription;
        private String defaultNotificationChannelName;
        private EnumSet<DeviceKey> deviceObjectAllowlist;
        private Boolean doesPushStoryDismissOnClick;
        private String fallbackFirebaseMessagingServiceClasspath;
        private String firebaseCloudMessagingSenderIdKey;
        private Integer goodNetworkInterval;
        private Integer greatNetworkInterval;
        private Boolean handlePushDeepLinksAutomatically;
        private Boolean inAppMessageTestPushEagerDisplayEnabled;
        private Integer inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        private Boolean isAutomaticLocationCollectionEnabled;
        private Boolean isContentCardsUnreadVisualIndicatorEnabled;
        private Boolean isDeviceObjectAllowlistEnabled;
        private Boolean isFallbackFirebaseMessagingServiceEnabled;
        private Boolean isFirebaseCloudMessagingRegistrationEnabled;
        private Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        private Boolean isGeofencesEnabled;
        private Boolean isHtmlInAppMessageApplyWindowInsetsEnabled;
        private Boolean isHtmlInAppMessageHtmlLinkTargetEnabled;
        private Boolean isInAppMessageAccessibilityExclusiveModeEnabled;
        private Boolean isPushDeepLinkBackStackActivityEnabled;
        private Boolean isPushHtmlRenderingEnabled;
        private Boolean isPushWakeScreenForNotificationEnabled;
        private Boolean isSdkAuthEnabled;
        private Boolean isSessionStartBasedTimeoutEnabled;
        private Boolean isTouchModeRequiredForHtmlInAppMessages;
        private String largeNotificationIconName;
        private String pushDeepLinkBackStackActivityClassName;
        private SdkFlavor sdkFlavor;
        private String serverTarget;
        private Integer sessionTimeout;
        private Boolean shouldAddStatusBarPaddingToInAppMessages;
        private Boolean shouldOptInWhenPushAuthorized;
        private Boolean shouldPersistWebViewWhenBackgroundingApp;
        private Boolean shouldUseWindowFlagSecureInActivities;
        private String smallNotificationIconName;
        private Integer triggerActionMinimumTimeIntervalSeconds;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, EnumSet enumSet, Boolean bool17, EnumSet enumSet2, EnumSet enumSet3, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, String str11, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(r2, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : sdkFlavor, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : num2, (i & PKIFailureInfo.certRevoked) != 0 ? null : num3, (i & 16384) != 0 ? null : num4, (i & 32768) != 0 ? null : num5, (i & 65536) != 0 ? null : num6, (i & PKIFailureInfo.unsupportedVersion) != 0 ? null : num7, (i & PKIFailureInfo.transactionIdInUse) != 0 ? null : bool, (i & PKIFailureInfo.signerNotTrusted) != 0 ? null : bool2, (i & PKIFailureInfo.badCertTemplate) != 0 ? null : bool3, (i & PKIFailureInfo.badSenderNonce) != 0 ? null : bool4, (i & 4194304) != 0 ? null : bool5, (i & 8388608) != 0 ? null : bool6, (i & 16777216) != 0 ? null : bool7, (i & 33554432) != 0 ? null : bool8, (i & 67108864) != 0 ? null : bool9, (i & 134217728) != 0 ? null : bool10, (i & 268435456) != 0 ? null : bool11, (i & PKIFailureInfo.duplicateCertReq) != 0 ? null : bool12, (i & 1073741824) != 0 ? null : bool13, (i & PKIFailureInfo.systemUnavail) != 0 ? null : bool14, (i2 & 1) != 0 ? null : bool15, (i2 & 2) != 0 ? null : bool16, (i2 & 4) != 0 ? null : enumSet, (i2 & 8) != 0 ? null : bool17, (i2 & 16) != 0 ? null : enumSet2, (i2 & 32) != 0 ? null : enumSet3, (i2 & 64) != 0 ? null : bool18, (i2 & 128) != 0 ? null : bool19, (i2 & 256) != 0 ? null : bool20, (i2 & 512) != 0 ? null : bool21, (i2 & 1024) != 0 ? null : str11, (i2 & 2048) != 0 ? null : bool22, (i2 & 4096) != 0 ? null : bool23, (i2 & PKIFailureInfo.certRevoked) != 0 ? null : bool24, (i2 & 16384) != 0 ? null : bool25);
            String str12 = (i & 1) != 0 ? null : str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setApiKey$lambda$0() {
            return "Cannot set Braze API key to blank string. API key field not set";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setFirebaseCloudMessagingSenderIdKey$lambda$0() {
            return "Cannot set Firebase Cloud Messaging Sender Id to blank string. Firebase Cloud Messaging Sender Id field not set";
        }

        public final BrazeConfig build() {
            return new BrazeConfig(this, null);
        }

        /* renamed from: getAdmMessagingRegistrationEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getAdmMessagingRegistrationEnabled() {
            return this.admMessagingRegistrationEnabled;
        }

        /* renamed from: getApiKey$android_sdk_base_release, reason: from getter */
        public final String getApiKey() {
            return this.apiKey;
        }

        /* renamed from: getAutomaticGeofenceRequestsEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getAutomaticGeofenceRequestsEnabled() {
            return this.automaticGeofenceRequestsEnabled;
        }

        /* renamed from: getBadNetworkInterval$android_sdk_base_release, reason: from getter */
        public final Integer getBadNetworkInterval() {
            return this.badNetworkInterval;
        }

        public final EnumSet<BrazeSdkMetadata> getBrazeSdkMetadata$android_sdk_base_release() {
            return this.brazeSdkMetadata;
        }

        /* renamed from: getCustomEndpoint$android_sdk_base_release, reason: from getter */
        public final String getCustomEndpoint() {
            return this.customEndpoint;
        }

        /* renamed from: getCustomHtmlWebViewActivityClassName$android_sdk_base_release, reason: from getter */
        public final String getCustomHtmlWebViewActivityClassName() {
            return this.customHtmlWebViewActivityClassName;
        }

        public final EnumSet<LocationProviderName> getCustomLocationProviderNames$android_sdk_base_release() {
            return this.customLocationProviderNames;
        }

        /* renamed from: getDefaultNotificationAccentColor$android_sdk_base_release, reason: from getter */
        public final Integer getDefaultNotificationAccentColor() {
            return this.defaultNotificationAccentColor;
        }

        /* renamed from: getDefaultNotificationChannelDescription$android_sdk_base_release, reason: from getter */
        public final String getDefaultNotificationChannelDescription() {
            return this.defaultNotificationChannelDescription;
        }

        /* renamed from: getDefaultNotificationChannelName$android_sdk_base_release, reason: from getter */
        public final String getDefaultNotificationChannelName() {
            return this.defaultNotificationChannelName;
        }

        public final EnumSet<DeviceKey> getDeviceObjectAllowlist$android_sdk_base_release() {
            return this.deviceObjectAllowlist;
        }

        /* renamed from: getDoesPushStoryDismissOnClick$android_sdk_base_release, reason: from getter */
        public final Boolean getDoesPushStoryDismissOnClick() {
            return this.doesPushStoryDismissOnClick;
        }

        /* renamed from: getFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release, reason: from getter */
        public final String getFallbackFirebaseMessagingServiceClasspath() {
            return this.fallbackFirebaseMessagingServiceClasspath;
        }

        /* renamed from: getFirebaseCloudMessagingSenderIdKey$android_sdk_base_release, reason: from getter */
        public final String getFirebaseCloudMessagingSenderIdKey() {
            return this.firebaseCloudMessagingSenderIdKey;
        }

        /* renamed from: getGoodNetworkInterval$android_sdk_base_release, reason: from getter */
        public final Integer getGoodNetworkInterval() {
            return this.goodNetworkInterval;
        }

        /* renamed from: getGreatNetworkInterval$android_sdk_base_release, reason: from getter */
        public final Integer getGreatNetworkInterval() {
            return this.greatNetworkInterval;
        }

        /* renamed from: getHandlePushDeepLinksAutomatically$android_sdk_base_release, reason: from getter */
        public final Boolean getHandlePushDeepLinksAutomatically() {
            return this.handlePushDeepLinksAutomatically;
        }

        /* renamed from: getInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getInAppMessageTestPushEagerDisplayEnabled() {
            return this.inAppMessageTestPushEagerDisplayEnabled;
        }

        /* renamed from: getInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release, reason: from getter */
        public final Integer getInAppMessageWebViewClientMaxOnPageFinishedWaitMs() {
            return this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        }

        /* renamed from: getLargeNotificationIconName$android_sdk_base_release, reason: from getter */
        public final String getLargeNotificationIconName() {
            return this.largeNotificationIconName;
        }

        /* renamed from: getPushDeepLinkBackStackActivityClassName$android_sdk_base_release, reason: from getter */
        public final String getPushDeepLinkBackStackActivityClassName() {
            return this.pushDeepLinkBackStackActivityClassName;
        }

        /* renamed from: getSdkFlavor$android_sdk_base_release, reason: from getter */
        public final SdkFlavor getSdkFlavor() {
            return this.sdkFlavor;
        }

        /* renamed from: getServerTarget$android_sdk_base_release, reason: from getter */
        public final String getServerTarget() {
            return this.serverTarget;
        }

        /* renamed from: getSessionTimeout$android_sdk_base_release, reason: from getter */
        public final Integer getSessionTimeout() {
            return this.sessionTimeout;
        }

        /* renamed from: getShouldAddStatusBarPaddingToInAppMessages$android_sdk_base_release, reason: from getter */
        public final Boolean getShouldAddStatusBarPaddingToInAppMessages() {
            return this.shouldAddStatusBarPaddingToInAppMessages;
        }

        /* renamed from: getShouldOptInWhenPushAuthorized$android_sdk_base_release, reason: from getter */
        public final Boolean getShouldOptInWhenPushAuthorized() {
            return this.shouldOptInWhenPushAuthorized;
        }

        /* renamed from: getShouldPersistWebViewWhenBackgroundingApp$android_sdk_base_release, reason: from getter */
        public final Boolean getShouldPersistWebViewWhenBackgroundingApp() {
            return this.shouldPersistWebViewWhenBackgroundingApp;
        }

        /* renamed from: getShouldUseWindowFlagSecureInActivities$android_sdk_base_release, reason: from getter */
        public final Boolean getShouldUseWindowFlagSecureInActivities() {
            return this.shouldUseWindowFlagSecureInActivities;
        }

        /* renamed from: getSmallNotificationIconName$android_sdk_base_release, reason: from getter */
        public final String getSmallNotificationIconName() {
            return this.smallNotificationIconName;
        }

        /* renamed from: getTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release, reason: from getter */
        public final Integer getTriggerActionMinimumTimeIntervalSeconds() {
            return this.triggerActionMinimumTimeIntervalSeconds;
        }

        /* renamed from: isAutomaticLocationCollectionEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsAutomaticLocationCollectionEnabled() {
            return this.isAutomaticLocationCollectionEnabled;
        }

        /* renamed from: isContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsContentCardsUnreadVisualIndicatorEnabled() {
            return this.isContentCardsUnreadVisualIndicatorEnabled;
        }

        /* renamed from: isDeviceObjectAllowlistEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsDeviceObjectAllowlistEnabled() {
            return this.isDeviceObjectAllowlistEnabled;
        }

        /* renamed from: isFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsFallbackFirebaseMessagingServiceEnabled() {
            return this.isFallbackFirebaseMessagingServiceEnabled;
        }

        /* renamed from: isFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsFirebaseCloudMessagingRegistrationEnabled() {
            return this.isFirebaseCloudMessagingRegistrationEnabled;
        }

        /* renamed from: isFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled() {
            return this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        }

        /* renamed from: isGeofencesEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsGeofencesEnabled() {
            return this.isGeofencesEnabled;
        }

        /* renamed from: isHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsHtmlInAppMessageApplyWindowInsetsEnabled() {
            return this.isHtmlInAppMessageApplyWindowInsetsEnabled;
        }

        /* renamed from: isHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsHtmlInAppMessageHtmlLinkTargetEnabled() {
            return this.isHtmlInAppMessageHtmlLinkTargetEnabled;
        }

        /* renamed from: isInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsInAppMessageAccessibilityExclusiveModeEnabled() {
            return this.isInAppMessageAccessibilityExclusiveModeEnabled;
        }

        /* renamed from: isPushDeepLinkBackStackActivityEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsPushDeepLinkBackStackActivityEnabled() {
            return this.isPushDeepLinkBackStackActivityEnabled;
        }

        /* renamed from: isPushHtmlRenderingEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsPushHtmlRenderingEnabled() {
            return this.isPushHtmlRenderingEnabled;
        }

        /* renamed from: isPushWakeScreenForNotificationEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsPushWakeScreenForNotificationEnabled() {
            return this.isPushWakeScreenForNotificationEnabled;
        }

        /* renamed from: isSdkAuthEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsSdkAuthEnabled() {
            return this.isSdkAuthEnabled;
        }

        /* renamed from: isSessionStartBasedTimeoutEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsSessionStartBasedTimeoutEnabled() {
            return this.isSessionStartBasedTimeoutEnabled;
        }

        /* renamed from: isTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release, reason: from getter */
        public final Boolean getIsTouchModeRequiredForHtmlInAppMessages() {
            return this.isTouchModeRequiredForHtmlInAppMessages;
        }

        public final Builder setApiKey(String apiKey) {
            apiKey.getClass();
            if (StringsKt.isBlank(apiKey)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(2), 6, (Object) null);
                return this;
            }
            this.apiKey = apiKey;
            return this;
        }

        public final Builder setCustomEndpoint(String customEndpoint) {
            customEndpoint.getClass();
            this.customEndpoint = customEndpoint;
            return this;
        }

        public final Builder setDefaultNotificationAccentColor(int defaultNotificationAccentColor) {
            this.defaultNotificationAccentColor = Integer.valueOf(defaultNotificationAccentColor);
            return this;
        }

        public final Builder setFirebaseCloudMessagingSenderIdKey(String firebaseSenderId) {
            firebaseSenderId.getClass();
            if (StringsKt.isBlank(firebaseSenderId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(1), 6, (Object) null);
                return this;
            }
            this.firebaseCloudMessagingSenderIdKey = firebaseSenderId;
            return this;
        }

        public final Builder setGreatNetworkDataFlushInterval(int greatNetworkIntervalSeconds) {
            this.greatNetworkInterval = Integer.valueOf(greatNetworkIntervalSeconds);
            return this;
        }

        public final Builder setHandlePushDeepLinksAutomatically(boolean handlePushDeepLinksAutomatically) {
            this.handlePushDeepLinksAutomatically = Boolean.valueOf(handlePushDeepLinksAutomatically);
            return this;
        }

        public final Builder setIsFirebaseCloudMessagingRegistrationEnabled(boolean firebaseMessagingRegistrationEnabled) {
            this.isFirebaseCloudMessagingRegistrationEnabled = Boolean.valueOf(firebaseMessagingRegistrationEnabled);
            return this;
        }

        public final Builder setSessionTimeout(int sessionTimeoutSeconds) {
            this.sessionTimeout = Integer.valueOf(sessionTimeoutSeconds);
            return this;
        }

        public final Builder setSmallNotificationIcon(String smallNotificationIconName) {
            smallNotificationIconName.getClass();
            this.smallNotificationIconName = smallNotificationIconName;
            return this;
        }

        public String toString() {
            String str = this.apiKey;
            String str2 = this.serverTarget;
            String str3 = this.smallNotificationIconName;
            String str4 = this.largeNotificationIconName;
            String str5 = this.customEndpoint;
            String str6 = this.defaultNotificationChannelName;
            String str7 = this.defaultNotificationChannelDescription;
            String str8 = this.pushDeepLinkBackStackActivityClassName;
            String str9 = this.firebaseCloudMessagingSenderIdKey;
            String str10 = this.customHtmlWebViewActivityClassName;
            SdkFlavor sdkFlavor = this.sdkFlavor;
            Integer num = this.sessionTimeout;
            Integer num2 = this.defaultNotificationAccentColor;
            Integer num3 = this.triggerActionMinimumTimeIntervalSeconds;
            Integer num4 = this.badNetworkInterval;
            Integer num5 = this.goodNetworkInterval;
            Integer num6 = this.greatNetworkInterval;
            Integer num7 = this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
            Boolean bool = this.admMessagingRegistrationEnabled;
            Boolean bool2 = this.handlePushDeepLinksAutomatically;
            Boolean bool3 = this.isAutomaticLocationCollectionEnabled;
            Boolean bool4 = this.isPushDeepLinkBackStackActivityEnabled;
            Boolean bool5 = this.isSessionStartBasedTimeoutEnabled;
            Boolean bool6 = this.isFirebaseCloudMessagingRegistrationEnabled;
            Boolean bool7 = this.isContentCardsUnreadVisualIndicatorEnabled;
            Boolean bool8 = this.isInAppMessageAccessibilityExclusiveModeEnabled;
            Boolean bool9 = this.isPushWakeScreenForNotificationEnabled;
            Boolean bool10 = this.isPushHtmlRenderingEnabled;
            Boolean bool11 = this.isGeofencesEnabled;
            Boolean bool12 = this.inAppMessageTestPushEagerDisplayEnabled;
            Boolean bool13 = this.automaticGeofenceRequestsEnabled;
            Boolean bool14 = this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
            Boolean bool15 = this.isTouchModeRequiredForHtmlInAppMessages;
            Boolean bool16 = this.isSdkAuthEnabled;
            EnumSet<DeviceKey> enumSet = this.deviceObjectAllowlist;
            Boolean bool17 = this.isDeviceObjectAllowlistEnabled;
            EnumSet<BrazeSdkMetadata> enumSet2 = this.brazeSdkMetadata;
            EnumSet<LocationProviderName> enumSet3 = this.customLocationProviderNames;
            Boolean bool18 = this.isHtmlInAppMessageApplyWindowInsetsEnabled;
            Boolean bool19 = this.isHtmlInAppMessageHtmlLinkTargetEnabled;
            Boolean bool20 = this.doesPushStoryDismissOnClick;
            Boolean bool21 = this.isFallbackFirebaseMessagingServiceEnabled;
            String str11 = this.fallbackFirebaseMessagingServiceClasspath;
            Boolean bool22 = this.shouldOptInWhenPushAuthorized;
            Boolean bool23 = this.shouldUseWindowFlagSecureInActivities;
            Boolean bool24 = this.shouldAddStatusBarPaddingToInAppMessages;
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Builder(apiKey=", str, ", serverTarget=", str2, ", smallNotificationIconName=");
            Boxes$$ExternalSyntheticOutline1.m(m, str3, ", largeNotificationIconName=", str4, ", customEndpoint=");
            Boxes$$ExternalSyntheticOutline1.m(m, str5, ", defaultNotificationChannelName=", str6, ", defaultNotificationChannelDescription=");
            Boxes$$ExternalSyntheticOutline1.m(m, str7, ", pushDeepLinkBackStackActivityClassName=", str8, ", firebaseCloudMessagingSenderIdKey=");
            Boxes$$ExternalSyntheticOutline1.m(m, str9, ", customHtmlWebViewActivityClassName=", str10, ", sdkFlavor=");
            m.append(sdkFlavor);
            m.append(", sessionTimeout=");
            m.append(num);
            m.append(", defaultNotificationAccentColor=");
            NavAction$$ExternalSyntheticOutline0.m(m, num2, ", triggerActionMinimumTimeIntervalSeconds=", num3, ", badNetworkInterval=");
            NavAction$$ExternalSyntheticOutline0.m(m, num4, ", goodNetworkInterval=", num5, ", greatNetworkInterval=");
            NavAction$$ExternalSyntheticOutline0.m(m, num6, ", inAppMessageWebViewClientMaxOnPageFinishedWaitMs=", num7, ", admMessagingRegistrationEnabled=");
            Thread$State$EnumUnboxingLocalUtility.m(m, bool, ", handlePushDeepLinksAutomatically=", bool2, ", isAutomaticLocationCollectionEnabled=");
            Thread$State$EnumUnboxingLocalUtility.m(m, bool3, ", isPushDeepLinkBackStackActivityEnabled=", bool4, ", isSessionStartBasedTimeoutEnabled=");
            Thread$State$EnumUnboxingLocalUtility.m(m, bool5, ", isFirebaseCloudMessagingRegistrationEnabled=", bool6, ", isContentCardsUnreadVisualIndicatorEnabled=");
            Thread$State$EnumUnboxingLocalUtility.m(m, bool7, ", isInAppMessageAccessibilityExclusiveModeEnabled=", bool8, ", isPushWakeScreenForNotificationEnabled=");
            Thread$State$EnumUnboxingLocalUtility.m(m, bool9, ", isPushHtmlRenderingEnabled=", bool10, ", isGeofencesEnabled=");
            Thread$State$EnumUnboxingLocalUtility.m(m, bool11, ", inAppMessageTestPushEagerDisplayEnabled=", bool12, ", automaticGeofenceRequestsEnabled=");
            Thread$State$EnumUnboxingLocalUtility.m(m, bool13, ", isFirebaseMessagingServiceOnNewTokenRegistrationEnabled=", bool14, ", isTouchModeRequiredForHtmlInAppMessages=");
            Thread$State$EnumUnboxingLocalUtility.m(m, bool15, ", isSdkAuthEnabled=", bool16, ", deviceObjectAllowlist=");
            m.append(enumSet);
            m.append(", isDeviceObjectAllowlistEnabled=");
            m.append(bool17);
            m.append(", brazeSdkMetadata=");
            m.append(enumSet2);
            m.append(", customLocationProviderNames=");
            m.append(enumSet3);
            m.append(", isHtmlInAppMessageApplyWindowInsetsEnabled=");
            Thread$State$EnumUnboxingLocalUtility.m(m, bool18, ", isHtmlInAppMessageHtmlLinkTargetEnabled=", bool19, ", doesPushStoryDismissOnClick=");
            Thread$State$EnumUnboxingLocalUtility.m(m, bool20, ", isFallbackFirebaseMessagingServiceEnabled=", bool21, ", fallbackFirebaseMessagingServiceClasspath=");
            Thread$State$EnumUnboxingLocalUtility.m(m, str11, ", shouldOptInWhenPushAuthorized=", bool22, ", shouldUseWindowFlagSecureInActivities=");
            m.append(bool23);
            m.append(", shouldAddStatusBarPaddingToInAppMessages=");
            m.append(bool24);
            m.append("))");
            return m.toString();
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, EnumSet<DeviceKey> enumSet, Boolean bool17, EnumSet<BrazeSdkMetadata> enumSet2, EnumSet<LocationProviderName> enumSet3, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, String str11, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25) {
            this.apiKey = str;
            this.serverTarget = str2;
            this.smallNotificationIconName = str3;
            this.largeNotificationIconName = str4;
            this.customEndpoint = str5;
            this.defaultNotificationChannelName = str6;
            this.defaultNotificationChannelDescription = str7;
            this.pushDeepLinkBackStackActivityClassName = str8;
            this.firebaseCloudMessagingSenderIdKey = str9;
            this.customHtmlWebViewActivityClassName = str10;
            this.sdkFlavor = sdkFlavor;
            this.sessionTimeout = num;
            this.defaultNotificationAccentColor = num2;
            this.triggerActionMinimumTimeIntervalSeconds = num3;
            this.badNetworkInterval = num4;
            this.goodNetworkInterval = num5;
            this.greatNetworkInterval = num6;
            this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = num7;
            this.admMessagingRegistrationEnabled = bool;
            this.handlePushDeepLinksAutomatically = bool2;
            this.isAutomaticLocationCollectionEnabled = bool3;
            this.isPushDeepLinkBackStackActivityEnabled = bool4;
            this.isSessionStartBasedTimeoutEnabled = bool5;
            this.isFirebaseCloudMessagingRegistrationEnabled = bool6;
            this.isContentCardsUnreadVisualIndicatorEnabled = bool7;
            this.isInAppMessageAccessibilityExclusiveModeEnabled = bool8;
            this.isPushWakeScreenForNotificationEnabled = bool9;
            this.isPushHtmlRenderingEnabled = bool10;
            this.isGeofencesEnabled = bool11;
            this.inAppMessageTestPushEagerDisplayEnabled = bool12;
            this.automaticGeofenceRequestsEnabled = bool13;
            this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = bool14;
            this.isTouchModeRequiredForHtmlInAppMessages = bool15;
            this.isSdkAuthEnabled = bool16;
            this.deviceObjectAllowlist = enumSet;
            this.isDeviceObjectAllowlistEnabled = bool17;
            this.brazeSdkMetadata = enumSet2;
            this.customLocationProviderNames = enumSet3;
            this.isHtmlInAppMessageApplyWindowInsetsEnabled = bool18;
            this.isHtmlInAppMessageHtmlLinkTargetEnabled = bool19;
            this.doesPushStoryDismissOnClick = bool20;
            this.isFallbackFirebaseMessagingServiceEnabled = bool21;
            this.fallbackFirebaseMessagingServiceClasspath = str11;
            this.shouldOptInWhenPushAuthorized = bool22;
            this.shouldUseWindowFlagSecureInActivities = bool23;
            this.shouldPersistWebViewWhenBackgroundingApp = bool24;
            this.shouldAddStatusBarPaddingToInAppMessages = bool25;
        }

        public Builder() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE, null);
        }
    }
}
