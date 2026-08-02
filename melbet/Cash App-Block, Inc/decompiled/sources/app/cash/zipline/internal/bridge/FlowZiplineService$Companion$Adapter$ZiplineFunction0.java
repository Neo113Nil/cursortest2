package app.cash.zipline.internal.bridge;

import app.cash.zipline.ZiplineService;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.cash.treehouse.activity.ActivityPaymentManager2;
import com.squareup.cash.treehouse.activity.SerializableActivityItem;
import com.squareup.cash.treehouse.navigation.ClientRouteUrl;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.serialization.KSerializer;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class FlowZiplineService$Companion$Adapter$ZiplineFunction0 extends SuspendingZiplineFunction {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowZiplineService$Companion$Adapter$ZiplineFunction0(String str, String str2, List list, KSerializer kSerializer, KSerializer kSerializer2, int i) {
        super(str, str2, list, kSerializer, kSerializer2);
        this.$r8$classId = i;
    }

    @Override // app.cash.zipline.internal.bridge.SuspendingZiplineFunction
    public final Object callSuspending(ZiplineService ziplineService, List list, zzmo zzmoVar) {
        switch (this.$r8$classId) {
            case 0:
                Object obj = list.get(0);
                obj.getClass();
                Object collect = ((FlowZiplineService) ziplineService).collect((FlowZiplineCollector) obj, zzmoVar);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object emit = ((FlowZiplineCollector) ziplineService).emit(list.get(0), zzmoVar);
                if (emit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object obj2 = list.get(0);
                obj2.getClass();
                Object collect2 = ((StateFlowZiplineService) ziplineService).collect((FlowZiplineCollector) obj2, zzmoVar);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object obj3 = list.get(0);
                obj3.getClass();
                Object cachedActivityItem = ((ActivityDataBridge) ziplineService).setCachedActivityItem((ByteString) obj3, zzmoVar);
                if (cachedActivityItem != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object nativeQueryToken = ((ActivityDataBridge) ziplineService).setNativeQueryToken((String) list.get(0), zzmoVar);
                if (nativeQueryToken != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                break;
            case 6:
                Object obj4 = list.get(0);
                obj4.getClass();
                break;
            case 7:
                Object obj5 = list.get(0);
                obj5.getClass();
                break;
            case 8:
                break;
            case 9:
                Object obj6 = list.get(0);
                obj6.getClass();
                break;
            case 10:
                Object obj7 = list.get(0);
                obj7.getClass();
                break;
            case 11:
                Object obj8 = list.get(0);
                obj8.getClass();
                Object obj9 = list.get(1);
                obj9.getClass();
                break;
            case 12:
                Object obj10 = list.get(0);
                obj10.getClass();
                Object cachedActivityItem2 = ((ActivityDataBridge) ziplineService).setCachedActivityItem((SerializableActivityItem) obj10, zzmoVar);
                if (cachedActivityItem2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object obj11 = list.get(0);
                obj11.getClass();
                break;
            case 14:
                Object obj12 = list.get(0);
                obj12.getClass();
                ByteString byteString = (ByteString) obj12;
                Object obj13 = list.get(1);
                obj13.getClass();
                Object obj14 = list.get(2);
                obj14.getClass();
                Object cachedActivityItemFromInitiatePaymentRequest = ((ActivityDataBridge) ziplineService).setCachedActivityItemFromInitiatePaymentRequest(byteString, (String) obj13, ((Long) obj14).longValue(), zzmoVar);
                if (cachedActivityItemFromInitiatePaymentRequest != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object obj15 = list.get(0);
                obj15.getClass();
                Object obj16 = list.get(1);
                obj16.getClass();
                Object cachedActivityItemFromTransferFundsRequest = ((ActivityDataBridge) ziplineService).setCachedActivityItemFromTransferFundsRequest((ByteString) obj15, ((Long) obj16).longValue(), zzmoVar);
                if (cachedActivityItemFromTransferFundsRequest != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object obj17 = list.get(0);
                obj17.getClass();
                break;
            case 17:
                Object obj18 = list.get(0);
                obj18.getClass();
                break;
            case 18:
                Object obj19 = list.get(0);
                obj19.getClass();
                Object obj20 = list.get(1);
                obj20.getClass();
                break;
            case 19:
                Object obj21 = list.get(0);
                obj21.getClass();
                Object nativeActivityFlowToken = ((ActivityDataBridge) ziplineService).setNativeActivityFlowToken((String) obj21, zzmoVar);
                if (nativeActivityFlowToken != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object nativeSearchFlowToken = ((ActivityDataBridge) ziplineService).setNativeSearchFlowToken((String) list.get(0), zzmoVar);
                if (nativeSearchFlowToken != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object obj22 = list.get(0);
                obj22.getClass();
                String str = (String) list.get(1);
                Object obj23 = list.get(2);
                obj23.getClass();
                Object addReaction = ((ActivityPaymentManager2) ziplineService).addReaction((String) obj22, str, (String) obj23, (String) list.get(3), zzmoVar);
                if (addReaction != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object obj24 = list.get(0);
                obj24.getClass();
                Object obj25 = list.get(1);
                obj25.getClass();
                Object refund = ((ActivityPaymentManager2) ziplineService).refund((String) obj24, (String) obj25, zzmoVar);
                if (refund != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object obj26 = list.get(0);
                obj26.getClass();
                Object obj27 = list.get(1);
                obj27.getClass();
                Object reportAbuse = ((ActivityPaymentManager2) ziplineService).reportAbuse((String) obj26, (String) obj27, zzmoVar);
                if (reportAbuse != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object obj28 = list.get(0);
                obj28.getClass();
                Object obj29 = list.get(1);
                obj29.getClass();
                Object unreportAbuse = ((ActivityPaymentManager2) ziplineService).unreportAbuse((String) obj28, (String) obj29, zzmoVar);
                if (unreportAbuse != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object obj30 = list.get(0);
                obj30.getClass();
                Object obj31 = list.get(1);
                obj31.getClass();
                Object reportAbuse2 = ((ActivityPaymentManager2) ziplineService).reportAbuse((String) obj30, (String) obj31, (String) list.get(2), (String) list.get(3), (String) list.get(4), zzmoVar);
                if (reportAbuse2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object obj32 = list.get(0);
                obj32.getClass();
                Object obj33 = list.get(1);
                obj33.getClass();
                Object unreportAbuse2 = ((ActivityPaymentManager2) ziplineService).unreportAbuse((String) obj32, (String) obj33, (String) list.get(2), (String) list.get(3), (String) list.get(4), zzmoVar);
                if (unreportAbuse2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object obj34 = list.get(0);
                obj34.getClass();
                Object obj35 = list.get(1);
                obj35.getClass();
                Object obj36 = list.get(2);
                obj36.getClass();
                Object completeClientScenario = ((ActivityPaymentManager2) ziplineService).completeClientScenario((String) obj34, (String) obj35, (String) obj36, zzmoVar);
                if (completeClientScenario != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object obj37 = list.get(0);
                obj37.getClass();
                Object obj38 = list.get(1);
                obj38.getClass();
                Object checkStatus = ((ActivityPaymentManager2) ziplineService).checkStatus((String) obj37, (ByteString) obj38, (String) list.get(2), zzmoVar);
                if (checkStatus != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object obj39 = list.get(0);
                obj39.getClass();
                Object obj40 = list.get(1);
                obj40.getClass();
                Object obj41 = list.get(2);
                obj41.getClass();
                Object reverseDeposit = ((ActivityPaymentManager2) ziplineService).reverseDeposit((ClientRouteUrl) obj40, (String) obj39, (String) obj41, zzmoVar);
                if (reverseDeposit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
