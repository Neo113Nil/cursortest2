package com.squareup.cash.offers.backend.real;

import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.observability.backend.real.network.RealRequestObserver;
import com.squareup.cash.offers.backend.api.OffersSpanAction;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.offers.db.OffersSheetQueries$forSheetKey$2;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.cashsuggest.api.CashSuggestClientService;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.cashsuggest.api.OffersSheetRequest;
import com.squareup.protos.cash.cashsuggest.api.OffersSheetResponse;
import com.squareup.protos.cash.cashsuggest.api.SheetType;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SafeFlow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealOffersSheetRepository {
    public final CashSuggestClientService appService;
    public final CashAccountDatabaseImpl cashDatabase;
    public final AndroidClock clock;
    public final CoroutineContext ioDispatcher;
    public final RealRequestObserver requestObserver;

    public RealOffersSheetRepository(CashSuggestClientService cashSuggestClientService, CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidClock androidClock, CoroutineContext coroutineContext, RealRequestObserver realRequestObserver) {
        cashSuggestClientService.getClass();
        cashAccountDatabaseImpl.getClass();
        androidClock.getClass();
        coroutineContext.getClass();
        realRequestObserver.getClass();
        this.appService = cashSuggestClientService;
        this.cashDatabase = cashAccountDatabaseImpl;
        this.clock = androidClock;
        this.ioDispatcher = coroutineContext;
        this.requestObserver = realRequestObserver;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c9, code lost:
    
        if (r12.emit(r15, r6) == r0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getOfferSheetOrNull(RealOffersSheetRepository realOffersSheetRepository, FlowCollector flowCollector, OfferSheetKey offerSheetKey, Function1 function1, ContinuationImpl continuationImpl) {
        RealOffersSheetRepository$getOfferSheetOrNull$1 realOffersSheetRepository$getOfferSheetOrNull$1;
        int i;
        String str;
        String str2;
        String str3;
        String name;
        ApiResult apiResult;
        if (continuationImpl instanceof RealOffersSheetRepository$getOfferSheetOrNull$1) {
            realOffersSheetRepository$getOfferSheetOrNull$1 = (RealOffersSheetRepository$getOfferSheetOrNull$1) continuationImpl;
            int i2 = realOffersSheetRepository$getOfferSheetOrNull$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realOffersSheetRepository$getOfferSheetOrNull$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealOffersSheetRepository$getOfferSheetOrNull$1 realOffersSheetRepository$getOfferSheetOrNull$12 = realOffersSheetRepository$getOfferSheetOrNull$1;
                Object obj = realOffersSheetRepository$getOfferSheetOrNull$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOffersSheetRepository$getOfferSheetOrNull$12.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SheetType sheetType = offerSheetKey.sheet_type;
                    if (sheetType != null) {
                        int ordinal = sheetType.ordinal();
                        if (ordinal == 0) {
                            str = "offers_details_sheet_networking_span";
                        } else {
                            if (ordinal != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            str = "offers_timeline_sheet_networking_span";
                        }
                    } else {
                        str = null;
                    }
                    if (str != null && function1 != null) {
                        function1.invoke(new OffersSpanAction.StartNetworking(str));
                    }
                    RealRequestObserver realRequestObserver = realOffersSheetRepository.requestObserver;
                    OfferType offerType = offerSheetKey.offer_type;
                    if (offerType == null || (name = offerType.name()) == null) {
                        str2 = "pay_later_";
                    } else {
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        str2 = name.toLowerCase(locale);
                        str2.getClass();
                    }
                    Map m = Thread$State$EnumUnboxingLocalUtility.m("offerType", str2);
                    MoneyTabUIKt$$ExternalSyntheticLambda5 moneyTabUIKt$$ExternalSyntheticLambda5 = new MoneyTabUIKt$$ExternalSyntheticLambda5(offerSheetKey, 15);
                    RealMRIFactory$sign$2.AnonymousClass1 anonymousClass1 = new RealMRIFactory$sign$2.AnonymousClass1(realOffersSheetRepository, offerSheetKey, continuation, 14);
                    realOffersSheetRepository$getOfferSheetOrNull$12.L$0 = flowCollector;
                    realOffersSheetRepository$getOfferSheetOrNull$12.L$2 = function1;
                    realOffersSheetRepository$getOfferSheetOrNull$12.L$3 = str;
                    realOffersSheetRepository$getOfferSheetOrNull$12.label = 1;
                    Object maybeObserveRequest = realRequestObserver.maybeObserveRequest("/cash-app/offers/sheet", m, moneyTabUIKt$$ExternalSyntheticLambda5, anonymousClass1, realOffersSheetRepository$getOfferSheetOrNull$12);
                    if (maybeObserveRequest != coroutineSingletons) {
                        String str4 = str;
                        obj = maybeObserveRequest;
                        str3 = str4;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str3 = realOffersSheetRepository$getOfferSheetOrNull$12.L$3;
                function1 = realOffersSheetRepository$getOfferSheetOrNull$12.L$2;
                flowCollector = realOffersSheetRepository$getOfferSheetOrNull$12.L$0;
                SafeTrace.throwOnFailure(obj);
                apiResult = (ApiResult) obj;
                if (str3 != null && function1 != null) {
                    function1.invoke(OffersSpanAction.EndNetworking.INSTANCE);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    if (apiResult instanceof ApiResult.Success) {
                        return Unit.INSTANCE;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                realOffersSheetRepository$getOfferSheetOrNull$12.L$0 = null;
                realOffersSheetRepository$getOfferSheetOrNull$12.L$2 = null;
                realOffersSheetRepository$getOfferSheetOrNull$12.L$3 = null;
                realOffersSheetRepository$getOfferSheetOrNull$12.label = 2;
            }
        }
        realOffersSheetRepository$getOfferSheetOrNull$1 = new RealOffersSheetRepository$getOfferSheetOrNull$1(realOffersSheetRepository, continuationImpl);
        RealOffersSheetRepository$getOfferSheetOrNull$1 realOffersSheetRepository$getOfferSheetOrNull$122 = realOffersSheetRepository$getOfferSheetOrNull$1;
        Object obj2 = realOffersSheetRepository$getOfferSheetOrNull$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOffersSheetRepository$getOfferSheetOrNull$122.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (str3 != null) {
            function1.invoke(OffersSpanAction.EndNetworking.INSTANCE);
        }
        if (apiResult instanceof ApiResult.Failure) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r12 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getOffersSheetResponseFromNetwork(RealOffersSheetRepository realOffersSheetRepository, OfferSheetKey offerSheetKey, ContinuationImpl continuationImpl) {
        RealOffersSheetRepository$getOffersSheetResponseFromNetwork$1 realOffersSheetRepository$getOffersSheetResponseFromNetwork$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealOffersSheetRepository$getOffersSheetResponseFromNetwork$1) {
            realOffersSheetRepository$getOffersSheetResponseFromNetwork$1 = (RealOffersSheetRepository$getOffersSheetResponseFromNetwork$1) continuationImpl;
            int i2 = realOffersSheetRepository$getOffersSheetResponseFromNetwork$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realOffersSheetRepository$getOffersSheetResponseFromNetwork$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realOffersSheetRepository$getOffersSheetResponseFromNetwork$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOffersSheetRepository$getOffersSheetResponseFromNetwork$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CashSuggestClientService cashSuggestClientService = realOffersSheetRepository.appService;
                    OffersSheetRequest offersSheetRequest = new OffersSheetRequest(offerSheetKey, ByteString.EMPTY);
                    realOffersSheetRepository$getOffersSheetResponseFromNetwork$1.L$0 = offerSheetKey;
                    realOffersSheetRepository$getOffersSheetResponseFromNetwork$1.label = 1;
                    obj = cashSuggestClientService.offersSheet(offersSheetRequest, realOffersSheetRepository$getOffersSheetResponseFromNetwork$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ApiResult.Success success = realOffersSheetRepository$getOffersSheetResponseFromNetwork$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        return success;
                    }
                    offerSheetKey = realOffersSheetRepository$getOffersSheetResponseFromNetwork$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                OfferSheetKey offerSheetKey2 = offerSheetKey;
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    ApiResult.Success success2 = (ApiResult.Success) apiResult;
                    realOffersSheetRepository$getOffersSheetResponseFromNetwork$1.L$0 = null;
                    realOffersSheetRepository$getOffersSheetResponseFromNetwork$1.L$1 = success2;
                    realOffersSheetRepository$getOffersSheetResponseFromNetwork$1.label = 2;
                    Object withContext = JobKt.withContext(realOffersSheetRepository.ioDispatcher, new RealKeyStoreProvider$setEntry$2((OffersSheetResponse) success2.response, realOffersSheetRepository, offerSheetKey2, (Continuation) null, 16), realOffersSheetRepository$getOffersSheetResponseFromNetwork$1);
                    if (withContext != coroutineSingletons) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return apiResult;
            }
        }
        realOffersSheetRepository$getOffersSheetResponseFromNetwork$1 = new RealOffersSheetRepository$getOffersSheetResponseFromNetwork$1(realOffersSheetRepository, continuationImpl);
        Object obj2 = realOffersSheetRepository$getOffersSheetResponseFromNetwork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOffersSheetRepository$getOffersSheetResponseFromNetwork$1.label;
        if (i != 0) {
        }
        OfferSheetKey offerSheetKey22 = offerSheetKey;
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        return apiResult;
    }

    public final SafeFlow offerSheet(OfferSheetKey offerSheetKey, Function1 function1) {
        offerSheetKey.getClass();
        GpsConfigQueries gpsConfigQueries = this.cashDatabase.offersSheetQueries;
        gpsConfigQueries.getClass();
        OffersSheetQueries$forSheetKey$2 offersSheetQueries$forSheetKey$2 = OffersSheetQueries$forSheetKey$2.INSTANCE;
        return new SafeFlow(new MusicPresenter$models$1$1(new InviteContactsPresenter$special$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(new OffersSheetQueries$ForSheetKeyQuery(gpsConfigQueries, offerSheetKey, new Overlay$$ExternalSyntheticLambda0(gpsConfigQueries, 0))), this.ioDispatcher), offerSheetKey, 22), this, function1, (Continuation) null, 20));
    }
}
