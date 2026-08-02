package com.squareup.cash.money.booklet;

import android.os.Build;
import android.util.Range;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.instore.TableQrCodeScannerViewKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Entrypoint$V3LoanBrief;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public abstract class DisclosureSectionKt {
    public static final void DisclosureSection(DisclosureSection disclosureSection, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1979262953);
        int i2 = (gapComposer.changedInstance(disclosureSection) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            String str = disclosureSection.text;
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new NfcNotAvailableKt$$ExternalSyntheticLambda0(17, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, m300paddingVpY3zN4$default, textStyle, 0L, null, null, null, 0, 0, 0, gapComposer, 0, 2032);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda0(disclosureSection, function1, i, 22);
        }
    }

    public static final AfterpayAppletEntrypoint.V3LoanBrief access$getV3_loan_brief(TableQrCodeScannerViewKt tableQrCodeScannerViewKt) {
        AfterpayAppletEntrypoint$Entrypoint$V3LoanBrief afterpayAppletEntrypoint$Entrypoint$V3LoanBrief = tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$V3LoanBrief ? (AfterpayAppletEntrypoint$Entrypoint$V3LoanBrief) tableQrCodeScannerViewKt : null;
        if (afterpayAppletEntrypoint$Entrypoint$V3LoanBrief != null) {
            return afterpayAppletEntrypoint$Entrypoint$V3LoanBrief.value;
        }
        return null;
    }

    public static boolean isSamsungDistortion$camera_camera2() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        LinkedHashMap linkedHashMap = ExtraCroppingQuirk.SAMSUNG_DISTORTION_MODELS_TO_API_LEVEL_MAP;
        String str3 = Build.MODEL;
        str3.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = str3.toUpperCase(locale);
        upperCase.getClass();
        if (!linkedHashMap.containsKey(upperCase)) {
            return false;
        }
        String upperCase2 = str3.toUpperCase(locale);
        upperCase2.getClass();
        Range range = (Range) linkedHashMap.get(upperCase2);
        if (range != null) {
            return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
        }
        return true;
    }
}
