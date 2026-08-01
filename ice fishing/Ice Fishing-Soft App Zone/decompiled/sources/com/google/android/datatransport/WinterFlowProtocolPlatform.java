package com.google.android.datatransport;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProtocolPlatform {
    public static WinterFlowProtocolPlatform WinterFlowVariableVersionControl;
    public Object WinterFlowArrayNetwork;
    public Object WinterFlowCacheManagerAgent;
    public final Object WinterFlowHookDataSource;
    public int WinterFlowRouterStructure;

    public WinterFlowProtocolPlatform(Bundle bundle) {
        bundle.getClass();
        String string = bundle.getString("nav-entry-state:id");
        if (string == null) {
            WinterFlowFrameworkMechanism.WinterFlowResponseEngine("nav-entry-state:id");
            throw null;
        }
        this.WinterFlowHookDataSource = string;
        int i = bundle.getInt("nav-entry-state:destination-id", Integer.MIN_VALUE);
        if (i == Integer.MIN_VALUE && bundle.getInt("nav-entry-state:destination-id", Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            WinterFlowFrameworkMechanism.WinterFlowResponseEngine("nav-entry-state:destination-id");
            throw null;
        }
        this.WinterFlowRouterStructure = i;
        Bundle bundle2 = bundle.getBundle("nav-entry-state:args");
        if (bundle2 == null) {
            WinterFlowFrameworkMechanism.WinterFlowResponseEngine("nav-entry-state:args");
            throw null;
        }
        this.WinterFlowCacheManagerAgent = bundle2;
        Bundle bundle3 = bundle.getBundle("nav-entry-state:saved-state");
        if (bundle3 != null) {
            this.WinterFlowArrayNetwork = bundle3;
        } else {
            WinterFlowFrameworkMechanism.WinterFlowResponseEngine("nav-entry-state:saved-state");
            throw null;
        }
    }

    public static synchronized WinterFlowProtocolPlatform WinterFlowTransactionAgent(Context context) {
        WinterFlowProtocolPlatform winterFlowProtocolPlatform;
        synchronized (WinterFlowProtocolPlatform.class) {
            winterFlowProtocolPlatform = WinterFlowVariableVersionControl;
            if (winterFlowProtocolPlatform == null) {
                winterFlowProtocolPlatform = new WinterFlowProtocolPlatform(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new WinterFlowCompilerScheduler("MessengerIpcClient"))));
                WinterFlowVariableVersionControl = winterFlowProtocolPlatform;
            }
        }
        return winterFlowProtocolPlatform;
    }

    public void WinterFlowArrayNetwork(int i) {
        if (this.WinterFlowRouterStructure == i) {
            return;
        }
        this.WinterFlowRouterStructure = i;
        Paint paint = (Paint) this.WinterFlowHookDataSource;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(WinterFlowServerManager.WinterFlowPackageIDE(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(WinterFlowServerManager.WinterFlowSoftwareProtocol(i)));
        }
    }

    public void WinterFlowCacheManagerAgent(float f) {
        ((Paint) this.WinterFlowHookDataSource).setAlpha((int) Math.rint(f * 255.0f));
    }

    public int WinterFlowHookDataSource() {
        Paint.Join strokeJoin = ((Paint) this.WinterFlowHookDataSource).getStrokeJoin();
        int i = strokeJoin == null ? -1 : WinterFlowCacheStrategy.WinterFlowHookDataSource[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public void WinterFlowResponseEngine(int i) {
        ((Paint) this.WinterFlowHookDataSource).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public void WinterFlowRouterRouter(int i) {
        ((Paint) this.WinterFlowHookDataSource).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public int WinterFlowRouterStructure() {
        Paint.Cap strokeCap = ((Paint) this.WinterFlowHookDataSource).getStrokeCap();
        int i = strokeCap == null ? -1 : WinterFlowCacheStrategy.WinterFlowRouterStructure[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public synchronized WinterFlowExceptionParser WinterFlowServerProtocol(WinterFlowWidgetUtility winterFlowWidgetUtility) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(winterFlowWidgetUtility.toString());
            }
            if (!((WinterFlowSchedulerWorker) this.WinterFlowArrayNetwork).WinterFlowRouterStructure(winterFlowWidgetUtility)) {
                WinterFlowSchedulerWorker winterFlowSchedulerWorker = new WinterFlowSchedulerWorker(this);
                this.WinterFlowArrayNetwork = winterFlowSchedulerWorker;
                winterFlowSchedulerWorker.WinterFlowRouterStructure(winterFlowWidgetUtility);
            }
        } catch (Throwable th) {
            throw th;
        }
        return winterFlowWidgetUtility.WinterFlowHookDataSource.WinterFlowRouterStructure;
    }

    public void WinterFlowSyntax(int i) {
        ((Paint) this.WinterFlowHookDataSource).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void WinterFlowTransactionManagerStrategy(WinterFlowProxyValidator winterFlowProxyValidator) {
        this.WinterFlowArrayNetwork = winterFlowProxyValidator;
        ((Paint) this.WinterFlowHookDataSource).setColorFilter(winterFlowProxyValidator != null ? winterFlowProxyValidator.WinterFlowRouterStructure : null);
    }

    public void WinterFlowUnitTestResponse(Shader shader) {
        this.WinterFlowCacheManagerAgent = shader;
        ((Paint) this.WinterFlowHookDataSource).setShader(shader);
    }

    public void WinterFlowVariableVersionControl(long j) {
        ((Paint) this.WinterFlowHookDataSource).setColor(WinterFlowInvokerComponent.WinterFlowConfiguration(j));
    }

    public WinterFlowProtocolPlatform(WinterFlowLibrarySessionManager winterFlowLibrarySessionManager, int i) {
        this.WinterFlowHookDataSource = winterFlowLibrarySessionManager.WinterFlowResponseEngine;
        this.WinterFlowRouterStructure = i;
        WinterFlowListenerProcess winterFlowListenerProcess = winterFlowLibrarySessionManager.WinterFlowServerProtocol;
        this.WinterFlowCacheManagerAgent = winterFlowListenerProcess.WinterFlowRouterStructure();
        Bundle WinterFlowOrchestrationSubsystem = WinterFlowManagerRequest.WinterFlowOrchestrationSubsystem((WinterFlowServerPlatform[]) Arrays.copyOf(new WinterFlowServerPlatform[0], 0));
        this.WinterFlowArrayNetwork = WinterFlowOrchestrationSubsystem;
        winterFlowListenerProcess.WinterFlowRouterRouter.WinterFlowRouterRouter(WinterFlowOrchestrationSubsystem);
    }

    public WinterFlowProtocolPlatform(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.WinterFlowArrayNetwork = new WinterFlowSchedulerWorker(this);
        this.WinterFlowRouterStructure = 1;
        this.WinterFlowCacheManagerAgent = scheduledExecutorService;
        this.WinterFlowHookDataSource = context.getApplicationContext();
    }

    public WinterFlowProtocolPlatform(Paint paint) {
        this.WinterFlowHookDataSource = paint;
        this.WinterFlowRouterStructure = 3;
    }
}
