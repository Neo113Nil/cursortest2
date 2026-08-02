package com.squareup.cash.pools.presenters;

import androidx.compose.runtime.Updater;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.pools.screens.PoolDetailsScreen;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.session.backend.SessionManager;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolDetailsPresenter$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ProfilePresenter f$0;

    public /* synthetic */ PoolDetailsPresenter$$ExternalSyntheticLambda0(ProfilePresenter profilePresenter, int i) {
        this.$r8$classId = i;
        this.f$0 = profilePresenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ProfilePresenter profilePresenter = this.f$0;
        switch (i) {
            case 0:
                return Updater.mutableStateOf$default(((PoolDetailsScreen) profilePresenter.paymentsInboundNavigator).pool);
            default:
                return PlatformKt.activeAccountTokenOrNull((SessionManager) profilePresenter.jurisdictionConfigManager);
        }
    }
}
