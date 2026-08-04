package com.gamericefishpro.space.fd;

import android.app.Activity;
import android.content.Intent;
import com.gamericefishpro.space.ed.e;
import com.gamericefishpro.space.ed.f;
import com.gamericefishpro.space.lc.d;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements f {
    private final com.gamericefishpro.space.lc.f _application;
    private final HashMap<String, e> callbackMap;
    private boolean fallbackToSettings;
    private boolean shouldShowRequestPermissionRationaleBeforeRequest;
    private boolean waiting;

    /* JADX INFO: renamed from: com.gamericefishpro.space.fd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0013a implements d {
        final /* synthetic */ String $androidPermissionString;
        final /* synthetic */ Class<?> $callbackClass;
        final /* synthetic */ String $permissionRequestType;

        public C0013a(String str, String str2, Class<?> cls) {
            this.$permissionRequestType = str;
            this.$androidPermissionString = str2;
            this.$callbackClass = cls;
        }

        @Override // com.gamericefishpro.space.lc.d
        public void onActivityAvailable(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (activity.getClass().equals(PermissionsActivity.class)) {
                a.this._application.removeActivityLifecycleHandler(this);
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) PermissionsActivity.class);
            intent.setFlags(131072);
            intent.putExtra(PermissionsActivity.INTENT_EXTRA_PERMISSION_TYPE, this.$permissionRequestType).putExtra(PermissionsActivity.INTENT_EXTRA_ANDROID_PERMISSION_STRING, this.$androidPermissionString).putExtra(PermissionsActivity.INTENT_EXTRA_CALLBACK_CLASS, this.$callbackClass.getName());
            activity.startActivity(intent);
            activity.overridePendingTransition(com.gamericefishpro.space.jc.a.onesignal_fade_in, com.gamericefishpro.space.jc.a.onesignal_fade_out);
        }

        @Override // com.gamericefishpro.space.lc.d
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public a(com.gamericefishpro.space.lc.f _application) {
        Intrinsics.checkNotNullParameter(_application, "_application");
        this._application = _application;
        this.callbackMap = new HashMap<>();
    }

    public final e getCallback(String permissionType) {
        Intrinsics.checkNotNullParameter(permissionType, "permissionType");
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

    @Override // com.gamericefishpro.space.ed.f
    public void registerAsCallback(String permissionType, e callback) {
        Intrinsics.checkNotNullParameter(permissionType, "permissionType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbackMap.put(permissionType, callback);
    }

    public final void setFallbackToSettings(boolean z) {
        this.fallbackToSettings = z;
    }

    public final void setShouldShowRequestPermissionRationaleBeforeRequest(boolean z) {
        this.shouldShowRequestPermissionRationaleBeforeRequest = z;
    }

    public final void setWaiting(boolean z) {
        this.waiting = z;
    }

    @Override // com.gamericefishpro.space.ed.f
    public void startPrompt(boolean z, String str, String str2, Class<?> callbackClass) {
        Intrinsics.checkNotNullParameter(callbackClass, "callbackClass");
        if (this.waiting) {
            return;
        }
        this.fallbackToSettings = z;
        this._application.addActivityLifecycleHandler(new C0013a(str, str2, callbackClass));
    }
}
