package com.squareup.cash.sheet;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.BufferedChannel;

/* loaded from: classes7.dex */
public final /* synthetic */ class RealSheetState$ProcessQueuedNestedFlingsEffect$1$1$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BufferedChannel f$0;

    public /* synthetic */ RealSheetState$ProcessQueuedNestedFlingsEffect$1$1$$ExternalSyntheticLambda0(BufferedChannel bufferedChannel, int i) {
        this.$r8$classId = i;
        this.f$0 = bufferedChannel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        BufferedChannel bufferedChannel = this.f$0;
        Float f = (Float) obj;
        f.getClass();
        switch (i) {
            case 0:
                bufferedChannel.mo1159trySendJP2dKIU(f);
                break;
            default:
                bufferedChannel.mo1159trySendJP2dKIU(f);
                break;
        }
        return Unit.INSTANCE;
    }
}
