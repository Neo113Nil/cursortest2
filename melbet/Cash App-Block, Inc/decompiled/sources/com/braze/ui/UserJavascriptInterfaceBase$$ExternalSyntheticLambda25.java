package com.braze.ui;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CaptureResult;
import android.util.Log;
import androidx.camera.camera2.impl.FocusMeteringControl;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.camera2.pipe.compat.AndroidFrameMetadata;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1;
import androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceState;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material3.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.paging.ItemSnapshotList;
import androidx.paging.compose.LazyPagingItems;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.driver.android.AndroidStatement;
import coil3.Extras;
import coil3.RealImageLoader;
import com.braze.BrazeUser;
import com.squareup.cash.arcade.components.FilterBarScope;
import com.squareup.cash.borrow.views.FirstTimeBorrowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.buynowpaylater.views.ImageUtilsKt;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.db.EnumListAdapter;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.RecipientConfig$Adapter;
import com.squareup.cash.db2.contacts.Alias$Adapter;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Loaded;
import com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt$$ExternalSyntheticLambda20;
import com.squareup.cash.moneybot.views.inject.MoneybotUiFactory$$ExternalSyntheticLambda3;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt;
import com.squareup.cash.moneybot.views.menu.MoneybotOverflowMenuViewKt$$ExternalSyntheticLambda22;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda11;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.transfers.presenters.InstrumentDetailsPresenter;
import com.squareup.cash.transfers.screens.BalanceBasedAutoReloadConfirmationScreen;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationScreen;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.work.views.shift.ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3;
import com.squareup.cash.work.webview.viewmodels.WorkWebViewEvent;
import com.squareup.protos.cash.compass.api.GpsConsentStatus;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.TouchData;
import com.squareup.protos.franklin.common.SuggestedRecipientsData;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.wire.GrpcMethod;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker$Output$Complete;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$State$Starting;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionResult;
import com.withpersona.sdk2.inquiry.permissions.PermissionState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda79;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationEventData;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationState;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.Deferred;
import utils.StringUtilsKt;

