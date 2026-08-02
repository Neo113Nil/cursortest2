package com.squareup.cash.arcade.bindings.component;

import android.content.Context;
import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda4;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda8;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.ImageLoader$Builder;
import coil3.compose.AsyncImageKt;
import coil3.request.ImageRequest;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacg;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda9;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.SectionHeaderScope$$ExternalSyntheticLambda1;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$$ExternalSyntheticLambda4;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.bindings.header.PageHeaderProtoBindingKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.arcade.components.list.ListOrderedStandardItemsScope;
import com.squareup.cash.arcade.components.list.ListOrderedSubtleItemsScope;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.ButtonBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda8;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt$$ExternalSyntheticLambda20;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt$$ExternalSyntheticLambda22;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt$$ExternalSyntheticLambda23;
import com.squareup.cash.deposits.physical.view.map.AtmPmdExplainerViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda15;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.ActionableButtonCtaGroup;
import squareup.cash.ui.arcade.elements.ActionableButtonDefault;
import squareup.cash.ui.arcade.elements.ArcadeComponent;
import squareup.cash.ui.arcade.elements.ArcadeComponent$Component$ActionableButtonCtaGroup;
import squareup.cash.ui.arcade.elements.ArcadeComponent$Component$ActionableButtonDefault;
import squareup.cash.ui.arcade.elements.ArcadeComponent$Component$BetweenSection;
import squareup.cash.ui.arcade.elements.ArcadeComponent$Component$ButtonCompact;
import squareup.cash.ui.arcade.elements.ArcadeComponent$Component$ButtonCtaGroup;
import squareup.cash.ui.arcade.elements.ArcadeComponent$Component$ButtonDefault;
import squareup.cash.ui.arcade.elements.ArcadeComponent$Component$ButtonDefaultGroup;
import squareup.cash.ui.arcade.elements.ArcadeComponent$Component$CellDefault;
import squareup.cash.ui.arcade.elements.ArcadeComponent$Component$HeroHeader;
import squareup.cash.ui.arcade.elements.ArcadeComponent$Component$HeroNumericsHeader;
import squareup.cash.ui.arcade.elements.ArcadeComponent$Component$InlineMessage;
import squareup.cash.ui.arcade.elements.ArcadeComponent$Component$ListOrdered;
import squareup.cash.ui.arcade.elements.ArcadeComponent$Component$ListUnordered;
import squareup.cash.ui.arcade.elements.ArcadeComponent$Component$PageHeader;
import squareup.cash.ui.arcade.elements.ArcadeComponent$Component$RemoteImage;
import squareup.cash.ui.arcade.elements.ArcadeComponent$Component$SectionHeader;
import squareup.cash.ui.arcade.elements.ArcadeComponent$Component$WithinSection;
import squareup.cash.ui.arcade.elements.BetweenSection;
import squareup.cash.ui.arcade.elements.ButtonCompact;
import squareup.cash.ui.arcade.elements.ButtonCtaGroup;
import squareup.cash.ui.arcade.elements.ButtonDefault;
import squareup.cash.ui.arcade.elements.ButtonDefaultGroup;
import squareup.cash.ui.arcade.elements.ButtonProminence;
import squareup.cash.ui.arcade.elements.CellDefault;
import squareup.cash.ui.arcade.elements.HeroHeader;
import squareup.cash.ui.arcade.elements.HeroNumericsHeader;
import squareup.cash.ui.arcade.elements.HorizontalAlignment;
import squareup.cash.ui.arcade.elements.InlineMessage;
import squareup.cash.ui.arcade.elements.ListOrdered;
import squareup.cash.ui.arcade.elements.ListUnordered;
import squareup.cash.ui.arcade.elements.PageHeader;
import squareup.cash.ui.arcade.elements.RemoteImage;
import squareup.cash.ui.arcade.elements.SectionHeader;
import squareup.cash.ui.arcade.elements.WithinSection;

