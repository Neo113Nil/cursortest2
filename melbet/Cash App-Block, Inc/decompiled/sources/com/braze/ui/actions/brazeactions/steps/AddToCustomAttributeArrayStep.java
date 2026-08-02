package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/AddToCustomAttributeArrayStep;", "Lcom/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep;", "<init>", "()V", "isValid", "", "data", "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "run", "", "context", "Landroid/content/Context;", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddToCustomAttributeArrayStep extends BaseBrazeActionStep {
    public static final AddToCustomAttributeArrayStep INSTANCE = new AddToCustomAttributeArrayStep();

    private AddToCustomAttributeArrayStep() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$0(String str, String str2, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.addToCustomAttributeArray(str, str2);
        return Unit.INSTANCE;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData data) {
        data.getClass();
        return StepData.isArgCountInBounds$default(data, 2, null, 2, null) && data.isArgString(0) && data.isArgString(1);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData data) {
        context.getClass();
        data.getClass();
        BaseBrazeActionStep.INSTANCE.runOnUser$android_sdk_ui_release(Braze.INSTANCE.getInstance(context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(String.valueOf(data.getFirstArg()), String.valueOf(data.getSecondArg()), 6));
    }
}
