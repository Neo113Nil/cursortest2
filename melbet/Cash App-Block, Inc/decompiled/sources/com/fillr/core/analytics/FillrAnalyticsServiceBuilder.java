package com.fillr.core.analytics;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.SwipeToDismissBoxKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.paging.PageFetcher$flow$1;
import androidx.room.RoomDatabase$performClear$1;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.fillr.browsersdk.Fillr;
import com.google.android.filament.Box;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.api.internal.zabr;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SsnViewKt$SsnContent$3$1$1;
import com.squareup.cash.datefilterbar.views.DateFilterChipKt$$ExternalSyntheticLambda0;
import com.squareup.cash.datefilterbar.views.DateFilterChipKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.views.message.MoneybotMessageUiKt$$ExternalSyntheticLambda15;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.pay.PastPaySectionKt$$ExternalSyntheticLambda1;
import com.squareup.cash.work.views.pay.PayCellViewKt$$ExternalSyntheticLambda0;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.Strings;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.error.ErrorViewModel$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda16;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState$ViewEffect$OpenUrl;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel;
import com.stripe.android.financialconnections.features.reset.ResetScreenKt$$ExternalSyntheticLambda2;
import com.stripe.android.financialconnections.model.Body$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Type$Primary;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Type$Secondary;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes8.dex */
public abstract class FillrAnalyticsServiceBuilder {
    public static final void Body(String str, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1942722393);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            TextResource.Text text = new TextResource.Text(zabr.fromHtml(str));
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).bodyMedium, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new StripeApiRepository$$ExternalSyntheticLambda5(3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TextKt.m4020AnnotatedTextrm0N8CA(text, (Function1) rememberedValue, m994copyp1EtxEg$default, null, null, 0, 0, gapComposer, 48, 120);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PastPaySectionKt$$ExternalSyntheticLambda1(str, i, 13);
        }
    }

    public static final void DateFilterChip(int i, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function0 function0, boolean z) {
        Modifier modifier2;
        long j;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1613632250);
        int i2 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | 48 | (gapComposer.changed(z) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).buttonCompact, 0L, 0L, null, null, 0L, new BaselineShift(0.12f), 0L, null, null, null, 3, 0L, null, null, 0, 16744191);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f);
            long j2 = Strings.getColors(gapComposer).component.filterBar.chip.text.f183default;
            if (z) {
                gapComposer.startReplaceGroup(217418210);
                j = Strings.getColors(gapComposer).component.filterBar.chip.background.selected;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(217419141);
                gapComposer.end(false);
                j = Color.Transparent;
            }
            Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(m994copyp1EtxEg$default), re$$ExternalSyntheticOutline0.m(j2, ArcadeThemeKt.LocalTextColor)}, Expect_jvmKt.rememberComposableLambda(791918522, new DateFilterChipKt$$ExternalSyntheticLambda0(j, m340RoundedCornerShape0680j_4, mutableInteractionSourceImpl, function0, composableLambdaImpl), gapComposer), gapComposer, 56);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DateFilterChipKt$$ExternalSyntheticLambda1(function0, modifier2, z, composableLambdaImpl, i, 0);
        }
    }

    public static final void EmailSection(SimpleTextFieldController simpleTextFieldController, boolean z, boolean z2, FocusRequester focusRequester, Composer composer, int i) {
        focusRequester.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-257691582);
        int i2 = (gapComposer.changedInstance(simpleTextFieldController) ? 32 : 16) | i | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changed(z2) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LayoutKt.StripeThemeForConnections(Expect_jvmKt.rememberComposableLambda(589066431, new OutlinedTextFieldKt$$ExternalSyntheticLambda4(simpleTextFieldController, z2, (MutableState) rememberedValue, focusRequester, z), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneybotMessageUiKt$$ExternalSyntheticLambda15(simpleTextFieldController, z, z2, focusRequester, i);
        }
    }

    public static final void NetworkingLinkSignupContent(NetworkingLinkSignupState networkingLinkSignupState, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Composer composer, int i) {
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1361537896);
        int i2 = i | (gapComposer.changedInstance(networkingLinkSignupState) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(function12) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024) | (gapComposer.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Async async = networkingLinkSignupState.payload;
            if (Intrinsics.areEqual(async, Async.Uninitialized.INSTANCE) || (async instanceof Async.Loading)) {
                gapComposer.startReplaceGroup(1728145848);
                ListItemKt.FullScreenGenericLoading(gapComposer, 0);
                gapComposer.end(false);
            } else if (async instanceof Async.Success) {
                gapComposer.startReplaceGroup(2032979117);
                boolean valid = networkingLinkSignupState.getValid();
                NetworkingLinkSignupState.Payload payload = (NetworkingLinkSignupState.Payload) ((Async.Success) async).value;
                Async async2 = networkingLinkSignupState.lookupAccount;
                NetworkingLinkSignupLoaded(valid, payload, networkingLinkSignupState.saveAccountToLink instanceof Async.Loading, async2, ((ConsumerSessionLookup) async2.invoke()) != null ? !r7.exists : false, function12, function0, function02, gapComposer, 33488896 & (i2 << 9));
                gapComposer.end(false);
                z = true;
                gapComposer.end(z);
            } else {
                if (!(async instanceof Async.Fail)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1728143996, false);
                }
                gapComposer.startReplaceGroup(1728162431);
                boolean changedInstance = ((i2 & 112) == 32) | gapComposer.changedInstance(async);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ResetScreenKt$$ExternalSyntheticLambda2(function1, async, 4);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                ListItemKt.UnclassifiedErrorContent(false, (Function0) rememberedValue, gapComposer, 0, 1);
                gapComposer.end(false);
            }
            z = true;
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WalletHomeViewKt$$ExternalSyntheticLambda4(networkingLinkSignupState, function1, function12, function0, function02, i, 4);
        }
    }

    public static final void NetworkingLinkSignupFooter(final NetworkingLinkSignupState.Payload payload, Function1 function1, boolean z, boolean z2, Function0 function0, Function0 function02, Composer composer, int i) {
        boolean z3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(357624048);
        int i2 = i | (gapComposer.changedInstance(payload) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changed(z2) ? 2048 : 1024) | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function02) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
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
            TextKt.m4020AnnotatedTextrm0N8CA(new TextResource.Text(zabr.fromHtml(payload.content.aboveCta)), function1, TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).labelSmall, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446), SizeKt.fillMaxWidth(companion, 1.0f), null, 0, 0, gapComposer, (i2 & 112) | 3072, 112);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
            final int i3 = 0;
            TextKt.FinancialConnectionsButton(function0, SizeKt.fillMaxWidth(companion, 1.0f), FinancialConnectionsButton$Type$Primary.INSTANCE, null, z2, z, Expect_jvmKt.rememberComposableLambda(-1113135103, new Function3() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i4 = i3;
                    NetworkingLinkSignupState.Payload payload2 = payload;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((RowScope) obj).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                androidx.compose.material.TextKt.m509Text4IGK_g(payload2.content.cta, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, gapComposer2, 0, 0, 131070);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((RowScope) obj).getClass();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                androidx.compose.material.TextKt.m509Text4IGK_g(payload2.content.skipCta, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, gapComposer3, 0, 0, 131070);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, ((i2 >> 12) & 14) | 1573296 | ((i2 << 3) & 57344) | ((i2 << 9) & 458752), 8);
            if (payload.content.skipCta != null) {
                gapComposer.startReplaceGroup(133954661);
                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 8.0f));
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new StripeApiRepository$$ExternalSyntheticLambda5(2);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier testTag = TestTagKt.testTag(SemanticsModifierKt.semantics(fillMaxWidth, false, (Function1) rememberedValue), "skip_cta");
                z3 = true;
                final char c = 1 == true ? 1 : 0;
                TextKt.FinancialConnectionsButton(function02, testTag, FinancialConnectionsButton$Type$Secondary.INSTANCE, null, false, false, Expect_jvmKt.rememberComposableLambda(-614143034, new Function3() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i4 = c;
                        NetworkingLinkSignupState.Payload payload2 = payload;
                        switch (i4) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    androidx.compose.material.TextKt.m509Text4IGK_g(payload2.content.cta, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, gapComposer2, 0, 0, 131070);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    androidx.compose.material.TextKt.m509Text4IGK_g(payload2.content.skipCta, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, gapComposer3, 0, 0, 131070);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, ((i2 >> 15) & 14) | 1573248, 56);
            } else {
                z3 = true;
                gapComposer.startReplaceGroup(124475016);
            }
            gapComposer.end(false);
            gapComposer.end(z3);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda16(payload, function1, z, z2, function0, function02, i);
        }
    }

    public static final void NetworkingLinkSignupLoaded(boolean z, NetworkingLinkSignupState.Payload payload, boolean z2, Async async, boolean z3, Function1 function1, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        int i3;
        FocusRequester focusRequester;
        boolean z4;
        Boolean bool;
        FocusRequester focusRequester2;
        ScrollState scrollState;
        String str;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-274221274);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(payload) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(async) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(z3) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function02) ? 8388608 : 4194304;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer2);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer2);
            }
            FocusRequester focusRequester3 = (FocusRequester) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer2);
            }
            FocusRequester focusRequester4 = (FocusRequester) rememberedValue2;
            if (payload.isInstantDebits && ((str = payload.emailController.initialValue) == null || StringsKt.isBlank(str))) {
                gapComposer2.startReplaceGroup(-297684739);
                Unit unit = Unit.INSTANCE;
                i3 = i2;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    focusRequester = focusRequester4;
                    rememberedValue3 = new SsnViewKt$SsnContent$3$1$1(focusRequester3, null, 7);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                } else {
                    focusRequester = focusRequester4;
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue3);
                z4 = false;
            } else {
                i3 = i2;
                focusRequester = focusRequester4;
                z4 = false;
                gapComposer2.startReplaceGroup(-304365828);
            }
            gapComposer2.end(z4);
            Boolean valueOf = Boolean.valueOf(z3);
            boolean changed = gapComposer2.changed(rememberScrollState) | ((i3 & 57344) == 16384 ? true : z4) | gapComposer2.changedInstance(payload);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed || rememberedValue4 == neverEqualPolicy) {
                bool = valueOf;
                RoomDatabase$performClear$1.AnonymousClass1 anonymousClass1 = new RoomDatabase$performClear$1.AnonymousClass1(z3, rememberScrollState, payload, focusRequester, (Continuation) null, 21);
                focusRequester2 = focusRequester3;
                scrollState = rememberScrollState;
                gapComposer2.updateRememberedValue(anonymousClass1);
                rememberedValue4 = anonymousClass1;
            } else {
                scrollState = rememberScrollState;
                bool = valueOf;
                focusRequester2 = focusRequester3;
            }
            Updater.LaunchedEffect(gapComposer2, bool, (Function2) rememberedValue4);
            gapComposer = gapComposer2;
            LayoutKt.Layout(null, null, false, null, false, scrollState, Expect_jvmKt.rememberComposableLambda(1194072775, new NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda16(payload, function1, z2, z, function0, function02), gapComposer2), Expect_jvmKt.rememberComposableLambda(932825430, new SheetKt$$ExternalSyntheticLambda4(payload, function1, async, z3, focusRequester2, focusRequester), gapComposer2), gapComposer, 905969664, 127);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SwipeToDismissBoxKt$$ExternalSyntheticLambda1(z, payload, z2, async, z3, function1, function0, function02, i);
        }
    }

    public static final void NetworkingLinkSignupScreen(Composer composer, int i) {
        NeverEqualPolicy neverEqualPolicy;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1489011962);
        int i2 = 1;
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = Identity.parentActivity(gapComposer).getViewModel().activityRetainedComponent;
            daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            ErrorViewModel$Companion$$ExternalSyntheticLambda0 errorViewModel$Companion$$ExternalSyntheticLambda0 = new ErrorViewModel$Companion$$ExternalSyntheticLambda0(daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, 7);
            ReflectionFactory reflectionFactory = Reflection.factory;
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(NetworkingLinkSignupViewModel.class), errorViewModel$Companion$$ExternalSyntheticLambda0);
            InitializerViewModelFactory build = chunkIndexMerger.build();
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            NetworkingLinkSignupViewModel networkingLinkSignupViewModel = (NetworkingLinkSignupViewModel) ((FinancialConnectionsViewModel) ViewModelKt.viewModel(reflectionFactory.getOrCreateKotlinClass(NetworkingLinkSignupViewModel.class), current, build, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer));
            FinancialConnectionsSheetNativeViewModel parentViewModel = TaskUtil.parentViewModel(gapComposer);
            MutableState collectAsState = StateFlowsComposeKt.collectAsState(networkingLinkSignupViewModel.stateFlow, gapComposer);
            UriHandler uriHandler = (UriHandler) gapComposer.consume(CompositionLocalsKt.LocalUriHandler);
            boolean z = !((NetworkingLinkSignupState) collectAsState.getValue()).isInstantDebits;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy2) {
                rememberedValue = new Body$$ExternalSyntheticLambda0(3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(z, (Function0) rememberedValue, gapComposer, 48, 0);
            NetworkingLinkSignupState$ViewEffect$OpenUrl networkingLinkSignupState$ViewEffect$OpenUrl = ((NetworkingLinkSignupState) collectAsState.getValue()).viewEffect;
            if (networkingLinkSignupState$ViewEffect$OpenUrl == null) {
                gapComposer.startReplaceGroup(-732561289);
            } else {
                gapComposer.startReplaceGroup(-732561288);
                boolean changed = gapComposer.changed(networkingLinkSignupState$ViewEffect$OpenUrl) | gapComposer.changedInstance(uriHandler) | gapComposer.changedInstance(networkingLinkSignupViewModel);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy2) {
                    Logger$_log$2 logger$_log$2 = new Logger$_log$2(networkingLinkSignupState$ViewEffect$OpenUrl, uriHandler, networkingLinkSignupViewModel, null, 17);
                    networkingLinkSignupViewModel = networkingLinkSignupViewModel;
                    gapComposer.updateRememberedValue(logger$_log$2);
                    rememberedValue2 = logger$_log$2;
                }
                Updater.LaunchedEffect(gapComposer, networkingLinkSignupState$ViewEffect$OpenUrl, (Function2) rememberedValue2);
            }
            gapComposer.end(false);
            NetworkingLinkSignupState networkingLinkSignupState = (NetworkingLinkSignupState) collectAsState.getValue();
            boolean changedInstance = gapComposer.changedInstance(parentViewModel);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy2) {
                neverEqualPolicy = neverEqualPolicy2;
                TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$1 = new TextFieldUIKt$TextField$4$1(1, parentViewModel, FinancialConnectionsSheetNativeViewModel.class, "onCloseFromErrorClick", "onCloseFromErrorClick(Ljava/lang/Throwable;)V", 0, 11);
                gapComposer.updateRememberedValue(textFieldUIKt$TextField$4$1);
                rememberedValue3 = textFieldUIKt$TextField$4$1;
            } else {
                neverEqualPolicy = neverEqualPolicy2;
            }
            Function1 function1 = (Function1) ((KFunction) rememberedValue3);
            boolean changedInstance2 = gapComposer.changedInstance(networkingLinkSignupViewModel);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                ScrollCapture$onScrollCaptureSearch$1 scrollCapture$onScrollCaptureSearch$1 = new ScrollCapture$onScrollCaptureSearch$1(1, networkingLinkSignupViewModel, NetworkingLinkSignupViewModel.class, "onClickableTextClick", "onClickableTextClick(Ljava/lang/String;)Lkotlinx/coroutines/Job;", 8, 10);
                gapComposer.updateRememberedValue(scrollCapture$onScrollCaptureSearch$1);
                rememberedValue4 = scrollCapture$onScrollCaptureSearch$1;
            }
            Function1 function12 = (Function1) rememberedValue4;
            boolean changedInstance3 = gapComposer.changedInstance(networkingLinkSignupViewModel);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                ScannerView.AnonymousClass1 anonymousClass1 = new ScannerView.AnonymousClass1(0, networkingLinkSignupViewModel, NetworkingLinkSignupViewModel.class, "onSaveAccount", "onSaveAccount()V", 0, 27);
                gapComposer.updateRememberedValue(anonymousClass1);
                rememberedValue5 = anonymousClass1;
            }
            Function0 function0 = (Function0) ((KFunction) rememberedValue5);
            boolean changedInstance4 = gapComposer.changedInstance(networkingLinkSignupViewModel);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance4 || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new PageFetcher$flow$1.AnonymousClass2.AnonymousClass1(0, networkingLinkSignupViewModel, NetworkingLinkSignupViewModel.class, "onSkipClick", "onSkipClick()Lkotlinx/coroutines/Job;", 8, 5);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            NetworkingLinkSignupContent(networkingLinkSignupState, function1, function12, function0, (Function0) rememberedValue6, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PhoneNumberController$$ExternalSyntheticLambda5(i, i2);
        }
    }

    public static final void PhoneNumberSection(NetworkingLinkSignupState.Payload payload, FocusRequester focusRequester, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-874903828);
        int i2 = (gapComposer.changedInstance(payload) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            LayoutKt.StripeThemeForConnections(Expect_jvmKt.rememberComposableLambda(761906335, new PayCellViewKt$$ExternalSyntheticLambda0(20, payload, focusRequester, mutableState), gapComposer), gapComposer, 6);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Radiography$$ExternalSyntheticLambda1(payload, focusRequester, i, 21);
        }
    }

    public static final void Title(String str, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1534405939);
        int i2 = 4;
        int i3 = (gapComposer.changed(str) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            TextResource.Text text = new TextResource.Text(zabr.fromHtml(str));
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).headingXLarge, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new StripeApiRepository$$ExternalSyntheticLambda5(i2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TextKt.m4020AnnotatedTextrm0N8CA(text, (Function1) rememberedValue, m994copyp1EtxEg$default, null, null, 0, 0, gapComposer, 48, 120);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PastPaySectionKt$$ExternalSyntheticLambda1(str, i, 14);
        }
    }

    public static Box build() {
        Fillr fillr = Fillr.getInstance();
        if (fillr == null || fillr.parentActivity == null) {
            return Box.getInstance(null, null);
        }
        return Box.getInstance(fillr.getDeveloperKey(), (String) fillr.getIntentBuilder().mCenter);
    }
}
