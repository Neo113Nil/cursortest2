package com.squareup.cash.app.api;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import com.squareup.cash.VariantSandboxedComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final /* synthetic */ class ContextKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function2 f$0;

    public /* synthetic */ ContextKt$$ExternalSyntheticLambda0(int i, Function2 function2) {
        this.$r8$classId = i;
        this.f$0 = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function2 function2 = this.f$0;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) obj;
                VariantSandboxedComponent variantSandboxedComponent = (VariantSandboxedComponent) obj2;
                coroutineScope.getClass();
                variantSandboxedComponent.getClass();
                function2.invoke(coroutineScope, variantSandboxedComponent);
                break;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    function2.invoke(gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    function2.invoke(gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    function2.invoke(gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    function2.invoke(gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
