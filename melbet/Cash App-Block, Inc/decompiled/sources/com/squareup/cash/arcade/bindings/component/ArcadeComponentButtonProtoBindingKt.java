package com.squareup.cash.arcade.bindings.component;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabx;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda9;
import com.squareup.cash.activity.views.SectionHeaderScope$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentEvent;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.views.applet.BitcoinHomeViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackLayoutWeightElement;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda3;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.ActionableButtonCtaGroup;
import squareup.cash.ui.arcade.elements.ActionableButtonDefault;
import squareup.cash.ui.arcade.elements.ButtonCompact;
import squareup.cash.ui.arcade.elements.ButtonCtaGroup;
import squareup.cash.ui.arcade.elements.ButtonDefault;
import squareup.cash.ui.arcade.elements.ButtonDefaultGroup;
import squareup.cash.ui.arcade.elements.ButtonProminence;
import xyz.block.protos.genie.Navigate;

/* loaded from: classes5.dex */
public abstract class ArcadeComponentButtonProtoBindingKt {

    /* loaded from: classes10.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ButtonDefaultGroup.Direction.values().length];
            try {
                Navigate.MatchStrategy.Companion companion = ButtonDefaultGroup.Direction.Companion;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Navigate.MatchStrategy.Companion companion2 = ButtonDefaultGroup.Direction.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ButtonProminence.values().length];
            try {
                iArr2[ButtonProminence.PROMINENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ButtonProminence.SUBTLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ButtonProminence.STANDARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ButtonCtaGroup.Direction.values().length];
            try {
                iArr3[ButtonCtaGroup.Direction.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ButtonCtaGroup.Direction.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final void ButtonContent(RowScope rowScope, String str, Icon icon, Composer composer, int i) {
        int i2;
        Icons icons;
        String str2;
        rowScope.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-530549226);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changed(str) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(icon) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            if (icon == null || (str2 = icon.arcade_id) == null) {
                icons = null;
            } else {
                Icons.Companion.getClass();
                icons = zzd.get(str2);
            }
            Icons icons2 = icons;
            if (icons2 == null) {
                gapComposer.startReplaceGroup(-112254569);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-112254568);
                Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer, 48, 12);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(Modifier.Companion.$$INSTANCE, 4.0f));
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(rowScope, str, icon, i, 11);
        }
    }

    public static final void RenderActionableButtonCtaGroup(ActionableButtonCtaGroup actionableButtonCtaGroup, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-444158991);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(actionableButtonCtaGroup) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(Modifier.Companion.$$INSTANCE) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 << 15;
            function12 = function1;
            RenderButtonCtaGroupLayout(actionableButtonCtaGroup.primary_button, actionableButtonCtaGroup.secondary_button, actionableButtonCtaGroup.tertiary_button, actionableButtonCtaGroup.direction, actionableButtonCtaGroup.disclaimer_text, Intrinsics.areEqual(actionableButtonCtaGroup.show_hairline, Boolean.TRUE), function12, Expect_jvmKt.rememberComposableLambda(1352385859, new SetPinViewKt$$ExternalSyntheticLambda4(6, function1), gapComposer), gapComposer, (3670016 & i3) | 100663296 | (i3 & 29360128));
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(actionableButtonCtaGroup, function12, i);
        }
    }

    public static final void RenderActionableButtonDefault(final ActionableButtonDefault actionableButtonDefault, final Function1 function1, final Modifier modifier, Composer composer, final int i) {
        int i2;
        Modifier modifier2;
        int i3;
        actionableButtonDefault.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(190996415);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(actionableButtonDefault) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        int i4 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ButtonDefault buttonDefault = actionableButtonDefault.button;
            if (buttonDefault == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i5 = 0;
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.bindings.component.ArcadeComponentButtonProtoBindingKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i5;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    ArcadeComponentButtonProtoBindingKt.RenderActionableButtonDefault(actionableButtonDefault, function1, modifier, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    ArcadeComponentButtonProtoBindingKt.RenderActionableButtonDefault(actionableButtonDefault, function1, modifier, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            modifier2 = modifier;
            i3 = i;
            com.squareup.cash.arcade.components.button.ButtonProminence arcadeButtonProminence = toArcadeButtonProminence(buttonDefault.button_prominence);
            boolean areEqual = Intrinsics.areEqual(buttonDefault.is_destructive, Boolean.TRUE);
            boolean changedInstance = gapComposer.changedInstance(actionableButtonDefault) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BankingDialogKt$$ExternalSyntheticLambda5(9, function1, actionableButtonDefault);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, modifier2, arcadeButtonProminence, areEqual, false, null, Expect_jvmKt.rememberComposableLambda(-1205260252, new ArcadeComponentButtonProtoBindingKt$$ExternalSyntheticLambda9(buttonDefault, i4), gapComposer), gapComposer, ((i2 >> 3) & 112) | 1572864, 48);
        } else {
            modifier2 = modifier;
            i3 = i;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final Modifier modifier3 = modifier2;
            final int i6 = 1;
            final int i7 = i3;
            endRestartGroup2.block = new Function2() { // from class: com.squareup.cash.arcade.bindings.component.ArcadeComponentButtonProtoBindingKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i6;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            ArcadeComponentButtonProtoBindingKt.RenderActionableButtonDefault(actionableButtonDefault, function1, modifier3, composer2, Updater.updateChangedFlags(i7 | 1));
                            break;
                        default:
                            ArcadeComponentButtonProtoBindingKt.RenderActionableButtonDefault(actionableButtonDefault, function1, modifier3, composer2, Updater.updateChangedFlags(i7 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void RenderButtonCompact(ButtonCompact buttonCompact, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-366498525);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(buttonCompact) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i & MLKEMEngine.KyberPolyBytes;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 |= gapComposer.changed(companion) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            com.squareup.cash.arcade.components.button.ButtonProminence arcadeButtonProminence = toArcadeButtonProminence(buttonCompact.button_prominence);
            boolean areEqual = Intrinsics.areEqual(buttonCompact.is_destructive, Boolean.TRUE);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda1(17, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue, companion, arcadeButtonProminence, areEqual, false, null, Expect_jvmKt.rememberComposableLambda(2132971547, new BalanceFeedKt$$ExternalSyntheticLambda9(buttonCompact, 28), gapComposer), gapComposer, ((i2 >> 3) & 112) | 1572864, 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(buttonCompact, function1, i);
        }
    }

    public static final void RenderButtonCta(ButtonDefault buttonDefault, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        buttonDefault.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1694523218);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(buttonDefault) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i2 |= gapComposer.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            com.squareup.cash.arcade.components.button.ButtonProminence arcadeButtonProminence = toArcadeButtonProminence(buttonDefault.button_prominence);
            boolean areEqual = Intrinsics.areEqual(buttonDefault.is_destructive, Boolean.TRUE);
            boolean changedInstance = gapComposer.changedInstance(buttonDefault) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ArcadeComponentButtonProtoBindingKt$$ExternalSyntheticLambda11(function1, buttonDefault, i4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, modifier2, arcadeButtonProminence, areEqual, false, null, Expect_jvmKt.rememberComposableLambda(-1638592493, new ArcadeComponentButtonProtoBindingKt$$ExternalSyntheticLambda9(buttonDefault, i3), gapComposer), gapComposer, ((i2 >> 3) & 112) | 1572864, 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeComponentButtonProtoBindingKt$$ExternalSyntheticLambda13(buttonDefault, function1, modifier, i, 1);
        }
    }

    public static final void RenderButtonCtaGroup(ButtonCtaGroup buttonCtaGroup, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1347815247);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(buttonCtaGroup) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(Modifier.Companion.$$INSTANCE) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 << 15;
            function12 = function1;
            RenderButtonCtaGroupLayout(buttonCtaGroup.primary_button, buttonCtaGroup.secondary_button, buttonCtaGroup.tertiary_button, buttonCtaGroup.direction, buttonCtaGroup.disclaimer_text, Intrinsics.areEqual(buttonCtaGroup.show_hairline, Boolean.TRUE), function12, Expect_jvmKt.rememberComposableLambda(-1910381581, new SetPinViewKt$$ExternalSyntheticLambda4(7, function1), gapComposer), gapComposer, (3670016 & i3) | 100663296 | (i3 & 29360128));
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(buttonCtaGroup, function12, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderButtonCtaGroupLayout(Object obj, Object obj2, Object obj3, ButtonCtaGroup.Direction direction, LocalizedString localizedString, boolean z, Function1 function1, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        ComposableLambdaImpl composableLambdaImpl2;
        GapComposer gapComposer;
        Modifier fillMaxWidth;
        String str;
        int i3;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-839156561);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer2.changed(obj) : gapComposer2.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? gapComposer2.changed(obj2) : gapComposer2.changedInstance(obj2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer2.changed(obj3) : gapComposer2.changedInstance(obj3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(direction == null ? -1 : direction.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(localizedString) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(z) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        int i4 = 12582912 & i;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i4 == 0) {
            i2 |= gapComposer2.changed(companion) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            composableLambdaImpl2 = composableLambdaImpl;
            i2 |= gapComposer2.changedInstance(composableLambdaImpl2) ? 67108864 : 33554432;
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
        }
        boolean z2 = true;
        if (gapComposer2.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            int i5 = direction == null ? -1 : WhenMappings.$EnumSwitchMapping$2[direction.ordinal()];
            if (i5 != -1) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m$1(direction, "ButtonCtaGroup direction ");
                        return;
                    }
                }
                if (z2) {
                    fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                } else {
                    if (1.0f <= 0.0d) {
                        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1.0f, "invalid weight ", "; must be greater than zero"));
                        return;
                    }
                    fillMaxWidth = new AdaptiveStackLayoutWeightElement(1.0f);
                }
                ButtonCtaGroupOrientation buttonCtaGroupOrientation = !z2 ? ButtonCtaGroupOrientation.AUTOMATIC : ButtonCtaGroupOrientation.VERTICAL;
                ComposableLambdaImpl composableLambdaImpl3 = null;
                if (localizedString != null || (str = localizedString.translated_value) == null || StringsKt.isBlank(str)) {
                    str = null;
                }
                if (str != null) {
                    gapComposer2.startReplaceGroup(1692247069);
                    gapComposer2.end(false);
                    i3 = i2;
                } else {
                    gapComposer2.startReplaceGroup(1692247070);
                    i3 = i2;
                    composableLambdaImpl3 = Expect_jvmKt.rememberComposableLambda(-1106357062, new TabContentViewKt$$ExternalSyntheticLambda11(str, function1, 5), gapComposer2);
                    gapComposer2.end(false);
                }
                int i6 = i3;
                gapComposer = gapComposer2;
                DimensionKt.ButtonCtaGroup(companion, z, buttonCtaGroupOrientation, composableLambdaImpl3, Expect_jvmKt.rememberComposableLambda(-571042323, new BitcoinHomeViewKt$$ExternalSyntheticLambda9(obj, obj2, obj3, composableLambdaImpl2, fillMaxWidth, i6), gapComposer2), gapComposer, ((i6 >> 21) & 14) | 24576 | ((i6 >> 12) & 112), 0);
            }
            z2 = false;
            if (z2) {
            }
            ButtonCtaGroupOrientation buttonCtaGroupOrientation2 = !z2 ? ButtonCtaGroupOrientation.AUTOMATIC : ButtonCtaGroupOrientation.VERTICAL;
            ComposableLambdaImpl composableLambdaImpl32 = null;
            if (localizedString != null) {
            }
            str = null;
            if (str != null) {
            }
            int i62 = i3;
            gapComposer = gapComposer2;
            DimensionKt.ButtonCtaGroup(companion, z, buttonCtaGroupOrientation2, composableLambdaImpl32, Expect_jvmKt.rememberComposableLambda(-571042323, new BitcoinHomeViewKt$$ExternalSyntheticLambda9(obj, obj2, obj3, composableLambdaImpl2, fillMaxWidth, i62), gapComposer2), gapComposer, ((i62 >> 21) & 14) | 24576 | ((i62 >> 12) & 112), 0);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda3(obj, obj2, obj3, direction, localizedString, z, function1, composableLambdaImpl, i);
        }
    }

    public static final void RenderButtonDefault(ButtonDefault buttonDefault, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        buttonDefault.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1425395679);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(buttonDefault) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        int i3 = 0;
        int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            com.squareup.cash.arcade.components.button.ButtonProminence arcadeButtonProminence = toArcadeButtonProminence(buttonDefault.button_prominence);
            boolean areEqual = Intrinsics.areEqual(buttonDefault.is_destructive, Boolean.TRUE);
            boolean changedInstance = ((i2 & 112) == 32) | gapComposer.changedInstance(buttonDefault);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ArcadeComponentButtonProtoBindingKt$$ExternalSyntheticLambda11(function1, buttonDefault, i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.Button((Function0) rememberedValue, modifier, arcadeButtonProminence, areEqual, false, null, Expect_jvmKt.rememberComposableLambda(-1702901428, new ArcadeComponentButtonProtoBindingKt$$ExternalSyntheticLambda9(buttonDefault, i4), gapComposer), gapComposer, ((i2 >> 3) & 112) | 1572864, 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeComponentButtonProtoBindingKt$$ExternalSyntheticLambda13(buttonDefault, function1, modifier, i, 0);
        }
    }

    public static final void RenderButtonDefaultGroup(final ButtonDefaultGroup buttonDefaultGroup, final Function1 function1, Composer composer, int i) {
        int i2;
        ButtonDefaultGroup.Direction direction = buttonDefaultGroup.direction;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(571804881);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(buttonDefaultGroup) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i & MLKEMEngine.KyberPolyBytes;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 |= gapComposer.changed(companion) ? 256 : 128;
        }
        final int i4 = 1;
        final int i5 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i6 = direction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
            if (i6 != -1) {
                if (i6 == 1) {
                    gapComposer.startReplaceGroup(799154931);
                    zzabx.ButtonDefaultGroupHorizontal(companion, Expect_jvmKt.rememberComposableLambda(-1884564293, new Function3() { // from class: com.squareup.cash.arcade.bindings.component.ArcadeComponentButtonProtoBindingKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i7 = i5;
                            Function1 function12 = function1;
                            ButtonDefaultGroup buttonDefaultGroup2 = buttonDefaultGroup;
                            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                            switch (i7) {
                                case 0:
                                    AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                                    Composer composer2 = (Composer) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    adaptiveStackScope.getClass();
                                    if ((intValue & 6) == 0) {
                                        intValue |= ((GapComposer) composer2).changed(adaptiveStackScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                        ButtonDefault buttonDefault = buttonDefaultGroup2.primary_button;
                                        if (buttonDefault == null) {
                                            gapComposer2.startReplaceGroup(757677471);
                                            gapComposer2.end(false);
                                        } else {
                                            gapComposer2.startReplaceGroup(757677472);
                                            ArcadeComponentButtonProtoBindingKt.RenderButtonDefault(buttonDefault, function12, adaptiveStackScope.horizontalWeight(companion2, 1.0f), gapComposer2, 0);
                                            gapComposer2.end(false);
                                        }
                                        ButtonDefault buttonDefault2 = buttonDefaultGroup2.secondary_button;
                                        if (buttonDefault2 == null) {
                                            gapComposer2.startReplaceGroup(757875871);
                                            gapComposer2.end(false);
                                        } else {
                                            gapComposer2.startReplaceGroup(757875872);
                                            ArcadeComponentButtonProtoBindingKt.RenderButtonDefault(buttonDefault2, function12, adaptiveStackScope.horizontalWeight(companion2, 1.0f), gapComposer2, 0);
                                            gapComposer2.end(false);
                                        }
                                        ButtonDefault buttonDefault3 = buttonDefaultGroup2.tertiary_button;
                                        if (buttonDefault3 == null) {
                                            gapComposer2.startReplaceGroup(758073279);
                                            gapComposer2.end(false);
                                        } else {
                                            gapComposer2.startReplaceGroup(758073280);
                                            ArcadeComponentButtonProtoBindingKt.RenderButtonDefault(buttonDefault3, function12, adaptiveStackScope.horizontalWeight(companion2, 1.0f), gapComposer2, 0);
                                            gapComposer2.end(false);
                                        }
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    ((ColumnScope) obj).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        ButtonDefault buttonDefault4 = buttonDefaultGroup2.primary_button;
                                        if (buttonDefault4 == null) {
                                            gapComposer3.startReplaceGroup(-637403301);
                                            gapComposer3.end(false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-637403300);
                                            ArcadeComponentButtonProtoBindingKt.RenderButtonDefault(buttonDefault4, function12, SizeKt.fillMaxWidth(companion2, 1.0f), gapComposer3, MLKEMEngine.KyberPolyBytes);
                                            gapComposer3.end(false);
                                        }
                                        ButtonDefault buttonDefault5 = buttonDefaultGroup2.secondary_button;
                                        if (buttonDefault5 == null) {
                                            gapComposer3.startReplaceGroup(-637259461);
                                            gapComposer3.end(false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-637259460);
                                            ArcadeComponentButtonProtoBindingKt.RenderButtonDefault(buttonDefault5, function12, SizeKt.fillMaxWidth(companion2, 1.0f), gapComposer3, MLKEMEngine.KyberPolyBytes);
                                            gapComposer3.end(false);
                                        }
                                        ButtonDefault buttonDefault6 = buttonDefaultGroup2.tertiary_button;
                                        if (buttonDefault6 == null) {
                                            gapComposer3.startReplaceGroup(-637116613);
                                            gapComposer3.end(false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-637116612);
                                            ArcadeComponentButtonProtoBindingKt.RenderButtonDefault(buttonDefault6, function12, SizeKt.fillMaxWidth(companion2, 1.0f), gapComposer3, MLKEMEngine.KyberPolyBytes);
                                            gapComposer3.end(false);
                                        }
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, ((i2 >> 6) & 14) | 48, 0);
                    gapComposer.end(false);
                } else if (i6 != 2) {
                    gapComposer.startReplaceGroup(-251275985);
                    gapComposer.end(false);
                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m$1(direction, "ButtonDefaultGroup direction ");
                    return;
                }
            }
            gapComposer.startReplaceGroup(799873914);
            zzabx.ButtonDefaultGroupVertical(companion, Expect_jvmKt.rememberComposableLambda(1679126134, new Function3() { // from class: com.squareup.cash.arcade.bindings.component.ArcadeComponentButtonProtoBindingKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7 = i4;
                    Function1 function12 = function1;
                    ButtonDefaultGroup buttonDefaultGroup2 = buttonDefaultGroup;
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    switch (i7) {
                        case 0:
                            AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            adaptiveStackScope.getClass();
                            if ((intValue & 6) == 0) {
                                intValue |= ((GapComposer) composer2).changed(adaptiveStackScope) ? 4 : 2;
                            }
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                ButtonDefault buttonDefault = buttonDefaultGroup2.primary_button;
                                if (buttonDefault == null) {
                                    gapComposer2.startReplaceGroup(757677471);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.startReplaceGroup(757677472);
                                    ArcadeComponentButtonProtoBindingKt.RenderButtonDefault(buttonDefault, function12, adaptiveStackScope.horizontalWeight(companion2, 1.0f), gapComposer2, 0);
                                    gapComposer2.end(false);
                                }
                                ButtonDefault buttonDefault2 = buttonDefaultGroup2.secondary_button;
                                if (buttonDefault2 == null) {
                                    gapComposer2.startReplaceGroup(757875871);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.startReplaceGroup(757875872);
                                    ArcadeComponentButtonProtoBindingKt.RenderButtonDefault(buttonDefault2, function12, adaptiveStackScope.horizontalWeight(companion2, 1.0f), gapComposer2, 0);
                                    gapComposer2.end(false);
                                }
                                ButtonDefault buttonDefault3 = buttonDefaultGroup2.tertiary_button;
                                if (buttonDefault3 == null) {
                                    gapComposer2.startReplaceGroup(758073279);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.startReplaceGroup(758073280);
                                    ArcadeComponentButtonProtoBindingKt.RenderButtonDefault(buttonDefault3, function12, adaptiveStackScope.horizontalWeight(companion2, 1.0f), gapComposer2, 0);
                                    gapComposer2.end(false);
                                }
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((ColumnScope) obj).getClass();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                ButtonDefault buttonDefault4 = buttonDefaultGroup2.primary_button;
                                if (buttonDefault4 == null) {
                                    gapComposer3.startReplaceGroup(-637403301);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(-637403300);
                                    ArcadeComponentButtonProtoBindingKt.RenderButtonDefault(buttonDefault4, function12, SizeKt.fillMaxWidth(companion2, 1.0f), gapComposer3, MLKEMEngine.KyberPolyBytes);
                                    gapComposer3.end(false);
                                }
                                ButtonDefault buttonDefault5 = buttonDefaultGroup2.secondary_button;
                                if (buttonDefault5 == null) {
                                    gapComposer3.startReplaceGroup(-637259461);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(-637259460);
                                    ArcadeComponentButtonProtoBindingKt.RenderButtonDefault(buttonDefault5, function12, SizeKt.fillMaxWidth(companion2, 1.0f), gapComposer3, MLKEMEngine.KyberPolyBytes);
                                    gapComposer3.end(false);
                                }
                                ButtonDefault buttonDefault6 = buttonDefaultGroup2.tertiary_button;
                                if (buttonDefault6 == null) {
                                    gapComposer3.startReplaceGroup(-637116613);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(-637116612);
                                    ArcadeComponentButtonProtoBindingKt.RenderButtonDefault(buttonDefault6, function12, SizeKt.fillMaxWidth(companion2, 1.0f), gapComposer3, MLKEMEngine.KyberPolyBytes);
                                    gapComposer3.end(false);
                                }
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, ((i2 >> 6) & 14) | 48, 0);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(buttonDefaultGroup, function1, i);
        }
    }

    public static ArcadeComponentEvent clickEvent$default(String str) {
        return (str == null || StringsKt.isBlank(str)) ? ArcadeComponentEvent.Click.INSTANCE : new ArcadeComponentEvent.ClientRoute(str);
    }

    public static final com.squareup.cash.arcade.components.button.ButtonProminence toArcadeButtonProminence(ButtonProminence buttonProminence) {
        int i = buttonProminence == null ? -1 : WhenMappings.$EnumSwitchMapping$1[buttonProminence.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return com.squareup.cash.arcade.components.button.ButtonProminence.PROMINENT;
            }
            if (i == 2) {
                return com.squareup.cash.arcade.components.button.ButtonProminence.SUBTLE;
            }
            if (i != 3) {
                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m$1(buttonProminence, "Button prominence ");
                return null;
            }
        }
        return com.squareup.cash.arcade.components.button.ButtonProminence.STANDARD;
    }
}
