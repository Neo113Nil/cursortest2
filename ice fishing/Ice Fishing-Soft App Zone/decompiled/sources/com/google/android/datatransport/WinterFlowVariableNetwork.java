package com.google.android.datatransport;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVariableNetwork extends WinterFlowWidgetInterface {
    public final /* synthetic */ com.google.android.gms.common.internal.WinterFlowSyntaxEvent WinterFlowRouterStructure;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowVariableNetwork(com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent, Looper looper) {
        super(looper, 2);
        this.WinterFlowRouterStructure = winterFlowSyntaxEvent;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        WinterFlowProcessorAdapter winterFlowProcessorAdapter;
        com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent = this.WinterFlowRouterStructure;
        int i = winterFlowSyntaxEvent.WinterFlowMapperProtocol.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (winterFlowProcessorAdapter = (WinterFlowProcessorAdapter) message.obj) != null) {
                synchronized (winterFlowProcessorAdapter) {
                    winterFlowProcessorAdapter.WinterFlowRouterStructure = null;
                }
                com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent2 = winterFlowProcessorAdapter.WinterFlowCacheManagerAgent;
                synchronized (winterFlowSyntaxEvent2.WinterFlowTransactionAgent) {
                    winterFlowSyntaxEvent2.WinterFlowTransactionAgent.remove(winterFlowProcessorAdapter);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !winterFlowSyntaxEvent.WinterFlowThreadListener()) {
            WinterFlowProcessorAdapter winterFlowProcessorAdapter2 = (WinterFlowProcessorAdapter) message.obj;
            if (winterFlowProcessorAdapter2 != null) {
                synchronized (winterFlowProcessorAdapter2) {
                    winterFlowProcessorAdapter2.WinterFlowRouterStructure = null;
                }
                com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent3 = winterFlowProcessorAdapter2.WinterFlowCacheManagerAgent;
                synchronized (winterFlowSyntaxEvent3.WinterFlowTransactionAgent) {
                    winterFlowSyntaxEvent3.WinterFlowTransactionAgent.remove(winterFlowProcessorAdapter2);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            winterFlowSyntaxEvent.WinterFlowBatchUI = new ConnectionResult(message.arg2, null, null);
            if (!winterFlowSyntaxEvent.WinterFlowRouterAdapter && !TextUtils.isEmpty(winterFlowSyntaxEvent.WinterFlowSyntax()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(winterFlowSyntaxEvent.WinterFlowSyntax());
                    if (!winterFlowSyntaxEvent.WinterFlowRouterAdapter) {
                        winterFlowSyntaxEvent.WinterFlowOrchestrationSubsystem(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ConnectionResult connectionResult = winterFlowSyntaxEvent.WinterFlowBatchUI;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8, null, null);
            }
            winterFlowSyntaxEvent.WinterFlowSyntax.WinterFlowHookDataSource(connectionResult);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            ConnectionResult connectionResult2 = winterFlowSyntaxEvent.WinterFlowBatchUI;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8, null, null);
            }
            winterFlowSyntaxEvent.WinterFlowSyntax.WinterFlowHookDataSource(connectionResult2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            winterFlowSyntaxEvent.WinterFlowSyntax.WinterFlowHookDataSource(new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            winterFlowSyntaxEvent.WinterFlowOrchestrationSubsystem(5, null);
            WinterFlowNodeSerializer winterFlowNodeSerializer = winterFlowSyntaxEvent.WinterFlowServiceUtility;
            if (winterFlowNodeSerializer != null) {
                ((WinterFlowAlgorithmPlatform) winterFlowNodeSerializer.WinterFlowVariableVersionControl).WinterFlowRouterStructure(message.arg2);
            }
            System.currentTimeMillis();
            winterFlowSyntaxEvent.WinterFlowBandwidthObject(5, 1, null);
            return;
        }
        if (i4 == 2 && !winterFlowSyntaxEvent.WinterFlowServerProtocol()) {
            WinterFlowProcessorAdapter winterFlowProcessorAdapter3 = (WinterFlowProcessorAdapter) message.obj;
            if (winterFlowProcessorAdapter3 != null) {
                synchronized (winterFlowProcessorAdapter3) {
                    winterFlowProcessorAdapter3.WinterFlowRouterStructure = null;
                }
                com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent4 = winterFlowProcessorAdapter3.WinterFlowCacheManagerAgent;
                synchronized (winterFlowSyntaxEvent4.WinterFlowTransactionAgent) {
                    winterFlowSyntaxEvent4.WinterFlowTransactionAgent.remove(winterFlowProcessorAdapter3);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            new StringBuilder(String.valueOf(i5).length() + 34);
            new Exception();
            return;
        }
        WinterFlowProcessorAdapter winterFlowProcessorAdapter4 = (WinterFlowProcessorAdapter) message.obj;
        synchronized (winterFlowProcessorAdapter4) {
            try {
                bool = winterFlowProcessorAdapter4.WinterFlowRouterStructure;
                if (winterFlowProcessorAdapter4.WinterFlowHookDataSource) {
                    new StringBuilder(winterFlowProcessorAdapter4.toString().length() + 47);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent5 = winterFlowProcessorAdapter4.WinterFlowTransactionManagerStrategy;
            int i6 = winterFlowProcessorAdapter4.WinterFlowArrayNetwork;
            if (i6 != 0) {
                winterFlowSyntaxEvent5.WinterFlowOrchestrationSubsystem(1, null);
                Bundle bundle = winterFlowProcessorAdapter4.WinterFlowVariableVersionControl;
                winterFlowProcessorAdapter4.WinterFlowHookDataSource(new ConnectionResult(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!winterFlowProcessorAdapter4.WinterFlowRouterStructure()) {
                winterFlowSyntaxEvent5.WinterFlowOrchestrationSubsystem(1, null);
                winterFlowProcessorAdapter4.WinterFlowHookDataSource(new ConnectionResult(8, null, null));
            }
        }
        synchronized (winterFlowProcessorAdapter4) {
            winterFlowProcessorAdapter4.WinterFlowHookDataSource = true;
        }
        synchronized (winterFlowProcessorAdapter4) {
            winterFlowProcessorAdapter4.WinterFlowRouterStructure = null;
        }
        com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent6 = winterFlowProcessorAdapter4.WinterFlowCacheManagerAgent;
        synchronized (winterFlowSyntaxEvent6.WinterFlowTransactionAgent) {
            winterFlowSyntaxEvent6.WinterFlowTransactionAgent.remove(winterFlowProcessorAdapter4);
        }
    }
}
