package com.bugsnag.android;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.bugsnag.android.Client;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.text.CharsKt;

/* loaded from: classes.dex */
public final class ActivityBreadcrumbCollector implements Application.ActivityLifecycleCallbacks {
    public final Client.AnonymousClass1 cb;
    public final WeakHashMap prevState = new WeakHashMap();

    public ActivityBreadcrumbCollector(Client.AnonymousClass1 anonymousClass1) {
        this.cb = anonymousClass1;
    }

    public static /* synthetic */ void leaveBreadcrumb$default(ActivityBreadcrumbCollector activityBreadcrumbCollector, Activity activity, String str) {
        activityBreadcrumbCollector.leaveBreadcrumb(activity, str, new LinkedHashMap());
    }

    public final void leaveBreadcrumb(Activity activity, String str, LinkedHashMap linkedHashMap) {
        WeakHashMap weakHashMap = this.prevState;
        String str2 = (String) weakHashMap.get(activity);
        if (str2 != null) {
            linkedHashMap.put("previous", str2);
        }
        this.cb.invoke(activity.getClass().getSimpleName() + '#' + str, linkedHashMap);
        weakHashMap.put(activity, str);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Set<String> keySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hasBundle", Boolean.valueOf(bundle != null));
        Intent intent = activity.getIntent();
        if (intent != null) {
            String action = intent.getAction();
            if (action != null) {
                linkedHashMap.put("action", action);
            }
            Set<String> categories = intent.getCategories();
            if (categories != null) {
                linkedHashMap.put("categories", CollectionsKt.joinToString$default(categories, ", ", null, null, 0, null, null, 62));
            }
            String type2 = intent.getType();
            if (type2 != null) {
                linkedHashMap.put("type", type2);
            }
            if (intent.getFlags() != 0) {
                String num = Integer.toString(intent.getFlags(), CharsKt.checkRadix(16));
                num.getClass();
                linkedHashMap.put("flags", "0x".concat(num));
            }
            String identifier = intent.getIdentifier();
            if (identifier != null) {
                linkedHashMap.put("id", identifier);
            }
            linkedHashMap.put("hasData", Boolean.valueOf(intent.getData() != null));
            try {
                Bundle extras = intent.getExtras();
                linkedHashMap.put("hasExtras", (extras == null || (keySet = extras.keySet()) == null) ? Boolean.FALSE : CollectionsKt.joinToString$default(keySet, ", ", null, null, 0, null, null, 62));
            } catch (Exception unused) {
            }
        }
        leaveBreadcrumb(activity, "onCreate()", linkedHashMap);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        leaveBreadcrumb$default(this, activity, "onDestroy()");
        this.prevState.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        leaveBreadcrumb$default(this, activity, "onPause()");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        leaveBreadcrumb$default(this, activity, "onResume()");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        leaveBreadcrumb$default(this, activity, "onSaveInstanceState()");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        leaveBreadcrumb$default(this, activity, "onStart()");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        leaveBreadcrumb$default(this, activity, "onStop()");
    }
}
