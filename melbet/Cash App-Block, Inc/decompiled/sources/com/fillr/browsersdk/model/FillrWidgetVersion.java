package com.fillr.browsersdk.model;

import android.os.Bundle;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.navigation.NavBackStackEntry;
import androidx.room.Room;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda10;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.auth.api.identity.Identity;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.shopping.views.ShopErrorKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda21;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.work.views.pay.PastPaySectionKt$$ExternalSyntheticLambda1;
import com.squareup.protos.document.VersionData;
import com.squareup.protos.franklin.common.AppVersion;
import com.squareup.protos.franklin.common.Platform;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.cash.Countries;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda5;
import com.stripe.android.core.networking.MarkdownParser$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.exit.ExitModalKt$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupScreenKt$$ExternalSyntheticLambda1;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupState;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Type$Primary;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Type$Secondary;
import com.stripe.android.financialconnections.ui.theme.ColorKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.model.LinkBrand;
import com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes8.dex */
public abstract class FillrWidgetVersion {
    public static String mobileWidgetVersion = "";

    public static final void ExistingEmailSection(String str, Composer composer, int i) {
        String str2 = str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2062236475);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(str2) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MarkdownParser$$ExternalSyntheticLambda0(28);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier clip = ClipKt.clip(SemanticsModifierKt.semantics(fillMaxWidth, false, (Function1) rememberedValue), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f));
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalColors;
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m178borderxT4_qwU(clip, 1.0f, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).borderNeutral, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f)), 16.0f, 12.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m574initimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(companion, 32.0f), ColorKt.LinkGreen200, RoundedCornerShapeKt.CircleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            SVG$Unit$EnumUnboxingLocalUtility.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            String valueOf2 = String.valueOf(Character.toUpperCase(str2.length() > 0 ? str2.charAt(0) : '@'));
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ThemeKt.LocalTypography;
            TextKt.m509Text4IGK_g(valueOf2, null, ColorKt.LinkGreen900, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer.consume(staticProvidableCompositionLocal2)).bodySmall, gapComposer, MLKEMEngine.KyberPolyBytes, 0, 65530);
            gapComposer.end(true);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 12.0f));
            str2 = str;
            TextKt.m509Text4IGK_g(str2, new LayoutWeightElement(1.0f, true), ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).textDefault, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((FinancialConnectionsTypography) gapComposer.consume(staticProvidableCompositionLocal2)).bodySmall, gapComposer, i2 & 14, 3120, 55288);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PastPaySectionKt$$ExternalSyntheticLambda1(str2, i, 12);
        }
    }

    public static final void Footer(boolean z, boolean z2, int i, LinkBrand linkBrand, Function0 function0, Function0 function02, Composer composer, int i2) {
        String stringResource;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(797649743);
        int i3 = i2 | (gapComposer.changed(z) ? 4 : 2) | (gapComposer.changed(z2) ? 32 : 16) | (gapComposer.changed(i) ? 256 : 128) | (gapComposer.changed(linkBrand.ordinal()) ? 2048 : 1024) | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function02) ? PKIFailureInfo.unsupportedVersion : 65536);
        boolean z3 = true;
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            if (z || z2) {
                z3 = false;
            }
            if (linkBrand == LinkBrand.Link) {
                stringResource = re$$ExternalSyntheticOutline0.m(gapComposer, -1270218827, R.string.stripe_networking_link_login_warmup_cta_continue, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1270118573);
                stringResource = Room.stringResource(R.string.stripe_networking_link_login_warmup_cta_continue_with_brand, new Object[]{linkBrand.brandName()}, gapComposer);
                gapComposer.end(false);
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new MarkdownParser$$ExternalSyntheticLambda0(29);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            com.stripe.android.financialconnections.ui.components.TextKt.FinancialConnectionsButton(function0, SizeKt.fillMaxWidth(TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), "existing_email-button"), 1.0f), FinancialConnectionsButton$Type$Primary.INSTANCE, null, z3, z, Expect_jvmKt.rememberComposableLambda(-1875940320, new ShopErrorKt$$ExternalSyntheticLambda0(stringResource, 16), gapComposer), gapComposer, ((i3 >> 12) & 14) | 1573248 | ((i3 << 15) & 458752), 8);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new StripeApiRepository$$ExternalSyntheticLambda5(1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue2), "skip-button"), 1.0f);
            boolean z4 = (i3 & 458752) == 131072;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z4 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new AlertBannerKt$$ExternalSyntheticLambda2(21, function02);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            com.stripe.android.financialconnections.ui.components.TextKt.FinancialConnectionsButton((Function0) rememberedValue3, fillMaxWidth, FinancialConnectionsButton$Type$Secondary.INSTANCE, null, z3, z2, Expect_jvmKt.rememberComposableLambda(-1495571383, new TabToolbarsKt$$ExternalSyntheticLambda21(i, 15), gapComposer), gapComposer, ((i3 << 12) & 458752) | 1573248, 8);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EducationalSheetKt$$ExternalSyntheticLambda10(z, z2, i, linkBrand, function0, function02, i2);
        }
    }

    public static final void HeaderSection(LinkBrand linkBrand, Composer composer, int i) {
        String stringResource;
        String stringResource2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1178642621);
        int i2 = i | (gapComposer.changed(linkBrand.ordinal()) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            LinkBrand linkBrand2 = LinkBrand.Link;
            if (linkBrand == linkBrand2) {
                stringResource = re$$ExternalSyntheticOutline0.m(gapComposer, 1584770227, R.string.stripe_networking_link_login_warmup_title, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(1584858577);
                stringResource = Room.stringResource(R.string.stripe_networking_link_login_warmup_title_with_brand, new Object[]{linkBrand.brandName()}, gapComposer);
                gapComposer.end(false);
            }
            String str = stringResource;
            if (linkBrand == linkBrand2) {
                stringResource2 = re$$ExternalSyntheticOutline0.m(gapComposer, 1585028333, R.string.stripe_networking_link_login_warmup_description, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(1585122635);
                stringResource2 = Room.stringResource(R.string.stripe_networking_link_login_warmup_description_with_brand, new Object[]{linkBrand.brandName()}, gapComposer);
                gapComposer.end(false);
            }
            String str2 = stringResource2;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ListItemKt.ShapedIcon(Countries.painterResource(R.drawable.stripe_ic_person, 0, gapComposer), null, null, null, str, gapComposer, Painter.$stable, 14);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalTypography;
            TextStyle textStyle = ((FinancialConnectionsTypography) gapComposer.consume(staticProvidableCompositionLocal)).headingLarge;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ThemeKt.LocalColors;
            TextKt.m509Text4IGK_g(str, null, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal2)).textDefault, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, gapComposer, 0, 0, 65530);
            TextKt.m509Text4IGK_g(str2, null, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal2)).textDefault, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium, gapComposer, 0, 0, 65530);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FieldBinding$$ExternalSyntheticLambda5(linkBrand, i, 15);
        }
    }

    public static final void NetworkingLinkLoginWarmupContent(NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState, Function0 function0, Function0 function02, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(41890616);
        int i2 = (gapComposer.changedInstance(networkingLinkLoginWarmupState) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(function02) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).background, androidx.compose.ui.graphics.ColorKt.RectangleShape);
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(24.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1983220747, new NetworkingLinkLoginWarmupScreenKt$$ExternalSyntheticLambda1(networkingLinkLoginWarmupState, function0, function02), gapComposer);
            boolean changedInstance = gapComposer.changedInstance(networkingLinkLoginWarmupState);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda3(networkingLinkLoginWarmupState, 29);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LayoutKt.LazyLayout(m177backgroundbw27NRU, null, true, false, false, arrangement$SpacedAligned, false, rememberLazyListState, rememberComposableLambda, (Function1) rememberedValue, gapComposer, 100860288, 90);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NetworkingLinkLoginWarmupScreenKt$$ExternalSyntheticLambda1(networkingLinkLoginWarmupState, function0, function02, i);
        }
    }

    public static final void NetworkingLinkLoginWarmupScreen(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
        int i2;
        NeverEqualPolicy neverEqualPolicy;
        navBackStackEntry.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1742567853);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(navBackStackEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 3;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = Identity.parentActivity(gapComposer).getViewModel().activityRetainedComponent;
            FinancialConnectionsSessionManifest.Pane pane = NetworkingLinkLoginWarmupViewModel.PANE;
            Bundle arguments$navigation_common_release = navBackStackEntry.impl.getArguments$navigation_common_release();
            daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            ExitViewModel$Companion$$ExternalSyntheticLambda0 exitViewModel$Companion$$ExternalSyntheticLambda0 = new ExitViewModel$Companion$$ExternalSyntheticLambda0(daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, arguments$navigation_common_release, i3);
            ReflectionFactory reflectionFactory = Reflection.factory;
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(NetworkingLinkLoginWarmupViewModel.class), exitViewModel$Companion$$ExternalSyntheticLambda0);
            InitializerViewModelFactory build = chunkIndexMerger.build();
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            NetworkingLinkLoginWarmupViewModel networkingLinkLoginWarmupViewModel = (NetworkingLinkLoginWarmupViewModel) ((FinancialConnectionsViewModel) ViewModelKt.viewModel(reflectionFactory.getOrCreateKotlinClass(NetworkingLinkLoginWarmupViewModel.class), current, build, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer));
            NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState = (NetworkingLinkLoginWarmupState) StateFlowsComposeKt.collectAsState(networkingLinkLoginWarmupViewModel.stateFlow, gapComposer).getValue();
            boolean changedInstance = gapComposer.changedInstance(networkingLinkLoginWarmupViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy2) {
                neverEqualPolicy = neverEqualPolicy2;
                ScannerView.AnonymousClass1 anonymousClass1 = new ScannerView.AnonymousClass1(0, networkingLinkLoginWarmupViewModel, NetworkingLinkLoginWarmupViewModel.class, "onSecondaryButtonClicked", "onSecondaryButtonClicked()V", 0, 25);
                gapComposer.updateRememberedValue(anonymousClass1);
                rememberedValue = anonymousClass1;
            } else {
                neverEqualPolicy = neverEqualPolicy2;
            }
            KFunction kFunction = (KFunction) rememberedValue;
            boolean changedInstance2 = gapComposer.changedInstance(networkingLinkLoginWarmupViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                ScannerView.AnonymousClass1 anonymousClass12 = new ScannerView.AnonymousClass1(0, networkingLinkLoginWarmupViewModel, NetworkingLinkLoginWarmupViewModel.class, "onContinueClick", "onContinueClick()V", 0, 26);
                gapComposer.updateRememberedValue(anonymousClass12);
                rememberedValue2 = anonymousClass12;
            }
            NetworkingLinkLoginWarmupContent(networkingLinkLoginWarmupState, (Function0) ((KFunction) rememberedValue2), (Function0) kFunction, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ExitModalKt$$ExternalSyntheticLambda0(navBackStackEntry, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean allowed(VersionData versionData, AppVersion appVersion) {
        boolean z;
        AppVersion appVersion2;
        boolean z2;
        appVersion.getClass();
        if (versionData == null) {
            return true;
        }
        AppVersion appVersion3 = versionData.min_android_version;
        if (appVersion3 != null) {
            appVersion3.getClass();
            if (compareTo(appVersion, appVersion3) < 0) {
                z = false;
                appVersion2 = versionData.max_android_version;
                if (appVersion2 != null) {
                    appVersion2.getClass();
                    if (compareTo(appVersion, appVersion2) > 0) {
                        z2 = false;
                        return !z && z2;
                    }
                }
                z2 = true;
                if (z) {
                }
            }
        }
        z = true;
        appVersion2 = versionData.max_android_version;
        if (appVersion2 != null) {
        }
        z2 = true;
        if (z) {
        }
    }

    public static final int compareTo(AppVersion appVersion, AppVersion appVersion2) {
        appVersion.getClass();
        appVersion2.getClass();
        Platform platform = appVersion2.platform;
        if (platform != null && appVersion.platform != platform) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return 0;
        }
        Integer num = appVersion.major_version;
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = appVersion.minor_version;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = appVersion.patch_version;
        int intValue3 = num3 != null ? num3.intValue() : 0;
        Integer num4 = appVersion2.major_version;
        int intValue4 = num4 != null ? num4.intValue() : 0;
        Integer num5 = appVersion2.minor_version;
        int intValue5 = num5 != null ? num5.intValue() : 0;
        Integer num6 = appVersion2.patch_version;
        int intValue6 = num6 != null ? num6.intValue() : 0;
        if (intValue < intValue4) {
            return -1;
        }
        if (intValue > intValue4) {
            return 1;
        }
        if (intValue2 < intValue5) {
            return -1;
        }
        if (intValue2 > intValue5) {
            return 1;
        }
        if (intValue3 < intValue6) {
            return -1;
        }
        return intValue3 > intValue6 ? 1 : 0;
    }
}
