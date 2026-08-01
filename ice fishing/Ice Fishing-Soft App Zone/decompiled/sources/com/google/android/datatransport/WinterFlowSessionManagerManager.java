package com.google.android.datatransport;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionManagerManager implements Application.ActivityLifecycleCallbacks {
    public final ArrayDeque WinterFlowVariableVersionControl = new ArrayDeque(10);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        ArrayDeque arrayDeque = this.WinterFlowVariableVersionControl;
        Bundle bundle2 = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle2 = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException unused) {
        }
        if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
            if (bundle2 != null && "1".equals(bundle2.getString("google.c.a.tc"))) {
                com.google.firebase.WinterFlowSyntaxEvent WinterFlowHookDataSource = com.google.firebase.WinterFlowSyntaxEvent.WinterFlowHookDataSource();
                WinterFlowHookDataSource.WinterFlowRouterStructure();
                if (WinterFlowHookDataSource.WinterFlowArrayNetwork.WinterFlowRouterStructure(WinterFlowAPILayer.class) != null) {
                    WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                    return;
                }
            }
            WinterFlowEncryptionSubsystem.WinterFlowSyntaxSubsystem(bundle2, "_no");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
