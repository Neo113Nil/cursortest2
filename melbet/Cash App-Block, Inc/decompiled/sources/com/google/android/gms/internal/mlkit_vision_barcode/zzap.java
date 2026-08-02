package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcelable;
import android.os.SystemClock;
import androidx.core.text.TextUtilsCompat;
import androidx.glance.session.SessionWorker$doWork$2$2;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.family.requestsponsorship.presenters.SelectDependentsRequestHelperKt$selectDependent$2;
import com.squareup.cash.family.requestsponsorship.screens.SelectSponsorErrorScreen;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.aegis.api.SelectDependentsRequest;
import com.squareup.protos.cash.aegis.api.SelectDependentsResponse;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class zzap {
    public final /* synthetic */ int $r8$classId;

    public static ChallengeResponseParseException createInvalidDataElementFormat(String str) {
        ProtocolError[] protocolErrorArr = ProtocolError.$VALUES;
        return new ChallengeResponseParseException(EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, "Data element not in the required format or value is invalid as defined in Table A.1", str);
    }

    public static ChallengeResponseParseException createRequiredDataElementMissing(String str) {
        ProtocolError[] protocolErrorArr = ProtocolError.$VALUES;
        return new ChallengeResponseParseException(EnumC0170g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, "A message element required as defined in Table A.1 is missing from the message.", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Integer, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object selectDependent(AegisService aegisService, SelectDependentsRequest.Action action, UiCustomer uiCustomer, Boolean bool, Boolean bool2, Boolean bool3, String str, BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens blockersScreens, BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, Signal signal, Boolean bool4, DrawerViewKt$$ExternalSyntheticLambda2 drawerViewKt$$ExternalSyntheticLambda2, ContinuationImpl continuationImpl) {
        SelectDependentsRequestHelperKt$selectDependent$2 selectDependentsRequestHelperKt$selectDependent$2;
        int i;
        ?? r2;
        BlockersScreens blockersScreens2;
        BlockersDataNavigator blockersDataNavigator2;
        BetterNavigator.ScreenNavigator screenNavigator2;
        AndroidStringManager androidStringManager2;
        Object obj;
        DrawerViewKt$$ExternalSyntheticLambda2 drawerViewKt$$ExternalSyntheticLambda22;
        ApiResult apiResult;
        if (continuationImpl instanceof SelectDependentsRequestHelperKt$selectDependent$2) {
            selectDependentsRequestHelperKt$selectDependent$2 = (SelectDependentsRequestHelperKt$selectDependent$2) continuationImpl;
            int i2 = selectDependentsRequestHelperKt$selectDependent$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                selectDependentsRequestHelperKt$selectDependent$2.label = i2 - PKIFailureInfo.systemUnavail;
                SelectDependentsRequestHelperKt$selectDependent$2 selectDependentsRequestHelperKt$selectDependent$22 = selectDependentsRequestHelperKt$selectDependent$2;
                Object obj2 = selectDependentsRequestHelperKt$selectDependent$22.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectDependentsRequestHelperKt$selectDependent$22.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (uiCustomer == null && action != SelectDependentsRequest.Action.CANCEL) {
                        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                        return null;
                    }
                    Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new Boolean[]{bool, bool2, bool4}).iterator();
                    while (it.hasNext()) {
                        if (((Boolean) it.next()) == null && action == SelectDependentsRequest.Action.SELECT) {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            return null;
                        }
                    }
                    SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(aegisService, blockersScreens, new SelectDependentsRequest(blockersScreens.getBlockersData().requestContext, CollectionsKt__CollectionsKt.listOfNotNull(uiCustomer != null ? new SelectDependentsRequest.SelectedDependent(uiCustomer, bool, bool2, str, bool3, ByteString.EMPTY) : null), action, null, bool4, ByteString.EMPTY), continuation, 16);
                    r2 = 0;
                    selectDependentsRequestHelperKt$selectDependent$22.L$8 = screenNavigator;
                    blockersScreens2 = blockersScreens;
                    selectDependentsRequestHelperKt$selectDependent$22.L$9 = blockersScreens2;
                    blockersDataNavigator2 = blockersDataNavigator;
                    selectDependentsRequestHelperKt$selectDependent$22.L$10 = blockersDataNavigator2;
                    selectDependentsRequestHelperKt$selectDependent$22.L$11 = androidStringManager;
                    selectDependentsRequestHelperKt$selectDependent$22.L$14 = drawerViewKt$$ExternalSyntheticLambda2;
                    selectDependentsRequestHelperKt$selectDependent$22.label = 1;
                    Object until = StateFlowKt.until(signal, sessionWorker$doWork$2$2, selectDependentsRequestHelperKt$selectDependent$22);
                    if (until == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    screenNavigator2 = screenNavigator;
                    androidStringManager2 = androidStringManager;
                    obj = until;
                    drawerViewKt$$ExternalSyntheticLambda22 = drawerViewKt$$ExternalSyntheticLambda2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    drawerViewKt$$ExternalSyntheticLambda22 = selectDependentsRequestHelperKt$selectDependent$22.L$14;
                    AndroidStringManager androidStringManager3 = selectDependentsRequestHelperKt$selectDependent$22.L$11;
                    BlockersDataNavigator blockersDataNavigator3 = selectDependentsRequestHelperKt$selectDependent$22.L$10;
                    BlockersScreens blockersScreens3 = selectDependentsRequestHelperKt$selectDependent$22.L$9;
                    screenNavigator2 = selectDependentsRequestHelperKt$selectDependent$22.L$8;
                    SafeTrace.throwOnFailure(obj2);
                    blockersDataNavigator2 = blockersDataNavigator3;
                    blockersScreens2 = blockersScreens3;
                    obj = obj2;
                    androidStringManager2 = androidStringManager3;
                    r2 = 0;
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    BlockersData blockersData = blockersScreens2.getBlockersData();
                    SelectDependentsResponse selectDependentsResponse = (SelectDependentsResponse) ((ApiResult.Success) apiResult).response;
                    ResponseContext responseContext = selectDependentsResponse.response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    BlockersData updateFromResponseContext = blockersData.updateFromResponseContext(responseContext, false);
                    Screen next = blockersDataNavigator2.getNext(blockersScreens2, updateFromResponseContext);
                    if (blockersScreens2.getClass() != next.getClass()) {
                        screenNavigator2.goTo(next);
                    }
                    ResponseContext responseContext2 = selectDependentsResponse.response_context;
                    responseContext2.getClass();
                    String str2 = responseContext2.dialog_message;
                    if (str2 != null) {
                        drawerViewKt$$ExternalSyntheticLambda22.invoke();
                        screenNavigator2.goTo(new SelectSponsorErrorScreen(updateFromResponseContext, str2));
                    }
                } else if (apiResult instanceof ApiResult.Failure) {
                    drawerViewKt$$ExternalSyntheticLambda22.invoke();
                    screenNavigator2.goTo(new FailureMessageBlockerScreen(blockersScreens2.getBlockersData(), TextUtilsCompat.errorMessaging(androidStringManager2, (ApiResult.Failure) apiResult, r2).message, r2, 4));
                } else if (apiResult != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            }
        }
        selectDependentsRequestHelperKt$selectDependent$2 = new SelectDependentsRequestHelperKt$selectDependent$2(continuationImpl);
        SelectDependentsRequestHelperKt$selectDependent$2 selectDependentsRequestHelperKt$selectDependent$222 = selectDependentsRequestHelperKt$selectDependent$2;
        Object obj22 = selectDependentsRequestHelperKt$selectDependent$222.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectDependentsRequestHelperKt$selectDependent$222.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    public final long zza() {
        switch (this.$r8$classId) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
