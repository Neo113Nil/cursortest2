package androidx.work;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2;
import androidx.compose.material.DismissState;
import androidx.compose.material.DrawerKt;
import androidx.compose.material.DrawerState;
import androidx.compose.material.FadeInFadeOutState;
import androidx.compose.material.ripple.AndroidRippleNode;
import androidx.compose.material3.SliderState;
import androidx.compose.material3.internal.TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BrushStyle;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AtomicReference;
import androidx.lifecycle.CoroutineLiveData;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import androidx.navigation.NavInflater;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.fragment.DialogFragmentNavigator;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.fragment.NavHostFragment$$ExternalSyntheticLambda1;
import androidx.navigation.internal.NavBackStackEntryImpl;
import androidx.navigation.internal.NavControllerImpl;
import androidx.paging.FlattenedPageEventStorage;
import androidx.paging.LoadType;
import androidx.paging.MulticastedPagingData;
import androidx.paging.PageEvent;
import androidx.paging.compose.LazyPagingItems$pagingDataPresenter$1;
import androidx.room.SharedSQLiteStatement;
import androidx.room.TransactorKt;
import app.cash.broadway.navigation.Navigator;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.brand.menu.LocalMenuComboDetailsPresenter;
import app.cash.local.presenters.brand.menu.LocalMenuItemDetailsPresenter;
import app.cash.local.presenters.internal.MenuState;
import app.cash.local.presenters.wallet.TabContentPresenter;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.LocationMenuKt;
import app.cash.local.screens.app.LocalExplanatoryDialog;
import app.cash.local.screens.app.LocalTabScreen;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.local.viewmodels.LocalCheckoutOrderSummaryViewModel;
import app.cash.local.viewmodels.sheet.EducationalSheetModelList;
import app.cash.local.views.pos.LocalPosCheckInViewKt$$ExternalSyntheticLambda5;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.paging3.OffsetQueryPagingSource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import coil3.svg.internal.AndroidSvg;
import com.google.android.gms.dynamite.zzf;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.ZoomSuggestionOptions;
import com.squareup.cash.R;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.screens.Finish;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalLocationDetail;
import com.squareup.protos.cash.local.client.v1.LocalMenu;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes3.dex */
public final /* synthetic */ class Worker$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Worker$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CompositionImpl compositionImpl;
        LocalLocationDetail localLocationDetail;
        LocalMenu localMenu;
        int i = this.$r8$classId;
        ViewModel viewModel = null;
        r2 = null;
        r2 = null;
        LocationMenu locationMenu = null;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                return ((Worker) obj).doWork();
            case 1:
                TextStringSimpleNode textStringSimpleNode = (TextStringSimpleNode) obj;
                textStringSimpleNode.textSubstitution = null;
                DepthSortedSetKt.requireLayoutNode(textStringSimpleNode).invalidateSemantics$ui();
                DepthSortedSetKt.requireLayoutNode(textStringSimpleNode).invalidateMeasurements$ui();
                DepthSortedSetKt.invalidateDraw(textStringSimpleNode);
                return Boolean.TRUE;
            case 2:
                Density requireDensity = ((DrawerState) obj).requireDensity();
                TweenSpec tweenSpec = DrawerKt.AnimationSpec;
                return Float.valueOf(requireDensity.mo236toPx0680j_4(400.0f));
            case 3:
                FadeInFadeOutState fadeInFadeOutState = (FadeInFadeOutState) obj;
                if (!Intrinsics.areEqual((Object) null, fadeInFadeOutState.current)) {
                    CollectionsKt__MutableCollectionsKt.removeAll(fadeInFadeOutState.items, new ButtonKt$$ExternalSyntheticLambda2(12));
                    RecomposeScopeImpl recomposeScopeImpl = fadeInFadeOutState.scope;
                    if (recomposeScopeImpl != null && (compositionImpl = recomposeScopeImpl.owner) != null) {
                        compositionImpl.invalidate(recomposeScopeImpl, null);
                    }
                }
                return Unit.INSTANCE;
            case 4:
                return (Map) ((DismissState) obj).anchors$delegate.getValue();
            case 5:
                DepthSortedSetKt.invalidateDraw((AndroidRippleNode) obj);
                return Unit.INSTANCE;
            case 6:
                return new Dp(TransactorKt.lerp(24.0f, 16.0f, ((TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0) obj).invoke()));
            case 7:
                ((Boolean) ((SliderState) obj).isDragging$delegate.getValue()).booleanValue();
                return Unit.INSTANCE;
            case 8:
                ShaderBrushSpan shaderBrushSpan = (ShaderBrushSpan) obj;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = shaderBrushSpan.size$delegate;
                if (((Size) parcelableSnapshotMutableState.getValue()).packedValue == 9205357640488583168L || Size.m644isEmptyimpl(((Size) parcelableSnapshotMutableState.getValue()).packedValue)) {
                    return null;
                }
                return shaderBrushSpan.shaderBrush.mo671createShaderuvyYCjk(((Size) parcelableSnapshotMutableState.getValue()).packedValue);
            case 9:
                return Float.valueOf(((BrushStyle) ((TextForegroundStyle) obj)).alpha);
            case 10:
                ((CoroutineLiveData) obj).blockRunner = null;
                return Unit.INSTANCE;
            case 11:
                NavBackStackEntryImpl navBackStackEntryImpl = ((NavBackStackEntry) obj).impl;
                if (!navBackStackEntryImpl.savedStateRegistryAttached) {
                    a$$ExternalSyntheticBUOutline0.m$1("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                    return null;
                }
                if (navBackStackEntryImpl.lifecycle.state == Lifecycle.State.DESTROYED) {
                    a$$ExternalSyntheticBUOutline0.m$1("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                    return null;
                }
                AtomicReference create$default = zzf.create$default(navBackStackEntryImpl.entry, (ViewModelProvider$Factory) navBackStackEntryImpl.navResultSavedStateFactory$delegate.getValue(), 4);
                KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(NavBackStackEntryImpl.SavedStateViewModel.class);
                orCreateKotlinClass.getClass();
                SimpleActor simpleActor = (SimpleActor) create$default.base;
                orCreateKotlinClass.getClass();
                String canonicalName = SizeKt.getCanonicalName(orCreateKotlinClass);
                if (canonicalName != null) {
                    viewModel = simpleActor.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), orCreateKotlinClass);
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
                }
                return ((NavBackStackEntryImpl.SavedStateViewModel) viewModel).handle;
            case 12:
                NavHostFragment navHostFragment = (NavHostFragment) obj;
                Context context = navHostFragment.getContext();
                if (context == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("NavController cannot be created before the fragment is attached");
                    return null;
                }
                NavHostController navHostController = new NavHostController(context);
                navHostController.setLifecycleOwner(navHostFragment);
                ViewModelStore viewModelStore = navHostFragment.getViewModelStore();
                viewModelStore.getClass();
                navHostController.setViewModelStore(viewModelStore);
                NavControllerImpl navControllerImpl = navHostController.impl;
                NavigatorProvider navigatorProvider = navControllerImpl._navigatorProvider;
                Context requireContext = navHostFragment.requireContext();
                requireContext.getClass();
                FragmentManager childFragmentManager = navHostFragment.getChildFragmentManager();
                childFragmentManager.getClass();
                navigatorProvider.addNavigator(new DialogFragmentNavigator(requireContext, childFragmentManager));
                NavigatorProvider navigatorProvider2 = navControllerImpl._navigatorProvider;
                Context requireContext2 = navHostFragment.requireContext();
                requireContext2.getClass();
                FragmentManager childFragmentManager2 = navHostFragment.getChildFragmentManager();
                childFragmentManager2.getClass();
                int id = navHostFragment.getId();
                if (id == 0 || id == -1) {
                    id = R.id.nav_host_fragment_container;
                }
                navigatorProvider2.addNavigator(new FragmentNavigator(requireContext2, childFragmentManager2, id));
                Bundle consumeRestoredStateForKey = navHostFragment.getSavedStateRegistry().consumeRestoredStateForKey("android-support-nav:fragment:navControllerState");
                if (consumeRestoredStateForKey != null) {
                    navHostController.restoreState(consumeRestoredStateForKey);
                }
                navHostFragment.getSavedStateRegistry().registerSavedStateProvider("android-support-nav:fragment:navControllerState", new NavHostFragment$$ExternalSyntheticLambda1(navHostController, r1));
                Bundle consumeRestoredStateForKey2 = navHostFragment.getSavedStateRegistry().consumeRestoredStateForKey("android-support-nav:fragment:graphId");
                if (consumeRestoredStateForKey2 != null) {
                    navHostFragment.graphId = consumeRestoredStateForKey2.getInt("android-support-nav:fragment:graphId");
                }
                navHostFragment.getSavedStateRegistry().registerSavedStateProvider("android-support-nav:fragment:graphId", new NavHostFragment$$ExternalSyntheticLambda1(navHostFragment, 2));
                int i2 = navHostFragment.graphId;
                Lazy lazy = navHostController.navInflater$delegate;
                if (i2 != 0) {
                    navControllerImpl.setGraph$navigation_runtime_release(((NavInflater) lazy.getValue()).inflate(i2), null);
                } else {
                    Bundle arguments = navHostFragment.getArguments();
                    r1 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
                    Bundle bundle = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                    if (r1 != 0) {
                        navControllerImpl.setGraph$navigation_runtime_release(((NavInflater) lazy.getValue()).inflate(r1), bundle);
                    }
                }
                return navHostController;
            case 13:
                PageEvent pageEvent = (PageEvent) CollectionsKt.firstOrNull(((FlattenedPageEventStorage) ((HuffmanTreeGroup) ((MulticastedPagingData) obj).accumulated.header).codes).getAsEvents());
                if (pageEvent == null || !(pageEvent instanceof PageEvent.Insert)) {
                    return null;
                }
                PageEvent.Insert insert = (PageEvent.Insert) pageEvent;
                if (insert.loadType == LoadType.REFRESH) {
                    return insert;
                }
                return null;
            case 14:
                SharedFlowImpl sharedFlowImpl = ((LazyPagingItems$pagingDataPresenter$1) obj)._onPagesUpdatedFlow;
                Unit unit = Unit.INSTANCE;
                sharedFlowImpl.tryEmit(unit);
                return unit;
            case 15:
                return ((SharedSQLiteStatement) obj).createNewStatement();
            case 16:
                return ((AndroidSvg) obj).open(":memory:");
            case 17:
                return ((RealLocalLauncher) obj).centralUrlRouterFactory;
            case 18:
                ((LocalMenuComboDetailsPresenter) obj).navigator.goTo(new LocalExplanatoryDialog(EmptyList.INSTANCE));
                return Unit.INSTANCE;
            case 19:
                ((LocalMenuItemDetailsPresenter) obj).navigator.goTo(new LocalExplanatoryDialog(EmptyList.INSTANCE));
                return Unit.INSTANCE;
            case 20:
                LocalBrand localBrand = (LocalBrand) obj;
                if (localBrand != null && (localLocationDetail = localBrand.selected_location) != null && (localMenu = localLocationDetail.menu) != null) {
                    locationMenu = LocationMenuKt.toLocationMenu(localMenu);
                }
                return locationMenu != null ? new MenuState.Loaded(locationMenu) : MenuState.Loading.INSTANCE;
            case 21:
                ((Navigator) obj).goTo(new Finish(null));
                return Unit.INSTANCE;
            case 22:
                TabContentPresenter tabContentPresenter = (TabContentPresenter) obj;
                return tabContentPresenter.tabToolbarTransformerFactory.create(tabContentPresenter.navigator, LocalTabScreen.INSTANCE);
            case 23:
                return Updater.mutableStateOf$default(Boolean.valueOf(((LocalCheckoutOrderSummaryViewModel) obj).isExpanded));
            case 24:
                MapBuilder mapBuilder = new MapBuilder();
                List list = ((LocalBrandLocationMenuViewModel) obj).menuCategories;
                int size = list.size();
                int i3 = 0;
                int i4 = 0;
                while (i3 < size) {
                    LocalBrandLocationMenuViewModel.MenuCategory menuCategory = (LocalBrandLocationMenuViewModel.MenuCategory) list.get(i3);
                    int i5 = i4 + 1;
                    mapBuilder.put(Integer.valueOf(i4), Integer.valueOf(i3));
                    menuCategory.getClass();
                    LocalBrandLocationMenuViewModel.MenuCategory.Style style = LocalBrandLocationMenuViewModel.MenuCategory.Style.LIST;
                    LocalBrandLocationMenuViewModel.MenuCategory.Style style2 = LocalBrandLocationMenuViewModel.MenuCategory.Style.LIST;
                    List list2 = menuCategory.items;
                    int size2 = list2.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        mapBuilder.put(Integer.valueOf(i5), Integer.valueOf(i3));
                        i6++;
                        i5++;
                    }
                    i3++;
                    i4 = i5;
                }
                return Updater.mutableStateOf$default(mapBuilder.build());
            case 25:
                return Float.valueOf(((CollapsingToolbarScaffoldState) obj).toolbarState.getProgress());
            case 26:
                return new Pair(Integer.valueOf(((LazyGridState) obj).scrollPosition.index$delegate.getIntValue()), Boolean.valueOf(!r10.getCanScrollForward()));
            case 27:
                return BarcodeScanning.getClient(new BarcodeScannerOptions(256, new ZoomSuggestionOptions((LocalPosCheckInViewKt$$ExternalSyntheticLambda5) obj)));
            case 28:
                return Integer.valueOf(((EducationalSheetModelList) obj).sheets.size());
            default:
                OffsetQueryPagingSource offsetQueryPagingSource = (OffsetQueryPagingSource) obj;
                ConstrainScope.DimensionProperty dimensionProperty = offsetQueryPagingSource.currentQuery$delegate;
                KProperty[] kPropertyArr = OffsetQueryPagingSource.$$delegatedProperties;
                Query query = (Query) dimensionProperty.getValue(offsetQueryPagingSource, kPropertyArr[0]);
                if (query != null) {
                    query.removeListener(offsetQueryPagingSource);
                }
                dimensionProperty.setValue(offsetQueryPagingSource, kPropertyArr[0], null);
                return Unit.INSTANCE;
        }
    }
}
