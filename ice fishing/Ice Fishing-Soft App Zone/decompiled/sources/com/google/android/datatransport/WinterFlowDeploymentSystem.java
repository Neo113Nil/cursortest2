package com.google.android.datatransport;

import android.view.MotionEvent;
import com.adjust.sdk.AdjustTimeoutCallback;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.InstallReferrer;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.OnThirdPartySharingSettingsReadListener;
import com.adjust.sdk.SdkClickHandler;
import com.adjust.sdk.scheduler.TimerCycle;
import com.adjust.sdk.scheduler.TimerOnce;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Objects;
import javax.net.ssl.SSLException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDeploymentSystem implements Runnable {
    public final Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public WinterFlowDeploymentSystem(WinterFlowHookLibrary winterFlowHookLibrary, WinterFlowEncryptionSoftware winterFlowEncryptionSoftware) {
        this.WinterFlowVariableVersionControl = 13;
        Objects.requireNonNull(winterFlowHookLibrary);
        this.WinterFlowTransactionManagerStrategy = winterFlowEncryptionSoftware;
    }

    public void WinterFlowHookDataSource() {
        WinterFlowObjectManager winterFlowObjectManager = (WinterFlowObjectManager) this.WinterFlowTransactionManagerStrategy;
        WinterFlowRefactoringLayer winterFlowRefactoringLayer = winterFlowObjectManager.WinterFlowServerProtocol;
        while (!Thread.interrupted()) {
            try {
                ByteBuffer byteBuffer = (ByteBuffer) winterFlowRefactoringLayer.WinterFlowTransactionManagerStrategy.take();
                winterFlowObjectManager.WinterFlowServiceUtility.write(byteBuffer.array(), 0, byteBuffer.limit());
                winterFlowObjectManager.WinterFlowServiceUtility.flush();
            } catch (InterruptedException unused) {
                Iterator it = winterFlowRefactoringLayer.WinterFlowTransactionManagerStrategy.iterator();
                while (it.hasNext()) {
                    ByteBuffer byteBuffer2 = (ByteBuffer) it.next();
                    winterFlowObjectManager.WinterFlowServiceUtility.write(byteBuffer2.array(), 0, byteBuffer2.limit());
                    winterFlowObjectManager.WinterFlowServiceUtility.flush();
                }
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public void WinterFlowRouterStructure() {
        WinterFlowObjectManager winterFlowObjectManager = (WinterFlowObjectManager) this.WinterFlowTransactionManagerStrategy;
        try {
            Socket socket = winterFlowObjectManager.WinterFlowThreadListener;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException unused) {
            winterFlowObjectManager.WinterFlowArrayNetwork();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int actionMasked;
        ILogger iLogger;
        String str;
        Runnable runnable;
        ILogger iLogger2;
        String str2;
        Runnable runnable2;
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AdjustTimeoutCallback adjustTimeoutCallback = ((WinterFlowResolverSystem) this.WinterFlowTransactionManagerStrategy).WinterFlowTransactionManagerStrategy;
                OnAdidReadListener onAdidReadListener = adjustTimeoutCallback.getOnAdidReadListener();
                if (onAdidReadListener != null) {
                    onAdidReadListener.onAdidRead(null);
                }
                adjustTimeoutCallback.setOnAdidReadListener(null);
                return;
            case 1:
                AdjustTimeoutCallback adjustTimeoutCallback2 = ((WinterFlowResolverSystem) this.WinterFlowTransactionManagerStrategy).WinterFlowTransactionManagerStrategy;
                OnAttributionReadListener onAttributionReadListener = adjustTimeoutCallback2.getOnAttributionReadListener();
                if (onAttributionReadListener != null) {
                    onAttributionReadListener.onAttributionRead(null);
                }
                adjustTimeoutCallback2.setOnAttributionReadListener(null);
                return;
            case 2:
                AdjustTimeoutCallback adjustTimeoutCallback3 = ((WinterFlowResolverSystem) this.WinterFlowTransactionManagerStrategy).WinterFlowTransactionManagerStrategy;
                OnThirdPartySharingSettingsReadListener onThirdPartySharingSettingsReadListener = adjustTimeoutCallback3.getOnThirdPartySharingSettingsReadListener();
                if (onThirdPartySharingSettingsReadListener != null) {
                    onThirdPartySharingSettingsReadListener.onThirdPartySharingSettingsRead(null);
                }
                adjustTimeoutCallback3.setOnThirdPartySharingSettingsReadListener(null);
                return;
            case 3:
                WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = (WinterFlowSyntaxTransactionManager) this.WinterFlowTransactionManagerStrategy;
                winterFlowSyntaxTransactionManager.removeCallbacks(this);
                MotionEvent motionEvent = winterFlowSyntaxTransactionManager.WinterFlowFrameworkCacheManager;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                int i = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i = 2;
                }
                winterFlowSyntaxTransactionManager.WinterFlowSoftwareProtocol(motionEvent, i, winterFlowSyntaxTransactionManager.WinterFlowXMLFramework, false);
                return;
            case 4:
                ((WinterFlowViewObject) this.WinterFlowTransactionManagerStrategy).WinterFlowSyntax();
                throw null;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                ((InstallReferrer) this.WinterFlowTransactionManagerStrategy).startConnection();
                return;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                ((SdkClickHandler) this.WinterFlowTransactionManagerStrategy).sendNextSdkClickI();
                return;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                TimerCycle timerCycle = (TimerCycle) this.WinterFlowTransactionManagerStrategy;
                iLogger = timerCycle.logger;
                str = timerCycle.name;
                iLogger.verbose("%s fired", str);
                runnable = timerCycle.command;
                runnable.run();
                return;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                TimerOnce timerOnce = (TimerOnce) this.WinterFlowTransactionManagerStrategy;
                iLogger2 = timerOnce.logger;
                str2 = timerOnce.name;
                iLogger2.verbose("%s fired", str2);
                runnable2 = timerOnce.command;
                runnable2.run();
                timerOnce.waitingTask = null;
                return;
            case 9:
                Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
                try {
                    try {
                        WinterFlowHookDataSource();
                    } catch (IOException e) {
                        WinterFlowObjectManager winterFlowObjectManager = (WinterFlowObjectManager) this.WinterFlowTransactionManagerStrategy;
                        if (e instanceof SSLException) {
                            winterFlowObjectManager.WinterFlowArrayNetwork();
                        }
                        winterFlowObjectManager.WinterFlowServerProtocol.WinterFlowVariableVersionControl();
                    }
                    return;
                } finally {
                    WinterFlowRouterStructure();
                }
            case 10:
                ((WinterFlowCacheTransactionManager) this.WinterFlowTransactionManagerStrategy).WinterFlowHookDataSource();
                return;
            case 11:
                com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent = ((WinterFlowCacheTransactionManager) ((WinterFlowConcurrencyProcess) this.WinterFlowTransactionManagerStrategy).WinterFlowVariableVersionControl).WinterFlowArrayNetwork;
                winterFlowSyntaxEvent.WinterFlowCacheManagerAgent(winterFlowSyntaxEvent.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 12:
                ((WinterFlowManagerStructure) this.WinterFlowTransactionManagerStrategy).WinterFlowResponseEngine.WinterFlowRouterStructure(new ConnectionResult(4, null, null));
                return;
            case 13:
                throw null;
            case 14:
                WinterFlowSerializerAgent winterFlowSerializerAgent = (WinterFlowSerializerAgent) this.WinterFlowTransactionManagerStrategy;
                synchronized (winterFlowSerializerAgent.WinterFlowRouterStructure) {
                    try {
                        if (winterFlowSerializerAgent.WinterFlowHookDataSource()) {
                            String.valueOf(winterFlowSerializerAgent.WinterFlowResponseEngine).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                            winterFlowSerializerAgent.WinterFlowArrayNetwork();
                            if (winterFlowSerializerAgent.WinterFlowHookDataSource()) {
                                winterFlowSerializerAgent.WinterFlowCacheManagerAgent = 1;
                                winterFlowSerializerAgent.WinterFlowVariableVersionControl();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 15:
                ((WinterFlowArrayEngine) this.WinterFlowTransactionManagerStrategy).WinterFlowHookDataSource(new IOException("TIMEOUT"));
                return;
            default:
                WinterFlowProtocolMechanism winterFlowProtocolMechanism = (WinterFlowProtocolMechanism) this.WinterFlowTransactionManagerStrategy;
                synchronized (winterFlowProtocolMechanism.WinterFlowUnitTestResponse) {
                    ((WinterFlowTransactionDeserialization) winterFlowProtocolMechanism.WinterFlowRouterRouter).WinterFlowHookDataSource();
                }
                return;
        }
    }

    public /* synthetic */ WinterFlowDeploymentSystem(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    public WinterFlowDeploymentSystem(WinterFlowManagerStructure winterFlowManagerStructure) {
        this.WinterFlowVariableVersionControl = 12;
        Objects.requireNonNull(winterFlowManagerStructure);
        this.WinterFlowTransactionManagerStrategy = winterFlowManagerStructure;
    }

    public WinterFlowDeploymentSystem(WinterFlowObjectManager winterFlowObjectManager, WinterFlowObjectManager winterFlowObjectManager2) {
        this.WinterFlowVariableVersionControl = 9;
        this.WinterFlowTransactionManagerStrategy = winterFlowObjectManager;
    }
}
