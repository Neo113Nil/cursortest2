package androidx.compose.foundation.text;

import android.os.Bundle;
import com.squareup.cash.core.navigationcontainer.ScreenLifecycle;
import com.squareup.cash.core.navigationcontainer.UiContainerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes.dex */
public final /* synthetic */ class BasicTextFieldKt$$ExternalSyntheticLambda10 implements Function0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BasicTextFieldKt$$ExternalSyntheticLambda10(ScreenLifecycle screenLifecycle, boolean z) {
        this.f$1 = screenLifecycle;
        this.f$0 = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        boolean z = this.f$0;
        Object obj = this.f$1;
        switch (i) {
            case 0:
                MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) obj;
                if (z) {
                    mutableSharedFlow.tryEmit(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            default:
                ScreenLifecycle screenLifecycle = (ScreenLifecycle) obj;
                Bundle bundle = new Bundle();
                screenLifecycle.getClass();
                screenLifecycle.savedStateRegistryController.performSave(bundle);
                return UiContainerKt.validate(bundle, z);
        }
    }

    public /* synthetic */ BasicTextFieldKt$$ExternalSyntheticLambda10(boolean z, MutableSharedFlow mutableSharedFlow) {
        this.f$0 = z;
        this.f$1 = mutableSharedFlow;
    }
}
