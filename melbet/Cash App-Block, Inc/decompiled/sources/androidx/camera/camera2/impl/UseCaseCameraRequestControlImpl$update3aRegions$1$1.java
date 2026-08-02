package androidx.camera.camera2.impl;

import android.util.Log;
import androidx.camera.camera2.pipe.CameraControls3A;
import androidx.camera.camera2.pipe.CameraGraph$Constants3A;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.data.api.ClockInEssentials;
import com.squareup.cash.work.data.real.RealClockInEssentialsProvider;
import com.squareup.cash.work.presenters.shift.RealClockInRepository;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.protos.common.Money;
import com.squareup.protos.timecards.StopTimecardResponse;
import com.squareup.protos.timecards.Timecard;
import dev.chrisbanes.haze.Pool;
import io.noties.markwon.MarkwonConfiguration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Deferred;
import okhttp3.Cache;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class UseCaseCameraRequestControlImpl$update3aRegions$1$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ Object $aeRegions;
    public final /* synthetic */ Object $afRegions;
    public final /* synthetic */ Object $awbRegions;
    public final /* synthetic */ int $r8$classId = 0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraRequestControlImpl$update3aRegions$1$1(CardLockPresenter cardLockPresenter, String str, Money money, String str2, Function1 function1, SellerCardViewModel sellerCardViewModel, ClockInEssentials.ClockedInEssentials clockedInEssentials, Continuation continuation) {
        super(1, continuation);
        this.L$0 = cardLockPresenter;
        this.L$1 = str;
        this.L$2 = money;
        this.$aeRegions = str2;
        this.$afRegions = function1;
        this.$awbRegions = sellerCardViewModel;
        this.this$0 = clockedInEssentials;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        Object obj2 = this.$awbRegions;
        Object obj3 = this.$afRegions;
        Object obj4 = this.$aeRegions;
        switch (i) {
            case 0:
                return new UseCaseCameraRequestControlImpl$update3aRegions$1$1((UseCaseCameraRequestControlImpl) obj, (List) obj4, (List) obj3, (List) obj2, continuation);
            default:
                return new UseCaseCameraRequestControlImpl$update3aRegions$1$1((CardLockPresenter) this.L$0, (String) this.L$1, (Money) this.L$2, (String) obj4, (Function1) obj3, (SellerCardViewModel) obj2, (ClockInEssentials.ClockedInEssentials) obj, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((UseCaseCameraRequestControlImpl$update3aRegions$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x010a, code lost:
    
        if (r0 == r1) goto L40;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        Object acquireSession;
        List list2;
        List list3;
        Object stopTimecard;
        CoroutineSingletons coroutineSingletons;
        Money money;
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        Object obj3 = this.$awbRegions;
        Object obj4 = this.$afRegions;
        Object obj5 = this.$aeRegions;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                try {
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "UseCaseCameraRequestControlImpl#update3aRegions");
                        }
                        list = (List) obj5;
                        List list4 = (List) obj4;
                        List list5 = (List) obj3;
                        CameraGraphImpl graph = ((UseCaseCameraRequestControlImpl) obj2).useCaseGraphContext.getGraph();
                        this.L$0 = list;
                        this.L$1 = list4;
                        this.L$2 = list5;
                        this.label = 1;
                        acquireSession = graph.acquireSession(this);
                        if (acquireSession == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        list2 = list5;
                        list3 = list4;
                    } else {
                        if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list2 = (List) this.L$2;
                        list3 = (List) this.L$1;
                        List list6 = (List) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        list = list6;
                        acquireSession = obj;
                    }
                    AutoCloseable autoCloseable = (AutoCloseable) acquireSession;
                    try {
                        CameraGraphSessionImpl cameraGraphSessionImpl = (CameraGraphSessionImpl) autoCloseable;
                        if (list == null) {
                            list = ArraysKt___ArraysJvmKt.asList(CameraGraph$Constants3A.METERING_REGIONS_DEFAULT);
                        }
                        List list7 = list;
                        if (list3 == null) {
                            list3 = ArraysKt___ArraysJvmKt.asList(CameraGraph$Constants3A.METERING_REGIONS_DEFAULT);
                        }
                        List list8 = list3;
                        if (list2 == null) {
                            list2 = ArraysKt___ArraysJvmKt.asList(CameraGraph$Constants3A.METERING_REGIONS_DEFAULT);
                        }
                        Deferred m42update3AydBZfZg$default = CameraControls3A.m42update3AydBZfZg$default(cameraGraphSessionImpl, null, null, null, list7, list8, list2, 7);
                        Cache.Companion.closeFinally(autoCloseable, null);
                        return m42update3AydBZfZg$default;
                    } finally {
                    }
                } catch (CancellationException e) {
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
                    }
                    return UseCaseCameraRequestControlImpl.submitFailedResult;
                }
            default:
                CardLockPresenter cardLockPresenter = (CardLockPresenter) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    stopTimecard = ((RealClockInRepository) cardLockPresenter.franklinAppService).stopTimecard((String) this.L$1, (Money) this.L$2, (String) obj5, this);
                    if (stopTimecard == coroutineSingletons3) {
                        coroutineSingletons = coroutineSingletons3;
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    stopTimecard = obj;
                }
                StopTimecardResponse stopTimecardResponse = (StopTimecardResponse) stopTimecard;
                Function1 function1 = (Function1) obj4;
                MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) cardLockPresenter.cashAppTagManager;
                MoneyFormatter moneyFormatter = (MoneyFormatter) markwonConfiguration.spansFactory;
                SellerCardViewModel sellerCardViewModel = (SellerCardViewModel) obj3;
                List list9 = ((ClockInEssentials.ClockedInEssentials) obj2).timecardBreaks;
                stopTimecardResponse.getClass();
                sellerCardViewModel.getClass();
                list9.getClass();
                Timecard timecard = stopTimecardResponse.timecard;
                Long l = timecard != null ? timecard.clockin_timestamp_ms : null;
                Long l2 = timecard != null ? timecard.clockout_timestamp_ms : null;
                long j = 0;
                if (l != null && l2 != null) {
                    long longValue = l2.longValue() - l.longValue();
                    if (longValue >= 0) {
                        j = longValue;
                    }
                }
                int i4 = (int) (j / 1000);
                String format2 = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4 / 3600), Integer.valueOf((i4 % 3600) / 60), Integer.valueOf(i4 % 60)}, 3));
                Money calculateEarnedWage$default = Pool.calculateEarnedWage$default((Pool) markwonConfiguration.imageDestinationProcessor, timecard, list9, null, l2, 4);
                function1.invoke(new ClockInOverlayViewModel.Loaded.ClockedOutSummary(sellerCardViewModel, calculateEarnedWage$default != null ? moneyFormatter.format(calculateEarnedWage$default) : ((AndroidStringManager) markwonConfiguration.theme).get(R.string.work_pay_home_placeholder), (timecard == null || (money = timecard.declared_tip) == null) ? null : moneyFormatter.format(money), format2, false, null));
                RealClockInEssentialsProvider realClockInEssentialsProvider = (RealClockInEssentialsProvider) cardLockPresenter.cardLockFlowTypeProvider;
                this.label = 2;
                Object refresh = realClockInEssentialsProvider.refresh(this);
                coroutineSingletons = coroutineSingletons3;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraRequestControlImpl$update3aRegions$1$1(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, List list, List list2, List list3, Continuation continuation) {
        super(1, continuation);
        this.this$0 = useCaseCameraRequestControlImpl;
        this.$aeRegions = list;
        this.$afRegions = list2;
        this.$awbRegions = list3;
    }
}
