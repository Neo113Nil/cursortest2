package androidx.compose.foundation.text.selection;

import app.cash.api.ApiResult;
import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.inquiry.selfie.CaptureState;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes3.dex */
public final /* synthetic */ class SelectionLayoutKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Ref$BooleanRef f$0;

    public /* synthetic */ SelectionLayoutKt$$ExternalSyntheticLambda0(Ref$BooleanRef ref$BooleanRef, int i) {
        this.$r8$classId = i;
        this.f$0 = ref$BooleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Ref$BooleanRef ref$BooleanRef = this.f$0;
        switch (i) {
            case 0:
                if (((SelectableInfo) obj).textLayoutResult.layoutInput.text.text.length() > 0) {
                    ref$BooleanRef.element = false;
                }
                break;
            case 1:
                ApiResult apiResult = (ApiResult) obj;
                apiResult.getClass();
                if (apiResult instanceof ApiResult.Success) {
                    ref$BooleanRef.element = true;
                }
                break;
            default:
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                WorkflowState workflowState = (SelfieState) updater.state;
                if ((workflowState instanceof CaptureState) && ((CaptureState) workflowState).getManualCaptureEnabled()) {
                    updater.state = workflowState;
                    ref$BooleanRef.element = false;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
