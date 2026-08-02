package com.squareup.cash.clientrouting.routers.earningsTracker;

import androidx.compose.ui.text.android.CanvasCompatO;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerEntrypoint;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerOpenLaunchApplet;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.earningstracker.backend.real.RealEarningsTrackerAnalytics;
import com.squareup.cash.earningstracker.screens.EarningsTrackerScreen;
import com.squareup.cash.payments.backend.api.P2pSettingsManager$P2pSettings;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.EarningsNoticeParams;
import com.squareup.wire.ProtoAdapter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class EarningsTrackerRouter {
    public final RealEarningsTrackerAnalytics earningsTrackerAnalytics;
    public final Navigator navigator;
    public final Lazy p2pSettingsFlow$delegate;
    public final RealP2pSettingsManager p2pSettingsManager;
    public final AndroidStringManager stringManager;

    public EarningsTrackerRouter(RealP2pSettingsManager realP2pSettingsManager, AndroidStringManager androidStringManager, RealEarningsTrackerAnalytics realEarningsTrackerAnalytics, Navigator navigator) {
        navigator.getClass();
        this.p2pSettingsManager = realP2pSettingsManager;
        this.stringManager = androidStringManager;
        this.earningsTrackerAnalytics = realEarningsTrackerAnalytics;
        this.navigator = navigator;
        this.p2pSettingsFlow$delegate = LazyKt.lazy(new SsnViewKt$$ExternalSyntheticLambda4(this, 22));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewEarningsTrackerWithParams viewEarningsTrackerWithParams, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        EarningsTrackerRouter$route$1 earningsTrackerRouter$route$1;
        int i;
        boolean isRatePlanBusiness;
        EarningsTrackerEntrypoint earningsTrackerEntrypoint;
        if (continuationImpl instanceof EarningsTrackerRouter$route$1) {
            earningsTrackerRouter$route$1 = (EarningsTrackerRouter$route$1) continuationImpl;
            int i2 = earningsTrackerRouter$route$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                earningsTrackerRouter$route$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = earningsTrackerRouter$route$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = earningsTrackerRouter$route$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.p2pSettingsFlow$delegate.getValue();
                    earningsTrackerRouter$route$1.L$0 = viewEarningsTrackerWithParams;
                    earningsTrackerRouter$route$1.L$1 = routingParams;
                    earningsTrackerRouter$route$1.label = 1;
                    obj = FlowKt.firstOrNull(flow, earningsTrackerRouter$route$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    routingParams = earningsTrackerRouter$route$1.L$1;
                    viewEarningsTrackerWithParams = earningsTrackerRouter$route$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                P2pSettingsManager$P2pSettings p2pSettingsManager$P2pSettings = (P2pSettingsManager$P2pSettings) obj;
                isRatePlanBusiness = p2pSettingsManager$P2pSettings == null ? CanvasCompatO.isRatePlanBusiness(p2pSettingsManager$P2pSettings) : false;
                Navigator navigator = this.navigator;
                if (isRatePlanBusiness) {
                    String str = routingParams.switchSource;
                    PaymentScreens$HomeScreens$Home paymentScreens$HomeScreens$Home = PaymentScreens$HomeScreens$Home.INSTANCE;
                    if (str != null) {
                        navigator.goTo(paymentScreens$HomeScreens$Home);
                    }
                    AndroidStringManager androidStringManager = this.stringManager;
                    String str2 = androidStringManager.get(R.string.earnings_tracker_unsupported_title);
                    String str3 = androidStringManager.get(R.string.earnings_tracker_unsupported_body);
                    String str4 = androidStringManager.get(R.string.earnings_tracker_unsupported_button);
                    Screen screen = routingParams.origin;
                    navigator.goTo(new FailureMessageScreen(str2, str3, str4, screen == null ? paymentScreens$HomeScreens$Home : screen, null, 16));
                    return Unit.INSTANCE;
                }
                ProtoAdapter protoAdapter = EarningsNoticeParams.ADAPTER;
                ByteString.Companion companion = ByteString.Companion;
                ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewEarningsTrackerWithParams.encodedEarningsNoticeParams);
                decodeBase64.getClass();
                EarningsNoticeParams earningsNoticeParams = (EarningsNoticeParams) protoAdapter.decode(decodeBase64);
                Integer num = earningsNoticeParams.month;
                Integer num2 = earningsNoticeParams.year;
                DateFilter yearly = (num2 == null || num == null) ? num2 != null ? new DateFilter.Yearly(num2.intValue()) : null : new DateFilter.Monthly(num.intValue(), num2.intValue());
                EarningsNoticeParams.EntryPoint entryPoint = earningsNoticeParams.entry_point;
                entryPoint.getClass();
                int ordinal = entryPoint.ordinal();
                if (ordinal == 0) {
                    earningsTrackerEntrypoint = EarningsTrackerEntrypoint.MONEY_TAB;
                } else if (ordinal == 1) {
                    earningsTrackerEntrypoint = EarningsTrackerEntrypoint.MONTHLY_PUSH;
                } else if (ordinal == 2) {
                    earningsTrackerEntrypoint = EarningsTrackerEntrypoint.INTRO_PUSH;
                } else {
                    if (ordinal != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    earningsTrackerEntrypoint = EarningsTrackerEntrypoint.INTRO_EMAIL;
                }
                this.earningsTrackerAnalytics.analytics.track(new EarningsTrackerOpenLaunchApplet(earningsTrackerEntrypoint), null);
                navigator.goTo(new EarningsTrackerScreen(earningsTrackerEntrypoint, yearly));
                return Unit.INSTANCE;
            }
        }
        earningsTrackerRouter$route$1 = new EarningsTrackerRouter$route$1(this, continuationImpl);
        Object obj2 = earningsTrackerRouter$route$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = earningsTrackerRouter$route$1.label;
        if (i != 0) {
        }
        P2pSettingsManager$P2pSettings p2pSettingsManager$P2pSettings2 = (P2pSettingsManager$P2pSettings) obj2;
        if (p2pSettingsManager$P2pSettings2 == null) {
        }
        Navigator navigator2 = this.navigator;
        if (isRatePlanBusiness) {
        }
    }
}
