package com.squareup.cash.pools.views;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import com.squareup.cash.pools.viewmodels.PoolInvitePeopleListViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolInvitePeopleListViewKt$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Ref$ObjectRef f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ PoolInvitePeopleListViewKt$$ExternalSyntheticLambda6(Ref$ObjectRef ref$ObjectRef, Function1 function1) {
        this.$r8$classId = 0;
        this.f$0 = ref$ObjectRef;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Ref$ObjectRef ref$ObjectRef = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                TextFieldStateKt.clearText((TextFieldState) ref$ObjectRef.element);
                function1.invoke(new PoolInvitePeopleListViewEvent.SearchTermChanged(""));
                break;
            case 1:
                function1.invoke(ref$ObjectRef.element);
                break;
            default:
                function1.invoke(ref$ObjectRef.element);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PoolInvitePeopleListViewKt$$ExternalSyntheticLambda6(Function1 function1, Ref$ObjectRef ref$ObjectRef, int i) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$0 = ref$ObjectRef;
    }
}
