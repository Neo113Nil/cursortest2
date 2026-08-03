package com.onesignal.notifications.internal.registration.impl;

import ac.o;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.onesignal.common.AndroidUtils;
import hc.j;
import yc.a0;
import yc.i0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {
    public static final C0059a Companion = new C0059a(null);
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private final q8.f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final v8.c _deviceService;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.notifications.internal.registration.impl.a$a, reason: collision with other inner class name */
    public static final class C0059a {
        public /* synthetic */ C0059a(pc.f fVar) {
            this();
        }

        private C0059a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends j implements oc.e {
        int label;

        public b(fc.d dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invokeSuspend$lambda-1, reason: not valid java name */
        public static final void m38invokeSuspend$lambda1(a aVar, DialogInterface dialogInterface, int i10) {
            ((com.onesignal.core.internal.config.a) aVar._configModelStore.getModel()).setUserRejectedGMSUpdate(true);
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return a.this.new b(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            final Activity current = a.this._applicationService.getCurrent();
            o oVar = o.f277a;
            if (current == null) {
                return oVar;
            }
            AndroidUtils androidUtils = AndroidUtils.INSTANCE;
            String resourceString = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
            String resourceString2 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_update", "Update");
            String resourceString3 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_skip", "Skip");
            String resourceString4 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_close", "Close");
            AlertDialog.Builder message = new AlertDialog.Builder(current).setMessage(resourceString);
            final a aVar = a.this;
            message.setPositiveButton(resourceString2, new DialogInterface.OnClickListener() { // from class: com.onesignal.notifications.internal.registration.impl.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    a.access$openPlayStoreToApp(a.this, current);
                }
            }).setNegativeButton(resourceString3, new b9.a(2, a.this)).setNeutralButton(resourceString4, (DialogInterface.OnClickListener) null).create().show();
            return oVar;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((b) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    public a(q8.f fVar, v8.c cVar, com.onesignal.core.internal.config.b bVar) {
        pc.j.e(fVar, "_applicationService");
        pc.j.e(cVar, "_deviceService");
        pc.j.e(bVar, "_configModelStore");
        this._applicationService = fVar;
        this._deviceService = cVar;
        this._configModelStore = bVar;
    }

    public static final /* synthetic */ void access$openPlayStoreToApp(a aVar, Activity activity) {
        aVar.openPlayStoreToApp(activity);
    }

    private final boolean isGooglePlayStoreInstalled() {
        try {
            PackageManager packageManager = this._applicationService.getAppContext().getPackageManager();
            pc.j.c(packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager), "null cannot be cast to non-null type kotlin.String");
            return !((String) r0).equals("Market");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPlayStoreToApp(Activity activity) {
        try {
            m6.e eVar = m6.e.f4913d;
            PendingIntent pendingIntent = null;
            Intent a6 = eVar.a(eVar.b(this._applicationService.getAppContext(), m6.f.f4914a), activity, null);
            if (a6 != null) {
                pendingIntent = PendingIntent.getActivity(activity, PLAY_SERVICES_RESOLUTION_REQUEST, a6, 201326592);
            }
            if (pendingIntent != null) {
                pendingIntent.send();
            }
        } catch (PendingIntent.CanceledException e10) {
            e10.printStackTrace();
        }
    }

    public final Object showUpdateGPSDialog(fc.d dVar) {
        if (this._deviceService.isAndroidDeviceType() && isGooglePlayStoreInstalled() && !((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getDisableGMSMissingPrompt() && !((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getUserRejectedGMSUpdate()) {
            fd.e eVar = i0.f8859a;
            Object A = a0.A(dd.o.f1880a, new b(null), dVar);
            if (A == gc.a.f2559g) {
                return A;
            }
        }
        return o.f277a;
    }
}
