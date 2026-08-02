package com.squareup.cash.sheet;

import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class SheetStateKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UserDismissMode f$0;

    public /* synthetic */ SheetStateKt$$ExternalSyntheticLambda0(UserDismissMode userDismissMode, int i) {
        this.$r8$classId = i;
        this.f$0 = userDismissMode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        UserDismissMode userDismissMode = this.f$0;
        switch (i) {
            case 0:
                return new RealSheetState((SheetPosition) null, userDismissMode, 1);
            default:
                return new RealSheetState((SheetPosition) null, userDismissMode, 5);
        }
    }
}
