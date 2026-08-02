package com.squareup.cash.globalsearch.presenters;

import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.SearchOrigin;
import com.squareup.cash.cdf.globalsearch.GlobalSearchSelectItem;
import com.squareup.cash.cdf.globalsearch.TapTarget;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.globalsearch.analytics.api.GlobalSearchAnalyticsContext$Item;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsHelper;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewEvent;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RowSectionPresenter$handleSelectEvent$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $actionUrl;
    public final /* synthetic */ GlobalSearchAnalyticsContext$Item $analyticsItem;
    public final /* synthetic */ GlobalSearchViewEvent.RowSectionEvent $event;
    public final /* synthetic */ GlobalSearchViewModel.Item $item;
    public int I$0;
    public int I$1;
    public Object L$0;
    public String L$1;
    public Object L$2;
    public Screen L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public int label;
    public final /* synthetic */ RowSectionPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowSectionPresenter$handleSelectEvent$1(RowSectionPresenter rowSectionPresenter, GlobalSearchViewModel.Item item, GlobalSearchAnalyticsContext$Item globalSearchAnalyticsContext$Item, GlobalSearchViewEvent.RowSectionEvent rowSectionEvent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rowSectionPresenter;
        this.$item = item;
        this.$analyticsItem = globalSearchAnalyticsContext$Item;
        this.$event = rowSectionEvent;
        this.$actionUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RowSectionPresenter$handleSelectEvent$1(this.this$0, this.$item, this.$analyticsItem, this.$event, this.$actionUrl, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RowSectionPresenter$handleSelectEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e8, code lost:
    
        if (r11 == r4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d7, code lost:
    
        if (r10 == r4) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0111  */
    /* JADX WARN: Type inference failed for: r7v4, types: [app.cash.broadway.screen.Screen] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Analytics analytics;
        Object sharedPreference;
        String str;
        Object sharedPreference2;
        Object sharedPreference3;
        String str2;
        Analytics analytics2;
        GlobalSearchViewEvent.RowSectionEvent rowSectionEvent;
        TapTarget tapTarget;
        TapTarget tapTarget2;
        String str3;
        ClientRoute parse;
        int i;
        Object sharedPreference4;
        int i2;
        ClientRoute clientRoute;
        RealRouter realRouter;
        Screen screen;
        UUID fromString;
        Object sharedPreference5;
        RowSectionPresenter rowSectionPresenter;
        int i3;
        ClientRoute clientRoute2;
        Screen screen2;
        Screen screen3;
        GetProfileDetailsContext getProfileDetailsContext;
        Object sharedPreference6;
        UUID uuid;
        RealRouter realRouter2;
        Screen screen4;
        Screen screen5;
        RowSectionPresenter rowSectionPresenter2 = this.this$0;
        GlobalSearchScreen globalSearchScreen = rowSectionPresenter2.screen;
        RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper = rowSectionPresenter2.analyticsHelper;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                SafeTrace.throwOnFailure(obj);
                analytics = rowSectionPresenter2.analytics;
                this.L$0 = analytics;
                this.label = 1;
                sharedPreference = realGlobalSearchAnalyticsHelper.getSharedPreference("GLOBAL_SEARCH_FLOW_TOKEN", this);
                break;
            case 1:
                analytics = (Analytics) this.L$0;
                SafeTrace.throwOnFailure(obj);
                sharedPreference = obj;
                str = (String) sharedPreference;
                this.L$0 = analytics;
                this.L$1 = str;
                this.label = 2;
                sharedPreference2 = realGlobalSearchAnalyticsHelper.getSharedPreference("GLOBAL_SEARCH_EXTERNAL_ID", this);
                break;
            case 2:
                String str4 = this.L$1;
                Analytics analytics3 = (Analytics) this.L$0;
                SafeTrace.throwOnFailure(obj);
                str = str4;
                analytics = analytics3;
                sharedPreference2 = obj;
                String str5 = (String) sharedPreference2;
                this.L$0 = analytics;
                this.L$1 = str;
                this.L$2 = str5;
                this.label = 3;
                sharedPreference3 = realGlobalSearchAnalyticsHelper.getSharedPreference("GLOBAL_SEARCH_QUERY_TOKEN", this);
                if (sharedPreference3 != coroutineSingletons) {
                    str2 = str5;
                    analytics2 = analytics;
                    String str6 = str;
                    String str7 = (String) sharedPreference3;
                    SearchOrigin searchOrigin = globalSearchScreen.searchOrigin;
                    GlobalSearchViewModel.Item item = this.$item;
                    String str8 = item == null ? item.entityId : null;
                    String str9 = item == null ? item.entityType : null;
                    GlobalSearchAnalyticsContext$Item globalSearchAnalyticsContext$Item = this.$analyticsItem;
                    Integer num = globalSearchAnalyticsContext$Item == null ? new Integer(globalSearchAnalyticsContext$Item.absoluteItemIndex) : null;
                    Integer num2 = globalSearchAnalyticsContext$Item == null ? new Integer(globalSearchAnalyticsContext$Item.sectionIndex) : null;
                    rowSectionEvent = this.$event;
                    if (!(rowSectionEvent instanceof GlobalSearchViewEvent.RowSectionEvent.RowClicked)) {
                        tapTarget2 = TapTarget.RESULT_ROW;
                    } else if (rowSectionEvent instanceof GlobalSearchViewEvent.RowSectionEvent.AccessoryClicked) {
                        tapTarget2 = TapTarget.INLINE_ACTION_PAY;
                    } else {
                        if (!(rowSectionEvent instanceof GlobalSearchViewEvent.LoadMore)) {
                            if (!(rowSectionEvent instanceof GlobalSearchViewEvent.RowSectionEvent.RowViewed)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            tapTarget = null;
                            analytics2.track(new GlobalSearchSelectItem(str6, str2, str7, searchOrigin, str8, str9, num, num2, tapTarget, item != null ? item.metadataJson : null), null);
                            str3 = this.$actionUrl;
                            if (str3 != null && (parse = rowSectionPresenter2.clientRouteParser.parse(str3)) != null) {
                                RealRouter realRouter3 = rowSectionPresenter2.router;
                                this.L$0 = rowSectionPresenter2;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = globalSearchScreen;
                                this.L$4 = globalSearchScreen;
                                this.L$5 = parse;
                                this.L$6 = realRouter3;
                                i = 0;
                                this.I$0 = 0;
                                this.I$1 = 0;
                                this.label = 4;
                                sharedPreference4 = realGlobalSearchAnalyticsHelper.getSharedPreference("GLOBAL_SEARCH_EXTERNAL_ID", this);
                                if (sharedPreference4 != coroutineSingletons) {
                                    i2 = 0;
                                    clientRoute = parse;
                                    realRouter = realRouter3;
                                    screen = globalSearchScreen;
                                    fromString = UUID.fromString((String) sharedPreference4);
                                    fromString.getClass();
                                    GetProfileDetailsContext getProfileDetailsContext2 = GetProfileDetailsContext.GLOBAL_SEARCH;
                                    RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper2 = rowSectionPresenter2.analyticsHelper;
                                    this.L$0 = rowSectionPresenter2;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = screen;
                                    this.L$4 = globalSearchScreen;
                                    this.L$5 = clientRoute;
                                    this.L$6 = realRouter;
                                    this.L$7 = fromString;
                                    this.L$8 = getProfileDetailsContext2;
                                    this.I$0 = i2;
                                    this.I$1 = i;
                                    this.label = 5;
                                    sharedPreference5 = realGlobalSearchAnalyticsHelper2.getSharedPreference("GLOBAL_SEARCH_FLOW_TOKEN", this);
                                    if (sharedPreference5 != coroutineSingletons) {
                                        rowSectionPresenter = rowSectionPresenter2;
                                        i3 = i;
                                        clientRoute2 = clientRoute;
                                        screen2 = screen;
                                        screen3 = globalSearchScreen;
                                        getProfileDetailsContext = getProfileDetailsContext2;
                                        UUID fromString2 = UUID.fromString((String) sharedPreference5);
                                        fromString2.getClass();
                                        RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper3 = rowSectionPresenter.analyticsHelper;
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = screen2;
                                        this.L$3 = screen3;
                                        this.L$4 = clientRoute2;
                                        this.L$5 = realRouter;
                                        this.L$6 = fromString;
                                        this.L$7 = getProfileDetailsContext;
                                        this.L$8 = fromString2;
                                        this.I$0 = i2;
                                        this.I$1 = i3;
                                        this.label = 6;
                                        sharedPreference6 = realGlobalSearchAnalyticsHelper3.getSharedPreference("GLOBAL_SEARCH_QUERY_TOKEN", this);
                                        if (sharedPreference6 != coroutineSingletons) {
                                            uuid = fromString2;
                                            realRouter2 = realRouter;
                                            screen4 = screen3;
                                            screen5 = screen2;
                                            realRouter2.route(clientRoute2, new RoutingParams(screen4, null, screen5, null, new AnalyticsParams.GlobalSearchAnalyticsParams(fromString, getProfileDetailsContext, uuid, (String) sharedPreference6), null, 470));
                                        }
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        tapTarget2 = TapTarget.SEE_MORE;
                    }
                    tapTarget = tapTarget2;
                    analytics2.track(new GlobalSearchSelectItem(str6, str2, str7, searchOrigin, str8, str9, num, num2, tapTarget, item != null ? item.metadataJson : null), null);
                    str3 = this.$actionUrl;
                    if (str3 != null) {
                        RealRouter realRouter32 = rowSectionPresenter2.router;
                        this.L$0 = rowSectionPresenter2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = globalSearchScreen;
                        this.L$4 = globalSearchScreen;
                        this.L$5 = parse;
                        this.L$6 = realRouter32;
                        i = 0;
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.label = 4;
                        sharedPreference4 = realGlobalSearchAnalyticsHelper.getSharedPreference("GLOBAL_SEARCH_EXTERNAL_ID", this);
                        if (sharedPreference4 != coroutineSingletons) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                return coroutineSingletons;
            case 3:
                String str10 = (String) this.L$2;
                str = this.L$1;
                analytics2 = (Analytics) this.L$0;
                SafeTrace.throwOnFailure(obj);
                sharedPreference3 = obj;
                str2 = str10;
                String str62 = str;
                String str72 = (String) sharedPreference3;
                SearchOrigin searchOrigin2 = globalSearchScreen.searchOrigin;
                GlobalSearchViewModel.Item item2 = this.$item;
                if (item2 == null) {
                }
                if (item2 == null) {
                }
                GlobalSearchAnalyticsContext$Item globalSearchAnalyticsContext$Item2 = this.$analyticsItem;
                if (globalSearchAnalyticsContext$Item2 == null) {
                }
                if (globalSearchAnalyticsContext$Item2 == null) {
                }
                rowSectionEvent = this.$event;
                if (!(rowSectionEvent instanceof GlobalSearchViewEvent.RowSectionEvent.RowClicked)) {
                }
                tapTarget = tapTarget2;
                analytics2.track(new GlobalSearchSelectItem(str62, str2, str72, searchOrigin2, str8, str9, num, num2, tapTarget, item2 != null ? item2.metadataJson : null), null);
                str3 = this.$actionUrl;
                if (str3 != null) {
                }
                return Unit.INSTANCE;
            case 4:
                int i4 = this.I$1;
                int i5 = this.I$0;
                RealRouter realRouter4 = (RealRouter) this.L$6;
                ClientRoute clientRoute3 = (ClientRoute) this.L$5;
                ?? r7 = (Screen) this.L$4;
                screen = this.L$3;
                RowSectionPresenter rowSectionPresenter3 = (RowSectionPresenter) this.L$0;
                SafeTrace.throwOnFailure(obj);
                i = i4;
                rowSectionPresenter2 = rowSectionPresenter3;
                clientRoute = clientRoute3;
                i2 = i5;
                globalSearchScreen = r7;
                realRouter = realRouter4;
                sharedPreference4 = obj;
                fromString = UUID.fromString((String) sharedPreference4);
                fromString.getClass();
                GetProfileDetailsContext getProfileDetailsContext22 = GetProfileDetailsContext.GLOBAL_SEARCH;
                RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper22 = rowSectionPresenter2.analyticsHelper;
                this.L$0 = rowSectionPresenter2;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = screen;
                this.L$4 = globalSearchScreen;
                this.L$5 = clientRoute;
                this.L$6 = realRouter;
                this.L$7 = fromString;
                this.L$8 = getProfileDetailsContext22;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 5;
                sharedPreference5 = realGlobalSearchAnalyticsHelper22.getSharedPreference("GLOBAL_SEARCH_FLOW_TOKEN", this);
                if (sharedPreference5 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 5:
                i3 = this.I$1;
                int i6 = this.I$0;
                GetProfileDetailsContext getProfileDetailsContext3 = (GetProfileDetailsContext) this.L$8;
                UUID uuid2 = (UUID) this.L$7;
                RealRouter realRouter5 = (RealRouter) this.L$6;
                ClientRoute clientRoute4 = (ClientRoute) this.L$5;
                screen3 = (Screen) this.L$4;
                screen2 = this.L$3;
                rowSectionPresenter = (RowSectionPresenter) this.L$0;
                SafeTrace.throwOnFailure(obj);
                realRouter = realRouter5;
                i2 = i6;
                getProfileDetailsContext = getProfileDetailsContext3;
                fromString = uuid2;
                clientRoute2 = clientRoute4;
                sharedPreference5 = obj;
                UUID fromString22 = UUID.fromString((String) sharedPreference5);
                fromString22.getClass();
                RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper32 = rowSectionPresenter.analyticsHelper;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = screen2;
                this.L$3 = screen3;
                this.L$4 = clientRoute2;
                this.L$5 = realRouter;
                this.L$6 = fromString;
                this.L$7 = getProfileDetailsContext;
                this.L$8 = fromString22;
                this.I$0 = i2;
                this.I$1 = i3;
                this.label = 6;
                sharedPreference6 = realGlobalSearchAnalyticsHelper32.getSharedPreference("GLOBAL_SEARCH_QUERY_TOKEN", this);
                if (sharedPreference6 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                uuid = (UUID) this.L$8;
                getProfileDetailsContext = (GetProfileDetailsContext) this.L$7;
                fromString = (UUID) this.L$6;
                realRouter2 = (RealRouter) this.L$5;
                clientRoute2 = (ClientRoute) this.L$4;
                Screen screen6 = this.L$3;
                Screen screen7 = (Screen) this.L$2;
                SafeTrace.throwOnFailure(obj);
                sharedPreference6 = obj;
                screen5 = screen7;
                screen4 = screen6;
                realRouter2.route(clientRoute2, new RoutingParams(screen4, null, screen5, null, new AnalyticsParams.GlobalSearchAnalyticsParams(fromString, getProfileDetailsContext, uuid, (String) sharedPreference6), null, 470));
                return Unit.INSTANCE;
            default:
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
