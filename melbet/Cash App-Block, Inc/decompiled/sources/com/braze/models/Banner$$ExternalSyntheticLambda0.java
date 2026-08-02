package com.braze.models;

import com.braze.managers.BrazeGeofenceManager;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.inappmessage.InAppMessageControl;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class Banner$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Banner$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String forJsonPut$lambda$1;
        String unregisterGeofences$lambda$1;
        String registerGeofences$lambda$0;
        String requestGeofenceRefresh$lambda$2;
        String _init_$lambda$0;
        String _init_$lambda$1;
        String tearDownGeofences$lambda$0;
        String tearDownGeofences$lambda$1;
        String tearDownGeofences$lambda$2$0;
        String isGeofencesEnabledFromEnvironment$lambda$0;
        String isGeofencesEnabledFromEnvironment$lambda$1;
        String isGeofencesEnabledFromEnvironment$lambda$2;
        String geofencesEnabledFromServerConfig$lambda$0;
        String geofencesEnabledFromServerConfig$lambda$1;
        String geofencesEnabledFromServerConfig$lambda$2;
        String forJsonPut$lambda$0;
        String _set_isIndicatorHighlighted_$lambda$0;
        String _set_isDismissed_$lambda$0;
        String _set_isDismissed_$lambda$2;
        String isValidCard$lambda$0;
        String forJsonPut$lambda$12;
        String logImpression$lambda$1;
        String logImpression$lambda$2;
        String logImpression$lambda$0;
        String enableDarkTheme$lambda$0;
        String handleLogClick$lambda$1;
        String handleLogClick$lambda$2;
        String handleLogClick$lambda$0;
        String logImpression$lambda$02;
        String logImpression$lambda$22;
        switch (this.$r8$classId) {
            case 0:
                forJsonPut$lambda$1 = Banner.forJsonPut$lambda$1();
                return forJsonPut$lambda$1;
            case 1:
                unregisterGeofences$lambda$1 = BrazeGeofenceManager.unregisterGeofences$lambda$1();
                return unregisterGeofences$lambda$1;
            case 2:
                registerGeofences$lambda$0 = BrazeGeofenceManager.registerGeofences$lambda$0();
                return registerGeofences$lambda$0;
            case 3:
                requestGeofenceRefresh$lambda$2 = BrazeGeofenceManager.requestGeofenceRefresh$lambda$2();
                return requestGeofenceRefresh$lambda$2;
            case 4:
                _init_$lambda$0 = BrazeGeofenceManager._init_$lambda$0();
                return _init_$lambda$0;
            case 5:
                _init_$lambda$1 = BrazeGeofenceManager._init_$lambda$1();
                return _init_$lambda$1;
            case 6:
                tearDownGeofences$lambda$0 = BrazeGeofenceManager.tearDownGeofences$lambda$0();
                return tearDownGeofences$lambda$0;
            case 7:
                tearDownGeofences$lambda$1 = BrazeGeofenceManager.tearDownGeofences$lambda$1();
                return tearDownGeofences$lambda$1;
            case 8:
                tearDownGeofences$lambda$2$0 = BrazeGeofenceManager.tearDownGeofences$lambda$2$0();
                return tearDownGeofences$lambda$2$0;
            case 9:
                isGeofencesEnabledFromEnvironment$lambda$0 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$0();
                return isGeofencesEnabledFromEnvironment$lambda$0;
            case 10:
                isGeofencesEnabledFromEnvironment$lambda$1 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$1();
                return isGeofencesEnabledFromEnvironment$lambda$1;
            case 11:
                isGeofencesEnabledFromEnvironment$lambda$2 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$2();
                return isGeofencesEnabledFromEnvironment$lambda$2;
            case 12:
                geofencesEnabledFromServerConfig$lambda$0 = BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$0();
                return geofencesEnabledFromServerConfig$lambda$0;
            case 13:
                geofencesEnabledFromServerConfig$lambda$1 = BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$1();
                return geofencesEnabledFromServerConfig$lambda$1;
            case 14:
                geofencesEnabledFromServerConfig$lambda$2 = BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$2();
                return geofencesEnabledFromServerConfig$lambda$2;
            case 15:
                forJsonPut$lambda$0 = FeatureFlag.forJsonPut$lambda$0();
                return forJsonPut$lambda$0;
            case 16:
                _set_isIndicatorHighlighted_$lambda$0 = Card._set_isIndicatorHighlighted_$lambda$0();
                return _set_isIndicatorHighlighted_$lambda$0;
            case 17:
                _set_isDismissed_$lambda$0 = Card._set_isDismissed_$lambda$0();
                return _set_isDismissed_$lambda$0;
            case 18:
                _set_isDismissed_$lambda$2 = Card._set_isDismissed_$lambda$2();
                return _set_isDismissed_$lambda$2;
            case 19:
                isValidCard$lambda$0 = Card.isValidCard$lambda$0();
                return isValidCard$lambda$0;
            case 20:
                forJsonPut$lambda$12 = InAppMessageBase.forJsonPut$lambda$1();
                return forJsonPut$lambda$12;
            case 21:
                logImpression$lambda$1 = InAppMessageBase.logImpression$lambda$1();
                return logImpression$lambda$1;
            case 22:
                logImpression$lambda$2 = InAppMessageBase.logImpression$lambda$2();
                return logImpression$lambda$2;
            case 23:
                logImpression$lambda$0 = InAppMessageBase.logImpression$lambda$0();
                return logImpression$lambda$0;
            case 24:
                enableDarkTheme$lambda$0 = InAppMessageBase.enableDarkTheme$lambda$0();
                return enableDarkTheme$lambda$0;
            case 25:
                handleLogClick$lambda$1 = InAppMessageBase.handleLogClick$lambda$1();
                return handleLogClick$lambda$1;
            case 26:
                handleLogClick$lambda$2 = InAppMessageBase.handleLogClick$lambda$2();
                return handleLogClick$lambda$2;
            case 27:
                handleLogClick$lambda$0 = InAppMessageBase.handleLogClick$lambda$0();
                return handleLogClick$lambda$0;
            case 28:
                logImpression$lambda$02 = InAppMessageControl.logImpression$lambda$0();
                return logImpression$lambda$02;
            default:
                logImpression$lambda$22 = InAppMessageControl.logImpression$lambda$2();
                return logImpression$lambda$22;
        }
    }
}
