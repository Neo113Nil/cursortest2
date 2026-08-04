package com.onesignal.core.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.appsflyer.internal.d;
import com.gamericefishpro.space.ed.e;
import com.gamericefishpro.space.gd.b;
import com.gamericefishpro.space.xb.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class PermissionsActivity extends Activity {
    public static final a Companion = new a(null);
    public static final int DELAY_TIME_CALLBACK_CALL = 500;
    public static final String INTENT_EXTRA_ANDROID_PERMISSION_STRING = "INTENT_EXTRA_ANDROID_PERMISSION_STRING";
    public static final String INTENT_EXTRA_CALLBACK_CLASS = "INTENT_EXTRA_CALLBACK_CLASS";
    public static final String INTENT_EXTRA_PERMISSION_TYPE = "INTENT_EXTRA_PERMISSION_TYPE";
    public static final int ONESIGNAL_PERMISSION_REQUEST_CODE = 2;
    private String permissionRequestType;
    private b preferenceService;
    private com.gamericefishpro.space.fd.a requestPermissionService;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void finishActivity() {
        finish();
        overridePendingTransition(com.gamericefishpro.space.jc.a.onesignal_fade_in, com.gamericefishpro.space.jc.a.onesignal_fade_out);
    }

    private final void handleBundleParams(Bundle bundle) {
        reregisterCallbackHandlers(bundle);
        Intrinsics.b(bundle);
        this.permissionRequestType = bundle.getString(INTENT_EXTRA_PERMISSION_TYPE);
        String string = bundle.getString(INTENT_EXTRA_ANDROID_PERMISSION_STRING);
        Intrinsics.b(string);
        requestPermission(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRequestPermissionsResult$lambda$0(PermissionsActivity this$0, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(grantResults, "$grantResults");
        com.gamericefishpro.space.fd.a aVar = this$0.requestPermissionService;
        Intrinsics.b(aVar);
        String str = this$0.permissionRequestType;
        Intrinsics.b(str);
        e callback = aVar.getCallback(str);
        if (callback == null) {
            throw new RuntimeException("Missing handler for permissionRequestType: " + this$0.permissionRequestType);
        }
        if (permissions.length == 0) {
            callback.onReject(false);
            return;
        }
        String str2 = permissions[0];
        if (grantResults.length <= 0 || grantResults[0] != 0) {
            callback.onReject(this$0.shouldShowSettings(str2));
            return;
        }
        callback.onAccept();
        b bVar = this$0.preferenceService;
        Intrinsics.b(bVar);
        bVar.saveBool("OneSignal", "USER_RESOLVED_PERMISSION_" + str2, Boolean.TRUE);
    }

    private final void requestPermission(String str) {
        com.gamericefishpro.space.fd.a aVar = this.requestPermissionService;
        Intrinsics.b(aVar);
        if (aVar.getWaiting()) {
            return;
        }
        com.gamericefishpro.space.fd.a aVar2 = this.requestPermissionService;
        Intrinsics.b(aVar2);
        aVar2.setWaiting(true);
        com.gamericefishpro.space.fd.a aVar3 = this.requestPermissionService;
        Intrinsics.b(aVar3);
        aVar3.setShouldShowRequestPermissionRationaleBeforeRequest(com.gamericefishpro.space.r3.a.e(this, str));
        com.gamericefishpro.space.r3.a.d(this, new String[]{str}, 2);
    }

    private final void reregisterCallbackHandlers(Bundle bundle) {
        Intrinsics.b(bundle);
        String string = bundle.getString(INTENT_EXTRA_CALLBACK_CLASS);
        try {
            Class.forName(string);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException(com.gamericefishpro.space.m5.a.u("Could not find callback class for PermissionActivity: ", string));
        }
    }

    private final boolean shouldShowSettings(String str) {
        com.gamericefishpro.space.fd.a aVar = this.requestPermissionService;
        Intrinsics.b(aVar);
        if (!aVar.getFallbackToSettings()) {
            return false;
        }
        com.gamericefishpro.space.fd.a aVar2 = this.requestPermissionService;
        Intrinsics.b(aVar2);
        if (aVar2.getShouldShowRequestPermissionRationaleBeforeRequest() && !com.gamericefishpro.space.r3.a.e(this, str)) {
            b bVar = this.preferenceService;
            Intrinsics.b(bVar);
            bVar.saveBool("OneSignal", "USER_RESOLVED_PERMISSION_" + str, Boolean.TRUE);
            return false;
        }
        b bVar2 = this.preferenceService;
        Intrinsics.b(bVar2);
        Boolean bool = bVar2.getBool("OneSignal", "USER_RESOLVED_PERMISSION_" + str, Boolean.FALSE);
        Intrinsics.b(bool);
        return bool.booleanValue();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!c.b(this)) {
            finishActivity();
        } else {
            if (getIntent().getExtras() == null) {
                finishActivity();
                return;
            }
            this.requestPermissionService = (com.gamericefishpro.space.fd.a) c.a().getService(com.gamericefishpro.space.fd.a.class);
            this.preferenceService = (b) c.a().getService(b.class);
            handleBundleParams(getIntent().getExtras());
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        handleBundleParams(intent.getExtras());
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        com.gamericefishpro.space.fd.a aVar = this.requestPermissionService;
        Intrinsics.b(aVar);
        aVar.setWaiting(false);
        if (i == 2) {
            new Handler().postDelayed(new d(this, permissions, grantResults, 4), 500L);
        }
        finishActivity();
    }
}
