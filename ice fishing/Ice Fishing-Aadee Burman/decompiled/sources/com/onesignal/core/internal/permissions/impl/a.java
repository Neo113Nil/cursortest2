package com.onesignal.core.internal.permissions.impl;

import android.app.Activity;
import android.content.Intent;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.core.internal.permissions.g;
import java.util.HashMap;
import kotlin.jvm.internal.h;
import w4.C5151a;
import x4.d;
import x4.f;

/* loaded from: classes2.dex */
public final class a implements g {
    private final f _application;
    private final HashMap<String, com.onesignal.core.internal.permissions.f> callbackMap;
    private boolean fallbackToSettings;
    private boolean shouldShowRequestPermissionRationaleBeforeRequest;
    private boolean waiting;

    /* renamed from: com.onesignal.core.internal.permissions.impl.a$a, reason: collision with other inner class name */
    public static final class C0193a implements d {
        final /* synthetic */ String $androidPermissionString;
        final /* synthetic */ Class<?> $callbackClass;
        final /* synthetic */ String $permissionRequestType;

        public C0193a(String str, String str2, Class<?> cls) {
            this.$permissionRequestType = str;
            this.$androidPermissionString = str2;
            this.$callbackClass = cls;
        }

        @Override // x4.d
        public void onActivityAvailable(Activity activity) {
            h.e(activity, "activity");
            if (activity.getClass().equals(PermissionsActivity.class)) {
                a.this._application.removeActivityLifecycleHandler(this);
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) PermissionsActivity.class);
            intent.setFlags(131072);
            intent.putExtra(com.onesignal.core.internal.permissions.h.INTENT_EXTRA_PERMISSION_TYPE, this.$permissionRequestType).putExtra(com.onesignal.core.internal.permissions.h.INTENT_EXTRA_ANDROID_PERMISSION_STRING, this.$androidPermissionString).putExtra(com.onesignal.core.internal.permissions.h.INTENT_EXTRA_CALLBACK_CLASS, this.$callbackClass.getName());
            activity.startActivity(intent);
            activity.overridePendingTransition(C5151a.onesignal_fade_in, C5151a.onesignal_fade_out);
        }

        @Override // x4.d
        public void onActivityStopped(Activity activity) {
            h.e(activity, "activity");
        }
    }

    public a(f _application) {
        h.e(_application, "_application");
        this._application = _application;
        this.callbackMap = new HashMap<>();
    }

    public final com.onesignal.core.internal.permissions.f getCallback(String permissionType) {
        h.e(permissionType, "permissionType");
        return this.callbackMap.get(permissionType);
    }

    public final boolean getFallbackToSettings() {
        return this.fallbackToSettings;
    }

    public final boolean getShouldShowRequestPermissionRationaleBeforeRequest() {
        return this.shouldShowRequestPermissionRationaleBeforeRequest;
    }

    public final boolean getWaiting() {
        return this.waiting;
    }

    @Override // com.onesignal.core.internal.permissions.g
    public void registerAsCallback(String permissionType, com.onesignal.core.internal.permissions.f callback) {
        h.e(permissionType, "permissionType");
        h.e(callback, "callback");
        this.callbackMap.put(permissionType, callback);
    }

    public final void setFallbackToSettings(boolean z3) {
        this.fallbackToSettings = z3;
    }

    public final void setShouldShowRequestPermissionRationaleBeforeRequest(boolean z3) {
        this.shouldShowRequestPermissionRationaleBeforeRequest = z3;
    }

    public final void setWaiting(boolean z3) {
        this.waiting = z3;
    }

    @Override // com.onesignal.core.internal.permissions.g
    public void startPrompt(boolean z3, String str, String str2, Class<?> callbackClass) {
        h.e(callbackClass, "callbackClass");
        if (this.waiting) {
            return;
        }
        this.fallbackToSettings = z3;
        this._application.addActivityLifecycleHandler(new C0193a(str, str2, callbackClass));
    }
}
