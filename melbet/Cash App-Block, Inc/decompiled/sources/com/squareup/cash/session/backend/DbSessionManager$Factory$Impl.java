package com.squareup.cash.session.backend;

import app.cash.local.worker.LocalActivitySetupTeardown;

/* loaded from: classes.dex */
public final class DbSessionManager$Factory$Impl {
    public final LocalActivitySetupTeardown.MetroFactory delegateFactory;

    public DbSessionManager$Factory$Impl(LocalActivitySetupTeardown.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }
}
