package com.squareup.cash.permissions;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public interface ModifiablePermissions extends ReadOnlyPermissions {
    void request();

    Object shouldShowOverridePrompt(ContinuationImpl continuationImpl);

    Object shouldShowRequestPermissionRationale(ContinuationImpl continuationImpl);
}
