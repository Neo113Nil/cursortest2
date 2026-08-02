package com.squareup.cash.permissions;

import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public interface ReadOnlyPermissions {
    boolean check();

    Flow denied();

    Flow granted();
}
