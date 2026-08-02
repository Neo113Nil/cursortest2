package com.squareup.cash.data.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AndroidAccessibilityManager {
    public final Lazy accessibilityManager$delegate;
    public final Lazy captioningManager$delegate;
    public final Context context;
    public final Lazy enabledAccessibilityServiceList$delegate;

    public AndroidAccessibilityManager(Context context) {
        this.context = context;
        final int i = 0;
        this.accessibilityManager$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.data.accessibility.AndroidAccessibilityManager$$ExternalSyntheticLambda0
            public final /* synthetic */ AndroidAccessibilityManager f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AndroidAccessibilityManager androidAccessibilityManager = this.f$0;
                switch (i2) {
                    case 0:
                        Object systemService = androidAccessibilityManager.context.getSystemService("accessibility");
                        systemService.getClass();
                        return (AccessibilityManager) systemService;
                    case 1:
                        return ((AccessibilityManager) androidAccessibilityManager.accessibilityManager$delegate.getValue()).getEnabledAccessibilityServiceList(-1);
                    default:
                        Object systemService2 = androidAccessibilityManager.context.getSystemService("captioning");
                        systemService2.getClass();
                        return (CaptioningManager) systemService2;
                }
            }
        });
        final int i2 = 1;
        this.enabledAccessibilityServiceList$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.data.accessibility.AndroidAccessibilityManager$$ExternalSyntheticLambda0
            public final /* synthetic */ AndroidAccessibilityManager f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AndroidAccessibilityManager androidAccessibilityManager = this.f$0;
                switch (i22) {
                    case 0:
                        Object systemService = androidAccessibilityManager.context.getSystemService("accessibility");
                        systemService.getClass();
                        return (AccessibilityManager) systemService;
                    case 1:
                        return ((AccessibilityManager) androidAccessibilityManager.accessibilityManager$delegate.getValue()).getEnabledAccessibilityServiceList(-1);
                    default:
                        Object systemService2 = androidAccessibilityManager.context.getSystemService("captioning");
                        systemService2.getClass();
                        return (CaptioningManager) systemService2;
                }
            }
        });
        final int i3 = 2;
        this.captioningManager$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.data.accessibility.AndroidAccessibilityManager$$ExternalSyntheticLambda0
            public final /* synthetic */ AndroidAccessibilityManager f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AndroidAccessibilityManager androidAccessibilityManager = this.f$0;
                switch (i22) {
                    case 0:
                        Object systemService = androidAccessibilityManager.context.getSystemService("accessibility");
                        systemService.getClass();
                        return (AccessibilityManager) systemService;
                    case 1:
                        return ((AccessibilityManager) androidAccessibilityManager.accessibilityManager$delegate.getValue()).getEnabledAccessibilityServiceList(-1);
                    default:
                        Object systemService2 = androidAccessibilityManager.context.getSystemService("captioning");
                        systemService2.getClass();
                        return (CaptioningManager) systemService2;
                }
            }
        });
    }

    public final void announceForAccessibility(String str) {
        str.getClass();
        Lazy lazy = this.accessibilityManager$delegate;
        if (((AccessibilityManager) lazy.getValue()).isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.getText().add(str);
            obtain.setContentDescription(null);
            ((AccessibilityManager) lazy.getValue()).sendAccessibilityEvent(obtain);
        }
    }

    public final List getEnabledAccessibilityServiceList() {
        return (List) this.enabledAccessibilityServiceList$delegate.getValue();
    }

    public final boolean isSpokenServiceEnabled() {
        List enabledAccessibilityServiceList = getEnabledAccessibilityServiceList();
        enabledAccessibilityServiceList.getClass();
        List list = enabledAccessibilityServiceList;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((AccessibilityServiceInfo) it.next()).feedbackType & 1) != 0) {
                return true;
            }
        }
        return false;
    }
}
