package com.squareup.cash.clientrouting;

import android.content.Intent;
import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda24;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.internal.mlkit_vision_face.zzjr;
import com.squareup.cash.card.onboarding.CardStylePickerViewKt$CardStylePicker$1$1$1$7$1$3;
import com.squareup.cash.card.onboarding.CardStylePickerViewModel;
import com.squareup.cash.card.onboarding.ListIndices;
import com.squareup.cash.checks.CaptureCheckFacePresenter$models$2$1$1;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealClientRouteFormatter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.interceptors.AccountInterceptor;
import com.squareup.cash.clientrouting.interceptors.Interceptor;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.WebAuthFlowState;
import com.stripe.android.financialconnections.utils.UriUtils;
import com.stripe.android.uicore.image.DefaultStripeImageLoader;
import com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes8.dex */
public final class RealClientRouteRouter$route$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public Object $route;
    public Object $routingParams;
    public int I$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealClientRouteRouter$route$1(LazyListState lazyListState, ListIndices listIndices, MutableState mutableState, int i, Set set, CardStylePickerViewModel cardStylePickerViewModel, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.L$1 = lazyListState;
        this.$route = listIndices;
        this.L$2 = mutableState;
        this.label = i;
        this.$routingParams = set;
        this.L$3 = cardStylePickerViewModel;
        this.this$0 = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new RealClientRouteRouter$route$1((zzlj) obj2, (ClientRoute) this.$route, (RoutingParams) this.$routingParams, continuation);
            case 1:
                return new RealClientRouteRouter$route$1((LazyListState) this.L$1, (ListIndices) this.$route, (MutableState) this.L$2, this.label, (Set) this.$routingParams, (CardStylePickerViewModel) this.L$3, (Function1) obj2, continuation);
            case 2:
                RealClientRouteRouter$route$1 realClientRouteRouter$route$1 = new RealClientRouteRouter$route$1((List) this.L$2, (DefaultStripeImageLoader) this.$routingParams, this.label, (AndroidImageBitmap) this.L$3, (MutableState) obj2, continuation);
                realClientRouteRouter$route$1.$route = obj;
                return realClientRouteRouter$route$1;
            default:
                return new RealClientRouteRouter$route$1((FinancialConnectionsSheetNativeViewModel) this.L$3, (Intent) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealClientRouteRouter$route$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0244, code lost:
    
        if (r12 == r9) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0264, code lost:
    
        if (r3.route(r8, r1, r16) == r9) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0258  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0244 -> B:76:0x0247). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        RoutingParams routingParams;
        ClientRoute clientRoute;
        CombinedClientRouteRouter combinedClientRouteRouter;
        MutableState mutableState;
        Object awaitAll;
        int i;
        Mutex mutex;
        Intent intent;
        FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel;
        String str;
        Object value;
        Object queryParameterFromFragment;
        FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel2;
        String str2;
        Uri data;
        int i2 = this.$r8$classId;
        int i3 = 0;
        Mutex mutex2 = null;
        Object obj2 = this.this$0;
        switch (i2) {
            case 0:
                RoutingParams routingParams2 = (RoutingParams) this.$routingParams;
                ClientRoute clientRoute2 = (ClientRoute) this.$route;
                zzlj zzljVar = (zzlj) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("Routing ", zzjr.formatForLogging((RealClientRouteFormatter) zzljVar.zzb, clientRoute2)), new Object[0]);
                    List list = (List) zzljVar.zzd;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        it = list.iterator();
                        routingParams = routingParams2;
                        clientRoute = clientRoute2;
                        if (it.hasNext()) {
                        }
                    }
                    combinedClientRouteRouter = (CombinedClientRouteRouter) zzljVar.zze;
                    if (combinedClientRouteRouter != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = this.I$0;
                it = (Iterator) this.L$3;
                routingParams = (RoutingParams) this.L$2;
                clientRoute = (ClientRoute) this.L$1;
                SafeTrace.throwOnFailure(obj);
                Object intercept = obj;
                if (((Boolean) intercept).booleanValue()) {
                    return Unit.INSTANCE;
                }
                if (it.hasNext()) {
                    Interceptor interceptor = (Interceptor) it.next();
                    this.L$1 = clientRoute;
                    this.L$2 = routingParams;
                    this.L$3 = it;
                    this.I$0 = i3;
                    this.label = 1;
                    intercept = ((AccountInterceptor) interceptor).intercept(clientRoute, routingParams, this);
                    break;
                }
                combinedClientRouteRouter = (CombinedClientRouteRouter) zzljVar.zze;
                if (combinedClientRouteRouter != null) {
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 2;
                    break;
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.I$0;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(Updater.snapshotFlow(new DatePickerKt$$ExternalSyntheticLambda24((LazyListState) this.L$1, 5)));
                    ListIndices listIndices = (ListIndices) this.$route;
                    CardStylePickerViewKt$CardStylePicker$1$1$1$7$1$3 cardStylePickerViewKt$CardStylePicker$1$1$1$7$1$3 = new CardStylePickerViewKt$CardStylePicker$1$1$1$7$1$3((MutableState) this.L$2, this.label, listIndices, (Set) this.$routingParams, (CardStylePickerViewModel) this.L$3, (Function1) obj2);
                    this.I$0 = 1;
                    Object collect = distinctUntilChanged.collect(new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(8, cardStylePickerViewKt$CardStylePicker$1$1$1$7$1$3, listIndices), this);
                    if (collect != coroutineSingletons2) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope = (CoroutineScope) this.$route;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.I$0;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState = (MutableState) obj2;
                    List list2 = (List) this.L$2;
                    DefaultStripeImageLoader defaultStripeImageLoader = (DefaultStripeImageLoader) this.$routingParams;
                    int i7 = this.label;
                    AndroidImageBitmap androidImageBitmap = (AndroidImageBitmap) this.L$3;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(JobKt.async$default(coroutineScope, null, null, new GovernmentIdFeed$analyze$5(defaultStripeImageLoader, (String) it2.next(), i7, androidImageBitmap, (Continuation) null, 15), 3));
                    }
                    this.$route = null;
                    this.L$1 = mutableState;
                    this.I$0 = 1;
                    awaitAll = AwaitKt.awaitAll(arrayList, this);
                    if (awaitAll == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    MutableState mutableState2 = (MutableState) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    mutableState = mutableState2;
                    awaitAll = obj;
                }
                mutableState.setValue((List) awaitAll);
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                try {
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel3 = (FinancialConnectionsSheetNativeViewModel) this.L$3;
                        MutexImpl mutexImpl = financialConnectionsSheetNativeViewModel3.mutex;
                        Intent intent2 = (Intent) obj2;
                        this.L$1 = mutexImpl;
                        this.$route = intent2;
                        this.L$2 = financialConnectionsSheetNativeViewModel3;
                        this.I$0 = 0;
                        this.label = 1;
                        if (mutexImpl.lock(this) != coroutineSingletons4) {
                            i = 0;
                            mutex = mutexImpl;
                            intent = intent2;
                            financialConnectionsSheetNativeViewModel = financialConnectionsSheetNativeViewModel3;
                        }
                        return coroutineSingletons4;
                    }
                    if (i8 != 1) {
                        if (i8 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        financialConnectionsSheetNativeViewModel2 = (FinancialConnectionsSheetNativeViewModel) this.$routingParams;
                        str2 = (String) this.L$2;
                        mutex = (Mutex) this.L$1;
                        SafeTrace.throwOnFailure(obj);
                        queryParameterFromFragment = obj;
                        FinancialConnectionsSheetNativeViewModel.access$onUrlReceived(financialConnectionsSheetNativeViewModel2, str2, (String) queryParameterFromFragment);
                        mutex.unlock(null);
                        return Unit.INSTANCE;
                    }
                    int i9 = this.I$0;
                    financialConnectionsSheetNativeViewModel = (FinancialConnectionsSheetNativeViewModel) this.L$2;
                    Intent intent3 = (Intent) this.$route;
                    Mutex mutex3 = (Mutex) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    i = i9;
                    mutex = mutex3;
                    intent = intent3;
                    if (intent == null || (data = intent.getData()) == null || (str = data.toString()) == null) {
                        str = "";
                    }
                    if (!StringsKt.contains((CharSequence) str, (CharSequence) "authentication_return", true)) {
                        UriUtils uriUtils = financialConnectionsSheetNativeViewModel.uriUtils;
                        InitializerViewModelFactory initializerViewModelFactory = FinancialConnectionsSheetNativeViewModel.Factory;
                        if (uriUtils.compareSchemeAuthorityAndPath(str, "stripe://auth-redirect/" + financialConnectionsSheetNativeViewModel.applicationId)) {
                            FinancialConnectionsSheetNativeViewModel.access$onUrlReceived(financialConnectionsSheetNativeViewModel, str, financialConnectionsSheetNativeViewModel.uriUtils.getQueryParameter(str, "status"));
                        } else {
                            StateFlowImpl stateFlowImpl = financialConnectionsSheetNativeViewModel._stateFlow;
                            do {
                                value = stateFlowImpl.getValue();
                            } while (!stateFlowImpl.compareAndSet(value, FinancialConnectionsSheetNativeState.copy$default((FinancialConnectionsSheetNativeState) value, new WebAuthFlowState.Canceled(str), null, null, 16381)));
                        }
                        mutex.unlock(null);
                        return Unit.INSTANCE;
                    }
                    UriUtils uriUtils2 = financialConnectionsSheetNativeViewModel.uriUtils;
                    this.L$1 = mutex;
                    this.$route = null;
                    this.L$2 = str;
                    this.$routingParams = financialConnectionsSheetNativeViewModel;
                    this.I$0 = i;
                    this.label = 2;
                    queryParameterFromFragment = uriUtils2.getQueryParameterFromFragment(str);
                    if (queryParameterFromFragment != coroutineSingletons4) {
                        financialConnectionsSheetNativeViewModel2 = financialConnectionsSheetNativeViewModel;
                        str2 = str;
                        FinancialConnectionsSheetNativeViewModel.access$onUrlReceived(financialConnectionsSheetNativeViewModel2, str2, (String) queryParameterFromFragment);
                        mutex.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutineSingletons4;
                } catch (Throwable th) {
                    mutex2.unlock(null);
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealClientRouteRouter$route$1(zzlj zzljVar, ClientRoute clientRoute, RoutingParams routingParams, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zzljVar;
        this.$route = clientRoute;
        this.$routingParams = routingParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealClientRouteRouter$route$1(FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel, Intent intent, Continuation continuation) {
        super(2, continuation);
        this.L$3 = financialConnectionsSheetNativeViewModel;
        this.this$0 = intent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealClientRouteRouter$route$1(List list, DefaultStripeImageLoader defaultStripeImageLoader, int i, AndroidImageBitmap androidImageBitmap, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.L$2 = list;
        this.$routingParams = defaultStripeImageLoader;
        this.label = i;
        this.L$3 = androidImageBitmap;
        this.this$0 = mutableState;
    }
}
