package com.squareup.cash.money.applets.common.presenters;

import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.money.applets.sections.RealPromotedAppletTileStore;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.retro.views.RetroUiFactory;
import okhttp3.ConnectionPool;

/* loaded from: classes.dex */
public final class PromotedAppletTilePresenter$Factory$Impl {
    public final ConnectionPool delegateFactory;

    public PromotedAppletTilePresenter$Factory$Impl(ConnectionPool connectionPool) {
        this.delegateFactory = connectionPool;
    }

    public final VerifyCheckDialogPresenter create(AppletId appletId) {
        appletId.getClass();
        return new VerifyCheckDialogPresenter((RealPromotedAppletTileStore) ((RetroUiFactory.MetroFactory) this.delegateFactory.delegate).invoke(), appletId);
    }
}
