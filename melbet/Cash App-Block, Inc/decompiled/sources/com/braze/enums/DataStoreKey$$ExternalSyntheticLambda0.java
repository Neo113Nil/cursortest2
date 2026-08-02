package com.braze.enums;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.text.style.TextAlign;
import app.cash.inputfieldtext.saver.RealInputFieldTextSaver;
import com.google.firebase.analytics.AnalyticsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.squareup.cash.android.AndroidModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.internal.LocalEnabledStateKt;
import com.squareup.cash.arcade.internalflags.InternalArcadeFlagsHolder;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.DeepLinksConfig;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.onboarding.util.AndroidAliasNormalizer;
import com.squareup.cash.storage.RealAppDataWiper;
import com.squareup.util.android.InstrumentationTestConfig$NotATest;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes.dex */
public final /* synthetic */ class DataStoreKey$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DataStoreKey$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map keyMap_delegate$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                keyMap_delegate$lambda$0 = DataStoreKey.keyMap_delegate$lambda$0();
                return keyMap_delegate$lambda$0;
            case 1:
                return new Handler(Looper.getMainLooper());
            case 2:
                return new RealAppDataWiper();
            case 3:
                return DeepLinksConfig.production;
            case 4:
                return null;
            case 5:
                return 5580007;
            case 6:
                return RealInputFieldTextSaver.INSTANCE;
            case 7:
                return Dispatchers.Default;
            case 8:
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                return MainDispatcherLoader.dispatcher;
            case 9:
                return "com.squareup.cash";
            case 10:
                return "release";
            case 11:
                return new RealUuidGenerator();
            case 12:
                DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                return DefaultIoScheduler.INSTANCE;
            case 13:
                return Integer.valueOf(Build.VERSION.SDK_INT);
            case 14:
                return new AndroidAliasNormalizer();
            case 15:
                return InstrumentationTestConfig$NotATest.INSTANCE;
            case 16:
                return new AndroidModule$Companion$$ExternalSyntheticLambda0();
            case 17:
                return null;
            case 18:
                return EmptySet.INSTANCE;
            case 19:
                return EmptySet.INSTANCE;
            case 20:
                FirebaseAnalytics analytics = AnalyticsKt.getAnalytics();
                analytics.setAnalyticsCollectionEnabled();
                return analytics;
            case 21:
                return new Haptics();
            case 22:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ScreenScaffoldKt.LocalScaffoldState;
                return null;
            case 23:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = LocalEnabledStateKt.LocalEnabledState;
                return Boolean.TRUE;
            case 24:
                return Unit.INSTANCE;
            case 25:
                return InternalArcadeFlagsHolder.immutableFlags;
            case 26:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                return null;
            case 27:
                return ArcadeThemeKt.DefaultTypography;
            case 28:
                return new TextAlign(0);
            default:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalColors;
                return Boolean.FALSE;
        }
    }
}
