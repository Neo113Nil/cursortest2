package com.squareup.cash.sheet;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes7.dex */
public final /* synthetic */ class SheetKt$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CoroutineScope f$0;
    public final /* synthetic */ RealSheetState f$1;

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda7(CoroutineScope coroutineScope, RealSheetState realSheetState, int i) {
        this.$r8$classId = i;
        this.f$0 = coroutineScope;
        this.f$1 = realSheetState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        RealSheetState realSheetState = this.f$1;
        CoroutineScope coroutineScope = this.f$0;
        switch (i) {
            case 0:
                JobKt.launch$default(coroutineScope, null, null, new RealSheetState$peek$3(realSheetState, null, 15), 3);
                break;
            case 1:
                JobKt.launch$default(coroutineScope, null, null, new RealSheetState$peek$3(realSheetState, null, 2), 3);
                break;
            case 2:
                JobKt.launch$default(coroutineScope, null, null, new RealSheetState$peek$3(realSheetState, null, 16), 3);
                break;
            default:
                JobKt.launch$default(coroutineScope, null, null, new RealSheetState$peek$3(realSheetState, null, 17), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
