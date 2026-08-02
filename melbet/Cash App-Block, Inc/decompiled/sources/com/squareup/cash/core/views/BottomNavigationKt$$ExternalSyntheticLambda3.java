package com.squareup.cash.core.views;

import com.squareup.cash.core.navigationcontainer.models.MainScreensViewModel$Tab;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class BottomNavigationKt$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ MainScreensViewModel$Tab f$1;

    public /* synthetic */ BottomNavigationKt$$ExternalSyntheticLambda3(Function1 function1, MainScreensViewModel$Tab mainScreensViewModel$Tab, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = mainScreensViewModel$Tab;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MainScreensViewModel$Tab mainScreensViewModel$Tab = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(mainScreensViewModel$Tab.clickEvent);
                break;
            default:
                function1.invoke(mainScreensViewModel$Tab.clickEvent);
                break;
        }
        return Unit.INSTANCE;
    }
}
