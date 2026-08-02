package com.squareup.cash.score.applets.views;

import app.cash.broadway.presenter.Presenter;
import com.squareup.cash.family.applets.viewmodels.AllowanceAppletTileViewEvent$AllowanceAppletOnClickTile;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.phoneplans.applets.viewmodels.PhonePlansAppletTileEvent$Click;
import com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewEvent$SavingsAppletOnClickTile;
import com.squareup.cash.score.applets.viewmodels.ScoreAppletTileViewEvent$Action;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class ScoreAppletViewsModule$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Presenter.Binding f$0;

    public /* synthetic */ ScoreAppletViewsModule$$ExternalSyntheticLambda1(Presenter.Binding binding, int i) {
        this.$r8$classId = i;
        this.f$0 = binding;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Presenter.Binding binding = this.f$0;
        switch (i) {
            case 0:
                ScoreAppletTileViewEvent$Action scoreAppletTileViewEvent$Action = (ScoreAppletTileViewEvent$Action) obj;
                scoreAppletTileViewEvent$Action.getClass();
                binding.sendEvent(scoreAppletTileViewEvent$Action);
                break;
            case 1:
                AllowanceAppletTileViewEvent$AllowanceAppletOnClickTile allowanceAppletTileViewEvent$AllowanceAppletOnClickTile = (AllowanceAppletTileViewEvent$AllowanceAppletOnClickTile) obj;
                allowanceAppletTileViewEvent$AllowanceAppletOnClickTile.getClass();
                binding.sendEvent(allowanceAppletTileViewEvent$AllowanceAppletOnClickTile);
                break;
            case 2:
                ItemId itemId = (ItemId) obj;
                itemId.getClass();
                binding.sendEvent(new PhonePlansAppletTileEvent$Click(itemId));
                break;
            default:
                binding.sendEvent(SavingsAppletTileViewEvent$SavingsAppletOnClickTile.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
