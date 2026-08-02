package com.braze;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.images.DefaultBrazeImageLoader;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda82 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ Braze$$ExternalSyntheticLambda82(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String _set_registeredPushToken_$lambda$1$2;
        String verifyProperSdkSetup$lambda$0;
        String removeFromCustomAttributeArray$lambda$1;
        String addToSubscriptionGroup$lambda$2;
        String country$lambda$1;
        String phoneNumber$lambda$2$0;
        String language$lambda$1;
        String firstName$lambda$1;
        String addToCustomAttributeArray$lambda$1;
        String lastName$lambda$1;
        String phoneNumber$lambda$3;
        String homeCity$lambda$1;
        String lineId$lambda$2$0;
        String lineId$lambda$3;
        String addAlias$lambda$3;
        String customUserAttribute$lambda$4;
        String customUserAttribute$lambda$5;
        String customUserAttribute$lambda$1;
        String customUserAttribute$lambda$0;
        String removeFromSubscriptionGroup$lambda$2;
        String customAttributeArray$lambda$0;
        String email$lambda$2$0;
        String email$lambda$3;
        String _get_applicationIconResourceId_$lambda$0;
        String fromString$lambda$1;
        String putBitmapIntoCache$lambda$1;
        String putBitmapIntoCache$lambda$2$0;
        String bitmapFromDiskCache$lambda$0$0;
        String bitmapFromDiskCache$lambda$0$1;
        String renderUrlIntoView$lambda$1;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                _set_registeredPushToken_$lambda$1$2 = Braze._set_registeredPushToken_$lambda$1$2(str);
                return _set_registeredPushToken_$lambda$1$2;
            case 1:
                verifyProperSdkSetup$lambda$0 = Braze.verifyProperSdkSetup$lambda$0(str);
                return verifyProperSdkSetup$lambda$0;
            case 2:
                removeFromCustomAttributeArray$lambda$1 = BrazeUser.removeFromCustomAttributeArray$lambda$1(str);
                return removeFromCustomAttributeArray$lambda$1;
            case 3:
                addToSubscriptionGroup$lambda$2 = BrazeUser.addToSubscriptionGroup$lambda$2(str);
                return addToSubscriptionGroup$lambda$2;
            case 4:
                country$lambda$1 = BrazeUser.setCountry$lambda$1(str);
                return country$lambda$1;
            case 5:
                phoneNumber$lambda$2$0 = BrazeUser.setPhoneNumber$lambda$2$0(str);
                return phoneNumber$lambda$2$0;
            case 6:
                language$lambda$1 = BrazeUser.setLanguage$lambda$1(str);
                return language$lambda$1;
            case 7:
                firstName$lambda$1 = BrazeUser.setFirstName$lambda$1(str);
                return firstName$lambda$1;
            case 8:
                addToCustomAttributeArray$lambda$1 = BrazeUser.addToCustomAttributeArray$lambda$1(str);
                return addToCustomAttributeArray$lambda$1;
            case 9:
                lastName$lambda$1 = BrazeUser.setLastName$lambda$1(str);
                return lastName$lambda$1;
            case 10:
                phoneNumber$lambda$3 = BrazeUser.setPhoneNumber$lambda$3(str);
                return phoneNumber$lambda$3;
            case 11:
                homeCity$lambda$1 = BrazeUser.setHomeCity$lambda$1(str);
                return homeCity$lambda$1;
            case 12:
                lineId$lambda$2$0 = BrazeUser.setLineId$lambda$2$0(str);
                return lineId$lambda$2$0;
            case 13:
                lineId$lambda$3 = BrazeUser.setLineId$lambda$3(str);
                return lineId$lambda$3;
            case 14:
                addAlias$lambda$3 = BrazeUser.addAlias$lambda$3(str);
                return addAlias$lambda$3;
            case 15:
                customUserAttribute$lambda$4 = BrazeUser.setCustomUserAttribute$lambda$4(str);
                return customUserAttribute$lambda$4;
            case 16:
                customUserAttribute$lambda$5 = BrazeUser.setCustomUserAttribute$lambda$5(str);
                return customUserAttribute$lambda$5;
            case 17:
                customUserAttribute$lambda$1 = BrazeUser.setCustomUserAttribute$lambda$1(str);
                return customUserAttribute$lambda$1;
            case 18:
                customUserAttribute$lambda$0 = BrazeUser.setCustomUserAttribute$lambda$0(str);
                return customUserAttribute$lambda$0;
            case 19:
                removeFromSubscriptionGroup$lambda$2 = BrazeUser.removeFromSubscriptionGroup$lambda$2(str);
                return removeFromSubscriptionGroup$lambda$2;
            case 20:
                customAttributeArray$lambda$0 = BrazeUser.setCustomAttributeArray$lambda$0(str);
                return customAttributeArray$lambda$0;
            case 21:
                email$lambda$2$0 = BrazeUser.setEmail$lambda$2$0(str);
                return email$lambda$2$0;
            case 22:
                email$lambda$3 = BrazeUser.setEmail$lambda$3(str);
                return email$lambda$3;
            case 23:
                _get_applicationIconResourceId_$lambda$0 = BrazeConfigurationProvider._get_applicationIconResourceId_$lambda$0(str);
                return _get_applicationIconResourceId_$lambda$0;
            case 24:
                fromString$lambda$1 = DelayedInitializationAnalyticsBehavior.Companion.fromString$lambda$1(str);
                return fromString$lambda$1;
            case 25:
                putBitmapIntoCache$lambda$1 = DefaultBrazeImageLoader.putBitmapIntoCache$lambda$1(str);
                return putBitmapIntoCache$lambda$1;
            case 26:
                putBitmapIntoCache$lambda$2$0 = DefaultBrazeImageLoader.putBitmapIntoCache$lambda$2$0(str);
                return putBitmapIntoCache$lambda$2$0;
            case 27:
                bitmapFromDiskCache$lambda$0$0 = DefaultBrazeImageLoader.getBitmapFromDiskCache$lambda$0$0(str);
                return bitmapFromDiskCache$lambda$0$0;
            case 28:
                bitmapFromDiskCache$lambda$0$1 = DefaultBrazeImageLoader.getBitmapFromDiskCache$lambda$0$1(str);
                return bitmapFromDiskCache$lambda$0$1;
            default:
                renderUrlIntoView$lambda$1 = DefaultBrazeImageLoader.renderUrlIntoView$lambda$1(str);
                return renderUrlIntoView$lambda$1;
        }
    }
}
