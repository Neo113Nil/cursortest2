package com.squareup.cash.permissions;

import android.content.Context;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.graphics.swampgl.components.Camera$special$$inlined$map$1;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$1$5;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.preferences.KeyValue;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes.dex */
public final class AndroidPermissionChecker implements PermissionChecker {
    public final KeyValue contactsPermissionPromptResponded;
    public final Context context;
    public final SharedFlowImpl refresh = FlowKt.MutableSharedFlow$default(0, 50, null, 5);
    public final SharedFlowImpl grants = FlowKt.MutableSharedFlow$default(0, 50, null, 5);
    public final SharedFlowImpl denials = FlowKt.MutableSharedFlow$default(0, 50, null, 5);

    public AndroidPermissionChecker(Context context, KeyValue keyValue) {
        this.context = context;
        this.contactsPermissionPromptResponded = keyValue;
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final boolean checkPermission(String str) {
        str.getClass();
        return Strings.checkSelfPermission(this.context, str) == 0;
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final ReadOnlyPermissions create(final String str) {
        return new ReadOnlyPermissions() { // from class: com.squareup.cash.permissions.AndroidPermissionChecker$create$1
            @Override // com.squareup.cash.permissions.ReadOnlyPermissions
            public final boolean check() {
                return AndroidPermissionChecker.this.checkPermission(str);
            }

            @Override // com.squareup.cash.permissions.ReadOnlyPermissions
            public final Flow denied() {
                return new NullStateSwipeConfigProvider(new AndroidPermissionChecker$create$1$denied$$inlined$filter$1(AndroidPermissionChecker.this.denials, str, 0), 7);
            }

            @Override // com.squareup.cash.permissions.ReadOnlyPermissions
            public final Flow granted() {
                return AndroidPermissionChecker.this.granted(new String[]{str});
            }
        };
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final Flow denials() {
        return this.denials;
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final Flow granted(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (checkPermission(str)) {
                arrayList.add(str);
            }
        }
        return arrayList.size() == strArr.length ? new AppLockMonitor$special$$inlined$map$2(Boolean.TRUE, 19) : new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealTabProvider$setup$1$5(1), FlowKt.take(new Camera$special$$inlined$map$1(FlowKt.merge(new AndroidPermissionChecker$granted$$inlined$map$1(this.grants, strArr, 0), new RealActivityInvitePresenter(27, this.refresh, strArr, this)), 3), 1));
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final boolean hasBackgroundLocation() {
        return checkPermission("android.permission.ACCESS_BACKGROUND_LOCATION");
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final boolean hasContacts() {
        return checkPermission("android.permission.READ_CONTACTS");
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final boolean hasLocation() {
        return checkPermission("android.permission.ACCESS_COARSE_LOCATION") || checkPermission("android.permission.ACCESS_FINE_LOCATION");
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final boolean hasProfile() {
        return checkPermission("android.permission.READ_CONTACTS");
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final boolean hasVibrate() {
        return checkPermission("android.permission.VIBRATE");
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final void requestPermissionsResult(String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (Intrinsics.areEqual(strArr[i], "android.permission.READ_CONTACTS")) {
                this.contactsPermissionPromptResponded.blockingSet(Boolean.TRUE);
            }
            int i2 = iArr[i];
            if (i2 == 0) {
                StateFlowKt.emitOrThrow(this.grants, strArr[i]);
            } else if (i2 == -1) {
                StateFlowKt.emitOrThrow(this.denials, strArr[i]);
            }
        }
    }

    @Override // com.squareup.cash.permissions.PermissionChecker
    public final void triggerRefresh() {
        StateFlowKt.emitOrThrow(this.refresh, Unit.INSTANCE);
    }
}
