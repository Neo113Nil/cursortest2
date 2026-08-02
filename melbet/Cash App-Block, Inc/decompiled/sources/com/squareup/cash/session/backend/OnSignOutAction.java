package com.squareup.cash.session.backend;

import com.squareup.cash.session.backend.SessionManager;

/* loaded from: classes.dex */
public interface OnSignOutAction {
    Object clearData(SessionManager.DeletionMode deletionMode, RealOnSessionChangeActionsExecutor$executeSignOut$1 realOnSessionChangeActionsExecutor$executeSignOut$1);
}
