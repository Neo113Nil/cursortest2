package com.adjust.sdk;

import java.util.ArrayList;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class MysticCacheRepositoryMiddlewareAB3bnXMEIZVxB84nFb54599119054108 {
    public final ActivityHandler ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public final ArrayList AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new ArrayList();
    public int ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = 0;

    public MysticCacheRepositoryMiddlewareAB3bnXMEIZVxB84nFb54599119054108(ActivityHandler activityHandler) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = activityHandler;
    }

    public final void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(String str, IRunActivityHandler iRunActivityHandler) {
        int i = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        ActivityHandler activityHandler = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (i != 3) {
            iRunActivityHandler.run(activityHandler);
            return;
        }
        activityHandler.getAdjustConfig().getLogger().debug("Enqueuing \"" + str + "\" action to be executed after first session delay ends", new Object[0]);
        activityHandler.getAdjustConfig().preLaunchActions.preLaunchActionsArray.add(iRunActivityHandler);
    }

    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Runnable runnable, String str) {
        if (this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 != 3) {
            runnable.run();
            return;
        }
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getAdjustConfig().getLogger().debug("Enqueuing \"" + str + "\" action to be executed after first session delay ends", new Object[0]);
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.add(runnable);
    }
}
