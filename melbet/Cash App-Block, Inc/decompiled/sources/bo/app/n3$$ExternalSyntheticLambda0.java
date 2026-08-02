package bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.camera.camera2.impl.StillCaptureRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.video.Recorder;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureResult;
import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda2;
import androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$lambda$18$0$$inlined$onDispose$1;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.credentials.CreatePublicKeyCredentialResponse;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda7;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.internal.NavControllerImpl;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.db.Local_tab_content;
import app.cash.local.primitives.BrandToken;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda6;
import app.cash.local.viewmodels.KeyValue;
import app.cash.local.viewmodels.LocalAddBrandsViewModel;
import app.cash.local.viewmodels.LocalCheckoutPaymentTimingViewModel;
import app.cash.local.viewmodels.LocalCheckoutSpecialInstructionsViewModel;
import app.cash.local.viewmodels.LocalOpenTabCheckoutViewModel;
import app.cash.local.views.ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda28;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import app.cash.local.views.brand.checkout.LocalOpenTabCheckoutViewKt$$ExternalSyntheticLambda7;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.PlacedItem;
import app.cash.molecule.PlatformKt;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.driver.android.AndroidStatement;
import app.cash.zipline.Call;
import app.cash.zipline.CallResult;
import app.cash.zipline.ZiplineManifest;
import app.cash.zipline.internal.bridge.InboundService;
import app.cash.zipline.loader.ZiplineCache;
import app.cash.zipline.loader.internal.cache.Files;
import app.cash.zipline.loader.internal.cache.ziplineloader.DatabaseImpl;
import app.cash.zipline.loader.internal.fetcher.LoadedManifest;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.intercept.EngineInterceptor$intercept$2;
import coil3.network.NetworkFetcher$fetch$2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.braze.storage.ICardStorageProvider;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda4;
import com.squareup.cash.amountchooser.views.AmountKeypadState;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.LazyScaffoldContentScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.avatar.components.BadgedAvatarKt$$ExternalSyntheticLambda4;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.banking.applets.views.BalanceAppletTileKt$$ExternalSyntheticLambda4;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.billssubscriptions.viewmodels.BillsSubscriptionsMerchantListViewModel$Loaded;
import com.squareup.cash.billssubscriptions.viewmodels.model.MerchantSection;
import com.squareup.cash.blockers.viewmodels.CashtagViewEvent;
import com.squareup.cash.blockers.viewmodels.CashtagViewModel;
import com.squareup.cash.blockers.viewmodels.SsnViewEvent;
import com.squareup.cash.blockers.viewmodels.SsnViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db.EnumListAdapter;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.cash.scrubbing.InsertingScrubber;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.session.backend.DbSessionManagerKt;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.cash.work.views.shift.ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3;
import com.squareup.protos.cash.badging.api.ItemType;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheetResponse;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalCashActivity;
import com.squareup.protos.cash.local.client.v1.LocalCashInformationalContent;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.wire.GrpcMethod;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final /* synthetic */ class n3$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ n3$$ExternalSyntheticLambda0(ArrayList arrayList, Ref$IntRef ref$IntRef, List list, int i, LazyGridMeasureResult lazyGridMeasureResult) {
        this.$r8$classId = 4;
        this.f$0 = arrayList;
        this.f$1 = ref$IntRef;
        this.f$2 = list;
        this.f$3 = lazyGridMeasureResult;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String obj2;
        TextFieldValue m1002copy3r_uNRQ$default;
        String obj3;
        String obj4;
        int i = this.$r8$classId;
        int i2 = 4;
        String str = "";
        final int i3 = 2;
        final int i4 = 0;
        int i5 = 0;
        Object obj5 = this.f$3;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        Object obj8 = this.f$0;
        switch (i) {
            case 0:
                return n3.a((a9) obj8, (ICardStorageProvider) obj7, (e9) obj6, (JSONArray) obj5, obj);
            case 1:
                StillCaptureRequestControl stillCaptureRequestControl = (StillCaptureRequestControl) obj8;
                Deferred deferred = (Deferred) obj7;
                StillCaptureRequestControl.CaptureRequest captureRequest = (StillCaptureRequestControl.CaptureRequest) obj6;
                UseCaseCameraRequestControl useCaseCameraRequestControl = (UseCaseCameraRequestControl) obj5;
                Throwable th = (Throwable) obj;
                if ((th instanceof ImageCaptureException) && ((ImageCaptureException) th).mImageCaptureError == 3) {
                    JobKt.launch$default(stillCaptureRequestControl.threads.sequentialScope, null, null, new EngineInterceptor$intercept$2(stillCaptureRequestControl, useCaseCameraRequestControl, captureRequest, null, 1), 3);
                } else {
                    CompletableDeferredImpl completableDeferredImpl = captureRequest.result;
                    deferred.getClass();
                    if (th == null) {
                        completableDeferredImpl.complete(deferred.getCompleted());
                    } else if (th instanceof CancellationException) {
                        completableDeferredImpl.cancel((CancellationException) th);
                    } else {
                        completableDeferredImpl.completeExceptionally(th);
                    }
                }
                return Unit.INSTANCE;
            case 2:
                InfiniteTransition infiniteTransition = (InfiniteTransition) obj7;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj6;
                CoroutineScope coroutineScope = (CoroutineScope) obj5;
                long longValue = ((Long) obj).longValue();
                State state = (State) ((MutableState) obj8).getValue();
                long longValue2 = state != null ? ((Number) state.getValue()).longValue() : longValue;
                long j = infiniteTransition.startTimeNanos;
                MutableVector mutableVector = infiniteTransition._animations;
                if (j == Long.MIN_VALUE || ref$FloatRef.element != AnimatableKt.getDurationScale(coroutineScope.getCoroutineContext())) {
                    infiniteTransition.startTimeNanos = longValue;
                    Object[] objArr = mutableVector.content;
                    int i6 = mutableVector.size;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((InfiniteTransition.TransitionAnimationState) objArr[i7]).startOnTheNextFrame = true;
                    }
                    ref$FloatRef.element = AnimatableKt.getDurationScale(coroutineScope.getCoroutineContext());
                }
                float f = ref$FloatRef.element;
                if (f == RecyclerView.DECELERATION_RATE) {
                    Object[] objArr2 = mutableVector.content;
                    int i8 = mutableVector.size;
                    while (i4 < i8) {
                        InfiniteTransition.TransitionAnimationState transitionAnimationState = (InfiniteTransition.TransitionAnimationState) objArr2[i4];
                        transitionAnimationState.value$delegate.setValue(transitionAnimationState.animation.mutableTargetValue);
                        transitionAnimationState.startOnTheNextFrame = true;
                        i4++;
                    }
                } else {
                    long j2 = (long) ((longValue2 - infiniteTransition.startTimeNanos) / f);
                    Object[] objArr3 = mutableVector.content;
                    int i9 = mutableVector.size;
                    boolean z = true;
                    for (int i10 = 0; i10 < i9; i10++) {
                        InfiniteTransition.TransitionAnimationState transitionAnimationState2 = (InfiniteTransition.TransitionAnimationState) objArr3[i10];
                        if (!transitionAnimationState2.isFinished) {
                            InfiniteTransition.this.refreshChildNeeded$delegate.setValue(Boolean.FALSE);
                            if (transitionAnimationState2.startOnTheNextFrame) {
                                transitionAnimationState2.startOnTheNextFrame = false;
                                transitionAnimationState2.playTimeNanosOffset = j2;
                            }
                            long j3 = j2 - transitionAnimationState2.playTimeNanosOffset;
                            transitionAnimationState2.value$delegate.setValue(transitionAnimationState2.animation.getValueFromNanos(j3));
                            transitionAnimationState2.isFinished = transitionAnimationState2.animation.isFinishedFromNanos(j3);
                        }
                        if (!transitionAnimationState2.isFinished) {
                            z = false;
                        }
                    }
                    infiniteTransition.isRunning$delegate.setValue(Boolean.valueOf(!z));
                }
                return Unit.INSTANCE;
            case 3:
                Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) obj8;
                MouseWheelScrollingLogic mouseWheelScrollingLogic = (MouseWheelScrollingLogic) obj7;
                ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1 = (ScrollingLogic$nestedScrollScope$1) obj6;
                OverlayKt$$ExternalSyntheticLambda3 overlayKt$$ExternalSyntheticLambda3 = (OverlayKt$$ExternalSyntheticLambda3) obj5;
                AnimationScope animationScope = (AnimationScope) obj;
                float floatValue = ((Number) animationScope.value$delegate.getValue()).floatValue() - ref$FloatRef2.element;
                if (!Draggable2DKt.access$isLowScrollingDelta(floatValue)) {
                    if (!Draggable2DKt.access$isLowScrollingDelta(floatValue - mouseWheelScrollingLogic.dispatchMouseWheelScroll(scrollingLogic$nestedScrollScope$1, floatValue))) {
                        animationScope.cancelAnimation();
                        return Unit.INSTANCE;
                    }
                    ref$FloatRef2.element += floatValue;
                }
                if (((Boolean) overlayKt$$ExternalSyntheticLambda3.invoke(Float.valueOf(ref$FloatRef2.element))).booleanValue()) {
                    animationScope.cancelAnimation();
                }
                return Unit.INSTANCE;
            case 4:
                List list = (List) obj8;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj7;
                List list2 = (List) obj6;
                LazyGridMeasureResult lazyGridMeasureResult = (LazyGridMeasureResult) obj5;
                PrefetchHandleProvider$HandleAndRequestImpl prefetchHandleProvider$HandleAndRequestImpl = (PrefetchHandleProvider$HandleAndRequestImpl) obj;
                SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = prefetchHandleProvider$HandleAndRequestImpl.precomposeHandle;
                int placeablesCount = precomposedSlotHandle != null ? precomposedSlotHandle.getPlaceablesCount() : 0;
                int i11 = 0;
                for (int i12 = 0; i12 < placeablesCount; i12++) {
                    Orientation orientation = lazyGridMeasureResult.orientation;
                    Orientation orientation2 = Orientation.Vertical;
                    SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle2 = prefetchHandleProvider$HandleAndRequestImpl.precomposeHandle;
                    i11 += (int) (orientation == orientation2 ? (precomposedSlotHandle2 != null ? precomposedSlotHandle2.mo848getSizeYEO4UFw(i12) : 0L) & BodyPartID.bodyIdMax : (precomposedSlotHandle2 != null ? precomposedSlotHandle2.mo848getSizeYEO4UFw(i12) : 0L) >> 32);
                }
                if (list != null) {
                    list.add(Integer.valueOf(i11));
                }
                if (ref$IntRef.element != list2.size()) {
                    ref$IntRef.element++;
                }
                return Unit.INSTANCE;
            case 5:
                LegacyTextFieldState legacyTextFieldState = (LegacyTextFieldState) obj8;
                TextInputService textInputService = (TextInputService) obj7;
                TextFieldValue textFieldValue = (TextFieldValue) obj6;
                ImeOptions imeOptions = (ImeOptions) obj5;
                if (legacyTextFieldState.getHasFocus()) {
                    Recorder.AnonymousClass1 anonymousClass1 = legacyTextFieldState.processor;
                    CoreTextFieldKt$$ExternalSyntheticLambda2 coreTextFieldKt$$ExternalSyntheticLambda2 = legacyTextFieldState.onValueChange;
                    CoreTextFieldKt$$ExternalSyntheticLambda2 coreTextFieldKt$$ExternalSyntheticLambda22 = legacyTextFieldState.onImeActionPerformed;
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0 = new MenuKt$$ExternalSyntheticLambda0(9, anonymousClass1, coreTextFieldKt$$ExternalSyntheticLambda2, ref$ObjectRef);
                    PlatformTextInputService platformTextInputService = textInputService.platformTextInputService;
                    platformTextInputService.startInput(textFieldValue, imeOptions, menuKt$$ExternalSyntheticLambda0, coreTextFieldKt$$ExternalSyntheticLambda22);
                    TextInputSession textInputSession = new TextInputSession(textInputService, platformTextInputService);
                    textInputService._currentInputSession.set(textInputSession);
                    ref$ObjectRef.element = textInputSession;
                    legacyTextFieldState.inputSession = textInputSession;
                }
                return new CoreTextFieldKt$CoreTextField$lambda$18$0$$inlined$onDispose$1();
            case 6:
                Function0 function0 = (Function0) obj7;
                TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) obj6;
                TextToolbarState textToolbarState = (TextToolbarState) obj5;
                TextContextMenuSession textContextMenuSession = (TextContextMenuSession) obj;
                ((Function0) obj8).invoke();
                if (function0 != null ? ((Boolean) function0.invoke()).booleanValue() : true) {
                    textContextMenuSession.close();
                }
                textFieldSelectionState.setTextToolbarState(textToolbarState);
                return Unit.INSTANCE;
            case 7:
                CancellationSignal cancellationSignal = (CancellationSignal) obj8;
                CreatePublicKeyCredentialController createPublicKeyCredentialController = (CreatePublicKeyCredentialController) obj7;
                Context context = createPublicKeyCredentialController.context;
                Executor executor = (Executor) obj6;
                CredentialManagerCallback credentialManagerCallback = (CredentialManagerCallback) obj5;
                CreateCredentialHandle createCredentialHandle = (CreateCredentialHandle) obj;
                PendingIntent pendingIntent = createCredentialHandle.pendingIntent;
                CreateCredentialResponse createCredentialResponse = createCredentialHandle.createCredentialResponse;
                if (pendingIntent == null && createCredentialResponse == null) {
                    CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                    if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                        executor.execute(new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0(credentialManagerCallback, 9));
                    }
                    return Unit.INSTANCE;
                }
                if (pendingIntent != null) {
                    Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                    CredentialProviderController.generateHiddenActivityIntent(createPublicKeyCredentialController.resultReceiver, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                        if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                            Executor executor2 = createPublicKeyCredentialController.executor;
                            if (executor2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("executor");
                                throw null;
                            }
                            executor2.execute(new CreatePublicKeyCredentialController$$ExternalSyntheticLambda7(createPublicKeyCredentialController, 1));
                        }
                    }
                }
                if (createCredentialResponse != null) {
                    androidx.credentials.CreateCredentialResponse createFrom = DbSessionManagerKt.createFrom(createCredentialResponse.data, createCredentialResponse.f991type);
                    if (createFrom instanceof CreatePublicKeyCredentialResponse) {
                        CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                        if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                            executor.execute(new DispatchQueue$$ExternalSyntheticLambda0(8, credentialManagerCallback, (CreatePublicKeyCredentialResponse) createFrom));
                        }
                        return Unit.INSTANCE;
                    }
                }
                if (pendingIntent == null) {
                    CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                    if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                        executor.execute(new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0(credentialManagerCallback, 8));
                    }
                }
                return Unit.INSTANCE;
            case 8:
                CancellationSignal cancellationSignal2 = (CancellationSignal) obj8;
                GetCredentialController getCredentialController = (GetCredentialController) obj7;
                Context context2 = getCredentialController.context;
                Executor executor3 = (Executor) obj6;
                CredentialManagerCallback credentialManagerCallback2 = (CredentialManagerCallback) obj5;
                PendingGetCredentialHandle pendingGetCredentialHandle = (PendingGetCredentialHandle) obj;
                CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal2)) {
                    return Unit.INSTANCE;
                }
                Intent intent2 = new Intent(context2, (Class<?>) HiddenActivity.class);
                CredentialProviderController.generateHiddenActivityIntent(getCredentialController.resultReceiver, intent2, "BEGIN_SIGN_IN");
                intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingGetCredentialHandle.pendingIntent);
                try {
                    context2.startActivity(intent2);
                } catch (Exception unused2) {
                    CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                    if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal2)) {
                        executor3.execute(new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0(credentialManagerCallback2, 10));
                    }
                }
                return Unit.INSTANCE;
            case 9:
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                navBackStackEntry.getClass();
                ((Ref$BooleanRef) obj8).element = true;
                ((NavControllerImpl) obj7).addEntryToBackStack((NavDestination) obj6, (Bundle) obj5, navBackStackEntry, EmptyList.INSTANCE);
                return Unit.INSTANCE;
            case 10:
                LocalCashInformationalContent localCashInformationalContent = (LocalCashInformationalContent) obj8;
                LocalCashActivity localCashActivity = (LocalCashActivity) obj7;
                GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks howItWorks = (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks) obj6;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj5;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindBytes(0, localCashInformationalContent != null ? (byte[]) ((WireAdapter) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).path).encode(localCashInformationalContent) : null);
                androidStatement.bindBytes(1, localCashActivity != null ? (byte[]) ((WireAdapter) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).requestAdapter).encode(localCashActivity) : null);
                androidStatement.bindBytes(2, howItWorks != null ? (byte[]) ((WireAdapter) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).responseAdapter).encode(howItWorks) : null);
                return Unit.INSTANCE;
            case 11:
                final LocalOpenTabCheckoutViewModel localOpenTabCheckoutViewModel = (LocalOpenTabCheckoutViewModel) obj8;
                Function1 function1 = (Function1) obj5;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                LazyListScope.item$default(lazyListScope, null, "open_tab_checkout_buyer_info", new ComposableLambdaImpl(new ComposeDialogKt$$ExternalSyntheticLambda12(localOpenTabCheckoutViewModel, (TextFieldState) obj7, (TextFieldState) obj6, function1, 6), true, 1014588885), 1);
                LazyListScope.item$default(lazyListScope, null, "open_tab_checkout_divider", CheckoutTipSectionKt.lambda$183847628, 1);
                LazyListScope.item$default(lazyListScope, null, "open_tab_checkout_info_entry", new ComposableLambdaImpl(new ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda28(localOpenTabCheckoutViewModel, function1, r14 ? 1 : 0), true, 234532621), 1);
                LazyListScope.item$default(lazyListScope, null, "open_tab_checkout_divider", CheckoutTipSectionKt.lambda$285217614, 1);
                LazyListScope.item$default(lazyListScope, null, "open_tab_checkout_info_entry", new ComposableLambdaImpl(new ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda28(localOpenTabCheckoutViewModel, function1, i3), true, 335902607), 1);
                LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel = localOpenTabCheckoutViewModel.specialInstructions;
                if (localCheckoutSpecialInstructionsViewModel != null) {
                    LazyListScope.item$default(lazyListScope, null, "open_tab_checkout_special_instructions", new ComposableLambdaImpl(new LocalOpenTabCheckoutViewKt$$ExternalSyntheticLambda7(localCheckoutSpecialInstructionsViewModel, function1, i4), true, 186739847), 1);
                }
                LazyListScope.item$default(lazyListScope, null, "open_tab_checkout_divider", new ComposableLambdaImpl(new Function3() { // from class: app.cash.local.views.brand.checkout.LocalOpenTabCheckoutViewKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj9, Object obj10, Object obj11) {
                        int i13 = i4;
                        LocalOpenTabCheckoutViewModel localOpenTabCheckoutViewModel2 = localOpenTabCheckoutViewModel;
                        switch (i13) {
                            case 0:
                                Composer composer = (Composer) obj10;
                                int intValue = ((Integer) obj11).intValue();
                                ((LazyItemScopeImpl) obj9).getClass();
                                GapComposer gapComposer = (GapComposer) composer;
                                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel2 = localOpenTabCheckoutViewModel2.specialInstructions;
                                    ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, localCheckoutSpecialInstructionsViewModel2 != null && localCheckoutSpecialInstructionsViewModel2.notes.length() > 0 ? 24.0f : LocalOpenTabCheckoutViewKt.OpenTabCheckoutCompensatedVerticalPadding, RecyclerView.DECELERATION_RATE, 24.0f, 5));
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                Composer composer2 = (Composer) obj10;
                                int intValue2 = ((Integer) obj11).intValue();
                                ((LazyItemScopeImpl) obj9).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
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
                                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                    LocalMapKt.KeyValueRow(null, new KeyValue(Room.stringResource(gapComposer2, R.string.local_views_subtotal), localOpenTabCheckoutViewModel2.subtotalAmount, 12, false), gapComposer2, 0, 1);
                                    if (localOpenTabCheckoutViewModel2.paymentTiming.selectedOption == LocalCheckoutPaymentTimingViewModel.Option.PAY_AT_END) {
                                        gapComposer2.startReplaceGroup(927396087);
                                        Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                                        String stringResource = Room.stringResource(gapComposer2, R.string.local_views_open_tab_pay_at_end_summary);
                                        TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                        } else {
                                            gapComposer2.startReplaceGroup(-1762997739);
                                            gapComposer2.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.subtle, (Composer) gapComposer2, m302paddingqDBjuR0$default2, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(927689626);
                                        gapComposer2.end(false);
                                    }
                                    gapComposer2.end(true);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                Composer composer3 = (Composer) obj10;
                                int intValue3 = ((Integer) obj11).intValue();
                                ((LazyItemScopeImpl) obj9).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    CheckoutTipSectionKt.m1302CheckoutOrderSummarySectionyrwZFoE(localOpenTabCheckoutViewModel2.orderSummary, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), null, null, 0L, gapComposer3, 48, 28);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, true, 386587600), 1);
                LazyListScope.item$default(lazyListScope, null, "open_tab_checkout_order_summary", new ComposableLambdaImpl(new Function3() { // from class: app.cash.local.views.brand.checkout.LocalOpenTabCheckoutViewKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj9, Object obj10, Object obj11) {
                        int i13 = i3;
                        LocalOpenTabCheckoutViewModel localOpenTabCheckoutViewModel2 = localOpenTabCheckoutViewModel;
                        switch (i13) {
                            case 0:
                                Composer composer = (Composer) obj10;
                                int intValue = ((Integer) obj11).intValue();
                                ((LazyItemScopeImpl) obj9).getClass();
                                GapComposer gapComposer = (GapComposer) composer;
                                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel2 = localOpenTabCheckoutViewModel2.specialInstructions;
                                    ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, localCheckoutSpecialInstructionsViewModel2 != null && localCheckoutSpecialInstructionsViewModel2.notes.length() > 0 ? 24.0f : LocalOpenTabCheckoutViewKt.OpenTabCheckoutCompensatedVerticalPadding, RecyclerView.DECELERATION_RATE, 24.0f, 5));
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                Composer composer2 = (Composer) obj10;
                                int intValue2 = ((Integer) obj11).intValue();
                                ((LazyItemScopeImpl) obj9).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
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
                                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                    LocalMapKt.KeyValueRow(null, new KeyValue(Room.stringResource(gapComposer2, R.string.local_views_subtotal), localOpenTabCheckoutViewModel2.subtotalAmount, 12, false), gapComposer2, 0, 1);
                                    if (localOpenTabCheckoutViewModel2.paymentTiming.selectedOption == LocalCheckoutPaymentTimingViewModel.Option.PAY_AT_END) {
                                        gapComposer2.startReplaceGroup(927396087);
                                        Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                                        String stringResource = Room.stringResource(gapComposer2, R.string.local_views_open_tab_pay_at_end_summary);
                                        TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                        } else {
                                            gapComposer2.startReplaceGroup(-1762997739);
                                            gapComposer2.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.subtle, (Composer) gapComposer2, m302paddingqDBjuR0$default2, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(927689626);
                                        gapComposer2.end(false);
                                    }
                                    gapComposer2.end(true);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                Composer composer3 = (Composer) obj10;
                                int intValue3 = ((Integer) obj11).intValue();
                                ((LazyItemScopeImpl) obj9).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    CheckoutTipSectionKt.m1302CheckoutOrderSummarySectionyrwZFoE(localOpenTabCheckoutViewModel2.orderSummary, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), null, null, 0L, gapComposer3, 48, 28);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, true, 437272593), 1);
                final int i13 = r14 ? 1 : 0;
                LazyListScope.item$default(lazyListScope, null, "open_tab_checkout_extra_lines", new ComposableLambdaImpl(new Function3() { // from class: app.cash.local.views.brand.checkout.LocalOpenTabCheckoutViewKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj9, Object obj10, Object obj11) {
                        int i132 = i13;
                        LocalOpenTabCheckoutViewModel localOpenTabCheckoutViewModel2 = localOpenTabCheckoutViewModel;
                        switch (i132) {
                            case 0:
                                Composer composer = (Composer) obj10;
                                int intValue = ((Integer) obj11).intValue();
                                ((LazyItemScopeImpl) obj9).getClass();
                                GapComposer gapComposer = (GapComposer) composer;
                                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel2 = localOpenTabCheckoutViewModel2.specialInstructions;
                                    ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, localCheckoutSpecialInstructionsViewModel2 != null && localCheckoutSpecialInstructionsViewModel2.notes.length() > 0 ? 24.0f : LocalOpenTabCheckoutViewKt.OpenTabCheckoutCompensatedVerticalPadding, RecyclerView.DECELERATION_RATE, 24.0f, 5));
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                Composer composer2 = (Composer) obj10;
                                int intValue2 = ((Integer) obj11).intValue();
                                ((LazyItemScopeImpl) obj9).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
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
                                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                    LocalMapKt.KeyValueRow(null, new KeyValue(Room.stringResource(gapComposer2, R.string.local_views_subtotal), localOpenTabCheckoutViewModel2.subtotalAmount, 12, false), gapComposer2, 0, 1);
                                    if (localOpenTabCheckoutViewModel2.paymentTiming.selectedOption == LocalCheckoutPaymentTimingViewModel.Option.PAY_AT_END) {
                                        gapComposer2.startReplaceGroup(927396087);
                                        Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                                        String stringResource = Room.stringResource(gapComposer2, R.string.local_views_open_tab_pay_at_end_summary);
                                        TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                        } else {
                                            gapComposer2.startReplaceGroup(-1762997739);
                                            gapComposer2.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.subtle, (Composer) gapComposer2, m302paddingqDBjuR0$default2, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(927689626);
                                        gapComposer2.end(false);
                                    }
                                    gapComposer2.end(true);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                Composer composer3 = (Composer) obj10;
                                int intValue3 = ((Integer) obj11).intValue();
                                ((LazyItemScopeImpl) obj9).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    CheckoutTipSectionKt.m1302CheckoutOrderSummarySectionyrwZFoE(localOpenTabCheckoutViewModel2.orderSummary, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), null, null, 0L, gapComposer3, 48, 28);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, true, 487957586), 1);
                return Unit.INSTANCE;
            case 12:
                LocalAddBrandsViewModel localAddBrandsViewModel = (LocalAddBrandsViewModel) obj8;
                Function1 function12 = (Function1) obj5;
                LazyGridIntervalContent lazyGridIntervalContent = (LazyGridIntervalContent) obj;
                lazyGridIntervalContent.getClass();
                int i14 = 18;
                LazyGridIntervalContent.item$default(lazyGridIntervalContent, null, new LocationMenu$$ExternalSyntheticLambda6(i14), new ComposableLambdaImpl(new LocalViewFactory$$ExternalSyntheticLambda6(9, (TextFieldState) obj7, (SearchBarKeyboardState) obj6, function12), true, -1423208190), 5);
                LazyGridIntervalContent.item$default(lazyGridIntervalContent, null, new LocationMenu$$ExternalSyntheticLambda6(19), new ComposableLambdaImpl(new SliderDefaults$$ExternalSyntheticLambda3(localAddBrandsViewModel, i14), true, 35734329), 5);
                ArrayList<LocalAddBrandsViewModel.BrandCard> arrayList = localAddBrandsViewModel.brandCards;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                for (LocalAddBrandsViewModel.BrandCard brandCard : arrayList) {
                    LazyGridIntervalContent.item$default(lazyGridIntervalContent, new BrandToken(brandCard.brandToken), null, new ComposableLambdaImpl(new PagerDefaults$$ExternalSyntheticLambda0(26, brandCard, function12), true, 1597743764), 6);
                    arrayList2.add(Unit.INSTANCE);
                }
                LazyGridIntervalContent.item$default(lazyGridIntervalContent, null, new LocationMenu$$ExternalSyntheticLambda6(20), LocalAddBrandsViewKt.lambda$2095656826, 5);
                return Unit.INSTANCE;
            case 13:
                ArrayList arrayList3 = (ArrayList) obj8;
                ArrayList arrayList4 = (ArrayList) obj7;
                ArrayList arrayList5 = (ArrayList) obj6;
                int[] iArr = (int[]) obj5;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                placementScope.getClass();
                int size = arrayList3.size();
                for (int i15 = 0; i15 < size; i15++) {
                    PlacedItem placedItem = (PlacedItem) arrayList3.get(i15);
                    int intValue = ((Number) arrayList5.get(placedItem.lineIndex)).intValue();
                    int i16 = iArr[placedItem.lineIndex];
                    Placeable placeable = placedItem.placeable;
                    placementScope.placeRelative(placeable, placedItem.x, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(intValue, placeable.height, 2, i16), RecyclerView.DECELERATION_RATE);
                }
                int size2 = arrayList4.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    PlacedItem placedItem2 = (PlacedItem) arrayList4.get(i17);
                    int intValue2 = ((Number) arrayList5.get(placedItem2.lineIndex)).intValue();
                    int i18 = iArr[placedItem2.lineIndex];
                    Placeable placeable2 = placedItem2.placeable;
                    placementScope.placeRelative(placeable2, placedItem2.x, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(intValue2, placeable2.height, 2, i18), RecyclerView.DECELERATION_RATE);
                }
                return Unit.INSTANCE;
            case 14:
                String str2 = (String) obj8;
                RealSheetState realSheetState = (RealSheetState) obj7;
                MutableState mutableState = (MutableState) obj6;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj5;
                ((Density) obj).getClass();
                return new IntOffset(((str2 == null || ((Boolean) mutableState.getValue()).booleanValue()) ? parcelableSnapshotMutableIntState.getIntValue() : (int) (realSheetState.getExpandProgress() * parcelableSnapshotMutableIntState.getIntValue())) & BodyPartID.bodyIdMax);
            case 15:
                Call call = (Call) obj;
                call.getClass();
                ((InboundService) obj8).endpoint.eventListener.callEnd((Call) obj7, new CallResult(obj6, call.encodedCall, call.serviceNames), obj5);
                return Unit.INSTANCE;
            case 16:
                ZiplineCache ziplineCache = (ZiplineCache) obj8;
                String str3 = (String) obj7;
                Files files = (Files) obj5;
                ((TransactionWrapper) obj).getClass();
                DatabaseImpl databaseImpl = ziplineCache.database;
                databaseImpl.pinsQueries.delete_application_pins(str3);
                Iterator it = ((LoadedManifest) obj6).manifest.modules.entrySet().iterator();
                while (it.hasNext()) {
                    Files files2 = (Files) databaseImpl.filesQueries.get(((ZiplineManifest.Module) ((Map.Entry) it.next()).getValue()).sha256.hex()).executeAsOneOrNull();
                    if (files2 != null) {
                        ziplineCache.createPinIfNotExists(files2.id, str3);
                    }
                }
                ziplineCache.createPinIfNotExists(files.id, str3);
                return Unit.INSTANCE;
            case 17:
                ActivityItemViewModel activityItemViewModel = (ActivityItemViewModel) obj7;
                Function1 function13 = (Function1) obj6;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, (String) obj8, new BalanceFeedKt$$ExternalSyntheticLambda4(12, function13));
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                createListBuilder.add(new CustomAccessibilityAction((String) obj5, new BalanceFeedKt$$ExternalSyntheticLambda4(13, function13)));
                ItemAccessory itemAccessory = activityItemViewModel.accessory;
                if (itemAccessory instanceof ItemAccessory.Button) {
                    ItemAccessory.Button button = (ItemAccessory.Button) itemAccessory;
                    String str4 = button.accessibilityText;
                    if (str4 == null) {
                        str4 = button.text;
                    }
                    createListBuilder.add(new CustomAccessibilityAction(str4, new BalanceFeedKt$$ExternalSyntheticLambda4(14, function13)));
                }
                SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, CollectionsKt__CollectionsJVMKt.build(createListBuilder));
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, activityItemViewModel.contentDescription);
                return Unit.INSTANCE;
            case 18:
                ScrollState scrollState = (ScrollState) obj8;
                Placeable placeable3 = (Placeable) obj7;
                Placeable placeable4 = (Placeable) obj6;
                State state2 = (State) obj5;
                Placeable.PlacementScope placementScope2 = (Placeable.PlacementScope) obj;
                placementScope2.getClass();
                int intValue3 = scrollState.value$delegate.getIntValue();
                int intValue4 = scrollState._maxValueState.getIntValue();
                int i19 = placeable3.height;
                int round = ((intValue3 < intValue4 - i19 ? (char) 0 : (char) 1) == 0 && scrollState.getCanScrollForward()) ? Math.round(((Number) state2.getValue()).floatValue() * placeable3.height) : Math.max(Math.round((1.0f - ((r2.getIntValue() - scrollState.value$delegate.getIntValue()) / placeable3.height)) * i19), Math.round(((Number) state2.getValue()).floatValue() * placeable3.height));
                placementScope2.placeRelative(placeable4, 0, 0, RecyclerView.DECELERATION_RATE);
                Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope2, placeable3, 0, placeable4.height - round, 10.0f, 8);
                return Unit.INSTANCE;
            case 19:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, (String) obj8);
                androidStatement2.bindLong(1, (Long) obj7);
                androidStatement2.bindBytes(2, (byte[]) ((Local_tab_content.Adapter) ((LocalTabContentQueries) obj6).local_tab_contentAdapter).responseAdapter.encode((AfterpayMerchantSheetResponse) obj5));
                return Unit.INSTANCE;
            case 20:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindLong(0, (Long) obj8);
                androidStatement3.bindLong(1, (Long) obj7);
                androidStatement3.bindBytes(2, (byte[]) ((BlockersConfig.Adapter) ((LocalTabContentQueries) obj6).local_tab_contentAdapter).target_balance_amountAdapter.encode((AfterpayAppletResponse) obj5));
                return Unit.INSTANCE;
            case 21:
                AmountDisplayKeypadListener amountDisplayKeypadListener = (AmountDisplayKeypadListener) obj8;
                AmountKeypadState amountKeypadState = (AmountKeypadState) obj7;
                AmountDisplayState amountDisplayState = (AmountDisplayState) obj6;
                MutableState mutableState2 = (MutableState) obj5;
                KeypadViewModel.KeypadKey keypadKey = (KeypadViewModel.KeypadKey) obj;
                keypadKey.getClass();
                if (keypadKey.isDigit()) {
                    amountDisplayKeypadListener.onDigit(Integer.parseInt(keypadKey.value));
                } else if (keypadKey.isClear()) {
                    amountDisplayKeypadListener.onBackspace();
                } else if (keypadKey.isSeparator()) {
                    if (amountKeypadState.allowLeadingDecimal || !amountDisplayState.getRawAmount().equals("0")) {
                        amountDisplayKeypadListener.onDecimal();
                    } else {
                        amountKeypadState.shake();
                        Function0 function02 = (Function0) mutableState2.getValue();
                        if (function02 != null) {
                            function02.invoke();
                        }
                    }
                }
                return Unit.INSTANCE;
            case 22:
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindString(0, (String) obj8);
                androidStatement4.bindString(1, (String) ((EnumListAdapter) ((LocalTabContentQueries) obj7).local_tab_contentAdapter).enumColumnAdapter.encode((ItemType) obj6));
                androidStatement4.bindString(2, (String) obj5);
                return Unit.INSTANCE;
            case 23:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, (String) obj8);
                SemanticsPropertiesKt.setText(semanticsPropertyReceiver2, new AnnotatedString((String) obj7));
                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver2, RecyclerView.DECELERATION_RATE);
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver2, ((BalanceAppletTileViewModel.Loaded) ((BalanceAppletTileViewModel) obj6)).getOnTileClickLabel(), new BalanceAppletTileKt$$ExternalSyntheticLambda4((NetworkFetcher$fetch$2) obj5, 3));
                return Unit.INSTANCE;
            case 24:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver3, "amountTextTag");
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver3, (String) obj8);
                BalanceAppletTileViewModel.Loaded loaded = (BalanceAppletTileViewModel.Loaded) ((BalanceAppletTileViewModel) obj6);
                SemanticsPropertiesKt.setText(semanticsPropertyReceiver3, new AnnotatedString((String) ((AppletTile.AppletTileAppearance) obj7).obfuscationMask.invoke(loaded.getFormattedBalance())));
                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver3, 1.0f);
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver3, loaded.getOnTileClickLabel(), new BalanceAppletTileKt$$ExternalSyntheticLambda4((NetworkFetcher$fetch$2) obj5, i4));
                return Unit.INSTANCE;
            case 25:
                BillsSubscriptionsMerchantListViewModel$Loaded billsSubscriptionsMerchantListViewModel$Loaded = (BillsSubscriptionsMerchantListViewModel$Loaded) obj8;
                TextFieldState textFieldState = (TextFieldState) obj7;
                SearchBarKeyboardState searchBarKeyboardState = (SearchBarKeyboardState) obj6;
                Function1 function14 = (Function1) obj5;
                LazyScaffoldContentScope lazyScaffoldContentScope = (LazyScaffoldContentScope) obj;
                lazyScaffoldContentScope.getClass();
                if (billsSubscriptionsMerchantListViewModel$Loaded != null) {
                    LazyListScope.item$default(lazyScaffoldContentScope, null, null, new ComposableLambdaImpl(new ComposeDialogKt$$ExternalSyntheticLambda12(textFieldState, searchBarKeyboardState, billsSubscriptionsMerchantListViewModel$Loaded, function14, 15), true, -8878268), 3);
                    for (Object obj9 : billsSubscriptionsMerchantListViewModel$Loaded.sections) {
                        int i20 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        MerchantSection merchantSection = (MerchantSection) obj9;
                        LazyListScope.item$default(lazyScaffoldContentScope, null, null, new ComposableLambdaImpl(new BadgedAvatarKt$$ExternalSyntheticLambda4(i5, merchantSection, i2), true, -1965407300), 3);
                        List list3 = merchantSection.merchants;
                        lazyScaffoldContentScope.$$delegate_0.items(list3.size(), new Latch$await$2$2(24, new BenefitsHubViewKt$$ExternalSyntheticLambda2(16), list3), new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list3, 10), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(8, function14, list3), true, 802480018));
                        i5 = i20;
                    }
                }
                return Unit.INSTANCE;
            case 26:
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement5, 0, (String) obj8, 1, (String) obj7);
                androidStatement5.bindBytes(2, (byte[]) ((BlockersConfig.Adapter) ((LocalTabContentQueries) obj6).local_tab_contentAdapter).target_balance_amountAdapter.encode((SubmitBlockerRequest.Request) obj5));
                return Unit.INSTANCE;
            case 27:
                CashtagViewModel cashtagViewModel = (CashtagViewModel) obj7;
                Function1 function15 = (Function1) obj6;
                MutableState mutableState3 = (MutableState) obj5;
                ((KeyboardActionScope) obj).getClass();
                if (!((AnimatedContentScopeImpl) obj8).$$delegate_0.getTransition().isRunning() && cashtagViewModel.lookupViewModel.nextButtonEnabled) {
                    function15.invoke(new CashtagViewEvent.NextClick(((TextFieldValue) mutableState3.getValue()).annotatedString.text));
                }
                return Unit.INSTANCE;
            case 28:
                Function1 function16 = (Function1) obj8;
                TouchRecorder touchRecorder = (TouchRecorder) obj7;
                MutableState mutableState4 = (MutableState) obj5;
                ((KeyboardActionScope) obj).getClass();
                if (((Boolean) ((MutableState) obj6).getValue()).booleanValue()) {
                    String str5 = ((TextFieldValue) mutableState4.getValue()).annotatedString.text;
                    if (str5 != null && (obj2 = str5.toString()) != null) {
                        str = StringsKt__StringsJVMKt.replace$default(obj2, "-", "");
                    }
                    function16.invoke(new SsnViewEvent.Next(str, touchRecorder.getSignalsContext()));
                }
                return Unit.INSTANCE;
            default:
                SsnViewModel ssnViewModel = (SsnViewModel) obj8;
                InsertingScrubber insertingScrubber = (InsertingScrubber) obj7;
                MutableState mutableState5 = (MutableState) obj6;
                MutableState mutableState6 = (MutableState) obj5;
                TextFieldValue textFieldValue2 = (TextFieldValue) obj;
                textFieldValue2.getClass();
                String str6 = textFieldValue2.annotatedString.text;
                if (((str6 == null || (obj4 = str6.toString()) == null) ? "" : StringsKt__StringsJVMKt.replace$default(obj4, "-", "")).length() > ssnViewModel.ssnLength) {
                    str6 = StringsKt___StringsKt.dropLast(1, str6);
                    if (StringsKt___StringsKt.last(str6) == '-') {
                        str6 = StringsKt___StringsKt.dropLast(1, str6);
                    }
                }
                if (insertingScrubber != null) {
                    TextFieldValue textFieldValue3 = (TextFieldValue) mutableState5.getValue();
                    TextFieldValue m1002copy3r_uNRQ$default2 = TextFieldValue.m1002copy3r_uNRQ$default(textFieldValue2, str6, 0L, 6);
                    String str7 = textFieldValue3.annotatedString.text;
                    String str8 = m1002copy3r_uNRQ$default2.annotatedString.text;
                    String scrub = insertingScrubber.scrub(str7, str8);
                    long j4 = m1002copy3r_uNRQ$default2.selection;
                    if (TextRange.m987getCollapsedimpl(j4) && scrub.length() > str8.length()) {
                        int length = (scrub.length() - str8.length()) + TextRange.m989getMaximpl(j4);
                        j4 = coil3.size.SizeKt.TextRange(length, length);
                    }
                    m1002copy3r_uNRQ$default = TextFieldValue.m1002copy3r_uNRQ$default(m1002copy3r_uNRQ$default2, scrub, j4, 4);
                } else {
                    m1002copy3r_uNRQ$default = TextFieldValue.m1002copy3r_uNRQ$default(textFieldValue2, str6, 0L, 6);
                }
                mutableState5.setValue(m1002copy3r_uNRQ$default);
                String str9 = ((TextFieldValue) mutableState5.getValue()).annotatedString.text;
                if (str9 != null && (obj3 = str9.toString()) != null) {
                    str = StringsKt__StringsJVMKt.replace$default(obj3, "-", "");
                }
                mutableState6.setValue(Boolean.valueOf(str.length() == ssnViewModel.ssnLength));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n3$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }
}
