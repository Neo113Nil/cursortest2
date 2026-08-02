package com.bugsnag.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bugsnag.android.internal.ImmutableConfig;
import java.util.HashMap;
import java.util.Set;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public final class SystemBroadcastReceiver extends BroadcastReceiver {
    public final HashMap actions;
    public final Client client;
    public final Logger logger;

    public SystemBroadcastReceiver(Client client, Logger logger) {
        this.client = client;
        this.logger = logger;
        HashMap hashMap = new HashMap();
        ImmutableConfig immutableConfig = client.immutableConfig;
        BreadcrumbType breadcrumbType = BreadcrumbType.USER;
        immutableConfig.getClass();
        hashMap.put("android.appwidget.action.APPWIDGET_DELETED", breadcrumbType);
        hashMap.put("android.appwidget.action.APPWIDGET_DISABLED", breadcrumbType);
        hashMap.put("android.appwidget.action.APPWIDGET_ENABLED", breadcrumbType);
        hashMap.put("android.intent.action.CAMERA_BUTTON", breadcrumbType);
        hashMap.put("android.intent.action.CLOSE_SYSTEM_DIALOGS", breadcrumbType);
        hashMap.put("android.intent.action.DOCK_EVENT", breadcrumbType);
        BreadcrumbType breadcrumbType2 = BreadcrumbType.STATE;
        hashMap.put("android.appwidget.action.APPWIDGET_HOST_RESTORED", breadcrumbType2);
        hashMap.put("android.appwidget.action.APPWIDGET_RESTORED", breadcrumbType2);
        hashMap.put("android.appwidget.action.APPWIDGET_UPDATE", breadcrumbType2);
        hashMap.put("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS", breadcrumbType2);
        hashMap.put("android.intent.action.ACTION_POWER_CONNECTED", breadcrumbType2);
        hashMap.put("android.intent.action.ACTION_POWER_DISCONNECTED", breadcrumbType2);
        hashMap.put("android.intent.action.ACTION_SHUTDOWN", breadcrumbType2);
        hashMap.put("android.intent.action.AIRPLANE_MODE", breadcrumbType2);
        hashMap.put("android.intent.action.BATTERY_LOW", breadcrumbType2);
        hashMap.put("android.intent.action.BATTERY_OKAY", breadcrumbType2);
        hashMap.put("android.intent.action.BOOT_COMPLETED", breadcrumbType2);
        hashMap.put("android.intent.action.CONFIGURATION_CHANGED", breadcrumbType2);
        hashMap.put("android.intent.action.CONTENT_CHANGED", breadcrumbType2);
        hashMap.put("android.intent.action.DATE_CHANGED", breadcrumbType2);
        hashMap.put("android.intent.action.DEVICE_STORAGE_LOW", breadcrumbType2);
        hashMap.put("android.intent.action.DEVICE_STORAGE_OK", breadcrumbType2);
        hashMap.put("android.intent.action.INPUT_METHOD_CHANGED", breadcrumbType2);
        hashMap.put("android.intent.action.LOCALE_CHANGED", breadcrumbType2);
        hashMap.put("android.intent.action.REBOOT", breadcrumbType2);
        hashMap.put("android.intent.action.SCREEN_OFF", breadcrumbType2);
        hashMap.put("android.intent.action.SCREEN_ON", breadcrumbType2);
        hashMap.put("android.intent.action.TIMEZONE_CHANGED", breadcrumbType2);
        hashMap.put("android.intent.action.TIME_SET", breadcrumbType2);
        hashMap.put("android.os.action.DEVICE_IDLE_MODE_CHANGED", breadcrumbType2);
        hashMap.put("android.os.action.POWER_SAVE_MODE_CHANGED", breadcrumbType2);
        BreadcrumbType breadcrumbType3 = BreadcrumbType.NAVIGATION;
        hashMap.put("android.intent.action.DREAMING_STARTED", breadcrumbType3);
        hashMap.put("android.intent.action.DREAMING_STOPPED", breadcrumbType3);
        this.actions = hashMap;
    }

    public static void addExtrasToMetadata(Intent intent, HashMap hashMap, String str) {
        Set<String> keySet;
        Bundle extras = intent.getExtras();
        if (extras == null || (keySet = extras.keySet()) == null) {
            return;
        }
        for (String str2 : keySet) {
            Object obj = extras.get(str2);
            if (obj != null) {
                String obj2 = obj.toString();
                if (StringsKt__StringsJVMKt.startsWith(str2, "android.", false)) {
                    hashMap.put("Extra", str + ": " + obj2);
                } else {
                    hashMap.put(str2, obj2);
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            HashMap hashMap = new HashMap();
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            String substringAfterLast = StringsKt__StringsJVMKt.startsWith(action, "android.", false) ? StringsKt.substringAfterLast('.', action, action) : action;
            hashMap.put("Intent Action", action);
            addExtrasToMetadata(intent, hashMap, substringAfterLast);
            BreadcrumbType breadcrumbType = (BreadcrumbType) this.actions.get(action);
            if (breadcrumbType == null) {
                breadcrumbType = BreadcrumbType.STATE;
            }
            this.client.leaveBreadcrumb(breadcrumbType, substringAfterLast, hashMap);
        } catch (Exception e) {
            this.logger.w("Failed to leave breadcrumb in SystemBroadcastReceiver: " + e.getMessage());
        }
    }
}