/* loaded from: classes5.dex */
public abstract class ArcadeComponentProtoBindingKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[ListOrdered.Variant.values().length];
            try {
                iArr[ListOrdered.Variant.SUBTLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListOrdered.Variant.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BetweenSection.Variant.values().length];
            try {
                iArr2[BetweenSection.Variant.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BetweenSection.Variant.X_LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BetweenSection.Variant.X_LARGE_BELOW_CELL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[WithinSection.Variant.values().length];
            try {
                iArr3[WithinSection.Variant.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[WithinSection.Variant.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ButtonProminence.values().length];
            try {
                iArr4[ButtonProminence.PROMINENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[ButtonProminence.SUBTLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[ButtonProminence.STANDARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[ListUnordered.Variant.values().length];
            try {
                iArr5[ListUnordered.Variant.SUBTLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[ListUnordered.Variant.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[HorizontalAlignment.values().length];
            try {
                iArr6[HorizontalAlignment.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr6[HorizontalAlignment.TRAILING.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr6[HorizontalAlignment.HORIZONTALLY_CENTERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /* renamed from: ArcadeComponent-xqIIw2o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3377ArcadeComponentxqIIw2o(ArcadeComponent arcadeComponent, Function1 function1, Modifier modifier, Color color, Composer composer, int i) {
        Modifier modifier2;
        ActionableButtonCtaGroup actionableButtonCtaGroup;
        ActionableButtonDefault actionableButtonDefault;
        BetweenSection betweenSection;
        ButtonCompact buttonCompact;
        ButtonCtaGroup buttonCtaGroup;
        ButtonDefault buttonDefault;
        ButtonDefaultGroup buttonDefaultGroup;
        CellDefault cellDefault;
        HeroHeader heroHeader;
        HeroNumericsHeader heroNumericsHeader;
        InlineMessage inlineMessage;
        ListOrdered listOrdered;
        ListUnordered listUnordered;
        PageHeader pageHeader;
        RemoteImage remoteImage;
        SectionHeader sectionHeader;
        WithinSection withinSection;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1326993684);
        int i2 = i | (gapComposer.changedInstance(arcadeComponent) ? 4 : 2) | MLKEMEngine.KyberPolyBytes | (gapComposer.changed(color) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            CameraGraph$OperatingMode cameraGraph$OperatingMode = arcadeComponent.component;
            WithinSection withinSection2 = null;
            r6 = null;
            ActionableButtonCtaGroup actionableButtonCtaGroup2 = null;
            r6 = null;
            ActionableButtonDefault actionableButtonDefault2 = null;
            r6 = null;
            BetweenSection betweenSection2 = null;
            r6 = null;
            ButtonCompact buttonCompact2 = null;
            r6 = null;
            ButtonCtaGroup buttonCtaGroup2 = null;
            r6 = null;
            ButtonDefault buttonDefault2 = null;
            r6 = null;
            ButtonDefaultGroup buttonDefaultGroup2 = null;
            r6 = null;
            CellDefault cellDefault2 = null;
            r6 = null;
            HeroHeader heroHeader2 = null;
            r6 = null;
            HeroNumericsHeader heroNumericsHeader2 = null;
            r6 = null;
            InlineMessage inlineMessage2 = null;
            r6 = null;
            ListOrdered listOrdered2 = null;
            r6 = null;
            ListUnordered listUnordered2 = null;
            r6 = null;
            PageHeader pageHeader2 = null;
            r6 = null;
            RemoteImage remoteImage2 = null;
            r6 = null;
            SectionHeader sectionHeader2 = null;
            withinSection2 = null;
            if (cameraGraph$OperatingMode != null) {
                ArcadeComponent$Component$ActionableButtonCtaGroup arcadeComponent$Component$ActionableButtonCtaGroup = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ActionableButtonCtaGroup ? (ArcadeComponent$Component$ActionableButtonCtaGroup) cameraGraph$OperatingMode : null;
                if (arcadeComponent$Component$ActionableButtonCtaGroup != null) {
                    actionableButtonCtaGroup = arcadeComponent$Component$ActionableButtonCtaGroup.value;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (actionableButtonCtaGroup == null) {
                        gapComposer.startReplaceGroup(364364587);
                        if (cameraGraph$OperatingMode != null) {
                            ArcadeComponent$Component$ActionableButtonCtaGroup arcadeComponent$Component$ActionableButtonCtaGroup2 = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ActionableButtonCtaGroup ? (ArcadeComponent$Component$ActionableButtonCtaGroup) cameraGraph$OperatingMode : null;
                            if (arcadeComponent$Component$ActionableButtonCtaGroup2 != null) {
                                actionableButtonCtaGroup2 = arcadeComponent$Component$ActionableButtonCtaGroup2.value;
                            }
                        }
                        actionableButtonCtaGroup2.getClass();
                        ArcadeComponentButtonProtoBindingKt.RenderActionableButtonCtaGroup(actionableButtonCtaGroup2, function1, gapComposer, 432);
                        gapComposer.end(false);
                    } else {
                        if (cameraGraph$OperatingMode != null) {
                            ArcadeComponent$Component$ActionableButtonDefault arcadeComponent$Component$ActionableButtonDefault = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ActionableButtonDefault ? (ArcadeComponent$Component$ActionableButtonDefault) cameraGraph$OperatingMode : null;
                            if (arcadeComponent$Component$ActionableButtonDefault != null) {
                                actionableButtonDefault = arcadeComponent$Component$ActionableButtonDefault.value;
                                if (actionableButtonDefault == null) {
                                    gapComposer.startReplaceGroup(364371752);
                                    if (cameraGraph$OperatingMode != null) {
                                        ArcadeComponent$Component$ActionableButtonDefault arcadeComponent$Component$ActionableButtonDefault2 = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ActionableButtonDefault ? (ArcadeComponent$Component$ActionableButtonDefault) cameraGraph$OperatingMode : null;
                                        if (arcadeComponent$Component$ActionableButtonDefault2 != null) {
                                            actionableButtonDefault2 = arcadeComponent$Component$ActionableButtonDefault2.value;
                                        }
                                    }
                                    actionableButtonDefault2.getClass();
                                    ArcadeComponentButtonProtoBindingKt.RenderActionableButtonDefault(actionableButtonDefault2, function1, companion, gapComposer, 432);
                                    gapComposer.end(false);
                                } else {
                                    if (cameraGraph$OperatingMode != null) {
                                        ArcadeComponent$Component$BetweenSection arcadeComponent$Component$BetweenSection = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$BetweenSection ? (ArcadeComponent$Component$BetweenSection) cameraGraph$OperatingMode : null;
                                        if (arcadeComponent$Component$BetweenSection != null) {
                                            betweenSection = arcadeComponent$Component$BetweenSection.value;
                                            if (betweenSection == null) {
                                                gapComposer.startReplaceGroup(364378404);
                                                if (cameraGraph$OperatingMode != null) {
                                                    ArcadeComponent$Component$BetweenSection arcadeComponent$Component$BetweenSection2 = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$BetweenSection ? (ArcadeComponent$Component$BetweenSection) cameraGraph$OperatingMode : null;
                                                    if (arcadeComponent$Component$BetweenSection2 != null) {
                                                        betweenSection2 = arcadeComponent$Component$BetweenSection2.value;
                                                    }
                                                }
                                                betweenSection2.getClass();
                                                RenderBetweenSection(betweenSection2, gapComposer, 0);
                                                gapComposer.end(false);
                                            } else {
                                                if (cameraGraph$OperatingMode != null) {
                                                    ArcadeComponent$Component$ButtonCompact arcadeComponent$Component$ButtonCompact = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonCompact ? (ArcadeComponent$Component$ButtonCompact) cameraGraph$OperatingMode : null;
                                                    if (arcadeComponent$Component$ButtonCompact != null) {
                                                        buttonCompact = arcadeComponent$Component$ButtonCompact.value;
                                                        if (buttonCompact == null) {
                                                            gapComposer.startReplaceGroup(364382003);
                                                            if (cameraGraph$OperatingMode != null) {
                                                                ArcadeComponent$Component$ButtonCompact arcadeComponent$Component$ButtonCompact2 = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonCompact ? (ArcadeComponent$Component$ButtonCompact) cameraGraph$OperatingMode : null;
                                                                if (arcadeComponent$Component$ButtonCompact2 != null) {
                                                                    buttonCompact2 = arcadeComponent$Component$ButtonCompact2.value;
                                                                }
                                                            }
                                                            buttonCompact2.getClass();
                                                            ArcadeComponentButtonProtoBindingKt.RenderButtonCompact(buttonCompact2, function1, gapComposer, 432);
                                                            gapComposer.end(false);
                                                        } else {
                                                            if (cameraGraph$OperatingMode != null) {
                                                                ArcadeComponent$Component$ButtonCtaGroup arcadeComponent$Component$ButtonCtaGroup = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonCtaGroup ? (ArcadeComponent$Component$ButtonCtaGroup) cameraGraph$OperatingMode : null;
                                                                if (arcadeComponent$Component$ButtonCtaGroup != null) {
                                                                    buttonCtaGroup = arcadeComponent$Component$ButtonCtaGroup.value;
                                                                    if (buttonCtaGroup == null) {
                                                                        gapComposer.startReplaceGroup(364388118);
                                                                        if (cameraGraph$OperatingMode != null) {
                                                                            ArcadeComponent$Component$ButtonCtaGroup arcadeComponent$Component$ButtonCtaGroup2 = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonCtaGroup ? (ArcadeComponent$Component$ButtonCtaGroup) cameraGraph$OperatingMode : null;
                                                                            if (arcadeComponent$Component$ButtonCtaGroup2 != null) {
                                                                                buttonCtaGroup2 = arcadeComponent$Component$ButtonCtaGroup2.value;
                                                                            }
                                                                        }
                                                                        buttonCtaGroup2.getClass();
                                                                        ArcadeComponentButtonProtoBindingKt.RenderButtonCtaGroup(buttonCtaGroup2, function1, gapComposer, 432);
                                                                        gapComposer.end(false);
                                                                    } else {
                                                                        if (cameraGraph$OperatingMode != null) {
                                                                            ArcadeComponent$Component$ButtonDefault arcadeComponent$Component$ButtonDefault = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonDefault ? (ArcadeComponent$Component$ButtonDefault) cameraGraph$OperatingMode : null;
                                                                            if (arcadeComponent$Component$ButtonDefault != null) {
                                                                                buttonDefault = arcadeComponent$Component$ButtonDefault.value;
                                                                                if (buttonDefault == null) {
                                                                                    gapComposer.startReplaceGroup(364394259);
                                                                                    if (cameraGraph$OperatingMode != null) {
                                                                                        ArcadeComponent$Component$ButtonDefault arcadeComponent$Component$ButtonDefault2 = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonDefault ? (ArcadeComponent$Component$ButtonDefault) cameraGraph$OperatingMode : null;
                                                                                        if (arcadeComponent$Component$ButtonDefault2 != null) {
                                                                                            buttonDefault2 = arcadeComponent$Component$ButtonDefault2.value;
                                                                                        }
                                                                                    }
                                                                                    buttonDefault2.getClass();
                                                                                    ArcadeComponentButtonProtoBindingKt.RenderButtonDefault(buttonDefault2, function1, companion, gapComposer, 432);
                                                                                    gapComposer.end(false);
                                                                                } else {
                                                                                    if (cameraGraph$OperatingMode != null) {
                                                                                        ArcadeComponent$Component$ButtonDefaultGroup arcadeComponent$Component$ButtonDefaultGroup = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonDefaultGroup ? (ArcadeComponent$Component$ButtonDefaultGroup) cameraGraph$OperatingMode : null;
                                                                                        if (arcadeComponent$Component$ButtonDefaultGroup != null) {
                                                                                            buttonDefaultGroup = arcadeComponent$Component$ButtonDefaultGroup.value;
                                                                                            if (buttonDefaultGroup == null) {
                                                                                                gapComposer.startReplaceGroup(364400510);
                                                                                                if (cameraGraph$OperatingMode != null) {
                                                                                                    ArcadeComponent$Component$ButtonDefaultGroup arcadeComponent$Component$ButtonDefaultGroup2 = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonDefaultGroup ? (ArcadeComponent$Component$ButtonDefaultGroup) cameraGraph$OperatingMode : null;
                                                                                                    if (arcadeComponent$Component$ButtonDefaultGroup2 != null) {
                                                                                                        buttonDefaultGroup2 = arcadeComponent$Component$ButtonDefaultGroup2.value;
                                                                                                    }
                                                                                                }
                                                                                                buttonDefaultGroup2.getClass();
                                                                                                ArcadeComponentButtonProtoBindingKt.RenderButtonDefaultGroup(buttonDefaultGroup2, function1, gapComposer, 432);
                                                                                                gapComposer.end(false);
                                                                                            } else {
                                                                                                if (cameraGraph$OperatingMode != null) {
                                                                                                    ArcadeComponent$Component$CellDefault arcadeComponent$Component$CellDefault = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$CellDefault ? (ArcadeComponent$Component$CellDefault) cameraGraph$OperatingMode : null;
                                                                                                    if (arcadeComponent$Component$CellDefault != null) {
                                                                                                        cellDefault = arcadeComponent$Component$CellDefault.value;
                                                                                                        if (cellDefault == null) {
                                                                                                            gapComposer.startReplaceGroup(364406878);
                                                                                                            if (cameraGraph$OperatingMode != null) {
                                                                                                                ArcadeComponent$Component$CellDefault arcadeComponent$Component$CellDefault2 = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$CellDefault ? (ArcadeComponent$Component$CellDefault) cameraGraph$OperatingMode : null;
                                                                                                                if (arcadeComponent$Component$CellDefault2 != null) {
                                                                                                                    cellDefault2 = arcadeComponent$Component$CellDefault2.value;
                                                                                                                }
                                                                                                            }
                                                                                                            cellDefault2.getClass();
                                                                                                            m3378RenderCellDefaultxqIIw2o(cellDefault2, function1, color, gapComposer, i2 & 8176);
                                                                                                            gapComposer.end(false);
                                                                                                        } else {
                                                                                                            if (cameraGraph$OperatingMode != null) {
                                                                                                                ArcadeComponent$Component$HeroHeader arcadeComponent$Component$HeroHeader = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$HeroHeader ? (ArcadeComponent$Component$HeroHeader) cameraGraph$OperatingMode : null;
                                                                                                                if (arcadeComponent$Component$HeroHeader != null) {
                                                                                                                    heroHeader = arcadeComponent$Component$HeroHeader.value;
                                                                                                                    if (heroHeader == null) {
                                                                                                                        gapComposer.startReplaceGroup(364414086);
                                                                                                                        if (cameraGraph$OperatingMode != null) {
                                                                                                                            ArcadeComponent$Component$HeroHeader arcadeComponent$Component$HeroHeader2 = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$HeroHeader ? (ArcadeComponent$Component$HeroHeader) cameraGraph$OperatingMode : null;
                                                                                                                            if (arcadeComponent$Component$HeroHeader2 != null) {
                                                                                                                                heroHeader2 = arcadeComponent$Component$HeroHeader2.value;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        heroHeader2.getClass();
                                                                                                                        RenderHeroHeader(heroHeader2, gapComposer, 48);
                                                                                                                        gapComposer.end(false);
                                                                                                                    } else {
                                                                                                                        if (cameraGraph$OperatingMode != null) {
                                                                                                                            ArcadeComponent$Component$HeroNumericsHeader arcadeComponent$Component$HeroNumericsHeader = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$HeroNumericsHeader ? (ArcadeComponent$Component$HeroNumericsHeader) cameraGraph$OperatingMode : null;
                                                                                                                            if (arcadeComponent$Component$HeroNumericsHeader != null) {
                                                                                                                                heroNumericsHeader = arcadeComponent$Component$HeroNumericsHeader.value;
                                                                                                                                if (heroNumericsHeader == null) {
                                                                                                                                    gapComposer.startReplaceGroup(364417950);
                                                                                                                                    if (cameraGraph$OperatingMode != null) {
                                                                                                                                        ArcadeComponent$Component$HeroNumericsHeader arcadeComponent$Component$HeroNumericsHeader2 = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$HeroNumericsHeader ? (ArcadeComponent$Component$HeroNumericsHeader) cameraGraph$OperatingMode : null;
                                                                                                                                        if (arcadeComponent$Component$HeroNumericsHeader2 != null) {
                                                                                                                                            heroNumericsHeader2 = arcadeComponent$Component$HeroNumericsHeader2.value;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    heroNumericsHeader2.getClass();
                                                                                                                                    RenderHeroNumericsHeader(heroNumericsHeader2, function1, gapComposer, 432);
                                                                                                                                    gapComposer.end(false);
                                                                                                                                } else {
                                                                                                                                    if (cameraGraph$OperatingMode != null) {
                                                                                                                                        ArcadeComponent$Component$InlineMessage arcadeComponent$Component$InlineMessage = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$InlineMessage ? (ArcadeComponent$Component$InlineMessage) cameraGraph$OperatingMode : null;
                                                                                                                                        if (arcadeComponent$Component$InlineMessage != null) {
                                                                                                                                            inlineMessage = arcadeComponent$Component$InlineMessage.value;
                                                                                                                                            if (inlineMessage == null) {
                                                                                                                                                gapComposer.startReplaceGroup(364424339);
                                                                                                                                                if (cameraGraph$OperatingMode != null) {
                                                                                                                                                    ArcadeComponent$Component$InlineMessage arcadeComponent$Component$InlineMessage2 = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$InlineMessage ? (ArcadeComponent$Component$InlineMessage) cameraGraph$OperatingMode : null;
                                                                                                                                                    if (arcadeComponent$Component$InlineMessage2 != null) {
                                                                                                                                                        inlineMessage2 = arcadeComponent$Component$InlineMessage2.value;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                inlineMessage2.getClass();
                                                                                                                                                RenderInlineMessage(inlineMessage2, function1, gapComposer, 432);
                                                                                                                                                gapComposer.end(false);
                                                                                                                                            } else {
                                                                                                                                                if (cameraGraph$OperatingMode != null) {
                                                                                                                                                    ArcadeComponent$Component$ListOrdered arcadeComponent$Component$ListOrdered = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ListOrdered ? (ArcadeComponent$Component$ListOrdered) cameraGraph$OperatingMode : null;
                                                                                                                                                    if (arcadeComponent$Component$ListOrdered != null) {
                                                                                                                                                        listOrdered = arcadeComponent$Component$ListOrdered.value;
                                                                                                                                                        if (listOrdered == null) {
                                                                                                                                                            gapComposer.startReplaceGroup(364430319);
                                                                                                                                                            if (cameraGraph$OperatingMode != null) {
                                                                                                                                                                ArcadeComponent$Component$ListOrdered arcadeComponent$Component$ListOrdered2 = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ListOrdered ? (ArcadeComponent$Component$ListOrdered) cameraGraph$OperatingMode : null;
                                                                                                                                                                if (arcadeComponent$Component$ListOrdered2 != null) {
                                                                                                                                                                    listOrdered2 = arcadeComponent$Component$ListOrdered2.value;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            listOrdered2.getClass();
                                                                                                                                                            RenderListOrdered(listOrdered2, function1, gapComposer, 432);
                                                                                                                                                            gapComposer.end(false);
                                                                                                                                                        } else {
                                                                                                                                                            if (cameraGraph$OperatingMode != null) {
                                                                                                                                                                ArcadeComponent$Component$ListUnordered arcadeComponent$Component$ListUnordered = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ListUnordered ? (ArcadeComponent$Component$ListUnordered) cameraGraph$OperatingMode : null;
                                                                                                                                                                if (arcadeComponent$Component$ListUnordered != null) {
                                                                                                                                                                    listUnordered = arcadeComponent$Component$ListUnordered.value;
                                                                                                                                                                    if (listUnordered == null) {
                                                                                                                                                                        gapComposer.startReplaceGroup(364436191);
                                                                                                                                                                        if (cameraGraph$OperatingMode != null) {
                                                                                                                                                                            ArcadeComponent$Component$ListUnordered arcadeComponent$Component$ListUnordered2 = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ListUnordered ? (ArcadeComponent$Component$ListUnordered) cameraGraph$OperatingMode : null;
                                                                                                                                                                            if (arcadeComponent$Component$ListUnordered2 != null) {
                                                                                                                                                                                listUnordered2 = arcadeComponent$Component$ListUnordered2.value;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        listUnordered2.getClass();
                                                                                                                                                                        RenderListUnordered(listUnordered2, gapComposer, 48);
                                                                                                                                                                        gapComposer.end(false);
                                                                                                                                                                    } else {
                                                                                                                                                                        if (cameraGraph$OperatingMode != null) {
                                                                                                                                                                            ArcadeComponent$Component$PageHeader arcadeComponent$Component$PageHeader = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$PageHeader ? (ArcadeComponent$Component$PageHeader) cameraGraph$OperatingMode : null;
                                                                                                                                                                            if (arcadeComponent$Component$PageHeader != null) {
                                                                                                                                                                                pageHeader = arcadeComponent$Component$PageHeader.value;
                                                                                                                                                                                if (pageHeader == null) {
                                                                                                                                                                                    gapComposer.startReplaceGroup(364440525);
                                                                                                                                                                                    if (cameraGraph$OperatingMode != null) {
                                                                                                                                                                                        ArcadeComponent$Component$PageHeader arcadeComponent$Component$PageHeader2 = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$PageHeader ? (ArcadeComponent$Component$PageHeader) cameraGraph$OperatingMode : null;
                                                                                                                                                                                        if (arcadeComponent$Component$PageHeader2 != null) {
                                                                                                                                                                                            pageHeader2 = arcadeComponent$Component$PageHeader2.value;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    pageHeader2.getClass();
                                                                                                                                                                                    RenderPageHeader(pageHeader2, function1, gapComposer, 432);
                                                                                                                                                                                    gapComposer.end(false);
                                                                                                                                                                                } else {
                                                                                                                                                                                    if (cameraGraph$OperatingMode != null) {
                                                                                                                                                                                        ArcadeComponent$Component$RemoteImage arcadeComponent$Component$RemoteImage = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$RemoteImage ? (ArcadeComponent$Component$RemoteImage) cameraGraph$OperatingMode : null;
                                                                                                                                                                                        if (arcadeComponent$Component$RemoteImage != null) {
                                                                                                                                                                                            remoteImage = arcadeComponent$Component$RemoteImage.value;
                                                                                                                                                                                            if (remoteImage == null) {
                                                                                                                                                                                                gapComposer.startReplaceGroup(364446267);
                                                                                                                                                                                                if (cameraGraph$OperatingMode != null) {
                                                                                                                                                                                                    ArcadeComponent$Component$RemoteImage arcadeComponent$Component$RemoteImage2 = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$RemoteImage ? (ArcadeComponent$Component$RemoteImage) cameraGraph$OperatingMode : null;
                                                                                                                                                                                                    if (arcadeComponent$Component$RemoteImage2 != null) {
                                                                                                                                                                                                        remoteImage2 = arcadeComponent$Component$RemoteImage2.value;
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                remoteImage2.getClass();
                                                                                                                                                                                                RenderRemoteImage(remoteImage2, gapComposer, 48);
                                                                                                                                                                                                gapComposer.end(false);
                                                                                                                                                                                            } else {
                                                                                                                                                                                                if (cameraGraph$OperatingMode != null) {
                                                                                                                                                                                                    ArcadeComponent$Component$SectionHeader arcadeComponent$Component$SectionHeader = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$SectionHeader ? (ArcadeComponent$Component$SectionHeader) cameraGraph$OperatingMode : null;
                                                                                                                                                                                                    if (arcadeComponent$Component$SectionHeader != null) {
                                                                                                                                                                                                        sectionHeader = arcadeComponent$Component$SectionHeader.value;
                                                                                                                                                                                                        if (sectionHeader == null) {
                                                                                                                                                                                                            gapComposer.startReplaceGroup(364450579);
                                                                                                                                                                                                            if (cameraGraph$OperatingMode != null) {
                                                                                                                                                                                                                ArcadeComponent$Component$SectionHeader arcadeComponent$Component$SectionHeader2 = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$SectionHeader ? (ArcadeComponent$Component$SectionHeader) cameraGraph$OperatingMode : null;
                                                                                                                                                                                                                if (arcadeComponent$Component$SectionHeader2 != null) {
                                                                                                                                                                                                                    sectionHeader2 = arcadeComponent$Component$SectionHeader2.value;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            sectionHeader2.getClass();
                                                                                                                                                                                                            RenderSectionHeader(sectionHeader2, function1, gapComposer, 432);
                                                                                                                                                                                                            gapComposer.end(false);
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            if (cameraGraph$OperatingMode != null) {
                                                                                                                                                                                                                ArcadeComponent$Component$WithinSection arcadeComponent$Component$WithinSection = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$WithinSection ? (ArcadeComponent$Component$WithinSection) cameraGraph$OperatingMode : null;
                                                                                                                                                                                                                if (arcadeComponent$Component$WithinSection != null) {
                                                                                                                                                                                                                    withinSection = arcadeComponent$Component$WithinSection.value;
                                                                                                                                                                                                                    if (withinSection == null) {
                                                                                                                                                                                                                        gapComposer.startReplaceGroup(364456546);
                                                                                                                                                                                                                        if (cameraGraph$OperatingMode != null) {
                                                                                                                                                                                                                            ArcadeComponent$Component$WithinSection arcadeComponent$Component$WithinSection2 = cameraGraph$OperatingMode instanceof ArcadeComponent$Component$WithinSection ? (ArcadeComponent$Component$WithinSection) cameraGraph$OperatingMode : null;
                                                                                                                                                                                                                            if (arcadeComponent$Component$WithinSection2 != null) {
                                                                                                                                                                                                                                withinSection2 = arcadeComponent$Component$WithinSection2.value;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        withinSection2.getClass();
                                                                                                                                                                                                                        RenderWithinSection(withinSection2, gapComposer, 0);
                                                                                                                                                                                                                        gapComposer.end(false);
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                        gapComposer.startReplaceGroup(-1586693098);
                                                                                                                                                                                                                        gapComposer.end(false);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            withinSection = null;
                                                                                                                                                                                                            if (withinSection == null) {
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                sectionHeader = null;
                                                                                                                                                                                                if (sectionHeader == null) {
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    remoteImage = null;
                                                                                                                                                                                    if (remoteImage == null) {
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
                                                                                                                                                            listUnordered = null;
                                                                                                                                                            if (listUnordered == null) {
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
                                                                                                                                    inlineMessage = null;
                                                                                                                                    if (inlineMessage == null) {
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        heroNumericsHeader = null;
                                                                                                                        if (heroNumericsHeader == null) {
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            heroHeader = null;
                                                                                                            if (heroHeader == null) {
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                cellDefault = null;
                                                                                                if (cellDefault == null) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    buttonDefaultGroup = null;
                                                                                    if (buttonDefaultGroup == null) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        buttonDefault = null;
                                                                        if (buttonDefault == null) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            buttonCtaGroup = null;
                                                            if (buttonCtaGroup == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                                buttonCompact = null;
                                                if (buttonCompact == null) {
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
                        actionableButtonDefault = null;
                        if (actionableButtonDefault == null) {
                        }
                    }
                    modifier2 = companion;
                }
            }
            actionableButtonCtaGroup = null;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (actionableButtonCtaGroup == null) {
            }
            modifier2 = companion2;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(arcadeComponent, function1, modifier2, color, i);
        }
    }

    public static final void AvatarIcon(UiAvatar uiAvatar, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1429867104);
        int i2 = (gapComposer.changedInstance(uiAvatar) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(uiAvatar, null, gapComposer, 1), null, false, gapComposer, 6, 28);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PageHeaderProtoBindingKt$$ExternalSyntheticLambda0(uiAvatar, i, 3);
        }
    }

    public static final void PageHeaderAvatar(UiAvatar uiAvatar, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1677643619);
        int i2 = (gapComposer.changedInstance(uiAvatar) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            TextViewKt.Avatar(AvatarSize.Size64, AvatarsKt.toAvatarEntry(uiAvatar, null, gapComposer, 1), null, false, gapComposer, 6, 28);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PageHeaderProtoBindingKt$$ExternalSyntheticLambda0(uiAvatar, i, 2);
        }
    }

    public static final void RenderBetweenSection(BetweenSection betweenSection, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1620617713);
        int i2 = (gapComposer.changedInstance(betweenSection) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            BetweenSection.Variant variant = betweenSection.variant;
            int i3 = variant == null ? -1 : WhenMappings.$EnumSwitchMapping$1[variant.ordinal()];
            if (i3 == 1) {
                gapComposer.startReplaceGroup(-1659502388);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else if (i3 == 2) {
                gapComposer.startReplaceGroup(-1659500147);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else if (i3 != 3) {
                gapComposer.startReplaceGroup(-1659495865);
                gapComposer.end(false);
                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m((Object) betweenSection.variant, "BetweenSection variant ");
                return;
            } else {
                gapComposer.startReplaceGroup(-1659497514);
                DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BenefitsLeafletViewKt$$ExternalSyntheticLambda22(betweenSection, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0329  */
    /* renamed from: RenderCellDefault-xqIIw2o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3378RenderCellDefaultxqIIw2o(CellDefault cellDefault, Function1 function1, Color color, Composer composer, int i) {
        int i2;
        Function0 function0;
        ComposableLambdaImpl rememberComposableLambda;
        boolean z;
        CellDefault.CellDefaultAccessory.LabeledPush labeledPush;
        boolean z2;
        boolean z3;
        boolean z4;
        CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton cellDefaultAccessoryCompactButton;
        ComposableLambdaImpl composableLambdaImpl;
        LocalizedString localizedString;
        CellDefaultAccessory cellDefaultAccessory;
        CellDefaultAccessory cellDefaultAccessory2;
        LocalizedString localizedString2;
        CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton cellDefaultAccessoryCompactButton2;
        ButtonProminence buttonProminence;
        int i3;
        com.squareup.cash.arcade.components.button.ButtonProminence buttonProminence2;
        CellDefaultAccessory toggle;
        CellDefault.CellDefaultAccessory.LabeledPush labeledPush2;
        CellDefault.CellDefaultAccessory.Type type2;
        CellDefault.CellDefaultAccessory.LabeledPush labeledPush3;
        CellDefault.CellDefaultIcon cellDefaultIcon;
        CellDefault.CellDefaultIcon.TintedIcon tintedIcon;
        Icon icon;
        Function0 function02;
        Icons icons;
        Modifier.Companion companion;
        ComposableLambdaImpl composableLambdaImpl2;
        long j;
        UiAvatar uiAvatar;
        CellDefault.CellDefaultIcon.IconStyle iconStyle;
        boolean z5;
        Color m;
        long j2;
        long j3;
        Color m2;
        boolean z6;
        CellDefault.CellDefaultIcon.IconStyle iconStyle2;
        CellDefault.CellDefaultIcon.IconStyle.Icon icon2;
        CellDefault.CellDefaultIcon.IconStyle iconStyle3;
        CellDefault.CellDefaultIcon.IconStyle.TintedIcon tintedIcon2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-623316390);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(cellDefault) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i & MLKEMEngine.KyberPolyBytes;
        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
        if (i4 == 0) {
            i2 |= gapComposer.changed(companion2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(color) ? 2048 : 1024;
        }
        int i5 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Boolean bool = cellDefault.disabled;
            Boolean bool2 = Boolean.TRUE;
            boolean areEqual = Intrinsics.areEqual(bool, bool2);
            boolean z7 = !areEqual;
            if (areEqual) {
                gapComposer.startReplaceGroup(-2074656714);
                gapComposer.end(false);
                function0 = null;
            } else {
                gapComposer.startReplaceGroup(-2074714157);
                boolean z8 = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z8 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda1(22, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function0 = (Function0) rememberedValue;
                gapComposer.end(false);
            }
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1087108950, new AtmPmdExplainerViewKt$$ExternalSyntheticLambda7(cellDefault, i5), gapComposer);
            String translatedOrNull = translatedOrNull(cellDefault.body_text);
            if (translatedOrNull == null) {
                gapComposer.startReplaceGroup(-2074435468);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(-2074435467);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(619178657, new AtmPickerGridKt$$ExternalSyntheticLambda4(29, cellDefault, translatedOrNull), gapComposer);
                gapComposer.end(false);
            }
            CellDefault.CellDefaultAccessory cellDefaultAccessory3 = cellDefault.accessory;
            if (cellDefaultAccessory3 == null) {
                toggle = CellDefaultAccessory.None.INSTANCE;
            } else {
                CellDefault.CellDefaultAccessory.Type type3 = cellDefaultAccessory3.type;
                if (type3 != null) {
                    CellDefault.CellDefaultAccessory.Type.Push push = type3 instanceof CellDefault.CellDefaultAccessory.Type.Push ? (CellDefault.CellDefaultAccessory.Type.Push) type3 : null;
                    z = Intrinsics.areEqual(push != null ? Boolean.valueOf(push.getValue()) : null, bool2);
                } else {
                    z = false;
                }
                if (z) {
                    toggle = CellDefaultAccessory.Push.INSTANCE;
                } else {
                    CellDefault.CellDefaultAccessory.Type type4 = cellDefaultAccessory3.type;
                    if (type4 != null) {
                        CellDefault.CellDefaultAccessory.Type.LabeledPush labeledPush4 = type4 instanceof CellDefault.CellDefaultAccessory.Type.LabeledPush ? (CellDefault.CellDefaultAccessory.Type.LabeledPush) type4 : null;
                        if (labeledPush4 != null) {
                            labeledPush = labeledPush4.getValue();
                            CellDefault.CellDefaultAccessory.Type type5 = cellDefaultAccessory3.type;
                            if (labeledPush == null) {
                                if (type5 != null) {
                                    CellDefault.CellDefaultAccessory.Type.LabeledPush labeledPush5 = type5 instanceof CellDefault.CellDefaultAccessory.Type.LabeledPush ? (CellDefault.CellDefaultAccessory.Type.LabeledPush) type5 : null;
                                    if (labeledPush5 != null) {
                                        labeledPush2 = labeledPush5.getValue();
                                        labeledPush2.getClass();
                                        String translatedOrEmpty = translatedOrEmpty(labeledPush2.text);
                                        type2 = cellDefaultAccessory3.type;
                                        if (type2 != null) {
                                            CellDefault.CellDefaultAccessory.Type.LabeledPush labeledPush6 = type2 instanceof CellDefault.CellDefaultAccessory.Type.LabeledPush ? (CellDefault.CellDefaultAccessory.Type.LabeledPush) type2 : null;
                                            if (labeledPush6 != null) {
                                                labeledPush3 = labeledPush6.getValue();
                                                labeledPush3.getClass();
                                                composableLambdaImpl = rememberComposableLambda2;
                                                cellDefaultAccessory2 = Intrinsics.areEqual(labeledPush3.hide_push_chevron, bool2) ? new CellDefaultAccessory.Label(translatedOrEmpty, 0) : new CellDefaultAccessory.Label(translatedOrEmpty, 2);
                                            }
                                        }
                                        labeledPush3 = null;
                                        labeledPush3.getClass();
                                        composableLambdaImpl = rememberComposableLambda2;
                                        cellDefaultAccessory2 = Intrinsics.areEqual(labeledPush3.hide_push_chevron, bool2) ? new CellDefaultAccessory.Label(translatedOrEmpty, 0) : new CellDefaultAccessory.Label(translatedOrEmpty, 2);
                                    }
                                }
                                labeledPush2 = null;
                                labeledPush2.getClass();
                                String translatedOrEmpty2 = translatedOrEmpty(labeledPush2.text);
                                type2 = cellDefaultAccessory3.type;
                                if (type2 != null) {
                                }
                                labeledPush3 = null;
                                labeledPush3.getClass();
                                composableLambdaImpl = rememberComposableLambda2;
                                cellDefaultAccessory2 = Intrinsics.areEqual(labeledPush3.hide_push_chevron, bool2) ? new CellDefaultAccessory.Label(translatedOrEmpty2, 0) : new CellDefaultAccessory.Label(translatedOrEmpty2, 2);
                            } else {
                                if (type5 != null) {
                                    CellDefault.CellDefaultAccessory.Type.Checkbox checkbox = type5 instanceof CellDefault.CellDefaultAccessory.Type.Checkbox ? (CellDefault.CellDefaultAccessory.Type.Checkbox) type5 : null;
                                    z2 = Intrinsics.areEqual(checkbox != null ? Boolean.valueOf(checkbox.getValue()) : null, bool2);
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    toggle = new CellDefaultAccessory.Checkbox(false);
                                } else {
                                    CellDefault.CellDefaultAccessory.Type type6 = cellDefaultAccessory3.type;
                                    if (type6 != null) {
                                        CellDefault.CellDefaultAccessory.Type.Radio radio = type6 instanceof CellDefault.CellDefaultAccessory.Type.Radio ? (CellDefault.CellDefaultAccessory.Type.Radio) type6 : null;
                                        z3 = Intrinsics.areEqual(radio != null ? Boolean.valueOf(radio.getValue()) : null, bool2);
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        toggle = new CellDefaultAccessory.Radio(false);
                                    } else {
                                        CellDefault.CellDefaultAccessory.Type type7 = cellDefaultAccessory3.type;
                                        if (type7 != null) {
                                            CellDefault.CellDefaultAccessory.Type.Toggle toggle2 = type7 instanceof CellDefault.CellDefaultAccessory.Type.Toggle ? (CellDefault.CellDefaultAccessory.Type.Toggle) type7 : null;
                                            z4 = Intrinsics.areEqual(toggle2 != null ? Boolean.valueOf(toggle2.getValue()) : null, bool2);
                                        } else {
                                            z4 = false;
                                        }
                                        if (z4) {
                                            toggle = new CellDefaultAccessory.Toggle(false);
                                        } else {
                                            CellDefault.CellDefaultAccessory.Type type8 = cellDefaultAccessory3.type;
                                            if (type8 != null) {
                                                CellDefault.CellDefaultAccessory.Type.CompactButton compactButton = type8 instanceof CellDefault.CellDefaultAccessory.Type.CompactButton ? (CellDefault.CellDefaultAccessory.Type.CompactButton) type8 : null;
                                                if (compactButton != null) {
                                                    cellDefaultAccessoryCompactButton = compactButton.getValue();
                                                    CellDefault.CellDefaultAccessory.Type type9 = cellDefaultAccessory3.type;
                                                    if (cellDefaultAccessoryCompactButton == null) {
                                                        if (type9 != null) {
                                                            CellDefault.CellDefaultAccessory.Type.CompactButton compactButton2 = type9 instanceof CellDefault.CellDefaultAccessory.Type.CompactButton ? (CellDefault.CellDefaultAccessory.Type.CompactButton) type9 : null;
                                                            if (compactButton2 != null) {
                                                                cellDefaultAccessoryCompactButton2 = compactButton2.getValue();
                                                                cellDefaultAccessoryCompactButton2.getClass();
                                                                BalanceHomeViewKt$$ExternalSyntheticLambda1 balanceHomeViewKt$$ExternalSyntheticLambda1 = new BalanceHomeViewKt$$ExternalSyntheticLambda1(19, function1);
                                                                buttonProminence = cellDefaultAccessoryCompactButton2.prominence;
                                                                if (buttonProminence != null) {
                                                                    composableLambdaImpl = rememberComposableLambda2;
                                                                    i3 = -1;
                                                                } else {
                                                                    composableLambdaImpl = rememberComposableLambda2;
                                                                    i3 = WhenMappings.$EnumSwitchMapping$3[buttonProminence.ordinal()];
                                                                }
                                                                if (i3 != -1) {
                                                                    if (i3 == 1) {
                                                                        buttonProminence2 = com.squareup.cash.arcade.components.button.ButtonProminence.PROMINENT;
                                                                    } else if (i3 == 2) {
                                                                        buttonProminence2 = com.squareup.cash.arcade.components.button.ButtonProminence.SUBTLE;
                                                                    } else if (i3 != 3) {
                                                                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m$1(buttonProminence, "Button prominence ");
                                                                        return;
                                                                    }
                                                                    cellDefaultAccessory2 = new CellDefaultAccessory.ButtonCompact(balanceHomeViewKt$$ExternalSyntheticLambda1, buttonProminence2, Intrinsics.areEqual(cellDefaultAccessoryCompactButton2.is_destructive, bool2), new ComposableLambdaImpl(new BankingDialogKt$$ExternalSyntheticLambda8(cellDefaultAccessoryCompactButton2, 1), true, -1063718575), 8);
                                                                }
                                                                buttonProminence2 = com.squareup.cash.arcade.components.button.ButtonProminence.STANDARD;
                                                                cellDefaultAccessory2 = new CellDefaultAccessory.ButtonCompact(balanceHomeViewKt$$ExternalSyntheticLambda1, buttonProminence2, Intrinsics.areEqual(cellDefaultAccessoryCompactButton2.is_destructive, bool2), new ComposableLambdaImpl(new BankingDialogKt$$ExternalSyntheticLambda8(cellDefaultAccessoryCompactButton2, 1), true, -1063718575), 8);
                                                            }
                                                        }
                                                        cellDefaultAccessoryCompactButton2 = null;
                                                        cellDefaultAccessoryCompactButton2.getClass();
                                                        BalanceHomeViewKt$$ExternalSyntheticLambda1 balanceHomeViewKt$$ExternalSyntheticLambda12 = new BalanceHomeViewKt$$ExternalSyntheticLambda1(19, function1);
                                                        buttonProminence = cellDefaultAccessoryCompactButton2.prominence;
                                                        if (buttonProminence != null) {
                                                        }
                                                        if (i3 != -1) {
                                                        }
                                                        buttonProminence2 = com.squareup.cash.arcade.components.button.ButtonProminence.STANDARD;
                                                        cellDefaultAccessory2 = new CellDefaultAccessory.ButtonCompact(balanceHomeViewKt$$ExternalSyntheticLambda12, buttonProminence2, Intrinsics.areEqual(cellDefaultAccessoryCompactButton2.is_destructive, bool2), new ComposableLambdaImpl(new BankingDialogKt$$ExternalSyntheticLambda8(cellDefaultAccessoryCompactButton2, 1), true, -1063718575), 8);
                                                    } else {
                                                        composableLambdaImpl = rememberComposableLambda2;
                                                        if (type9 != null) {
                                                            CellDefault.CellDefaultAccessory.Type.Label label = type9 instanceof CellDefault.CellDefaultAccessory.Type.Label ? (CellDefault.CellDefaultAccessory.Type.Label) type9 : null;
                                                            if (label != null) {
                                                                localizedString = label.getValue();
                                                                if (localizedString == null) {
                                                                    CellDefault.CellDefaultAccessory.Type type10 = cellDefaultAccessory3.type;
                                                                    if (type10 != null) {
                                                                        CellDefault.CellDefaultAccessory.Type.Label label2 = type10 instanceof CellDefault.CellDefaultAccessory.Type.Label ? (CellDefault.CellDefaultAccessory.Type.Label) type10 : null;
                                                                        if (label2 != null) {
                                                                            localizedString2 = label2.getValue();
                                                                            cellDefaultAccessory = new CellDefaultAccessory.Label(translatedOrEmpty(localizedString2), 0);
                                                                        }
                                                                    }
                                                                    localizedString2 = null;
                                                                    cellDefaultAccessory = new CellDefaultAccessory.Label(translatedOrEmpty(localizedString2), 0);
                                                                } else {
                                                                    cellDefaultAccessory = CellDefaultAccessory.None.INSTANCE;
                                                                }
                                                                cellDefaultAccessory2 = cellDefaultAccessory;
                                                            }
                                                        }
                                                        localizedString = null;
                                                        if (localizedString == null) {
                                                        }
                                                        cellDefaultAccessory2 = cellDefaultAccessory;
                                                    }
                                                }
                                            }
                                            cellDefaultAccessoryCompactButton = null;
                                            CellDefault.CellDefaultAccessory.Type type92 = cellDefaultAccessory3.type;
                                            if (cellDefaultAccessoryCompactButton == null) {
                                            }
                                        }
                                    }
                                }
                            }
                            cellDefaultIcon = cellDefault.icon;
                            if (cellDefaultIcon != null && (iconStyle3 = cellDefaultIcon.icon_style) != null) {
                                tintedIcon2 = !(iconStyle3 instanceof CellDefault.CellDefaultIcon.IconStyle.TintedIcon) ? (CellDefault.CellDefaultIcon.IconStyle.TintedIcon) iconStyle3 : null;
                                if (tintedIcon2 != null) {
                                    tintedIcon = tintedIcon2.getValue();
                                    Icons arcadeIcon = toArcadeIcon(tintedIcon == null ? tintedIcon.icon : null);
                                    if (cellDefaultIcon != null && (iconStyle2 = cellDefaultIcon.icon_style) != null) {
                                        icon2 = !(iconStyle2 instanceof CellDefault.CellDefaultIcon.IconStyle.Icon) ? (CellDefault.CellDefaultIcon.IconStyle.Icon) iconStyle2 : null;
                                        if (icon2 != null) {
                                            icon = icon2.getValue();
                                            Icons arcadeIcon2 = toArcadeIcon(icon);
                                            if (color == null) {
                                                gapComposer.startReplaceGroup(-2006555487);
                                                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                                function02 = function0;
                                                icons = arcadeIcon;
                                                if (colors == null) {
                                                    z6 = false;
                                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                                } else {
                                                    z6 = false;
                                                    gapComposer.startReplaceGroup(-1762997739);
                                                    gapComposer.end(false);
                                                }
                                                Colors.Component.Cell.Background background = colors.component.cell.background;
                                                companion = companion2;
                                                composableLambdaImpl2 = rememberComposableLambda;
                                                j = background.f171default;
                                                gapComposer.end(z6);
                                            } else {
                                                function02 = function0;
                                                icons = arcadeIcon;
                                                companion = companion2;
                                                composableLambdaImpl2 = rememberComposableLambda;
                                                gapComposer.startReplaceGroup(-2006557471);
                                                gapComposer.end(false);
                                                j = color.value;
                                            }
                                            if (icons != null) {
                                                gapComposer.startReplaceGroup(-2073610588);
                                                com.squareup.protos.cash.ui.Color color2 = tintedIcon != null ? tintedIcon.icon_tint_color : null;
                                                if (color2 == null) {
                                                    gapComposer.startReplaceGroup(-2073447715);
                                                    z5 = false;
                                                    gapComposer.end(false);
                                                    m = null;
                                                } else {
                                                    z5 = false;
                                                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -2006548060, color2, gapComposer, false);
                                                }
                                                if (m == null) {
                                                    gapComposer.startReplaceGroup(-2006546559);
                                                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                                    if (colors2 == null) {
                                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z5);
                                                    } else {
                                                        gapComposer.startReplaceGroup(-1762997739);
                                                        gapComposer.end(z5);
                                                    }
                                                    j2 = j;
                                                    j3 = colors2.semantic.icon.inverse;
                                                    gapComposer.end(z5);
                                                } else {
                                                    j2 = j;
                                                    gapComposer.startReplaceGroup(-2006549070);
                                                    gapComposer.end(z5);
                                                    j3 = m.value;
                                                }
                                                long j4 = j3;
                                                com.squareup.protos.cash.ui.Color color3 = tintedIcon != null ? tintedIcon.background_color : null;
                                                if (color3 == null) {
                                                    gapComposer.startReplaceGroup(-2073332643);
                                                    gapComposer.end(z5);
                                                    m2 = null;
                                                } else {
                                                    m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -2006544348, color3, gapComposer, z5);
                                                }
                                                CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, null, m2 != null ? m2.value : Color.Unspecified, composableLambdaImpl, companion, j4, function02, null, z7, false, composableLambdaImpl2, null, cellDefaultAccessory2, j2, null, gapComposer, ((i2 << 6) & 57344) | 3120, 0, 19072);
                                                gapComposer = gapComposer;
                                                gapComposer.end(z5);
                                            } else {
                                                Modifier.Companion companion3 = companion;
                                                Function0 function03 = function02;
                                                ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                                                ComposableLambdaImpl composableLambdaImpl4 = composableLambdaImpl;
                                                long j5 = j;
                                                if (cellDefaultIcon != null && (iconStyle = cellDefaultIcon.icon_style) != null) {
                                                    CellDefault.CellDefaultIcon.IconStyle.Avatar avatar = iconStyle instanceof CellDefault.CellDefaultIcon.IconStyle.Avatar ? (CellDefault.CellDefaultIcon.IconStyle.Avatar) iconStyle : null;
                                                    if (avatar != null) {
                                                        uiAvatar = avatar.getValue();
                                                        if (uiAvatar == null) {
                                                            gapComposer.startReplaceGroup(-2073058478);
                                                            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(1537536157, new ArcadeComponentProtoBindingKt$$ExternalSyntheticLambda8(cellDefaultIcon, 0), gapComposer), composableLambdaImpl4, companion3, function03, null, z7, false, composableLambdaImpl3, null, cellDefaultAccessory2, j5, null, gapComposer, (i2 & 896) | 54, 0, 2384);
                                                            gapComposer = gapComposer;
                                                            gapComposer.end(false);
                                                        } else if (arcadeIcon2 != null) {
                                                            gapComposer.startReplaceGroup(-2072724794);
                                                            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(-48843640, new InfoSectionKt$$ExternalSyntheticLambda6(arcadeIcon2, 5), gapComposer), composableLambdaImpl4, companion3, function03, z7, false, composableLambdaImpl3, null, cellDefaultAccessory2, j5, gapComposer, (i2 & 896) | 54, 2384);
                                                            gapComposer.end(false);
                                                        } else {
                                                            gapComposer.startReplaceGroup(-2072394737);
                                                            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(composableLambdaImpl4, companion3, function03, z7, false, composableLambdaImpl3, null, j5, cellDefaultAccessory2, null, gapComposer, ((i2 >> 3) & 112) | 6, 1192);
                                                            gapComposer.end(false);
                                                        }
                                                    }
                                                }
                                                uiAvatar = null;
                                                if (uiAvatar == null) {
                                                }
                                            }
                                        }
                                    }
                                    icon = null;
                                    Icons arcadeIcon22 = toArcadeIcon(icon);
                                    if (color == null) {
                                    }
                                    if (icons != null) {
                                    }
                                }
                            }
                            tintedIcon = null;
                            Icons arcadeIcon3 = toArcadeIcon(tintedIcon == null ? tintedIcon.icon : null);
                            if (cellDefaultIcon != null) {
                                if (!(iconStyle2 instanceof CellDefault.CellDefaultIcon.IconStyle.Icon)) {
                                }
                                if (icon2 != null) {
                                }
                            }
                            icon = null;
                            Icons arcadeIcon222 = toArcadeIcon(icon);
                            if (color == null) {
                            }
                            if (icons != null) {
                            }
                        }
                    }
                    labeledPush = null;
                    CellDefault.CellDefaultAccessory.Type type52 = cellDefaultAccessory3.type;
                    if (labeledPush == null) {
                    }
                    cellDefaultIcon = cellDefault.icon;
                    if (cellDefaultIcon != null) {
                        if (!(iconStyle3 instanceof CellDefault.CellDefaultIcon.IconStyle.TintedIcon)) {
                        }
                        if (tintedIcon2 != null) {
                        }
                    }
                    tintedIcon = null;
                    Icons arcadeIcon32 = toArcadeIcon(tintedIcon == null ? tintedIcon.icon : null);
                    if (cellDefaultIcon != null) {
                    }
                    icon = null;
                    Icons arcadeIcon2222 = toArcadeIcon(icon);
                    if (color == null) {
                    }
                    if (icons != null) {
                    }
                }
            }
            cellDefaultAccessory2 = toggle;
            composableLambdaImpl = rememberComposableLambda2;
            cellDefaultIcon = cellDefault.icon;
            if (cellDefaultIcon != null) {
            }
            tintedIcon = null;
            Icons arcadeIcon322 = toArcadeIcon(tintedIcon == null ? tintedIcon.icon : null);
            if (cellDefaultIcon != null) {
            }
            icon = null;
            Icons arcadeIcon22222 = toArcadeIcon(icon);
            if (color == null) {
            }
            if (icons != null) {
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(cellDefault, function1, color, i);
        }
    }

    public static final void RenderHeroHeader(HeroHeader heroHeader, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-577401738);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(heroHeader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 |= gapComposer.changed(companion) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ViewfinderKt.HeroHeader(translatedOrEmpty(heroHeader.title_text), companion, translatedOrNull(heroHeader.body_text), (TextStyle) null, gapComposer, i2 & 112, 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(heroHeader, i);
        }
    }

    public static final void RenderHeroNumericsHeader(HeroNumericsHeader heroNumericsHeader, Function1 function1, Composer composer, int i) {
        int i2;
        ComposableLambdaImpl rememberComposableLambda;
        ComposableLambdaImpl rememberComposableLambda2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1941298691);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(heroNumericsHeader) ? 4 : 2) | i;
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
            int m3379toTextAlignolWjt3U = m3379toTextAlignolWjt3U(heroNumericsHeader.horizontal_alignment, 3);
            String translatedOrNull = translatedOrNull(heroNumericsHeader.section_title_text);
            ComposableLambdaImpl composableLambdaImpl = null;
            if (translatedOrNull == null) {
                gapComposer.startReplaceGroup(1495067151);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(1495067152);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1684267851, new ToastKt$$ExternalSyntheticLambda1(translatedOrNull, 17), gapComposer);
                gapComposer.end(false);
            }
            HeroNumericsHeader.BodyText bodyText = heroNumericsHeader.body_text;
            if (bodyText == null) {
                gapComposer.startReplaceGroup(1495197816);
                gapComposer.end(false);
                rememberComposableLambda2 = null;
            } else {
                gapComposer.startReplaceGroup(1495197817);
                rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1210547732, new BrandSheetViewKt$$ExternalSyntheticLambda1(28, (Object) bodyText, (Object) function1), gapComposer);
                gapComposer.end(false);
            }
            String translatedOrNull2 = translatedOrNull(heroNumericsHeader.additional_body_text);
            if (translatedOrNull2 == null) {
                gapComposer.startReplaceGroup(1495865835);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1495865836);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(164292329, new ToastKt$$ExternalSyntheticLambda1(translatedOrNull2, 18), gapComposer);
                gapComposer.end(false);
            }
            zzacg.m2009HeroNumericsHeadertv5qRRQ(Expect_jvmKt.rememberComposableLambda(1315410781, new ButtonBinding$$ExternalSyntheticLambda2(heroNumericsHeader, 13), gapComposer), companion, m3379toTextAlignolWjt3U, rememberComposableLambda, (Function3) null, rememberComposableLambda2, composableLambdaImpl, gapComposer, ((i2 >> 3) & 112) | 6, 16);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(heroNumericsHeader, function1, i);
        }
    }

    public static final void RenderInlineMessage(InlineMessage inlineMessage, Function1 function1, Composer composer, int i) {
        int i2;
        ComposableLambdaImpl rememberComposableLambda;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-460412817);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(inlineMessage) ? 4 : 2) | i;
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
            String translatedOrEmpty = translatedOrEmpty(inlineMessage.primary_button_text);
            String translatedOrNull = translatedOrNull(inlineMessage.secondary_button_text);
            String translatedOrEmpty2 = translatedOrEmpty(inlineMessage.title_text);
            String translatedOrEmpty3 = translatedOrEmpty(inlineMessage.body_text);
            Image image = inlineMessage.image;
            ComposableLambdaImpl composableLambdaImpl = null;
            if (image == null || (str = image.light_url) == null || StringsKt.isBlank(str)) {
                image = null;
            }
            if (image == null) {
                gapComposer.startReplaceGroup(1967835954);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(1967835955);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1460721743, new BrandSheetViewKt$$ExternalSyntheticLambda1(29, image, inlineMessage), gapComposer);
                gapComposer.end(false);
            }
            int i4 = 6;
            if (translatedOrNull == null) {
                gapComposer.startReplaceGroup(1968588324);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1968588325);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(565418457, new TabContentViewKt$$ExternalSyntheticLambda11(function1, translatedOrNull, i4), gapComposer);
                gapComposer.end(false);
            }
            ModalKt.InlineMessage(companion, translatedOrEmpty2, translatedOrEmpty3, Expect_jvmKt.rememberComposableLambda(-518858099, new TabContentViewKt$$ExternalSyntheticLambda11(function1, translatedOrEmpty, 7), gapComposer), composableLambdaImpl, rememberComposableLambda, gapComposer, ((i2 >> 6) & 14) | 3072, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(inlineMessage, function1, i);
        }
    }

    public static final void RenderListOrdered(final ListOrdered listOrdered, final Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-340809487);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(listOrdered) ? 4 : 2) | i;
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
            ListOrdered.Variant variant = listOrdered.variant;
            int i6 = variant == null ? -1 : WhenMappings.$EnumSwitchMapping$0[variant.ordinal()];
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (i6 != -1) {
                if (i6 == 1) {
                    gapComposer.startReplaceGroup(247461688);
                    boolean changedInstance = gapComposer.changedInstance(listOrdered) | ((i2 & 112) == 32);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new Function1() { // from class: com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i7 = i5;
                                final Function1 function12 = function1;
                                ListOrdered listOrdered2 = listOrdered;
                                final int i8 = 1;
                                switch (i7) {
                                    case 0:
                                        ListOrderedSubtleItemsScope listOrderedSubtleItemsScope = (ListOrderedSubtleItemsScope) obj;
                                        listOrderedSubtleItemsScope.getClass();
                                        for (final ListOrdered.ListItem listItem : listOrdered2.items) {
                                            final int i9 = 0;
                                            listOrderedSubtleItemsScope.item(new ComposableLambdaImpl(new Function2() { // from class: com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt$$ExternalSyntheticLambda42
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj2, Object obj3) {
                                                    int i10 = i9;
                                                    NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                                                    Function1 function13 = function12;
                                                    ListOrdered.ListItem listItem2 = listItem;
                                                    switch (i10) {
                                                        case 0:
                                                            Composer composer2 = (Composer) obj2;
                                                            int intValue = ((Integer) obj3).intValue();
                                                            GapComposer gapComposer2 = (GapComposer) composer2;
                                                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                                                String translatedOrEmpty = ArcadeComponentProtoBindingKt.translatedOrEmpty(listItem2.label);
                                                                boolean changed = gapComposer2.changed(function13);
                                                                Object rememberedValue2 = gapComposer2.rememberedValue();
                                                                if (changed || rememberedValue2 == neverEqualPolicy2) {
                                                                    rememberedValue2 = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function13, false, 6);
                                                                    gapComposer2.updateRememberedValue(rememberedValue2);
                                                                }
                                                                LazyDslKt.m304MarkdownTextpCuZGqc(translatedOrEmpty, (Function2) rememberedValue2, null, null, 0L, null, null, null, 0, 0, 0, gapComposer2, 0, 2044);
                                                            } else {
                                                                gapComposer2.skipToGroupEnd();
                                                            }
                                                            break;
                                                        default:
                                                            Composer composer3 = (Composer) obj2;
                                                            int intValue2 = ((Integer) obj3).intValue();
                                                            GapComposer gapComposer3 = (GapComposer) composer3;
                                                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                                                String translatedOrEmpty2 = ArcadeComponentProtoBindingKt.translatedOrEmpty(listItem2.label);
                                                                boolean changed2 = gapComposer3.changed(function13);
                                                                Object rememberedValue3 = gapComposer3.rememberedValue();
                                                                if (changed2 || rememberedValue3 == neverEqualPolicy2) {
                                                                    rememberedValue3 = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function13, false, 7);
                                                                    gapComposer3.updateRememberedValue(rememberedValue3);
                                                                }
                                                                LazyDslKt.m304MarkdownTextpCuZGqc(translatedOrEmpty2, (Function2) rememberedValue3, null, null, 0L, null, null, null, 0, 0, 0, gapComposer3, 0, 2044);
                                                            } else {
                                                                gapComposer3.skipToGroupEnd();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, true, 211186439));
                                        }
                                        break;
                                    default:
                                        ListOrderedStandardItemsScope listOrderedStandardItemsScope = (ListOrderedStandardItemsScope) obj;
                                        listOrderedStandardItemsScope.getClass();
                                        for (final ListOrdered.ListItem listItem2 : listOrdered2.items) {
                                            ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(new Function2() { // from class: com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt$$ExternalSyntheticLambda42
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj2, Object obj3) {
                                                    int i10 = i8;
                                                    NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                                                    Function1 function13 = function12;
                                                    ListOrdered.ListItem listItem22 = listItem2;
                                                    switch (i10) {
                                                        case 0:
                                                            Composer composer2 = (Composer) obj2;
                                                            int intValue = ((Integer) obj3).intValue();
                                                            GapComposer gapComposer2 = (GapComposer) composer2;
                                                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                                                String translatedOrEmpty = ArcadeComponentProtoBindingKt.translatedOrEmpty(listItem22.label);
                                                                boolean changed = gapComposer2.changed(function13);
                                                                Object rememberedValue2 = gapComposer2.rememberedValue();
                                                                if (changed || rememberedValue2 == neverEqualPolicy2) {
                                                                    rememberedValue2 = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function13, false, 6);
                                                                    gapComposer2.updateRememberedValue(rememberedValue2);
                                                                }
                                                                LazyDslKt.m304MarkdownTextpCuZGqc(translatedOrEmpty, (Function2) rememberedValue2, null, null, 0L, null, null, null, 0, 0, 0, gapComposer2, 0, 2044);
                                                            } else {
                                                                gapComposer2.skipToGroupEnd();
                                                            }
                                                            break;
                                                        default:
                                                            Composer composer3 = (Composer) obj2;
                                                            int intValue2 = ((Integer) obj3).intValue();
                                                            GapComposer gapComposer3 = (GapComposer) composer3;
                                                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                                                String translatedOrEmpty2 = ArcadeComponentProtoBindingKt.translatedOrEmpty(listItem22.label);
                                                                boolean changed2 = gapComposer3.changed(function13);
                                                                Object rememberedValue3 = gapComposer3.rememberedValue();
                                                                if (changed2 || rememberedValue3 == neverEqualPolicy2) {
                                                                    rememberedValue3 = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function13, false, 7);
                                                                    gapComposer3.updateRememberedValue(rememberedValue3);
                                                                }
                                                                LazyDslKt.m304MarkdownTextpCuZGqc(translatedOrEmpty2, (Function2) rememberedValue3, null, null, 0L, null, null, null, 0, 0, 0, gapComposer3, 0, 2044);
                                                            } else {
                                                                gapComposer3.skipToGroupEnd();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, true, 1075630512);
                                            String translatedOrNull = ArcadeComponentProtoBindingKt.translatedOrNull(listItem2.body);
                                            listOrderedStandardItemsScope.item(composableLambdaImpl, translatedOrNull != null ? new ComposableLambdaImpl(new ToastKt$$ExternalSyntheticLambda1(translatedOrNull, 21), true, 2079358694) : null);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    ListOrderedKt.ListOrderedSubtle((i2 >> 6) & 14, 0, gapComposer, companion, (Function1) rememberedValue);
                    gapComposer.end(false);
                } else if (i6 != 2) {
                    gapComposer.startReplaceGroup(-1100369884);
                    gapComposer.end(false);
                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m((Object) listOrdered.variant, "ListOrdered variant ");
                    return;
                }
            }
            gapComposer.startReplaceGroup(247826930);
            boolean changedInstance2 = gapComposer.changedInstance(listOrdered) | ((i2 & 112) == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new Function1() { // from class: com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i7 = i4;
                        final Function1 function12 = function1;
                        ListOrdered listOrdered2 = listOrdered;
                        final int i8 = 1;
                        switch (i7) {
                            case 0:
                                ListOrderedSubtleItemsScope listOrderedSubtleItemsScope = (ListOrderedSubtleItemsScope) obj;
                                listOrderedSubtleItemsScope.getClass();
                                for (final ListOrdered.ListItem listItem : listOrdered2.items) {
                                    final int i9 = 0;
                                    listOrderedSubtleItemsScope.item(new ComposableLambdaImpl(new Function2() { // from class: com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt$$ExternalSyntheticLambda42
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj2, Object obj3) {
                                            int i10 = i9;
                                            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                                            Function1 function13 = function12;
                                            ListOrdered.ListItem listItem22 = listItem;
                                            switch (i10) {
                                                case 0:
                                                    Composer composer2 = (Composer) obj2;
                                                    int intValue = ((Integer) obj3).intValue();
                                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                                    if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                                        String translatedOrEmpty = ArcadeComponentProtoBindingKt.translatedOrEmpty(listItem22.label);
                                                        boolean changed = gapComposer2.changed(function13);
                                                        Object rememberedValue22 = gapComposer2.rememberedValue();
                                                        if (changed || rememberedValue22 == neverEqualPolicy2) {
                                                            rememberedValue22 = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function13, false, 6);
                                                            gapComposer2.updateRememberedValue(rememberedValue22);
                                                        }
                                                        LazyDslKt.m304MarkdownTextpCuZGqc(translatedOrEmpty, (Function2) rememberedValue22, null, null, 0L, null, null, null, 0, 0, 0, gapComposer2, 0, 2044);
                                                    } else {
                                                        gapComposer2.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer3 = (Composer) obj2;
                                                    int intValue2 = ((Integer) obj3).intValue();
                                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                                    if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                                        String translatedOrEmpty2 = ArcadeComponentProtoBindingKt.translatedOrEmpty(listItem22.label);
                                                        boolean changed2 = gapComposer3.changed(function13);
                                                        Object rememberedValue3 = gapComposer3.rememberedValue();
                                                        if (changed2 || rememberedValue3 == neverEqualPolicy2) {
                                                            rememberedValue3 = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function13, false, 7);
                                                            gapComposer3.updateRememberedValue(rememberedValue3);
                                                        }
                                                        LazyDslKt.m304MarkdownTextpCuZGqc(translatedOrEmpty2, (Function2) rememberedValue3, null, null, 0L, null, null, null, 0, 0, 0, gapComposer3, 0, 2044);
                                                    } else {
                                                        gapComposer3.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, true, 211186439));
                                }
                                break;
                            default:
                                ListOrderedStandardItemsScope listOrderedStandardItemsScope = (ListOrderedStandardItemsScope) obj;
                                listOrderedStandardItemsScope.getClass();
                                for (final ListOrdered.ListItem listItem2 : listOrdered2.items) {
                                    ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(new Function2() { // from class: com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt$$ExternalSyntheticLambda42
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj2, Object obj3) {
                                            int i10 = i8;
                                            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                                            Function1 function13 = function12;
                                            ListOrdered.ListItem listItem22 = listItem2;
                                            switch (i10) {
                                                case 0:
                                                    Composer composer2 = (Composer) obj2;
                                                    int intValue = ((Integer) obj3).intValue();
                                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                                    if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                                        String translatedOrEmpty = ArcadeComponentProtoBindingKt.translatedOrEmpty(listItem22.label);
                                                        boolean changed = gapComposer2.changed(function13);
                                                        Object rememberedValue22 = gapComposer2.rememberedValue();
                                                        if (changed || rememberedValue22 == neverEqualPolicy2) {
                                                            rememberedValue22 = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function13, false, 6);
                                                            gapComposer2.updateRememberedValue(rememberedValue22);
                                                        }
                                                        LazyDslKt.m304MarkdownTextpCuZGqc(translatedOrEmpty, (Function2) rememberedValue22, null, null, 0L, null, null, null, 0, 0, 0, gapComposer2, 0, 2044);
                                                    } else {
                                                        gapComposer2.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer3 = (Composer) obj2;
                                                    int intValue2 = ((Integer) obj3).intValue();
                                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                                    if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                                        String translatedOrEmpty2 = ArcadeComponentProtoBindingKt.translatedOrEmpty(listItem22.label);
                                                        boolean changed2 = gapComposer3.changed(function13);
                                                        Object rememberedValue3 = gapComposer3.rememberedValue();
                                                        if (changed2 || rememberedValue3 == neverEqualPolicy2) {
                                                            rememberedValue3 = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function13, false, 7);
                                                            gapComposer3.updateRememberedValue(rememberedValue3);
                                                        }
                                                        LazyDslKt.m304MarkdownTextpCuZGqc(translatedOrEmpty2, (Function2) rememberedValue3, null, null, 0L, null, null, null, 0, 0, 0, gapComposer3, 0, 2044);
                                                    } else {
                                                        gapComposer3.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, true, 1075630512);
                                    String translatedOrNull = ArcadeComponentProtoBindingKt.translatedOrNull(listItem2.body);
                                    listOrderedStandardItemsScope.item(composableLambdaImpl, translatedOrNull != null ? new ComposableLambdaImpl(new ToastKt$$ExternalSyntheticLambda1(translatedOrNull, 21), true, 2079358694) : null);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ListOrderedKt.ListOrderedStandard((i2 >> 6) & 14, 0, gapComposer, companion, (Function1) rememberedValue2);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BenefitsLeafletViewKt$$ExternalSyntheticLambda20(listOrdered, function1, i, 1);
        }
    }

    public static final void RenderListUnordered(ListUnordered listUnordered, Composer composer, int i) {
        int i2;
        ListUnorderedProminence listUnorderedProminence;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(663203890);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(listUnordered) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 |= gapComposer.changed(companion) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ListUnordered.Variant variant = listUnordered.variant;
            int i4 = variant == null ? -1 : WhenMappings.$EnumSwitchMapping$4[variant.ordinal()];
            if (i4 != -1) {
                if (i4 == 1) {
                    listUnorderedProminence = ListUnorderedProminence.Subtle;
                    ListUnorderedKt.ListUnordered(companion, (ListUnorderedState) null, listUnorderedProminence, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(1199850572, new BalanceFeedKt$$ExternalSyntheticLambda9(listUnordered, 29), gapComposer), gapComposer, ((i2 >> 3) & 14) | 196608, 26);
                } else if (i4 != 2) {
                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m$1(variant, "ListUnordered variant ");
                    return;
                }
            }
            listUnorderedProminence = ListUnorderedProminence.Standard;
            ListUnorderedKt.ListUnordered(companion, (ListUnorderedState) null, listUnorderedProminence, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(1199850572, new BalanceFeedKt$$ExternalSyntheticLambda9(listUnordered, 29), gapComposer), gapComposer, ((i2 >> 3) & 14) | 196608, 26);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(listUnordered, i);
        }
    }

    public static final void RenderPageHeader(PageHeader pageHeader, Function1 function1, Composer composer, int i) {
        int i2;
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-966570589);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(pageHeader) ? 4 : 2) | i;
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
            int m3379toTextAlignolWjt3U = m3379toTextAlignolWjt3U(pageHeader.horizontal_alignment, 5);
            UiAvatar uiAvatar = pageHeader.avatar;
            ComposableLambdaImpl composableLambdaImpl = null;
            if (uiAvatar == null) {
                gapComposer.startReplaceGroup(-1643387312);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(-1643387311);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(854972545, new PageHeaderProtoBindingKt$$ExternalSyntheticLambda0(uiAvatar, 1), gapComposer);
                gapComposer.end(false);
            }
            String translatedOrNull = translatedOrNull(pageHeader.body);
            if (translatedOrNull == null) {
                gapComposer.startReplaceGroup(-1643121270);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1643121269);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(571092197, new EarningsHomeKt$$ExternalSyntheticLambda15(translatedOrNull, function1, m3379toTextAlignolWjt3U, 1), gapComposer);
                gapComposer.end(false);
            }
            Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(2074347180, new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(pageHeader, m3379toTextAlignolWjt3U, 6), gapComposer), companion, rememberComposableLambda, composableLambdaImpl, gapComposer, ((i2 >> 3) & 112) | 6, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(pageHeader, function1, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderRemoteImage(final RemoteImage remoteImage, Composer composer, final int i) {
        int i2;
        String m;
        BiasAlignment biasAlignment;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1394340944);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(remoteImage) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 |= gapComposer.changed(companion) ? 32 : 16;
        }
        final int i4 = 1;
        final int i5 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Image image = remoteImage.image;
            Integer num = remoteImage.height;
            if (image == null) {
                gapComposer.startReplaceGroup(2112733732);
                gapComposer.end(false);
                m = null;
            } else {
                m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, 68152701, image, gapComposer, false);
            }
            if (m == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i5;
                            int i7 = i;
                            RemoteImage remoteImage2 = remoteImage;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    ArcadeComponentProtoBindingKt.RenderRemoteImage(remoteImage2, composer2, Updater.updateChangedFlags(i7 | 1));
                                    break;
                                default:
                                    ArcadeComponentProtoBindingKt.RenderRemoteImage(remoteImage2, composer2, Updater.updateChangedFlags(i7 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            Modifier wrapContentSize$default = (remoteImage.width == null || num == null) ? SizeKt.wrapContentSize$default(companion, null, 3) : SizeKt.m287sizeVpY3zN4(companion, r5.intValue(), num.intValue());
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            HorizontalAlignment horizontalAlignment = remoteImage.horizontal_alignment;
            int i6 = horizontalAlignment == null ? -1 : WhenMappings.$EnumSwitchMapping$5[horizontalAlignment.ordinal()];
            if (i6 != -1) {
                if (i6 == 1) {
                    biasAlignment = Alignment.Companion.CenterStart;
                } else if (i6 == 2) {
                    biasAlignment = Alignment.Companion.CenterEnd;
                } else if (i6 != 3) {
                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m$1(horizontalAlignment, "Horizontal alignment ");
                    return;
                }
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier != null) {
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
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.LocalContext;
                ImageRequest.Builder builder = new ImageRequest.Builder((Context) gapComposer.consume(staticProvidableCompositionLocal));
                builder.data = m;
                AsyncImageKt.m1441AsyncImagesKDTAoQ(builder.build(), remoteImage.accessibility_label, new ImageLoader$Builder((Context) gapComposer.consume(staticProvidableCompositionLocal)).build(), wrapContentSize$default, null, ContentScale.Companion.FillWidth, null, gapComposer, 12582912, 0, 3952);
                gapComposer.end(true);
            }
            biasAlignment = Alignment.Companion.Center;
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier != null) {
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new Function2() { // from class: com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i4;
                    int i7 = i;
                    RemoteImage remoteImage2 = remoteImage;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            ArcadeComponentProtoBindingKt.RenderRemoteImage(remoteImage2, composer2, Updater.updateChangedFlags(i7 | 1));
                            break;
                        default:
                            ArcadeComponentProtoBindingKt.RenderRemoteImage(remoteImage2, composer2, Updater.updateChangedFlags(i7 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void RenderSectionHeader(SectionHeader sectionHeader, Function1 function1, Composer composer, int i) {
        int i2;
        Function0 function0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(413416119);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(sectionHeader) ? 4 : 2) | i;
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
            String translatedOrEmpty = translatedOrEmpty(sectionHeader.title_text);
            String translatedOrNull = translatedOrNull(sectionHeader.show_more_text);
            if (sectionHeader.show_more_text != null) {
                gapComposer.startReplaceGroup(-1886260782);
                boolean z = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda1(18, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function0 = (Function0) rememberedValue;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1886199371);
                gapComposer.end(false);
                function0 = null;
            }
            ViewfinderDefaults.SectionHeader(translatedOrEmpty, companion, translatedOrNull, function0, (String) null, gapComposer, (i2 >> 3) & 112, 16);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(sectionHeader, function1, i);
        }
    }

    public static final void RenderWithinSection(WithinSection withinSection, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1198634771);
        int i2 = (gapComposer.changedInstance(withinSection) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            WithinSection.Variant variant = withinSection.variant;
            int i3 = variant == null ? -1 : WhenMappings.$EnumSwitchMapping$2[variant.ordinal()];
            if (i3 == 1) {
                gapComposer.startReplaceGroup(-836775833);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else if (i3 != 2) {
                gapComposer.startReplaceGroup(-836772350);
                gapComposer.end(false);
                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m((Object) withinSection.variant, "WithinSection variant ");
                return;
            } else {
                gapComposer.startReplaceGroup(-836773688);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BenefitsLeafletViewKt$$ExternalSyntheticLambda23(withinSection, i, 1);
        }
    }

    public static final Icons toArcadeIcon(Icon icon) {
        String str;
        if (icon == null || (str = icon.arcade_id) == null) {
            return null;
        }
        Icons.Companion.getClass();
        return zzd.get(str);
    }

    /* renamed from: toTextAlign-olWjt3U, reason: not valid java name */
    public static final int m3379toTextAlignolWjt3U(HorizontalAlignment horizontalAlignment, int i) {
        int i2 = horizontalAlignment == null ? -1 : WhenMappings.$EnumSwitchMapping$5[horizontalAlignment.ordinal()];
        if (i2 == -1) {
            return i;
        }
        if (i2 == 1) {
            return 5;
        }
        if (i2 == 2) {
            return 6;
        }
        if (i2 == 3) {
            return 3;
        }
        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m$1(horizontalAlignment, "Horizontal alignment ");
        return 0;
    }

    public static final String translatedOrEmpty(LocalizedString localizedString) {
        String str = localizedString != null ? localizedString.translated_value : null;
        return str == null ? "" : str;
    }

    public static final String translatedOrNull(LocalizedString localizedString) {
        String str;
        if (localizedString == null || (str = localizedString.translated_value) == null || StringsKt.isBlank(str)) {
            return null;
        }
        return str;
    }
}
