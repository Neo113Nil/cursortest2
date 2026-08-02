package com.onesignal.notifications.internal.registration.impl;

import I7.p;
import S7.AbstractC0410y;
import S7.F;
import S7.InterfaceC0408w;
import X7.o;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.onesignal.common.AndroidUtils;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class a {
    public static final C0239a Companion = new C0239a(null);
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private final x4.f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final C4.c _deviceService;

    /* renamed from: com.onesignal.notifications.internal.registration.impl.a$a, reason: collision with other inner class name */
    public static final class C0239a {
        public /* synthetic */ C0239a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0239a() {
        }
    }

    public static final class b extends B7.h implements p {
        int label;

        public b(InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(a aVar, DialogInterface dialogInterface, int i) {
            ((com.onesignal.core.internal.config.b) aVar._configModelStore.getModel()).setUserRejectedGMSUpdate(true);
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return a.this.new b(interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((b) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            final Activity current = a.this._applicationService.getCurrent();
            v vVar = v.f41073a;
            if (current == null) {
                return vVar;
            }
            AndroidUtils androidUtils = AndroidUtils.INSTANCE;
            String resourceString = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
            String resourceString2 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_update", "Update");
            String resourceString3 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_skip", "Skip");
            String resourceString4 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_close", "Close");
            AlertDialog.Builder message = new AlertDialog.Builder(current).setMessage(resourceString);
            final a aVar2 = a.this;
            message.setPositiveButton(resourceString2, new DialogInterface.OnClickListener() { // from class: com.onesignal.notifications.internal.registration.impl.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    a.access$openPlayStoreToApp(a.this, current);
                }
            }).setNegativeButton(resourceString3, new com.onesignal.core.internal.permissions.a(2, a.this)).setNeutralButton(resourceString4, (DialogInterface.OnClickListener) null).create().show();
            return vVar;
        }
    }

    public a(x4.f _applicationService, C4.c _deviceService, com.onesignal.core.internal.config.c _configModelStore) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_deviceService, "_deviceService");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
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
            kotlin.jvm.internal.h.c(packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager), "null cannot be cast to non-null type kotlin.String");
            return !((String) r0).equals("Market");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPlayStoreToApp(Activity activity) {
        try {
            O2.e eVar = O2.e.f2268d;
            PendingIntent pendingIntent = null;
            Intent b9 = eVar.b(activity, null, eVar.c(this._applicationService.getAppContext(), O2.f.f2269a));
            if (b9 != null) {
                pendingIntent = PendingIntent.getActivity(activity, PLAY_SERVICES_RESOLUTION_REQUEST, b9, 201326592);
            }
            if (pendingIntent != null) {
                pendingIntent.send();
            }
        } catch (PendingIntent.CanceledException e9) {
            e9.printStackTrace();
        }
    }

    public final Object showUpdateGPSDialog(InterfaceC5240d interfaceC5240d) {
        boolean isAndroidDeviceType = this._deviceService.isAndroidDeviceType();
        v vVar = v.f41073a;
        if (isAndroidDeviceType && isGooglePlayStoreInstalled() && !((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getDisableGMSMissingPrompt() && !((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getUserRejectedGMSUpdate()) {
            Z7.e eVar = F.f2998a;
            Object y7 = AbstractC0410y.y(o.f3811a, new b(null), interfaceC5240d);
            if (y7 == A7.a.f215n) {
                return y7;
            }
        }
        return vVar;
    }
}