/* loaded from: classes7.dex */
public final /* synthetic */ class UserJavascriptInterfaceBase$$ExternalSyntheticLambda25 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ boolean f$3;

    public /* synthetic */ UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(String str, boolean z, String str2, Function1 function1) {
        this.$r8$classId = 15;
        this.f$1 = str;
        this.f$3 = z;
        this.f$2 = str2;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit customUserAttributeJSON$lambda$0;
        Transition.AnonymousClass1 anonymousClass1;
        SurfaceTexture surfaceTexture;
        int i = this.$r8$classId;
        int i2 = 5;
        Matrix matrix = null;
        int i3 = 0;
        boolean z = this.f$3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                customUserAttributeJSON$lambda$0 = UserJavascriptInterfaceBase.setCustomUserAttributeJSON$lambda$0((UserJavascriptInterfaceBase) obj4, (String) obj3, (String) obj2, z, (BrazeUser) obj);
                return customUserAttributeJSON$lambda$0;
            case 1:
                CompletableDeferredImpl completableDeferredImpl = (CompletableDeferredImpl) obj4;
                Deferred deferred = (Deferred) obj3;
                FocusMeteringControl focusMeteringControl = (FocusMeteringControl) obj2;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                        Log.w("CXCP", "propagateToFocusMeteringResultDeferred: completed exceptionally!", th);
                    }
                    completableDeferredImpl.completeExceptionally(th);
                } else {
                    Result3A result3A = (Result3A) deferred.getCompleted();
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "propagateToFocusMeteringResultDeferred: result3A = " + result3A);
                    }
                    int i4 = result3A.status;
                    if (i4 == 4) {
                        CameraState$Type$EnumUnboxingLocalUtility.m("Camera is not active.", completableDeferredImpl);
                    } else if (i4 == 2) {
                        completableDeferredImpl.makeCompleting$kotlinx_coroutines_core(new Transition.AnonymousClass1());
                    } else {
                        focusMeteringControl.getClass();
                        if (result3A.status == 0) {
                            AndroidFrameMetadata androidFrameMetadata = result3A.frameMetadata;
                            if (androidFrameMetadata != null) {
                                CaptureResult.Key key = CaptureResult.CONTROL_AF_STATE;
                                key.getClass();
                            }
                            if (z) {
                                List list = AfMode.values;
                                ArrayList arrayList = focusMeteringControl.availableAfModes;
                                if (arrayList != null) {
                                    arrayList.contains(new AfMode(1));
                                }
                            }
                            anonymousClass1 = new Transition.AnonymousClass1();
                        } else {
                            anonymousClass1 = new Transition.AnonymousClass1();
                        }
                        completableDeferredImpl.makeCompleting$kotlinx_coroutines_core(anonymousClass1);
                    }
                }
                return Unit.INSTANCE;
            case 2:
                ViewfinderEmbeddedExternalSurfaceState viewfinderEmbeddedExternalSurfaceState = (ViewfinderEmbeddedExternalSurfaceState) obj4;
                Function1 function1 = (Function1) obj3;
                float[] fArr = (float[]) obj2;
                ViewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1 viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1 = (ViewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1) obj;
                if (!IntSize.m1055equalsimpl0(0L, 0L) && (surfaceTexture = viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1.getSurfaceTexture()) != null) {
                    surfaceTexture.setDefaultBufferSize(0, 0);
                }
                viewfinderEmbeddedExternalSurfaceState.getClass();
                if (viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1.getSurfaceTextureListener() != viewfinderEmbeddedExternalSurfaceState) {
                    function1.invoke(viewfinderEmbeddedExternalSurfaceState);
                    viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1.setSurfaceTextureListener(viewfinderEmbeddedExternalSurfaceState);
                }
                viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1.setOpaque(z);
                if (fArr != null) {
                    matrix = viewfinderEmbeddedExternalSurfaceState.matrix;
                    ColorKt.m691setFromEL8BTi8(matrix, fArr);
                }
                viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1.setTransform(matrix);
                return Unit.INSTANCE;
            case 3:
                AndroidImageBitmap androidImageBitmap = (AndroidImageBitmap) obj3;
                BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) obj2;
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.drawContent();
                CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
                if (!((Boolean) ((Function0) obj4).invoke()).booleanValue()) {
                    return Unit.INSTANCE;
                }
                if (z) {
                    long mo752getCenterF1C5BW0 = canvasDrawScope.mo752getCenterF1C5BW0();
                    GrpcMethod grpcMethod = canvasDrawScope.drawContext;
                    long m3999getSizeNHjbRc = grpcMethod.m3999getSizeNHjbRc();
                    grpcMethod.getCanvas().save();
                    try {
                        ((Extras.Key) grpcMethod.path).m1437scale0AR0LA0(-1.0f, 1.0f, mo752getCenterF1C5BW0);
                        DrawScope.m740drawImagegbVJVH8$default(layoutNodeDrawScope, androidImageBitmap, 0L, RecyclerView.DECELERATION_RATE, blendModeColorFilter, 0, 46);
                    } finally {
                        Recorder$$ExternalSyntheticOutline2.m(grpcMethod, m3999getSizeNHjbRc);
                    }
                } else {
                    DrawScope.m740drawImagegbVJVH8$default(layoutNodeDrawScope, androidImageBitmap, 0L, RecyclerView.DECELERATION_RATE, blendModeColorFilter, 0, 46);
                }
                return Unit.INSTANCE;
            case 4:
                return new ModalBottomSheetState((ModalBottomSheetValue) obj, (Density) obj4, (Function1) obj3, (AnimationSpec) obj2, this.f$3);
            case 5:
                Function0 function0 = (Function0) obj4;
                Function0 function02 = (Function0) obj3;
                Function1 function12 = (Function1) obj2;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                if (z) {
                    if (booleanValue) {
                        function0.invoke();
                    } else {
                        function02.invoke();
                    }
                }
                function12.invoke(bool);
                return Unit.INSTANCE;
            case 6:
                LazyPagingItems lazyPagingItems = (LazyPagingItems) obj4;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                LazyListScope.items$default(lazyListScope, ((ItemSnapshotList) lazyPagingItems.itemSnapshotList$delegate.getValue()).getSize(), null, new ComposableLambdaImpl(new FirstTimeBorrowKt$$ExternalSyntheticLambda2(lazyPagingItems, (Function1) obj3, (RealImageLoader) obj2, i2), true, 668291495), 6);
                if (z) {
                    LazyListScope.item$default(lazyListScope, null, null, ImageUtilsKt.lambda$1389457593, 3);
                }
                return Unit.INSTANCE;
            case 7:
                CardTheme cardTheme = (CardTheme) obj4;
                TouchData touchData = (TouchData) obj3;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindBoolean(0, Boolean.valueOf(z));
                androidStatement.bindBytes(1, cardTheme != null ? (byte[]) ((RecipientConfig$Adapter) localTabContentQueries.local_tab_contentAdapter).request_dataAdapter.encode(cardTheme) : null);
                androidStatement.bindBytes(2, (byte[]) ((RecipientConfig$Adapter) localTabContentQueries.local_tab_contentAdapter).pay_dataAdapter.encode(touchData));
                return Unit.INSTANCE;
            case 8:
                SuggestedRecipientsData suggestedRecipientsData = (SuggestedRecipientsData) obj4;
                SuggestedRecipientsData suggestedRecipientsData2 = (SuggestedRecipientsData) obj3;
                InstrumentQueries instrumentQueries = (InstrumentQueries) obj2;
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindBytes(0, suggestedRecipientsData != null ? (byte[]) ((RecipientConfig$Adapter) instrumentQueries.instrumentAdapter).pay_dataAdapter.encode(suggestedRecipientsData) : null);
                androidStatement2.bindBytes(1, suggestedRecipientsData2 != null ? (byte[]) ((RecipientConfig$Adapter) instrumentQueries.instrumentAdapter).request_dataAdapter.encode(suggestedRecipientsData2) : null);
                androidStatement2.bindBoolean(2, Boolean.valueOf(z));
                return Unit.INSTANCE;
            case 9:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindString(0, (String) obj3);
                androidStatement3.bindBoolean(1, Boolean.valueOf(z));
                androidStatement3.bindString(2, (String) ((Alias$Adapter) ((InstrumentQueries) obj4).instrumentAdapter).sync_stateAdapter.encode((UiAlias.Type) obj2));
                return Unit.INSTANCE;
            case 10:
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindString(0, (String) obj3);
                androidStatement4.bindBoolean(1, Boolean.valueOf(z));
                androidStatement4.bindString(2, (String) ((EnumListAdapter) ((InstrumentQueries) obj4).instrumentAdapter).enumColumnAdapter.encode((UiAlias.Type) obj2));
                return Unit.INSTANCE;
            case 11:
                Instrument$Adapter instrument$Adapter = (Instrument$Adapter) obj4;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) instrument$Adapter.card_brandAdapter;
                gpsConfigQueries.driver.execute(1549225587, "UPDATE gpsConfig\nSET consent_status = ?,\n    precise_enabled = ?", new GpsConfigQueries$$ExternalSyntheticLambda3(i3, (GpsConsentStatus) obj3, Boolean.valueOf(z), gpsConfigQueries));
                gpsConfigQueries.notifyQueries(1549225587, new GpsConfigQueries$$ExternalSyntheticLambda1(28));
                ref$BooleanRef.element = ((Number) ((SessionQueries) instrument$Adapter.balance_currencyAdapter).changes().executeAsOne()).longValue() > 0;
                return Unit.INSTANCE;
            case 12:
                Function0 function03 = (Function0) obj4;
                FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) obj3;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj2;
                if (z) {
                    function03.invoke();
                } else {
                    focusOwnerImpl.clearFocus(false);
                    if (delegatingSoftwareKeyboardController != null) {
                        delegatingSoftwareKeyboardController.hide();
                    }
                }
                return Unit.INSTANCE;
            case 13:
                String str = (String) obj3;
                MoneybotHomeViewModel.WidgetCard widgetCard = (MoneybotHomeViewModel.WidgetCard) obj4;
                Function1 function13 = (Function1) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, z ? CollectionsKt__CollectionsJVMKt.listOf(new CustomAccessibilityAction(str, new MoneybotHomeViewKt$$ExternalSyntheticLambda20(widgetCard, function13, 2))) : EmptyList.INSTANCE);
                return Unit.INSTANCE;
            case 14:
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                List list2 = ((RecentChatHistoryViewModel$Loaded) obj4).sessions;
                lazyListScope2.items(list2.size(), new VerifyCheckDepositPresenter$models$3$2(17, new MoneybotOverflowMenuViewKt$$ExternalSyntheticLambda22((SnapshotStateMap) obj3, i3), list2), new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list2, 3), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(16, (Function1) obj2, list2), true, 802480018));
                if (z) {
                    LazyListScope.item$default(lazyListScope2, null, null, ExpandableContentKt.f504lambda$975659728, 3);
                }
                return Unit.INSTANCE;
            case 15:
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                Function1 function14 = (Function1) obj4;
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver2, 0);
                if (str2 != null) {
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, str2);
                }
                if (z) {
                    SemanticsPropertiesKt.onClick(semanticsPropertyReceiver2, str3, new HomeViewKt$$ExternalSyntheticLambda8(1 == true ? 1 : 0, function14));
                }
                return Unit.INSTANCE;
            case 16:
                HistoricalRange historicalRange = (HistoricalRange) obj3;
                Function1 function15 = (Function1) obj2;
                FilterBarScope filterBarScope = (FilterBarScope) obj;
                filterBarScope.getClass();
                for (HistoricalRange historicalRange2 : (List) obj4) {
                    boolean z2 = historicalRange2 == historicalRange;
                    FilterBarScope.legacyChip$default(filterBarScope, new ProfileKt$$ExternalSyntheticLambda11(9, function15, historicalRange2), Modifier.Companion.$$INSTANCE, !z, z2, null, historicalRange2, new ComposableLambdaImpl(new MoneybotUiFactory$$ExternalSyntheticLambda3(historicalRange2, z2), true, 1422930056), 16);
                }
                return Unit.INSTANCE;
            case 17:
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                return new RecurringReloadConfigurationScreen(askedQuestion, new RecurringReloadConfigurationScreen.Mode.BalanceBased((Money) obj4, (Money) obj3, z, ((BalanceBasedAutoReloadConfirmationScreen) ((InstrumentDetailsPresenter) obj2).ioDispatcher).blockersData.flowToken));
            case 18:
                AddMoneyViewModel.AtmPicker.AmountPickerItem amountPickerItem = (AddMoneyViewModel.AtmPicker.AmountPickerItem) obj4;
                Function1 function16 = (Function1) obj3;
                Function0 function04 = (Function0) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                String accessibilityLabel = amountPickerItem.getAccessibilityLabel();
                if (accessibilityLabel != null) {
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver3, accessibilityLabel);
                }
                SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver3, amountPickerItem.getSelected());
                if (z) {
                    SemanticsPropertiesKt.onClick(semanticsPropertyReceiver3, null, new BasicShieetScope$$ExternalSyntheticLambda10(25, function16, amountPickerItem, function04));
                }
                return Unit.INSTANCE;
            case 19:
                Function1 function17 = (Function1) obj4;
                Function1 function18 = (Function1) obj3;
                Function1 function19 = (Function1) obj2;
                WorkWebViewEvent workWebViewEvent = (WorkWebViewEvent) obj;
                workWebViewEvent.getClass();
                if (workWebViewEvent instanceof WorkWebViewEvent.PageStarted) {
                    function17.invoke(workWebViewEvent);
                } else if (Intrinsics.areEqual(workWebViewEvent, WorkWebViewEvent.PageFinished.INSTANCE)) {
                    if (!z) {
                        function18.invoke(Boolean.FALSE);
                    }
                } else if (workWebViewEvent instanceof WorkWebViewEvent.PageError) {
                    function19.invoke(Boolean.TRUE);
                    function18.invoke(Boolean.FALSE);
                    function17.invoke(workWebViewEvent);
                } else {
                    if (!Intrinsics.areEqual(workWebViewEvent, WorkWebViewEvent.Close.INSTANCE) && !Intrinsics.areEqual(workWebViewEvent, WorkWebViewEvent.ExitWebView.INSTANCE) && !Intrinsics.areEqual(workWebViewEvent, WorkWebViewEvent.RetryLoad.INSTANCE) && !(workWebViewEvent instanceof WorkWebViewEvent.WebResult)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    function17.invoke(workWebViewEvent);
                }
                return Unit.INSTANCE;
            case 20:
                IntegrationWorkflow integrationWorkflow = (IntegrationWorkflow) obj4;
                IntegrationWorkflow.Input input = (IntegrationWorkflow.Input) obj3;
                IntegrationWorkflow$State$Starting integrationWorkflow$State$Starting = (IntegrationWorkflow$State$Starting) obj2;
                IntegrationBrowserWorker$Output$Complete integrationBrowserWorker$Output$Complete = (IntegrationBrowserWorker$Output$Complete) obj;
                integrationBrowserWorker$Output$Complete.getClass();
                if (integrationBrowserWorker$Output$Complete instanceof IntegrationBrowserWorker$Output$Complete) {
                    TrackingEventsLogger.DefaultImpls.logIntegrationEvent$default(integrationWorkflow.trackingEventsLogger, new IntegrationEventData(IntegrationState.Complete, input.flowUrl, Boolean.valueOf(z), null, 8, null), false, 2, null);
                    return Workflows.action$default(integrationWorkflow, new HCaptcha$$ExternalSyntheticLambda2(integrationWorkflow$State$Starting, 23));
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 21:
                PermissionRequestWorkflow permissionRequestWorkflow = (PermissionRequestWorkflow) obj4;
                PermissionRequestWorkflow.Props props = (PermissionRequestWorkflow.Props) obj3;
                StatefulWorkflow.RenderContext renderContext = (StatefulWorkflow.RenderContext) obj2;
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                if (z) {
                    permissionRequestWorkflow.complete(updater, new PermissionState(props.permission, PermissionResult.PermissionRejected));
                } else {
                    renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(permissionRequestWorkflow, new SelfieWorkflow$$ExternalSyntheticLambda79(13)));
                }
                return Unit.INSTANCE;
            default:
                UiWorkflow uiWorkflow = (UiWorkflow) obj4;
                PermissionRequestWorkflow.Output output = (PermissionRequestWorkflow.Output) obj;
                output.getClass();
                return Workflows.action$default(uiWorkflow, new MenuKt$$ExternalSyntheticLambda0(output, (StatefulWorkflow.RenderContext) obj3, uiWorkflow, this.f$3, (UiState) obj2, 8));
        }
    }

    public /* synthetic */ UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = z;
        this.f$2 = obj3;
    }

    public /* synthetic */ UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$3 = z;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(String str, boolean z, TransacterImpl transacterImpl, UiAlias.Type type2, int i) {
        this.$r8$classId = i;
        this.f$1 = str;
        this.f$3 = z;
        this.f$0 = transacterImpl;
        this.f$2 = type2;
    }

    public /* synthetic */ UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = z;
    }

    public /* synthetic */ UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$3 = z;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(boolean z, String str, MoneybotHomeViewModel.WidgetCard widgetCard, Function1 function1) {
        this.$r8$classId = 13;
        this.f$3 = z;
        this.f$1 = str;
        this.f$0 = widgetCard;
        this.f$2 = function1;
    }
}
