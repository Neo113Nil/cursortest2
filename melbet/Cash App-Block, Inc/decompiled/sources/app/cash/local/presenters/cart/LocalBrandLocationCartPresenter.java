package app.cash.local.presenters.cart;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import androidx.paging.LoadState;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$clear$2;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.backend.BuyerIntentManager;
import app.cash.local.backend.BuyerIntentScope;
import app.cash.local.backend.BuyerIntentState;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.CartBuilderKt;
import app.cash.local.backend.CartBuilderManager;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.backend.real.RealLocalBrandRepository;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.navigation.LocalInstalledStoreKt;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.BuyerIntentCartScopesKt;
import app.cash.local.presenters.RealOrderBuilder$Factory$Impl;
import app.cash.local.presenters.RealOrderBuilderStore;
import app.cash.local.presenters.cart.OpenTabAddRoundResult;
import app.cash.local.presenters.cart.OpenTabAddRoundState;
import app.cash.local.presenters.internal.FulfillmentTimeUtils;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.presenters.internal.OpenTabStateKt;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.CartEntryKt;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.DiscountCode;
import app.cash.local.primitives.DiscountCodeKt;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.FulfillmentConfigurations;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.OfferToken;
import app.cash.local.primitives.SelectionKt;
import app.cash.local.primitives.math.LocalMoneysKt;
import app.cash.local.screens.app.LocalBrandLocationCartScreen;
import app.cash.local.service.LocalService;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.local.viewmodels.AppliedCouponBanner;
import app.cash.local.viewmodels.CartItemCounterViewModel;
import app.cash.local.viewmodels.ComboSlotViewModel;
import app.cash.local.viewmodels.CreateCartErrorViewModel;
import app.cash.local.viewmodels.FreeDeliveryMeter;
import app.cash.local.viewmodels.LocalBrandBannerModel;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.viewmodels.OrderLimitBanner;
import app.cash.local.viewmodels.internal.Amount;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda3;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda9;
import app.cash.molecule.PlatformKt;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.g6$$ExternalSyntheticLambda11;
import bo.app.h2$$ExternalSyntheticLambda0;
import bo.app.l2$$ExternalSyntheticLambda7;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader$execute$2;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import com.datadog.android.core.internal.metrics.RemovalReason;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.ToastKt$Toast$7$1;
import com.squareup.cash.card.onboarding.CardModelView$1$3$4$2;
import com.squareup.cash.cdf.localclient.FulfillmentType;
import com.squareup.cash.cdf.localclient.LocalClientFulfillmentFlowClickSchedulingType;
import com.squareup.cash.cdf.localclient.SchedulingType;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.NotInitiatedState;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.session.backend.SwitchingState;
import com.squareup.cash.wallet.views.InteractiveCardState$animateLock$2;
import com.squareup.contour.HasTop$DefaultImpls;
import com.squareup.protos.cash.local.client.v1.AddRoundToTabRequest;
import com.squareup.protos.cash.local.client.v1.AddRoundToTabResponse;
import com.squareup.protos.cash.local.client.v1.AddRoundToTabResponse$Response$Error;
import com.squareup.protos.cash.local.client.v1.AddRoundToTabResponse$Response$Success;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse$Response$Cart;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse$Response$ErrorResponse;
import com.squareup.protos.cash.local.client.v1.GetBuyerInfoResponse;
import com.squareup.protos.cash.local.client.v1.LocalActionOrdering;
import com.squareup.protos.cash.local.client.v1.LocalAddress;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalText;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class LocalBrandLocationCartPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final BrandSpot brandSpot;
    public final BuyerIntentManager buyerIntentManager;
    public final LocalCartCheckoutNavigator cartCheckoutNavigator;
    public final CartBuilderManager cartManager;
    public final FulfillmentTimeUtils fulfillmentTimeUtils;
    public final RealLocalLauncher launcher;
    public final RealLocalBrandRepository localBrandRepository;
    public final BetterNavigator.ScreenNavigator navigator;
    public final LocalOpenTabCartMapper openTabCartMapper;
    public final RealOrderBuilder$Factory$Impl orderBuilderFactory;
    public final RealOrderBuilderStore orderStore;
    public final LocalBrandLocationCartScreen screen;
    public final LocalService service;
    public final SessionManager sessionManager;
    public final LocalInstalledStore store;
    public final AndroidStringManager stringManager;
    public final RealLocalBrandSyncer syncer;

    public LocalBrandLocationCartPresenter(CartBuilderManager cartBuilderManager, SessionManager sessionManager, AndroidStringManager androidStringManager, RealLocalBrandRepository realLocalBrandRepository, RealOrderBuilderStore realOrderBuilderStore, LocalInstalledStore localInstalledStore, LocalService localService, RealOrderBuilder$Factory$Impl realOrderBuilder$Factory$Impl, RealLocalBrandSyncer realLocalBrandSyncer, Analytics analytics, FulfillmentTimeUtils fulfillmentTimeUtils, LocalOpenTabCartMapper localOpenTabCartMapper, LocalCartCheckoutNavigator localCartCheckoutNavigator, RealLocalLauncher realLocalLauncher, RealUuidGenerator realUuidGenerator, BuyerIntentManager buyerIntentManager, LocalBrandLocationCartScreen localBrandLocationCartScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        localBrandLocationCartScreen.getClass();
        this.cartManager = cartBuilderManager;
        this.sessionManager = sessionManager;
        this.stringManager = androidStringManager;
        this.localBrandRepository = realLocalBrandRepository;
        this.orderStore = realOrderBuilderStore;
        this.store = localInstalledStore;
        this.service = localService;
        this.orderBuilderFactory = realOrderBuilder$Factory$Impl;
        this.syncer = realLocalBrandSyncer;
        this.analytics = analytics;
        this.fulfillmentTimeUtils = fulfillmentTimeUtils;
        this.openTabCartMapper = localOpenTabCartMapper;
        this.cartCheckoutNavigator = localCartCheckoutNavigator;
        this.launcher = realLocalLauncher;
        this.buyerIntentManager = buyerIntentManager;
        this.screen = localBrandLocationCartScreen;
        this.navigator = screenNavigator;
        this.brandSpot = localBrandLocationCartScreen.brandSpot;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$addSelectionsToOpenTab(LocalBrandLocationCartPresenter localBrandLocationCartPresenter, LocalCart localCart, CartBuilder cartBuilder, CardModelView$1$3$4$2 cardModelView$1$3$4$2, ContinuationImpl continuationImpl) {
        LocalBrandLocationCartPresenter$addSelectionsToOpenTab$1 localBrandLocationCartPresenter$addSelectionsToOpenTab$1;
        int i;
        String str;
        String str2;
        String appToken;
        Object addRoundToTab;
        Function0 function0;
        ApiResult apiResult;
        AddRoundToTabResponse.Error error;
        LocalCart localCart2;
        CreateCartResponse createCartResponse;
        zzho zzhoVar;
        AddRoundToTabResponse.Error error2;
        List list;
        LocalErrorResponse localErrorResponse;
        CreateCartResponse createCartResponse2;
        zzho zzhoVar2;
        LocalErrorResponse localErrorResponse2;
        CartBuilder cartBuilder2 = cartBuilder;
        if (continuationImpl instanceof LocalBrandLocationCartPresenter$addSelectionsToOpenTab$1) {
            localBrandLocationCartPresenter$addSelectionsToOpenTab$1 = (LocalBrandLocationCartPresenter$addSelectionsToOpenTab$1) continuationImpl;
            int i2 = localBrandLocationCartPresenter$addSelectionsToOpenTab$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                localBrandLocationCartPresenter$addSelectionsToOpenTab$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = localBrandLocationCartPresenter$addSelectionsToOpenTab$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = localBrandLocationCartPresenter$addSelectionsToOpenTab$1.label;
                LocalCart localCart3 = null;
                r9 = null;
                Iterable iterable = null;
                localCart3 = null;
                localCart3 = null;
                localCart3 = null;
                localCart3 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str3 = localCart.token;
                    if (str3 != null && (str = localCart.version) != null) {
                        SnapshotStateList snapshotStateList = ((RealCartBuilder) cartBuilder2).selections;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator = snapshotStateList.listIterator();
                        while (true) {
                            StateListIterator stateListIterator = (StateListIterator) listIterator;
                            if (!stateListIterator.hasNext()) {
                                break;
                            }
                            Object next = stateListIterator.next();
                            if (((CartEntryWithQuantity) next).getQuantity() > 0) {
                                arrayList.add(next);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            CartEntryWithQuantity cartEntryWithQuantity = (CartEntryWithQuantity) it.next();
                            cartEntryWithQuantity.getClass();
                            arrayList2.add(SelectionKt.toProtoSelection(CartEntryKt.toSelection(cartEntryWithQuantity.getCartEntry(), cartEntryWithQuantity.getQuantity())));
                        }
                        SessionState currentSessionState = PlatformKt.getCurrentSessionState(localBrandLocationCartPresenter.sessionManager);
                        if (currentSessionState instanceof NotInitiatedState) {
                            appToken = ((NotInitiatedState) currentSessionState).appToken;
                        } else {
                            if ((currentSessionState instanceof SessionState.Authenticated) || (currentSessionState instanceof SwitchingState)) {
                                str2 = null;
                                AddRoundToTabRequest addRoundToTabRequest = new AddRoundToTabRequest(str3, str, str2, arrayList2, ByteString.EMPTY);
                                LocalService localService = localBrandLocationCartPresenter.service;
                                localBrandLocationCartPresenter$addSelectionsToOpenTab$1.L$1 = cartBuilder2;
                                localBrandLocationCartPresenter$addSelectionsToOpenTab$1.L$2 = cardModelView$1$3$4$2;
                                localBrandLocationCartPresenter$addSelectionsToOpenTab$1.label = 1;
                                addRoundToTab = localService.addRoundToTab(addRoundToTabRequest, localBrandLocationCartPresenter$addSelectionsToOpenTab$1);
                                if (addRoundToTab != coroutineSingletons) {
                                    obj = addRoundToTab;
                                    function0 = cardModelView$1$3$4$2;
                                }
                                return coroutineSingletons;
                            }
                            if (!(currentSessionState instanceof SessionState.Initiated)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            appToken = ((SessionState.Initiated) currentSessionState).getAppToken();
                        }
                        str2 = appToken;
                        AddRoundToTabRequest addRoundToTabRequest2 = new AddRoundToTabRequest(str3, str, str2, arrayList2, ByteString.EMPTY);
                        LocalService localService2 = localBrandLocationCartPresenter.service;
                        localBrandLocationCartPresenter$addSelectionsToOpenTab$1.L$1 = cartBuilder2;
                        localBrandLocationCartPresenter$addSelectionsToOpenTab$1.L$2 = cardModelView$1$3$4$2;
                        localBrandLocationCartPresenter$addSelectionsToOpenTab$1.label = 1;
                        addRoundToTab = localService2.addRoundToTab(addRoundToTabRequest2, localBrandLocationCartPresenter$addSelectionsToOpenTab$1);
                        if (addRoundToTab != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    return new OpenTabAddRoundResult.Failure();
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    localCart2 = localBrandLocationCartPresenter$addSelectionsToOpenTab$1.L$7;
                    function0 = localBrandLocationCartPresenter$addSelectionsToOpenTab$1.L$2;
                    cartBuilder2 = localBrandLocationCartPresenter$addSelectionsToOpenTab$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    ((RealCartBuilder) cartBuilder2).clearAll();
                    function0.invoke();
                    return new OpenTabAddRoundResult.Success(localCart2);
                }
                function0 = localBrandLocationCartPresenter$addSelectionsToOpenTab$1.L$2;
                cartBuilder2 = localBrandLocationCartPresenter$addSelectionsToOpenTab$1.L$1;
                SafeTrace.throwOnFailure(obj);
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                    if (failure instanceof ApiResult.Failure.HttpFailure) {
                        Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult).code, "HttpFailure adding round to open tab [", "]"), new Object[0]);
                    } else {
                        if (!(failure instanceof ApiResult.Failure.NetworkFailure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest.e("NetworkFailure adding round to open tab", new Object[0], ((ApiResult.Failure.NetworkFailure) apiResult).error);
                    }
                    return new OpenTabAddRoundResult.Failure();
                }
                AddRoundToTabResponse addRoundToTabResponse = (AddRoundToTabResponse) ((ApiResult.Success) apiResult).response;
                RemovalReason removalReason = addRoundToTabResponse.response;
                if (removalReason != null) {
                    AddRoundToTabResponse$Response$Error addRoundToTabResponse$Response$Error = removalReason instanceof AddRoundToTabResponse$Response$Error ? (AddRoundToTabResponse$Response$Error) removalReason : null;
                    if (addRoundToTabResponse$Response$Error != null) {
                        error = addRoundToTabResponse$Response$Error.value;
                        if (error != null) {
                            if (removalReason != null) {
                                AddRoundToTabResponse$Response$Success addRoundToTabResponse$Response$Success = removalReason instanceof AddRoundToTabResponse$Response$Success ? (AddRoundToTabResponse$Response$Success) removalReason : null;
                                AddRoundToTabResponse.Success success = addRoundToTabResponse$Response$Success != null ? addRoundToTabResponse$Response$Success.value : null;
                                if (success != null && (createCartResponse = success.updated_cart) != null && (zzhoVar = createCartResponse.response) != null) {
                                    CreateCartResponse$Response$Cart createCartResponse$Response$Cart = zzhoVar instanceof CreateCartResponse$Response$Cart ? (CreateCartResponse$Response$Cart) zzhoVar : null;
                                    if (createCartResponse$Response$Cart != null) {
                                        localCart3 = createCartResponse$Response$Cart.value;
                                    }
                                }
                            }
                            if (localCart3 == null) {
                                function0.invoke();
                                return new OpenTabAddRoundResult.Failure();
                            }
                            LocalInstalledStore localInstalledStore = localBrandLocationCartPresenter.store;
                            String str4 = localBrandLocationCartPresenter.brandSpot.brandToken;
                            localBrandLocationCartPresenter$addSelectionsToOpenTab$1.L$1 = cartBuilder2;
                            localBrandLocationCartPresenter$addSelectionsToOpenTab$1.L$2 = function0;
                            localBrandLocationCartPresenter$addSelectionsToOpenTab$1.L$7 = localCart3;
                            localBrandLocationCartPresenter$addSelectionsToOpenTab$1.label = 2;
                            if (((RealLocalInstalledStore) localInstalledStore).m1287clearFulfillmentConfigurationNmdeRlM(str4, localBrandLocationCartPresenter$addSelectionsToOpenTab$1) != coroutineSingletons) {
                                localCart2 = localCart3;
                                ((RealCartBuilder) cartBuilder2).clearAll();
                                function0.invoke();
                                return new OpenTabAddRoundResult.Success(localCart2);
                            }
                            return coroutineSingletons;
                        }
                        function0.invoke();
                        RemovalReason removalReason2 = addRoundToTabResponse.response;
                        if (removalReason2 != null) {
                            AddRoundToTabResponse$Response$Error addRoundToTabResponse$Response$Error2 = removalReason2 instanceof AddRoundToTabResponse$Response$Error ? (AddRoundToTabResponse$Response$Error) removalReason2 : null;
                            if (addRoundToTabResponse$Response$Error2 != null) {
                                error2 = addRoundToTabResponse$Response$Error2.value;
                                if (error2 != null && (createCartResponse2 = error2.current_cart) != null && (zzhoVar2 = createCartResponse2.response) != null) {
                                    CreateCartResponse$Response$ErrorResponse createCartResponse$Response$ErrorResponse = !(zzhoVar2 instanceof CreateCartResponse$Response$ErrorResponse) ? (CreateCartResponse$Response$ErrorResponse) zzhoVar2 : null;
                                    localErrorResponse2 = createCartResponse$Response$ErrorResponse == null ? createCartResponse$Response$ErrorResponse.value : null;
                                    if (localErrorResponse2 != null) {
                                        list = localErrorResponse2.errors;
                                        if (list == null) {
                                            list = EmptyList.INSTANCE;
                                        }
                                        List list2 = list;
                                        if (error2 != null && (localErrorResponse = error2.error_response) != null) {
                                            iterable = localErrorResponse.errors;
                                        }
                                        if (iterable == null) {
                                            iterable = EmptyList.INSTANCE;
                                        }
                                        return new OpenTabAddRoundResult.Failure(localBrandLocationCartPresenter.toCreateCartErrorViewModels(CollectionsKt.plus(iterable, (Collection) list2)));
                                    }
                                }
                                list = null;
                                if (list == null) {
                                }
                                List list22 = list;
                                if (error2 != null) {
                                    iterable = localErrorResponse.errors;
                                }
                                if (iterable == null) {
                                }
                                return new OpenTabAddRoundResult.Failure(localBrandLocationCartPresenter.toCreateCartErrorViewModels(CollectionsKt.plus(iterable, (Collection) list22)));
                            }
                        }
                        error2 = null;
                        if (error2 != null) {
                            if (!(zzhoVar2 instanceof CreateCartResponse$Response$ErrorResponse)) {
                            }
                            if (createCartResponse$Response$ErrorResponse == null) {
                            }
                            if (localErrorResponse2 != null) {
                            }
                        }
                        list = null;
                        if (list == null) {
                        }
                        List list222 = list;
                        if (error2 != null) {
                        }
                        if (iterable == null) {
                        }
                        return new OpenTabAddRoundResult.Failure(localBrandLocationCartPresenter.toCreateCartErrorViewModels(CollectionsKt.plus(iterable, (Collection) list222)));
                    }
                }
                error = null;
                if (error != null) {
                }
            }
        }
        localBrandLocationCartPresenter$addSelectionsToOpenTab$1 = new LocalBrandLocationCartPresenter$addSelectionsToOpenTab$1(localBrandLocationCartPresenter, continuationImpl);
        Object obj2 = localBrandLocationCartPresenter$addSelectionsToOpenTab$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = localBrandLocationCartPresenter$addSelectionsToOpenTab$1.label;
        LocalCart localCart32 = null;
        iterable = null;
        Iterable iterable2 = null;
        localCart32 = null;
        localCart32 = null;
        localCart32 = null;
        localCart32 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* renamed from: access$logClickSchedulingType-hYjS5Xw, reason: not valid java name */
    public static final void m1218access$logClickSchedulingTypehYjS5Xw(LocalBrandLocationCartPresenter localBrandLocationCartPresenter, String str, String str2, FulfillmentConfiguration fulfillmentConfiguration, SchedulingType schedulingType) {
        String str3;
        String str4;
        SchedulingType schedulingType2;
        FulfillmentType fulfillmentType;
        FulfillmentType fulfillmentType2;
        Analytics analytics = localBrandLocationCartPresenter.analytics;
        String str5 = localBrandLocationCartPresenter.brandSpot.brandToken;
        String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(localBrandLocationCartPresenter.sessionManager);
        if (fulfillmentConfiguration instanceof FulfillmentConfiguration.Delivery) {
            fulfillmentType2 = FulfillmentType.DELIVERY;
        } else {
            if (!(fulfillmentConfiguration instanceof FulfillmentConfiguration.Pickup)) {
                if (!(fulfillmentConfiguration instanceof FulfillmentConfiguration.InStore) && !Intrinsics.areEqual(fulfillmentConfiguration, FulfillmentConfiguration.Unspecified.INSTANCE) && fulfillmentConfiguration != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                str3 = str;
                str4 = str2;
                schedulingType2 = schedulingType;
                fulfillmentType = null;
                analytics.track(new LocalClientFulfillmentFlowClickSchedulingType(str5, str3, activeAccountTokenOrNull, str4, fulfillmentType, schedulingType2), null);
            }
            fulfillmentType2 = FulfillmentType.PICKUP;
        }
        fulfillmentType = fulfillmentType2;
        str3 = str;
        str4 = str2;
        schedulingType2 = schedulingType;
        analytics.track(new LocalClientFulfillmentFlowClickSchedulingType(str5, str3, activeAccountTokenOrNull, str4, fulfillmentType, schedulingType2), null);
    }

    /* renamed from: getCreateCartErrorViewModelsFor-7B2eUzg, reason: not valid java name */
    public static ArrayList m1219getCreateCartErrorViewModelsFor7B2eUzg(String str, String str2, String str3, Map map) {
        List list = str != null ? (List) map.get(new CreateCartErrorViewModel.RelatedToken(str)) : null;
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        List list2 = list;
        List list3 = str2 != null ? (List) map.get(new CreateCartErrorViewModel.RelatedToken(str2)) : null;
        if (list3 == null) {
            list3 = EmptyList.INSTANCE;
        }
        ArrayList plus = CollectionsKt.plus((Iterable) list3, (Collection) list2);
        List list4 = str3 != null ? (List) map.get(new CreateCartErrorViewModel.RelatedToken(str3)) : null;
        if (list4 == null) {
            list4 = EmptyList.INSTANCE;
        }
        return CollectionsKt.plus((Iterable) list4, (Collection) plus);
    }

    public static final void models$clearPlaceOrderErrors(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, boolean z) {
        mutableState.setValue(EmptyList.INSTANCE);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        mutableState2.setValue(emptyMap);
        if (z) {
            mutableState3.setValue(EmptySet.INSTANCE);
        }
        mutableState4.setValue(new OpenTabAddRoundState.Idle(((OpenTabAddRoundState) mutableState4.getValue()).getAttemptId()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0b7a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0b97  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0bb3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0bbf  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0bd8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0c03  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0c59  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0c81  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0c9f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0cbb  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0e4a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0e5d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0e83  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0eb1  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0ec9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0ecc  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0e91  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0e6d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0d9f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0dbf  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0dd5  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0c86  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0c6f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0be4  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0ba3  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0b8b  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0a4c  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0a5f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0a56  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x088a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x085e A[SYNTHETIC] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        BuyerIntentState buyerIntentState;
        Continuation continuation;
        Object realImageLoader$execute$2;
        LocalFulfillmentType localFulfillmentType;
        boolean z;
        Continuation continuation2;
        BuyerIntentState buyerIntentState2;
        RealCartBuilder realCartBuilder;
        MutableState mutableState;
        CoroutineScope coroutineScope;
        RealLocalBrandRepository realLocalBrandRepository;
        int i2;
        Map map;
        State state;
        Object localBrandLocationCartPresenter$models$5$1;
        Continuation continuation3;
        BrandSpotSyncTokens brandSpotSyncTokens;
        MutableState mutableState2;
        State state2;
        char c;
        MutableState mutableState3;
        Object interactiveCardState$animateLock$2;
        RealCartBuilder realCartBuilder2;
        Continuation continuation4;
        MutableState mutableState4;
        int i3;
        boolean z2;
        MutableState mutableState5;
        CoroutineScope coroutineScope2;
        MutableState mutableState6;
        MutableState mutableState7;
        MutableState mutableState8;
        MutableState mutableState9;
        Object obj;
        Object obj2;
        AbstractPersistentList abstractPersistentList;
        MutableState mutableState10;
        State state3;
        List list;
        ListIterator listIterator;
        int i4;
        AbstractPersistentList abstractPersistentList2;
        MutableState mutableState11;
        State state4;
        LocalBrandLocationCartViewModel.Selection selection;
        LocalOpenTabCartMapper localOpenTabCartMapper;
        AndroidStringManager androidStringManager;
        LocalImage localImage;
        String str;
        MenuItem m1244menuItemOrNullGvMOdU0;
        Integer num;
        Object openTabBannerTitle$OrderedItems;
        String str2;
        Object obj3;
        String str3;
        String str4;
        String format2;
        LocalBrandLocationCartViewModel.OpenTabBanner.TrailingIcon trailingIcon;
        LocalBrandLocationCartViewModel.OpenTabBanner.TrailingIcon trailingIcon2;
        boolean z3;
        LocalBrandLocationCartViewModel.Fulfillment fulfillment;
        LocalBrandLocationCartViewModel.Fulfillment pickup;
        LocalAddress localAddress;
        String str5;
        Object rememberedValue;
        MutableState mutableState12;
        LocationMenu locationMenu;
        LocalMoney calculateCost;
        Object rememberedValue2;
        LocationMenu locationMenu2;
        LocalMoney calculateCost2;
        AppliedCouponBanner appliedCouponBanner;
        LocalBrandBannerModel localBrandBannerModel;
        Map map2;
        int intValue;
        OrderLimitBanner orderLimitBanner;
        FulfillmentConfiguration fulfillmentConfiguration;
        long j;
        LocalMoney localMoney;
        long j2;
        State state5;
        GapComposer gapComposer;
        MutableState mutableState13;
        FreeDeliveryMeter freeDeliveryMeter;
        int ordinal;
        boolean z4;
        String str6;
        String str7;
        LocalFulfillmentType type2;
        Location.LargeOrderLimits largeOrderLimits;
        LoadState check;
        String format3;
        FulfillmentConfiguration fulfillmentConfiguration2;
        FulfillmentConfiguration fulfillmentConfiguration3;
        LocalCart.OpenTabInfo openTabInfo;
        LocalOpenTabCartMapper localOpenTabCartMapper2 = this.openTabCartMapper;
        AndroidStringManager androidStringManager2 = localOpenTabCartMapper2.stringManager;
        flow.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(-295355415);
        LocalBrandLocationCartScreen localBrandLocationCartScreen = this.screen;
        BrandSpotSyncTokens brandSpotSyncTokens2 = localBrandLocationCartScreen.syncTokens;
        BrandSpotSyncTokens brandSpotSyncTokens3 = localBrandLocationCartScreen.syncTokens;
        String str8 = brandSpotSyncTokens2.inStoreOrderingToken;
        BuyerIntentManager buyerIntentManager = this.buyerIntentManager;
        BrandSpot brandSpot = this.brandSpot;
        BuyerIntentState rememberBuyerIntentCartState = BuyerIntentCartScopesKt.rememberBuyerIntentCartState(buyerIntentManager, brandSpot, str8, gapComposer2);
        Continuation continuation5 = null;
        BuyerIntentScope buyerIntentScope = rememberBuyerIntentCartState != null ? rememberBuyerIntentCartState.scope : null;
        CartBuilderManager cartBuilderManager = this.cartManager;
        Object rememberBuyerIntentCartBuilder = BuyerIntentCartScopesKt.rememberBuyerIntentCartBuilder(cartBuilderManager, rememberBuyerIntentCartState, brandSpot, gapComposer2);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(rememberBuyerIntentCartBuilder, gapComposer2);
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(buyerIntentScope, gapComposer2);
        boolean changedInstance = gapComposer2.changedInstance(this) | gapComposer2.changedInstance(rememberBuyerIntentCartBuilder);
        Object rememberedValue3 = gapComposer2.rememberedValue();
        Object obj4 = Composer.Companion.Empty;
        if (changedInstance || rememberedValue3 == obj4) {
            rememberedValue3 = new RealBadger2$clear$2(this, rememberBuyerIntentCartBuilder, continuation5, 29);
            gapComposer2.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(brandSpot, rememberBuyerIntentCartBuilder, (Function2) rememberedValue3, gapComposer2);
        Object rememberedValue4 = gapComposer2.rememberedValue();
        if (rememberedValue4 == obj4) {
            rememberedValue4 = new LinkedHashMap();
            gapComposer2.updateRememberedValue(rememberedValue4);
        }
        Map map3 = (Map) rememberedValue4;
        RealCartBuilder realCartBuilder3 = (RealCartBuilder) rememberBuyerIntentCartBuilder;
        realCartBuilder3.getClass();
        SnapshotStateList snapshotStateList = realCartBuilder3.discountCodes;
        gapComposer2.startReplaceGroup(-740661927);
        boolean booleanValue = ((Boolean) realCartBuilder3.includesPreorderItemsState.getValue()).booleanValue();
        gapComposer2.end(false);
        Object[] objArr = new Object[0];
        Object rememberedValue5 = gapComposer2.rememberedValue();
        if (rememberedValue5 == obj4) {
            buyerIntentState = rememberBuyerIntentCartState;
            rememberedValue5 = new LocalMapKt$$ExternalSyntheticLambda3(4);
            gapComposer2.updateRememberedValue(rememberedValue5);
        } else {
            buyerIntentState = rememberBuyerIntentCartState;
        }
        MutableState mutableState14 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue5, gapComposer2, 48);
        Object rememberedValue6 = gapComposer2.rememberedValue();
        RealLocalBrandRepository realLocalBrandRepository2 = this.localBrandRepository;
        if (rememberedValue6 == obj4) {
            rememberedValue6 = realLocalBrandRepository2.brand(brandSpot);
            gapComposer2.updateRememberedValue(rememberedValue6);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue6, null, null, gapComposer2, 48, 2);
        boolean changed = gapComposer2.changed((LocalBrand) collectAsState.getValue()) | gapComposer2.changed(brandSpotSyncTokens3.inStoreOrderingToken);
        Object rememberedValue7 = gapComposer2.rememberedValue();
        if (changed || rememberedValue7 == obj4) {
            rememberedValue7 = Updater.derivedStateOf(new StatusRunnable$$ExternalSyntheticLambda1(13, this, collectAsState));
            gapComposer2.updateRememberedValue(rememberedValue7);
        }
        State state6 = (State) rememberedValue7;
        boolean changed2 = gapComposer2.changed((FulfillmentConfiguration) state6.getValue()) | gapComposer2.changed(booleanValue);
        Object rememberedValue8 = gapComposer2.rememberedValue();
        if (changed2 || rememberedValue8 == obj4) {
            rememberedValue8 = Updater.derivedStateOf(new g6$$ExternalSyntheticLambda11(this, booleanValue, state6, mutableState14));
            gapComposer2.updateRememberedValue(rememberedValue8);
        }
        State state7 = (State) rememberedValue8;
        boolean changedInstance2 = gapComposer2.changedInstance(this) | gapComposer2.changed(mutableState14);
        Object rememberedValue9 = gapComposer2.rememberedValue();
        int i5 = 10;
        if (changedInstance2 || rememberedValue9 == obj4) {
            continuation = null;
            rememberedValue9 = new ZiplineLoader$ModuleJob$run$3(this, mutableState14, continuation, i5);
            gapComposer2.updateRememberedValue(rememberedValue9);
        } else {
            continuation = null;
        }
        Updater.LaunchedEffect(gapComposer2, brandSpot, (Function2) rememberedValue9);
        Object rememberedValue10 = gapComposer2.rememberedValue();
        if (rememberedValue10 == obj4) {
            rememberedValue10 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
            gapComposer2.updateRememberedValue(rememberedValue10);
        }
        CoroutineScope coroutineScope3 = (CoroutineScope) rememberedValue10;
        boolean changedInstance3 = gapComposer2.changedInstance(coroutineScope3) | gapComposer2.changedInstance(this);
        Object rememberedValue11 = gapComposer2.rememberedValue();
        int i6 = 2;
        if (changedInstance3 || rememberedValue11 == obj4) {
            rememberedValue11 = new LocalMapKt$$ExternalSyntheticLambda9(i6, coroutineScope3, this);
            gapComposer2.updateRememberedValue(rememberedValue11);
        }
        Function2 function2 = (Function2) rememberedValue11;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer2.consume(AnswersKt.LocalAnswerDispatcher);
        boolean changed3 = gapComposer2.changed(function2) | gapComposer2.changedInstance(answerDispatcher);
        Object rememberedValue12 = gapComposer2.rememberedValue();
        if (changed3 || rememberedValue12 == obj4) {
            rememberedValue12 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, i5);
            gapComposer2.updateRememberedValue(rememberedValue12);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue12, gapComposer2);
        FulfillmentConfiguration fulfillmentConfiguration4 = (FulfillmentConfiguration) state7.getValue();
        if (fulfillmentConfiguration4 != null) {
            LocalFulfillment.SchedulingDetails schedulingDetails = fulfillmentConfiguration4.getSchedulingDetails();
            brandSpotSyncTokens3 = BrandSpotSyncTokens.copy$default(brandSpotSyncTokens3, schedulingDetails != null ? schedulingDetails.scheduling_day_time_token : continuation, 6);
        }
        MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(brandSpotSyncTokens3, gapComposer2);
        LocalFulfillmentType type3 = FulfillmentConfigurationKt.getType((FulfillmentConfiguration) state7.getValue());
        boolean changedInstance4 = gapComposer2.changedInstance(this) | gapComposer2.changedInstance(brandSpotSyncTokens3) | gapComposer2.changed(state7);
        Object rememberedValue13 = gapComposer2.rememberedValue();
        if (changedInstance4 || rememberedValue13 == obj4) {
            localFulfillmentType = type3;
            z = booleanValue;
            continuation2 = continuation;
            buyerIntentState2 = buyerIntentState;
            realCartBuilder = realCartBuilder3;
            mutableState = mutableState14;
            coroutineScope = coroutineScope3;
            realLocalBrandRepository = realLocalBrandRepository2;
            i2 = 48;
            realImageLoader$execute$2 = new RealImageLoader$execute$2(this, brandSpotSyncTokens3, state7, continuation2, 3);
            map = map3;
            state = state7;
            gapComposer2.updateRememberedValue(realImageLoader$execute$2);
        } else {
            localFulfillmentType = type3;
            realImageLoader$execute$2 = rememberedValue13;
            z = booleanValue;
            continuation2 = continuation;
            map = map3;
            buyerIntentState2 = buyerIntentState;
            mutableState = mutableState14;
            coroutineScope = coroutineScope3;
            state = state7;
            realCartBuilder = realCartBuilder3;
            i2 = 48;
            realLocalBrandRepository = realLocalBrandRepository2;
        }
        Updater.LaunchedEffect(brandSpot, brandSpotSyncTokens3, localFulfillmentType, (Function2) realImageLoader$execute$2, gapComposer2);
        boolean changed4 = gapComposer2.changed((LocalBrand) collectAsState.getValue());
        Object rememberedValue14 = gapComposer2.rememberedValue();
        if (changed4 || rememberedValue14 == obj4) {
            rememberedValue14 = Updater.derivedStateOf(new TooltipKt$$ExternalSyntheticLambda1(24, collectAsState));
            gapComposer2.updateRememberedValue(rememberedValue14);
        }
        State state8 = (State) rememberedValue14;
        Object rememberedValue15 = gapComposer2.rememberedValue();
        if (rememberedValue15 == obj4) {
            rememberedValue15 = Updater.derivedStateOf(new TooltipKt$$ExternalSyntheticLambda1(25, collectAsState));
            gapComposer2.updateRememberedValue(rememberedValue15);
        }
        State state9 = (State) rememberedValue15;
        BuyerIntentCartScopesKt.SeedBuyerIntentCartEffect(cartBuilderManager, buyerIntentState2, (LocationMenu) state9.getValue(), gapComposer2, 64);
        Object[] objArr2 = {realCartBuilder};
        Object rememberedValue16 = gapComposer2.rememberedValue();
        if (rememberedValue16 == obj4) {
            rememberedValue16 = new LocalMapKt$$ExternalSyntheticLambda3(5);
            gapComposer2.updateRememberedValue(rememberedValue16);
        }
        MutableState mutableState15 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue16, gapComposer2, i2);
        LocationMenu locationMenu3 = (LocationMenu) state9.getValue();
        LocalActionOrdering.PastOrder pastOrder = localBrandLocationCartScreen.pastOrder;
        boolean changedInstance5 = gapComposer2.changedInstance(this) | gapComposer2.changed(mutableState15) | gapComposer2.changed(rememberUpdatedState);
        Object rememberedValue17 = gapComposer2.rememberedValue();
        if (changedInstance5 || rememberedValue17 == obj4) {
            continuation3 = continuation2;
            brandSpotSyncTokens = brandSpotSyncTokens3;
            localBrandLocationCartPresenter$models$5$1 = new LocalBrandLocationCartPresenter$models$5$1(this, rememberUpdatedState, state9, mutableState15, null);
            mutableState2 = rememberUpdatedState;
            state2 = state9;
            gapComposer2.updateRememberedValue(localBrandLocationCartPresenter$models$5$1);
        } else {
            mutableState2 = rememberUpdatedState;
            state2 = state9;
            localBrandLocationCartPresenter$models$5$1 = rememberedValue17;
            brandSpotSyncTokens = brandSpotSyncTokens3;
            continuation3 = continuation2;
        }
        Updater.LaunchedEffect(locationMenu3, pastOrder, realCartBuilder, (Function2) localBrandLocationCartPresenter$models$5$1, gapComposer2);
        Object rememberedValue18 = gapComposer2.rememberedValue();
        if (rememberedValue18 == obj4) {
            rememberedValue18 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer2.updateRememberedValue(rememberedValue18);
        }
        MutableState mutableState16 = (MutableState) rememberedValue18;
        Object rememberedValue19 = gapComposer2.rememberedValue();
        if (rememberedValue19 == obj4) {
            Object realLocalInstalledStore$hideBrands$$inlined$map$1 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(LocalInstalledStoreKt.localCashBalanceOrNothing(this.store), 9);
            gapComposer2.updateRememberedValue(realLocalInstalledStore$hideBrands$$inlined$map$1);
            rememberedValue19 = realLocalInstalledStore$hideBrands$$inlined$map$1;
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue19, null, null, gapComposer2, 48, 2);
        Object rememberedValue20 = gapComposer2.rememberedValue();
        if (rememberedValue20 == obj4) {
            rememberedValue20 = realLocalBrandRepository.buyerInfo(brandSpot);
            gapComposer2.updateRememberedValue(rememberedValue20);
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue20, null, null, gapComposer2, 48, 2);
        MutableState rememberUpdatedState4 = Updater.rememberUpdatedState((GetBuyerInfoResponse.BuyerInfo) collectAsState3.getValue(), gapComposer2);
        Object rememberedValue21 = gapComposer2.rememberedValue();
        if (rememberedValue21 == obj4) {
            rememberedValue21 = Updater.mutableStateOf$default(new OpenTabAddRoundState.Idle(0));
            gapComposer2.updateRememberedValue(rememberedValue21);
        }
        MutableState mutableState17 = (MutableState) rememberedValue21;
        LocalCart rememberActiveOpenTabCart = OpenTabStateKt.rememberActiveOpenTabCart(realCartBuilder, (GetBuyerInfoResponse.BuyerInfo) collectAsState3.getValue(), gapComposer2);
        boolean hasOpenTabRounds = OpenTabStateKt.getHasOpenTabRounds(rememberActiveOpenTabCart);
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(((OpenTabAddRoundState) mutableState17.getValue()).getClass());
        Integer valueOf = Integer.valueOf(((OpenTabAddRoundState) mutableState17.getValue()).getAttemptId());
        Object rememberedValue22 = gapComposer2.rememberedValue();
        if (rememberedValue22 == obj4) {
            rememberedValue22 = new ZiplineLoader$ModuleJob$run$3(mutableState17, continuation3, 12);
            gapComposer2.updateRememberedValue(rememberedValue22);
        }
        Updater.LaunchedEffect(orCreateKotlinClass, valueOf, (Function2) rememberedValue22, gapComposer2);
        Object[] objArr3 = new Object[0];
        Object rememberedValue23 = gapComposer2.rememberedValue();
        if (rememberedValue23 == obj4) {
            c = 2;
            rememberedValue23 = new LocalMapKt$$ExternalSyntheticLambda3(2);
            gapComposer2.updateRememberedValue(rememberedValue23);
        } else {
            c = 2;
        }
        MutableState mutableState18 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue23, gapComposer2, 48);
        boolean z5 = (((GetBuyerInfoResponse.BuyerInfo) collectAsState3.getValue()) == null || hasOpenTabRounds) ? false : true;
        Boolean valueOf2 = Boolean.valueOf(z5);
        boolean changed5 = gapComposer2.changed(z5) | gapComposer2.changed(mutableState18);
        Object rememberedValue24 = gapComposer2.rememberedValue();
        if (changed5 || rememberedValue24 == obj4) {
            mutableState3 = collectAsState;
            realCartBuilder2 = realCartBuilder;
            continuation4 = continuation3;
            mutableState4 = mutableState18;
            i3 = 48;
            z2 = hasOpenTabRounds;
            mutableState5 = rememberUpdatedState2;
            coroutineScope2 = coroutineScope;
            interactiveCardState$animateLock$2 = new InteractiveCardState$animateLock$2(z5, mutableState4, mutableState17, continuation4, 1);
            gapComposer2.updateRememberedValue(interactiveCardState$animateLock$2);
        } else {
            mutableState4 = mutableState18;
            i3 = 48;
            mutableState3 = collectAsState;
            realCartBuilder2 = realCartBuilder;
            continuation4 = continuation3;
            interactiveCardState$animateLock$2 = rememberedValue24;
            z2 = hasOpenTabRounds;
            mutableState5 = rememberUpdatedState2;
            coroutineScope2 = coroutineScope;
        }
        Updater.LaunchedEffect(gapComposer2, valueOf2, (Function2) interactiveCardState$animateLock$2);
        LocalBrandLocationCartViewModel.Mode mode = z2 ? LocalBrandLocationCartViewModel.Mode.ADD_TO_OPEN_TAB : LocalBrandLocationCartViewModel.Mode.CART;
        BrandSpotSyncTokens brandSpotSyncTokens4 = brandSpotSyncTokens;
        MutableState rememberUpdatedState5 = Updater.rememberUpdatedState(mode, gapComposer2);
        Object obj5 = (GetBuyerInfoResponse.BuyerInfo) collectAsState3.getValue();
        String offerToken = DiscountCodeKt.getOfferToken(snapshotStateList);
        boolean changed6 = gapComposer2.changed(obj5) | gapComposer2.changed(offerToken != null ? new OfferToken(offerToken) : continuation4);
        Object rememberedValue25 = gapComposer2.rememberedValue();
        if (changed6 || rememberedValue25 == obj4) {
            rememberedValue25 = Updater.derivedStateOf(new l2$$ExternalSyntheticLambda7(collectAsState3, realCartBuilder2, mutableState3, collectAsState2, 7));
            gapComposer2.updateRememberedValue(rememberedValue25);
        }
        State state10 = (State) rememberedValue25;
        Object[] objArr4 = new Object[0];
        Object rememberedValue26 = gapComposer2.rememberedValue();
        if (rememberedValue26 == obj4) {
            rememberedValue26 = new LocalMapKt$$ExternalSyntheticLambda3(3);
            gapComposer2.updateRememberedValue(rememberedValue26);
        }
        MutableState mutableState19 = (MutableState) SaverKt.rememberSaveable(objArr4, (Function0) rememberedValue26, gapComposer2, i3);
        Object rememberedValue27 = gapComposer2.rememberedValue();
        if (rememberedValue27 == obj4) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            rememberedValue27 = Updater.mutableStateOf$default(emptyMap);
            gapComposer2.updateRememberedValue(rememberedValue27);
        }
        MutableState mutableState20 = (MutableState) rememberedValue27;
        Object rememberedValue28 = gapComposer2.rememberedValue();
        if (rememberedValue28 == obj4) {
            rememberedValue28 = Updater.mutableStateOf$default(EmptySet.INSTANCE);
            gapComposer2.updateRememberedValue(rememberedValue28);
        }
        MutableState mutableState21 = (MutableState) rememberedValue28;
        Object rememberedValue29 = gapComposer2.rememberedValue();
        if (rememberedValue29 == obj4) {
            rememberedValue29 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
            gapComposer2.updateRememberedValue(rememberedValue29);
        }
        MutableState mutableState22 = mutableState17;
        MutableState mutableState23 = (MutableState) rememberedValue29;
        LocalBrandLocationCartViewModel.Mode mode2 = mode;
        MutableState mutableState24 = mutableState4;
        RealCartBuilder realCartBuilder4 = realCartBuilder2;
        MutableState mutableState25 = mutableState3;
        State state11 = state2;
        MutableState mutableState26 = mutableState16;
        MutableState mutableState27 = mutableState20;
        MutableState mutableState28 = mutableState24;
        Updater.LaunchedEffect(gapComposer2, flow, new LocalBrandLocationCartPresenter$models$$inlined$CollectEffect$1(flow, null, mutableState2, mutableState5, map, this, brandSpotSyncTokens4, mutableState26, mutableState23, mutableState20, mutableState21, mutableState22, state11, rememberUpdatedState5, rememberUpdatedState4, coroutineScope2, state, mutableState24, rememberUpdatedState3, state8, mutableState19));
        AbstractPersistentList entries = realCartBuilder4.entries(gapComposer2);
        gapComposer2.startReplaceGroup(365458169);
        SnapshotStateList snapshotStateList2 = realCartBuilder4.buyerIntentErrorsState;
        snapshotStateList2.getClass();
        AbstractPersistentList abstractPersistentList3 = SnapshotId_jvmKt.getReadable(snapshotStateList2).list;
        gapComposer2.end(false);
        Object rememberedValue30 = gapComposer2.rememberedValue();
        if (rememberedValue30 == obj4) {
            rememberedValue30 = new ToastKt$Toast$7$1(mutableState21, null, 3);
            gapComposer2.updateRememberedValue(rememberedValue30);
        }
        Updater.LaunchedEffect(gapComposer2, abstractPersistentList3, (Function2) rememberedValue30);
        boolean changed7 = gapComposer2.changed(abstractPersistentList3);
        Object rememberedValue31 = gapComposer2.rememberedValue();
        if (changed7 || rememberedValue31 == obj4) {
            rememberedValue31 = toCreateCartErrorViewModels(abstractPersistentList3);
            gapComposer2.updateRememberedValue(rememberedValue31);
        }
        Map map4 = (Map) rememberedValue31;
        boolean changed8 = gapComposer2.changed((Set) mutableState21.getValue()) | gapComposer2.changed(map4);
        Object rememberedValue32 = gapComposer2.rememberedValue();
        if (changed8 || rememberedValue32 == obj4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map4.size()));
            Iterator it = map4.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                List list2 = (List) entry.getValue();
                MutableState mutableState29 = mutableState27;
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : list2) {
                    Iterator it2 = it;
                    MutableState mutableState30 = mutableState26;
                    MutableState mutableState31 = mutableState23;
                    MutableState mutableState32 = mutableState28;
                    if (!((Set) mutableState21.getValue()).contains(new CreateCartErrorViewModel.ErrorId(((CreateCartErrorViewModel) obj6).id))) {
                        arrayList.add(obj6);
                    }
                    it = it2;
                    mutableState26 = mutableState30;
                    mutableState28 = mutableState32;
                    mutableState23 = mutableState31;
                }
                linkedHashMap.put(key, arrayList);
                mutableState27 = mutableState29;
            }
            mutableState6 = mutableState27;
            mutableState7 = mutableState26;
            mutableState8 = mutableState23;
            mutableState9 = mutableState28;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (!((List) entry2.getValue()).isEmpty()) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            gapComposer2.updateRememberedValue(linkedHashMap2);
            obj = linkedHashMap2;
        } else {
            mutableState6 = mutableState27;
            mutableState7 = mutableState26;
            mutableState8 = mutableState23;
            mutableState9 = mutableState28;
            obj = rememberedValue32;
        }
        Map map5 = (Map) obj;
        boolean changed9 = gapComposer2.changed((Map) mutableState6.getValue()) | gapComposer2.changed(map5);
        Object rememberedValue33 = gapComposer2.rememberedValue();
        if (changed9 || rememberedValue33 == obj4) {
            Map map6 = (Map) mutableState6.getValue();
            LinkedHashSet plus = SetsKt___SetsKt.plus(map6.keySet(), (Iterable) map5.keySet());
            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(plus, 10));
            if (mapCapacity < 16) {
                mapCapacity = 16;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(mapCapacity);
            for (Object obj7 : plus) {
                String str9 = ((CreateCartErrorViewModel.RelatedToken) obj7).token;
                Collection collection = (List) map6.get(new CreateCartErrorViewModel.RelatedToken(str9));
                if (collection == null) {
                    collection = EmptyList.INSTANCE;
                }
                Collection collection2 = collection;
                Iterable iterable = (List) map5.get(new CreateCartErrorViewModel.RelatedToken(str9));
                if (iterable == null) {
                    iterable = EmptyList.INSTANCE;
                }
                linkedHashMap3.put(obj7, CollectionsKt.plus(iterable, collection2));
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                if (!((List) entry3.getValue()).isEmpty()) {
                    linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                }
            }
            gapComposer2.updateRememberedValue(linkedHashMap4);
            obj2 = linkedHashMap4;
        } else {
            obj2 = rememberedValue33;
        }
        Map map7 = (Map) obj2;
        if (((LocationMenu) state11.getValue()) == null) {
            list = EmptyList.INSTANCE;
            abstractPersistentList = entries;
            mutableState10 = mutableState22;
            state3 = state11;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ListIterator listIterator2 = entries.listIterator(0);
            int i7 = 0;
            while (listIterator2.hasNext()) {
                Object next = listIterator2.next();
                int i8 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                CartEntryWithQuantity cartEntryWithQuantity = (CartEntryWithQuantity) next;
                LocationMenu locationMenu4 = (LocationMenu) state11.getValue();
                locationMenu4.getClass();
                CartEntry cartEntry = cartEntryWithQuantity.getCartEntry();
                MenuItem m1244menuItemOrNullGvMOdU02 = locationMenu4.m1244menuItemOrNullGvMOdU0(cartEntry.menuItemToken);
                if (m1244menuItemOrNullGvMOdU02 == null) {
                    abstractPersistentList2 = entries;
                    listIterator = listIterator2;
                    i4 = i8;
                    mutableState11 = mutableState22;
                    state4 = state11;
                    selection = null;
                } else {
                    listIterator = listIterator2;
                    LocalMoney cost = CartBuilderKt.getCost(cartEntryWithQuantity, locationMenu4, false);
                    i4 = i8;
                    LocalMoney cost2 = CartBuilderKt.getCost(cartEntryWithQuantity, locationMenu4, true);
                    if (Intrinsics.areEqual(cost2, cost)) {
                        cost2 = null;
                    }
                    LocalImage localImage2 = m1244menuItemOrNullGvMOdU02.image;
                    String str10 = m1244menuItemOrNullGvMOdU02.name;
                    String buildSelectionInformationString = LineSelectionInformationRendererKt.buildSelectionInformationString(cartEntry, locationMenu4, m1244menuItemOrNullGvMOdU02);
                    String str11 = cartEntry.discountText;
                    int quantity = cartEntryWithQuantity.getQuantity();
                    String str12 = cartEntry.offerToken;
                    int i9 = m1244menuItemOrNullGvMOdU02.maxOrderQuantity;
                    if (str12 != null) {
                        i9 = Math.min(i9, cartEntryWithQuantity.getQuantity());
                    }
                    CartItemCounterViewModel cartItemCounterViewModel = new CartItemCounterViewModel(null, null, quantity, 0, Integer.valueOf(i9), new CartItemCounterViewModel.Mode.Compact(false), null, 10);
                    abstractPersistentList2 = entries;
                    mutableState11 = mutableState22;
                    state4 = state11;
                    Amount amount = new Amount(LocalsKt.prettyPrint$default(cost, false, null, 7), cost.amount);
                    Amount amount2 = cost2 != null ? new Amount(LocalsKt.prettyPrint$default(cost2, false, null, 7), cost2.amount) : null;
                    List<CartEntry.ComboSlotSelection> list3 = cartEntry.comboSlotSelections;
                    ArrayList arrayList3 = new ArrayList();
                    for (CartEntry.ComboSlotSelection comboSlotSelection : list3) {
                        ComboSlotViewModel buildComboSlotViewModel = ComboSlotViewModelBuilder.buildComboSlotViewModel(locationMenu4, m1244menuItemOrNullGvMOdU02, comboSlotSelection, m1219getCreateCartErrorViewModelsFor7B2eUzg(comboSlotSelection.menuItemToken, comboSlotSelection.variationToken, comboSlotSelection.comboSlotToken, map7));
                        if (buildComboSlotViewModel != null) {
                            arrayList3.add(buildComboSlotViewModel);
                        }
                    }
                    selection = new LocalBrandLocationCartViewModel.Selection(i7, str10, buildSelectionInformationString, str11, amount, amount2, localImage2, cartItemCounterViewModel, arrayList3, m1219getCreateCartErrorViewModelsFor7B2eUzg(cartEntry.menuItemToken, cartEntry.variationToken, null, map7));
                }
                if (selection != null) {
                    arrayList2.add(selection);
                }
                listIterator2 = listIterator;
                i7 = i4;
                mutableState22 = mutableState11;
                entries = abstractPersistentList2;
                state11 = state4;
            }
            abstractPersistentList = entries;
            mutableState10 = mutableState22;
            state3 = state11;
            list = arrayList2;
        }
        Object obj8 = (rememberActiveOpenTabCart == null || (openTabInfo = rememberActiveOpenTabCart.open_tab_info) == null) ? null : openTabInfo.rounds;
        boolean changed10 = gapComposer2.changed((LocationMenu) state3.getValue()) | gapComposer2.changed(obj8);
        Object rememberedValue34 = gapComposer2.rememberedValue();
        if (changed10 || rememberedValue34 == obj4) {
            LocationMenu locationMenu5 = (LocationMenu) state3.getValue();
            if (obj8 == null) {
                obj8 = EmptyList.INSTANCE;
            }
            List<LocalCart.OpenTabInfo.Round> list4 = (Iterable) obj8;
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
            for (LocalCart.OpenTabInfo.Round round : list4) {
                LocalMoney subtotalOrLineTotal = LocalOpenTabCartMapper.subtotalOrLineTotal(round);
                Iterator<T> it3 = round.lines.iterator();
                int i10 = 0;
                while (it3.hasNext()) {
                    LocalCart.Line.Selection selection2 = ((LocalCart.Line) it3.next()).selection;
                    i10 += (selection2 == null || (num = selection2.quantity) == null) ? 1 : num.intValue();
                }
                List<LocalCart.Line> list5 = round.lines;
                ArrayList arrayList5 = new ArrayList();
                Iterator<T> it4 = list5.iterator();
                while (it4.hasNext()) {
                    LocalCart.Line.Selection selection3 = ((LocalCart.Line) it4.next()).selection;
                    if (selection3 != null && (str = selection3.menu_item_token) != null) {
                        if (StringsKt.isBlank(str)) {
                            str = null;
                        }
                        if (str != null && locationMenu5 != null && (m1244menuItemOrNullGvMOdU0 = locationMenu5.m1244menuItemOrNullGvMOdU0(str)) != null) {
                            localImage = m1244menuItemOrNullGvMOdU0.image;
                            if (localImage == null) {
                                arrayList5.add(localImage);
                            }
                        }
                    }
                    localImage = null;
                    if (localImage == null) {
                    }
                }
                arrayList4.add(new OpenTabRoundSummary(subtotalOrLineTotal, i10, arrayList5));
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it5 = arrayList4.iterator();
            while (it5.hasNext()) {
                LocalMoney localMoney2 = ((OpenTabRoundSummary) it5.next()).subtotal;
                if (localMoney2 != null) {
                    arrayList6.add(localMoney2);
                }
            }
            LocalMoney sumLocalMoneyOrZero = LocalOpenTabCartMapper.sumLocalMoneyOrZero(arrayList6);
            Iterator it6 = arrayList4.iterator();
            int i11 = 0;
            while (it6.hasNext()) {
                i11 += ((OpenTabRoundSummary) it6.next()).itemCount;
            }
            OpenTabRoundSummary openTabRoundSummary = (OpenTabRoundSummary) CollectionsKt.lastOrNull((List) arrayList4);
            int i12 = openTabRoundSummary != null ? openTabRoundSummary.itemCount : 0;
            localOpenTabCartMapper = localOpenTabCartMapper2;
            Object[] objArr5 = {localOpenTabCartMapper.itemCountSummary(i11), LocalsKt.prettyPrint$default(sumLocalMoneyOrZero, false, null, 7)};
            androidStringManager = androidStringManager2;
            Resources resources = androidStringManager.resources;
            resources.getClass();
            String format4 = new MessageFormat(resources.getString(R.string.local_presenters_open_tab_order_summary_subtitle)).format(objArr5);
            format4.getClass();
            ArrayList arrayList7 = new ArrayList();
            Iterator it7 = arrayList4.iterator();
            while (it7.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(((OpenTabRoundSummary) it7.next()).images, arrayList7);
            }
            Object openTabData = new OpenTabData(format4, i12, i11, CollectionsKt.take(arrayList7, 3));
            gapComposer2.updateRememberedValue(openTabData);
            rememberedValue34 = openTabData;
        } else {
            androidStringManager = androidStringManager2;
            localOpenTabCartMapper = localOpenTabCartMapper2;
        }
        OpenTabData openTabData2 = (OpenTabData) rememberedValue34;
        Integer num2 = (Integer) mutableState9.getValue();
        OpenTabAddRoundState openTabAddRoundState = (OpenTabAddRoundState) mutableState10.getValue();
        boolean z6 = openTabAddRoundState instanceof OpenTabAddRoundState.Failure;
        Object obj9 = OpenTabBannerTitle$YourTab.INSTANCE;
        Object obj10 = OpenTabBannerTitle$Failure.INSTANCE;
        if (z6) {
            openTabBannerTitle$OrderedItems = obj10;
        } else if (openTabAddRoundState instanceof OpenTabAddRoundState.Ordered) {
            openTabBannerTitle$OrderedItems = new OpenTabBannerTitle$OrderedMoreItems(((OpenTabAddRoundState.Ordered) openTabAddRoundState).itemCount);
        } else if (openTabAddRoundState instanceof OpenTabAddRoundState.Ordering) {
            openTabBannerTitle$OrderedItems = new OpenTabBannerTitle$OrderingMoreItems(((OpenTabAddRoundState.Ordering) openTabAddRoundState).itemCount);
        } else {
            if (!(openTabAddRoundState instanceof OpenTabAddRoundState.Idle)) {
                throw new NoWhenBranchMatchedException();
            }
            openTabBannerTitle$OrderedItems = num2 != null ? new OpenTabBannerTitle$OrderedItems(num2.intValue()) : obj9;
        }
        boolean changed11 = gapComposer2.changed(openTabData2) | gapComposer2.changed(openTabBannerTitle$OrderedItems);
        Object rememberedValue35 = gapComposer2.rememberedValue();
        if (changed11 || rememberedValue35 == obj4) {
            Resources resources2 = androidStringManager.resources;
            openTabData2.getClass();
            OpenTabData openTabData3 = openTabData2.totalItemCount > 0 ? openTabData2 : null;
            if (openTabData3 != null) {
                if (openTabBannerTitle$OrderedItems.equals(obj10)) {
                    format2 = androidStringManager.get(R.string.local_presenters_open_tab_add_round_error_title);
                } else if (openTabBannerTitle$OrderedItems instanceof OpenTabBannerTitle$OrderedItems) {
                    Object[] objArr6 = {localOpenTabCartMapper.itemCountSummary(((OpenTabBannerTitle$OrderedItems) openTabBannerTitle$OrderedItems).itemCount)};
                    resources2.getClass();
                    format2 = new MessageFormat(resources2.getString(R.string.local_presenters_open_tab_ordered_items_title)).format(objArr6);
                    format2.getClass();
                } else {
                    if (openTabBannerTitle$OrderedItems instanceof OpenTabBannerTitle$OrderedMoreItems) {
                        Integer valueOf3 = Integer.valueOf(((OpenTabBannerTitle$OrderedMoreItems) openTabBannerTitle$OrderedItems).itemCount);
                        str2 = null;
                        ArrayMap arrayMap = new ArrayMap(1);
                        arrayMap.put("count", valueOf3);
                        resources2.getClass();
                        str3 = new MessageFormat(resources2.getString(R.string.local_presenters_open_tab_ordered_more_items_title)).format(arrayMap);
                        str3.getClass();
                    } else {
                        str2 = null;
                        if (openTabBannerTitle$OrderedItems instanceof OpenTabBannerTitle$OrderingMoreItems) {
                            Integer valueOf4 = Integer.valueOf(((OpenTabBannerTitle$OrderingMoreItems) openTabBannerTitle$OrderedItems).itemCount);
                            ArrayMap arrayMap2 = new ArrayMap(1);
                            arrayMap2.put("count", valueOf4);
                            resources2.getClass();
                            str3 = new MessageFormat(resources2.getString(R.string.local_presenters_open_tab_ordering_more_items_title)).format(arrayMap2);
                            str3.getClass();
                        } else {
                            if (!openTabBannerTitle$OrderedItems.equals(obj9)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            str3 = androidStringManager.get(R.string.local_presenters_open_tab_title);
                        }
                    }
                    str4 = str3;
                    String str13 = !openTabBannerTitle$OrderedItems.equals(obj10) ? androidStringManager.get(R.string.local_presenters_open_tab_add_round_error_subtitle) : openTabData3.bannerBody;
                    if (!openTabBannerTitle$OrderedItems.equals(obj10)) {
                        trailingIcon = LocalBrandLocationCartViewModel.OpenTabBanner.TrailingIcon.ERROR;
                    } else if (openTabBannerTitle$OrderedItems instanceof OpenTabBannerTitle$OrderedMoreItems) {
                        trailingIcon = LocalBrandLocationCartViewModel.OpenTabBanner.TrailingIcon.CHECK_FILL;
                    } else if (openTabBannerTitle$OrderedItems instanceof OpenTabBannerTitle$OrderingMoreItems) {
                        trailingIcon2 = null;
                        List list6 = openTabData3.images;
                        if (!openTabBannerTitle$OrderedItems.equals(obj10) || (openTabBannerTitle$OrderedItems instanceof OpenTabBannerTitle$OrderedMoreItems) || (openTabBannerTitle$OrderedItems instanceof OpenTabBannerTitle$OrderingMoreItems)) {
                            z3 = false;
                        } else {
                            if (!(openTabBannerTitle$OrderedItems instanceof OpenTabBannerTitle$OrderedItems) && !openTabBannerTitle$OrderedItems.equals(obj9)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return str2;
                            }
                            z3 = true;
                        }
                        obj3 = new LocalBrandLocationCartViewModel.OpenTabBanner(str4, str13, trailingIcon2, list6, z3);
                    } else {
                        trailingIcon = LocalBrandLocationCartViewModel.OpenTabBanner.TrailingIcon.PUSH;
                    }
                    trailingIcon2 = trailingIcon;
                    List list62 = openTabData3.images;
                    if (openTabBannerTitle$OrderedItems.equals(obj10)) {
                    }
                    z3 = false;
                    obj3 = new LocalBrandLocationCartViewModel.OpenTabBanner(str4, str13, trailingIcon2, list62, z3);
                }
                str4 = format2;
                str2 = null;
                String str132 = !openTabBannerTitle$OrderedItems.equals(obj10) ? androidStringManager.get(R.string.local_presenters_open_tab_add_round_error_subtitle) : openTabData3.bannerBody;
                if (!openTabBannerTitle$OrderedItems.equals(obj10)) {
                }
                trailingIcon2 = trailingIcon;
                List list622 = openTabData3.images;
                if (openTabBannerTitle$OrderedItems.equals(obj10)) {
                }
                z3 = false;
                obj3 = new LocalBrandLocationCartViewModel.OpenTabBanner(str4, str132, trailingIcon2, list622, z3);
            } else {
                str2 = null;
                obj3 = null;
            }
            gapComposer2.updateRememberedValue(obj3);
            rememberedValue35 = obj3;
        } else {
            str2 = null;
        }
        LocalBrandLocationCartViewModel.OpenTabBanner openTabBanner = (LocalBrandLocationCartViewModel.OpenTabBanner) rememberedValue35;
        List list7 = (List) mutableState8.getValue();
        Iterable iterable2 = (List) map7.get(new CreateCartErrorViewModel.RelatedToken(null));
        if (iterable2 == null) {
            iterable2 = EmptyList.INSTANCE;
        }
        ArrayList plus2 = CollectionsKt.plus(iterable2, (Collection) list7);
        FulfillmentConfigurations fulfillmentConfigurations = (FulfillmentConfigurations) mutableState.getValue();
        FulfillmentTimeUtils fulfillmentTimeUtils = this.fulfillmentTimeUtils;
        LocalText estimatedCompletionTime = (fulfillmentConfigurations == null || (fulfillmentConfiguration3 = fulfillmentConfigurations.asap) == null) ? null : fulfillmentTimeUtils.getEstimatedCompletionTime(fulfillmentConfiguration3);
        FulfillmentConfigurations fulfillmentConfigurations2 = (FulfillmentConfigurations) mutableState.getValue();
        LocalText estimatedCompletionTime2 = (fulfillmentConfigurations2 == null || (fulfillmentConfiguration2 = fulfillmentConfigurations2.scheduled) == null) ? null : fulfillmentTimeUtils.getEstimatedCompletionTime(fulfillmentConfiguration2);
        FulfillmentConfiguration fulfillmentConfiguration5 = (FulfillmentConfiguration) state.getValue();
        if (fulfillmentConfiguration5 instanceof FulfillmentConfiguration.Delivery) {
            LocalFulfillment.DeliveryDetails deliveryDetails = ((FulfillmentConfiguration.Delivery) fulfillmentConfiguration5).deliveryDetails;
            deliveryDetails.getClass();
            LocalAddress localAddress2 = deliveryDetails.delivery_address;
            localAddress2.getClass();
            String str14 = localAddress2.address_single_line;
            str14.getClass();
            pickup = new LocalBrandLocationCartViewModel.Fulfillment.Delivery(str14, estimatedCompletionTime, estimatedCompletionTime2, !z, FulfillmentConfigurationKt.getSchedulingMode(fulfillmentConfiguration5), ((Boolean) mutableState19.getValue()).booleanValue());
        } else {
            if (!(fulfillmentConfiguration5 instanceof FulfillmentConfiguration.Pickup)) {
                if (!(fulfillmentConfiguration5 instanceof FulfillmentConfiguration.InStore) && fulfillmentConfiguration5 != null && !(fulfillmentConfiguration5 instanceof FulfillmentConfiguration.Unspecified)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return str2;
                }
                fulfillment = null;
                rememberedValue = gapComposer2.rememberedValue();
                if (rememberedValue != obj4) {
                    mutableState12 = mutableState25;
                    rememberedValue = Updater.derivedStateOf(new TooltipKt$$ExternalSyntheticLambda1(23, mutableState12));
                    gapComposer2.updateRememberedValue(rememberedValue);
                } else {
                    mutableState12 = mutableState25;
                }
                State state12 = (State) rememberedValue;
                locationMenu = (LocationMenu) state3.getValue();
                if (locationMenu != null) {
                    gapComposer2.startReplaceGroup(1483874750);
                    gapComposer2.end(false);
                    calculateCost = null;
                } else {
                    gapComposer2.startReplaceGroup(1483874751);
                    calculateCost = realCartBuilder4.calculateCost(locationMenu, false, gapComposer2);
                    gapComposer2.end(false);
                }
                if (calculateCost == null) {
                    calculateCost = LocalMoneysKt.zero(LocalCurrencyCode.USD);
                }
                rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == obj4) {
                    rememberedValue2 = Updater.derivedStateOf(new h2$$ExternalSyntheticLambda0(abstractPersistentList, 2));
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                State state13 = (State) rememberedValue2;
                locationMenu2 = (LocationMenu) state3.getValue();
                if (locationMenu2 != null) {
                    gapComposer2.startReplaceGroup(1484155455);
                    gapComposer2.end(false);
                    calculateCost2 = null;
                } else {
                    gapComposer2.startReplaceGroup(1484155456);
                    calculateCost2 = realCartBuilder4.calculateCost(locationMenu2, true, gapComposer2);
                    gapComposer2.end(false);
                }
                if (calculateCost2 != null || calculateCost2.equals(calculateCost)) {
                    calculateCost2 = null;
                }
                if (DiscountCodeKt.getOfferToken(snapshotStateList) != null) {
                    ArrayList arrayList8 = new ArrayList();
                    ListIterator listIterator3 = snapshotStateList.listIterator();
                    while (true) {
                        StateListIterator stateListIterator = (StateListIterator) listIterator3;
                        if (!stateListIterator.hasNext()) {
                            break;
                        }
                        Object next2 = stateListIterator.next();
                        if (next2 instanceof DiscountCode.MarketingOffer) {
                            arrayList8.add(next2);
                        }
                    }
                    DiscountCode.MarketingOffer marketingOffer = (DiscountCode.MarketingOffer) CollectionsKt.firstOrNull((List) arrayList8);
                    if (marketingOffer != null) {
                        MarketingMessageOfferDetails marketingMessageOfferDetails = marketingOffer.offerDetails;
                        String str15 = marketingMessageOfferDetails.label;
                        String str16 = marketingMessageOfferDetails.offerCode;
                        LocalBrand localBrand = (LocalBrand) mutableState12.getValue();
                        LocalColor localColor = localBrand != null ? localBrand.background_color : null;
                        LocalBrand localBrand2 = (LocalBrand) mutableState12.getValue();
                        appliedCouponBanner = new AppliedCouponBanner(str15, str16, localColor, localBrand2 != null ? localBrand2.foreground_color : null);
                        localBrandBannerModel = (LocalBrandBannerModel) state10.getValue();
                        if (localBrandBannerModel != null) {
                            gapComposer2.startReplaceGroup(-1106477359);
                            Updater.LaunchedEffect(gapComposer2, localBrandBannerModel, new AnimatedImageDecoder$wrapDrawable$2(localBrandBannerModel, (Continuation) null, this, 16));
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(-1106436997);
                            gapComposer2.end(false);
                        }
                        Location.LocationDetail locationDetail = (Location.LocationDetail) state8.getValue();
                        map2 = locationDetail != null ? locationDetail.summary.largeOrderLimits : null;
                        FulfillmentConfiguration fulfillmentConfiguration6 = (FulfillmentConfiguration) state.getValue();
                        intValue = ((Number) state13.getValue()).intValue();
                        AndroidStringManager androidStringManager3 = this.stringManager;
                        Resources resources3 = androidStringManager3.resources;
                        if (map2 != null && fulfillmentConfiguration6 != null && (type2 = FulfillmentConfigurationKt.getType(fulfillmentConfiguration6)) != null && (largeOrderLimits = (Location.LargeOrderLimits) map2.get(type2)) != null) {
                            check = HasTop$DefaultImpls.check(largeOrderLimits, intValue, calculateCost, calculateCost2);
                            if (!(check instanceof OrderLimitChecker$OrderLimitCheckResult$NoLimitReached)) {
                                if (check instanceof OrderLimitChecker$OrderLimitCheckResult$QuantityLimitReached) {
                                    int i13 = ((OrderLimitChecker$OrderLimitCheckResult$QuantityLimitReached) check).maxQuantity;
                                    if (i13 == 1) {
                                        format3 = androidStringManager3.get(R.string.local_presenters_cart_order_quantity_limit_reached_single);
                                    } else {
                                        Object[] objArr7 = {Integer.valueOf(i13)};
                                        resources3.getClass();
                                        format3 = new MessageFormat(resources3.getString(R.string.local_presenters_cart_order_quantity_limit_reached_multiple)).format(objArr7);
                                        format3.getClass();
                                    }
                                } else if (check instanceof OrderLimitChecker$OrderLimitCheckResult$QuantityLimitExceeded) {
                                    int i14 = ((OrderLimitChecker$OrderLimitCheckResult$QuantityLimitExceeded) check).maxQuantity;
                                    if (i14 == 1) {
                                        format3 = androidStringManager3.get(R.string.local_presenters_cart_order_quantity_limit_exceeded_single);
                                    } else {
                                        Object[] objArr8 = {Integer.valueOf(i14)};
                                        resources3.getClass();
                                        format3 = new MessageFormat(resources3.getString(R.string.local_presenters_cart_order_quantity_limit_exceeded_multiple)).format(objArr8);
                                        format3.getClass();
                                    }
                                } else if (check instanceof OrderLimitChecker$OrderLimitCheckResult$ValueLimitReached) {
                                    Object[] objArr9 = {((OrderLimitChecker$OrderLimitCheckResult$ValueLimitReached) check).maxValue};
                                    resources3.getClass();
                                    format3 = new MessageFormat(resources3.getString(R.string.local_presenters_cart_order_value_limit_reached)).format(objArr9);
                                    format3.getClass();
                                } else if (check instanceof OrderLimitChecker$OrderLimitCheckResult$ValueLimitExceeded) {
                                    Object[] objArr10 = {((OrderLimitChecker$OrderLimitCheckResult$ValueLimitExceeded) check).maxValue};
                                    resources3.getClass();
                                    format3 = new MessageFormat(resources3.getString(R.string.local_presenters_cart_order_value_limit_exceeded)).format(objArr10);
                                    format3.getClass();
                                } else {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                }
                                boolean z7 = check.endOfPaginationReached;
                                orderLimitBanner = new OrderLimitBanner(format3, z7 ? androidStringManager3.get(R.string.local_presenters_cart_order_limit_exceeded_body) : str2, z7);
                                Location.LocationDetail locationDetail2 = (Location.LocationDetail) state8.getValue();
                                fulfillmentConfiguration = (FulfillmentConfiguration) state.getValue();
                                j = calculateCost.amount;
                                Resources resources4 = androidStringManager3.resources;
                                if (!(fulfillmentConfiguration instanceof FulfillmentConfiguration.Delivery) || FulfillmentConfigurationKt.getSchedulingMode(fulfillmentConfiguration) == LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_SCHEDULED || locationDetail2 == null || (localMoney = (LocalMoney) locationDetail2.summary.freeFulfillmentThresholds.get(LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY)) == null) {
                                    state5 = state12;
                                    gapComposer = gapComposer2;
                                    mutableState13 = mutableState12;
                                    freeDeliveryMeter = null;
                                } else {
                                    j2 = localMoney.amount;
                                    if (j < j2) {
                                        state5 = state12;
                                        gapComposer = gapComposer2;
                                        mutableState13 = mutableState12;
                                        freeDeliveryMeter = new FreeDeliveryMeter(androidStringManager3.get(R.string.local_presenters_you_got_free_delivery), 1.0f);
                                    } else if (j > 0) {
                                        state5 = state12;
                                        gapComposer = gapComposer2;
                                        mutableState13 = mutableState12;
                                        Object[] objArr11 = {LocalsKt.prettyPrint$default(LocalMoney.copy$default(localMoney, j2 - j), false, str2, 7)};
                                        resources4.getClass();
                                        String format5 = new MessageFormat(resources4.getString(R.string.local_presenters_spend_more_for_free_delivery)).format(objArr11);
                                        format5.getClass();
                                        freeDeliveryMeter = new FreeDeliveryMeter(format5, j / j2);
                                    } else {
                                        state5 = state12;
                                        gapComposer = gapComposer2;
                                        mutableState13 = mutableState12;
                                        Object[] objArr12 = {LocalsKt.prettyPrint$default(localMoney, false, null, 7)};
                                        resources4.getClass();
                                        String format6 = new MessageFormat(resources4.getString(R.string.local_presenters_spend_for_free_delivery)).format(objArr12);
                                        format6.getClass();
                                        freeDeliveryMeter = new FreeDeliveryMeter(format6, RecyclerView.DECELERATION_RATE);
                                    }
                                }
                                LocalBrand localBrand3 = (LocalBrand) mutableState13.getValue();
                                String str17 = (localBrand3 != null || (str7 = localBrand3.name) == null) ? "" : str7;
                                ordinal = mode2.ordinal();
                                if (ordinal != 0) {
                                    z4 = true;
                                    if (ordinal != 1) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    str6 = androidStringManager3.get(R.string.local_presenters_cart_title);
                                } else {
                                    z4 = true;
                                    str6 = androidStringManager3.get(R.string.local_presenters_cart_title);
                                }
                                LocalBrandLocationCartViewModel localBrandLocationCartViewModel = new LocalBrandLocationCartViewModel(str17, str6, mode2, (LocalBrandBannerModel) state10.getValue(), openTabBanner, openTabData2.totalItemCount, list, fulfillment, (List) state5.getValue(), new Amount(LocalsKt.prettyPrint$default(calculateCost, false, null, 7), calculateCost.amount), calculateCost2 != null ? new Amount(LocalsKt.prettyPrint$default(calculateCost2, false, null, 7), calculateCost2.amount) : null, ((Boolean) mutableState7.getValue()).booleanValue(), (orderLimitBanner == 0 && orderLimitBanner.isLimitExceeded) ? false : z4, appliedCouponBanner, mode2 == LocalBrandLocationCartViewModel.Mode.CART ? freeDeliveryMeter : null, orderLimitBanner, (List) mutableState8.getValue(), plus2);
                                gapComposer.endReplaceGroup();
                                return localBrandLocationCartViewModel;
                            }
                        }
                        orderLimitBanner = str2;
                        Location.LocationDetail locationDetail22 = (Location.LocationDetail) state8.getValue();
                        fulfillmentConfiguration = (FulfillmentConfiguration) state.getValue();
                        j = calculateCost.amount;
                        Resources resources42 = androidStringManager3.resources;
                        if (!(fulfillmentConfiguration instanceof FulfillmentConfiguration.Delivery)) {
                            j2 = localMoney.amount;
                            if (j < j2) {
                            }
                            LocalBrand localBrand32 = (LocalBrand) mutableState13.getValue();
                            if (localBrand32 != null) {
                            }
                            ordinal = mode2.ordinal();
                            if (ordinal != 0) {
                            }
                            if (calculateCost2 != null) {
                            }
                            if (orderLimitBanner == 0) {
                            }
                            LocalBrandLocationCartViewModel localBrandLocationCartViewModel2 = new LocalBrandLocationCartViewModel(str17, str6, mode2, (LocalBrandBannerModel) state10.getValue(), openTabBanner, openTabData2.totalItemCount, list, fulfillment, (List) state5.getValue(), new Amount(LocalsKt.prettyPrint$default(calculateCost, false, null, 7), calculateCost.amount), calculateCost2 != null ? new Amount(LocalsKt.prettyPrint$default(calculateCost2, false, null, 7), calculateCost2.amount) : null, ((Boolean) mutableState7.getValue()).booleanValue(), (orderLimitBanner == 0 && orderLimitBanner.isLimitExceeded) ? false : z4, appliedCouponBanner, mode2 == LocalBrandLocationCartViewModel.Mode.CART ? freeDeliveryMeter : null, orderLimitBanner, (List) mutableState8.getValue(), plus2);
                            gapComposer.endReplaceGroup();
                            return localBrandLocationCartViewModel2;
                        }
                        state5 = state12;
                        gapComposer = gapComposer2;
                        mutableState13 = mutableState12;
                        freeDeliveryMeter = null;
                        LocalBrand localBrand322 = (LocalBrand) mutableState13.getValue();
                        if (localBrand322 != null) {
                        }
                        ordinal = mode2.ordinal();
                        if (ordinal != 0) {
                        }
                        if (calculateCost2 != null) {
                        }
                        if (orderLimitBanner == 0) {
                        }
                        LocalBrandLocationCartViewModel localBrandLocationCartViewModel22 = new LocalBrandLocationCartViewModel(str17, str6, mode2, (LocalBrandBannerModel) state10.getValue(), openTabBanner, openTabData2.totalItemCount, list, fulfillment, (List) state5.getValue(), new Amount(LocalsKt.prettyPrint$default(calculateCost, false, null, 7), calculateCost.amount), calculateCost2 != null ? new Amount(LocalsKt.prettyPrint$default(calculateCost2, false, null, 7), calculateCost2.amount) : null, ((Boolean) mutableState7.getValue()).booleanValue(), (orderLimitBanner == 0 && orderLimitBanner.isLimitExceeded) ? false : z4, appliedCouponBanner, mode2 == LocalBrandLocationCartViewModel.Mode.CART ? freeDeliveryMeter : null, orderLimitBanner, (List) mutableState8.getValue(), plus2);
                        gapComposer.endReplaceGroup();
                        return localBrandLocationCartViewModel22;
                    }
                }
                appliedCouponBanner = null;
                localBrandBannerModel = (LocalBrandBannerModel) state10.getValue();
                if (localBrandBannerModel != null) {
                }
                Location.LocationDetail locationDetail3 = (Location.LocationDetail) state8.getValue();
                if (locationDetail3 != null) {
                }
                FulfillmentConfiguration fulfillmentConfiguration62 = (FulfillmentConfiguration) state.getValue();
                intValue = ((Number) state13.getValue()).intValue();
                AndroidStringManager androidStringManager32 = this.stringManager;
                Resources resources32 = androidStringManager32.resources;
                if (map2 != null) {
                    check = HasTop$DefaultImpls.check(largeOrderLimits, intValue, calculateCost, calculateCost2);
                    if (!(check instanceof OrderLimitChecker$OrderLimitCheckResult$NoLimitReached)) {
                    }
                }
                orderLimitBanner = str2;
                Location.LocationDetail locationDetail222 = (Location.LocationDetail) state8.getValue();
                fulfillmentConfiguration = (FulfillmentConfiguration) state.getValue();
                j = calculateCost.amount;
                Resources resources422 = androidStringManager32.resources;
                if (!(fulfillmentConfiguration instanceof FulfillmentConfiguration.Delivery)) {
                }
                state5 = state12;
                gapComposer = gapComposer2;
                mutableState13 = mutableState12;
                freeDeliveryMeter = null;
                LocalBrand localBrand3222 = (LocalBrand) mutableState13.getValue();
                if (localBrand3222 != null) {
                }
                ordinal = mode2.ordinal();
                if (ordinal != 0) {
                }
                if (calculateCost2 != null) {
                }
                if (orderLimitBanner == 0) {
                }
                LocalBrandLocationCartViewModel localBrandLocationCartViewModel222 = new LocalBrandLocationCartViewModel(str17, str6, mode2, (LocalBrandBannerModel) state10.getValue(), openTabBanner, openTabData2.totalItemCount, list, fulfillment, (List) state5.getValue(), new Amount(LocalsKt.prettyPrint$default(calculateCost, false, null, 7), calculateCost.amount), calculateCost2 != null ? new Amount(LocalsKt.prettyPrint$default(calculateCost2, false, null, 7), calculateCost2.amount) : null, ((Boolean) mutableState7.getValue()).booleanValue(), (orderLimitBanner == 0 && orderLimitBanner.isLimitExceeded) ? false : z4, appliedCouponBanner, mode2 == LocalBrandLocationCartViewModel.Mode.CART ? freeDeliveryMeter : null, orderLimitBanner, (List) mutableState8.getValue(), plus2);
                gapComposer.endReplaceGroup();
                return localBrandLocationCartViewModel222;
            }
            Location.LocationDetail locationDetail4 = (Location.LocationDetail) state8.getValue();
            pickup = new LocalBrandLocationCartViewModel.Fulfillment.Pickup((locationDetail4 == null || (localAddress = locationDetail4.summary.address) == null || (str5 = localAddress.address_single_line) == null) ? "" : str5, estimatedCompletionTime, estimatedCompletionTime2, !z, FulfillmentConfigurationKt.getSchedulingMode(fulfillmentConfiguration5), ((Boolean) mutableState19.getValue()).booleanValue());
        }
        fulfillment = pickup;
        rememberedValue = gapComposer2.rememberedValue();
        if (rememberedValue != obj4) {
        }
        State state122 = (State) rememberedValue;
        locationMenu = (LocationMenu) state3.getValue();
        if (locationMenu != null) {
        }
        if (calculateCost == null) {
        }
        rememberedValue2 = gapComposer2.rememberedValue();
        if (rememberedValue2 == obj4) {
        }
        State state132 = (State) rememberedValue2;
        locationMenu2 = (LocationMenu) state3.getValue();
        if (locationMenu2 != null) {
        }
        if (calculateCost2 != null) {
        }
        calculateCost2 = null;
        if (DiscountCodeKt.getOfferToken(snapshotStateList) != null) {
        }
        appliedCouponBanner = null;
        localBrandBannerModel = (LocalBrandBannerModel) state10.getValue();
        if (localBrandBannerModel != null) {
        }
        Location.LocationDetail locationDetail32 = (Location.LocationDetail) state8.getValue();
        if (locationDetail32 != null) {
        }
        FulfillmentConfiguration fulfillmentConfiguration622 = (FulfillmentConfiguration) state.getValue();
        intValue = ((Number) state132.getValue()).intValue();
        AndroidStringManager androidStringManager322 = this.stringManager;
        Resources resources322 = androidStringManager322.resources;
        if (map2 != null) {
        }
        orderLimitBanner = str2;
        Location.LocationDetail locationDetail2222 = (Location.LocationDetail) state8.getValue();
        fulfillmentConfiguration = (FulfillmentConfiguration) state.getValue();
        j = calculateCost.amount;
        Resources resources4222 = androidStringManager322.resources;
        if (!(fulfillmentConfiguration instanceof FulfillmentConfiguration.Delivery)) {
        }
        state5 = state122;
        gapComposer = gapComposer2;
        mutableState13 = mutableState12;
        freeDeliveryMeter = null;
        LocalBrand localBrand32222 = (LocalBrand) mutableState13.getValue();
        if (localBrand32222 != null) {
        }
        ordinal = mode2.ordinal();
        if (ordinal != 0) {
        }
        if (calculateCost2 != null) {
        }
        if (orderLimitBanner == 0) {
        }
        LocalBrandLocationCartViewModel localBrandLocationCartViewModel2222 = new LocalBrandLocationCartViewModel(str17, str6, mode2, (LocalBrandBannerModel) state10.getValue(), openTabBanner, openTabData2.totalItemCount, list, fulfillment, (List) state5.getValue(), new Amount(LocalsKt.prettyPrint$default(calculateCost, false, null, 7), calculateCost.amount), calculateCost2 != null ? new Amount(LocalsKt.prettyPrint$default(calculateCost2, false, null, 7), calculateCost2.amount) : null, ((Boolean) mutableState7.getValue()).booleanValue(), (orderLimitBanner == 0 && orderLimitBanner.isLimitExceeded) ? false : z4, appliedCouponBanner, mode2 == LocalBrandLocationCartViewModel.Mode.CART ? freeDeliveryMeter : null, orderLimitBanner, (List) mutableState8.getValue(), plus2);
        gapComposer.endReplaceGroup();
        return localBrandLocationCartViewModel2222;
    }

    public final LinkedHashMap toCreateCartErrorViewModels(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            CreateCartErrorViewModel.RelatedToken relatedToken = new CreateCartErrorViewModel.RelatedToken(((LocalErrorResponse.Error) obj).related_token);
            Object obj2 = linkedHashMap.get(relatedToken);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(relatedToken, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List<LocalErrorResponse.Error> list2 = (List) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (LocalErrorResponse.Error error : list2) {
                String str = error.message;
                CreateCartErrorViewModel createCartErrorViewModel = str != null ? new CreateCartErrorViewModel(re$$ExternalSyntheticOutline0.m(), error.related_token, str) : null;
                if (createCartErrorViewModel != null) {
                    arrayList.add(createCartErrorViewModel);
                }
            }
            linkedHashMap2.put(key, arrayList);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!((List) entry2.getValue()).isEmpty()) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap3;
    }
}
