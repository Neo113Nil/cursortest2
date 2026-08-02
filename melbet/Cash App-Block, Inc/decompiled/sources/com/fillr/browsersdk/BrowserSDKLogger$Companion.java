package com.fillr.browsersdk;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.ChunkIndexMerger;
import app.cash.api.ApiResult;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.caverock.androidsvg.SVG;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.api.internal.zabr;
import com.squareup.cash.cdf.contact.ContactSyncSendToServer;
import com.squareup.cash.data.contacts.ContactDetailsSyncState$FullDetails;
import com.squareup.cash.data.contacts.ContactDetailsSyncState$PrimaryKey;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.contacts.app.AddressBookContact;
import com.squareup.protos.cash.contacts.app.ContactsPatch;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import com.stripe.android.core.networking.MarkdownParser$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.features.consent.ConsentViewModel;
import com.stripe.android.financialconnections.features.error.ErrorViewModel$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.reset.ResetScreenKt$$ExternalSyntheticLambda2;
import com.stripe.android.financialconnections.model.Bullet;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.ImageResource$Network;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.sdui.BulletUI;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes8.dex */
public abstract class BrowserSDKLogger$Companion {
    public static final void ConsentContent(ConsentState consentState, Function0 function0, Function1 function1, Function1 function12, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1656817242);
        int i2 = i | (gapComposer.changedInstance(consentState) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changedInstance(function12) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Async async = consentState.consent;
            if (Intrinsics.areEqual(async, Async.Uninitialized.INSTANCE) || (async instanceof Async.Loading)) {
                gapComposer.startReplaceGroup(1231505533);
                ConsentLoadingContent(gapComposer, 0);
                gapComposer.end(false);
            } else if (async instanceof Async.Success) {
                gapComposer.startReplaceGroup(1231507223);
                LoadedContent((ConsentState.Payload) ((Async.Success) async).value, consentState.acceptConsent, function1, function0, gapComposer, (i2 & 896) | ((i2 << 6) & 7168));
                gapComposer.end(false);
            } else {
                if (!(async instanceof Async.Fail)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1231503346, false);
                }
                gapComposer.startReplaceGroup(1231514438);
                boolean changedInstance = ((i2 & 7168) == 2048) | gapComposer.changedInstance(async);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ResetScreenKt$$ExternalSyntheticLambda2(function12, async, 1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                ListItemKt.UnclassifiedErrorContent(false, (Function0) rememberedValue, gapComposer, 0, 1);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(consentState, i, function0, function1, function12, 23);
        }
    }

