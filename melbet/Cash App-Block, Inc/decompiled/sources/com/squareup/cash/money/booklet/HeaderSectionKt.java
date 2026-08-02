package com.squareup.cash.money.booklet;

import android.os.Build;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletAnalyticsEventsSpec;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda13;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes6.dex */
public abstract class HeaderSectionKt {
    public static final void HeaderSection(HeaderSection headerSection, Composer composer, int i) {
        TextStyle textStyle;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-457444746);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(headerSection) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda13(i2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(fillMaxWidth, false, (Function1) rememberedValue);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(semantics, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            String str = headerSection.title;
            if (headerSection.isLarge) {
                gapComposer.startReplaceGroup(195055766);
                textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).headlineLarge;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(195115286);
                textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).headlineSmall;
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, m300paddingVpY3zN4$default, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda5(headerSection, i, 23);
        }
    }

    public static boolean supportExtraLevel3ConfigurationsGoogleDevice$camera_camera2() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Google")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Google")) {
                return false;
            }
        }
        String str3 = Build.MODEL;
        str3.getClass();
        String upperCase = str3.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return ExtraSupportedSurfaceCombinationsQuirk.SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_GOOGLE_MODELS.contains(upperCase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0.equalsIgnoreCase("Samsung") != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean supportExtraLevel3ConfigurationsSamsungDevice$camera_camera2() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
        }
        String str3 = Build.MODEL;
        str3.getClass();
        String upperCase = str3.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        Iterator it = ExtraSupportedSurfaceCombinationsQuirk.SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_SAMSUNG_MODELS.iterator();
        while (it.hasNext()) {
            if (StringsKt__StringsJVMKt.startsWith(upperCase, (String) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static final AfterpayAppletAnalyticsEventsSpec toAfterpayAppletAnalyticsEventsSpec(AnalyticsEvent analyticsEvent) {
        analyticsEvent.getClass();
        String str = analyticsEvent.event_name;
        if (str != null) {
            return new AfterpayAppletAnalyticsEventsSpec(str, analyticsEvent.client_generated_params, analyticsEvent.event_attributes);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
        return null;
    }
}
