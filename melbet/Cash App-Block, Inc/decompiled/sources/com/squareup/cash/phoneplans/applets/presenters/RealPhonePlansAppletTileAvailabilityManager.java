package com.squareup.cash.phoneplans.applets.presenters;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetPhonePlanAppletRequest;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda3;
import com.squareup.protos.cash.cashsubscriptions.api.v1_0.CashSubscriptionsAppService;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import net.idrnd.face.iad.capture.internal.y0;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.phoneplans.syncvalues.PhonePlanAppletV1;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealPhonePlansAppletTileAvailabilityManager {
    public final DerivedStateFlow availabilityState;
    public final CashSubscriptionsAppService subscriptionsAppService;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PhonePlanAppletV1.State.values().length];
            try {
                y0 y0Var = PhonePlanAppletV1.State.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                y0 y0Var2 = PhonePlanAppletV1.State.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                y0 y0Var3 = PhonePlanAppletV1.State.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                y0 y0Var4 = PhonePlanAppletV1.State.Companion;
                iArr[8] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                y0 y0Var5 = PhonePlanAppletV1.State.Companion;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                y0 y0Var6 = PhonePlanAppletV1.State.Companion;
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                y0 y0Var7 = PhonePlanAppletV1.State.Companion;
                iArr[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                y0 y0Var8 = PhonePlanAppletV1.State.Companion;
                iArr[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                y0 y0Var9 = PhonePlanAppletV1.State.Companion;
                iArr[7] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                y0 y0Var10 = PhonePlanAppletV1.State.Companion;
                iArr[11] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                y0 y0Var11 = PhonePlanAppletV1.State.Companion;
                iArr[9] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                y0 y0Var12 = PhonePlanAppletV1.State.Companion;
                iArr[10] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealPhonePlansAppletTileAvailabilityManager(CoroutineScope coroutineScope, CashSubscriptionsAppService cashSubscriptionsAppService, SyncValueReader syncValueReader, CoroutineContext coroutineContext) {
        this.subscriptionsAppService = cashSubscriptionsAppService;
        JobKt.launch$default(coroutineScope, coroutineContext, null, new MusicPresenter$models$3$1(this, null, 25), 2);
        this.availabilityState = StateFlowKt.mapState(syncValueReader.getSingleValue(AndroidSyncValueSpecs.PhonePlanApplet, new PoolDetailsViewKt$$ExternalSyntheticLambda3(22)), new PoolDetailsViewKt$$ExternalSyntheticLambda3(23));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refresh(ContinuationImpl continuationImpl) {
        RealPhonePlansAppletTileAvailabilityManager$refresh$1 realPhonePlansAppletTileAvailabilityManager$refresh$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealPhonePlansAppletTileAvailabilityManager$refresh$1) {
            realPhonePlansAppletTileAvailabilityManager$refresh$1 = (RealPhonePlansAppletTileAvailabilityManager$refresh$1) continuationImpl;
            int i2 = realPhonePlansAppletTileAvailabilityManager$refresh$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPhonePlansAppletTileAvailabilityManager$refresh$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPhonePlansAppletTileAvailabilityManager$refresh$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPhonePlansAppletTileAvailabilityManager$refresh$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetPhonePlanAppletRequest getPhonePlanAppletRequest = new GetPhonePlanAppletRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), ByteString.EMPTY);
                    realPhonePlansAppletTileAvailabilityManager$refresh$1.label = 1;
                    obj = this.subscriptionsAppService.getPhonePlanApplet(getPhonePlanAppletRequest, realPhonePlansAppletTileAvailabilityManager$refresh$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    Timber.Forest.d("Successfully refreshed the Phone Plans applet", new Object[0]);
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.w("Failed to refresh the Phone Plans applet", new Object[0]);
                }
                return Unit.INSTANCE;
            }
        }
        realPhonePlansAppletTileAvailabilityManager$refresh$1 = new RealPhonePlansAppletTileAvailabilityManager$refresh$1(this, continuationImpl);
        Object obj2 = realPhonePlansAppletTileAvailabilityManager$refresh$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPhonePlansAppletTileAvailabilityManager$refresh$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }
}
