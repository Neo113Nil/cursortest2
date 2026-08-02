package com.squareup.cash.permissions;

import android.app.Activity;
import com.squareup.cash.util.clock.AndroidClock;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class AndroidPermissionManager implements PermissionChecker {
    public static final String[] REQUEST_CAMERA = {"android.permission.CAMERA"};
    public static final String[] REQUEST_LOCATION = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    public final Activity activity;
    public final AndroidClock clock;
    public final PermissionChecker permissionChecker;

    public AndroidPermissionManager(PermissionChecker permissionChecker, Activity activity, AndroidClock androidClock) {
        this.permissionChecker = permissionChecker;
        this.activity = activity;
        this.clock = androidClock;
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final boolean checkPermission(String str) {
        return this.permissionChecker.checkPermission(str);
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final AndroidPermissionManager$create$1 create(String str) {
        return new AndroidPermissionManager$create$1(this.permissionChecker.create(str), this, str);
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final Flow denials() {
        return this.permissionChecker.denials();
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final Flow granted(String str) {
        return this.permissionChecker.granted("android.permission.CAMERA");
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final boolean hasBackgroundLocation() {
        return this.permissionChecker.hasBackgroundLocation();
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final boolean hasContacts() {
        return this.permissionChecker.hasContacts();
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final boolean hasLocation() {
        return this.permissionChecker.hasLocation();
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final boolean hasProfile() {
        return this.permissionChecker.hasProfile();
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final boolean hasVibrate() {
        return this.permissionChecker.hasVibrate();
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final void requestPermissionsResult(String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        this.permissionChecker.requestPermissionsResult(strArr, iArr);
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final void triggerRefresh() {
        this.permissionChecker.triggerRefresh();
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final Flow granted(String[] strArr) {
        return this.permissionChecker.granted(strArr);
    }
}
