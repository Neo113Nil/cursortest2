package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.versionedparcelable.DragonRouteSemaphoreRepositoryWp6Zls2NYC5lUwsRUB87890790180387;
import androidx.versionedparcelable.GoldenVectorCoroutineTranspilerTbwuCpNUfxiQ181tFE78464764385187;
import androidx.versionedparcelable.SolarMeshExceptionModuleAvjC8OuyWb6YwPbeMV37936144043235;
import androidx.versionedparcelable.VertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397;
import androidx.versionedparcelable.YellowLoopAlgorithmDelegateKu4Pf22gTTzesJV4qg92602665352302;
import androidx.versionedparcelable.YellowLoopAnnotationVariableGQv7r0fCnSeQCW5RBd99238195825672;
import androidx.versionedparcelable.ZenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        YellowLoopAlgorithmDelegateKu4Pf22gTTzesJV4qg92602665352302.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(getApplicationContext());
        ZenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = VertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983(string);
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = YellowLoopAnnotationVariableGQv7r0fCnSeQCW5RBd99238195825672.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(i);
        if (string2 != null) {
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = Base64.decode(string2, 0);
        }
        SolarMeshExceptionModuleAvjC8OuyWb6YwPbeMV37936144043235 solarMeshExceptionModuleAvjC8OuyWb6YwPbeMV37936144043235 = YellowLoopAlgorithmDelegateKu4Pf22gTTzesJV4qg92602665352302.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800().RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        ((Executor) solarMeshExceptionModuleAvjC8OuyWb6YwPbeMV37936144043235.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).execute(new DragonRouteSemaphoreRepositoryWp6Zls2NYC5lUwsRUB87890790180387(solarMeshExceptionModuleAvjC8OuyWb6YwPbeMV37936144043235, ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(), i2, new GoldenVectorCoroutineTranspilerTbwuCpNUfxiQ181tFE78464764385187(11, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