    public static final void ConsentFooter(Async async, ConsentPane consentPane, Function1 function1, Function0 function0, Composer composer, int i) {
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-143566856);
        int i2 = i | (gapComposer.changedInstance(async) ? 4 : 2) | (gapComposer.changedInstance(consentPane) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object obj = consentPane.aboveCta;
            String str = consentPane.belowCta;
            boolean changed = gapComposer.changed(obj);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (changed || rememberedValue == obj2) {
                rememberedValue = new TextResource.Text(zabr.fromHtml(consentPane.aboveCta));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TextResource.Text text = (TextResource.Text) rememberedValue;
            boolean changed2 = gapComposer.changed(str);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == obj2) {
                rememberedValue2 = str != null ? new TextResource.Text(zabr.fromHtml(str)) : null;
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            TextResource.Text text2 = (TextResource.Text) rememberedValue2;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            Function0 function02 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function02);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ProvidableCompositionLocal providableCompositionLocal = ThemeKt.LocalTypography;
            TextStyle textStyle = ((FinancialConnectionsTypography) gapComposer.consume(providableCompositionLocal)).labelSmall;
            ProvidableCompositionLocal providableCompositionLocal2 = ThemeKt.LocalColors;
            int i3 = ((i2 >> 3) & 112) | 3072;
            TextKt.m4020AnnotatedTextrm0N8CA(text, function1, TextStyle.m994copyp1EtxEg$default(textStyle, ((FinancialConnectionsColors) gapComposer.consume(providableCompositionLocal2)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446), fillMaxWidth, null, 0, 0, gapComposer, i3, 112);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
            boolean z2 = async instanceof Async.Loading;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj2) {
                rememberedValue3 = new MarkdownParser$$ExternalSyntheticLambda0(19);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            TextKt.FinancialConnectionsButton(function0, SizeKt.fillMaxWidth(TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue3), "consent_cta"), 1.0f), null, null, false, z2, Expect_jvmKt.rememberComposableLambda(1777513479, new CardAppletTile$$ExternalSyntheticLambda1(consentPane, 16), gapComposer), gapComposer, ((i2 >> 9) & 14) | 1572864, 28);
            if (text2 != null) {
                gapComposer.startReplaceGroup(-414002708);
                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
                TextKt.m4020AnnotatedTextrm0N8CA(text2, function1, TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer.consume(providableCompositionLocal)).labelSmall, ((FinancialConnectionsColors) gapComposer.consume(providableCompositionLocal2)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446), SizeKt.fillMaxWidth(companion, 1.0f), null, 0, 0, gapComposer, i3, 112);
                z = false;
            } else {
                z = false;
                gapComposer.startReplaceGroup(-422268300);
            }
            gapComposer.end(z);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(async, i, consentPane, function1, function0, 22);
        }
    }

    public static final void ConsentLoadingContent(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(348268749);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ExitViewModel$$ExternalSyntheticLambda0(i, 8);
        }
    }

    public static final void ConsentScreen(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-132392226);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = Identity.parentActivity(gapComposer).getViewModel().activityRetainedComponent;
            daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            ErrorViewModel$Companion$$ExternalSyntheticLambda0 errorViewModel$Companion$$ExternalSyntheticLambda0 = new ErrorViewModel$Companion$$ExternalSyntheticLambda0(daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, 3);
            ReflectionFactory reflectionFactory = Reflection.factory;
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(ConsentViewModel.class), errorViewModel$Companion$$ExternalSyntheticLambda0);
            InitializerViewModelFactory build = chunkIndexMerger.build();
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ConsentViewModel consentViewModel = (ConsentViewModel) ((FinancialConnectionsViewModel) ViewModelKt.viewModel(reflectionFactory.getOrCreateKotlinClass(ConsentViewModel.class), current, build, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer));
            Object parentViewModel = TaskUtil.parentViewModel(gapComposer);
            MutableState collectAsState = StateFlowsComposeKt.collectAsState(consentViewModel.stateFlow, gapComposer);
            Object obj = (UriHandler) gapComposer.consume(CompositionLocalsKt.LocalUriHandler);
            Object obj2 = ((ConsentState) collectAsState.getValue()).viewEffect;
            Object obj3 = Composer.Companion.Empty;
            if (obj2 == null) {
                gapComposer.startReplaceGroup(-1316543201);
            } else {
                gapComposer.startReplaceGroup(-1316543200);
                boolean changed = gapComposer.changed(obj2) | gapComposer.changedInstance(obj) | gapComposer.changedInstance(consentViewModel);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == obj3) {
                    Object logger$_log$2 = new Logger$_log$2(obj2, obj, consentViewModel, null, 15);
                    consentViewModel = consentViewModel;
                    gapComposer.updateRememberedValue(logger$_log$2);
                    rememberedValue = logger$_log$2;
                }
                Updater.LaunchedEffect(gapComposer, obj2, (Function2) rememberedValue);
            }
            gapComposer.end(false);
            ConsentState consentState = (ConsentState) collectAsState.getValue();
            boolean changedInstance = gapComposer.changedInstance(consentViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == obj3) {
                Object anonymousClass1 = new ScannerView.AnonymousClass1(0, consentViewModel, ConsentViewModel.class, "onContinueClick", "onContinueClick()V", 0, 16);
                gapComposer.updateRememberedValue(anonymousClass1);
                rememberedValue2 = anonymousClass1;
            }
            Function0 function0 = (Function0) ((KFunction) rememberedValue2);
            boolean changedInstance2 = gapComposer.changedInstance(consentViewModel);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == obj3) {
                rememberedValue3 = new ScrollCapture$onScrollCaptureSearch$1(1, consentViewModel, ConsentViewModel.class, "onClickableTextClick", "onClickableTextClick(Ljava/lang/String;)Lkotlinx/coroutines/Job;", 8, 8);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Function1 function1 = (Function1) rememberedValue3;
            boolean changedInstance3 = gapComposer.changedInstance(parentViewModel);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue4 == obj3) {
                Object textFieldUIKt$TextField$4$1 = new TextFieldUIKt$TextField$4$1(1, parentViewModel, FinancialConnectionsSheetNativeViewModel.class, "onCloseFromErrorClick", "onCloseFromErrorClick(Ljava/lang/Throwable;)V", 0, 2);
                gapComposer.updateRememberedValue(textFieldUIKt$TextField$4$1);
                rememberedValue4 = textFieldUIKt$TextField$4$1;
            }
            ConsentContent(consentState, function0, function1, (Function1) ((KFunction) rememberedValue4), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ExitViewModel$$ExternalSyntheticLambda0(i, 7);
        }
    }

    public static final void LoadedContent(ConsentState.Payload payload, Async async, Function1 function1, Function0 function0, Composer composer, int i) {
        Function0 function02;
        GapComposer gapComposer;
        String str;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-332792701);
        int i2 = (gapComposer2.changedInstance(payload) ? 4 : 2) | i | (gapComposer2.changedInstance(async) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if ((i & 3072) == 0) {
            function02 = function0;
            i2 |= gapComposer2.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        int i3 = i2;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer2);
            ConsentPane consentPane = payload.consent;
            boolean changed = gapComposer2.changed(consentPane.title);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new TextResource.Text(zabr.fromHtml(consentPane.title));
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            TextResource.Text text = (TextResource.Text) rememberedValue;
            boolean changed2 = gapComposer2.changed(consentPane.body.bullets);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            Object obj = rememberedValue2;
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                List<Bullet> list = consentPane.body.bullets;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (Bullet bullet : list) {
                    bullet.getClass();
                    Image image = bullet.icon;
                    ImageResource$Network imageResource$Network = (image == null || (str = image.f809default) == null) ? null : new ImageResource$Network(str);
                    String str2 = bullet.title;
                    TextResource.Text text2 = str2 != null ? new TextResource.Text(zabr.fromHtml(str2)) : null;
                    String str3 = bullet.content;
                    arrayList.add(new BulletUI(text2, str3 != null ? new TextResource.Text(zabr.fromHtml(str3)) : null, imageResource$Network));
                }
                gapComposer2.updateRememberedValue(arrayList);
                obj = arrayList;
            }
            List list2 = (List) obj;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, Modifier.Companion.$$INSTANCE);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1817172324, new LifecycleKt$$ExternalSyntheticLambda0(payload, async, function1, function02, 24), gapComposer2);
            boolean changedInstance = gapComposer2.changedInstance(payload) | gapComposer2.changedInstance(text) | ((i3 & 896) == 256) | gapComposer2.changedInstance(list2);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                OpenSourceKt$$ExternalSyntheticLambda9 openSourceKt$$ExternalSyntheticLambda9 = new OpenSourceKt$$ExternalSyntheticLambda9(payload, text, function1, list2, 15);
                gapComposer2.updateRememberedValue(openSourceKt$$ExternalSyntheticLambda9);
                rememberedValue3 = openSourceKt$$ExternalSyntheticLambda9;
            }
            LayoutKt.LazyLayout(null, null, false, false, false, null, false, rememberLazyListState, rememberComposableLambda, (Function1) rememberedValue3, gapComposer2, 100663296, 127);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda1(payload, async, function1, function0, i, 7);
        }
    }

    public static final ArrayList access$added(ContactsPatch contactsPatch) {
        List<AddressBookContact> list = contactsPatch.upserted_contacts;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (AddressBookContact addressBookContact : list) {
            String str = addressBookContact.contact_id;
            str.getClass();
            String hex = addressBookContact.encodeByteString().digest$okio(McElieceCCA2KeyGenParameterSpec.SHA1).hex();
            hex.getClass();
            arrayList.add(new ContactDetailsSyncState$FullDetails(str, str, hex, 0));
        }
        return arrayList;
    }

    public static final String access$errorDescription(ApiResult apiResult) {
        if (apiResult instanceof ApiResult.Success) {
            return null;
        }
        if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
            ApiResult.Failure.NetworkFailure networkFailure = (ApiResult.Failure.NetworkFailure) apiResult;
            Throwable th = networkFailure.error;
            return th instanceof SocketTimeoutException ? "Network Failure: Socket Timeout" : th instanceof ConnectException ? "Network Failure: Failed To Connect" : networkFailure.toString();
        }
        if (apiResult instanceof ApiResult.Failure.HttpFailure) {
            return ((ApiResult.Failure.HttpFailure) apiResult).toString();
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final String access$hash(AddressBookContact addressBookContact) {
        String hex = addressBookContact.encodeByteString().digest$okio(McElieceCCA2KeyGenParameterSpec.SHA1).hex();
        hex.getClass();
        return hex;
    }

    public static final ArrayList access$removed(ContactsPatch contactsPatch) {
        List<String> list = contactsPatch.removed_contact_ids;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (String str : list) {
            str.getClass();
            arrayList.add(new ContactDetailsSyncState$PrimaryKey(str));
        }
        return arrayList;
    }

    public static final ContactSyncSendToServer.ServerResponse access$toServerResponse(ApiResult apiResult) {
        return apiResult instanceof ApiResult.Success ? ContactSyncSendToServer.ServerResponse.SUCCESS : ContactSyncSendToServer.ServerResponse.ERROR;
    }

    public static void d(String str) {
        logsEnabled();
    }

    public static void logsEnabled() {
        SVG svg = Fillr.getInstance().fillrConfig;
    }
}
