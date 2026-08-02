package com.squareup.cash.prepurchasecashcard.backend;

import androidx.compose.ui.unit.IntRectKt;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.internal.LoyaltyKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.prepurchasecard.PrepurchaseCardToggleTap;
import com.squareup.cash.cdf.prepurchasecard.Surface;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.lending.sync_values.ToggleEntryPointData;
import com.squareup.lending.sync_values.ToggleEntryPointData$Action$ClientRoute;
import com.squareup.lending.sync_values.ToggleEntryPointData$Action$PerformToggle;
import com.squareup.protos.franklin.lending.PlasmaPrepurchaseCashCardToggleFlowParameters;
import com.squareup.protos.lending.Toggle;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealPrepurchaseToggleManager {
    public final StateFlowImpl _isRequestInProgress;
    public final Analytics analytics;
    public final EglCore getFlowHandler;
    public final StateFlowImpl isRequestInProgress;
    public final ReadonlyStateFlow prepurchaseToggleEntryPointData;

    public RealPrepurchaseToggleManager(RealPrepurchaseCashCardRepository realPrepurchaseCashCardRepository, EglCore eglCore, Analytics analytics, CoroutineScope coroutineScope) {
        this.getFlowHandler = eglCore;
        this.analytics = analytics;
        this.prepurchaseToggleEntryPointData = FlowKt.stateIn(new RealPrepurchaseCashCardRepository$prepurchaseAppletSyncData$$inlined$map$1(realPrepurchaseCashCardRepository.syncValueReader.getSingleValue(AndroidSyncValueSpecs.PrepurchaseCashCardData), realPrepurchaseCashCardRepository, 1), coroutineScope, SharingStarted.Companion.Eagerly, null);
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Boolean.FALSE);
        this._isRequestInProgress = MutableStateFlow;
        this.isRequestInProgress = MutableStateFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4 A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #0 {all -> 0x002f, blocks: (B:11:0x002a, B:12:0x00b0, B:14:0x00b4, B:51:0x0098), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098 A[Catch: all -> 0x002f, TRY_ENTER, TryCatch #0 {all -> 0x002f, blocks: (B:11:0x002a, B:12:0x00b0, B:14:0x00b4, B:51:0x0098), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object toggle(Screen screen, RealRouter realRouter, BetterNavigator.ScreenNavigator screenNavigator, Surface surface, ContinuationImpl continuationImpl) {
        RealPrepurchaseToggleManager$toggle$1 realPrepurchaseToggleManager$toggle$1;
        int i;
        StateFlowImpl stateFlowImpl;
        Object value;
        Object value2;
        Toggle toggle;
        String str;
        Object value3;
        BetterNavigator.ScreenNavigator screenNavigator2;
        Screen screen2;
        Object value4;
        try {
            if (continuationImpl instanceof RealPrepurchaseToggleManager$toggle$1) {
                realPrepurchaseToggleManager$toggle$1 = (RealPrepurchaseToggleManager$toggle$1) continuationImpl;
                int i2 = realPrepurchaseToggleManager$toggle$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realPrepurchaseToggleManager$toggle$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realPrepurchaseToggleManager$toggle$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realPrepurchaseToggleManager$toggle$1.label;
                    stateFlowImpl = this._isRequestInProgress;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        ToggleEntryPointData toggleEntryPointData = (ToggleEntryPointData) this.prepurchaseToggleEntryPointData.$$delegate_0.getValue();
                        if (toggleEntryPointData == null) {
                            return Unit.INSTANCE;
                        }
                        do {
                            value2 = stateFlowImpl.getValue();
                            ((Boolean) value2).getClass();
                        } while (!stateFlowImpl.compareAndSet(value2, Boolean.TRUE));
                        ToggleEntryPointData.ToggleState toggleState = toggleEntryPointData.toggle_state;
                        this.analytics.track(new PrepurchaseCardToggleTap(toggleState != null ? IntRectKt.toCdfToggleState(toggleState) : null, surface), null);
                        LoyaltyKt loyaltyKt = toggleEntryPointData.action;
                        if (loyaltyKt != null) {
                            ToggleEntryPointData$Action$PerformToggle toggleEntryPointData$Action$PerformToggle = loyaltyKt instanceof ToggleEntryPointData$Action$PerformToggle ? (ToggleEntryPointData$Action$PerformToggle) loyaltyKt : null;
                            if (toggleEntryPointData$Action$PerformToggle != null) {
                                toggle = toggleEntryPointData$Action$PerformToggle.value;
                                if (loyaltyKt != null) {
                                    ToggleEntryPointData$Action$ClientRoute toggleEntryPointData$Action$ClientRoute = loyaltyKt instanceof ToggleEntryPointData$Action$ClientRoute ? (ToggleEntryPointData$Action$ClientRoute) loyaltyKt : null;
                                    if (toggleEntryPointData$Action$ClientRoute != null) {
                                        str = toggleEntryPointData$Action$ClientRoute.value;
                                        if (toggle == null) {
                                            if (str != null) {
                                                realRouter.route(new RoutingParams(screen, null, null, null, null, null, 510), str);
                                                do {
                                                    value3 = stateFlowImpl.getValue();
                                                    ((Boolean) value3).getClass();
                                                } while (!stateFlowImpl.compareAndSet(value3, Boolean.FALSE));
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        EglCore eglCore = this.getFlowHandler;
                                        PlasmaPrepurchaseCashCardToggleFlowParameters plasmaPrepurchaseCashCardToggleFlowParameters = new PlasmaPrepurchaseCashCardToggleFlowParameters(6, (String) null, toggle.opaque_request_data);
                                        realPrepurchaseToggleManager$toggle$1.L$2 = screenNavigator;
                                        realPrepurchaseToggleManager$toggle$1.label = 1;
                                        obj = eglCore.getPrepurchaseToggleFlowScreen(screen, plasmaPrepurchaseCashCardToggleFlowParameters, screen, realPrepurchaseToggleManager$toggle$1);
                                        if (obj == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        screenNavigator2 = screenNavigator;
                                    }
                                }
                                str = null;
                                if (toggle == null) {
                                }
                            }
                        }
                        toggle = null;
                        if (loyaltyKt != null) {
                        }
                        str = null;
                        if (toggle == null) {
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        screenNavigator2 = realPrepurchaseToggleManager$toggle$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                    }
                    screen2 = (Screen) obj;
                    if (screen2 != null) {
                        screenNavigator2.goTo(screen2);
                    }
                    do {
                        value4 = stateFlowImpl.getValue();
                        ((Boolean) value4).getClass();
                    } while (!stateFlowImpl.compareAndSet(value4, Boolean.FALSE));
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            screen2 = (Screen) obj;
            if (screen2 != null) {
            }
            do {
                value4 = stateFlowImpl.getValue();
                ((Boolean) value4).getClass();
            } while (!stateFlowImpl.compareAndSet(value4, Boolean.FALSE));
            return Unit.INSTANCE;
        } catch (Throwable th) {
            do {
                value = stateFlowImpl.getValue();
                ((Boolean) value).getClass();
            } while (!stateFlowImpl.compareAndSet(value, Boolean.FALSE));
            throw th;
        }
        realPrepurchaseToggleManager$toggle$1 = new RealPrepurchaseToggleManager$toggle$1(this, continuationImpl);
        Object obj2 = realPrepurchaseToggleManager$toggle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPrepurchaseToggleManager$toggle$1.label;
        stateFlowImpl = this._isRequestInProgress;
    }
}
