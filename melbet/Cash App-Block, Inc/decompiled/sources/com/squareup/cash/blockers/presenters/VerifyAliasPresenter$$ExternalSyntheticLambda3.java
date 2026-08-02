package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.presenters.VerifyAliasPresenter;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class VerifyAliasPresenter$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ VerifyAliasPresenter f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ VerifyAliasPresenter$$ExternalSyntheticLambda3(VerifyAliasPresenter verifyAliasPresenter, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = verifyAliasPresenter;
        this.f$1 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        VerifyAliasPresenter verifyAliasPresenter = this.f$0;
        VerifyAliasPresenter.State state = (VerifyAliasPresenter.State) obj;
        switch (i) {
            case 0:
                state.getClass();
                return VerifyAliasPresenter.State.copy$default(verifyAliasPresenter.initialState, this.f$1, false, false, null, false, 0, 62);
            case 1:
                state.getClass();
                return VerifyAliasPresenter.State.copy$default(verifyAliasPresenter.initialState, this.f$1, false, true, null, true, 0, 42);
            case 2:
                state.getClass();
                return VerifyAliasPresenter.State.copy$default(verifyAliasPresenter.initialState, this.f$1, false, true, null, true, 0, 42);
            default:
                state.getClass();
                return VerifyAliasPresenter.State.copy$default(verifyAliasPresenter.initialState, this.f$1, false, true, null, false, 0, 58);
        }
    }
}
