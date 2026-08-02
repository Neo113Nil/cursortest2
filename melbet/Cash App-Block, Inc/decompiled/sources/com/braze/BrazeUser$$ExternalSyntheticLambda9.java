package com.braze;

import com.braze.configuration.BrazeConfig;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.configuration.CachedConfigurationProvider;
import com.braze.configuration.RuntimeAppConfigurationProvider;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.managers.BrazeGeofenceManager;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BrazeUser$$ExternalSyntheticLambda9 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BrazeUser$$ExternalSyntheticLambda9(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String removeFromCustomAttributeArray$lambda$0;
        String firebaseCloudMessagingSenderIdKey$lambda$0;
        String apiKey$lambda$0;
        String _get_brazeApiKey_$lambda$0;
        String _get_versionCode_$lambda$0;
        String _get_defaultNotificationAccentColor_$lambda$0;
        String _get_ephemeralEventKeys_$lambda$0;
        String _get_sdkFlavor_$lambda$0;
        String _get_brazeApiKey_$lambda$1;
        String _get_brazeApiKey_$lambda$2;
        String _get_brazeApiKey_$lambda$3;
        String _get_brazeApiKey_$lambda$4;
        String _get_brazeApiKey_$lambda$5;
        String _get_brazeApiKey_$lambda$6;
        String _get_brazeApiKey_$lambda$7;
        String _get_brazeApiKey_$lambda$8;
        String _get_brazeApiKey_$lambda$9;
        String readResourceValue$lambda$1;
        String resetCache$lambda$0;
        String clearAllConfigurationValues$lambda$0;
        String renderUrlIntoView$lambda$0;
        String bitmapFromUrl$lambda$0;
        String bitmapFromUrl$lambda$2;
        String unregisterGeofences$lambda$0;
        String isGeofencesEnabledFromEnvironment$lambda$3;
        String isGeofencesEnabledFromEnvironment$lambda$4;
        String retrieveBrazeGeofencesFromLocalStorage$lambda$0;
        String upGeofences$lambda$0;
        String upGeofences$lambda$2;
        String configureFromServerConfig$lambda$2;
        switch (this.$r8$classId) {
            case 0:
                removeFromCustomAttributeArray$lambda$0 = BrazeUser.removeFromCustomAttributeArray$lambda$0();
                return removeFromCustomAttributeArray$lambda$0;
            case 1:
                firebaseCloudMessagingSenderIdKey$lambda$0 = BrazeConfig.Builder.setFirebaseCloudMessagingSenderIdKey$lambda$0();
                return firebaseCloudMessagingSenderIdKey$lambda$0;
            case 2:
                apiKey$lambda$0 = BrazeConfig.Builder.setApiKey$lambda$0();
                return apiKey$lambda$0;
            case 3:
                _get_brazeApiKey_$lambda$0 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$0();
                return _get_brazeApiKey_$lambda$0;
            case 4:
                _get_versionCode_$lambda$0 = BrazeConfigurationProvider._get_versionCode_$lambda$0();
                return _get_versionCode_$lambda$0;
            case 5:
                _get_defaultNotificationAccentColor_$lambda$0 = BrazeConfigurationProvider._get_defaultNotificationAccentColor_$lambda$0();
                return _get_defaultNotificationAccentColor_$lambda$0;
            case 6:
                _get_ephemeralEventKeys_$lambda$0 = BrazeConfigurationProvider._get_ephemeralEventKeys_$lambda$0();
                return _get_ephemeralEventKeys_$lambda$0;
            case 7:
                _get_sdkFlavor_$lambda$0 = BrazeConfigurationProvider._get_sdkFlavor_$lambda$0();
                return _get_sdkFlavor_$lambda$0;
            case 8:
                _get_brazeApiKey_$lambda$1 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$1();
                return _get_brazeApiKey_$lambda$1;
            case 9:
                _get_brazeApiKey_$lambda$2 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$2();
                return _get_brazeApiKey_$lambda$2;
            case 10:
                _get_brazeApiKey_$lambda$3 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$3();
                return _get_brazeApiKey_$lambda$3;
            case 11:
                _get_brazeApiKey_$lambda$4 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$4();
                return _get_brazeApiKey_$lambda$4;
            case 12:
                _get_brazeApiKey_$lambda$5 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$5();
                return _get_brazeApiKey_$lambda$5;
            case 13:
                _get_brazeApiKey_$lambda$6 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$6();
                return _get_brazeApiKey_$lambda$6;
            case 14:
                _get_brazeApiKey_$lambda$7 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$7();
                return _get_brazeApiKey_$lambda$7;
            case 15:
                _get_brazeApiKey_$lambda$8 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$8();
                return _get_brazeApiKey_$lambda$8;
            case 16:
                _get_brazeApiKey_$lambda$9 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$9();
                return _get_brazeApiKey_$lambda$9;
            case 17:
                readResourceValue$lambda$1 = CachedConfigurationProvider.readResourceValue$lambda$1();
                return readResourceValue$lambda$1;
            case 18:
                resetCache$lambda$0 = CachedConfigurationProvider.resetCache$lambda$0();
                return resetCache$lambda$0;
            case 19:
                clearAllConfigurationValues$lambda$0 = RuntimeAppConfigurationProvider.clearAllConfigurationValues$lambda$0();
                return clearAllConfigurationValues$lambda$0;
            case 20:
                renderUrlIntoView$lambda$0 = DefaultBrazeImageLoader.renderUrlIntoView$lambda$0();
                return renderUrlIntoView$lambda$0;
            case 21:
                bitmapFromUrl$lambda$0 = DefaultBrazeImageLoader.getBitmapFromUrl$lambda$0();
                return bitmapFromUrl$lambda$0;
            case 22:
                bitmapFromUrl$lambda$2 = DefaultBrazeImageLoader.getBitmapFromUrl$lambda$2();
                return bitmapFromUrl$lambda$2;
            case 23:
                unregisterGeofences$lambda$0 = BrazeGeofenceManager.unregisterGeofences$lambda$0();
                return unregisterGeofences$lambda$0;
            case 24:
                isGeofencesEnabledFromEnvironment$lambda$3 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$3();
                return isGeofencesEnabledFromEnvironment$lambda$3;
            case 25:
                isGeofencesEnabledFromEnvironment$lambda$4 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$4();
                return isGeofencesEnabledFromEnvironment$lambda$4;
            case 26:
                retrieveBrazeGeofencesFromLocalStorage$lambda$0 = BrazeGeofenceManager.retrieveBrazeGeofencesFromLocalStorage$lambda$0();
                return retrieveBrazeGeofencesFromLocalStorage$lambda$0;
            case 27:
                upGeofences$lambda$0 = BrazeGeofenceManager.setUpGeofences$lambda$0();
                return upGeofences$lambda$0;
            case 28:
                upGeofences$lambda$2 = BrazeGeofenceManager.setUpGeofences$lambda$2();
                return upGeofences$lambda$2;
            default:
                configureFromServerConfig$lambda$2 = BrazeGeofenceManager.configureFromServerConfig$lambda$2(false);
                return configureFromServerConfig$lambda$2;
        }
    }
}
