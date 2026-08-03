package com.onesignal.core.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import b9.e;
import c9.b;
import h8.d;
import pc.f;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class PermissionsActivity extends Activity {
    public static final a Companion = new a(null);
    public static final int DELAY_TIME_CALLBACK_CALL = 500;
    public static final String INTENT_EXTRA_ANDROID_PERMISSION_STRING = "INTENT_EXTRA_ANDROID_PERMISSION_STRING";
    public static final String INTENT_EXTRA_CALLBACK_CLASS = "INTENT_EXTRA_CALLBACK_CLASS";
    public static final String INTENT_EXTRA_PERMISSION_TYPE = "INTENT_EXTRA_PERMISSION_TYPE";
    public static final int ONESIGNAL_PERMISSION_REQUEST_CODE = 2;
    private String permissionRequestType;
    private b preferenceService;
    private com.onesignal.core.internal.permissions.impl.a requestPermissionService;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(f fVar) {
            this();
        }

        private a() {
        }
    }

    private final void handleBundleParams(Bundle bundle) {
        reregisterCallbackHandlers(bundle);
        j.b(bundle);
        this.permissionRequestType = bundle.getString(INTENT_EXTRA_PERMISSION_TYPE);
        String string = bundle.getString(INTENT_EXTRA_ANDROID_PERMISSION_STRING);
        j.b(string);
        requestPermission(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onRequestPermissionsResult$lambda-0, reason: not valid java name */
    public static final void m6onRequestPermissionsResult$lambda0(PermissionsActivity permissionsActivity, String[] strArr, int[] iArr) {
        j.e(permissionsActivity, "this$0");
        j.e(strArr, "$permissions");
        j.e(iArr, "$grantResults");
        com.onesignal.core.internal.permissions.impl.a aVar = permissionsActivity.requestPermissionService;
        j.b(aVar);
        String str = permissionsActivity.permissionRequestType;
        j.b(str);
        e callback = aVar.getCallback(str);
        if (callback == null) {
            throw new RuntimeException("Missing handler for permissionRequestType: " + permissionsActivity.permissionRequestType);
        }
        if (strArr.length == 0) {
            callback.onReject(false);
            return;
        }
        String str2 = strArr[0];
        if (iArr.length <= 0 || iArr[0] != 0) {
            callback.onReject(permissionsActivity.shouldShowSettings(str2));
            return;
        }
        callback.onAccept();
        b bVar = permissionsActivity.preferenceService;
        j.b(bVar);
        bVar.saveBool("OneSignal", "USER_RESOLVED_PERMISSION_" + str2, Boolean.TRUE);
    }

    private final void requestPermission(String str) {
        com.onesignal.core.internal.permissions.impl.a aVar = this.requestPermissionService;
        j.b(aVar);
        if (aVar.getWaiting()) {
            return;
        }
        com.onesignal.core.internal.permissions.impl.a aVar2 = this.requestPermissionService;
        j.b(aVar2);
        aVar2.setWaiting(true);
        com.onesignal.core.internal.permissions.impl.a aVar3 = this.requestPermissionService;
        j.b(aVar3);
        aVar3.setShouldShowRequestPermissionRationaleBeforeRequest(x2.a.c(this, str));
        x2.a.b(this, new String[]{str}, 2);
    }

    private final void reregisterCallbackHandlers(Bundle bundle) {
        j.b(bundle);
        String string = bundle.getString(INTENT_EXTRA_CALLBACK_CLASS);
        try {
            Class.forName(string);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Could not find callback class for PermissionActivity: " + string);
        }
    }

    private final boolean shouldShowSettings(String str) {
        com.onesignal.core.internal.permissions.impl.a aVar = this.requestPermissionService;
        j.b(aVar);
        if (!aVar.getFallbackToSettings()) {
            return false;
        }
        com.onesignal.core.internal.permissions.impl.a aVar2 = this.requestPermissionService;
        j.b(aVar2);
        if (aVar2.getShouldShowRequestPermissionRationaleBeforeRequest() && !x2.a.c(this, str)) {
            b bVar = this.preferenceService;
            j.b(bVar);
            bVar.saveBool("OneSignal", "USER_RESOLVED_PERMISSION_" + str, Boolean.TRUE);
            return false;
        }
        b bVar2 = this.preferenceService;
        j.b(bVar2);
        Boolean bool = bVar2.getBool("OneSignal", "USER_RESOLVED_PERMISSION_" + str, Boolean.FALSE);
        j.b(bool);
        return bool.booleanValue();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (d.b(this)) {
            this.requestPermissionService = (com.onesignal.core.internal.permissions.impl.a) d.a().getService(com.onesignal.core.internal.permissions.impl.a.class);
            this.preferenceService = (b) d.a().getService(b.class);
            handleBundleParams(getIntent().getExtras());
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        j.e(intent, "intent");
        super.onNewIntent(intent);
        handleBundleParams(intent.getExtras());
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        j.e(strArr, "permissions");
        j.e(iArr, "grantResults");
        com.onesignal.core.internal.permissions.impl.a aVar = this.requestPermissionService;
        j.b(aVar);
        aVar.setWaiting(false);
        if (i10 == 2) {
            new Handler().postDelayed(new b6.a(this, strArr, iArr, 3), 500L);
        }
        finish();
        overridePendingTransition(o8.a.onesignal_fade_in, o8.a.onesignal_fade_out);
    }
}
