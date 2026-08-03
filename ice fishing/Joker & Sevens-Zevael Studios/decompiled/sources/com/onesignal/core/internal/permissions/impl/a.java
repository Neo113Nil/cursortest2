package com.onesignal.core.internal.permissions.impl;

import android.app.Activity;
import android.content.Intent;
import b9.e;
import b9.f;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.HashMap;
import pc.j;
import q8.d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements f {
    private final q8.f _application;
    private final HashMap<String, e> callbackMap;
    private boolean fallbackToSettings;
    private boolean shouldShowRequestPermissionRationaleBeforeRequest;
    private boolean waiting;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.core.internal.permissions.impl.a$a, reason: collision with other inner class name */
    public static final class C0019a implements d {
        final /* synthetic */ String $androidPermissionString;
        final /* synthetic */ Class<?> $callbackClass;
        final /* synthetic */ String $permissionRequestType;

        public C0019a(String str, String str2, Class<?> cls) {
            this.$permissionRequestType = str;
            this.$androidPermissionString = str2;
            this.$callbackClass = cls;
        }

        @Override // q8.d
        public void onActivityAvailable(Activity activity) {
            j.e(activity, "activity");
            if (activity.getClass().equals(PermissionsActivity.class)) {
                a.this._application.removeActivityLifecycleHandler(this);
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) PermissionsActivity.class);
            intent.setFlags(131072);
            intent.putExtra(PermissionsActivity.INTENT_EXTRA_PERMISSION_TYPE, this.$permissionRequestType).putExtra(PermissionsActivity.INTENT_EXTRA_ANDROID_PERMISSION_STRING, this.$androidPermissionString).putExtra(PermissionsActivity.INTENT_EXTRA_CALLBACK_CLASS, this.$callbackClass.getName());
            activity.startActivity(intent);
            activity.overridePendingTransition(o8.a.onesignal_fade_in, o8.a.onesignal_fade_out);
        }

        @Override // q8.d
        public void onActivityStopped(Activity activity) {
            j.e(activity, "activity");
        }
    }

    public a(q8.f fVar) {
        j.e(fVar, "_application");
        this._application = fVar;
        this.callbackMap = new HashMap<>();
    }

    public final e getCallback(String str) {
        j.e(str, "permissionType");
        return this.callbackMap.get(str);
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

    @Override // b9.f
    public void registerAsCallback(String str, e eVar) {
        j.e(str, "permissionType");
        j.e(eVar, "callback");
        this.callbackMap.put(str, eVar);
    }

    public final void setFallbackToSettings(boolean z10) {
        this.fallbackToSettings = z10;
    }

    public final void setShouldShowRequestPermissionRationaleBeforeRequest(boolean z10) {
        this.shouldShowRequestPermissionRationaleBeforeRequest = z10;
    }

    public final void setWaiting(boolean z10) {
        this.waiting = z10;
    }

    @Override // b9.f
    public void startPrompt(boolean z10, String str, String str2, Class<?> cls) {
        j.e(cls, "callbackClass");
        if (this.waiting) {
            return;
        }
        this.fallbackToSettings = z10;
        this._application.addActivityLifecycleHandler(new C0019a(str, str2, cls));
    }
}
