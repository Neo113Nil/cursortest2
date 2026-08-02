package com.squareup.cash.permissions;

import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public interface PermissionChecker {
    boolean checkPermission(String str);

    ReadOnlyPermissions create(String str);

    Flow denials();

    default Flow granted(String str) {
        return granted(new String[]{str});
    }

    Flow granted(String[] strArr);

    boolean hasBackgroundLocation();

    boolean hasContacts();

    boolean hasLocation();

    boolean hasProfile();

    boolean hasVibrate();

    void requestPermissionsResult(String[] strArr, int[] iArr);

    void triggerRefresh();
}
