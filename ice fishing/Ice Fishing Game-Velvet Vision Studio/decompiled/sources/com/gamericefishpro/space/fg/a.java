package com.gamericefishpro.space.fg;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.ui.m;
import com.gamericefishpro.space.vh.i;
import com.onesignal.common.AndroidUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final C0017a Companion = new C0017a(null);
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private final com.gamericefishpro.space.lc.f _applicationService;
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.vc.c _deviceService;

    /* JADX INFO: renamed from: com.gamericefishpro.space.fg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0017a {
        public /* synthetic */ C0017a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0017a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends i implements Function2 {
        int label;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(a aVar, DialogInterface dialogInterface, int i) {
            ((com.gamericefishpro.space.rc.a) aVar._configModelStore.getModel()).setUserRejectedGMSUpdate(true);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return a.this.new b(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((b) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            final Activity current = a.this._applicationService.getCurrent();
            if (current == null) {
                return Unit.a;
            }
            AndroidUtils androidUtils = AndroidUtils.INSTANCE;
            String resourceString = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
            String resourceString2 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_update", "Update");
            String resourceString3 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_skip", "Skip");
            String resourceString4 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_close", "Close");
            AlertDialog.Builder message = new AlertDialog.Builder(current).setMessage(resourceString);
            final a aVar2 = a.this;
            message.setPositiveButton(resourceString2, new DialogInterface.OnClickListener() { // from class: com.gamericefishpro.space.fg.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    a.access$openPlayStoreToApp(aVar2, current);
                }
            }).setNegativeButton(resourceString3, new com.gamericefishpro.space.ed.a(2, a.this)).setNeutralButton(resourceString4, (DialogInterface.OnClickListener) null).create().show();
            return Unit.a;
        }
    }

    public a(com.gamericefishpro.space.lc.f _applicationService, com.gamericefishpro.space.vc.c _deviceService, com.gamericefishpro.space.rc.b _configModelStore) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._applicationService = _applicationService;
        this._deviceService = _deviceService;
        this._configModelStore = _configModelStore;
    }

    public static final /* synthetic */ void access$openPlayStoreToApp(a aVar, Activity activity) {
        aVar.openPlayStoreToApp(activity);
    }

    private final boolean isGooglePlayStoreInstalled() {
        try {
            PackageManager packageManager = this._applicationService.getAppContext().getPackageManager();
            CharSequence charSequenceLoadLabel = packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager);
            Intrinsics.c(charSequenceLoadLabel, "null cannot be cast to non-null type kotlin.String");
            return !((String) charSequenceLoadLabel).equals("Market");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPlayStoreToApp(Activity activity) {
        try {
            com.gamericefishpro.space.s8.e eVar = com.gamericefishpro.space.s8.e.d;
            Intrinsics.checkNotNullExpressionValue(eVar, "getInstance(...)");
            PendingIntent activity2 = null;
            Intent intentA = eVar.a(eVar.b(this._applicationService.getAppContext(), com.gamericefishpro.space.s8.f.a), activity, null);
            if (intentA != null) {
                activity2 = PendingIntent.getActivity(activity, PLAY_SERVICES_RESOLUTION_REQUEST, intentA, 201326592);
            }
            if (activity2 != null) {
                activity2.send();
            }
        } catch (PendingIntent.CanceledException e) {
            e.printStackTrace();
        }
    }

    public final Object showUpdateGPSDialog(com.gamericefishpro.space.th.a aVar) {
        if (!this._deviceService.isAndroidDeviceType()) {
            return Unit.a;
        }
        if (!isGooglePlayStoreInstalled() || ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getDisableGMSMissingPrompt() || ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getUserRejectedGMSUpdate()) {
            return Unit.a;
        }
        com.gamericefishpro.space.wi.e eVar = k0.a;
        Object objD = a0.D(m.a, new b(null), aVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }
}
