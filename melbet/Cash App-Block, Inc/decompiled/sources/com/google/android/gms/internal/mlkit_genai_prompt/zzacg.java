package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceState;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.SizeKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.ModalKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.components.header.HeroNumericsHeaderKt$$ExternalSyntheticLambda5;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabToolbarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.viewmodels.MoneybotAutomationsViewModel$Empty;
import com.squareup.cash.moneybot.views.automations.MoneybotAutomationsViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlaysKt$$ExternalSyntheticLambda1;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class zzacg {
    public static final void AutomationsSectionUI(MoneybotAutomationsViewModel$Empty moneybotAutomationsViewModel$Empty, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1835781502);
        int i2 = (i & 6) == 0 ? (gapComposer.changedInstance(moneybotAutomationsViewModel$Empty) ? 4 : 2) | i : i;
        int i3 = 32;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2;
        int i5 = 1;
        boolean z = false;
        if (!gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (!(moneybotAutomationsViewModel$Empty instanceof MoneybotAutomationsViewModel$Empty)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1045539789, false);
            }
            gapComposer.startReplaceGroup(-1947895477);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 32.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            gapComposer.startReplaceGroup(2133332286);
            for (String str : moneybotAutomationsViewModel$Empty.suggestions) {
                boolean changed = ((i4 & 112) == i3 ? true : z) | gapComposer.changed(str);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str, 14);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier.Companion companion2 = companion;
                SizeKt.Button((Function0) rememberedValue, SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, 7), null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1142886884, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str, 9), gapComposer), gapComposer, 1572912, 60);
                z = z;
                companion = companion2;
                i3 = 32;
            }
            boolean z2 = z;
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, z2, true, z2);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneybotAutomationsViewKt$$ExternalSyntheticLambda1(moneybotAutomationsViewModel$Empty, function1, i, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b0  */
    /* renamed from: HeroNumericsHeader-tv5qRRQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2009HeroNumericsHeadertv5qRRQ(ComposableLambdaImpl composableLambdaImpl, Modifier modifier, int i, Function2 function2, Function3 function3, Function3 function32, Function2 function22, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        Function2 function23;
        int i7;
        Function3 function33;
        int i8;
        Function3 function34;
        int i9;
        Modifier modifier3;
        int i10;
        Function2 function24;
        RecomposeScopeImpl endRestartGroup;
        Function2 function25;
        Modifier modifier4;
        int i11;
        int i12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1742649405);
        if ((i2 & 6) == 0) {
            i4 = (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer.changed(modifier2) ? 32 : 16;
            if ((i2 & MLKEMEngine.KyberPolyBytes) != 0) {
                if ((i3 & 4) == 0) {
                    i5 = i;
                    if (gapComposer.changed(i5)) {
                        i12 = 256;
                        i4 |= i12;
                    }
                } else {
                    i5 = i;
                }
                i12 = 128;
                i4 |= i12;
            } else {
                i5 = i;
            }
            i6 = i3 & 8;
            if (i6 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                function23 = function2;
                i4 |= gapComposer.changedInstance(function23) ? 2048 : 1024;
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    function33 = function3;
                    i4 |= gapComposer.changedInstance(function33) ? 16384 : PKIFailureInfo.certRevoked;
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= 196608;
                    } else if ((196608 & i2) == 0) {
                        function34 = function32;
                        i4 |= gapComposer.changedInstance(function34) ? PKIFailureInfo.unsupportedVersion : 65536;
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i4 |= gapComposer.changedInstance(function22) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                        }
                        if (gapComposer.shouldExecute(i4 & 1, (i4 & 599187) != 599186)) {
                            gapComposer.startDefaults();
                            int i14 = i2 & 1;
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            if (i14 == 0 || gapComposer.getDefaultsInvalid()) {
                                if (i13 != 0) {
                                    modifier2 = companion;
                                }
                                if ((i3 & 4) != 0) {
                                    i5 = 5;
                                }
                                if (i6 != 0) {
                                    function23 = null;
                                }
                                if (i7 != 0) {
                                    function33 = null;
                                }
                                if (i8 != 0) {
                                    function34 = null;
                                }
                                if (i9 != 0) {
                                    function25 = null;
                                    gapComposer.endDefaults();
                                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifier2, 1.0f), ((Dp) gapComposer.consume(ArcadeThemeKt.LocalScreenMargin)).value, RecyclerView.DECELERATION_RATE, 2);
                                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, (i5 == 6 || i5 == 2) ? Alignment.Companion.End : i5 != 3 ? Alignment.Companion.CenterHorizontally : Alignment.Companion.Start, gapComposer, 0);
                                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
                                    if (function23 != null) {
                                        gapComposer.startReplaceGroup(1344235593);
                                        i11 = i5;
                                        modifier4 = modifier2;
                                        Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).sectionTitle, 0L, 0L, null, null, 0L, null, 0L, null, null, null, i11, 0L, null, null, 0, 16744447)), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, ArcadeThemeKt.LocalTextColor), Recorder$$ExternalSyntheticOutline2.m(Strings.getColors(gapComposer).semantic.icon.standard, ArcadeThemeKt.LocalIconColor)}, Expect_jvmKt.rememberComposableLambda(-1544559348, new ToastKt$$ExternalSyntheticLambda11(11, function23), gapComposer), gapComposer, 56);
                                        Strings.getSizes(gapComposer).getClass();
                                        DefaultSizes.spacing.getClass();
                                        SpacerKt.Spacer(gapComposer, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion, 8.0f));
                                        gapComposer.end(false);
                                    } else {
                                        modifier4 = modifier2;
                                        i11 = i5;
                                        gapComposer.startReplaceGroup(1344621915);
                                        gapComposer.end(false);
                                    }
                                    if (function33 != null) {
                                        gapComposer.startReplaceGroup(1344664788);
                                        Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).sectionTitle, 0L, 0L, null, null, 0L, null, 0L, null, null, null, i11, 0L, null, null, 0, 16744447)), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, ArcadeThemeKt.LocalTextColor), Recorder$$ExternalSyntheticOutline2.m(Strings.getColors(gapComposer).semantic.icon.standard, ArcadeThemeKt.LocalIconColor)}, Expect_jvmKt.rememberComposableLambda(-1097689803, new ModalKt$$ExternalSyntheticLambda3(function33, 3), gapComposer), gapComposer, 56);
                                        Strings.getSizes(gapComposer).getClass();
                                        DefaultSizes.spacing.getClass();
                                        SpacerKt.Spacer(gapComposer, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion, 8.0f));
                                        gapComposer.end(false);
                                    } else {
                                        gapComposer.startReplaceGroup(1345102043);
                                        gapComposer.end(false);
                                    }
                                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
                                    ProvidedValue defaultProvidedValue$runtime = dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).numeralLarge, 0L, 0L, null, null, 0L, null, 0L, null, null, null, i11, 0L, null, null, 0, 16744447));
                                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
                                    Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal)}, Expect_jvmKt.rememberComposableLambda(-1425324473, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl, 4), gapComposer), gapComposer, 56);
                                    if (function34 != null) {
                                        gapComposer.startReplaceGroup(1345364923);
                                        Strings.getSizes(gapComposer).getClass();
                                        DefaultSizes.spacing.getClass();
                                        SpacerKt.Spacer(gapComposer, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion, 8.0f));
                                        function34 = function34;
                                        Updater.CompositionLocalProvider(new ProvidedValue[]{dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).labelSmall, 0L, 0L, null, null, 0L, null, 0L, null, null, null, i11, 0L, null, null, 0, 16744447)), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal), Recorder$$ExternalSyntheticOutline2.m(Strings.getColors(gapComposer).semantic.icon.standard, ArcadeThemeKt.LocalIconColor)}, Expect_jvmKt.rememberComposableLambda(-1440573612, new ModalKt$$ExternalSyntheticLambda3(function34, 4), gapComposer), gapComposer, 56);
                                        gapComposer.end(false);
                                    } else {
                                        gapComposer.startReplaceGroup(1345795451);
                                        gapComposer.end(false);
                                    }
                                    if (function25 != null) {
                                        re$$ExternalSyntheticOutline0.m(gapComposer, 1345840804, companion, 4.0f, gapComposer);
                                        Updater.CompositionLocalProvider(new ProvidedValue[]{dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).labelSmall, 0L, 0L, null, null, 0L, null, 0L, null, null, null, i11, 0L, null, null, 0, 16744447)), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal), Recorder$$ExternalSyntheticOutline2.m(Strings.getColors(gapComposer).semantic.icon.standard, ArcadeThemeKt.LocalIconColor)}, Expect_jvmKt.rememberComposableLambda(-1783457421, new ToastKt$$ExternalSyntheticLambda11(10, function25), gapComposer), gapComposer, 56);
                                        gapComposer.end(false);
                                    } else {
                                        gapComposer.startReplaceGroup(1346201179);
                                        gapComposer.end(false);
                                    }
                                    gapComposer.end(true);
                                    function24 = function25;
                                    modifier3 = modifier4;
                                    i10 = i11;
                                }
                            } else {
                                gapComposer.skipToGroupEnd();
                            }
                            function25 = function22;
                            gapComposer.endDefaults();
                            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifier2, 1.0f), ((Dp) gapComposer.consume(ArcadeThemeKt.LocalScreenMargin)).value, RecyclerView.DECELERATION_RATE, 2);
                            if (i5 == 6) {
                                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, (i5 == 6 || i5 == 2) ? Alignment.Companion.End : i5 != 3 ? Alignment.Companion.CenterHorizontally : Alignment.Companion.Start, gapComposer, 0);
                                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default2);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                if (gapComposer.applier == null) {
                                }
                            }
                            ColumnMeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, (i5 == 6 || i5 == 2) ? Alignment.Companion.End : i5 != 3 ? Alignment.Companion.CenterHorizontally : Alignment.Companion.Start, gapComposer, 0);
                            int hashCode22 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope22 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier22 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default2);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$122 = ComposeUiNode.Companion.Constructor;
                            if (gapComposer.applier == null) {
                            }
                        } else {
                            gapComposer.skipToGroupEnd();
                            modifier3 = modifier2;
                            i10 = i5;
                            function24 = function22;
                        }
                        Function2 function26 = function23;
                        Function3 function35 = function33;
                        Function3 function36 = function34;
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new HeroNumericsHeaderKt$$ExternalSyntheticLambda5(composableLambdaImpl, modifier3, i10, function26, function35, function36, function24, i2, i3, 1);
                            return;
                        }
                        return;
                    }
                    function34 = function32;
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    if (gapComposer.shouldExecute(i4 & 1, (i4 & 599187) != 599186)) {
                    }
                    Function2 function262 = function23;
                    Function3 function352 = function33;
                    Function3 function362 = function34;
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function33 = function3;
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                function34 = function32;
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                if (gapComposer.shouldExecute(i4 & 1, (i4 & 599187) != 599186)) {
                }
                Function2 function2622 = function23;
                Function3 function3522 = function33;
                Function3 function3622 = function34;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function23 = function2;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            function33 = function3;
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            function34 = function32;
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            if (gapComposer.shouldExecute(i4 & 1, (i4 & 599187) != 599186)) {
            }
            Function2 function26222 = function23;
            Function3 function35222 = function33;
            Function3 function36222 = function34;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & MLKEMEngine.KyberPolyBytes) != 0) {
        }
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        function23 = function2;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        function33 = function3;
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        function34 = function32;
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 599187) != 599186)) {
        }
        Function2 function262222 = function23;
        Function3 function352222 = function33;
        Function3 function362222 = function34;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void MoneybotAutomationsView(MoneybotAutomationsViewModel$Empty moneybotAutomationsViewModel$Empty, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        int i3;
        moneybotAutomationsViewModel$Empty.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2065669793);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(moneybotAutomationsViewModel$Empty) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
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
            TabToolbarInternalViewModel tabToolbarInternalViewModel = moneybotAutomationsViewModel$Empty.tabToolbarViewModel;
            boolean z = (i4 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(15, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TabToolbarsKt.TabToolbar(null, tabToolbarInternalViewModel, null, false, null, null, null, (Function1) rememberedValue, null, null, null, null, false, gapComposer, 0, 0, 8061);
            gapComposer = gapComposer;
            SpacerKt.Spacer(gapComposer, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion, 21.0f));
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m298padding3ABfNKs(companion, 16.0f), Strings.getTypography(gapComposer).pageTitle, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.moneybot_automations_title), (Map) null, (Function1) null, false);
            if (!(moneybotAutomationsViewModel$Empty instanceof MoneybotAutomationsViewModel$Empty)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 304549462, false);
            }
            String m = re$$ExternalSyntheticOutline0.m(gapComposer, 304555623, R.string.moneybot_automations_empty_subtitle, gapComposer, false);
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, m, (Map) null, (Function1) null, false);
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 32.0f, gapComposer);
            function12 = function1;
            AutomationsSectionUI(moneybotAutomationsViewModel$Empty, function12, gapComposer, i4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(true);
            i3 = 0;
        } else {
            function12 = function1;
            i3 = 0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneybotAutomationsViewKt$$ExternalSyntheticLambda1(moneybotAutomationsViewModel$Empty, function12, i, i3);
        }
    }

    /* renamed from: ViewfinderEmbeddedExternalSurface-sv6N_fY, reason: not valid java name */
    public static final void m2011ViewfinderEmbeddedExternalSurfacesv6N_fY(Modifier modifier, boolean z, float[] fArr, Function1 function1, Composer composer, int i) {
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1813075079);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 = i2 | EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE;
        }
        if ((i & 3072) == 0) {
            i4 |= gapComposer.changedInstance(fArr != null ? new Matrix(fArr) : null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i4 & 9363) == 9362 && gapComposer.getSkipping()) {
            gapComposer.skipToGroupEnd();
            z4 = z;
        } else {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                i3 = i4 & (-897);
                z2 = true;
            } else {
                gapComposer.skipToGroupEnd();
                i3 = i4 & (-897);
                z2 = z;
            }
            gapComposer.endDefaults();
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer));
                gapComposer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).coroutineScope;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ViewfinderEmbeddedExternalSurfaceState(coroutineScope);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ViewfinderEmbeddedExternalSurfaceState viewfinderEmbeddedExternalSurfaceState = (ViewfinderEmbeddedExternalSurfaceState) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            int i5 = 12;
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new BorderKt$$ExternalSyntheticLambda1(12);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Function1 function12 = (Function1) rememberedValue3;
            boolean changedInstance = gapComposer.changedInstance(viewfinderEmbeddedExternalSurfaceState);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new ObjectList$$ExternalSyntheticLambda0(viewfinderEmbeddedExternalSurfaceState, i5);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Function1 function13 = (Function1) rememberedValue4;
            boolean changedInstance2 = gapComposer.changedInstance(fArr != null ? new Matrix(fArr) : null) | ((57344 & i3) == 16384) | gapComposer.changed(0L) | gapComposer.changedInstance(viewfinderEmbeddedExternalSurfaceState) | ((i3 & 112) == 32);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                z3 = z2;
                UserJavascriptInterfaceBase$$ExternalSyntheticLambda25 userJavascriptInterfaceBase$$ExternalSyntheticLambda25 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(viewfinderEmbeddedExternalSurfaceState, function1, z3, fArr, 2);
                gapComposer.updateRememberedValue(userJavascriptInterfaceBase$$ExternalSyntheticLambda25);
                rememberedValue5 = userJavascriptInterfaceBase$$ExternalSyntheticLambda25;
            } else {
                z3 = z2;
            }
            AndroidView_androidKt.AndroidView(function12, modifier, function13, null, (Function1) rememberedValue5, gapComposer, ((i3 << 3) & 112) | 6, 8);
            z4 = z3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(modifier, z4, fArr, function1, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0062  */
    /* renamed from: HeroNumericsHeader-tv5qRRQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2010HeroNumericsHeadertv5qRRQ(String str, Modifier modifier, int i, String str2, String str3, String str4, String str5, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        String str6;
        int i7;
        String str7;
        int i8;
        String str8;
        GapComposer gapComposer;
        Modifier modifier3;
        int i9;
        String str9;
        String str10;
        String str11;
        RecomposeScopeImpl endRestartGroup;
        int i10;
        String str12;
        int i11;
        Modifier modifier4;
        String str13;
        ComposableLambdaImpl rememberComposableLambda;
        ComposableLambdaImpl rememberComposableLambda2;
        ComposableLambdaImpl rememberComposableLambda3;
        ComposableLambdaImpl composableLambdaImpl;
        int i12;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1064710597);
        if ((i2 & 6) == 0) {
            i4 = (gapComposer2.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer2.changed(modifier2) ? 32 : 16;
            if ((i2 & MLKEMEngine.KyberPolyBytes) != 0) {
                if ((i3 & 4) == 0) {
                    i5 = i;
                    if (gapComposer2.changed(i5)) {
                        i12 = 256;
                        i4 |= i12;
                    }
                } else {
                    i5 = i;
                }
                i12 = 128;
                i4 |= i12;
            } else {
                i5 = i;
            }
            i6 = i3 & 8;
            if (i6 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                str6 = str2;
                i4 |= gapComposer2.changed(str6) ? 2048 : 1024;
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    str7 = str3;
                    i4 |= gapComposer2.changed(str7) ? 16384 : PKIFailureInfo.certRevoked;
                    if ((196608 & i2) == 0) {
                        i4 |= gapComposer2.changed(str4) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((1572864 & i2) == 0) {
                        str8 = str5;
                        i4 |= gapComposer2.changed(str8) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 599187) != 599186)) {
                            gapComposer2.startDefaults();
                            if ((i2 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                                if (i13 != 0) {
                                    modifier2 = Modifier.Companion.$$INSTANCE;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    i5 = 5;
                                }
                                if (i6 != 0) {
                                    str6 = null;
                                }
                                if (i7 != 0) {
                                    str7 = null;
                                }
                                if (i8 != 0) {
                                    int i14 = i5;
                                    i10 = i4;
                                    str12 = str6;
                                    i11 = i14;
                                    modifier4 = modifier2;
                                    str13 = str7;
                                    str11 = null;
                                    gapComposer2.endDefaults();
                                    ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(-1690598507, new TransfersViewKt$$ExternalSyntheticLambda5(str, 2), gapComposer2);
                                    if (str12 != null) {
                                        gapComposer2.startReplaceGroup(-459534485);
                                        gapComposer2.end(false);
                                        rememberComposableLambda = null;
                                    } else {
                                        gapComposer2.startReplaceGroup(-459534484);
                                        rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-2006103987, new TransfersViewKt$$ExternalSyntheticLambda5(str12, 3), gapComposer2);
                                        gapComposer2.end(false);
                                    }
                                    if (str13 != null) {
                                        gapComposer2.startReplaceGroup(-459478933);
                                        gapComposer2.end(false);
                                        rememberComposableLambda2 = null;
                                    } else {
                                        gapComposer2.startReplaceGroup(-459478932);
                                        rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-414270507, new LocalHomeViewKt$$ExternalSyntheticLambda1(str13, 29), gapComposer2);
                                        gapComposer2.end(false);
                                    }
                                    if (str4 != null) {
                                        gapComposer2.startReplaceGroup(-459433456);
                                        gapComposer2.end(false);
                                        rememberComposableLambda3 = null;
                                    } else {
                                        gapComposer2.startReplaceGroup(-459433455);
                                        rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-1682940586, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str4, 1), gapComposer2);
                                        gapComposer2.end(false);
                                    }
                                    if (str11 != null) {
                                        gapComposer2.startReplaceGroup(-459372417);
                                        gapComposer2.end(false);
                                        composableLambdaImpl = null;
                                    } else {
                                        gapComposer2.startReplaceGroup(-459372416);
                                        ComposableLambdaImpl rememberComposableLambda5 = Expect_jvmKt.rememberComposableLambda(-1517146928, new TransfersViewKt$$ExternalSyntheticLambda5(str11, 4), gapComposer2);
                                        gapComposer2.end(false);
                                        composableLambdaImpl = rememberComposableLambda5;
                                    }
                                    gapComposer = gapComposer2;
                                    m2009HeroNumericsHeadertv5qRRQ(rememberComposableLambda4, modifier4, i11, rememberComposableLambda, rememberComposableLambda2, rememberComposableLambda3, composableLambdaImpl, gapComposer, (i10 & 112) | 6 | (i10 & 896), 0);
                                    str9 = str12;
                                    str10 = str13;
                                    modifier3 = modifier4;
                                    i9 = i11;
                                }
                            } else {
                                gapComposer2.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                            }
                            int i15 = i5;
                            i10 = i4;
                            str12 = str6;
                            i11 = i15;
                            modifier4 = modifier2;
                            str13 = str7;
                            str11 = str8;
                            gapComposer2.endDefaults();
                            ComposableLambdaImpl rememberComposableLambda42 = Expect_jvmKt.rememberComposableLambda(-1690598507, new TransfersViewKt$$ExternalSyntheticLambda5(str, 2), gapComposer2);
                            if (str12 != null) {
                            }
                            if (str13 != null) {
                            }
                            if (str4 != null) {
                            }
                            if (str11 != null) {
                            }
                            gapComposer = gapComposer2;
                            m2009HeroNumericsHeadertv5qRRQ(rememberComposableLambda42, modifier4, i11, rememberComposableLambda, rememberComposableLambda2, rememberComposableLambda3, composableLambdaImpl, gapComposer, (i10 & 112) | 6 | (i10 & 896), 0);
                            str9 = str12;
                            str10 = str13;
                            modifier3 = modifier4;
                            i9 = i11;
                        } else {
                            gapComposer = gapComposer2;
                            gapComposer.skipToGroupEnd();
                            modifier3 = modifier2;
                            i9 = i5;
                            str9 = str6;
                            str10 = str7;
                            str11 = str8;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new HeroNumericsHeaderKt$$ExternalSyntheticLambda5(str, modifier3, i9, str9, str10, str4, str11, i2, i3, 0);
                            return;
                        }
                        return;
                    }
                    str8 = str5;
                    if (gapComposer2.shouldExecute(i4 & 1, (i4 & 599187) != 599186)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                str7 = str3;
                if ((196608 & i2) == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                str8 = str5;
                if (gapComposer2.shouldExecute(i4 & 1, (i4 & 599187) != 599186)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            str6 = str2;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            str7 = str3;
            if ((196608 & i2) == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            str8 = str5;
            if (gapComposer2.shouldExecute(i4 & 1, (i4 & 599187) != 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & MLKEMEngine.KyberPolyBytes) != 0) {
        }
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        str6 = str2;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        str7 = str3;
        if ((196608 & i2) == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        str8 = str5;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 599187) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
