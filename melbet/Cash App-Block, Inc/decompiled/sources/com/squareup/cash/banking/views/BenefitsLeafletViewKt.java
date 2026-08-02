package com.squareup.cash.banking.views;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import coil3.request.ImageRequest;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.arcade.components.list.ListOrderedKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.components.list.ListOrderedKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.banking.viewmodels.BenefitsLeafletViewModel;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBenefitLeafletResponse;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBenefitLeafletResponse$BenefitLeafletElement$Element$Image;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonCtaGroup;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonDefault;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.moneybot.genie.SwitchViewKt;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda5;
import com.squareup.cash.support.chat.views.ChatFailedDeliverySheetView$Content$1$1;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.workflow1.Worker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.internal.Tags;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.BetweenSection;
import squareup.cash.ui.arcade.elements.ButtonDefault;
import squareup.cash.ui.arcade.elements.ButtonProminence;
import squareup.cash.ui.arcade.elements.HorizontalAlignment;
import squareup.cash.ui.arcade.elements.ListOrdered;
import squareup.cash.ui.arcade.elements.PageHeader;
import squareup.cash.ui.arcade.elements.RemoteImage;
import squareup.cash.ui.arcade.elements.WithinSection;

/* loaded from: classes5.dex */
public abstract class BenefitsLeafletViewKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[HorizontalAlignment.values().length];
            try {
                iArr[HorizontalAlignment.HORIZONTALLY_CENTERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HorizontalAlignment.LEADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HorizontalAlignment.TRAILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ListOrdered.Variant.values().length];
            try {
                iArr2[ListOrdered.Variant.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ListOrdered.Variant.SUBTLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ListOrdered.Variant.CLIENT_COULD_NOT_PARSE_LIST_ORDERED_VARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[BetweenSection.Variant.values().length];
            try {
                iArr3[BetweenSection.Variant.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[BetweenSection.Variant.X_LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[BetweenSection.Variant.X_LARGE_BELOW_CELL.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[WithinSection.Variant.values().length];
            try {
                iArr4[WithinSection.Variant.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[WithinSection.Variant.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[ButtonProminence.values().length];
            try {
                iArr5[ButtonProminence.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[ButtonProminence.PROMINENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[ButtonProminence.SUBTLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public static final void BenefitsLeaflet(RealImageLoader realImageLoader, BenefitsLeafletViewModel benefitsLeafletViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1430938337);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(benefitsLeafletViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i3 = 0;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (benefitsLeafletViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            HideKeyboardOnLaunch(gapComposer, 0);
            boolean changedInstance = ((i2 & 896) == 256) | gapComposer.changedInstance(benefitsLeafletViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BenefitsLeafletViewKt$$ExternalSyntheticLambda2(function1, benefitsLeafletViewModel, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(609224609, new BenefitsLeafletViewKt$$ExternalSyntheticLambda3(function1, benefitsLeafletViewModel, i3), gapComposer), gapComposer, 56);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(realImageLoader, benefitsLeafletViewModel, function1, i, 17);
        }
    }

    public static final void ButtonCta(ActionableButtonDefault actionableButtonDefault, Function1 function1, Composer composer, int i) {
        com.squareup.cash.arcade.components.button.ButtonProminence buttonProminence;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(778701328);
        int i2 = (gapComposer.changedInstance(actionableButtonDefault) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ButtonDefault buttonDefault = actionableButtonDefault.button;
            buttonDefault.getClass();
            LocalizedString localizedString = buttonDefault.text;
            localizedString.getClass();
            String str = localizedString.translated_value;
            str.getClass();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean changedInstance = gapComposer.changedInstance(actionableButtonDefault) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BankingDialogKt$$ExternalSyntheticLambda5(22, function1, actionableButtonDefault);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            buttonDefault.getClass();
            ButtonProminence buttonProminence2 = buttonDefault.button_prominence;
            int i3 = buttonProminence2 == null ? -1 : WhenMappings.$EnumSwitchMapping$4[buttonProminence2.ordinal()];
            if (i3 == 1) {
                buttonProminence = com.squareup.cash.arcade.components.button.ButtonProminence.STANDARD;
            } else if (i3 == 2) {
                buttonProminence = com.squareup.cash.arcade.components.button.ButtonProminence.PROMINENT;
            } else {
                if (i3 != 3) {
                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m((Object) buttonDefault.button_prominence, "Button prominence ");
                    return;
                }
                buttonProminence = com.squareup.cash.arcade.components.button.ButtonProminence.SUBTLE;
            }
            coil3.size.SizeKt.ButtonCta(function0, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(401486667, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str, 5), gapComposer), gapComposer, 1572912, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda2(actionableButtonDefault, function1, i, 13);
        }
    }

    public static final void CtaGroup(ActionableButtonCtaGroup actionableButtonCtaGroup, Function1 function1, Composer composer, int i) {
        int i2;
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1194978939);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(actionableButtonCtaGroup) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 9;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean areEqual = Intrinsics.areEqual(actionableButtonCtaGroup.show_hairline, Boolean.TRUE);
            LocalizedString localizedString = actionableButtonCtaGroup.disclaimer_text;
            if (localizedString == null) {
                gapComposer.startReplaceGroup(-1366136660);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(-1366136659);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1554752145, new BankingDialogKt$$ExternalSyntheticLambda2(i3, (Object) localizedString, function1), gapComposer);
                gapComposer.end(false);
            }
            DimensionKt.ButtonCtaGroup(null, areEqual, null, rememberComposableLambda, Expect_jvmKt.rememberComposableLambda(-909708743, new BankingDialogKt$$ExternalSyntheticLambda2(10, (Object) actionableButtonCtaGroup, function1), gapComposer), gapComposer, 24576, 5);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(actionableButtonCtaGroup, function1, i, 9);
        }
    }

    public static final void ErrorContent(int i, int i2, Composer composer, Modifier modifier, Function1 function1) {
        int i3;
        int i4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1463393713);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (gapComposer.changed(modifier) ? 32 : 16);
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            if (i5 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, colors.component.sheet.background, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Countries.PageHeader(Room.stringResource(gapComposer, R.string.benefits_leaflet_error_title), (Modifier) null, BankingDialogKt.lambda$1483460304, Room.stringResource(gapComposer, R.string.benefits_leaflet_error_body), gapComposer, MLKEMEngine.KyberPolyBytes, 2);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(848504633, new BrandSheetViewKt$$ExternalSyntheticLambda6(20, function1), gapComposer), gapComposer, 24576, 15);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ListOrderedKt$$ExternalSyntheticLambda3(function1, modifier2, i, i2, 2);
        }
    }

    public static final void HideKeyboardOnLaunch(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2024054085);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Unit unit = Unit.INSTANCE;
            boolean changed = gapComposer.changed(delegatingSoftwareKeyboardController);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ChatFailedDeliverySheetView$Content$1$1(delegatingSoftwareKeyboardController, null, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BenefitsLeafletViewKt$$ExternalSyntheticLambda5(i);
        }
    }

    public static final void Image(RemoteImage remoteImage, Composer composer, int i) {
        BiasAlignment biasAlignment;
        HorizontalAlignment horizontalAlignment = remoteImage.horizontal_alignment;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(4150154);
        int i2 = (gapComposer.changedInstance(remoteImage) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Integer num = remoteImage.height;
            int i3 = horizontalAlignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[horizontalAlignment.ordinal()];
            if (i3 == -1 || i3 == 1) {
                biasAlignment = Alignment.Companion.Center;
            } else if (i3 == 2) {
                biasAlignment = Alignment.Companion.CenterStart;
            } else {
                if (i3 != 3) {
                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m$1(horizontalAlignment, "Image alignment ");
                    return;
                }
                biasAlignment = Alignment.Companion.CenterEnd;
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier fillMaxWidth2 = (remoteImage.width == null || num == null) ? SizeKt.fillMaxWidth(companion, 1.0f) : SizeKt.m287sizeVpY3zN4(companion, r0.intValue(), num.intValue());
            ImageRequest.Builder builder = new ImageRequest.Builder((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext));
            builder.data = remoteImage.image;
            AsyncImageKt.m1438AsyncImage10Xjiaw(builder.build(), remoteImage.accessibility_label, fillMaxWidth2, null, ContentScale.Companion.FillWidth, null, gapComposer, 1572864, 1976);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashtagViewKt$$ExternalSyntheticLambda10(remoteImage, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x017f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x014c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0248 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LeafletContent(int i, Composer composer, Modifier modifier, List list, Function1 function1) {
        RemoteImage remoteImage;
        RemoteImage remoteImage2;
        PageHeader pageHeader;
        PageHeader pageHeader2;
        boolean z;
        Object rememberedValue;
        ListOrdered listOrdered;
        ListOrdered listOrdered2;
        ActionableButtonCtaGroup actionableButtonCtaGroup;
        ActionableButtonCtaGroup actionableButtonCtaGroup2;
        BetweenSection betweenSection;
        BetweenSection betweenSection2;
        WithinSection withinSection;
        WithinSection withinSection2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-210033558);
        int i2 = i | (gapComposer.changedInstance(list) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        boolean z2 = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.startReplaceGroup(21219196);
            float mo233toDpu2uoSUM = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo233toDpu2uoSUM((int) (((LazyWindowInfo) ((WindowInfo) gapComposer.consume(CompositionLocalsKt.LocalWindowInfo))).m939getContainerSizeYbymL2g() & BodyPartID.bodyIdMax));
            gapComposer.end(false);
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, mo233toDpu2uoSUM * 0.9f, 1);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier then = ImageKt.m177backgroundbw27NRU(m279heightInVpY3zN4$default, colors.component.sheet.background, ColorKt.RectangleShape).then(modifier);
            Object rememberedValue2 = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new AvatarsKt$$ExternalSyntheticLambda2(26);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(NestedScrollModifierKt.nestedScroll(SemanticsModifierKt.semantics(then, false, (Function1) rememberedValue2), zzagn.rememberNestedScrollInteropConnection(gapComposer), null), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(1487519630);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GetBenefitLeafletResponse.BenefitLeafletElement benefitLeafletElement = (GetBenefitLeafletResponse.BenefitLeafletElement) it.next();
                RipplesKt ripplesKt = benefitLeafletElement.element;
                if (ripplesKt != null) {
                    GetBenefitLeafletResponse$BenefitLeafletElement$Element$Image getBenefitLeafletResponse$BenefitLeafletElement$Element$Image = ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$Image ? (GetBenefitLeafletResponse$BenefitLeafletElement$Element$Image) ripplesKt : null;
                    if (getBenefitLeafletResponse$BenefitLeafletElement$Element$Image != null) {
                        remoteImage = getBenefitLeafletResponse$BenefitLeafletElement$Element$Image.value;
                        if (remoteImage == null) {
                            gapComposer.startReplaceGroup(-1307743650);
                            if (ripplesKt != null) {
                                GetBenefitLeafletResponse$BenefitLeafletElement$Element$Image getBenefitLeafletResponse$BenefitLeafletElement$Element$Image2 = ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$Image ? (GetBenefitLeafletResponse$BenefitLeafletElement$Element$Image) ripplesKt : null;
                                if (getBenefitLeafletResponse$BenefitLeafletElement$Element$Image2 != null) {
                                    remoteImage2 = getBenefitLeafletResponse$BenefitLeafletElement$Element$Image2.value;
                                    remoteImage2.getClass();
                                    Image(remoteImage2, gapComposer, 0);
                                    gapComposer.end(false);
                                }
                            }
                            remoteImage2 = null;
                            remoteImage2.getClass();
                            Image(remoteImage2, gapComposer, 0);
                            gapComposer.end(false);
                        } else {
                            if (ripplesKt != null) {
                                GetBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader getBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader = ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader ? (GetBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader) ripplesKt : null;
                                if (getBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader != null) {
                                    pageHeader = getBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader.value;
                                    if (pageHeader == null) {
                                        gapComposer.startReplaceGroup(-1885248036);
                                        TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).headlineSmall;
                                        if (ripplesKt != null) {
                                            GetBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader getBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader2 = ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader ? (GetBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader) ripplesKt : null;
                                            if (getBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader2 != null) {
                                                pageHeader2 = getBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader2.value;
                                                pageHeader2.getClass();
                                                z = (i2 & 112) != 32;
                                                rememberedValue = gapComposer.rememberedValue();
                                                if (!z || rememberedValue == neverEqualPolicy) {
                                                    rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function1, z2, 8);
                                                    gapComposer.updateRememberedValue(rememberedValue);
                                                }
                                                SwitchViewKt.PageHeaderProtoBinding(pageHeader2, (Function2) rememberedValue, null, textStyle, gapComposer, 0, 4);
                                                gapComposer.end(false);
                                            }
                                        }
                                        pageHeader2 = null;
                                        pageHeader2.getClass();
                                        if ((i2 & 112) != 32) {
                                        }
                                        rememberedValue = gapComposer.rememberedValue();
                                        if (!z) {
                                        }
                                        rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function1, z2, 8);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                        SwitchViewKt.PageHeaderProtoBinding(pageHeader2, (Function2) rememberedValue, null, textStyle, gapComposer, 0, 4);
                                        gapComposer.end(false);
                                    } else {
                                        if (ripplesKt != null) {
                                            GetBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered getBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered = ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered ? (GetBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered) ripplesKt : null;
                                            if (getBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered != null) {
                                                listOrdered = getBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered.value;
                                                if (listOrdered == null) {
                                                    gapComposer.startReplaceGroup(-1307727333);
                                                    if (ripplesKt != null) {
                                                        GetBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered getBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered2 = ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered ? (GetBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered) ripplesKt : null;
                                                        if (getBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered2 != null) {
                                                            listOrdered2 = getBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered2.value;
                                                            listOrdered2.getClass();
                                                            ListOrderedVariant(listOrdered2, function1, gapComposer, i2 & 112);
                                                            gapComposer.end(false);
                                                        }
                                                    }
                                                    listOrdered2 = null;
                                                    listOrdered2.getClass();
                                                    ListOrderedVariant(listOrdered2, function1, gapComposer, i2 & 112);
                                                    gapComposer.end(false);
                                                } else {
                                                    if (ripplesKt != null) {
                                                        GetBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup getBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup = ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup ? (GetBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup) ripplesKt : null;
                                                        if (getBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup != null) {
                                                            actionableButtonCtaGroup = getBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup.value;
                                                            if (actionableButtonCtaGroup == null) {
                                                                gapComposer.startReplaceGroup(-1307723371);
                                                                if (ripplesKt != null) {
                                                                    GetBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup getBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup2 = ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup ? (GetBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup) ripplesKt : null;
                                                                    if (getBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup2 != null) {
                                                                        actionableButtonCtaGroup2 = getBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup2.value;
                                                                        actionableButtonCtaGroup2.getClass();
                                                                        CtaGroup(actionableButtonCtaGroup2, function1, gapComposer, i2 & 112);
                                                                        gapComposer.end(false);
                                                                    }
                                                                }
                                                                actionableButtonCtaGroup2 = null;
                                                                actionableButtonCtaGroup2.getClass();
                                                                CtaGroup(actionableButtonCtaGroup2, function1, gapComposer, i2 & 112);
                                                                gapComposer.end(false);
                                                            } else {
                                                                if (ripplesKt != null) {
                                                                    GetBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection getBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection = ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection ? (GetBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection) ripplesKt : null;
                                                                    if (getBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection != null) {
                                                                        betweenSection = getBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection.value;
                                                                        if (betweenSection == null) {
                                                                            gapComposer.startReplaceGroup(-1307719625);
                                                                            if (ripplesKt != null) {
                                                                                GetBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection getBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection2 = ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection ? (GetBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection) ripplesKt : null;
                                                                                if (getBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection2 != null) {
                                                                                    betweenSection2 = getBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection2.value;
                                                                                    betweenSection2.getClass();
                                                                                    SpacerBetweenSection(betweenSection2, gapComposer, 0);
                                                                                    gapComposer.end(false);
                                                                                }
                                                                            }
                                                                            betweenSection2 = null;
                                                                            betweenSection2.getClass();
                                                                            SpacerBetweenSection(betweenSection2, gapComposer, 0);
                                                                            gapComposer.end(false);
                                                                        } else {
                                                                            if (ripplesKt != null) {
                                                                                GetBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection getBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection = ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection ? (GetBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection) ripplesKt : null;
                                                                                if (getBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection != null) {
                                                                                    withinSection = getBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection.value;
                                                                                    if (withinSection != null) {
                                                                                        gapComposer.startReplaceGroup(-1307713560);
                                                                                        gapComposer.end(false);
                                                                                        OptionalProvider$$ExternalSyntheticLambda0.m((Object) benefitLeafletElement, (Object) " is not supported on BenefitsLeaflet");
                                                                                        return;
                                                                                    }
                                                                                    gapComposer.startReplaceGroup(-1307715851);
                                                                                    if (ripplesKt != null) {
                                                                                        GetBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection getBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection2 = ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection ? (GetBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection) ripplesKt : null;
                                                                                        if (getBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection2 != null) {
                                                                                            withinSection2 = getBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection2.value;
                                                                                            withinSection2.getClass();
                                                                                            SpacerWithinSection(withinSection2, gapComposer, 0);
                                                                                            gapComposer.end(false);
                                                                                        }
                                                                                    }
                                                                                    withinSection2 = null;
                                                                                    withinSection2.getClass();
                                                                                    SpacerWithinSection(withinSection2, gapComposer, 0);
                                                                                    gapComposer.end(false);
                                                                                }
                                                                            }
                                                                            withinSection = null;
                                                                            if (withinSection != null) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                betweenSection = null;
                                                                if (betweenSection == null) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    actionableButtonCtaGroup = null;
                                                    if (actionableButtonCtaGroup == null) {
                                                    }
                                                }
                                            }
                                        }
                                        listOrdered = null;
                                        if (listOrdered == null) {
                                        }
                                    }
                                }
                            }
                            pageHeader = null;
                            if (pageHeader == null) {
                            }
                        }
                    }
                }
                remoteImage = null;
                if (remoteImage == null) {
                }
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InfoSectionKt$$ExternalSyntheticLambda5(list, function1, modifier, i, 1);
        }
    }

    public static final void ListOrderedVariant(ListOrdered listOrdered, Function1 function1, Composer composer, int i) {
        int i2;
        NeverEqualPolicy neverEqualPolicy;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(364761452);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(listOrdered) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.startReplaceGroup(-1651558131);
            List<ListOrdered.ListItem> list = listOrdered.items;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                neverEqualPolicy = Composer.Companion.Empty;
                if (!hasNext) {
                    break;
                }
                ListOrdered.ListItem listItem = (ListOrdered.ListItem) it.next();
                gapComposer.startReplaceGroup(-1651557457);
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                LocalizedString localizedString = listItem.label;
                localizedString.getClass();
                String str = localizedString.translated_value;
                str.getClass();
                gapComposer.startReplaceGroup(1044898235);
                long j = ((Color) gapComposer.consume(ArcadeThemeKt.LocalTextColor)).value;
                if (j == 16) {
                    j = Strings.getColors(gapComposer).semantic.text.standard;
                }
                long j2 = j;
                gapComposer.end(false);
                SpanStyle spanStyle = new SpanStyle(j2, 0L, FontWeight.Medium, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61434);
                boolean z2 = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z2 || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function1, z, 9);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Worker.DefaultImpls.appendMarkdown(builder, str, spanStyle, (Function2) rememberedValue);
                AnnotatedString annotatedString = builder.toAnnotatedString();
                gapComposer.end(false);
                arrayList.add(annotatedString);
            }
            gapComposer.end(false);
            ImmutableList immutableList = Tags.toImmutableList(arrayList);
            ListOrdered.Variant variant = listOrdered.variant;
            int i3 = variant == null ? -1 : WhenMappings.$EnumSwitchMapping$1[variant.ordinal()];
            if (i3 != -1) {
                if (i3 == 1) {
                    gapComposer.startReplaceGroup(-1651541504);
                    boolean changed = gapComposer.changed(immutableList);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ListOrderedKt$$ExternalSyntheticLambda0(immutableList, 3);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    ListOrderedKt.ListOrderedStandard(0, 1, gapComposer, (Modifier) null, (Function1) rememberedValue2);
                    gapComposer.end(false);
                } else if (i3 == 2) {
                    gapComposer.startReplaceGroup(-1651536866);
                    boolean changed2 = gapComposer.changed(immutableList);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ListOrderedKt$$ExternalSyntheticLambda0(immutableList, 4);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    ListOrderedKt.ListOrderedSubtle(0, 1, gapComposer, null, (Function1) rememberedValue3);
                    gapComposer.end(false);
                } else if (i3 != 3) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1651542849, false);
                }
            }
            gapComposer.startReplaceGroup(-1651531073);
            gapComposer.end(false);
            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m((Object) listOrdered.variant, "ListOrdered variant ");
            return;
        }
        gapComposer.skipToGroupEnd();
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BenefitsLeafletViewKt$$ExternalSyntheticLambda20(listOrdered, function1, i, 0);
        }
    }

    public static final void SpacerBetweenSection(BetweenSection betweenSection, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2045689610);
        int i2 = (gapComposer.changedInstance(betweenSection) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            BetweenSection.Variant variant = betweenSection.variant;
            int i3 = variant == null ? -1 : WhenMappings.$EnumSwitchMapping$2[variant.ordinal()];
            if (i3 == 1) {
                gapComposer.startReplaceGroup(1187309201);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else if (i3 == 2) {
                gapComposer.startReplaceGroup(1187310578);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else if (i3 != 3) {
                gapComposer.startReplaceGroup(1187313997);
                gapComposer.end(false);
                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m((Object) betweenSection.variant, "Between Section variant ");
                return;
            } else {
                gapComposer.startReplaceGroup(1187312347);
                DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BenefitsLeafletViewKt$$ExternalSyntheticLambda22(betweenSection, i, 0);
        }
    }

    public static final void SpacerWithinSection(WithinSection withinSection, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(653689714);
        int i2 = (gapComposer.changedInstance(withinSection) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            WithinSection.Variant variant = withinSection.variant;
            int i3 = variant == null ? -1 : WhenMappings.$EnumSwitchMapping$3[variant.ordinal()];
            if (i3 == 1) {
                gapComposer.startReplaceGroup(1130592716);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else if (i3 != 2) {
                gapComposer.startReplaceGroup(1130595368);
                gapComposer.end(false);
                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m((Object) withinSection.variant, "Within Section variant ");
                return;
            } else {
                gapComposer.startReplaceGroup(1130594029);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BenefitsLeafletViewKt$$ExternalSyntheticLambda23(withinSection, i, 0);
        }
    }
}
