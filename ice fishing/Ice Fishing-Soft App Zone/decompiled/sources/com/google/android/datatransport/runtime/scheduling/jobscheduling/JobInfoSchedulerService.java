package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.WinterFlowControllerManager;
import com.google.android.datatransport.WinterFlowDataSourceWebsocket;
import com.google.android.datatransport.WinterFlowHandlerSubsystem;
import com.google.android.datatransport.WinterFlowJSONProxy;
import com.google.android.datatransport.WinterFlowObjectPackage;
import com.google.android.datatransport.WinterFlowProxyCompiler;
import com.google.android.datatransport.WinterFlowViewNode;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int WinterFlowVariableVersionControl = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        WinterFlowDataSourceWebsocket.WinterFlowHookDataSource(getApplicationContext());
        WinterFlowObjectPackage WinterFlowRouterStructure = WinterFlowViewNode.WinterFlowRouterStructure();
        WinterFlowRouterStructure.WinterFlowResolverController(string);
        WinterFlowRouterStructure.WinterFlowRouterRouter = WinterFlowProxyCompiler.WinterFlowHookDataSource(i);
        if (string2 != null) {
            WinterFlowRouterStructure.WinterFlowUnitTestResponse = Base64.decode(string2, 0);
        }
        WinterFlowJSONProxy winterFlowJSONProxy = WinterFlowDataSourceWebsocket.WinterFlowRouterStructure().WinterFlowArrayNetwork;
        ((Executor) winterFlowJSONProxy.WinterFlowVariableVersionControl).execute(new WinterFlowHandlerSubsystem(winterFlowJSONProxy, WinterFlowRouterStructure.WinterFlowArrayNetwork(), i2, new WinterFlowControllerManager(10, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
