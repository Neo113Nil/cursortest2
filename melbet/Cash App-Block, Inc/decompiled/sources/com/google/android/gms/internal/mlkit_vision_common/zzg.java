package com.google.android.gms.internal.mlkit_vision_common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Fonts;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningPercentageLoaderKt$rememberScrambleText$1$1;
import com.stripe.android.uicore.elements.PhoneNumberFormatter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public abstract class zzg {
    public static final void ScanningProgressPercent(Integer num, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        String str;
        Object fidesmoProvisioningPercentageLoaderKt$rememberScrambleText$1$1;
        MutableState mutableState;
        String str2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(44745575);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(num) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        boolean z = true;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            if (num == null) {
                str = re$$ExternalSyntheticOutline0.m(gapComposer2, 1575700118, R.string.fidesmo_scanning_getting_ready, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(1575773402);
                gapComposer2.end(false);
                str = num + "%";
            }
            int i3 = i2 << 3;
            boolean booleanValue = ((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(str);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState3 = (MutableState) rememberedValue2;
            boolean changed = gapComposer2.changed(booleanValue) | gapComposer2.changed(str);
            if ((((i3 & 112) ^ 48) <= 32 || !gapComposer2.changed(num)) && (i3 & 48) != 32) {
                z = false;
            }
            boolean z2 = changed | z;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue3 == neverEqualPolicy) {
                mutableState = mutableState2;
                str2 = str;
                fidesmoProvisioningPercentageLoaderKt$rememberScrambleText$1$1 = new FidesmoProvisioningPercentageLoaderKt$rememberScrambleText$1$1(booleanValue, str2, num, mutableState3, mutableState, null);
                gapComposer2.updateRememberedValue(fidesmoProvisioningPercentageLoaderKt$rememberScrambleText$1$1);
            } else {
                fidesmoProvisioningPercentageLoaderKt$rememberScrambleText$1$1 = rememberedValue3;
                mutableState = mutableState2;
                str2 = str;
            }
            Updater.LaunchedEffect(gapComposer2, str2, (Function2) fidesmoProvisioningPercentageLoaderKt$rememberScrambleText$1$1);
            String str3 = (String) mutableState.getValue();
            boolean changed2 = gapComposer2.changed(str2);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new SyncDetailsQueries$$ExternalSyntheticLambda2(str2, 26);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue4);
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).headlineLarge, 0L, 0L, null, Fonts.CashSansMono, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            gapComposer = gapComposer2;
            Room.m1165Text25TpFw(0, 1, 0, 3, 1572864, 0, 3760, colors.semantic.text.standard, (Composer) gapComposer, clearAndSetSemantics, m994copyp1EtxEg$default, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(num, modifier, i, 14);
        }
    }

    public static PhoneNumberFormatter forCountry(String str) {
        str.getClass();
        Map map = PhoneNumberFormatter.allMetadata;
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        PhoneNumberFormatter.Metadata metadata = (PhoneNumberFormatter.Metadata) map.get(upperCase);
        return metadata != null ? new PhoneNumberFormatter.WithRegion(metadata) : new PhoneNumberFormatter.UnknownRegion(str);
    }

    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("<", str2, " threw ");
                    m3m.append(e.getClass().getName());
                    m3m.append(">");
                    sb = m3m.toString();
                }
            }
            objArr[i2] = sb;
            i2++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i3, indexOf);
            sb2.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
