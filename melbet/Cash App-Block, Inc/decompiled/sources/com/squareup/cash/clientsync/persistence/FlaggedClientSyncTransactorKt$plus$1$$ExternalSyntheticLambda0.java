package com.squareup.cash.clientsync.persistence;

import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class FlaggedClientSyncTransactorKt$plus$1$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ClientSyncTransactor f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ FlaggedClientSyncTransactorKt$plus$1$$ExternalSyntheticLambda0(ClientSyncTransactor clientSyncTransactor, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = clientSyncTransactor;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        ClientSyncTransactor clientSyncTransactor = this.f$0;
        switch (i) {
            case 0:
                return clientSyncTransactor.transactionWithResult(new SsnViewKt$$ExternalSyntheticLambda1(28, function1));
            default:
                clientSyncTransactor.transaction(new SsnViewKt$$ExternalSyntheticLambda1(29, function1));
                return Unit.INSTANCE;
        }
    }
}
