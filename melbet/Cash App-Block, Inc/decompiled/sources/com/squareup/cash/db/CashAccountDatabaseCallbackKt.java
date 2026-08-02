package com.squareup.cash.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.navigation.NavBackStackEntry;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import app.cash.molecule.PlatformKt;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrMappedFields;
import com.fillr.core.apiclientv2.APIEndpoint;
import com.fillr.core.apiclientv2.ConsumerAPIClientParams;
import com.fillr.core.apiclientv2.ConsumerClientException;
import com.fillr.core.model.FillrAddressComponentList;
import com.fillr.core.model.FillrAddressParseComponentList;
import com.fillr.core.model.FillrAddressQueryResultList;
import com.fillr.core.model.FillrApiResult;
import com.fillr.core.model.FillrPerformanceStatsResponse;
import com.fillr.core.model.ModelBase;
import com.google.android.gms.auth.api.identity.Identity;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda4;
import com.squareup.scannerview.ScannerView;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.exit.ExitModalKt$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState$ViewEffect$OpenUrl;
import com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel;
import com.stripe.android.financialconnections.model.Body$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import defpackage.FinancialConnectionsGenericInfoScreen;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;
import nl.dionsegijn.konfetti.emitters.RenderSystem;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes8.dex */
public abstract class CashAccountDatabaseCallbackKt {
    public static final void NoticeSheet(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
        int i2;
        navBackStackEntry.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-218687548);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(navBackStackEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = Identity.parentActivity(gapComposer).getViewModel().activityRetainedComponent;
            Bundle arguments$navigation_common_release = navBackStackEntry.impl.getArguments$navigation_common_release();
            daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            ExitViewModel$Companion$$ExternalSyntheticLambda0 exitViewModel$Companion$$ExternalSyntheticLambda0 = new ExitViewModel$Companion$$ExternalSyntheticLambda0(daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, arguments$navigation_common_release, i3);
            ReflectionFactory reflectionFactory = Reflection.factory;
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(NoticeSheetViewModel.class), exitViewModel$Companion$$ExternalSyntheticLambda0);
            InitializerViewModelFactory build = chunkIndexMerger.build();
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            NoticeSheetViewModel noticeSheetViewModel = (NoticeSheetViewModel) ((FinancialConnectionsViewModel) ViewModelKt.viewModel(reflectionFactory.getOrCreateKotlinClass(NoticeSheetViewModel.class), current, build, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer));
            UriHandler uriHandler = (UriHandler) gapComposer.consume(CompositionLocalsKt.LocalUriHandler);
            MutableState collectAsState = StateFlowsComposeKt.collectAsState(noticeSheetViewModel.stateFlow, gapComposer);
            NoticeSheetState$ViewEffect$OpenUrl noticeSheetState$ViewEffect$OpenUrl = ((NoticeSheetState) collectAsState.getValue()).viewEffect;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (noticeSheetState$ViewEffect$OpenUrl == null) {
                gapComposer.startReplaceGroup(544962726);
            } else {
                gapComposer.startReplaceGroup(544962727);
                boolean changedInstance = gapComposer.changedInstance(noticeSheetState$ViewEffect$OpenUrl) | gapComposer.changedInstance(uriHandler);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new InquiryViewModel.AnonymousClass1(noticeSheetState$ViewEffect$OpenUrl, uriHandler, null, 9);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.LaunchedEffect(gapComposer, noticeSheetState$ViewEffect$OpenUrl, (Function2) rememberedValue);
            }
            gapComposer.end(false);
            NoticeSheetState.NoticeSheetContent noticeSheetContent = ((NoticeSheetState) collectAsState.getValue()).content;
            if (noticeSheetContent == null) {
                gapComposer.startReplaceGroup(545168721);
            } else {
                gapComposer.startReplaceGroup(545168722);
                boolean changedInstance2 = gapComposer.changedInstance(noticeSheetViewModel);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                    TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$1 = new TextFieldUIKt$TextField$4$1(1, noticeSheetViewModel, NoticeSheetViewModel.class, "handleClickableTextClick", "handleClickableTextClick(Ljava/lang/String;)V", 0, 14);
                    gapComposer.updateRememberedValue(textFieldUIKt$TextField$4$1);
                    rememberedValue2 = textFieldUIKt$TextField$4$1;
                }
                Function1 function1 = (Function1) ((KFunction) rememberedValue2);
                boolean changedInstance3 = gapComposer.changedInstance(noticeSheetViewModel);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                    ScannerView.AnonymousClass1 anonymousClass1 = new ScannerView.AnonymousClass1(0, noticeSheetViewModel, NoticeSheetViewModel.class, "handleConfirmModalClick", "handleConfirmModalClick()V", 0, 29);
                    gapComposer.updateRememberedValue(anonymousClass1);
                    rememberedValue3 = anonymousClass1;
                }
                Function0 function0 = (Function0) ((KFunction) rememberedValue3);
                boolean changedInstance4 = gapComposer.changedInstance(noticeSheetViewModel);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changedInstance4 || rememberedValue4 == neverEqualPolicy) {
                    RenderSystem.AnonymousClass1 anonymousClass12 = new RenderSystem.AnonymousClass1(0, noticeSheetViewModel, NoticeSheetViewModel.class, "onViewEffectLaunched", "onViewEffectLaunched()V", 0, 1);
                    gapComposer.updateRememberedValue(anonymousClass12);
                    rememberedValue4 = anonymousClass12;
                }
                NoticeSheetContent(noticeSheetContent, function1, function0, (Function0) ((KFunction) rememberedValue4), null, gapComposer, 0);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ExitModalKt$$ExternalSyntheticLambda0(navBackStackEntry, i, i3);
        }
    }

    public static final void NoticeSheetContent(NoticeSheetState.NoticeSheetContent noticeSheetContent, Function1 function1, Function0 function0, Function0 function02, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(378749029);
        int i2 = i | (gapComposer.changed(noticeSheetContent) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changedInstance(function02) ? 2048 : 1024) | 24576;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (noticeSheetContent instanceof NoticeSheetState.NoticeSheetContent.Legal) {
                gapComposer.startReplaceGroup(2082983838);
                ListItemKt.LegalDetailsBottomSheetContent(((NoticeSheetState.NoticeSheetContent.Legal) noticeSheetContent).legalDetails, function1, function0, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                gapComposer.end(false);
            } else if (noticeSheetContent instanceof NoticeSheetState.NoticeSheetContent.DataAccess) {
                gapComposer.startReplaceGroup(2083229668);
                ListItemKt.DataAccessBottomSheetContent(((NoticeSheetState.NoticeSheetContent.DataAccess) noticeSheetContent).dataAccess, function1, function0, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                gapComposer.end(false);
            } else {
                boolean z = noticeSheetContent instanceof NoticeSheetState.NoticeSheetContent.Generic;
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (z) {
                    gapComposer.startReplaceGroup(1175587306);
                    FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen = ((NoticeSheetState.NoticeSheetContent.Generic) noticeSheetContent).generic;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new Body$$ExternalSyntheticLambda0(6);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    ListItemKt.GenericBottomSheetContent(financialConnectionsGenericInfoScreen, function1, function0, (Function0) rememberedValue, gapComposer, (i2 & 112) | 3072 | (i2 & 896));
                    gapComposer.end(false);
                } else {
                    if (!(noticeSheetContent instanceof NoticeSheetState.NoticeSheetContent.UpdateRequired)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1175571532, false);
                    }
                    gapComposer.startReplaceGroup(1175606242);
                    FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen2 = ((NoticeSheetState.NoticeSheetContent.UpdateRequired) noticeSheetContent).generic;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new Body$$ExternalSyntheticLambda0(7);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    ListItemKt.GenericBottomSheetContent(financialConnectionsGenericInfoScreen2, function1, function0, (Function0) rememberedValue2, gapComposer, (i2 & 112) | 3072 | (i2 & 896));
                    gapComposer.end(false);
                }
            }
            function02.invoke();
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WalletHomeViewKt$$ExternalSyntheticLambda4(noticeSheetContent, function1, function0, function02, modifier2, i, 5);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final void access$blowAwayDb(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        String string2;
        SQLiteDatabase sQLiteDatabase = frameworkSQLiteDatabase.delegate;
        Cursor query = frameworkSQLiteDatabase.query(new CallResult("SELECT name, type FROM sqlite_master WHERE name NOT IN ('sqlite_sequence')"));
        while (query.moveToNext()) {
            try {
                String string3 = query.getString(0);
                if (!Intrinsics.areEqual(string3, "android_metadata") && (string2 = query.getString(1)) != null) {
                    switch (string2.hashCode()) {
                        case -1059891784:
                            if (!string2.equals("trigger")) {
                                break;
                            } else {
                                sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS " + string3);
                                break;
                            }
                        case 3619493:
                            if (!string2.equals("view")) {
                                break;
                            } else {
                                sQLiteDatabase.execSQL("DROP VIEW IF EXISTS " + string3);
                                break;
                            }
                        case 100346066:
                            if (!string2.equals("index")) {
                                break;
                            } else {
                                sQLiteDatabase.execSQL("DROP INDEX IF EXISTS " + string3);
                                break;
                            }
                        case 110115790:
                            if (!string2.equals("table")) {
                                break;
                            } else {
                                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + string3);
                                break;
                            }
                    }
                }
            } finally {
            }
        }
        query.close();
    }

    public static ModelBase getModelObjectFromResponse(Context context, String str, ConsumerAPIClientParams consumerAPIClientParams) {
        ModelBase fillrMappedFields;
        ModelBase modelBase;
        if (str == null) {
            throw new ConsumerClientException("Received empty response from API.");
        }
        APIEndpoint aPIEndpoint = consumerAPIClientParams.mEndpoint;
        try {
            int ordinal = aPIEndpoint.ordinal();
            String str2 = aPIEndpoint.mDescription;
            switch (ordinal) {
                case 0:
                    fillrMappedFields = new FillrMappedFields((JSONObject) new JSONTokener(str).nextValue(), context, consumerAPIClientParams);
                    break;
                case 1:
                    JSONObject jSONObject = (JSONObject) new JSONTokener(str).nextValue();
                    FillrPerformanceStatsResponse fillrPerformanceStatsResponse = new FillrPerformanceStatsResponse();
                    fillrPerformanceStatsResponse.result = "";
                    fillrPerformanceStatsResponse.result = jSONObject.getString("result");
                    modelBase = fillrPerformanceStatsResponse;
                    fillrMappedFields = modelBase;
                    break;
                case 2:
                    modelBase = new FillrAddressComponentList((JSONObject) new JSONTokener(str).nextValue(), consumerAPIClientParams);
                    fillrMappedFields = modelBase;
                    break;
                case 3:
                    modelBase = new FillrAddressParseComponentList((JSONObject) new JSONTokener(str).nextValue(), consumerAPIClientParams);
                    fillrMappedFields = modelBase;
                    break;
                case 4:
                case 6:
                    FillrApiResult fillrApiResult = new FillrApiResult();
                    fillrApiResult.response = str;
                    fillrMappedFields = fillrApiResult;
                    break;
                case 5:
                    modelBase = new FillrAddressQueryResultList((JSONObject) new JSONTokener(str).nextValue(), consumerAPIClientParams);
                    fillrMappedFields = modelBase;
                    break;
                default:
                    fillrMappedFields = null;
                    break;
            }
            if (fillrMappedFields == null) {
                throw new ConsumerClientException("No data conversion is defined for : ".concat(str2));
            }
            if (fillrMappedFields.onValidate()) {
                return fillrMappedFields;
            }
            throw new ConsumerClientException("Received invalid result for : ".concat(str2));
        } catch (Exception e) {
            throw new ConsumerClientException(Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("Error decoding response: ")));
        }
    }
}
