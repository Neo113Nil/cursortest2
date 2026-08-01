package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.WinterFlowDataSourceWebsocket;
import com.google.android.datatransport.WinterFlowHandlerSubsystem;
import com.google.android.datatransport.WinterFlowJSONProxy;
import com.google.android.datatransport.WinterFlowObjectPackage;
import com.google.android.datatransport.WinterFlowProxyCompiler;
import com.google.android.datatransport.WinterFlowTransactionManagerConsumer;
import com.google.android.datatransport.WinterFlowViewNode;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int WinterFlowRouterStructure = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        WinterFlowDataSourceWebsocket.WinterFlowHookDataSource(context);
        WinterFlowObjectPackage WinterFlowRouterStructure2 = WinterFlowViewNode.WinterFlowRouterStructure();
        WinterFlowRouterStructure2.WinterFlowResolverController(queryParameter);
        WinterFlowRouterStructure2.WinterFlowRouterRouter = WinterFlowProxyCompiler.WinterFlowHookDataSource(intValue);
        if (queryParameter2 != null) {
            WinterFlowRouterStructure2.WinterFlowUnitTestResponse = Base64.decode(queryParameter2, 0);
        }
        WinterFlowJSONProxy winterFlowJSONProxy = WinterFlowDataSourceWebsocket.WinterFlowRouterStructure().WinterFlowArrayNetwork;
        ((Executor) winterFlowJSONProxy.WinterFlowVariableVersionControl).execute(new WinterFlowHandlerSubsystem(winterFlowJSONProxy, WinterFlowRouterStructure2.WinterFlowArrayNetwork(), i, new WinterFlowTransactionManagerConsumer(0)));
    }
}
