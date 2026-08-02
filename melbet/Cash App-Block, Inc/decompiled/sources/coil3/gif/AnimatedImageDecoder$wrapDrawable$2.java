package coil3.gif;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.viewfinder.core.ImplementationMode;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.material.SliderDraggableState$drag$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.glance.appwidget.GlanceAppWidgetManager;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.navigation.compose.DialogNavigator;
import androidx.paging.FlowExtKt$simpleScan$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.backend.BuyerIntentScope;
import app.cash.local.backend.BuyerIntentState;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.CartBuilderKt;
import app.cash.local.backend.CartBuilderManager;
import app.cash.local.backend.CartBuilderSeed;
import app.cash.local.backend.real.BuyerIntentSyncManager;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.backend.real.RealCartBuilderManager;
import app.cash.local.presenters.brand.checkout.LocalBrandLocationCheckoutPresenter;
import app.cash.local.presenters.brand.checkout.LocalOpenTabCheckoutPresenter$Args;
import app.cash.local.presenters.brand.menu.LocalMenuComboDetailsPresenter;
import app.cash.local.presenters.brand.menu.LocalMenuItemDetailsPresenter$models$5$3;
import app.cash.local.presenters.brand.orders.LocalOrderStatusPresenter;
import app.cash.local.presenters.brand.orders.LocalOrderStatusPresenter$models$3$1$1;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter;
import app.cash.local.presenters.cart.LocalBrandLocationCartPresenter;
import app.cash.local.presenters.internal.AnalyticsKt;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.CartEntryKt;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.CartEntryWithQuantityKt;
import app.cash.local.primitives.DiscountCode;
import app.cash.local.primitives.LocalErrorResponse;
import app.cash.local.primitives.LocalMoneyKt;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MarketingMessageData;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.PaymentMethodToken;
import app.cash.local.primitives.Selection;
import app.cash.local.screens.app.LocalExplanatoryDialog;
import app.cash.local.screens.app.LocalMarketingMessageScreen;
import app.cash.local.screens.app.LocalMenuComboDetailsScreen;
import app.cash.local.viewmodels.LocalBrandBannerModel;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewEvent;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewModel;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.wallet.SegmentedTab;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.gif.internal.UtilsKt$animatable2CallbackOf$1;
import com.fillr.e;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmd;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmz;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.compose.clustering.ClusteringMarkerProperties;
import com.google.maps.android.compose.clustering.ComposeUiClusterRenderer;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.RealBugReportSender;
import com.squareup.cash.bugreporting.viewmodels.DiagnosticContext;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.localclient.BannerLocation;
import com.squareup.cash.cdf.localclient.LocalClientBannerView;
import com.squareup.cash.cdf.localclient.LocalClientBrandProfileViewItem;
import com.squareup.cash.charting.components.EarningsBarChartKt$ChartBars$1$1$1$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.storage.FileDownloader$Category;
import com.squareup.cash.storage.FileDownloader$DownloadStatus;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.ui.MainActivity;
import com.squareup.cash.work.views.menu.ExpandableContentKt;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import com.squareup.protos.cash.local.client.v1.LocalShoppingCart;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.IntProgressionIterator;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import okio.Okio;
import okio.Pipe$sink$1;
import okio.RealBufferedSink;
import okio.Utf8;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.json.JSONArray;
import org.json.JSONObject;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class AnimatedImageDecoder$wrapDrawable$2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object $baseDrawable;
    public final /* synthetic */ Object $onEnd;
    public final /* synthetic */ Object $onStart;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedImageDecoder$wrapDrawable$2(List list, Continuation continuation, MutableState mutableState) {
        super(2, continuation);
        this.$r8$classId = 15;
        this.$onStart = list;
        this.$onEnd = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$onEnd;
        Object obj3 = this.$onStart;
        switch (i) {
            case 0:
                return new AnimatedImageDecoder$wrapDrawable$2((Drawable) this.$baseDrawable, (Function0) obj3, (Function0) obj2, continuation, 0);
            case 1:
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$2 = new AnimatedImageDecoder$wrapDrawable$2((Ref$ObjectRef) obj3, (SurfaceRequest) obj2, continuation, 1);
                animatedImageDecoder$wrapDrawable$2.$baseDrawable = obj;
                return animatedImageDecoder$wrapDrawable$2;
            case 2:
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$22 = new AnimatedImageDecoder$wrapDrawable$2((PointerInputScope) obj3, (TextDragObserver) obj2, continuation, 2);
                animatedImageDecoder$wrapDrawable$22.$baseDrawable = obj;
                return animatedImageDecoder$wrapDrawable$22;
            case 3:
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$23 = new AnimatedImageDecoder$wrapDrawable$2((TextFieldDecoratorModifierNode) obj3, (PointerInputScope) obj2, continuation, 3);
                animatedImageDecoder$wrapDrawable$23.$baseDrawable = obj;
                return animatedImageDecoder$wrapDrawable$23;
            case 4:
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$24 = new AnimatedImageDecoder$wrapDrawable$2((TextFieldSelectionState) obj3, (PointerInputScope) obj2, continuation, 4);
                animatedImageDecoder$wrapDrawable$24.$baseDrawable = obj;
                return animatedImageDecoder$wrapDrawable$24;
            case 5:
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$25 = new AnimatedImageDecoder$wrapDrawable$2((String) obj3, (String) obj2, continuation, 5);
                animatedImageDecoder$wrapDrawable$25.$baseDrawable = obj;
                return animatedImageDecoder$wrapDrawable$25;
            case 6:
                return new AnimatedImageDecoder$wrapDrawable$2((MutableState) this.$baseDrawable, (DialogNavigator) obj3, (SnapshotStateList) obj2, continuation, 6);
            case 7:
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$26 = new AnimatedImageDecoder$wrapDrawable$2((CartBuilder) obj3, (BuyerIntentSyncManager) obj2, continuation, 7);
                animatedImageDecoder$wrapDrawable$26.$baseDrawable = obj;
                return animatedImageDecoder$wrapDrawable$26;
            case 8:
                return new AnimatedImageDecoder$wrapDrawable$2((BuyerIntentState) this.$baseDrawable, (LocationMenu) obj3, (CartBuilderManager) obj2, continuation, 8);
            case 9:
                return new AnimatedImageDecoder$wrapDrawable$2((String) this.$baseDrawable, (Set) obj3, (MutableState) obj2, continuation, 9);
            case 10:
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$27 = new AnimatedImageDecoder$wrapDrawable$2((LocalErrorResponse) obj3, continuation, (LocalBrandLocationCheckoutPresenter) obj2, 10);
                animatedImageDecoder$wrapDrawable$27.$baseDrawable = obj;
                return animatedImageDecoder$wrapDrawable$27;
            case 11:
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$28 = new AnimatedImageDecoder$wrapDrawable$2(obj3, continuation, (LocalHomePresenter) obj2, 11);
                animatedImageDecoder$wrapDrawable$28.$baseDrawable = obj;
                return animatedImageDecoder$wrapDrawable$28;
            case 12:
                return new AnimatedImageDecoder$wrapDrawable$2((LocalMenuComboDetailsPresenter) this.$baseDrawable, (CartBuilder) obj3, (MenuItem) obj2, continuation, 12);
            case 13:
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$29 = new AnimatedImageDecoder$wrapDrawable$2((LocalOrderStatusPresenter) obj3, (MutableState) obj2, continuation, 13);
                animatedImageDecoder$wrapDrawable$29.$baseDrawable = obj;
                return animatedImageDecoder$wrapDrawable$29;
            case 14:
                return new AnimatedImageDecoder$wrapDrawable$2((MutableState) this.$baseDrawable, (Function0) obj3, (LocalBrandProfilePresenter) obj2, continuation, 14);
            case 15:
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$210 = new AnimatedImageDecoder$wrapDrawable$2((List) obj3, continuation, (MutableState) obj2);
                animatedImageDecoder$wrapDrawable$210.$baseDrawable = obj;
                return animatedImageDecoder$wrapDrawable$210;
            case 16:
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$211 = new AnimatedImageDecoder$wrapDrawable$2((LocalBrandBannerModel) obj3, continuation, (LocalBrandLocationCartPresenter) obj2, 16);
                animatedImageDecoder$wrapDrawable$211.$baseDrawable = obj;
                return animatedImageDecoder$wrapDrawable$211;
            case 17:
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$212 = new AnimatedImageDecoder$wrapDrawable$2((Function1) obj3, (State) obj2, continuation, 17);
                animatedImageDecoder$wrapDrawable$212.$baseDrawable = obj;
                return animatedImageDecoder$wrapDrawable$212;
            case 18:
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$213 = new AnimatedImageDecoder$wrapDrawable$2((Function1) obj3, (LocalMenuItemDetailsViewModel.ItemModifier.FreeTextEntry) obj2, continuation, 18);
                animatedImageDecoder$wrapDrawable$213.$baseDrawable = obj;
                return animatedImageDecoder$wrapDrawable$213;
            case 19:
                return new AnimatedImageDecoder$wrapDrawable$2((List) this.$baseDrawable, (RealImageLoader) obj3, (Context) obj2, continuation, 19);
            case 20:
                return new AnimatedImageDecoder$wrapDrawable$2((RealImageLoader) this.$baseDrawable, (Context) obj3, (String) obj2, continuation, 20);
            case 21:
                return new AnimatedImageDecoder$wrapDrawable$2((List) this.$baseDrawable, (MutableState) obj3, (ParcelableSnapshotMutableIntState) obj2, continuation, 21);
            case 22:
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$214 = new AnimatedImageDecoder$wrapDrawable$2((String) obj3, (zzmz) obj2, continuation, 22);
                animatedImageDecoder$wrapDrawable$214.$baseDrawable = obj;
                return animatedImageDecoder$wrapDrawable$214;
            case 23:
                return new AnimatedImageDecoder$wrapDrawable$2((zzmz) this.$baseDrawable, (Context) obj3, (Map) obj2, continuation, 23);
            case 24:
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$215 = new AnimatedImageDecoder$wrapDrawable$2((Preferences.Key) obj3, (Long) obj2, continuation, 24);
                animatedImageDecoder$wrapDrawable$215.$baseDrawable = obj;
                return animatedImageDecoder$wrapDrawable$215;
            case 25:
                return new AnimatedImageDecoder$wrapDrawable$2((ComposeUiClusterRenderer.ViewKey) this.$baseDrawable, (ComposeUiClusterRenderer) obj3, (ComposeUiClusterRenderer.InvalidatingComposeView) obj2, continuation, 25);
            case 26:
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$216 = new AnimatedImageDecoder$wrapDrawable$2((DiagnosticContext) obj3, (RealBugReportSender) obj2, continuation, 26);
                animatedImageDecoder$wrapDrawable$216.$baseDrawable = obj;
                return animatedImageDecoder$wrapDrawable$216;
            case 27:
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$217 = new AnimatedImageDecoder$wrapDrawable$2((RealBugReportSender) obj3, (SharedPreferences) obj2, continuation, 27);
                animatedImageDecoder$wrapDrawable$217.$baseDrawable = obj;
                return animatedImageDecoder$wrapDrawable$217;
            case 28:
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$218 = new AnimatedImageDecoder$wrapDrawable$2((Animatable) obj3, (Animatable) obj2, continuation, 28);
                animatedImageDecoder$wrapDrawable$218.$baseDrawable = obj;
                return animatedImageDecoder$wrapDrawable$218;
            default:
                return new AnimatedImageDecoder$wrapDrawable$2((DisclosurePresenter) this.$baseDrawable, (String) obj3, (String) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((AnimatedImageDecoder$wrapDrawable$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0532 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04f0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v13, types: [app.cash.local.primitives.DiscountCode] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DiscountCode.Entered entered;
        Object obj2;
        boolean z;
        List list;
        ListIterator listIterator;
        Object obj3;
        IntProgressionIterator intProgressionIterator;
        Selection selectionOrNull;
        LocationMenu locationMenu;
        CartBuilderSeed cartBuilderSeed;
        Object failure;
        CartEntryWithQuantity cartEntryWithQuantity;
        Marker marker;
        int i = this.$r8$classId;
        int i2 = 2;
        LocalExplanatoryDialog.PositiveAction.Ok ok = LocalExplanatoryDialog.PositiveAction.Ok.INSTANCE;
        int i3 = 0;
        int i4 = 1;
        boolean z2 = false;
        boolean z3 = false;
        Object obj4 = this.$onEnd;
        Object obj5 = this.$onStart;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((AnimatedImageDrawable) ((Drawable) this.$baseDrawable)).registerAnimationCallback(new UtilsKt$animatable2CallbackOf$1((Function0) obj5, (Function0) obj4));
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ImplementationMode implementationMode = (ImplementationMode) ((Pair) this.$baseDrawable).first;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj5;
                Object obj6 = ref$ObjectRef.element;
                if (obj6 != null && implementationMode != obj6) {
                    i3 = 1;
                }
                if (i3 != 0) {
                    SurfaceRequest surfaceRequest = (SurfaceRequest) obj4;
                    surfaceRequest.willNotProvideSurface();
                    surfaceRequest.mSurfaceRecreationCompleter.set(null);
                } else {
                    ref$ObjectRef.element = implementationMode;
                }
                return Boolean.valueOf((boolean) (i3 ^ 1));
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.$baseDrawable;
                CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                PointerInputScope pointerInputScope = (PointerInputScope) obj5;
                TextDragObserver textDragObserver = (TextDragObserver) obj4;
                Continuation continuation = null;
                JobKt.launch$default(coroutineScope, null, coroutineStart, new CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1(pointerInputScope, textDragObserver, continuation, i4), 1);
                return JobKt.launch$default(coroutineScope, null, coroutineStart, new CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1(pointerInputScope, textDragObserver, continuation, i2), 1);
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.$baseDrawable;
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = (TextFieldDecoratorModifierNode) obj5;
                TextFieldSelectionState textFieldSelectionState = textFieldDecoratorModifierNode.textFieldSelectionState;
                PointerInputScope pointerInputScope2 = (PointerInputScope) obj4;
                DialogHostKt$$ExternalSyntheticLambda0 dialogHostKt$$ExternalSyntheticLambda0 = new DialogHostKt$$ExternalSyntheticLambda0(19, textFieldSelectionState, textFieldDecoratorModifierNode);
                CoroutineStart coroutineStart2 = CoroutineStart.UNDISPATCHED;
                Continuation continuation2 = null;
                JobKt.launch$default(coroutineScope2, null, coroutineStart2, new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1(textFieldSelectionState, pointerInputScope2, continuation2, i3), 1);
                JobKt.launch$default(coroutineScope2, null, coroutineStart2, new FlowExtKt$simpleScan$1(textFieldDecoratorModifierNode, textFieldSelectionState, pointerInputScope2, dialogHostKt$$ExternalSyntheticLambda0, (Continuation) null, 12), 1);
                JobKt.launch$default(coroutineScope2, null, coroutineStart2, new SliderDraggableState$drag$2(textFieldSelectionState, pointerInputScope2, dialogHostKt$$ExternalSyntheticLambda0, continuation2, 26), 1);
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CoroutineScope coroutineScope3 = (CoroutineScope) this.$baseDrawable;
                CoroutineStart coroutineStart3 = CoroutineStart.UNDISPATCHED;
                TextFieldSelectionState textFieldSelectionState2 = (TextFieldSelectionState) obj5;
                PointerInputScope pointerInputScope3 = (PointerInputScope) obj4;
                Continuation continuation3 = null;
                JobKt.launch$default(coroutineScope3, null, coroutineStart3, new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1(textFieldSelectionState2, pointerInputScope3, continuation3, 1), 1);
                JobKt.launch$default(coroutineScope3, null, coroutineStart3, new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1(textFieldSelectionState2, pointerInputScope3, continuation3, i2), 1);
                return JobKt.launch$default(coroutineScope3, null, coroutineStart3, new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1(pointerInputScope3, textFieldSelectionState2, null), 1);
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Preferences preferences = (Preferences) this.$baseDrawable;
                MutablePreferences mutablePreferences = preferences.toMutablePreferences();
                String str = (String) obj5;
                String str2 = (String) obj4;
                Preferences.Key key = GlanceAppWidgetManager.providersKey;
                Set set = (Set) preferences.get(key);
                if (set == null) {
                    set = EmptySet.INSTANCE;
                }
                mutablePreferences.setUnchecked$datastore_preferences_core_release(key, SetsKt___SetsKt.plus(set, str));
                mutablePreferences.setUnchecked$datastore_preferences_core_release(GlanceAppWidgetManager.Companion.access$providerKey(GlanceAppWidgetManager.Companion, str), str2);
                return mutablePreferences.toPreferences();
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                DialogNavigator dialogNavigator = (DialogNavigator) obj5;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj4;
                for (NavBackStackEntry navBackStackEntry : (Set) ((MutableState) this.$baseDrawable).getValue()) {
                    if (!((List) dialogNavigator.getState().backStack.$$delegate_0.getValue()).contains(navBackStackEntry) && !snapshotStateList.contains(navBackStackEntry)) {
                        dialogNavigator.getState().markTransitionComplete(navBackStackEntry);
                    }
                }
                return Unit.INSTANCE;
            case 7:
                CartBuilder cartBuilder = (CartBuilder) obj5;
                BuyerIntentSyncManager.BuyerIntentSyncResult buyerIntentSyncResult = (BuyerIntentSyncManager.BuyerIntentSyncResult) this.$baseDrawable;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (buyerIntentSyncResult instanceof BuyerIntentSyncManager.BuyerIntentSyncResult.RequestSuccess) {
                    BuyerIntentSyncManager.BuyerIntentSyncResult.RequestSuccess requestSuccess = (BuyerIntentSyncManager.BuyerIntentSyncResult.RequestSuccess) buyerIntentSyncResult;
                    LocalShoppingCart localShoppingCart = requestSuccess.shoppingCart;
                    List list2 = requestSuccess.state.errors;
                    RealCartBuilder realCartBuilder = (RealCartBuilder) cartBuilder;
                    SnapshotStateList snapshotStateList2 = realCartBuilder.discountCodes;
                    list2.getClass();
                    boolean isEmpty = list2.isEmpty();
                    List list3 = localShoppingCart.lines;
                    List list4 = list3;
                    LinkedHashSet mutableSet = CollectionsKt.toMutableSet(CollectionsKt__CollectionsKt.getIndices(list4));
                    SnapshotStateList snapshotStateList3 = realCartBuilder.selections;
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator2 = snapshotStateList3.listIterator();
                    while (true) {
                        StateListIterator stateListIterator = (StateListIterator) listIterator2;
                        if (stateListIterator.hasNext()) {
                            CartEntryWithQuantity cartEntryWithQuantity2 = (CartEntryWithQuantity) stateListIterator.next();
                            IntProgressionIterator it = CollectionsKt__CollectionsKt.getIndices(list4).iterator();
                            while (true) {
                                if (it.hasNext) {
                                    obj3 = it.next();
                                    int intValue = ((Number) obj3).intValue();
                                    if (mutableSet.contains(Integer.valueOf(intValue))) {
                                        LocalCart.Line line = (LocalCart.Line) list3.get(intValue);
                                        CartEntry cartEntry = cartEntryWithQuantity2.getCartEntry();
                                        LocalCart.Line.Selection selection = line.selection;
                                        if (selection != null && (selectionOrNull = RealCartBuilder.toSelectionOrNull(selection)) != null) {
                                            z = isEmpty;
                                            Selection selection2 = CartEntryKt.toSelection(cartEntry, 1);
                                            String str3 = selectionOrNull.menuItemVariationToken;
                                            if (str3 == null || str3.length() == 0) {
                                                str3 = null;
                                            }
                                            list = list4;
                                            String str4 = selection2.menuItemVariationToken;
                                            if (str4 == null || str4.length() == 0) {
                                                str4 = null;
                                            }
                                            listIterator = listIterator2;
                                            intProgressionIterator = it;
                                            if (Intrinsics.areEqual(selectionOrNull.menuItemToken, selection2.menuItemToken) && Intrinsics.areEqual(str3, str4) && RealCartBuilder.matchesModifiers(selectionOrNull.modifiers, selection2.modifiers) && RealCartBuilder.matchesTextModifiers(selectionOrNull.textModifiers, selection2.textModifiers) && RealCartBuilder.matchesComboSlots(selectionOrNull.comboSlots, selection2.comboSlots)) {
                                            }
                                            isEmpty = z;
                                            list4 = list;
                                            listIterator2 = listIterator;
                                            it = intProgressionIterator;
                                        }
                                    }
                                    z = isEmpty;
                                    list = list4;
                                    listIterator = listIterator2;
                                    intProgressionIterator = it;
                                    isEmpty = z;
                                    list4 = list;
                                    listIterator2 = listIterator;
                                    it = intProgressionIterator;
                                } else {
                                    z = isEmpty;
                                    list = list4;
                                    listIterator = listIterator2;
                                    obj3 = null;
                                }
                            }
                            Integer num = (Integer) obj3;
                            if (num != null) {
                                mutableSet.remove(num);
                                cartEntryWithQuantity2 = realCartBuilder.toCartEntryWithQuantity((LocalCart.Line) list3.get(num.intValue()), cartEntryWithQuantity2);
                            } else if (z) {
                                cartEntryWithQuantity2 = null;
                            }
                            if (cartEntryWithQuantity2 != null) {
                                arrayList.add(cartEntryWithQuantity2);
                            }
                            isEmpty = z;
                            list4 = list;
                            listIterator2 = listIterator;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = mutableSet.iterator();
                            while (it2.hasNext()) {
                                CartEntryWithQuantity cartEntryWithQuantity3 = realCartBuilder.toCartEntryWithQuantity((LocalCart.Line) list3.get(((Number) it2.next()).intValue()), null);
                                if (cartEntryWithQuantity3 != null) {
                                    arrayList2.add(cartEntryWithQuantity3);
                                }
                            }
                            ArrayList plus = CollectionsKt.plus((Iterable) arrayList2, (Collection) arrayList);
                            if (!Intrinsics.areEqual(SnapshotId_jvmKt.getReadable(snapshotStateList3).list, plus)) {
                                snapshotStateList3.clear();
                                snapshotStateList3.addAll(plus);
                            }
                            List<String> list5 = localShoppingCart.applied_discount_codes;
                            ArrayList arrayList3 = new ArrayList();
                            for (String str5 : list5) {
                                if (StringsKt.isBlank(str5)) {
                                    str5 = null;
                                }
                                if (str5 != null) {
                                    ListIterator listIterator3 = snapshotStateList2.listIterator();
                                    while (true) {
                                        StateListIterator stateListIterator2 = (StateListIterator) listIterator3;
                                        if (stateListIterator2.hasNext()) {
                                            obj2 = stateListIterator2.next();
                                            if (Intrinsics.areEqual(((DiscountCode) obj2).getCode(), str5)) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    ?? r7 = (DiscountCode) obj2;
                                    entered = r7 == 0 ? new DiscountCode.Entered(str5) : r7;
                                } else {
                                    entered = null;
                                }
                                if (entered != null) {
                                    arrayList3.add(entered);
                                }
                            }
                            snapshotStateList2.getClass();
                            if (!Intrinsics.areEqual(SnapshotId_jvmKt.getReadable(snapshotStateList2).list, arrayList3)) {
                                snapshotStateList2.clear();
                                snapshotStateList2.addAll(arrayList3);
                            }
                            ParcelableSnapshotMutableState parcelableSnapshotMutableState = realCartBuilder.serverSubtotalState;
                            LocalMoney localMoney = localShoppingCart.lines_subtotal;
                            parcelableSnapshotMutableState.setValue(localMoney != null ? LocalMoneyKt.toMoney(localMoney) : null);
                            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = realCartBuilder.serverSubtotalBeforeDiscountsState;
                            LocalMoney localMoney2 = localShoppingCart.lines_subtotal_before_discounts;
                            parcelableSnapshotMutableState2.setValue(localMoney2 != null ? LocalMoneyKt.toMoney(localMoney2) : null);
                            realCartBuilder.setBuyerIntentErrors(list2);
                            realCartBuilder.includesPreorderItemsState.setValue(Boolean.FALSE);
                        }
                    }
                } else if (buyerIntentSyncResult instanceof BuyerIntentSyncManager.BuyerIntentSyncResult.RequestFailure) {
                    BuyerIntentSyncManager.BuyerIntentSyncResult.RequestFailure requestFailure = (BuyerIntentSyncManager.BuyerIntentSyncResult.RequestFailure) buyerIntentSyncResult;
                    List list6 = requestFailure.errors;
                    int i5 = BuyerIntentSyncManager.$r8$clinit;
                    if (!list6.isEmpty()) {
                        ((RealCartBuilder) cartBuilder).setBuyerIntentErrors(list6);
                    }
                    Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(requestFailure.messages.size(), "UpdateUserIntent failed with ", " error(s)"), new Object[0]);
                } else if (!(buyerIntentSyncResult instanceof BuyerIntentSyncManager.BuyerIntentSyncResult.ModeDisabled) && !(buyerIntentSyncResult instanceof BuyerIntentSyncManager.BuyerIntentSyncResult.NoOp)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                BuyerIntentState buyerIntentState = (BuyerIntentState) this.$baseDrawable;
                if (buyerIntentState != null && (locationMenu = (LocationMenu) obj5) != null) {
                    RealCartBuilderManager realCartBuilderManager = (RealCartBuilderManager) ((CartBuilderManager) obj4);
                    realCartBuilderManager.getClass();
                    ConcurrentHashMap concurrentHashMap = realCartBuilderManager.seededIntentTokens;
                    BuyerIntentScope buyerIntentScope = buyerIntentState.scope;
                    Object obj7 = concurrentHashMap.get(buyerIntentScope);
                    String str6 = buyerIntentState.intentToken;
                    if (!Intrinsics.areEqual(obj7, str6)) {
                        LocalShoppingCart shoppingCart = buyerIntentState.getShoppingCart();
                        if (shoppingCart == null) {
                            cartBuilderSeed = null;
                        } else {
                            List<LocalCart.Line> list7 = shoppingCart.lines;
                            ArrayList arrayList4 = new ArrayList();
                            for (LocalCart.Line line2 : list7) {
                                LocalCart.Line.Selection selection3 = line2.selection;
                                if (selection3 != null) {
                                    Integer num2 = selection3.quantity;
                                    String str7 = selection3.menu_item_token;
                                    if (str7 != null && !StringsKt.isBlank(str7) && num2 != null && num2.intValue() > 0) {
                                        try {
                                            Result.Companion companion = Result.Companion;
                                            failure = CartBuilderKt.m1203toCartEntryWithQuantityNvqXVjw(line2, locationMenu, null);
                                        } catch (Throwable th) {
                                            Result.Companion companion2 = Result.Companion;
                                            failure = new Result.Failure(th);
                                        }
                                        boolean z4 = failure instanceof Result.Failure;
                                        Object obj8 = failure;
                                        if (z4) {
                                            obj8 = null;
                                        }
                                        cartEntryWithQuantity = (CartEntryWithQuantity) obj8;
                                        if (cartEntryWithQuantity == null) {
                                            arrayList4.add(cartEntryWithQuantity);
                                        }
                                    }
                                }
                                cartEntryWithQuantity = null;
                                if (cartEntryWithQuantity == null) {
                                }
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Iterator it3 = arrayList4.iterator();
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                CartEntry cartEntry2 = ((CartEntryWithQuantity) next).getCartEntry();
                                Object obj9 = linkedHashMap.get(cartEntry2);
                                if (obj9 == null) {
                                    obj9 = new ArrayList();
                                    linkedHashMap.put(cartEntry2, obj9);
                                }
                                ((List) obj9).add(next);
                            }
                            ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
                            Iterator it4 = linkedHashMap.entrySet().iterator();
                            while (it4.hasNext()) {
                                List list8 = (List) ((Map.Entry) it4.next()).getValue();
                                CartEntryWithQuantity cartEntryWithQuantity4 = (CartEntryWithQuantity) CollectionsKt.first(list8);
                                if (list8.size() != 1) {
                                    Iterator it5 = list8.iterator();
                                    int i6 = 0;
                                    while (it5.hasNext()) {
                                        i6 += ((CartEntryWithQuantity) it5.next()).getQuantity();
                                    }
                                    cartEntryWithQuantity4 = CartEntryWithQuantityKt.coerceToClientCartEntry(cartEntryWithQuantity4, i6);
                                }
                                arrayList5.add(cartEntryWithQuantity4);
                            }
                            List<String> list9 = shoppingCart.applied_discount_codes;
                            ArrayList arrayList6 = new ArrayList();
                            for (String str8 : list9) {
                                if (StringsKt.isBlank(str8)) {
                                    str8 = null;
                                }
                                DiscountCode.Entered entered2 = str8 != null ? new DiscountCode.Entered(str8) : null;
                                if (entered2 != null) {
                                    arrayList6.add(entered2);
                                }
                            }
                            cartBuilderSeed = new CartBuilderSeed(arrayList5, arrayList6);
                        }
                        if (cartBuilderSeed != null) {
                            CartBuilder builder = realCartBuilderManager.getBuilder(buyerIntentScope);
                            ArrayList arrayList7 = cartBuilderSeed.entries;
                            ArrayList arrayList8 = cartBuilderSeed.discountCodes;
                            RealCartBuilder realCartBuilder2 = (RealCartBuilder) builder;
                            realCartBuilder2.lastKnownMenu = locationMenu;
                            realCartBuilder2.clearServerDerivedState();
                            SnapshotStateList snapshotStateList4 = realCartBuilder2.selections;
                            snapshotStateList4.clear();
                            snapshotStateList4.addAll(arrayList7);
                            SnapshotStateList snapshotStateList5 = realCartBuilder2.discountCodes;
                            snapshotStateList5.clear();
                            snapshotStateList5.addAll(arrayList8);
                            realCartBuilder2.includesPreorderItemsState.setValue(Boolean.FALSE);
                            realCartBuilder2.openTabCartOverrideState.setValue(null);
                            realCartBuilder2.setBuyerIntentErrors(buyerIntentState.errors);
                            concurrentHashMap.put(buyerIntentScope, str6);
                            realCartBuilderManager.buyerIntentSyncManager.observeAndApplyMutations(buyerIntentScope, builder);
                        }
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str9 = (String) this.$baseDrawable;
                if (str9 != null) {
                    MutableState mutableState = (MutableState) obj4;
                    if (!((Set) obj5).contains(new PaymentMethodToken(str9))) {
                        mutableState.setValue(null);
                    }
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalBrandLocationCheckoutPresenter localBrandLocationCheckoutPresenter = (LocalBrandLocationCheckoutPresenter) obj4;
                BetterNavigator.ScreenNavigator screenNavigator = localBrandLocationCheckoutPresenter.navigator;
                LocalErrorResponse localErrorResponse = localBrandLocationCheckoutPresenter.screen.errors;
                localErrorResponse.getClass();
                List list10 = localErrorResponse.errors;
                ArrayList arrayList9 = new ArrayList();
                Iterator it6 = list10.iterator();
                while (it6.hasNext()) {
                    String str10 = ((LocalErrorResponse.Error) it6.next()).message;
                    if (str10 != null) {
                        arrayList9.add(str10);
                    }
                }
                screenNavigator.goTo(new LocalExplanatoryDialog(arrayList9, ok));
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj4;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) localHomePresenter.navigator;
                app.cash.local.primitives.LocalErrorResponse localErrorResponse2 = ((LocalOpenTabCheckoutPresenter$Args) localHomePresenter.neighborhoodsTabContentEnabled$delegate).errors;
                localErrorResponse2.getClass();
                List list11 = localErrorResponse2.errors;
                ArrayList arrayList10 = new ArrayList();
                Iterator it7 = list11.iterator();
                while (it7.hasNext()) {
                    String str11 = ((LocalErrorResponse.Error) it7.next()).message;
                    if (str11 != null) {
                        arrayList10.add(str11);
                    }
                }
                screenNavigator2.goTo(new LocalExplanatoryDialog(arrayList10, ok));
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalMenuComboDetailsPresenter localMenuComboDetailsPresenter = (LocalMenuComboDetailsPresenter) this.$baseDrawable;
                Analytics analytics = localMenuComboDetailsPresenter.analytics;
                LocalMenuComboDetailsScreen localMenuComboDetailsScreen = localMenuComboDetailsPresenter.screen;
                BrandSpot brandSpot = localMenuComboDetailsScreen.brandSpot;
                String str12 = brandSpot.brandToken;
                String str13 = brandSpot.locationToken;
                String str14 = str13 == null ? null : str13;
                String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(localMenuComboDetailsPresenter.sessionManager);
                String str15 = ((RealCartBuilder) ((CartBuilder) obj5)).checkoutFlowToken;
                String str16 = localMenuComboDetailsScreen.itemToken;
                Boolean bool = Boolean.TRUE;
                Boolean bool2 = Boolean.FALSE;
                String joinToString$default = CollectionsKt.joinToString$default(((MenuItem) obj4).discountTokens, ",", null, null, 0, null, LocalMenuItemDetailsPresenter$models$5$3.INSTANCE$1, 30);
                analytics.track(new LocalClientBrandProfileViewItem(str12, str14, activeAccountTokenOrNull, str15, str16, bool, bool2, null, joinToString$default.length() == 0 ? null : joinToString$default, EnumC0170g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE), null);
                return Unit.INSTANCE;
            case 13:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.$baseDrawable;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope4, null, null, new LocalOrderStatusPresenter$models$3$1$1((LocalOrderStatusPresenter) obj5, (MutableState) obj4, null), 3);
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MarketingMessageData marketingMessageData = (MarketingMessageData) ((MutableState) this.$baseDrawable).getValue();
                if (marketingMessageData != null) {
                    ((Function0) obj5).invoke();
                    ((LocalBrandProfilePresenter) obj4).navigator.goTo(new LocalMarketingMessageScreen(marketingMessageData));
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((MutableState) obj4).setValue(ExpandableContentKt.firstAvailableOrDefault((List) obj5));
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalBrandBannerModel localBrandBannerModel = (LocalBrandBannerModel) obj5;
                LocalBrandLocationCartPresenter localBrandLocationCartPresenter = (LocalBrandLocationCartPresenter) obj4;
                Analytics analytics2 = localBrandLocationCartPresenter.analytics;
                BrandSpot brandSpot2 = localBrandLocationCartPresenter.screen.brandSpot;
                String str17 = brandSpot2.brandToken;
                String str18 = brandSpot2.locationToken;
                if (str18 == null) {
                    str18 = null;
                }
                analytics2.track(new LocalClientBannerView(str17, str18, BannerLocation.CART, AnalyticsKt.toBannerType(localBrandBannerModel.f917type), AnalyticsKt.toOfferToken(localBrandBannerModel.mode)), null);
                return Unit.INSTANCE;
            case 17:
                String str19 = (String) this.$baseDrawable;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) ((State) obj4).getValue()).booleanValue()) {
                    ((Function1) obj5).invoke(str19);
                }
                return Unit.INSTANCE;
            case 18:
                CharSequence charSequence = (CharSequence) this.$baseDrawable;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Function1) obj5).invoke(new LocalMenuItemDetailsViewEvent.FreeTextEntryChanged(((LocalMenuItemDetailsViewModel.ItemModifier.FreeTextEntry) obj4).token, charSequence.toString()));
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                for (String str20 : (List) this.$baseDrawable) {
                    Context context = (Context) obj4;
                    context.getClass();
                    LocalViewsKt.enqueuePreload((RealImageLoader) obj5, context, str20);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealImageLoader realImageLoader = (RealImageLoader) this.$baseDrawable;
                Context context2 = (Context) obj5;
                context2.getClass();
                LocalViewsKt.enqueuePreload(realImageLoader, context2, (String) obj4);
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Function1) ((MutableState) obj5).getValue()).invoke(new Integer(((SegmentedTab) ((List) this.$baseDrawable).get(((ParcelableSnapshotMutableIntState) obj4).getIntValue())).titleRes));
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Map map = (Map) this.$baseDrawable;
                String str21 = (String) obj5;
                zzmd zzmdVar = (zzmd) map.get(str21);
                if (zzmdVar != null) {
                    ((zzmz) obj4).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    String str22 = zzmdVar.zza;
                    str22.getClass();
                    String str23 = zzmdVar.zzb;
                    str23.getClass();
                    map.put(str21, new zzmd(str22, str23, currentTimeMillis));
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Map map2 = (Map) obj4;
                ((zzmz) this.$baseDrawable).getClass();
                File file = new File(zzmz.zzt((Context) obj5), "index");
                map2.getClass();
                JSONArray jSONArray = new JSONArray();
                for (Map.Entry entry : map2.entrySet()) {
                    String str24 = (String) entry.getKey();
                    zzmd zzmdVar2 = (zzmd) entry.getValue();
                    String str25 = zzmdVar2.zza;
                    if (Intrinsics.areEqual(str24, str25)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", str25);
                        jSONObject.put("path", zzmdVar2.zzb);
                        jSONObject.put("last_access_time", zzmdVar2.zzc);
                        jSONArray.put(jSONObject);
                    } else {
                        Log.w("CacheManager", Boxes$$ExternalSyntheticOutline1.m("IDs in key (", str24, ") and value (", str25, ") do not match. Ignored."));
                    }
                }
                try {
                    String jSONArray2 = jSONArray.toString();
                    jSONArray2.getClass();
                    FilesKt__FileReadWriteKt.writeText$default(file, jSONArray2);
                    return Unit.INSTANCE;
                } catch (IOException e) {
                    Log.e("CacheManager", "Failed to write cache index file.", e);
                    throw e;
                }
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((MutablePreferences) this.$baseDrawable).set((Preferences.Key) obj5, (Long) obj4);
                return Unit.INSTANCE;
            case 25:
                ComposeUiClusterRenderer composeUiClusterRenderer = (ComposeUiClusterRenderer) obj5;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ComposeUiClusterRenderer.ViewKey viewKey = (ComposeUiClusterRenderer.ViewKey) this.$baseDrawable;
                if (viewKey instanceof ComposeUiClusterRenderer.ViewKey.Cluster) {
                    marker = (Marker) composeUiClusterRenderer.mClusterMarkerCache.urlRequestMethodsMap.get(((ComposeUiClusterRenderer.ViewKey.Cluster) viewKey).cluster);
                } else {
                    if (!(viewKey instanceof ComposeUiClusterRenderer.ViewKey.Item)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    marker = (Marker) composeUiClusterRenderer.mMarkerCache.urlRequestMethodsMap.get(((ComposeUiClusterRenderer.ViewKey.Item) viewKey).item);
                }
                if (marker != null) {
                    ComposeUiClusterRenderer.InvalidatingComposeView invalidatingComposeView = (ComposeUiClusterRenderer.InvalidatingComposeView) obj4;
                    ClusteringMarkerProperties clusteringMarkerProperties = invalidatingComposeView.properties;
                    int i7 = ComposeUiClusterRenderer.$r8$clinit;
                    marker.setIcon(composeUiClusterRenderer.renderViewToBitmapDescriptor(invalidatingComposeView));
                    Offset offset = (Offset) clusteringMarkerProperties.anchor$delegate.getValue();
                    if (offset != null) {
                        long j = offset.packedValue;
                        marker.setAnchor(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                    }
                    Float f = (Float) clusteringMarkerProperties.zIndex$delegate.getValue();
                    if (f != null) {
                        marker.setZIndex(f.floatValue());
                    }
                }
                return Unit.INSTANCE;
            case 26:
                File file2 = (File) this.$baseDrawable;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Activity activity = ((DiagnosticContext) obj5).context;
                Pipe$sink$1 sink$default = Okio.sink$default(file2);
                try {
                    RealBufferedSink realBufferedSink = new RealBufferedSink(sink$default);
                    try {
                        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                        if (mainActivity != null) {
                            e.printBackStack(mainActivity, realBufferedSink);
                        }
                        realBufferedSink.close();
                        sink$default.close();
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } finally {
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        Utf8.closeFinally(sink$default, th3);
                        throw th4;
                    }
                }
            case 27:
                File file3 = (File) this.$baseDrawable;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SharedPreferences sharedPreferences = (SharedPreferences) obj4;
                RealBufferedSink realBufferedSink2 = new RealBufferedSink(Okio.sink$default(file3));
                try {
                    ByteString.Companion companion3 = ByteString.Companion;
                    realBufferedSink2.write(ByteString.Companion.encodeUtf8("{\n"));
                    Map<String, ?> all = sharedPreferences.getAll();
                    all.getClass();
                    for (Map.Entry<String, ?> entry2 : all.entrySet()) {
                        realBufferedSink2.writeUtf8("  \"" + entry2.getKey() + "\": \"" + entry2.getValue() + "\",\n");
                    }
                    ByteString.Companion companion4 = ByteString.Companion;
                    realBufferedSink2.write(ByteString.Companion.encodeUtf8("}"));
                    realBufferedSink2.close();
                    return Unit.INSTANCE;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 28:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.$baseDrawable;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope5, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1((Animatable) obj5, z3 ? 1 : 0, 14), 3);
                return JobKt.launch$default(coroutineScope5, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1((Animatable) obj4, z2 ? 1 : 0, 15), 3);
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealFileDownloader realFileDownloader = (RealFileDownloader) ((DisclosurePresenter) this.$baseDrawable).analytics;
                FileDownloader$Category fileDownloader$Category = FileDownloader$Category.DOCUMENTS;
                String str26 = (String) obj5;
                if (realFileDownloader.ready(fileDownloader$Category, str26)) {
                    Uri localUri = realFileDownloader.localUri(fileDownloader$Category, str26);
                    localUri.getClass();
                    return localUri;
                }
                if (realFileDownloader.download(fileDownloader$Category, str26, (String) obj4, true) != FileDownloader$DownloadStatus.SUCCESS) {
                    return null;
                }
                Uri localUri2 = realFileDownloader.localUri(fileDownloader$Category, str26);
                localUri2.getClass();
                return localUri2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnimatedImageDecoder$wrapDrawable$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$onStart = obj;
        this.$onEnd = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnimatedImageDecoder$wrapDrawable$2(Object obj, Continuation continuation, MoleculePresenter moleculePresenter, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$onStart = obj;
        this.$onEnd = moleculePresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnimatedImageDecoder$wrapDrawable$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$baseDrawable = obj;
        this.$onStart = obj2;
        this.$onEnd = obj3;
    }
}
