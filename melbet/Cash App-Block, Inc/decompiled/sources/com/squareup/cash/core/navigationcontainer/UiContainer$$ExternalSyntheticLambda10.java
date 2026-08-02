package com.squareup.cash.core.navigationcontainer;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class UiContainer$$ExternalSyntheticLambda10 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UiContainer f$0;

    public /* synthetic */ UiContainer$$ExternalSyntheticLambda10(UiContainer uiContainer, int i) {
        this.$r8$classId = i;
        this.f$0 = uiContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        UiContainer uiContainer = this.f$0;
        switch (i) {
            case 0:
                uiContainer.setWindowFlagsDirty(true);
                break;
            case 1:
                uiContainer.setWindowFlagsDirty(true);
                break;
            case 2:
                uiContainer.setWindowFlagsDirty(true);
                break;
            case 3:
                uiContainer.setWindowFlagsDirty(true);
                break;
            case 4:
                uiContainer.setWindowFlagsDirty(true);
                break;
            case 5:
                uiContainer.setWindowFlagsDirty(false);
                uiContainer.updateWindowFlags.invoke();
                break;
            case 6:
                uiContainer.setWindowFlagsDirty(true);
                break;
            default:
                uiContainer.setWindowFlagsDirty(true);
                break;
        }
        return Unit.INSTANCE;
    }
}
