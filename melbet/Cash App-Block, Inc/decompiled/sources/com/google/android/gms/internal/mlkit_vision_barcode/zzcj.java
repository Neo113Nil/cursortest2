package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcelable;
import androidx.core.text.TextUtilsCompat;
import androidx.glance.session.SessionWorker$doWork$2$2;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.family.requestsponsorship.presenters.SelectSponsorsRequestHelperKt$selectSponsor$2;
import com.squareup.cash.family.requestsponsorship.screens.SelectSponsorErrorScreen;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SelectSponsorsRequest;
import com.squareup.protos.franklin.app.SelectSponsorsResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.stripe.android.stripe3ds2.transaction.Logger;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import net.idrnd.face.iad.capture.internal.y0;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONObject;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public abstract class zzcj {
    public static ErrorData fromJson$3ds2sdk_release(JSONObject jSONObject) {
        Object obj;
        String optString = jSONObject.optString("threeDSServerTransID");
        String optString2 = jSONObject.optString("acsTransID");
        String optString3 = jSONObject.optString("dsTransID");
        String optString4 = jSONObject.optString("errorCode");
        optString4.getClass();
        y0 y0Var = ErrorData.ErrorComponent.Companion;
        String optString5 = jSONObject.optString("errorComponent");
        y0Var.getClass();
        Iterator it = ErrorData.ErrorComponent.$ENTRIES.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ErrorData.ErrorComponent) obj).code.equals(optString5)) {
                break;
            }
        }
        ErrorData.ErrorComponent errorComponent = (ErrorData.ErrorComponent) obj;
        String optString6 = jSONObject.optString("errorDescription");
        optString6.getClass();
        String optString7 = jSONObject.optString("errorDetail");
        optString7.getClass();
        String optString8 = jSONObject.optString("errorMessageType");
        String optString9 = jSONObject.optString("messageVersion");
        optString9.getClass();
        String optString10 = jSONObject.optString("sdkTransID");
        return new ErrorData(optString, optString2, optString3, optString4, errorComponent, optString6, optString7, optString8, optString9, optString10 != null ? new SdkTransactionId(optString10) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Integer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object selectSponsor(AppService appService, SelectSponsorsRequest.Action action, UiCustomer uiCustomer, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens blockersScreens, BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, Signal signal, Boolean bool5, Function0 function0, ContinuationImpl continuationImpl) {
        SelectSponsorsRequestHelperKt$selectSponsor$2 selectSponsorsRequestHelperKt$selectSponsor$2;
        int i;
        ?? r2;
        BetterNavigator.ScreenNavigator screenNavigator2;
        BlockersScreens blockersScreens2;
        BlockersDataNavigator blockersDataNavigator2;
        AndroidStringManager androidStringManager2;
        Object obj;
        Function0 function02;
        ApiResult apiResult;
        if (continuationImpl instanceof SelectSponsorsRequestHelperKt$selectSponsor$2) {
            selectSponsorsRequestHelperKt$selectSponsor$2 = (SelectSponsorsRequestHelperKt$selectSponsor$2) continuationImpl;
            int i2 = selectSponsorsRequestHelperKt$selectSponsor$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                selectSponsorsRequestHelperKt$selectSponsor$2.label = i2 - PKIFailureInfo.systemUnavail;
                SelectSponsorsRequestHelperKt$selectSponsor$2 selectSponsorsRequestHelperKt$selectSponsor$22 = selectSponsorsRequestHelperKt$selectSponsor$2;
                Object obj2 = selectSponsorsRequestHelperKt$selectSponsor$22.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectSponsorsRequestHelperKt$selectSponsor$22.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (uiCustomer == null && action != SelectSponsorsRequest.Action.CANCEL) {
                        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                        return null;
                    }
                    Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new Boolean[]{bool, bool2, bool5}).iterator();
                    while (it.hasNext()) {
                        if (((Boolean) it.next()) == null && action == SelectSponsorsRequest.Action.SELECT) {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            return null;
                        }
                    }
                    SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(appService, blockersScreens, new SelectSponsorsRequest(RequestContext.copy$default(blockersScreens.getBlockersData().requestContext, null, null, null, null, null, null, action == SelectSponsorsRequest.Action.SELECT ? "SELECT_SPONSORS" : "SPONSOR_SELECTION_DETAILS", null, null, null, null, null, 8127), CollectionsKt__CollectionsKt.listOfNotNull(uiCustomer), action, str2, bool5, CollectionsKt__CollectionsKt.listOfNotNull(uiCustomer != null ? new SelectSponsorsRequest.SelectedSponsor(uiCustomer, bool, bool2, bool3, str, bool4, ByteString.EMPTY) : null), ByteString.EMPTY), continuation, 17);
                    r2 = 0;
                    screenNavigator2 = screenNavigator;
                    selectSponsorsRequestHelperKt$selectSponsor$22.L$9 = screenNavigator2;
                    blockersScreens2 = blockersScreens;
                    selectSponsorsRequestHelperKt$selectSponsor$22.L$10 = blockersScreens2;
                    blockersDataNavigator2 = blockersDataNavigator;
                    selectSponsorsRequestHelperKt$selectSponsor$22.L$11 = blockersDataNavigator2;
                    androidStringManager2 = androidStringManager;
                    selectSponsorsRequestHelperKt$selectSponsor$22.L$12 = androidStringManager2;
                    selectSponsorsRequestHelperKt$selectSponsor$22.L$15 = function0;
                    selectSponsorsRequestHelperKt$selectSponsor$22.label = 1;
                    Object until = StateFlowKt.until(signal, sessionWorker$doWork$2$2, selectSponsorsRequestHelperKt$selectSponsor$22);
                    if (until == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = until;
                    function02 = function0;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function02 = selectSponsorsRequestHelperKt$selectSponsor$22.L$15;
                    AndroidStringManager androidStringManager3 = selectSponsorsRequestHelperKt$selectSponsor$22.L$12;
                    BlockersDataNavigator blockersDataNavigator3 = selectSponsorsRequestHelperKt$selectSponsor$22.L$11;
                    BlockersScreens blockersScreens3 = selectSponsorsRequestHelperKt$selectSponsor$22.L$10;
                    BetterNavigator.ScreenNavigator screenNavigator3 = selectSponsorsRequestHelperKt$selectSponsor$22.L$9;
                    SafeTrace.throwOnFailure(obj2);
                    blockersDataNavigator2 = blockersDataNavigator3;
                    blockersScreens2 = blockersScreens3;
                    obj = obj2;
                    screenNavigator2 = screenNavigator3;
                    androidStringManager2 = androidStringManager3;
                    r2 = 0;
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    BlockersData blockersData = blockersScreens2.getBlockersData();
                    SelectSponsorsResponse selectSponsorsResponse = (SelectSponsorsResponse) ((ApiResult.Success) apiResult).response;
                    ResponseContext responseContext = selectSponsorsResponse.response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    BlockersData updateFromResponseContext = blockersData.updateFromResponseContext(responseContext, false);
                    Screen next = blockersDataNavigator2.getNext(blockersScreens2, updateFromResponseContext);
                    if (blockersScreens2.getClass() != next.getClass()) {
                        screenNavigator2.goTo(next);
                    }
                    ResponseContext responseContext2 = selectSponsorsResponse.response_context;
                    responseContext2.getClass();
                    String str3 = responseContext2.dialog_message;
                    if (str3 != null) {
                        function02.invoke();
                        screenNavigator2.goTo(new SelectSponsorErrorScreen(updateFromResponseContext, str3));
                    }
                } else if (apiResult instanceof ApiResult.Failure) {
                    function02.invoke();
                    screenNavigator2.goTo(new FailureMessageBlockerScreen(blockersScreens2.getBlockersData(), TextUtilsCompat.errorMessaging(androidStringManager2, (ApiResult.Failure) apiResult, r2).message, r2, 4));
                } else if (apiResult != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            }
        }
        selectSponsorsRequestHelperKt$selectSponsor$2 = new SelectSponsorsRequestHelperKt$selectSponsor$2(continuationImpl);
        SelectSponsorsRequestHelperKt$selectSponsor$2 selectSponsorsRequestHelperKt$selectSponsor$222 = selectSponsorsRequestHelperKt$selectSponsor$2;
        Object obj22 = selectSponsorsRequestHelperKt$selectSponsor$222.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectSponsorsRequestHelperKt$selectSponsor$222.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object selectSponsor$default(AppService appService, SelectSponsorsRequest.Action action, UiCustomer uiCustomer, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens blockersScreens, BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, Signal signal, Boolean bool5, Function0 function0, SuspendLambda suspendLambda, int i) {
        return selectSponsor(appService, action, (i & 2) != 0 ? null : uiCustomer, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : bool3, (i & 32) != 0 ? null : bool4, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : str2, screenNavigator, blockersScreens, blockersDataNavigator, androidStringManager, signal, (i & PKIFailureInfo.certRevoked) != 0 ? null : bool5, function0, suspendLambda);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        zze(r1, r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzb(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int zza = zzck.zza(obj);
        int i2 = zza & i;
        int zzc = zzc(i2, obj3);
        if (zzc != 0) {
            int i3 = ~i;
            int i4 = zza & i3;
            int i5 = -1;
            while (true) {
                int i6 = zzc - 1;
                int i7 = iArr[i6];
                int i8 = i7 & i;
                if ((i7 & i3) != i4 || !Logger.zza(obj, objArr[i6]) || (objArr2 != null && !Logger.zza(obj2, objArr2[i6]))) {
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    zzc = i8;
                }
            }
        }
        return -1;
    }

    public static int zzc(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static Object zzd(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static void zze(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static final Object selectSponsor(AppService appService, UiCustomer uiCustomer, boolean z, boolean z2, boolean z3, BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens blockersScreens, BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, Signal signal, boolean z4, boolean z5, String str, Function0 function0, SuspendLambda suspendLambda) {
        Object selectSponsor$default = selectSponsor$default(appService, SelectSponsorsRequest.Action.SELECT, uiCustomer, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z5), str, null, screenNavigator, blockersScreens, blockersDataNavigator, androidStringManager, signal, Boolean.valueOf(z4), function0, suspendLambda, 128);
        return selectSponsor$default == CoroutineSingletons.COROUTINE_SUSPENDED ? selectSponsor$default : Unit.INSTANCE;
    }
}
