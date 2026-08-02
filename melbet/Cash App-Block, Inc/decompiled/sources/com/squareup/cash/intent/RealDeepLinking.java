package com.squareup.cash.intent;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.room.Room;
import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.api.AppServiceContextWrapper;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.tax.service.TaxExperienceService;
import com.squareup.cash.ui.gcm.GcmModule$Companion$provideGcmOnSignOutAction$1;
import com.squareup.encryption.EllipticCurveEncryptionEngine;
import com.squareup.protos.cash.blockuserjourneys.api.v1.BlockUserJourneysService;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import okio.ByteString;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class RealDeepLinking {
    public final IntentHandler intentHandler;

    public RealDeepLinking(IntentHandler intentHandler) {
        this.intentHandler = intentHandler;
    }

    public final boolean handleDeeplink(Navigator navigator, String str, Source source) {
        navigator.getClass();
        str.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.putExtra("deeplink-source", source.name());
        intent.putExtra("deeplink-exit-screen", PaymentScreens$HomeScreens$Home.INSTANCE);
        return ((RealIntentHandler) this.intentHandler).handleIntent(intent, navigator, true);
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider intentHandler;

        public MetroFactory(ByteString.Companion companion, DoubleCheck doubleCheck) {
            this.$r8$classId = 27;
            this.intentHandler = doubleCheck;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.intentHandler;
            switch (i) {
                case 0:
                    IntentHandler intentHandler = (IntentHandler) provider.invoke();
                    intentHandler.getClass();
                    return new RealDeepLinking(intentHandler);
                case 1:
                    AppServiceContextWrapper appServiceContextWrapper = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper.getClass();
                    return appServiceContextWrapper;
                case 2:
                    Retrofit retrofit = (Retrofit) provider.invoke();
                    retrofit.getClass();
                    Object create = retrofit.create(TaxExperienceService.class);
                    create.getClass();
                    return (TaxExperienceService) create;
                case 3:
                    AppServiceContextWrapper appServiceContextWrapper2 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper2.getClass();
                    return appServiceContextWrapper2;
                case 4:
                    AppServiceContextWrapper appServiceContextWrapper3 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper3.getClass();
                    return appServiceContextWrapper3;
                case 5:
                    AppServiceContextWrapper appServiceContextWrapper4 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper4.getClass();
                    return appServiceContextWrapper4;
                case 6:
                    AppServiceContextWrapper appServiceContextWrapper5 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper5.getClass();
                    return appServiceContextWrapper5;
                case 7:
                    AppServiceContextWrapper appServiceContextWrapper6 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper6.getClass();
                    return appServiceContextWrapper6;
                case 8:
                    Retrofit retrofit3 = (Retrofit) provider.invoke();
                    retrofit3.getClass();
                    Object create2 = retrofit3.create(BlockUserJourneysService.class);
                    create2.getClass();
                    return (BlockUserJourneysService) create2;
                case 9:
                    AppServiceContextWrapper appServiceContextWrapper7 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper7.getClass();
                    return appServiceContextWrapper7;
                case 10:
                    AppServiceContextWrapper appServiceContextWrapper8 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper8.getClass();
                    return appServiceContextWrapper8;
                case 11:
                    AppServiceContextWrapper appServiceContextWrapper9 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper9.getClass();
                    return appServiceContextWrapper9;
                case 12:
                    AppServiceContextWrapper appServiceContextWrapper10 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper10.getClass();
                    return appServiceContextWrapper10;
                case 13:
                    AppServiceContextWrapper appServiceContextWrapper11 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper11.getClass();
                    return appServiceContextWrapper11;
                case 14:
                    AppServiceContextWrapper appServiceContextWrapper12 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper12.getClass();
                    return appServiceContextWrapper12;
                case 15:
                    AppServiceContextWrapper appServiceContextWrapper13 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper13.getClass();
                    return appServiceContextWrapper13;
                case 16:
                    AppServiceContextWrapper appServiceContextWrapper14 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper14.getClass();
                    return appServiceContextWrapper14;
                case 17:
                    AppServiceContextWrapper appServiceContextWrapper15 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper15.getClass();
                    return appServiceContextWrapper15;
                case 18:
                    AppServiceContextWrapper appServiceContextWrapper16 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper16.getClass();
                    return appServiceContextWrapper16;
                case 19:
                    AppServiceContextWrapper appServiceContextWrapper17 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper17.getClass();
                    return appServiceContextWrapper17;
                case 20:
                    AppServiceContextWrapper appServiceContextWrapper18 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper18.getClass();
                    return appServiceContextWrapper18;
                case 21:
                    AppServiceContextWrapper appServiceContextWrapper19 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper19.getClass();
                    return appServiceContextWrapper19;
                case 22:
                    AppServiceContextWrapper appServiceContextWrapper20 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper20.getClass();
                    return appServiceContextWrapper20;
                case 23:
                    AppServiceContextWrapper appServiceContextWrapper21 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper21.getClass();
                    return appServiceContextWrapper21;
                case 24:
                    AppServiceContextWrapper appServiceContextWrapper22 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper22.getClass();
                    return appServiceContextWrapper22;
                case 25:
                    AppServiceContextWrapper appServiceContextWrapper23 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper23.getClass();
                    return appServiceContextWrapper23;
                case 26:
                    AppServiceContextWrapper appServiceContextWrapper24 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper24.getClass();
                    return appServiceContextWrapper24;
                case 27:
                    SharedPreferences sharedPreferences = (SharedPreferences) provider.invoke();
                    sharedPreferences.getClass();
                    return sharedPreferences;
                case 28:
                    EllipticCurveEncryptionEngine ellipticCurveEncryptionEngine = (EllipticCurveEncryptionEngine) provider.invoke();
                    ellipticCurveEncryptionEngine.getClass();
                    return new GcmModule$Companion$provideGcmOnSignOutAction$1(ellipticCurveEncryptionEngine, 4);
                default:
                    SharedPreferences sharedPreferences2 = (SharedPreferences) provider.invoke();
                    sharedPreferences2.getClass();
                    return Room.BooleanKeyValue(sharedPreferences2, "investing_has_ever_tapped_drip_setting_row", false, false);
            }
        }

        public /* synthetic */ MetroFactory(Provider provider, int i) {
            this.$r8$classId = i;
            this.intentHandler = provider;
        }
    }
}
