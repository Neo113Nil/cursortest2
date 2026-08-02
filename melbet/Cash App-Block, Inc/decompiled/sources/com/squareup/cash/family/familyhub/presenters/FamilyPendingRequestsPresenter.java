package com.squareup.cash.family.familyhub.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.RotateKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.R;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$models$3$1;
import com.squareup.cash.family.familyhub.backend.api.FamilyParsingErrorFactory;
import com.squareup.cash.family.familyhub.presenters.PendingRequestActivityState;
import com.squareup.cash.family.familyhub.screens.FamilyPendingRequestsScreen;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestRowModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestsViewModel;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.aegis.core.PendingRequest;
import com.squareup.protos.cash.aegis.core.PendingRequestsParams;
import com.squareup.protos.cash.aegis.core.ViewRequestLink;
import com.squareup.protos.cash.aegis.service.AegisService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class FamilyPendingRequestsPresenter implements MoleculePresenter, HasObservability {
    public static final ArrayList loadingPendingRequestRows;
    public final Analytics analytics;
    public final FamilyPendingRequestsScreen args;
    public final RealCustomerStore customerStore;
    public final DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandlerFactory;
    public final ErrorReporter errorReporter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final PendingRequestActivityManager pendingRequestActivityManager;
    public final RealRouter router;
    public final RealRouter$Factory$Impl routerFactory;
    public final AegisService service;
    public final AndroidStringManager stringManager;

    static {
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            arrayList.add(FamilyPendingRequestRowModel.Loading.INSTANCE);
        }
        loadingPendingRequestRows = arrayList;
    }

    public FamilyPendingRequestsPresenter(RealCustomerStore realCustomerStore, AndroidStringManager androidStringManager, RealRouter$Factory$Impl realRouter$Factory$Impl, Analytics analytics, AegisService aegisService, PendingRequestActivityManager pendingRequestActivityManager, DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl, ErrorReporter errorReporter, SampleStrategy sampleStrategy, FamilyPendingRequestsScreen familyPendingRequestsScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        familyPendingRequestsScreen.getClass();
        this.customerStore = realCustomerStore;
        this.stringManager = androidStringManager;
        this.routerFactory = realRouter$Factory$Impl;
        this.analytics = analytics;
        this.service = aegisService;
        this.pendingRequestActivityManager = pendingRequestActivityManager;
        this.defaultActivityItemEventHandlerFactory = defaultActivityItemEventHandler$Factory$Impl;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.args = familyPendingRequestsScreen;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestRowModel$Activity] */
    /* JADX WARN: Type inference failed for: r2v25, types: [com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestRowModel$Loading] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.squareup.cash.family.familyhub.presenters.RealPendingRequestActivityManager] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        FamilyPendingRequestRowModel.Loaded loaded;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(233906423);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        ArrayList arrayList = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new EarningsHomePresenter$models$3$1(this, mutableState, (Continuation) null, 25);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        if (((PendingRequestsParams) mutableState.getValue()) != null) {
            gapComposer.startReplaceGroup(1869744564);
            boolean changedInstance2 = gapComposer.changedInstance(this);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CheckStatusPresenter.AnonymousClass1.C00611(this, mutableState, continuation, 2);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1869951179);
            gapComposer.end(false);
        }
        Updater.LaunchedEffect(gapComposer, flow, new EarningsHomePresenter$models$3$1(flow, (Continuation) null, this, 24));
        PendingRequestsParams pendingRequestsParams = (PendingRequestsParams) mutableState.getValue();
        List<PendingRequest> list = pendingRequestsParams != null ? pendingRequestsParams.pending_requests : null;
        boolean changed = gapComposer.changed(list);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed || rememberedValue4 == neverEqualPolicy) {
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (PendingRequest pendingRequest : list) {
                    FamilyParsingErrorFactory familyParsingErrorFactory = FamilyParsingErrorFactory.INSTANCE;
                    try {
                        String str = pendingRequest.requester_customer_token;
                        if (str == null) {
                            try {
                                throw new IllegalArgumentException("requester_customer_token");
                            } catch (Exception e) {
                                this.errorReporter.report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(PendingRequest.class), familyParsingErrorFactory, null), this.oneErrorPerAppSessionStrategy);
                                str = null;
                            }
                        }
                        if (str != null) {
                            arrayList2.add(str);
                        }
                    } catch (Exception e2) {
                        throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(pendingRequest.getClass()), familyParsingErrorFactory, null);
                    }
                }
                rememberedValue4 = new Transform$special$$inlined$map$1(this.customerStore.getCustomersForIds(arrayList2), arrayList2, 5);
            } else {
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                rememberedValue4 = new AppLockMonitor$special$$inlined$map$2(emptyMap, 19);
            }
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        EmptyMap emptyMap2 = EmptyMap.INSTANCE;
        emptyMap2.getClass();
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue4, emptyMap2, null, gapComposer, 48, 2);
        AndroidStringManager androidStringManager = this.stringManager;
        String str2 = androidStringManager.get(R.string.family_pending_requests_screen_title);
        if (list == null) {
            gapComposer.startReplaceGroup(1871588567);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1871588568);
            ArrayList arrayList3 = new ArrayList();
            for (PendingRequest pendingRequest2 : list) {
                String str3 = pendingRequest2.activity_row_id;
                ViewRequestLink viewRequestLink = pendingRequest2.request_action_link;
                ?? r4 = viewRequestLink != null ? viewRequestLink.url : continuation;
                ?? r6 = (RealPendingRequestActivityManager) this.pendingRequestActivityManager;
                PendingRequestActivityState rememberPendingRequestActivityState = r6.rememberPendingRequestActivityState(str3, r4, gapComposer);
                if (rememberPendingRequestActivityState instanceof PendingRequestActivityState.Loading) {
                    gapComposer.startReplaceGroup(-2136424719);
                    gapComposer.end(false);
                    loaded = FamilyPendingRequestRowModel.Loading.INSTANCE;
                } else if (rememberPendingRequestActivityState instanceof PendingRequestActivityState.Loaded) {
                    gapComposer.startReplaceGroup(-1804553028);
                    PendingRequestActivityState.Loaded loaded2 = (PendingRequestActivityState.Loaded) rememberPendingRequestActivityState;
                    GapComposer gapComposer2 = gapComposer;
                    gapComposer = gapComposer2;
                    ?? activity = new FamilyPendingRequestRowModel.Activity(r6.createActivityUiCallbackModel(loaded2.activityItem, this.navigator, this.args, loaded2.buttonUrl, this.defaultActivityItemEventHandlerFactory, this.routerFactory, gapComposer2));
                    gapComposer.end(false);
                    loaded = activity;
                } else {
                    if (!(rememberPendingRequestActivityState instanceof PendingRequestActivityState.Failed)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -2136426419, false);
                    }
                    gapComposer.startReplaceGroup(-2136403243);
                    gapComposer.end(false);
                    loaded = FamilyPendingRequestRowModelHelperKt.toModel(this, pendingRequest2, (Map) collectAsState.getValue());
                }
                if (loaded != null) {
                    arrayList3.add(loaded);
                }
                continuation = null;
            }
            gapComposer.end(false);
            arrayList = arrayList3;
        }
        if (arrayList == null) {
            arrayList = loadingPendingRequestRows;
        }
        FamilyPendingRequestsViewModel familyPendingRequestsViewModel = new FamilyPendingRequestsViewModel(str2, androidStringManager.get(R.string.family_pending_requests_screen_empty_state_title), androidStringManager.get(R.string.family_pending_requests_screen_empty_state_subtitle), arrayList);
        gapComposer.end(false);
        return familyPendingRequestsViewModel;
    }
}
